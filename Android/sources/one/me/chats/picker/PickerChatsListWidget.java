package one.me.chats.picker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/chats/picker/PickerChatsListWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "Legd;", "scopeId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nPickerChatsListWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickerChatsListWidget.kt\none/me/chats/picker/PickerChatsListWidget\n+ 2 BundleExt.kt\nru/ok/tamtam/shared/BundleExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Widget.kt\none/me/sdk/arch/Widget\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 7 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 8 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 9 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 10 View.kt\nandroidx/core/view/ViewKt\n+ 11 Display.kt\nru/ok/tamtam/shared/DisplayKt\n*L\n1#1,257:1\n9#2:258\n1#3:259\n255#4,9:260\n235#4,10:269\n2632#5,3:279\n49#6:282\n51#6:286\n46#7:283\n51#7:285\n105#8:284\n24#9:287\n24#9:288\n24#9:289\n24#9:290\n163#10,2:291\n43#11:293\n46#11:294\n*S KotlinDebug\n*F\n+ 1 PickerChatsListWidget.kt\none/me/chats/picker/PickerChatsListWidget\n*L\n48#1:258\n48#1:259\n47#1:260,9\n53#1:269,10\n85#1:279,3\n99#1:282\n99#1:286\n99#1:283\n99#1:285\n99#1:284\n191#1:287\n192#1:288\n193#1:289\n194#1:290\n190#1:291,2\n231#1:293\n232#1:294\n*E\n"})
@SuppressLint({"ValidController"})
public final class PickerChatsListWidget extends Widget {
    public static final /* synthetic */ KProperty[] Z = {wj6.p(PickerChatsListWidget.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    public final fhb X;
    public final fhb Y;
    public final Lazy a;
    public final String b;
    public final Lazy c;
    public fbf o;
    public final ExecutorService v;
    public final ReadOnlyProperty w;
    public b x;
    public final kx2 y;
    public final rd3 z;

    public PickerChatsListWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        Class<egd> cls = egd.class;
        Object k = n54.k(bundle, "scope.id", cls);
        if (k != null) {
            this.a = m1571getSharedViewModelcp94BC8(((egd) ((Parcelable) k)).a, whb.class, (Function0) null);
            String string = bundle.getString("folder.id.key");
            if (string != null) {
                this.b = string;
                this.c = createViewModelLazy(kib.class, new zfa(5, new ifb(2, this)));
                cs2 cs2 = cs2.a;
                ExecutorService a2 = cs2.d().a();
                this.v = a2;
                this.w = viewBinding(hra.k);
                kx2 kx2 = new kx2(a2, 0);
                this.y = kx2;
                this.z = new rd3(new qd3(false, 1), kx2);
                this.X = new fhb(new lib(this, 0), a2, 0);
                this.Y = new fhb(new lib(this, 1), a2, 0);
                setRetainViewMode(yx3.b);
                ((wt2) f0().b).e();
                bs0.K(bs0.F(new ps5(f0().o, new mib(this, (Continuation) null), 5), ((osa) cs2.e()).c()), getLifecycleScope());
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException(wj6.k("No value passed for key scope.id of type ", cls.getSimpleName(), " in bundle").toString());
    }

    public static final boolean c0(PickerChatsListWidget pickerChatsListWidget, int i) {
        return i < 0 || i >= pickerChatsListWidget.z.j() || !Intrinsics.areEqual(pickerChatsListWidget.z.G(i).first, (Object) pickerChatsListWidget.y);
    }

    public static final void d0(PickerChatsListWidget pickerChatsListWidget, Pair pair, fhb fhb) {
        pickerChatsListWidget.getClass();
        fhb.G((List) pair.component1());
        if (pickerChatsListWidget.getView() != null) {
            EndlessRecyclerView2 e0 = pickerChatsListWidget.e0();
            Iterable F = pickerChatsListWidget.z.F();
            if (!(F instanceof Collection) || !((Collection) F).isEmpty()) {
                Iterator it = F.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((tyc) it.next()) == pickerChatsListWidget.Y) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                e0.setRefreshingNext(r2);
            }
            boolean z2 = ((ss2) pickerChatsListWidget.f0().c.getValue()).b;
            e0.setRefreshingNext(z2);
        }
    }

    public final EndlessRecyclerView2 e0() {
        return (EndlessRecyclerView2) this.w.getValue(this, Z[0]);
    }

    public final kib f0() {
        return (kib) this.c.getValue();
    }

    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        ql8 ql8 = new ql8(((whb) this.a.getValue()).z0, 24);
        cs2 cs2 = cs2.a;
        bs0.K(bs0.F(new ps5(bs0.F(ql8, ((osa) cs2.e()).a()), new qib(this, (Continuation) null), 5), ((osa) cs2.e()).c()), getLifecycleScope());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(layoutInflater.getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setId(hra.k);
        endlessRecyclerView2.setClipChildren(false);
        endlessRecyclerView2.setClipToPadding(false);
        endlessRecyclerView2.setClipToOutline(false);
        endlessRecyclerView2.setHasFixedSize(true);
        return endlessRecyclerView2;
    }

    public final void onDestroyView(View view) {
        EndlessRecyclerView2 e0 = e0();
        fbf fbf = this.o;
        if (fbf != null) {
            fbf.B(e0);
        }
        e0.setDelegate((w65) null);
        e0.setPager((u65) null);
        e0.setAdapter((tyc) null);
    }

    public final void onViewCreated(View view) {
        rd3 rd3 = this.z;
        fhb fhb = this.X;
        rd3.E(fhb);
        EndlessRecyclerView2 e0 = e0();
        e0.getContext();
        e0.setLayoutManager(new LinearLayoutManager());
        e0.setAdapter(rd3);
        this.o = y7e.n(e0);
        e0.setPager(new k71(7, this));
        e0.setDelegate(this.y);
        e0.setClipToPadding(false);
        float f = (float) 6;
        e0.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        e0.setThreshold(10);
        e0.setIgnoreRefreshingFlagsForScrollEvent(true);
        b bVar = this.x;
        if (bVar != null) {
            e0.setRecycledViewPool(bVar);
        }
        e0.j(new fz2(new v65(e0, 1), new vq7(28, (Object) this), new nib(this), new oib(this)));
        e0.l(new ia4(e0));
        if (fhb.j() > 0) {
            e0.measure(View.MeasureSpec.makeMeasureSpec(e0.getContext().getResources().getDisplayMetrics().widthPixels, IntCompanionObject.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(e0.getContext().getResources().getDisplayMetrics().heightPixels, IntCompanionObject.MIN_VALUE));
        }
        e0().setRefreshingNext(((ss2) f0().c.getValue()).b);
        Lazy lazy = this.a;
        bs0.K(new ps5(((whb) lazy.getValue()).v0, new rib(this, (Continuation) null), 5), getViewLifecycleScope());
        bs0.K(new ps5(((whb) lazy.getValue()).z0, new sib(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public PickerChatsListWidget(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(TuplesKt.to("folder.id.key", str), i2a.l(str2, "scope.id")));
    }
}
