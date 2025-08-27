package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: spe  reason: default package */
public final class spe extends SuspendLambda implements Function2 {
    public int a;
    public int b;
    public final /* synthetic */ gpe c;
    public final /* synthetic */ upe o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public spe(gpe gpe, upe upe, Continuation continuation) {
        super(2, continuation);
        this.c = gpe;
        this.o = upe;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new spe(this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((spe) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.b;
        gpe gpe = this.c;
        upe upe = this.o;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            boolean z2 = !gpe.X;
            bb3 c2 = ((vi5) upe.x.getValue()).c(gpe.a, z2);
            this.a = z2 ? 1 : 0;
            this.b = 1;
            if (bs0.e(c2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i = z2;
        } else if (i2 == 1) {
            i = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xme xme = upe.v0;
        gpe h = gpe.h(gpe, i != 0, false, 3583);
        xme.getClass();
        xme.m((Object) null, h);
        if (i == 0) {
            z = false;
        }
        xag.h(upe.Z, new p8e(z ? cad.o : cad.y, z ? i1b.e : i1b.f));
        return Unit.INSTANCE;
    }
}
