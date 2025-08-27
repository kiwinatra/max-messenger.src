package ru.ok.android.externcalls.sdk.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003JL\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsUploadConfig;", "", "maxLocalFileSizeKb", "", "maxEventCount", "maxLocalFileCount", "timeToUploadNextFileMs", "", "compressContent", "", "disableUploadWhenCallIsActiveProvider", "(IIILjava/lang/Long;ZZ)V", "getCompressContent", "()Z", "getDisableUploadWhenCallIsActiveProvider", "getMaxEventCount", "()I", "getMaxLocalFileCount", "getMaxLocalFileSizeKb", "getTimeToUploadNextFileMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(IIILjava/lang/Long;ZZ)Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsUploadConfig;", "equals", "other", "hashCode", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ConversationAnalyticsUploadConfig {
    private final boolean compressContent;
    private final boolean disableUploadWhenCallIsActiveProvider;
    private final int maxEventCount;
    private final int maxLocalFileCount;
    private final int maxLocalFileSizeKb;
    private final Long timeToUploadNextFileMs;

    public ConversationAnalyticsUploadConfig(int i, int i2, int i3, Long l, boolean z, boolean z2) {
        this.maxLocalFileSizeKb = i;
        this.maxEventCount = i2;
        this.maxLocalFileCount = i3;
        this.timeToUploadNextFileMs = l;
        this.compressContent = z;
        this.disableUploadWhenCallIsActiveProvider = z2;
    }

    public static /* synthetic */ ConversationAnalyticsUploadConfig copy$default(ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig, int i, int i2, int i3, Long l, boolean z, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = conversationAnalyticsUploadConfig.maxLocalFileSizeKb;
        }
        if ((i4 & 2) != 0) {
            i2 = conversationAnalyticsUploadConfig.maxEventCount;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = conversationAnalyticsUploadConfig.maxLocalFileCount;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            l = conversationAnalyticsUploadConfig.timeToUploadNextFileMs;
        }
        Long l2 = l;
        if ((i4 & 16) != 0) {
            z = conversationAnalyticsUploadConfig.compressContent;
        }
        boolean z3 = z;
        if ((i4 & 32) != 0) {
            z2 = conversationAnalyticsUploadConfig.disableUploadWhenCallIsActiveProvider;
        }
        return conversationAnalyticsUploadConfig.copy(i, i5, i6, l2, z3, z2);
    }

    public final int component1() {
        return this.maxLocalFileSizeKb;
    }

    public final int component2() {
        return this.maxEventCount;
    }

    public final int component3() {
        return this.maxLocalFileCount;
    }

    public final Long component4() {
        return this.timeToUploadNextFileMs;
    }

    public final boolean component5() {
        return this.compressContent;
    }

    public final boolean component6() {
        return this.disableUploadWhenCallIsActiveProvider;
    }

    public final ConversationAnalyticsUploadConfig copy(int i, int i2, int i3, Long l, boolean z, boolean z2) {
        return new ConversationAnalyticsUploadConfig(i, i2, i3, l, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationAnalyticsUploadConfig)) {
            return false;
        }
        ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) obj;
        return this.maxLocalFileSizeKb == conversationAnalyticsUploadConfig.maxLocalFileSizeKb && this.maxEventCount == conversationAnalyticsUploadConfig.maxEventCount && this.maxLocalFileCount == conversationAnalyticsUploadConfig.maxLocalFileCount && Intrinsics.areEqual((Object) this.timeToUploadNextFileMs, (Object) conversationAnalyticsUploadConfig.timeToUploadNextFileMs) && this.compressContent == conversationAnalyticsUploadConfig.compressContent && this.disableUploadWhenCallIsActiveProvider == conversationAnalyticsUploadConfig.disableUploadWhenCallIsActiveProvider;
    }

    public final boolean getCompressContent() {
        return this.compressContent;
    }

    public final boolean getDisableUploadWhenCallIsActiveProvider() {
        return this.disableUploadWhenCallIsActiveProvider;
    }

    public final int getMaxEventCount() {
        return this.maxEventCount;
    }

    public final int getMaxLocalFileCount() {
        return this.maxLocalFileCount;
    }

    public final int getMaxLocalFileSizeKb() {
        return this.maxLocalFileSizeKb;
    }

    public final Long getTimeToUploadNextFileMs() {
        return this.timeToUploadNextFileMs;
    }

    public int hashCode() {
        int h = rae.h(this.maxLocalFileCount, rae.h(this.maxEventCount, Integer.hashCode(this.maxLocalFileSizeKb) * 31, 31), 31);
        Long l = this.timeToUploadNextFileMs;
        return Boolean.hashCode(this.disableUploadWhenCallIsActiveProvider) + g63.e((h + (l == null ? 0 : l.hashCode())) * 31, 31, this.compressContent);
    }

    public String toString() {
        int i = this.maxLocalFileSizeKb;
        int i2 = this.maxEventCount;
        int i3 = this.maxLocalFileCount;
        Long l = this.timeToUploadNextFileMs;
        boolean z = this.compressContent;
        boolean z2 = this.disableUploadWhenCallIsActiveProvider;
        StringBuilder n = a81.n("ConversationAnalyticsUploadConfig(maxLocalFileSizeKb=", i, ", maxEventCount=", i2, ", maxLocalFileCount=");
        n.append(i3);
        n.append(", timeToUploadNextFileMs=");
        n.append(l);
        n.append(", compressContent=");
        n.append(z);
        n.append(", disableUploadWhenCallIsActiveProvider=");
        n.append(z2);
        n.append(")");
        return n.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConversationAnalyticsUploadConfig(int i, int i2, int i3, Long l, boolean z, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? 1 : i3, (i4 & 8) != 0 ? null : l, (i4 & 16) != 0 ? false : z, (i4 & 32) != 0 ? false : z2);
    }
}
