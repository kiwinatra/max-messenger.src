package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: rx  reason: default package */
public final class rx extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ux b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rx(ux uxVar, Continuation continuation) {
        super(2, continuation);
        this.b = uxVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        rx rxVar = new rx(this.b, continuation);
        rxVar.a = obj;
        return rxVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rx) create((Throwable) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Throwable th = (Throwable) this.a;
        boolean z2 = th instanceof TamErrorException;
        ux uxVar = this.b;
        if (!z2 || !m58.A(((TamErrorException) th).a.b)) {
            String str = uxVar.i;
            z68.f(str, "request failed with " + th + ". Couldn't recover", (Throwable) null);
            z = false;
        } else {
            String str2 = uxVar.i;
            z68.f(str2, "request failed with " + th + ". Retrying", (Throwable) null);
            z = true;
        }
        return Boxing.boxBoolean(z);
    }
}
