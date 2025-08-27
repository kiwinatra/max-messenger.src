package defpackage;

import java.util.logging.Logger;

/* renamed from: cq9  reason: default package */
public final class cq9 {
    public static final Logger a = Logger.getLogger(cq9.class.getName());

    /* JADX WARNING: Removed duplicated region for block: B:31:0x005d A[SYNTHETIC, Splitter:B:31:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068 A[SYNTHETIC, Splitter:B:35:0x0068] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List a(java.io.InputStream r8) {
        /*
            java.util.logging.Logger r0 = a
            java.lang.String r1 = "Error closing input stream (ignored)"
            if (r8 != 0) goto L_0x000d
            java.util.List r8 = java.util.Collections.emptyList()
            java.util.List r8 = (java.util.List) r8
            return r8
        L_0x000d:
            r2 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r3.<init>(r8)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x0048 }
            r2.<init>()     // Catch:{ IOException -> 0x0048 }
            int r4 = r3.readInt()     // Catch:{ IOException -> 0x0048 }
            r5 = 0
        L_0x001d:
            if (r5 >= r4) goto L_0x002d
            reb r6 = new reb     // Catch:{ IOException -> 0x0048 }
            r6.<init>()     // Catch:{ IOException -> 0x0048 }
            r6.readExternal(r3)     // Catch:{ IOException -> 0x0048 }
            r2.add(r6)     // Catch:{ IOException -> 0x0048 }
            int r5 = r5 + 1
            goto L_0x001d
        L_0x002d:
            boolean r4 = r2.isEmpty()     // Catch:{ IOException -> 0x0048 }
            if (r4 != 0) goto L_0x003e
            r3.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x003d
        L_0x0037:
            r8 = move-exception
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r0.log(r3, r1, r8)
        L_0x003d:
            return r2
        L_0x003e:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0048 }
            java.lang.String r4 = "Empty metadata"
            r2.<init>(r4)     // Catch:{ IOException -> 0x0048 }
            throw r2     // Catch:{ IOException -> 0x0048 }
        L_0x0046:
            r2 = move-exception
            goto L_0x005b
        L_0x0048:
            r2 = move-exception
            goto L_0x0053
        L_0x004a:
            r3 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
            goto L_0x005b
        L_0x004f:
            r3 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
        L_0x0053:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0046 }
            java.lang.String r5 = "Unable to parse metadata file"
            r4.<init>(r5, r2)     // Catch:{ all -> 0x0046 }
            throw r4     // Catch:{ all -> 0x0046 }
        L_0x005b:
            if (r3 == 0) goto L_0x0068
            r3.close()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0072
        L_0x0061:
            r8 = move-exception
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r0.log(r3, r1, r8)
            goto L_0x0072
        L_0x0068:
            r8.close()     // Catch:{ IOException -> 0x006c }
            goto L_0x0072
        L_0x006c:
            r8 = move-exception
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r0.log(r3, r1, r8)
        L_0x0072:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq9.a(java.io.InputStream):java.util.List");
    }
}
