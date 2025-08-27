package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import java.util.ArrayList;
import kotlin.jvm.internal.IntCompanionObject;

public abstract class PreferenceGroup extends Preference {
    public final qae W0;
    public final Handler X0;
    public final ArrayList Y0;
    public boolean Z0;
    public int a1;
    public boolean b1;
    public int c1;
    public final tj7 d1;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.W0 = new qae(0);
        this.X0 = new Handler(Looper.getMainLooper());
        this.Z0 = true;
        this.a1 = 0;
        this.b1 = false;
        this.c1 = IntCompanionObject.MAX_VALUE;
        this.d1 = new tj7(20, this);
        this.Y0 = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nnc.PreferenceGroup, i, 0);
        int i2 = nnc.PreferenceGroup_orderingFromXml;
        this.Z0 = obtainStyledAttributes.getBoolean(i2, obtainStyledAttributes.getBoolean(i2, true));
        if (obtainStyledAttributes.hasValue(nnc.PreferenceGroup_initialExpandedChildrenCount)) {
            int i3 = nnc.PreferenceGroup_initialExpandedChildrenCount;
            int i4 = obtainStyledAttributes.getInt(i3, obtainStyledAttributes.getInt(i3, IntCompanionObject.MAX_VALUE));
            if (i4 != Integer.MAX_VALUE) {
                TextUtils.isEmpty(this.Z);
            }
            this.c1 = i4;
        }
        obtainStyledAttributes.recycle();
    }

    public final Preference A(CharSequence charSequence) {
        Preference A;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        } else if (TextUtils.equals(this.Z, charSequence)) {
            return this;
        } else {
            int C = C();
            for (int i = 0; i < C; i++) {
                Preference B = B(i);
                if (TextUtils.equals(B.Z, charSequence)) {
                    return B;
                }
                if ((B instanceof PreferenceGroup) && (A = ((PreferenceGroup) B).A(charSequence)) != null) {
                    return A;
                }
            }
            return null;
        }
    }

    public final Preference B(int i) {
        return (Preference) this.Y0.get(i);
    }

    public final int C() {
        return this.Y0.size();
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        int size = this.Y0.size();
        for (int i = 0; i < size; i++) {
            B(i).b(bundle);
        }
    }

    public final void c(Bundle bundle) {
        super.c(bundle);
        int size = this.Y0.size();
        for (int i = 0; i < size; i++) {
            B(i).c(bundle);
        }
    }

    public final void i(boolean z) {
        super.i(z);
        int size = this.Y0.size();
        for (int i = 0; i < size; i++) {
            Preference B = B(i);
            if (B.E0 == z) {
                B.E0 = !z;
                B.i(B.w());
                B.h();
            }
        }
    }

    public final void j() {
        super.j();
        this.b1 = true;
        int C = C();
        for (int i = 0; i < C; i++) {
            B(i).j();
        }
    }

    public final void n() {
        z();
        this.b1 = false;
        int C = C();
        for (int i = 0; i < C; i++) {
            B(i).n();
        }
    }

    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(zsb.class)) {
            super.p(parcelable);
            return;
        }
        zsb zsb = (zsb) parcelable;
        this.c1 = zsb.a;
        super.p(zsb.getSuperState());
    }

    public final Parcelable q() {
        this.S0 = true;
        return new zsb(AbsSavedState.EMPTY_STATE, this.c1);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
