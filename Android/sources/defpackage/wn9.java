package defpackage;

import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: wn9  reason: default package */
public final class wn9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;

    public /* synthetic */ wn9(EndlessRecyclerView2 endlessRecyclerView2, MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = messagesListWidget;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                MessagesListWidget messagesListWidget = this.b;
                yrc yrc = messagesListWidget.Q0;
                if (yrc != null) {
                    messagesListWidget.h0().u0(yrc);
                    messagesListWidget.h0().m(yrc);
                    yrc yrc2 = messagesListWidget.Q0;
                    if (yrc2 != null) {
                        yrc2.g = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                MessagesListWidget messagesListWidget2 = this.b;
                messagesListWidget2.K0.d(messagesListWidget2.h0(), true);
                return;
        }
    }
}
