package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: bge  reason: default package */
public final class bge extends ReplacementSpan {
    public final int a;

    public bge(int i) {
        this.a = i;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r4 = ((defpackage.bge) r4).a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4 instanceof defpackage.bge
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            bge r4 = (defpackage.bge) r4
            int r4 = r4.a
            int r3 = r3.a
            if (r3 == r4) goto L_0x0013
            return r2
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bge.equals(java.lang.Object):boolean");
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return this.a;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.a) * 31) + bge.class.hashCode();
    }
}
