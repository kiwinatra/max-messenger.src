package one.me.chats.forward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Collection;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.chats.PickerChatsTabWidget2;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

@SourceDebugExtension({"SMAP\nForwardPickerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForwardPickerScreen.kt\none/me/chats/forward/ForwardPickerScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt\n+ 4 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 6 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 7 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 8 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 9 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,501:1\n419#2:502\n419#2:503\n419#2:504\n419#2:505\n235#2,10:523\n410#2,8:551\n26#3:506\n59#3,16:507\n55#4,12:533\n33#4,14:562\n24#5:545\n24#5:590\n49#6:546\n51#6:550\n17#6:585\n19#6:589\n46#7:547\n51#7:549\n46#7:586\n51#7:588\n105#8:548\n105#8:587\n135#9,3:559\n138#9,8:576\n1#10:584\n*S KotlinDebug\n*F\n+ 1 ForwardPickerScreen.kt\none/me/chats/forward/ForwardPickerScreen\n*L\n90#1:502\n91#1:503\n92#1:504\n93#1:505\n122#1:523,10\n291#1:551,8\n102#1:506\n102#1:507,16\n157#1:533,12\n365#1:562,14\n239#1:545\n468#1:590\n288#1:546\n288#1:550\n448#1:585\n448#1:589\n288#1:547\n288#1:549\n448#1:586\n448#1:588\n288#1:548\n448#1:587\n365#1:559,3\n365#1:576,8\n*E\n"})
@SuppressLint({"ValidController"})
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/chats/forward/ForwardPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lya6;", "Lqg3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messagesIds", "", "attachId", "", "isForwardAttach", "showExternalSharing", "([JLjava/lang/Long;ZZ)V", "forward-message_release"}, k = 1, mv = {2, 0, 0})
public final class ForwardPickerScreen extends AbstractPickerScreen<ya6> implements qg3 {
    public static final /* synthetic */ KProperty[] I0;
    public static final yh7 J0;
    public final ReadOnlyProperty A0;
    public final Lazy B0;
    public oz1 C0;
    public e9d D0;
    public final fb6 E0;
    public xr8 F0;
    public final Lazy G0;
    public ymf H0;
    public final xme X;
    public final zc4 Y;
    public final is Z;
    public final is v0;
    public final is w0;
    public Function0 x0;
    public final w28 y;
    public final AutoTransition y0;
    public final yh7 z;
    public final sn0 z0;

    static {
        Class<ForwardPickerScreen> cls = ForwardPickerScreen.class;
        I0 = new KProperty[]{rae.s(cls, "messagesIds", "getMessagesIds()[J", 0), rae.s(cls, "attachId", "getAttachId()J", 0), rae.s(cls, "isForwardAttach", "isForwardAttach()Z", 0), wj6.p(cls, "showExternalSharing", "getShowExternalSharing()Z", 0), wj6.p(cls, "inputView", "getInputView()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0), wj6.p(cls, "quoteView", "getQuoteView()Lone/me/sdk/uikit/common/chat/QuoteView;", 0)};
        jdb jdb = jdb.c;
        jdb jdb2 = anf.a;
        J0 = new yh7(jdb, new nr0(jdb, mr0.c, false));
    }

    public ForwardPickerScreen(Bundle bundle) {
        super(bundle);
        this.y = new w28(new a46(5), (Function0) null, 6);
        this.z = yh7.c;
        this.X = f6e.a(new igf(gra.e));
        ia6 ia6 = ia6.a;
        this.Y = new zc4(ia6.getAccessor().h(x23.class), ia6.getAccessor().h(gaf.class), ia6.getAccessor().h(qx2.class), 8);
        this.Z = new is(long[].class, new long[0], "messages_to_forward");
        this.v0 = new is(Long.class, 0L, "attach_to_forward");
        this.w0 = new is(Boolean.class, Boolean.FALSE, "is_forward_attach");
        this.x0 = new a46(6);
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.addTarget(era.e);
        autoTransition.addTarget(hra.f0);
        autoTransition.addTarget(era.c);
        autoTransition.setOrdering(0);
        autoTransition.setDuration(100);
        autoTransition.addListener(new m6(2, this));
        this.y0 = autoTransition;
        this.z0 = binding(new cb6(this, 2));
        this.A0 = viewBinding(mgc.oneme_picker_quote_view);
        this.B0 = createViewModelLazy(sr8.class, new i76(2, new a46(7)));
        this.E0 = new fb6(this, 0);
        this.G0 = ia6.getAccessor().h(bud.class);
        zr0 zr0 = new zr0((zx3) this, (Function0) new cb6(this, 3));
        if (getRouter() != null) {
            getRouter().a(zr0);
        } else {
            addLifecycleListener(new la(this, zr0, 6));
        }
    }

    public static final void n0(ForwardPickerScreen forwardPickerScreen, occ occ, igf igf, boolean z2) {
        forwardPickerScreen.getClass();
        float f = (float) 6;
        Point point = new Point(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), a81.e(f, vo4.c().getDisplayMetrics().density, forwardPickerScreen.requireView().getBottom() - forwardPickerScreen.p0().getTop()));
        ymf ymf = forwardPickerScreen.H0;
        if (ymf != null) {
            ymf.dismiss();
        }
        ymf ymf2 = new ymf(forwardPickerScreen.getContext(), (View) occ, (Function0) new a46(3), (Function0) null, (wmf) null, vmf.b, 56);
        ymf2.d(igf);
        ymf2.e(point, 8388693, z2 ? 2500 : 800);
        ymf2.setOnDismissListener(new w01(4, forwardPickerScreen));
        forwardPickerScreen.H0 = ymf2;
    }

    public final Iterable c0() {
        occ occ = new occ(getContext());
        occ.setId(era.e);
        b0h.H(occ, new sa(3, (Continuation) null, 13));
        occ.setLayoutParams(new LinearLayout.LayoutParams(-1, MathKt.roundToInt(((float) 52) * vo4.c().getDisplayMetrics().density)));
        bs0.K(new ps5(((ya6) l0().c).m, new db6(occ, (Continuation) null), 5), getViewLifecycleScope());
        return CollectionsKt.listOf(occ, o0());
    }

    public final ojb d0() {
        ia6 ia6 = ia6.a;
        return new eud(9, this.Y, new y35(12, (Object) ia6.getAccessor().h(qx2.class)), ia6.getAccessor().h(eu3.class), ia6.getAccessor().h(x23.class));
    }

    public final Widget e0(String str) {
        return new PickerChatsTabWidget2(str, (DefaultConstructorMarker) null);
    }

    public final h3b f0(Context context) {
        h3b d = o54.d(context, (AttributeSet) null);
        d.setId(era.f);
        d.setTransitionName(context.getString(jra.q));
        KProperty[] kPropertyArr = I0;
        KProperty kProperty = kPropertyArr[1];
        if (((Number) this.v0.a(this)).longValue() != 0) {
            d.setTitle(jra.c0);
        } else {
            KProperty kProperty2 = kPropertyArr[0];
            if (((long[]) this.Z.a(this)).length > 1) {
                d.setTitle(jra.W);
            } else {
                d.setTitle(jra.Y);
            }
        }
        d.setForm(z2b.a);
        d.setLeftActions(new p2b(new rx2(20, this)));
        return d;
    }

    public final void g(int i, Bundle bundle) {
        if (i == era.b) {
            ra6.b.W0().d();
        }
    }

    public final ukb g0() {
        ia6 ia6 = ia6.a;
        Class<x23> cls = x23.class;
        Class<gaf> cls2 = gaf.class;
        nb6 nb6 = new nb6(ia6.getAccessor().h(cls), ia6.getAccessor().h(cls2));
        Lazy lazy = LazyKt.lazy(new a46(4));
        d19 d19 = new d19(false, ia6.getAccessor().h(c48.class), ia6.getAccessor().h(jqg.class), ia6.getAccessor().h(ar6.class));
        Set<Long> set = null;
        Long valueOf = getArgs().getLong("attach_to_forward") == 0 ? null : Long.valueOf(getArgs().getLong("attach_to_forward"));
        long[] longArray = getArgs().getLongArray("messages_to_forward");
        if (longArray != null) {
            set = ArraysKt.toSet(longArray);
        }
        Set<Long> emptySet = set == null ? SetsKt.emptySet() : set;
        KProperty kProperty = I0[2];
        return new ya6(emptySet, nb6, this.Y, d19, valueOf, ((Boolean) this.w0.a(this)).booleanValue(), (Context) ia6.getAccessor().g(Context.class), ia6.getAccessor().h(cls2), lazy, ia6.getAccessor().h(e0b.class), ia6.getAccessor().h(cls));
    }

    public final yh7 getInsetsConfig() {
        return this.z;
    }

    public final pgd getScreenDelegate() {
        return this.y;
    }

    public final boolean handleBack() {
        e9d e9d = this.D0;
        if (e9d != null && e9d.n()) {
            ((ya6) l0().c).q.C(og9.a);
            return true;
        } else if (!(!((Collection) l0().x.a.getValue()).isEmpty())) {
            return super.handleBack();
        } else {
            KProperty[] kPropertyArr = BottomSheetWidget.v0;
            e9d e9d2 = null;
            ng3 a = b0h.a(new igf(gra.c), (Bundle) null, 6);
            a.b(era.b, new igf(gra.b));
            a.c(era.a, new igf(gra.a));
            ConfirmationBottomSheet e = a.e();
            e.setTargetController(this);
            zx3 zx3 = this;
            while (zx3.getParentController() != null) {
                zx3 = zx3.getParentController();
            }
            l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
            if (l9d != null) {
                e9d2 = l9d.K();
            }
            e.p0(this);
            if (e9d2 == null) {
                return true;
            }
            i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
            a81.t(false, i9d, true, "BottomSheetWidget");
            e9d2.G(i9d);
            return true;
        }
    }

    public final xme i0() {
        return this.X;
    }

    public final Set m0(Bundle bundle) {
        return SetsKt.emptySet();
    }

    public final dc9 o0() {
        KProperty kProperty = I0[4];
        return (dc9) this.z0.getValue();
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.C0 = null;
        this.D0 = null;
        xr8 xr8 = this.F0;
        if (xr8 != null) {
            xr8.a();
        }
        this.F0 = null;
        ymf ymf = this.H0;
        if (ymf != null) {
            ymf.dismiss();
        }
        this.H0 = null;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [oz1, android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    public final void onViewCreated(View view) {
        View view2 = view;
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view2;
        h88.f(j0(), J0, (Function1) null);
        ? frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(era.d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout.setLayoutParams(layoutParams);
        int i = pq7.a;
        frameLayout.setTranslationY((float) pq7.a(frameLayout.getContext()));
        h88.f(frameLayout, new yh7((jdb) null, new nr0(jdb.o, mr0.a, false), 1), (Function1) null);
        this.C0 = frameLayout;
        this.D0 = getChildRouter(frameLayout);
        viewGroup.addView(frameLayout);
        bs0.K(new ps5(l0().x, new kb6(this, view2, (Continuation) null), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(new i21(new k26(l0().x, 3), ((ya6) l0().c).s, new sh0(3, (Continuation) null, 1), 4), getViewLifecycleOwner().getLifecycle(), iu7.o), new ib6((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(((ya6) l0().c).p, new lb6((Continuation) null, this), 5), getViewLifecycleScope());
        ViewGroup j0 = j0();
        e9d e9d = this.D0;
        oz1 oz1 = this.C0;
        if (e9d != null && oz1 != null) {
            cb6 cb6 = new cb6(this, 1);
            boolean z2 = ((ccb) ia6.a.getAccessor().g(ccb.class)).b && Build.VERSION.SDK_INT >= 30;
            tu7 viewLifecycleScope = getViewLifecycleScope();
            pg9 pg9 = (pg9) ((etc) ((ya6) l0().c).q.c).a.getValue();
            this.F0 = new xr8(e9d, oz1, j0, cb6, z2, viewLifecycleScope, (pg9 != null ? pg9.a : null) == og9.b, new j35(15, (Object) this, (Object) j0));
            new qr8((sr8) this.B0.getValue(), o0()).a(getViewLifecycleScope());
            bs0.K(new ps5(new on2((etc) ((ya6) l0().c).q.c, 28), new eb6(this, j0, (Continuation) null), 5), getViewLifecycleScope());
        }
    }

    public final occ p0() {
        return (occ) this.A0.getValue(this, I0[5]);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ForwardPickerScreen(long[] jArr, Long l, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr, (i & 2) != 0 ? null : l, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
    }

    public ForwardPickerScreen(long[] jArr, Long l, boolean z2, boolean z3) {
        this(o54.f(TuplesKt.to("messages_to_forward", jArr), TuplesKt.to("attach_to_forward", l), TuplesKt.to("is_forward_attach", Boolean.valueOf(z2)), TuplesKt.to("show_external_sharing", Boolean.valueOf(z3))));
    }
}
