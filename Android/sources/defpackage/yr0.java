package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.sdk.bottomsheet.BottomSheetWidget;

/* renamed from: yr0  reason: default package */
public final /* synthetic */ class yr0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetWidget b;

    public /* synthetic */ yr0(BottomSheetWidget bottomSheetWidget, int i) {
        this.a = i;
        this.b = bottomSheetWidget;
    }

    public final Object invoke() {
        Window window;
        View currentFocus;
        View view = null;
        BottomSheetWidget bottomSheetWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = BottomSheetWidget.v0;
                Activity activity = bottomSheetWidget.getActivity();
                if (!(activity == null || (window = activity.getWindow()) == null || (currentFocus = window.getCurrentFocus()) == null)) {
                    currentFocus.clearFocus();
                    int i = pq7.a;
                    if (pq7.b(pq7.c)) {
                        boolean o0 = bottomSheetWidget.o0();
                        KProperty kProperty = BottomSheetWidget.v0[0];
                        bottomSheetWidget.Y.b(bottomSheetWidget, Boolean.valueOf(o0));
                        kr7.C(currentFocus);
                    }
                    view = currentFocus;
                }
                bottomSheetWidget.X = view;
                return Unit.INSTANCE;
            default:
                View view2 = bottomSheetWidget.X;
                if (view2 != null) {
                    view2.requestFocus();
                    KProperty kProperty2 = BottomSheetWidget.v0[0];
                    if (((Boolean) bottomSheetWidget.Y.a(bottomSheetWidget)).booleanValue()) {
                        view2.requestFocus();
                        view2.post(new uo5(17, (Object) view2, (Object) view2));
                    }
                }
                bottomSheetWidget.X = null;
                return Unit.INSTANCE;
        }
    }
}
