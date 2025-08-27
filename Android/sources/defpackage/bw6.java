package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.time.DurationKt;

/* renamed from: bw6  reason: default package */
public final class bw6 extends gc8 implements vk4 {
    public final Handler b;
    public final String c;
    public final boolean o;
    public final bw6 v;

    public bw6(Handler handler, String str, boolean z) {
        bw6 bw6;
        this.b = handler;
        this.c = str;
        this.o = z;
        if (z) {
            bw6 = this;
        } else {
            bw6 = new bw6(handler, str, true);
        }
        this.v = bw6;
    }

    public final pq4 U(long j, Runnable runnable, CoroutineContext coroutineContext) {
        if (this.b.postDelayed(runnable, RangesKt.coerceAtMost(j, (long) DurationKt.MAX_MILLIS))) {
            return new aw6(this, runnable);
        }
        u0(coroutineContext, runnable);
        return jaa.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bw6) {
            bw6 bw6 = (bw6) obj;
            return bw6.b == this.b && bw6.o == this.o;
        }
    }

    public final int hashCode() {
        return (this.o ? 1231 : 1237) ^ System.identityHashCode(this.b);
    }

    public final void o(long j, lw1 lw1) {
        uj6 uj6 = new uj6(9, lw1, this);
        if (this.b.postDelayed(uj6, RangesKt.coerceAtMost(j, (long) DurationKt.MAX_MILLIS))) {
            lw1.k(new wk(17, this, uj6));
        } else {
            u0(lw1.v, uj6);
        }
    }

    public final void p0(CoroutineContext coroutineContext, Runnable runnable) {
        if (!this.b.post(runnable)) {
            u0(coroutineContext, runnable);
        }
    }

    public final boolean r0(CoroutineContext coroutineContext) {
        return !this.o || !Intrinsics.areEqual((Object) Looper.myLooper(), (Object) this.b.getLooper());
    }

    public final gc8 t0() {
        return this.v;
    }

    public final String toString() {
        String str;
        gc8 gc8;
        bi4 bi4 = dq4.a;
        gc8 gc82 = lc8.a;
        if (this == gc82) {
            str = "Dispatchers.Main";
        } else {
            try {
                gc8 = gc82.t0();
            } catch (UnsupportedOperationException unused) {
                gc8 = null;
            }
            str = this == gc8 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.c;
        if (str2 == null) {
            str2 = this.b.toString();
        }
        return this.o ? tr1.j(str2, ".immediate") : str2;
    }

    public final void u0(CoroutineContext coroutineContext, Runnable runnable) {
        kv0.n(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        dq4.c.p0(coroutineContext, runnable);
    }

    public bw6(Handler handler) {
        this(handler, (String) null, false);
    }
}
