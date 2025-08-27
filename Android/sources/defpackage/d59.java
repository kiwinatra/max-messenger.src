package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: d59  reason: default package */
public final class d59 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ l59 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d59(l59 l59, Continuation continuation) {
        super(2, continuation);
        this.c = l59;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        d59 d59 = new d59(this.c, continuation);
        d59.b = obj;
        return d59;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d59) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        l59 l59;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List list = (List) this.b;
            jz9 jz9 = new jz9(list.size());
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                l59 = this.c;
                if (!hasNext) {
                    break;
                }
                vk3 vk3 = (vk3) it.next();
                hhb a2 = !jz9.e(vk3.r()) ? null : ((pjb) l59.e.getValue()).a(vk3, false);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            ((ns3) l59.c.getValue()).c(arrayList, new wg7(16));
            n6e n6e = l59.l;
            this.a = 1;
            if (n6e.a(arrayList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
