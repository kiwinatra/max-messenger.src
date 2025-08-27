package ru.ok.android.externcalls.sdk.sessionroom.internal.listener;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u000bJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManager;", "Lxj1;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;)V", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$OwnRoomsListener;", "listener", "", "sendActualState", "(Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$OwnRoomsListener;)V", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "getOwnActiveRoom", "()Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "getOwnProposedRoom", "Lvj1;", "params", "onRoomRemoved", "(Lvj1;)V", "Lwj1;", "onRoomUpdated", "(Lwj1;)V", "Luj1;", "onCurrentParticipantInvitedToRoom", "(Luj1;)V", "Ltj1;", "onCurrentParticipantActiveRoomChanged", "(Ltj1;)V", "addListener", "removeListener", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSessionRoomListenerManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionRoomListenerManagerImpl.kt\nru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1855#2,2:92\n1855#2,2:94\n1855#2,2:96\n1855#2,2:98\n*S KotlinDebug\n*F\n+ 1 SessionRoomListenerManagerImpl.kt\nru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManagerImpl\n*L\n37#1:92,2\n45#1:94,2\n53#1:96,2\n61#1:98,2\n*E\n"})
public final class SessionRoomListenerManagerImpl implements SessionRoomListenerManager, xj1 {
    private final CopyOnWriteArraySet<SessionRoomsManager.OwnRoomsListener> listeners = new CopyOnWriteArraySet<>();
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final ParticipantStore store;

    public SessionRoomListenerManagerImpl(ParticipantStore participantStore) {
        this.store = participantStore;
    }

    /* access modifiers changed from: private */
    public static final void onCurrentParticipantActiveRoomChanged$lambda$9(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, tj1 tj1) {
        for (SessionRoomsManager.OwnRoomsListener onActiveRoomChanged : sessionRoomListenerManagerImpl.listeners) {
            onActiveRoomChanged.onActiveRoomChanged(new SessionRoomsManager.SessionRoomInfo(tj1.a, tj1.b));
        }
    }

    /* access modifiers changed from: private */
    public static final void onCurrentParticipantInvitedToRoom$lambda$7(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, uj1 uj1) {
        for (SessionRoomsManager.OwnRoomsListener onProposedRoomChanged : sessionRoomListenerManagerImpl.listeners) {
            onProposedRoomChanged.onProposedRoomChanged(new SessionRoomsManager.SessionRoomInfo(uj1.b, uj1.c));
        }
    }

    /* access modifiers changed from: private */
    public static final void onRoomRemoved$lambda$3(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, vj1 vj1) {
        for (SessionRoomsManager.OwnRoomsListener onRoomRemoved : sessionRoomListenerManagerImpl.listeners) {
            onRoomRemoved.onRoomRemoved(new SessionRoomsManager.SessionRoomInfo(vj1.a, (twd) null));
        }
    }

    /* access modifiers changed from: private */
    public static final void onRoomUpdated$lambda$5(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, wj1 wj1) {
        for (SessionRoomsManager.OwnRoomsListener onRoomUpdated : sessionRoomListenerManagerImpl.listeners) {
            onRoomUpdated.onRoomUpdated(new SessionRoomsManager.SessionRoomInfo(wj1.a, wj1.b));
        }
    }

    private final void sendActualState(SessionRoomsManager.OwnRoomsListener ownRoomsListener) {
        this.mainHandler.post(new ovb(23, this, ownRoomsListener));
    }

    /* access modifiers changed from: private */
    public static final void sendActualState$lambda$12(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, SessionRoomsManager.OwnRoomsListener ownRoomsListener) {
        if (sessionRoomListenerManagerImpl.listeners.contains(ownRoomsListener)) {
            twd proposedRoom = sessionRoomListenerManagerImpl.store.getProposedRoom();
            if (proposedRoom != null) {
                ownRoomsListener.onProposedRoomChanged(new SessionRoomsManager.SessionRoomInfo(proposedRoom.a, proposedRoom));
            }
            twd activeRoom = sessionRoomListenerManagerImpl.store.getActiveRoom();
            if (activeRoom != null) {
                ownRoomsListener.onActiveRoomChanged(new SessionRoomsManager.SessionRoomInfo(activeRoom.a, activeRoom));
            }
        }
    }

    public void addListener(SessionRoomsManager.OwnRoomsListener ownRoomsListener) {
        this.listeners.add(ownRoomsListener);
        sendActualState(ownRoomsListener);
    }

    public final SessionRoomsManager.SessionRoomInfo getOwnActiveRoom() {
        twd activeRoom = this.store.getActiveRoom();
        return activeRoom != null ? new SessionRoomsManager.SessionRoomInfo(activeRoom.a, activeRoom) : new SessionRoomsManager.SessionRoomInfo(xwd.a, (twd) null);
    }

    public final SessionRoomsManager.SessionRoomInfo getOwnProposedRoom() {
        twd proposedRoom = this.store.getProposedRoom();
        return proposedRoom != null ? new SessionRoomsManager.SessionRoomInfo(proposedRoom.a, proposedRoom) : new SessionRoomsManager.SessionRoomInfo(xwd.a, (twd) null);
    }

    public void onCurrentParticipantActiveRoomChanged(tj1 tj1) {
        this.mainHandler.post(new ovb(25, this, tj1));
    }

    public void onCurrentParticipantInvitedToRoom(uj1 uj1) {
        this.mainHandler.post(new ovb(27, this, uj1));
    }

    public void onRoomRemoved(vj1 vj1) {
        this.mainHandler.post(new ovb(26, this, vj1));
    }

    public void onRoomUpdated(wj1 wj1) {
        this.mainHandler.post(new ovb(24, this, wj1));
    }

    public void removeListener(SessionRoomsManager.OwnRoomsListener ownRoomsListener) {
        this.listeners.remove(ownRoomsListener);
    }
}
