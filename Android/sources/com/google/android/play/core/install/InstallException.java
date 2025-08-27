package com.google.android.play.core.install;

import com.google.android.gms.common.api.ApiException;

public class InstallException extends ApiException {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public InstallException(int r8) {
        /*
            r7 = this;
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.util.HashMap r3 = defpackage.axg.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            boolean r5 = r3.containsKey(r4)
            if (r5 == 0) goto L_0x0045
            java.util.HashMap r5 = defpackage.axg.b
            boolean r6 = r5.containsKey(r4)
            if (r6 != 0) goto L_0x001f
            goto L_0x0045
        L_0x001f:
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#"
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = ")"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            goto L_0x0047
        L_0x0045:
            java.lang.String r3 = ""
        L_0x0047:
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "Install Error(%d): %s"
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)
            r2 = 0
            r0.<init>(r8, r1, r2, r2)
            r7.<init>(r0)
            if (r8 == 0) goto L_0x005b
            return
        L_0x005b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "errorCode should not be 0."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.install.InstallException.<init>(int):void");
    }
}
