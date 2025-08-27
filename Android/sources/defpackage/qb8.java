package defpackage;

import android.view.View;

/* renamed from: qb8  reason: default package */
public final class qb8 extends kbe {
    public final /* synthetic */ int D0;
    public final int E0;
    public gpe F0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qb8(android.content.Context r1, defpackage.uoe r2, int r3, int r4) {
        /*
            r0 = this;
            r0.D0 = r4
            switch(r4) {
                case 1: goto L_0x0042;
                default: goto L_0x0005;
            }
        L_0x0005:
            pb8 r4 = new pb8
            r4.<init>(r1)
            r0.<init>(r4)
            float r1 = (float) r3
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r1 = r1 * r3
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            r3 = 350(0x15e, float:4.9E-43)
            int r1 = java.lang.Math.min(r3, r1)
            r0.E0 = r1
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r1, r1)
            r4.setLayoutParams(r3)
            h24 r1 = new h24
            r3 = 14
            r1.<init>((int) r3, (java.lang.Object) r0, (java.lang.Object) r2)
            defpackage.ct.G(r4, 300, r1)
            yb1 r1 = new yb1
            r3 = 9
            r1.<init>(r3, r0, r2)
            r4.setOnLongClickListener(r1)
            return
        L_0x0042:
            hoe r4 = new hoe
            r4.<init>(r1)
            r0.<init>(r4)
            r0.E0 = r3
            if (r3 != 0) goto L_0x0050
            r1 = -2
            goto L_0x0060
        L_0x0050:
            float r1 = (float) r3
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r1 = r1 * r3
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
        L_0x0060:
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r1, r1)
            r4.setLayoutParams(r3)
            kqc r1 = new kqc
            r3 = 15
            r1.<init>((int) r3, (java.lang.Object) r0, (java.lang.Object) r2)
            defpackage.ct.G(r4, 300, r1)
            yb1 r1 = new yb1
            r3 = 12
            r1.<init>(r3, r0, r2)
            r4.setOnLongClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb8.<init>(android.content.Context, uoe, int, int):void");
    }

    public final void M(lz7 lz7) {
        switch (this.D0) {
            case 0:
                if (lz7 instanceof gpe) {
                    gpe gpe = (gpe) lz7;
                    this.F0 = gpe;
                    View view = this.a;
                    ((pb8) view).a(gpe, this.E0);
                    ((pb8) view).setAlpha(gpe.Y ? 0.3f : 1.0f);
                    return;
                }
                return;
            default:
                if (lz7 instanceof gpe) {
                    gpe gpe2 = (gpe) lz7;
                    this.F0 = gpe2;
                    int i = this.E0;
                    View view2 = this.a;
                    if (i == 0) {
                        ((hoe) view2).setSizeConfigurator(new ore(view2));
                    }
                    ((hoe) view2).a(gpe2);
                    ((hoe) view2).setAlpha(gpe2.Y ? 0.3f : 1.0f);
                    return;
                }
                return;
        }
    }

    public final void N(lz7 lz7, Object obj) {
        switch (this.D0) {
            case 0:
                if (!(obj instanceof fpe)) {
                    M(lz7);
                    return;
                } else {
                    ((pb8) this.a).setAlpha(((fpe) obj).a ? 0.3f : 1.0f);
                    return;
                }
            default:
                if (!(obj instanceof fpe)) {
                    M(lz7);
                    return;
                }
                ((hoe) this.a).setAlpha(((fpe) obj).a ? 0.3f : 1.0f);
                return;
        }
    }
}
