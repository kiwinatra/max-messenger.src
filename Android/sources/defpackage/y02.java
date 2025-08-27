package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: y02  reason: default package */
public final class y02 extends f12 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater w = AtomicIntegerFieldUpdater.newUpdater(y02.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final wtc o;
    public final boolean v;

    public /* synthetic */ y02(wtc wtc, boolean z) {
        this(wtc, z, EmptyCoroutineContext.INSTANCE, -3, cu0.a);
    }

    public final Object e(ds5 ds5, Continuation continuation) {
        if (this.b == -3) {
            boolean z = this.v;
            if (!z || w.getAndSet(this, 1) == 0) {
                Object j = ev0.j(ds5, this.o, z, continuation);
                return j == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? j : Unit.INSTANCE;
            }
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
        Object e = super.e(ds5, continuation);
        return e == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e : Unit.INSTANCE;
    }

    public final String h() {
        return "channel=" + this.o;
    }

    public final Object i(cwb cwb, Continuation continuation) {
        Object j = ev0.j(new fsd(cwb), this.o, this.v, continuation);
        return j == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? j : Unit.INSTANCE;
    }

    public final f12 j(CoroutineContext coroutineContext, int i, cu0 cu0) {
        return new y02(this.o, this.v, coroutineContext, i, cu0);
    }

    public final bs5 k() {
        return new y02(this.o, this.v);
    }

    public final wtc l(d14 d14) {
        if (!this.v || w.getAndSet(this, 1) == 0) {
            return this.b == -3 ? this.o : super.l(d14);
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
    }

    public y02(wtc wtc, boolean z, CoroutineContext coroutineContext, int i, cu0 cu0) {
        super(coroutineContext, i, cu0);
        this.o = wtc;
        this.v = z;
        this.consumed$volatile = 0;
    }
}
