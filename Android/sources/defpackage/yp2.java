package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: yp2  reason: default package */
public final class yp2 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ Throwable b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yp2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ds5 ds5 = (ds5) obj;
        Throwable th = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                yp2 yp2 = new yp2(3, continuation, 0);
                yp2.b = th;
                return yp2.invokeSuspend(Unit.INSTANCE);
            case 1:
                yp2 yp22 = new yp2(3, continuation, 1);
                yp22.b = th;
                return yp22.invokeSuspend(Unit.INSTANCE);
            case 2:
                yp2 yp23 = new yp2(3, continuation, 2);
                yp23.b = th;
                return yp23.invokeSuspend(Unit.INSTANCE);
            default:
                yp2 yp24 = new yp2(3, continuation, 3);
                yp24.b = th;
                return yp24.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                z68.f("dq2", "catch error in chatUpdateFlow", this.b);
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                z68.f("ChatVM/MissedContactsController", "fail", this.b);
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure(obj);
                z68.f("MiniChatsUpdated", "fail", this.b);
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                Throwable th = this.b;
                if (!(th instanceof CancellationException)) {
                    ((uta) qra.a.o()).c(th, false);
                }
                return Unit.INSTANCE;
        }
    }
}
