package defpackage;

import android.content.Context;
import com.my.tracker.obfuscated.e;
import java.util.Map;
import org.webrtc.EglBase;

/* renamed from: qx4  reason: default package */
public final /* synthetic */ class qx4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ qx4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.v = obj4;
        this.w = obj5;
        this.x = obj6;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((pk4) this.b).u((su1) this.c, (su1) this.o, (q3f) this.v, (q3f) this.w, (Map.Entry) this.x);
                return;
            case 1:
                lhd lhd = (lhd) this.b;
                voc voc = (voc) this.w;
                lhd.getClass();
                lhd.o = new xd6((EglBase.Context) this.c, (Context) this.o, (p1e) this.v, voc);
                lhd.v = new be6(voc, (i8d) this.x);
                lhd.w = new pe6();
                xd6 xd6 = lhd.o;
                be6 be6 = lhd.v;
                xd6.x = be6;
                pe6 pe6 = lhd.w;
                be6.getClass();
                be6.c.c(new zd6(be6, pe6, 0));
                be6 be62 = lhd.v;
                pe6 pe62 = lhd.w;
                be62.getClass();
                be62.c.c(new zd6(be62, pe62, 1));
                return;
            default:
                ((e) this.b).a(this.c, (String) this.o, (String) this.v, (String) this.w, (Map) this.x);
                return;
        }
    }
}
