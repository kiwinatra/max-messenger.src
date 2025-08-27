package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;

/* renamed from: ng8  reason: default package */
public final class ng8 {
    public final MaterialButton a;
    public j4e b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public bh8 m;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q;
    public boolean r = true;
    public RippleDrawable s;
    public int t;

    public ng8(MaterialButton materialButton, j4e j4e) {
        this.a = materialButton;
        this.b = j4e;
    }

    public final u4e a() {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.s.getNumberOfLayers() > 2 ? (u4e) this.s.getDrawable(2) : (u4e) this.s.getDrawable(1);
    }

    public final bh8 b(boolean z) {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (bh8) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
    }

    public final void c(j4e j4e) {
        this.b = j4e;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(j4e);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(j4e);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(j4e);
        }
    }

    public final void d(int i2, int i3) {
        WeakHashMap weakHashMap = gag.a;
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i4 = this.e;
        int i5 = this.f;
        this.f = i3;
        this.e = i2;
        if (!this.o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i2) - i4, paddingEnd, (paddingBottom + i3) - i5);
    }

    public final void e() {
        bh8 bh8 = new bh8(this.b);
        MaterialButton materialButton = this.a;
        bh8.j(materialButton.getContext());
        ru4.h(bh8, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            ru4.i(bh8, mode);
        }
        ColorStateList colorStateList = this.k;
        bh8.a.k = (float) this.h;
        bh8.invalidateSelf();
        bh8.n(colorStateList);
        bh8 bh82 = new bh8(this.b);
        bh82.setTint(0);
        float f2 = (float) this.h;
        int A = this.n ? ld9.A(materialButton, edc.colorSurface) : 0;
        bh82.a.k = f2;
        bh82.invalidateSelf();
        bh82.n(ColorStateList.valueOf(A));
        bh8 bh83 = new bh8(this.b);
        this.m = bh83;
        ru4.g(bh83, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(ld8.r0(this.l), new InsetDrawable(new LayerDrawable(new Drawable[]{bh82, bh8}), this.c, this.e, this.d, this.f), this.m);
        this.s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        bh8 b2 = b(false);
        if (b2 != null) {
            b2.k((float) this.t);
            b2.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        int i2 = 0;
        bh8 b2 = b(false);
        bh8 b3 = b(true);
        if (b2 != null) {
            ColorStateList colorStateList = this.k;
            b2.a.k = (float) this.h;
            b2.invalidateSelf();
            b2.n(colorStateList);
            if (b3 != null) {
                float f2 = (float) this.h;
                if (this.n) {
                    i2 = ld9.A(this.a, edc.colorSurface);
                }
                b3.a.k = f2;
                b3.invalidateSelf();
                b3.n(ColorStateList.valueOf(i2));
            }
        }
    }
}
