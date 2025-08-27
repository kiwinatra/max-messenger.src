package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: bib  reason: default package */
public final class bib extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ jib b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bib(Object obj, Continuation continuation, jib jib) {
        super(2, continuation);
        this.a = obj;
        this.b = jib;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new bib(this.a, continuation, this.b);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bib) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ald ald = (ald) this.a;
        int i = ald.a;
        jib jib = this.b;
        return i == 4 ? ((pjb) jib.z.getValue()).a(ald.v, true) : jib.j(jib, ((cu2) jib.y.getValue()).a(ald.o));
    }
}
