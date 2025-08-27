package defpackage;

import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: kl9  reason: default package */
public final class kl9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ en9 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kl9(en9 en9, long j, String str, Continuation continuation) {
        super(2, continuation);
        this.b = en9;
        this.c = j;
        this.o = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new kl9(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kl9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        en9 en9 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            qx2 qx2 = en9.y;
            this.a = 1;
            obj = ((my2) qx2).m(this.c, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a32 a32 = (a32) obj;
        if (a32 == null || !a32.K() || (a32.a0() && !a32.f0())) {
            String str = this.o;
            if (a32 == null && str == null) {
                xag.h(en9.q1, new o8e(new igf(ewa.V0), 0, (igf) null, 6));
            } else if (str != null) {
                by7 by7 = (by7) en9.U0.getValue();
                by7.getClass();
                by7.e(Uri.parse(str));
            } else {
                xag.h(en9.q1, new o8e(new igf(ewa.W0), 0, (igf) null, 6));
            }
        } else {
            xag.h(en9.t1, fk9.b.o1(a32.a));
        }
        return Unit.INSTANCE;
    }
}
