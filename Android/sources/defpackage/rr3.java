package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: rr3  reason: default package */
public final class rr3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ vr3 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rr3(vr3 vr3, Continuation continuation) {
        super(2, continuation);
        this.b = vr3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        rr3 rr3 = new rr3(this.b, continuation);
        rr3.a = obj;
        return rr3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rr3) create((j83) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        List list;
        z73 z73;
        l3c l3c;
        int i = 1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        j83 j83 = (j83) this.a;
        if (Intrinsics.areEqual((Object) j83, (Object) v73.a) || Intrinsics.areEqual((Object) j83, (Object) x73.a)) {
            arrayList = CollectionsKt.emptyList();
        } else if (j83 instanceof z73) {
            z73 z732 = (z73) j83;
            Iterable iterable = z732.a;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            int i2 = 0;
            for (Object next : iterable) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                h83 h83 = (h83) next;
                int i4 = h83 instanceof d83 ? 1024 : ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (z732.a.size() != i) {
                    i4 |= i2 == 0 ? 536870912 : i2 == CollectionsKt.getLastIndex(z732.a) ? IntCompanionObject.MIN_VALUE : 1073741824;
                }
                if (Intrinsics.areEqual((Object) h83, (Object) b83.a)) {
                    l3c = i3c.a;
                } else if (Intrinsics.areEqual((Object) h83, (Object) d83.a)) {
                    l3c = new j3c(i4);
                } else if (h83 instanceof f83) {
                    k3c k3c = k3c.a;
                    f83 f83 = (f83) h83;
                    a32 a32 = f83.a;
                    long j = a32.a;
                    CharSequence charSequence = f83.b;
                    mgf mgf = new mgf(f83.c);
                    String h = a32.h(kl0.c, jl0.a);
                    a32 a322 = f83.a;
                    z73 = z732;
                    long j2 = a322.b.a;
                    a322.m0();
                    l3c = new l3c(new kxb(j, charSequence, mgf, h, j2, a322.v0), i4);
                    arrayList2.add(l3c);
                    z732 = z73;
                    i2 = i3;
                    i = 1;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                z73 = z732;
                arrayList2.add(l3c);
                z732 = z73;
                i2 = i3;
                i = 1;
            }
            arrayList = arrayList2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        xme xme = this.b.t;
        if (arrayList.isEmpty()) {
            list = CollectionsKt.emptyList();
        } else {
            g93 g93 = this.b.o;
            g93.getClass();
            List createListBuilder = CollectionsKt.createListBuilder();
            createListBuilder.add((c3c) g93.a.getValue());
            createListBuilder.addAll(arrayList);
            list = CollectionsKt.build(createListBuilder);
        }
        xme.setValue(list);
        return Unit.INSTANCE;
    }
}
