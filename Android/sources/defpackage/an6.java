package defpackage;

import android.view.View;
import android.view.ViewStub;
import kotlin.math.MathKt;
import ru.ok.messages.media.mediabar.NumericCheckButton;

/* renamed from: an6  reason: default package */
public final /* synthetic */ class an6 implements ViewStub.OnInflateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pzc b;

    public /* synthetic */ an6(pzc pzc, int i) {
        this.a = i;
        this.b = pzc;
    }

    public final void onInflate(ViewStub viewStub, View view) {
        switch (this.a) {
            case 0:
                View findViewById = view.findViewById(lic.check_button_parent);
                NumericCheckButton numericCheckButton = (NumericCheckButton) view.findViewById(lic.check_button);
                bn6 bn6 = (bn6) this.b;
                bn6.E0 = numericCheckButton;
                int roundToInt = MathKt.roundToInt(((float) 10) * bn6.a.getContext().getResources().getDisplayMetrics().density);
                if (findViewById != null) {
                    b59.x(roundToInt, roundToInt, roundToInt, roundToInt, findViewById, numericCheckButton);
                    return;
                }
                return;
            default:
                View findViewById2 = view.findViewById(sya.b);
                one.me.sdk.gallery.view.NumericCheckButton numericCheckButton2 = (one.me.sdk.gallery.view.NumericCheckButton) view.findViewById(sya.a);
                cn6 cn6 = (cn6) this.b;
                cn6.E0 = numericCheckButton2;
                int roundToInt2 = MathKt.roundToInt(((float) 10) * cn6.a.getContext().getResources().getDisplayMetrics().density);
                if (findViewById2 != null) {
                    b59.x(roundToInt2, roundToInt2, roundToInt2, roundToInt2, findViewById2, numericCheckButton2);
                    return;
                }
                return;
        }
    }
}
