package ru.ok.android.externcalls.sdk.factory.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/internal/RTCLogWrapper;", "Lvoc;", "Lkotlin/Function0;", "logger", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "tag", "msg", "", "log", "(Ljava/lang/String;Ljava/lang/String;)V", "", "throwable", "logException", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "reportException", "Lkotlin/jvm/functions/Function0;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class RTCLogWrapper implements voc {
    private final Function0<voc> logger;

    public RTCLogWrapper(Function0<? extends voc> function0) {
        this.logger = function0;
    }

    public void log(String str, String str2) {
        voc invoke = this.logger.invoke();
        if (invoke != null) {
            invoke.log(str, str2);
        }
    }

    public void logException(String str, String str2, Throwable th) {
        voc invoke = this.logger.invoke();
        if (invoke != null) {
            invoke.logException(str, str2, th);
        }
    }

    public void reportException(String str, String str2, Throwable th) {
        voc invoke = this.logger.invoke();
        if (invoke != null) {
            invoke.reportException(str, str2, th);
        }
    }
}
