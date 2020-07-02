package com.dancinggoat.models;

import java.lang.String;
import java.lang.System;
import java.util.List;
import kentico.kontent.delivery.ContentItemMapping;
import kentico.kontent.delivery.ElementMapping;
import kentico.kontent.delivery.Option;

/**
 * This code was generated by a <a href="https://github.com/Kentico/cloud-generators-java">cloud-generators-java tool</a>
 *
 * Changes to this file may cause incorrect behavior and will be lost if the code is regenerated.
 * For further modifications of the class, create a separate file and extend this class.
 */
@ContentItemMapping("hosted_video")
public class HostedVideo {
  @ElementMapping("video_id")
  String videoId;

  @ElementMapping("video_host")
  List<Option> videoHost;

  System system;

  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }

  public List<Option> getVideoHost() {
    return videoHost;
  }

  public void setVideoHost(List<Option> videoHost) {
    this.videoHost = videoHost;
  }

  public System getSystem() {
    return system;
  }

  public void setSystem(System system) {
    this.system = system;
  }
}
