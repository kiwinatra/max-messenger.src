package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: uo2  reason: default package */
public final class uo2 extends SuspendLambda implements Function2 {
    public fvd a;
    public int b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ long o;
    public final /* synthetic */ lp2 v;
    public final /* synthetic */ Long w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uo2(Uri uri, long j, lp2 lp2, Long l, Continuation continuation) {
        super(2, continuation);
        this.c = uri;
        this.o = j;
        this.v = lp2;
        this.w = l;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new uo2(this.c, this.o, this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uo2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        fvd fvd;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        lp2 lp2 = this.v;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cbe cbe = new cbe(7, this.c.toString());
            ArrayList arrayList = new ArrayList();
            arrayList.add(cbe);
            long j = this.o;
            fvd fvd2 = new fvd(j, arrayList);
            this.a = fvd2;
            this.b = 1;
            obj = ((ej9) lp2.A0.getValue()).a(j, this.w, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            fvd = fvd2;
        } else if (i == 1) {
            fvd = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fvd.b = (mc9) obj;
        ((jqg) lp2.z0.getValue()).a(fvd.a());
        return Unit.INSTANCE;
    }
}
