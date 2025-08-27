package defpackage;

/* renamed from: nyg  reason: default package */
public abstract class nyg {
    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0061 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.vyg a(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 1
            int r1 = r10.length()
            int r1 = r1 + r1
            if (r1 < 0) goto L_0x0099
            zyg r9 = (defpackage.zyg) r9
            boolean r1 = r9.c
            int r2 = r9.b
            java.security.MessageDigest r9 = r9.a
            if (r1 == 0) goto L_0x001e
            ur0 r1 = new ur0     // Catch:{ CloneNotSupportedException -> 0x001e }
            java.lang.Object r3 = r9.clone()     // Catch:{ CloneNotSupportedException -> 0x001e }
            java.security.MessageDigest r3 = (java.security.MessageDigest) r3     // Catch:{ CloneNotSupportedException -> 0x001e }
            r1.<init>((java.security.MessageDigest) r3, (int) r2)     // Catch:{ CloneNotSupportedException -> 0x001e }
            goto L_0x002b
        L_0x001e:
            ur0 r1 = new ur0
            java.lang.String r9 = r9.getAlgorithm()
            java.security.MessageDigest r9 = java.security.MessageDigest.getInstance(r9)     // Catch:{ NoSuchAlgorithmException -> 0x0092 }
            r1.<init>((java.security.MessageDigest) r9, (int) r2)
        L_0x002b:
            int r9 = r10.length()
            r2 = 0
            r3 = r2
        L_0x0031:
            java.lang.String r4 = "Cannot re-use a Hasher after calling hash() on it"
            java.lang.Object r5 = r1.e
            java.security.MessageDigest r5 = (java.security.MessageDigest) r5
            if (r3 >= r9) goto L_0x0061
            char r6 = r10.charAt(r3)
            java.lang.Object r7 = r1.d
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            r7.putChar(r6)
            byte[] r6 = r7.array()     // Catch:{ all -> 0x005c }
            boolean r8 = r1.c     // Catch:{ all -> 0x005c }
            r8 = r8 ^ r0
            if (r8 == 0) goto L_0x0056
            r4 = 2
            r5.update(r6, r2, r4)     // Catch:{ all -> 0x005c }
            r7.clear()
            int r3 = r3 + r0
            goto L_0x0031
        L_0x0056:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005c }
            r9.<init>(r4)     // Catch:{ all -> 0x005c }
            throw r9     // Catch:{ all -> 0x005c }
        L_0x005c:
            r9 = move-exception
            r7.clear()
            throw r9
        L_0x0061:
            boolean r9 = r1.c
            r9 = r9 ^ r0
            if (r9 == 0) goto L_0x008c
            r1.c = r0
            int r9 = r5.getDigestLength()
            int r10 = r1.b
            if (r10 != r9) goto L_0x007c
            byte[] r9 = r5.digest()
            char[] r10 = defpackage.wyg.a
            vyg r10 = new vyg
            r10.<init>(r9)
            goto L_0x008b
        L_0x007c:
            byte[] r9 = r5.digest()
            byte[] r9 = java.util.Arrays.copyOf(r9, r10)
            char[] r10 = defpackage.wyg.a
            vyg r10 = new vyg
            r10.<init>(r9)
        L_0x008b:
            return r10
        L_0x008c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r4)
            throw r9
        L_0x0092:
            r9 = move-exception
            java.lang.AssertionError r10 = new java.lang.AssertionError
            r10.<init>(r9)
            throw r10
        L_0x0099:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r0 = "expectedInputSize must be >= 0 but was %s"
            java.lang.String r10 = defpackage.b0h.R(r0, r10)
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nyg.a(java.lang.String):vyg");
    }
}
