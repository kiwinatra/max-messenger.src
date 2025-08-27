package defpackage;

import kotlin.reflect.KProperty;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: ao9  reason: default package */
public final class ao9 implements mj9 {
    public final /* synthetic */ MessagesListWidget a;

    public ao9(MessagesListWidget messagesListWidget) {
        this.a = messagesListWidget;
    }

    public final void b() {
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, "AutoPlayRegulator", "Player autoplay. Try start autoplay after recycler layout.", (Throwable) null);
        }
        MessagesListWidget messagesListWidget = this.a;
        KProperty[] kPropertyArr = MessagesListWidget.R0;
        EndlessRecyclerView2 h0 = messagesListWidget.h0();
        u3b.a(h0, new wn9(h0, this.a, 1));
        this.a.e0().I.f(this);
    }

    public final String getTag() {
        return "AutoPlayRegulator";
    }
}
