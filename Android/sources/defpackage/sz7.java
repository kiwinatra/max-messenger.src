package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: sz7  reason: default package */
public class sz7 implements s8e {
    public final qz7 A0;
    public final ih5 B0;
    public final rz7 C0;
    public final qz7 D0;
    public final Handler E0;
    public final Rect F0;
    public Rect G0;
    public boolean H0;
    public final mo I0;
    public boolean X;
    public boolean Y;
    public int Z;
    public final Context a;
    public ListAdapter b;
    public ax4 c;
    public final int o;
    public int v;
    public final int v0;
    public int w;
    public v44 w0;
    public int x;
    public View x0;
    public final int y;
    public AdapterView.OnItemClickListener y0;
    public boolean z;
    public AdapterView.OnItemSelectedListener z0;

    public sz7(Context context) {
        this(context, (AttributeSet) null, hdc.listPopupWindowStyle, 0);
    }

    public final boolean a() {
        return this.I0.isShowing();
    }

    public final void b() {
        int i;
        int i2;
        ax4 ax4;
        ax4 ax42 = this.c;
        mo moVar = this.I0;
        Context context = this.a;
        if (ax42 == null) {
            ax4 q = q(context, !this.H0);
            this.c = q;
            q.setAdapter(this.b);
            this.c.setOnItemClickListener(this.y0);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new bx4(1, this));
            this.c.setOnScrollListener(this.C0);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.z0;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            moVar.setContentView(this.c);
        } else {
            ViewGroup viewGroup = (ViewGroup) moVar.getContentView();
        }
        Drawable background = moVar.getBackground();
        int i3 = 0;
        Rect rect = this.F0;
        if (background != null) {
            background.getPadding(rect);
            int i4 = rect.top;
            i = rect.bottom + i4;
            if (!this.z) {
                this.x = -i4;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = oz7.a(moVar, this.x0, this.x, moVar.getInputMethodMode() == 2);
        int i5 = this.o;
        if (i5 == -1) {
            i2 = a2 + i;
        } else {
            int i6 = this.v;
            int a3 = this.c.a(i6 != -2 ? i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), IntCompanionObject.MIN_VALUE), a2);
            i2 = a3 + (a3 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.I0.getInputMethodMode() == 2;
        trb.d(moVar, this.y);
        if (!moVar.isShowing()) {
            int i7 = this.v;
            if (i7 == -1) {
                i7 = -1;
            } else if (i7 == -2) {
                i7 = this.x0.getWidth();
            }
            if (i5 == -1) {
                i5 = -1;
            } else if (i5 == -2) {
                i5 = i2;
            }
            moVar.setWidth(i7);
            moVar.setHeight(i5);
            pz7.b(moVar, true);
            moVar.setOutsideTouchable(true);
            moVar.setTouchInterceptor(this.B0);
            if (this.Y) {
                trb.c(moVar, this.X);
            }
            pz7.a(moVar, this.G0);
            moVar.showAsDropDown(this.x0, this.w, this.x, this.Z);
            this.c.setSelection(-1);
            if ((!this.H0 || this.c.isInTouchMode()) && (ax4 = this.c) != null) {
                ax4.setListSelectionHidden(true);
                ax4.requestLayout();
            }
            if (!this.H0) {
                this.E0.post(this.D0);
            }
        } else if (this.x0.isAttachedToWindow()) {
            int i8 = this.v;
            if (i8 == -1) {
                i8 = -1;
            } else if (i8 == -2) {
                i8 = this.x0.getWidth();
            }
            if (i5 == -1) {
                i5 = z2 ? i2 : -1;
                if (z2) {
                    moVar.setWidth(this.v == -1 ? -1 : 0);
                    moVar.setHeight(0);
                } else {
                    if (this.v == -1) {
                        i3 = -1;
                    }
                    moVar.setWidth(i3);
                    moVar.setHeight(-1);
                }
            } else if (i5 == -2) {
                i5 = i2;
            }
            moVar.setOutsideTouchable(true);
            View view = this.x0;
            int i9 = this.w;
            int i10 = this.x;
            if (i8 < 0) {
                i8 = -1;
            }
            moVar.update(view, i9, i10, i8, i5 < 0 ? -1 : i5);
        }
    }

    public final Drawable c() {
        return this.I0.getBackground();
    }

    public final int d() {
        return this.w;
    }

    public final void dismiss() {
        mo moVar = this.I0;
        moVar.dismiss();
        moVar.setContentView((View) null);
        this.c = null;
        this.E0.removeCallbacks(this.A0);
    }

    public final void e(int i) {
        this.w = i;
    }

    public final ax4 i() {
        return this.c;
    }

    public final void j(Drawable drawable) {
        this.I0.setBackgroundDrawable(drawable);
    }

    public final void k(int i) {
        this.x = i;
        this.z = true;
    }

    public final int o() {
        if (!this.z) {
            return 0;
        }
        return this.x;
    }

    public void p(ListAdapter listAdapter) {
        v44 v44 = this.w0;
        if (v44 == null) {
            this.w0 = new v44(1, this);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(v44);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.w0);
        }
        ax4 ax4 = this.c;
        if (ax4 != null) {
            ax4.setAdapter(this.b);
        }
    }

    public ax4 q(Context context, boolean z2) {
        return new ax4(context, z2);
    }

    public final void r(int i) {
        Drawable background = this.I0.getBackground();
        if (background != null) {
            Rect rect = this.F0;
            background.getPadding(rect);
            this.v = rect.left + rect.right + i;
            return;
        }
        this.v = i;
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [mo, android.widget.PopupWindow] */
    public sz7(Context context, AttributeSet attributeSet, int i, int i2) {
        Drawable drawable;
        int resourceId;
        this.o = -2;
        this.v = -2;
        this.y = 1002;
        this.Z = 0;
        this.v0 = IntCompanionObject.MAX_VALUE;
        this.A0 = new qz7(this, 1);
        this.B0 = new ih5(1, this);
        this.C0 = new rz7(this);
        this.D0 = new qz7(this, 0);
        this.F0 = new Rect();
        this.a = context;
        this.E0 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, koc.ListPopupWindow, i, i2);
        this.w = obtainStyledAttributes.getDimensionPixelOffset(koc.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(koc.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.x = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.z = true;
        }
        obtainStyledAttributes.recycle();
        ? popupWindow = new PopupWindow(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, koc.PopupWindow, i, i2);
        if (obtainStyledAttributes2.hasValue(koc.PopupWindow_overlapAnchor)) {
            trb.c(popupWindow, obtainStyledAttributes2.getBoolean(koc.PopupWindow_overlapAnchor, false));
        }
        int i3 = koc.PopupWindow_android_popupBackground;
        if (!obtainStyledAttributes2.hasValue(i3) || (resourceId = obtainStyledAttributes2.getResourceId(i3, 0)) == 0) {
            drawable = obtainStyledAttributes2.getDrawable(i3);
        } else {
            drawable = iq.D(context, resourceId);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.I0 = popupWindow;
        popupWindow.setInputMethodMode(1);
    }
}
