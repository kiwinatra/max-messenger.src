package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: aa8  reason: default package */
public final class aa8 implements ds5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oa8 b;

    public /* synthetic */ aa8(oa8 oa8, int i) {
        this.a = i;
        this.b = oa8;
    }

    public final Object a(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object W = ryg.W(new z98(this.b, (List) obj, 0), continuation);
                return W == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? W : Unit.INSTANCE;
            default:
                Object W2 = ryg.W(new z98(this.b, (List) obj, 1), continuation);
                return W2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? W2 : Unit.INSTANCE;
        }
    }
}
