package defpackage;

import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: za1  reason: default package */
public final /* synthetic */ class za1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallJoinLinkPreviewWidget b;

    public /* synthetic */ za1(CallJoinLinkPreviewWidget callJoinLinkPreviewWidget, int i) {
        this.a = i;
        this.b = callJoinLinkPreviewWidget;
    }

    public final Object invoke() {
        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = CallJoinLinkPreviewWidget.z0;
                return new lf1(LazyKt.lazy(new za1(callJoinLinkPreviewWidget, 4)), new eng(callJoinLinkPreviewWidget, 0));
            case 1:
                KProperty[] kPropertyArr2 = CallJoinLinkPreviewWidget.z0;
                OneMeButton oneMeButton = new OneMeButton(callJoinLinkPreviewWidget.getContext(), (AttributeSet) null);
                oneMeButton.setId(View.generateViewId());
                oneMeButton.setText(sqa.y);
                oneMeButton.setCustomTheme(l2b.a);
                oneMeButton.setMode(zpa.a);
                oneMeButton.setSize(aqa.c);
                oneMeButton.setAppearance(xpa.o);
                ct.G(oneMeButton, 300, new bb1(callJoinLinkPreviewWidget, 1));
                return oneMeButton;
            case 2:
                KProperty[] kPropertyArr3 = CallJoinLinkPreviewWidget.z0;
                return ew3.b(callJoinLinkPreviewWidget.getContext(), pqa.B);
            case 3:
                KProperty[] kPropertyArr4 = CallJoinLinkPreviewWidget.z0;
                return ew3.b(callJoinLinkPreviewWidget.getContext(), pqa.C);
            case 4:
                KProperty[] kPropertyArr5 = CallJoinLinkPreviewWidget.z0;
                return callJoinLinkPreviewWidget.getRouter();
            case 5:
                KProperty[] kPropertyArr6 = CallJoinLinkPreviewWidget.z0;
                return ew3.b(callJoinLinkPreviewWidget.getContext(), pqa.a0);
            case 6:
                KProperty[] kPropertyArr7 = CallJoinLinkPreviewWidget.z0;
                return ew3.b(callJoinLinkPreviewWidget.getContext(), pqa.c0);
            case 7:
                KProperty[] kPropertyArr8 = CallJoinLinkPreviewWidget.z0;
                TextView textView = new TextView(callJoinLinkPreviewWidget.getContext());
                textView.setId(qqa.L);
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(17);
                textView.setText(sqa.z);
                puf.i.b(textView, uy4.b);
                textView.setTextColor(l2b.i.e);
                return textView;
            case 8:
                KProperty[] kPropertyArr9 = CallJoinLinkPreviewWidget.z0;
                p8d p8d = new p8d(callJoinLinkPreviewWidget.getContext(), (AttributeSet) null);
                p8d.setId(qqa.J);
                p8d.setContentDescription(p8d.getContext().getString(sqa.d));
                p8d.N(pqa.n, l2b.f.f);
                ct.G(p8d, 300, new bb1(callJoinLinkPreviewWidget, 0));
                float f = (float) 40;
                p8d.setImageSize(new l8d(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
                p8d.setButtonPadding(MathKt.roundToInt(((float) 3) * vo4.c().getDisplayMetrics().density));
                p8d.setMode(k8d.a);
                return p8d;
            case 9:
                KProperty[] kPropertyArr10 = CallJoinLinkPreviewWidget.z0;
                e1b e1b = new e1b(callJoinLinkPreviewWidget.getContext());
                e1b.setId(qqa.K);
                e1b.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                return e1b;
            case 10:
                KProperty[] kPropertyArr11 = CallJoinLinkPreviewWidget.z0;
                p8d p8d2 = new p8d(callJoinLinkPreviewWidget.getContext(), (AttributeSet) null);
                p8d2.setId(qqa.M);
                p8d2.setAccessibility(Integer.valueOf(sqa.x));
                p8d2.setTextColor(l2b.i.e);
                p8d2.setListener(new ab1(callJoinLinkPreviewWidget, 0));
                p8d2.setMode(k8d.a);
                p8d2.N(pqa.A, l2b.f.f);
                float f2 = (float) 54;
                p8d2.setImageSize(new l8d(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density)));
                p8d2.setButtonPadding(MathKt.roundToInt(((float) 5) * vo4.c().getDisplayMetrics().density));
                return p8d2;
            default:
                KProperty[] kPropertyArr12 = CallJoinLinkPreviewWidget.z0;
                p8d p8d3 = new p8d(callJoinLinkPreviewWidget.getContext(), (AttributeSet) null);
                p8d3.setId(qqa.P);
                p8d3.N(pqa.Z, l2b.f.f);
                p8d3.setAccessibility(Integer.valueOf(sqa.A));
                p8d3.setTextColor(l2b.i.e);
                p8d3.setMode(k8d.a);
                p8d3.setListener(new ab1(callJoinLinkPreviewWidget, 1));
                float f3 = (float) 54;
                p8d3.setImageSize(new l8d(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density)));
                p8d3.setButtonPadding(MathKt.roundToInt(((float) 5) * vo4.c().getDisplayMetrics().density));
                return p8d3;
        }
    }
}
