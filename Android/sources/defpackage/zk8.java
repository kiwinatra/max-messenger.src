package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: zk8  reason: default package */
public final class zk8 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ il8 b;
    public final /* synthetic */ Long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zk8(il8 il8, Long l, Continuation continuation) {
        super(2, continuation);
        this.b = il8;
        this.c = l;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new zk8(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zk8) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long longValue = this.c.longValue();
            this.a = 1;
            obj = ((to9) this.b.c.getValue()).a(longValue, this);
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
        il8 il8 = this.b;
        KProperty[] kPropertyArr = il8.G0;
        sqd k = il8.k();
        k.getClass();
        if (ha9.o()) {
            int i2 = 0;
            while (true) {
                w28 w28 = ha9.x0;
                if (i2 >= w28.G()) {
                    break;
                }
                k00 h = t9a.h(w28.F(i2), ha9.z, ha9.c, (Uri) null);
                if (h != null) {
                    k.u(h);
                }
                i2++;
            }
        }
        ArrayList v = vzg.v(this.b.k());
        xme xme = this.b.v0;
        xme.getClass();
        xme.m((Object) null, v);
        this.b.X = v;
        ru0 ru0 = this.b.z;
        pj8 pj8 = pj8.a;
        this.a = 2;
        if (ru0.t(pj8, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
