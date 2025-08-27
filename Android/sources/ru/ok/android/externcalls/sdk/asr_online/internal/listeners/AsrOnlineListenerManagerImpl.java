package ru.ok.android.externcalls.sdk.asr_online.internal.listeners;

import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.asr_online.AsrOnlineChunk;
import ru.ok.android.externcalls.sdk.asr_online.listener.AsrOnlineListener;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ok/android/externcalls/sdk/asr_online/internal/listeners/AsrOnlineListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/asr_online/internal/listeners/AsrOnlineListenerManager;", "Lc01;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;)V", "", "isAvailable", "", "onAsrAvailableChanged", "(Z)V", "Lru/ok/android/externcalls/sdk/asr_online/listener/AsrOnlineListener;", "listener", "addAsrOnlineListener", "(Lru/ok/android/externcalls/sdk/asr_online/listener/AsrOnlineListener;)V", "removeAsrOnlineListener", "Lpt;", "asrRecvDataPackage", "onAsrDataPackage", "(Lpt;)V", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "lastIsAvailable", "Z", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAsrOnlineListenerManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsrOnlineListenerManagerImpl.kt\nru/ok/android/externcalls/sdk/asr_online/internal/listeners/AsrOnlineListenerManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,34:1\n1855#2,2:35\n1855#2,2:37\n*S KotlinDebug\n*F\n+ 1 AsrOnlineListenerManagerImpl.kt\nru/ok/android/externcalls/sdk/asr_online/internal/listeners/AsrOnlineListenerManagerImpl\n*L\n19#1:35,2\n32#1:37,2\n*E\n"})
public final class AsrOnlineListenerManagerImpl implements AsrOnlineListenerManager, c01 {
    private volatile boolean lastIsAvailable;
    private final CopyOnWriteArraySet<AsrOnlineListener> listeners = new CopyOnWriteArraySet<>();
    private final ParticipantStore store;

    public AsrOnlineListenerManagerImpl(ParticipantStore participantStore) {
        this.store = participantStore;
    }

    public void addAsrOnlineListener(AsrOnlineListener asrOnlineListener) {
        asrOnlineListener.onAsrAvailableChanged(this.lastIsAvailable);
        this.listeners.add(asrOnlineListener);
    }

    public void onAsrAvailableChanged(boolean z) {
        this.lastIsAvailable = z;
        for (AsrOnlineListener onAsrAvailableChanged : this.listeners) {
            onAsrAvailableChanged.onAsrAvailableChanged(z);
        }
    }

    public void onAsrDataPackage(pt ptVar) {
        for (AsrOnlineListener onAsrChunk : this.listeners) {
            onAsrChunk.onAsrChunk(AsrOnlineChunk.Companion.chunkFromPackage$calls_sdk_release(this.store, ptVar));
        }
    }

    public void removeAsrOnlineListener(AsrOnlineListener asrOnlineListener) {
        this.listeners.remove(asrOnlineListener);
    }
}
