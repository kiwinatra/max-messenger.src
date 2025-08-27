package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: zz2  reason: default package */
public final class zz2 implements bs5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ fu4 c;

    public /* synthetic */ zz2(bs5 bs5, fu4 fu4, int i) {
        this.a = i;
        this.b = bs5;
        this.c = fu4;
    }

    public final Object e(ds5 ds5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object e = this.b.e(new yz2(ds5, this.c, 0), continuation);
                return e == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e : Unit.INSTANCE;
            case 1:
                Object e2 = this.b.e(new yz2(ds5, this.c, 1), continuation);
                return e2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e2 : Unit.INSTANCE;
            default:
                Object e3 = this.b.e(new yz2(ds5, this.c, 2), continuation);
                return e3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e3 : Unit.INSTANCE;
        }
    }
}
