package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: an9  reason: default package */
public final class an9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ra3 b;
    public final /* synthetic */ en9 c;
    public final /* synthetic */ long o;
    public final /* synthetic */ long v;
    public final /* synthetic */ long w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public an9(sa3 sa3, en9 en9, long j, long j2, long j3, Continuation continuation) {
        super(2, continuation);
        this.b = sa3;
        this.c = en9;
        this.o = j;
        this.v = j2;
        this.w = j3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new an9((sa3) this.b, this.c, this.o, this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((an9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            obj = ((sa3) this.b).a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2 || i == 3) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        en9 en9 = this.c;
        if (booleanValue) {
            qx2 qx2 = en9.y;
            this.a = 2;
            r62 n = ((my2) qx2).n();
            x62 x62 = x62.o;
            long j = this.o;
            n.d(j, x62);
            n.i(j, false, new c10(this.v, 1));
            if (Unit.INSTANCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            this.a = 3;
            if (((ur2) en9.N0.getValue()).a(this.o, this.w, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
