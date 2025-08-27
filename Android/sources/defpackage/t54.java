package defpackage;

import android.content.Context;
import javax.inject.Provider;

/* renamed from: t54  reason: default package */
public final class t54 {
    public Context a;

    /* JADX WARNING: type inference failed for: r0v2, types: [u54, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v3, types: [java.lang.Object, d19] */
    /* JADX WARNING: type inference failed for: r1v6, types: [aqg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v0, types: [srd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v5, types: [n09, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v8, types: [javax.inject.Provider, java.lang.Object, hr6] */
    public u54 a() {
        Context context = this.a;
        if (context != null) {
            ? obj = new Object();
            obj.a = gr4.a(q8.d);
            er7 er7 = new er7(22, (Object) context);
            obj.b = er7;
            v9a v9a = gsg.i;
            gga gga = hsg.i;
            ? obj2 = new Object();
            obj2.b = er7;
            obj2.c = v9a;
            obj2.a = gga;
            obj.c = gr4.a(new dm4(18, (Object) er7, (Object) obj2));
            er7 er72 = obj.b;
            v9a v9a2 = cvg.d;
            gga gga2 = vzg.a;
            ? obj3 = new Object();
            obj3.a = er72;
            obj3.b = v9a2;
            obj3.c = gga2;
            obj.o = obj3;
            Provider a2 = gr4.a(new vs6(20, (Object) er72));
            obj.v = a2;
            Provider a3 = gr4.a(new q13(obj.o, a2));
            obj.w = a3;
            syc syc = new syc(2);
            er7 er73 = obj.b;
            gga gga3 = hsg.i;
            ? obj4 = new Object();
            obj4.a = er73;
            obj4.b = a3;
            obj4.c = syc;
            obj4.o = gga3;
            Provider provider = obj.a;
            Provider provider2 = obj.c;
            zc4 zc4 = new zc4((Object) provider, (Object) provider2, (Object) obj4, (Object) a3, (Object) a3);
            v9a v9a3 = gsg.i;
            gga gga4 = hsg.i;
            ? obj5 = new Object();
            obj5.b = er73;
            obj5.c = provider2;
            obj5.a = a3;
            obj5.o = obj4;
            obj5.v = provider;
            obj5.w = a3;
            obj5.x = v9a3;
            obj5.y = gga4;
            obj5.z = a3;
            m7f m7f = new m7f(provider, a3, obj4, a3);
            v9a v9a4 = gsg.i;
            gga gga5 = hsg.i;
            ? obj6 = new Object();
            obj6.a = v9a4;
            obj6.b = gga5;
            obj6.c = zc4;
            obj6.o = obj5;
            obj6.v = m7f;
            obj.x = gr4.a(obj6);
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }
}
