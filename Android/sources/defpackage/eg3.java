package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;

/* renamed from: eg3  reason: default package */
public final class eg3 extends xag implements hg3 {
    public static final /* synthetic */ KProperty[] Z = {rae.s(eg3.class, "codeInputJob", "getCodeInputJob()Lkotlinx/coroutines/Job;", 0)};
    public final s85 X = new s85(0);
    public final s85 Y = new s85(0);
    public final String b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final Lazy w;
    public final xme x;
    public final on2 y;
    public final wie z = o5a.U();

    public eg3(String str) {
        e3e e3e = e3e.a;
        Lazy h = e3e.getAccessor().h(x23.class);
        Lazy h2 = e3e.getAccessor().h(ywf.class);
        Lazy c2 = e3e.c();
        Lazy h3 = e3e.getAccessor().h(m95.class);
        this.b = str;
        this.c = h;
        this.o = h2;
        this.v = c2;
        this.w = h3;
        xme a = f6e.a(bg3.a);
        this.x = a;
        this.y = new on2(a, 28);
    }

    public final void c(String str) {
        aje g = xag.g(this, ((osa) ((gaf) this.v.getValue())).a().plus(new n95((m95) this.w.getValue())), (f14) null, new dg3(str, this, (Continuation) null), 2);
        this.z.setValue(this, Z[0], g);
    }
}
