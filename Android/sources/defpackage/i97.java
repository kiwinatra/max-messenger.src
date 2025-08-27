package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: i97  reason: default package */
public final class i97 {
    public static final Lazy d = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new a46(23));
    public int a;
    public List b;
    public final dg4 c = new dg4();

    public i97() {
        a();
    }

    public final void a() {
        this.a = this.c.a;
        List<g97> list = this.b;
        if (list != null) {
            for (g97 b2 : list) {
                this.a = Math.max(this.a, b2.b());
            }
        }
    }
}
