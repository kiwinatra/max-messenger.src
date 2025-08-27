package defpackage;

import android.view.View;

/* renamed from: mbg  reason: default package */
public final class mbg {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public mbg(View view) {
        int paddingLeft = view.getPaddingLeft();
        int paddingTop = view.getPaddingTop();
        int paddingRight = view.getPaddingRight();
        int paddingBottom = view.getPaddingBottom();
        int paddingStart = view.getPaddingStart();
        int paddingEnd = view.getPaddingEnd();
        this.a = paddingLeft;
        this.b = paddingTop;
        this.c = paddingRight;
        this.d = paddingBottom;
        this.e = paddingStart;
        this.f = paddingEnd;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.mbg) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.mbg
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            mbg r5 = (defpackage.mbg) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            int r1 = r4.c
            int r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            int r1 = r4.d
            int r3 = r5.d
            if (r1 == r3) goto L_0x0028
            return r2
        L_0x0028:
            int r1 = r4.e
            int r3 = r5.e
            if (r1 == r3) goto L_0x002f
            return r2
        L_0x002f:
            int r4 = r4.f
            int r5 = r5.f
            if (r4 == r5) goto L_0x0036
            return r2
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mbg.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + rae.h(this.e, rae.h(this.d, rae.h(this.c, rae.h(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewPaddingState(left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        sb.append(this.d);
        sb.append(", start=");
        sb.append(this.e);
        sb.append(", end=");
        return wj6.l(sb, this.f, ")");
    }
}
