package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: d04  reason: default package */
public final class d04 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ay2 b;
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d04(ay2 ay2, String str, Continuation continuation) {
        super(2, continuation);
        this.b = ay2;
        this.c = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new d04(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d04) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            vcd vcd = (vcd) this.b.y;
            this.a = 1;
            vcd.getClass();
            obj = ev0.I(caa.a.plus(vcd.b), new tcd(vcd, this.c, false, true, (Continuation) null), this);
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
