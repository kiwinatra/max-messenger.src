package defpackage;

import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: cq1  reason: default package */
public final class cq1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ List a;
    public final /* synthetic */ qpg b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cq1(List list, qpg qpg, Continuation continuation) {
        super(2, continuation);
        this.a = list;
        this.b = qpg;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new cq1(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cq1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        for (mz6 mz6 : this.a) {
            boolean z = mz6 instanceof iz6;
            qpg qpg = this.b;
            if (z) {
                iz6 iz6 = (iz6) mz6;
                long j = iz6.b;
                CollectionsKt.emptyList();
                ((jqg) ((Lazy) qpg.a).getValue()).a(new nud(j, iz6.d, (z93) null, false, bl4.REGULAR));
            } else if (mz6 instanceof kz6) {
                kz6 kz6 = (kz6) mz6;
                long j2 = kz6.b;
                CollectionsKt.emptyList();
                ((jqg) ((Lazy) qpg.a).getValue()).a(new nud(j2, kz6.c, (z93) null, false, bl4.REGULAR));
            } else if (mz6 instanceof jz6) {
                String str = ((jz6) mz6).d;
                wbe i = ((ic1) ((Lazy) qpg.b).getValue()).a.n().i(p9a.c);
                hc1 hc1 = new hc1(str, 1);
                mw1 mw1 = new mw1(1);
                Objects.requireNonNull(mw1, "observer is null");
                try {
                    xh8 xh8 = new xh8(mw1, hc1, 1);
                    mw1.c(xh8);
                    i.l(xh8);
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th) {
                    hd8.Z(th);
                    n54.D(th);
                    NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                    nullPointerException.initCause(th);
                    throw nullPointerException;
                }
            } else if (!(mz6 instanceof lz6)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}
