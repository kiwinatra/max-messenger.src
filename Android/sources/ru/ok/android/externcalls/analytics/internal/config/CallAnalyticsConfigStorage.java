package ru.ok.android.externcalls.analytics.internal.config;

import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.internal.log.DefaultCallAnalyticsLogger;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/config/CallAnalyticsConfigStorage;", "", "()V", "config", "Lru/ok/android/externcalls/analytics/config/CallAnalyticsConfig;", "getConfig", "()Lru/ok/android/externcalls/analytics/config/CallAnalyticsConfig;", "setConfig", "(Lru/ok/android/externcalls/analytics/config/CallAnalyticsConfig;)V", "defaultLogger", "Lru/ok/android/externcalls/analytics/internal/log/DefaultCallAnalyticsLogger;", "logger", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "getLogger", "()Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "upload", "Lru/ok/android/externcalls/analytics/config/UploadConfig;", "getUpload", "()Lru/ok/android/externcalls/analytics/config/UploadConfig;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CallAnalyticsConfigStorage {
    public static final CallAnalyticsConfigStorage INSTANCE = new CallAnalyticsConfigStorage();
    private static volatile CallAnalyticsConfig config;
    private static final DefaultCallAnalyticsLogger defaultLogger = new DefaultCallAnalyticsLogger();

    private CallAnalyticsConfigStorage() {
    }

    public final CallAnalyticsConfig getConfig() {
        return config;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.getLogger();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger getLogger() {
        /*
            r0 = this;
            ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig r0 = config
            if (r0 == 0) goto L_0x000a
            ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger r0 = r0.getLogger()
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            ru.ok.android.externcalls.analytics.internal.log.DefaultCallAnalyticsLogger r0 = defaultLogger
        L_0x000c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage.getLogger():ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r15 = r15.getUpload();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ru.ok.android.externcalls.analytics.config.UploadConfig getUpload() {
        /*
            r15 = this;
            ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig r15 = config
            if (r15 == 0) goto L_0x000a
            ru.ok.android.externcalls.analytics.config.UploadConfig r15 = r15.getUpload()
            if (r15 != 0) goto L_0x001f
        L_0x000a:
            ru.ok.android.externcalls.analytics.config.UploadConfig r15 = new ru.ok.android.externcalls.analytics.config.UploadConfig
            r13 = 1023(0x3ff, float:1.434E-42)
            r14 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r0 = r15
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x001f:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage.getUpload():ru.ok.android.externcalls.analytics.config.UploadConfig");
    }

    public final void setConfig(CallAnalyticsConfig callAnalyticsConfig) {
        config = callAnalyticsConfig;
    }
}
