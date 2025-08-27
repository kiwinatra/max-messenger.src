package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* renamed from: r0f  reason: default package */
public final class r0f extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ v0f b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r0f(v0f v0f, Continuation continuation) {
        super(2, continuation);
        this.b = v0f;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        r0f r0f = new r0f(this.b, continuation);
        r0f.a = obj;
        return r0f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r0f) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        xme xme;
        Object value;
        Object value2;
        Object value3;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = (String) this.a;
        v0f v0f = this.b;
        int intValue = ((Number) v0f.H0.getValue()).intValue();
        xme xme2 = v0f.I0;
        if (str == null || StringsKt.isBlank(str)) {
            pm7 pm7 = (pm7) v0f.M0.getValue(v0f, v0f.S0[0]);
            if (pm7 != null) {
                pm7.b((CancellationException) null);
            }
            do {
                xme = v0f.C0;
                value = xme.getValue();
                h0f h0f = (h0f) value;
            } while (!xme.b(value, (Object) null));
            do {
                value2 = xme2.getValue();
                o0f o0f = (o0f) value2;
            } while (!xme2.b(value2, (Object) null));
        } else {
            o0f o0f2 = (o0f) xme2.getValue();
            if (o0f2 != null && !StringsKt__StringsKt.contains$default((CharSequence) str, o0f2.h(), false, 2, (Object) null)) {
                do {
                    value3 = xme2.getValue();
                    o0f o0f3 = (o0f) value3;
                } while (!xme2.b(value3, (Object) null));
                v0f.j(intValue, str.toString());
            } else {
                v0f.j(intValue, str.toString());
            }
        }
        return Unit.INSTANCE;
    }
}
