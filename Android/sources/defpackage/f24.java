package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.ConstantsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;

/* renamed from: f24  reason: default package */
public final class f24 {
    public static final cx4 b = new cx4(19);
    public static final ew2 c = new ew2(new ew2(ComparisonsKt__ComparisonsKt.nullsLast(new cx4(21)), 1), 2);
    public final Context a;

    public f24(Context context) {
        this.a = context;
    }

    public static a24 a(File file) {
        try {
            String name = file.getName();
            int m = StringsKt__StringsKt.lastIndexOf$default((CharSequence) name, '_', 0, false, 6, (Object) null);
            if (m >= 0) {
                int w = i2a.w(name.substring(0, m));
                long parseLong = Long.parseLong(name.substring(m + 1));
                File resolve = FilesKt.resolve(file, "system_info");
                if (resolve.exists()) {
                    File resolve2 = FilesKt.resolve(file, "stacktrace");
                    if (resolve2.exists()) {
                        File resolve3 = FilesKt.resolve(file, "tags");
                        File resolve4 = FilesKt.resolve(file, "all_stacktraces");
                        File resolve5 = FilesKt.resolve(file, "all_logs");
                        return new a24(parseLong, w, file.getPath(), resolve.getPath(), resolve3.getPath(), resolve2.getPath(), resolve4.getPath(), resolve5.getPath());
                    }
                    throw new IllegalStateException("No stacktrace file".toString());
                }
                throw new IllegalStateException("No system info file".toString());
            }
            throw new IllegalStateException(("Malformed directory name " + name).toString());
        } catch (Exception e) {
            FilesKt.deleteRecursively(file);
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        kotlin.io.CloseableKt.closeFinally(r1, r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.a24 b(int r10, java.lang.Throwable r11, defpackage.g8f r12, java.util.List r13, java.util.Map r14, java.util.List r15) {
        /*
            r9 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter
            r2.<init>(r0, r1)
            java.io.BufferedWriter r1 = new java.io.BufferedWriter
            r3 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r2, r3)
            defpackage.kv0.e(r11, r1)     // Catch:{ all -> 0x002b }
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x002b }
            r11 = 0
            kotlin.io.CloseableKt.closeFinally(r1, r11)
            byte[] r4 = r0.toByteArray()
            r2 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            a24 r9 = r2.c(r3, r4, r5, r6, r7, r8)
            return r9
        L_0x002b:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x002d }
        L_0x002d:
            r10 = move-exception
            kotlin.io.CloseableKt.closeFinally(r1, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f24.b(int, java.lang.Throwable, g8f, java.util.List, java.util.Map, java.util.List):a24");
    }

    /* JADX INFO: finally extract failed */
    public final a24 c(int i, byte[] bArr, g8f g8f, List list, Map map, List list2) {
        String str;
        String str2;
        Throwable th;
        Throwable th2;
        long currentTimeMillis = System.currentTimeMillis();
        String r = o54.r();
        Context context = this.a;
        if (Intrinsics.areEqual((Object) r, (Object) context.getPackageName())) {
            str = "tracer";
        } else {
            str = "tracer-" + Uri.encode(StringsKt__StringsJVMKt.replace$default(r, ':', '-', false, 4, (Object) null));
        }
        File resolve = FilesKt.resolve(new File(context.getCacheDir(), str), "crashes");
        StringBuilder sb = new StringBuilder();
        switch (i) {
            case 1:
                str2 = "CRASH";
                break;
            case 2:
                str2 = "NON_FATAL";
                break;
            case 3:
                str2 = "FATAL";
                break;
            case 4:
                str2 = "ERROR";
                break;
            case 5:
                str2 = "WARNING";
                break;
            case 6:
                str2 = "NOTICE";
                break;
            case 7:
                str2 = "INFO";
                break;
            case 8:
                str2 = "DEBUG";
                break;
            case 9:
                str2 = "MINIDUMP";
                break;
            case 10:
                str2 = "ANR";
                break;
            default:
                throw null;
        }
        sb.append(str2);
        sb.append('_');
        sb.append(currentTimeMillis);
        File resolve2 = FilesKt.resolve(resolve, sb.toString());
        if (resolve2.exists()) {
            resolve2.getName();
            return null;
        }
        try {
            f6e.y(resolve2);
            File resolve3 = FilesKt.resolve(resolve2, "stacktrace");
            FilesKt.writeBytes(resolve3, bArr);
            File resolve4 = FilesKt.resolve(resolve2, "system_info");
            FilesKt__FileReadWriteKt.writeText$default(resolve4, ld8.A0(g8f), (Charset) null, 2, (Object) null);
            File resolve5 = FilesKt.resolve(resolve2, "tags");
            if (!list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put((Object) (String) it.next());
                }
                FilesKt__FileReadWriteKt.writeText$default(resolve5, jSONArray.toString(), (Charset) null, 2, (Object) null);
            }
            File resolve6 = FilesKt.resolve(resolve2, "all_stacktraces");
            int i2 = 0;
            if (!map.isEmpty()) {
                SortedMap b2 = MapsKt__MapsJVMKt.toSortedMap(map, b);
                PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(resolve6), Charsets.UTF_8), ConstantsKt.DEFAULT_BUFFER_SIZE));
                try {
                    for (Map.Entry entry : b2.entrySet()) {
                        Thread thread = (Thread) entry.getKey();
                        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
                        printWriter.append("Thread: ").append(thread.getName()).append(" (").append(thread.getState().toString()).append(")");
                        printWriter.append(10);
                        for (StackTraceElement g : stackTraceElementArr) {
                            kv0.g(g, printWriter, 0, 6);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(printWriter, (Throwable) null);
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    CloseableKt.closeFinally(printWriter, th2);
                    throw th4;
                }
            }
            File resolve7 = FilesKt.resolve(resolve2, "all_logs");
            if (!list2.isEmpty()) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(resolve7), ConstantsKt.DEFAULT_BUFFER_SIZE);
                try {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((o78) it2.next()).a(bufferedOutputStream, i2);
                        i2++;
                    }
                    Unit unit2 = Unit.INSTANCE;
                    CloseableKt.closeFinally(bufferedOutputStream, (Throwable) null);
                } catch (Throwable th5) {
                    Throwable th6 = th5;
                    CloseableKt.closeFinally(bufferedOutputStream, th);
                    throw th6;
                }
            }
            return new a24(currentTimeMillis, i, resolve2.getPath(), resolve4.getPath(), resolve5.getPath(), resolve3.getPath(), resolve6.getPath(), resolve7.getPath());
        } catch (IOException unused) {
            FilesKt.deleteRecursively(resolve2);
            return null;
        }
    }
}
