package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;

public final class c extends e {
    public final hd5[] a;

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ef, code lost:
        r10.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(defpackage.id5 r18, defpackage.zvf r19) {
        /*
            r17 = this;
            java.lang.String r0 = ".so"
            r17.<init>()
            r1 = r18
            android.content.Context r1 = r1.d
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "/data/local/tmp/exopackage/"
            r3.<init>(r4)
            java.lang.String r1 = r1.getPackageName()
            r3.append(r1)
            java.lang.String r1 = "/native-libs/"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.lang.String[] r4 = com.facebook.soloader.SysUtil$MarshmallowSysdeps.getSupportedAbis()
            int r5 = r4.length
            r6 = 0
            r7 = r6
        L_0x0036:
            if (r7 >= r5) goto L_0x010e
            r8 = r4[r7]
            java.io.File r9 = new java.io.File
            r9.<init>(r2, r8)
            boolean r10 = r9.isDirectory()
            if (r10 != 0) goto L_0x0047
            goto L_0x00f2
        L_0x0047:
            r3.add(r8)
            java.io.File r8 = new java.io.File
            java.lang.String r10 = "metadata.txt"
            r8.<init>(r9, r10)
            boolean r10 = r8.isFile()
            if (r10 != 0) goto L_0x0059
            goto L_0x00f2
        L_0x0059:
            java.io.FileReader r10 = new java.io.FileReader
            r10.<init>(r8)
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ all -> 0x00f7 }
            r8.<init>(r10)     // Catch:{ all -> 0x00f7 }
        L_0x0063:
            java.lang.String r11 = r8.readLine()     // Catch:{ all -> 0x00ab }
            if (r11 == 0) goto L_0x00ec
            int r12 = r11.length()     // Catch:{ all -> 0x00ab }
            if (r12 != 0) goto L_0x0070
            goto L_0x0063
        L_0x0070:
            r12 = 32
            int r12 = r11.indexOf(r12)     // Catch:{ all -> 0x00ab }
            r13 = -1
            if (r12 == r13) goto L_0x00d0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r13.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r14 = r11.substring(r6, r12)     // Catch:{ all -> 0x00ab }
            r13.append(r14)     // Catch:{ all -> 0x00ab }
            r13.append(r0)     // Catch:{ all -> 0x00ab }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x00ab }
            int r14 = r1.size()     // Catch:{ all -> 0x00ab }
            r15 = r6
        L_0x0091:
            if (r15 >= r14) goto L_0x00ae
            java.lang.Object r16 = r1.get(r15)     // Catch:{ all -> 0x00ab }
            r6 = r16
            hd5 r6 = (defpackage.hd5) r6     // Catch:{ all -> 0x00ab }
            java.lang.Object r6 = r6.b     // Catch:{ all -> 0x00ab }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x00ab }
            boolean r6 = r6.equals(r13)     // Catch:{ all -> 0x00ab }
            if (r6 == 0) goto L_0x00a7
        L_0x00a5:
            r6 = 0
            goto L_0x0063
        L_0x00a7:
            int r15 = r15 + 1
            r6 = 0
            goto L_0x0091
        L_0x00ab:
            r0 = move-exception
            r1 = r0
            goto L_0x00fa
        L_0x00ae:
            int r12 = r12 + 1
            java.lang.String r6 = r11.substring(r12)     // Catch:{ all -> 0x00ab }
            r11 = 45
            int r11 = r6.indexOf(r11)     // Catch:{ all -> 0x00ab }
            int r12 = r6.indexOf(r0)     // Catch:{ all -> 0x00ab }
            java.lang.String r11 = r6.substring(r11, r12)     // Catch:{ all -> 0x00ab }
            hd5 r12 = new hd5     // Catch:{ all -> 0x00ab }
            java.io.File r14 = new java.io.File     // Catch:{ all -> 0x00ab }
            r14.<init>(r9, r6)     // Catch:{ all -> 0x00ab }
            r12.<init>(r13, r14, r11)     // Catch:{ all -> 0x00ab }
            r1.add(r12)     // Catch:{ all -> 0x00ab }
            goto L_0x00a5
        L_0x00d0:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00ab }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r1.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "illegal line in exopackage metadata: ["
            r1.append(r2)     // Catch:{ all -> 0x00ab }
            r1.append(r11)     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "]"
            r1.append(r2)     // Catch:{ all -> 0x00ab }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ab }
            r0.<init>(r1)     // Catch:{ all -> 0x00ab }
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x00ec:
            r8.close()     // Catch:{ all -> 0x00f7 }
            r10.close()
        L_0x00f2:
            int r7 = r7 + 1
            r6 = 0
            goto L_0x0036
        L_0x00f7:
            r0 = move-exception
            r1 = r0
            goto L_0x0104
        L_0x00fa:
            r8.close()     // Catch:{ all -> 0x00fe }
            goto L_0x0103
        L_0x00fe:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch:{ all -> 0x00f7 }
        L_0x0103:
            throw r1     // Catch:{ all -> 0x00f7 }
        L_0x0104:
            r10.close()     // Catch:{ all -> 0x0108 }
            goto L_0x010d
        L_0x0108:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)
        L_0x010d:
            throw r1
        L_0x010e:
            int r0 = r3.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r3.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r19.getClass()
            int r0 = r1.size()
            hd5[] r0 = new defpackage.hd5[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            hd5[] r0 = (defpackage.hd5[]) r0
            r1 = r17
            r1.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.c.<init>(id5, zvf):void");
    }

    public final fbf[] m() {
        return this.a;
    }

    public final void n(File file) {
        mm5 mm5;
        byte[] bArr = new byte[32768];
        hd5[] hd5Arr = this.a;
        int length = hd5Arr.length;
        int i = 0;
        while (i < length) {
            hd5 hd5 = hd5Arr[i];
            FileInputStream fileInputStream = new FileInputStream(hd5.v);
            try {
                mm5 = new mm5(2, hd5, fileInputStream);
                fileInputStream = null;
                e.a(mm5, bArr, file);
                mm5.close();
                i++;
            } catch (Throwable th) {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        }
        return;
        throw th;
    }
}
