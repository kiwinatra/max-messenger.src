package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: kgg  reason: default package */
public final class kgg extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pgg c;
    public final /* synthetic */ mgg o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kgg(mgg mgg, pgg pgg, Continuation continuation) {
        super(2, continuation);
        this.c = pgg;
        this.o = mgg;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        kgg kgg = new kgg(this.o, this.c, continuation);
        kgg.b = obj;
        return kgg;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kgg) create((agg) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        mgg mgg = this.o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ekd ekd = fgg.a;
            sgg sgg = new sgg(this.c.a, ((agg) this.b).a);
            ru0 ru0 = mgg.f;
            yo7 yo7 = mgg.a;
            yo7.getClass();
            mo7 mo7 = new mo7("WebAppDownloadFile", yo7.b(sgg.Companion.serializer(), sgg));
            this.b = "WebAppDownloadFile";
            this.a = 1;
            if (ru0.t(mo7, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = "WebAppDownloadFile";
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            str = (String) this.b;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        tfg tfg = mgg.g;
        if (tfg != null) {
            wfg.a((wfg) mgg.b.getValue(), str, tfg.a, tfg.b, true, 0, (Integer) null, (Integer) null, 240);
        }
        return Unit.INSTANCE;
    }
}
