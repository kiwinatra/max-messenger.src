package defpackage;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;

/* renamed from: cg8  reason: default package */
public final class cg8 extends dd {
    public static final int e = edc.alertDialogStyle;
    public static final int f = hnc.MaterialAlertDialog_MaterialComponents;
    public static final int g = edc.materialAlertDialogTheme;
    public final bh8 c;
    public final Rect d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public cg8(android.content.Context r14) {
        /*
            r13 = this;
            int r0 = g
            android.util.TypedValue r1 = defpackage.b59.T(r0, r14)
            r2 = 0
            if (r1 != 0) goto L_0x000b
            r1 = r2
            goto L_0x000d
        L_0x000b:
            int r1 = r1.data
        L_0x000d:
            r3 = 0
            int r10 = e
            int r11 = f
            android.content.Context r4 = defpackage.fh8.a(r14, r3, r10, r11)
            if (r1 != 0) goto L_0x0019
            goto L_0x001f
        L_0x0019:
            kx3 r5 = new kx3
            r5.<init>(r4, r1)
            r4 = r5
        L_0x001f:
            android.util.TypedValue r14 = defpackage.b59.T(r0, r14)
            if (r14 != 0) goto L_0x0027
            r14 = r2
            goto L_0x0029
        L_0x0027:
            int r14 = r14.data
        L_0x0029:
            r13.<init>(r4, r14)
            android.content.Context r14 = r13.getContext()
            android.content.res.Resources$Theme r0 = r14.getTheme()
            int[] r1 = defpackage.tnc.MaterialAlertDialog
            int[] r9 = new int[r2]
            r2 = 0
            defpackage.vhf.a(r14, r2, r10, r11)
            r4 = r14
            r5 = r2
            r6 = r1
            r7 = r10
            r8 = r11
            defpackage.vhf.b(r4, r5, r6, r7, r8, r9)
            android.content.res.TypedArray r1 = r14.obtainStyledAttributes(r2, r1, r10, r11)
            int r2 = defpackage.tnc.MaterialAlertDialog_backgroundInsetStart
            android.content.res.Resources r4 = r14.getResources()
            int r5 = defpackage.iec.mtrl_alert_dialog_background_inset_start
            int r4 = r4.getDimensionPixelSize(r5)
            int r2 = r1.getDimensionPixelSize(r2, r4)
            int r4 = defpackage.tnc.MaterialAlertDialog_backgroundInsetTop
            android.content.res.Resources r5 = r14.getResources()
            int r6 = defpackage.iec.mtrl_alert_dialog_background_inset_top
            int r5 = r5.getDimensionPixelSize(r6)
            int r4 = r1.getDimensionPixelSize(r4, r5)
            int r5 = defpackage.tnc.MaterialAlertDialog_backgroundInsetEnd
            android.content.res.Resources r6 = r14.getResources()
            int r7 = defpackage.iec.mtrl_alert_dialog_background_inset_end
            int r6 = r6.getDimensionPixelSize(r7)
            int r5 = r1.getDimensionPixelSize(r5, r6)
            int r6 = defpackage.tnc.MaterialAlertDialog_backgroundInsetBottom
            android.content.res.Resources r7 = r14.getResources()
            int r8 = defpackage.iec.mtrl_alert_dialog_background_inset_bottom
            int r7 = r7.getDimensionPixelSize(r8)
            int r6 = r1.getDimensionPixelSize(r6, r7)
            r1.recycle()
            android.content.res.Resources r1 = r14.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.getLayoutDirection()
            r7 = 1
            if (r1 != r7) goto L_0x009d
            r12 = r5
            r5 = r2
            r2 = r12
        L_0x009d:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r2, r4, r5, r6)
            r13.d = r1
            int r1 = defpackage.edc.colorSurface
            java.lang.Class<cg8> r2 = defpackage.cg8.class
            java.lang.String r2 = r2.getCanonicalName()
            int r1 = defpackage.ld9.z(r1, r14, r2)
            int[] r2 = defpackage.tnc.MaterialAlertDialog
            android.content.res.TypedArray r2 = r14.obtainStyledAttributes(r3, r2, r10, r11)
            int r4 = defpackage.tnc.MaterialAlertDialog_backgroundTint
            int r1 = r2.getColor(r4, r1)
            r2.recycle()
            bh8 r2 = new bh8
            r2.<init>(r14, r3, r10, r11)
            r2.j(r14)
            android.content.res.ColorStateList r14 = android.content.res.ColorStateList.valueOf(r1)
            r2.l(r14)
            android.util.TypedValue r14 = new android.util.TypedValue
            r14.<init>()
            r1 = 16844145(0x1010571, float:2.3697462E-38)
            r0.resolveAttribute(r1, r14, r7)
            android.content.Context r0 = r13.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r14.getDimension(r0)
            int r14 = r14.type
            r1 = 5
            if (r14 != r1) goto L_0x011e
            r14 = 0
            int r14 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r14 < 0) goto L_0x011e
            ah8 r14 = r2.a
            j4e r14 = r14.a
            ypg r14 = r14.e()
            d0 r1 = new d0
            r1.<init>(r0)
            r14.e = r1
            d0 r1 = new d0
            r1.<init>(r0)
            r14.f = r1
            d0 r1 = new d0
            r1.<init>(r0)
            r14.g = r1
            d0 r1 = new d0
            r1.<init>(r0)
            r14.h = r1
            j4e r14 = r14.c()
            r2.setShapeAppearanceModel(r14)
        L_0x011e:
            r13.c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cg8.<init>(android.content.Context):void");
    }

    public final dd a(Drawable drawable) {
        this.a.c = drawable;
        return this;
    }

    public final void b(CharSequence charSequence) {
        this.a.f = charSequence;
    }

    public final ed create() {
        ed create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        bh8 bh8 = this.c;
        if (bh8 instanceof bh8) {
            WeakHashMap weakHashMap = gag.a;
            bh8.k(v9g.i(decorView));
        }
        Rect rect = this.d;
        window.setBackgroundDrawable(new InsetDrawable(bh8, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new uh7(create, rect));
        return create;
    }

    public final dd d(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.d(charSequence, onClickListener);
        return this;
    }

    public final dd e(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.e(charSequence, onClickListener);
        return this;
    }

    public final void h(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        zc zcVar = this.a;
        zcVar.p = charSequenceArr;
        zcVar.r = onClickListener;
    }

    public final void i(int i) {
        zc zcVar = this.a;
        zcVar.f = zcVar.a.getText(i);
    }

    public final cg8 j(int i, DialogInterface.OnClickListener onClickListener) {
        return (cg8) super.setNegativeButton(i, onClickListener);
    }

    public final void k(String str, DialogInterface.OnClickListener onClickListener) {
        super.d(str, onClickListener);
    }

    public final void l(int i, DialogInterface.OnClickListener onClickListener) {
        zc zcVar = this.a;
        zcVar.k = zcVar.a.getText(i);
        zcVar.l = onClickListener;
    }

    public final void m(String str, DialogInterface.OnClickListener onClickListener) {
        zc zcVar = this.a;
        zcVar.k = str;
        zcVar.l = onClickListener;
    }

    public final cg8 n(int i, DialogInterface.OnClickListener onClickListener) {
        return (cg8) super.setPositiveButton(i, onClickListener);
    }

    public final void o(String str, DialogInterface.OnClickListener onClickListener) {
        super.e(str, onClickListener);
    }

    public final void p(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        super.f(charSequenceArr, i, onClickListener);
    }

    public final cg8 q(CharSequence charSequence) {
        return (cg8) super.setTitle(charSequence);
    }

    public final void r(int i) {
        zc zcVar = this.a;
        zcVar.d = zcVar.a.getText(i);
    }

    public final cg8 s(View view) {
        return (cg8) super.setView(view);
    }

    public final dd setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (cg8) super.setNegativeButton(i, onClickListener);
    }

    public final dd setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (cg8) super.setPositiveButton(i, onClickListener);
    }

    public final dd setTitle(CharSequence charSequence) {
        return (cg8) super.setTitle(charSequence);
    }

    public final dd setView(View view) {
        return (cg8) super.setView(view);
    }
}
