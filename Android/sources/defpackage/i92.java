package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: i92  reason: default package */
public final class i92 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ia2 a;
    public final /* synthetic */ String b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i92(ia2 ia2, String str, Continuation continuation) {
        super(2, continuation);
        this.a = ia2;
        this.b = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new i92(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i92) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = ia2.K0;
        ia2 ia2 = this.a;
        c6d g = ia2.g();
        String str2 = this.b;
        j5d d = g.d(str2);
        if (d == null) {
            return null;
        }
        return d.b(CollectionsKt.emptyList(), ia2.g().f(str2), SetsKt.emptySet(), SetsKt.emptySet(), (xva) ia2.v.getValue());
    }
}
