package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;

/* renamed from: lsd  reason: default package */
public final class lsd implements bcd {
    public final bcd a;
    public final int b;
    public long c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ msd f;

    public lsd(msd msd, bcd bcd, int i) {
        this.f = msd;
        this.a = bcd;
        this.b = i;
    }

    public final Surface a() {
        return this.a.a();
    }

    public final int c() {
        return this.a.c();
    }

    public final ba4 d() {
        return this.a.d();
    }

    public final void e() {
        msd msd = this.f;
        msd.l.decrementAndGet();
        if (msd.b ? this.e : msd.n == msd.a.size() - 1) {
            this.a.e();
        } else if (msd.l.get() == 0) {
            msd.g.d(new mgd(4, this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f() {
        /*
            r7 = this;
            bcd r0 = r7.a
            ba4 r0 = r0.d()
            defpackage.n79.o(r0)
            long r1 = r7.c
            long r3 = r0.x
            long r1 = r1 + r3
            msd r3 = r7.f
            boolean r4 = r3.b
            r5 = 4
            r6 = 1
            if (r4 == 0) goto L_0x0048
            long r3 = r3.x
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0020
            boolean r1 = r7.d
            if (r1 == 0) goto L_0x0048
        L_0x0020:
            msd r1 = r7.f
            boolean r1 = r1.y
            r2 = 0
            if (r1 == 0) goto L_0x0047
            boolean r1 = r7.d
            if (r1 != 0) goto L_0x0047
            java.nio.ByteBuffer r1 = r0.v
            r1.getClass()
            r1.limit(r2)
            r0.b = r5
            bcd r0 = r7.a
            boolean r0 = r0.f()
            defpackage.n79.n(r0)
            r7.d = r6
            msd r7 = r7.f
            java.util.concurrent.atomic.AtomicInteger r7 = r7.l
            r7.decrementAndGet()
        L_0x0047:
            return r2
        L_0x0048:
            boolean r1 = r0.h(r5)
            if (r1 == 0) goto L_0x009f
            msd r1 = r7.f
            java.util.concurrent.atomic.AtomicInteger r1 = r1.l
            r1.decrementAndGet()
            msd r1 = r7.f
            int r2 = r1.n
            tb7 r1 = r1.a
            int r1 = r1.size()
            int r1 = r1 - r6
            if (r2 < r1) goto L_0x0068
            msd r1 = r7.f
            boolean r1 = r1.b
            if (r1 == 0) goto L_0x009f
        L_0x0068:
            int r1 = r7.b
            if (r1 != r6) goto L_0x0080
            msd r1 = r7.f
            boolean r2 = r1.b
            if (r2 != 0) goto L_0x0080
            boolean r1 = r1.q
            if (r1 == 0) goto L_0x0080
            bcd r0 = r7.a
            boolean r0 = r0.f()
            defpackage.n79.n(r0)
            goto L_0x0087
        L_0x0080:
            r0.z()
            r1 = 0
            r0.x = r1
        L_0x0087:
            msd r0 = r7.f
            java.util.concurrent.atomic.AtomicInteger r0 = r0.l
            int r0 = r0.get()
            if (r0 != 0) goto L_0x009e
            msd r0 = r7.f
            k7f r0 = r0.g
            mgd r1 = new mgd
            r2 = 4
            r1.<init>(r2, r7)
            r0.d(r1)
        L_0x009e:
            return r6
        L_0x009f:
            bcd r7 = r7.a
            boolean r7 = r7.f()
            defpackage.n79.n(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lsd.f():boolean");
    }

    public final int g(Bitmap bitmap, skf skf) {
        if (this.f.b) {
            long j = -9223372036854775807L;
            while (true) {
                if (!skf.hasNext()) {
                    break;
                }
                long next = skf.next();
                if (this.c + next <= this.f.x) {
                    j = next;
                } else if (!this.f.y) {
                    return 2;
                } else {
                    if (j != -9223372036854775807L) {
                        a94 a94 = new a94(skf.a(), j);
                        this.e = true;
                        skf = a94;
                    } else if (this.e) {
                        return 2;
                    } else {
                        this.e = true;
                        e();
                        return 3;
                    }
                }
            }
        }
        return this.a.g(bitmap, skf.a());
    }

    public final boolean h(long j) {
        long j2 = this.c + j;
        msd msd = this.f;
        if (!msd.b || j2 < msd.x) {
            return this.a.h(j);
        }
        if (!this.f.y || this.e) {
            return false;
        }
        this.e = true;
        e();
        return false;
    }
}
