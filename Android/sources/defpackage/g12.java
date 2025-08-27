package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

/* renamed from: g12  reason: default package */
public class g12 extends f12 {
    public final /* synthetic */ int o;
    public final Object v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g12(Object obj, CoroutineContext coroutineContext, int i, cu0 cu0, int i2) {
        super(coroutineContext, i, cu0);
        this.o = i2;
        this.v = obj;
    }

    public Object i(cwb cwb, Continuation continuation) {
        switch (this.o) {
            case 0:
                Object invoke = ((Function2) this.v).invoke(cwb, continuation);
                return invoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : Unit.INSTANCE;
            default:
                fsd fsd = new fsd(cwb);
                for (bs5 t12 : (Iterable) this.v) {
                    ev0.v(cwb, (CoroutineContext) null, (f14) null, new t12(t12, fsd, (Continuation) null), 3);
                }
                return Unit.INSTANCE;
        }
    }

    public f12 j(CoroutineContext coroutineContext, int i, cu0 cu0) {
        switch (this.o) {
            case 0:
                return new g12((Function2) this.v, coroutineContext, i, cu0, 0);
            default:
                return new g12((Iterable) this.v, coroutineContext, i, cu0, 1);
        }
    }

    public wtc l(d14 d14) {
        switch (this.o) {
            case 1:
                e12 e12 = new e12(this, (Continuation) null);
                cu0 cu0 = cu0.a;
                f14 f14 = f14.a;
                zvb zvb = new zvb(o04.b(d14, this.a), o54.a(this.b, 4, cu0));
                zvb.j0(f14, zvb, e12);
                return zvb;
            default:
                return super.l(d14);
        }
    }

    public String toString() {
        switch (this.o) {
            case 0:
                return "block[" + ((Function2) this.v) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }
}
