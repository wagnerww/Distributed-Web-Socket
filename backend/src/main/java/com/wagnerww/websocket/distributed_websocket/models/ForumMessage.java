package com.wagnerww.websocket.distributed_websocket.models;

public class ForumMessage {
    private String content;

    public ForumMessage() {
    }

    public ForumMessage(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
