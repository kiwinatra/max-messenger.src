package defpackage;

import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: eo9  reason: default package */
public final class eo9 extends yl7 implements phf {
    public final /* synthetic */ MessagesListWidget L0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eo9(MessagesListWidget messagesListWidget, g6f g6f) {
        super(g6f);
        this.L0 = messagesListWidget;
    }

    public final void onThemeChanged(k2b k2b) {
        g6f g6f = this.L0.Y;
        if (g6f == null) {
            g6f = null;
        }
        g6f.onThemeChanged(k2b);
    }
}
