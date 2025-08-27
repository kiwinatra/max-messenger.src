package one.me.chats.picker.members;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/chats/picker/members/PickerMembersListWidget;", "Lone/me/sdk/arch/Widget;", "Lehb;", "", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "", "chatId", "", "decorsEnabled", "(Ljava/lang/String;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nPickerMembersListWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickerMembersListWidget.kt\none/me/chats/picker/members/PickerMembersListWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 BundleExt.kt\nru/ok/tamtam/shared/BundleExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 StringExt.kt\nru/ok/tamtam/shared/StringExtKt\n*L\n1#1,227:1\n419#2:228\n419#2:229\n255#2,9:232\n235#2,10:241\n410#2,8:252\n9#3:230\n1#4:231\n1#4:251\n4#5:260\n*S KotlinDebug\n*F\n+ 1 PickerMembersListWidget.kt\none/me/chats/picker/members/PickerMembersListWidget\n*L\n43#1:228\n44#1:229\n46#1:232,9\n49#1:241,10\n176#1:252,8\n47#1:230\n47#1:231\n146#1:260\n*E\n"})
@SuppressLint({"ValidController"})
public final class PickerMembersListWidget extends Widget implements ehb {
    public static final /* synthetic */ KProperty[] v0;
    public fbf X;
    public n27 Y;
    public nwe Z;
    public final is a;
    public final is b;
    public final Lazy c;
    public final Lazy o;
    public final ExecutorService v;
    public final fhb w;
    public final fhb x;
    public final sn0 y;
    public final sn0 z;

    static {
        Class<PickerMembersListWidget> cls = PickerMembersListWidget.class;
        v0 = new KProperty[]{wj6.p(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), wj6.p(cls, "decorsEnabled", "getDecorsEnabled()Z", 0), wj6.p(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    }

    public PickerMembersListWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        etc etc;
        this.a = new is(Long.class, 0L, "chat_id");
        this.b = new is(Boolean.class, Boolean.TRUE, "decors_enabled");
        Class<egd> cls = egd.class;
        Object k = n54.k(bundle, Widget.ARG_SCOPE_ID, cls);
        if (k != null) {
            this.c = m1571getSharedViewModelcp94BC8(((egd) ((Parcelable) k)).a, vhb.class, (Function0) null);
            Lazy<VM> createViewModelLazy = createViewModelLazy(skb.class, new zfa(11, new kkb(this, 0)));
            this.o = createViewModelLazy;
            ExecutorService a2 = cs2.a.d().a();
            this.v = a2;
            this.w = new fhb(this, a2, 0);
            this.x = new fhb(this, a2, 0);
            this.y = binding(new kkb(this, 1));
            this.z = binding(new kkb(this, 2));
            skb skb = (skb) createViewModelLazy.getValue();
            boolean k2 = skb.k();
            a59 a59 = skb.c;
            if (k2) {
                zjb zjb = new zjb(((l59) a59).k, skb, 1);
                List emptyList = CollectionsKt.emptyList();
                etc = bs0.X(zjb, skb.a, z6e.a, emptyList);
            } else {
                etc = ((l59) a59).k;
            }
            bs0.K(new ps5(etc, new lkb(this, (Continuation) null), 5), getLifecycleScope());
            return;
        }
        throw new IllegalArgumentException(wj6.k("No value passed for key arg_key_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }

    public final void c0(EndlessRecyclerView2 endlessRecyclerView2) {
        fl2 fl2 = new fl2(4, new jkb(0, (Object) this));
        nwe nwe = new nwe(endlessRecyclerView2, this.w, fl2);
        this.Z = nwe;
        endlessRecyclerView2.j(nwe);
        n27 n27 = new n27(fl2);
        this.Y = n27;
        endlessRecyclerView2.j(n27);
        b0h.H(endlessRecyclerView2, new mb(nwe, (Continuation) null, 3));
    }

    public final boolean d0() {
        KProperty kProperty = v0[1];
        return ((Boolean) this.b.a(this)).booleanValue();
    }

    public final vhb e0() {
        return (vhb) this.c.getValue();
    }

    public final EndlessRecyclerView2 f0() {
        KProperty kProperty = v0[2];
        return (EndlessRecyclerView2) this.z.getValue();
    }

    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        bs0.K(new ps5(e0().X, new wq0(2, (skb) this.o.getValue(), skb.class, "onSearch", "onSearch(Ljava/lang/String;)V", 4, 27), 5), getLifecycleScope());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.addView(f0());
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        fbf fbf = this.X;
        if (fbf != null) {
            fbf.B(f0());
        }
        this.X = null;
        this.Y = null;
        this.Z = null;
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        bs0.K(new ps5(ct.k(((skb) this.o.getValue()).w, getViewLifecycleOwner().getLifecycle(), iu7.o), new mkb((Continuation) null, this, view), 5), getViewLifecycleScope());
        bs0.K(new ps5(e0().x, new nkb(this, (Continuation) null), 5), getViewLifecycleScope());
        bs0.K(new ps5(e0().X, new okb(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public final void t(long j, ckb ckb) {
        e0().j(j, ckb);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PickerMembersListWidget(String str, long j, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 0 : j, (i & 4) != 0 ? true : z2, (DefaultConstructorMarker) null);
    }

    public PickerMembersListWidget(String str, long j, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, Widget.ARG_SCOPE_ID), TuplesKt.to("chat_id", Long.valueOf(j)), TuplesKt.to("decors_enabled", Boolean.valueOf(z2))));
    }
}
