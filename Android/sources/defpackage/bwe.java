package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;

/* renamed from: bwe  reason: default package */
public final class bwe extends SuspendLambda implements Function5 {
    public /* synthetic */ List a;
    public /* synthetic */ List b;
    public /* synthetic */ List c;
    public /* synthetic */ w8e o;

    /* JADX WARNING: type inference failed for: r1v1, types: [bwe, kotlin.coroutines.jvm.internal.SuspendLambda] */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ? suspendLambda = new SuspendLambda(5, (Continuation) obj5);
        suspendLambda.a = (List) obj;
        suspendLambda.b = (List) obj2;
        suspendLambda.c = (List) obj3;
        suspendLambda.o = (w8e) obj4;
        return suspendLambda.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, pve] */
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        w8e w8e = this.o;
        ? obj2 = new Object();
        obj2.a = this.a;
        obj2.b = this.b;
        obj2.c = this.c;
        obj2.d = w8e;
        return obj2;
    }
}
