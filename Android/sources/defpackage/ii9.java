package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: ii9  reason: default package */
public final class ii9 extends SuspendLambda implements Function2 {
    public /* synthetic */ int a;
    public final /* synthetic */ MessageWriteWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ii9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.b = messageWriteWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ii9 ii9 = new ii9(continuation, this.b);
        ii9.a = ((Number) obj).intValue();
        return ii9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ii9) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i = this.a;
        KProperty[] kPropertyArr = MessageWriteWidget.C0;
        xme xme = this.b.i0().H0;
        do {
            value = xme.getValue();
            ((Number) value).intValue();
        } while (!xme.b(value, Integer.valueOf(i)));
        return Unit.INSTANCE;
    }
}
