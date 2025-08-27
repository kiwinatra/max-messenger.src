package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: ex3  reason: default package */
public final class ex3 extends LinearLayout implements wcf {
    public static final /* synthetic */ KProperty[] o = {rae.s(ex3.class, "customTheme", "getCustomTheme()Lru/ok/tamtam/themes/TamTheme;", 0)};
    public static final int v = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
    public final float a = getContext().getResources().getDimension(dec.bottom_sheet_corner_radius);
    public final ArrayList b = new ArrayList();
    public final bl c;

    static {
        MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density);
    }

    public ex3(Context context) {
        super(context, (AttributeSet) null);
        Delegates delegates = Delegates.INSTANCE;
        this.c = new bl(8, this);
        setOrientation(1);
        d1(this);
        setClipChildren(true);
        setClipToPadding(true);
        setClipToOutline(true);
        setOutlineProvider(new a42(this, 3));
        if (isInEditMode()) {
            a(CollectionsKt.listOf(new nw3(new igf(tmc.tt_sms_invite_text), Integer.valueOf(tfc.btn_radio_off_mtrl), new qr3(4), 12), new nw3(new igf(tmc.tt_sms_invite_text), 17301582, new qr3(5), 12)), (Function2) null);
        }
    }

    private final scf getCurrentTheme() {
        scf customTheme = getCustomTheme();
        if (customTheme != null) {
            return customTheme;
        }
        if (isInEditMode()) {
            return vi4.f0;
        }
        Context context = getContext();
        Lazy lazy = scf.b0;
        return j4b.k0(context);
    }

    public final void L0(scf scf) {
        int i;
        int i2;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            nw3 nw3 = (nw3) pair.component1();
            View view = (View) pair.component2();
            if (nw3 instanceof nw3) {
                view.setBackground(i8b.H(getCurrentTheme().n, getCurrentTheme().j));
                AppCompatTextView appCompatTextView = (AppCompatTextView) view;
                Drawable drawable = (Drawable) ArraysKt.getOrNull((T[]) appCompatTextView.getCompoundDrawables(), 0);
                if (drawable != null) {
                    scf currentTheme = getCurrentTheme();
                    rcf rcf = nw3.c;
                    if (rcf != null) {
                        Integer num = (Integer) ((Map) currentTheme.f.T.getValue()).get(rcf);
                        if (num != null) {
                            i2 = num.intValue();
                            iq.a0(drawable, i2);
                        }
                    } else {
                        currentTheme.getClass();
                    }
                    i2 = Integer.valueOf(getCurrentTheme().x).intValue();
                    iq.a0(drawable, i2);
                }
                scf currentTheme2 = getCurrentTheme();
                rcf rcf2 = nw3.d;
                if (rcf2 != null) {
                    Integer num2 = (Integer) ((Map) currentTheme2.f.T.getValue()).get(rcf2);
                    if (num2 != null) {
                        i = num2.intValue();
                        appCompatTextView.setTextColor(i);
                    }
                } else {
                    currentTheme2.getClass();
                }
                i = Integer.valueOf(getCurrentTheme().G).intValue();
                appCompatTextView.setTextColor(i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x003a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Collection r12, kotlin.jvm.functions.Function2 r13) {
        /*
            r11 = this;
            int r0 = r12.size()
            java.util.ArrayList r1 = r11.b
            r2 = 1
            r3 = 12
            r4 = 16
            if (r0 != r2) goto L_0x0024
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0024
            float r0 = (float) r4
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)
            goto L_0x0034
        L_0x0024:
            float r0 = (float) r3
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)
        L_0x0034:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L_0x003a:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x016a
            java.lang.Object r2 = r12.next()
            nw3 r2 = (defpackage.nw3) r2
            androidx.appcompat.widget.AppCompatTextView r5 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r6 = r11.getContext()
            r7 = 0
            r5.<init>(r6, r7)
            r6 = 8388611(0x800003, float:1.1754948E-38)
            r5.setGravity(r6)
            ngf r6 = r2.a
            android.content.Context r8 = r5.getContext()
            java.lang.CharSequence r6 = r6.a(r8)
            r5.setText(r6)
            scf r6 = r11.getCurrentTheme()
            rcf r8 = r2.d
            if (r8 == 0) goto L_0x0082
            x53 r6 = r6.f
            kotlin.Lazy r6 = r6.T
            java.lang.Object r6 = r6.getValue()
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r6 = r6.get(r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x0085
            int r6 = r6.intValue()
            goto L_0x008b
        L_0x0082:
            r6.getClass()
        L_0x0085:
            scf r6 = r11.getCurrentTheme()
            int r6 = r6.G
        L_0x008b:
            r5.setTextColor(r6)
            r6 = 1097859072(0x41700000, float:15.0)
            r5.setTextSize(r6)
            java.lang.Integer r6 = r2.b
            if (r6 == 0) goto L_0x00d6
            android.content.Context r8 = r5.getContext()
            int r9 = r6.intValue()
            android.graphics.drawable.Drawable r8 = defpackage.ew3.b(r8, r9)
            scf r9 = r11.getCurrentTheme()
            rcf r10 = r2.c
            if (r10 == 0) goto L_0x00c2
            x53 r9 = r9.f
            kotlin.Lazy r9 = r9.T
            java.lang.Object r9 = r9.getValue()
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r9 = r9.get(r10)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L_0x00c5
            int r9 = r9.intValue()
            goto L_0x00cb
        L_0x00c2:
            r9.getClass()
        L_0x00c5:
            scf r9 = r11.getCurrentTheme()
            int r9 = r9.x
        L_0x00cb:
            defpackage.iq.a0(r8, r9)
            r5.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) r8, (android.graphics.drawable.Drawable) r7, (android.graphics.drawable.Drawable) r7, (android.graphics.drawable.Drawable) r7)
            int r7 = v
            r5.setCompoundDrawablePadding(r7)
        L_0x00d6:
            scf r7 = r11.getCurrentTheme()
            int r7 = r7.n
            scf r8 = r11.getCurrentTheme()
            int r8 = r8.j
            android.graphics.drawable.RippleDrawable r7 = defpackage.i8b.H(r7, r8)
            r5.setBackground(r7)
            if (r6 == 0) goto L_0x0120
            float r6 = (float) r4
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r6
            int r7 = kotlin.math.MathKt.roundToInt((float) r7)
            android.content.res.Resources r8 = defpackage.vo4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r6 = r6 * r8
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            r8 = 22
            float r8 = (float) r8
            android.content.res.Resources r9 = defpackage.vo4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r8 = r8 * r9
            int r8 = kotlin.math.MathKt.roundToInt((float) r8)
            r5.setPaddingRelative(r7, r6, r8, r0)
            goto L_0x0152
        L_0x0120:
            float r6 = (float) r3
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r6
            int r7 = kotlin.math.MathKt.roundToInt((float) r7)
            float r8 = (float) r4
            android.content.res.Resources r9 = defpackage.vo4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r8 = r8 * r9
            int r8 = kotlin.math.MathKt.roundToInt((float) r8)
            android.content.res.Resources r9 = defpackage.vo4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r6 = r6 * r9
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            r5.setPaddingRelative(r7, r8, r6, r0)
        L_0x0152:
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r7 = -1
            r8 = -2
            r6.<init>(r7, r8)
            r11.addView(r5, r6)
            kotlin.Pair r6 = kotlin.TuplesKt.to(r2, r5)
            r1.add(r6)
            if (r13 == 0) goto L_0x003a
            r13.invoke(r2, r5)
            goto L_0x003a
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex3.a(java.util.Collection, kotlin.jvm.functions.Function2):void");
    }

    public final ArrayList<Pair<nw3, View>> getActions() {
        return this.b;
    }

    public final scf getCustomTheme() {
        return (scf) this.c.getValue(this, o[0]);
    }

    public final void setCustomTheme(scf scf) {
        this.c.setValue(this, o[0], scf);
    }
}
