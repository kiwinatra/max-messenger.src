package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* renamed from: rp3  reason: default package */
public final class rp3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ yp3 b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rp3(yp3 yp3, long j, Continuation continuation) {
        super(2, continuation);
        this.b = yp3;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new rp3(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rp3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ow3 ow3;
        List build;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            yk3 yk3 = (yk3) this.b.o.getValue();
            this.a = 1;
            long j = this.c;
            vk3 p = ((km3) yk3.a.getValue()).p(j, false);
            if (p == null) {
                build = CollectionsKt.emptyList();
            } else {
                a32 q = ((my2) ((qx2) yk3.b.getValue())).q(j);
                List createListBuilder = CollectionsKt.createListBuilder();
                boolean A = p.A();
                boolean x = p.x();
                if (!A && !x) {
                    createListBuilder.add(wk3.x);
                    createListBuilder.add(wk3.y);
                }
                createListBuilder.add(wk3.a);
                if (A) {
                    createListBuilder.add(wk3.b);
                } else {
                    createListBuilder.add(wk3.c);
                }
                createListBuilder.add(wk3.o);
                if (!x || q == null || q.h0()) {
                    createListBuilder.add(wk3.v);
                } else {
                    createListBuilder.add(wk3.z);
                }
                if (x) {
                    createListBuilder.add(wk3.w);
                }
                build = CollectionsKt.build(createListBuilder);
            }
            obj = build;
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Sequence<wk3> sortedWith = SequencesKt.sortedWith(SequencesKt.filterNot(SequencesKt.filterNot(CollectionsKt.asSequence((Iterable) obj), new of3(2)), new of3(3)), yp3.C0);
        ArrayList arrayList = new ArrayList();
        for (wk3 ordinal : sortedWith) {
            switch (ordinal.ordinal()) {
                case 0:
                    ow3 = new ow3(rra.d, (ngf) new igf(ead.U), Integer.valueOf(cad.G1), Integer.valueOf(jya.F), 4);
                    break;
                case 1:
                    ow3 = new ow3(rra.f, (ngf) new igf(ead.W), Integer.valueOf(cad.X1), Integer.valueOf(jya.F), 4);
                    break;
                case 2:
                    ow3 = new ow3(rra.i, (ngf) new igf(ead.Z), Integer.valueOf(cad.p1), Integer.valueOf(jya.F), 4);
                    break;
                case 3:
                    ow3 = new ow3(rra.e, (ngf) new igf(ead.V), Integer.valueOf(cad.c), Integer.valueOf(jya.F), 4);
                    break;
                case 4:
                    ow3 = new ow3(rra.b, (ngf) new igf(ead.S), Integer.valueOf(jya.I), Integer.valueOf(cad.T), Integer.valueOf(jya.E));
                    break;
                case 5:
                    ow3 = new ow3(rra.c, (ngf) new igf(ead.T), Integer.valueOf(jya.I), Integer.valueOf(cad.y), Integer.valueOf(jya.E));
                    break;
                case 6:
                    ow3 = new ow3(rra.a, (ngf) new igf(ead.R), Integer.valueOf(cad.B1), Integer.valueOf(jya.F), 4);
                    break;
                case 7:
                    ow3 = new ow3(rra.h, (ngf) new igf(ead.Y), Integer.valueOf(cad.m2), Integer.valueOf(jya.F), 4);
                    break;
                case 8:
                    ow3 = new ow3(rra.g, (ngf) new igf(ead.X), Integer.valueOf(jya.I), Integer.valueOf(cad.r1), Integer.valueOf(jya.E));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(ow3);
        }
        return arrayList;
    }
}
