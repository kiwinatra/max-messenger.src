package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: aj1  reason: default package */
public final class aj1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ jj1 b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aj1(jj1 jj1, long j, Continuation continuation) {
        super(2, continuation);
        this.b = jj1;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new aj1(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((aj1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        jj1 jj1 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            obj = ((my2) ((qx2) jj1.Y.getValue())).u(this.c, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a32 a32 = (a32) obj;
        Long boxLong = a32 != null ? Boxing.boxLong(a32.a) : null;
        if (boxLong != null) {
            KProperty[] kPropertyArr = jj1.O0;
            tq1 tq1 = (tq1) jj1.Z.getValue();
            String str = jj1.l().a;
            boolean z = jj1.l().g;
            tq1.getClass();
            tq1.a(tq1, "CHAT_OPENED", str, (String) null, (Integer) null, (String) null, (String) null, z, 60);
            xag.h(jj1.K0, id1.b.o1(boxLong.longValue()));
        } else {
            xag.h(jj1.K0, new gi1(new igf(sqa.T0)));
        }
        return Unit.INSTANCE;
    }
}
