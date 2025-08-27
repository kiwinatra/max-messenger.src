package one.me.profile.screens.changeowner;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.members.list.MembersListWidget;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lone/me/profile/screens/changeowner/ChangeOwnerScreen;", "Lone/me/sdk/arch/Widget;", "Lmza;", "Lqg3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "", "leaveFromChat", "(JZ)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nChangeOwnerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeOwnerScreen.kt\none/me/profile/screens/changeowner/ChangeOwnerScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n420#2:229\n420#2:230\n235#2,10:231\n235#2,10:241\n410#2,8:252\n410#2,8:260\n410#2,8:268\n1#3:251\n*S KotlinDebug\n*F\n+ 1 ChangeOwnerScreen.kt\none/me/profile/screens/changeowner/ChangeOwnerScreen\n*L\n55#1:229\n56#1:230\n60#1:231,10\n70#1:241,10\n117#1:252,8\n130#1:260,8\n162#1:268,8\n*E\n"})
@SuppressLint({"ValidController"})
public final class ChangeOwnerScreen extends Widget implements mza, qg3 {
    public static final /* synthetic */ KProperty[] X;
    public final w28 a;
    public final yh7 b;
    public final is c;
    public final is o;
    public final String v;
    public final Lazy w;
    public final Lazy x;
    public final ReadOnlyProperty y;
    public final ReadOnlyProperty z;

    static {
        Class<ChangeOwnerScreen> cls = ChangeOwnerScreen.class;
        X = new KProperty[]{wj6.p(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), wj6.p(cls, "leaveFromChat", "getLeaveFromChat()Z", 0), wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    }

    public ChangeOwnerScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = new w28(new lj1(21), (Function0) null, 6);
        this.b = yh7.d;
        this.c = new is(Long.class, "chat_id");
        this.o = new is(Boolean.class, "leave_chat");
        this.v = wj6.j(c0(), "profile:chatMembersList:{", "}");
        this.w = createViewModelLazy(t02.class, new s(17, new nm1(3, this)));
        this.x = createViewModelLazy(i49.class, new s(18, new lj1(22)));
        this.y = viewBinding(jxa.t);
        this.z = childSlotRouter(jxa.s);
    }

    public final void C(CharSequence charSequence) {
        ((i49) this.x.getValue()).n(String.valueOf(charSequence));
    }

    public final void L() {
        ((i49) this.x.getValue()).n((String) null);
    }

    public final long c0() {
        KProperty kProperty = X[0];
        return ((Number) this.c.a(this)).longValue();
    }

    public final boolean d0() {
        KProperty kProperty = X[1];
        return ((Boolean) this.o.a(this)).booleanValue();
    }

    public final void g(int i, Bundle bundle) {
        if (i == jxa.q && bundle != null) {
            long j = bundle.getLong("new_owner_id");
            t02 t02 = (t02) this.w.getValue();
            boolean d0 = d0();
            long j2 = t02.b;
            a32 a32 = (a32) ((my2) ((qx2) t02.o.getValue())).o(j2).a.getValue();
            if (a32 != null) {
                ((jna) ((rl) t02.c.getValue())).i(t02.b, a32.b.a, j);
                s85 s85 = t02.y;
                if (d0) {
                    xag.g(t02, ((osa) ((gaf) t02.w.getValue())).b(), (f14) null, new s02(t02, (Continuation) null), 2);
                    xag.h(s85, new q02(new igf(lxa.d0), Integer.valueOf(cad.B)));
                    return;
                }
                xag.h(s85, new q02(new igf(lxa.k0), Integer.valueOf(cad.B)));
                xag.h(t02.x, new b5c(j2, txb.LOCAL_CHAT));
            }
        }
    }

    public final yh7 getInsetsConfig() {
        return this.b;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m1558getScopeIdIluPPks() {
        return this.v;
    }

    public final pgd getScreenDelegate() {
        return this.a;
    }

    public final void n() {
        ((i49) this.x.getValue()).n((String) null);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        h3b d = o54.d(linearLayout.getContext(), (AttributeSet) null);
        d.setId(jxa.t);
        d.setTitle(lxa.m0);
        d.setLeftActions(new p2b(new l(22, this)));
        d.setRightActions(new u2b((d3b) null, new c3b(this)));
        linearLayout.addView(d);
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setId(jxa.s);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(frameLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        kr7.C((h3b) this.y.getValue(this, X[2]));
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        mz2 mz2 = (mz2) this.z.getValue(this, X[3]);
        if (!Intrinsics.areEqual((Object) mz2.b(), (Object) "change_owner_widget")) {
            i9d i9d = new i9d(new MembersListWidget(this.v, new w39(c0(), ij2.MEMBER, (Integer) null, 12), (DefaultConstructorMarker) null), (String) null, (ey3) null, (ey3) null, false, -1);
            i9d.d("change_owner_widget");
            mz2.a.R(i9d);
        }
        s85 s85 = ((i49) this.x.getValue()).v;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(s85, getViewLifecycleOwner().getLifecycle(), iu7), new n02((Continuation) null, this), 5), getViewLifecycleScope());
        Lazy lazy = this.w;
        bs0.K(new ps5(ct.k(((t02) lazy.getValue()).x, getViewLifecycleOwner().getLifecycle(), iu7), new o02((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(((t02) lazy.getValue()).y, getViewLifecycleOwner().getLifecycle(), iu7), new p02((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public ChangeOwnerScreen(long j, boolean z2) {
        this(o54.f(TuplesKt.to("chat_id", Long.valueOf(j)), TuplesKt.to("leave_chat", Boolean.valueOf(z2))));
    }
}
