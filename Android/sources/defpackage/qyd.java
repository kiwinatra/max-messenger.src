package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: qyd  reason: default package */
public final class qyd extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ wyd b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qyd(wyd wyd, Continuation continuation) {
        super(2, continuation);
        this.b = wyd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new qyd(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qyd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        s1e s1e;
        s1e s1e2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            wyd wyd = this.b;
            xme xme = wyd.z0;
            List createListBuilder = CollectionsKt.createListBuilder();
            vj5 vj5 = ((ltb) wyd.l()).e;
            vj5.getClass();
            boolean m = vj5.m(PmsKey.f35esiaenabled, false);
            ni3 ni3 = wyd.Z;
            if (m) {
                createListBuilder.add((List) ((Lazy) ni3.d).getValue());
            }
            createListBuilder.add((List) ((Lazy) ni3.a).getValue());
            createListBuilder.add((List) ((Lazy) ni3.f).getValue());
            createListBuilder.add((List) ((Lazy) ni3.c).getValue());
            createListBuilder.add((List) ((Lazy) ni3.e).getValue());
            wyd.b.getClass();
            cud cud = ((ltb) wyd.l()).b;
            Integer num = (Integer) ((om0) cud.j.getValue()).J();
            int intValue = num != null ? num.intValue() : cud.n();
            i94 i94 = i94.DISABLED;
            if (intValue == 3) {
                createListBuilder.add((List) ((Lazy) ni3.b).getValue());
            }
            Iterable flatten = CollectionsKt.flatten(CollectionsKt.build(createListBuilder));
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(flatten, 10));
            Iterator it = flatten.iterator();
            while (true) {
                y0e y0e = null;
                if (it.hasNext()) {
                    gyd gyd = (gyd) it.next();
                    boolean c = ((mbf) wyd.v.getValue()).c();
                    boolean z = ((z3e) wyd.x0.getValue()).g;
                    int ordinal = gyd.ordinal();
                    a1e a1e = a1e.a;
                    switch (ordinal) {
                        case 0:
                            igf igf = new igf(xza.h);
                            int i2 = cad.Q;
                            hnd[] hndArr = hnd.a;
                            s1e2 = new s1e(gyd.a, 1, igf, (h1e) null, (ngf) null, Integer.valueOf(i2), a1e, (y0e) null, (ngf) null, 0, 920);
                            break;
                        case 1:
                            igf igf2 = new igf(xza.b);
                            int i3 = cad.s0;
                            hnd[] hndArr2 = hnd.a;
                            s1e2 = new s1e(gyd.a, 1, igf2, (h1e) null, (ngf) null, Integer.valueOf(i3), a1e, (y0e) null, (ngf) null, 0, 920);
                            break;
                        case 2:
                            igf igf3 = new igf(xza.j);
                            int i4 = cad.w1;
                            hnd[] hndArr3 = hnd.a;
                            if (c) {
                                y0e = y0e.a;
                            }
                            s1e = new s1e(gyd.a, 1, igf3, (h1e) null, (ngf) null, Integer.valueOf(i4), a1e, y0e, (ngf) null, 0, 792);
                            continue;
                        case 3:
                            igf igf4 = new igf(xza.k);
                            int i5 = cad.j1;
                            hnd[] hndArr4 = hnd.a;
                            s1e2 = new s1e(gyd.a, 1, igf4, (h1e) null, (ngf) null, Integer.valueOf(i5), a1e, (y0e) null, (ngf) null, 0, 920);
                            break;
                        case 4:
                            igf igf5 = new igf(xza.i);
                            int i6 = cad.p1;
                            hnd[] hndArr5 = hnd.a;
                            s1e2 = new s1e(gyd.a, 1, igf5, (h1e) null, (ngf) null, Integer.valueOf(i6), a1e, (y0e) null, (ngf) null, 0, 920);
                            break;
                        case 5:
                            igf igf6 = new igf(qad.t2);
                            int i7 = cad.L;
                            hnd[] hndArr6 = hnd.a;
                            s1e2 = new s1e(gyd.a, 1, igf6, (h1e) null, (ngf) null, Integer.valueOf(i7), a1e, (y0e) null, (ngf) null, 0, 920);
                            break;
                        case 6:
                            igf igf7 = new igf(xza.c);
                            int i8 = cad.f;
                            hnd[] hndArr7 = hnd.a;
                            s1e2 = new s1e(gyd.a, 2, igf7, (h1e) null, (ngf) null, Integer.valueOf(i8), a1e, (y0e) null, (ngf) null, 0, 920);
                            break;
                        case 7:
                            igf igf8 = new igf(xza.l);
                            int i9 = cad.l1;
                            hnd[] hndArr8 = hnd.a;
                            s1e2 = new s1e(gyd.a, 2, igf8, (h1e) null, (ngf) null, Integer.valueOf(i9), a1e, (y0e) null, (ngf) null, 0, 920);
                            break;
                        case 8:
                            igf igf9 = new igf(xza.m);
                            int i10 = cad.V;
                            hnd[] hndArr9 = hnd.a;
                            s1e2 = new s1e(gyd.a, 3, igf9, (h1e) null, (ngf) null, Integer.valueOf(i10), a1e, (y0e) null, (ngf) null, 0, 920);
                            break;
                        case 9:
                            igf igf10 = new igf(xza.a);
                            int i11 = cad.e1;
                            hnd[] hndArr10 = hnd.a;
                            s1e2 = new s1e(gyd.a, 3, igf10, (h1e) null, (ngf) null, Integer.valueOf(i11), a1e, (y0e) null, (ngf) null, 0, 920);
                            break;
                        case 10:
                            igf igf11 = new igf(xza.d);
                            int i12 = cad.F1;
                            hnd[] hndArr11 = hnd.a;
                            s1e2 = new s1e(gyd.a, 4, igf11, (h1e) null, (ngf) null, Integer.valueOf(i12), a1e, (y0e) null, (ngf) null, 0, 920);
                            break;
                        case 11:
                            igf igf12 = z ? new igf(xza.e) : new igf(xza.g);
                            igf igf13 = z ? null : new igf(xza.f);
                            int i13 = cad.S;
                            hnd[] hndArr12 = hnd.a;
                            s1e = new s1e(gyd.a, 0, igf12, h1e.v, igf13, Integer.valueOf(i13), a1e, (y0e) null, (ngf) null, MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density), 384);
                            continue;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    s1e = s1e2;
                    arrayList.add(s1e);
                } else {
                    this.a = 1;
                    xme.getClass();
                    xme.m((Object) null, arrayList);
                    if (Unit.INSTANCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
