package defpackage;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: oa1  reason: default package */
public final class oa1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ya1 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oa1(ya1 ya1, Continuation continuation) {
        super(2, continuation);
        this.b = ya1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new oa1(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((oa1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        qa1 qa1;
        zd0 zd0;
        qcb qcb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        ya1 ya1 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            tvb tvb = ya1.c;
            this.a = 1;
            obj = ((eu3) tvb.b.getValue()).d();
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vk3 vk3 = (vk3) obj;
        xme xme = ya1.Z;
        do {
            value = xme.getValue();
            qa1 = (qa1) value;
            gd0 gd0 = new gd0(vk3.q(), ((Number) ya1.Y.getValue()).longValue());
            ya1.c.getClass();
            zd0 = new zd0(gd0, vk3.t(kl0.c));
            qcb = ya1.v;
        } while (!xme.b(value, qa1.a(qa1, zd0, !qcb.a().b(edb.h) ? aj8.v : aj8.b, !qcb.a().b(edb.l) ? aj8.v : aj8.b, false, (ngf) null, (ArrayList) null, (ngf) null, 120)));
        return Unit.INSTANCE;
    }
}
