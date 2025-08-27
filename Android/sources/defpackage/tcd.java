package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: tcd  reason: default package */
public final class tcd extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ vcd b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tcd(vcd vcd, String str, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.b = vcd;
        this.c = str;
        this.o = z;
        this.v = z2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new tcd(this.b, this.c, this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tcd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            obj = vcd.a(this.b, this.c, this.o, this.v, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
