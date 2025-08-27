package defpackage;

import kotlin.collections.ArrayDeque;

/* renamed from: a95  reason: default package */
public abstract class a95 extends q04 {
    public static final /* synthetic */ int v = 0;
    public long b;
    public boolean c;
    public ArrayDeque o;

    public void A0(long j, x85 x85) {
        ef4.z.F0(j, x85);
    }

    public final q04 s0(int i, String str) {
        y7e.f(i);
        return str != null ? new i5a(this, str) : this;
    }

    public abstract void shutdown();

    public final void t0(boolean z) {
        long j = this.b - (z ? 4294967296L : 1);
        this.b = j;
        if (j <= 0 && this.c) {
            shutdown();
        }
    }

    public final void u0(bq4 bq4) {
        ArrayDeque arrayDeque = this.o;
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            this.o = arrayDeque;
        }
        arrayDeque.addLast(bq4);
    }

    public abstract Thread v0();

    public final void w0(boolean z) {
        this.b = (z ? 4294967296L : 1) + this.b;
        if (!z) {
            this.c = true;
        }
    }

    public final boolean x0() {
        return this.b >= 4294967296L;
    }

    public abstract long y0();

    public final boolean z0() {
        bq4 bq4;
        ArrayDeque arrayDeque = this.o;
        if (arrayDeque == null || (bq4 = (bq4) arrayDeque.removeFirstOrNull()) == null) {
            return false;
        }
        bq4.run();
        return true;
    }
}
