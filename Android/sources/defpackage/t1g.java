package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import kotlin.KotlinVersion;

/* renamed from: t1g  reason: default package */
public final class t1g {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final q1g g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final ts o;

    /* JADX WARNING: type inference failed for: r0v4, types: [qae, ts] */
    public t1g() {
        this.c = new Matrix();
        this.h = c44.DEFAULT_ASPECT_RATIO;
        this.i = c44.DEFAULT_ASPECT_RATIO;
        this.j = c44.DEFAULT_ASPECT_RATIO;
        this.k = c44.DEFAULT_ASPECT_RATIO;
        this.l = KotlinVersion.MAX_COMPONENT_VALUE;
        this.m = null;
        this.n = null;
        this.o = new qae();
        this.g = new q1g();
        this.a = new Path();
        this.b = new Path();
    }

    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e6, code lost:
        if (r0.k != 1.0f) goto L_0x00eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.q1g r19, android.graphics.Matrix r20, android.graphics.Canvas r21, int r22, int r23) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = r21
            r9 = 1
            android.graphics.Matrix r0 = r7.a
            r1 = r20
            r0.set(r1)
            android.graphics.Matrix r10 = r7.a
            android.graphics.Matrix r0 = r7.j
            r10.preConcat(r0)
            r21.save()
            r11 = 0
            r12 = r11
        L_0x001a:
            java.util.ArrayList r0 = r7.b
            int r1 = r0.size()
            if (r12 >= r1) goto L_0x021e
            java.lang.Object r0 = r0.get(r12)
            r1g r0 = (defpackage.r1g) r0
            boolean r1 = r0 instanceof defpackage.q1g
            if (r1 == 0) goto L_0x0042
            r1 = r0
            q1g r1 = (defpackage.q1g) r1
            r0 = r18
            r2 = r10
            r3 = r21
            r4 = r22
            r5 = r23
            r0.a(r1, r2, r3, r4, r5)
            r1 = r22
            r0 = r9
            r17 = r10
            goto L_0x0217
        L_0x0042:
            boolean r1 = r0 instanceof defpackage.s1g
            if (r1 == 0) goto L_0x0212
            s1g r0 = (defpackage.s1g) r0
            r1 = r22
            float r2 = (float) r1
            float r3 = r6.j
            float r2 = r2 / r3
            r3 = r23
            float r4 = (float) r3
            float r5 = r6.k
            float r4 = r4 / r5
            float r5 = java.lang.Math.min(r2, r4)
            android.graphics.Matrix r13 = r6.c
            r13.set(r10)
            r13.postScale(r2, r4)
            r14 = 4
            float[] r14 = new float[r14]
            r14 = {0, 1065353216, 1065353216, 0} // fill-array
            r10.mapVectors(r14)
            r15 = r14[r11]
            r20 = r5
            double r4 = (double) r15
            r15 = r14[r9]
            double r2 = (double) r15
            double r2 = java.lang.Math.hypot(r4, r2)
            float r2 = (float) r2
            r3 = 2
            r4 = r14[r3]
            double r4 = (double) r4
            r15 = 3
            r3 = r14[r15]
            r17 = r10
            double r9 = (double) r3
            double r3 = java.lang.Math.hypot(r4, r9)
            float r3 = (float) r3
            r4 = r14[r11]
            r5 = 1
            r9 = r14[r5]
            r5 = 2
            r5 = r14[r5]
            r10 = r14[r15]
            float r4 = r4 * r10
            float r9 = r9 * r5
            float r4 = r4 - r9
            float r2 = java.lang.Math.max(r2, r3)
            r16 = 0
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a3
            float r3 = java.lang.Math.abs(r4)
            float r2 = r3 / r2
            goto L_0x00a5
        L_0x00a3:
            r2 = r16
        L_0x00a5:
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 != 0) goto L_0x00ab
            goto L_0x0210
        L_0x00ab:
            android.graphics.Path r3 = r6.a
            r0.getClass()
            r3.reset()
            lab[] r4 = r0.a
            if (r4 == 0) goto L_0x00ba
            defpackage.b59.L(r4, r3)
        L_0x00ba:
            android.graphics.Path r4 = r6.b
            r4.reset()
            boolean r5 = r0 instanceof defpackage.o1g
            if (r5 == 0) goto L_0x00d7
            int r0 = r0.c
            if (r0 != 0) goto L_0x00ca
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            goto L_0x00cc
        L_0x00ca:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
        L_0x00cc:
            r4.setFillType(r0)
            r4.addPath(r3, r13)
            r8.clipPath(r4)
            goto L_0x0210
        L_0x00d7:
            p1g r0 = (defpackage.p1g) r0
            float r5 = r0.j
            r9 = 0
            int r10 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r10 != 0) goto L_0x00e9
            float r9 = r0.k
            r10 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x0129
            goto L_0x00eb
        L_0x00e9:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x00eb:
            float r9 = r0.l
            float r5 = r5 + r9
            float r5 = r5 % r10
            float r14 = r0.k
            float r14 = r14 + r9
            float r14 = r14 % r10
            android.graphics.PathMeasure r9 = r6.f
            if (r9 != 0) goto L_0x00fe
            android.graphics.PathMeasure r9 = new android.graphics.PathMeasure
            r9.<init>()
            r6.f = r9
        L_0x00fe:
            android.graphics.PathMeasure r9 = r6.f
            r9.setPath(r3, r11)
            android.graphics.PathMeasure r9 = r6.f
            float r9 = r9.getLength()
            float r5 = r5 * r9
            float r14 = r14 * r9
            r3.reset()
            int r10 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x011f
            android.graphics.PathMeasure r10 = r6.f
            r15 = 1
            r10.getSegment(r5, r9, r3, r15)
            android.graphics.PathMeasure r5 = r6.f
            r9 = 0
            r5.getSegment(r9, r14, r3, r15)
            goto L_0x0126
        L_0x011f:
            r9 = 0
            r15 = 1
            android.graphics.PathMeasure r10 = r6.f
            r10.getSegment(r5, r14, r3, r15)
        L_0x0126:
            r3.rLineTo(r9, r9)
        L_0x0129:
            r4.addPath(r3, r13)
            cs r3 = r0.g
            java.lang.Object r5 = r3.c
            android.graphics.Shader r5 = (android.graphics.Shader) r5
            if (r5 == 0) goto L_0x0135
            goto L_0x0139
        L_0x0135:
            int r5 = r3.b
            if (r5 == 0) goto L_0x013b
        L_0x0139:
            r5 = 1
            goto L_0x013c
        L_0x013b:
            r5 = r11
        L_0x013c:
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r10 = 0
            r14 = 255(0xff, float:3.57E-43)
            r15 = 1132396544(0x437f0000, float:255.0)
            if (r5 == 0) goto L_0x019c
            android.graphics.Paint r5 = r6.e
            if (r5 != 0) goto L_0x0157
            android.graphics.Paint r5 = new android.graphics.Paint
            r11 = 1
            r5.<init>(r11)
            r6.e = r5
            android.graphics.Paint$Style r11 = android.graphics.Paint.Style.FILL
            r5.setStyle(r11)
        L_0x0157:
            android.graphics.Paint r5 = r6.e
            java.lang.Object r11 = r3.c
            android.graphics.Shader r11 = (android.graphics.Shader) r11
            if (r11 == 0) goto L_0x0170
            r11.setLocalMatrix(r13)
            r5.setShader(r11)
            float r3 = r0.i
            float r3 = r3 * r15
            int r3 = java.lang.Math.round(r3)
            r5.setAlpha(r3)
            goto L_0x018a
        L_0x0170:
            r5.setShader(r10)
            r5.setAlpha(r14)
            int r3 = r3.b
            float r11 = r0.i
            android.graphics.PorterDuff$Mode r16 = defpackage.w1g.X
            int r14 = android.graphics.Color.alpha(r3)
            r3 = r3 & r9
            float r14 = (float) r14
            float r14 = r14 * r11
            int r11 = (int) r14
            int r11 = r11 << 24
            r3 = r3 | r11
            r5.setColor(r3)
        L_0x018a:
            r5.setColorFilter(r10)
            int r3 = r0.c
            if (r3 != 0) goto L_0x0194
            android.graphics.Path$FillType r3 = android.graphics.Path.FillType.WINDING
            goto L_0x0196
        L_0x0194:
            android.graphics.Path$FillType r3 = android.graphics.Path.FillType.EVEN_ODD
        L_0x0196:
            r4.setFillType(r3)
            r8.drawPath(r4, r5)
        L_0x019c:
            cs r3 = r0.e
            java.lang.Object r5 = r3.c
            android.graphics.Shader r5 = (android.graphics.Shader) r5
            if (r5 == 0) goto L_0x01a5
            goto L_0x01a9
        L_0x01a5:
            int r5 = r3.b
            if (r5 == 0) goto L_0x0210
        L_0x01a9:
            android.graphics.Paint r5 = r6.d
            if (r5 != 0) goto L_0x01ba
            android.graphics.Paint r5 = new android.graphics.Paint
            r11 = 1
            r5.<init>(r11)
            r6.d = r5
            android.graphics.Paint$Style r11 = android.graphics.Paint.Style.STROKE
            r5.setStyle(r11)
        L_0x01ba:
            android.graphics.Paint r5 = r6.d
            android.graphics.Paint$Join r11 = r0.n
            if (r11 == 0) goto L_0x01c3
            r5.setStrokeJoin(r11)
        L_0x01c3:
            android.graphics.Paint$Cap r11 = r0.m
            if (r11 == 0) goto L_0x01ca
            r5.setStrokeCap(r11)
        L_0x01ca:
            float r11 = r0.o
            r5.setStrokeMiter(r11)
            java.lang.Object r11 = r3.c
            android.graphics.Shader r11 = (android.graphics.Shader) r11
            if (r11 == 0) goto L_0x01e6
            r11.setLocalMatrix(r13)
            r5.setShader(r11)
            float r3 = r0.h
            float r3 = r3 * r15
            int r3 = java.lang.Math.round(r3)
            r5.setAlpha(r3)
            goto L_0x0202
        L_0x01e6:
            r5.setShader(r10)
            r11 = 255(0xff, float:3.57E-43)
            r5.setAlpha(r11)
            int r3 = r3.b
            float r11 = r0.h
            android.graphics.PorterDuff$Mode r13 = defpackage.w1g.X
            int r13 = android.graphics.Color.alpha(r3)
            r3 = r3 & r9
            float r9 = (float) r13
            float r9 = r9 * r11
            int r9 = (int) r9
            int r9 = r9 << 24
            r3 = r3 | r9
            r5.setColor(r3)
        L_0x0202:
            r5.setColorFilter(r10)
            float r2 = r2 * r20
            float r0 = r0.f
            float r0 = r0 * r2
            r5.setStrokeWidth(r0)
            r8.drawPath(r4, r5)
        L_0x0210:
            r0 = 1
            goto L_0x0217
        L_0x0212:
            r1 = r22
            r17 = r10
            r0 = r9
        L_0x0217:
            int r12 = r12 + r0
            r9 = r0
            r10 = r17
            r11 = 0
            goto L_0x001a
        L_0x021e:
            r21.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t1g.a(q1g, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public float getAlpha() {
        return ((float) getRootAlpha()) / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i2) {
        this.l = i2;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [qae, ts] */
    public t1g(t1g t1g) {
        this.c = new Matrix();
        this.h = c44.DEFAULT_ASPECT_RATIO;
        this.i = c44.DEFAULT_ASPECT_RATIO;
        this.j = c44.DEFAULT_ASPECT_RATIO;
        this.k = c44.DEFAULT_ASPECT_RATIO;
        this.l = KotlinVersion.MAX_COMPONENT_VALUE;
        this.m = null;
        this.n = null;
        ? qae = new qae(0);
        this.o = qae;
        this.g = new q1g(t1g.g, qae);
        this.a = new Path(t1g.a);
        this.b = new Path(t1g.b);
        this.h = t1g.h;
        this.i = t1g.i;
        this.j = t1g.j;
        this.k = t1g.k;
        this.l = t1g.l;
        this.m = t1g.m;
        String str = t1g.m;
        if (str != null) {
            qae.put(str, this);
        }
        this.n = t1g.n;
    }
}
