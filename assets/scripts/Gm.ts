import { _decorator, Component, EventTouch, instantiate, Label, Node, Prefab, resources, Sprite, tween, UITransform, Vec3, director } from 'cc';
import GameStorage from './GameStorage';
import { Common, MaxLevel, CutRunTime, SettingAdv } from './Common';
import SDKBridge from './sdk/SDKBridge';
import { Character } from './Character';
import { native } from 'cc';
const { ccclass, property } = _decorator;

@ccclass('Gm')
export class Gm extends Component {

    @property(Node)
    Content: Node = null!;

    @property(Node)
    Answer: Node = null!;

    @property({ type: Node })
    victory: Node;

    @property({ type: Node })
    relive: Node;

    @property({ type: Node })
    time: Node;

    @property({ type: Node })
    title: Node;

    CharacterNode: Node = null!;
    Character: Character = null!;

    curLevel: number = 1; // 保存到本地, 用于记录当前的关卡
    passedLevel: number = 1; // 保存到本地, 用于记录已经过的关卡
    // 玩家是否第一次进入游戏
    isFirstEnter = false;

    runTime: number = 0; // 倒计时时间 30 sec

    isStopCutRunTime = false; // 是否停止计时

    start() {

        this.initCurLevel();
        this.initContent();

        native.bridge.onNative = (arg0:string, arg1: string):void=>{
        if(arg0 == 'ad_close'){ 
            console.log(arg1)
         } 
        } 
    }

    initCurLevel() {
        let curLevel = GameStorage.getCurLevel();
        console.log("Storage.getCurLevel: " + curLevel);
        if (curLevel) {
            this.isFirstEnter = false;
            this.curLevel = curLevel;
        } else {
            this.isFirstEnter = true;
            this.curLevel = 1;
        }
        // 如果是首页选择的关卡进入, 则使用关卡数据
        let selectedLevel = Common.getSelectedLevel();
        console.log('selectedLevel ', selectedLevel);
        if (selectedLevel > 0) {
            this.curLevel = selectedLevel;
        } else if (GameStorage.getPassedLevel()) {
            if (GameStorage.getPassedLevel() < MaxLevel) {
                this.curLevel = GameStorage.getPassedLevel() + 1; // 通关后进入下一关
            } else {
                this.curLevel = MaxLevel;
            }
        }

        GameStorage.setCurLevel(this.curLevel);

        this.initSettings();
    }


    initSettings() {
        this.setLevelTitle();
        this.runTime = CutRunTime;
        this.isStopCutRunTime = false;
        this.setNodeActive(this.Answer, false);
    }

    setLevelTitle() {
        this.title.getChildByName('Label').getComponent(Label).string = `第 ${this.curLevel} 关`;
    }

    initContent() {
        this.initSettings();
        // 加载 Prefab
        let prefabUrl = `prefabs/level${this.curLevel}/Character`;
        resources.load(prefabUrl, Prefab, (err, prefab) => {
            const CharacterNode = instantiate(prefab);
            this.Content.addChild(CharacterNode);
            CharacterNode.on('anwserRight', this.anwserRight, this);
            CharacterNode.on('finishShowTips', this.finishShowTips, this);

            this.CharacterNode = CharacterNode;
            this.Character = CharacterNode.getComponent(Character);
        });

    }

    @property(Prefab)
    answerPrefab: Prefab = null!;

    showAnswers(active = true) {
        this.Answer.active = active;
        let answers = this.CharacterNode.getChildByName('NewHanzi').children;
        this.Answer.children[1].removeAllChildren();

        for (let i = 0; i < answers.length; i++) {
            let nod = answers[i];
            let ans = instantiate(this.answerPrefab);
            this.Answer.children[1].addChild(ans);

            ans.children[0].getComponent(Sprite).spriteFrame = nod.getComponent(Sprite).spriteFrame;
            ans.setPosition(50 + i * 110, 0, 0);
        }

    }

    onClickShowAnswer(event: EventTouch) {
        this.ShowRewardVideo(() => {
            this.setNodeActive(this.relive, false);
            console.log('show reward video success');
            this.initContent();
            this.showAnswers(true);  // 注意顺序
        });
    }

    onClickWatchAdv(event: EventTouch) {
        this.setNodeActive(this.relive, false);
        this.ShowRewardVideo(() => {
            console.log('show reward video success');
            this.initContent();
        });
    }

    setNodeActive(node: Node, active: boolean) {
        node.active = active;
    }

    anwserRight() {
        console.log("anwserRight");
        this.isStopCutRunTime = true;
        this.passedLevel = this.curLevel;
        GameStorage.setPassedLevel(this.passedLevel);

        if (SettingAdv) {
            // 调用 sdk
            // SDKBridge.GetInstance().ShowInterstitial();
        }
        setTimeout(() => {
            this.setNodeActive(this.victory, true);
        }, 800);
    }

    finishShowTips() {
        this.isStopCutRunTime = false;
    }

    // 点击下一关
    onClickNextButton(event: Event) {
        this.setNodeActive(this.victory, false);
        this.nextLevel();
    }

    nextLevel() {
        this.curLevel = Number(this.curLevel) + 1;
        GameStorage.setCurLevel(this.curLevel);
        if (this.curLevel > MaxLevel) {
            this.curLevel = MaxLevel;
        }
        console.log('nextLevel: ', this.curLevel);

        this.victory.active = false;
        this.initContent();
    }


    protected update(dt: number): void {
        // this.runTime += dt
        // this.time.children[1].getComponent(Label).string = Common.secondConversion(this.runTime, 2)
        if (this.isStopCutRunTime == false) {
            if (this.runTime > 0) {
                this.runTime -= dt
                this.time.children[1].getComponent(Label).string = Common.secondConversion(this.runTime, 2)
            } else {
                this.checkTime();
            }
        }
    }

    checkTime() {
        // if (Common.secondConversionToMinute(this.runTime) >= 1) {
        //     console.log('over time 1 min')
        //     this.setNodeActive(this.relive, true);
        // }
        if ((this.runTime) <= 0) {
            // console.log('time less 0 sec')
            this.time.children[1].getComponent(Label).string = "00'00"
            this.setNodeActive(this.relive, true);
            return;
        }
    }


    // 观看激励广告
    ShowRewardVideo(onSuccess: () => void, onFail?: () => void) {
        if (SettingAdv) {
            SDKBridge.GetInstance().ShowRewardVideo(() => {
                console.log('success');
                onSuccess();
            }, () => {
                console.log('fail');
                if (onFail) {
                    onFail();
                }
            });
        } else {
            onSuccess();
            if (onFail) {
                onFail();
            }
        }
    }

    // 点击查看提示
    onClickShowTips(event: Event) {
       this.ShowRewardVideo(() => {
            console.log('show reward video success');
            this.Character.showTipsAni();
        });
    }

    // 点击返回首页
    onClickToHome(event: EventTouch) {
        this.toHome();
    }

    toHome() {
        director.loadScene('index');
        this.node.parent.removeAllChildren();
        return;
    }






}


