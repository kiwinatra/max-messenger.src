package one.me.chats.picker.contacts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/chats/picker/contacts/PickerContactsListWidget;", "Lone/me/sdk/arch/Widget;", "Lehb;", "", "Lys3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nPickerContactsListWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickerContactsListWidget.kt\none/me/chats/picker/contacts/PickerContactsListWidget\n+ 2 BundleExt.kt\none/me/sdk/uikit/common/BundleExtKt\n+ 3 Widget.kt\none/me/sdk/arch/Widget\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 StringExt.kt\nru/ok/tamtam/shared/StringExtKt\n*L\n1#1,308:1\n10#2,2:309\n255#3,9:311\n235#3,10:320\n235#3,10:330\n410#3,8:341\n1#4:340\n4#5:349\n4#5:350\n4#5:351\n*S KotlinDebug\n*F\n+ 1 PickerContactsListWidget.kt\none/me/chats/picker/contacts/PickerContactsListWidget\n*L\n60#1:309,2\n59#1:311,9\n62#1:320,10\n69#1:330,10\n230#1:341,8\n118#1:349\n135#1:350\n199#1:351\n*E\n"})
@SuppressLint({"ValidController"})
public final class PickerContactsListWidget extends Widget implements ehb, ys3 {
    public static final /* synthetic */ KProperty[] x0 = {wj6.p(PickerContactsListWidget.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final sn0 X;
    public final sn0 Y;
    public fbf Z;
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy o;
    public final ExecutorService v;
    public n27 v0;
    public final fhb w;
    public nwe w0;
    public final fhb x;
    public final t56 y;
    public final rd3 z;

    public PickerContactsListWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        Class<egd> cls = egd.class;
        Object k = n54.k(bundle, Widget.ARG_SCOPE_ID, cls);
        if (k != null) {
            this.a = m1571getSharedViewModelcp94BC8(((egd) ((Parcelable) k)).a, vhb.class, (Function0) null);
            Lazy<VM> createViewModelLazy = createViewModelLazy(akb.class, new zfa(9, new lgb(9)));
            this.b = createViewModelLazy;
            Lazy<VM> createViewModelLazy2 = createViewModelLazy(wh0.class, new zfa(10, new lgb(10)));
            this.c = createViewModelLazy2;
            cs2 cs2 = cs2.a;
            this.o = cs2.getAccessor().h(edb.class);
            ExecutorService a2 = cs2.d().a();
            this.v = a2;
            fhb fhb = new fhb(this, a2, 48);
            this.w = fhb;
            this.x = new fhb(this, a2, 48);
            t56 t56 = new t56((Object) this, a2, 4);
            this.y = t56;
            this.z = new rd3(new qd3(false, 1), t56, fhb);
            this.X = binding(new rjb(this, 0));
            this.Y = binding(new rjb(this, 1));
            bs0.K(new i21(((akb) createViewModelLazy.getValue()).b, ((wh0) createViewModelLazy2.getValue()).y, new x2(this, (Continuation) null, 23), 4), getLifecycleScope());
            return;
        }
        throw new IllegalArgumentException(wj6.k("No value passed for key arg_key_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }

    public final void c0(RecyclerView recyclerView) {
        fl2 fl2 = new fl2(4, new qjb(this, 0));
        nwe nwe = new nwe(recyclerView, this.z, fl2);
        this.w0 = nwe;
        recyclerView.j(nwe);
        n27 n27 = new n27(fl2);
        this.v0 = n27;
        recyclerView.j(n27);
        b0h.H(recyclerView, new mb(nwe, (Continuation) null, 2));
    }

    public final vhb d0() {
        return (vhb) this.a.getValue();
    }

    public final RecyclerView e0() {
        KProperty kProperty = x0[0];
        return (RecyclerView) this.Y.getValue();
    }

    public final void f(xs3 xs3) {
        q();
    }

    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        bs0.K(new ps5(d0().X, new wq0(2, (akb) this.b.getValue(), akb.class, "onSearch", "onSearch(Ljava/lang/String;)V", 4, 26), 5), getLifecycleScope());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.addView(e0());
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        fbf fbf = this.Z;
        if (fbf != null) {
            fbf.B(e0());
        }
        this.Z = null;
        this.v0 = null;
        this.w0 = null;
        super.onDestroyView(view);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            eng eng = new eng(this, 1);
            String[] strArr2 = edb.e;
            int i2 = qad.t6;
            int i3 = qad.U6;
            ((edb) this.o.getValue()).getClass();
            edb.k(eng, strArr, iArr, strArr2, i2, i3);
        }
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        bs0.K(new ps5(ct.k(((akb) this.b.getValue()).o, getViewLifecycleOwner().getLifecycle(), iu7.o), new sjb((Continuation) null, this, view), 5), getViewLifecycleScope());
        bs0.K(new ps5(d0().x, new ujb(this, (Continuation) null), 5), getViewLifecycleScope());
        bs0.K(new ps5(d0().X, new vjb(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public final void q() {
        ((edb) this.o.getValue()).f(new eng(this, 1), edb.e, 156);
    }

    public final void t(long j, ckb ckb) {
        d0().j(j, ckb);
    }

    public PickerContactsListWidget(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, Widget.ARG_SCOPE_ID)));
    }
}
