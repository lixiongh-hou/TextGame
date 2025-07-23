import { _decorator, Component, EventTouch, Node, Sprite, tween, UIOpacity, UITransform, Vec3 } from 'cc';
const { ccclass, property } = _decorator;

@ccclass('Character')
export class Character extends Component {

    Hanzi: Node = null!;
    Points: Node = null!;
    NewHanzi: Node = null!;

    oldPos: Map<string, Vec3>; // 记录上一次的位置

    start() {
        this.Hanzi = this.node.getChildByName('Hanzi');
        this.Points = this.node.getChildByName('Points');
        this.NewHanzi = this.node.getChildByName('NewHanzi');
        this.oldPos = new Map<string, Vec3>();

        this.setHanziActvie(true);

    }

    // 显示提示动画
    showTipsAni() {
        console.log("showTipsAni");
        let point: Node = this.Points.children[0]; // .children[0]
        let hanziIndexNode = this.Hanzi.getChildByName(point.name.split('_')[0]);
        let opacityComp = hanziIndexNode.addComponent(UIOpacity);

        let duration = 0.5;
        let t1 = tween(opacityComp)
            .to(duration, { opacity: 10 })
            .start();

        let piontImg: Node = point.children[0];
        piontImg.active = true;
        piontImg.addComponent(UIOpacity).opacity = 180;

        let duration2 = 1.2;
        let t2 = tween(piontImg)
            .to(duration2, { scale: new Vec3(1, 1, 1) })
            .by(duration2, { scale: new Vec3(0.5, 0.5, 1) })
            .to(duration2, { scale: new Vec3(1, 1, 1) })
            .by(duration2, { scale: new Vec3(0.5, 0.5, 1) })
            .to(duration2, { scale: new Vec3(1, 1, 1) })
            .call(() => {
                piontImg.active = false;
                opacityComp.opacity = 255;
                this.finishShowTipsAni();
            })
            .start();
    }

    // 显示提示动画结束 触发事件
    finishShowTipsAni() {
        this.node.emit('finishShowTips');
    }

    setHanziActvie(active = true) {
        this.Hanzi.children.forEach((element, index) => {
            this.setNodeTouchActive(element, active);
            this.oldPos.set(element.name, element.getPosition());
        });
    }

    setNodeTouchActive(element: Node, active = true) {
        if (active === true) {
            element.on(Node.EventType.TOUCH_MOVE, this.onTouchMove, this);
            element.on(Node.EventType.TOUCH_END, this.onTouchEnd, this);
        } else {
            element.off(Node.EventType.TOUCH_MOVE, null, this);
            element.off(Node.EventType.TOUCH_END, null, this);
        }
    }

    onTouchMove(event: EventTouch) {
        let currentNode: Node = event.currentTarget;
        let isCanMove = true;

        if (isCanMove) {
            currentNode.setSiblingIndex(1000);
            let pos = event.currentTarget.getPosition();
            currentNode.setPosition(pos.x + event.getUIDelta().x, pos.y + event.getUIDelta().y);
        }
    }

    onTouchEnd(event: EventTouch) {
        // console.log("onTouchEnd end");
        let currentNode: Node = event.currentTarget;

        currentNode.setSiblingIndex(0);

        if (this.Points.children.length === 0) {
            currentNode.setPosition(this.oldPos.get(currentNode.name));
        }
        for (let i = 0; i < this.Points.children.length; i++) {
            let point = this.Points.children[i];
            // let rect = point.getComponent(UITransform).getBoundingBoxToWorld();
            // let containsRect = rect.containsRect(currentNode.getComponent(UITransform).getBoundingBoxToWorld());
            // console.log('rect contain ,', containsRect, ' name : ', point.name, ' : ', currentNode.name);

            let arr = point.name.split('_');
            let pointFirstName = arr[0];

            let location = event.getUILocation();
            let rect = point.getComponent(UITransform).getBoundingBoxToWorld();
            let containsRect = rect.contains(location)
            // console.log('rect.contains(location) ', containsRect);

            if (containsRect && pointFirstName === currentNode.name) {

                point.addChild(currentNode);
                currentNode.setPosition(0, 0, 0);
                this.setNodeTouchActive(currentNode, false);
                this.Points.removeAllChildren();
                this.Hanzi.removeAllChildren();
                this.Hanzi.active = false;
                this.setHanziActvie(false);

                this.NewHanzi.children[i].active = true;

                this.node.emit('anwserRight');

                break;
            } else {
                currentNode.setPosition(this.oldPos.get(currentNode.name)!);
            }
        }
    }











}


