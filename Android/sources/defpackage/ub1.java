package defpackage;

import android.animation.StateListAnimator;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: ub1  reason: default package */
public final /* synthetic */ class ub1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallLinkInfoScreen b;

    public /* synthetic */ ub1(CallLinkInfoScreen callLinkInfoScreen, int i) {
        this.a = i;
        this.b = callLinkInfoScreen;
    }

    public final Object invoke(Object obj) {
        js9 js9 = fu4.k;
        CallLinkInfoScreen callLinkInfoScreen = this.b;
        switch (this.a) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                KProperty[] kPropertyArr = CallLinkInfoScreen.z0;
                callLinkInfoScreen.getClass();
                AppBarLayout appBarLayout = new AppBarLayout(coordinatorLayout.getContext(), (AttributeSet) null);
                appBarLayout.setId(kqa.l);
                appBarLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                appBarLayout.setBackground((Drawable) null);
                appBarLayout.setStateListAnimator((StateListAnimator) null);
                ub1 ub1 = new ub1(callLinkInfoScreen, 1);
                i53 i53 = new i53(appBarLayout.getContext(), (AttributeSet) null);
                dn dnVar = new dn(-1, -2);
                dnVar.a = 19;
                i53.setLayoutParams(dnVar);
                i53.setTitleEnabled(false);
                ub1.invoke(i53);
                appBarLayout.addView(i53);
                Unit unit = Unit.INSTANCE;
                coordinatorLayout.addView(appBarLayout);
                RecyclerView recyclerView = new RecyclerView(coordinatorLayout.getContext(), (AttributeSet) null);
                recyclerView.setId(kqa.j);
                wz3 wz3 = new wz3(-1, -1);
                wz3.b(new AppBarLayout.ScrollingViewBehavior());
                recyclerView.setLayoutParams(wz3);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setAdapter(callLinkInfoScreen.x0);
                recyclerView.setItemAnimator((yyc) null);
                float f = (float) 12;
                recyclerView.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(((float) 0) * vo4.c().getDisplayMetrics().density));
                recyclerView.j(new mnd(js9.e(recyclerView.getContext()).f(), new d9d(17, callLinkInfoScreen), (h9) null, 12));
                coordinatorLayout.addView(recyclerView);
                OneMeButton oneMeButton = new OneMeButton(coordinatorLayout.getContext(), (AttributeSet) null);
                oneMeButton.setId(kqa.m);
                oneMeButton.setSize(aqa.c);
                oneMeButton.setMode(zpa.a);
                oneMeButton.setAppearance(xpa.a);
                wz3 wz32 = new wz3(-1, -2);
                wz32.c = 81;
                wz32.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
                wz32.setMarginEnd(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
                wz32.bottomMargin = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
                wz32.topMargin = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
                oneMeButton.setLayoutParams(wz32);
                coordinatorLayout.addView(oneMeButton);
                b0h.H(coordinatorLayout, new x2(callLinkInfoScreen, (Continuation) null, 4));
                return Unit.INSTANCE;
            case 1:
                i53 i532 = (i53) obj;
                KProperty[] kPropertyArr2 = CallLinkInfoScreen.z0;
                ub1 ub12 = new ub1(callLinkInfoScreen, 2);
                callLinkInfoScreen.getClass();
                Toolbar toolbar = new Toolbar(i532.getContext(), (AttributeSet) null);
                f53 f53 = new f53(-1, -2);
                f53.a = 1;
                toolbar.setLayoutParams(f53);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                ub12.invoke(toolbar);
                i532.addView(toolbar);
                ub1 ub13 = new ub1(callLinkInfoScreen, 3);
                LinearLayout linearLayout = new LinearLayout(i532.getContext());
                linearLayout.setId(kqa.n);
                f53 f532 = new f53(-1, -2);
                f532.a = 2;
                f532.bottomMargin = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
                linearLayout.setLayoutParams(f532);
                linearLayout.setOrientation(1);
                ub13.invoke(linearLayout);
                i532.addView(linearLayout);
                return Unit.INSTANCE;
            case 2:
                Toolbar toolbar2 = (Toolbar) obj;
                KProperty[] kPropertyArr3 = CallLinkInfoScreen.z0;
                callLinkInfoScreen.getClass();
                h3b d = o54.d(toolbar2.getContext(), (AttributeSet) null);
                d.setId(kqa.s);
                d.setForm(z2b.a);
                d.setTextShimmerEnabled(false);
                d.setLeftActions(new p2b(new h9(23)));
                float f2 = (float) 6;
                d.setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), d.getPaddingTop(), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), d.getPaddingBottom());
                toolbar2.addView(d);
                return Unit.INSTANCE;
            default:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                KProperty[] kPropertyArr4 = CallLinkInfoScreen.z0;
                callLinkInfoScreen.getClass();
                OneMeAvatarView oneMeAvatarView = new OneMeAvatarView(linearLayout2.getContext(), (AttributeSet) null);
                oneMeAvatarView.setId(kqa.q);
                oneMeAvatarView.setAvatarShape(ioa.a);
                float f3 = (float) 72;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
                layoutParams.gravity = 1;
                layoutParams.topMargin = MathKt.roundToInt(((float) 32) * vo4.c().getDisplayMetrics().density);
                oneMeAvatarView.setLayoutParams(layoutParams);
                linearLayout2.addView(oneMeAvatarView);
                TextView textView = new TextView(linearLayout2.getContext());
                textView.setId(kqa.t);
                puf.c.b(textView, uy4.b);
                textView.setTextColor(js9.e(textView.getContext()).f().getText().e);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(17);
                float f4 = (float) 12;
                textView.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4), MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density));
                textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                linearLayout2.addView(textView);
                TextView textView2 = new TextView(linearLayout2.getContext());
                textView2.setId(kqa.r);
                puf.j.b(textView2, uy4.b);
                js9.e(textView2.getContext()).f().getText().getClass();
                textView2.setTextColor(-16745729);
                textView2.setGravity(17);
                textView2.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4), 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4), MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density));
                textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                gsg.h(textView2);
                linearLayout2.addView(textView2);
                TextView textView3 = new TextView(linearLayout2.getContext());
                textView3.setId(kqa.p);
                puf.o.b(textView3, uy4.b);
                textView3.setTextColor(js9.e(textView3.getContext()).f().getText().h);
                textView3.setGravity(17);
                textView3.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4), 0, MathKt.roundToInt(f4 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 0) * vo4.c().getDisplayMetrics().density));
                textView3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                linearLayout2.addView(textView3);
                return Unit.INSTANCE;
        }
    }
}
