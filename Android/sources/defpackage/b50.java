package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: b50  reason: default package */
public final class b50 extends SuspendLambda implements Function2 {
    public final /* synthetic */ c50 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b50(c50 c50, Continuation continuation) {
        super(2, continuation);
        this.a = c50;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new b50(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b50) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        boolean z;
        Float f;
        Object value3;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        c50 c50 = this.a;
        KProperty[] kPropertyArr = c50.i;
        long l = ((xy9) c50.b()).l();
        Long l2 = this.a.f;
        if (l2 == null || l != l2.longValue()) {
            xme xme = this.a.g;
            do {
                value = xme.getValue();
                ((xz7) value).getClass();
            } while (!xme.b(value, new xz7((Float) null, false)));
            return Unit.INSTANCE;
        } else if (this.a.b().b()) {
            xme xme2 = this.a.g;
            do {
                value3 = xme2.getValue();
                xz7 xz7 = (xz7) value3;
            } while (!xme2.b(value3, new xz7((Float) null, false)));
            return Unit.INSTANCE;
        } else {
            c50 c502 = this.a;
            xme xme3 = c502.g;
            do {
                value2 = xme3.getValue();
                xz7 xz72 = (xz7) value2;
                z = ((xy9) c502.b()).z;
                f = xz72.a;
                xz72.getClass();
            } while (!xme3.b(value2, new xz7(f, z)));
            return Unit.INSTANCE;
        }
    }
}
