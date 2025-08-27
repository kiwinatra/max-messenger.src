package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: e21  reason: default package */
public final class e21 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ Throwable b;
    public final /* synthetic */ k21 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e21(k21 k21, Continuation continuation, int i) {
        super(3, continuation);
        this.a = i;
        this.c = k21;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ds5 ds5 = (ds5) obj;
        Throwable th = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                e21 e21 = new e21(this.c, continuation, 0);
                e21.b = th;
                return e21.invokeSuspend(Unit.INSTANCE);
            default:
                e21 e212 = new e21(this.c, continuation, 1);
                e212.b = th;
                return e212.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                Throwable th = this.b;
                if (!(th instanceof CancellationException)) {
                    z68.f(this.c.getClass().getName(), "fail no get chat", th);
                }
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                Throwable th2 = this.b;
                if (!(th2 instanceof CancellationException)) {
                    z68.f(this.c.getClass().getName(), "fail to handle call link", th2);
                }
                return Unit.INSTANCE;
        }
    }
}
