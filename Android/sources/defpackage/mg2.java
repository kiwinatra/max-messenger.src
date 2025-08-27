package defpackage;

import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: mg2  reason: default package */
public final class mg2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ m29 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mg2(Object obj, Continuation continuation, m29 m29, long j, long j2) {
        super(2, continuation);
        this.a = obj;
        this.b = m29;
        this.c = j;
        this.o = j2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new mg2(this.a, continuation, this.b, this.c, this.o);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mg2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        l20 l20 = (l20) this.a;
        g20 g20 = l20.a;
        int i = g20 == null ? -1 : lg2.$EnumSwitchMapping$0[g20.ordinal()];
        m29 m29 = this.b;
        if (i == 1) {
            x10 x10 = l20.b;
            if (x10 != null) {
                if (x10.y == m29.j()) {
                    return null;
                }
            }
            return t9a.h(l20, this.c, this.o, (Uri) null);
        } else if (i == 2) {
            k20 k20 = l20.d;
            if (k20 != null) {
                if (k20.a == m29.j()) {
                    return null;
                }
            }
            return t9a.h(l20, this.c, this.o, (Uri) null);
        } else if (i == 3) {
            c20 c20 = l20.g;
            if (c20 != null) {
                if (c20.a == m29.j()) {
                    return null;
                }
            }
            return t9a.h(l20, this.c, this.o, (Uri) null);
        } else if (i != 4) {
            return t9a.h(l20, this.c, this.o, (Uri) null);
        } else {
            s10 s10 = l20.j;
            if (s10 != null) {
                if (s10.a == m29.j()) {
                    return null;
                }
            }
            return t9a.h(l20, this.c, this.o, (Uri) null);
        }
    }
}
