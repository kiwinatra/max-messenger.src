package defpackage;

import java.util.function.UnaryOperator;

/* renamed from: uh2  reason: default package */
public final /* synthetic */ class uh2 implements UnaryOperator {
    public final /* synthetic */ aj2 a;
    public final /* synthetic */ os8 b;
    public final /* synthetic */ ha9 c;

    public /* synthetic */ uh2(aj2 aj2, os8 os8, ha9 ha9) {
        this.a = aj2;
        this.b = os8;
        this.c = ha9;
    }

    public final Object apply(Object obj) {
        os8 os8 = (os8) obj;
        aj2 aj2 = this.a;
        os8 os82 = this.b;
        if (aj2.n(aj2, os82)) {
            return os82;
        }
        long j = this.c.c;
        return new os8(j, j, aj2.F0, aj2.b);
    }
}
