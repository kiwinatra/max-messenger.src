package defpackage;

import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.reflect.KProperty;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.richvector.VectorPath;

/* renamed from: mg3  reason: default package */
public final /* synthetic */ class mg3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mg3(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ConfirmationBottomSheet.D0;
                ConfirmationBottomSheet confirmationBottomSheet = (ConfirmationBottomSheet) obj;
                confirmationBottomSheet.getClass();
                KProperty[] kPropertyArr2 = ConfirmationBottomSheet.D0;
                KProperty kProperty = kPropertyArr2[4];
                is isVar = confirmationBottomSheet.B0;
                if (!((Boolean) isVar.a(confirmationBottomSheet)).booleanValue()) {
                    KProperty kProperty2 = kPropertyArr2[4];
                    isVar.b(confirmationBottomSheet, Boolean.TRUE);
                    zx3 targetController = confirmationBottomSheet.getTargetController();
                    qg3 qg3 = targetController instanceof qg3 ? (qg3) targetController : null;
                    if (qg3 != null) {
                        KProperty kProperty3 = kPropertyArr2[3];
                        qg3.g(i, (Bundle) confirmationBottomSheet.z0.a(confirmationBottomSheet));
                    }
                }
                confirmationBottomSheet.i0(true);
                return;
            default:
                tpc tpc = (tpc) obj;
                tpc.E0 = i;
                for (int i2 = 0; i2 < 5; i2++) {
                    ImageView imageView = (ImageView) tpc.getChildAt(i2);
                    if (i2 <= i) {
                        imageView.setImageResource(mua.b);
                    } else {
                        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(tpc.getContext(), mua.c);
                        int i3 = fu4.k.e(tpc.getContext()).f().h().j;
                        VectorPath findPath = enhancedVectorDrawable.findPath("stroke");
                        if (findPath != null) {
                            findPath.setStrokeColor(i3);
                            enhancedVectorDrawable.invalidatePath();
                        }
                        imageView.setImageDrawable(enhancedVectorDrawable);
                    }
                }
                tpc.setContentDescription(tpc.getResources().getQuantityString(oua.a, 5, new Object[]{Integer.valueOf(tpc.getSelected()), 5}));
                spc spc = tpc.F0;
                if (spc != null) {
                    int selected = tpc.getSelected();
                    u00 u00 = (u00) spc;
                    KProperty[] kPropertyArr3 = FakeInAppReviewBottomSheet.F0;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) u00.b;
                    appCompatTextView.setPressed(false);
                    FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) u00.c;
                    appCompatTextView.setBackground((RippleDrawable) fakeInAppReviewBottomSheet.C0.getValue());
                    appCompatTextView.setTextColor(-1);
                    ct.G(appCompatTextView, 300, new r13(fakeInAppReviewBottomSheet, selected, (FrameLayout) u00.o, 1));
                    return;
                }
                return;
        }
    }
}
