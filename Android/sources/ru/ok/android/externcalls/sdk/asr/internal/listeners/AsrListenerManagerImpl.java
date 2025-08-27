package ru.ok.android.externcalls.sdk.asr.internal.listeners;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.asr.AsrInfo;
import ru.ok.android.externcalls.sdk.asr.listener.AsrRecordListener;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R0\u0010(\u001a\u001e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r0%j\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r`'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ok/android/externcalls/sdk/asr/internal/listeners/AsrListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/asr/internal/listeners/AsrListenerManager;", "Lb01;", "Lxj1;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;)V", "Lru/ok/android/externcalls/sdk/asr/listener/AsrRecordListener;", "listener", "", "notifyOnNewListener", "(Lru/ok/android/externcalls/sdk/asr/listener/AsrRecordListener;)V", "Lru/ok/android/externcalls/sdk/asr/AsrInfo;", "asrInfo", "notifyAsrRecordStarted", "(Lru/ok/android/externcalls/sdk/asr/AsrInfo;)V", "notifyAsrRecordStopped", "()V", "addAsrRecordListener", "removeAsrRecordListener", "Lzz0;", "startInfo", "onAsrRecordStarted", "(Lzz0;)V", "La01;", "stopInfo", "onAsrRecordStopped", "(La01;)V", "Ltj1;", "params", "onCurrentParticipantActiveRoomChanged", "(Ltj1;)V", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/HashMap;", "Lzwd;", "Lkotlin/collections/HashMap;", "sessionRoomToAsrInfo", "Ljava/util/HashMap;", "activeRoomId", "Lzwd;", "getAsrInfo", "()Lru/ok/android/externcalls/sdk/asr/AsrInfo;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAsrListenerManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsrListenerManagerImpl.kt\nru/ok/android/externcalls/sdk/asr/internal/listeners/AsrListenerManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n1855#2,2:86\n1855#2,2:88\n*S KotlinDebug\n*F\n+ 1 AsrListenerManagerImpl.kt\nru/ok/android/externcalls/sdk/asr/internal/listeners/AsrListenerManagerImpl\n*L\n80#1:86,2\n83#1:88,2\n*E\n"})
public final class AsrListenerManagerImpl implements AsrListenerManager, b01, xj1 {
    private zwd activeRoomId;
    private final CopyOnWriteArraySet<AsrRecordListener> listeners = new CopyOnWriteArraySet<>();
    private final HashMap<zwd, AsrInfo> sessionRoomToAsrInfo = new HashMap<>();
    private final ParticipantStore store;

    public AsrListenerManagerImpl(ParticipantStore participantStore) {
        this.store = participantStore;
        this.activeRoomId = participantStore.getActiveRoomId();
    }

    private final void notifyAsrRecordStarted(AsrInfo asrInfo) {
        for (AsrRecordListener onAsrRecordStarted : this.listeners) {
            onAsrRecordStarted.onAsrRecordStarted(asrInfo);
        }
    }

    private final void notifyAsrRecordStopped() {
        for (AsrRecordListener onAsrRecordStopped : this.listeners) {
            onAsrRecordStopped.onAsrRecordStopped();
        }
    }

    private final void notifyOnNewListener(AsrRecordListener asrRecordListener) {
        AsrInfo asrInfo = getAsrInfo();
        if (asrInfo != null) {
            asrRecordListener.onAsrRecordStarted(asrInfo);
        }
    }

    public void addAsrRecordListener(AsrRecordListener asrRecordListener) {
        this.listeners.add(asrRecordListener);
        notifyOnNewListener(asrRecordListener);
    }

    public final AsrInfo getAsrInfo() {
        return this.sessionRoomToAsrInfo.get(this.activeRoomId);
    }

    public void onAsrRecordStarted(zz0 zz0) {
        ConversationParticipant byInternal = this.store.getByInternal(zz0.b.a);
        if (byInternal != null) {
            AsrInfo asrInfo = new AsrInfo(byInternal, zz0.b.b);
            HashMap<zwd, AsrInfo> hashMap = this.sessionRoomToAsrInfo;
            zwd zwd = zz0.a;
            hashMap.put(zwd, asrInfo);
            if (Intrinsics.areEqual((Object) zwd, (Object) this.activeRoomId)) {
                notifyAsrRecordStarted(asrInfo);
            }
        }
    }

    public void onAsrRecordStopped(a01 a01) {
        AsrInfo remove = this.sessionRoomToAsrInfo.remove(a01.a);
        if (Intrinsics.areEqual((Object) a01.a, (Object) this.activeRoomId) && remove != null) {
            notifyAsrRecordStopped();
        }
    }

    public void onCurrentParticipantActiveRoomChanged(tj1 tj1) {
        zwd zwd = tj1.a;
        if (!Intrinsics.areEqual((Object) zwd, (Object) this.activeRoomId)) {
            zwd zwd2 = this.activeRoomId;
            this.activeRoomId = zwd;
            if (this.sessionRoomToAsrInfo.get(zwd2) != null) {
                notifyAsrRecordStopped();
            }
            AsrInfo asrInfo = this.sessionRoomToAsrInfo.get(zwd);
            if (asrInfo != null) {
                notifyAsrRecordStarted(asrInfo);
            }
        }
    }

    public /* bridge */ /* synthetic */ void onCurrentParticipantInvitedToRoom(uj1 uj1) {
    }

    public /* bridge */ /* synthetic */ void onRoomRemoved(vj1 vj1) {
    }

    public /* bridge */ /* synthetic */ void onRoomUpdated(wj1 wj1) {
    }

    public void removeAsrRecordListener(AsrRecordListener asrRecordListener) {
        this.listeners.remove(asrRecordListener);
    }
}
