package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: we5  reason: default package */
public final class we5 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ d14 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public we5(d14 d14, Continuation continuation) {
        super(2, continuation);
        this.b = d14;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        we5 we5 = new we5(this.b, continuation);
        we5.a = obj;
        return we5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((we5) create((Throwable) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Throwable th = (Throwable) this.a;
        if (!(th instanceof TamErrorException) || !m58.A(((TamErrorException) th).a.b)) {
            String name = this.b.getClass().getName();
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                w78 w78 = w78.x;
                a67.d(w78, name, "ExternalCallback request failed with " + th + ". Couldn't recover", (Throwable) null);
            }
            z = false;
        } else {
            String name2 = this.b.getClass().getName();
            a67 a672 = z68.b;
            if (a672 != null && a672.c()) {
                w78 w782 = w78.x;
                a672.d(w782, name2, "ExternalCallback request failed with " + th + ". Retrying", (Throwable) null);
            }
            z = true;
        }
        return Boxing.boxBoolean(z);
    }
}
