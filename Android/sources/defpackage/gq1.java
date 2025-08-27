package defpackage;

import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: gq1  reason: default package */
public final class gq1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ String b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gq1(String str, Continuation continuation) {
        super(2, continuation);
        this.b = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new gq1(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gq1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ba7 B = ld9.B();
            this.a = 1;
            ra7 d = ra7.d(Uri.parse(this.b));
            Unit unit = Unit.INSTANCE;
            obj = ld9.u(B, d.a(), LongCompanionObject.MAX_VALUE, (Object) null, this, 8);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
