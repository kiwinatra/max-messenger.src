package one.me.messages.list.ui.recycler;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lone/me/messages/list/ui/recycler/MessagesLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "lj9", "mj9", "message-list_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMessagesLayoutManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessagesLayoutManager.kt\none/me/messages/list/ui/recycler/MessagesLayoutManager\n+ 2 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,304:1\n842#2,2:305\n845#2,4:321\n849#2:331\n237#3,7:307\n248#3,3:315\n251#3,2:319\n254#3,6:325\n267#3,4:332\n237#3,7:336\n248#3,3:344\n251#3,2:348\n272#3,2:350\n254#3,6:352\n274#3:358\n267#3,4:361\n237#3,7:365\n248#3,3:373\n251#3,2:377\n272#3,2:379\n254#3,6:381\n274#3:387\n267#3,4:388\n237#3,7:392\n248#3,3:400\n251#3,2:404\n272#3,2:406\n254#3,6:408\n274#3:414\n267#3,4:415\n237#3,7:419\n248#3,3:427\n251#3,2:431\n272#3,2:433\n254#3,6:435\n274#3:441\n267#3,4:442\n237#3,7:446\n248#3,3:454\n251#3,2:458\n272#3,2:460\n254#3,6:462\n274#3:468\n267#3,4:469\n237#3,7:473\n248#3,3:481\n251#3,2:485\n272#3,2:487\n254#3,6:489\n274#3:495\n267#3,4:496\n237#3,7:500\n248#3,3:508\n251#3,2:512\n272#3,2:514\n254#3,6:516\n274#3:522\n1826#4:314\n1688#4:318\n1826#4:343\n1688#4:347\n1826#4:372\n1688#4:376\n1826#4:399\n1688#4:403\n1826#4:426\n1688#4:430\n1826#4:453\n1688#4:457\n1826#4:480\n1688#4:484\n1826#4:507\n1688#4:511\n1#5:359\n24#6:360\n24#6:523\n*S KotlinDebug\n*F\n+ 1 MessagesLayoutManager.kt\none/me/messages/list/ui/recycler/MessagesLayoutManager\n*L\n42#1:305,2\n42#1:321,4\n42#1:331\n42#1:307,7\n42#1:315,3\n42#1:319,2\n42#1:325,6\n69#1:332,4\n69#1:336,7\n69#1:344,3\n69#1:348,2\n69#1:350,2\n69#1:352,6\n69#1:358\n131#1:361,4\n131#1:365,7\n131#1:373,3\n131#1:377,2\n131#1:379,2\n131#1:381,6\n131#1:387\n136#1:388,4\n136#1:392,7\n136#1:400,3\n136#1:404,2\n136#1:406,2\n136#1:408,6\n136#1:414\n141#1:415,4\n141#1:419,7\n141#1:427,3\n141#1:431,2\n141#1:433,2\n141#1:435,6\n141#1:441\n146#1:442,4\n146#1:446,7\n146#1:454,3\n146#1:458,2\n146#1:460,2\n146#1:462,6\n146#1:468\n156#1:469,4\n156#1:473,7\n156#1:481,3\n156#1:485,2\n156#1:487,2\n156#1:489,6\n156#1:495\n161#1:496,4\n161#1:500,7\n161#1:508,3\n161#1:512,2\n161#1:514,2\n161#1:516,6\n161#1:522\n42#1:314\n42#1:318\n69#1:343\n69#1:347\n131#1:372\n131#1:376\n136#1:399\n136#1:403\n141#1:426\n141#1:430\n146#1:453\n146#1:457\n156#1:480\n156#1:484\n161#1:507\n161#1:511\n104#1:360\n120#1:523\n*E\n"})
public final class MessagesLayoutManager extends LinearLayoutManager {
    public final float E = 2.0f;
    public boolean F;
    public RecyclerView G;
    public final Rect H = new Rect();
    public final rz9 I;

    public MessagesLayoutManager() {
        super(1, false);
        int i = ded.a;
        this.I = new rz9();
        o1(true);
        this.h = false;
    }

