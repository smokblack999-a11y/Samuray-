package com.samuray.telegram.core.model;

public final class Chat {
    private final long id;
    private final String title;
    private final String username;

    public Chat(long id, String title, String username) {
        this.id = id;
        this.title = title;
        this.username = username;
    }

    public long getId() { return id; }
    public String getTitle() { return title; }
    public String getUsername() { return username; }
}
