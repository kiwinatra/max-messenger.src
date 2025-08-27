package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: tr8  reason: default package */
public final /* synthetic */ class tr8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xr8 b;

    public /* synthetic */ tr8(xr8 xr8, int i) {
        this.a = i;
        this.b = xr8;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                oq7 oq7 = (oq7) this.b.d.invoke();
                if (oq7 != null) {
                    oq7.k();
                }
                return Unit.INSTANCE;
            default:
                xr8 xr8 = this.b;
                xr8.a();
                xr8.l = false;
                return Unit.INSTANCE;
        }
    }
}
