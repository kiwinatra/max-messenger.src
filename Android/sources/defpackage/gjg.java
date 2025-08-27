package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

/* renamed from: gjg  reason: default package */
public final class gjg extends SuspendLambda implements Function4 {
    public /* synthetic */ String a;
    public /* synthetic */ boolean b;
    public /* synthetic */ ijg c;

    /* JADX WARNING: type inference failed for: r3v2, types: [gjg, kotlin.coroutines.jvm.internal.SuspendLambda] */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        ? suspendLambda = new SuspendLambda(4, (Continuation) obj4);
        suspendLambda.a = (String) obj;
        suspendLambda.b = booleanValue;
        suspendLambda.c = (ijg) obj3;
        return suspendLambda.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return new mjg(this.a, this.b, this.c);
    }
}
