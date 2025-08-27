package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* renamed from: qhb  reason: default package */
public final class qhb extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ whb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qhb(whb whb, Continuation continuation) {
        super(2, continuation);
        this.c = whb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        qhb qhb = new qhb(this.c, continuation);
        qhb.b = obj;
        return qhb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qhb) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        whb whb = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.b;
            String str2 = (String) pair.component1();
            List list = (List) pair.component2();
            if (StringsKt.isBlank(str2)) {
                whb.y0.setValue(whb.E0);
                return Unit.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (((ald) next).a == 1) {
                    arrayList.add(next);
                }
            }
            jx3 a2 = e14.a(getContext());
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(ev0.d(a2, (q04) null, new phb(it.next(), (Continuation) null, whb), 3));
            }
            this.b = str2;
            this.a = 1;
            obj = j4b.g(arrayList2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = str2;
        } else if (i == 1) {
            str = (String) this.b;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xme xme = whb.y0;
        shb shb = new shb(str, (List) obj);
        xme.getClass();
        xme.m((Object) null, shb);
        return Unit.INSTANCE;
    }
}
