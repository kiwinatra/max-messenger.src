package defpackage;

import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: j92  reason: default package */
public final class j92 extends SuspendLambda implements Function2 {
    public ia2 a;
    public int b;
    public final /* synthetic */ ia2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j92(ia2 ia2, Continuation continuation) {
        super(2, continuation);
        this.c = ia2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new j92(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j92) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ia2 ia2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = ia2.K0;
            ia2 ia22 = this.c;
            c6d g = ia22.g();
            this.a = ia22;
            this.b = 1;
            g.getClass();
            d7d a2 = d7d.a(0, "SELECT * FROM chat_folder ORDER BY `order` ASC");
            Object q = i8b.q(g.a, new CancellationSignal(), new b6d(g, a2, 3), this);
            if (q == coroutine_suspended) {
                return coroutine_suspended;
            }
            ia2 ia23 = ia22;
            obj = q;
            ia2 = ia23;
        } else if (i == 1) {
            ia2 = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : (Iterable) obj) {
            if (!((j5d) next).m) {
                arrayList.add(next);
            }
        }
        String str2 = ia2.K0;
        ia2.getClass();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(ia2.m((j5d) it.next()));
        }
        return arrayList2;
    }
}
