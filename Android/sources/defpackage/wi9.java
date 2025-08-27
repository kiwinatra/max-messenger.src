package defpackage;

import ru.ok.messages.constructor.MessagesConstructorDraftView;

/* renamed from: wi9  reason: default package */
public final /* synthetic */ class wi9 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesConstructorDraftView b;

    public /* synthetic */ wi9(MessagesConstructorDraftView messagesConstructorDraftView, int i) {
        this.a = i;
        this.b = messagesConstructorDraftView;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                l2a l2a = this.b.w;
                if (l2a != null) {
                    l2a.N(new zj0(25));
                    return;
                }
                return;
            case 1:
                l2a l2a2 = this.b.w;
                if (l2a2 != null) {
                    l2a2.N(new zj0(24));
                    return;
                }
                return;
            default:
                l2a l2a3 = this.b.w;
                if (l2a3 != null) {
                    l2a3.N(new zj0(26));
                    return;
                }
                return;
        }
    }
}
