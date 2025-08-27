package ru.ok.android.externcalls.sdk.connection.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionManager;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionSettings;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 G2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002GHB%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010\u0019J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010\u0019J\u001f\u0010'\u001a\u00020\r2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0017¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\rH\u0007¢\u0006\u0004\b-\u0010\u000fJ\u000f\u0010.\u001a\u00020\rH\u0007¢\u0006\u0004\b.\u0010\u000fJ\u000f\u0010/\u001a\u00020\rH\u0007¢\u0006\u0004\b/\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u00101R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0016038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010:R\u0016\u0010>\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020C8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010E¨\u0006I"}, d2 = {"Lru/ok/android/externcalls/sdk/connection/internal/MediaConnectionManagerImpl;", "Lru/ok/android/externcalls/sdk/connection/MediaConnectionManager;", "Lcl1;", "Lynf;", "Lvoc;", "log", "Lkotlin/Function0;", "", "isConversationEnded", "Lru/ok/android/externcalls/sdk/connection/MediaConnectionSettings;", "settings", "<init>", "(Lvoc;Lkotlin/jvm/functions/Function0;Lru/ok/android/externcalls/sdk/connection/MediaConnectionSettings;)V", "", "disconnectConfirmedCheck", "()V", "noDataCallbackTimeout", "reportNewStateIfNeeded", "Lru/ok/android/externcalls/sdk/connection/internal/MediaConnectionManagerImpl$State;", "newState", "reportNewState", "(Lru/ok/android/externcalls/sdk/connection/internal/MediaConnectionManagerImpl$State;)V", "Lru/ok/android/externcalls/sdk/connection/MediaConnectionListener;", "listener", "reportStateToNewListener", "(Lru/ok/android/externcalls/sdk/connection/MediaConnectionListener;)V", "Lru/ok/android/externcalls/sdk/connection/MediaConnectionListener$ConnectedInfo;", "createConnectedInfo", "()Lru/ok/android/externcalls/sdk/connection/MediaConnectionListener$ConnectedInfo;", "Lru/ok/android/externcalls/sdk/connection/MediaConnectionListener$DisconnectedInfo;", "createDisconnectedInfo", "()Lru/ok/android/externcalls/sdk/connection/MediaConnectionListener$DisconnectedInfo;", "shouldReport", "()Z", "addListener", "removeListener", "Lxnf;", "oldTopology", "newTopology", "onTopologyUpdated", "(Lxnf;Lxnf;)V", "", "timeSinceBytesReceivedMs", "onMediaDataReceived", "(J)V", "onIceConnected", "onIceDisconnected", "release", "Lvoc;", "Lkotlin/jvm/functions/Function0;", "Lru/ok/android/externcalls/sdk/connection/MediaConnectionSettings;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "isFirstConnection", "Z", "reportedState", "Lru/ok/android/externcalls/sdk/connection/internal/MediaConnectionManagerImpl$State;", "isDataConnected", "isIceConnected", "lastConnectedInfo", "Lru/ok/android/externcalls/sdk/connection/MediaConnectionListener$ConnectedInfo;", "lastDisconnectedInfo", "Lru/ok/android/externcalls/sdk/connection/MediaConnectionListener$DisconnectedInfo;", "Ljava/lang/Runnable;", "disconnectRunnable", "Ljava/lang/Runnable;", "noDataRunnable", "Companion", "State", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMediaConnectionManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaConnectionManagerImpl.kt\nru/ok/android/externcalls/sdk/connection/internal/MediaConnectionManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,212:1\n1855#2,2:213\n1855#2,2:215\n*S KotlinDebug\n*F\n+ 1 MediaConnectionManagerImpl.kt\nru/ok/android/externcalls/sdk/connection/internal/MediaConnectionManagerImpl\n*L\n151#1:213,2\n160#1:215,2\n*E\n"})
public final class MediaConnectionManagerImpl implements MediaConnectionManager, cl1, ynf {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String LOG_TAG = "MediaConnectionManager";
    private final Runnable disconnectRunnable = new lo8(this, 0);
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final Function0<Boolean> isConversationEnded;
    private boolean isDataConnected;
    private boolean isFirstConnection = true;
    private boolean isIceConnected;
    private MediaConnectionListener.ConnectedInfo lastConnectedInfo;
    private MediaConnectionListener.DisconnectedInfo lastDisconnectedInfo;
    private final CopyOnWriteArrayList<MediaConnectionListener> listeners = new CopyOnWriteArrayList<>();
    private final voc log;
    private final Runnable noDataRunnable = new lo8(this, 1);
    private State reportedState = State.DISCONNECTED;
    private final MediaConnectionSettings settings;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/connection/internal/MediaConnectionManagerImpl$Companion;", "", "()V", "LOG_TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/connection/internal/MediaConnectionManagerImpl$State;", "", "(Ljava/lang/String;I)V", "NONE", "CONNECTED", "DISCONNECTED", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum State {
        NONE,
        CONNECTED,
        DISCONNECTED;

