package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: ed3  reason: default package */
public final class ed3 {
    public final Context a;
    public final int b;
    public final ArrayList c;
    public hh8 d;
    public x5g e;
    public ea6 f;
    public int g;
    public long h;
    public long i;
    public boolean j;
    public long k;
    public long l;
    public boolean m;
    public long n;
    public t8g o;
    public Executor p;
    public final /* synthetic */ fd3 q;

    public ed3(fd3 fd3, Context context) {
        this.q = fd3;
        this.a = context;
        this.b = v0g.M(context) ? 1 : 5;
        this.c = new ArrayList();
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.o = t8g.u0;
        this.p = fd3.y0;
    }

    public final void a(boolean z) {
        if (c()) {
            gk4 gk4 = (gk4) this.e;
            gy0 gy0 = gk4.e;
            th7 th7 = gk4.d;
            if (th7.k != null) {
                try {
                    gy0.a();
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    q2 q2Var = th7.k;
                    n79.o(q2Var);
                    q2Var.T();
                    dk4 dk4 = new dk4(0, countDownLatch);
                    synchronized (q2Var.b) {
                        q2Var.c = dk4;
                    }
                    vo5 vo5 = gk4.i;
                    Objects.requireNonNull(vo5);
                    gy0.v(new dk4(1, vo5));
                    countDownLatch.await();
                    synchronized (q2Var.b) {
                        q2Var.c = null;
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        this.m = false;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        fd3 fd3 = this.q;
        if (fd3.w0 == 1) {
            fd3.v0++;
            fd3.o.a();
            k7f k7f = fd3.X;
            n79.o(k7f);
            k7f.d(new pr1(19, fd3));
        }
        if (z) {
            y5g y5g = fd3.c;
            f6g f6g = y5g.b;
            f6g.k = 0;
            f6g.n = -1;
            f6g.l = -1;
            y5g.h = -9223372036854775807L;
            y5g.f = -9223372036854775807L;
            y5g.d(1);
            y5g.i = -9223372036854775807L;
        }
    }

    public final void b(ea6 ea6) {
        m53 m53;
        ea6 ea62 = ea6;
        n79.n(!c());
        fd3 fd3 = this.q;
        n79.n(fd3.w0 == 0);
        m53 m532 = ea62.A;
        if (m532 == null || !m532.e()) {
            m532 = m53.h;
        }
        if (m532.c != 7 || v0g.a >= 34) {
            m53 = m532;
        } else {
            k53 a2 = m532.a();
            a2.c = 6;
            m53 = new m53(a2.a, a2.b, a2.c, a2.e, a2.f, a2.d);
        }
        Looper myLooper = Looper.myLooper();
        n79.o(myLooper);
        k7f a3 = fd3.w.a(myLooper, (Handler.Callback) null);
        fd3.X = a3;
        try {
            fd3.Y = fd3.v.a(fd3.a, m53, fd3, new zc3(a3, 0), k0d.v);
            Pair pair = fd3.Z;
            if (pair != null) {
                ode ode = (ode) pair.second;
                fd3.b((Surface) pair.first, ode.a, ode.b);
            }
            fd3.Y.b(0);
            fd3.w0 = 1;
            this.e = fd3.Y.a(0);
        } catch (VideoFrameProcessingException e2) {
            throw new VideoSink$VideoSinkException(e2, ea62);
        }
    }

    public final boolean c() {
        return this.e != null;
    }

    public final void d() {
        if (this.f != null) {
            ArrayList arrayList = new ArrayList();
            hh8 hh8 = this.d;
            if (hh8 != null) {
                arrayList.add(hh8);
            }
            arrayList.addAll(this.c);
            ea6 ea6 = this.f;
            ea6.getClass();
            x5g x5g = this.e;
            n79.o(x5g);
            int i2 = this.g;
            m53 m53 = ea6.A;
            if (m53 == null || !m53.e()) {
                m53 = m53.h;
            }
            m53 m532 = m53;
            gk4 gk4 = (gk4) x5g;
            gk4.c(i2, arrayList, new je6(m532, ea6.t, ea6.u, ea6.x, 0));
            this.k = -9223372036854775807L;
        }
    }

    public final void e(long j2, long j3) {
        try {
            this.q.c(j2, j3);
        } catch (ExoPlaybackException e2) {
            ea6 ea6 = this.f;
            if (ea6 == null) {
                ea6 = new ba6().a();
            }
            throw new VideoSink$VideoSinkException(e2, ea6);
        }
    }

    public final void f(Surface surface, ode ode) {
        fd3 fd3 = this.q;
        Pair pair = fd3.Z;
        if (pair == null || !((Surface) pair.first).equals(surface) || !((ode) fd3.Z.second).equals(ode)) {
            fd3.Z = Pair.create(surface, ode);
            fd3.b(surface, ode.a, ode.b);
        }
    }
}
