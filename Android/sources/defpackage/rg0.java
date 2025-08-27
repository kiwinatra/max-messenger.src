package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;

/* renamed from: rg0  reason: default package */
public final class rg0 extends Drawable implements cff {
    public static final int w0 = hnc.Widget_MaterialComponents_Badge;
    public static final int x0 = edc.badgeStyle;
    public float X;
    public float Y;
    public WeakReference Z;
    public final WeakReference a;
    public final bh8 b;
    public final dff c;
    public final Rect o = new Rect();
    public final tg0 v;
    public WeakReference v0;
    public float w;
    public float x;
    public final int y;
    public float z;

    public rg0(int i, int i2, Context context) {
        vef vef;
        WeakReference weakReference = new WeakReference(context);
        this.a = weakReference;
        vhf.c(context, vhf.b, "Theme.MaterialComponents");
        dff dff = new dff(this);
        this.c = dff;
        TextPaint textPaint = dff.a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        tg0 tg0 = new tg0(i, i2, context);
        this.v = tg0;
        boolean e = e();
        sg0 sg0 = tg0.b;
        bh8 bh8 = new bh8(j4e.a(context, e ? sg0.x.intValue() : sg0.v.intValue(), e() ? sg0.y.intValue() : sg0.w.intValue(), new d0((float) 0)).c());
        this.b = bh8;
        g();
        Context context2 = (Context) weakReference.get();
        if (!(context2 == null || dff.g == (vef = new vef(context2, sg0.o.intValue())))) {
            dff.c(vef, context2);
            textPaint.setColor(sg0.c.intValue());
            invalidateSelf();
            i();
            invalidateSelf();
        }
        int i3 = sg0.Z;
        if (i3 != -2) {
            this.y = ((int) Math.pow(10.0d, ((double) i3) - 1.0d)) - 1;
        } else {
            this.y = sg0.v0;
        }
        dff.e = true;
        i();
        invalidateSelf();
        dff.e = true;
        g();
        i();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(sg0.b.intValue());
        if (bh8.a.c != valueOf) {
            bh8.l(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(sg0.c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.Z;
        if (!(weakReference2 == null || weakReference2.get() == null)) {
            View view = (View) this.Z.get();
            WeakReference weakReference3 = this.v0;
            h(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        i();
        setVisible(sg0.C0.booleanValue(), false);
    }

    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        tg0 tg0 = this.v;
        sg0 sg0 = tg0.b;
        String str = sg0.X;
        boolean z2 = str != null;
        WeakReference weakReference = this.a;
        if (z2) {
            int i = sg0.Z;
            if (i == -2 || str == null || str.length() <= i) {
                return str;
            }
            Context context = (Context) weakReference.get();
            if (context == null) {
                return "";
            }
            return String.format(context.getString(ymc.m3_exceed_max_badge_text_suffix), new Object[]{str.substring(0, i - 1), "…"});
        } else if (!f()) {
            return null;
        } else {
            int i2 = this.y;
            sg0 sg02 = tg0.b;
            if (i2 == -2 || d() <= this.y) {
                return NumberFormat.getInstance(sg02.w0).format((long) d());
            }
            Context context2 = (Context) weakReference.get();
            return context2 == null ? "" : String.format(sg02.w0, context2.getString(ymc.mtrl_exceed_max_badge_number_suffix), new Object[]{Integer.valueOf(this.y), "+"});
        }
    }

    public final FrameLayout c() {
        WeakReference weakReference = this.v0;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int d() {
        int i = this.v.b.Y;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final void draw(Canvas canvas) {
        String b2;
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.b.draw(canvas);
            if (e() && (b2 = b()) != null) {
                Rect rect = new Rect();
                dff dff = this.c;
                dff.a.getTextBounds(b2, 0, b2.length(), rect);
                float exactCenterY = this.x - rect.exactCenterY();
                canvas.drawText(b2, this.w, (float) (rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY)), dff.a);
            }
        }
    }

    public final boolean e() {
        return this.v.b.X != null || f();
    }

    public final boolean f() {
        sg0 sg0 = this.v.b;
        return sg0.X == null && sg0.Y != -1;
    }

    public final void g() {
        Context context = (Context) this.a.get();
        if (context != null) {
            boolean e = e();
            tg0 tg0 = this.v;
            this.b.setShapeAppearanceModel(j4e.a(context, e ? tg0.b.x.intValue() : tg0.b.v.intValue(), e() ? tg0.b.y.intValue() : tg0.b.w.intValue(), new d0((float) 0)).c());
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        return this.v.b.z;
    }

    public final int getIntrinsicHeight() {
        return this.o.height();
    }

    public final int getIntrinsicWidth() {
        return this.o.width();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void h(View view, FrameLayout frameLayout) {
        this.Z = new WeakReference(view);
        this.v0 = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        i();
        invalidateSelf();
    }

    public final void i() {
        float f;
        float f2;
        float f3;
        WeakReference weakReference = this.a;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.Z;
        ViewGroup viewGroup = null;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            Rect rect2 = this.o;
            rect.set(rect2);
            Rect rect3 = new Rect();
            view.getDrawingRect(rect3);
            WeakReference weakReference3 = this.v0;
            if (weakReference3 != null) {
                viewGroup = (ViewGroup) weakReference3.get();
            }
            if (viewGroup != null) {
                viewGroup.offsetDescendantRectToMyCoords(view, rect3);
            }
            boolean e = e();
            tg0 tg0 = this.v;
            float f4 = e ? tg0.d : tg0.c;
            this.z = f4;
            if (f4 != -1.0f) {
                this.X = f4;
                this.Y = f4;
            } else {
                this.X = (float) Math.round((e() ? tg0.g : tg0.e) / 2.0f);
                this.Y = (float) Math.round((e() ? tg0.h : tg0.f) / 2.0f);
            }
            if (e()) {
                String b2 = b();
                float f5 = this.X;
                dff dff = this.c;
                this.X = Math.max(f5, (dff.a(b2) / 2.0f) + ((float) tg0.b.D0.intValue()));
                float f6 = this.Y;
                if (!dff.e) {
                    f3 = dff.d;
                } else {
                    dff.b(b2);
                    f3 = dff.d;
                }
                float max = Math.max(f6, (f3 / 2.0f) + ((float) tg0.b.E0.intValue()));
                this.Y = max;
                this.X = Math.max(this.X, max);
            }
            int intValue = tg0.b.G0.intValue();
            boolean e2 = e();
            sg0 sg0 = tg0.b;
            if (e2) {
                intValue = sg0.I0.intValue();
                Context context2 = (Context) weakReference.get();
                if (context2 != null) {
                    intValue = xg.c(intValue, xg.b(c44.DEFAULT_ASPECT_RATIO, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), intValue - sg0.L0.intValue());
                }
            }
            int i = tg0.k;
            if (i == 0) {
                intValue -= Math.round(this.Y);
            }
            int intValue2 = sg0.K0.intValue() + intValue;
            int intValue3 = sg0.B0.intValue();
            if (intValue3 == 8388691 || intValue3 == 8388693) {
                this.x = (float) (rect3.bottom - intValue2);
            } else {
                this.x = (float) (rect3.top + intValue2);
            }
            int intValue4 = e() ? sg0.H0.intValue() : sg0.F0.intValue();
            if (i == 1) {
                intValue4 += e() ? tg0.j : tg0.i;
            }
            int intValue5 = sg0.J0.intValue() + intValue4;
            int intValue6 = sg0.B0.intValue();
            if (intValue6 == 8388659 || intValue6 == 8388691) {
                WeakHashMap weakHashMap = gag.a;
                this.w = view.getLayoutDirection() == 0 ? (((float) rect3.left) - this.X) + ((float) intValue5) : (((float) rect3.right) + this.X) - ((float) intValue5);
            } else {
                WeakHashMap weakHashMap2 = gag.a;
                this.w = view.getLayoutDirection() == 0 ? (((float) rect3.right) + this.X) - ((float) intValue5) : (((float) rect3.left) - this.X) + ((float) intValue5);
            }
            if (sg0.M0.booleanValue()) {
                View c2 = c();
                if (c2 != null) {
                    FrameLayout c3 = c();
                    if (c3 == null || c3.getId() != agc.mtrl_anchor_parent) {
                        f2 = 0.0f;
                        f = 0.0f;
                    } else if (c2.getParent() instanceof View) {
                        f2 = c2.getY();
                        f = c2.getX();
                        c2 = (View) c2.getParent();
                    }
                } else if (view.getParent() instanceof View) {
                    float y2 = view.getY();
                    f = view.getX();
                    View view2 = (View) view.getParent();
                    f2 = y2;
                    c2 = view2;
                }
                float y3 = c2.getY() + (this.x - this.Y) + f2;
                float x2 = c2.getX() + (this.w - this.X) + f;
                float height = c2.getParent() instanceof View ? ((this.x + this.Y) - (((float) ((View) c2.getParent()).getHeight()) - c2.getY())) + f2 : 0.0f;
                float width = c2.getParent() instanceof View ? ((this.w + this.X) - (((float) ((View) c2.getParent()).getWidth()) - c2.getX())) + f : 0.0f;
                if (y3 < c44.DEFAULT_ASPECT_RATIO) {
                    this.x = Math.abs(y3) + this.x;
                }
                if (x2 < c44.DEFAULT_ASPECT_RATIO) {
                    this.w = Math.abs(x2) + this.w;
                }
                if (height > c44.DEFAULT_ASPECT_RATIO) {
                    this.x -= Math.abs(height);
                }
                if (width > c44.DEFAULT_ASPECT_RATIO) {
                    this.w -= Math.abs(width);
                }
            }
            float f7 = this.w;
            float f8 = this.x;
            float f9 = this.X;
            float f10 = this.Y;
            rect2.set((int) (f7 - f9), (int) (f8 - f10), (int) (f7 + f9), (int) (f8 + f10));
            float f11 = this.z;
            int i2 = (f11 > -1.0f ? 1 : (f11 == -1.0f ? 0 : -1));
            bh8 bh8 = this.b;
            if (i2 != 0) {
                ypg e3 = bh8.a.a.e();
                e3.e = new d0(f11);
                e3.f = new d0(f11);
                e3.g = new d0(f11);
                e3.h = new d0(f11);
                bh8.setShapeAppearanceModel(e3.c());
            }
            if (!rect.equals(rect2)) {
                bh8.setBounds(rect2);
            }
        }
    }

    public final boolean isStateful() {
        return false;
    }

    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final void setAlpha(int i) {
        tg0 tg0 = this.v;
        tg0.a.z = i;
        tg0.b.z = i;
        this.c.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
