package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;

/* renamed from: omf  reason: default package */
public final class omf implements ha4 {
    public final Toolbar a;
    public int b;
    public final View c;
    public Drawable d;
    public Drawable e;
    public final Drawable f;
    public final boolean g;
    public CharSequence h;
    public final CharSequence i;
    public final CharSequence j;
    public Window.Callback k;
    public boolean l;
    public w7 m;
    public final int n = 0;
    public final Drawable o;

    public omf(Toolbar toolbar, boolean z) {
        int i2;
        Drawable drawable;
        int i3 = zmc.abc_action_bar_up_description;
        this.a = toolbar;
        this.h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        this.g = this.h != null;
        this.f = toolbar.getNavigationIcon();
        String str = null;
        g6d w = g6d.w(toolbar.getContext(), (AttributeSet) null, koc.ActionBar, hdc.actionBarStyle, 0);
        this.o = w.q(koc.ActionBar_homeAsUpIndicator);
        if (z) {
            int i4 = koc.ActionBar_title;
            TypedArray typedArray = (TypedArray) w.c;
            CharSequence text = typedArray.getText(i4);
            if (!TextUtils.isEmpty(text)) {
                this.g = true;
                this.h = text;
                if ((this.b & 8) != 0) {
                    Toolbar toolbar2 = this.a;
                    toolbar2.setTitle(text);
                    if (this.g) {
                        gag.k(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(koc.ActionBar_subtitle);
            if (!TextUtils.isEmpty(text2)) {
                this.i = text2;
                if ((this.b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable q = w.q(koc.ActionBar_logo);
            if (q != null) {
                this.e = q;
                c();
            }
            Drawable q2 = w.q(koc.ActionBar_icon);
            if (q2 != null) {
                this.d = q2;
                c();
            }
            if (this.f == null && (drawable = this.o) != null) {
                this.f = drawable;
                int i5 = this.b & 4;
                Toolbar toolbar3 = this.a;
                if (i5 != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(koc.ActionBar_displayOptions, 0));
            int resourceId = typedArray.getResourceId(koc.ActionBar_customNavigationLayout, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, toolbar, false);
                View view = this.c;
                if (!(view == null || (this.b & 16) == 0)) {
                    toolbar.removeView(view);
                }
                this.c = inflate;
                if (!(inflate == null || (this.b & 16) == 0)) {
                    toolbar.addView(inflate);
                }
                a(this.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(koc.ActionBar_height, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(koc.ActionBar_contentInsetStart, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(koc.ActionBar_contentInsetEnd, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                toolbar.u(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = typedArray.getResourceId(koc.ActionBar_titleTextStyle, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.x0 = resourceId2;
                AppCompatTextView appCompatTextView = toolbar.b;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(koc.ActionBar_subtitleTextStyle, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.y0 = resourceId3;
                AppCompatTextView appCompatTextView2 = toolbar.c;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(koc.ActionBar_popupTheme, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.o = toolbar.getNavigationIcon();
                i2 = 15;
            } else {
                i2 = 11;
            }
            this.b = i2;
        }
        w.x();
        if (i3 != this.n) {
            this.n = i3;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i6 = this.n;
                this.j = i6 != 0 ? toolbar.getContext().getString(i6) : str;
                b();
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new cr(this));
    }

    public final void a(int i2) {
        View view;
        int i3 = this.b ^ i2;
        this.b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    b();
                }
                int i4 = this.b & 4;
                Toolbar toolbar = this.a;
                if (i4 != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i3 & 3) != 0) {
                c();
            }
            int i5 = i3 & 8;
            Toolbar toolbar2 = this.a;
            if (i5 != 0) {
                if ((i2 & 8) != 0) {
                    toolbar2.setTitle(this.h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) != 0 && (view = this.c) != null) {
                if ((i2 & 16) != 0) {
                    toolbar2.addView(view);
                } else {
                    toolbar2.removeView(view);
                }
            }
        }
    }

    public final void b() {
        if ((this.b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i2 = this.b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.e;
            if (drawable == null) {
                drawable = this.d;
            }
        } else {
            drawable = this.d;
        }
        this.a.setLogo(drawable);
    }
}
