package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: av2  reason: default package */
public final class av2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ov2 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public av2(ov2 ov2, Continuation continuation) {
        super(2, continuation);
        this.a = ov2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new av2(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((av2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ov2 ov2 = this.a;
        fd8 fd8 = ov2.o;
        String str = ((vu2) ov2.C0.getValue()).b;
        fd8.getClass();
        z68.c("fd8", "loadNextMessages", new Object[0]);
        if (!jbd.d(fd8.k)) {
            z68.c("fd8", "searchMessagesInternal: is loading, return", new Object[0]);
        } else {
            yt ytVar = new yt(str, !cvg.A(fd8.r) ? fd8.r : null, 29);
            wbf wbf = (wbf) fd8.d;
            wbf.getClass();
            mka mka = new mka(1, new pbb(20, wbf, ytVar));
            lfd lfd = fd8.c;
            fce j = mka.j(lfd);
            gcf gcf = fd8.f;
            gcf.getClass();
            fce j2 = j.k(new ecf(gcf, 1, 0)).n(lfd).j(fd8.b);
            ao1 ao1 = new ao1(3, new yc8(fd8, str, 0), new xc8(fd8, 1));
            j2.l(ao1);
            fd8.k = ao1;
        }
        return Unit.INSTANCE;
    }
}
