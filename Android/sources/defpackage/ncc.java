package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: ncc  reason: default package */
public abstract class ncc implements bj6 {
    public static jcc a(Context context, Bundle bundle) {
        boolean z = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] b = b(context, "androidx.camera.core.quirks.FORCE_ENABLED", bundle);
        String[] b2 = b(context, "androidx.camera.core.quirks.FORCE_DISABLED", bundle);
        Arrays.toString(b);
        Arrays.toString(b2);
        return new jcc(z, new HashSet(c(b)), new HashSet(c(b2)));
    }

    public static String[] b(Context context, String str, Bundle bundle) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException unused) {
            return new String[0];
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (defpackage.icc.class.isAssignableFrom(r3) != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.HashSet c(java.lang.String[] r5) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r5.length
            r2 = 0
        L_0x0007:
            if (r2 >= r1) goto L_0x0021
            r3 = r5[r2]
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x0018 }
            java.lang.Class<icc> r4 = defpackage.icc.class
            boolean r4 = r4.isAssignableFrom(r3)     // Catch:{ ClassNotFoundException -> 0x0018 }
            if (r4 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            if (r3 == 0) goto L_0x001e
            r0.add(r3)
        L_0x001e:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncc.c(java.lang.String[]):java.util.HashSet");
    }
}
