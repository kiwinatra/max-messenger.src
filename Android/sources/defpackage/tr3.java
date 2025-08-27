package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: tr3  reason: default package */
public final class tr3 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ vr3 c;
    public final /* synthetic */ long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tr3(vr3 vr3, long j, Continuation continuation) {
        super(2, continuation);
        this.c = vr3;
        this.o = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        tr3 tr3 = new tr3(this.c, this.o, continuation);
        tr3.b = obj;
        return tr3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tr3) create((vk3) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        long j = this.o;
        vr3 vr3 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (kv0.M((vk3) this.b)) {
                String name = vr3.getClass().getName();
                z68.c(name, "try to request info for #" + j, new Object[0]);
                long j2 = this.o;
                Duration.Companion companion = Duration.Companion;
                long duration = DurationKt.toDuration(3, DurationUnit.SECONDS);
                this.a = 1;
                if (((is9) vr3.s.getValue()).u(j2, duration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                String name2 = vr3.getClass().getName();
                z68.f(name2, "fail to fetch noncontact #" + j, th);
                return new fs5(3, ((eu3) vr3.g.getValue()).a(j));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ((eu3) vr3.g.getValue()).c(j);
    }
}
