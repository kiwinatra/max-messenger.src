package defpackage;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: hx3  reason: default package */
public class hx3 extends PopupWindow {
    public static final /* synthetic */ KProperty[] g = {rae.s(hx3.class, "customTheme", "getCustomTheme()Lru/ok/tamtam/themes/TamTheme;", 0)};
    public final ex3 a;
    public Function0 b;
    public final boolean c;
    public boolean d;
    public final float e;
    public final bl f;

    public /* synthetic */ hx3(Context context) {
        this(context, -2);
    }

    public final void a(scf scf) {
        Integer valueOf = Integer.valueOf(scf.n);
        Context context = getContentView().getContext();
        float dimension = context.getResources().getDimension(dec.bottom_sheet_corner_radius);
        setBackgroundDrawable(i8b.P(valueOf, (Integer) null, (Integer) null, new float[]{dimension, dimension, dimension, dimension, dimension, dimension, dimension, dimension}));
    }

    public final void b() {
        if (this.d) {
            View rootView = getContentView().getRootView();
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
            layoutParams.flags |= 2;
            layoutParams.dimAmount = this.e;
            f6e.v(getContentView()).updateViewLayout(rootView, layoutParams);
        }
    }

    public final void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
        b();
    }

    public final void showAtLocation(View view, int i, int i2, int i3) {
        super.showAtLocation(view, i, i2, i3);
        b();
    }

    public hx3(Context context, int i) {
        super(new ex3(context), i, -2);
        ex3 ex3 = (ex3) getContentView();
        this.a = ex3;
        this.c = true;
        this.d = true;
        this.e = 0.5f;
        Delegates delegates = Delegates.INSTANCE;
        this.f = new bl(9, this);
        setOnDismissListener(new w01(3, this));
        setFocusable(true);
        setElevation(vo4.c().getDisplayMetrics().density * 8.0f);
        scf customTheme = ex3.getCustomTheme();
        if (customTheme == null) {
            View contentView = getContentView();
            if (contentView.isInEditMode()) {
                customTheme = vi4.f0;
            } else {
                Context context2 = contentView.getContext();
                Lazy lazy = scf.b0;
                customTheme = j4b.k0(context2);
            }
        }
        a(customTheme);
    }
}
