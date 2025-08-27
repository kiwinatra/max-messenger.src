package com.my.tracker.obfuscated;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.view.Display;

public final class a0 {
    private z a;

    public static final class a {
        static final int a = (a() ? 1 : 0);

        /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
            r3.close();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0095 */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0090 A[SYNTHETIC, Splitter:B:41:0x0090] */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x00f8 A[SYNTHETIC, Splitter:B:74:0x00f8] */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x00fe A[SYNTHETIC, Splitter:B:80:0x00fe] */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0098 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean a() {
            /*
                java.lang.String r0 = android.os.Build.TAGS
                r1 = 1
                if (r0 == 0) goto L_0x000e
                java.lang.String r2 = "test-keys"
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto L_0x000e
                return r1
            L_0x000e:
                java.lang.String r10 = "/data/local/su"
                java.lang.String r11 = "/su/bin/su"
                java.lang.String r2 = "/system/app/Superuser.apk"
                java.lang.String r3 = "/sbin/su"
                java.lang.String r4 = "/system/bin/su"
                java.lang.String r5 = "/system/xbin/su"
                java.lang.String r6 = "/data/local/xbin/su"
                java.lang.String r7 = "/data/local/bin/su"
                java.lang.String r8 = "/system/sd/xbin/su"
                java.lang.String r9 = "/system/bin/failsafe/su"
                java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
                r2 = 0
                r3 = r2
            L_0x0028:
                r4 = 10
                if (r3 >= r4) goto L_0x003d
                r4 = r0[r3]
                java.io.File r5 = new java.io.File
                r5.<init>(r4)
                boolean r4 = r5.exists()
                if (r4 == 0) goto L_0x003a
                return r1
            L_0x003a:
                int r3 = r3 + 1
                goto L_0x0028
            L_0x003d:
                java.lang.String r0 = "/system/bin/which su"
                java.lang.String r3 = "which su"
                java.lang.String r4 = "/system/xbin/which su"
                java.lang.String[] r0 = new java.lang.String[]{r4, r0, r3}
                java.lang.Runtime r3 = java.lang.Runtime.getRuntime()
                r4 = r2
            L_0x004c:
                r5 = 0
                r6 = 3
                if (r4 >= r6) goto L_0x009b
                r6 = r0[r4]
                java.lang.Process r6 = r3.exec(r6)     // Catch:{ all -> 0x008d }
                java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ all -> 0x008e }
                java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ all -> 0x008e }
                java.io.InputStream r9 = r6.getInputStream()     // Catch:{ all -> 0x008e }
                r8.<init>(r9)     // Catch:{ all -> 0x008e }
                r7.<init>(r8)     // Catch:{ all -> 0x008e }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x008b }
                r5.<init>()     // Catch:{ all -> 0x008b }
            L_0x0069:
                java.lang.String r8 = r7.readLine()     // Catch:{ all -> 0x008b }
                if (r8 == 0) goto L_0x0073
                r5.append(r8)     // Catch:{ all -> 0x008b }
                goto L_0x0069
            L_0x0073:
                r6.destroy()     // Catch:{ all -> 0x008b }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x008b }
                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x008b }
                if (r5 != 0) goto L_0x0087
                r7.close()     // Catch:{ all -> 0x0083 }
            L_0x0083:
                r6.destroy()     // Catch:{ all -> 0x0086 }
            L_0x0086:
                return r1
            L_0x0087:
                r7.close()     // Catch:{ all -> 0x0095 }
                goto L_0x0095
            L_0x008b:
                r5 = r7
                goto L_0x008e
            L_0x008d:
                r6 = r5
            L_0x008e:
                if (r5 == 0) goto L_0x0093
                r5.close()     // Catch:{ all -> 0x0093 }
            L_0x0093:
                if (r6 == 0) goto L_0x0098
            L_0x0095:
                r6.destroy()     // Catch:{ all -> 0x0098 }
            L_0x0098:
                int r4 = r4 + 1
                goto L_0x004c
            L_0x009b:
                java.util.Locale r0 = java.util.Locale.US     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                int r0 = android.os.Process.myPid()     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                r3.<init>()     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                java.lang.String r4 = "/proc/"
                r3.append(r4)     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                r3.append(r0)     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                java.lang.String r0 = "/mounts"
                r3.append(r0)     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                r6.<init>(r0)     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                r4.<init>(r6)     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                java.lang.String r0 = "/sbin/.magisk/"
                java.lang.String r4 = "/sbin/.core/mirror"
                java.lang.String r5 = "/sbin/.core/img"
                java.lang.String r6 = "/sbin/.core/db-0/magisk.db"
                java.lang.String[] r0 = new java.lang.String[]{r0, r4, r5, r6}     // Catch:{ Exception -> 0x00f3, all -> 0x00eb }
            L_0x00d2:
                java.lang.String r4 = r3.readLine()     // Catch:{ Exception -> 0x00f3, all -> 0x00eb }
                if (r4 == 0) goto L_0x00ed
                r5 = r2
            L_0x00d9:
                r6 = 4
                if (r5 >= r6) goto L_0x00d2
                r6 = r0[r5]     // Catch:{ Exception -> 0x00f3, all -> 0x00eb }
                boolean r6 = r4.contains(r6)     // Catch:{ Exception -> 0x00f3, all -> 0x00eb }
                if (r6 == 0) goto L_0x00e8
                r3.close()     // Catch:{ all -> 0x00e7 }
            L_0x00e7:
                return r1
            L_0x00e8:
                int r5 = r5 + 1
                goto L_0x00d9
            L_0x00eb:
                r0 = move-exception
                goto L_0x00f1
            L_0x00ed:
                r3.close()     // Catch:{ all -> 0x0101 }
                goto L_0x0101
            L_0x00f1:
                r5 = r3
                goto L_0x00f6
            L_0x00f3:
                r5 = r3
                goto L_0x00fc
            L_0x00f5:
                r0 = move-exception
            L_0x00f6:
                if (r5 == 0) goto L_0x00fb
                r5.close()     // Catch:{ all -> 0x00fb }
            L_0x00fb:
                throw r0
            L_0x00fc:
                if (r5 == 0) goto L_0x0101
                r5.close()     // Catch:{ all -> 0x0101 }
            L_0x0101:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.a0.a.a():boolean");
        }
    }

    private static Point b(Context context) {
        Display display;
        try {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
                return null;
            }
            Point point = new Point();
            display.getRealSize(point);
            return point;
        } catch (Throwable th) {
            x2.a("DeviceParamsDataProvider: collecting screen size exception: ", th);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a1 A[Catch:{ all -> 0x00b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00da A[Catch:{ all -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0153 A[Catch:{ all -> 0x0160 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.my.tracker.obfuscated.z a(android.content.Context r35) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            java.lang.String r3 = ""
            com.my.tracker.obfuscated.z r0 = r1.a
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            java.lang.String r0 = "DeviceParamsDataProvider: collect application info..."
            com.my.tracker.obfuscated.x2.a((java.lang.String) r0)
            java.lang.String r7 = android.os.Build.DEVICE
            java.lang.String r12 = android.os.Build.MANUFACTURER
            java.lang.String r13 = android.os.Build.MODEL
            java.lang.String r8 = android.os.Build.VERSION.RELEASE
            r4 = 0
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r2.getSystemService(r0)     // Catch:{ all -> 0x0063 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x0067
            java.lang.String r5 = r0.getNetworkOperatorName()     // Catch:{ all -> 0x0063 }
            java.lang.String r6 = r0.getNetworkOperator()     // Catch:{ all -> 0x0044 }
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0044 }
            if (r9 != 0) goto L_0x0048
            int r9 = r6.length()     // Catch:{ all -> 0x0044 }
            r10 = 3
            if (r9 <= r10) goto L_0x0048
            java.lang.String r9 = r6.substring(r10)     // Catch:{ all -> 0x0044 }
            java.lang.String r6 = r6.substring(r4, r10)     // Catch:{ all -> 0x0041 }
            goto L_0x004a
        L_0x0041:
            r0 = move-exception
            r6 = r3
            goto L_0x0070
        L_0x0044:
            r0 = move-exception
            r6 = r3
        L_0x0046:
            r9 = r6
            goto L_0x0070
        L_0x0048:
            r9 = r6
            r6 = r3
        L_0x004a:
            int r10 = r0.getSimState()     // Catch:{ all -> 0x005e }
            r11 = 5
            if (r10 != r11) goto L_0x0060
            java.lang.String r0 = r0.getSimOperator()     // Catch:{ all -> 0x005e }
            r19 = r0
        L_0x0057:
            r18 = r5
            r16 = r6
            r17 = r9
            goto L_0x0076
        L_0x005e:
            r0 = move-exception
            goto L_0x0070
        L_0x0060:
            r19 = r3
            goto L_0x0057
        L_0x0063:
            r0 = move-exception
            r5 = r3
            r6 = r5
            goto L_0x0046
        L_0x0067:
            r16 = r3
            r17 = r16
            r18 = r17
            r19 = r18
            goto L_0x0076
        L_0x0070:
            java.lang.String r10 = "DeviceParamsDataProvider: collecting telephony exception: "
            com.my.tracker.obfuscated.x2.a(r10, r0)
            goto L_0x0060
        L_0x0076:
            java.lang.String r0 = r35.getPackageName()     // Catch:{ all -> 0x007c }
            r9 = r0
            goto L_0x0084
        L_0x007c:
            r0 = move-exception
            r5 = r0
            java.lang.String r0 = "DeviceParamsDataProvider: collecting packageName exception: "
            com.my.tracker.obfuscated.x2.a(r0, r5)
            r9 = r3
        L_0x0084:
            android.content.res.Resources r0 = r35.getResources()     // Catch:{ all -> 0x0094 }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ all -> 0x0094 }
            java.util.Locale r0 = r0.locale     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = r0.getLanguage()     // Catch:{ all -> 0x0094 }
            r15 = r0
            goto L_0x009b
        L_0x0094:
            r0 = move-exception
            java.lang.String r5 = "DeviceParamsDataProvider: collecting app lang exception: "
            com.my.tracker.obfuscated.x2.a(r5, r0)
            r15 = r3
        L_0x009b:
            android.content.pm.PackageInfo r0 = com.my.tracker.obfuscated.t.a(r35)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x00b3
            java.lang.String r5 = r0.versionName     // Catch:{ all -> 0x00b0 }
            long r10 = r0.getLongVersionCode()     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = java.lang.Long.toString(r10)     // Catch:{ all -> 0x00ae }
            r10 = r0
        L_0x00ac:
            r11 = r5
            goto L_0x00bd
        L_0x00ae:
            r0 = move-exception
            goto L_0x00b6
        L_0x00b0:
            r0 = move-exception
            r5 = r3
            goto L_0x00b6
        L_0x00b3:
            r10 = r3
            r11 = r10
            goto L_0x00bd
        L_0x00b6:
            java.lang.String r6 = "DeviceParamsDataProvider: collecting app package info exception: "
            com.my.tracker.obfuscated.x2.a(r6, r0)
            r10 = r3
            goto L_0x00ac
        L_0x00bd:
            android.graphics.Point r0 = b(r35)
            if (r0 == 0) goto L_0x00cc
            int r6 = r0.x
            int r0 = r0.y
            r22 = r0
            r21 = r6
            goto L_0x00d0
        L_0x00cc:
            r21 = -1
            r22 = -1
        L_0x00d0:
            android.content.res.Resources r0 = r35.getResources()     // Catch:{ all -> 0x00f5 }
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x00fc
            int r14 = r0.densityDpi     // Catch:{ all -> 0x00f5 }
            float r5 = r0.density     // Catch:{ all -> 0x00f1 }
            float r6 = r0.xdpi     // Catch:{ all -> 0x00ed }
            float r0 = r0.ydpi     // Catch:{ all -> 0x00eb }
            r27 = r0
            r25 = r5
            r26 = r6
            r23 = r14
            goto L_0x0111
        L_0x00eb:
            r0 = move-exception
            goto L_0x0105
        L_0x00ed:
            r0 = move-exception
        L_0x00ee:
            r6 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x0105
        L_0x00f1:
            r0 = move-exception
            r5 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x00ee
        L_0x00f5:
            r0 = move-exception
            r5 = 2143289344(0x7fc00000, float:NaN)
            r6 = 2143289344(0x7fc00000, float:NaN)
            r14 = -1
            goto L_0x0105
        L_0x00fc:
            r23 = -1
            r25 = 2143289344(0x7fc00000, float:NaN)
            r26 = 2143289344(0x7fc00000, float:NaN)
        L_0x0102:
            r27 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x0111
        L_0x0105:
            java.lang.String r4 = "DeviceParamsDataProvider: collecting display metrics exception: "
            com.my.tracker.obfuscated.x2.a(r4, r0)
            r25 = r5
            r26 = r6
            r23 = r14
            goto L_0x0102
        L_0x0111:
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()     // Catch:{ all -> 0x0135 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r4.<init>()     // Catch:{ all -> 0x0135 }
            r5 = 0
            java.lang.String r5 = r0.getDisplayName(r5, r5)     // Catch:{ all -> 0x0135 }
            r4.append(r5)     // Catch:{ all -> 0x0135 }
            java.lang.String r5 = " "
            r4.append(r5)     // Catch:{ all -> 0x0135 }
            java.lang.String r0 = r0.getID()     // Catch:{ all -> 0x0135 }
            r4.append(r0)     // Catch:{ all -> 0x0135 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0135 }
            r24 = r0
            goto L_0x013d
        L_0x0135:
            r0 = move-exception
            java.lang.String r4 = "DeviceParamsDataProvider: collecting timezone exception: "
            com.my.tracker.obfuscated.x2.a(r4, r0)
            r24 = r3
        L_0x013d:
            int r0 = com.my.tracker.obfuscated.a0.a.a     // Catch:{ all -> 0x0142 }
            r28 = r0
            goto L_0x014b
        L_0x0142:
            r0 = move-exception
            r4 = r0
            java.lang.String r0 = "DeviceParamsDataProvider: collecting isRooted exception: "
            com.my.tracker.obfuscated.x2.a(r0, r4)
            r28 = -1
        L_0x014b:
            r4 = -1
            java.io.File r0 = r35.getFilesDir()     // Catch:{ all -> 0x0160 }
            if (r0 == 0) goto L_0x0164
            long r29 = r0.getTotalSpace()     // Catch:{ all -> 0x0160 }
            long r4 = r0.getFreeSpace()     // Catch:{ all -> 0x015e }
        L_0x015b:
            r31 = r4
            goto L_0x016f
        L_0x015e:
            r0 = move-exception
            goto L_0x0169
        L_0x0160:
            r0 = move-exception
            r29 = r4
            goto L_0x0169
        L_0x0164:
            r29 = r4
            r31 = r29
            goto L_0x016f
        L_0x0169:
            java.lang.String r6 = "DeviceParamsDataProvider: collecting disk info exception: "
            com.my.tracker.obfuscated.x2.a(r6, r0)
            goto L_0x015b
        L_0x016f:
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ all -> 0x0179 }
            java.lang.String r3 = r0.getLanguage()     // Catch:{ all -> 0x0179 }
        L_0x0177:
            r14 = r3
            goto L_0x0180
        L_0x0179:
            r0 = move-exception
            java.lang.String r4 = "DeviceParamsDataProvider: collecting lang exception: "
            com.my.tracker.obfuscated.x2.a(r4, r0)
            goto L_0x0177
        L_0x0180:
            android.content.pm.PackageManager r0 = r35.getPackageManager()     // Catch:{ all -> 0x018c }
            java.lang.String r3 = "android.hardware.touchscreen"
            boolean r0 = r0.hasSystemFeature(r3)     // Catch:{ all -> 0x018c }
            r3 = r0
            goto L_0x0193
        L_0x018c:
            r0 = move-exception
            java.lang.String r3 = "DeviceParamsDataProvider: collecting touchscreen info exception: "
            com.my.tracker.obfuscated.x2.a(r3, r0)
            r3 = -1
        L_0x0193:
            java.lang.String r0 = "uimode"
            java.lang.Object r0 = r2.getSystemService(r0)     // Catch:{ all -> 0x01a2 }
            android.app.UiModeManager r0 = (android.app.UiModeManager) r0     // Catch:{ all -> 0x01a2 }
            int r0 = r0.getCurrentModeType()     // Catch:{ all -> 0x01a2 }
            r33 = r0
            goto L_0x01aa
        L_0x01a2:
            r0 = move-exception
            java.lang.String r4 = "DeviceParamsDataProvider: collecting ui mode info exception: "
            com.my.tracker.obfuscated.x2.a(r4, r0)
            r33 = -1
        L_0x01aa:
            java.lang.String r6 = com.my.tracker.obfuscated.c3.a(r35)
            com.my.tracker.obfuscated.z r0 = new com.my.tracker.obfuscated.z
            r4 = r0
            r5 = 3
            r20 = r24
            r24 = r25
            r25 = r26
            r26 = r27
            r27 = r28
            r28 = r29
            r30 = r31
            r32 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r32, r33)
            java.lang.String r2 = "DeviceParamsDataProvider: collected"
            com.my.tracker.obfuscated.x2.a((java.lang.String) r2)
            r1.a = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.a0.a(android.content.Context):com.my.tracker.obfuscated.z");
    }
}
