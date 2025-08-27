package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: vv1  reason: default package */
public final class vv1 implements cdf {
    public static final la0 X = new la0(a5d.class, (Object) null, "camerax.core.appConfig.cameraProviderInitRetryPolicy");
    public static final la0 Y = new la0(jcc.class, (Object) null, "camerax.core.appConfig.quirksSettings");
    public static final la0 b = new la0(ts1.class, (Object) null, "camerax.core.appConfig.cameraFactoryProvider");
    public static final la0 c = new la0(us1.class, (Object) null, "camerax.core.appConfig.deviceSurfaceManagerProvider");
    public static final la0 o = new la0(ts1.class, (Object) null, "camerax.core.appConfig.useCaseConfigFactoryProvider");
    public static final la0 v = new la0(Executor.class, (Object) null, "camerax.core.appConfig.cameraExecutor");
    public static final la0 w = new la0(Handler.class, (Object) null, "camerax.core.appConfig.schedulerHandler");
    public static final la0 x = new la0(Integer.TYPE, (Object) null, "camerax.core.appConfig.minimumLoggingLevel");
    public static final la0 y = new la0(jv1.class, (Object) null, "camerax.core.appConfig.availableCamerasLimiter");
    public static final la0 z = new la0(Long.TYPE, (Object) null, "camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming");
    public final c5b a;

    public vv1(c5b c5b) {
        this.a = c5b;
    }

    public final jv1 a() {
        Object obj;
        la0 la0 = y;
        c5b c5b = this.a;
        c5b.getClass();
        try {
            obj = c5b.n(la0);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (jv1) obj;
    }

    public final ts1 c() {
        Object obj;
        la0 la0 = b;
        c5b c5b = this.a;
        c5b.getClass();
        try {
            obj = c5b.n(la0);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (ts1) obj;
    }

    public final long d() {
        la0 la0 = z;
        long j = -1L;
        c5b c5b = this.a;
        c5b.getClass();
        try {
            j = c5b.n(la0);
        } catch (IllegalArgumentException unused) {
        }
        return ((Long) j).longValue();
    }

    public final us1 e() {
        Object obj;
        la0 la0 = c;
        c5b c5b = this.a;
        c5b.getClass();
        try {
            obj = c5b.n(la0);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (us1) obj;
    }

    public final ts1 f() {
        Object obj;
        la0 la0 = o;
        c5b c5b = this.a;
        c5b.getClass();
        try {
            obj = c5b.n(la0);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (ts1) obj;
    }

    public final je3 getConfig() {
        return this.a;
    }
}
