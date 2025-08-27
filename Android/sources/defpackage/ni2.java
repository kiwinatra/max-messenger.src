package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: ni2  reason: default package */
public final class ni2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ aj2 a;
    public final /* synthetic */ int b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ni2(aj2 aj2, int i, Continuation continuation) {
        super(2, continuation);
        this.a = aj2;
        this.b = i;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ni2(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ni2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = aj2.b1;
        aj2 aj2 = this.a;
        hr8 r = aj2.r();
        if (r == null) {
            return Unit.INSTANCE;
        }
        int i = cra.l;
        s85 s85 = aj2.L0;
        int i2 = this.b;
        if (i2 == i) {
            boolean z = r instanceof yq8;
            xag.h(s85, new m85(r.m(), r.j(), r.v(), (!z || !((yq8) r).v) ? z ? sr4.v : sr4.c : sr4.x));
        } else if (i2 == cra.m) {
            boolean z2 = r instanceof yq8;
            xag.h(s85, new m85(r.m(), r.j(), r.v(), (!z2 || !((yq8) r).v) ? z2 ? sr4.o : sr4.b : sr4.w));
        } else {
            int i3 = cra.j;
            s85 s852 = aj2.M0;
            if (i2 == i3) {
                hh2 hh2 = hh2.b;
                long m = r.m();
                Long boxLong = Boxing.boxLong(r.j());
                hh2.getClass();
                xag.h(s852, hh2.n1(m, boxLong));
            } else if (i2 == cra.k) {
                hh2 hh22 = hh2.b;
                long m2 = r.m();
                hh22.getClass();
                a81.r(":chats?id=" + aj2.b + "&type=local&message_id=" + m2, s852);
            } else if (i2 == cra.c) {
                hh2 hh23 = hh2.b;
                long m3 = r.m();
                hh23.getClass();
                xag.h(s852, hh2.n1(m3, (Long) null));
            }
        }
        return Unit.INSTANCE;
    }
}
