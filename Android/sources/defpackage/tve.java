package defpackage;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: tve  reason: default package */
public final class tve extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ gwe b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tve(gwe gwe, Continuation continuation) {
        super(2, continuation);
        this.b = gwe;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new tve(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tve) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        gwe gwe = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = gwe.B0;
            yia a2 = ((vi5) gwe.y.getValue()).a();
            this.a = 1;
            obj = bs0.g(a2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            xag.h(gwe.z0, new s0e(cad.y, new igf(n1b.x)));
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterable<boe> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (boe boe : iterable) {
            arrayList.add(Boxing.boxLong(boe.a));
        }
        if (arrayList.isEmpty()) {
            return Unit.INSTANCE;
        }
        KProperty[] kPropertyArr2 = gwe.B0;
        bb3 e = ((vi5) gwe.y.getValue()).e(arrayList);
        this.a = 2;
        if (bs0.e(e, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        xag.h(gwe.z0, new s0e(cad.y, new igf(n1b.x)));
        return Unit.INSTANCE;
    }
}
