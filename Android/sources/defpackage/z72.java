package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: z72  reason: default package */
public final class z72 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ m82 b;
    public final /* synthetic */ int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z72(int i, m82 m82, Continuation continuation) {
        super(2, continuation);
        this.b = m82;
        this.c = i;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new z72(this.c, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((z72) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        g0c g0c;
        g0c g0c2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.a) {
            case 0:
                ResultKt.throwOnFailure(obj);
                m82 m82 = this.b;
                nz4 nz4 = (nz4) m82.j.getValue();
                igf igf = null;
                String str = nz4 != null ? nz4.d : null;
                if (str == null) {
                    str = "";
                }
                a32 p = m82.p();
                boolean z = false;
                boolean z2 = p != null && p.d();
                int i = fxa.r;
                n6e n6e = m82.e;
                int i2 = this.c;
                if (i2 == i) {
                    zz4 c2 = m82.c();
                    a32 p2 = m82.p();
                    if (p2 != null && p2.d()) {
                        z = true;
                    }
                    c2.getClass();
                    kgf kgf = new kgf(ixa.R, ArraysKt.toList((T[]) new Object[]{str}));
                    if (z) {
                        igf = new igf(ixa.P);
                    }
                    List createListBuilder = CollectionsKt.createListBuilder();
                    if (z) {
                        createListBuilder.add(new pg3(fxa.A, new igf(ixa.r0), og3.a));
                    }
                    createListBuilder.add(new pg3(fxa.u, z ? new igf(ixa.Q) : new igf(ixa.L), og3.a));
                    createListBuilder.add(new pg3(fxa.s, new igf(ixa.M), og3.b));
                    Unit unit = Unit.INSTANCE;
                    g0c g0c3 = new g0c(kgf, igf, CollectionsKt.build(createListBuilder));
                    this.a = 1;
                    if (n6e.a(g0c3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 == fxa.k) {
                    m82.c().getClass();
                    g0c g0c4 = new g0c(new kgf(ixa.D, ArraysKt.toList((T[]) new Object[]{str})), (ngf) null, CollectionsKt.listOf(new pg3(fxa.m, new igf(ixa.B), og3.c), new pg3(fxa.l, new igf(ixa.C), og3.b)));
                    this.a = 2;
                    if (n6e.a(g0c4, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 == fxa.z) {
                    if (z2) {
                        m82.c().getClass();
                        g0c2 = new g0c(new igf(ixa.t0), new kgf(ixa.s0, ArraysKt.toList((T[]) new Object[]{str})), CollectionsKt.listOf(new pg3(fxa.A, new igf(ixa.r0), og3.a), new pg3(fxa.B, new igf(ixa.q0), og3.b)));
                    } else {
                        m82.c().getClass();
                        g0c2 = new g0c(new igf(ixa.t0), new kgf(ixa.s0, ArraysKt.toList((T[]) new Object[]{str})), CollectionsKt.listOf(new pg3(fxa.C, new igf(ixa.p0), og3.a), new pg3(fxa.B, new igf(ixa.q0), og3.b)));
                    }
                    this.a = 3;
                    if (n6e.a(g0c2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 == fxa.n) {
                    zz4 c3 = m82.c();
                    a32 p3 = m82.p();
                    if (p3 != null && p3.d()) {
                        z = true;
                    }
                    c3.getClass();
                    kgf kgf2 = new kgf(ixa.K, ArraysKt.toList((T[]) new Object[]{str}));
                    if (z) {
                        igf = new igf(ixa.I);
                    }
                    List createListBuilder2 = CollectionsKt.createListBuilder();
                    if (z) {
                        createListBuilder2.add(new pg3(fxa.w, new igf(ixa.m0), og3.a));
                    }
                    createListBuilder2.add(new pg3(fxa.q, z ? new igf(ixa.J) : new igf(ixa.E), og3.a));
                    createListBuilder2.add(new pg3(fxa.o, new igf(ixa.F), og3.b));
                    Unit unit2 = Unit.INSTANCE;
                    g0c g0c5 = new g0c(kgf2, igf, CollectionsKt.build(createListBuilder2));
                    this.a = 4;
                    if (n6e.a(g0c5, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 == fxa.v) {
                    if (z2) {
                        m82.c().getClass();
                        g0c = new g0c(new igf(ixa.o0), new kgf(ixa.n0, ArraysKt.toList((T[]) new Object[]{str})), CollectionsKt.listOf(new pg3(fxa.w, new igf(ixa.m0), og3.a), new pg3(fxa.x, new igf(ixa.l0), og3.b)));
                    } else {
                        m82.c().getClass();
                        g0c = new g0c(new igf(ixa.o0), new kgf(ixa.n0, ArraysKt.toList((T[]) new Object[]{str})), CollectionsKt.listOf(new pg3(fxa.y, new igf(ixa.k0), og3.a), new pg3(fxa.x, new igf(ixa.l0), og3.b)));
                    }
                    this.a = 5;
                    if (n6e.a(g0c, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 == fxa.h) {
                    m82.c().getClass();
                    g0c g0c6 = new g0c(new kgf(ixa.A, ArraysKt.toList((T[]) new Object[]{str})), new igf(ixa.z), CollectionsKt.listOf(new pg3(fxa.j, new igf(ixa.x), og3.a), new pg3(fxa.i, new igf(ixa.y), og3.b)));
                    this.a = 6;
                    if (n6e.a(g0c6, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    int i3 = fxa.E;
                    long j = m82.o;
                    if (i2 == i3) {
                        vzb.b.getClass();
                        pa4 pa4 = new pa4(":profile/member_permissions?id=" + j);
                        this.a = 7;
                        if (n6e.a(pa4, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i2 == fxa.g) {
                        xzb xzb = new xzb(j, gzb.LOCAL_CHAT);
                        this.a = 8;
                        if (n6e.a(xzb, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i2 == fxa.h0) {
                        a0c a0c = new a0c(j);
                        this.a = 9;
                        if (n6e.a(a0c, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i2 == fxa.D) {
                        vzb.b.getClass();
                        pa4 pa42 = new pa4(":profile/change-owner?chat_id=" + j + "&leave_chat=false");
                        this.a = 10;
                        if (n6e.a(pa42, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                ResultKt.throwOnFailure(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
