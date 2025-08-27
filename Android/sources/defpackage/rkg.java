package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: rkg  reason: default package */
public final class rkg extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ikg c;
    public final /* synthetic */ wkg o;
    public final /* synthetic */ mkg v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rkg(ikg ikg, mkg mkg, wkg wkg, Continuation continuation) {
        super(2, continuation);
        this.c = ikg;
        this.o = wkg;
        this.v = mkg;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        wkg wkg = this.o;
        rkg rkg = new rkg(this.c, this.v, wkg, continuation);
        rkg.b = obj;
        return rkg;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rkg) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        mkg mkg = this.v;
        wkg wkg = this.o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ikg ikg = this.c;
            lkg lkg = new lkg(ikg.b, ikg.c, (String) this.b);
            ru0 ru0 = wkg.e;
            String str = mkg.a;
            yo7 yo7 = wkg.a;
            yo7.getClass();
            mo7 mo7 = new mo7(str, yo7.b(lkg.Companion.serializer(), lkg));
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
