package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: i59  reason: default package */
public final class i59 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ l59 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i59(Object obj, Continuation continuation, l59 l59) {
        super(2, continuation);
        this.a = obj;
        this.b = l59;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new i59(this.a, continuation, this.b);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i59) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        a32 a32 = (a32) this.a;
        if (a32.N()) {
            vk3 m = a32.m();
            if (m != null) {
                return ((pjb) this.b.e.getValue()).a(m, false);
            }
            throw new IllegalArgumentException("Dialog contact is not found".toString());
        }
        throw new IllegalArgumentException("Only dialogs are supported".toString());
    }
}
