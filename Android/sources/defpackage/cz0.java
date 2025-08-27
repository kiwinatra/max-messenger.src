package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: cz0  reason: default package */
public final /* synthetic */ class cz0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ef1 b;

    public /* synthetic */ cz0(ef1 ef1, int i) {
        this.a = i;
        this.b = ef1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.k;
            default:
                return Integer.valueOf(this.b.r());
        }
    }
}
