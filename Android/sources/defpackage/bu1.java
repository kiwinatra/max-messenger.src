package defpackage;

import kotlin.jvm.functions.Function1;

/* renamed from: bu1  reason: default package */
public final /* synthetic */ class bu1 implements bj6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bu1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                ((eu1) this.b).k((dvb) obj);
                return null;
            case 1:
                z48 z48 = (z48) obj;
                z48.j = (qac) this.b;
                return z48;
            case 2:
                Void voidR = (Void) obj;
                ((eub) this.b).b(jub.b);
                return null;
            default:
                return (cvb) ((Function1) this.b).invoke(obj);
        }
    }
}
