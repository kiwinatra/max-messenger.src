package defpackage;

import android.os.Bundle;
import android.view.View;
import kotlin.reflect.KProperty;
import one.me.keyboardmedia.MediaKeyboardWidget;

/* renamed from: yr8  reason: default package */
public final /* synthetic */ class yr8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaKeyboardWidget b;

    public /* synthetic */ yr8(MediaKeyboardWidget mediaKeyboardWidget, int i) {
        this.a = i;
        this.b = mediaKeyboardWidget;
    }

    public final void onClick(View view) {
        MediaKeyboardWidget mediaKeyboardWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = MediaKeyboardWidget.A0;
                nq7 nq7 = nq7.b;
                mediaKeyboardWidget.getClass();
                KProperty kProperty = MediaKeyboardWidget.A0[0];
                long longValue = ((Number) mediaKeyboardWidget.a.a(mediaKeyboardWidget)).longValue();
                ta4 W0 = nq7.W0();
                W0.b(":stickers/showcase?chat_id=" + longValue, (Bundle) null);
                return;
            default:
                KProperty[] kPropertyArr2 = MediaKeyboardWidget.A0;
                View view2 = mediaKeyboardWidget.getView();
                if (view2 != null) {
                    b0h.K(view2, qw6.KEYBOARD_TAP);
                }
                xag.h(((sr8) mediaKeyboardWidget.c.getValue()).v, kr8.a);
                return;
        }
    }
}
