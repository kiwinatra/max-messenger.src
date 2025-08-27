package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* renamed from: cva  reason: default package */
public final /* synthetic */ class cva implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kva b;

    public /* synthetic */ cva(kva kva, int i) {
        this.a = i;
        this.b = kva;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return e14.a((CoroutineContext) this.b.b.d.invoke());
            default:
                po5 po5 = (po5) this.b.b.b.getValue();
                po5.getClass();
                return new u98(po5.g(po5.b(), "upload").getAbsolutePath());
        }
    }
}