        static {
            State[] $values;
            $ENTRIES = EnumEntriesKt.enumEntries((E[]) $values);
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ru.ok.android.externcalls.sdk.connection.internal.MediaConnectionManagerImpl$State[] r0 = ru.ok.android.externcalls.sdk.connection.internal.MediaConnectionManagerImpl.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ru.ok.android.externcalls.sdk.connection.internal.MediaConnectionManagerImpl$State r1 = ru.ok.android.externcalls.sdk.connection.internal.MediaConnectionManagerImpl.State.CONNECTED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ru.ok.android.externcalls.sdk.connection.internal.MediaConnectionManagerImpl$State r1 = ru.ok.android.externcalls.sdk.connection.internal.MediaConnectionManagerImpl.State.DISCONNECTED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.connection.internal.MediaConnectionManagerImpl.WhenMappings.<clinit>():void");
        }
    }

    public MediaConnectionManagerImpl(voc voc, Function0<Boolean> function0, MediaConnectionSettings mediaConnectionSettings) {
        this.log = voc;
        this.isConversationEnded = function0;
        this.settings = mediaConnectionSettings;
    }

    private final MediaConnectionListener.ConnectedInfo createConnectedInfo() {
        return new MediaConnectionListener.ConnectedInfo(this.isFirstConnection);
    }

    private final MediaConnectionListener.DisconnectedInfo createDisconnectedInfo() {
        return MediaConnectionListener.DisconnectedInfo.INSTANCE;
    }

    private final void disconnectConfirmedCheck() {
        this.log.log(LOG_TAG, "onIceDisconnected after timeout");
        this.isIceConnected = false;
        reportNewStateIfNeeded();
    }

    /* access modifiers changed from: private */
    public static final void disconnectRunnable$lambda$0(MediaConnectionManagerImpl mediaConnectionManagerImpl) {
        mediaConnectionManagerImpl.disconnectConfirmedCheck();
    }

    private final void noDataCallbackTimeout() {
        this.log.log(LOG_TAG, "noDataCallbackTimeout after timeout");
        this.isDataConnected = false;
        reportNewStateIfNeeded();
    }

    /* access modifiers changed from: private */
    public static final void noDataRunnable$lambda$1(MediaConnectionManagerImpl mediaConnectionManagerImpl) {
        mediaConnectionManagerImpl.noDataCallbackTimeout();
    }

    private final void reportNewState(State state) {
        if (shouldReport()) {
            int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i == 1) {
                MediaConnectionListener.ConnectedInfo createConnectedInfo = createConnectedInfo();
                this.lastConnectedInfo = createConnectedInfo;
                for (MediaConnectionListener onMediaConnected : this.listeners) {
                    onMediaConnected.onMediaConnected(createConnectedInfo);
                }
            } else if (i == 2) {
                MediaConnectionListener.DisconnectedInfo createDisconnectedInfo = createDisconnectedInfo();
                this.lastDisconnectedInfo = createDisconnectedInfo;
                for (MediaConnectionListener onMediaDisconnected : this.listeners) {
                    onMediaDisconnected.onMediaDisconnected(createDisconnectedInfo);
                }
            }
        }
    }

    private final void reportNewStateIfNeeded() {
        State state;
        State state2 = this.reportedState;
        boolean z = this.isIceConnected;
        if (z || this.isDataConnected) {
            state = State.CONNECTED;
        } else {
            state = State.NONE;
            if (state2 != state) {
                state = State.DISCONNECTED;
            }
        }
        if (state2 != state) {
            voc voc = this.log;
            boolean z2 = this.isDataConnected;
            voc.log(LOG_TAG, "new state: " + state + " isIceConnected=" + z + " isDataConnected=" + z2);
            reportNewState(state);
            this.isFirstConnection = false;
            this.reportedState = state;
        }
    }

    private final void reportStateToNewListener(MediaConnectionListener mediaConnectionListener) {
        MediaConnectionListener.DisconnectedInfo disconnectedInfo;
        if (shouldReport()) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.reportedState.ordinal()];
            if (i == 1) {
                MediaConnectionListener.ConnectedInfo connectedInfo = this.lastConnectedInfo;
                if (connectedInfo != null) {
                    mediaConnectionListener.onMediaConnected(connectedInfo);
                }
            } else if (i == 2 && (disconnectedInfo = this.lastDisconnectedInfo) != null) {
                mediaConnectionListener.onMediaDisconnected(disconnectedInfo);
            }
        }
    }

    private final boolean shouldReport() {
        return !this.isConversationEnded.invoke().booleanValue();
    }

    public void addListener(MediaConnectionListener mediaConnectionListener) {
        this.listeners.add(mediaConnectionListener);
        reportStateToNewListener(mediaConnectionListener);
    }

    public final void onIceConnected() {
        this.log.log(LOG_TAG, "onIceConnected");
        this.isIceConnected = true;
        this.handler.removeCallbacks(this.disconnectRunnable);
        reportNewStateIfNeeded();
    }

    public final void onIceDisconnected() {
        this.log.log(LOG_TAG, "onIceDisconnected");
        this.handler.postDelayed(this.disconnectRunnable, this.settings.getNoIceConnectionReportTimeoutMs());
    }

    public void onMediaDataReceived(long j) {
        boolean z = this.isDataConnected;
        boolean z2 = j < this.settings.getNoMediaReportTimeoutMs();
        this.isDataConnected = z2;
        if (z != z2) {
            voc voc = this.log;
            voc.log(LOG_TAG, "isDataConnected=" + z2 + " timeSinceBytesReceivedMs=" + j);
        }
        reportNewStateIfNeeded();
        this.handler.removeCallbacks(this.noDataRunnable);
        this.handler.postDelayed(this.noDataRunnable, this.settings.getNoMediaReportTimeoutMs());
    }

    public void onTopologyUpdated(xnf xnf, xnf xnf2) {
        voc voc = this.log;
        voc.log(LOG_TAG, "topology changed: oldTopology=" + xnf + " newTopology=" + xnf2);
    }

    public final void release() {
        this.handler.removeCallbacksAndMessages((Object) null);
    }

    public void removeListener(MediaConnectionListener mediaConnectionListener) {
        this.listeners.remove(mediaConnectionListener);
    }
}
