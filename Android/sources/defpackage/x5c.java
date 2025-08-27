package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import kotlin.uuid.Uuid;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: x5c  reason: default package */
public final class x5c extends pae {
    public final w5c v;

    public x5c(ExecutorService executorService, w5c w5c) {
        super(executorService);
        this.v = w5c;
    }

    /* renamed from: L */
    public final void s(p6c p6c, int i) {
        z20 z20;
        t3c t3c = (t3c) ((lz7) E(i));
        w12 w12 = null;
        View.OnClickListener u5c = t3c instanceof a3c ? new u5c(this, 0) : t3c instanceof b3c ? new u5c(this, 1) : t3c instanceof f3c ? new u5c(this, 2) : t3c instanceof d3c ? new u5c(this, 3) : t3c instanceof e3c ? new u5c(this, 4) : t3c instanceof r3c ? new u5c(this, 5) : t3c instanceof q3c ? new u5c(this, 6) : t3c instanceof l3c ? new v5c((l3c) t3c, this) : t3c instanceof o3c ? new v5c(this, (o3c) t3c) : null;
        if (t3c instanceof r3c) {
            z20 = new z20(15, this);
        } else {
            if (t3c instanceof l3c) {
                ((l3c) t3c).getClass();
                k3c k3c = k3c.a;
            }
            z20 = null;
        }
        p6c.M(t3c);
        if ((t3c instanceof g3c) || (t3c instanceof n3c)) {
            p6c.Q(new zqa(11, (Object) this.v));
        } else if (t3c instanceof f3c) {
            if (p6c instanceof w12) {
                w12 = (w12) p6c;
            }
            if (w12 != null) {
                ((u12) w12.a).setOnShareLinkClickListener(new v12(0, (Function1) new jkb(9, (Object) this)));
            }
        }
        if (u5c != null) {
            p6c.R(u5c);
        }
        if (z20 != null) {
            p6c.S(z20);
        }
    }

    public final int l(int i) {
        return ((t3c) ((lz7) E(i))).i();
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        int i2 = i;
        int i3 = 536870911 & i2;
        if (hi7.l(i3, 1)) {
            iqa iqa = new iqa(viewGroup.getContext());
            p20 p20 = new p20(iqa, 7);
            iqa.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return p20;
        } else if (hi7.l(i3, 2)) {
            OneMeButton oneMeButton = new OneMeButton(viewGroup.getContext(), (AttributeSet) null);
            p20 p202 = new p20(oneMeButton, 6);
            oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return p202;
        } else if (hi7.l(i3, 4)) {
            return new p20(viewGroup.getContext());
        } else {
            if (hi7.l(i3, 65536)) {
                return new p20(new wr3(viewGroup.getContext()), 3);
            }
            if (hi7.l(i3, 8)) {
                return new p20(new fm2(viewGroup.getContext()), 1);
            }
            if (hi7.l(i3, 16)) {
                r1e r1e = new r1e(viewGroup.getContext(), (AttributeSet) null);
                p20 p203 = new p20(r1e, 8);
                r1e.setId(jxa.c1);
                return p203;
            } else if (hi7.l(i3, ConstantsKt.DEFAULT_BLOCK_SIZE)) {
                TextView textView = new TextView(viewGroup.getContext());
                p20 p204 = new p20(textView, 4);
                p204.P();
                textView.setId(jxa.z);
                textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                textView.setGravity(16);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                puf.k.b(textView, uy4.b);
                b0h.H(textView, new ra(3, (Continuation) null, 11));
                return p204;
            } else if (hi7.l(i3, 32)) {
                TextView textView2 = new TextView(viewGroup.getContext());
                p20 p205 = new p20(textView2, 5);
                p205.P();
                textView2.setId(jxa.T);
                textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                textView2.setTextAlignment(5);
                textView2.setMaxLines(1);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                puf.k.b(textView2, uy4.b);
                Drawable b = ew3.b(textView2.getContext(), cad.V1);
                float f = (float) 20;
                b.setBounds(0, 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
                textView2.setCompoundDrawablePadding(MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density));
                textView2.setCompoundDrawablesRelative((Drawable) null, (Drawable) null, b, (Drawable) null);
                b0h.H(textView2, new x2(b, (Continuation) null, 13));
                return p205;
            } else if (hi7.l(i3, 32768)) {
                return new pzc(new u12(viewGroup.getContext()));
            } else {
                if (hi7.l(i3, 64)) {
                    return new yb(viewGroup.getContext(), 0);
                }
                if (hi7.l(i3, 256)) {
                    r1e r1e2 = new r1e(viewGroup.getContext(), (AttributeSet) null);
                    p20 p206 = new p20(r1e2, 0);
                    r1e2.setModelItem(new s1e((long) 256, 0, new igf(lxa.i), (h1e) null, new igf(lxa.j), Integer.valueOf(cad.k1), a1e.a, (y0e) null, (ngf) null, 0, 776));
                    return p206;
                } else if (hi7.l(i3, Uuid.SIZE_BITS)) {
                    return new yb(viewGroup.getContext(), 1);
                } else {
                    if (hi7.l(i3, ConstantsKt.MINIMUM_BLOCK_SIZE)) {
                        ol3 ol3 = new ol3(viewGroup.getContext(), (AttributeSet) null);
                        p20 p207 = new p20(ol3, 2);
                        b0h.H(ol3, new f93(3, (Continuation) null, 0));
                        return p207;
                    } else if (hi7.l(i3, 2048)) {
                        return new yb(viewGroup.getContext(), 2);
                    } else {
                        if (hi7.l(i3, 1024)) {
                            e7e e7e = new e7e(viewGroup.getContext());
                            e7e.setShimmerBackground(d7e.a);
                            return new p20(e7e, 10);
                        }
                        throw new IllegalStateException(("unknown item view type " + i2 + "}").toString());
                    }
                }
            }
        }
    }
}
