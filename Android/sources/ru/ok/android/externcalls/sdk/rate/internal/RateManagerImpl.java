package ru.ok.android.externcalls.sdk.rate.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ok.android.externcalls.sdk.rate.RateHint;
import ru.ok.android.externcalls.sdk.rate.RateManager;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0001\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001b8\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ok/android/externcalls/sdk/rate/internal/RateManagerImpl;", "Lru/ok/android/externcalls/sdk/rate/RateManager;", "Lug1;", "Lvoc;", "log", "Lru/ok/android/externcalls/sdk/rate/rtt/RttRateHintConfig;", "rttRateHintConfig", "<init>", "(Lvoc;Lru/ok/android/externcalls/sdk/rate/rtt/RttRateHintConfig;)V", "Lru/ok/android/externcalls/sdk/rate/RateHint;", "rateHint", "", "addRateHint", "(Lru/ok/android/externcalls/sdk/rate/RateHint;)V", "Lxoc;", "rtcStat", "onRtcStats", "(Lxoc;)V", "logHints", "()V", "Lvoc;", "Lru/ok/android/externcalls/sdk/rate/internal/RttRateHintTrigger;", "rttTrigger", "Lru/ok/android/externcalls/sdk/rate/internal/RttRateHintTrigger;", "", "_rateHints", "Ljava/util/List;", "", "rateHints", "getRateHints", "()Ljava/util/List;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class RateManagerImpl implements RateManager, ug1 {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String LOG_TAG = "RateManager";
    private final List<RateHint> _rateHints;
    private final voc log;
    private final List<RateHint> rateHints;
    private final RttRateHintTrigger rttTrigger;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/internal/RateManagerImpl$Companion;", "", "()V", "LOG_TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public RateManagerImpl(voc voc, RttRateHintConfig rttRateHintConfig) {
        this.log = voc;
        this.rttTrigger = new RttRateHintTrigger(voc, rttRateHintConfig, new RateManagerImpl$rttTrigger$1(this));
        ArrayList arrayList = new ArrayList();
        this._rateHints = arrayList;
        this.rateHints = arrayList;
    }

    /* access modifiers changed from: private */
    public final void addRateHint(RateHint rateHint) {
        this._rateHints.add(rateHint);
        voc voc = this.log;
        voc.log(LOG_TAG, "addRateHint " + rateHint);
    }

    public List<RateHint> getRateHints() {
        return this.rateHints;
    }

    public final void logHints() {
        voc voc = this.log;
        List<RateHint> rateHints2 = getRateHints();
        boolean shouldRateConversation = getShouldRateConversation();
        voc.log(LOG_TAG, "rateHints = " + rateHints2 + ", shouldRateConversation=" + shouldRateConversation);
    }

    public void onRtcStats(xoc xoc) {
        this.rttTrigger.onRtcStats(xoc);
    }
}
