package defpackage;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t0f  reason: default package */
public final class t0f extends SuspendLambda implements Function2 {
    public g0f a;
    public int b;
    public final /* synthetic */ v0f c;
    public final /* synthetic */ String o;
    public final /* synthetic */ int v;
    public final /* synthetic */ l72 w;
    public final /* synthetic */ b33 x;
    public final /* synthetic */ l15 y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t0f(v0f v0f, String str, int i, l72 l72, b33 b33, l15 l15, Continuation continuation) {
        super(2, continuation);
        this.c = v0f;
        this.o = str;
        this.v = i;
        this.w = l72;
        this.x = b33;
        this.y = l15;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new t0f(this.c, this.o, this.v, this.w, this.x, this.y, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t0f) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        g0f g0f;
        xme xme;
        Object value;
        a32 a32;
        Object value2;
        Object value3;
        Object value4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        v0f v0f = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = v0f.B0.a;
            String str2 = this.o;
            if (!Intrinsics.areEqual((Object) str, (Object) str2)) {
                v0f.B0 = v1f.g;
            }
            ome ome = v0f.b;
            a32 a322 = (a32) ome.getValue();
            boolean z = false;
            if (a322 != null && a322.J()) {
                z = true;
            }
            g0f s = p3a.s(str2, this.v, this.w);
            g0f g0f2 = g0f.v;
            xme xme2 = v0f.C0;
            if (s == g0f2) {
                do {
                    value4 = xme2.getValue();
                    h0f h0f = (h0f) value4;
                } while (!xme2.b(value4, (Object) null));
                return Unit.INSTANCE;
            } else if (z && (s == g0f.a || s == g0f.b)) {
                do {
                    value3 = xme2.getValue();
                    h0f h0f2 = (h0f) value3;
                } while (!xme2.b(value3, (Object) null));
                return Unit.INSTANCE;
            } else if (s != g0f.c || ((a32 = (a32) ome.getValue()) != null && a32.o0())) {
                v1f v1f = v0f.B0;
                this.a = s;
                this.b = 1;
                b33 b33 = this.x;
                obj = ev0.I(((osa) ((gaf) b33.b)).a(), new e0f(v1f, this.o, this.v, b33, (Continuation) null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                g0f = s;
            } else {
                do {
                    value2 = xme2.getValue();
                    h0f h0f3 = (h0f) value2;
                } while (!xme2.b(value2, (Object) null));
                return Unit.INSTANCE;
            }
        } else if (i == 1) {
            g0f = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        v1f v1f2 = (v1f) obj;
        v0f.B0 = v1f2;
        ArrayList C = this.y.C(v1f2.d);
        do {
            xme = v0f.C0;
            value = xme.getValue();
            h0f h0f4 = (h0f) value;
        } while (!xme.b(value, new h0f(g0f, C)));
        return Unit.INSTANCE;
    }
}
