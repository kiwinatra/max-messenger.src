package defpackage;

import android.view.View;
import kotlin.reflect.KProperty;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;

/* renamed from: vg5  reason: default package */
public final /* synthetic */ class vg5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FakeInAppReviewBottomSheet b;

    public /* synthetic */ vg5(FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet, int i) {
        this.a = i;
        this.b = fakeInAppReviewBottomSheet;
    }

    public final void onClick(View view) {
        FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = this.b;
        switch (this.a) {
            case 0:
                fakeInAppReviewBottomSheet.E0 = false;
                qc7 qc7 = (qc7) mc7.a.getAccessor().j(qc7.class);
                if (qc7 != null) {
                    qc7.b(xc7.b);
                }
                fakeInAppReviewBottomSheet.i0(true);
                return;
            default:
                KProperty[] kPropertyArr = FakeInAppReviewBottomSheet.F0;
                fakeInAppReviewBottomSheet.i0(true);
                return;
        }
    }
}
