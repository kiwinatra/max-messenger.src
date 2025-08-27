package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: aq  reason: default package */
public final /* synthetic */ class aq implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cq b;

    public /* synthetic */ aq(cq cqVar, int i) {
        this.a = i;
        this.b = cqVar;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                cq cqVar = this.b;
                return new nj0((ltb) cqVar.n.getValue(), (q68) cqVar.s.getValue());
            default:
                return this.b.b();
        }
    }
}
