package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.android.MainActivity;

/* renamed from: yb8  reason: default package */
public final class yb8 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MainActivity a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yb8(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.a = mainActivity;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new yb8(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yb8) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        MainActivity mainActivity = this.a;
        mainActivity.C0.b(mainActivity);
        return Unit.INSTANCE;
    }
}
