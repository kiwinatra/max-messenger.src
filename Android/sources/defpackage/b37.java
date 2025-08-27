package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: b37  reason: default package */
public final class b37 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ c37 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b37(String str, c37 c37, Continuation continuation) {
        super(2, continuation);
        this.a = str;
        this.b = c37;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new b37(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b37) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = this.a;
        boolean F = StringsKt__StringsJVMKt.startsWith$default(str, "Custom", false, 2, (Object) null);
        c37 c37 = this.b;
        if (F) {
            xag.h(c37.z, new y27(c37.w.getString("Custom", "")));
            return Unit.INSTANCE;
        }
        boolean e = ((doa) c37.v.getValue()).e();
        ltb ltb = (ltb) c37.j();
        ltb.a.b();
        ltb.b.b();
        ltb.c.b();
        ltb.d.b();
        ltb.e.b();
        ((ltb) c37.j()).a.l("server.host", str);
        ((ltb) c37.j()).a.l("server.port", "443");
        c37.y.setValue(c37.k());
        s85 s85 = c37.z;
        if (e) {
            xag.h(s85, z27.a);
            q13 q13 = c37.b;
            String str2 = (String) q13.c;
            z68.c(str2, "execute", new Object[0]);
            ((sv0) ((Lazy) q13.o).getValue()).d(new p13(q13));
            try {
                ((doa) ((Lazy) q13.v).getValue()).h(true);
            } catch (Throwable th) {
                z68.f(str2, "resetCache: failed", th);
            }
        }
        xag.h(s85, x27.a);
        return Unit.INSTANCE;
    }
}
