package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import kotlin.Function;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* renamed from: lue  reason: default package */
public final class lue extends pae {
    public final /* synthetic */ int v = 0;
    public final Function1 w;
    public final Object x;
    public final Function y;

    public lue(ExecutorService executorService, zqc zqc, jkb jkb, ifb ifb) {
        super(executorService);
        this.x = zqc;
        this.w = jkb;
        this.y = ifb;
    }

    public final void J(kbe kbe, int i) {
        switch (this.v) {
            case 0:
                super.s(kbe, i);
                if (kbe instanceof ymd) {
                    ((ymd) kbe).e(this.w);
                }
                if (kbe instanceof hqe) {
                    hqe hqe = (hqe) kbe;
                    Function1 function1 = (Function1) this.y;
                    hqe.K0 = function1;
                    hqe.G0.setOnTouchListener(new ke1(hqe, function1));
                    Function1 function12 = (Function1) this.x;
                    hqe.J0 = function12;
                    View view = hqe.a;
                    if (function12 != null) {
                        view.setOnLongClickListener(new yb1(13, hqe, function12));
                        return;
                    } else {
                        view.setOnLongClickListener((View.OnLongClickListener) null);
                        return;
                    }
                } else {
                    return;
                }
            default:
                lz7 lz7 = (lz7) E(i);
                yqc yqc = null;
                xqc xqc = lz7 instanceof xqc ? (xqc) lz7 : null;
                if (xqc != null) {
                    if (kbe instanceof yqc) {
                        yqc = (yqc) kbe;
                    }
                    if (yqc != null) {
                        yqc.M(xqc);
                        ct.G(yqc.a, 300, new kqc(this.w, (Object) xqc, 1));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public long k(int i) {
        switch (this.v) {
            case 1:
                return ((lz7) E(i)).getItemId();
            default:
                return super.k(i);
        }
    }

    public int l(int i) {
        switch (this.v) {
            case 1:
                return ((lz7) E(i)).i();
            default:
                return super.l(i);
        }
    }

    public final /* bridge */ /* synthetic */ void s(pzc pzc, int i) {
        switch (this.v) {
            case 0:
                J((kbe) pzc, i);
                return;
            default:
                J((kbe) pzc, i);
                return;
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        switch (this.v) {
            case 0:
                if (i == m1b.g) {
                    return new pzc(new r1e(viewGroup.getContext(), (AttributeSet) null));
                }
                if (i == m1b.m) {
                    return new kue(viewGroup.getContext());
                }
                if (i == m1b.h) {
                    return new kue(viewGroup.getContext());
                }
                if (i == m1b.s) {
                    TextView textView = new TextView(viewGroup.getContext());
                    float f = (float) 16;
                    textView.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), textView.getPaddingTop(), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), textView.getPaddingBottom());
                    puf.t.b(textView, uy4.b);
                    b0h.H(textView, new ra(3, (Continuation) null, 26));
                    return new b61(textView, 14);
                } else if (i == m1b.r) {
                    return new hqe(viewGroup.getContext());
                } else {
                    String name = lue.class.getName();
                    a67 a67 = z68.b;
                    if (a67 != null && a67.c()) {
                        a67.d(w78.w, name, wj6.h(i, "unknown item viewType: "), (Throwable) null);
                    }
                    return new b61(new View(viewGroup.getContext()), 15);
                }
            default:
                int i2 = gad.a;
                zqc zqc = (zqc) this.x;
                if (i != i2) {
                    return new yqc(viewGroup.getContext(), zqc);
                }
                Context context = viewGroup.getContext();
                ifb ifb = new ifb(11, this);
                ImageView imageView = new ImageView(context);
                int roundToInt = MathKt.roundToInt(((float) zqc.a()) * vo4.c().getDisplayMetrics().density);
                imageView.setLayoutParams(new bzc(roundToInt, roundToInt));
                ct.G(imageView, 300, new e7(19, ifb));
                b0h.H(imageView, new kh7(roundToInt, (Continuation) null, 1));
                return new b61(imageView, 7);
        }
    }

    public lue(ExecutorService executorService, oue oue, oue oue2, oue oue3) {
        super(executorService);
        this.w = oue;
        this.x = oue2;
        this.y = oue3;
    }
}
