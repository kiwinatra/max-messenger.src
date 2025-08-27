package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: im9  reason: default package */
public final class im9 extends SuspendLambda implements Function2 {
    public final /* synthetic */ en9 a;
    public final /* synthetic */ List b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public im9(en9 en9, List list, Continuation continuation) {
        super(2, continuation);
        this.a = en9;
        this.b = list;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new im9(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((im9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        en9 en9 = this.a;
        a32 a32 = (a32) en9.k1.a.getValue();
        if (a32 == null) {
            return Unit.INSTANCE;
        }
        Long l = (Long) CollectionsKt.firstOrNull(this.b);
        if (l == null) {
            return Unit.INSTANCE;
        }
        long longValue = l.longValue();
        if (a32.v != null) {
            en9 en92 = en9;
            xag.g(en9, ((osa) en9.w).b(), (f14) null, new cn9(en92, a32.a, longValue, a32.b.a, (Continuation) null), 2);
        }
        return Unit.INSTANCE;
    }
}
