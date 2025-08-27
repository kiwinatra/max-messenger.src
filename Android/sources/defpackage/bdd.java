package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: bdd  reason: default package */
public final class bdd extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ cdd b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;
    public final /* synthetic */ String v;
    public final /* synthetic */ long w;
    public final /* synthetic */ boolean x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bdd(cdd cdd, long j, long j2, String str, long j3, boolean z, Continuation continuation) {
        super(2, continuation);
        this.b = cdd;
        this.c = j;
        this.o = j2;
        this.v = str;
        this.w = j3;
        this.x = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new bdd(this.b, this.c, this.o, this.v, this.w, this.x, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bdd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.b.a;
            long j2 = this.o;
            String str2 = this.v;
            long j3 = this.w;
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                w78 w78 = w78.o;
                StringBuilder k = i2a.k("Save new position:", j2, " for video:", str2);
                k.append(" in msg:");
                k.append(j3);
                a67.d(w78, str, k.toString(), (Throwable) null);
            }
            long j4 = this.c;
            if (j4 == 0) {
                return Unit.INSTANCE;
            }
            long j5 = this.o;
            if (j5 >= j4) {
                String str3 = this.b.a;
                a67 a672 = z68.b;
                if (a672 != null && a672.c()) {
                    a672.d(w78.o, str3, wj6.m(tr1.n(j5, "Can't save this startTime:", " because it's more or equals with duration:"), j4, ". Reset initPos."), (Throwable) null);
                }
                j = 0;
            } else {
                j = j5;
            }
            String str4 = this.v;
            ((i4g) this.b.c.getValue()).getClass();
            g4g a2 = i4g.a(str4);
            if (a2 != null) {
                z68.c(this.b.a, "Save new position. VideoContent in cache exist", new Object[0]);
                String str5 = this.v;
                g4g a3 = a2.a(j);
                ((i4g) this.b.c.getValue()).getClass();
                i4g.a.put(str5, new h4g(a3, System.currentTimeMillis()));
            }
            to9 to9 = (to9) this.b.b.getValue();
            long j6 = this.w;
            String str6 = this.v;
            add add = new add(j, this.c, this.x);
            this.a = 1;
            to9.getClass();
            to9.a.n(j6, new g18(25, str6, add));
            if (Unit.INSTANCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
