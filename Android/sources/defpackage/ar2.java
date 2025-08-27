package defpackage;

import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: ar2  reason: default package */
public final class ar2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ fr2 b;
    public final /* synthetic */ Lazy c;
    public final /* synthetic */ Lazy o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ar2(fr2 fr2, Lazy lazy, Lazy lazy2, Continuation continuation) {
        super(2, continuation);
        this.b = fr2;
        this.c = lazy;
        this.o = lazy2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ar2 ar2 = new ar2(this.b, this.c, this.o, continuation);
        ar2.a = obj;
        return ar2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ar2) create((m24) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        m24 m24 = (m24) this.a;
        boolean z = m24 instanceof k24;
        fr2 fr2 = this.b;
        if (z) {
            if (((k24) m24).a != fr2.B0.get()) {
                return Unit.INSTANCE;
            }
            xag.h(fr2.A0, xq2.a);
        } else if (m24 instanceof l24) {
            l24 l24 = (l24) m24;
            if (l24.a != fr2.B0.get()) {
                return Unit.INSTANCE;
            }
            aje g = xag.g(fr2, ((osa) ((gaf) this.c.getValue())).b(), (f14) null, new zq2(fr2, m24, (Continuation) null), 2);
            fr2.D0.setValue(fr2, fr2.H0[1], g);
            vj5 vj5 = (vj5) ((uj5) this.o.getValue());
            vj5.getClass();
            boolean m = vj5.m(PmsKey.f32editchanneltypescreenenabled, false);
            long j = l24.b;
            s85 s85 = fr2.z0;
            if (m) {
                xag.h(s85, new kq2(j));
            } else {
                xag.h(s85, new jq2(j));
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
