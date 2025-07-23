import { _decorator, AudioSource, Button, Component, director, EventHandler, EventTouch, instantiate, math, Node, PageView, Prefab, RichText, ScrollView, Sprite, SpriteFrame, Vec2 } from 'cc';
import { Common, MaxLevel } from './Common';
import GameStorage from './GameStorage';
import SDKBridge from './sdk/SDKBridge';
import { SettingAdv } from './Common';

const { ccclass, property } = _decorator;

@ccclass('Index')
export class Index extends Component {

    @property({ type: Node })
    levelSelectMenu: Node;

    @property([SpriteFrame])
    levelBtnBg: SpriteFrame[] = [];

    @property(Node)
    LevelContent: Node = null;

    @property(Prefab)
    levelItemPrefab: Prefab;

    @property(Node)
    pvNode: Node;

    pageViewComp: PageView = null;

    start() {
        this.initLevelLayout();
        this.pageViewComp = this.pvNode.getComponent(PageView);

        if (SettingAdv) {
            // init sdk
            SDKBridge.GetInstance().InitSDK();
            console.log("init sdk success");
        }
    }



    initLevelLayout() {
        let passedLevel = GameStorage.getPassedLevel();
        let currentLevel = GameStorage.getCurLevel();
        let levelSize = MaxLevel;

        let page: Node = null;
        for (let i = 1; i <= levelSize; i++) {
            let levelItem = instantiate(this.levelItemPrefab);

            if ((i - 1) % 12 === 0) {// 12 per page
                let pageIndex = Math.floor((i - 1) / 12) + 1;
                let pageName = `page${pageIndex}`
                page = this.LevelContent.getChildByName(pageName);
            }

            // console.log(page);
            page.addChild(levelItem);

            if (i == 1 || i <= passedLevel + 1) {
                levelItem.getComponent(Sprite).spriteFrame = this.levelBtnBg[0];
                levelItem.getComponent(Button).interactable = true;
                levelItem.getChildByName('LevelNum').getComponent(RichText).string = i.toString();
                // levelItem.on(Button.EventType.CLICK, this.onClickLevelBtn, this, i); // ? 这个方法有问题
                // 参考: https://docs.cocos.com/creator/manual/zh/ui-system/components/editor/button.html
                const clickEventHandler = new EventHandler();
                clickEventHandler.target = this.node; // 这个 node 节点是你的事件处理代码组件所属的节点
                clickEventHandler.component = 'Index';// 这个是脚本类名
                clickEventHandler.handler = 'onClickLevelBtn';
                clickEventHandler.customEventData = i.toString();

                const button = levelItem.getComponent(Button);
                button.clickEvents.push(clickEventHandler);

            } else {
                levelItem.getComponent(Sprite).spriteFrame = this.levelBtnBg[1];
                levelItem.getComponent(Button).interactable = false;
            }
        }
    }

    onClickStartBtn() {
        console.log('start game');
        director.loadScene('game');
    }

    onClickLevelSelectMenu() {
        this.levelSelectMenu.active = true;
    }

    onCloseBtnClick() {
        this.levelSelectMenu.active = false;
    }

    onClickLevelBtn(event: Event, level: any) {
        Common.setSelectedLevel(level);
        director.loadScene('game');
    }

    curPageIndex: number = 0;
    onClickPreNext(event: Event, type: string) {
        this.curPageIndex = this.pageViewComp.getCurrentPageIndex();
        this.pageViewComp.scrollToPage(this.curPageIndex + Number(type));
    }




}


