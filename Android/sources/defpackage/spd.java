package defpackage;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: spd  reason: default package */
public final class spd {
    public final Object a;
    public final Function3 b;
    public final Function3 c;
    public final Object d;
    public final Object e;
    public final Function3 f;
    public Object g;
    public int h = -1;
    public final /* synthetic */ upd i;

    public spd(upd upd, Object obj, Function3 function3, Function3 function32, Object obj2, SuspendLambda suspendLambda, Function3 function33) {
        this.i = upd;
        this.a = obj;
        this.b = function3;
        this.c = function32;
        this.d = obj2;
        this.e = suspendLambda;
        this.f = function33;
    }

    public final void a() {
        Object obj = this.g;
        if (obj instanceof iod) {
            ((iod) obj).h(this.h, this.i.a);
            return;
        }
        pq4 pq4 = obj instanceof pq4 ? (pq4) obj : null;
        if (pq4 != null) {
            pq4.dispose();
        }
    }
}
