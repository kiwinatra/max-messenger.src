package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: vrb  reason: default package */
public final class vrb extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ wrb b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vrb(wrb wrb, String str, vra vra, Continuation continuation) {
        super(2, continuation);
        this.b = wrb;
        this.c = str;
        this.o = vra;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new vrb(this.b, this.c, (vra) this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vrb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            wrb wrb = this.b;
            ((qjd) ((x23) wrb.b.getValue())).l("server.port", this.c);
            if (((qjd) ((x23) wrb.b.getValue())).s() != -1) {
                ((zbf) wrb.o.getValue()).g();
            }
            gc8 c2 = ((osa) ((gaf) wrb.c.getValue())).c();
            urb urb = new urb((vra) this.o, (Continuation) null);
            this.a = 1;
            if (ev0.I(c2, urb, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
