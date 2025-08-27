package defpackage;

import android.content.SharedPreferences;

/* renamed from: a87  reason: default package */
public final class a87 {
    public static final String[] c = {"*", "FCM", "GCM", ""};
    public final SharedPreferences a;
    public final String b;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
        if (r1.isEmpty() != false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a87(defpackage.hp5 r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.a()
            java.lang.String r0 = "com.google.android.gms.appid"
            r1 = 0
            android.content.Context r2 = r4.a
            android.content.SharedPreferences r0 = r2.getSharedPreferences(r0, r1)
            r3.a = r0
            r4.a()
            rp5 r0 = r4.c
            java.lang.String r1 = r0.e
            if (r1 == 0) goto L_0x001b
            goto L_0x0048
        L_0x001b:
            r4.a()
            java.lang.String r4 = "1:"
            java.lang.String r1 = r0.b
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L_0x0031
            java.lang.String r4 = "2:"
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L_0x0031
            goto L_0x0048
        L_0x0031:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r1.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L_0x003e
        L_0x003c:
            r1 = r2
            goto L_0x0048
        L_0x003e:
            r0 = 1
            r1 = r4[r0]
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x0048
            goto L_0x003c
        L_0x0048:
            r3.b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a87.<init>(hp5):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:17|18|19|20|21|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a() {
        /*
            r5 = this;
            android.content.SharedPreferences r0 = r5.a
            monitor-enter(r0)
            android.content.SharedPreferences r5 = r5.a     // Catch:{ all -> 0x0010 }
            java.lang.String r1 = "|S||P|"
            r2 = 0
            java.lang.String r5 = r5.getString(r1, r2)     // Catch:{ all -> 0x0010 }
            if (r5 != 0) goto L_0x0012
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            return r2
        L_0x0010:
            r5 = move-exception
            goto L_0x0053
        L_0x0012:
            r1 = 8
            byte[] r5 = android.util.Base64.decode(r5, r1)     // Catch:{ IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x0028 }
            java.lang.String r3 = "RSA"
            java.security.KeyFactory r3 = java.security.KeyFactory.getInstance(r3)     // Catch:{ IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x0028 }
            java.security.spec.X509EncodedKeySpec r4 = new java.security.spec.X509EncodedKeySpec     // Catch:{ IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x0028 }
            r4.<init>(r5)     // Catch:{ IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x0028 }
            java.security.PublicKey r5 = r3.generatePublic(r4)     // Catch:{ IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x0028 }
            goto L_0x002d
        L_0x0028:
            r5 = move-exception
            r5.toString()     // Catch:{ all -> 0x0010 }
            r5 = r2
        L_0x002d:
            if (r5 != 0) goto L_0x0031
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            return r2
        L_0x0031:
            byte[] r5 = r5.getEncoded()     // Catch:{ all -> 0x0010 }
            java.lang.String r3 = "SHA1"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch:{ NoSuchAlgorithmException -> 0x0051 }
            byte[] r5 = r3.digest(r5)     // Catch:{ NoSuchAlgorithmException -> 0x0051 }
            r3 = 0
            byte r4 = r5[r3]     // Catch:{ NoSuchAlgorithmException -> 0x0051 }
            r4 = r4 & 15
            int r4 = r4 + 112
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4     // Catch:{ NoSuchAlgorithmException -> 0x0051 }
            r5[r3] = r4     // Catch:{ NoSuchAlgorithmException -> 0x0051 }
            r4 = 11
            java.lang.String r2 = android.util.Base64.encodeToString(r5, r3, r1, r4)     // Catch:{ NoSuchAlgorithmException -> 0x0051 }
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            return r2
        L_0x0053:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a87.a():java.lang.String");
    }
}
