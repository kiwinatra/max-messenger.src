package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: apb  reason: default package */
public final class apb extends SuspendLambda implements Function2 {
    public Long a;
    public int b;
    public final /* synthetic */ cpb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public apb(cpb cpb, Continuation continuation) {
        super(2, continuation);
        this.c = cpb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new apb(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((apb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Long l;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        cpb cpb = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cy9 n = ((xy9) cpb.a).n();
            if (n == null) {
                return Unit.INSTANCE;
            }
            Object obj2 = n.c.get("MediaMetadata.Extra.MESSAGE_ID");
            Long l2 = obj2 instanceof Long ? (Long) obj2 : null;
            m30 m30 = mz4.a;
            xme xme = cpb.e;
            if (l2 == null) {
                w50 w50 = new w50((Long) null, c44.DEFAULT_ASPECT_RATIO, m30);
                xme.getClass();
                xme.m((Object) null, w50);
                return Unit.INSTANCE;
            }
            AtomicReference atomicReference = cpb.h;
            long longValue = l2.longValue();
            dy9 dy9 = cpb.a;
            atomicReference.set(new yu0(longValue, ((xy9) dy9).A));
            if (((xy9) dy9).A) {
                this.a = l2;
                this.b = 1;
                if (xk4.b(300, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                l = l2;
            } else {
                if (!dy9.b()) {
                    xy9 xy9 = (xy9) dy9;
                    if (xy9.z) {
                        m30 = v02.a;
                    } else {
                        boolean z = xy9.y;
                        cd4 cd4 = cd4.b;
                        if (z || xy9.x != 1) {
                            m30 = cd4;
                        }
                    }
                }
                w50 w502 = new w50(l2, ((Number) ((xy9) dy9).K.a.getValue()).floatValue(), m30);
                xme.getClass();
                xme.m((Object) null, w502);
                return Unit.INSTANCE;
            }
        } else if (i == 1) {
            l = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((yu0) cpb.h.get()).b) {
            long j = ((yu0) cpb.h.get()).a;
            if (l != null && j == l.longValue()) {
                w50 w503 = new w50(l, ((Number) ((xy9) cpb.a).K.a.getValue()).floatValue(), ejd.b);
                xme xme2 = cpb.e;
                xme2.getClass();
                xme2.m((Object) null, w503);
            }
        }
        return Unit.INSTANCE;
    }
}
