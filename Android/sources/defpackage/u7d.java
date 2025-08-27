package defpackage;

import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.android.root.RootController;

/* renamed from: u7d  reason: default package */
public final /* synthetic */ class u7d implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RootController b;

    public /* synthetic */ u7d(RootController rootController, int i) {
        this.a = i;
        this.b = rootController;
    }

    public final Object invoke() {
        RootController rootController = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = RootController.z;
                oz1 a2 = kv0.a(rootController.getContext());
                a2.setId(dgc.root_screen);
                wz3 wz3 = new wz3(-1, -1);
                wz3.b(new AppBarLayout.ScrollingViewBehavior());
                a2.setLayoutParams(wz3);
                return a2;
            default:
                KProperty[] kPropertyArr2 = RootController.z;
                oz1 a3 = kv0.a(rootController.getContext());
                a3.setId(dgc.root_top_indicator);
                a3.setLayoutParams(new wz3(-1, -2));
                a3.setTranslationY(-((float) MathKt.roundToInt(((float) 100) * vo4.c().getDisplayMetrics().density)));
                return a3;
        }
    }
}
