package ru.ok.android.externcalls.sdk.chat;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.ok.android.externcalls.sdk.chat.listener.ChatManagerListener;
import ru.ok.android.externcalls.sdk.chat.message.OutboundMessage;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J:\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/chat/ChatManager;", "", "addListener", "", "listener", "Lru/ok/android/externcalls/sdk/chat/listener/ChatManagerListener;", "removeListener", "sendMessage", "message", "Lru/ok/android/externcalls/sdk/chat/message/OutboundMessage;", "onSuccess", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ChatManager {
    static /* synthetic */ void sendMessage$default(ChatManager chatManager, OutboundMessage outboundMessage, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                function0 = null;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            chatManager.sendMessage(outboundMessage, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessage");
    }

    void addListener(ChatManagerListener chatManagerListener);

    void removeListener(ChatManagerListener chatManagerListener);

    void sendMessage(OutboundMessage outboundMessage, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);
}
