package ru.ok.android.externcalls.sdk.audio.internal.tracer;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.audio.Logger;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J \u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J \u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J \u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J \u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/tracer/TracerLogger;", "Lru/ok/android/externcalls/sdk/audio/Logger;", "tracer", "Lru/ok/android/externcalls/sdk/audio/internal/tracer/TracerLiteFacade;", "delegate", "(Lru/ok/android/externcalls/sdk/audio/internal/tracer/TracerLiteFacade;Lru/ok/android/externcalls/sdk/audio/Logger;)V", "d", "", "tag", "", "message", "throwable", "", "e", "i", "reportError", "v", "w", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TracerLogger implements Logger {
    private final Logger delegate;
    private final TracerLiteFacade tracer;

    public TracerLogger(TracerLiteFacade tracerLiteFacade, Logger logger) {
        this.tracer = tracerLiteFacade;
        this.delegate = logger;
    }

    public void d(String str, String str2) {
        this.delegate.d(str, str2);
    }

    public void e(String str, String str2) {
        this.delegate.e(str, str2);
    }

    public void i(String str, String str2) {
        this.delegate.i(str, str2);
    }

    public void reportError(String str, String str2, Throwable th) {
        this.delegate.reportError(str, str2, th);
        TracerLiteFacade.reportCrash$default(this.tracer, th, (String) null, 2, (Object) null);
    }

    public void v(String str, String str2) {
        this.delegate.v(str, str2);
    }

    public void w(String str, String str2) {
        this.delegate.w(str, str2);
    }

    public void d(String str, String str2, Throwable th) {
        this.delegate.d(str, str2, th);
    }

    public void e(String str, String str2, Throwable th) {
        this.delegate.e(str, str2, th);
    }

    public void i(String str, String str2, Throwable th) {
        this.delegate.i(str, str2, th);
    }

    public void v(String str, String str2, Throwable th) {
        this.delegate.v(str, str2, th);
    }

    public void w(String str, String str2, Throwable th) {
        this.delegate.w(str, str2, th);
    }

    public void w(String str, Throwable th) {
        this.delegate.w(str, th);
    }
}
