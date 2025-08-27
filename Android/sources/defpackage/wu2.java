package defpackage;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: wu2  reason: default package */
public final class wu2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ov2 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wu2(ov2 ov2, Continuation continuation) {
        super(2, continuation);
        this.a = ov2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wu2(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wu2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ov2 ov2 = this.a;
        ruc ruc = ov2.b;
        ruc.getClass();
        new na3(0, new wia(new mha(jha.n(ruc.a.I(r62.I)), new quc(ruc, 1), 1), new quc(ruc, 4)), new wia(new mha(new mha(jha.n(ruc.b.q(km3.s, km3.u)), new quc(ruc, 5), 1), new quc(ruc, 6), 1), new quc(ruc, 3))).l(ruc.c).j(new ao1(0, new qbb(12), new ue4(9)));
        xme xme = ov2.C0;
        vu2 vu2 = (vu2) xme.getValue();
        z77 z77 = vu2.c;
        vu2 a2 = vu2.a(vu2, (uu2) null, new z77(z77.a, CollectionsKt.emptyList(), z77.c), (ArrayList) null, false, 27);
        xme.getClass();
        xme.m((Object) null, a2);
        return Unit.INSTANCE;
    }
}
