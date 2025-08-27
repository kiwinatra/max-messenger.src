package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: wa1  reason: default package */
public final class wa1 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ List c;
    public final /* synthetic */ int o;
    public final /* synthetic */ ya1 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wa1(List list, int i, ya1 ya1, Continuation continuation) {
        super(2, continuation);
        this.c = list;
        this.o = i;
        this.v = ya1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        wa1 wa1 = new wa1(this.c, this.o, this.v, continuation);
        wa1.b = obj;
        return wa1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wa1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object value;
        Object value2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        List list = null;
        int i2 = this.o;
        ya1 ya1 = this.v;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d14 = (d14) this.b;
            List list2 = this.c;
            if (list2.isEmpty() || i2 == 0) {
                xme xme = ya1.Z;
                do {
                    value2 = xme.getValue();
                } while (!xme.b(value2, qa1.a((qa1) value2, (zd0) null, (aj8) null, (aj8) null, false, (ngf) null, (ArrayList) null, ya1.j(ya1, CollectionsKt.emptyList(), i2), 63)));
                return Unit.INSTANCE;
            }
            Iterable<Number> iterable = list2;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (Number longValue : iterable) {
                arrayList.add(((eu3) ya1.y.getValue()).c(longValue.longValue()));
            }
            va1 va1 = new va1(0, (bs5[]) CollectionsKt.toList(arrayList).toArray(new bs5[0]), d14, list2, ya1);
            Duration.Companion companion = Duration.Companion;
            wb c2 = gt5.c(va1, Duration.m1371getInWholeMillisecondsimpl(DurationKt.toDuration(5, DurationUnit.SECONDS)), new SuspendLambda(2, (Continuation<Object>) null));
            this.a = 1;
            obj2 = bs0.z(c2, this);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Object r0 = ((Result) obj2).m32unboximpl();
        if (Result.m29isFailureimpl(r0)) {
            r0 = null;
        }
        vk3[] vk3Arr = (vk3[]) r0;
        if (vk3Arr != null) {
            list = ArraysKt.filterNotNull(vk3Arr);
        }
        if (list == null) {
            return Unit.INSTANCE;
        }
        Iterable<vk3> iterable2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
        for (vk3 vk3 : iterable2) {
            arrayList2.add(new Pair(new gd0(vk3.q(), vk3.r()), vk3.t(kl0.a)));
        }
        xme xme2 = ya1.Z;
        do {
            value = xme2.getValue();
        } while (!xme2.b(value, qa1.a((qa1) value, (zd0) null, (aj8) null, (aj8) null, false, (ngf) null, arrayList2, ya1.j(ya1, list, i2), 31)));
        return Unit.INSTANCE;
    }
}
