package ru.ok.android.externcalls.sdk.stat.reconnect;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ok.android.externcalls.sdk.log.ExtLogger;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/reconnect/ConversationReconnectStat;", "", "Lru/ok/android/externcalls/sdk/log/ExtLogger;", "statReporter", "Lkz3;", "cidProvider", "<init>", "(Lru/ok/android/externcalls/sdk/log/ExtLogger;Lkz3;)V", "", "onDisconnected", "()V", "onConnected", "Lru/ok/android/externcalls/sdk/log/ExtLogger;", "Lkz3;", "", "wasDisconnected", "Z", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class ConversationReconnectStat {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String RECONNECT_STARTED = "1";
    private static final String RECONNECT_SUCCEEDED = "0";
    private final kz3 cidProvider;
    private final ExtLogger statReporter;
    private boolean wasDisconnected;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/reconnect/ConversationReconnectStat$Companion;", "", "()V", "RECONNECT_STARTED", "", "RECONNECT_SUCCEEDED", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ConversationReconnectStat(ExtLogger extLogger, kz3 kz3) {
        this.statReporter = extLogger;
        this.cidProvider = kz3;
    }

    public final void onConnected() {
        if (this.wasDisconnected) {
            this.statReporter.logSimple(jme.callReconnect, ((lz3) this.cidProvider).a, RECONNECT_SUCCEEDED);
            this.wasDisconnected = false;
        }
    }

    public final void onDisconnected() {
        this.wasDisconnected = true;
        this.statReporter.logSimple(jme.callReconnect, ((lz3) this.cidProvider).a, RECONNECT_STARTED);
    }
}
