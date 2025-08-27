package defpackage;

import java.util.ArrayList;
import kotlin.reflect.KProperty;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;

/* renamed from: cb1  reason: default package */
public final class cb1 implements dn1 {
    public final /* synthetic */ CallJoinLinkPreviewWidget a;

    public cb1(CallJoinLinkPreviewWidget callJoinLinkPreviewWidget) {
        this.a = callJoinLinkPreviewWidget;
    }

    public final void y() {
        Object value;
        qa1 qa1;
        KProperty[] kPropertyArr = CallJoinLinkPreviewWidget.z0;
        xme xme = this.a.g0().Z;
        do {
            value = xme.getValue();
            qa1 = (qa1) value;
        } while (!xme.b(value, qa1.a(qa1, (zd0) null, (aj8) null, (aj8) null, !qa1.d, (ngf) null, (ArrayList) null, (ngf) null, 119)));
    }
}
