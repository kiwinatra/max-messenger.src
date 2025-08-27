package one.me.chats.picker.chats;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/chats/picker/chats/PickerChatsListWidget2;", "Lone/me/sdk/arch/Widget;", "", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "Legd;", "scopeId", "", "isFakeChatsEnabled", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nPickerChatsListWidget2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickerChatsListWidget2.kt\none/me/chats/picker/chats/PickerChatsListWidget2\n+ 2 BundleExt.kt\nru/ok/tamtam/shared/BundleExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Widget.kt\none/me/sdk/arch/Widget\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 7 View.kt\nandroidx/core/view/ViewKt\n+ 8 Display.kt\nru/ok/tamtam/shared/DisplayKt\n*L\n1#1,310:1\n9#2:311\n1#3:312\n255#4,9:313\n420#4:322\n235#4,10:323\n410#4,8:336\n410#4,8:344\n2632#5,3:333\n24#6:352\n24#6:353\n24#6:354\n24#6:355\n163#7,2:356\n43#8:358\n46#8:359\n*S KotlinDebug\n*F\n+ 1 PickerChatsListWidget2.kt\none/me/chats/picker/chats/PickerChatsListWidget2\n*L\n58#1:311\n58#1:312\n57#1:313,9\n62#1:322\n64#1:323,10\n167#1:336,8\n171#1:344,8\n134#1:333,3\n244#1:352\n245#1:353\n246#1:354\n247#1:355\n243#1:356,2\n287#1:358\n288#1:359\n*E\n"})
@SuppressLint({"ValidController"})
public final class PickerChatsListWidget2 extends Widget {
    public static final /* synthetic */ KProperty[] w0;
    public final fhb X;
    public final fhb Y;
    public final sn0 Z;
    public final Lazy a;
    public final String b;
    public final is c;
    public final Lazy o;
    public fbf v;
    public final sn0 v0;
    public final ExecutorService w;
    public b x;
    public final kx2 y;
    public final rd3 z;

