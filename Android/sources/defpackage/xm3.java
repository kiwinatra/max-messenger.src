package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xm3  reason: default package */
public final class xm3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ pn3 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xm3(pn3 pn3, Continuation continuation) {
        super(2, continuation);
        this.b = pn3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        xm3 xm3 = new xm3(this.b, continuation);
        xm3.a = obj;
        return xm3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xm3) create((oz4) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        oz4 oz4;
        xme xme;
        Object value2;
        xme xme2;
        Object value3;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        oz4 oz42 = (oz4) this.a;
        pn3 pn3 = this.b;
        xme xme3 = pn3.k;
        do {
            value = xme3.getValue();
            oz4 = (oz4) value;
        } while (!xme3.b(value, oz4 != null ? oz4.c(oz4, (String) null, (c63) null, (String) null, (c63) null, (String) null, oz42.i, (m0g) null, false, (Long) null, 7935) : null));
        boolean z = pn3.C.get();
        String str = oz42.a;
        oz4 oz43 = (oz4) pn3.j.getValue();
        azb azb = new azb(str, oz42.b, oz42.c, oz42.d, oz43 != null && oz43.a((a05) pn3.k.getValue()), z, z ? zyb.b : zyb.a);
        List a2 = pn3.f().a(pn3);
        do {
            xme = pn3.c;
            value2 = xme.getValue();
            azb azb2 = (azb) value2;
        } while (!xme.b(value2, azb));
        do {
            xme2 = pn3.d;
            value3 = xme2.getValue();
            List list = (List) value3;
        } while (!xme2.b(value3, a2));
        return Unit.INSTANCE;
    }
}
