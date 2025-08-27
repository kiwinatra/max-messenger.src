package one.me.profile.screens.members;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
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

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/profile/screens/members/ChatAdminsScreen;", "Lone/me/sdk/arch/Widget;", "Lqg3;", "Lmza;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nChatAdminsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatAdminsScreen.kt\none/me/profile/screens/members/ChatAdminsScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 LazyExt.kt\none/me/sdk/kotlintools/delegates/LazyExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 7 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n*L\n1#1,279:1\n420#2:280\n235#2,10:281\n235#2,10:291\n5#3:301\n5#3:302\n1#4:303\n37#5,2:304\n135#6,3:306\n138#6,8:323\n33#7,14:309\n*S KotlinDebug\n*F\n+ 1 ChatAdminsScreen.kt\none/me/profile/screens/members/ChatAdminsScreen\n*L\n59#1:280\n63#1:281,10\n67#1:291,10\n83#1:301\n86#1:302\n226#1:304,2\n228#1:306,3\n228#1:323,8\n228#1:309,14\n*E\n"})
@SuppressLint({"ValidController"})
public final class ChatAdminsScreen extends Widget implements qg3, mza {
    public static final /* synthetic */ KProperty[] Z;
    public z3a X;
    public final ReadOnlyProperty Y;
    public final w28 a;
    public final yh7 b;
    public final is c;
    public final String o;
    public final Lazy v;
    public final Lazy w;
    public final Lazy x;
    public final Lazy y;
    public final ReadOnlyProperty z;

    static {
        Class<ChatAdminsScreen> cls = ChatAdminsScreen.class;
        Z = new KProperty[]{wj6.p(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    }

    public ChatAdminsScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = new w28(new lj1(24), (Function0) null, 6);
        this.b = yh7.d;
        this.c = new is(Long.class, "id");
        this.o = wj6.j(d0(), "profile:chatMembersList:{", "}");
        this.v = createViewModelLazy(q32.class, new s(19, new i32(this, 0)));
        this.w = createViewModelLazy(i49.class, new s(20, new i32(this, 1)));
        lj1 lj1 = new lj1(25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.x = LazyKt.lazy(lazyThreadSafetyMode, lj1);
        this.y = LazyKt.lazy(lazyThreadSafetyMode, new lj1(26));
        this.z = viewBinding(jxa.F0);
        s85 s85 = e0().v;
        ju7 lifecycle = this.lifecycleOwner.getLifecycle();
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(s85, lifecycle, iu7), new j32(this, (Continuation) null), 5), getLifecycleScope());
        bs0.K(new ps5(ct.k(c0().Z, this.lifecycleOwner.getLifecycle(), iu7), new wq0(2, this, ChatAdminsScreen.class, "processEvents", "processEvents(Lone/me/profile/screens/members/ProfileListMembersEvents;)V", 4, 3), 5), getLifecycleScope());
        this.Y = childSlotRouter(jxa.w0);
    }

    public final void C(CharSequence charSequence) {
        e0().n(String.valueOf(charSequence));
    }

    public final void L() {
        e0().n((String) null);
    }

    public final q32 c0() {
        return (q32) this.v.getValue();
    }

    public final long d0() {
        KProperty kProperty = Z[0];
        return ((Number) this.c.a(this)).longValue();
    }

    public final i49 e0() {
        return (i49) this.w.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r2 = r3.getLongArray("profile:adminslist:ids_to_delete");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(int r2, android.os.Bundle r3) {
        /*
            r1 = this;
            int r0 = defpackage.jxa.x0
            if (r2 != r0) goto L_0x003d
            if (r3 == 0) goto L_0x0013
            java.lang.String r2 = "profile:adminslist:ids_to_delete"
            long[] r2 = r3.getLongArray(r2)
            if (r2 == 0) goto L_0x0013
            java.util.List r2 = kotlin.collections.ArraysKt.toList((long[]) r2)
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            if (r2 != 0) goto L_0x001a
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L_0x001a:
            i49 r3 = r1.e0()
            java.util.Collection r2 = (java.util.Collection) r2
            r3.l(r2)
            q32 r1 = r1.c0()
            java.util.ArrayList r3 = r1.Y
            r3.addAll(r2)
            v3c r2 = new v3c
            int r3 = defpackage.lxa.Y1
            igf r0 = new igf
            r0.<init>(r3)
            r2.<init>(r0)
            s85 r1 = r1.Z
            defpackage.xag.h(r1, r2)
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.profile.screens.members.ChatAdminsScreen.g(int, android.os.Bundle):void");
    }

    public final yh7 getInsetsConfig() {
        return this.b;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m1559getScopeIdIluPPks() {
        return this.o;
    }

    public final pgd getScreenDelegate() {
        return this.a;
    }

    public final void n() {
        e0().n((String) null);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        h3b d = o54.d(linearLayout.getContext(), (AttributeSet) null);
        d.setId(jxa.F0);
        d.setTitle(lxa.p2);
        d.setLeftActions(new p2b(new l(23, this)));
        d.setRightActions(new u2b((d3b) null, new c3b(this)));
        linearLayout.addView(d);
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setId(jxa.w0);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(frameLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        kr7.C((h3b) this.z.getValue(this, Z[1]));
        z3a z3a = this.X;
        if (z3a != null) {
            z3a.o();
        }
        this.X = null;
        c0().k();
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        mz2 mz2 = (mz2) this.Y.getValue(this, Z[2]);
        if (!Intrinsics.areEqual((Object) mz2.b(), (Object) "admins_list_widget")) {
            i9d i9d = new i9d(new MembersListWidget(this.o, new w39(d0(), ij2.ADMIN, (Integer) null, 12), (DefaultConstructorMarker) null), (String) null, (ey3) null, (ey3) null, false, -1);
            i9d.d("admins_list_widget");
            mz2.a.R(i9d);
        }
    }

    public ChatAdminsScreen(long j) {
        this(o54.f(TuplesKt.to("id", Long.valueOf(j))));
    }
}
