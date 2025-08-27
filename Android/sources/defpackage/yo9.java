package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: yo9  reason: default package */
public final class yo9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ap9 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ CharSequence o;
    public final /* synthetic */ Long v;
    public final /* synthetic */ boolean w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yo9(ap9 ap9, long j, CharSequence charSequence, Long l, boolean z, Continuation continuation) {
        super(2, continuation);
        this.b = ap9;
        this.c = j;
        this.o = charSequence;
        this.v = l;
        this.w = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new yo9(this.b, this.c, this.o, this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yo9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List b2 = ((ar6) this.b.d.getValue()).b(this.o, this.c);
            this.a = 1;
            if (ap9.a(this.b, this.c, this.v, this.o, b2, this.w, this) == coroutine_suspended) {
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
