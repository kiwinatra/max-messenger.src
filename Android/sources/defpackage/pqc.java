package defpackage;

import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import kotlin.sequences.SequencesKt;

/* renamed from: pqc  reason: default package */
public final class pqc extends ViewGroup {
    public static final /* synthetic */ KProperty[] z0 = {rae.s(pqc.class, "isStackFromEnd", "isStackFromEnd()Z", 0)};
    public Function1 a;
    public jqc b;
    public boolean c;
    public final bl o = new bl(this);
    public final ez9 v = new ez9();
    public final rz9 v0;
    public Function0 w = new mxb(15);
    public final int w0;
    public final TransitionSet x;
    public final nqc[] x0;
    public final rz9 y;
    public final oj4 y0;
    public final rz9 z;

    public pqc(Context context) {
        super(context);
        Delegates delegates = Delegates.INSTANCE;
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new drc(new oqc(this, 2)));
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.setOrdering(1);
        transitionSet.addListener(new m6(3, this));
        this.x = transitionSet;
        this.y = new rz9();
        this.z = new rz9();
        this.v0 = new rz9();
        int i = erc.a;
        this.w0 = i;
        nqc[] nqcArr = new nqc[i];
        for (int i2 = 0; i2 < i; i2++) {
            nqcArr[i2] = null;
        }
        this.x0 = nqcArr;
        this.y0 = new oj4(20);
    }

    public final void a(ced ced) {
        Object[] objArr = ced.b;
        long[] jArr = ced.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            View view = (View) objArr[(i << 3) + i3];
                            this.v.b(view.getId());
                            this.x.addTarget(view.getId());
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final int b(int i) {
        if (!((Boolean) this.o.getValue(this, z0[0])).booleanValue()) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            nqc nqc = (nqc) ArraysKt.getOrNull((T[]) this.x0, i);
            if (nqc == null) {
                break;
            }
            int measuredWidth = nqc.getMeasuredWidth() + (i2 == 0 ? 0 : MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density)) + i2;
            if (measuredWidth > getMeasuredWidth()) {
                break;
            }
            i++;
            i2 = measuredWidth;
        }
        return getMeasuredWidth() - i2;
    }

    public final void c() {
        this.y.b();
        this.z.b();
        this.v0.b();
    }

    public final void d() {
        jqc jqc = this.b;
        if (jqc != null) {
            rz9 rz9 = this.y;
            long j = 255;
            char c2 = 7;
            long j2 = -9187201950435737472L;
            if (rz9.d != 0) {
                Object[] objArr = rz9.b;
                long[] jArr = rz9.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j3 = jArr[i];
                        if ((((~j3) << c2) & j3 & j2) != j2) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            int i3 = 0;
                            while (i3 < i2) {
                                if ((j3 & j) < 128) {
                                    View view = (View) objArr[(i << 3) + i3];
                                    nqc nqc = view instanceof nqc ? (nqc) view : null;
                                    if (nqc != null) {
                                        g18 g18 = (g18) jqc;
                                        ((xj9) g18.b).z.invoke(Long.valueOf(((d99) ((hg9) g18.c)).H0), nqc.getReaction(), nqc);
                                    }
                                }
                                j3 >>= 8;
                                i3++;
                                j = 255;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                        j = 255;
                        c2 = 7;
                        j2 = -9187201950435737472L;
                    }
                }
            }
            rz9 rz92 = this.v0;
            if (rz92.d != 0) {
                Object[] objArr2 = rz92.b;
                long[] jArr2 = rz92.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j4 = jArr2[i4];
                        if ((((~j4) << 7) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length2)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j4 & 255) < 128) {
                                    View view2 = (View) objArr2[(i4 << 3) + i6];
                                    nqc nqc2 = view2 instanceof nqc ? (nqc) view2 : null;
                                    if (nqc2 != null) {
                                        g18 g182 = (g18) jqc;
                                        ((xj9) g182.b).z.invoke(Long.valueOf(((d99) ((hg9) g182.c)).H0), nqc2.getReaction(), nqc2);
                                    }
                                }
                                j4 >>= 8;
                            }
                            if (i5 != 8) {
                                return;
                            }
                        }
                        if (i4 != length2) {
                            i4++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void e() {
        TransitionSet transitionSet = this.x;
        ez9 ez9 = this.v;
        int[] iArr = ez9.b;
        long[] jArr = ez9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((j & 255) < 128) {
                            transitionSet.removeTarget(iArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        ez9.d = 0;
        long[] jArr2 = ez9.a;
        if (jArr2 != bed.a) {
            ArraysKt___ArraysJvmKt.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr3 = ez9.a;
            int i4 = ez9.c;
            int i5 = i4 >> 3;
            long j2 = 255 << ((i4 & 7) << 3);
            jArr3[i5] = j2 | (jArr3[i5] & (~j2));
        }
        ez9.e = bed.a(ez9.c) - ez9.d;
    }

    public final void f(xd9 xd9, boolean z2) {
        ws wsVar;
        List<wd9> list;
        xd9 xd92 = xd9;
        if (getChildCount() != 0 || (xd92 != null && !xd92.a.isEmpty())) {
            c();
            TransitionManager.endTransitions(this);
            rz9 rz9 = this.v0;
            rz9 rz92 = this.y;
            if (!(xd92 == null || (list = xd92.a) == null)) {
                for (wd9 wd9 : list) {
                    nqc nqc = (nqc) findViewById(wd9.a.b.a.toString().hashCode());
                    hqc hqc = null;
                    qqc qqc = xd92.c;
                    int i = wd9.b;
                    qqc qqc2 = wd9.a;
                    if (nqc == null) {
                        nqc nqc2 = new nqc(getContext());
                        nqc2.setId(qqc2.b.a.toString().hashCode());
                        hqc hqc2 = qqc2.b;
                        nqc2.setReaction(hqc2);
                        nqc2.setCount(i);
                        if (qqc != null) {
                            hqc = qqc.b;
                        }
                        nqc2.setOwn(Intrinsics.areEqual((Object) hqc2, (Object) hqc));
                        Function1 function1 = this.a;
                        if (function1 != null) {
                            nqc2.setOnChipClickListener(function1);
                        }
                        addView(nqc2);
                        rz92.a(nqc2);
                    } else {
                        hqc hqc3 = qqc2.b;
                        if (qqc != null) {
                            hqc = qqc.b;
                        }
                        nqc.setOwn(Intrinsics.areEqual((Object) hqc3, (Object) hqc));
                        nqc.setCount(i);
                        rz9.a(nqc);
                    }
                }
            }
            if (xd92 == null) {
                wsVar = new ws(0);
            } else {
                ws wsVar2 = new ws(0);
                for (wd9 wd92 : xd92.a) {
                    wsVar2.add(Integer.valueOf(wd92.a.b.a.toString().hashCode()));
                }
                wsVar = wsVar2;
            }
            int i2 = 0;
            while (true) {
                boolean z3 = i2 < getChildCount();
                rz9 rz93 = this.z;
                if (z3) {
                    int i3 = i2 + 1;
                    View childAt = getChildAt(i2);
                    if (childAt != null) {
                        if (!wsVar.contains(Integer.valueOf(childAt.getId()))) {
                            rz93.a(childAt);
                        }
                        i2 = i3;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                } else if (!z2) {
                    d();
                    Object[] objArr = rz93.b;
                    long[] jArr = rz93.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j = jArr[i4];
                            if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if ((j & 255) < 128) {
                                        removeView((View) objArr[(i4 << 3) + i6]);
                                    }
                                    j >>= 8;
                                }
                                if (i5 != 8) {
                                    break;
                                }
                            }
                            if (i4 == length) {
                                break;
                            }
                            i4++;
                        }
                    }
                    setVisibility(getChildCount() > 0 ? 0 : 8);
                    c();
                    return;
                } else if (rz93.d == 0 || rz92.d == 0) {
                    setVisibility(0);
                    a(rz93);
                    a(rz92);
                    Object[] objArr2 = rz92.b;
                    long[] jArr2 = rz92.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j2 = jArr2[i7];
                            if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                                int i8 = 8 - ((~(i7 - length2)) >>> 31);
                                for (int i9 = 0; i9 < i8; i9++) {
                                    if ((j2 & 255) < 128) {
                                        ((View) objArr2[(i7 << 3) + i9]).setVisibility(8);
                                    }
                                    j2 >>= 8;
                                }
                                if (i8 != 8) {
                                    break;
                                }
                            }
                            if (i7 == length2) {
                                break;
                            }
                            i7++;
                        }
                    }
                    this.w = new oqc(this, 0);
                    oqc oqc = new oqc(this, 1);
                    if (isLaidOut()) {
                        oqc.invoke();
                        return;
                    } else {
                        rcg.b(this, new vra(13, oqc, this));
                        return;
                    }
                } else {
                    a(rz9);
                    Object[] objArr3 = rz93.b;
                    long[] jArr3 = rz93.a;
                    int length3 = jArr3.length - 2;
                    if (length3 >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j3 = jArr3[i10];
                            if ((((~j3) << 7) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length3)) >>> 31);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((j3 & 255) < 128) {
                                        removeView((View) objArr3[(i10 << 3) + i12]);
                                    }
                                    j3 >>= 8;
                                }
                                if (i11 != 8) {
                                    break;
                                }
                            }
                            if (i10 == length3) {
                                break;
                            }
                            i10++;
                        }
                    }
                    Object[] objArr4 = rz92.b;
                    long[] jArr4 = rz92.a;
                    int length4 = jArr4.length - 2;
                    if (length4 >= 0) {
                        int i13 = 0;
                        while (true) {
                            long j4 = jArr4[i13];
                            if ((((~j4) << 7) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                                int i14 = 8 - ((~(i13 - length4)) >>> 31);
                                for (int i15 = 0; i15 < i14; i15++) {
                                    if ((j4 & 255) < 128) {
                                        ((View) objArr4[(i13 << 3) + i15]).setVisibility(0);
                                    }
                                    j4 >>= 8;
                                }
                                if (i14 != 8) {
                                    break;
                                }
                            }
                            if (i13 == length4) {
                                break;
                            }
                            i13++;
                        }
                    }
                    this.w = new oqc(this, 3);
                    TransitionManager.beginDelayedTransition(this, this.x);
                    requestLayout();
                    return;
                }
            }
        }
    }

    public final jqc getChipObserver() {
        return this.b;
    }

    public final Function1<hqc, Unit> getOnChipClickListener() {
        return this.a;
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            nqc nqc = (nqc) ArraysKt.getOrNull((T[]) this.x0, i8);
            if (nqc != null) {
                int b2 = i6 == 0 ? b(i8) : MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
                if (getMeasuredWidth() - i6 >= nqc.getMeasuredWidth() + b2) {
                    i5 = i6 + b2;
                    ev0.x(nqc, i5, i7, 0, 12);
                } else {
                    i5 = b(i8);
                    i7 += nqc.getMeasuredHeight() + MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
                    ev0.x(nqc, i5, i7, 0, 12);
                }
                i6 = i5 + nqc.getMeasuredWidth();
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.w0;
            objArr = this.x0;
            if (i4 >= i5) {
                break;
            }
            if (i4 < getChildCount()) {
                objArr[i4] = getChildAt(i4);
            } else {
                objArr[i4] = null;
            }
            i4++;
        }
        Arrays.sort(objArr, this.y0);
        int size = View.MeasureSpec.getMode(i) == 0 ? getContext().getResources().getDisplayMetrics().widthPixels : View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            nqc nqc = (nqc) ArraysKt.getOrNull((T[]) objArr, i9);
            if (nqc != null) {
                nqc.measure(i, i2);
                int measuredWidth = nqc.getMeasuredWidth() + i6 + (i6 == 0 ? 0 : MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density));
                if (measuredWidth > size) {
                    i7++;
                    i6 = nqc.getMeasuredWidth();
                } else {
                    i6 = measuredWidth;
                }
                i8 = Math.max(i8, i6);
            }
        }
        if (i6 == 0) {
            i7 = 0;
        }
        View view = (View) SequencesKt.firstOrNull(new mag(0, this));
        if (view != null) {
            i3 = view.getMeasuredHeight();
        }
        setMeasuredDimension(i8, (MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density) * i7) + ((i7 + 1) * i3));
    }

    public final void setChipObserver(jqc jqc) {
        this.b = jqc;
    }

    public final void setIncoming(boolean z2) {
        this.c = z2;
    }

    public final void setOnChipClickListener(Function1<? super hqc, Unit> function1) {
        this.a = function1;
    }

    public final void setStackFromEnd(boolean z2) {
        this.o.setValue(this, z0[0], Boolean.valueOf(z2));
    }
}
