package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: k12  reason: default package */
public final class k12 extends f12 {
    public final bs5 o;
    public final int v;

    public k12(int i, int i2, cu0 cu0, bs5 bs5, CoroutineContext coroutineContext) {
        super(coroutineContext, i2, cu0);
        this.o = bs5;
        this.v = i;
    }

    public final String h() {
        return "concurrency=" + this.v;
    }

    public final Object i(cwb cwb, Continuation continuation) {
        int i = nrd.a;
        Object e = this.o.e(new j12(0, (pm7) continuation.getContext().get(om7.a), new mrd(this.v, 0), cwb, new fsd(cwb)), continuation);
        return e == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e : Unit.INSTANCE;
    }

    public final f12 j(CoroutineContext coroutineContext, int i, cu0 cu0) {
        return new k12(this.v, i, cu0, this.o, coroutineContext);
    }

    public final wtc l(d14 d14) {
        e12 e12 = new e12(this, (Continuation) null);
        cu0 cu0 = cu0.a;
        f14 f14 = f14.a;
        zvb zvb = new zvb(o04.b(d14, this.a), o54.a(this.b, 4, cu0));
        zvb.j0(f14, zvb, e12);
        return zvb;
    }
}
