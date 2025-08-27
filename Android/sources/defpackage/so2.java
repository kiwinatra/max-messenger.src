package defpackage;

import java.util.regex.Pattern;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: so2  reason: default package */
public final class so2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ a32 c;
    public final /* synthetic */ lp2 o;
    public final /* synthetic */ Long v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public so2(String str, a32 a32, lp2 lp2, Long l, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = a32;
        this.o = lp2;
        this.v = l;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new so2(this.b, this.c, this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((so2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            a32 a32 = this.c;
            Pattern pattern = a32.N() ? hhf.d : hhf.f;
            Pattern pattern2 = nab.a;
            String d = hhf.d(this.b, pattern);
            ap9 ap9 = this.o.z;
            this.a = 1;
            if (ap9.b(a32.a, d, this.v, false, this) == coroutine_suspended) {
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
