package defpackage;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: ix2  reason: default package */
public final class ix2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5a b;

    public /* synthetic */ ix2(v5a v5a, int i) {
        this.a = i;
        this.b = v5a;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                vt3 vt3 = vt3.b;
                qje qje = (qje) this.b;
                vt3.n1(qje.b, qje.c);
                return Unit.INSTANCE;
            case 1:
                r4c r4c = r4c.b;
                a5c a5c = (a5c) this.b;
                long j = a5c.b;
                ta4 W0 = r4c.W0();
                W0.b(":call-user?opponent_id=" + j + "&video_enabled=" + a5c.d, (Bundle) null);
                return Unit.INSTANCE;
            default:
                r4c r4c2 = r4c.b;
                a5c a5c2 = (a5c) this.b;
                long j2 = a5c2.b;
                ta4 W02 = r4c2.W0();
                W02.b(":call-chat?chat_id=" + j2 + "&video_enabled=" + a5c2.d, (Bundle) null);
                return Unit.INSTANCE;
        }
    }
}
