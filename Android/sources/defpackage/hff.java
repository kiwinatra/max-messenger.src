package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* renamed from: hff  reason: default package */
public final class hff extends PopupWindow {
    public static final int r = MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density);
    public final Context a;
    public final View b;
    public final Function1 c;
    public final Function1 d;
    public final View e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final ImageView j;
    public final FrameLayout k;
    public final RecyclerView l;
    public final LinearLayout m;
    public int n = -1;
    public final xw3 o;
    public AnimatorSet p;
    public AnimatorSet q;

    public hff(Context context, View view, zw3 zw3, zw3 zw32) {
        this.a = context;
        this.b = view;
        this.c = zw3;
        this.d = zw32;
        View inflate = LayoutInflater.from(context).inflate(ijc.popup_menu, (ViewGroup) null, false);
        this.e = inflate;
        TextView textView = (TextView) inflate.findViewById(nic.cut);
        this.f = textView;
        TextView textView2 = (TextView) inflate.findViewById(nic.copy);
        this.g = textView2;
        TextView textView3 = (TextView) inflate.findViewById(nic.paste);
        this.h = textView3;
        TextView textView4 = (TextView) inflate.findViewById(nic.select_all);
        this.i = textView4;
        ImageView imageView = (ImageView) inflate.findViewById(nic.extendedMenu);
        this.j = imageView;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(nic.root);
        this.k = frameLayout;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(nic.menu_list);
        this.l = recyclerView;
        this.m = (LinearLayout) inflate.findViewById(nic.menu);
        setHeight(-2);
        setWidth(-2);
        setOutsideTouchable(true);
        setContentView(inflate);
        frameLayout.setElevation(vo4.c().getDisplayMetrics().density * 3.0f);
        ct.G(textView, 300, new eff(this, 0));
        ct.G(textView2, 300, new eff(this, 1));
        ct.G(textView3, 300, new eff(this, 2));
        ct.G(textView4, 300, new eff(this, 3));
        ct.G(imageView, 300, new eff(this, 4));
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        this.o = new xw3(new jkb(27, (Object) this), new lce(12, this));
    }

    public final void a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        int i2 = 8;
        this.f.setVisibility(z ? 0 : 8);
        this.g.setVisibility(z2 ? 0 : 8);
        this.h.setVisibility(z3 ? 0 : 8);
        this.i.setVisibility(z4 ? 0 : 8);
        if (z5) {
            i2 = 0;
        }
        this.j.setVisibility(i2);
    }
}
