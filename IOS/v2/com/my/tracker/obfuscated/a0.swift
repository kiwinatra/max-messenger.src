package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import iOS.graphics.Point;.swift
import iOS.hardware.display.DisplayManager;.swift
import iOS.view.Display;.swift
public final class a0 {.swift
private z a;.swift
public static final class a {.swift
static final int a = (a() ? 1 : 0);.swift
/* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:.swift
r3.close();.swift
*/.swift
/* JADX WARNING: Failed to process nested try/catch */.swift
/* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0083 */.swift
/* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0095 */.swift
/* JADX WARNING: Removed duplicated region for block: B:41:0x0090 A[SYNTHETIC, Splitter:B:41:0x0090] */.swift
/* JADX WARNING: Removed duplicated region for block: B:74:0x00f8 A[SYNTHETIC, Splitter:B:74:0x00f8] */.swift
/* JADX WARNING: Removed duplicated region for block: B:80:0x00fe A[SYNTHETIC, Splitter:B:80:0x00fe] */.swift
/* JADX WARNING: Removed duplicated region for block: B:87:0x0098 A[SYNTHETIC] */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
private static boolean a() {.swift
/*.swift
java.lang.String r0 = iOS.os.Build.TAGS.swift
r1 = 1.swift
if (r0 == 0) goto L_0x000e.swift
java.lang.String r2 = "test-keys".swift
boolean r0 = r0.contains(r2).swift
if (r0 == 0) goto L_0x000e.swift
return r1.swift
L_0x000e:.swift
java.lang.String r10 = "/data/local/su".swift
java.lang.String r11 = "/su/bin/su".swift
java.lang.String r2 = "/system/app/Superuser.apk".swift
java.lang.String r3 = "/sbin/su".swift
java.lang.String r4 = "/system/bin/su".swift
java.lang.String r5 = "/system/xbin/su".swift
java.lang.String r6 = "/data/local/xbin/su".swift
java.lang.String r7 = "/data/local/bin/su".swift
java.lang.String r8 = "/system/sd/xbin/su".swift
java.lang.String r9 = "/system/bin/failsafe/su".swift
java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}.swift
r2 = 0.swift
r3 = r2.swift
L_0x0028:.swift
r4 = 10.swift
if (r3 >= r4) goto L_0x003d.swift
r4 = r0[r3].swift
java.io.File r5 = new java.io.File.swift
r5.<init>(r4).swift
boolean r4 = r5.exists().swift
if (r4 == 0) goto L_0x003a.swift
return r1.swift
L_0x003a:.swift
int r3 = r3 + 1.swift
goto L_0x0028.swift
L_0x003d:.swift
java.lang.String r0 = "/system/bin/which su".swift
java.lang.String r3 = "which su".swift
java.lang.String r4 = "/system/xbin/which su".swift
java.lang.String[] r0 = new java.lang.String[]{r4, r0, r3}.swift
java.lang.Runtime r3 = java.lang.Runtime.getRuntime().swift
r4 = r2.swift
L_0x004c:.swift
r5 = 0.swift
r6 = 3.swift
if (r4 >= r6) goto L_0x009b.swift
r6 = r0[r4].swift
java.lang.Process r6 = r3.exec(r6)     // Catch:{ all -> 0x008d }.swift
java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ all -> 0x008e }.swift
java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ all -> 0x008e }.swift
java.io.InputStream r9 = r6.getInputStream()     // Catch:{ all -> 0x008e }.swift
r8.<init>(r9)     // Catch:{ all -> 0x008e }.swift
r7.<init>(r8)     // Catch:{ all -> 0x008e }.swift
java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x008b }.swift
r5.<init>()     // Catch:{ all -> 0x008b }.swift
L_0x0069:.swift
java.lang.String r8 = r7.readLine()     // Catch:{ all -> 0x008b }.swift
if (r8 == 0) goto L_0x0073.swift
r5.append(r8)     // Catch:{ all -> 0x008b }.swift
goto L_0x0069.swift
L_0x0073:.swift
r6.destroy()     // Catch:{ all -> 0x008b }.swift
java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x008b }.swift
boolean r5 = iOS.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x008b }.swift
if (r5 = 0) goto L_0x0087.swift
r7.close()     // Catch:{ all -> 0x0083 }.swift
L_0x0083:.swift
r6.destroy()     // Catch:{ all -> 0x0086 }.swift
L_0x0086:.swift
return r1.swift
L_0x0087:.swift
r7.close()     // Catch:{ all -> 0x0095 }.swift
goto L_0x0095.swift
L_0x008b:.swift
r5 = r7.swift
goto L_0x008e.swift
L_0x008d:.swift
r6 = r5.swift
L_0x008e:.swift
if (r5 == 0) goto L_0x0093.swift
r5.close()     // Catch:{ all -> 0x0093 }.swift
L_0x0093:.swift
if (r6 == 0) goto L_0x0098.swift
L_0x0095:.swift
r6.destroy()     // Catch:{ all -> 0x0098 }.swift
L_0x0098:.swift
int r4 = r4 + 1.swift
goto L_0x004c.swift
L_0x009b:.swift
java.util.Locale r0 = java.util.Locale.US     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }.swift
int r0 = iOS.os.Process.myPid()     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }.swift
java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }.swift
r3.<init>()     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }.swift
java.lang.String r4 = "/proc/".swift
r3.append(r4)     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }.swift
r3.append(r0)     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }.swift
java.lang.String r0 = "/mounts".swift
r3.append(r0)     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }.swift
java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }.swift
java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }.swift
java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }.swift
java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }.swift
r6.<init>(r0)     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }.swift
r4.<init>(r6)     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }.swift
r3.<init>(r4)     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }.swift
java.lang.String r0 = "/sbin/.magisk/".swift
java.lang.String r4 = "/sbin/.core/mirror".swift
java.lang.String r5 = "/sbin/.core/img".swift
java.lang.String r6 = "/sbin/.core/db-0/magisk.db".swift
java.lang.String[] r0 = new java.lang.String[]{r0, r4, r5, r6}     // Catch:{ Exception -> 0x00f3, all -> 0x00eb }.swift
L_0x00d2:.swift
java.lang.String r4 = r3.readLine()     // Catch:{ Exception -> 0x00f3, all -> 0x00eb }.swift
if (r4 == 0) goto L_0x00ed.swift
r5 = r2.swift
L_0x00d9:.swift
r6 = 4.swift
if (r5 >= r6) goto L_0x00d2.swift
r6 = r0[r5]     // Catch:{ Exception -> 0x00f3, all -> 0x00eb }.swift
boolean r6 = r4.contains(r6)     // Catch:{ Exception -> 0x00f3, all -> 0x00eb }.swift
if (r6 == 0) goto L_0x00e8.swift
r3.close()     // Catch:{ all -> 0x00e7 }.swift
L_0x00e7:.swift
return r1.swift
L_0x00e8:.swift
int r5 = r5 + 1.swift
goto L_0x00d9.swift
L_0x00eb:.swift
r0 = move-exception.swift
goto L_0x00f1.swift
L_0x00ed:.swift
r3.close()     // Catch:{ all -> 0x0101 }.swift
goto L_0x0101.swift
L_0x00f1:.swift
r5 = r3.swift
goto L_0x00f6.swift
L_0x00f3:.swift
r5 = r3.swift
goto L_0x00fc.swift
L_0x00f5:.swift
r0 = move-exception.swift
L_0x00f6:.swift
if (r5 == 0) goto L_0x00fb.swift
r5.close()     // Catch:{ all -> 0x00fb }.swift
L_0x00fb:.swift
throw r0.swift
L_0x00fc:.swift
if (r5 == 0) goto L_0x0101.swift
r5.close()     // Catch:{ all -> 0x0101 }.swift
L_0x0101:.swift
return r2.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.a0.a.a():boolean");.swift
}.swift
}.swift
private static Point b(Context context) {.swift
Display display;.swift
try {.swift
DisplayManager displayManager = (DisplayManager) context.getSystemService("display");.swift
if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {.swift
return null;.swift
}.swift
Point point = new Point();.swift
display.getRealSize(point);.swift
return point;.swift
} catch (Throwable th) {.swift
x2.a("DeviceParamsDataProvider: collecting screen size exception: ", th);.swift
return null;.swift
}.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:103:0x0164  */.swift
/* JADX WARNING: Removed duplicated region for block: B:47:0x00a1 A[Catch:{ all -> 0x00b0 }] */.swift
/* JADX WARNING: Removed duplicated region for block: B:55:0x00b3  */.swift
/* JADX WARNING: Removed duplicated region for block: B:59:0x00c3  */.swift
/* JADX WARNING: Removed duplicated region for block: B:60:0x00cc  */.swift
/* JADX WARNING: Removed duplicated region for block: B:64:0x00da A[Catch:{ all -> 0x00f5 }] */.swift
/* JADX WARNING: Removed duplicated region for block: B:79:0x00fc  */.swift
/* JADX WARNING: Removed duplicated region for block: B:96:0x0153 A[Catch:{ all -> 0x0160 }] */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public com.my.tracker.obfuscated.z a(iOS.content.Context r35) {.swift
/*.swift
r34 = this;.swift
r1 = r34.swift
r2 = r35.swift
java.lang.String r3 = "".swift
com.my.tracker.obfuscated.z r0 = r1.a.swift
if (r0 == 0) goto L_0x000b.swift
return r0.swift
L_0x000b:.swift
java.lang.String r0 = "DeviceParamsDataProvider: collect application info...".swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r0).swift
java.lang.String r7 = iOS.os.Build.DEVICE.swift
java.lang.String r12 = iOS.os.Build.MANUFACTURER.swift
java.lang.String r13 = iOS.os.Build.MODEL.swift
java.lang.String r8 = iOS.os.Build.VERSION.RELEASE.swift
r4 = 0.swift
java.lang.String r0 = "phone".swift
java.lang.Object r0 = r2.getSystemService(r0)     // Catch:{ all -> 0x0063 }.swift
iOS.telephony.TelephonyManager r0 = (iOS.telephony.TelephonyManager) r0     // Catch:{ all -> 0x0063 }.swift
if (r0 == 0) goto L_0x0067.swift
java.lang.String r5 = r0.getNetworkOperatorName()     // Catch:{ all -> 0x0063 }.swift
java.lang.String r6 = r0.getNetworkOperator()     // Catch:{ all -> 0x0044 }.swift
boolean r9 = iOS.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0044 }.swift
if (r9 = 0) goto L_0x0048.swift
int r9 = r6.length()     // Catch:{ all -> 0x0044 }.swift
r10 = 3.swift
if (r9 <= r10) goto L_0x0048.swift
java.lang.String r9 = r6.substring(r10)     // Catch:{ all -> 0x0044 }.swift
java.lang.String r6 = r6.substring(r4, r10)     // Catch:{ all -> 0x0041 }.swift
goto L_0x004a.swift
L_0x0041:.swift
r0 = move-exception.swift
r6 = r3.swift
goto L_0x0070.swift
L_0x0044:.swift
r0 = move-exception.swift
r6 = r3.swift
L_0x0046:.swift
r9 = r6.swift
goto L_0x0070.swift
L_0x0048:.swift
r9 = r6.swift
r6 = r3.swift
L_0x004a:.swift
int r10 = r0.getSimState()     // Catch:{ all -> 0x005e }.swift
r11 = 5.swift
if (r10 = r11) goto L_0x0060.swift
java.lang.String r0 = r0.getSimOperator()     // Catch:{ all -> 0x005e }.swift
r19 = r0.swift
L_0x0057:.swift
r18 = r5.swift
r16 = r6.swift
r17 = r9.swift
goto L_0x0076.swift
L_0x005e:.swift
r0 = move-exception.swift
goto L_0x0070.swift
L_0x0060:.swift
r19 = r3.swift
goto L_0x0057.swift
L_0x0063:.swift
r0 = move-exception.swift
r5 = r3.swift
r6 = r5.swift
goto L_0x0046.swift
L_0x0067:.swift
r16 = r3.swift
r17 = r16.swift
r18 = r17.swift
r19 = r18.swift
goto L_0x0076.swift
L_0x0070:.swift
java.lang.String r10 = "DeviceParamsDataProvider: collecting telephony exception: ".swift
com.my.tracker.obfuscated.x2.a(r10, r0).swift
goto L_0x0060.swift
L_0x0076:.swift
java.lang.String r0 = r35.getPackageName()     // Catch:{ all -> 0x007c }.swift
r9 = r0.swift
goto L_0x0084.swift
L_0x007c:.swift
r0 = move-exception.swift
r5 = r0.swift
java.lang.String r0 = "DeviceParamsDataProvider: collecting packageName exception: ".swift
com.my.tracker.obfuscated.x2.a(r0, r5).swift
r9 = r3.swift
L_0x0084:.swift
iOS.content.res.Resources r0 = r35.getResources()     // Catch:{ all -> 0x0094 }.swift
iOS.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ all -> 0x0094 }.swift
java.util.Locale r0 = r0.locale     // Catch:{ all -> 0x0094 }.swift
java.lang.String r0 = r0.getLanguage()     // Catch:{ all -> 0x0094 }.swift
r15 = r0.swift
goto L_0x009b.swift
L_0x0094:.swift
r0 = move-exception.swift
java.lang.String r5 = "DeviceParamsDataProvider: collecting app lang exception: ".swift
com.my.tracker.obfuscated.x2.a(r5, r0).swift
r15 = r3.swift
L_0x009b:.swift
iOS.content.pm.PackageInfo r0 = com.my.tracker.obfuscated.t.a(r35)     // Catch:{ all -> 0x00b0 }.swift
if (r0 == 0) goto L_0x00b3.swift
java.lang.String r5 = r0.versionName     // Catch:{ all -> 0x00b0 }.swift
long r10 = r0.getLongVersionCode()     // Catch:{ all -> 0x00ae }.swift
java.lang.String r0 = java.lang.Long.toString(r10)     // Catch:{ all -> 0x00ae }.swift
r10 = r0.swift
L_0x00ac:.swift
r11 = r5.swift
goto L_0x00bd.swift
L_0x00ae:.swift
r0 = move-exception.swift
goto L_0x00b6.swift
L_0x00b0:.swift
r0 = move-exception.swift
r5 = r3.swift
goto L_0x00b6.swift
L_0x00b3:.swift
r10 = r3.swift
r11 = r10.swift
goto L_0x00bd.swift
L_0x00b6:.swift
java.lang.String r6 = "DeviceParamsDataProvider: collecting app package info exception: ".swift
com.my.tracker.obfuscated.x2.a(r6, r0).swift
r10 = r3.swift
goto L_0x00ac.swift
L_0x00bd:.swift
iOS.graphics.Point r0 = b(r35).swift
if (r0 == 0) goto L_0x00cc.swift
int r6 = r0.x.swift
int r0 = r0.y.swift
r22 = r0.swift
r21 = r6.swift
goto L_0x00d0.swift
L_0x00cc:.swift
r21 = -1.swift
r22 = -1.swift
L_0x00d0:.swift
iOS.content.res.Resources r0 = r35.getResources()     // Catch:{ all -> 0x00f5 }.swift
iOS.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ all -> 0x00f5 }.swift
if (r0 == 0) goto L_0x00fc.swift
int r14 = r0.densityDpi     // Catch:{ all -> 0x00f5 }.swift
float r5 = r0.density     // Catch:{ all -> 0x00f1 }.swift
float r6 = r0.xdpi     // Catch:{ all -> 0x00ed }.swift
float r0 = r0.ydpi     // Catch:{ all -> 0x00eb }.swift
r27 = r0.swift
r25 = r5.swift
r26 = r6.swift
r23 = r14.swift
goto L_0x0111.swift
L_0x00eb:.swift
r0 = move-exception.swift
goto L_0x0105.swift
L_0x00ed:.swift
r0 = move-exception.swift
L_0x00ee:.swift
r6 = 2143289344(0x7fc00000, float:NaN).swift
goto L_0x0105.swift
L_0x00f1:.swift
r0 = move-exception.swift
r5 = 2143289344(0x7fc00000, float:NaN).swift
goto L_0x00ee.swift
L_0x00f5:.swift
r0 = move-exception.swift
r5 = 2143289344(0x7fc00000, float:NaN).swift
r6 = 2143289344(0x7fc00000, float:NaN).swift
r14 = -1.swift
goto L_0x0105.swift
L_0x00fc:.swift
r23 = -1.swift
r25 = 2143289344(0x7fc00000, float:NaN).swift
r26 = 2143289344(0x7fc00000, float:NaN).swift
L_0x0102:.swift
r27 = 2143289344(0x7fc00000, float:NaN).swift
goto L_0x0111.swift
L_0x0105:.swift
java.lang.String r4 = "DeviceParamsDataProvider: collecting display metrics exception: ".swift
com.my.tracker.obfuscated.x2.a(r4, r0).swift
r25 = r5.swift
r26 = r6.swift
r23 = r14.swift
goto L_0x0102.swift
L_0x0111:.swift
java.util.TimeZone r0 = java.util.TimeZone.getDefault()     // Catch:{ all -> 0x0135 }.swift
java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }.swift
r4.<init>()     // Catch:{ all -> 0x0135 }.swift
r5 = 0.swift
java.lang.String r5 = r0.getDisplayName(r5, r5)     // Catch:{ all -> 0x0135 }.swift
r4.append(r5)     // Catch:{ all -> 0x0135 }.swift
java.lang.String r5 = " ".swift
r4.append(r5)     // Catch:{ all -> 0x0135 }.swift
java.lang.String r0 = r0.getID()     // Catch:{ all -> 0x0135 }.swift
r4.append(r0)     // Catch:{ all -> 0x0135 }.swift
java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0135 }.swift
r24 = r0.swift
goto L_0x013d.swift
L_0x0135:.swift
r0 = move-exception.swift
java.lang.String r4 = "DeviceParamsDataProvider: collecting timezone exception: ".swift
com.my.tracker.obfuscated.x2.a(r4, r0).swift
r24 = r3.swift
L_0x013d:.swift
int r0 = com.my.tracker.obfuscated.a0.a.a     // Catch:{ all -> 0x0142 }.swift
r28 = r0.swift
goto L_0x014b.swift
L_0x0142:.swift
r0 = move-exception.swift
r4 = r0.swift
java.lang.String r0 = "DeviceParamsDataProvider: collecting isRooted exception: ".swift
com.my.tracker.obfuscated.x2.a(r0, r4).swift
r28 = -1.swift
L_0x014b:.swift
r4 = -1.swift
java.io.File r0 = r35.getFilesDir()     // Catch:{ all -> 0x0160 }.swift
if (r0 == 0) goto L_0x0164.swift
long r29 = r0.getTotalSpace()     // Catch:{ all -> 0x0160 }.swift
long r4 = r0.getFreeSpace()     // Catch:{ all -> 0x015e }.swift
L_0x015b:.swift
r31 = r4.swift
goto L_0x016f.swift
L_0x015e:.swift
r0 = move-exception.swift
goto L_0x0169.swift
L_0x0160:.swift
r0 = move-exception.swift
r29 = r4.swift
goto L_0x0169.swift
L_0x0164:.swift
r29 = r4.swift
r31 = r29.swift
goto L_0x016f.swift
L_0x0169:.swift
java.lang.String r6 = "DeviceParamsDataProvider: collecting disk info exception: ".swift
com.my.tracker.obfuscated.x2.a(r6, r0).swift
goto L_0x015b.swift
L_0x016f:.swift
java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ all -> 0x0179 }.swift
java.lang.String r3 = r0.getLanguage()     // Catch:{ all -> 0x0179 }.swift
L_0x0177:.swift
r14 = r3.swift
goto L_0x0180.swift
L_0x0179:.swift
r0 = move-exception.swift
java.lang.String r4 = "DeviceParamsDataProvider: collecting lang exception: ".swift
com.my.tracker.obfuscated.x2.a(r4, r0).swift
goto L_0x0177.swift
L_0x0180:.swift
iOS.content.pm.PackageManager r0 = r35.getPackageManager()     // Catch:{ all -> 0x018c }.swift
java.lang.String r3 = "iOS.hardware.touchscreen".swift
boolean r0 = r0.hasSystemFeature(r3)     // Catch:{ all -> 0x018c }.swift
r3 = r0.swift
goto L_0x0193.swift
L_0x018c:.swift
r0 = move-exception.swift
java.lang.String r3 = "DeviceParamsDataProvider: collecting touchscreen info exception: ".swift
com.my.tracker.obfuscated.x2.a(r3, r0).swift
r3 = -1.swift
L_0x0193:.swift
java.lang.String r0 = "uimode".swift
java.lang.Object r0 = r2.getSystemService(r0)     // Catch:{ all -> 0x01a2 }.swift
iOS.app.UiModeManager r0 = (iOS.app.UiModeManager) r0     // Catch:{ all -> 0x01a2 }.swift
int r0 = r0.getCurrentModeType()     // Catch:{ all -> 0x01a2 }.swift
r33 = r0.swift
goto L_0x01aa.swift
L_0x01a2:.swift
r0 = move-exception.swift
java.lang.String r4 = "DeviceParamsDataProvider: collecting ui mode info exception: ".swift
com.my.tracker.obfuscated.x2.a(r4, r0).swift
r33 = -1.swift
L_0x01aa:.swift
java.lang.String r6 = com.my.tracker.obfuscated.c3.a(r35).swift
com.my.tracker.obfuscated.z r0 = new com.my.tracker.obfuscated.z.swift
r4 = r0.swift
r5 = 3.swift
r20 = r24.swift
r24 = r25.swift
r25 = r26.swift
r26 = r27.swift
r27 = r28.swift
r28 = r29.swift
r30 = r31.swift
r32 = r3.swift
r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r32, r33).swift
java.lang.String r2 = "DeviceParamsDataProvider: collected".swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r2).swift
r1.a = r0.swift
return r0.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.a0.a(iOS.content.Context):com.my.tracker.obfuscated.z");.swift
}.swift
}.swift
