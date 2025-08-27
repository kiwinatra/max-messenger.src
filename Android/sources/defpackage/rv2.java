package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: rv2  reason: default package */
public final class rv2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ tw2 b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rv2(tw2 tw2, long j, Continuation continuation) {
        super(2, continuation);
        this.b = tw2;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new rv2(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rv2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            tw2 tw2 = this.b;
            this.a = 1;
            obj = ((f32) tw2.w0.getValue()).a(this.c, tw2.c, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : (Iterable) obj) {
            if (((c32) next) != c32.y0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(n79.q((c32) it.next()));
        }
        return arrayList2;
    }
}
