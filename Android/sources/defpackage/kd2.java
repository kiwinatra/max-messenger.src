package defpackage;

import java.util.function.UnaryOperator;

/* renamed from: kd2  reason: default package */
public final /* synthetic */ class kd2 implements UnaryOperator {
    public final /* synthetic */ ha9 a;
    public final /* synthetic */ s10 b;
    public final /* synthetic */ l20 c;
    public final /* synthetic */ sr4 d;

    public /* synthetic */ kd2(ha9 ha9, s10 s10, l20 l20, sr4 sr4) {
        this.a = ha9;
        this.b = s10;
        this.c = l20;
        this.d = sr4;
    }

    public final Object apply(Object obj) {
        ld2 ld2 = (ld2) obj;
        return new ld2(this.a.b, this.b.a, this.c.q, this.d, false);
    }
}
