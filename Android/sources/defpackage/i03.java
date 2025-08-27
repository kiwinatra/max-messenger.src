package defpackage;

import android.os.Looper;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i03  reason: default package */
public final class i03 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ fu4 b;
    public final /* synthetic */ Function0 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i03(fu4 fu4, t68 t68, Continuation continuation) {
        super(2, continuation);
        this.b = fu4;
        this.c = t68;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        i03 i03 = new i03(this.b, (t68) this.c, continuation);
        i03.a = obj;
        return i03;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i03) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        if (!Intrinsics.areEqual((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
            fu4 fu4 = this.b;
            zz2 zz2 = new zz2((etc) ((he) fu4.e).o, fu4, 1);
            dtc dtc = (dtc) ((l15) fu4.g).c;
            bs5 w = bs0.w(bs0.b0(new ps5(new zz2(new on2(dtc, 11), fu4, 0), new a03(fu4, (Continuation) null)), new b03(3, (Continuation) null, 0)));
            xme xme = (xme) fu4.i;
            bs0.K(new vt5(new wb(15, new ps5(new on2(new zz2(bs0.E(new fs5(2, new bs5[]{(etc) ((ox0) fu4.d).b, zz2, dtc, w, xme})), fu4, 2), 28), new c03(fu4, (Continuation) null), 5), new d03(fu4, (Continuation) null, 0)), new d03(fu4, (Continuation) null, 1)), d14);
            t68 t68 = (t68) this.c;
            bs0.K(new ps5((etc) fu4.j, new e03(fu4, t68, (Continuation) null), 5), d14);
            bs0.K(new ps5(xme, new f03(fu4, t68, (Continuation) null), 5), d14);
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
