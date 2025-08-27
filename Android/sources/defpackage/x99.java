package defpackage;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* renamed from: x99  reason: default package */
public final /* synthetic */ class x99 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5a b;

    public /* synthetic */ x99(v5a v5a, int i) {
        this.a = i;
        this.b = v5a;
    }

    public final Object invoke() {
        v5a v5a = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = MessageContextMenuBottomSheet.X0;
                fk9.b.Y0((pa4) v5a);
                return Unit.INSTANCE;
            case 1:
                KProperty[] kPropertyArr2 = MessagesListWidget.R0;
                fk9 fk9 = fk9.b;
                l4b l4b = (l4b) v5a;
                long j = l4b.b;
                ta4 W0 = fk9.W0();
                StringBuilder n = tr1.n(j, ":call-user?opponent_id=", "&video_enabled=");
                n.append(l4b.c);
                W0.b(n.toString(), (Bundle) null);
                return Unit.INSTANCE;
            default:
                KProperty[] kPropertyArr3 = MessagesListWidget.R0;
                fk9 fk92 = fk9.b;
                String str = ((z3b) v5a).d;
                ta4 W02 = fk92.W0();
                W02.b(":call-join-link?link=" + str, (Bundle) null);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ x99(MessageContextMenuBottomSheet messageContextMenuBottomSheet, v5a v5a) {
        this.a = 0;
        this.b = v5a;
    }
}
