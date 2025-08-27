package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: sb  reason: default package */
public final class sb extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ xb b;
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sb(xb xbVar, String str, Continuation continuation) {
        super(2, continuation);
        this.b = xbVar;
        this.c = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new sb(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            lb lbVar = this.b.c;
            this.a = 1;
            ArrayList arrayList = new ArrayList();
            for (Object next : (List) lbVar.h.getValue()) {
                vk3 vk3 = (vk3) next;
                String valueOf = String.valueOf(vk3.s());
                String str = this.c;
                if (!StringsKt__StringsJVMKt.startsWith$default(valueOf, str, false, 2, (Object) null)) {
                    Lazy lazy = lbVar.e;
                    if (!((tld) lazy.getValue()).h(String.valueOf(vk3.f()), str)) {
                        String b2 = hhf.b(vk3.j());
                        if (b2 != null) {
                            if (!((tld) lazy.getValue()).h(b2, str)) {
                            }
                        }
                    }
                }
                arrayList.add(next);
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(lbVar.b((vk3) it.next()));
            }
            ((ns3) lbVar.b.getValue()).c(arrayList2, new h9(6));
            Object a2 = lbVar.k.a(arrayList2, this);
            if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                a2 = Unit.INSTANCE;
            }
            if (a2 == coroutine_suspended) {
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
