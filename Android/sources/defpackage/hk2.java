package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: hk2  reason: default package */
public final class hk2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ lk2 a;
    public final /* synthetic */ long b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hk2(lk2 lk2, long j, Continuation continuation) {
        super(2, continuation);
        this.a = lk2;
        this.b = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new hk2(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hk2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String f;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        lk2 lk2 = this.a;
        long j = this.b;
        vk3 vk3 = (vk3) ((eu3) lk2.v.getValue()).c(j).a.getValue();
        if (vk3 == null || (f = vk3.f()) == null) {
            return Unit.INSTANCE;
        }
        int ordinal = lk2.Z.ordinal();
        s85 s85 = lk2.v0;
        if (ordinal == 0) {
            xag.h(s85, new u3c(new kgf(lxa.f2, ArraysKt.toList((T[]) new Object[]{f})), (ngf) null, CollectionsKt.listOf(new pg3(jxa.z0, new igf(lxa.a2), og3.a), new pg3(jxa.B0, new igf(lxa.b2), og3.b)), o54.f(TuplesKt.to("profile:memberslist:ids_to_delete", CollectionsKt.toLongArray(CollectionsKt.listOf(Boxing.boxLong(j)))))));
        } else if (ordinal == 1) {
            xag.h(s85, kr7.r(CollectionsKt.listOf(Boxing.boxLong(j)), new kgf(lxa.g2, ArraysKt.toList((T[]) new Object[]{f})), (ngf) null));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
