package defpackage;

import java.io.File;
import java.io.Serializable;

/* renamed from: ki5  reason: default package */
public final /* synthetic */ class ki5 implements t2f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ki5(Object obj, Serializable serializable, int i) {
        this.a = i;
        this.c = obj;
        this.b = serializable;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                mi5 mi5 = (mi5) this.c;
                mi5.getClass();
                return mi5.a(new z52(4, mi5, (long[]) this.b));
            case 1:
                qi5 qi5 = (qi5) this.c;
                qi5.getClass();
                ade ade = new ade();
                qi5.f.put(Long.valueOf(((jna) qi5.a).g((long[]) this.b, 4)), ade);
                return ade;
            default:
                paf paf = (paf) this.c;
                bcf bcf = (bcf) paf.b.getValue();
                ((ltb) ((jtb) paf.c.getValue())).b.getClass();
                lfd c2 = ((kbf) ((jbf) paf.e.getValue())).c();
                bcf.getClass();
                return new t47(bcf.a, "", (File) this.b, c2);
        }
    }
}
