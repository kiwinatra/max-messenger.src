package defpackage;

import android.text.SpannableStringBuilder;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.ranges.IntRange;
import ru.ok.messages.suggests.SuggestsViewModel;

/* renamed from: k2f  reason: default package */
public final class k2f extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ SuggestsViewModel b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k2f(SuggestsViewModel suggestsViewModel, Continuation continuation) {
        super(2, continuation);
        this.b = suggestsViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        k2f k2f = new k2f(this.b, continuation);
        k2f.a = obj;
        return k2f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k2f) create((SpannableStringBuilder) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.a;
        int i = SuggestsViewModel.I;
        SuggestsViewModel suggestsViewModel = this.b;
        suggestsViewModel.getClass();
        p1a p1a = suggestsViewModel.D;
        if (p1a == null) {
            p1a = null;
        }
        w1f w1f = new w1f(suggestsViewModel);
        s3a s3a = (s3a) p1a.a;
        s3a.X.setAccessibilityDelegate(new q3a(s3a, w1f));
        if (!(spannableStringBuilder == null || spannableStringBuilder.length() == 0)) {
            Class<xa9> cls = xa9.class;
            xa9[] xa9Arr = (xa9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cls);
            h69[] h69Arr = (h69[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), h69.class);
            if (!(xa9Arr.length == 0 && h69Arr.length == 0)) {
                p1a p1a2 = suggestsViewModel.D;
                if (p1a2 == null) {
                    p1a2 = null;
                }
                int X = p1a2.X();
                Iterator it = ArrayIteratorKt.iterator(xa9Arr);
                boolean z = false;
                while (it.hasNext()) {
                    xa9 xa9 = (xa9) it.next();
                    ta9 ta9 = xa9.a;
                    int i2 = ta9.d;
                    IntRange intRange = new IntRange(i2, ta9.e + i2);
                    int i3 = xa9.a.e;
                    int spanStart = spannableStringBuilder.getSpanStart(xa9);
                    int spanEnd = spannableStringBuilder.getSpanEnd(xa9);
                    int first = intRange.getFirst();
                    if (X <= intRange.getLast() && first <= X && spanEnd - spanStart != i3) {
                        spannableStringBuilder.removeSpan(xa9);
                        z = true;
                    }
                }
                Iterator it2 = ArrayIteratorKt.iterator(h69Arr);
                while (it2.hasNext()) {
                    h69 h69 = (h69) it2.next();
                    int spanStart2 = spannableStringBuilder.getSpanStart(h69);
                    int spanEnd2 = spannableStringBuilder.getSpanEnd(h69);
                    int i4 = h69.c;
                    IntRange intRange2 = h69.b;
                    int first2 = intRange2.getFirst();
                    if (X <= intRange2.getLast() && first2 <= X && spanEnd2 - spanStart2 != i4) {
                        xa9[] xa9Arr2 = (xa9[]) spannableStringBuilder.getSpans(spanStart2, spanEnd2, cls);
                        if (xa9Arr2 != null) {
                            for (xa9 removeSpan : xa9Arr2) {
                                spannableStringBuilder.removeSpan(removeSpan);
                            }
                        }
                        spannableStringBuilder.removeSpan(h69);
                        z = true;
                    }
                }
                if (z) {
                    aje aje = suggestsViewModel.y;
                    if (aje != null) {
                        aje.b((CancellationException) null);
                    }
                    suggestsViewModel.y = ev0.v(b0h.C(suggestsViewModel), ((osa) suggestsViewModel.d).c().plus(suggestsViewModel.x), (f14) null, new n2f(suggestsViewModel, spannableStringBuilder, (Continuation) null), 2);
                }
            }
        }
        String spannableStringBuilder2 = spannableStringBuilder != null ? spannableStringBuilder.toString() : null;
        if (spannableStringBuilder2 == null || spannableStringBuilder2.length() == 0) {
            suggestsViewModel.G = null;
            aje aje2 = suggestsViewModel.H;
            if (aje2 != null) {
                aje2.b((CancellationException) null);
            }
            suggestsViewModel.o(y1f.a);
        } else {
            suggestsViewModel.m(spannableStringBuilder2);
        }
        return Unit.INSTANCE;
    }
}
