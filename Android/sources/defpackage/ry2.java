package defpackage;

import java.util.Comparator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: ry2  reason: default package */
public final class ry2 extends qh0 {
    public final String a;
    public final Function0 b;
    public final v00 c = new v00(16);
    public final rx2 d = new rx2(2, this);

    public ry2(String str, Function0 function0) {
        this.a = str;
        this.b = function0;
    }

    public final Comparator a() {
        return this.c;
    }

    public final Function1 b() {
        return this.d;
    }

    public final Function0 c() {
        return this.b;
    }
}
