package androidx.preference;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;

public class SwitchPreference extends TwoStatePreference {
    public final yy2 b1 = new yy2(this, 1);
    public final CharSequence c1;
    public final CharSequence d1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            int r0 = defpackage.cdc.switchPreferenceStyle
            r1 = 16843629(0x101036d, float:2.3696016E-38)
            int r0 = defpackage.b0h.s(r0, r1, r4)
            r3.<init>(r4, r5, r0)
            yy2 r1 = new yy2
            r2 = 1
            r1.<init>(r3, r2)
            r3.b1 = r1
            int[] r1 = defpackage.nnc.SwitchPreference
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            int r5 = defpackage.nnc.SwitchPreference_summaryOn
            int r0 = defpackage.nnc.SwitchPreference_android_summaryOn
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L_0x0029
            java.lang.String r5 = r4.getString(r0)
        L_0x0029:
            r3.X0 = r5
            boolean r5 = r3.W0
            if (r5 == 0) goto L_0x0032
            r3.h()
        L_0x0032:
            int r5 = defpackage.nnc.SwitchPreference_summaryOff
            int r0 = defpackage.nnc.SwitchPreference_android_summaryOff
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L_0x0040
            java.lang.String r5 = r4.getString(r0)
        L_0x0040:
            r3.Y0 = r5
            boolean r5 = r3.W0
            if (r5 != 0) goto L_0x0049
            r3.h()
        L_0x0049:
            int r5 = defpackage.nnc.SwitchPreference_switchTextOn
            int r0 = defpackage.nnc.SwitchPreference_android_switchTextOn
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L_0x0057
            java.lang.String r5 = r4.getString(r0)
        L_0x0057:
            r3.c1 = r5
            r3.h()
            int r5 = defpackage.nnc.SwitchPreference_switchTextOff
            int r0 = defpackage.nnc.SwitchPreference_android_switchTextOff
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L_0x006a
            java.lang.String r5 = r4.getString(r0)
        L_0x006a:
            r3.d1 = r5
            r3.h()
            int r5 = defpackage.nnc.SwitchPreference_disableDependentsState
            int r0 = defpackage.nnc.SwitchPreference_android_disableDependentsState
            boolean r0 = r4.getBoolean(r0, r2)
            boolean r5 = r4.getBoolean(r5, r0)
            r3.a1 = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.SwitchPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void C(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.W0);
        }
        if (z) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.c1);
            switchR.setTextOff(this.d1);
            switchR.setOnCheckedChangeListener(this.b1);
        }
    }

    public final void l(ftb ftb) {
        super.l(ftb);
        C(ftb.M(16908352));
        B(ftb.M(16908304));
    }

    public final void s(View view) {
        super.s(view);
        if (((AccessibilityManager) this.a.getSystemService("accessibility")).isEnabled()) {
            C(view.findViewById(16908352));
            B(view.findViewById(16908304));
        }
    }
}
