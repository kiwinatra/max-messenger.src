package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import ru.ok.tamtam.stickers.panel.RelativePanelLayout;

/* renamed from: d8b  reason: default package */
public final class d8b implements e8b {
    public static final /* synthetic */ int k = 0;
    public int a = 0;
    public final Context b;
    public final c8b c;
    public final b8b d;
    public SharedPreferences e;
    public SharedPreferences.Editor f;
    public boolean g;
    public FrameLayout h;
    public int i;
    public final Rect j = new Rect();

    public d8b(Context context, c8b c8b, b8b b8b) {
        this.b = context;
        this.c = c8b;
        this.d = b8b;
    }

    public static Activity b(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            return b(((ContextThemeWrapper) context).getBaseContext());
        }
        return null;
    }

    public final void a(int i2) {
        FrameLayout frameLayout = this.h;
        RelativePanelLayout relativePanelLayout = (RelativePanelLayout) this.c;
        relativePanelLayout.getClass();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        if (relativePanelLayout.b == null) {
            relativePanelLayout.b = frameLayout;
            layoutParams = new RelativeLayout.LayoutParams(0, 0);
            layoutParams.addRule(12);
            relativePanelLayout.addView(frameLayout, layoutParams);
        }
        layoutParams.width = -1;
        layoutParams.height = i2;
        layoutParams.bottomMargin = -i2;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setVisibility(0);
        relativePanelLayout.setPadding(0, 0, 0, i2);
        if (this.h != null) {
            for (int i3 = 0; i3 < this.h.getChildCount(); i3++) {
                View childAt = this.h.getChildAt(i3);
                if (childAt.getVisibility() == 0 && (childAt instanceof f8b)) {
                    f8b f8b = (f8b) childAt;
                }
            }
        }
    }

    public final int c() {
        SharedPreferences sharedPreferences = this.e;
        Context context = this.b;
        if (sharedPreferences == null) {
            this.e = context.getSharedPreferences("emoji_prefs", 0);
        }
        int i2 = this.e.getInt(ld9.I(context) ? "key_keyboard_height_portrait" : "key_keyboard_height_landscape", 0);
        return i2 != 0 ? i2 : context.getResources().getDimensionPixelSize(cec.keyboard_height);
    }

    public final void d() {
        if (this.h != null && e()) {
            FrameLayout frameLayout = this.h;
            RelativePanelLayout relativePanelLayout = (RelativePanelLayout) this.c;
            relativePanelLayout.getClass();
            frameLayout.setVisibility(8);
            relativePanelLayout.setPadding(0, 0, 0, 0);
            for (int i2 = 0; i2 < this.h.getChildCount(); i2++) {
                this.h.getChildAt(i2).setVisibility(8);
            }
            b8b b8b = this.d;
            if (b8b != null) {
                b8b.c1(false);
            }
        }
    }

    public final boolean e() {
        FrameLayout frameLayout = this.h;
        return frameLayout != null && frameLayout.getVisibility() == 0;
    }

    public final void f() {
        if (this.h != null) {
            for (int i2 = 0; i2 < this.h.getChildCount(); i2++) {
                View childAt = this.h.getChildAt(i2);
                if (childAt instanceof f8b) {
                    cpe cpe = (cpe) ((f8b) childAt);
                    o54.k(cpe.Q0);
                    o54.k(cpe.R0);
                    o54.k(cpe.S0);
                }
            }
        }
    }

    public final void g() {
        if (this.h != null) {
            for (int i2 = 0; i2 < this.h.getChildCount(); i2++) {
                View childAt = this.h.getChildAt(i2);
                if (childAt instanceof f8b) {
                    ((cpe) ((f8b) childAt)).L();
                }
            }
        }
    }

    public final void h(f8b f8b) {
        FrameLayout frameLayout = this.h;
        Context context = this.b;
        if (frameLayout == null) {
            this.h = new FrameLayout(context);
        }
        b8b b8b = this.d;
        if (b8b != null) {
            b8b.o0();
        }
        if (f8b != null) {
            for (int i2 = 0; i2 < this.h.getChildCount(); i2++) {
                View childAt = this.h.getChildAt(i2);
                if (childAt == f8b) {
                    childAt.setVisibility(0);
                } else {
                    childAt.setVisibility(8);
                }
            }
        }
        if (this.g) {
            this.a = 2;
            hd8.B(b(context));
        } else {
            a(c());
        }
        if (b8b != null) {
            b8b.c1(true);
        }
    }
}
