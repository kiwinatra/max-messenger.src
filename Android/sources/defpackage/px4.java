package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: px4  reason: default package */
public final class px4 implements t3f, SurfaceTexture.OnFrameAvailableListener {
    public SurfaceTexture X;
    public final nx4 a;
    public final HandlerThread b;
    public final ew6 c;
    public final Handler o;
    public int v = 0;
    public boolean w = false;
    public final AtomicBoolean x = new AtomicBoolean(false);
    public final LinkedHashMap y = new LinkedHashMap();
    public SurfaceTexture z;

    public px4(vy4 vy4, es7 es7, es7 es72) {
        Map emptyMap = Collections.emptyMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.o = handler;
        this.c = new ew6(handler);
        this.a = new nx4(es7, es72);
        try {
            m5a.F(new u00((Object) this, (Object) vy4, (Object) emptyMap, 8)).get();
        } catch (InterruptedException | ExecutionException e) {
            e = e;
            e = e instanceof ExecutionException ? e.getCause() : e;
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
        } catch (RuntimeException e2) {
            release();
            throw e2;
        }
    }

    public final void a(z3f z3f) {
        if (this.x.get()) {
            z3f.d();
        } else {
            e(new bk4(7, this, z3f), new ri4(z3f, 0));
        }
    }

    public final void c(s3f s3f) {
        if (this.x.get()) {
            s3f.close();
            return;
        }
        bk4 bk4 = new bk4(8, this, s3f);
        Objects.requireNonNull(s3f);
        e(bk4, new ne4(3, s3f));
    }

    public final void d() {
        if (this.w && this.v == 0) {
            LinkedHashMap linkedHashMap = this.y;
            for (s3f close : linkedHashMap.keySet()) {
                close.close();
            }
            linkedHashMap.clear();
            this.a.u();
            this.b.quit();
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new ktg(this, runnable2, runnable, 26));
        } catch (RejectedExecutionException unused) {
            runnable2.run();
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (!this.x.get() && (surfaceTexture2 = this.z) != null && this.X != null) {
            surfaceTexture2.updateTexImage();
            this.X.updateTexImage();
            for (Map.Entry entry : this.y.entrySet()) {
                Surface surface = (Surface) entry.getValue();
                s3f s3f = (s3f) entry.getKey();
                if (s3f.c == 34) {
                    try {
                        this.a.v(surfaceTexture.getTimestamp(), surface, s3f, this.z, this.X);
                    } catch (RuntimeException unused) {
                    }
                }
            }
        }
    }

    public final void release() {
        if (!this.x.getAndSet(true)) {
            e(new ne4(10, this), new gc(5));
        }
    }
}
