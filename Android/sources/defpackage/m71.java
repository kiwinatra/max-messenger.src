package defpackage;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: m71  reason: default package */
public final /* synthetic */ class m71 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mz6 b;

    public /* synthetic */ m71(mz6 mz6, int i) {
        this.a = i;
        this.b = mz6;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                b71 b71 = b71.b;
                String str = ((iz6) this.b).e;
                ta4 W0 = b71.W0();
                W0.b(":call-join-link?link=" + str, (Bundle) null);
                return Unit.INSTANCE;
            default:
                b71 b712 = b71.b;
                String str2 = ((jz6) this.b).a;
                ta4 W02 = b712.W0();
                W02.b(":call-join-link?link=" + str2, (Bundle) null);
                return Unit.INSTANCE;
        }
    }
}
