package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public abstract class DialogPreference extends Preference {
    public final CharSequence W0;
    public final String X0;
    public final Drawable Y0;
    public final String Z0;
    public final String a1;
    public final int b1;

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nnc.DialogPreference, i, 0);
        int i2 = nnc.DialogPreference_dialogTitle;
        int i3 = nnc.DialogPreference_android_dialogTitle;
        String string = obtainStyledAttributes.getString(i2);
        string = string == null ? obtainStyledAttributes.getString(i3) : string;
        this.W0 = string;
        if (string == null) {
            this.W0 = this.y;
        }
        int i4 = nnc.DialogPreference_dialogMessage;
        int i5 = nnc.DialogPreference_android_dialogMessage;
        String string2 = obtainStyledAttributes.getString(i4);
        this.X0 = string2 == null ? obtainStyledAttributes.getString(i5) : string2;
        int i6 = nnc.DialogPreference_dialogIcon;
        int i7 = nnc.DialogPreference_android_dialogIcon;
        Drawable drawable = obtainStyledAttributes.getDrawable(i6);
        this.Y0 = drawable == null ? obtainStyledAttributes.getDrawable(i7) : drawable;
        int i8 = nnc.DialogPreference_positiveButtonText;
        int i9 = nnc.DialogPreference_android_positiveButtonText;
        String string3 = obtainStyledAttributes.getString(i8);
        this.Z0 = string3 == null ? obtainStyledAttributes.getString(i9) : string3;
        int i10 = nnc.DialogPreference_negativeButtonText;
        int i11 = nnc.DialogPreference_android_negativeButtonText;
        String string4 = obtainStyledAttributes.getString(i10);
        this.a1 = string4 == null ? obtainStyledAttributes.getString(i11) : string4;
        this.b1 = obtainStyledAttributes.getResourceId(nnc.DialogPreference_dialogLayout, obtainStyledAttributes.getResourceId(nnc.DialogPreference_android_dialogLayout, 0));
        obtainStyledAttributes.recycle();
    }

    public void m() {
        PreferenceFragmentCompat preferenceFragmentCompat = this.b.i;
        if (preferenceFragmentCompat != null) {
            preferenceFragmentCompat.U2(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b0h.s(cdc.dialogPreferenceStyle, 16842897, context));
    }
}
