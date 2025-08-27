package defpackage;

import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;

/* renamed from: g99  reason: default package */
public final class g99 {
    public final Lazy a;
    public final Lazy b;

    public g99(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [qae, java.util.Map] */
    /* JADX WARNING: type inference failed for: r4v4, types: [hj7, java.lang.Object] */
    public final void a(long j, e99 e99, ne9 ne9, f99 f99) {
        nd ndVar = (nd) this.a.getValue();
        Pair[] pairArr = {TuplesKt.to("message_id", Long.valueOf(j)), TuplesKt.to("element_type", Integer.valueOf(e99.a)), TuplesKt.to("source_id", Long.valueOf(ne9.a)), TuplesKt.to("source_type", Integer.valueOf(ne9.b))};
        ? qae = new qae(4);
        for (int i = 0; i < 4; i++) {
            Pair pair = pairArr[i];
            qae.put(pair.getFirst(), pair.getSecond());
        }
        ? obj = new Object();
        obj.a = System.currentTimeMillis();
        obj.v = "MESSAGE_CLICKABLE_ELEMENT_ACTIONS";
        obj.w = f99.a;
        Lazy lazy = this.b;
        obj.b = ((qjd) ((x23) lazy.getValue())).s();
        obj.c(qae);
        obj.c = ((a33) ((x23) lazy.getValue())).B();
        ndVar.j(obj.d());
    }
}
