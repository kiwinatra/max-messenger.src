package defpackage;

import android.view.View;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: oh9  reason: default package */
public final /* synthetic */ class oh9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageWriteWidget b;

    public /* synthetic */ oh9(MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = messageWriteWidget;
    }

    public final void onClick(View view) {
        MessageWriteWidget messageWriteWidget = this.b;
        switch (this.a) {
            case 0:
                messageWriteWidget.v.f.j = messageWriteWidget.d0().getText();
                mh9 h0 = messageWriteWidget.h0();
                xag.h(h0.Z, ah9.a);
                return;
            default:
                KProperty[] kPropertyArr = MessageWriteWidget.C0;
                mh9 h02 = messageWriteWidget.h0();
                tg9 tg9 = (tg9) h02.F0.getValue();
                if (tg9 == null || tg9.a <= 0) {
                    h02.u((Long) null);
                    return;
                } else {
                    h02.t((Long) null, true);
                    return;
                }
        }
    }
}
