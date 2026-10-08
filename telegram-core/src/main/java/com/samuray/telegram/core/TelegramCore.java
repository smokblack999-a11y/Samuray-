package com.samuray.telegram.core;

import android.content.Context;

import com.samuray.telegram.core.model.Chat;
import com.samuray.telegram.core.model.Message;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface TelegramCore {
    void initialize(Context context, TelegramCoreConfig config);
    CompletableFuture<AuthState> authState();
    CompletableFuture<List<Chat>> chats();
    CompletableFuture<List<Message>> messages(long chatId, int limit);
    CompletableFuture<Message> sendText(long chatId, String text);
    CompletableFuture<Message> sendPhoto(long chatId, String localPath, String caption);
    void shutdown();
}
