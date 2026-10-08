package com.samuray.telegram.core.model;

public final class Message {
    private final long id;
    private final long chatId;
    private final String text;
    private final long timestamp;

    public Message(long id, long chatId, String text, long timestamp) {
        this.id = id;
        this.chatId = chatId;
        this.text = text;
        this.timestamp = timestamp;
    }

    public long getId() { return id; }
    public long getChatId() { return chatId; }
    public String getText() { return text; }
    public long getTimestamp() { return timestamp; }
}
