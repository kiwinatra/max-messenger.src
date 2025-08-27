package defpackage;

import android.view.View;
import kotlin.reflect.KProperty;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;

/* renamed from: bb1  reason: default package */
public final /* synthetic */ class bb1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallJoinLinkPreviewWidget b;

    public /* synthetic */ bb1(CallJoinLinkPreviewWidget callJoinLinkPreviewWidget, int i) {
        this.a = i;
        this.b = callJoinLinkPreviewWidget;
    }

    public final void onClick(View view) {
        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = CallJoinLinkPreviewWidget.z0;
                callJoinLinkPreviewWidget.getRouter().B(callJoinLinkPreviewWidget);
                return;
            default:
                KProperty[] kPropertyArr2 = CallJoinLinkPreviewWidget.z0;
                ya1 g0 = callJoinLinkPreviewWidget.g0();
                qa1 qa1 = (qa1) g0.v0.getValue();
                nfd nfd = aj8.a;
                aj8 aj8 = qa1.c;
                nfd.getClass();
                xag.h(g0.y0, new e91(g0.b, nfd.r(aj8), nfd.r(qa1.b), qa1.d));
                return;
        }
    }
}
