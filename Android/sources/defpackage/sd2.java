package defpackage;

import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: sd2  reason: default package */
public final class sd2 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ x10 c;
    public final /* synthetic */ wd2 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sd2(x10 x10, wd2 wd2, Continuation continuation) {
        super(2, continuation);
        this.c = x10;
        this.o = wd2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        sd2 sd2 = new sd2(this.c, this.o, continuation);
        sd2.b = obj;
        return sd2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sd2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        d14 d14;
        Object obj2;
        String a2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        wd2 wd2 = this.o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 = (d14) this.b;
            x10 x10 = this.c;
            if (x10.v) {
                String str = x10.a;
                a2 = null;
                if (!cvg.A(str) && !cvg.A(str)) {
                    a2 = tr1.j(str, "&fn=legacy_44");
                }
            } else {
                a2 = x10.a();
            }
            String str2 = a2;
            vcd vcd = wd2.o;
            this.b = d14;
            this.a = 1;
            vcd.getClass();
            obj2 = ev0.I(vcd.b, new scd(vcd, str2, x10.v, false, (Continuation) null), this);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            d14 = (d14) this.b;
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Uri uri = (Uri) obj2;
        ld2 ld2 = (ld2) wd2.x0.getAndUpdate(new md2(0));
        if (!e14.f(d14)) {
            return Unit.INSTANCE;
        }
        n6e n6e = wd2.X;
        if (uri != null && ld2 != null) {
            n6e.d(new xr4(uri, ld2.d));
        } else if (uri == null && ld2 != null) {
            n6e.d(new wr4(wd2.n(ld2.d, false)));
        }
        return Unit.INSTANCE;
    }
}
