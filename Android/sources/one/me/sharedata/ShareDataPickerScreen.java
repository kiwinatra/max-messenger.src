package one.me.sharedata;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.chats.PickerChatsTabWidget2;
import one.me.sdk.arch.Widget;

@SourceDebugExtension({"SMAP\nShareDataPickerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareDataPickerScreen.kt\none/me/sharedata/ShareDataPickerScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 4 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 7 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 8 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,353:1\n235#2,10:354\n55#3,12:364\n24#4:376\n1#5:377\n17#6:378\n19#6:382\n46#7:379\n51#7:381\n105#8:380\n*S KotlinDebug\n*F\n+ 1 ShareDataPickerScreen.kt\none/me/sharedata/ShareDataPickerScreen\n*L\n102#1:354,10\n119#1:364,12\n167#1:376\n320#1:378\n320#1:382\n320#1:379\n320#1:381\n320#1:380\n*E\n"})
@SuppressLint({"ValidController"})
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/sharedata/ShareDataPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Le5e;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "share-picker_release"}, k = 1, mv = {2, 0, 0})
public final class ShareDataPickerScreen extends AbstractPickerScreen<e5e> {
    public static final /* synthetic */ KProperty[] A0 = {wj6.p(ShareDataPickerScreen.class, "inputView", "getInputView()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0)};
    public static final yh7 B0;
    public final zc4 X;
    public final AutoTransition Y;
    public final sn0 Z;
    public final Lazy v0;
    public oz1 w0;
    public e9d x0;
    public final yh7 y = yh7.c;
    public final fb6 y0;
    public final xme z = f6e.a(new igf(a0b.b));
    public xr8 z0;

    static {
        jdb jdb = jdb.c;
        jdb jdb2 = anf.a;
        B0 = new yh7(jdb, new nr0(jdb, mr0.c, false));
    }

    public ShareDataPickerScreen(Bundle bundle) {
        super(bundle);
        y4e y4e = y4e.a;
        this.X = new zc4(y4e.getAccessor().h(x23.class), y4e.getAccessor().h(gaf.class), y4e.getAccessor().h(qx2.class), m0(bundle));
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.addTarget(zza.c);
        autoTransition.addTarget(hra.f0);
        autoTransition.addTarget(zza.a);
        autoTransition.setOrdering(0);
        autoTransition.setDuration(100);
        this.Y = autoTransition;
        this.Z = binding(new g5e(this, 0));
        this.v0 = createViewModelLazy(sr8.class, new zfa(28, new red(23)));
        this.y0 = new fb6(this, 3);
        zr0 zr0 = new zr0((zx3) this, (Function0) new g5e(this, 1));
        if (getRouter() != null) {
            getRouter().a(zr0);
        } else {
            addLifecycleListener(new la(this, zr0, 12));
        }
    }

    public final Iterable c0() {
        occ occ = new occ(getContext());
        occ.setId(zza.c);
        occ.setBackgroundColor(fu4.k.e(occ.getContext()).f().a().f().a.a);
        occ.setLayoutParams(new LinearLayout.LayoutParams(-1, MathKt.roundToInt(((float) 52) * vo4.c().getDisplayMetrics().density)));
        bs0.K(new ps5(((e5e) l0().c).h, new h5e(occ, (Continuation) null), 5), getViewLifecycleScope());
        return CollectionsKt.listOf(occ, n0());
    }

    public final ojb d0() {
        y4e y4e = y4e.a;
        return new eud(9, this.X, new y35(12, (Object) y4e.getAccessor().h(qx2.class)), y4e.getAccessor().h(eu3.class), y4e.getAccessor().h(x23.class));
    }

    public final Widget e0(String str) {
        return new PickerChatsTabWidget2(str, (DefaultConstructorMarker) null);
    }

    public final h3b f0(Context context) {
        String string = getArgs().getString("ru.ok.tamtam.extra.SHARE_TITLE", (String) null);
        if (string == null) {
            string = context.getString(a0b.c);
        }
        h3b d = o54.d(context, (AttributeSet) null);
        d.setId(zza.d);
        d.setTransitionName(context.getString(jra.q));
        d.setTitle((CharSequence) string);
        d.setForm(z2b.a);
        d.setLeftActions(new p2b(new jkb(21, (Object) this)));
        return d;
    }

    public final ukb g0() {
        u9 u9Var;
        Intent intent = (Intent) getArgs().getParcelable("ru.ok.tamtam.extra.DATA");
        if (intent != null) {
            y4e y4e = y4e.a;
            u9Var = new d19((Context) y4e.getAccessor().g(Context.class), (m95) y4e.getAccessor().g(m95.class), (ln5) y4e.getAccessor().g(ln5.class)).i(intent);
        } else {
            u9Var = null;
        }
        u9 u9Var2 = u9Var;
        o5e o5e = new o5e();
        y4e y4e2 = y4e.a;
        return new e5e(u9Var2, o5e, this.X, y4e2.getAccessor().h(gaf.class), y4e2.getAccessor().h(q5e.class), y4e2.getAccessor().h(ar6.class));
    }

    public final yh7 getInsetsConfig() {
        return this.y;
    }

    public final boolean handleBack() {
        e9d e9d = this.x0;
        if (e9d == null || !e9d.n()) {
            return super.handleBack();
        }
        ((e5e) l0().c).k.C(og9.a);
        return true;
    }

    public final xme i0() {
        return this.z;
    }

    public final Set m0(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        Set<Long> set = longArray != null ? ArraysKt.toSet(longArray) : null;
        return set == null ? SetsKt.emptySet() : set;
    }

    public final dc9 n0() {
        KProperty kProperty = A0[0];
        return (dc9) this.Z.getValue();
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.w0 = null;
        this.x0 = null;
        xr8 xr8 = this.z0;
        if (xr8 != null) {
            xr8.a();
        }
        this.z0 = null;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [oz1, android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    public final void onViewCreated(View view) {
        View view2 = view;
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view2;
        h88.f(j0(), B0, (Function1) null);
        ? frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(zza.b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout.setLayoutParams(layoutParams);
        int i = pq7.a;
        frameLayout.setTranslationY((float) pq7.a(frameLayout.getContext()));
        h88.f(frameLayout, new yh7((jdb) null, new nr0(jdb.o, mr0.a, false), 1), (Function1) null);
        this.w0 = frameLayout;
        this.x0 = getChildRouter(frameLayout);
        viewGroup.addView(frameLayout);
        bs0.K(new ps5(l0().x, new l5e(this, view2, (Continuation) null), 5), getViewLifecycleScope());
        bs0.K(new ps5(((e5e) l0().c).j, new m5e(this, (Continuation) null), 5), getViewLifecycleScope());
        ViewGroup j0 = j0();
        e9d e9d = this.x0;
        oz1 oz1 = this.w0;
        if (e9d != null && oz1 != null) {
            g5e g5e = new g5e(this, 2);
            boolean z2 = ((ccb) y4e.a.getAccessor().g(ccb.class)).b && Build.VERSION.SDK_INT >= 30;
            tu7 viewLifecycleScope = getViewLifecycleScope();
            pg9 pg9 = (pg9) ((etc) ((e5e) l0().c).k.c).a.getValue();
            this.z0 = new xr8(e9d, oz1, j0, g5e, z2, viewLifecycleScope, (pg9 != null ? pg9.a : null) == og9.b, new vra(22, this, j0));
            new qr8((sr8) this.v0.getValue(), n0()).a(getViewLifecycleScope());
            bs0.K(new ps5(new on2((etc) ((e5e) l0().c).k.c, 28), new i5e(this, j0, (Continuation) null), 5), getViewLifecycleScope());
        }
    }
}
