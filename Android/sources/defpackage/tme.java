package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: tme  reason: default package */
public final class tme extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bs5 c;
    public final /* synthetic */ Ref.ObjectRef o;
    public final /* synthetic */ ds5 v;
    public final /* synthetic */ long w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tme(vt5 vt5, Ref.ObjectRef objectRef, ds5 ds5, long j, Continuation continuation) {
        super(2, continuation);
        this.c = vt5;
        this.o = objectRef;
        this.v = ds5;
        this.w = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        tme tme = new tme((vt5) this.c, this.o, this.v, this.w, continuation);
        tme.b = obj;
        return tme;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tme) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ds5 ds5 = this.v;
            long j = this.w;
            sme sme = new sme(this.o, ds5, (d14) this.b, j);
            this.a = 1;
            if (this.c.e(sme, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
