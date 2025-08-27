package one.me.profile.screens.members.compact;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.members.list.MembersListWidget;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/profile/screens/members/compact/ChatMembersCompactWidget;", "Lone/me/sdk/arch/Widget;", "Lqg3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nChatMembersCompactWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatMembersCompactWidget.kt\none/me/profile/screens/members/compact/ChatMembersCompactWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 4 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n*L\n1#1,211:1\n420#2:212\n235#2,10:213\n235#2,10:223\n135#3,3:233\n138#3,8:250\n33#4,14:236\n*S KotlinDebug\n*F\n+ 1 ChatMembersCompactWidget.kt\none/me/profile/screens/members/compact/ChatMembersCompactWidget\n*L\n51#1:212\n55#1:213,10\n60#1:223,10\n161#1:233,3\n161#1:250,8\n161#1:236,14\n*E\n"})
@SuppressLint({"ValidController"})
public final class ChatMembersCompactWidget extends Widget implements qg3 {
    public static final /* synthetic */ KProperty[] x;
    public final is a;
    public final String b;
    public final Lazy c;
    public z3a o;
    public final Lazy v;
    public final ReadOnlyProperty w;

    static {
        Class<ChatMembersCompactWidget> cls = ChatMembersCompactWidget.class;
        x = new KProperty[]{wj6.p(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), wj6.p(cls, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    }

    public ChatMembersCompactWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = new is(Long.class, "id");
        this.b = wj6.j(c0(), "profile:compactChatMembersList:{", "}");
        this.c = createViewModelLazy(lk2.class, new s(24, new kj2(this, 0)));
        this.v = createViewModelLazy(i49.class, new s(25, new kj2(this, 1)));
        bs5 bs5 = d0().w0;
        ju7 lifecycle = this.lifecycleOwner.getLifecycle();
        iu7 iu7 = iu7.o;
        bs0.K(ct.k(bs5, lifecycle, iu7), getLifecycleScope());
        bs0.K(new ps5(ct.k(e0().v, this.lifecycleOwner.getLifecycle(), iu7), new mj2(this, (Continuation) null), 5), getLifecycleScope());
        bs0.K(new ps5(ct.k(d0().v0, this.lifecycleOwner.getLifecycle(), iu7), new wq0(2, this, ChatMembersCompactWidget.class, "processEvents", "processEvents(Lone/me/profile/screens/members/ProfileListMembersEvents;)V", 4, 4), 5), getLifecycleScope());
        this.w = childSlotRouter(jxa.v0);
    }

    public final long c0() {
        KProperty kProperty = x[0];
        return ((Number) this.a.a(this)).longValue();
    }

    public final lk2 d0() {
        return (lk2) this.c.getValue();
    }

    public final i49 e0() {
        return (i49) this.v.getValue();
    }

    public final void g(int i, Bundle bundle) {
        long[] longArray;
        long[] longArray2;
        List<Long> list = null;
        if (i == jxa.A0) {
            if (!(bundle == null || (longArray2 = bundle.getLongArray("profile:memberslist:ids_to_delete")) == null)) {
                list = ArraysKt.toList(longArray2);
            }
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            e0().j();
            e0().l(list);
            d0().n(list, false);
        } else if (i == jxa.C0) {
            if (!(bundle == null || (longArray = bundle.getLongArray("profile:memberslist:ids_to_delete")) == null)) {
                list = ArraysKt.toList(longArray);
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
        yh7 yh7 = yh7.c;
        return yh7.c;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m1561getScopeIdIluPPks() {
        return this.b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(jxa.v0);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        z3a z3a = this.o;
        if (z3a != null) {
            z3a.o();
        }
        this.o = null;
        d0().q();
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        mz2 mz2 = (mz2) this.w.getValue(this, x[1]);
        if (!Intrinsics.areEqual((Object) mz2.b(), (Object) "compact_members_list_widget")) {
            i9d i9d = new i9d(new MembersListWidget(this.b, new w39(c0(), ij2.MEMBER, (Integer) 10, 4), (DefaultConstructorMarker) null), (String) null, (ey3) null, (ey3) null, false, -1);
            i9d.d("compact_members_list_widget");
            mz2.a.R(i9d);
        }
    }

    public ChatMembersCompactWidget(long j) {
        this(o54.f(TuplesKt.to("id", Long.valueOf(j))));
    }
}
