package defpackage;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.Arrays;
import java.util.List;

/* renamed from: sp6  reason: default package */
public final class sp6 implements lv4 {
    public final ColorDrawable a;
    public final Resources b;
    public b9d c;
    public final z7d d;
    public final ig5 e;
    public final qb6 f;

    /* JADX WARNING: type inference failed for: r0v6, types: [qb6, z7d] */
    public sp6(tp6 tp6) {
        int i;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.a = colorDrawable;
        tf6.P();
        this.b = tp6.a;
        this.c = tp6.p;
        qb6 qb6 = new qb6(colorDrawable);
        this.f = qb6;
        List list = tp6.n;
        int size = list != null ? list.size() : 1;
        int i2 = (size == 0 ? 1 : size) + (tp6.o != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[(i2 + 6)];
        drawableArr[0] = a(tp6.m, (xdd) null);
        drawableArr[1] = a(tp6.d, tp6.e);
        xdd xdd = tp6.l;
        qb6.setColorFilter((ColorFilter) null);
        drawableArr[2] = tqg.e(qb6, xdd);
        drawableArr[3] = a(tp6.j, tp6.k);
        drawableArr[4] = a(tp6.f, tp6.g);
        drawableArr[5] = a(tp6.h, tp6.i);
        if (i2 > 0) {
            List<Drawable> list2 = tp6.n;
            if (list2 != null) {
                i = 0;
                for (Drawable a2 : list2) {
                    drawableArr[i + 6] = a(a2, (xdd) null);
                    i++;
                }
            } else {
                i = 1;
            }
            StateListDrawable stateListDrawable = tp6.o;
            if (stateListDrawable != null) {
                drawableArr[i + 6] = a(stateListDrawable, (xdd) null);
            }
        }
        ig5 ig5 = new ig5(drawableArr);
        this.e = ig5;
        ig5.Z = tp6.b;
        if (ig5.Y == 1) {
            ig5.Y = 0;
        }
        ? qb62 = new qb6(tqg.d(ig5, this.c));
        qb62.v = null;
        this.d = qb62;
        qb62.mutate();
        g();
        tf6.P();
    }

    public final Drawable a(Drawable drawable, xdd xdd) {
        return tqg.e(tqg.c(drawable, this.c, this.b), xdd);
    }

    public final void b(int i) {
        if (i >= 0) {
            ig5 ig5 = this.e;
            ig5.Y = 0;
            ig5.z0[i] = true;
            ig5.invalidateSelf();
        }
    }

    public final void c() {
        d(1);
        d(2);
        d(3);
        d(4);
        d(5);
    }

    public final void d(int i) {
        if (i >= 0) {
            ig5 ig5 = this.e;
            ig5.Y = 0;
            ig5.z0[i] = false;
            ig5.invalidateSelf();
        }
    }

    public final uu4 e(int i) {
        ig5 ig5 = this.e;
        ig5.getClass();
        boolean z = false;
        cvg.l(Boolean.valueOf(i >= 0));
        uu4[] uu4Arr = ig5.o;
        if (i < uu4Arr.length) {
            z = true;
        }
        cvg.l(Boolean.valueOf(z));
        if (uu4Arr[i] == null) {
            uu4Arr[i] = new js(ig5, i);
        }
        uu4 uu4 = uu4Arr[i];
        uu4.j();
        return uu4.j() instanceof vdd ? (vdd) uu4.j() : uu4;
    }

    public final vdd f(int i) {
        uu4 e2 = e(i);
        if (e2 instanceof vdd) {
            return (vdd) e2;
        }
        Drawable e3 = tqg.e(e2.f(tqg.a), ydd.s);
        e2.f(e3);
        cvg.p(e3, "Parent has no child drawable!");
        return (vdd) e3;
    }

    public final void g() {
        ig5 ig5 = this.e;
        if (ig5 != null) {
            ig5.A0++;
            ig5.Y = 0;
            Arrays.fill(ig5.z0, true);
            ig5.invalidateSelf();
            c();
            b(1);
            ig5.e();
            ig5.c();
        }
    }

    public final void h(xdd xdd) {
        xdd.getClass();
        vdd f2 = f(2);
        if (!hsg.k(f2.v, xdd)) {
            f2.v = xdd;
            f2.w = null;
            f2.p();
            f2.invalidateSelf();
        }
    }

    public final void i(Drawable drawable, int i) {
        if (drawable == null) {
            this.e.b((Drawable) null, i);
            return;
        }
        e(i).f(tqg.c(drawable, this.c, this.b));
    }

    public final void j(Drawable drawable, float f2, boolean z) {
        Drawable c2 = tqg.c(drawable, this.c, this.b);
        c2.mutate();
        this.f.o(c2);
        ig5 ig5 = this.e;
        ig5.A0++;
        c();
        b(2);
        l(f2);
        if (z) {
            ig5.e();
        }
        ig5.c();
    }

    public final void k(Drawable drawable) {
        cvg.m("The given index does not correspond to an overlay image.", 6 < this.e.c.length);
        i(drawable, 6);
    }

    public final void l(float f2) {
        Drawable a2 = this.e.a(3);
        if (a2 != null) {
            if (f2 >= 0.999f) {
                if (a2 instanceof Animatable) {
                    ((Animatable) a2).stop();
                }
                d(3);
            } else {
                if (a2 instanceof Animatable) {
                    ((Animatable) a2).start();
                }
                b(3);
            }
            a2.setLevel(Math.round(f2 * 10000.0f));
        }
    }

    public final void m(float f2, boolean z) {
        ig5 ig5 = this.e;
        if (ig5.a(3) != null) {
            ig5.A0++;
            l(f2);
            if (z) {
                ig5.e();
            }
            ig5.c();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(defpackage.b9d r8) {
        /*
            r7 = this;
            r0 = 1
            r7.c = r8
            android.graphics.drawable.ColorDrawable r1 = defpackage.tqg.a
            z7d r1 = r7.d
            android.graphics.drawable.Drawable r2 = r1.a
            android.graphics.drawable.ColorDrawable r3 = defpackage.tqg.a
            if (r8 == 0) goto L_0x002e
            int r4 = r8.a
            if (r4 != r0) goto L_0x002e
            boolean r4 = r2 instanceof defpackage.x8d
            if (r4 == 0) goto L_0x0022
            x8d r2 = (defpackage.x8d) r2
            defpackage.tqg.b(r2, r8)
            int r8 = r8.d
            r2.x0 = r8
            r2.invalidateSelf()
            goto L_0x003f
        L_0x0022:
            android.graphics.drawable.Drawable r2 = r1.o(r3)
            android.graphics.drawable.Drawable r8 = defpackage.tqg.d(r2, r8)
            r1.o(r8)
            goto L_0x003f
        L_0x002e:
            boolean r8 = r2 instanceof defpackage.x8d
            if (r8 == 0) goto L_0x003f
            x8d r2 = (defpackage.x8d) r2
            android.graphics.drawable.Drawable r8 = r2.o(r3)
            r1.o(r8)
            r8 = 0
            r3.setCallback(r8)
        L_0x003f:
            r8 = 0
            r1 = r8
        L_0x0041:
            ig5 r2 = r7.e
            android.graphics.drawable.Drawable[] r2 = r2.c
            int r2 = r2.length
            if (r1 >= r2) goto L_0x00a3
            uu4 r2 = r7.e(r1)
            b9d r3 = r7.c
        L_0x004e:
            android.graphics.drawable.Drawable r4 = r2.j()
            if (r4 == r2) goto L_0x005d
            boolean r5 = r4 instanceof defpackage.uu4
            if (r5 != 0) goto L_0x0059
            goto L_0x005d
        L_0x0059:
            r2 = r4
            uu4 r2 = (defpackage.uu4) r2
            goto L_0x004e
        L_0x005d:
            android.graphics.drawable.Drawable r4 = r2.j()
            if (r3 == 0) goto L_0x0083
            int r5 = r3.a
            r6 = 2
            if (r5 != r6) goto L_0x0083
            boolean r5 = r4 instanceof defpackage.s8d
            if (r5 == 0) goto L_0x0072
            s8d r4 = (defpackage.s8d) r4
            defpackage.tqg.b(r4, r3)
            goto L_0x00a1
        L_0x0072:
            if (r4 == 0) goto L_0x00a1
            android.graphics.drawable.ColorDrawable r5 = defpackage.tqg.a
            r2.f(r5)
            android.content.res.Resources r5 = r7.b
            android.graphics.drawable.Drawable r3 = defpackage.tqg.a(r4, r3, r5)
            r2.f(r3)
            goto L_0x00a1
        L_0x0083:
            boolean r2 = r4 instanceof defpackage.s8d
            if (r2 == 0) goto L_0x00a1
            s8d r4 = (defpackage.s8d) r4
            r4.a(r8)
            r4.b()
            r2 = 0
            r4.c(r2, r8)
            r4.i(r2)
            r4.k()
            r4.e(r8)
            int r2 = defpackage.t8d.S0
            r4.g()
        L_0x00a1:
            int r1 = r1 + r0
            goto L_0x0041
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sp6.n(b9d):void");
    }
}
