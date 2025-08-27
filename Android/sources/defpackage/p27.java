package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.math.MathKt;

/* renamed from: p27  reason: default package */
public final class p27 extends ew7 {
    public final RecyclerView p;
    public final int q;
    public final int r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p27(RecyclerView recyclerView, int i) {
        super(recyclerView.getContext());
        int roundToInt = MathKt.roundToInt(((float) 60) * recyclerView.getContext().getResources().getDisplayMetrics().density);
        this.p = recyclerView;
        this.q = roundToInt;
        this.r = MathKt.roundToInt(((float) 40) * recyclerView.getContext().getResources().getDisplayMetrics().density);
        this.a = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(android.view.View r5, defpackage.cb4 r6) {
        /*
            r4 = this;
            android.graphics.PointF r0 = r4.j
            if (r0 == 0) goto L_0x0012
            float r0 = r0.x
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            if (r0 <= 0) goto L_0x0010
            r0 = 1
            goto L_0x0013
        L_0x0010:
            r0 = -1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            int r0 = r4.b(r5, r0)
            int r1 = r4.q
            if (r0 > 0) goto L_0x003a
            int r2 = r4.r
            if (r0 != 0) goto L_0x0027
            int r3 = r5.getLeft()
            int r3 = r3 - r2
            if (r3 >= 0) goto L_0x0027
            goto L_0x003a
        L_0x0027:
            if (r0 < 0) goto L_0x0038
            if (r0 != 0) goto L_0x003b
            int r3 = r5.getRight()
            int r3 = r3 + r2
            androidx.recyclerview.widget.RecyclerView r2 = r4.p
            int r2 = r2.getMeasuredWidth()
            if (r3 <= r2) goto L_0x003b
        L_0x0038:
            int r0 = r0 - r1
            goto L_0x003b
        L_0x003a:
            int r0 = r0 + r1
        L_0x003b:
            int r1 = r4.h()
            int r5 = r4.c(r5, r1)
            int r1 = r0 * r0
            int r2 = r5 * r5
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            r2 = 180(0xb4, float:2.52E-43)
            int r1 = r4.e(r1)
            int r1 = java.lang.Math.max(r2, r1)
            if (r1 <= 0) goto L_0x0061
            int r0 = -r0
            int r5 = -r5
            android.view.animation.DecelerateInterpolator r4 = r4.i
            r6.d(r0, r5, r1, r4)
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p27.j(android.view.View, cb4):void");
    }
}
