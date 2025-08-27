package defpackage;

import android.view.View;
import kotlin.reflect.KProperty;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: a99  reason: default package */
public final /* synthetic */ class a99 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ d99 b;
    public final /* synthetic */ t89 c;

    public /* synthetic */ a99(t89 t89, d99 d99) {
        this.c = t89;
        this.b = d99;
    }

    public final void onClick(View view) {
        t89 t89 = this.c;
        d99 d99 = this.b;
        switch (this.a) {
            case 0:
                long j = d99.H0;
                pn9 pn9 = (pn9) t89;
                pn9.getClass();
                KProperty[] kPropertyArr = MessagesListWidget.R0;
                pn9.a.m0(j, d99.G0);
                return;
            default:
                d99.V(t89, (String) null);
                return;
        }
    }

    public /* synthetic */ a99(d99 d99, t89 t89) {
        this.b = d99;
        this.c = t89;
    }
}
