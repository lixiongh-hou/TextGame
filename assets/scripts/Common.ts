import { Tween, Vec3 } from "cc";

export const enum BLOCK_COLOR_TYPE {
    NONE = 0,
};

export const MaxLevel = 50; // 最大关卡

export const CutRunTime = 30; // 倒计时

// 是否开启广告调用
export const SettingAdv = true;

export const Common = {

    selectedLevel: 0, // 当前关卡

    //填充前导零
    fillZero(num, prec = 2) {
        return (Array(prec).join('0') + '' + String(num)).slice(-prec);
    },

    //秒转分秒微秒
    secondConversion(second, len = 3) {
        let m = parseInt(String(second / 60));
        let s = parseInt(String(second % 60));
        let ms = parseInt(String(second * 1000 % 1000));
        if (len == 2) {
            return this.fillZero(m) + "'" + this.fillZero(s);
        } else {
            return this.fillZero(m) + "'" + this.fillZero(s) + "'" + this.fillZero(ms, 3);
        }
    },

    secondConversionToMinute(second): number {
        return parseInt(String(second / 60));
    },

    async toWaitTween(t: Tween<Node>, duration: number = 0) {
        return new Promise(function (resolve, reject) {
            setTimeout(function () {
                resolve(1);
            }, duration * 1000);
        });
    },

    setSelectedLevel(level: number) {
        this.selectedLevel = level;
    },

    getSelectedLevel() {
        return Number(this.selectedLevel);
    },




}