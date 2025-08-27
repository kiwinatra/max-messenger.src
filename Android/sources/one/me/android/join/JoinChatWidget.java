package one.me.android.join;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.android.deeplink.LinkInterceptorActivity;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B+\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/android/join/JoinChatWidget;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "", "link", "title", "", "isChannel", "(JLjava/lang/String;Ljava/lang/String;Z)V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nJoinChatWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JoinChatWidget.kt\none/me/android/join/JoinChatWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 7 View.kt\nandroidx/core/view/ViewKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 ContextExt.kt\none/me/common/ext/ContextExtKt\n*L\n1#1,165:1\n420#2:166\n420#2:167\n419#2:168\n420#2:169\n235#2,10:170\n32#3:180\n17#3:181\n19#3:185\n46#4:182\n51#4:184\n105#5:183\n24#6:186\n24#6:187\n24#6:188\n24#6:199\n142#7,8:189\n1#8:197\n20#9:198\n*S KotlinDebug\n*F\n+ 1 JoinChatWidget.kt\none/me/android/join/JoinChatWidget\n*L\n38#1:166\n39#1:167\n40#1:168\n41#1:169\n43#1:170,10\n63#1:180\n63#1:181\n63#1:185\n63#1:182\n63#1:184\n63#1:183\n94#1:186\n95#1:187\n101#1:188\n149#1:199\n101#1:189,8\n121#1:198\n*E\n"})
public final class JoinChatWidget extends BaseBottomSheetWidget {
    public static final /* synthetic */ KProperty[] v0;
    public static final String w0 = "join:id";
    public static final String x0 = "join:link";
    public static final String y0 = "join:title";
    public static final String z0 = "join:channel";
    public final is X;
    public final Lazy Y;
    public final boolean Z;
    public final is y;
    public final is z;

    static {
        Class<JoinChatWidget> cls = JoinChatWidget.class;
        v0 = new KProperty[]{wj6.p(cls, "id", "getId()J", 0), wj6.p(cls, "link", "getLink()Ljava/lang/String;", 0), wj6.p(cls, "title", "getTitle()Ljava/lang/String;", 0), wj6.p(cls, "isChannel", "isChannel()Z", 0)};
    }

    public JoinChatWidget(Bundle bundle) {
        super(bundle);
        Class<String> cls = String.class;
        this.y = new is(cls, x0);
        this.z = new is(cls, (Object) null, y0);
        this.X = new is(Boolean.class, z0);
        Lazy<VM> createViewModelLazy = createViewModelLazy(do7.class, new i76(7, new u75(28, this)));
        this.Y = createViewModelLazy;
        this.Z = true;
        bs0.K(new ps5(new k26(ct.k(((do7) createViewModelLazy.getValue()).v, this.lifecycleOwner.getLifecycle(), iu7.o), 18), new tn7(this, (Continuation) null), 5), getLifecycleScope());
    }

    public final boolean isDialog() {
        return this.Z;
    }

    public final void j0() {
        super.j0();
        Activity d = getRouter().d();
        LinkInterceptorActivity linkInterceptorActivity = d instanceof LinkInterceptorActivity ? (LinkInterceptorActivity) d : null;
        if (linkInterceptorActivity != null) {
            linkInterceptorActivity.finish();
        }
    }

    public final void m0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        String str;
        int roundToInt = MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density);
        float f = (float) 12;
        frameLayout.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), roundToInt, MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density));
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f2 = (float) 16;
        textView.setPaddingRelative(textView.getPaddingStart(), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), textView.getPaddingEnd(), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        KProperty[] kPropertyArr = v0;
        KProperty kProperty = kPropertyArr[3];
        is isVar = this.X;
        boolean booleanValue = ((Boolean) isVar.a(this)).booleanValue();
        is isVar2 = this.z;
        if (booleanValue) {
            Context context = textView.getContext();
            int i = rkc.join_chat_title_channel;
            KProperty kProperty2 = kPropertyArr[2];
            str = context.getString(i, new Object[]{(String) isVar2.a(this)});
        } else {
            Context context2 = textView.getContext();
            int i2 = rkc.join_chat_title_chat;
            KProperty kProperty3 = kPropertyArr[2];
            str = context2.getString(i2, new Object[]{(String) isVar2.a(this)});
        }
        textView.setText(str);
        puf.c.b(textView, uy4.b);
        b0h.H(textView, new ra(3, (Continuation) null, 16));
        linearLayout.addView(textView);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        aqa aqa = aqa.c;
        oneMeButton.setSize(aqa);
        zpa zpa = zpa.o;
        oneMeButton.setMode(zpa);
        xpa xpa = xpa.c;
        oneMeButton.setAppearance(xpa);
        KProperty kProperty4 = kPropertyArr[3];
        oneMeButton.setText((CharSequence) q8.p(((Boolean) isVar.a(this)).booleanValue() ? rkc.join_chat_confirm_channel_button : rkc.join_chat_confirm_chat_button, oneMeButton.getContext()));
        ct.G(oneMeButton, 300, new h24(13, (Object) oneMeButton, (Object) this));
        linearLayout.addView(oneMeButton);
        OneMeButton oneMeButton2 = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        oneMeButton2.setSize(aqa);
        oneMeButton2.setMode(zpa);
        oneMeButton2.setAppearance(xpa);
        oneMeButton2.setText(rkc.join_chat_cancel_button);
        ct.G(oneMeButton2, 300, new xu3(21, (Object) this));
        linearLayout.addView(oneMeButton2);
        frameLayout.addView(linearLayout, -1, -2);
        nu4 nu4 = new nu4(frameLayout.getContext());
        nu4.setTranslationY((float) g63.b((float) 6, vo4.c().getDisplayMetrics().density, -roundToInt));
        frameLayout.addView(nu4);
    }

    public final void onViewCreated(View view) {
        fma onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            b0h.b(onBackPressedDispatcher, getViewLifecycleOwner(), new rx2(28, this));
        }
        getRouter().I();
    }

    public JoinChatWidget(long j, String str, String str2, boolean z2) {
        this(o54.f(TuplesKt.to(w0, Long.valueOf(j)), TuplesKt.to(x0, str), TuplesKt.to(y0, str2), TuplesKt.to(z0, Boolean.valueOf(z2))));
    }
}
