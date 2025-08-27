package ru.ok.android.externcalls.sdk.rate.internal;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.android.externcalls.sdk.rate.RateHint;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class RateManagerImpl$rttTrigger$1 implements RateHintCollection, FunctionAdapter {
    final /* synthetic */ RateManagerImpl $tmp0;

    public RateManagerImpl$rttTrigger$1(RateManagerImpl rateManagerImpl) {
        this.$tmp0 = rateManagerImpl;
    }

    public final void addRateHint(RateHint rateHint) {
        this.$tmp0.addRateHint(rateHint);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RateHintCollection) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((FunctionAdapter) obj).getFunctionDelegate());
    }

    public final Function<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.$tmp0, RateManagerImpl.class, "addRateHint", "addRateHint(Lru/ok/android/externcalls/sdk/rate/RateHint;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
