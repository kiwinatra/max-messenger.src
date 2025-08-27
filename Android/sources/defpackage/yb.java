package defpackage;

import android.view.View;

/* renamed from: yb  reason: default package */
public final class yb extends p6c {
    public final /* synthetic */ int D0;
    public final Object E0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yb(android.content.Context r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r0.D0 = r2
            switch(r2) {
                case 1: goto L_0x0061;
                case 2: goto L_0x0040;
                default: goto L_0x000b;
            }
        L_0x000b:
            r1e r2 = new r1e
            r3 = 0
            r2.<init>(r1, r3)
            r0.<init>(r2)
            r1 = 64
            long r4 = (long) r1
            int r1 = defpackage.lxa.C
            igf r7 = new igf
            r7.<init>(r1)
            a1e r11 = defpackage.a1e.a
            int r1 = defpackage.cad.f2
            s1e r15 = new s1e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r13 = 0
            r14 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r12 = 0
            r1 = 792(0x318, float:1.11E-42)
            r3 = r15
            r18 = r2
            r2 = r15
            r15 = r1
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.E0 = r2
            r0 = r18
            r0.setModelItem(r2)
            return
        L_0x0040:
            r1e r2 = new r1e
            r3 = 0
            r2.<init>(r1, r3)
            r0.<init>(r2)
            r0.E0 = r2
            r0 = 56
            float r0 = (float) r0
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)
            r2.setMinHeight(r0)
            return
        L_0x0061:
            r1e r2 = new r1e
            r3 = 0
            r2.<init>(r1, r3)
            r0.<init>(r2)
            r1 = 128(0x80, float:1.794E-43)
            long r4 = (long) r1
            int r1 = defpackage.lxa.J
            igf r7 = new igf
            r7.<init>(r1)
            a1e r11 = defpackage.a1e.a
            int r1 = defpackage.cad.f2
            s1e r15 = new s1e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r13 = 0
            r14 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r12 = 0
            r1 = 792(0x318, float:1.11E-42)
            r3 = r15
            r18 = r2
            r2 = r15
            r15 = r1
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.E0 = r2
            r0 = r18
            r0.setModelItem(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb.<init>(android.content.Context, int):void");
    }

    public final void M(lz7 lz7) {
        switch (this.D0) {
            case 0:
                ((r1e) this.a).setModelItem(s1e.h((s1e) this.E0, (ggf) null, new b1e(new mgf(String.valueOf(((d3c) lz7).a)), (Integer) null), 959));
                return;
            case 1:
                ((r1e) this.a).setModelItem(s1e.h((s1e) this.E0, (ggf) null, new b1e(new mgf(String.valueOf(((q3c) lz7).a)), (Integer) null), 959));
                return;
            default:
                rae.w(lz7);
                throw null;
        }
    }

    public final void R(View.OnClickListener onClickListener) {
        switch (this.D0) {
            case 0:
                ct.G(this.a, 300, onClickListener);
                return;
            case 1:
                ct.G(this.a, 300, onClickListener);
                return;
            default:
                ct.G((r1e) this.E0, 300, onClickListener);
                return;
        }
    }

    public void S(View.OnLongClickListener onLongClickListener) {
        switch (this.D0) {
            case 2:
                ((r1e) this.E0).setOnLongClickListener(onLongClickListener);
                return;
            default:
                return;
        }
    }
}
