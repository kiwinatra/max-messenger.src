package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* renamed from: n21  reason: default package */
public final class n21 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ o21 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n21(o21 o21, Continuation continuation) {
        super(2, continuation);
        this.b = o21;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new n21(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n21) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        o21 o21 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String string = ((qjd) o21.a()).g.getString("user.callsToken", (String) null);
            if (string == null || StringsKt.isBlank(string)) {
                this.a = 1;
                if (((xq1) ((uq1) o21.c.getValue())).a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ((qjd) o21.a()).g.getString("user.callsToken", (String) null);
    }
}
