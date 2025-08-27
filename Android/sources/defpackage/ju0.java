package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* renamed from: ju0  reason: default package */
public final /* synthetic */ class ju0 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ju0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 0:
                iq.o((Function1) this.b, this.c, (CoroutineContext) obj3);
                return Unit.INSTANCE;
            default:
                Unit unit = (Unit) obj2;
                CoroutineContext coroutineContext = (CoroutineContext) obj3;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a0a.h;
                zz9 zz9 = (zz9) this.c;
                Object obj4 = zz9.b;
                a0a a0a = (a0a) this.b;
                atomicReferenceFieldUpdater.set(a0a, obj4);
                a0a.e(zz9.b);
                return Unit.INSTANCE;
        }
    }
}
