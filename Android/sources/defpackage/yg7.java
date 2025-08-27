package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KProperty;

/* renamed from: yg7  reason: default package */
public final class yg7 extends xag implements oh3 {
    public static final /* synthetic */ KProperty[] X = {rae.s(yg7.class, "registerJob", "getRegisterJob()Lkotlinx/coroutines/Job;", 0)};
    public final /* synthetic */ abg b;
    public final String c;
    public final String o;
    public final wie v = o5a.U();
    public final s85 w = new s85(0);
    public final g85 x = new g85(CollectionsKt.listOf(new Object(), new id(), new Object()));
    public final s85 y;
    public final g12 z;

    public yg7(String str, String str2, Lazy lazy) {
        abg abg = new abg(lazy, new wg7(0));
        this.b = abg;
        this.c = str;
        this.o = str2;
        s85 s85 = new s85(0);
        this.y = s85;
        this.z = bs0.M(s85, new k26(new on2(abg.o, 28), 17));
    }

    public final dtc e() {
        return this.b.o;
    }

    public final void i() {
        KProperty[] kPropertyArr = X;
        KProperty kProperty = kPropertyArr[0];
        wie wie = this.v;
        pm7 pm7 = (pm7) wie.getValue(this, kProperty);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        wie.setValue(this, kPropertyArr[0], (Object) null);
    }

    public final void j(String str, boolean z2) {
        xag.h(this.y, (z2 || str.length() != 0) ? l8e.a : hy6.a);
    }

    public final boolean k(huf huf, String str) {
        c63 a = this.x.a(huf, str);
        ngf ngf = a != null ? (ngf) CollectionsKt.firstOrNull(a.a) : null;
        if (ngf == null) {
            return true;
        }
        xag.h(this.y, new ng7(huf, ngf));
        return false;
    }
}
