package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: m73  reason: default package */
public final class m73 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ t73 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m73(t73 t73, Continuation continuation) {
        super(2, continuation);
        this.c = t73;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        m73 m73 = new m73(this.c, continuation);
        m73.b = obj;
        return m73;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m73) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Throwable th;
        d14 d14;
        xme xme;
        Object value;
        z73 z73;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d142 = (d14) this.b;
            KProperty[] kPropertyArr = t73.m;
            t73 t73 = this.c;
            j83 j83 = (j83) t73.h.getValue();
            z73 z732 = j83 instanceof z73 ? (z73) j83 : null;
            Long l = z732 != null ? z732.c : null;
            do {
                xme = t73.h;
                value = xme.getValue();
                j83 j832 = (j83) value;
                j832.getClass();
                if (j832 instanceof z73) {
                    z73 z733 = (z73) j832;
                    List list = z733.a;
                    if (!(CollectionsKt.lastOrNull(list) instanceof d83)) {
                        list = CollectionsKt.plus(list, d83.a);
                    }
                    z73 = z73.a(z733, list, 6);
                } else {
                    z73 = new z73((Long) null, CollectionsKt.listOf(d83.a), false);
                }
            } while (!xme.b(value, z73));
            try {
                np2 np2 = new np2(t73.g, l);
                this.b = d142;
                this.a = 1;
                Object T = ((jna) ((rl) t73.d.getValue())).T(np2, this);
                if (T == coroutine_suspended) {
                    return coroutine_suspended;
                }
                d14 d143 = d142;
                obj = T;
                d14 = d143;
            } catch (Throwable th2) {
                d14 d144 = d142;
                th = th2;
                d14 = d144;
                if (th instanceof CancellationException) {
                    return null;
                }
                z68.f(d14.getClass().getName(), "request error!", th);
                return null;
            }
        } else if (i == 1) {
            d14 = (d14) this.b;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return (op2) obj;
    }
}
