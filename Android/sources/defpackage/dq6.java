package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: dq6  reason: default package */
public final class dq6 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ d14 c;
    public final /* synthetic */ long o;
    public final /* synthetic */ gq6 v;
    public final /* synthetic */ long w;
    public final /* synthetic */ boolean x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dq6(d14 d14, long j, gq6 gq6, long j2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.c = d14;
        this.o = j;
        this.v = gq6;
        this.w = j2;
        this.x = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        dq6 dq6 = new dq6(this.c, this.o, this.v, this.w, this.x, continuation);
        dq6.b = obj;
        return dq6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dq6) create((vk3) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        d14 d14 = this.c;
        gq6 gq6 = this.v;
        long j = this.o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (kv0.M((vk3) this.b)) {
                String name = d14.getClass().getName();
                z68.c(name, "try to request info for #" + j, new Object[0]);
                long j2 = this.o;
                long j3 = this.w;
                this.a = 1;
                if (((is9) gq6.b.getValue()).u(j2, j3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                String name2 = d14.getClass().getName();
                z68.f(name2, "fail to fetch noncontact #" + j, th);
                return new fs5(3, this.x ? ((eu3) gq6.a.getValue()).a(j) : null);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ((eu3) gq6.a.getValue()).c(j);
    }
}
