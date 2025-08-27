package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: j45  reason: default package */
public final /* synthetic */ class j45 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k45 b;

    public /* synthetic */ j45(k45 k45, int i) {
        this.a = i;
        this.b = k45;
    }

    public final Object invoke() {
        y35 y35;
        switch (this.a) {
            case 0:
                try {
                    y35 = new y35(this.b.a.getResources());
                } catch (Exception unused) {
                    y35 = null;
                }
                return new v25(y35);
            default:
                k45 k45 = this.b;
                return new f35((v25) k45.b.getValue(), k45.d, k45.c, k45.e);
        }
    }
}
