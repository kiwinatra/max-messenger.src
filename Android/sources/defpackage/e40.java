package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: e40  reason: default package */
public final class e40 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ f40 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ jr8 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e40(f40 f40, long j, jr8 jr8, Continuation continuation) {
        super(2, continuation);
        this.b = f40;
        this.c = j;
        this.o = jr8;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new e40(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e40) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            q04 b2 = ((osa) ((gaf) this.b.X.getValue())).b();
            d40 d40 = new d40(this.b, this.c, (Continuation) null);
            this.a = 1;
            obj2 = ev0.I(b2, d40, this);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ha9 ha9 = (ha9) obj2;
        if (ha9 != null) {
            this.b.z0 = this.c;
            this.b.A0 = ha9.z;
            f40 f40 = this.b;
            f40.z(this.c, this.o, f40.A0);
        } else {
            this.b.z(this.c, this.o, -1);
        }
        return Unit.INSTANCE;
    }
}
