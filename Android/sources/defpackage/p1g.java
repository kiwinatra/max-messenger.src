package defpackage;

import android.graphics.Paint;

/* renamed from: p1g  reason: default package */
public final class p1g extends s1g {
    public cs e;
    public float f;
    public cs g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public Paint.Cap m;
    public Paint.Join n;
    public float o;

    public final boolean a() {
        return this.g.u() || this.e.u();
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(int[] r6) {
        /*
            r5 = this;
            cs r0 = r5.g
            boolean r1 = r0.u()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001e
            java.lang.Object r1 = r0.o
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r6, r4)
            int r4 = r0.b
            if (r1 == r4) goto L_0x001e
            r0.b = r1
            r0 = r3
            goto L_0x001f
        L_0x001e:
            r0 = r2
        L_0x001f:
            cs r5 = r5.e
            boolean r1 = r5.u()
            if (r1 == 0) goto L_0x003a
            java.lang.Object r1 = r5.o
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r6 = r1.getColorForState(r6, r4)
            int r1 = r5.b
            if (r6 == r1) goto L_0x003a
            r5.b = r6
            r2 = r3
        L_0x003a:
            r5 = r0 | r2
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p1g.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.i;
    }

    public int getFillColor() {
        return this.g.b;
    }

    public float getStrokeAlpha() {
        return this.h;
    }

    public int getStrokeColor() {
        return this.e.b;
    }

    public float getStrokeWidth() {
        return this.f;
    }

    public float getTrimPathEnd() {
        return this.k;
    }

    public float getTrimPathOffset() {
        return this.l;
    }

    public float getTrimPathStart() {
        return this.j;
    }

    public void setFillAlpha(float f2) {
        this.i = f2;
    }

    public void setFillColor(int i2) {
        this.g.b = i2;
    }

    public void setStrokeAlpha(float f2) {
        this.h = f2;
    }

    public void setStrokeColor(int i2) {
        this.e.b = i2;
    }

    public void setStrokeWidth(float f2) {
        this.f = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.k = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.l = f2;
    }

    public void setTrimPathStart(float f2) {
        this.j = f2;
    }
}
