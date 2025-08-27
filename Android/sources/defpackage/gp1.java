package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: gp1  reason: default package */
public final class gp1 extends SuspendLambda implements Function2 {
    public mp1 a;
    public int b;
    public final /* synthetic */ mp1 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gp1(mp1 mp1, Continuation continuation) {
        super(2, continuation);
        this.c = mp1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new gp1(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gp1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        mp1 mp1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = mp1.M;
            mp1 mp12 = this.c;
            pc pcVar = new pc(((v9b) mp12.s()).Y, 23);
            this.a = mp12;
            this.b = 1;
            Object C = bs0.C(pcVar, this);
            if (C == coroutine_suspended) {
                return coroutine_suspended;
            }
            mp1 mp13 = mp12;
            obj = C;
            mp1 = mp13;
        } else if (i == 1) {
            mp1 = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (obj == null) {
            z = false;
        }
        mp1.H = z;
        return Unit.INSTANCE;
    }
}
