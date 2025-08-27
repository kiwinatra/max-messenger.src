package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: o0  reason: default package */
public final class o0 implements r2f {
    public final /* synthetic */ gv4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ p0 f;

    public o0(p0 p0Var, jnb jnb, String str, Object obj, Object obj2, int i) {
        this.f = p0Var;
        this.a = jnb;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = i;
    }

    public final Object get() {
        pa7 pa7;
        p0 p0Var = this.f;
        gv4 gv4 = this.a;
        String str = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        int i = this.e;
        knb knb = (knb) p0Var;
        knb.getClass();
        qa7 qa7 = (qa7) obj;
        ba7 ba7 = knb.p;
        int y = tr1.y(i);
        if (y == 0) {
            pa7 = pa7.FULL_FETCH;
        } else if (y == 1) {
            pa7 = pa7.DISK_CACHE;
        } else if (y == 2) {
            pa7 = pa7.BITMAP_MEMORY_CACHE;
        } else {
            StringBuilder sb = new StringBuilder("Cache level");
            sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "BITMAP_MEMORY_CACHE" : "DISK_CACHE" : "FULL_FETCH");
            sb.append("is not supported. ");
            throw new RuntimeException(sb.toString());
        }
        pa7 pa72 = pa7;
        zb6 zb6 = null;
        if (gv4 instanceof jnb) {
            jnb jnb = (jnb) gv4;
            synchronized (jnb) {
                HashSet hashSet = jnb.G;
                if (hashSet != null) {
                    zb6 = new zb6((Set) hashSet);
                }
            }
        }
        return ba7.b(qa7, obj2, pa72, zb6, str);
    }

    public final String toString() {
        w28 K = hsg.K(this);
        K.x(this.c.toString(), "request");
        return K.toString();
    }
}
