package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: zm4  reason: default package */
public final class zm4 implements bs5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bs5[] b;

    public /* synthetic */ zm4(bs5[] bs5Arr, int i) {
        this.a = i;
        this.b = bs5Arr;
    }

    public final Object e(ds5 ds5, Continuation continuation) {
        switch (this.a) {
            case 0:
                bs5[] bs5Arr = this.b;
                Object h = fqc.h(ds5, continuation, new ta1(bs5Arr, 1), new ym4(3, (Continuation) null, 0), bs5Arr);
                return h == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? h : Unit.INSTANCE;
            case 1:
                bs5[] bs5Arr2 = this.b;
                Object h2 = fqc.h(ds5, continuation, new ta1(bs5Arr2, 2), new ym4(3, (Continuation) null, 1), bs5Arr2);
                return h2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? h2 : Unit.INSTANCE;
            case 2:
                bs5[] bs5Arr3 = this.b;
                Object h3 = fqc.h(ds5, continuation, new ta1(bs5Arr3, 3), new ym4(3, (Continuation) null, 2), bs5Arr3);
                return h3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? h3 : Unit.INSTANCE;
            case 3:
                bs5[] bs5Arr4 = this.b;
                Object h4 = fqc.h(ds5, continuation, new ta1(bs5Arr4, 4), new ym4(3, (Continuation) null, 3), bs5Arr4);
                return h4 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? h4 : Unit.INSTANCE;
            default:
                bs5[] bs5Arr5 = this.b;
                Object h5 = fqc.h(ds5, continuation, new ta1(bs5Arr5, 5), new ym4(3, (Continuation) null, 4), bs5Arr5);
                return h5 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? h5 : Unit.INSTANCE;
        }
    }
}
