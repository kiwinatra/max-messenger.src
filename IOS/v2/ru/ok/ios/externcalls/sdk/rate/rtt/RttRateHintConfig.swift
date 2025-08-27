package ru.ok.android.externcalls.sdk.rate.rtt;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/rtt/RttRateHintConfig;", "", "rttMs", "", "highRttCount", "", "(JI)V", "getHighRttCount", "()I", "getRttMs", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RttRateHintConfig {
    private final int highRttCount;
    private final long rttMs;

    public RttRateHintConfig() {
        this(0, 0, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ RttRateHintConfig copy$default(RttRateHintConfig rttRateHintConfig, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = rttRateHintConfig.rttMs;
        }
        if ((i2 & 2) != 0) {
            i = rttRateHintConfig.highRttCount;
        }
        return rttRateHintConfig.copy(j, i);
    }

    public final long component1() {
        return this.rttMs;
    }

    public final int component2() {
        return this.highRttCount;
    }

    public final RttRateHintConfig copy(long j, int i) {
        return new RttRateHintConfig(j, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RttRateHintConfig)) {
            return false;
        }
        RttRateHintConfig rttRateHintConfig = (RttRateHintConfig) obj;
        return this.rttMs == rttRateHintConfig.rttMs && this.highRttCount == rttRateHintConfig.highRttCount;
    }

    public final int getHighRttCount() {
        return this.highRttCount;
    }

    public final long getRttMs() {
        return this.rttMs;
    }

    public int hashCode() {
        return Integer.hashCode(this.highRttCount) + (Long.hashCode(this.rttMs) * 31);
    }

    public String toString() {
        long j = this.rttMs;
        int i = this.highRttCount;
        return "RttRateHintConfig(rttMs=" + j + ", highRttCount=" + i + ")";
    }

    public RttRateHintConfig(long j, int i) {
        this.rttMs = j;
        this.highRttCount = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RttRateHintConfig(long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1000 : j, (i2 & 2) != 0 ? 1 : i);
    }
}
