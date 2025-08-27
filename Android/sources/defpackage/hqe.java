package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.jvm.functions.Function1;

/* renamed from: hqe  reason: default package */
public final class hqe extends kbe implements ymd, pu4 {
    public static final ShapeDrawable L0;
    public final SimpleDraweeView D0;
    public final TextView E0;
    public final TextView F0;
    public final View G0;
    public wmd H0;
    public Function1 I0;
    public Function1 J0;
    public Function1 K0;

    static {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float f = vo4.c().getDisplayMetrics().density * 16.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        L0 = shapeDrawable;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hqe(android.content.Context r11) {
        /*
            r10 = this;
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            android.widget.FrameLayout r3 = new android.widget.FrameLayout
            r3.<init>(r11)
            r3.setLayoutParams(r0)
            r11 = 14
            float r11 = (float) r11
            android.content.res.Resources r0 = defpackage.vo4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r11 = r11 * r0
            int r11 = kotlin.math.MathKt.roundToInt((float) r11)
            r0 = 12
            float r0 = (float) r0
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r0 = r0 * r4
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)
            r3.setPadding(r0, r11, r0, r11)
            com.facebook.drawee.view.SimpleDraweeView r11 = new com.facebook.drawee.view.SimpleDraweeView
            android.content.Context r0 = r3.getContext()
            r11.<init>(r0)
            r0 = 40
            float r0 = (float) r0
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r0
            int r4 = kotlin.math.MathKt.roundToInt((float) r4)
            int r5 = defpackage.m1b.o
            r11.setId(r5)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.<init>(r4, r4, r7)
            r11.setLayoutParams(r6)
            lv4 r4 = r11.getHierarchy()
            sp6 r4 = (defpackage.sp6) r4
            ydd r6 = defpackage.ydd.n
            r4.h(r6)
            r3.addView(r11)
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            r4 = 16
            r11.<init>(r1, r2, r4)
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)
            r1 = 10
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            int r0 = defpackage.g63.b(r1, r2, r0)
            r11.leftMargin = r0
            r0 = 24
            float r0 = (float) r0
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r0
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            int r1 = defpackage.g63.b(r1, r4, r2)
            r11.rightMargin = r1
            android.content.Context r1 = r3.getContext()
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r1)
            r2.setLayoutParams(r11)
            r11 = 1
            r2.setOrientation(r11)
            android.widget.TextView r11 = new android.widget.TextView
            android.content.Context r1 = r2.getContext()
            r11.<init>(r1)
            int r1 = defpackage.m1b.q
            r11.setId(r1)
            ogf r4 = defpackage.puf.j
            r4.b(r11, defpackage.uy4.b)
            r2.addView(r11)
            android.widget.TextView r4 = new android.widget.TextView
            android.content.Context r6 = r2.getContext()
            r4.<init>(r6)
            int r6 = defpackage.m1b.p
            r4.setId(r6)
            ogf r7 = defpackage.puf.o
            r7.b(r4, defpackage.uy4.b)
            r2.addView(r4)
            m96 r7 = new m96
            r8 = 0
            r9 = 2
            r7.<init>(r11, r4, r8, r9)
            defpackage.b0h.H(r2, r7)
            r3.addView(r2)
            androidx.appcompat.widget.AppCompatImageView r11 = new androidx.appcompat.widget.AppCompatImageView
            android.content.Context r2 = r3.getContext()
            r11.<init>(r2, r8)
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)
            int r2 = defpackage.m1b.n
            r11.setId(r2)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r7 = 8388629(0x800015, float:1.1754973E-38)
            r4.<init>(r0, r0, r7)
            r11.setLayoutParams(r4)
            int r0 = defpackage.l1b.a
            r11.setImageResource(r0)
            qrb r0 = new qrb
            r4 = 3
            r7 = 13
            r0.<init>((int) r4, (kotlin.coroutines.Continuation) r8, (int) r7)
            defpackage.b0h.H(r11, r0)
            r3.addView(r11)
            sn2 r11 = new sn2
            r0 = 6
            r11.<init>(r4, r8, r0)
            defpackage.b0h.H(r3, r11)
            r10.<init>(r3)
            android.view.View r11 = r3.findViewById(r5)
            com.facebook.drawee.view.SimpleDraweeView r11 = (com.facebook.drawee.view.SimpleDraweeView) r11
            r10.D0 = r11
            android.view.View r11 = r3.findViewById(r1)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r10.E0 = r11
            android.view.View r11 = r3.findViewById(r6)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r10.F0 = r11
            android.view.View r11 = r3.findViewById(r2)
            r10.G0 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hqe.<init>(android.content.Context):void");
    }

    public final void M(lz7 lz7) {
        if (lz7 instanceof umd) {
            this.H0 = (wmd) lz7;
            umd umd = (umd) lz7;
            this.D0.setImageURI(umd.b);
            this.E0.setText(umd.c);
            this.F0.setText(umd.o);
        }
    }

    public final void e(Function1 function1) {
        this.I0 = function1;
        View view = this.a;
        if (function1 != null) {
            ct.G(view, 300, new kqc(16, (Object) this, (Object) function1));
        } else {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }
}
