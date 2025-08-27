package defpackage;

import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: yue  reason: default package */
public final class yue extends SuspendLambda implements Function2 {
    public final /* synthetic */ zue a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yue(zue zue, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.a = zue;
        this.b = j;
        this.c = i;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new yue(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yue) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        s0e s0e;
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zue zue = this.a;
        Iterator it = ((Iterable) zue.y.getValue()).iterator();
        while (true) {
            s0e = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            wmd wmd = (wmd) obj2;
            if ((wmd instanceof umd) && ((umd) wmd).a == this.b) {
                break;
            }
        }
        umd umd = obj2 instanceof umd ? (umd) obj2 : null;
        if (umd == null) {
            return Unit.INSTANCE;
        }
        int i = m1b.k;
        s85 s85 = zue.X;
        String str = umd.v;
        int i2 = this.c;
        if (i2 == i) {
            xag.h(s85, new o0e(str));
        } else if (i2 == m1b.l) {
            xag.h(s85, new p0e(str));
        } else if (i2 == m1b.i) {
            b59.k(zue.b, str);
            if (b59.C()) {
                s0e = new s0e(cad.v, new igf(n1b.g));
            }
            if (s0e != null) {
                xag.h(s85, s0e);
            }
        } else if (i2 == m1b.j) {
            zue.z0 = Long.valueOf(umd.a);
            xag.h(s85, new q0e(new igf(n1b.k), new igf(n1b.j), CollectionsKt.listOf(new pg3(m1b.b, new igf(n1b.h), og3.a), new pg3(m1b.a, new igf(n1b.i), og3.b))));
        }
        return Unit.INSTANCE;
    }
}
