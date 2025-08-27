package ru.ok.android.externcalls.sdk.rate.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/internal/RttRateHintTrigger;", "Lug1;", "Lvoc;", "log", "Lru/ok/android/externcalls/sdk/rate/rtt/RttRateHintConfig;", "config", "Lru/ok/android/externcalls/sdk/rate/internal/RateHintCollection;", "collection", "<init>", "(Lvoc;Lru/ok/android/externcalls/sdk/rate/rtt/RttRateHintConfig;Lru/ok/android/externcalls/sdk/rate/internal/RateHintCollection;)V", "Lxoc;", "rtcStat", "", "onRtcStats", "(Lxoc;)V", "Lvoc;", "Lru/ok/android/externcalls/sdk/rate/rtt/RttRateHintConfig;", "Lru/ok/android/externcalls/sdk/rate/internal/RateHintCollection;", "", "highRttCount", "I", "", "wasReported", "Z", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class RttRateHintTrigger implements ug1 {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String LOG_TAG = "RateManager";
    private static final String RTT_HINT_REASON = "rtt_";
    private final RateHintCollection collection;
    private final RttRateHintConfig config;
    private int highRttCount;
    private final voc log;
    private boolean wasReported;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/internal/RttRateHintTrigger$Companion;", "", "()V", "LOG_TAG", "", "RTT_HINT_REASON", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public RttRateHintTrigger(voc voc, RttRateHintConfig rttRateHintConfig, RateHintCollection rateHintCollection) {
        this.log = voc;
        this.config = rttRateHintConfig;
        this.collection = rateHintCollection;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r6 = kotlin.text.StringsKt.toFloatOrNull((r6 = r6.h));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRtcStats(defpackage.xoc r6) {
        /*
            r5 = this;
            boolean r0 = r5.wasReported
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            uw1 r6 = r6.c()
            if (r6 == 0) goto L_0x001b
            java.lang.String r6 = r6.h
            if (r6 == 0) goto L_0x001b
            java.lang.Float r6 = kotlin.text.StringsKt.toFloatOrNull(r6)
            if (r6 == 0) goto L_0x001b
            float r6 = r6.floatValue()
            long r0 = (long) r6
            goto L_0x001d
        L_0x001b:
            r0 = 0
        L_0x001d:
            voc r6 = r5.log
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "measured rtt: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "RateManager"
            r6.log(r3, r2)
            ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig r6 = r5.config
            long r2 = r6.getRttMs()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r0 = 1
            if (r6 < 0) goto L_0x0043
            int r6 = r5.highRttCount
            int r6 = r6 + r0
            r5.highRttCount = r6
            goto L_0x0046
        L_0x0043:
            r6 = 0
            r5.highRttCount = r6
        L_0x0046:
            int r6 = r5.highRttCount
            ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig r1 = r5.config
            int r1 = r1.getHighRttCount()
            if (r6 < r1) goto L_0x0068
            ru.ok.android.externcalls.sdk.rate.internal.RateHintCollection r6 = r5.collection
            ru.ok.android.externcalls.sdk.rate.RateHint r1 = new ru.ok.android.externcalls.sdk.rate.RateHint
            ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig r2 = r5.config
            long r2 = r2.getRttMs()
            java.lang.String r4 = "rtt_"
            java.lang.String r2 = defpackage.wj6.i(r2, r4)
            r1.<init>(r2)
            r6.addRateHint(r1)
            r5.wasReported = r0
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.rate.internal.RttRateHintTrigger.onRtcStats(xoc):void");
    }
}
