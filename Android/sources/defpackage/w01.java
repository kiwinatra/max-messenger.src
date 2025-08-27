package defpackage;

import android.widget.PopupWindow;
import kotlin.jvm.functions.Function0;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: w01  reason: default package */
public final /* synthetic */ class w01 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w01(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((z01) this.b).v0 = null;
                return;
            case 1:
                p8d p8d = ((ql1) this.b).G0;
                p8d.setIconTint(l2b.f.f);
                p8d.setMode(k8d.a);
                return;
            case 2:
                ((tl1) this.b).H0 = null;
                return;
            case 3:
                Function0 function0 = ((hx3) this.b).b;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            case 4:
                ((ForwardPickerScreen) this.b).H0 = null;
                return;
            default:
                ((MessageWriteWidget) this.b).B0 = null;
                return;
        }
    }
}
