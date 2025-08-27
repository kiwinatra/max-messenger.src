package defpackage;

import android.content.Context;
import java.io.File;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: gg2  reason: default package */
public final /* synthetic */ class gg2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object v;

    public /* synthetic */ gg2(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.v = obj4;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new ns8((Context) jxb.a.getAccessor().g(Context.class), ((ltb) ((jtb) this.b)).a, (ed2) this.c, (Lazy) this.o, (Lazy) this.v);
            case 1:
                return new dn5((File) this.b, (en5) this.c, (fn5) this.o, (wie) this.v);
            case 2:
                b89 b89 = (b89) this.c;
                long j = b89.a;
                fa9 fa9 = (fa9) this.b;
                fa9.C(j, b89.c);
                oa9 oa9 = oa9.SENT;
                ha9 ha9 = (ha9) this.o;
                fa9.z(ha9, oa9);
                rm rmVar = ((ov9) this.v).c;
                if (rmVar == null) {
                    rmVar = null;
                }
                fa9.y(ha9, qe8.g(b89.y, (bjd) rmVar.I.getValue()));
                return Unit.INSTANCE;
            default:
                return new kr9((Lazy) this.o, (Lazy) this.v, (Lazy) this.b, (Lazy) this.c);
        }
    }

    public /* synthetic */ gg2(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.a = 3;
        this.o = lazy;
        this.v = lazy2;
        this.b = lazy3;
        this.c = lazy4;
    }
}
