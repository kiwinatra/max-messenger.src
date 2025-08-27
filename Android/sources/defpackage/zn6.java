package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zn6  reason: default package */
public final class zn6 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ gp6 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zn6(gp6 gp6, Continuation continuation) {
        super(2, continuation);
        this.b = gp6;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        zn6 zn6 = new zn6(this.b, continuation);
        zn6.a = obj;
        return zn6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zn6) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Pair pair = (Pair) this.a;
        List list = (List) pair.component2();
        int size = list.size();
        z68.c("gp6", "got album and items, items size = " + size, new Object[0]);
        gp6 gp6 = this.b;
        gp6.x0.setValue(Boxing.boxBoolean(false));
        gp6.z0.setValue((wk6) pair.component1());
        xme xme = gp6.Z;
        xme.getClass();
        xme.m((Object) null, list);
        return Unit.INSTANCE;
    }
}
