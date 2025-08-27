package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;

public abstract class TwoStatePreference extends Preference {
    public boolean W0;
    public CharSequence X0;
    public CharSequence Y0;
    public boolean Z0;
    public boolean a1;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final void A(boolean z) {
        boolean z2 = this.W0 != z;
        if (z2 || !this.Z0) {
            this.W0 = z;
            this.Z0 = true;
            if (x()) {
                boolean z3 = !z;
                if (x()) {
                    z3 = this.b.b().getBoolean(this.Z, z3);
                }
                if (z != z3) {
                    SharedPreferences.Editor a = this.b.a();
                    a.putBoolean(this.Z, z);
                    y(a);
                }
            }
            if (z2) {
                i(w());
                h();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(android.view.View r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.widget.TextView r4 = (android.widget.TextView) r4
            boolean r0 = r3.W0
            r1 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.CharSequence r0 = r3.X0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x001b
            java.lang.CharSequence r0 = r3.X0
            r4.setText(r0)
        L_0x0019:
            r0 = r1
            goto L_0x002e
        L_0x001b:
            boolean r0 = r3.W0
            if (r0 != 0) goto L_0x002d
            java.lang.CharSequence r0 = r3.Y0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002d
            java.lang.CharSequence r0 = r3.Y0
            r4.setText(r0)
            goto L_0x0019
        L_0x002d:
            r0 = 1
        L_0x002e:
            if (r0 == 0) goto L_0x003e
            java.lang.CharSequence r3 = r3.f()
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x003e
            r4.setText(r3)
            r0 = r1
        L_0x003e:
            if (r0 != 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r1 = 8
        L_0x0043:
            int r3 = r4.getVisibility()
            if (r1 == r3) goto L_0x004c
            r4.setVisibility(r1)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.B(android.view.View):void");
    }

    public final void m() {
        boolean z = !this.W0;
        if (a(Boolean.valueOf(z))) {
            A(z);
        }
    }

    public final Object o(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(cuf.class)) {
            super.p(parcelable);
            return;
        }
        cuf cuf = (cuf) parcelable;
        super.p(cuf.getSuperState());
        A(cuf.a);
    }

    public final Parcelable q() {
        this.S0 = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.A0) {
            return absSavedState;
        }
        cuf cuf = new cuf(absSavedState);
        cuf.a = this.W0;
        return cuf;
    }

    public final void r(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (x()) {
            booleanValue = this.b.b().getBoolean(this.Z, booleanValue);
        }
        A(booleanValue);
    }

    public final boolean w() {
        return (this.a1 ? this.W0 : !this.W0) || super.w();
    }
}
