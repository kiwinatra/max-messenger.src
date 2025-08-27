package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: btb  reason: default package */
public class btb extends tyc {
    public final PreferenceGroup o;
    public ArrayList v;
    public ArrayList w;
    public final ArrayList x;
    public final Handler y;
    public final tj7 z = new tj7(21, this);

    public btb(PreferenceGroup preferenceGroup) {
        this.o = preferenceGroup;
        this.y = new Handler(Looper.getMainLooper());
        preferenceGroup.P0 = this;
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            C(((PreferenceScreen) preferenceGroup).e1);
        } else {
            C(true);
        }
        J();
    }

    public static boolean H(PreferenceGroup preferenceGroup) {
        return preferenceGroup.c1 != Integer.MAX_VALUE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.Object, androidx.preference.Preference, nd5] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList E(androidx.preference.PreferenceGroup r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = r13.Y0
            int r2 = r2.size()
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x0013:
            if (r4 >= r2) goto L_0x0081
            androidx.preference.Preference r6 = r13.B(r4)
            boolean r7 = r6.F0
            if (r7 != 0) goto L_0x001e
            goto L_0x007e
        L_0x001e:
            boolean r7 = H(r13)
            if (r7 == 0) goto L_0x002d
            int r7 = r13.c1
            if (r5 >= r7) goto L_0x0029
            goto L_0x002d
        L_0x0029:
            r1.add(r6)
            goto L_0x0030
        L_0x002d:
            r0.add(r6)
        L_0x0030:
            boolean r7 = r6 instanceof androidx.preference.PreferenceGroup
            if (r7 != 0) goto L_0x0037
            int r5 = r5 + 1
            goto L_0x007e
        L_0x0037:
            androidx.preference.PreferenceGroup r6 = (androidx.preference.PreferenceGroup) r6
            boolean r7 = r6 instanceof androidx.preference.PreferenceScreen
            r7 = r7 ^ 1
            if (r7 != 0) goto L_0x0040
            goto L_0x007e
        L_0x0040:
            boolean r7 = H(r13)
            if (r7 == 0) goto L_0x0055
            boolean r7 = H(r6)
            if (r7 != 0) goto L_0x004d
            goto L_0x0055
        L_0x004d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Nesting an expandable group inside of another expandable group is not supported!"
            r12.<init>(r13)
            throw r12
        L_0x0055:
            java.util.ArrayList r6 = r12.E(r6)
            java.util.Iterator r6 = r6.iterator()
        L_0x005d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x007e
            java.lang.Object r7 = r6.next()
            androidx.preference.Preference r7 = (androidx.preference.Preference) r7
            boolean r8 = H(r13)
            if (r8 == 0) goto L_0x0078
            int r8 = r13.c1
            if (r5 >= r8) goto L_0x0074
            goto L_0x0078
        L_0x0074:
            r1.add(r7)
            goto L_0x007b
        L_0x0078:
            r0.add(r7)
        L_0x007b:
            int r5 = r5 + 1
            goto L_0x005d
        L_0x007e:
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0081:
            boolean r2 = H(r13)
            if (r2 == 0) goto L_0x0133
            int r2 = r13.c1
            if (r5 <= r2) goto L_0x0133
            nd5 r2 = new nd5
            long r4 = r13.c
            android.content.Context r6 = r13.a
            r7 = 0
            r2.<init>(r6, r7)
            int r6 = defpackage.ojc.expand_button
            r2.N0 = r6
            int r6 = defpackage.ofc.ic_arrow_down_24dp
            android.content.Context r8 = r2.a
            android.graphics.drawable.Drawable r9 = defpackage.iq.D(r8, r6)
            android.graphics.drawable.Drawable r10 = r2.Y
            if (r10 == r9) goto L_0x00ac
            r2.Y = r9
            r2.X = r3
            r2.h()
        L_0x00ac:
            r2.X = r6
            int r3 = defpackage.hmc.expand_button_title
            java.lang.String r3 = r8.getString(r3)
            java.lang.CharSequence r6 = r2.y
            boolean r6 = android.text.TextUtils.equals(r3, r6)
            if (r6 != 0) goto L_0x00c1
            r2.y = r3
            r2.h()
        L_0x00c1:
            int r3 = r2.x
            r6 = 999(0x3e7, float:1.4E-42)
            if (r6 == r3) goto L_0x00d0
            r2.x = r6
            btb r3 = r2.P0
            if (r3 == 0) goto L_0x00d0
            r3.I(r2)
        L_0x00d0:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00d9:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x011d
            java.lang.Object r6 = r1.next()
            androidx.preference.Preference r6 = (androidx.preference.Preference) r6
            java.lang.CharSequence r9 = r6.y
            boolean r10 = r6 instanceof androidx.preference.PreferenceGroup
            if (r10 == 0) goto L_0x00f7
            boolean r11 = android.text.TextUtils.isEmpty(r9)
            if (r11 != 0) goto L_0x00f7
            r11 = r6
            androidx.preference.PreferenceGroup r11 = (androidx.preference.PreferenceGroup) r11
            r3.add(r11)
        L_0x00f7:
            androidx.preference.PreferenceGroup r11 = r6.R0
            boolean r11 = r3.contains(r11)
            if (r11 == 0) goto L_0x0107
            if (r10 == 0) goto L_0x00d9
            androidx.preference.PreferenceGroup r6 = (androidx.preference.PreferenceGroup) r6
            r3.add(r6)
            goto L_0x00d9
        L_0x0107:
            boolean r6 = android.text.TextUtils.isEmpty(r9)
            if (r6 != 0) goto L_0x00d9
            if (r7 != 0) goto L_0x0111
            r7 = r9
            goto L_0x00d9
        L_0x0111:
            int r6 = defpackage.hmc.summary_collapsed_preference_list
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r9}
            java.lang.String r6 = r8.getString(r6, r7)
            r7 = r6
            goto L_0x00d9
        L_0x011d:
            r2.v(r7)
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 + r6
            r2.W0 = r4
            zqd r1 = new zqd
            r3 = 20
            r4 = 0
            r1.<init>(r12, r13, r4, r3)
            r2.w = r1
            r0.add(r2)
        L_0x0133:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btb.E(androidx.preference.PreferenceGroup):java.util.ArrayList");
    }

    public final void F(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.Y0);
        }
        int size = preferenceGroup.Y0.size();
        for (int i = 0; i < size; i++) {
            Preference B = preferenceGroup.B(i);
            arrayList.add(B);
            atb atb = new atb(B);
            if (!this.x.contains(atb)) {
                this.x.add(atb);
            }
            if (B instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) B;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    F(arrayList, preferenceGroup2);
                }
            }
            B.P0 = this;
        }
    }

    public final Preference G(int i) {
        if (i < 0 || i >= this.w.size()) {
            return null;
        }
        return (Preference) this.w.get(i);
    }

    public void I(Preference preference) {
        Handler handler = this.y;
        tj7 tj7 = this.z;
        handler.removeCallbacks(tj7);
        handler.post(tj7);
    }

    public final void J() {
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).P0 = null;
        }
        ArrayList arrayList = new ArrayList(this.v.size());
        this.v = arrayList;
        PreferenceGroup preferenceGroup = this.o;
        F(arrayList, preferenceGroup);
        this.w = E(preferenceGroup);
        m();
        Iterator it2 = this.v.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).getClass();
        }
    }

    public final int j() {
        return this.w.size();
    }

    public final long k(int i) {
        if (!this.b) {
            return -1;
        }
        return G(i).d();
    }

    public final int l(int i) {
        atb atb = new atb(G(i));
        ArrayList arrayList = this.x;
        int indexOf = arrayList.indexOf(atb);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = arrayList.size();
        arrayList.add(atb);
        return size;
    }

    public final void s(pzc pzc, int i) {
        ColorStateList colorStateList;
        ftb ftb = (ftb) pzc;
        Preference G = G(i);
        View view = ftb.a;
        Drawable background = view.getBackground();
        Drawable drawable = ftb.D0;
        if (background != drawable) {
            WeakHashMap weakHashMap = gag.a;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) ftb.M(16908310);
        if (!(textView == null || (colorStateList = ftb.E0) == null || textView.getTextColors().equals(colorStateList))) {
            textView.setTextColor(colorStateList);
        }
        G.l(ftb);
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        atb atb = (atb) this.x.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, nnc.BackgroundStyle);
        Drawable drawable = obtainStyledAttributes.getDrawable(nnc.BackgroundStyle_android_selectableItemBackground);
        if (drawable == null) {
            drawable = iq.D(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(atb.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            WeakHashMap weakHashMap = gag.a;
            inflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = atb.b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new ftb(inflate);
    }
}
