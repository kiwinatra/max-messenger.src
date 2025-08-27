package one.me.android.externalcallback;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import one.me.sdk.bottomsheet.BottomSheetWidget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/android/externalcallback/ExternalCallbackWidget;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "uriAsParam", "(Ljava/lang/String;)V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nExternalCallbackWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExternalCallbackWidget.kt\none/me/android/externalcallback/ExternalCallbackWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 LazyExt.kt\none/me/sdk/kotlintools/delegates/LazyExtKt\n+ 4 ViewGroupBuilders.kt\none/me/sdk/uikit/common/ViewGroupBuildersKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 7 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,97:1\n235#2,10:98\n410#2,8:128\n5#3:108\n9#4,6:109\n15#4:116\n1#5:115\n1#5:127\n24#6:117\n24#6:126\n24#6:136\n157#7,8:118\n*S KotlinDebug\n*F\n+ 1 ExternalCallbackWidget.kt\none/me/android/externalcallback/ExternalCallbackWidget\n*L\n38#1:98,10\n80#1:128,8\n42#1:108\n57#1:109,6\n57#1:116\n57#1:115\n58#1:117\n68#1:126\n44#1:136\n58#1:118,8\n*E\n"})
@SuppressLint({"ValidController"})
public final class ExternalCallbackWidget extends BottomSheetWidget {
    public static final /* synthetic */ int z0 = 0;
    public final Lazy w0;
    public final Lazy x0;
    public final boolean y0;

    public ExternalCallbackWidget(Bundle bundle) {
        super(bundle);
        this.w0 = createViewModelLazy(ye5.class, new rn2(23, new qr3(24)));
        this.x0 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new qr3(25));
        this.y0 = true;
    }

    public final boolean isDialog() {
        return this.y0;
    }

    public final View n0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(layoutParams);
        float f = (float) 70;
        frameLayout2.setPadding(frameLayout2.getPaddingLeft(), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), frameLayout2.getPaddingRight(), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        TextView textView = new TextView(frameLayout2.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        textView.setGravity(17);
        ArrayList arrayList = wgf.a;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (te7) this.x0.getValue(), (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density));
        textView.setText(ead.q0);
        b0h.H(textView, new x2(this, (Continuation) null, 10));
        frameLayout2.addView(textView);
        return frameLayout2;
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        ye5 ye5 = (ye5) this.w0.getValue();
        String string = getArgs().getString("external_callback_param_arg");
        if (string == null) {
            string = "";
        }
        aje aje = ye5.v;
        if (aje == null || !aje.isActive()) {
            ye5.v = ev0.v(ye5.a, ((osa) ((gaf) ye5.c.getValue())).b(), (f14) null, new xe5(ye5, string, (Continuation) null), 2);
        }
    }

    public final void onViewCreated(View view) {
        bs0.K(new ps5(ct.k(((ye5) this.w0.getValue()).o, getViewLifecycleOwner().getLifecycle(), iu7.o), new ze5((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public ExternalCallbackWidget(String str) {
        this(o54.f(TuplesKt.to("external_callback_param_arg", str)));
    }
}
