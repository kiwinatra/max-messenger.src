package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.method.LinkMovementMethod;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.math.MathKt;
import kotlin.sequences.SequencesKt;
import kotlin.uuid.Uuid;
import one.me.messages.list.loader.MessageModel;

/* renamed from: xj9  reason: default package */
public final class xj9 extends pae implements ck9 {
    public final cg7 X;
    public final t89 v;
    public final Function1 w;
    public final wy6 x;
    public final rt6 y;
    public final Function3 z;

    public xj9(ExecutorService executorService, pn9 pn9, hq7 hq7, xy6 xy6, rt6 rt6, ir0 ir0, td8 td8) {
        super(executorService);
        this.v = pn9;
        this.w = hq7;
        this.x = xy6;
        this.y = rt6;
        this.z = ir0;
        this.X = td8;
    }

    /* renamed from: K */
    public final void z(kbe kbe) {
        kbe.O();
        vy6 vy6 = kbe instanceof vy6 ? (vy6) kbe : null;
        if (vy6 != null) {
            xy6 xy6 = (xy6) this.x;
            xy6.getClass();
            ((d99) vy6).T();
            xy6.b.remove(vy6);
        }
    }

    public final int L(long j) {
        int h = CollectionsKt__CollectionsKt.binarySearch$default(b(), 0, 0, (Function1) new hg2(j, 3), 3, (Object) null);
        if (h < 0) {
            h = Math.abs(h) - 1;
        }
        li7 li7 = (li7) CollectionsKt.getOrNull(O(), h);
        return li7 != null ? (int) (li7.a & 4294967295L) : ((ov) this.o).f.size();
    }

    public final MessageModel N(int i) {
        lz7 I = I(i);
        if (I instanceof MessageModel) {
            return (MessageModel) I;
        }
        return null;
    }

    public final List O() {
        return SequencesKt.toList(SequencesKt___SequencesKt.mapIndexed(SequencesKt.filter(SequencesKt.withIndex(CollectionsKt.asSequence(((ov) this.o).f)), new wg7(24)), new ui0(13)));
    }

