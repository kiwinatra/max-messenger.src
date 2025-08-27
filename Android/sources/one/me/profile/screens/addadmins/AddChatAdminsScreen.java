package one.me.profile.screens.addadmins;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/profile/screens/addadmins/AddChatAdminsScreen;", "Lone/me/sdk/arch/Widget;", "Lmza;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAddChatAdminsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddChatAdminsScreen.kt\none/me/profile/screens/addadmins/AddChatAdminsScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,191:1\n420#2:192\n235#2,10:193\n410#2,8:207\n1#3:203\n28#4:204\n256#5,2:205\n*S KotlinDebug\n*F\n+ 1 AddChatAdminsScreen.kt\none/me/profile/screens/addadmins/AddChatAdminsScreen\n*L\n49#1:192\n53#1:193,10\n154#1:207,8\n125#1:204\n126#1:205,2\n*E\n"})
@SuppressLint({"ValidController"})
public final class AddChatAdminsScreen extends Widget implements mza {
    public static final /* synthetic */ KProperty[] w0;
    public final List X;
    public final vs6 Y;
    public final aa Z;
    public final w28 a;
    public final yh7 b;
    public final is c;
    public final String o;
    public final Lazy v;
    public m56 v0;
    public final ReadOnlyProperty w;
    public final ReadOnlyProperty x;
    public final ReadOnlyProperty y;
    public final boolean z;

    static {
        Class<AddChatAdminsScreen> cls = AddChatAdminsScreen.class;
        w0 = new KProperty[]{wj6.p(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "tabsView", "getTabsView()Lone/me/common/tablayout/OneMeTabLayout;", 0), wj6.p(cls, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};
    }

    public AddChatAdminsScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        List listOf;
        this.a = new w28(new m(1), (Function0) null, 6);
        this.b = yh7.d;
        this.c = new is(Long.class, "profile:add_admins:chat_id");
        String j = wj6.j(c0(), "profile:add_admins:{", "}");
        this.o = j;
        this.v = createViewModelLazy(i49.class, new s(2, new j6(2, this)));
        this.w = viewBinding(jxa.f);
        this.x = viewBinding(jxa.e);
        this.y = viewBinding(jxa.g);
        boolean p = ((vj5) ((uj5) jxb.a.g().getValue())).p();
        this.z = p;
        if (p) {
            listOf = CollectionsKt.listOf(new da(jxa.c, lxa.O, ca.a));
        } else {
            listOf = CollectionsKt.listOf(new da(jxa.c, lxa.O, ca.a), new da(jxa.d, lxa.P, ca.b));
        }
        List list = listOf;
        this.X = list;
        this.Y = new vs6(2, (Object) list);
        this.Z = new aa(c0(), j, list, this);
    }

    public final void C(CharSequence charSequence) {
        ((i49) this.v.getValue()).n(String.valueOf(charSequence));
    }

    public final void L() {
        ((i49) this.v.getValue()).n((String) null);
    }

    public final long c0() {
        KProperty kProperty = w0[0];
        return ((Number) this.c.a(this)).longValue();
    }

    public final yh7 getInsetsConfig() {
        return this.b;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m1557getScopeIdIluPPks() {
        return this.o;
    }

    public final pgd getScreenDelegate() {
        return this.a;
    }

    public final void n() {
        ((i49) this.v.getValue()).n((String) null);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        h3b d = o54.d(linearLayout.getContext(), (AttributeSet) null);
        d.setId(jxa.f);
        d.setTitle(lxa.Q);
        d.setLeftActions(new q2b(new l(3, this)));
        d.setRightActions(new u2b((d3b) null, new c3b(this)));
        linearLayout.addView(d);
        c2b c2b = new c2b(linearLayout.getContext(), (AttributeSet) null);
        c2b.setId(jxa.e);
        c2b.setLayoutParams(new dn(-1, -2));
        c2b.setTabMode(1);
        c2b.setElevation(vo4.c().getDisplayMetrics().density * 10.0f);
        c2b.setVisibility(this.z ^ true ? 0 : 8);
        linearLayout.addView(c2b);
        ViewPager2 viewPager2 = new ViewPager2(linearLayout.getContext());
        viewPager2.setId(jxa.g);
        viewPager2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        hsg.m(viewPager2);
        linearLayout.addView(viewPager2);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        KProperty[] kPropertyArr = w0;
        kr7.C((h3b) this.w.getValue(this, kPropertyArr[1]));
        if (!requireActivity().isChangingConfigurations()) {
            ((ViewPager2) this.y.getValue(this, kPropertyArr[3])).setAdapter((tyc) null);
        }
        m56 m56 = this.v0;
        if (m56 != null) {
            m56.f();
        }
        this.v0 = null;
    }

    public final void onViewCreated(View view) {
        KProperty[] kPropertyArr = w0;
        KProperty kProperty = kPropertyArr[3];
        ReadOnlyProperty readOnlyProperty = this.y;
        ViewPager2 viewPager2 = (ViewPager2) readOnlyProperty.getValue(this, kProperty);
        viewPager2.setAdapter(this.Z);
        viewPager2.setOffscreenPageLimit(1);
        if (!this.z) {
            c2b c2b = (c2b) this.x.getValue(this, kPropertyArr[2]);
            vs6 vs6 = this.Y;
            vs6.getClass();
            m56 m56 = new m56(c2b, (ViewPager2) readOnlyProperty.getValue(this, kPropertyArr[3]), true, new ba(0, vs6, c2b));
            m56.d();
            this.v0 = m56;
        }
        bs0.K(new ps5(ct.k(((i49) this.v.getValue()).v, getViewLifecycleOwner().getLifecycle(), iu7.o), new ea((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public AddChatAdminsScreen(long j) {
        this(o54.f(TuplesKt.to("profile:add_admins:chat_id", Long.valueOf(j))));
    }
}
