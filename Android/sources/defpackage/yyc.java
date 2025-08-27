package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yyc  reason: default package */
public abstract class yyc {
    public yu9 a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static int e(pzc pzc) {
        int i = pzc.X;
        int i2 = i & 14;
        if (pzc.z()) {
            return 4;
        }
        if ((i & 4) != 0) {
            return i2;
        }
        int i3 = pzc.o;
        int p = pzc.p();
        return (i3 == -1 || p == -1 || i3 == p) ? i2 : i2 | 2048;
    }

    public abstract boolean a(pzc pzc, ft ftVar, ft ftVar2);

    public abstract boolean b(pzc pzc, pzc pzc2, ft ftVar, ft ftVar2);

    public abstract boolean c(pzc pzc, ft ftVar, ft ftVar2);

    public abstract boolean d(pzc pzc, ft ftVar, ft ftVar2);

    public abstract boolean f(pzc pzc, List list);

    public void g(pzc pzc) {
        h(pzc);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(defpackage.pzc r9) {
        /*
            r8 = this;
            yu9 r8 = r8.a
            if (r8 == 0) goto L_0x00a6
            r0 = 1
            r9.J(r0)
            pzc r1 = r9.y
            r2 = 0
            if (r1 == 0) goto L_0x0013
            pzc r1 = r9.z
            if (r1 != 0) goto L_0x0013
            r9.y = r2
        L_0x0013:
            r9.z = r2
            int r1 = r9.X
            r1 = r1 & 16
            if (r1 == 0) goto L_0x001d
            goto L_0x00a6
        L_0x001d:
            java.lang.Object r8 = r8.b
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            r8.E0()
            mqf r1 = r8.w
            java.lang.Object r2 = r1.v
            jz2 r2 = (defpackage.jz2) r2
            java.lang.Object r3 = r1.o
            u6h r3 = (defpackage.u6h) r3
            int r4 = r1.b
            r5 = 0
            android.view.View r6 = r9.a
            if (r4 != r0) goto L_0x0045
            java.lang.Object r0 = r1.c
            android.view.View r0 = (android.view.View) r0
            if (r0 != r6) goto L_0x003d
        L_0x003b:
            r0 = r5
            goto L_0x0070
        L_0x003d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r8.<init>(r9)
            throw r8
        L_0x0045:
            r7 = 2
            if (r4 == r7) goto L_0x009e
            r1.b = r7     // Catch:{ all -> 0x005b }
            java.lang.Object r4 = r3.b     // Catch:{ all -> 0x005b }
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4     // Catch:{ all -> 0x005b }
            int r4 = r4.indexOfChild(r6)     // Catch:{ all -> 0x005b }
            r7 = -1
            if (r4 != r7) goto L_0x005d
            r1.a0(r6)     // Catch:{ all -> 0x005b }
        L_0x0058:
            r1.b = r5
            goto L_0x0070
        L_0x005b:
            r8 = move-exception
            goto L_0x009b
        L_0x005d:
            boolean r7 = r2.S(r4)     // Catch:{ all -> 0x005b }
            if (r7 == 0) goto L_0x006d
            r2.Z(r4)     // Catch:{ all -> 0x005b }
            r1.a0(r6)     // Catch:{ all -> 0x005b }
            r3.q(r4)     // Catch:{ all -> 0x005b }
            goto L_0x0058
        L_0x006d:
            r1.b = r5
            goto L_0x003b
        L_0x0070:
            if (r0 == 0) goto L_0x008a
            pzc r1 = androidx.recyclerview.widget.RecyclerView.V(r6)
            hzc r2 = r8.c
            r2.k(r1)
            hzc r2 = r8.c
            r2.h(r1)
            boolean r1 = androidx.recyclerview.widget.RecyclerView.K1
            if (r1 == 0) goto L_0x008a
            java.util.Objects.toString(r6)
            r8.toString()
        L_0x008a:
            r1 = r0 ^ 1
            r8.F0(r1)
            if (r0 != 0) goto L_0x00a6
            boolean r9 = r9.E()
            if (r9 == 0) goto L_0x00a6
            r8.removeDetachedView(r6, r5)
            goto L_0x00a6
        L_0x009b:
            r1.b = r5
            throw r8
        L_0x009e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r8.<init>(r9)
            throw r8
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yyc.h(pzc):void");
    }

    public final void i() {
        ArrayList arrayList = this.b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            rae.w(arrayList.get(0));
            throw null;
        }
    }

    public abstract void j(pzc pzc);

    public abstract void k();

    public long l() {
        return this.f;
    }

    public long m() {
        return this.e;
    }

    public abstract boolean n();

    public ft o(lzc lzc, pzc pzc, int i, List list) {
        ft ftVar = new ft(7);
        View view = pzc.a;
        ftVar.b = view.getLeft();
        ftVar.c = view.getTop();
        view.getRight();
        view.getBottom();
        return ftVar;
    }

    public abstract void p();
}
