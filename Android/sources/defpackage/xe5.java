package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xe5  reason: default package */
public final class xe5 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ye5 c;
    public final /* synthetic */ String o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xe5(ye5 ye5, String str, Continuation continuation) {
        super(2, continuation);
        this.c = ye5;
        this.o = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        xe5 xe5 = new xe5(this.c, this.o, continuation);
        xe5.b = obj;
        return xe5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xe5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Throwable th;
        d14 d14;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        ye5 ye5 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d142 = (d14) this.b;
            try {
                wb R = bs0.R(new sbd(new ve5(ye5, this.o, (Continuation) null)), 5, new we5(d142, (Continuation) null));
                this.b = d142;
                this.a = 1;
                Object z = bs0.z(R, this);
                if (z == coroutine_suspended) {
                    return coroutine_suspended;
                }
                d14 d143 = d142;
                obj = z;
                d14 = d143;
            } catch (Throwable th2) {
                d14 d144 = d142;
                th = th2;
                d14 = d144;
                String name = d14.getClass().getName();
                z68.f(name, "ExternalCallback request failed due to " + th + ".", th);
                xag.h(ye5.o, new ue5(new igf(qad.t1)));
                return Unit.INSTANCE;
            }
        } else if (i == 1) {
            d14 = (d14) this.b;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oe5 oe5 = (oe5) obj;
        Long l = oe5.c;
        if (l != null) {
            s85 s85 = ye5.o;
            zb8 zb8 = zb8.b;
            long longValue = l.longValue();
            kfg kfg = kfg.URL;
            String str = oe5.o;
            zb8.getClass();
            xag.h(s85, zb8.q1(longValue, kfg, str));
        } else {
            xag.h(ye5.o, te5.b);
        }
        return Unit.INSTANCE;
    }
}
