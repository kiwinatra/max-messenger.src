package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* renamed from: dz8  reason: default package */
public final class dz8 implements bx8 {
    public final c67 a;

    public dz8(c67 c67) {
        this.a = c67;
    }

    public final void b(int i) {
        this.a.b(i);
    }

    public final void d(int i, ppb ppb, pob pob, boolean z, boolean z2, int i2) {
        Bundle bundle;
        boolean z3 = false;
        n79.n(i2 != 0);
        boolean z4 = z || !pob.a(17);
        if (z2 || !pob.a(30)) {
            z3 = true;
        }
        c67 c67 = this.a;
        if (i2 >= 2) {
            ppb q = ppb.q(pob, z, z2);
            if (c67 instanceof wp8) {
                bundle = new Bundle();
                bundle.putBinder(ppb.l0, new opb(q));
            } else {
                bundle = q.t(i2);
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean(npb.d, z4);
            bundle2.putBoolean(npb.e, z3);
            c67.H(i, bundle, bundle2);
            return;
        }
        c67.r0(i, ppb.q(pob, z, true).t(i2), z4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0063, code lost:
        if (r2 != 4) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(int r8, defpackage.zt7 r9) {
        /*
            r7 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = defpackage.zt7.g
            int r2 = r9.a
            r0.putInt(r1, r2)
            java.lang.String r1 = defpackage.zt7.h
            long r2 = r9.b
            r0.putLong(r1, r2)
            ds8 r1 = r9.e
            if (r1 == 0) goto L_0x003d
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = defpackage.ds8.e
            android.os.Bundle r4 = r1.a
            r2.putBundle(r3, r4)
            java.lang.String r3 = defpackage.ds8.f
            boolean r4 = r1.b
            r2.putBoolean(r3, r4)
            java.lang.String r3 = defpackage.ds8.g
            boolean r4 = r1.c
            r2.putBoolean(r3, r4)
            java.lang.String r3 = defpackage.ds8.h
            boolean r1 = r1.d
            r2.putBoolean(r3, r1)
            java.lang.String r1 = defpackage.zt7.i
            r0.putBundle(r1, r2)
        L_0x003d:
            iwd r1 = r9.f
            if (r1 == 0) goto L_0x004a
            android.os.Bundle r1 = r1.b()
            java.lang.String r2 = defpackage.zt7.l
            r0.putBundle(r2, r1)
        L_0x004a:
            java.lang.String r1 = defpackage.zt7.k
            int r2 = r9.d
            r0.putInt(r1, r2)
            java.lang.Object r9 = r9.c
            if (r9 != 0) goto L_0x0056
            goto L_0x0099
        L_0x0056:
            r1 = 1
            if (r2 == r1) goto L_0x009f
            java.lang.String r1 = defpackage.zt7.j
            r3 = 2
            r4 = 0
            if (r2 == r3) goto L_0x0090
            r3 = 3
            if (r2 == r3) goto L_0x0066
            r9 = 4
            if (r2 == r9) goto L_0x009f
            goto L_0x0099
        L_0x0066:
            gv0 r2 = new gv0
            tb7 r9 = (defpackage.tb7) r9
            qb7 r3 = defpackage.tb7.o()
            r5 = r4
        L_0x006f:
            int r6 = r9.size()
            if (r5 >= r6) goto L_0x0085
            java.lang.Object r6 = r9.get(r5)
            ir8 r6 = (defpackage.ir8) r6
            android.os.Bundle r6 = r6.d(r4)
            r3.a(r6)
            int r5 = r5 + 1
            goto L_0x006f
        L_0x0085:
            k0d r9 = r3.j()
            r2.<init>(r9)
            r0.putBinder(r1, r2)
            goto L_0x0099
        L_0x0090:
            ir8 r9 = (defpackage.ir8) r9
            android.os.Bundle r9 = r9.d(r4)
            r0.putBundle(r1, r9)
        L_0x0099:
            c67 r7 = r7.a
            r7.M(r8, r0)
            return
        L_0x009f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz8.e(int, zt7):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != dz8.class) {
            return false;
        }
        return v0g.a(this.a.asBinder(), ((dz8) obj).a.asBinder());
    }

    public final void h(int i, pob pob) {
        this.a.A(i, pob.f());
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a.asBinder()});
    }

    public final void i(int i, swd swd) {
        this.a.G0(i, swd.b());
    }

    public final void j(int i, qwd qwd, boolean z, boolean z2, int i2) {
        this.a.D(i, qwd.a(z, z2).c(i2));
    }

    public final void onDisconnected() {
        this.a.d(0);
    }
}
