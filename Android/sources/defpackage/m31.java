package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;
import one.me.settings.privacy.ui.pincode.ConfirmPinCodeScreen;

/* renamed from: m31  reason: default package */
public final /* synthetic */ class m31 implements ya4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ m31(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public final Object a() {
        switch (this.a) {
            case 0:
                return new CallJoinLinkPreviewWidget(this.b);
            case 1:
                return new CallOpponentsListWidget(this.b, (DefaultConstructorMarker) null);
            default:
                return new ConfirmPinCodeScreen(this.b);
        }
    }
}
