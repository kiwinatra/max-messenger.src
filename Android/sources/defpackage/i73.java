package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: i73  reason: default package */
public final class i73 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ k73 b;
    public final /* synthetic */ ke7 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i73(k73 k73, ke7 ke7, Continuation continuation) {
        super(2, continuation);
        this.b = k73;
        this.c = ke7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        i73 i73 = new i73(this.b, this.c, continuation);
        i73.a = obj;
        return i73;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i73) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        k73 k73 = this.b;
        ke7 ke7 = this.c;
        try {
            Result.Companion companion = Result.Companion;
            obj2 = Result.m23constructorimpl((a89) ((c48) k73.d.getValue()).a(ke7.c, false).f());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m29isFailureimpl(obj2)) {
            return null;
        }
        return obj2;
    }
}
