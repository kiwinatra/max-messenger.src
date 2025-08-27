package one.me.calls.ui.bottomsheet.ratecall;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/calls/ui/bottomsheet/ratecall/CallRateBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lgpc;", "Lmpc;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "callId", "", "isVideoCall", "", "sdkReasons", "(Ljava/lang/String;ZLjava/util/List;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCallRateBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallRateBottomSheet.kt\none/me/calls/ui/bottomsheet/ratecall/CallRateBottomSheet\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 ContextExt.kt\none/me/common/ext/ContextExtKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,202:1\n420#2:203\n420#2:204\n420#2:205\n235#2,10:206\n410#2,8:226\n410#2,8:234\n410#2,8:242\n410#2,8:250\n410#2,8:258\n24#3:216\n24#3:217\n24#3:218\n24#3:219\n24#3:220\n24#3:222\n24#3:225\n20#4:221\n256#5,2:223\n256#5,2:266\n256#5,2:268\n256#5,2:270\n*S KotlinDebug\n*F\n+ 1 CallRateBottomSheet.kt\none/me/calls/ui/bottomsheet/ratecall/CallRateBottomSheet\n*L\n47#1:203\n48#1:204\n49#1:205\n53#1:206,10\n137#1:226,8\n141#1:234,8\n145#1:242,8\n157#1:250,8\n161#1:258,8\n72#1:216\n84#1:217\n93#1:218\n112#1:219\n113#1:220\n117#1:222\n127#1:225\n115#1:221\n121#1:223,2\n191#1:266,2\n193#1:268,2\n194#1:270,2\n*E\n"})
@SuppressLint({"ValidController"})
public final class CallRateBottomSheet extends BottomSheetWidget implements gpc, mpc {
    public static final /* synthetic */ KProperty[] G0;
    public final Lazy A0;
    public final ReadOnlyProperty B0;
    public final ReadOnlyProperty C0;
    public final ReadOnlyProperty D0;
    public final ReadOnlyProperty E0;
    public final ReadOnlyProperty F0;
    public final is w0;
    public final is x0;
    public final is y0;
    public final AutoTransition z0;

    static {
        Class<CallRateBottomSheet> cls = CallRateBottomSheet.class;
        G0 = new KProperty[]{wj6.p(cls, "callId", "getCallId()Ljava/lang/String;", 0), wj6.p(cls, "isVideoCall", "isVideoCall()Z", 0), wj6.p(cls, "sdkReasons", "getSdkReasons()Ljava/util/List;", 0), wj6.p(cls, "title", "getTitle()Landroid/widget/TextView;", 0), wj6.p(cls, "rateCallButtonGroup", "getRateCallButtonGroup()Lone/me/calls/ui/bottomsheet/ratecall/view/RateCallButtonGroup;", 0), wj6.p(cls, "reasonsChipGroup", "getReasonsChipGroup()Lone/me/calls/ui/bottomsheet/ratecall/view/RateCallReasonsChipGroup;", 0), wj6.p(cls, "sendButton", "getSendButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), wj6.p(cls, "customReasonEditText", "getCustomReasonEditText()Lone/me/calls/ui/bottomsheet/ratecall/view/CustomReasonInputView;", 0)};
    }

    public CallRateBottomSheet(Bundle bundle) {
        super(bundle);
        this.w0 = new is(String.class, "ratecall:call_id");
        this.x0 = new is(Boolean.class, "ratecall:is_video_call");
        this.y0 = new is(List.class, "ratecall:sdk_reasons");
        this.z0 = new AutoTransition();
        this.A0 = createViewModelLazy(fg1.class, new s(14, new j6(27, this)));
        this.B0 = viewBinding(qqa.l0);
        this.C0 = viewBinding(qqa.e0);
        this.D0 = viewBinding(qqa.f0);
        this.E0 = viewBinding(qqa.k0);
        this.F0 = viewBinding(qqa.g0);
    }

    /* JADX WARNING: type inference failed for: r5v7, types: [android.widget.LinearLayout, android.view.View, ipc] */
    public final View n0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        TextView textView = new TextView(context);
        textView.setId(qqa.l0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 24;
        layoutParams.bottomMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        puf.b.b(textView, uy4.b);
        b0h.H(textView, new ra(3, (Continuation) null, 1));
        ? linearLayout = new LinearLayout(context, (AttributeSet) null);
        linearLayout.b = 3;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.c = CollectionsKt.emptyList();
        linearLayout.setId(qqa.e0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setGravity(17);
        linearLayout.setListener(this);
        npc npc = new npc(context, (AttributeSet) null);
        npc.setId(qqa.f0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        npc.setLayoutParams(layoutParams3);
        npc.setListener(this);
        OneMeButton oneMeButton = new OneMeButton(context, (AttributeSet) null);
        oneMeButton.setId(qqa.k0);
        oneMeButton.setSize(aqa.c);
        oneMeButton.setMode(zpa.a);
        oneMeButton.setAppearance(xpa.o);
        oneMeButton.setText(sqa.a0);
        ct.G(oneMeButton, 300, new x4(16, (Object) this));
        c54 c54 = new c54(context);
        c54.setId(qqa.g0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        float f2 = (float) 84;
        c54.setMinimumHeight(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        layoutParams4.bottomMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        c54.setLayoutParams(layoutParams4);
        c54.setHint(q8.p(sqa.I, c54.getContext()));
        c54.setMaxCount(50);
        c54.setMinimumHeight(MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        c54.setTextChangeListener(new l(18, this));
        c54.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(frameLayout.getContext());
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        float f3 = (float) 12;
        linearLayout2.setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density), 0);
        linearLayout2.addView(textView);
        linearLayout2.addView(linearLayout);
        linearLayout2.addView(npc);
        linearLayout2.addView(c54);
        linearLayout2.addView(oneMeButton);
        return linearLayout2;
    }

    public final void onViewCreated(View view) {
        etc etc = r0().z;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(etc, getViewLifecycleOwner().getLifecycle(), iu7), new tf1((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(r0().Y, getViewLifecycleOwner().getLifecycle(), iu7), new uf1((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(r0().v0, getViewLifecycleOwner().getLifecycle(), iu7), new vf1((Continuation) null, view, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(r0().w0, getViewLifecycleOwner().getLifecycle(), iu7), new wf1((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(r0().x0, getViewLifecycleOwner().getLifecycle(), iu7), new xf1((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final npc q0() {
        return (npc) this.D0.getValue(this, G0[5]);
    }

    public final fg1 r0() {
        return (fg1) this.A0.getValue();
    }

    public CallRateBottomSheet(String str, boolean z, List<String> list) {
        this(o54.f(TuplesKt.to("ratecall:call_id", str), TuplesKt.to("ratecall:is_video_call", Boolean.valueOf(z)), TuplesKt.to("ratecall:sdk_reasons", list)));
    }
}
