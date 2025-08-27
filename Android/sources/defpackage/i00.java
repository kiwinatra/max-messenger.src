package defpackage;

import android.app.Application;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: i00  reason: default package */
public final class i00 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ j00 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i00(j00 j00, Continuation continuation) {
        super(2, continuation);
        this.b = j00;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        i00 i00 = new i00(this.b, continuation);
        i00.a = obj;
        return i00;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i00) create((eqc) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        eqc eqc = (eqc) this.a;
        j00 j00 = this.b;
        j00.getClass();
        boolean z = eqc instanceof aqc;
        Application application = j00.b;
        xme xme = j00.e;
        if (z) {
            aqc aqc = (aqc) eqc;
            int i = (aqc.c > 0 ? 1 : (aqc.c == 0 ? 0 : -1));
            float f = aqc.d;
            long j = i == 0 ? (long) ((f / ((float) 100)) * ((float) aqc.f)) : aqc.e;
            float f2 = f;
            long j2 = aqc.b;
            b00 b00 = new b00(aqc.a, f2, j2 > 0 ? new mgf(g63.i(ghf.x(j, false, application), "/", ghf.w(ghf.m(j2), j2, application, true))) : new igf(ewa.t));
            xme.getClass();
            xme.m((Object) null, b00);
        } else if (eqc instanceof dqc) {
            dqc dqc = (dqc) eqc;
            float f3 = (float) dqc.b;
            float f4 = dqc.c;
            String x = ghf.x((long) ((f4 / ((float) 100)) * f3), false, application);
            long j3 = dqc.b;
            e00 e00 = new e00(dqc.a, f4, new mgf(g63.i(x, "/", ghf.w(ghf.m(j3), j3, application, true))));
            xme.getClass();
            xme.m((Object) null, e00);
        } else if (eqc instanceof bqc) {
            bqc bqc = (bqc) eqc;
            c00 c00 = new c00(bqc.a, new mgf(ghf.x(bqc.b, true, application)));
            xme.getClass();
            xme.m((Object) null, c00);
        } else if (eqc instanceof cqc) {
            cqc cqc = (cqc) eqc;
            d00 d00 = new d00(cqc.a, new mgf(ghf.x(cqc.b, true, application)));
            xme.getClass();
            xme.m((Object) null, d00);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
