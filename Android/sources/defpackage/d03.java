package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: d03  reason: default package */
public final class d03 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ Throwable b;
    public final /* synthetic */ fu4 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d03(fu4 fu4, Continuation continuation, int i) {
        super(3, continuation);
        this.a = i;
        this.c = fu4;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ds5 ds5 = (ds5) obj;
        Throwable th = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                d03 d03 = new d03(this.c, continuation, 0);
                d03.b = th;
                d03.invokeSuspend(Unit.INSTANCE);
                throw null;
            default:
                d03 d032 = new d03(this.c, continuation, 1);
                d032.b = th;
                return d032.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                Throwable th = this.b;
                z68.f((String) this.c.b, "big_flow: fail", th);
                throw th;
            default:
                ResultKt.throwOnFailure(obj);
                Throwable th2 = this.b;
                fu4 fu4 = this.c;
                if (th2 != null) {
                    z68.f((String) fu4.b, "big_flow: completion", th2);
                } else {
                    z68.c((String) fu4.b, "big_flow: completion", new Object[0]);
                }
                return Unit.INSTANCE;
        }
    }
}
