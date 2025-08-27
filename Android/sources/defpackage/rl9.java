package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: rl9  reason: default package */
public final class rl9 extends SuspendLambda implements Function2 {
    public gid a;
    public a32 b;
    public int c;
    public final /* synthetic */ en9 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rl9(en9 en9, Continuation continuation) {
        super(2, continuation);
        this.o = en9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new rl9(this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rl9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        gid gid;
        a32 a32;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            gid = ((hid) this.o.o1.getValue()).d;
            if (gid == null) {
                return Unit.INSTANCE;
            }
            a32 a322 = (a32) this.o.k1.a.getValue();
            if (a322 == null) {
                return Unit.INSTANCE;
            }
            xme xme = this.o.o1;
            hid a2 = hid.a((hid) xme.getValue(), 0, false, false, (gid) null, 7);
            xme.getClass();
            xme.m((Object) null, a2);
            long j = this.o.b.a;
            this.a = gid;
            this.b = a322;
            this.c = 1;
            r62 n = ((my2) ((qx2) ((ae9) this.o.P0.getValue()).b.getValue())).n();
            n.getClass();
            n.i(j, true, new v52(j, 0));
            n.m.c(new db2(j, 0L));
            Unit unit = Unit.INSTANCE;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (unit == coroutine_suspended) {
                return coroutine_suspended;
            }
            a32 = a322;
        } else if (i == 1) {
            a32 = this.b;
            gid = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xe8 xe8 = this.o.Y;
        long j2 = gid.a;
        String str = (String) xe8.b;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, wj6.i(j2, "Marking as read reaction for message="), (Throwable) null);
        }
        ((ysc) ((Lazy) xe8.c).getValue()).d(a32.b.a, a32.o(), j2, false, false, false, true);
        return Unit.INSTANCE;
    }
}
