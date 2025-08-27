package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: wve  reason: default package */
public final class wve extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ gwe b;
    public final /* synthetic */ Set c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wve(gwe gwe, Set set, Continuation continuation) {
        super(2, continuation);
        this.b = gwe;
        this.c = set;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wve(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wve) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        Set set = this.c;
        gwe gwe = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (gwe.b == ete.RECENT) {
                List list = CollectionsKt.toList(set);
                this.a = 1;
                if (((gvc) gwe.x.getValue()).c(list, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                bb3 e = ((vi5) gwe.y.getValue()).e(CollectionsKt.toList(set));
                this.a = 2;
                if (bs0.e(e, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1 || i == 2) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i2 = n1b.F;
        int size = set.size();
        KProperty[] kPropertyArr = gwe.B0;
        String l = gwe.l(size);
        xag.h(gwe.z0, new s0e(cad.y, new mgf(gwe.o.getString(i2, new Object[]{l}))));
        return Unit.INSTANCE;
    }
}