    public final List b() {
        Iterable<li7> O = O();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(O, 10));
        for (li7 li7 : O) {
            arrayList.add((MessageModel) ((ov) this.o).f.get((int) (li7.a & 4294967295L)));
        }
        return arrayList;
    }

    public final int g(long j) {
        int h = CollectionsKt__CollectionsKt.binarySearch$default(b(), 0, 0, (Function1) new hg2(j, 4), 3, (Object) null);
        if (h >= 0) {
            return (int) (((li7) O().get(h)).a & 4294967295L);
        }
        return -1;
    }

    public final void t(pzc pzc, int i, List list) {
        kbe kbe = (kbe) pzc;
        lz7 lz7 = (lz7) E(i);
        if (kbe instanceof hg9) {
            MessageModel messageModel = (MessageModel) lz7;
            hg9 hg9 = (hg9) kbe;
            boolean z2 = hg9 instanceof d99;
            d99 d99 = null;
            d99 d992 = z2 ? (d99) hg9 : null;
            if (d992 != null) {
                t89 t89 = this.v;
                a99 a99 = new a99(t89, d992);
                View view = d992.a;
                ct.G(view, 300, a99);
                View view2 = d992.G0;
                if (view2 instanceof t99) {
                    GestureDetector gestureDetector = new GestureDetector(((v89) view).getContext(), new t53(d992, new b99(d992, t89)));
                    gestureDetector.setIsLongpressEnabled(true);
                    view2.setOnTouchListener(new pg6(gestureDetector, 3));
                    view2.setOnClickListener((View.OnClickListener) null);
                } else {
                    view2.setOnTouchListener((View.OnTouchListener) null);
                    ct.G(view2, 300, new a99(d992, t89));
                }
                tsc tsc = view2 instanceof tsc ? (tsc) view2 : null;
                if (tsc != null) {
                    tsc.setOnClickListener(new b99(t89, d992));
                }
                yb1 yb1 = new yb1(11, t89, d992);
                view2.setOnLongClickListener(yb1);
                ((v89) view).setOnLongClickListener(yb1);
                tc9 tc9 = view2 instanceof tc9 ? (tc9) view2 : null;
                if (tc9 != null) {
                    tc9.setReplyClickListener(new zw(25, (Object) t89));
                    tc9.setForwardClickListener(new hq7(4, (Object) t89));
                }
                c99 c99 = new c99(t89, d992);
                wff wff = view2 instanceof wff ? (wff) view2 : null;
                if (wff != null) {
                    wff.setTextMessageLinkClickListener(c99);
                }
                iy7 iy7 = view2 instanceof iy7 ? (iy7) view2 : null;
                if (iy7 != null) {
                    iy7.setOnLinkLongClickListener(new g18(19, t89, d992));
                }
            }
            qx3 qx3 = hg9 instanceof qx3 ? (qx3) hg9 : null;
            if (qx3 != null) {
                qx3.G0 = this.y;
            }
            d99 d993 = z2 ? (d99) hg9 : null;
            View view3 = d993 != null ? d993.G0 : null;
            tsc tsc2 = view3 instanceof tsc ? (tsc) view3 : null;
            if (tsc2 != null) {
                tsc2.setChipObserver(new g18(24, this, hg9));
            }
            hg9.P(messageModel, list);
            vy6 vy6 = hg9 instanceof vy6 ? (vy6) hg9 : null;
            if (vy6 != null) {
                wy6 wy6 = this.x;
                xy6 xy6 = (xy6) wy6;
                xy6.b.add(vy6);
                if (xy6.c) {
                    xy6.c = !((d99) vy6).a0(xy6.d, new zw(21, (Object) xy6));
                }
                ((d99) ((vy6) hg9)).a0(xy6.d, new zw(26, (Object) wy6));
            }
            if (z2) {
                d99 = (d99) hg9;
            }
            if (d99 != null) {
                Lazy lazy = d99.L0;
                if (lazy.isInitialized()) {
                    ((dg7) lazy.getValue()).setClickListener(this.X);
                }
            }
        } else if (kbe instanceof w72) {
            ((w72) kbe).M((x72) lz7);
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        pzc x50;
        if (i == cwa.e) {
            u72 u72 = new u72(viewGroup.getContext());
            pzc pzc = new pzc(u72);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            int roundToInt = MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density);
            marginLayoutParams.setMargins(roundToInt, roundToInt, roundToInt, roundToInt);
            u72.setLayoutParams(marginLayoutParams);
            return pzc;
        }
        int i2 = -2013265921 & i;
        if ((i & 256) != 0) {
            Context context = viewGroup.getContext();
            return new x50(context, new oc1(context), 2);
        } else if (ig9.a(i2, 0)) {
            TextView textView = new TextView(viewGroup.getContext());
            hg9 hg9 = new hg9(textView);
            textView.setMaxWidth(MathKt.roundToInt(((float) 276) * vo4.c().getDisplayMetrics().density));
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            float f = (float) 24;
            marginLayoutParams2.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
            marginLayoutParams2.setMarginEnd(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
            textView.setGravity(17);
            textView.setLayoutParams(marginLayoutParams2);
            ogf ogf = puf.a;
            tr2.f.b(textView, uy4.b);
            textView.setTextAlignment(4);
            textView.setGravity(17);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            float f2 = (float) 12;
            float f3 = (float) 4;
            textView.setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float f4 = vo4.c().getDisplayMetrics().density * 12.0f;
            float[] fArr = new float[8];
            for (int i3 = 0; i3 < 8; i3++) {
                fArr[i3] = f4;
            }
            gradientDrawable.setCornerRadii(fArr);
            textView.setBackground(gradientDrawable);
            return hg9;
        } else {
            boolean z2 = (i & 16) != 0;
            Function1 function1 = this.w;
            if (z2) {
                Context context2 = viewGroup.getContext();
                x50 = new x50(context2, new zq3(context2, (hq7) function1), 3);
            } else if ((i & 64) != 0) {
                Context context3 = viewGroup.getContext();
                return new x50(context3, new wp6(context3), 5);
            } else if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                Context context4 = viewGroup.getContext();
                x50 = new x50(context4, new a6e(context4, (hq7) function1), 6);
            } else if ((i & 32) != 0) {
                Context context5 = viewGroup.getContext();
                return new x50(context5, new zm5(context5), 4);
            } else if (!ig9.c(i2) && (i & 2) != 0 && !ig9.b(i2)) {
                x50 = new w43(viewGroup.getContext(), (hq7) function1, 2);
            } else if (ig9.c(i2) && (2 & i) != 0 && !ig9.b(i2)) {
                x50 = new w43(viewGroup.getContext(), (hq7) function1, 3);
            } else if (!ig9.c(i2) && ig9.b(i2)) {
                x50 = new w43(viewGroup.getContext(), (hq7) function1, 0);
            } else if (ig9.c(i2) && ig9.b(i2)) {
                x50 = new w43(viewGroup.getContext(), (hq7) function1, 1);
            } else if (!ig9.c(i2) && (i & 4) != 0 && !ig9.b(i2)) {
                Context context6 = viewGroup.getContext();
                return new x50(context6, new hde(context6), 10);
            } else if (ig9.c(i2) && (i & 4) != 0 && !ig9.b(i2)) {
                Context context7 = viewGroup.getContext();
                return new x50(context7, new jde(context7), 9);
            } else if (ig9.c(i2)) {
                return new x50(viewGroup.getContext());
            } else {
                if ((i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                    Context context8 = viewGroup.getContext();
                    return new x50(context8, new cn0(context8), 1);
                } else if ((i & Uuid.SIZE_BITS) != 0) {
                    return new x50(viewGroup.getContext(), new epe(viewGroup.getContext(), new rb8(viewGroup.getContext(), 1)), 7);
                } else {
                    if ((i & 16384) != 0) {
                        return new x50(viewGroup.getContext(), new epe(viewGroup.getContext(), new rb8(viewGroup.getContext(), 0)), 7);
                    }
                    if ((i & 8) != 0) {
                        Context context9 = viewGroup.getContext();
                        x50 = new x50(context9, new q50(context9, (hq7) function1), 0);
                    } else if ((33554432 & i) != 0) {
                        return new x50(viewGroup.getContext());
                    } else {
                        String e = ig9.e(i2);
                        String binaryString = Integer.toBinaryString(i);
                        throw new IllegalStateException(("unsupported view type=" + e + " binary=" + binaryString).toString());
                    }
                }
            }
            return x50;
        }
    }
}
