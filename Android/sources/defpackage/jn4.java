package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Locale;
import kotlin.collections.ArraysKt;

/* renamed from: jn4  reason: default package */
public final class jn4 {
    public static kn4 a(Context context) {
        int i;
        long j;
        kn4 kn4 = kn4.c;
        if (kn4 != null) {
            return kn4;
        }
        int i2 = Build.VERSION.SDK_INT;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        try {
            if (activityManager.isLowRamDevice()) {
                return kn4.o;
            }
            i = activityManager.getMemoryClass();
            if (Build.VERSION.SDK_INT >= 31 && Build.SOC_MODEL != null) {
                if (ArraysKt.contains(kn4.b, Build.SOC_MODEL.toUpperCase(Locale.getDefault()).hashCode())) {
                    return kn4.o;
                }
            }
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < availableProcessors; i5++) {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i5 + "/cpufreq/cpuinfo_max_freq", "r");
                    String readLine = randomAccessFile.readLine();
                    if (readLine != null) {
                        if (readLine.length() != 0) {
                            i4 += Integer.parseInt(readLine) / 1000;
                            i3++;
                        }
                    }
                    randomAccessFile.close();
                } catch (FileNotFoundException | IOException unused) {
                }
            }
            int ceil = i3 == 0 ? -1 : (int) Math.ceil(((double) i4) / ((double) i3));
            try {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                j = memoryInfo.totalMem;
            } catch (Throwable unused2) {
                j = -1;
            }
            kn4 kn42 = (availableProcessors <= 2 || i <= 100 || (availableProcessors <= 4 && ceil != -1 && ceil <= 1250) || (j != -1 && j < 2147483648L)) ? kn4.o : (availableProcessors < 8 || i <= 160 || (ceil != -1 && ceil <= 2050)) ? kn4.v : kn4.w;
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                w78 w78 = w78.o;
                String str = Build.MANUFACTURER;
                StringBuilder sb = new StringBuilder("selected_class = ");
                sb.append(kn42);
                sb.append(": (cpu_count = ");
                sb.append(availableProcessors);
                sb.append(", freq = ");
                g63.o(sb, ceil, ", memoryClass = ", i, ", android version ");
                sb.append(i2);
                sb.append(", manufacture ");
                sb.append(str);
                sb.append(")");
                a67.d(w78, "DevicePerformanceClass", sb.toString(), (Throwable) null);
            }
            kn4.c = kn42;
            return kn42;
        } catch (Throwable unused3) {
            i = 0;
        }
    }
}
