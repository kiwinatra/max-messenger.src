package defpackage;

import kotlin.reflect.KProperty;
import one.me.chats.list.ChatsListWidget;
import one.me.contactlist.ContactListWidget;

/* renamed from: vw2  reason: default package */
public final /* synthetic */ class vw2 implements f0b {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8e b;

    public /* synthetic */ vw2(f8e f8e, int i) {
        this.a = i;
        this.b = f8e;
    }

    public final void l(g0b g0b) {
        f8e f8e = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ChatsListWidget.I0;
                f8e.b.invoke(g0b);
                return;
            default:
                KProperty[] kPropertyArr2 = ContactListWidget.N0;
                f8e.b.invoke(g0b);
                return;
        }
    }
}
