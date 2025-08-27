package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: qw3  reason: default package */
public final class qw3 extends kbe {
    public final /* synthetic */ int D0 = 0;
    public final Object E0;
    public final Object F0;
    public Object G0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qw3(android.content.Context r4, defpackage.hb8 r5, java.util.concurrent.ExecutorService r6, defpackage.xte r7) {
        /*
            r3 = this;
            r0 = 2
            r3.D0 = r0
            wte r0 = new wte
            r0.<init>(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r2 = -2
            r4.<init>(r1, r2)
            r0.setLayoutParams(r4)
            r3.<init>(r0)
            r3.E0 = r0
            t56 r4 = new t56
            z3a r1 = new z3a
            r2 = 10
            r1.<init>(r2, r7)
            r4.<init>(r6, r1)
            r3.F0 = r4
            vra r6 = new vra
            r1 = 27
            r6.<init>(r1, r3, r7)
            r0.setHeaderClickAction(r6)
            androidx.recyclerview.widget.RecyclerView r3 = r0.b
            if (r5 == 0) goto L_0x003c
            xq7 r6 = new xq7
            r7 = 4
            r6.<init>(r7, r5)
            r3.k(r6)
        L_0x003c:
            r3.setAdapter(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qw3.<init>(android.content.Context, hb8, java.util.concurrent.ExecutorService, xte):void");
    }

    public final void M(lz7 lz7) {
        switch (this.D0) {
            case 0:
                if (lz7 instanceof pw3) {
                    ViewGroup viewGroup = (ViewGroup) this.G0;
                    if (viewGroup.getChildCount() <= 0) {
                        Context context = this.a.getContext();
                        Collection collection = ((pw3) lz7).a;
                        ((ekd) this.E0).getClass();
                        viewGroup.addView(ekd.e(context, collection, (Function1) this.F0));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (lz7 instanceof y29) {
                    y29 y29 = (y29) lz7;
                    this.G0 = y29;
                    long j = y29.a;
                    ol3 ol3 = (ol3) this.E0;
                    CharSequence charSequence = y29.b;
                    ol3.Y(j, charSequence, y29.o);
                    ol3.setName(charSequence);
                    hqc hqc = y29.y;
                    ((TextView) this.F0).setText(hqc != null ? hqc.a : null);
                    return;
                }
                return;
            default:
                if (lz7 instanceof mqe) {
                    mqe mqe = (mqe) lz7;
                    this.G0 = mqe;
                    int size = mqe.v.size();
                    wte wte = (wte) this.E0;
                    String format = String.format(wte.getContext().getResources().getQuantityString(gza.a, size), Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
                    CharSequence a = mqe.b.a(wte.getContext());
                    if (a == null) {
                        a = "";
                    }
                    boolean z = mqe.y;
                    int i = z ? hza.b : hza.a;
                    zpa zpa = z ? zpa.b : zpa.a;
                    yte yte = wte.a;
                    yte.a.setText(a);
                    yte.b.setText(format);
                    OneMeButton oneMeButton = yte.c;
                    oneMeButton.setText(i);
                    oneMeButton.setMode(zpa);
                    oneMeButton.setVisibility(0);
                    ((t56) this.F0).G(mqe.v);
                    return;
                }
                return;
        }
    }

    public void N(lz7 lz7, Object obj) {
        switch (this.D0) {
            case 1:
                if (!(obj instanceof x29)) {
                    M(lz7);
                    return;
                }
                hqc hqc = ((x29) obj).a;
                ((TextView) this.F0).setText(hqc != null ? hqc.a : null);
                return;
            default:
                super.N(lz7, obj);
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qw3(android.content.Context r2, defpackage.ekd r3, defpackage.v99 r4) {
        /*
            r1 = this;
            r0 = 0
            r1.D0 = r0
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r2)
            r1.<init>(r0)
            r1.E0 = r3
            r1.F0 = r4
            r1.G0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qw3.<init>(android.content.Context, ekd, v99):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qw3(android.content.Context r9, defpackage.hq7 r10) {
        /*
            r8 = this;
            r0 = 1
            r8.D0 = r0
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r9)
            bzc r1 = new bzc
            r2 = -1
            r3 = -2
            r1.<init>((int) r2, (int) r3)
            r0.setLayoutParams(r1)
            ol3 r1 = new ol3
            r4 = 0
            r1.<init>(r9, r4)
            int r4 = defpackage.cwa.G
            r1.setId(r4)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r6 = 16
            r5.<init>(r2, r3, r6)
            r1.setLayoutParams(r5)
            r2 = 24
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r3 = r3 * r2
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            r5 = 12
            float r5 = (float) r5
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            int r3 = defpackage.g63.b(r5, r6, r3)
            int r5 = r1.getPaddingTop()
            int r6 = r1.getPaddingBottom()
            r7 = 0
            r1.setPadding(r7, r5, r3, r6)
            r0.addView(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r9)
            int r9 = defpackage.cwa.H
            r1.setId(r9)
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r5 = 8388629(0x800015, float:1.1754973E-38)
            r3.<init>(r2, r2, r5)
            r1.setLayoutParams(r3)
            r2 = 17
            r1.setGravity(r2)
            r2 = 1
            r3 = 1098907648(0x41800000, float:16.0)
            r1.setTextSize(r2, r3)
            r0.addView(r1)
            r8.<init>(r0)
            android.view.View r1 = r0.findViewById(r4)
            ol3 r1 = (defpackage.ol3) r1
            r8.E0 = r1
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r8.F0 = r9
            h24 r9 = new h24
            r1 = 20
            r9.<init>((defpackage.kbe) r8, (kotlin.jvm.functions.Function1) r10, (int) r1)
            defpackage.ct.G(r0, 300, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qw3.<init>(android.content.Context, hq7):void");
    }
}
