package defpackage;

import android.view.View;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: mo2  reason: default package */
public final class mo2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ lp2 a;
    public final /* synthetic */ View b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mo2(lp2 lp2, View view, Continuation continuation) {
        super(2, continuation);
        this.a = lp2;
        this.b = view;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new mo2(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mo2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        lp2 lp2 = this.a;
        a32 a32 = (a32) lp2.Q0.a.getValue();
        if (a32 == null) {
            return Unit.INSTANCE;
        }
        boolean z = !a32.X((x23) lp2.Y.getValue());
        List createListBuilder = CollectionsKt.createListBuilder();
        if (lp2.n() && !a32.J()) {
            createListBuilder.add(new ow3(dad.E0, (ngf) new igf(ead.M), Boxing.boxInt(cad.m2), (Integer) null, 20));
        }
        boolean N = a32.N();
        m72 m72 = a32.b;
        if ((N || m72.c != k72.c) && !a32.U() && !a32.M()) {
            createListBuilder.add(new ow3(dad.D0, (ngf) new igf(ead.L), Boxing.boxInt(cad.R0), (Integer) null, 20));
        }
        if (!a32.T()) {
            createListBuilder.add(new ow3(z ? dad.C0 : dad.B0, (ngf) new igf(ead.K), Boxing.boxInt(z ? cad.w1 : cad.v1), (Integer) null, 20));
            createListBuilder.add(new ow3(dad.A0, (ngf) new igf(ead.j), Boxing.boxInt(cad.c), (Integer) null, 20));
        }
        List build = CollectionsKt.build(createListBuilder);
        Pair pair = TuplesKt.to("chat_server_id", Boxing.boxLong(m72.a));
        vk3 m = a32.m();
        xag.h(lp2.T0, new bo2(build, o54.f(pair, TuplesKt.to("contact_id", m != null ? Boxing.boxLong(m.r()) : null)), this.b));
        return Unit.INSTANCE;
    }
}
