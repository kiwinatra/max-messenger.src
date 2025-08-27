package androidx.preference;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;

public class SwitchPreferenceCompat extends TwoStatePreference {
    public final yy2 b1 = new yy2(this, 2);
    public final CharSequence c1;
    public final CharSequence d1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchPreferenceCompat(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            int r0 = defpackage.cdc.switchPreferenceCompatStyle
            r3.<init>(r4, r5, r0)
            yy2 r1 = new yy2
            r2 = 2
            r1.<init>(r3, r2)
            r3.b1 = r1
            int[] r1 = defpackage.nnc.SwitchPreferenceCompat
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            int r5 = defpackage.nnc.SwitchPreferenceCompat_summaryOn
            int r0 = defpackage.nnc.SwitchPreferenceCompat_android_summaryOn
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L_0x0022
            java.lang.String r5 = r4.getString(r0)
        L_0x0022:
            r3.X0 = r5
            boolean r5 = r3.W0
            if (r5 == 0) goto L_0x002b
            r3.h()
        L_0x002b:
            int r5 = defpackage.nnc.SwitchPreferenceCompat_summaryOff
            int r0 = defpackage.nnc.SwitchPreferenceCompat_android_summaryOff
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L_0x0039
            java.lang.String r5 = r4.getString(r0)
        L_0x0039:
            r3.Y0 = r5
            boolean r5 = r3.W0
            if (r5 != 0) goto L_0x0042
            r3.h()
        L_0x0042:
            int r5 = defpackage.nnc.SwitchPreferenceCompat_switchTextOn
            int r0 = defpackage.nnc.SwitchPreferenceCompat_android_switchTextOn
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L_0x0050
            java.lang.String r5 = r4.getString(r0)
        L_0x0050:
            r3.c1 = r5
            r3.h()
            int r5 = defpackage.nnc.SwitchPreferenceCompat_switchTextOff
            int r0 = defpackage.nnc.SwitchPreferenceCompat_android_switchTextOff
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L_0x0063
            java.lang.String r5 = r4.getString(r0)
        L_0x0063:
            r3.d1 = r5
            r3.h()
            int r5 = defpackage.nnc.SwitchPreferenceCompat_disableDependentsState
            int r0 = defpackage.nnc.SwitchPreferenceCompat_android_disableDependentsState
            boolean r0 = r4.getBoolean(r0, r2)
            boolean r5 = r4.getBoolean(r5, r0)
            r3.a1 = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.SwitchPreferenceCompat.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void C(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.W0);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.c1);
            switchCompat.setTextOff(this.d1);
            switchCompat.setOnCheckedChangeListener(this.b1);
        }
    }

    public final void l(ftb ftb) {
        super.l(ftb);
        C(ftb.M(vfc.switchWidget));
        B(ftb.M(16908304));
    }

    public final void s(View view) {
        super.s(view);
        if (((AccessibilityManager) this.a.getSystemService("accessibility")).isEnabled()) {
            C(view.findViewById(vfc.switchWidget));
            B(view.findViewById(16908304));
        }
    }
}
