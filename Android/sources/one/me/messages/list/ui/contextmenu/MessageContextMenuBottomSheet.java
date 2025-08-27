package one.me.messages.list.ui.contextmenu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.messages.list.loader.MessageModel;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.onechat.reactions.ReactionsViewModel;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bB\u0013\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lone/me/messages/list/ui/contextmenu/MessageContextMenuBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lmw3;", "Ltrc;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "y99", "message-list_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMessageContextMenuBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageContextMenuBottomSheet.kt\none/me/messages/list/ui/contextmenu/MessageContextMenuBottomSheet\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 BundleExt.kt\none/me/sdk/uikit/common/BundleExtKt\n+ 4 LazyExt.kt\none/me/sdk/kotlintools/delegates/LazyExtKt\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 6 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 View.kt\nandroidx/core/view/ViewKt\n+ 9 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n*L\n1#1,594:1\n420#2:595\n420#2:596\n420#2:597\n420#2:598\n420#2:599\n419#2:600\n419#2:601\n419#2:602\n419#2:603\n419#2:604\n255#2,9:606\n255#2,9:616\n235#2,10:625\n410#2,8:666\n410#2,8:674\n16#3:605\n16#3:615\n5#4:635\n28#5:636\n24#5:637\n24#5:650\n24#5:652\n24#5:653\n24#5:654\n24#5:657\n24#5:720\n24#5:721\n24#5:722\n28#5:723\n55#6,12:638\n55#6,12:682\n33#6,14:697\n1#7:651\n256#8,2:655\n157#8,8:658\n81#8:719\n326#8,4:724\n326#8,4:728\n135#9,3:694\n138#9,8:711\n*S KotlinDebug\n*F\n+ 1 MessageContextMenuBottomSheet.kt\none/me/messages/list/ui/contextmenu/MessageContextMenuBottomSheet\n*L\n101#1:595\n102#1:596\n103#1:597\n104#1:598\n105#1:599\n106#1:600\n107#1:601\n108#1:602\n109#1:603\n113#1:604\n124#1:606,9\n127#1:616,9\n130#1:625,10\n354#1:666,8\n359#1:674,8\n125#1:605\n128#1:615\n138#1:635\n154#1:636\n157#1:637\n216#1:650\n232#1:652\n257#1:653\n258#1:654\n309#1:657\n455#1:720\n458#1:721\n475#1:722\n489#1:723\n169#1:638,12\n365#1:682,12\n402#1:697,14\n266#1:655,2\n310#1:658,8\n439#1:719\n496#1:724,4\n502#1:728,4\n402#1:694,3\n402#1:711,8\n*E\n"})
@SuppressLint({"ValidController"})
public final class MessageContextMenuBottomSheet extends BottomSheetWidget implements mw3, trc {
    public static final /* synthetic */ KProperty[] X0;
    public final is A0;
    public final is B0;
    public final is C0;
    public final is D0;
    public final is E0;
    public final is F0;
    public final is G0;
    public final is H0;
    public final is I0;
    public final ColorDrawable J0;
    public final ReadOnlyProperty K0;
    public ViewGroup L0;
    public RecyclerView M0;
    public urc N0;
    public final Lazy O0;
    public final Lazy P0;
    public final Lazy Q0;
    public final Lazy R0;
    public final ekd S0;
    public Function0 T0;
    public final b66 U0;
    public final lr0 V0;
    public final int W0;
    public final yh7 w0;
    public final yh7 x0;
    public final yh7 y0;
    public final is z0;

