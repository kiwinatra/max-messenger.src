package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: v86  reason: default package */
public final class v86 extends SuspendLambda implements Function2 {
    public u86 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ w86 o;
    public final /* synthetic */ Ref.LongRef v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v86(w86 w86, Ref.LongRef longRef, Continuation continuation) {
        super(2, continuation);
        this.o = w86;
        this.v = longRef;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        v86 v86 = new v86(this.o, this.v, continuation);
        v86.c = obj;
        return v86;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((v86) create((cwb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        cwb cwb;
        u86 u86;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        w86 w86 = this.o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cwb cwb2 = (cwb) this.c;
            u86 = new u86(this.v, cwb2);
            w86.w.i.add(u86);
            Boolean boxBoolean = Boxing.boxBoolean(w86.w.c());
            this.c = cwb2;
            this.a = u86;
            this.b = 1;
            if (((zvb) cwb2).o.t(boxBoolean, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            cwb = cwb2;
        } else if (i == 1) {
            u86 = this.a;
            cwb = (cwb) this.c;
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j35 j35 = new j35(14, (Object) w86, (Object) u86);
        this.c = null;
        this.a = null;
        this.b = 2;
        if (wvb.a(cwb, j35, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
