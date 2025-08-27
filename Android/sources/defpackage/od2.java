package defpackage;

import java.util.function.UnaryOperator;

/* renamed from: od2  reason: default package */
public final /* synthetic */ class od2 implements UnaryOperator {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ sr4 d;

    public /* synthetic */ od2(long j, long j2, String str, sr4 sr4) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = sr4;
    }

    public final Object apply(Object obj) {
        ld2 ld2 = (ld2) obj;
        return new ld2(this.a, this.b, this.c, this.d, false);
    }
}
