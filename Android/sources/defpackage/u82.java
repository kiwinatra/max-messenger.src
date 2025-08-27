package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;

/* renamed from: u82  reason: default package */
public interface u82 extends s98 {
    static Object e(u82 u82, zx5 zx5, Continuation continuation) {
        ia2 ia2 = (ia2) u82;
        ia2.getClass();
        Object I = ev0.I(ia2.x, new m92(ia2, zx5, (Function0) null, (Continuation) null), continuation);
        return I == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? I : Unit.INSTANCE;
    }

    static Object f(u82 u82, String str, List list, Continuation continuation) {
        ia2 ia2 = (ia2) u82;
        ia2.getClass();
        Object I = ev0.I(ia2.x, new z82(list, ia2, false, str, (Continuation) null), continuation);
        return I == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? I : Unit.INSTANCE;
    }
}
