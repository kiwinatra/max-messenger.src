package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* renamed from: iuf  reason: default package */
public abstract class iuf {
    public static final pf6 a = new pf6();
    public static final tb8 b = new tb8(16);

    public static Typeface a(Context context, k96[] k96Arr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        a.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (k96 k96 : k96Arr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(k96.a, "r", (CancellationSignal) null);
                    if (openFileDescriptor != null) {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(k96.c).setSlant(k96.d ? 1 : 0).setTtcIndex(k96.b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } else if (openFileDescriptor == null) {
                    }
                    openFileDescriptor.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(pf6.g(build2, i).getStyle()).build();
            throw th;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (r3.equals(r5) == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface b(android.content.Context r15, defpackage.f96 r16, android.content.res.Resources r17, int r18, java.lang.String r19, int r20, int r21, defpackage.vzg r22, boolean r23) {
        /*
            r0 = r16
            r6 = r21
            r1 = r22
            r7 = 5
            r2 = 12
            r8 = 2
            r9 = 1
            boolean r3 = r0 instanceof defpackage.i96
            r4 = 0
            r10 = 0
            r11 = -3
            if (r3 == 0) goto L_0x018a
            i96 r0 = (defpackage.i96) r0
            java.lang.String r3 = r0.d
            if (r3 == 0) goto L_0x0032
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x001f
            goto L_0x0032
        L_0x001f:
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r4)
            android.graphics.Typeface r5 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r4)
            if (r3 == 0) goto L_0x0032
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0032
            goto L_0x0033
        L_0x0032:
            r3 = r10
        L_0x0033:
            if (r3 == 0) goto L_0x0049
            if (r1 == 0) goto L_0x0048
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r0.<init>(r4)
            ovb r4 = new ovb
            r4.<init>(r2, r1, r3)
            r0.post(r4)
        L_0x0048:
            return r3
        L_0x0049:
            if (r23 == 0) goto L_0x0051
            int r2 = r0.c
            if (r2 != 0) goto L_0x0054
        L_0x004f:
            r4 = r9
            goto L_0x0054
        L_0x0051:
            if (r1 != 0) goto L_0x0054
            goto L_0x004f
        L_0x0054:
            r2 = -1
            if (r23 == 0) goto L_0x005b
            int r3 = r0.b
            r12 = r3
            goto L_0x005c
        L_0x005b:
            r12 = r2
        L_0x005c:
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r3.<init>(r5)
            syc r5 = new syc
            r13 = 9
            r5.<init>(r13)
            r5.b = r1
            soc r13 = r0.a
            p7d r14 = new p7d
            r14.<init>((int) r7, (java.lang.Object) r5, (java.lang.Object) r3)
            if (r4 == 0) goto L_0x00fa
            tb8 r0 = defpackage.d96.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r13.w
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = r0.toString()
            tb8 r0 = defpackage.d96.a
            java.lang.Object r0 = r0.c(r1)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x00a6
            vj6 r1 = new vj6
            r1.<init>((int) r8, (java.lang.Object) r5, (java.lang.Object) r0)
            r3.post(r1)
        L_0x00a3:
            r10 = r0
            goto L_0x0184
        L_0x00a6:
            if (r12 != r2) goto L_0x00b4
            r2 = r15
            c96 r0 = defpackage.d96.a(r1, r15, r13, r6)
            r14.C(r0)
            android.graphics.Typeface r10 = r0.a
            goto L_0x0184
        L_0x00b4:
            r2 = r15
            b96 r7 = new b96
            r5 = 0
            r0 = r7
            r3 = r13
            r4 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ThreadPoolExecutor r0 = defpackage.d96.b     // Catch:{ InterruptedException -> 0x00e8 }
            java.util.concurrent.Future r0 = r0.submit(r7)     // Catch:{ InterruptedException -> 0x00e8 }
            long r1 = (long) r12
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00d7, InterruptedException -> 0x00d5, TimeoutException -> 0x00d9 }
            java.lang.Object r0 = r0.get(r1, r3)     // Catch:{ ExecutionException -> 0x00d7, InterruptedException -> 0x00d5, TimeoutException -> 0x00d9 }
            c96 r0 = (defpackage.c96) r0     // Catch:{ InterruptedException -> 0x00e8 }
            r14.C(r0)     // Catch:{ InterruptedException -> 0x00e8 }
            android.graphics.Typeface r10 = r0.a     // Catch:{ InterruptedException -> 0x00e8 }
            goto L_0x0184
        L_0x00d5:
            r0 = move-exception
            goto L_0x00e1
        L_0x00d7:
            r0 = move-exception
            goto L_0x00e2
        L_0x00d9:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x00e8 }
            java.lang.String r1 = "timeout"
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x00e8 }
            throw r0     // Catch:{ InterruptedException -> 0x00e8 }
        L_0x00e1:
            throw r0     // Catch:{ InterruptedException -> 0x00e8 }
        L_0x00e2:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x00e8 }
            r1.<init>(r0)     // Catch:{ InterruptedException -> 0x00e8 }
            throw r1     // Catch:{ InterruptedException -> 0x00e8 }
        L_0x00e8:
            tk0 r0 = new tk0
            java.lang.Object r1 = r14.b
            syc r1 = (defpackage.syc) r1
            r0.<init>(r1, r11, r9)
            java.lang.Object r1 = r14.c
            android.os.Handler r1 = (android.os.Handler) r1
            r1.post(r0)
            goto L_0x0184
        L_0x00fa:
            r2 = r15
            tb8 r0 = defpackage.d96.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r13.w
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r11 = r0.toString()
            tb8 r0 = defpackage.d96.a
            java.lang.Object r0 = r0.c(r11)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x0129
            vj6 r1 = new vj6
            r1.<init>((int) r8, (java.lang.Object) r5, (java.lang.Object) r0)
            r3.post(r1)
            goto L_0x00a3
        L_0x0129:
            ez4 r0 = new ez4
            r0.<init>(r9, r14)
            java.lang.Object r3 = defpackage.d96.c
            monitor-enter(r3)
            qae r1 = defpackage.d96.d     // Catch:{ all -> 0x0140 }
            java.lang.Object r4 = r1.get(r11)     // Catch:{ all -> 0x0140 }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x0140 }
            if (r4 == 0) goto L_0x0142
            r4.add(r0)     // Catch:{ all -> 0x0140 }
            monitor-exit(r3)     // Catch:{ all -> 0x0140 }
            goto L_0x0184
        L_0x0140:
            r0 = move-exception
            goto L_0x0188
        L_0x0142:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0140 }
            r4.<init>()     // Catch:{ all -> 0x0140 }
            r4.add(r0)     // Catch:{ all -> 0x0140 }
            r1.put(r11, r4)     // Catch:{ all -> 0x0140 }
            monitor-exit(r3)     // Catch:{ all -> 0x0140 }
            b96 r9 = new b96
            r5 = 1
            r0 = r9
            r1 = r11
            r2 = r15
            r3 = r13
            r4 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ThreadPoolExecutor r0 = defpackage.d96.b
            ez4 r1 = new ez4
            r1.<init>(r8, r11)
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r2 != 0) goto L_0x0171
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            goto L_0x0176
        L_0x0171:
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
        L_0x0176:
            ij3 r3 = new ij3
            r3.<init>(r7)
            r3.b = r9
            r3.c = r1
            r3.o = r2
            r0.execute(r3)
        L_0x0184:
            r13 = r17
            goto L_0x0209
        L_0x0188:
            monitor-exit(r3)     // Catch:{ all -> 0x0140 }
            throw r0
        L_0x018a:
            pf6 r3 = a
            g96 r0 = (defpackage.g96) r0
            r3.getClass()
            h96[] r0 = r0.a     // Catch:{ Exception -> 0x01cb }
            int r3 = r0.length     // Catch:{ Exception -> 0x01cb }
            r5 = r10
        L_0x0195:
            if (r4 >= r3) goto L_0x01d2
            r7 = r0[r4]     // Catch:{ Exception -> 0x01cb }
            android.graphics.fonts.Font$Builder r8 = new android.graphics.fonts.Font$Builder     // Catch:{ IOException -> 0x01ce }
            int r12 = r7.e     // Catch:{ IOException -> 0x01ce }
            r13 = r17
            r8.<init>(r13, r12)     // Catch:{ IOException -> 0x01d0 }
            int r12 = r7.a     // Catch:{ IOException -> 0x01d0 }
            android.graphics.fonts.Font$Builder r8 = r8.setWeight(r12)     // Catch:{ IOException -> 0x01d0 }
            boolean r12 = r7.b     // Catch:{ IOException -> 0x01d0 }
            android.graphics.fonts.Font$Builder r8 = r8.setSlant(r12)     // Catch:{ IOException -> 0x01d0 }
            int r12 = r7.d     // Catch:{ IOException -> 0x01d0 }
            android.graphics.fonts.Font$Builder r8 = r8.setTtcIndex(r12)     // Catch:{ IOException -> 0x01d0 }
            java.lang.String r7 = r7.c     // Catch:{ IOException -> 0x01d0 }
            android.graphics.fonts.Font$Builder r7 = r8.setFontVariationSettings(r7)     // Catch:{ IOException -> 0x01d0 }
            android.graphics.fonts.Font r7 = r7.build()     // Catch:{ IOException -> 0x01d0 }
            if (r5 != 0) goto L_0x01c7
            android.graphics.fonts.FontFamily$Builder r8 = new android.graphics.fonts.FontFamily$Builder     // Catch:{ IOException -> 0x01d0 }
            r8.<init>(r7)     // Catch:{ IOException -> 0x01d0 }
            r5 = r8
            goto L_0x01d0
        L_0x01c7:
            r5.addFont(r7)     // Catch:{ IOException -> 0x01d0 }
            goto L_0x01d0
        L_0x01cb:
            r13 = r17
            goto L_0x01f0
        L_0x01ce:
            r13 = r17
        L_0x01d0:
            int r4 = r4 + r9
            goto L_0x0195
        L_0x01d2:
            r13 = r17
            if (r5 != 0) goto L_0x01d7
            goto L_0x01f0
        L_0x01d7:
            android.graphics.fonts.FontFamily r0 = r5.build()     // Catch:{ Exception -> 0x01f0 }
            android.graphics.Typeface$CustomFallbackBuilder r3 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch:{ Exception -> 0x01f0 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x01f0 }
            android.graphics.fonts.Font r0 = defpackage.pf6.g(r0, r6)     // Catch:{ Exception -> 0x01f0 }
            android.graphics.fonts.FontStyle r0 = r0.getStyle()     // Catch:{ Exception -> 0x01f0 }
            android.graphics.Typeface$CustomFallbackBuilder r0 = r3.setStyle(r0)     // Catch:{ Exception -> 0x01f0 }
            android.graphics.Typeface r10 = r0.build()     // Catch:{ Exception -> 0x01f0 }
        L_0x01f0:
            if (r1 == 0) goto L_0x0209
            if (r10 == 0) goto L_0x0206
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r0.<init>(r3)
            ovb r3 = new ovb
            r3.<init>(r2, r1, r10)
            r0.post(r3)
            goto L_0x0209
        L_0x0206:
            r1.e(r11)
        L_0x0209:
            if (r10 == 0) goto L_0x0214
            tb8 r0 = b
            java.lang.String r1 = d(r17, r18, r19, r20, r21)
            r0.d(r1, r10)
        L_0x0214:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iuf.b(android.content.Context, f96, android.content.res.Resources, int, java.lang.String, int, int, vzg, boolean):android.graphics.Typeface");
    }

    public static Typeface c(Resources resources, int i, String str, int i2, int i3) {
        Typeface typeface;
        a.getClass();
        try {
            Font build = new Font.Builder(resources, i).build();
            typeface = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            typeface = null;
        }
        if (typeface != null) {
            b.d(d(resources, i, str, i2, i3), typeface);
        }
        return typeface;
    }

    public static String d(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
