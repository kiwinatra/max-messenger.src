package defpackage;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.settings.SettingsListScreen;

/* renamed from: a2e  reason: default package */
public final /* synthetic */ class a2e implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsListScreen b;

    public /* synthetic */ a2e(SettingsListScreen settingsListScreen, int i) {
        this.a = i;
        this.b = settingsListScreen;
    }

    public final Object invoke(Object obj) {
        SettingsListScreen settingsListScreen = this.b;
        switch (this.a) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                KProperty[] kPropertyArr = SettingsListScreen.y0;
                settingsListScreen.getClass();
                AppBarLayout appBarLayout = new AppBarLayout(coordinatorLayout.getContext(), (AttributeSet) null);
                appBarLayout.setId(wza.g);
                appBarLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                b0h.H(appBarLayout, new e8a(3, (Continuation) null, 1));
                settingsListScreen.v0 = appBarLayout;
                appBarLayout.setLiftOnScroll(true);
                a2e a2e = new a2e(settingsListScreen, 1);
                i53 i53 = new i53(appBarLayout.getContext(), (AttributeSet) null);
                i53.setId(wza.e);
                dn dnVar = new dn(-1, -2);
                dnVar.a = 19;
                i53.setLayoutParams(dnVar);
                i53.setTitleEnabled(false);
                a2e.invoke(i53);
                appBarLayout.addView(i53);
                Unit unit = Unit.INSTANCE;
                coordinatorLayout.addView(appBarLayout);
                RecyclerView e0 = settingsListScreen.e0(24);
                wz3 wz3 = new wz3(-1, -1);
                wz3.b(new AppBarLayout.ScrollingViewBehavior());
                e0.setLayoutParams(wz3);
                e0.setPaddingRelative(e0.getPaddingStart(), e0.getPaddingTop(), e0.getPaddingEnd(), MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density));
                e0.setClipToPadding(false);
                e0.setItemAnimator((yyc) null);
                e0.setClipChildren(false);
                e0.j(new fr(8));
                e0.j(new fr(9));
                coordinatorLayout.addView(e0);
                return Unit.INSTANCE;
            case 1:
                i53 i532 = (i53) obj;
                KProperty[] kPropertyArr2 = SettingsListScreen.y0;
                a2e a2e2 = new a2e(settingsListScreen, 2);
                settingsListScreen.getClass();
                Toolbar toolbar = new Toolbar(i532.getContext(), (AttributeSet) null);
                toolbar.setId(wza.h);
                f53 f53 = new f53(-1, -2);
                f53.a = 1;
                toolbar.setLayoutParams(f53);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                a2e2.invoke(toolbar);
                i532.addView(toolbar);
                a4e a4e = new a4e(i532.getContext());
                Unit unit2 = Unit.INSTANCE;
                i532.addView(a4e);
                return Unit.INSTANCE;
            case 2:
                Toolbar toolbar2 = (Toolbar) obj;
                KProperty[] kPropertyArr3 = SettingsListScreen.y0;
                settingsListScreen.getClass();
                h3b d = o54.d(toolbar2.getContext(), (AttributeSet) null);
                d.setId(wza.i);
                d.setForm(z2b.a);
                d.setRightActions(new u2b((d3b) null, new a3b(cad.G, new a2e(settingsListScreen, 3))));
                d.setLeftActions(new t2b(new a3b(cad.N1, new duc(8))));
                Unit unit3 = Unit.INSTANCE;
                toolbar2.addView(d);
                return Unit.INSTANCE;
            default:
                View view = (View) obj;
                KProperty[] kPropertyArr4 = SettingsListScreen.y0;
                wyd g0 = settingsListScreen.g0();
                Long m = g0.m();
                if (m != null) {
                    xag.h(g0.v0, new v2e(m.longValue()));
                }
                return Unit.INSTANCE;
        }
    }
}
