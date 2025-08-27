package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: okg  reason: default package */
public final class okg extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ zjg b;
    public final /* synthetic */ wkg c;
    public final /* synthetic */ mkg o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public okg(zjg zjg, mkg mkg, wkg wkg, Continuation continuation) {
        super(2, continuation);
        this.b = zjg;
        this.c = wkg;
        this.o = mkg;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        wkg wkg = this.c;
        return new okg(this.b, this.o, wkg, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((okg) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        mkg mkg = this.o;
        wkg wkg = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            rze rze = new rze(qze.o, this.b.b);
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
