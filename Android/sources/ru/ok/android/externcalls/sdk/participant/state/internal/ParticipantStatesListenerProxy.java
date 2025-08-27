package ru.ok.android.externcalls.sdk.participant.state.internal;

import android.os.Handler;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0001J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\u0018\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0003J\u0006\u0010\u001e\u001a\u00020\u0016J\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0001R2\u0010\u0007\u001a&\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\bj\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b`\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesListenerProxy;", "Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$Listener;", "manager", "Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager;", "mainThreadHandler", "Landroid/os/Handler;", "(Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager;Landroid/os/Handler;)V", "accumulator", "Ljava/util/HashMap;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$ParticipantStateChange;", "Lkotlin/collections/HashMap;", "lastRaiseTime", "", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "raiseRunnable", "Ljava/lang/Runnable;", "scheduleNextRaise", "", "accumulate", "", "event", "Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$StateChangedEvent;", "addListener", "listener", "merge", "onParticipantStateChanged", "raise", "release", "removeListener", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nParticipantStatesListenerProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParticipantStatesListenerProxy.kt\nru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesListenerProxy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n1855#2,2:95\n1855#2,2:97\n*S KotlinDebug\n*F\n+ 1 ParticipantStatesListenerProxy.kt\nru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesListenerProxy\n*L\n61#1:95,2\n85#1:97,2\n*E\n"})
public final class ParticipantStatesListenerProxy implements ParticipantStatesManager.Listener {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Deprecated
    public static final long RAISE_INTERVAL = 10;
    @Deprecated
    public static final long RAISE_TIMEOUT = 200;
    private final HashMap<ParticipantId, ParticipantStatesManager.ParticipantStateChange> accumulator = new HashMap<>();
    private long lastRaiseTime;
    private final CopyOnWriteArrayList<ParticipantStatesManager.Listener> listeners = new CopyOnWriteArrayList<>();
    private final Handler mainThreadHandler;
    private final ParticipantStatesManager manager;
    private final Runnable raiseRunnable = new o99(14, this);
    private boolean scheduleNextRaise = true;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesListenerProxy$Companion;", "", "()V", "RAISE_INTERVAL", "", "RAISE_TIMEOUT", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ParticipantStatesListenerProxy(ParticipantStatesManager participantStatesManager, Handler handler) {
        this.manager = participantStatesManager;
        this.mainThreadHandler = handler;
    }

    private final void accumulate(ParticipantStatesManager.StateChangedEvent stateChangedEvent) {
        for (ParticipantStatesManager.ParticipantStateChange participantStateChange : stateChangedEvent.getChanges()) {
            ParticipantStatesManager.ParticipantStateChange participantStateChange2 = this.accumulator.get(participantStateChange.getParticipantId());
            if (participantStateChange2 == null) {
                this.accumulator.put(participantStateChange.getParticipantId(), participantStateChange);
            } else if (participantStateChange2.isOn() == participantStateChange.isOn()) {
                this.accumulator.put(participantStateChange.getParticipantId(), participantStateChange);
            } else {
                this.accumulator.remove(participantStateChange.getParticipantId());
            }
        }
    }

    private final ParticipantStatesManager.StateChangedEvent merge() {
        ParticipantStatesManager.StateChangedEvent stateChangedEvent = new ParticipantStatesManager.StateChangedEvent(CollectionsKt.toList(this.accumulator.values()));
        this.accumulator.clear();
        return stateChangedEvent;
    }

    private final void raise(ParticipantStatesManager.StateChangedEvent stateChangedEvent) {
        for (ParticipantStatesManager.Listener onParticipantStateChanged : this.listeners) {
            onParticipantStateChanged.onParticipantStateChanged(this.manager, stateChangedEvent);
        }
    }

    /* access modifiers changed from: private */
    public static final void raiseRunnable$lambda$0(ParticipantStatesListenerProxy participantStatesListenerProxy) {
        ParticipantStatesManager.StateChangedEvent merge = participantStatesListenerProxy.merge();
        if (!merge.getChanges().isEmpty()) {
            participantStatesListenerProxy.raise(merge);
            participantStatesListenerProxy.lastRaiseTime = SystemClock.elapsedRealtime();
            participantStatesListenerProxy.scheduleNextRaise = true;
        }
    }

    public final void addListener(ParticipantStatesManager.Listener listener) {
        if (!this.listeners.contains(listener)) {
            this.listeners.add(listener);
        }
    }

    public void onParticipantStateChanged(ParticipantStatesManager participantStatesManager, ParticipantStatesManager.StateChangedEvent stateChangedEvent) {
        if (SystemClock.elapsedRealtime() - this.lastRaiseTime < 200) {
            this.mainThreadHandler.removeCallbacks(this.raiseRunnable);
            this.scheduleNextRaise = true;
        }
        accumulate(stateChangedEvent);
        if (this.scheduleNextRaise) {
            this.scheduleNextRaise = false;
            this.mainThreadHandler.postDelayed(this.raiseRunnable, 10);
        }
    }

    public final void release() {
        this.mainThreadHandler.removeCallbacks(this.raiseRunnable);
    }

    public final void removeListener(ParticipantStatesManager.Listener listener) {
        this.listeners.remove(listener);
    }
}
