package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: thg  reason: default package */
public final class thg extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ yhg c;
    public final /* synthetic */ vhg o;
    public final /* synthetic */ String v = "WebAppRequestPhone";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public thg(vhg vhg, yhg yhg, Continuation continuation) {
        super(2, continuation);
        this.c = yhg;
        this.o = vhg;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        thg thg = new thg(this.o, this.c, continuation);
        thg.b = obj;
        return thg;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((thg) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        vhg vhg = this.o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            big big = new big(this.c.a, (String) this.b);
            ru0 ru0 = vhg.e;
            yo7 yo7 = vhg.a;
            yo7.getClass();
            mo7 mo7 = new mo7(this.v, yo7.b(big.Companion.serializer(), big));
            this.a = 1;
            if (ru0.t(mo7, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        tfg tfg = vhg.f;
        if (tfg != null) {
            wfg.a((wfg) vhg.b.getValue(), this.v, tfg.a, tfg.b, true, 0, (Integer) null, (Integer) null, 240);
        }
        return Unit.INSTANCE;
    }
}
