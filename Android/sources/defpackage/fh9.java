package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: fh9  reason: default package */
public final class fh9 extends SuspendLambda implements Function2 {
    public final /* synthetic */ mh9 a;
    public final /* synthetic */ CharSequence b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fh9(mh9 mh9, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.a = mh9;
        this.b = charSequence;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new fh9(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fh9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        mh9 mh9 = this.a;
        a32 a32 = (a32) mh9.b.getValue();
        Long boxLong = a32 != null ? Boxing.boxLong(a32.b.a) : null;
        CharSequence charSequence = this.b;
        if (!(charSequence == null || charSequence.length() == 0 || boxLong == null)) {
            d6b d6b = (d6b) mh9.X.getValue();
            long longValue = boxLong.longValue();
            if (longValue == 0) {
                d6b.getClass();
            } else {
                d6b.f(longValue, (b10) null, 0);
            }
        }
        return Unit.INSTANCE;
    }
}
