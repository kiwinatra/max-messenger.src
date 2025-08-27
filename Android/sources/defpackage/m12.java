package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m12  reason: default package */
public abstract class m12 extends f12 {
    public final bs5 o;

    public m12(bs5 bs5, CoroutineContext coroutineContext, int i, cu0 cu0) {
        super(coroutineContext, i, cu0);
        this.o = bs5;
    }

    public final Object e(ds5 ds5, Continuation continuation) {
        if (this.b == -3) {
            CoroutineContext context = continuation.getContext();
            Boolean bool = Boolean.FALSE;
            ui0 ui0 = new ui0(6);
            CoroutineContext coroutineContext = this.a;
            CoroutineContext plus = !((Boolean) coroutineContext.fold(bool, ui0)).booleanValue() ? context.plus(coroutineContext) : o04.a(context, coroutineContext, false);
            if (Intrinsics.areEqual((Object) plus, (Object) context)) {
                Object m = m(ds5, continuation);
                return m == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m : Unit.INSTANCE;
            }
            ContinuationInterceptor.Key key = ContinuationInterceptor.Key;
            if (Intrinsics.areEqual((Object) plus.get(key), (Object) context.get(key))) {
                CoroutineContext context2 = continuation.getContext();
                if (!(ds5 instanceof fsd) && !(ds5 instanceof laa)) {
                    ds5 = new y40(ds5, context2);
                }
                Object Y = n54.Y(plus, ds5, plus.fold(0, eif.b), new l12(this, (Continuation) null), continuation);
                return Y == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Y : Unit.INSTANCE;
            }
        }
        Object e = super.e(ds5, continuation);
        return e == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e : Unit.INSTANCE;
    }

    public final Object i(cwb cwb, Continuation continuation) {
        Object m = m(new fsd(cwb), continuation);
        return m == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m : Unit.INSTANCE;
    }

    public abstract Object m(ds5 ds5, Continuation continuation);

    public final String toString() {
        return this.o + " -> " + super.toString();
    }
}
