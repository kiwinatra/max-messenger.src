package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: jgg  reason: default package */
public final class jgg extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pgg c;
    public final /* synthetic */ mgg o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jgg(mgg mgg, pgg pgg, Continuation continuation) {
        super(2, continuation);
        this.c = pgg;
        this.o = mgg;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        jgg jgg = new jgg(this.o, this.c, continuation);
        jgg.b = obj;
        return jgg;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jgg) create((agg) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        mgg mgg = this.o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            agg agg = (agg) this.b;
            if (igg.$EnumSwitchMapping$0[agg.ordinal()] == 1) {
                ekd ekd = fgg.a;
                z68.c("DownloadFromWebApp", "processDownloadFile complete", new Object[0]);
                sgg sgg = new sgg(this.c.a, agg.a);
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
            }
            return Unit.INSTANCE;
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
