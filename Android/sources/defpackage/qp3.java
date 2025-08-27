package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: qp3  reason: default package */
public final class qp3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ yp3 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qp3(yp3 yp3, Continuation continuation) {
        super(2, continuation);
        this.a = yp3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new qp3(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qp3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        xme xme;
        Object value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        yp3 yp3 = this.a;
        akd akd = (akd) ((bud) yp3.Z.getValue());
        akd.getClass();
        int i = akd.m(PmsKey.f6accountnicknameenabled, false) ? sra.k : sra.j;
        do {
            xme = yp3.z0;
            value = xme.getValue();
            ngf ngf = (ngf) value;
        } while (!xme.b(value, new igf(i)));
        return Unit.INSTANCE;
    }
}
