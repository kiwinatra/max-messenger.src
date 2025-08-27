package defpackage;

import android.content.Context;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: vh2  reason: default package */
public final class vh2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ aj2 b;
    public final /* synthetic */ Lazy c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vh2(aj2 aj2, Lazy lazy, Continuation continuation) {
        super(2, continuation);
        this.b = aj2;
        this.c = lazy;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new vh2(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vh2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            aj2 aj2 = this.b;
            to9 to9 = aj2.y;
            long j = aj2.o;
            this.a = 1;
            obj2 = to9.a(j, this);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ha9 ha9 = (ha9) obj2;
        if (ha9 == null) {
            return Unit.INSTANCE;
        }
        if (!this.b.w || !ha9.A()) {
            long j2 = ha9.o;
            aj2 aj22 = this.b;
            Boxing.boxLong(j2);
            aj22.getClass();
            qx2 q = this.b.q();
            long j3 = this.b.b;
            r62 n = ((my2) q).n();
            os8 os8 = (os8) ((tz9) MapsKt__MapsKt.getOrPut(n.F, Long.valueOf(j3), new r52(0))).getValue();
            aj2 aj23 = this.b;
            aj23.G0.updateAndGet(new uh2(aj23, os8, ha9));
            String str = this.b.Z;
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                w78 w78 = w78.o;
                a67.d(w78, str, "Media viewer. Create loader with initialTime:" + j2 + ", saved markers:" + os8, (Throwable) null);
            }
            aj2 aj24 = this.b;
            aj2 aj25 = this.b;
            long j4 = aj25.b;
            long j5 = aj25.o;
            Set set = aj25.F0;
            q4 q4Var = ((tc2) this.c.getValue()).a;
            Lazy h = q4Var.h(qx2.class);
            Lazy h2 = q4Var.h(to9.class);
            Lazy h3 = q4Var.h(fa9.class);
            Lazy h4 = q4Var.h(esb.class);
            Class<msa> cls = msa.class;
            Lazy h5 = q4Var.h(cls);
            aj2 aj26 = aj25;
            Class<msa> cls2 = cls;
            aj2 aj27 = aj24;
            Context context = (Context) q4Var.g(Context.class);
            gaf gaf = (gaf) q4Var.g(gaf.class);
            long j6 = j4;
            Lazy h6 = q4Var.h(eu3.class);
            long j7 = j4;
            long j8 = j2;
            long j9 = j2;
            q4 q4Var2 = q4Var;
            t70 t70 = new t70(h, j6, j5, j8, set);
            kn5 kn5 = new kn5(wj6.i(j7, "MediaLoader#"), (byte) 0);
            pp0 pp0 = new pp0(h, q4Var2.h(cls2), q4Var2.h(m95.class), h2, gaf, j7, set);
            vf2 vf2 = new vf2(h, h3, q4Var2.h(x23.class), q4Var2.h(rl.class), pp0, j7, set, aj26);
            Lazy lazy = LazyKt.lazy(new sc2(context, q4Var2, 1));
            Lazy lazy2 = LazyKt.lazy(new sc2(context, q4Var2, 0));
            gaf gaf2 = gaf;
            cj9 cj9 = new cj9(j7, (sv0) q4Var2.g(sv0.class), gaf2);
            esa esa = new esa(lazy, lazy2, h4, h6);
            gx gxVar = new gx(h, h2, h5, q4Var2.h(mq6.class), j7, gaf2, kn5, cj9, lazy, lazy2, (s04) q4Var2.g(s04.class), esa, t70, pp0, vf2, (xe3) q4Var2.g(xe3.class), 100, 100);
            aj2 aj28 = this.b;
            aj28.getClass();
            bs0.K(bs0.F(new ps5(new vi2(gxVar.B, aj28, 1), new zi2(aj28, (Continuation) null), 5), ((osa) aj28.z).b()), aj28.a);
            qx2 q2 = aj28.q();
            long j10 = aj28.b;
            r62 n2 = ((my2) q2).n();
            bs0.K(bs0.F(new ps5(new vi2(new etc((tz9) MapsKt__MapsKt.getOrPut(n2.F, Long.valueOf(j10), new r52(0))), aj28, 0), new wi2(aj28, (Continuation) null), 5), ((osa) aj28.z).a()), aj28.a);
            z68.c(aj28.Z, "Media viewer. Start load around", new Object[0]);
            gxVar.r(j9);
            aj27.D0 = gxVar;
            return Unit.INSTANCE;
        }
        aj2 aj29 = this.b;
        this.a = 2;
        if (aj2.m(aj29, ha9, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