    static {
        Class<PickerChatsListWidget2> cls = PickerChatsListWidget2.class;
        w0 = new KProperty[]{wj6.p(cls, "isFakeChatsEnabled", "isFakeChatsEnabled()Z", 0), wj6.p(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    }

    public PickerChatsListWidget2(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        Class<egd> cls = egd.class;
        Object k = n54.k(bundle, "scope.id", cls);
        if (k != null) {
            this.a = m1571getSharedViewModelcp94BC8(((egd) ((Parcelable) k)).a, vhb.class, (Function0) null);
            String string = bundle.getString("folder.id.key");
            if (string != null) {
                this.b = string;
                this.c = new is(Boolean.class, "folder.fake.enabled");
                this.o = createViewModelLazy(jib.class, new zfa(6, new uib(this, 0)));
                ExecutorService a2 = cs2.a.d().a();
                this.w = a2;
                kx2 kx2 = new kx2(a2, 0);
                this.y = kx2;
                this.z = new rd3(new qd3(false, 1), kx2);
                this.X = new fhb(new vib(this, 0), a2, 0);
                this.Y = new fhb(new vib(this, 1), a2, 0);
                this.Z = binding(new uib(this, 1));
                this.v0 = binding(new uib(this, 2));
                ((wt2) g0().c).e();
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException(wj6.k("No value passed for key scope.id of type ", cls.getSimpleName(), " in bundle").toString());
    }

    public static final boolean c0(PickerChatsListWidget2 pickerChatsListWidget2, int i) {
        return i < 0 || i >= pickerChatsListWidget2.z.j() || !Intrinsics.areEqual(pickerChatsListWidget2.z.G(i).first, (Object) pickerChatsListWidget2.y);
    }

    public static final boolean d0(PickerChatsListWidget2 pickerChatsListWidget2) {
        Iterable F = pickerChatsListWidget2.z.F();
        if (!(F instanceof Collection) || !((Collection) F).isEmpty()) {
            Iterator it = F.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((tyc) it.next()) == pickerChatsListWidget2.Y) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return ((Boolean) pickerChatsListWidget2.g0().x0.a.getValue()).booleanValue();
    }

    public final vhb e0() {
        return (vhb) this.a.getValue();
    }

    public final EndlessRecyclerView2 f0() {
        KProperty kProperty = w0[1];
        return (EndlessRecyclerView2) this.v0.getValue();
    }

    public final jib g0() {
        return (jib) this.o.getValue();
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        xme xme = g0().A0;
        xme.m((Object) null, Long.valueOf(((Number) xme.getValue()).longValue() + 1));
    }

    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        if (Intrinsics.areEqual((Object) this.b, (Object) "all.chat.folder")) {
            bs0.K(new ps5(e0().X, new wq0(2, g0(), jib.class, "search", "search$chats_list_release(Ljava/lang/String;)V", 4, 25), 5), getLifecycleScope());
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!Intrinsics.areEqual((Object) this.b, (Object) "all.chat.folder")) {
            return f0();
        }
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.addView(f0());
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        EndlessRecyclerView2 f0 = f0();
        fbf fbf = this.v;
        if (fbf != null) {
            fbf.B(f0);
        }
        f0.setDelegate((w65) null);
        f0.setPager((u65) null);
        f0.setAdapter((tyc) null);
    }

    public final void onViewCreated(View view) {
        rd3 rd3 = this.z;
        fhb fhb = this.X;
        rd3.E(fhb);
        EndlessRecyclerView2 f0 = f0();
        f0.getContext();
        f0.setLayoutManager(new LinearLayoutManager());
        f0.setAdapter(rd3);
        this.v = y7e.n(f0);
        f0.setPager(new k71(8, this));
        f0.setDelegate(this.y);
        f0.setClipToPadding(false);
        float f = (float) 6;
        f0.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        f0.setThreshold(10);
        f0.setIgnoreRefreshingFlagsForScrollEvent(true);
        b bVar = this.x;
        if (bVar != null) {
            f0.setRecycledViewPool(bVar);
        }
        yyc itemAnimator = f0.getItemAnimator();
        bbe bbe = itemAnimator instanceof bbe ? (bbe) itemAnimator : null;
        if (bbe != null) {
            bbe.g = false;
        }
        f0.j(new fz2(new v65(f0, 2), new vq7(29, (Object) this), new wib(this), new xib(this)));
        f0.l(new ia4(f0));
        if (fhb.j() > 0) {
            f0.measure(View.MeasureSpec.makeMeasureSpec(f0.getContext().getResources().getDisplayMetrics().widthPixels, IntCompanionObject.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(f0.getContext().getResources().getDisplayMetrics().heightPixels, IntCompanionObject.MIN_VALUE));
            yyc itemAnimator2 = f0.getItemAnimator();
            if (itemAnimator2 != null) {
                itemAnimator2.k();
            }
        }
        f0().setRefreshingNext(((Boolean) g0().x0.a.getValue()).booleanValue());
        etc etc = g0().v0;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(etc, getViewLifecycleOwner().getLifecycle(), iu7), new yib((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(g0().z0, getViewLifecycleOwner().getLifecycle(), iu7), new zib((Continuation) null, this, view), 5), getViewLifecycleScope());
        bs0.K(new ps5(e0().x, new ajb((Continuation) null, this), 5), getViewLifecycleScope());
        if (Intrinsics.areEqual((Object) this.b, (Object) "all.chat.folder")) {
            bs0.K(new ps5(e0().X, new bjb((Continuation) null, this), 5), getViewLifecycleScope());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PickerChatsListWidget2(String str, String str2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? true : z2, (DefaultConstructorMarker) null);
    }

    public PickerChatsListWidget2(String str, String str2, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(TuplesKt.to("folder.id.key", str), i2a.l(str2, "scope.id"), TuplesKt.to("folder.fake.enabled", Boolean.valueOf(z2))));
    }
}
