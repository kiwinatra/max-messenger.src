package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: an1  reason: default package */
public final /* synthetic */ class an1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gn1 b;

    public /* synthetic */ an1(gn1 gn1, int i) {
        this.a = i;
        this.b = gn1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return gn1.N(this.b);
            case 1:
                Function0 function0 = this.b.O0;
                if (function0 != null) {
                    return (p6g) function0.invoke();
                }
                return null;
            default:
                return gn1.L(this.b);
        }
    }
}
