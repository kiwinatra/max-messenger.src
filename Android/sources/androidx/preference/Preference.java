package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.ArrayList;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.messages.views.dev.FrgPrefs;
import ru.ok.messages.views.dialogs.ConfirmationDialog;

public class Preference implements Comparable<Preference> {
    public final boolean A0;
    public final String B0;
    public final Object C0;
    public boolean D0;
    public boolean E0;
    public final boolean F0;
    public final boolean G0;
    public final boolean H0;
    public final boolean I0;
    public final boolean J0;
    public boolean K0;
    public final boolean L0;
    public final boolean M0;
    public int N0;
    public final int O0;
    public btb P0;
    public ArrayList Q0;
    public PreferenceGroup R0;
    public boolean S0;
    public tsb T0;
    public usb U0;
    public final wld V0;
    public int X;
    public Drawable Y;
    public final String Z;
    public final Context a;
    public dtb b;
    public long c;
    public boolean o;
    public ci6 v;
    public Intent v0;
    public ssb w;
    public final String w0;
    public int x;
    public Bundle x0;
    public CharSequence y;
    public final boolean y0;
    public CharSequence z;
    public final boolean z0;

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.x = IntCompanionObject.MAX_VALUE;
        this.y0 = true;
        this.z0 = true;
        this.A0 = true;
        this.D0 = true;
        this.E0 = true;
        this.F0 = true;
        this.G0 = true;
        this.H0 = true;
        this.J0 = true;
        this.M0 = true;
        this.N0 = ojc.preference;
        this.V0 = new wld(11, this);
        this.a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nnc.Preference, i, 0);
        this.X = obtainStyledAttributes.getResourceId(nnc.Preference_icon, obtainStyledAttributes.getResourceId(nnc.Preference_android_icon, 0));
        int i2 = nnc.Preference_key;
        int i3 = nnc.Preference_android_key;
        String string = obtainStyledAttributes.getString(i2);
        this.Z = string == null ? obtainStyledAttributes.getString(i3) : string;
        int i4 = nnc.Preference_title;
        int i5 = nnc.Preference_android_title;
        CharSequence text = obtainStyledAttributes.getText(i4);
        this.y = text == null ? obtainStyledAttributes.getText(i5) : text;
        int i6 = nnc.Preference_summary;
        int i7 = nnc.Preference_android_summary;
        CharSequence text2 = obtainStyledAttributes.getText(i6);
        this.z = text2 == null ? obtainStyledAttributes.getText(i7) : text2;
        this.x = obtainStyledAttributes.getInt(nnc.Preference_order, obtainStyledAttributes.getInt(nnc.Preference_android_order, IntCompanionObject.MAX_VALUE));
        int i8 = nnc.Preference_fragment;
        int i9 = nnc.Preference_android_fragment;
        String string2 = obtainStyledAttributes.getString(i8);
        this.w0 = string2 == null ? obtainStyledAttributes.getString(i9) : string2;
        this.N0 = obtainStyledAttributes.getResourceId(nnc.Preference_layout, obtainStyledAttributes.getResourceId(nnc.Preference_android_layout, ojc.preference));
        this.O0 = obtainStyledAttributes.getResourceId(nnc.Preference_widgetLayout, obtainStyledAttributes.getResourceId(nnc.Preference_android_widgetLayout, 0));
        this.y0 = obtainStyledAttributes.getBoolean(nnc.Preference_enabled, obtainStyledAttributes.getBoolean(nnc.Preference_android_enabled, true));
        boolean z2 = obtainStyledAttributes.getBoolean(nnc.Preference_selectable, obtainStyledAttributes.getBoolean(nnc.Preference_android_selectable, true));
        this.z0 = z2;
        this.A0 = obtainStyledAttributes.getBoolean(nnc.Preference_persistent, obtainStyledAttributes.getBoolean(nnc.Preference_android_persistent, true));
        int i10 = nnc.Preference_dependency;
        int i11 = nnc.Preference_android_dependency;
        String string3 = obtainStyledAttributes.getString(i10);
        this.B0 = string3 == null ? obtainStyledAttributes.getString(i11) : string3;
        int i12 = nnc.Preference_allowDividerAbove;
        this.G0 = obtainStyledAttributes.getBoolean(i12, obtainStyledAttributes.getBoolean(i12, z2));
        int i13 = nnc.Preference_allowDividerBelow;
        this.H0 = obtainStyledAttributes.getBoolean(i13, obtainStyledAttributes.getBoolean(i13, z2));
        if (obtainStyledAttributes.hasValue(nnc.Preference_defaultValue)) {
            this.C0 = o(obtainStyledAttributes, nnc.Preference_defaultValue);
        } else if (obtainStyledAttributes.hasValue(nnc.Preference_android_defaultValue)) {
            this.C0 = o(obtainStyledAttributes, nnc.Preference_android_defaultValue);
        }
        this.M0 = obtainStyledAttributes.getBoolean(nnc.Preference_shouldDisableView, obtainStyledAttributes.getBoolean(nnc.Preference_android_shouldDisableView, true));
        boolean hasValue = obtainStyledAttributes.hasValue(nnc.Preference_singleLineTitle);
        this.I0 = hasValue;
        if (hasValue) {
            this.J0 = obtainStyledAttributes.getBoolean(nnc.Preference_singleLineTitle, obtainStyledAttributes.getBoolean(nnc.Preference_android_singleLineTitle, true));
        }
        this.K0 = obtainStyledAttributes.getBoolean(nnc.Preference_iconSpaceReserved, obtainStyledAttributes.getBoolean(nnc.Preference_android_iconSpaceReserved, false));
        int i14 = nnc.Preference_isPreferenceVisible;
        this.F0 = obtainStyledAttributes.getBoolean(i14, obtainStyledAttributes.getBoolean(i14, true));
        int i15 = nnc.Preference_enableCopying;
        this.L0 = obtainStyledAttributes.getBoolean(i15, obtainStyledAttributes.getBoolean(i15, false));
        obtainStyledAttributes.recycle();
    }

    public static void u(View view, boolean z2) {
        view.setEnabled(z2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                u(viewGroup.getChildAt(childCount), z2);
            }
        }
    }

    public final boolean a(Object obj) {
        ci6 ci6 = this.v;
        if (ci6 != null) {
            FrgPrefs frgPrefs = ci6.a;
            frgPrefs.getClass();
            if (!((Boolean) obj).booleanValue()) {
                Bundle bundle = new Bundle();
                bundle.putInt("ru.ok.tamtam.extra.CONTENT_RES_ID", rmc.dev_prefs__disable_ssl_confirmation);
                bundle.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", qad.m0);
                bundle.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", qad.y1);
                ConfirmationDialog confirmationDialog = new ConfirmationDialog();
                confirmationDialog.L2(bundle);
                confirmationDialog.P2(569, frgPrefs);
                confirmationDialog.Y2(frgPrefs.Q1(), "ru.ok.messages.views.dialogs.ConfirmationOkDialog");
                return false;
            }
        }
        return true;
    }

    public void b(Bundle bundle) {
        Parcelable parcelable;
        if ((!TextUtils.isEmpty(this.Z)) && (parcelable = bundle.getParcelable(this.Z)) != null) {
            this.S0 = false;
            p(parcelable);
            if (!this.S0) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    public void c(Bundle bundle) {
        if (!TextUtils.isEmpty(this.Z)) {
            this.S0 = false;
            Parcelable q = q();
            if (!this.S0) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            } else if (q != null) {
                bundle.putParcelable(this.Z, q);
            }
        }
    }

    public final int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.x;
        int i2 = preference.x;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.y;
        CharSequence charSequence2 = preference.y;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.y.toString());
    }

    public long d() {
        return this.c;
    }

    public final String e(String str) {
        return !x() ? str : this.b.b().getString(this.Z, str);
    }

    public CharSequence f() {
        usb usb = this.U0;
        return usb != null ? usb.c(this) : this.z;
    }

    public boolean g() {
        return this.y0 && this.D0 && this.E0;
    }

    public void h() {
        int indexOf;
        btb btb = this.P0;
        if (btb != null && (indexOf = btb.w.indexOf(this)) != -1) {
            btb.a.d(indexOf, 1, this);
        }
    }

    public void i(boolean z2) {
        ArrayList arrayList = this.Q0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Preference preference = (Preference) arrayList.get(i);
                if (preference.D0 == z2) {
                    preference.D0 = !z2;
                    preference.i(preference.w());
                    preference.h();
                }
            }
        }
    }

    public void j() {
        PreferenceScreen preferenceScreen;
        String str = this.B0;
        if (!TextUtils.isEmpty(str)) {
            dtb dtb = this.b;
            Preference preference = null;
            if (!(dtb == null || (preferenceScreen = dtb.g) == null)) {
                preference = preferenceScreen.A(str);
            }
            if (preference != null) {
                if (preference.Q0 == null) {
                    preference.Q0 = new ArrayList();
                }
                preference.Q0.add(this);
                boolean w2 = preference.w();
                if (this.D0 == w2) {
                    this.D0 = !w2;
                    i(w());
                    h();
                    return;
                }
                return;
            }
            StringBuilder p = tr1.p("Dependency \"", str, "\" not found for preference \"");
            p.append(this.Z);
            p.append("\" (title: \"");
            p.append(this.y);
            p.append("\"");
            throw new IllegalStateException(p.toString());
        }
    }

    public final void k(dtb dtb) {
        long j;
        this.b = dtb;
        if (!this.o) {
            synchronized (dtb) {
                j = dtb.b;
                dtb.b = 1 + j;
            }
            this.c = j;
        }
        if (x()) {
            dtb dtb2 = this.b;
            if ((dtb2 != null ? dtb2.b() : null).contains(this.Z)) {
                r((Object) null);
                return;
            }
        }
        Object obj = this.C0;
        if (obj != null) {
            r(obj);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(defpackage.ftb r10) {
        /*
            r9 = this;
            wld r0 = r9.V0
            android.view.View r1 = r10.a
            r1.setOnClickListener(r0)
            r0 = 0
            r1.setId(r0)
            r2 = 16908304(0x1020010, float:2.3877274E-38)
            android.view.View r2 = r10.M(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 8
            r4 = 0
            if (r2 == 0) goto L_0x0035
            java.lang.CharSequence r5 = r9.f()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0032
            r2.setText(r5)
            r2.setVisibility(r0)
            int r2 = r2.getCurrentTextColor()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0036
        L_0x0032:
            r2.setVisibility(r3)
        L_0x0035:
            r2 = r4
        L_0x0036:
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r10.M(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r6 = r9.z0
            if (r5 == 0) goto L_0x006f
            java.lang.CharSequence r7 = r9.y
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x006c
            r5.setText(r7)
            r5.setVisibility(r0)
            boolean r7 = r9.I0
            if (r7 == 0) goto L_0x005a
            boolean r7 = r9.J0
            r5.setSingleLine(r7)
        L_0x005a:
            if (r6 != 0) goto L_0x006f
            boolean r7 = r9.g()
            if (r7 == 0) goto L_0x006f
            if (r2 == 0) goto L_0x006f
            int r2 = r2.intValue()
            r5.setTextColor(r2)
            goto L_0x006f
        L_0x006c:
            r5.setVisibility(r3)
        L_0x006f:
            r2 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r2 = r10.M(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r5 = 4
            if (r2 == 0) goto L_0x00a8
            int r7 = r9.X
            if (r7 != 0) goto L_0x0083
            android.graphics.drawable.Drawable r8 = r9.Y
            if (r8 == 0) goto L_0x0096
        L_0x0083:
            android.graphics.drawable.Drawable r8 = r9.Y
            if (r8 != 0) goto L_0x008f
            android.content.Context r8 = r9.a
            android.graphics.drawable.Drawable r7 = defpackage.iq.D(r8, r7)
            r9.Y = r7
        L_0x008f:
            android.graphics.drawable.Drawable r7 = r9.Y
            if (r7 == 0) goto L_0x0096
            r2.setImageDrawable(r7)
        L_0x0096:
            android.graphics.drawable.Drawable r7 = r9.Y
            if (r7 == 0) goto L_0x009e
            r2.setVisibility(r0)
            goto L_0x00a8
        L_0x009e:
            boolean r7 = r9.K0
            if (r7 == 0) goto L_0x00a4
            r7 = r5
            goto L_0x00a5
        L_0x00a4:
            r7 = r3
        L_0x00a5:
            r2.setVisibility(r7)
        L_0x00a8:
            int r2 = defpackage.vfc.icon_frame
            android.view.View r2 = r10.M(r2)
            if (r2 != 0) goto L_0x00b7
            r2 = 16908350(0x102003e, float:2.3877403E-38)
            android.view.View r2 = r10.M(r2)
        L_0x00b7:
            if (r2 == 0) goto L_0x00c9
            android.graphics.drawable.Drawable r7 = r9.Y
            if (r7 == 0) goto L_0x00c1
            r2.setVisibility(r0)
            goto L_0x00c9
        L_0x00c1:
            boolean r0 = r9.K0
            if (r0 == 0) goto L_0x00c6
            r3 = r5
        L_0x00c6:
            r2.setVisibility(r3)
        L_0x00c9:
            boolean r0 = r9.M0
            if (r0 == 0) goto L_0x00d5
            boolean r0 = r9.g()
            u(r1, r0)
            goto L_0x00d9
        L_0x00d5:
            r0 = 1
            u(r1, r0)
        L_0x00d9:
            r1.setFocusable(r6)
            r1.setClickable(r6)
            boolean r0 = r9.G0
            r10.G0 = r0
            boolean r0 = r9.H0
            r10.H0 = r0
            boolean r10 = r9.L0
            if (r10 == 0) goto L_0x00f6
            tsb r0 = r9.T0
            if (r0 != 0) goto L_0x00f6
            tsb r0 = new tsb
            r0.<init>(r9)
            r9.T0 = r0
        L_0x00f6:
            if (r10 == 0) goto L_0x00fb
            tsb r9 = r9.T0
            goto L_0x00fc
        L_0x00fb:
            r9 = r4
        L_0x00fc:
            r1.setOnCreateContextMenuListener(r9)
            r1.setLongClickable(r10)
            if (r10 == 0) goto L_0x010b
            if (r6 != 0) goto L_0x010b
            java.util.WeakHashMap r9 = defpackage.gag.a
            r1.setBackground(r4)
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.l(ftb):void");
    }

    public void m() {
    }

    public void n() {
        z();
    }

    public Object o(TypedArray typedArray, int i) {
        return null;
    }

    public void p(Parcelable parcelable) {
        this.S0 = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public Parcelable q() {
        this.S0 = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void r(Object obj) {
    }

    public void s(View view) {
        PreferenceFragmentCompat preferenceFragmentCompat;
        String str;
        if (g() && this.z0) {
            m();
            ssb ssb = this.w;
            if (ssb == null || !ssb.l(this)) {
                dtb dtb = this.b;
                if (dtb == null || (preferenceFragmentCompat = dtb.h) == null || (str = this.w0) == null) {
                    Intent intent = this.v0;
                    if (intent != null) {
                        this.a.startActivity(intent);
                        return;
                    }
                    return;
                }
                for (a aVar = preferenceFragmentCompat; aVar != null; aVar = aVar.G0) {
                }
                preferenceFragmentCompat.O1();
                preferenceFragmentCompat.M1();
                c Q1 = preferenceFragmentCompat.Q1();
                if (this.x0 == null) {
                    this.x0 = new Bundle();
                }
                Bundle bundle = this.x0;
                a a2 = Q1.J().a(preferenceFragmentCompat.E2().getClassLoader(), str);
                a2.L2(bundle);
                a2.P2(0, preferenceFragmentCompat);
                xe0 xe0 = new xe0(Q1);
                xe0.k(((View) preferenceFragmentCompat.I2().getParent()).getId(), a2, (String) null);
                xe0.c((String) null);
                xe0.e(false);
            }
        }
    }

    public final void t(String str) {
        if (x() && !TextUtils.equals(str, e((String) null))) {
            SharedPreferences.Editor a2 = this.b.a();
            a2.putString(this.Z, str);
            y(a2);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.y;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence f = f();
        if (!TextUtils.isEmpty(f)) {
            sb.append(f);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public void v(CharSequence charSequence) {
        if (this.U0 != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        } else if (!TextUtils.equals(this.z, charSequence)) {
            this.z = charSequence;
            h();
        }
    }

    public boolean w() {
        return !g();
    }

    public final boolean x() {
        return this.b != null && this.A0 && (TextUtils.isEmpty(this.Z) ^ true);
    }

    public final void y(SharedPreferences.Editor editor) {
        if (!this.b.e) {
            editor.apply();
        }
    }

    public final void z() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.B0;
        if (str != null) {
            dtb dtb = this.b;
            Preference preference = null;
            if (!(dtb == null || (preferenceScreen = dtb.g) == null)) {
                preference = preferenceScreen.A(str);
            }
            if (preference != null && (arrayList = preference.Q0) != null) {
                arrayList.remove(this);
            }
        }
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b0h.s(cdc.preferenceStyle, 16842894, context));
    }
}
