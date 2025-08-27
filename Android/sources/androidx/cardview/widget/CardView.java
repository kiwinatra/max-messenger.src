package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

public class CardView extends FrameLayout {
    public static final int[] w = {16842801};
    public static final pf6 x = new pf6(9);
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect o = new Rect();
    public final fj v;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CardView(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            int r0 = defpackage.ycc.cardViewStyle
            r9.<init>(r10, r11, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r9.c = r1
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r9.o = r2
            fj r2 = new fj
            r3 = 6
            r2.<init>((int) r3, (java.lang.Object) r9)
            r9.v = r2
            int[] r3 = defpackage.coc.CardView
            int r4 = defpackage.dnc.CardView
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r3, r0, r4)
            int r11 = defpackage.coc.CardView_cardBackgroundColor
            boolean r11 = r10.hasValue(r11)
            r0 = 0
            if (r11 == 0) goto L_0x0033
            int r11 = defpackage.coc.CardView_cardBackgroundColor
            android.content.res.ColorStateList r11 = r10.getColorStateList(r11)
            goto L_0x006c
        L_0x0033:
            android.content.Context r11 = r9.getContext()
            int[] r3 = w
            android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r3)
            int r3 = r11.getColor(r0, r0)
            r11.recycle()
            r11 = 3
            float[] r11 = new float[r11]
            android.graphics.Color.colorToHSV(r3, r11)
            r3 = 2
            r11 = r11[r3]
            r3 = 1056964608(0x3f000000, float:0.5)
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x005e
            android.content.res.Resources r11 = r9.getResources()
            int r3 = defpackage.odc.cardview_light_background
            int r11 = r11.getColor(r3)
            goto L_0x0068
        L_0x005e:
            android.content.res.Resources r11 = r9.getResources()
            int r3 = defpackage.odc.cardview_dark_background
            int r11 = r11.getColor(r3)
        L_0x0068:
            android.content.res.ColorStateList r11 = android.content.res.ColorStateList.valueOf(r11)
        L_0x006c:
            int r3 = defpackage.coc.CardView_cardCornerRadius
            r4 = 0
            float r3 = r10.getDimension(r3, r4)
            int r5 = defpackage.coc.CardView_cardElevation
            float r5 = r10.getDimension(r5, r4)
            int r6 = defpackage.coc.CardView_cardMaxElevation
            float r4 = r10.getDimension(r6, r4)
            int r6 = defpackage.coc.CardView_cardUseCompatPadding
            boolean r6 = r10.getBoolean(r6, r0)
            r9.a = r6
            int r6 = defpackage.coc.CardView_cardPreventCornerOverlap
            r7 = 1
            boolean r6 = r10.getBoolean(r6, r7)
            r9.b = r6
            int r6 = defpackage.coc.CardView_contentPadding
            int r6 = r10.getDimensionPixelSize(r6, r0)
            int r8 = defpackage.coc.CardView_contentPaddingLeft
            int r8 = r10.getDimensionPixelSize(r8, r6)
            r1.left = r8
            int r8 = defpackage.coc.CardView_contentPaddingTop
            int r8 = r10.getDimensionPixelSize(r8, r6)
            r1.top = r8
            int r8 = defpackage.coc.CardView_contentPaddingRight
            int r8 = r10.getDimensionPixelSize(r8, r6)
            r1.right = r8
            int r8 = defpackage.coc.CardView_contentPaddingBottom
            int r6 = r10.getDimensionPixelSize(r8, r6)
            r1.bottom = r6
            int r1 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x00bb
            r4 = r5
        L_0x00bb:
            int r1 = defpackage.coc.CardView_android_minWidth
            r10.getDimensionPixelSize(r1, r0)
            int r1 = defpackage.coc.CardView_android_minHeight
            r10.getDimensionPixelSize(r1, r0)
            r10.recycle()
            pf6 r10 = x
            q8d r0 = new q8d
            r0.<init>(r11, r3)
            r2.b = r0
            r9.setBackgroundDrawable(r0)
            r9.setClipToOutline(r7)
            r9.setElevation(r5)
            r10.n(r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.cardview.widget.CardView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public ColorStateList getCardBackgroundColor() {
        return ((q8d) ((Drawable) this.v.b)).h;
    }

    public float getCardElevation() {
        return ((CardView) this.v.c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.c.left;
    }

    public int getContentPaddingRight() {
        return this.c.right;
    }

    public int getContentPaddingTop() {
        return this.c.top;
    }

    public float getMaxCardElevation() {
        return ((q8d) ((Drawable) this.v.b)).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return ((q8d) ((Drawable) this.v.b)).a;
    }

    public boolean getUseCompatPadding() {
        return this.a;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        q8d q8d = (q8d) ((Drawable) this.v.b);
        if (valueOf == null) {
            q8d.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        q8d.h = valueOf;
        q8d.b.setColor(valueOf.getColorForState(q8d.getState(), q8d.h.getDefaultColor()));
        q8d.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.v.c).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        x.n(this.v, f);
    }

    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.b) {
            this.b = z;
            pf6 pf6 = x;
            fj fjVar = this.v;
            pf6.n(fjVar, ((q8d) ((Drawable) fjVar.b)).e);
        }
    }

    public void setRadius(float f) {
        q8d q8d = (q8d) ((Drawable) this.v.b);
        if (f != q8d.a) {
            q8d.a = f;
            q8d.b((Rect) null);
            q8d.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.a != z) {
            this.a = z;
            pf6 pf6 = x;
            fj fjVar = this.v;
            pf6.n(fjVar, ((q8d) ((Drawable) fjVar.b)).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        q8d q8d = (q8d) ((Drawable) this.v.b);
        if (colorStateList == null) {
            q8d.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        q8d.h = colorStateList;
        q8d.b.setColor(colorStateList.getColorForState(q8d.getState(), q8d.h.getDefaultColor()));
        q8d.invalidateSelf();
    }
}
