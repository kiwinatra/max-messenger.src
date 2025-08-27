package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import java.util.WeakHashMap;

public class NavigationMenuItemView extends p96 implements k79 {
    public static final int[] D0 = {16842912};
    public boolean A0;
    public Drawable B0;
    public final el0 C0;
    public final boolean v0 = true;
    public final CheckedTextView w0;
    public int x;
    public FrameLayout x0;
    public boolean y;
    public u69 y0;
    public boolean z;
    public ColorStateList z0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        el0 el0 = new el0(5, this);
        this.C0 = el0;
        setOrientation(0);
        LayoutInflater.from(context).inflate(qjc.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(iec.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(agc.design_menu_item_text);
        this.w0 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        gag.j(checkedTextView, el0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.x0 == null) {
                this.x0 = (FrameLayout) ((ViewStub) findViewById(agc.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.x0.removeAllViews();
            this.x0.addView(view);
        }
    }

    public final void d(u69 u69) {
        StateListDrawable stateListDrawable;
        this.y0 = u69;
        int i = u69.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(u69.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(hdc.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(D0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = gag.a;
            setBackground(stateListDrawable);
        }
        setCheckable(u69.isCheckable());
        setChecked(u69.isChecked());
        setEnabled(u69.isEnabled());
        setTitle(u69.v);
        setIcon(u69.getIcon());
        setActionView(u69.getActionView());
        setContentDescription(u69.z0);
        pmf.a(this, u69.A0);
        u69 u692 = this.y0;
        CharSequence charSequence = u692.v;
        CheckedTextView checkedTextView = this.w0;
        if (charSequence == null && u692.getIcon() == null && this.y0.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.x0;
            if (frameLayout != null) {
                xv7 xv7 = (xv7) frameLayout.getLayoutParams();
                xv7.width = -1;
                this.x0.setLayoutParams(xv7);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.x0;
        if (frameLayout2 != null) {
            xv7 xv72 = (xv7) frameLayout2.getLayoutParams();
            xv72.width = -2;
            this.x0.setLayoutParams(xv72);
        }
    }

    public u69 getItemData() {
        return this.y0;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        u69 u69 = this.y0;
        if (u69 != null && u69.isCheckable() && this.y0.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, D0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.z != z2) {
            this.z = z2;
            this.C0.h(this.w0, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.w0;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (!z2 || !this.v0) ? 0 : 1);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.A0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                ru4.h(drawable, this.z0);
            }
            int i = this.x;
            drawable.setBounds(0, 0, i, i);
        } else if (this.y) {
            if (this.B0 == null) {
                Resources resources = getResources();
                int i2 = qfc.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = h4d.a;
                Drawable a = c4d.a(resources, i2, theme);
                this.B0 = a;
                if (a != null) {
                    int i3 = this.x;
                    a.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.B0;
        }
        this.w0.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.w0.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.x = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.z0 = colorStateList;
        this.A0 = colorStateList != null;
        u69 u69 = this.y0;
        if (u69 != null) {
            setIcon(u69.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.w0.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.y = z2;
    }

    public void setTextAppearance(int i) {
        this.w0.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.w0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.w0.setText(charSequence);
    }
}
