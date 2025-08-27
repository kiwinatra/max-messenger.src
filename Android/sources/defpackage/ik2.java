package defpackage;

import java.util.Collection;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ik2  reason: default package */
public final class ik2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Collection a;
    public final /* synthetic */ lk2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ik2(Set set, lk2 lk2, Continuation continuation) {
        super(2, continuation);
        this.a = set;
        this.b = lk2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ik2((Set) this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ik2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Collection collection = this.a;
        lk2 lk2 = this.b;
        String p = CollectionsKt___CollectionsKt.joinToString$default(collection, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new l(25, lk2), 30, (Object) null);
        int ordinal = lk2.Z.ordinal();
        s85 s85 = lk2.v0;
        if (ordinal == 0) {
            xag.h(s85, new u3c(new igf(lxa.d2), new mgf(p), CollectionsKt.listOf(new pg3(jxa.z0, new igf(lxa.a2), og3.a), new pg3(jxa.B0, new igf(lxa.b2), og3.b)), o54.f(TuplesKt.to("profile:memberslist:ids_to_delete", CollectionsKt.toLongArray(collection)))));
        } else if (ordinal == 1) {
            xag.h(s85, kr7.r(collection, new igf(lxa.e2), new mgf(p)));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
