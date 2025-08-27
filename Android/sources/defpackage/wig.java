package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: wig  reason: default package */
public final class wig extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ hjg b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wig(hjg hjg, Continuation continuation) {
        super(2, continuation);
        this.b = hjg;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wig(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wig) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        n22 n22;
        Long l;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        Long l2 = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            hjg hjg = this.b;
            er6 er6 = hjg.z;
            long j = hjg.b;
            Long l3 = hjg.o;
            if (l3 != null) {
                a32 a32 = (a32) ((my2) ((qx2) hjg.Y.getValue())).o(l3.longValue()).a.getValue();
                Long valueOf = a32 != null ? Long.valueOf(a32.b.a) : null;
                if (valueOf != null && valueOf.longValue() == 0) {
                    valueOf = null;
                }
                l = valueOf;
            } else {
                l = null;
            }
            String str = this.b.v;
            this.a = 1;
            obj = er6.a(j, l, str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xq9 xq9 = (xq9) obj;
        if (xq9 == null) {
            this.b.y.a((String) null, new Exception(wj6.j(this.b.b, "Root url for ", " not found")));
            hjg hjg2 = this.b;
            hjg2.getClass();
            h7b h7b = h7b.o;
            xme xme = hjg2.B0;
            xme.getClass();
            xme.m((Object) null, h7b);
            return Unit.INSTANCE;
        }
        this.b.G0 = xq9.c;
        hjg hjg3 = this.b;
        String str2 = xq9.b;
        hjg3.getClass();
        xag.h(hjg3.I0, new kig(str2));
        this.b.E0.setValue(xq9.a);
        hjg hjg4 = this.b;
        long j2 = hjg4.b;
        String str3 = xq9.a;
        kfg kfg = hjg4.c;
        if (kfg == kfg.FOLDER) {
            k16 k16 = k16.a;
            k16 k162 = k16.a;
            n22 = new n22(5, 2L);
        } else {
            n22 n222 = qfg.c;
            Long l4 = hjg4.o;
            if (l4 != null) {
                a32 a322 = (a32) ((my2) ((qx2) hjg4.Y.getValue())).o(l4.longValue()).a.getValue();
                if (a322 != null) {
                    if (a322.J()) {
                        vk3 m = a322.m();
                        if (m != null) {
                            l2 = Long.valueOf(m.r());
                        }
                        if (l2 != null) {
                            n222 = new ofg(l2.longValue());
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else if (a322.N()) {
                        vk3 m2 = a322.m();
                        if (m2 != null) {
                            l2 = Long.valueOf(m2.r());
                        }
                        if (l2 != null) {
                            n222 = new pfg(l2.longValue());
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        boolean K = a322.K();
                        m72 m72 = a322.b;
                        n222 = K ? new mfg(m72.a) : new nfg(m72.a);
                    }
                }
            }
            n22 = n222;
        }
        tfg tfg = new tfg(j2, str3, kfg, n22);
        sfg sfg = (sfg) hjg4.v0.getValue();
        sfg.getClass();
        sfg.a(lfg.OPEN, j2, str3, kfg, n22, (String) null);
        for (xo7 d : (List) hjg4.A0.c) {
            d.d(tfg);
        }
        hjg4.y0 = tfg;
        return Unit.INSTANCE;
    }
}
