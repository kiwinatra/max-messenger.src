package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zw9  reason: default package */
public final class zw9 extends SuspendLambda implements Function2 {
    public final /* synthetic */ bx9 a;
    public final /* synthetic */ long b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zw9(bx9 bx9, long j, Continuation continuation) {
        super(2, continuation);
        this.a = bx9;
        this.b = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new zw9(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zw9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Set set;
        List list;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        bx9 bx9 = this.a;
        Set set2 = ((vw9) bx9.d.getValue()).b;
        boolean isEmpty = set2.isEmpty();
        long j = this.b;
        if (isEmpty) {
            set = SetsKt.setOf(Boxing.boxLong(j));
        } else if (set2.contains(Boxing.boxLong(j))) {
            set = CollectionsKt.toMutableSet(set2);
            set.remove(Boxing.boxLong(j));
        } else {
            set = SetsKt___SetsKt.plus(set2, Boxing.boxLong(j));
        }
        if (set.isEmpty()) {
            list = CollectionsKt.emptyList();
        } else {
            List createListBuilder = CollectionsKt.createListBuilder();
            createListBuilder.add(new e3b(m1b.v, n1b.h, cad.y));
            list = CollectionsKt.build(createListBuilder);
        }
        vw9 vw9 = new vw9(true, set, list);
        xme xme = bx9.d;
        xme.getClass();
        xme.m((Object) null, vw9);
        return Unit.INSTANCE;
    }
}
