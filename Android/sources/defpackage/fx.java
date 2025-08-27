package defpackage;

import android.net.Uri;
import kotlin.Lazy;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* renamed from: fx  reason: default package */
public final class fx implements ReadWriteProperty, ee5 {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public volatile Object o;

    public /* synthetic */ fx(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public void b() {
        ((pm) this.b).setSessionInfo((om) null);
        oid oid = oid.c;
        ((o21) this.c).getClass();
        d(oid.b("CGPGAGLGDIHBABABA"));
    }

    public oid c() {
        String str;
        oid oid = (oid) this.o;
        if (oid == null) {
            om sessionInfo = ((pm) this.b).getSessionInfo();
            oid oid2 = oid.c;
            ((o21) this.c).getClass();
            oid b2 = oid2.b("CGPGAGLGDIHBABABA");
            String str2 = null;
            if ((sessionInfo != null ? sessionInfo.c : null) != null) {
                b2 = b2.d(Uri.parse(sessionInfo.c));
            }
            if (sessionInfo != null) {
                str2 = sessionInfo.a;
            }
            oid = (str2 == null || (str = sessionInfo.b) == null) ? b2 : b2.c(sessionInfo.a, str);
        }
        this.o = oid;
        return oid;
    }

    public void d(oid oid) {
        this.o = oid;
        Uri a2 = oid.a();
        yl ylVar = oid.a;
        ((pm) this.b).setSessionInfo(new om(ylVar.d, ylVar.e, a2 != null ? a2.toString() : null));
    }

    public Object getValue(Object obj, KProperty kProperty) {
        switch (this.a) {
            case 0:
                Object obj2 = this.o;
                if (obj2 != null) {
                    return obj2;
                }
                Object value = ((Lazy) this.b).getValue();
                this.o = value;
                return value;
            default:
                Object obj3 = this.o;
                if (obj3 != null) {
                    return obj3;
                }
                Object value2 = ((Lazy) this.b).getValue();
                this.o = value2;
                return value2;
        }
    }

    public void setValue(Object obj, KProperty kProperty, Object obj2) {
        switch (this.a) {
            case 0:
                Object obj3 = this.o;
                this.o = obj2;
                dz6 dz6 = (dz6) obj3;
                ((gx) this.c).k.d((dz6) obj2);
                return;
            default:
                Object obj4 = this.o;
                this.o = obj2;
                dz6 dz62 = (dz6) obj2;
                dz6 dz63 = (dz6) obj4;
                ((zz6) this.c).c.getClass();
                return;
        }
    }

    public fx() {
        this.a = 1;
        this.b = new jk3(5);
    }

    public fx(rjf rjf) {
        this.a = 3;
        this.b = rjf;
        this.o = new hf6(0, 0);
    }
}
