package defpackage;

import android.content.Context;

/* renamed from: hc3  reason: default package */
public final /* synthetic */ class hc3 implements m9c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hc3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                ic3 ic3 = (ic3) this.b;
                ic3.getClass();
                mb3 mb3 = (mb3) this.c;
                return mb3.f.g(new soc(mb3, (cc3) ic3));
            case 1:
                return new vx6((Context) this.b, (String) this.c);
            default:
                hp5 hp5 = (hp5) this.b;
                String c2 = hp5.c();
                fac fac = (fac) hp5.d.a(fac.class);
                return new x64((Context) this.c, c2);
        }
    }
}
