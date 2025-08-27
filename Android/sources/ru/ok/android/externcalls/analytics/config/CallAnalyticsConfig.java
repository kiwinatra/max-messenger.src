package ru.ok.android.externcalls.analytics.config;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ok.android.externcalls.analytics.internal.log.DefaultCallAnalyticsLogger;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/analytics/config/CallAnalyticsConfig;", "", "Lnla;", "okApi", "Lru/ok/android/externcalls/analytics/config/EventMetaParamsConfig;", "eventMetaParams", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "logger", "Lru/ok/android/externcalls/analytics/config/UploadConfig;", "upload", "<init>", "(Lnla;Lru/ok/android/externcalls/analytics/config/EventMetaParamsConfig;Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;Lru/ok/android/externcalls/analytics/config/UploadConfig;)V", "Lnla;", "getOkApi", "()Lnla;", "Lru/ok/android/externcalls/analytics/config/EventMetaParamsConfig;", "getEventMetaParams", "()Lru/ok/android/externcalls/analytics/config/EventMetaParamsConfig;", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "getLogger", "()Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "Lru/ok/android/externcalls/analytics/config/UploadConfig;", "getUpload", "()Lru/ok/android/externcalls/analytics/config/UploadConfig;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0})
public final class CallAnalyticsConfig {
    private final EventMetaParamsConfig eventMetaParams;
    private final CallAnalyticsLogger logger;
    private final nla okApi;
    private final UploadConfig upload;

    public CallAnalyticsConfig(nla nla, EventMetaParamsConfig eventMetaParamsConfig, CallAnalyticsLogger callAnalyticsLogger, UploadConfig uploadConfig) {
        this.okApi = nla;
        this.eventMetaParams = eventMetaParamsConfig;
        this.logger = callAnalyticsLogger;
        this.upload = uploadConfig;
    }

    public final EventMetaParamsConfig getEventMetaParams() {
        return this.eventMetaParams;
    }

    public final CallAnalyticsLogger getLogger() {
        return this.logger;
    }

    public final nla getOkApi() {
        return this.okApi;
    }

    public final UploadConfig getUpload() {
        return this.upload;
    }

    public /* synthetic */ CallAnalyticsConfig(nla nla, EventMetaParamsConfig eventMetaParamsConfig, CallAnalyticsLogger callAnalyticsLogger, UploadConfig uploadConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        nla nla2;
        CallAnalyticsConfig callAnalyticsConfig;
        UploadConfig uploadConfig2;
        EventMetaParamsConfig eventMetaParamsConfig2 = (i & 2) != 0 ? new EventMetaParamsConfig((Function0) null, 1, (DefaultConstructorMarker) null) : eventMetaParamsConfig;
        CallAnalyticsLogger defaultCallAnalyticsLogger = (i & 4) != 0 ? new DefaultCallAnalyticsLogger() : callAnalyticsLogger;
        if ((i & 8) != 0) {
            uploadConfig2 = new UploadConfig(0, (Executor) null, 0, 0, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, 1023, (DefaultConstructorMarker) null);
            callAnalyticsConfig = this;
            nla2 = nla;
        } else {
            callAnalyticsConfig = this;
            nla2 = nla;
            uploadConfig2 = uploadConfig;
        }
        new CallAnalyticsConfig(nla2, eventMetaParamsConfig2, defaultCallAnalyticsLogger, uploadConfig2);
    }
}
