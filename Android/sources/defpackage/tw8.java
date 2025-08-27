package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import kotlin.jvm.functions.Function1;

/* renamed from: tw8  reason: default package */
public final class tw8 implements bn8, cn8 {
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public long o;
    public final Object v;
    public Object w;

    public tw8(tj7 tj7) {
        this.a = 0;
        this.v = new Handler(Looper.getMainLooper());
        this.w = tj7;
    }

    public void a(long j) {
        switch (this.a) {
            case 2:
                this.c = j;
                if (this.b) {
                    ((b7f) this.v).getClass();
                    this.o = SystemClock.elapsedRealtime();
                    return;
                }
                return;
            default:
                this.c = j;
                if (this.b) {
                    ((c7f) this.v).getClass();
                    this.o = SystemClock.elapsedRealtime();
                    return;
                }
                return;
        }
    }

    public void b() {
        switch (this.a) {
            case 2:
                if (!this.b) {
                    ((b7f) this.v).getClass();
                    this.o = SystemClock.elapsedRealtime();
                    this.b = true;
                    return;
                }
                return;
            default:
                if (!this.b) {
                    ((c7f) this.v).getClass();
                    this.o = SystemClock.elapsedRealtime();
                    this.b = true;
                    return;
                }
                return;
        }
    }

    public fob c() {
        return (fob) this.w;
    }

    public long e() {
        switch (this.a) {
            case 2:
                long j = this.c;
                if (!this.b) {
                    return j;
                }
                ((b7f) this.v).getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.o;
                fob fob = (fob) this.w;
                return j + (fob.a == 1.0f ? t0g.D(elapsedRealtime) : elapsedRealtime * ((long) fob.c));
            default:
                long j2 = this.c;
                if (!this.b) {
                    return j2;
                }
                ((c7f) this.v).getClass();
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.o;
                gob gob = (gob) this.w;
                return j2 + (gob.a == 1.0f ? v0g.S(elapsedRealtime2) : elapsedRealtime2 * ((long) gob.c));
        }
    }

    public void f(gob gob) {
        if (this.b) {
            a(e());
        }
        this.w = gob;
    }

    public void g(fob fob) {
        if (this.b) {
            a(e());
        }
        this.w = fob;
    }

    /* renamed from: c  reason: collision with other method in class */
    public gob m1534c() {
        return (gob) this.w;
    }

    public tw8(b7f b7f) {
        this.a = 2;
        this.v = b7f;
        this.w = fob.o;
    }

    public tw8(c7f c7f) {
        this.a = 3;
        this.v = c7f;
        this.w = gob.d;
    }

    public tw8(boolean z, long j, long j2, Function1 function1, Function1 function12) {
        this.a = 1;
        this.b = z;
        this.c = j;
        this.o = j2;
        this.v = function1;
        this.w = function12;
    }
}
