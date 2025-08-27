package ru.ok.android.externcalls.sdk.chat.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.ok.android.externcalls.sdk.chat.ChatManager;
import ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutor;
import ru.ok.android.externcalls.sdk.chat.internal.listener.ChatListenerManager;
import ru.ok.android.externcalls.sdk.chat.listener.ChatManagerListener;
import ru.ok.android.externcalls.sdk.chat.message.OutboundMessage;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0001J\u0011\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0001J7\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00102\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012H\u0001R\u000e\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/chat/internal/ChatManagerImpl;", "Lru/ok/android/externcalls/sdk/chat/ChatManager;", "Lru/ok/android/externcalls/sdk/chat/internal/command/ChatCommandExecutor;", "Lru/ok/android/externcalls/sdk/chat/internal/listener/ChatListenerManager;", "commandExecutor", "listenerManager", "(Lru/ok/android/externcalls/sdk/chat/internal/command/ChatCommandExecutor;Lru/ok/android/externcalls/sdk/chat/internal/listener/ChatListenerManager;)V", "addListener", "", "listener", "Lru/ok/android/externcalls/sdk/chat/listener/ChatManagerListener;", "removeListener", "sendMessage", "message", "Lru/ok/android/externcalls/sdk/chat/message/OutboundMessage;", "onSuccess", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ChatManagerImpl implements ChatManager, ChatCommandExecutor, ChatListenerManager {
    private final ChatCommandExecutor commandExecutor;
    private final ChatListenerManager listenerManager;

    public ChatManagerImpl(ChatCommandExecutor chatCommandExecutor, ChatListenerManager chatListenerManager) {
        this.commandExecutor = chatCommandExecutor;
        this.listenerManager = chatListenerManager;
    }

    public void addListener(ChatManagerListener chatManagerListener) {
        this.listenerManager.addListener(chatManagerListener);
    }

    public void removeListener(ChatManagerListener chatManagerListener) {
        this.listenerManager.removeListener(chatManagerListener);
    }

    public void sendMessage(OutboundMessage outboundMessage, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        this.commandExecutor.sendMessage(outboundMessage, function0, function1);
    }
}
