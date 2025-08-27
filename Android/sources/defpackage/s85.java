package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: s85  reason: default package */
public final class s85 implements k6e {
    public final /* synthetic */ int a;
    public final sz9 b;

    public s85(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = m5a.b(1, 0, (cu0) null, 6);
                return;
            default:
                this.b = m5a.b(0, IntCompanionObject.MAX_VALUE, (cu0) null, 4);
                return;
        }
    }

    public final Object e(ds5 ds5, Continuation continuation) {
        switch (this.a) {
            case 0:
                return this.b.e(ds5, continuation);
            default:
                return this.b.e(ds5, continuation);
        }
    }

    public Object h(long j, Continuation continuation) {
        Object a2 = this.b.a(new cwf(j), continuation);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }
}
