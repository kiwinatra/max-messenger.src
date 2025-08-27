package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;

public class ActionMenuItemView extends AppCompatTextView implements k79, View.OnClickListener, x7 {
    public final int A0;
    public int B0;
    public final int C0;
    public l69 v0;
    public r7 w0;
    public u69 x;
    public s7 x0;
    public CharSequence y;
    public boolean y0 = j();
    public Drawable z;
    public boolean z0;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, koc.ActionMenuItemView, 0, 0);
        this.A0 = obtainStyledAttributes.getDimensionPixelSize(koc.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.C0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.B0 = -1;
        setSaveEnabled(false);
    }

    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    public final void d(u69 u69) {
        this.x = u69;
        setIcon(u69.getIcon());
        setTitle(u69.getTitleCondensed());
        setId(u69.a);
        setVisibility(u69.isVisible() ? 0 : 8);
        setEnabled(u69.isEnabled());
        if (u69.hasSubMenu() && this.w0 == null) {
            this.w0 = new r7(this);
        }
    }

    public final boolean e() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.x.getIcon() == null;
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public u69 getItemData() {
        return this.x;
    }

    public final boolean j() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void k() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.y);
        if (this.z != null && ((this.x.H0 & 4) != 4 || (!this.y0 && !this.z0))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        CharSequence charSequence = null;
        setText(z4 ? this.y : null);
        CharSequence charSequence2 = this.x.z0;
        if (TextUtils.isEmpty(charSequence2)) {
            setContentDescription(z4 ? null : this.x.v);
        } else {
            setContentDescription(charSequence2);
        }
        CharSequence charSequence3 = this.x.A0;
        if (TextUtils.isEmpty(charSequence3)) {
            if (!z4) {
                charSequence = this.x.v;
            }
            pmf.a(this, charSequence);
            return;
        }
        pmf.a(this, charSequence3);
    }

    public final void onClick(View view) {
        l69 l69 = this.v0;
        if (l69 != null) {
            l69.a(this.x);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.y0 = j();
        k();
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z2 = !TextUtils.isEmpty(getText());
        if (z2 && (i3 = this.B0) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.A0;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!z2 && this.z != null) {
            super.setPadding((getMeasuredWidth() - this.z.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r7 r7Var;
        if (!this.x.hasSubMenu() || (r7Var = this.w0) == null || !r7Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.z0 != z2) {
            this.z0 = z2;
            u69 u69 = this.x;
            if (u69 != null) {
                m69 m69 = u69.w0;
                m69.Y = true;
                m69.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.z = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.C0;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        k();
    }

    public void setItemInvoker(l69 l69) {
        this.v0 = l69;
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        this.B0 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(s7 s7Var) {
        this.x0 = s7Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.y = charSequence;
        k();
    }
}
