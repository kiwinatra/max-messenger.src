package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: s81  reason: default package */
public final class s81 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ t81 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s81(t81 t81, Continuation continuation) {
        super(2, continuation);
        this.b = t81;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        s81 s81 = new s81(this.b, continuation);
        s81.a = obj;
        return s81;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((s81) create((Long) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Long l = (Long) this.a;
        t81 t81 = this.b;
        xme xme = t81.x;
        do {
            value = xme.getValue();
            String str2 = (String) value;
            if (l != null) {
                t81.o.getClass();
                str = a81.m("· ", hl1.c(l));
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
        } while (!xme.b(value, str));
        return Unit.INSTANCE;
    }
}
