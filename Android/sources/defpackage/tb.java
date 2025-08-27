package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: tb  reason: default package */
public final class tb extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xb c;
    public final /* synthetic */ Lazy o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tb(xb xbVar, Lazy lazy, Continuation continuation) {
        super(2, continuation);
        this.c = xbVar;
        this.o = lazy;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        tb tbVar = new tb(this.c, this.o, continuation);
        tbVar.b = obj;
        return tbVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tb) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.b;
            xb xbVar = this.c;
            if (str == null || str.length() == 0) {
                n6e n6e = xbVar.x;
                List emptyList = CollectionsKt.emptyList();
                this.a = 1;
                if (n6e.a(emptyList, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                q04 a2 = ((osa) ((gaf) this.o.getValue())).a();
                f14 f14 = f14.b;
                sb sbVar = new sb(xbVar, str, (Continuation) null);
                KProperty[] kPropertyArr = xb.X;
                aje u = ev0.u(xbVar.a, a2, f14, sbVar);
                xbVar.w.setValue(xbVar, xb.X[0], u);
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
