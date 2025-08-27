package defpackage;

import kotlin.reflect.KProperty;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;

/* renamed from: ab1  reason: default package */
public final /* synthetic */ class ab1 implements m8d {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallJoinLinkPreviewWidget b;

    public /* synthetic */ ab1(CallJoinLinkPreviewWidget callJoinLinkPreviewWidget, int i) {
        this.a = i;
        this.b = callJoinLinkPreviewWidget;
    }

    public final void b() {
        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = CallJoinLinkPreviewWidget.z0;
                ya1 g0 = callJoinLinkPreviewWidget.g0();
                nfd nfd = aj8.a;
                aj8 aj8 = ((qa1) callJoinLinkPreviewWidget.g0().v0.getValue()).b;
                nfd.getClass();
                g0.k(!nfd.r(aj8));
                return;
            default:
                KProperty[] kPropertyArr2 = CallJoinLinkPreviewWidget.z0;
                ya1 g02 = callJoinLinkPreviewWidget.g0();
                nfd nfd2 = aj8.a;
                aj8 aj82 = ((qa1) callJoinLinkPreviewWidget.g0().v0.getValue()).c;
                nfd2.getClass();
                g02.l(!nfd.r(aj82));
                return;
        }
    }
}
