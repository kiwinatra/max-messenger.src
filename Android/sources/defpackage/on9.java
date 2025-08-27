package defpackage;

import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: on9  reason: default package */
public final class on9 implements mj9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;

    public /* synthetic */ on9(MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = messagesListWidget;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                MessagesListWidget messagesListWidget = this.b;
                if (messagesListWidget.getView() == null) {
                    z68.p("ScrollEvent", "Can't process itemsChangedCallback because root view is null");
                    return;
                } else if (messagesListWidget.f0().b()) {
                    messagesListWidget.e0().I.f(this);
                    return;
                } else {
                    z68.p("ScrollEvent", "Can't process itemsChangedCallback because scroll is not meet requirements");
                    return;
                }
            default:
                MessagesListWidget messagesListWidget2 = this.b;
                messagesListWidget2.H0.b(messagesListWidget2.h0(), 0, 0);
                return;
        }
    }

    public final String getTag() {
        switch (this.a) {
            case 0:
                return "ScrollEvent";
            default:
                return "ReadMarkUpdater";
        }
    }
}
