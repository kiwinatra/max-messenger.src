package defpackage;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Lazy;

/* renamed from: up5  reason: default package */
public final class up5 extends y0c {
    public final AppCompatEditText D0;
    public final Lazy E0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public up5(android.content.Context r12) {
        /*
            r11 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r12)
            r11.<init>(r0)
            androidx.appcompat.widget.AppCompatEditText r1 = new androidx.appcompat.widget.AppCompatEditText
            r2 = 0
            r1.<init>(r12, r2)
            int r3 = defpackage.hhc.profile_edit_first_name_field
            r1.setId(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r5 = -2
            r3.<init>(r4, r5)
            r1.setLayoutParams(r3)
            r3 = 12
            float r3 = (float) r3
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r3
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            r7 = 16
            float r8 = (float) r7
            android.content.res.Resources r9 = defpackage.vo4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r9 = r9 * r8
            int r9 = kotlin.math.MathKt.roundToInt((float) r9)
            android.content.res.Resources r10 = defpackage.vo4.c()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r3 = r3 * r10
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            android.content.res.Resources r10 = defpackage.vo4.c()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r10 = r10 * r8
            int r10 = kotlin.math.MathKt.roundToInt((float) r10)
            r1.setPaddingRelative(r6, r9, r3, r10)
            r3 = 1
            r1.setSingleLine(r3)
            ogf r6 = defpackage.puf.k
            r6.b(r1, defpackage.uy4.b)
            android.content.res.Resources r6 = r1.getResources()
            int r9 = defpackage.ixa.f0
            java.lang.CharSequence r6 = r6.getText(r9)
            r1.setHint(r6)
            r1.setClipToOutline(r3)
            n04 r6 = new n04
            android.content.res.Resources r9 = defpackage.vo4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r8 = r8 * r9
            int r8 = kotlin.math.MathKt.roundToInt((float) r8)
            float r8 = (float) r8
            r6.<init>(r8)
            r1.setOutlineProvider(r6)
            int r6 = r1.getInputType()
            r6 = r6 | 16384(0x4000, float:2.2959E-41)
            r1.setInputType(r6)
            r11.D0 = r1
            p35 r6 = new p35
            r8 = 5
            r6.<init>(r12, r8)
            kotlin.LazyThreadSafetyMode r12 = kotlin.LazyThreadSafetyMode.NONE
            kotlin.Lazy r12 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r12, r6)
            r11.E0 = r12
            r0.setOrientation(r3)
            r0.setGravity(r7)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r4, r5)
            r0.setLayoutParams(r12)
            r0.addView(r1)
            sa r12 = new sa
            r1 = 10
            r12.<init>((java.lang.Object) r11, (kotlin.coroutines.Continuation) r2, (int) r1)
            defpackage.b0h.H(r0, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.up5.<init>(android.content.Context):void");
    }

    public final void M(lz7 lz7) {
        tp5 tp5 = (tp5) lz7;
        String str = tp5.a;
        if (str != null) {
            this.D0.setText(str);
        }
        P(tp5.b);
    }

    public final void P(c63 c63) {
        Lazy lazy = this.E0;
        if (lazy.isInitialized() || c63 != null) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) lazy.getValue();
            appCompatTextView.setVisibility(c63 != null ? 0 : 8);
            appCompatTextView.setText(c63 != null ? CollectionsKt___CollectionsKt.joinToString$default(c63.a, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new ae0(appCompatTextView.getContext(), 2), 30, (Object) null) : null);
            f6e.c((ViewGroup) this.a, appCompatTextView, (Integer) null);
        }
    }
}
