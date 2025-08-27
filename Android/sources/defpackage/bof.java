package defpackage;

import java.util.concurrent.Executor;

/* renamed from: bof  reason: default package */
public final class bof {
    public final lr1 a;
    public final fz9 b = new u08(0);
    public final boolean c;
    public final Executor d;
    public boolean e;
    public do1 f;
    public boolean g;

    /* JADX WARNING: type inference failed for: r3v2, types: [fz9, u08] */
    public bof(lr1 lr1, qt1 qt1, tsd tsd) {
        this.a = lr1;
        this.d = tsd;
        this.c = b0h.E(new d9d(26, qt1));
        lr1.p(new aof(this));
    }

    public static void b(fz9 fz9, Integer num) {
        if (ev0.s()) {
            fz9.k(num);
        } else {
            fz9.i(num);
        }
    }

    public final void a(do1 do1, boolean z) {
        if (this.c) {
            boolean z2 = this.e;
            fz9 fz9 = this.b;
            if (!z2) {
                b(fz9, 0);
                if (do1 != null) {
                    do1.d(new Exception("Camera is not active."));
                    return;
                }
                return;
            }
            this.g = z;
            this.a.r(z);
            b(fz9, Integer.valueOf(z ? 1 : 0));
            do1 do12 = this.f;
            if (do12 != null) {
                do12.d(new Exception("There is a new enableTorch being set"));
            }
            this.f = do1;
        } else if (do1 != null) {
            do1.d(new IllegalStateException("No flash unit"));
        }
    }
}
