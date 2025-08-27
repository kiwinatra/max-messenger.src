package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ukg  reason: default package */
public final class ukg extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ zkg b;
    public final /* synthetic */ wkg c;
    public final /* synthetic */ mkg o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ukg(mkg mkg, wkg wkg, zkg zkg, Continuation continuation) {
        super(2, continuation);
        this.b = zkg;
        this.c = wkg;
        this.o = mkg;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ukg(this.o, this.c, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ukg) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        mkg mkg = this.o;
        wkg wkg = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zkg zkg = this.b;
            rze rze = new rze(zkg.d == null ? qze.c : qze.b, zkg.b);
            ru0 ru0 = wkg.e;
            String str = mkg.a;
            yo7 yo7 = wkg.a;
            yo7.getClass();
            mo7 mo7 = new mo7(str, yo7.b(rze.Companion.serializer(), rze));
            this.a = 1;
            if (ru0.t(mo7, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wkg.e(wkg, mkg.a);
        return Unit.INSTANCE;
    }
}
