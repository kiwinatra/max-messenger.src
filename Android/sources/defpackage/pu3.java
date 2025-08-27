package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: pu3  reason: default package */
public final class pu3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ su3 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pu3(su3 su3, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.a = su3;
        this.b = str;
        this.c = i;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new pu3(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pu3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        su3 su3 = this.a;
        List u = su3.d.u(this.b, this.c, CollectionsKt.emptyList(), su3.g);
        su3.e = u;
        return u;
    }
}
