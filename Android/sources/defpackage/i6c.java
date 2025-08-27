package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: i6c  reason: default package */
public final class i6c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ q40 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i6c(q40 q40, Continuation continuation) {
        super(2, continuation);
        this.b = q40;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        i6c i6c = new i6c(this.b, continuation);
        i6c.a = obj;
        return i6c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i6c) create((vk3) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        vk3 vk3 = (vk3) this.a;
        String d = vk3 != null ? vk3.d() : null;
        CharSequence q = vk3 != null ? vk3.q() : null;
        long r = vk3 != null ? vk3.r() : 0;
        boolean z = false;
        if (!(!(d == null || d.length() == 0))) {
            if (q == null || ((String) q).length() == 0) {
                z = true;
            }
            if (!(!z)) {
                obj2 = onb.a;
            } else if (q != null) {
                obj2 = new nnb(q, r);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else if (d != null) {
            obj2 = new qnb(d);
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        xme xme = (xme) this.b.o;
        xme.getClass();
        xme.m((Object) null, obj2);
        return Unit.INSTANCE;
    }
}
