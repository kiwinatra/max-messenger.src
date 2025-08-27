package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: ap  reason: default package */
public final class ap extends Spinner {
    public static final int[] z = {16843505};
    public final jn a;
    public final Context b;
    public final qo c;
    public SpinnerAdapter o;
    public final boolean v;
    public final zo w;
    public int x;
    public final Rect y = new Rect();

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        if (r6 != null) goto L_0x004d;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ap(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r10 = this;
            int r0 = defpackage.hdc.spinnerStyle
            r10.<init>(r11, r12, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r10.y = r1
            android.content.Context r1 = r10.getContext()
            defpackage.zhf.a(r1, r10)
            int[] r1 = defpackage.koc.Spinner
            r2 = 0
            g6d r1 = defpackage.g6d.w(r11, r12, r1, r0, r2)
            jn r3 = new jn
            r3.<init>(r10)
            r10.a = r3
            int r3 = defpackage.koc.Spinner_popupTheme
            java.lang.Object r4 = r1.c
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            int r3 = r4.getResourceId(r3, r2)
            if (r3 == 0) goto L_0x0035
            kx3 r5 = new kx3
            r5.<init>(r11, r3)
            r10.b = r5
            goto L_0x0037
        L_0x0035:
            r10.b = r11
        L_0x0037:
            r3 = -1
            r5 = 0
            int[] r6 = z     // Catch:{ Exception -> 0x0053, all -> 0x0051 }
            android.content.res.TypedArray r6 = r11.obtainStyledAttributes(r12, r6, r0, r2)     // Catch:{ Exception -> 0x0053, all -> 0x0051 }
            boolean r7 = r6.hasValue(r2)     // Catch:{ Exception -> 0x005b, all -> 0x004a }
            if (r7 == 0) goto L_0x004d
            int r3 = r6.getInt(r2, r2)     // Catch:{ Exception -> 0x005b, all -> 0x004a }
            goto L_0x004d
        L_0x004a:
            r10 = move-exception
            r5 = r6
            goto L_0x0055
        L_0x004d:
            r6.recycle()
            goto L_0x005e
        L_0x0051:
            r10 = move-exception
            goto L_0x0055
        L_0x0053:
            r6 = r5
            goto L_0x005b
        L_0x0055:
            if (r5 == 0) goto L_0x005a
            r5.recycle()
        L_0x005a:
            throw r10
        L_0x005b:
            if (r6 == 0) goto L_0x005e
            goto L_0x004d
        L_0x005e:
            r6 = 1
            if (r3 == 0) goto L_0x009e
            if (r3 == r6) goto L_0x0064
            goto L_0x00ad
        L_0x0064:
            xo r3 = new xo
            android.content.Context r7 = r10.b
            r3.<init>(r10, r7, r12, r0)
            android.content.Context r7 = r10.b
            int[] r8 = defpackage.koc.Spinner
            g6d r2 = defpackage.g6d.w(r7, r12, r8, r0, r2)
            int r7 = defpackage.koc.Spinner_android_dropDownWidth
            java.lang.Object r8 = r2.c
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            r9 = -2
            int r7 = r8.getLayoutDimension(r7, r9)
            r10.x = r7
            int r7 = defpackage.koc.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r7 = r2.q(r7)
            r3.j(r7)
            int r7 = defpackage.koc.Spinner_android_prompt
            java.lang.String r7 = r4.getString(r7)
            r3.J0 = r7
            r2.x()
            r10.w = r3
            qo r2 = new qo
            r2.<init>(r10, r10, r3)
            r10.c = r2
            goto L_0x00ad
        L_0x009e:
            to r2 = new to
            r2.<init>(r10)
            r10.w = r2
            int r3 = defpackage.koc.Spinner_android_prompt
            java.lang.String r3 = r4.getString(r3)
            r2.c = r3
        L_0x00ad:
            int r2 = defpackage.koc.Spinner_android_entries
            java.lang.CharSequence[] r2 = r4.getTextArray(r2)
            if (r2 == 0) goto L_0x00c5
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r11, r4, r2)
            int r11 = defpackage.vjc.support_simple_spinner_dropdown_item
            r3.setDropDownViewResource(r11)
            r10.setAdapter((android.widget.SpinnerAdapter) r3)
        L_0x00c5:
            r1.x()
            r10.v = r6
            android.widget.SpinnerAdapter r11 = r10.o
            if (r11 == 0) goto L_0x00d3
            r10.setAdapter((android.widget.SpinnerAdapter) r11)
            r10.o = r5
        L_0x00d3:
            jn r10 = r10.a
            r10.d(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ap.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        Rect rect = this.y;
        drawable.getPadding(rect);
        return i2 + rect.left + rect.right;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        jn jnVar = this.a;
        if (jnVar != null) {
            jnVar.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        zo zoVar = this.w;
        return zoVar != null ? zoVar.d() : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        zo zoVar = this.w;
        return zoVar != null ? zoVar.o() : super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return this.w != null ? this.x : super.getDropDownWidth();
    }

    public final zo getInternalPopup() {
        return this.w;
    }

    public Drawable getPopupBackground() {
        zo zoVar = this.w;
        return zoVar != null ? zoVar.c() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.b;
    }

    public CharSequence getPrompt() {
        zo zoVar = this.w;
        return zoVar != null ? zoVar.g() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        jn jnVar = this.a;
        if (jnVar != null) {
            return jnVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        jn jnVar = this.a;
        if (jnVar != null) {
            return jnVar.c();
        }
        return null;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zo zoVar = this.w;
        if (zoVar != null && zoVar.a()) {
            zoVar.dismiss();
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.w != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        yo yoVar = (yo) parcelable;
        super.onRestoreInstanceState(yoVar.getSuperState());
        if (yoVar.a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ro(0, this));
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, yo] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        zo zoVar = this.w;
        baseSavedState.a = zoVar != null && zoVar.a();
        return baseSavedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        qo qoVar = this.c;
        if (qoVar == null || !qoVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean performClick() {
        zo zoVar = this.w;
        if (zoVar == null) {
            return super.performClick();
        }
        if (zoVar.a()) {
            return true;
        }
        this.w.m(getTextDirection(), getTextAlignment());
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        jn jnVar = this.a;
        if (jnVar != null) {
            jnVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        jn jnVar = this.a;
        if (jnVar != null) {
            jnVar.f(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        zo zoVar = this.w;
        if (zoVar != null) {
            zoVar.l(i);
            zoVar.e(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    public void setDropDownVerticalOffset(int i) {
        zo zoVar = this.w;
        if (zoVar != null) {
            zoVar.k(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.w != null) {
            this.x = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        zo zoVar = this.w;
        if (zoVar != null) {
            zoVar.j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(iq.D(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        zo zoVar = this.w;
        if (zoVar != null) {
            zoVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        jn jnVar = this.a;
        if (jnVar != null) {
            jnVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        jn jnVar = this.a;
        if (jnVar != null) {
            jnVar.i(mode);
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.widget.ListAdapter, java.lang.Object, uo] */
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.v) {
            this.o = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        zo zoVar = this.w;
        if (zoVar != null) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ? obj = new Object();
            obj.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                so.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            zoVar.p(obj);
        }
    }
}
