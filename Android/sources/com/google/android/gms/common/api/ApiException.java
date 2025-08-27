package com.google.android.gms.common.api;

public class ApiException extends Exception {
    public final Status a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ApiException(com.google.android.gms.common.api.Status r4) {
        /*
            r3 = this;
            int r0 = r4.a
            java.lang.String r1 = r4.b
            if (r1 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            java.lang.String r1 = ""
        L_0x0009:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r3.<init>(r0)
            r3.a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.ApiException.<init>(com.google.android.gms.common.api.Status):void");
    }
}
