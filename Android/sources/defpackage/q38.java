package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: q38  reason: default package */
public final class q38 implements dn4 {
    public final ngf a;
    public final Function0 b;
    public final Function1 c;
    public final int o;
    public final Function1 v;
    public final long w;
    public final xme x;
    public final etc y;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q38(ngf ngf, Function0 function0, Function1 function1, int i, int i2) {
        this(ngf, function0, function1, (i2 & 8) != 0 ? 0 : i, (Function1) null);
    }

    public final ome a() {
        return this.y;
    }

    public final void b(o94 o94) {
        if (o94.a == this.w) {
            Function0 function0 = this.b;
            this.c.invoke(Boolean.valueOf(!((Boolean) function0.invoke()).booleanValue()));
            this.x.setValue(d());
            Function1 function1 = this.v;
            if (function1 != null) {
                function1.invoke(function0.invoke());
            }
        }
    }

    public final List d() {
        n94 n94 = new n94(((Boolean) this.b.invoke()).booleanValue());
        return CollectionsKt.listOf(new o94(this.w, this.a, this.o, (ngf) null, n94, 8));
    }

    public q38(ngf ngf, Function0 function0, Function1 function1, int i, Function1 function12) {
        this.a = ngf;
        this.b = function0;
        this.c = function1;
        this.o = i;
        this.v = function12;
        this.w = cw0.a.incrementAndGet();
        xme a2 = f6e.a(d());
        this.x = a2;
        this.y = new etc(a2);
    }
}
