package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: bl9  reason: default package */
public final class bl9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ en9 b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bl9(en9 en9, long j, Continuation continuation) {
        super(2, continuation);
        this.b = en9;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new bl9(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bl9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        en9 en9 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = en9.A1;
            to9 t = en9.t();
            this.a = 1;
            obj = t.a(this.c, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2 || i == 3) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ha9 ha9 = (ha9) obj;
        if (ha9 == null) {
            return Unit.INSTANCE;
        }
        if (ha9.n(g20.c)) {
            this.a = 2;
            if (en9.l(en9, ha9, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (ha9.n(g20.o)) {
            this.a = 3;
            if (en9.m(en9, ha9, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
