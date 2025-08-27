package defpackage;

import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: dn9  reason: default package */
public final class dn9 extends SuspendLambda implements Function2 {
    public hqc a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ a32 o;
    public final /* synthetic */ en9 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dn9(a32 a32, en9 en9, Continuation continuation) {
        super(2, continuation);
        this.o = a32;
        this.v = en9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        dn9 dn9 = new dn9(this.o, this.v, continuation);
        dn9.c = obj;
        return dn9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dn9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        hqc hqc;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d14 = (d14) this.c;
            a32 a32 = this.o;
            if (a32.w0 == null) {
                eq2 eq2 = a32.z0;
                String str = a32.b.m0;
                eq2.getClass();
                a32.w0 = cvg.A(str) ? null : ((yd9) eq2.f.get()).b(str);
            }
            hqc hqc2 = a32.w0;
            if (hqc2 == null) {
                return Unit.INSTANCE;
            }
            hr6 hr6 = this.v.X;
            a32 a322 = this.o;
            long j = a322.a;
            long j2 = a322.b.l0;
            this.c = d14;
            this.a = hqc2;
            this.b = 1;
            obj2 = ev0.I(((osa) ((gaf) hr6.a)).b(), new gr6(hr6, j, j2, (Continuation) null), this);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            hqc = hqc2;
        } else if (i == 1) {
            hqc hqc3 = this.a;
            d14 d142 = (d14) this.c;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
            hqc = hqc3;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ha9 ha9 = (ha9) obj2;
        if (ha9 == null) {
            String str2 = this.v.z0;
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                a67.d(w78.x, str2, "Chat model has reaction info, but can't find message for this reaction", (Throwable) null);
            }
            return Unit.INSTANCE;
        }
        Set of = SetsKt.setOf(hqc);
        en9 en9 = this.v;
        long j3 = ha9.b;
        KProperty[] kPropertyArr = en9.A1;
        en9.getClass();
        if (!of.isEmpty()) {
            hqc hqc4 = (hqc) CollectionsKt.first(of);
            hi g = ((gk) en9.W0.getValue()).g(hqc4.a.toString());
            String str3 = g != null ? g.d : null;
            if (str3 != null) {
                xag.h(en9.q1, new xa(j3, hqc4, str3));
            }
        }
        xme xme = this.v.o1;
        hid a2 = hid.a((hid) xme.getValue(), 0, false, false, new gid(this.o.b.l0, ha9.m(), hqc), 7);
        xme.getClass();
        xme.m((Object) null, a2);
        return Unit.INSTANCE;
    }
}
