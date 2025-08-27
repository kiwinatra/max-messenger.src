package defpackage;

import android.content.Context;
import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: m70  reason: default package */
public final class m70 {
    public final tsd a;
    public final AtomicReference b = new AtomicReference((Object) null);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final iu0 d;
    public final jae e;
    public final long f;
    public int g = 1;
    public du0 h = du0.b;
    public boolean i;
    public Executor j;
    public wsb k;
    public c65 l;
    public npg m;
    public l70 n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public byte[] s;
    public double t;
    public long u = 0;
    public final int v;

    public m70(y90 y90, tsd tsd, Context context) {
        tsd tsd2 = new tsd(tsd);
        this.a = tsd2;
        this.f = TimeUnit.MILLISECONDS.toNanos(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
        try {
            iu0 iu0 = new iu0(new q70(y90, context), y90);
            this.d = iu0;
            iu0.a(new b8d((Object) this), tsd2);
            this.e = new jae(y90);
            this.v = y90.d;
        } catch (AudioStream$AudioStreamException | IllegalArgumentException e2) {
            throw new Exception("Unable to create AudioStream", e2);
        }
    }

    public final void a() {
        Executor executor = this.j;
        wsb wsb = this.k;
        if (executor != null && wsb != null) {
            boolean z = this.r || this.o || this.q;
            if (!Objects.equals(this.b.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
                executor.execute(new c70((Object) wsb, z, 2));
            }
        }
    }

    public final void b(c65 c65) {
        c65 c652 = this.l;
        du0 du0 = null;
        if (c652 != null) {
            l70 l70 = this.n;
            Objects.requireNonNull(l70);
            c652.i(l70);
            this.l = null;
            this.n = null;
            this.m = null;
            this.h = du0.b;
            d();
        }
        if (c65 != null) {
            this.l = c65;
            this.n = new l70(this, c65);
            this.m = new npg(this, c65, false, 3);
            try {
                zz7 e2 = c65.e();
                if (((go1) e2).b.isDone()) {
                    du0 = (du0) ((go1) e2).b.get();
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
            if (du0 != null) {
                this.h = du0;
                d();
            }
            this.l.d(this.a, this.n);
        }
    }

    public final void c() {
        c65 c65 = this.l;
        Objects.requireNonNull(c65);
        go1 F = m5a.F(new z55(c65, 1));
        npg npg = this.m;
        Objects.requireNonNull(npg);
        hd8.a(F, npg, this.a);
    }

    public final void d() {
        int i2 = this.g;
        iu0 iu0 = this.d;
        if (i2 == 2) {
            boolean z = this.h == du0.a;
            boolean z2 = !z;
            Executor executor = this.j;
            wsb wsb = this.k;
            if (!(executor == null || wsb == null || this.c.getAndSet(z2) == z2)) {
                executor.execute(new b(wsb, z2));
            }
            if (z) {
                if (!this.i) {
                    try {
                        iu0.start();
                        this.o = false;
                    } catch (AudioStream$AudioStreamException unused) {
                        this.o = true;
                        this.e.start();
                        this.p = System.nanoTime();
                        a();
                    }
                    this.i = true;
                    c();
                }
            } else if (this.i) {
                this.i = false;
                iu0.stop();
            }
        } else if (this.i) {
            this.i = false;
            iu0.stop();
        }
    }
}
