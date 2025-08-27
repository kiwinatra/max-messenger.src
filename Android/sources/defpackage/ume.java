package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: ume  reason: default package */
public final class ume extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bs5 c;
    public final /* synthetic */ Ref.ObjectRef o;
    public final /* synthetic */ long v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ume(vt5 vt5, Ref.ObjectRef objectRef, long j, Continuation continuation) {
        super(2, continuation);
        this.c = vt5;
        this.o = objectRef;
        this.v = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ume ume = new ume((vt5) this.c, this.o, this.v, continuation);
        ume.b = obj;
        return ume;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ume) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef = this.o;
            tme tme = new tme((vt5) this.c, objectRef, (ds5) this.b, this.v, (Continuation) null);
            this.a = 1;
            if (e14.d(tme, this) == coroutine_suspended) {
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
