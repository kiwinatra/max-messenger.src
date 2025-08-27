package androidx.preference;

import android.os.Bundle;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.a;
import androidx.recyclerview.widget.RecyclerView;

public abstract class PreferenceFragmentCompat extends a {
    public final ysb l1 = new ysb(this);
    public dtb m1;
    public RecyclerView n1;
    public boolean o1;
    public boolean p1;
    public int q1 = ojc.preference_list_fragment;
    public final hy r1 = new hy(this, Looper.getMainLooper(), 14);
    public final tj7 s1 = new tj7(19, this);

    public final void A2(View view, Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        if (!(bundle == null || (bundle2 = bundle.getBundle("android:preferences")) == null || (preferenceScreen2 = this.m1.g) == null)) {
            preferenceScreen2.b(bundle2);
        }
        if (this.o1 && (preferenceScreen = this.m1.g) != null) {
            this.n1.setAdapter(T2(preferenceScreen));
            preferenceScreen.j();
        }
        this.p1 = true;
    }

    public tyc T2(PreferenceScreen preferenceScreen) {
        return new btb(preferenceScreen);
    }

    public void U2(Preference preference) {
        DialogFragment dialogFragment;
        for (a aVar = this; aVar != null; aVar = aVar.G0) {
        }
        O1();
        M1();
        if (Q1().E("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                String str = preference.Z;
                dialogFragment = new EditTextPreferenceDialogFragmentCompat();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                dialogFragment.L2(bundle);
            } else if (preference instanceof ListPreference) {
                String str2 = preference.Z;
                dialogFragment = new ListPreferenceDialogFragmentCompat();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                dialogFragment.L2(bundle2);
            } else if (preference instanceof MultiSelectListPreference) {
                String str3 = preference.Z;
                dialogFragment = new MultiSelectListPreferenceDialogFragmentCompat();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                dialogFragment.L2(bundle3);
            } else {
                throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            }
            dialogFragment.P2(0, this);
            dialogFragment.Y2(Q1(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    public void i2(Bundle bundle) {
        super.i2(bundle);
        TypedValue typedValue = new TypedValue();
        G2().getTheme().resolveAttribute(cdc.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = gnc.PreferenceThemeOverlay;
        }
        G2().getTheme().applyStyle(i, false);
        dtb dtb = new dtb(G2());
        this.m1 = dtb;
        dtb.j = this;
        Bundle bundle2 = this.x;
        if (bundle2 != null) {
            bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
    }

    /* JADX WARNING: type inference failed for: r8v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View k2(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            r7 = this;
            android.content.Context r10 = r7.G2()
            int[] r0 = defpackage.nnc.PreferenceFragmentCompat
            int r1 = defpackage.cdc.preferenceFragmentCompatStyle
            r2 = 0
            r3 = 0
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r2, r0, r1, r3)
            int r0 = defpackage.nnc.PreferenceFragmentCompat_android_layout
            int r1 = r7.q1
            int r0 = r10.getResourceId(r0, r1)
            r7.q1 = r0
            int r0 = defpackage.nnc.PreferenceFragmentCompat_android_divider
            android.graphics.drawable.Drawable r0 = r10.getDrawable(r0)
            int r1 = defpackage.nnc.PreferenceFragmentCompat_android_dividerHeight
            r2 = -1
            int r1 = r10.getDimensionPixelSize(r1, r2)
            int r4 = defpackage.nnc.PreferenceFragmentCompat_allowDividerAfterLastItem
            r5 = 1
            boolean r4 = r10.getBoolean(r4, r5)
            r10.recycle()
            android.content.Context r10 = r7.G2()
            android.view.LayoutInflater r8 = r8.cloneInContext(r10)
            int r10 = r7.q1
            android.view.View r9 = r8.inflate(r10, r9, r3)
            r10 = 16908351(0x102003f, float:2.3877406E-38)
            android.view.View r10 = r9.findViewById(r10)
            boolean r5 = r10 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x00bf
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            android.content.Context r5 = r7.G2()
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.lang.String r6 = "android.hardware.type.automotive"
            boolean r5 = r5.hasSystemFeature(r6)
            if (r5 == 0) goto L_0x0065
            int r5 = defpackage.vfc.recycler_view
            android.view.View r5 = r10.findViewById(r5)
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 == 0) goto L_0x0065
            goto L_0x0081
        L_0x0065:
            int r5 = defpackage.ojc.preference_recyclerview
            android.view.View r8 = r8.inflate(r5, r10, r3)
            r5 = r8
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            androidx.recyclerview.widget.LinearLayoutManager r8 = new androidx.recyclerview.widget.LinearLayoutManager
            r7.G2()
            r8.<init>()
            r5.setLayoutManager(r8)
            etb r8 = new etb
            r8.<init>(r5)
            r5.setAccessibilityDelegateCompat(r8)
        L_0x0081:
            r7.n1 = r5
            ysb r8 = r7.l1
            r5.j(r8)
            if (r0 == 0) goto L_0x0094
            r8.getClass()
            int r3 = r0.getIntrinsicHeight()
            r8.b = r3
            goto L_0x0096
        L_0x0094:
            r8.b = r3
        L_0x0096:
            r8.a = r0
            androidx.preference.PreferenceFragmentCompat r0 = r8.o
            androidx.recyclerview.widget.RecyclerView r3 = r0.n1
            r3.a0()
            if (r1 == r2) goto L_0x00a8
            r8.b = r1
            androidx.recyclerview.widget.RecyclerView r0 = r0.n1
            r0.a0()
        L_0x00a8:
            r8.c = r4
            androidx.recyclerview.widget.RecyclerView r8 = r7.n1
            android.view.ViewParent r8 = r8.getParent()
            if (r8 != 0) goto L_0x00b7
            androidx.recyclerview.widget.RecyclerView r8 = r7.n1
            r10.addView(r8)
        L_0x00b7:
            hy r8 = r7.r1
            tj7 r7 = r7.s1
            r8.post(r7)
            return r9
        L_0x00bf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.PreferenceFragmentCompat.k2(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void m2() {
        tj7 tj7 = this.s1;
        hy hyVar = this.r1;
        hyVar.removeCallbacks(tj7);
        hyVar.removeMessages(1);
        if (this.o1) {
            this.n1.setAdapter((tyc) null);
            PreferenceScreen preferenceScreen = this.m1.g;
            if (preferenceScreen != null) {
                preferenceScreen.n();
            }
        }
        this.n1 = null;
        this.Q0 = true;
    }

    public final void x2(Bundle bundle) {
        PreferenceScreen preferenceScreen = this.m1.g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.c(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    public final void y2() {
        this.Q0 = true;
        dtb dtb = this.m1;
        dtb.h = this;
        dtb.i = this;
    }

    public final void z2() {
        this.Q0 = true;
        dtb dtb = this.m1;
        dtb.h = null;
        dtb.i = null;
    }
}
