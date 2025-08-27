package ru.ok.android.externcalls.analytics.config;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/analytics/config/EventMetaParamsConfig;", "", "appName", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getAppName", "()Lkotlin/jvm/functions/Function0;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EventMetaParamsConfig {
    private final Function0<String> appName;

    public EventMetaParamsConfig() {
        this((Function0) null, 1, (DefaultConstructorMarker) null);
    }

    public final Function0<String> getAppName() {
        return this.appName;
    }

    public EventMetaParamsConfig(Function0<String> function0) {
        this.appName = function0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EventMetaParamsConfig(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AnonymousClass1.INSTANCE : function0);
    }
}
