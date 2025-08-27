package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zl3  reason: default package */
public final class zl3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ cm3 b;
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zl3(cm3 cm3, String str, Continuation continuation) {
        super(2, continuation);
        this.b = cm3;
        this.c = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new zl3(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zl3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ry7 ry7 = ry7.c;
            this.a = 1;
            obj = ((dz2) this.b.l.getValue()).a(this.c, ry7, this);
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
