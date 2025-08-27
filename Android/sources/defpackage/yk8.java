package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: yk8  reason: default package */
public final class yk8 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ il8 b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yk8(il8 il8, long j, Continuation continuation) {
        super(2, continuation);
        this.b = il8;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new yk8(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yk8) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        il8 il8 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            obj = ((to9) il8.c.getValue()).a(this.c, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ha9 ha9 = (ha9) obj;
        if (ha9 == null) {
            return Unit.INSTANCE;
        }
        CharSequence charSequence = il8.j(il8).f.j;
        ((h48) il8.o.getValue()).f.j = null;
        ArrayList e = il8.k().e();
        sqd k = il8.k();
        k.getClass();
        boolean z = false;
        int size = ha9.o() ? cjf.q((List) ha9.x0.b, new mqd(0)).size() : 0;
        CopyOnWriteArraySet copyOnWriteArraySet = k.a;
        if (size == copyOnWriteArraySet.size()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                uqd uqd = (uqd) it.next();
                boolean z2 = uqd.f;
                d48 d48 = uqd.a;
                if (!z2) {
                    if (d48 instanceof k00) {
                        break;
                    }
                }
                if (!dfb.b(uqd.c, d48)) {
                    if (!(d48 instanceof k00)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = true;
        xag.h(il8.Z, new pk8(charSequence, e, z));
        mj8 mj8 = new mj8(true);
        this.a = 2;
        if (il8.z.t(mj8, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
