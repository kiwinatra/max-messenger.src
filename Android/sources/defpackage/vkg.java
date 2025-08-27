package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: vkg  reason: default package */
public final class vkg extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wkg c;
    public final /* synthetic */ mkg o;
    public final /* synthetic */ zkg v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vkg(mkg mkg, wkg wkg, zkg zkg, Continuation continuation) {
        super(2, continuation);
        this.c = wkg;
        this.o = mkg;
        this.v = zkg;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        vkg vkg = new vkg(this.o, this.c, this.v, continuation);
        vkg.b = obj;
        return vkg;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vkg) create((Throwable) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            wkg wkg = this.c;
            wkg.getClass();
            vo7 f = wkg.f((Throwable) this.b);
            d93 g = wkg.g();
            String str = this.v.b;
            this.a = 1;
            if (g.a(wkg.e, f, this.o, str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
