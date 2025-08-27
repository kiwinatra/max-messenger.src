package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: x5a  reason: default package */
public final class x5a extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ md b;
    public final /* synthetic */ z5a c;
    public final /* synthetic */ jgd o;
    public final /* synthetic */ h8b v;
    public final /* synthetic */ n78 w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x5a(md mdVar, z5a z5a, jgd jgd, h8b h8b, n78 n78, Continuation continuation) {
        super(2, continuation);
        this.b = mdVar;
        this.c = z5a;
        this.o = jgd;
        this.v = h8b;
        this.w = n78;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new x5a(this.b, this.c, this.o, this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((x5a) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        jgd jgd = this.o;
        z5a z5a = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            md mdVar = md.COLD_START;
            md mdVar2 = this.b;
            if (mdVar2 == mdVar) {
                this.a = 1;
                if (z5a.a(z5a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.a = 3;
                z5a.getClass();
                Object h = z5a.h(jgd.a, this.w, mdVar2, this.v, false, this);
                if (h != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    h = Unit.INSTANCE;
                }
                if (h == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2 || i == 3) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.a = 2;
        z5a.getClass();
        Object h2 = z5a.h(jgd.a, (n78) null, this.b, this.v, true, this);
        if (h2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            h2 = Unit.INSTANCE;
        }
        if (h2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
