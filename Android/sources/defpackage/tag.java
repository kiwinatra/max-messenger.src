package defpackage;

/* renamed from: tag  reason: default package */
public final class tag {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX WARNING: type inference failed for: r5v1, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public tag(android.view.View r8) {
        /*
            r7 = this;
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            r2 = 0
            if (r1 == 0) goto L_0x000c
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            goto L_0x000d
        L_0x000c:
            r0 = r2
        L_0x000d:
            r1 = 0
            if (r0 == 0) goto L_0x0013
            int r0 = r0.leftMargin
            goto L_0x0014
        L_0x0013:
            r0 = r1
        L_0x0014:
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            boolean r4 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r4 == 0) goto L_0x001f
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L_0x0020
        L_0x001f:
            r3 = r2
        L_0x0020:
            if (r3 == 0) goto L_0x0025
            int r3 = r3.topMargin
            goto L_0x0026
        L_0x0025:
            r3 = r1
        L_0x0026:
            android.view.ViewGroup$LayoutParams r4 = r8.getLayoutParams()
            boolean r5 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x0031
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            goto L_0x0032
        L_0x0031:
            r4 = r2
        L_0x0032:
            if (r4 == 0) goto L_0x0037
            int r4 = r4.rightMargin
            goto L_0x0038
        L_0x0037:
            r4 = r1
        L_0x0038:
            android.view.ViewGroup$LayoutParams r5 = r8.getLayoutParams()
            boolean r6 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L_0x0043
            r2 = r5
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            int r2 = r2.bottomMargin
            goto L_0x0049
        L_0x0048:
            r2 = r1
        L_0x0049:
            android.view.ViewGroup$LayoutParams r5 = r8.getLayoutParams()
            boolean r6 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L_0x0058
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r5 = r5.getMarginStart()
            goto L_0x0059
        L_0x0058:
            r5 = r1
        L_0x0059:
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            boolean r6 = r8 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L_0x0067
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            int r1 = r8.getMarginEnd()
        L_0x0067:
            r7.<init>()
            r7.a = r0
            r7.b = r3
            r7.c = r4
            r7.d = r2
            r7.e = r5
            r7.f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tag.<init>(android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.tag) r5;
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
            boolean r1 = r5 instanceof defpackage.tag
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            tag r5 = (defpackage.tag) r5
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tag.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + rae.h(this.e, rae.h(this.d, rae.h(this.c, rae.h(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewMarginState(left=");
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
