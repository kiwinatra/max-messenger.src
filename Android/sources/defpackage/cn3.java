package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: cn3  reason: default package */
public final class cn3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ pn3 b;
    public final /* synthetic */ boolean c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cn3(pn3 pn3, boolean z, Continuation continuation) {
        super(2, continuation);
        this.b = pn3;
        this.c = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new cn3(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cn3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        pn3 pn3 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ct7 ct7 = pn3.z;
            this.a = 1;
            jw9 jw9 = new jw9(x3b.PROFILE_DELETE, 8);
            jw9.d("delete", this.c);
            obj = ((ocf) ((dxa) ct7.a.getValue()).a.getValue()).e(jw9, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Long l = ((j1d) obj).c;
        pn3.p(pn3, l != null ? l.longValue() : 0);
        return Unit.INSTANCE;
    }
}
