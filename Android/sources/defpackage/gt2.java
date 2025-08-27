package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: gt2  reason: default package */
public final class gt2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ wt2 c;
    public final /* synthetic */ Ref.BooleanRef o;
    public final /* synthetic */ sn3 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gt2(Object obj, Continuation continuation, wt2 wt2, Ref.BooleanRef booleanRef, sn3 sn3) {
        super(2, continuation);
        this.b = obj;
        this.c = wt2;
        this.o = booleanRef;
        this.v = sn3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new gt2(this.b, continuation, this.c, this.o, this.v);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gt2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            wt2 wt2 = this.c;
            a32 a32 = (a32) ((my2) ((qx2) wt2.z.getValue())).o(((xk2) this.b).a).a.getValue();
            if (a32 == null) {
                return null;
            }
            ArrayList k = a32.k();
            if (!k.isEmpty()) {
                Iterator it = k.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (this.v.a.a(((vk3) it.next()).r())) {
                        this.a = 1;
                        r62 n = ((my2) ((qx2) wt2.z.getValue())).n();
                        ConcurrentHashMap concurrentHashMap = n.f;
                        long j = a32.a;
                        a32 a322 = (a32) concurrentHashMap.get(Long.valueOf(j));
                        if (a322 == null) {
                            a322 = n.G(j);
                        }
                        if (a322 != null) {
                            if (n.E(j) == null) {
                                ((uta) ((m95) n.o.get())).c(new IllegalArgumentException(wj6.i(j, "chat is null for #")), true);
                            } else {
                                o82 o82 = (o82) n.x.get();
                                o82.getClass();
                                long s = ((ltb) ((jtb) o82.c.getValue())).a.s();
                                a89 a89 = a322.o;
                                a89 a892 = a322.v;
                                a32 a2 = o82.a(a322.a, s, a322.b, a322.c, a89, a892);
                                a2.p0((km3) n.r.get());
                                n.p0((String) null, new w52(n, j, a2, true));
                            }
                        }
                        if (Unit.INSTANCE == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.o.element = true;
        return Unit.INSTANCE;
    }
}
