package one.me.calls.ui.bottomsheet.record;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/calls/ui/bottomsheet/record/StartRecordBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nStartRecordBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartRecordBottomSheet.kt\none/me/calls/ui/bottomsheet/record/StartRecordBottomSheet\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,122:1\n419#2:123\n255#2,9:124\n235#2,10:133\n24#3:143\n24#3:144\n24#3:147\n24#3:148\n172#4,2:145\n*S KotlinDebug\n*F\n+ 1 StartRecordBottomSheet.kt\none/me/calls/ui/bottomsheet/record/StartRecordBottomSheet\n*L\n40#1:123\n42#1:124,9\n43#1:133,10\n59#1:143\n68#1:144\n75#1:147\n81#1:148\n68#1:145,2\n*E\n"})
public final class StartRecordBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ KProperty[] y0 = {wj6.p(StartRecordBottomSheet.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0)};
    public final Lazy w0;
    public final Lazy x0;

    public StartRecordBottomSheet(Bundle bundle) {
        super(bundle);
        is isVar = new is(egd.class, new egd("default"), Widget.ARG_SCOPE_ID);
        KProperty kProperty = y0[0];
        this.w0 = m1571getSharedViewModelcp94BC8(((egd) isVar.a(this)).a, jj1.class, (Function0) null);
        this.x0 = createViewModelLazy(ame.class, new mle(1, new lce(3, this)));
    }

    public final k2b g0() {
        return l2b.a;
    }

    public final void k0() {
        Activity activity = getActivity();
        if (activity != null) {
            kr7.A(activity);
        }
    }

    public final View n0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(qqa.J0);
        puf.c.b(textView, uy4.b);
        l2b l2b = l2b.a;
        xef xef = l2b.i;
        textView.setTextColor(xef.e);
        textView.setGravity(17);
        float f = (float) 24;
        textView.setPadding(0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0, MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density));
        textView.setText(sqa.y0);
        EditText editText = new EditText(linearLayout.getContext());
        editText.setId(qqa.G0);
        puf.k.b(editText, uy4.b);
        editText.setHintTextColor(xef.f);
        editText.setTextColor(xef.e);
        float f2 = (float) 16;
        int roundToInt = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2);
        editText.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        editText.setInputType(524288);
        l21 l21 = ((k91) ((jj1) ((ame) this.x0.getValue()).b).C0.a.getValue()).f;
        editText.setHint(l21 != null ? l21.b : null);
        editText.setClipToOutline(true);
        editText.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
        editText.setOutlineProvider(new n04((float) MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2)));
        editText.setBackgroundColor(l2b.d.a.h);
        ol3 ol3 = new ol3(linearLayout.getContext(), (AttributeSet) null);
        ol3.setId(qqa.H0);
        ol3.setPadding(0, MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), 0, MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        ol3.setName(sqa.u0);
        ol3.setMessage(ol3.getContext().getString(sqa.t0));
        ol3.setCustomTheme(l2b);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(qqa.I0);
        oneMeButton.setMode(zpa.a);
        oneMeButton.setSize(aqa.c);
        oneMeButton.setAppearance(xpa.o);
        oneMeButton.setCustomTheme(l2b);
        oneMeButton.setText(sqa.x0);
        ct.G(oneMeButton, 300, new kqc(14, (Object) this, (Object) editText));
        linearLayout.addView(textView, -1, -2);
        linearLayout.addView(editText, -1, -2);
        linearLayout.addView(ol3, -1, -2);
        linearLayout.addView(oneMeButton, -1, -2);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        Activity activity = getActivity();
        if (activity != null) {
            kr7.A(activity);
        }
    }

    public StartRecordBottomSheet(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, Widget.ARG_SCOPE_ID)));
    }
}
