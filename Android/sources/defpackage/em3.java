package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.reflect.KProperty;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: em3  reason: default package */
public final class em3 extends ClickableSpan {
    public final long a;
    public rt3 b;

    public em3(long j) {
        this.a = j;
    }

    public final void onClick(View view) {
        rt6 rt6;
        rt3 rt3 = this.b;
        if (rt3 != null && (rt6 = ((qx3) rt3.b).G0) != null) {
            KProperty[] kPropertyArr = MessagesListWidget.R0;
            ((MessagesListWidget) rt6.b).k0().z(this.a);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
