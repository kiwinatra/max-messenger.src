package defpackage;

import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: cj9  reason: default package */
public final class cj9 {
    public final sv0 a;
    public final long b;
    public final n6e c;
    public final jx3 d;
    public final dtc e;

    public cj9(long j, sv0 sv0, gaf gaf) {
        this.a = sv0;
        this.b = j;
        n6e b2 = m5a.b(0, 0, (cu0) null, 7);
        this.c = b2;
        this.d = e14.a(((osa) gaf).c().t0());
        sv0.d(this);
        this.e = new dtc(b2);
    }

    @oye
    public final void onEvent(ke7 ke7) {
        if (ke7.b == this.b) {
            ev0.v(this.d, (CoroutineContext) null, (f14) null, new bj9(this, new za9(SetsKt.setOf(Long.valueOf(ke7.c)), false), (Continuation) null), 3);
        }
    }

    @oye
    public final void onEvent(w5b w5b) {
        if (w5b.b == this.b) {
            ev0.v(this.d, (CoroutineContext) null, (f14) null, new bj9(this, new za9(SetsKt.setOf(Long.valueOf(w5b.o)), true), (Continuation) null), 3);
        }
    }

    @oye
    public final void onEvent(twf twf) {
        if (twf.b == this.b) {
            ev0.v(this.d, (CoroutineContext) null, (f14) null, new bj9(this, new eb9(SetsKt.setOf(Long.valueOf(twf.c))), (Continuation) null), 3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @defpackage.oye
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onEvent(defpackage.kv9 r7) {
        /*
            r6 = this;
            long r0 = r7.b
            long r2 = r6.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            long r0 = r7.c
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 0
            if (r2 < 0) goto L_0x001e
            long r4 = r7.o
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x001e
            db9 r7 = new db9
            r7.<init>(r0, r4)
            goto L_0x0032
        L_0x001e:
            java.util.List r7 = r7.v
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0031
            cb9 r0 = new cb9
            r0.<init>(r7)
            r7 = r0
            goto L_0x0032
        L_0x0031:
            r7 = r3
        L_0x0032:
            if (r7 == 0) goto L_0x003f
            bj9 r0 = new bj9
            r0.<init>(r6, r7, r3)
            r7 = 3
            jx3 r6 = r6.d
            defpackage.ev0.v(r6, r3, r3, r0, r7)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj9.onEvent(kv9):void");
    }

    @oye
    public final void onEvent(w88 w88) {
        if (w88.v.contains(Long.valueOf(this.b))) {
            ev0.v(this.d, (CoroutineContext) null, (f14) null, new bj9(this, bb9.a, (Continuation) null), 3);
        }
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, fb9] */
    @oye
    public final void onEvent(xy2 xy2) {
        if (xy2.b.contains(Long.valueOf(this.b))) {
            ev0.v(this.d, (CoroutineContext) null, (f14) null, new bj9(this, new Object(), (Continuation) null), 3);
        }
    }
}
