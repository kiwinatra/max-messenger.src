package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: na6  reason: default package */
public final class na6 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ ra3 c;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ qa6 v;
    public final /* synthetic */ mk4 w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public na6(Object obj, Continuation continuation, ra3 ra3, boolean z, qa6 qa6, mk4 mk4) {
        super(2, continuation);
        this.b = obj;
        this.c = ra3;
        this.o = z;
        this.v = qa6;
        this.w = mk4;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new na6(this.b, continuation, this.c, this.o, this.v, this.w);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((na6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            a89 a89 = (a89) this.b;
            ((sa3) this.c).R(Boxing.boxLong(a89.a.z));
            if (this.o) {
                return new lud(new kud(a89));
            }
            this.a = 1;
            obj = qa6.a(this.v, this.w, a89, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kvd kvd = new kvd(0, (String) null, false, CollectionsKt.emptyList());
        kvd.b = (mc9) obj;
        return new mvd(kvd);
    }
}
