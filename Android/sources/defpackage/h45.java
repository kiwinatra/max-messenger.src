package defpackage;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: h45  reason: default package */
public final class h45 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ i45 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h45(Function1 function1, int i, i45 i45, Continuation continuation) {
        super(2, continuation);
        this.a = function1;
        this.b = i;
        this.c = i45;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new h45(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h45) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i = this.b;
        Function1 function1 = this.a;
        if (function1 != null) {
            function1.invoke(Boxing.boxInt(i));
        }
        i45 i45 = this.c;
        Iterable<vx1> iterable = ((f45) i45.X.a.getValue()).a;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (vx1 vx1 : iterable) {
            if (vx1.a == i) {
                vx1 = vx1.h(vx1, true);
            } else if (vx1.c) {
                vx1 = vx1.h(vx1, false);
            }
            arrayList.add(vx1);
        }
        xme xme = i45.z;
        f45 f45 = new f45(arrayList, ((f45) xme.getValue()).b);
        xme.getClass();
        xme.m((Object) null, f45);
        return Unit.INSTANCE;
    }
}
