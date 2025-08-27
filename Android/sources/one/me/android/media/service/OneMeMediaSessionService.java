package one.me.android.media.service;

import android.content.Intent;
import android.os.Bundle;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/android/media/service/OneMeMediaSessionService;", "Lry8;", "<init>", "()V", "media_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nOneMeMediaSessionService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneMeMediaSessionService.kt\none/me/android/media/service/OneMeMediaSessionService\n+ 2 Log.kt\nru/ok/tamtam/logger/Log\n*L\n1#1,120:1\n32#2,4:121\n32#2,4:125\n75#2,4:129\n32#2,4:133\n32#2,4:137\n*S KotlinDebug\n*F\n+ 1 OneMeMediaSessionService.kt\none/me/android/media/service/OneMeMediaSessionService\n*L\n33#1:121,4\n46#1:125,4\n49#1:129,4\n62#1:133,4\n82#1:137,4\n*E\n"})
public final class OneMeMediaSessionService extends ry8 {
    public ex8 y;
    public jx3 z;

    /* JADX WARNING: type inference failed for: r2v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    public final void onCreate() {
        ex8 ex8;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, "OneMeMediaSessionService", "onCreate", (Throwable) null);
        }
        super.onCreate();
        a67 a672 = z68.b;
        if (a672 != null && a672.c()) {
            a672.d(w78.o, "OneMeMediaSessionService", "createMediaSession", (Throwable) null);
        }
        vb5 vb5 = new vb5(this);
        lz8 lz8 = (lz8) ko8.a.getAccessor().g(lz8.class);
        n79.n(!vb5.v);
        lz8.getClass();
        vb5.d = new ch4(2, lz8);
        tc5 a = vb5.a();
        u85 u85 = new u85();
        wb4 wb4 = a.A0;
        wb4.getClass();
        wb4.w.c(u85);
        try {
            Bundle bundle = Bundle.EMPTY;
            lx5 lx5 = tb7.b;
            ex8 = new ex8(this, a, k0d.v, new o9a(16), bundle, bundle, new ox0(3, (Object) new k74(this)));
        } catch (RuntimeException e) {
            z68.f("OneMeMediaSessionService", "Failed to create media session", e);
            a.release();
            ex8 = null;
        }
        this.y = ex8;
        if (ex8 != null) {
            q2f b = kr7.b();
            ko8 ko8 = ko8.a;
            Class<gaf> cls = gaf.class;
            jx3 a2 = e14.a(CoroutineContext.Element.DefaultImpls.plus(b, ((osa) ((gaf) ko8.getAccessor().g(cls))).c().t0()));
            this.z = a2;
            ev0.v(a2, ((osa) ((gaf) ko8.getAccessor().g(cls))).b(), (f14) null, new SuspendLambda(2, (Continuation<Object>) null), 2);
        }
    }

    public final void onDestroy() {
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, "OneMeMediaSessionService", "onDestroy", (Throwable) null);
        }
        jx3 jx3 = this.z;
        if (jx3 != null) {
            e14.c(jx3, (CancellationException) null);
        }
        this.z = null;
        ex8 ex8 = this.y;
        if (ex8 != null) {
            ex8.c().release();
            try {
                synchronized (ex8.b) {
                    ex8.c.remove(ex8.a.i);
                }
                ex8.a.r();
            } catch (Exception unused) {
            }
            this.y = null;
        }
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, "OneMeMediaSessionService", "onStartCommand, intent=" + intent + ", flags=" + i + ", startId=" + i2, (Throwable) null);
        }
        if (this.y == null) {
            a67 a672 = z68.b;
            if (a672 != null && a672.c()) {
                a672.d(w78.x, "OneMeMediaSessionService", "onStartCommand, media session is null, abort service", (Throwable) null);
            }
            stopSelf();
            return 2;
        }
        super.onStartCommand(intent, i, i2);
        return 1;
    }

    public final void onTaskRemoved(Intent intent) {
        stopSelf();
    }
}
