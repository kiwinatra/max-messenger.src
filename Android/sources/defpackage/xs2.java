package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import ru.ok.tamtam.logout.a;

/* renamed from: xs2  reason: default package */
public final class xs2 {
    public final /* synthetic */ q4 a;

    public xs2(q4 q4Var) {
        this.a = q4Var;
    }

    public final wt2 a(String str) {
        q4 q4Var = this.a;
        Lazy lazy = LazyKt.lazy(new fb1(1, str, q4Var));
        Lazy lazy2 = LazyKt.lazy(new fb1(2, q4Var, lazy));
        js2 js2 = new js2(lazy, q4Var.h(fu2.class), lazy2);
        Lazy lazy3 = LazyKt.lazy(new vs2(lazy, q4Var, lazy2));
        zz6 zz6 = new zz6(new ox0(6, (Object) lazy, (Object) q4Var), js2, new djd(18), 20, new kn5(a81.m("ChatsListLoader:", str), (byte) 0), true, 32);
        Lazy lazy4 = LazyKt.lazy(new zj2(2, js2));
        Class<gaf> cls = gaf.class;
        gy5 gy5 = new gy5((ns2) q4Var.g(ns2.class), (ct2) lazy.getValue(), (gaf) q4Var.g(cls));
        Lazy h = q4Var.h(qx2.class);
        return new wt2(str, lazy3, zz6, lazy4, (gaf) q4Var.g(cls), (s04) q4Var.g(s04.class), gy5, (bo3) q4Var.g(bo3.class), (a) q4Var.g(a.class), h);
    }
}
