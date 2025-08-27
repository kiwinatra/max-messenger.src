package defpackage;

import android.animation.StateListAnimator;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import kotlin.uuid.Uuid;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: n0c  reason: default package */
public final /* synthetic */ class n0c implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileEditScreen b;

    public /* synthetic */ n0c(ProfileEditScreen profileEditScreen, int i) {
        this.a = i;
        this.b = profileEditScreen;
    }

    public final Object invoke(Object obj) {
        ProfileEditScreen profileEditScreen = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                KProperty[] kPropertyArr = ProfileEditScreen.w0;
                fma onBackPressedDispatcher = profileEditScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return Unit.INSTANCE;
            case 1:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                KProperty[] kPropertyArr2 = ProfileEditScreen.w0;
                profileEditScreen.getClass();
                AppBarLayout appBarLayout = new AppBarLayout(coordinatorLayout.getContext(), (AttributeSet) null);
                appBarLayout.setId(fxa.U);
                appBarLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                appBarLayout.setBackground((Drawable) null);
                appBarLayout.setLiftOnScroll(true);
                appBarLayout.setStateListAnimator((StateListAnimator) null);
                KProperty[] kPropertyArr3 = ProfileEditScreen.w0;
                n0c n0c = new n0c(profileEditScreen, 2);
                profileEditScreen.getClass();
                i53 i53 = new i53(appBarLayout.getContext(), (AttributeSet) null);
                i53.setId(View.generateViewId());
                dn dnVar = new dn(-1, -2);
                dnVar.a = 19;
                i53.setLayoutParams(dnVar);
                i53.setTitleEnabled(false);
                n0c.invoke(i53);
                appBarLayout.addView(i53);
                Unit unit = Unit.INSTANCE;
                coordinatorLayout.addView(appBarLayout);
                RecyclerView recyclerView = new RecyclerView(coordinatorLayout.getContext(), (AttributeSet) null);
                recyclerView.setId(fxa.r0);
                wz3 wz3 = new wz3(-1, -1);
                wz3.b(new AppBarLayout.ScrollingViewBehavior());
                recyclerView.setLayoutParams(wz3);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setClipToPadding(false);
                recyclerView.setClipChildren(false);
                recyclerView.setAdapter(profileEditScreen.v);
                recyclerView.setItemAnimator((yyc) null);
                int[] iArr = {2048, Uuid.SIZE_BITS, 1, 2, ConstantsKt.MINIMUM_BLOCK_SIZE};
                ez9 ez9 = ri7.a;
                ez9 ez92 = new ez9(5);
                for (int i = 0; i < 5; i++) {
                    ez92.g(iArr[i]);
                }
                recyclerView.j(new mnd(fu4.k.e(recyclerView.getContext()).f(), new pbb(4, profileEditScreen, ez92), (h9) null, 12));
                recyclerView.j(new ue8(0));
                Unit unit2 = Unit.INSTANCE;
                coordinatorLayout.addView(recyclerView);
                return Unit.INSTANCE;
            case 2:
                i53 i532 = (i53) obj;
                KProperty[] kPropertyArr4 = ProfileEditScreen.w0;
                n0c n0c2 = new n0c(profileEditScreen, 3);
                profileEditScreen.getClass();
                Toolbar toolbar = new Toolbar(i532.getContext(), (AttributeSet) null);
                toolbar.setId(View.generateViewId());
                f53 f53 = new f53(-1, -2);
                f53.a = 1;
                toolbar.setLayoutParams(f53);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                n0c2.invoke(toolbar);
                i532.addView(toolbar);
                n0c n0c3 = new n0c(profileEditScreen, 4);
                LinearLayout linearLayout = new LinearLayout(i532.getContext());
                linearLayout.setId(fxa.b0);
                f53 f532 = new f53(-1, -2);
                f532.a = 2;
                f532.bottomMargin = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
                linearLayout.setLayoutParams(f532);
                linearLayout.setOrientation(1);
                n0c3.invoke(linearLayout);
                i532.addView(linearLayout);
                return Unit.INSTANCE;
            case 3:
                Toolbar toolbar2 = (Toolbar) obj;
                KProperty[] kPropertyArr5 = ProfileEditScreen.w0;
                profileEditScreen.getClass();
                h3b d = o54.d(toolbar2.getContext(), (AttributeSet) null);
                d.setId(fxa.q0);
                d.setForm(z2b.a);
                d.setLeftActions(new p2b(new n0c(profileEditScreen, 0)));
                d.setRightActions(s2b.a);
                toolbar2.addView(d);
                return Unit.INSTANCE;
            case 4:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                KProperty[] kPropertyArr6 = ProfileEditScreen.w0;
                profileEditScreen.getClass();
                OneMeAvatarView oneMeAvatarView = new OneMeAvatarView(linearLayout2.getContext(), (AttributeSet) null);
                oneMeAvatarView.setId(fxa.V);
                float f = (float) 96;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
                layoutParams.gravity = 1;
                layoutParams.topMargin = MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
                oneMeAvatarView.setLayoutParams(layoutParams);
                oneMeAvatarView.setAddBadgeVisibility(false);
                ct.G(oneMeAvatarView, 300, new o0c(profileEditScreen, 0));
                linearLayout2.addView(oneMeAvatarView);
                return Unit.INSTANCE;
            default:
                View view2 = (View) obj;
                KProperty[] kPropertyArr7 = ProfileEditScreen.w0;
                profileEditScreen.d0().n();
                return Unit.INSTANCE;
        }
    }
}
