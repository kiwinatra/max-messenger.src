package ru.ok.android.externcalls.sdk.connection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/sdk/connection/MediaConnectionSettings;", "", "noMediaReportTimeoutMs", "", "noIceConnectionReportTimeoutMs", "(JJ)V", "getNoIceConnectionReportTimeoutMs", "()J", "getNoMediaReportTimeoutMs", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MediaConnectionSettings {
    private final long noIceConnectionReportTimeoutMs;
    private final long noMediaReportTimeoutMs;

    public MediaConnectionSettings() {
        this(0, 0, 3, (DefaultConstructorMarker) null);
    }

    public final long getNoIceConnectionReportTimeoutMs() {
        return this.noIceConnectionReportTimeoutMs;
    }

    public final long getNoMediaReportTimeoutMs() {
        return this.noMediaReportTimeoutMs;
    }

    public MediaConnectionSettings(long j, long j2) {
        this.noMediaReportTimeoutMs = j;
        this.noIceConnectionReportTimeoutMs = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MediaConnectionSettings(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 3000 : j, (i & 2) != 0 ? 3000 : j2);
    }
}
