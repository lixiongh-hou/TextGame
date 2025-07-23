import { sys } from "cc";
import { native } from 'cc';
export default class SDKBridge {
    private static instance: SDKBridge;
    private SDK = (window as any).SDK;
    private SDKConfig = (window as any).SDKConfig;
    private SDKUtils = (window as any).SDKUtils;
    private ADManager = (window as any).ADManager;
    private ExtendManager = (window as any).ExtendManager;

    /**
     * 获取单例
    */
    public static GetInstance() {
        if (!this.instance) {
            this.instance = new SDKBridge();
        }
        return this.instance;
    }

    /**
     * 初始化
    */
    public async InitSDK() {
        if (sys.isNative) {
            this.SDKConfig.InitStorage();
            this.SDK.init();
            this.ADManager.getInstance().showBanner();

            await this.SDKUtils.UpdateWL();
            await this.SDKUtils.GetRemoteData();
            setTimeout(async () => {
                await this.SDKUtils.UpdateWL();
                await this.SDKUtils.GetRemoteData();
            }, 1000);

            setTimeout(async () => {
                await this.SDKUtils.UpdateWL();
                await this.SDKUtils.GetRemoteData();
            }, 2000);
        }
    }

    /**
     * 显示横幅
    */
    public ShowBanner() {
        if (sys.isNative) {
            this.ADManager.getInstance().showBanner();
        }
    }

    /**
     * 隐藏横幅
    */
    public HideBanner() {
        if (sys.isNative) {
            this.ADManager.getInstance().hideBanner();
        }
    }

    /**
     * 显示插页
    */
    public ShowInterstitial() {
        if (sys.isNative) {
            this.ADManager.getInstance().showInterstitial();
        }
    }

    /**
     * 显示激励视频 无效
     * onSuccess ：成功之后，点击了关闭之后的回调，没点关闭之前不会回调
     * onFail : 失败的回调
    */
    public ShowRewardVideo(onSuccess: () => void, onFail?: () => void) {
        let isSuccess = false;
        if (sys.isNative) {
            // this.ADManager.getInstance().showRewardVideo(this.SDKConfig.reward, () => {
            //     isSuccess = true;
            // }, onFail, () => {
            //     if (isSuccess) {
            //         isSuccess = false;
            //         onSuccess();
            //     }
            // })
            onSuccess();
             native.bridge.sendToNative('open_ad', "111111");
        } else {
            onSuccess();
             native.bridge.sendToNative('open_ad', "111111");
        }
    }

    /**
     * 显示Toast提示
    */
    public ShowToast(str: string) {
        if (sys.isNative) {
            this.ExtendManager.getInstance().showToast(str)
        }
    }
}