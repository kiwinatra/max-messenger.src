package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: vz4  reason: default package */
public final class vz4 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ xz4 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vz4(xz4 xz4, Continuation continuation) {
        super(2, continuation);
        this.b = xz4;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        vz4 vz4 = new vz4(this.b, continuation);
        vz4.a = obj;
        return vz4;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vz4) create((a05) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        xme xme;
        Object value;
        azb azb;
        xme xme2;
        Object value2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        a05 a05 = (a05) this.a;
        xz4 xz4 = this.b;
        a05 a052 = (a05) xz4.j.getValue();
        boolean z = false;
        boolean z2 = a052 != null && a052.a(a05);
        a05 a053 = xz4.l;
        if (a053 != null && a053.b(a05)) {
            z = true;
        }
        xz4.l = a05;
        do {
            xme = xz4.c;
            value = xme.getValue();
            azb azb2 = (azb) value;
            azb azb3 = (azb) xme.getValue();
            azb = null;
            if (azb3 != null) {
                azb = azb.a(azb3, (String) null, z2, 111);
            }
        } while (!xme.b(value, azb));
        if (z) {
            do {
                xme2 = xz4.d;
                value2 = xme2.getValue();
                List list = (List) value2;
            } while (!xme2.b(value2, xz4.f().a(xz4)));
        }
        return Unit.INSTANCE;
    }
}
