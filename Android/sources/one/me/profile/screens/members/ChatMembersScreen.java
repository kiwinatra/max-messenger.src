package one.me.profile.screens.members;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lone/me/profile/screens/members/ChatMembersScreen;", "Lone/me/sdk/arch/Widget;", "Lqg3;", "Lmza;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "Lij2;", "chatMemberType", "(JLij2;)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nChatMembersScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatMembersScreen.kt\none/me/profile/screens/members/ChatMembersScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 6 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n*L\n1#1,314:1\n420#2:315\n235#2,10:316\n235#2,10:326\n410#2,8:337\n1#3:336\n37#4,2:345\n135#5,3:347\n138#5,8:364\n33#6,14:350\n*S KotlinDebug\n*F\n+ 1 ChatMembersScreen.kt\none/me/profile/screens/members/ChatMembersScreen\n*L\n60#1:315\n64#1:316,10\n68#1:326,10\n185#1:337,8\n245#1:345,2\n247#1:347,3\n247#1:364,8\n247#1:350,14\n*E\n"})
@SuppressLint({"ValidController"})
public final class ChatMembersScreen extends Widget implements qg3, mza {
    public static final /* synthetic */ KProperty[] X;
    public final w28 a;
    public final yh7 b;
    public final is c;
    public final String o;
    public final Lazy v;
    public final Lazy w;
    public final ReadOnlyProperty x;
    public final ReadOnlyProperty y;
    public z3a z;

    static {
        Class<ChatMembersScreen> cls = ChatMembersScreen.class;
        X = new KProperty[]{wj6.p(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    }

    public ChatMembersScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = new w28(new r52(16), (Function0) null, 6);
        this.b = yh7.d;
        this.c = new is(Long.class, "profile:memberslist:id");
        this.o = wj6.j(c0(), "profile:chatMembersList:{", "}");
        this.v = createViewModelLazy(lk2.class, new s(26, new uj2(this, 0)));
        this.w = createViewModelLazy(i49.class, new s(27, new uj2(this, 1)));
        this.x = viewBinding(jxa.E0);
        bs5 bs5 = d0().w0;
        ju7 lifecycle = this.lifecycleOwner.getLifecycle();
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(bs5, lifecycle, iu7), new wj2((Continuation) null, this), 5), getLifecycleScope());
        bs0.K(new ps5(ct.k(e0().v, this.lifecycleOwner.getLifecycle(), iu7), new xj2((Continuation) null, this), 5), getLifecycleScope());
        bs0.K(new ps5(ct.k(d0().v0, this.lifecycleOwner.getLifecycle(), iu7), new wq0(2, this, ChatMembersScreen.class, "processEvents", "processEvents(Lone/me/profile/screens/members/ProfileListMembersEvents;)V", 4, 5), 5), getLifecycleScope());
        this.y = childSlotRouter(jxa.v0);
    }

    public final void C(CharSequence charSequence) {
        e0().n(String.valueOf(charSequence));
    }

    public final void L() {
        e0().n((String) null);
    }

    public final long c0() {
        KProperty kProperty = X[0];
        return ((Number) this.c.a(this)).longValue();
    }

    public final lk2 d0() {
        return (lk2) this.v.getValue();
    }

    public final i49 e0() {
        return (i49) this.w.getValue();
    }

    public final h3b f0() {
        return (h3b) this.x.getValue(this, X[1]);
    }

    public final void g(int i, Bundle bundle) {
        long[] longArray;
        long[] longArray2;
        List<Long> list = null;
        if (i == jxa.A0 || i == jxa.z0) {
            if (!(bundle == null || (longArray = bundle.getLongArray("profile:memberslist:ids_to_delete")) == null)) {
                list = ArraysKt.toList(longArray);
            }
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            e0().j();
            e0().l(list);
            d0().n(list, false);
        } else if (i == jxa.C0) {
            if (!(bundle == null || (longArray2 = bundle.getLongArray("profile:memberslist:ids_to_delete")) == null)) {
                list = ArraysKt.toList(longArray2);
            }
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            e0().j();
            e0().l(list);
            d0().n(list, true);
        }
    }

    public final yh7 getInsetsConfig() {
        return this.b;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m1560getScopeIdIluPPks() {
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
        d.setId(jxa.E0);
        d.setLeftActions(new p2b(new vj2(this, 0)));
        linearLayout.addView(d);
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setId(jxa.v0);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(frameLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        kr7.C(f0());
        e0().j();
        z3a z3a = this.z;
        if (z3a != null) {
            z3a.o();
        }
        this.z = null;
        d0().q();
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        fma h = getRouter().h();
        if (h != null) {
            h.a(getViewLifecycleOwner(), new wx3((Widget) this, 4));
        }
        ((mz2) this.y.getValue(this, X[2])).c("members_list_widget", new uj2(this, 2));
        bs0.K(new ps5(ct.k(e0().y, getViewLifecycleOwner().getLifecycle(), iu7.o), new yj2((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public ChatMembersScreen(long j, ij2 ij2) {
        this(o54.f(TuplesKt.to("profile:memberslist:id", Long.valueOf(j)), TuplesKt.to("profile:memberslist:type", ij2.a)));
    }
}
