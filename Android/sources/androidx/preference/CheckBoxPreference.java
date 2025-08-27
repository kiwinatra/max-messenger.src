package androidx.preference;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;

public class CheckBoxPreference extends TwoStatePreference {
    public final yy2 b1 = new yy2(this, 0);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CheckBoxPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            int r0 = defpackage.cdc.checkBoxPreferenceStyle
            r1 = 16842895(0x101008f, float:2.369396E-38)
            int r0 = defpackage.b0h.s(r0, r1, r4)
            r3.<init>(r4, r5, r0)
            yy2 r1 = new yy2
            r2 = 0
            r1.<init>(r3, r2)
            r3.b1 = r1
            int[] r1 = defpackage.nnc.CheckBoxPreference
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            int r5 = defpackage.nnc.CheckBoxPreference_summaryOn
            int r0 = defpackage.nnc.CheckBoxPreference_android_summaryOn
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L_0x0028
            java.lang.String r5 = r4.getString(r0)
        L_0x0028:
            r3.X0 = r5
            boolean r5 = r3.W0
            if (r5 == 0) goto L_0x0031
            r3.h()
        L_0x0031:
            int r5 = defpackage.nnc.CheckBoxPreference_summaryOff
            int r0 = defpackage.nnc.CheckBoxPreference_android_summaryOff
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L_0x003f
            java.lang.String r5 = r4.getString(r0)
        L_0x003f:
            r3.Y0 = r5
            boolean r5 = r3.W0
            if (r5 != 0) goto L_0x0048
            r3.h()
        L_0x0048:
            int r5 = defpackage.nnc.CheckBoxPreference_disableDependentsState
            int r0 = defpackage.nnc.CheckBoxPreference_android_disableDependentsState
            boolean r0 = r4.getBoolean(r0, r2)
            boolean r5 = r4.getBoolean(r5, r0)
            r3.a1 = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.CheckBoxPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void C(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.W0);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.b1);
        }
    }

    public final void l(ftb ftb) {
        super.l(ftb);
        C(ftb.M(16908289));
        B(ftb.M(16908304));
    }

    public final void s(View view) {
        super.s(view);
        if (((AccessibilityManager) this.a.getSystemService("accessibility")).isEnabled()) {
            C(view.findViewById(16908289));
            B(view.findViewById(16908304));
        }
    }
}
