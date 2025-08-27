package ru.ok.android.externcalls.sdk.chat.internal.listener;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.chat.listener.ChatManagerListener;
import ru.ok.android.externcalls.sdk.chat.message.InboundMessageMapper;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/sdk/chat/internal/listener/ChatListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/chat/internal/listener/ChatListenerManager;", "Lz11;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "participantStore", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;)V", "Lru/ok/android/externcalls/sdk/chat/listener/ChatManagerListener;", "listener", "", "addListener", "(Lru/ok/android/externcalls/sdk/chat/listener/ChatManagerListener;)V", "removeListener", "Lce7;", "message", "onNewMessage", "(Lce7;)V", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class ChatListenerManagerImpl implements ChatListenerManager, z11 {
    private final CopyOnWriteArraySet<ChatManagerListener> listeners = new CopyOnWriteArraySet<>();
    private final ParticipantStore participantStore;

    public ChatListenerManagerImpl(ParticipantStore participantStore2) {
        this.participantStore = participantStore2;
    }

    public void addListener(ChatManagerListener chatManagerListener) {
        this.listeners.add(chatManagerListener);
    }

    public void onNewMessage(ce7 ce7) {
        Iterator<ChatManagerListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onNewMessage(InboundMessageMapper.INSTANCE.fromInternal(ce7, this.participantStore));
        }
    }

    public void removeListener(ChatManagerListener chatManagerListener) {
        this.listeners.remove(chatManagerListener);
    }
}
