package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: tx2  reason: default package */
public final /* synthetic */ class tx2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gaf b;

    public /* synthetic */ tx2(gaf gaf, int i) {
        this.a = i;
        this.b = gaf;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return e14.a(((osa) this.b).b());
            default:
                return new at6(e14.a(((osa) this.b).a()));
        }
    }
}
