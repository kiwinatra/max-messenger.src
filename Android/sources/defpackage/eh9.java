package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: eh9  reason: default package */
public final class eh9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ mh9 b;
    public final /* synthetic */ CharSequence c;
    public final /* synthetic */ Long o;
    public final /* synthetic */ boolean v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eh9(mh9 mh9, CharSequence charSequence, Long l, boolean z, Continuation continuation) {
        super(2, continuation);
        this.b = mh9;
        this.c = charSequence;
        this.o = l;
        this.v = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new eh9(this.b, this.c, this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((eh9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        mh9 mh9 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            a32 a32 = (a32) mh9.b.getValue();
            if (a32 == null) {
                return Unit.INSTANCE;
            }
            this.a = 1;
            if (((ap9) mh9.w.getValue()).b(a32.a, this.c, this.o, this.v, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mh9.D0.setValue((Object) null);
        return Unit.INSTANCE;
    }
}
