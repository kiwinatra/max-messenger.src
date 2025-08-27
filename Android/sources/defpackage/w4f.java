package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: w4f  reason: default package */
public final class w4f extends SuspendLambda implements Function2 {
    public a0a a;
    public h5f b;
    public kxf c;
    public int o;
    public /* synthetic */ Object v;
    public final /* synthetic */ h5f w;
    public final /* synthetic */ kxf x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w4f(h5f h5f, kxf kxf, Continuation continuation) {
        super(2, continuation);
        this.w = h5f;
        this.x = kxf;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        w4f w4f = new w4f(this.w, this.x, continuation);
        w4f.v = obj;
        return w4f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w4f) create((cwb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: finally extract failed */
    public final Object invokeSuspend(Object obj) {
        cwb cwb;
        a0a a0a;
        h5f h5f;
        kxf kxf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cwb = (cwb) this.v;
            h5f h5f2 = this.w;
            a0a = h5f2.h;
            this.v = cwb;
            this.a = a0a;
            this.b = h5f2;
            kxf = this.x;
            this.c = kxf;
            this.o = 1;
            if (a0a.d(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            h5f = h5f2;
        } else if (i == 1) {
            kxf = this.c;
            h5f = this.b;
            a0a = this.a;
            cwb = (cwb) this.v;
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            bs5 bs5 = (bs5) h5f.i.c(kxf);
            if (bs5 == null) {
                vt5 vt5 = new vt5(new wb(15, new wb(16, bs0.D(new sbd(new t4f(h5f, kxf, (Continuation) null)), new u4f(h5f, (Continuation) null)), new v4f(h5f, (Continuation) null, 0)), new uu5(h5f, kxf, (Continuation) null, 9)), new b03(h5f, kxf, (Continuation) null));
                h5f.i.k(kxf, vt5);
                bs5 = vt5;
            }
            a0a.e((Object) null);
            tt2 tt2 = new tt2(1, cwb);
            this.v = null;
            this.a = null;
            this.b = null;
            this.c = null;
            this.o = 2;
            if (bs5.e(tt2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            a0a.e((Object) null);
            throw th;
        }
    }
}
