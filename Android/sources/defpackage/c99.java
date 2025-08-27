package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.reflect.KProperty;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: c99  reason: default package */
public final class c99 implements ny7 {
    public final /* synthetic */ t89 a;
    public final /* synthetic */ d99 b;

    public c99(t89 t89, d99 d99) {
        this.a = t89;
        this.b = d99;
    }

    public final void X(String str, sy7 sy7, ClickableSpan clickableSpan, View view) {
        long j = this.b.H0;
        pn9 pn9 = (pn9) this.a;
        pn9.getClass();
        KProperty[] kPropertyArr = MessagesListWidget.R0;
        MessagesListWidget messagesListWidget = pn9.a;
        if (messagesListWidget.k0().v().e()) {
            messagesListWidget.k0().v().f(j);
            return;
        }
        int ordinal = sy7.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                rk9 i0 = messagesListWidget.i0();
                i0.getClass();
                xag.h(i0.z, new nk9(str));
                return;
            } else if (ordinal == 4) {
                messagesListWidget.k0().y(str);
                return;
            } else if (ordinal != 6) {
                return;
            }
        }
        messagesListWidget.k0().x(str);
    }

    public final void Z0(ta9 ta9) {
        long j = this.b.H0;
        pn9 pn9 = (pn9) this.a;
        pn9.getClass();
        KProperty[] kPropertyArr = MessagesListWidget.R0;
        MessagesListWidget messagesListWidget = pn9.a;
        if (messagesListWidget.k0().v().e()) {
            messagesListWidget.k0().v().f(j);
            return;
        }
        if (kn9.$EnumSwitchMapping$2[ta9.c.ordinal()] == 1) {
            long j2 = ta9.a;
            if (j2 <= 0) {
                messagesListWidget.k0().y(ta9.b);
            } else {
                messagesListWidget.k0().z(j2);
            }
        }
    }
}
