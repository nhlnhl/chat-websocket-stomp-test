package com.test.chat.domain;

import lombok.Getter;

@Getter
public class Message {

    //TODO MessageType ENUM

    private Long senderId;

    private Long channelNum;

    private String content;
}
