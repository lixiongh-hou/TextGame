package com.sq.common_module.common.utils.java.media;

public interface MediaPlayFunctionListener {
  // 准备完成
  void prepared();
  // 开始播放
  void start();
  // 暂停
  void pause();
  // 停止播放
  void stop();
  //重置
  void reset();

}
