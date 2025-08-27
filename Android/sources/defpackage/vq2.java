package defpackage;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* renamed from: vq2  reason: default package */
public final class vq2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5a b;

    public /* synthetic */ vq2(ChatTitleIconScreen chatTitleIconScreen, v5a v5a, int i) {
        this.a = i;
        this.b = v5a;
    }

    public final Object invoke(Object obj) {
        v5a v5a = this.b;
        switch (this.a) {
            case 0:
                ble ble = (ble) obj;
                ble.o1();
                ble.Y0(ble.n1(((lq2) v5a).b));
                return Unit.INSTANCE;
            case 1:
                ble ble2 = (ble) obj;
                ble2.o1();
                String j = wj6.j(((kq2) v5a).b, ":profile/edit/link?id=", "&type=local_chat&flow=create");
                Unit unit = Unit.INSTANCE;
                ble2.W0().b(j, (Bundle) null);
                return Unit.INSTANCE;
            default:
                ble ble3 = (ble) obj;
                ble3.o1();
                String i = wj6.i(((jq2) v5a).b, ":start-conversation/add-subscribers?id=");
                Unit unit2 = Unit.INSTANCE;
                ble3.W0().b(i, (Bundle) null);
                return Unit.INSTANCE;
        }
    }
}
