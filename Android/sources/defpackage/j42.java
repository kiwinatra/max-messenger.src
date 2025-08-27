package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: j42  reason: default package */
public final class j42 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h52 c;
    public final /* synthetic */ long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j42(h52 h52, long j, Continuation continuation) {
        super(2, continuation);
        this.c = h52;
        this.o = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        j42 j42 = new j42(this.c, this.o, continuation);
        j42.b = obj;
        return j42;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j42) create((mzb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mzb mzb = (mzb) this.b;
            if (mzb instanceof izb) {
                long j = ((izb) mzb).a;
                h52 h52 = this.c;
                int i2 = (j > h52.u.get() ? 1 : (j == h52.u.get() ? 0 : -1));
                n6e n6e = h52.f;
                if (i2 == 0) {
                    h52.x.set(false);
                    a32 o2 = h52.o();
                    if (o2 == null) {
                        return Unit.INSTANCE;
                    }
                    h52.m(h52, o2);
                    if (h52.j == fzb.CREATE && o2.K()) {
                        cxb cxb = new cxb(this.o);
                        this.a = 1;
                        if (n6e.a(cxb, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (j == h52.w.get()) {
                    a32 o3 = h52.o();
                    if (o3 == null) {
                        return Unit.INSTANCE;
                    }
                    h52.m(h52, o3);
                    gxb gxb = new gxb(new igf(ixa.t2), Boxing.boxInt(cad.B), 6);
                    this.a = 2;
                    if (n6e.a(gxb, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (j == h52.v.get()) {
                    a32 o4 = h52.o();
                    if (o4 == null) {
                        return Unit.INSTANCE;
                    }
                    h52.m(h52, o4);
                }
            }
        } else if (i == 1 || i == 2) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
