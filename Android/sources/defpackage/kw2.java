package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequencesKt;

/* renamed from: kw2  reason: default package */
public final class kw2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ tw2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kw2(tw2 tw2, Continuation continuation) {
        super(2, continuation);
        this.b = tw2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        kw2 kw2 = new kw2(this.b, continuation);
        kw2.a = obj;
        return kw2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kw2) create((ss2) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ss2 ss2 = (ss2) this.a;
        if (tw2.j(this.b, ss2)) {
            jz9 a2 = xa8.a();
            for (Number longValue : SequencesKt.filterNotNull(SequencesKt.map(CollectionsKt.asSequence(ss2.a), new gl1(23)))) {
                a2.e(longValue.longValue());
            }
            va8 va8 = this.b.M0;
            long[] jArr = va8.b;
            long[] jArr2 = va8.a;
            int length = jArr2.length - 2;
            boolean z = false;
            if (length >= 0) {
                int i = 0;
                loop1:
                while (true) {
                    long j = jArr2[i];
                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        int i3 = 0;
                        while (true) {
                            if (i3 >= i2) {
                                if (i2 != 8) {
                                    break;
                                }
                            } else if ((255 & j) < 128 && (!a2.a(jArr[(i << 3) + i3]))) {
                                z = true;
                                break loop1;
                            } else {
                                j >>= 8;
                                i3++;
                            }
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            this.b.M0 = a2;
            if (!z) {
                Iterable iterable = (Iterable) this.b.H0.a.getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (a2.a(((rg5) it.next()).a)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } else {
                this.b.n();
            }
            tw2 tw2 = this.b;
            tw2.G0.setValue(tw2.F0.getValue());
        } else {
            this.b.M0 = xa8.a;
            this.b.G0.setValue(CollectionsKt.emptyList());
        }
        return Unit.INSTANCE;
    }
}
