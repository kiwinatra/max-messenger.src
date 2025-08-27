package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;

/* renamed from: ku0  reason: default package */
public final /* synthetic */ class ku0 implements Function3 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ru0 b;
    public final /* synthetic */ vpd c;

    public /* synthetic */ ku0(Object obj, ru0 ru0, vpd vpd) {
        this.a = obj;
        this.b = ru0;
        this.c = vpd;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj;
        CoroutineContext coroutineContext = (CoroutineContext) obj3;
        bpa bpa = tu0.l;
        Object obj4 = this.a;
        if (obj4 != bpa) {
            iq.o(this.b.b, obj4, ((upd) this.c).a);
        }
        return Unit.INSTANCE;
    }
}
