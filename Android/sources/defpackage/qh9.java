package defpackage;

import android.view.KeyEvent;
import android.view.View;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: qh9  reason: default package */
public final /* synthetic */ class qh9 implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qh9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        CharSequence text;
        Object obj = this.b;
        boolean z = true;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = MessageWriteWidget.C0;
                MessageWriteWidget messageWriteWidget = (MessageWriteWidget) obj;
                if (!((Boolean) messageWriteWidget.z.getValue()).booleanValue() || i != 66 || keyEvent.getAction() != 0 || (text = messageWriteWidget.d0().getText()) == null || StringsKt.isBlank(text)) {
                    return false;
                }
                messageWriteWidget.l0();
                return true;
            default:
                if (!(keyEvent.getAction() == 0 && i == 67)) {
                    z = false;
                }
                ((zwa) obj).v = z;
                return false;
        }
    }
}
