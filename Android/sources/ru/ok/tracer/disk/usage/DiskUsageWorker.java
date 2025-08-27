package ru.ok.tracer.disk.usage;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tracer/disk/usage/DiskUsageWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "wp4", "tracer-disk-usage_release"}, k = 1, mv = {1, 7, 1})
public final class DiskUsageWorker extends Worker {
    public final Lazy b = LazyKt.lazy(ds.c);

    public DiskUsageWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String c(LinkedHashMap linkedHashMap, long j) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            jSONObject2.put(((us6) entry.getKey()).a, (Object) d((wp4) entry.getValue()));
        }
        jSONObject.put("consumers", (Object) jSONObject2);
        jSONObject.put("total_size", j);
        return jSONObject.toString();
    }

    public static JSONObject d(wp4 wp4) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("size", wp4.a);
        jSONObject.put("name", (Object) wp4.b);
        if (wp4.c) {
            jSONObject.put("is_dir", true);
        }
        if (wp4.e) {
            jSONObject.put("is_overflow", true);
        }
        if (wp4.f) {
            jSONObject.put("is_excluded", true);
        }
        List list = wp4.d;
        if (!list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterable<wp4> iterable = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (wp4 d : iterable) {
                arrayList.add(jSONArray.put((Object) d(d)));
            }
            jSONObject.put("children", (Object) jSONArray);
        }
        return jSONObject;
    }

    public static wp4 g(File file, int i, ArrayList arrayList) {
        boolean z;
        List<wp4> list;
        List list2;
        boolean z2;
        boolean z3;
        List list3;
        int i2 = i;
        File file2 = file;
        ArrayList arrayList2 = arrayList;
        if (arrayList2.contains(file2)) {
            Objects.toString(file);
            return new wp4(0, file.getName(), false, (List) null, false, true, 28);
        } else if (!file.isDirectory()) {
            return new wp4(file.length(), file.getName(), false, (List) null, false, false, 60);
        } else {
            try {
                File parentFile = file.getParentFile();
                File file3 = parentFile == null ? file2 : new File(parentFile.getCanonicalFile(), file.getName());
                z = !Intrinsics.areEqual((Object) file3.getCanonicalFile(), (Object) file3.getAbsoluteFile());
            } catch (IOException unused) {
                z = false;
            }
            if (z) {
                return new wp4(0, file.getName(), true, (List) null, false, false, 56);
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                ArrayList arrayList3 = new ArrayList(listFiles.length);
                for (File g : listFiles) {
                    arrayList3.add(g(g, i2 + 1, arrayList2));
                }
                list = arrayList3;
            } else {
                list = CollectionsKt.emptyList();
            }
            long j = (long) ConstantsKt.DEFAULT_BLOCK_SIZE;
            long j2 = 0;
            for (wp4 wp4 : list) {
                j2 += wp4.a;
            }
            long j3 = j + j2;
            if (i2 > 6) {
                file.toString();
                z2 = true;
                list2 = CollectionsKt.emptyList();
            } else {
                z2 = false;
                list2 = list;
            }
            List sortedWith = CollectionsKt.sortedWith(list2, new cx4(24));
            if (sortedWith.size() > 20) {
                file.toString();
                list3 = sortedWith.subList(0, 20);
                z3 = true;
            } else {
                z3 = z2;
                list3 = sortedWith;
            }
            return new wp4(j3, file.getName(), true, list3, z3, false, 32);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        r2 = r2.getParentFile();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.d08 b() {
        /*
            r9 = this;
            frg r1 = defpackage.ev0.g
            boolean r0 = defpackage.pf6.l(r1)
            if (r0 == 0) goto L_0x000d
            c08 r9 = defpackage.d08.b()
            return r9
        L_0x000d:
            kotlin.Lazy r0 = r9.b
            java.lang.Object r2 = r0.getValue()
            vp4 r2 = (defpackage.vp4) r2
            r2.getClass()
            android.content.Context r2 = r9.getApplicationContext()
            android.content.pm.ApplicationInfo r3 = r2.getApplicationInfo()
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.lang.String r5 = r3.dataDir     // Catch:{ Exception -> 0x00b9 }
            us6 r6 = defpackage.us6.INTERNAL_DATA     // Catch:{ Exception -> 0x00b9 }
            r9.e(r5, r6, r4)     // Catch:{ Exception -> 0x00b9 }
            r5 = 0
            java.io.File r2 = r2.getExternalFilesDir(r5)     // Catch:{ Exception -> 0x00b9 }
            if (r2 == 0) goto L_0x003e
            java.io.File r2 = r2.getParentFile()     // Catch:{ Exception -> 0x00b9 }
            if (r2 == 0) goto L_0x003e
            java.lang.String r2 = r2.getPath()     // Catch:{ Exception -> 0x00b9 }
            goto L_0x003f
        L_0x003e:
            r2 = r5
        L_0x003f:
            us6 r6 = defpackage.us6.EXTERNAL_DATA     // Catch:{ Exception -> 0x00b9 }
            r9.e(r2, r6, r4)     // Catch:{ Exception -> 0x00b9 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r3 = r3.sourceDir     // Catch:{ Exception -> 0x00b9 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00b9 }
            java.io.File r2 = r2.getParentFile()     // Catch:{ Exception -> 0x00b9 }
            if (r2 == 0) goto L_0x0055
            java.lang.String r5 = r2.getPath()     // Catch:{ Exception -> 0x00b9 }
        L_0x0055:
            us6 r2 = defpackage.us6.SRC     // Catch:{ Exception -> 0x00b9 }
            r9.e(r5, r2, r4)     // Catch:{ Exception -> 0x00b9 }
            java.util.Collection r2 = r4.values()     // Catch:{ Exception -> 0x00b9 }
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ Exception -> 0x00b9 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x00b9 }
            r5 = 0
        L_0x0066:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x00b9 }
            if (r3 == 0) goto L_0x0076
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x00b9 }
            wp4 r3 = (defpackage.wp4) r3     // Catch:{ Exception -> 0x00b9 }
            long r7 = r3.a     // Catch:{ Exception -> 0x00b9 }
            long r5 = r5 + r7
            goto L_0x0066
        L_0x0076:
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x00b9 }
            vp4 r0 = (defpackage.vp4) r0     // Catch:{ Exception -> 0x00b9 }
            r0.getClass()     // Catch:{ Exception -> 0x00b9 }
            r2 = 10737418240(0x280000000, double:5.3049894774E-314)
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b4
            android.content.Context r0 = r9.getApplicationContext()     // Catch:{ Exception -> 0x00b9 }
            java.io.File r7 = defpackage.sq6.x(r0, r1)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = c(r4, r5)     // Catch:{ Exception -> 0x00b9 }
            kotlin.io.FilesKt__FileReadWriteKt.writeText$default(r7, r0, (java.nio.charset.Charset) null, 2, (java.lang.Object) null)     // Catch:{ Exception -> 0x00b9 }
            android.content.Context r0 = r9.getApplicationContext()     // Catch:{ Exception -> 0x00b9 }
            java.lang.Long r4 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r9 = "limit"
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x00b9 }
            kotlin.Pair r9 = kotlin.TuplesKt.to(r9, r2)     // Catch:{ Exception -> 0x00b9 }
            java.util.Map r5 = kotlin.collections.MapsKt.mapOf(r9)     // Catch:{ Exception -> 0x00b9 }
            r6 = 24
            r3 = 0
            r2 = r7
            defpackage.gga.q(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00b9 }
        L_0x00b4:
            c08 r9 = defpackage.d08.b()
            return r9
        L_0x00b9:
            a08 r9 = defpackage.d08.a()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tracer.disk.usage.DiskUsageWorker.b():d08");
    }

    public final void e(String str, us6 us6, LinkedHashMap linkedHashMap) {
        String str2;
        if (str != null) {
            File file = new File(str);
            ArrayList arrayList = new ArrayList();
            Iterator it = ((vp4) this.b.getValue()).b.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                str2 = us6.a;
                if (!hasNext) {
                    break;
                }
                Object next = it.next();
                if (StringsKt__StringsJVMKt.startsWith$default((String) next, str2 + ':', false, 2, (Object) null)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(FilesKt.resolve(file, ((String) it2.next()).substring(str2.length() + 1)));
            }
            linkedHashMap.put(us6, g(file, 0, arrayList2));
        }
    }
}
