package defpackage;

import java.util.function.UnaryOperator;

/* renamed from: yi2  reason: default package */
public final class yi2 implements UnaryOperator {
    public final /* synthetic */ wj9 a;

    public yi2(wj9 wj9) {
        this.a = wj9;
    }

    public final Object apply(Object obj) {
        zh2 zh2 = (zh2) obj;
        wj9 wj9 = this.a;
        return new zh2(wj9.c, wj9.b);
    }
}
