package ru.ok.android.externcalls.sdk.chat;

import kotlin.Metadata;
import kotlin.jvm.JvmField;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/chat/ChatStateListener;", "", "onChatCreated", "", "chatId", "", "onChatUpdated", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ChatStateListener {
    public static final Companion Companion = Companion.$$INSTANCE;
    @JvmField
    public static final ChatStateListener EMPTY = new ChatStateListener$Companion$EMPTY$1();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/chat/ChatStateListener$Companion;", "", "()V", "EMPTY", "Lru/ok/android/externcalls/sdk/chat/ChatStateListener;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void onChatCreated(long j) {
    }

    void onChatUpdated(long j) {
    }
}