    public final void H0(RecyclerView recyclerView, int i) {
        int V0 = V0();
        int X0 = X0();
        int i2 = -1;
        if (V0 == -1 || X0 == -1) {
            x0(i);
            return;
        }
        boolean z = true;
        if (V0 > i || i > X0) {
            if ((X0 + V0) / 2 <= i) {
                i2 = 1;
            }
            if (i >= V0) {
                V0 = X0;
            }
            if (Math.abs(V0 - i) > 10) {
                m1(i, MathKt.roundToInt(((float) i2) * this.E * ((float) recyclerView.getHeight())));
            }
        }
        Context context = recyclerView.getContext();
        int V02 = V0();
        boolean z2 = V02 == X0();
        boolean z3 = G() - 1 == i;
        boolean z4 = V02 == i;
        if ((!z2 || !z3 || !z4) && !this.F) {
            z = false;
        }
        I0(new lj9(i, context, z));
    }

    public final void S(View view, int i, int i2, int i3, int i4) {
        pzc U;
        RecyclerView recyclerView = this.G;
        if (recyclerView != null && (U = recyclerView.U(view)) != null) {
            boolean z = U instanceof w72;
            if (ig9.a(U.w, 0) || z) {
                int i5 = i3 - i;
                int width = ((recyclerView.getWidth() - i5) / 2) + recyclerView.getLeft();
                super.S(view, width, i2, width + i5, i4);
                return;
            }
            super.S(view, i, i2, i3, i4);
        }
    }

    public final void W(RecyclerView recyclerView) {
        this.G = recyclerView;
    }

    public final void X(RecyclerView recyclerView) {
        this.G = null;
        this.H.setEmpty();
    }

    public final void d0(int i, int i2) {
        rz9 rz9 = this.I;
        Object[] objArr = rz9.b;
        long[] jArr = rz9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            ((mj9) objArr[(i3 << 3) + i5]).a();
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return;
                    }
                }
                if (i3 != length) {
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void e0() {
        rz9 rz9 = this.I;
        Object[] objArr = rz9.b;
        long[] jArr = rz9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ((mj9) objArr[(i << 3) + i3]).a();
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

    public final void f0(int i, int i2) {
        rz9 rz9 = this.I;
        Object[] objArr = rz9.b;
        long[] jArr = rz9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            ((mj9) objArr[(i3 << 3) + i5]).a();
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return;
                    }
                }
                if (i3 != length) {
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void g0(int i, int i2) {
        rz9 rz9 = this.I;
        Object[] objArr = rz9.b;
        long[] jArr = rz9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            ((mj9) objArr[(i3 << 3) + i5]).a();
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return;
                    }
                }
                if (i3 != length) {
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void h0(int i) {
        rz9 rz9 = this.I;
        Object[] objArr = rz9.b;
        long[] jArr = rz9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            ((mj9) objArr[(i2 << 3) + i4]).a();
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void i0(RecyclerView recyclerView, int i, int i2) {
        h0(i);
        rz9 rz9 = this.I;
        Object[] objArr = rz9.b;
        long[] jArr = rz9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            ((mj9) objArr[(i3 << 3) + i5]).a();
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return;
                    }
                }
                if (i3 != length) {
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void k0(lzc lzc) {
        super.k0(lzc);
        if (V0() != -1 && X0() != -1) {
            rz9 rz9 = this.I;
            Object[] objArr = rz9.b;
            long[] jArr = rz9.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ((mj9) objArr[(i << 3) + i3]).b();
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
    }

    public final void s1(mj9 mj9) {
        rz9 rz9 = this.I;
        Object[] objArr = rz9.b;
        long[] jArr = rz9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (Intrinsics.areEqual((Object) ((mj9) objArr[i4]).getTag(), (Object) mj9.getTag())) {
                                rz9.g(i4);
                            }
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
        rz9.a(mj9);
    }

    public final void x0(int i) {
        View r = r(i);
        if (r == null) {
            super.x0(i);
            RecyclerView recyclerView = this.G;
            if (recyclerView != null) {
                qma qma = new qma(recyclerView, true, new of5((Object) this, i, 3));
                ViewTreeObserver viewTreeObserver = recyclerView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnPreDrawListener(qma);
                }
                recyclerView.addOnAttachStateChangeListener(qma);
            }
        } else if (this.F) {
            Rect rect = this.H;
            RecyclerView.W(rect, r);
            RecyclerView recyclerView2 = this.G;
            m1(i, RangesKt.coerceAtLeast((recyclerView2 != null ? recyclerView2.getHeight() : 0) - rect.height(), 0));
        } else {
            m1(i, MathKt.roundToInt(((float) 30) * vo4.c().getDisplayMetrics().density));
        }
    }
}
