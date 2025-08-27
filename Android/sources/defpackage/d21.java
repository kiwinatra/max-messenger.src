package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: d21  reason: default package */
public final class d21 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ k21 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d21(k21 k21, Continuation continuation) {
        super(2, continuation);
        this.b = k21;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        d21 d21 = new d21(this.b, continuation);
        d21.a = obj;
        return d21;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d21) create((a32) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        a32 a32 = (a32) this.a;
        xme xme = this.b.j;
        Long boxLong = Boxing.boxLong(a32.a);
        a32.l0();
        CharSequence charSequence = a32.X;
        String h = a32.h(kl0.o, jl0.a);
        Long boxLong2 = Boxing.boxLong(a32.g());
        a32.m0();
        y11 y11 = new y11(boxLong, charSequence, h, boxLong2, a32.v0);
        xme.getClass();
        xme.m((Object) null, y11);
        return Unit.INSTANCE;
    }
}
