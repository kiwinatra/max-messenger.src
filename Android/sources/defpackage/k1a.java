package defpackage;

import android.os.Bundle;
import ru.ok.messages.views.dialogs.FrgDlgSendingFile;

/* renamed from: k1a  reason: default package */
public final class k1a extends w1 {
    public final ni3 b;
    public final i1a c;
    public final e4 o;
    public final sv0 v;
    public final h48 w;
    public final jk3 x = null;

    public k1a(i1a i1a, jd8 jd8, ni3 ni3, e4 e4Var, h48 h48) {
        this.b = ni3;
        this.c = i1a;
        this.o = e4Var;
        this.v = jd8;
        this.w = h48;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean W() {
        /*
            r6 = this;
            boolean r0 = r6.U()
            r1 = 0
            if (r0 == 0) goto L_0x0089
            f2a r0 = r6.a
            i3a r0 = (defpackage.i3a) r0
            boolean r2 = r0.c0()
            if (r2 != 0) goto L_0x0013
        L_0x0011:
            r5 = r1
            goto L_0x006e
        L_0x0013:
            g5b r2 = r0.x0
            boolean r2 = r2.a
            if (r2 != 0) goto L_0x001a
            goto L_0x0011
        L_0x001a:
            ok8 r0 = r0.w0
            b4a r2 = r0.x0
            int r3 = r2.Z0
            r4 = 3
            r5 = 1
            if (r3 != r4) goto L_0x002e
            r2.C0 = r5
            r2.n0()
            r2.k0(r1)
        L_0x002c:
            r2 = r5
            goto L_0x005b
        L_0x002e:
            boolean r3 = r2.Z()
            if (r3 == 0) goto L_0x005a
            java.lang.String r3 = "b4a"
            java.lang.String r4 = "closeFullScreenMode"
            defpackage.z68.a(r3, r4)
            java.lang.Object r2 = r2.a
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0043:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x002c
            java.lang.Object r3 = r2.next()
            v1a r3 = (defpackage.v1a) r3
            r3.W()
            q1a r3 = r3.b
            ok8 r3 = (defpackage.ok8) r3
            r3.w(r5)
            goto L_0x0043
        L_0x005a:
            r2 = r1
        L_0x005b:
            if (r2 == 0) goto L_0x005e
            goto L_0x006e
        L_0x005e:
            ru.ok.messages.actions.ExtraActionsView r2 = r0.O0
            int r3 = r2.getVisibility()
            r4 = 0
            if (r3 != 0) goto L_0x006b
            r2.l(r4, r5)
            goto L_0x006e
        L_0x006b:
            r0.l(r4, r5)
        L_0x006e:
            if (r5 == 0) goto L_0x0088
            f2a r0 = r6.a
            i3a r0 = (defpackage.i3a) r0
            boolean r2 = r0.c0()
            if (r2 != 0) goto L_0x007b
            goto L_0x007f
        L_0x007b:
            g5b r0 = r0.x0
            boolean r1 = r0.a
        L_0x007f:
            if (r1 != 0) goto L_0x0088
            h48 r6 = r6.w
            sqd r6 = r6.f
            r6.a()
        L_0x0088:
            return r5
        L_0x0089:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1a.W():boolean");
    }

    public final void X() {
        z68.a("k1a", "startPickFile");
        n99 n99 = this.c.a.b;
        n99.getClass();
        Bundle g = wj6.g(((qra) ym.e()).s().f.c(), "ru.ok.tamtam.extra.CHECKED_COUNT");
        FrgDlgSendingFile frgDlgSendingFile = new FrgDlgSendingFile();
        frgDlgSendingFile.L2(g);
        frgDlgSendingFile.d3(n99.w);
    }

    public final void Y() {
        jk3 jk3;
        if (this.a != null && (jk3 = this.x) != null) {
            jbd.b(new h5(14, jk3), xfd.a(), new td8(25, this), new q0a(12), qe.a());
        }
    }

    @oye
    public void onEvent(i48 i48) {
    }

    @oye
    public void onEvent(e48 e48) {
    }
}
