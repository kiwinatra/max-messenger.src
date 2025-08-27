package defpackage;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;

/* renamed from: ble  reason: default package */
public final class ble extends j3h {
    public static final ble b = new j3h(8);

    public final pa4 n1(long j) {
        return new pa4(wj6.j(j, ":chats?id=", "&type=local"));
    }

    public final void o1() {
        W0().b(":chat-list", (Bundle) null);
    }

    public final void p1(Function1 function1) {
        W0().e(new uzb(4, function1));
    }
}
