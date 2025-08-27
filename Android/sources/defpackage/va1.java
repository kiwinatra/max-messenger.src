package defpackage;

import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: va1  reason: default package */
public final class va1 implements bs5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object v;

    public /* synthetic */ va1(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.v = obj4;
    }

    public final Object e(ds5 ds5, Continuation continuation) {
        switch (this.a) {
            case 0:
                bs5[] bs5Arr = (bs5[]) this.b;
                Object h = fqc.h(ds5, continuation, new ta1(bs5Arr, 0), new ua1((Continuation) null, (d14) this.c, (List) this.o, (ya1) this.v), bs5Arr);
                return h == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? h : Unit.INSTANCE;
            case 1:
                Object e = ((bs5) this.b).e(new j12(1, ds5, (Comparator) this.c, (tw2) this.o, (Long) this.v), continuation);
                return e == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e : Unit.INSTANCE;
            case 2:
                Object e2 = ((bs5) this.b).e(new j12(2, ds5, (rh7) this.c, (Lazy) this.o, (Lazy) this.v), continuation);
                return e2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e2 : Unit.INSTANCE;
            case 3:
                Object e3 = ((bs5) this.b).e(new j12(3, ds5, (xk7) this.c, (Lazy) this.o, (Lazy) this.v), continuation);
                return e3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e3 : Unit.INSTANCE;
            default:
                Object e4 = ((bs5) this.b).e(new j12(4, ds5, (Comparator) this.c, (jib) this.o, (Long) this.v), continuation);
                return e4 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e4 : Unit.INSTANCE;
        }
    }
}
