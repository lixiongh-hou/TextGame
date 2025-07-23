import { _decorator, AudioSource, Component, EventTouch, Node, Sprite } from 'cc';
const { ccclass, property } = _decorator;

@ccclass('AudioComp')
export class AudioComp extends Component {

    audioOn = true;

    start() {

        this.node.getComponent(AudioSource).play();
    }


    onClickAudio(event: EventTouch) {
        let currentNode = event.currentTarget;
        this.audioOn = !this.audioOn;

        this.setAudio(currentNode);
    }

    setAudio(nd: Node) {
        if (this.audioOn === true) {
            console.log("audio play");
            this.setAudioActive(nd, true);
            nd.getComponent(AudioSource).play();
        } else {
            console.log("audio stop");
            this.setAudioActive(nd);
            nd.getComponent(AudioSource).stop();
        }
    }

    setAudioActive(audio: Node, active: boolean = false) {
        if (this.audioOn === true) {
            audio.getComponent(Sprite).spriteFrame = audio.children[0].getComponent(Sprite).spriteFrame;
        } else {
            audio.getComponent(Sprite).spriteFrame = audio.children[1].getComponent(Sprite).spriteFrame;
        }
    }



}


