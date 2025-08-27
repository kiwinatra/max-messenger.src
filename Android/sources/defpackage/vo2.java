package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: vo2  reason: default package */
public final class vo2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ lp2 b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ Long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vo2(lp2 lp2, Uri uri, Long l, Continuation continuation) {
        super(2, continuation);
        this.b = lp2;
        this.c = uri;
        this.o = l;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new vo2(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vo2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            lp2 lp2 = this.b;
            a32 a32 = (a32) lp2.Q0.a.getValue();
            if (a32 == null) {
                return Unit.INSTANCE;
            }
            List listOf = CollectionsKt.listOf(new cbe(1, this.c.toString()));
            this.a = 1;
            if (((vrd) lp2.y0.getValue()).a(a32.a, (CharSequence) null, listOf, false, this.o, this) == coroutine_suspended) {
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
