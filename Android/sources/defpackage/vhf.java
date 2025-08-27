package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: vhf  reason: default package */
public abstract class vhf {
    public static final int[] a = {edc.colorPrimary};
    public static final int[] b = {edc.colorPrimaryVariant};

    public static void a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tnc.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(tnc.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(edc.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, b, "Theme.MaterialComponents");
            }
        }
        c(context, a, "Theme.AppCompat");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r0.getResourceId(defpackage.tnc.ThemeEnforcement_android_textAppearance, -1) != -1) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.content.Context r5, android.util.AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        /*
            int[] r0 = defpackage.tnc.ThemeEnforcement
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0, r8, r9)
            int r1 = defpackage.tnc.ThemeEnforcement_enforceTextAppearance
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L_0x0013
            r0.recycle()
            return
        L_0x0013:
            int r1 = r10.length
            r3 = 1
            r4 = -1
            if (r1 != 0) goto L_0x0022
            int r5 = defpackage.tnc.ThemeEnforcement_android_textAppearance
            int r5 = r0.getResourceId(r5, r4)
            if (r5 == r4) goto L_0x003d
        L_0x0020:
            r2 = r3
            goto L_0x003d
        L_0x0022:
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7, r8, r9)
            int r6 = r10.length
            r7 = r2
        L_0x0028:
            if (r7 >= r6) goto L_0x0039
            r8 = r10[r7]
            int r8 = r5.getResourceId(r8, r4)
            if (r8 != r4) goto L_0x0036
            r5.recycle()
            goto L_0x003d
        L_0x0036:
            int r7 = r7 + 1
            goto L_0x0028
        L_0x0039:
            r5.recycle()
            goto L_0x0020
        L_0x003d:
            r0.recycle()
            if (r2 == 0) goto L_0x0043
            return
        L_0x0043:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhf.b(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int i = 0;
        while (i < iArr.length) {
            if (obtainStyledAttributes.hasValue(i)) {
                i++;
            } else {
                obtainStyledAttributes.recycle();
                throw new IllegalArgumentException(wj6.k("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static TypedArray d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        a(context, attributeSet, i, i2);
        b(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }
}