    static {
        Class<MessageContextMenuBottomSheet> cls = MessageContextMenuBottomSheet.class;
        X0 = new KProperty[]{wj6.p(cls, "anchorViewId", "getAnchorViewId()Ljava/lang/Integer;", 0), wj6.p(cls, "anchorClass", "getAnchorClass()Ljava/lang/Class;", 0), wj6.p(cls, "highlightPadding", "getHighlightPadding()Landroid/graphics/Rect;", 0), wj6.p(cls, "highlightRadius", "getHighlightRadius()Ljava/lang/Float;", 0), wj6.p(cls, "parentId", "getParentId()Ljava/lang/Integer;", 0), wj6.p(cls, "showReactionsSelector", "getShowReactionsSelector()Z", 0), wj6.p(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), wj6.p(cls, "messageId", "getMessageId()J", 0), wj6.p(cls, "messageServerId", "getMessageServerId()J", 0), rae.s(cls, "isCallbackSent", "isCallbackSent()Z", 0), wj6.p(cls, "contentContainer", "getContentContainer()Landroid/view/ViewGroup;", 0)};
    }

    public MessageContextMenuBottomSheet() {
        this((Bundle) null, 1, (DefaultConstructorMarker) null);
    }

    public final FrameLayout c0(LayoutInflater layoutInflater, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(hya.b);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setClipToPadding(false);
        ct.G(frameLayout, 300, new u99(0, (Object) this));
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        frameLayout2.setId(cwa.I);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        float f = (float) 10;
        layoutParams.bottomMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        frameLayout2.setLayoutParams(layoutParams);
        ReactionsViewModel j = ((vsc) this.O0.getValue()).j();
        MessageModel s0 = s0();
        List n = j.n(s0 != null ? s0.y0 : null, true);
        KProperty kProperty = X0[5];
        if (((Boolean) this.E0.a(this)).booleanValue() && (!n.isEmpty())) {
            urc urc = new urc(frameLayout2.getContext(), ((aua) vi9.a.getAccessor().g(aua.class)).a());
            urc.a(0, n);
            urc.b = this;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            float f2 = (float) 6;
            layoutParams2.leftMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2);
            layoutParams2.rightMargin = MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density);
            MessageModel s02 = s0();
            layoutParams2.gravity = (s02 == null || !s02.A0) ? 21 : 19;
            frameLayout2.addView(urc.d, layoutParams2);
            frameLayout2.setVisibility(0);
            this.N0 = urc;
        }
        frameLayout.addView(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(frameLayout.getContext());
        frameLayout3.setId(cwa.E);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.topMargin = this.W0;
        frameLayout3.setLayoutParams(layoutParams3);
        frameLayout3.setClipToPadding(false);
        frameLayout3.setOutlineProvider(this.V0);
        m0(frameLayout3, layoutInflater, bundle);
        if (u0()) {
            frameLayout3.setPadding(0, MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), 0, 0);
        } else {
            h88.f(frameLayout3, this.x0, (Function1) null);
        }
        b0h.H(frameLayout3, new x2(this, (Continuation) null, 17));
        frameLayout.addView(frameLayout3);
        return frameLayout;
    }

    public final frb d0() {
        return new qa(this, 3);
    }

    public final void dismiss() {
        i0(true);
    }

    public final yh7 e0() {
        return this.y0;
    }

    public final void k0() {
        Function0 function0 = this.T0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final View n0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        ViewGroup viewGroup;
        Collection collection = null;
        if (u0()) {
            viewGroup = new FrameLayout(getContext());
            h3b d = o54.d(viewGroup.getContext(), (AttributeSet) null);
            d.setId(hya.c);
            d.setForm(z2b.a);
            d.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            d.setAlpha(c44.DEFAULT_ASPECT_RATIO);
            d.setTitle(ewa.K);
            d.setLeftActions(new q2b(new v99(this, 0)));
            h88.f(d, this.w0, (Function1) null);
            viewGroup.addView(d);
            RecyclerView recyclerView = new RecyclerView(layoutInflater.getContext(), (AttributeSet) null);
            recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            recyclerView.setClipToPadding(false);
            b66 b66 = this.U0;
            recyclerView.setAdapter(b66);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.setItemAnimator((yyc) null);
            int roundToInt = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
            recyclerView.setPadding(roundToInt, recyclerView.getPaddingTop(), roundToInt, recyclerView.getPaddingBottom());
            nwe nwe = new nwe(recyclerView, b66, new fl2(5, new wk(23, this, recyclerView)));
            recyclerView.j(nwe);
            recyclerView.j(new j39(fu4.k.e(recyclerView.getContext()).f(), 0));
            h88.f(recyclerView, this.x0, (Function1) null);
            b0h.H(recyclerView, new mb(nwe, (Continuation) null, 1));
            viewGroup.addView(recyclerView);
            this.M0 = recyclerView;
        } else {
            Context context = layoutInflater.getContext();
            Bundle bundle = getArgs().getBundle("actions");
            if (bundle != null) {
                collection = kr7.g(bundle);
            }
            if (collection == null) {
                collection = CollectionsKt.emptyList();
            }
            v99 v99 = new v99(this, 1);
            this.S0.getClass();
            viewGroup = ekd.e(context, collection, v99);
        }
        this.L0 = viewGroup;
        return viewGroup;
    }

    public final void o(Widget widget) {
        setTargetController(widget);
        zx3 zx3 = widget;
        while (zx3.getParentController() != null) {
            zx3 = zx3.getParentController();
        }
        e9d e9d = null;
        l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
        if (l9d != null) {
            e9d = l9d.K();
        }
        p0(widget);
        if (e9d != null) {
            i9d i9d = new i9d(this, (String) null, (ey3) null, (ey3) null, false, -1);
            a81.t(false, i9d, true, "BottomSheetWidget");
            e9d.G(i9d);
        }
    }

    public final boolean o0() {
        return false;
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        zr0 zr0 = new zr0((zx3) this, (Function0) new w99(this, 0));
        if (getRouter() != null) {
            getRouter().a(zr0);
        } else {
            addLifecycleListener(new la(this, zr0, 8));
        }
    }

    public final void onDestroyView(View view) {
        this.M0 = null;
        this.L0 = null;
        this.N0 = null;
        this.T0 = null;
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        KProperty[] kPropertyArr = X0;
        KProperty kProperty = kPropertyArr[0];
        Integer num = (Integer) this.z0.a(this);
        if (num != null) {
            int intValue = num.intValue();
            KProperty kProperty2 = kPropertyArr[1];
            Class cls = (Class) this.A0.a(this);
            if (cls != null) {
                bs6 bs6 = new bs6(cls, intValue);
                this.T0 = bs6.c(this);
                ((ArrayList) bs6.c).add(new fid(new ox0(bs6, f0()), new Rect(), new Rect(), new Rect(), MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density)));
                bs6 bs62 = new bs6(cls, intValue);
                bs62.c(this);
                py6 py6 = new py6(bs62);
                KProperty kProperty3 = kPropertyArr[2];
                KProperty kProperty4 = kPropertyArr[3];
                KProperty kProperty5 = kPropertyArr[4];
                py6.a(view, (Rect) this.B0.a(this), (Float) this.C0.a(this), (Integer) this.D0.a(this));
                if (u0()) {
                    x59 v0 = v0();
                    Lazy lazy = this.O0;
                    aje v = ev0.v(v0.a, ((osa) v0.x).a(), (f14) null, new q59(v0, ((Boolean) ((vsc) lazy.getValue()).j().u.getValue()).booleanValue(), (Continuation) null), 2);
                    v0.z0.setValue(v0, x59.I0[0], v);
                    x59 v02 = v0();
                    bs0.K(new ps5(new dtc(v02.y0.d), new w59(v02, ((Boolean) ((vsc) lazy.getValue()).j().u.getValue()).booleanValue(), (Continuation) null), 5), v02.a);
                    etc etc = v0().E0;
                    iu7 iu7 = iu7.o;
                    bs0.K(new ps5(ct.k(etc, getViewLifecycleOwner().getLifecycle(), iu7), new z99((Continuation) null, this), 5), getViewLifecycleScope());
                    bs0.K(new ps5(ct.k(v0().F0, getViewLifecycleOwner().getLifecycle(), iu7), new aa9((Continuation) null, this), 5), getViewLifecycleScope());
                }
            }
        }
    }

    public final void q0(int i) {
        KProperty[] kPropertyArr = X0;
        KProperty kProperty = kPropertyArr[9];
        is isVar = this.I0;
        if (!((Boolean) isVar.a(this)).booleanValue()) {
            KProperty kProperty2 = kPropertyArr[9];
            isVar.b(this, Boolean.TRUE);
            zx3 targetController = getTargetController();
            cx3 cx3 = targetController instanceof cx3 ? (cx3) targetController : null;
            if (cx3 != null) {
                cx3.s(i, (Bundle) null);
            }
        }
        i0(true);
    }

    public final ViewGroup r0() {
        return (ViewGroup) this.K0.getValue(this, X0[10]);
    }

    public final MessageModel s0() {
        KProperty kProperty = X0[7];
        return ((wj9) ((en9) this.P0.getValue()).m1.a.getValue()).d(((Number) this.G0.a(this)).longValue());
    }

    public final boolean u0() {
        return ((Boolean) this.R0.getValue()).booleanValue();
    }

    public final x59 v0() {
        return (x59) this.Q0.getValue();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MessageContextMenuBottomSheet(Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bundle);
    }

    public MessageContextMenuBottomSheet(Bundle bundle) {
        super(bundle);
        jdb jdb = jdb.c;
        jdb jdb2 = anf.a;
        this.w0 = new yh7(jdb, (nr0) null, 2);
        this.x0 = new yh7((jdb) null, new nr0(jdb.b, mr0.c, false), 1);
        this.y0 = yh7.c;
        Class<Integer> cls = Integer.class;
        this.z0 = new is(cls, "anchor_id");
        this.A0 = new is(Class.class, "anchor_class");
        this.B0 = new is(Rect.class, "highlight_padding");
        this.C0 = new is(Float.class, "highlight_radius");
        this.D0 = new is(cls, "parent_id");
        Boolean bool = Boolean.FALSE;
        Class<Boolean> cls2 = Boolean.class;
        is isVar = new is(cls2, bool, "show_reactions_selector");
        this.E0 = isVar;
        Class<Long> cls3 = Long.class;
        this.F0 = new is(cls3, 0L, "chat_id");
        this.G0 = new is(cls3, 0L, "message_id");
        this.H0 = new is(cls3, 0L, "message_server_id");
        this.I0 = new is(cls2, bool, "callback_sent");
        this.J0 = new ColorDrawable();
        this.K0 = viewBinding(cwa.E);
        Class<egd> cls4 = egd.class;
        egd egd = (egd) ((Parcelable) n54.k(getArgs(), Widget.ARG_SCOPE_ID, cls4));
        String str = egd != null ? egd.a : null;
        this.O0 = m1571getSharedViewModelcp94BC8(str == null ? m1570getScopeIdIluPPks() : str, vsc.class, (Function0) null);
        egd egd2 = (egd) ((Parcelable) n54.k(getArgs(), Widget.ARG_SCOPE_ID, cls4));
        String str2 = egd2 != null ? egd2.a : null;
        this.P0 = m1571getSharedViewModelcp94BC8(str2 == null ? m1570getScopeIdIluPPks() : str2, en9.class, (Function0) null);
        this.Q0 = createViewModelLazy(x59.class, new i76(25, new w99(this, 1)));
        this.R0 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new w99(this, 2));
        ekd ekd = new ekd(9);
        this.S0 = ekd;
        this.U0 = new b66(((aua) vi9.a.getAccessor().g(aua.class)).a(), ekd, new hq7(v0()), new v99(this, 2));
        this.V0 = new lr0(vo4.c().getDisplayMetrics().density * 20.0f, 1);
        KProperty kProperty = X0[5];
        this.W0 = ((Boolean) isVar.a(this)).booleanValue() ? g63.b((float) 10, vo4.c().getDisplayMetrics().density, g63.b((float) 32, vo4.c().getDisplayMetrics().density, MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density) * 2)) : 0;
        l0(false);
    }
}
