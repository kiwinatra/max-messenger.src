package one.me.profile.screens.addadmins.fromcontacts;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.views.EmptySearchView;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/profile/screens/addadmins/fromcontacts/AdminsFromContactsScreen;", "Lone/me/sdk/arch/Widget;", "Lgb;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "", "chatId", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAdminsFromContactsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminsFromContactsScreen.kt\none/me/profile/screens/addadmins/fromcontacts/AdminsFromContactsScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 BundleExt.kt\none/me/sdk/uikit/common/BundleExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n420#2:148\n255#2,9:151\n235#2,10:160\n410#2,8:171\n410#2,8:179\n10#3,2:149\n1#4:170\n*S KotlinDebug\n*F\n+ 1 AdminsFromContactsScreen.kt\none/me/profile/screens/addadmins/fromcontacts/AdminsFromContactsScreen\n*L\n38#1:148\n39#1:151,9\n43#1:160,10\n83#1:171,8\n97#1:179,8\n40#1:149,2\n*E\n"})
@SuppressLint({"ValidController"})
public final class AdminsFromContactsScreen extends Widget implements gb {
    public static final /* synthetic */ KProperty[] X;
    public final is a;
    public final Lazy b;
    public final Lazy c;
    public final ReadOnlyProperty o;
    public final ReadOnlyProperty v;
    public bnf w;
    public nwe x;
    public final ExecutorService y;
    public final t56 z;

    static {
        Class<AdminsFromContactsScreen> cls = AdminsFromContactsScreen.class;
        X = new KProperty[]{wj6.p(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), wj6.p(cls, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), wj6.p(cls, "emptySearchView", "getEmptySearchView()Lone/me/sdk/uikit/common/views/EmptySearchView;", 0)};
    }

    public AdminsFromContactsScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = new is(Long.class, "profile:add_admins_from_contacts:chat_id");
        Class<egd> cls = egd.class;
        Object k = n54.k(bundle, "arg_scope_id", cls);
        if (k != null) {
            this.b = m1571getSharedViewModelcp94BC8(((egd) ((Parcelable) k)).a, i49.class, (Function0) null);
            this.c = createViewModelLazy(xb.class, new s(3, new j6(4, this)));
            this.o = viewBinding(jxa.b);
            this.v = viewBinding(jxa.a);
            ExecutorService a2 = ((aua) jxb.a.getAccessor().g(aua.class)).a();
            this.y = a2;
            this.z = new t56((Object) this, a2, 2);
            return;
        }
        throw new IllegalArgumentException(wj6.k("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }

    public final void c0(RecyclerView recyclerView) {
        nwe nwe = new nwe(recyclerView, this.z, new fl2(4, new l(6, this)));
        this.x = nwe;
        recyclerView.j(nwe);
        b0h.H(recyclerView, new mb(nwe, (Continuation) null, 0));
    }

    public final RecyclerView d0() {
        return (RecyclerView) this.o.getValue(this, X[1]);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(jxa.b);
        recyclerView.setItemAnimator((yyc) null);
        recyclerView.setAdapter(this.z);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        this.w = y7e.n(recyclerView);
        c0(recyclerView);
        frameLayout.addView(recyclerView);
        EmptySearchView emptySearchView = new EmptySearchView(frameLayout.getContext(), (AttributeSet) null);
        emptySearchView.setId(jxa.a);
        emptySearchView.setGravity(17);
        emptySearchView.setTitle(ead.c0);
        emptySearchView.setDescription(ead.b0);
        emptySearchView.setIsButtonVisible(false);
        frameLayout.addView(emptySearchView);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        bnf bnf = this.w;
        if (bnf != null) {
            bnf.B(d0());
        }
        this.w = null;
        this.x = null;
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        wb wbVar = ((xb) this.c.getValue()).z;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(wbVar, getViewLifecycleOwner().getLifecycle(), iu7), new nb((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(((i49) this.b.getValue()).X, getViewLifecycleOwner().getLifecycle(), iu7), new ob((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public AdminsFromContactsScreen(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, "arg_scope_id"), TuplesKt.to("profile:add_admins_from_contacts:chat_id", Long.valueOf(j))));
    }
}
