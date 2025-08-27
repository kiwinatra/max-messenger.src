package ru.ok.tracer.upload;

import android.content.Context;
import android.net.Uri;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.io.File;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tracer/upload/SampleUploadWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tracer-sample-upload_release"}, k = 1, mv = {1, 7, 1})
public final class SampleUploadWorker extends Worker {
    public SampleUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final d08 b() {
        File file;
        String str;
        File file2 = null;
        try {
            file = new File(getInputData().e("tracer_sample_file_path"));
            try {
                if (!file.exists()) {
                    file.getPath();
                    return d08.b();
                }
                if (ld8.M(getApplicationContext().getPackageManager(), getApplicationContext().getPackageName()).getLongVersionCode() != getInputData().d("tracer_version_code", 0)) {
                    file.delete();
                    return d08.b();
                }
                String c = c();
                if (c != null) {
                    Context applicationContext = getApplicationContext();
                    String uuid = getId().toString();
                    String r = o54.r();
                    if (Intrinsics.areEqual((Object) r, (Object) applicationContext.getPackageName())) {
                        str = "tracer";
                    } else {
                        str = "tracer-" + Uri.encode(StringsKt__StringsJVMKt.replace$default(r, ':', '-', false, 4, (Object) null));
                    }
                    File file3 = new File(applicationContext.getCacheDir(), str);
                    f6e.y(file3);
                    d(file, FilesKt.resolve(file3, uuid + ".tmp"), c);
                }
                return d08.b();
            } catch (Exception unused) {
                if (file2 != null && file2.exists()) {
                    file2.delete();
                }
                if (file != null && file.exists()) {
                    file.delete();
                }
                return d08.b();
            }
        } catch (Exception unused2) {
            file = file2;
            file2.delete();
            file.delete();
            return d08.b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x018a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x018b, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x018e, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String c() {
        /*
            r12 = this;
            kof r0 = defpackage.kof.a
            java.lang.String r0 = defpackage.kof.a()
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            kxd r2 = defpackage.kof.e
            if (r2 == 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r2 = r1
        L_0x0010:
            g8f r2 = r2.c()
            t64 r3 = r12.getInputData()
            java.util.HashMap r3 = r3.a
            java.lang.String r4 = "tracer_custom_properties_keys"
            java.lang.Object r3 = r3.get(r4)
            boolean r4 = r3 instanceof java.lang.String[]
            if (r4 == 0) goto L_0x0027
            java.lang.String[] r3 = (java.lang.String[]) r3
            goto L_0x0028
        L_0x0027:
            r3 = r1
        L_0x0028:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "versionName"
            java.lang.String r6 = r2.a
            r4.put((java.lang.String) r5, (java.lang.Object) r6)
            java.lang.String r5 = "versionCode"
            long r6 = r2.b
            r4.put((java.lang.String) r5, (long) r6)
            java.lang.String r5 = "buildUuid"
            java.lang.String r6 = r2.e
            r4.put((java.lang.String) r5, (java.lang.Object) r6)
            java.lang.String r5 = "sessionUuid"
            java.lang.String r6 = r2.f
            r4.put((java.lang.String) r5, (java.lang.Object) r6)
            java.lang.String r5 = "deviceId"
            java.lang.String r6 = r2.h
            r4.put((java.lang.String) r5, (java.lang.Object) r6)
            t64 r5 = r12.getInputData()
            java.lang.String r6 = "tracer_feature_name"
            java.lang.String r5 = r5.e(r6)
            java.lang.String r7 = "feature"
            r4.put((java.lang.String) r7, (java.lang.Object) r5)
            t64 r5 = r12.getInputData()
            java.lang.String r7 = "tracer_has_attr1"
            r8 = 0
            boolean r5 = r5.b(r7, r8)
            if (r5 == 0) goto L_0x007d
            t64 r5 = r12.getInputData()
            java.lang.String r7 = "tracer_attr1"
            r9 = 0
            long r9 = r5.d(r7, r9)
            java.lang.String r5 = "attr1"
            r4.put((java.lang.String) r5, (long) r9)
        L_0x007d:
            t64 r5 = r12.getInputData()
            java.lang.String r7 = "tracer_feature_tag"
            java.lang.String r5 = r5.e(r7)
            if (r5 == 0) goto L_0x0096
            t64 r5 = r12.getInputData()
            java.lang.String r5 = r5.e(r7)
            java.lang.String r9 = "tag"
            r4.put((java.lang.String) r9, (java.lang.Object) r5)
        L_0x0096:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            if (r3 == 0) goto L_0x00b2
            int r9 = r3.length
        L_0x009e:
            if (r8 >= r9) goto L_0x00b2
            r10 = r3[r8]
            t64 r11 = r12.getInputData()
            java.lang.String r11 = r11.e(r10)
            if (r11 == 0) goto L_0x00af
            r5.put(r10, r11)
        L_0x00af:
            int r8 = r8 + 1
            goto L_0x009e
        L_0x00b2:
            java.util.Map r2 = r2.m
            java.util.Map r2 = kotlin.collections.MapsKt.plus(r2, r5)
            boolean r3 = r2.isEmpty()
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x00ec
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x00cd:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00e7
            java.lang.Object r5 = r2.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r8 = r5.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r5 = r5.getValue()
            r3.put((java.lang.String) r8, (java.lang.Object) r5)
            goto L_0x00cd
        L_0x00e7:
            java.lang.String r2 = "properties"
            r4.put((java.lang.String) r2, (java.lang.Object) r3)
        L_0x00ec:
            kof r2 = defpackage.kof.a
            java.util.Map r2 = defpackage.kof.c()
            frg r3 = defpackage.iq.c
            java.lang.Object r2 = r2.get(r3)
            boolean r3 = r2 instanceof defpackage.l04
            if (r3 == 0) goto L_0x00ff
            l04 r2 = (defpackage.l04) r2
            goto L_0x0100
        L_0x00ff:
            r2 = r1
        L_0x0100:
            if (r2 != 0) goto L_0x010a
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            kotlin.collections.MapsKt.toMap(r2)
        L_0x010a:
            java.lang.String r2 = defpackage.l04.b()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.net.Uri$Builder r2 = r2.buildUpon()
            java.lang.String r3 = "api/sample/initUpload"
            android.net.Uri$Builder r2 = r2.appendEncodedPath(r3)
            java.lang.String r3 = "sampleToken"
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r3, r0)
            java.lang.String r0 = r0.toString()
            d19 r2 = new d19
            java.lang.String r3 = r4.toString()
            java.lang.String r5 = "application/json; charset=utf-8"
            mm5 r3 = defpackage.pf6.i(r5, r3)
            r2.<init>((java.lang.String) r0, (defpackage.h57) r3)
            r0.getClass()
            r4.toString()
            kotlin.Lazy r0 = defpackage.kof.h
            java.lang.Object r0 = r0.getValue()
            n57 r0 = (defpackage.n57) r0
            i57 r0 = r0.b(r2)
            java.io.Closeable r2 = r0.o     // Catch:{ all -> 0x0181 }
            mm5 r2 = (defpackage.mm5) r2     // Catch:{ all -> 0x0181 }
            if (r2 == 0) goto L_0x0183
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x0181 }
            java.lang.Object r2 = r2.c     // Catch:{ all -> 0x0181 }
            byte[] r2 = (byte[]) r2     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = kotlin.text.StringsKt.decodeToString(r2)     // Catch:{ all -> 0x0181 }
            r3.<init>((java.lang.String) r2)     // Catch:{ all -> 0x0181 }
            t64 r2 = r12.getInputData()     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = r2.e(r6)     // Catch:{ all -> 0x0181 }
            t64 r12 = r12.getInputData()     // Catch:{ all -> 0x0181 }
            java.lang.String r12 = r12.e(r7)     // Catch:{ all -> 0x0181 }
            defpackage.s9a.j(r3, r2, r12)     // Catch:{ all -> 0x0181 }
            int r12 = r0.b     // Catch:{ all -> 0x0181 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r12 == r2) goto L_0x0177
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            return r1
        L_0x0177:
            java.lang.String r12 = "uploadToken"
            java.lang.String r12 = r3.getString(r12)     // Catch:{ all -> 0x0181 }
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            return r12
        L_0x0181:
            r12 = move-exception
            goto L_0x0189
        L_0x0183:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0181 }
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            return r1
        L_0x0189:
            throw r12     // Catch:{ all -> 0x018a }
        L_0x018a:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r12)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tracer.upload.SampleUploadWorker.c():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r3, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(java.io.File r8, java.io.File r9, java.lang.String r10) {
        /*
            r7 = this;
            t64 r0 = r7.getInputData()
            java.lang.String r1 = "tracer_feature_uze_gzip"
            r2 = 1
            boolean r0 = r0.b(r1, r2)
            r1 = 0
            if (r0 == 0) goto L_0x0042
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r8)
            r0.<init>(r3)
            java.util.zip.GZIPOutputStream r3 = new java.util.zip.GZIPOutputStream
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream
            java.io.FileOutputStream r5 = new java.io.FileOutputStream
            r5.<init>(r9)
            r4.<init>(r5)
            r3.<init>(r4)
            r4 = 0
            r5 = 2
            kotlin.io.ByteStreamsKt.copyTo$default(r0, r3, r4, r5, r1)     // Catch:{ all -> 0x0035 }
            kotlin.io.CloseableKt.closeFinally(r3, r1)     // Catch:{ all -> 0x0033 }
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            goto L_0x0045
        L_0x0033:
            r7 = move-exception
            goto L_0x003c
        L_0x0035:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r8 = move-exception
            kotlin.io.CloseableKt.closeFinally(r3, r7)     // Catch:{ all -> 0x0033 }
            throw r8     // Catch:{ all -> 0x0033 }
        L_0x003c:
            throw r7     // Catch:{ all -> 0x003d }
        L_0x003d:
            r8 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r7)
            throw r8
        L_0x0042:
            kotlin.io.FilesKt__UtilsKt.copyTo$default(r8, r9, true, 0, 4, (java.lang.Object) null)
        L_0x0045:
            r8.length()
            r9.length()
            r8.delete()
            byte[] r8 = kotlin.io.FilesKt.readBytes(r9)
            kof r0 = defpackage.kof.a
            java.util.Map r0 = defpackage.kof.c()
            frg r3 = defpackage.iq.c
            java.lang.Object r0 = r0.get(r3)
            boolean r3 = r0 instanceof defpackage.l04
            if (r3 == 0) goto L_0x0065
            l04 r0 = (defpackage.l04) r0
            goto L_0x0066
        L_0x0065:
            r0 = r1
        L_0x0066:
            if (r0 != 0) goto L_0x0070
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            kotlin.collections.MapsKt.toMap(r0)
        L_0x0070:
            java.lang.String r0 = defpackage.l04.b()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r3 = "api/sample/upload"
            android.net.Uri$Builder r0 = r0.appendEncodedPath(r3)
            java.lang.String r3 = "uploadToken"
            android.net.Uri$Builder r10 = r0.appendQueryParameter(r3, r10)
            java.lang.String r10 = r10.toString()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            mm5 r3 = new mm5
            java.lang.String r4 = "application/octet-stream"
            r3.<init>(r2, r4, r8)
            g57 r8 = new g57
            java.lang.String r5 = "file"
            java.lang.String r6 = "sample"
            r8.<init>(r5, r6, r4, r3)
            r0.add(r8)
            u05 r8 = new u05
            kotlin.random.Random$Default r3 = kotlin.random.Random.Default
            long r3 = r3.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r2)
            java.lang.String r3 = "------------%016x"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.util.List r0 = kotlin.collections.CollectionsKt.toList(r0)
            r8.<init>(r2, r0)
            d19 r0 = new d19
            r0.<init>((java.lang.String) r10, (defpackage.h57) r8)
            kotlin.Lazy r8 = defpackage.kof.h     // Catch:{ Exception -> 0x010d, all -> 0x0111 }
            java.lang.Object r8 = r8.getValue()     // Catch:{ Exception -> 0x010d, all -> 0x0111 }
            n57 r8 = (defpackage.n57) r8     // Catch:{ Exception -> 0x010d, all -> 0x0111 }
            i57 r8 = r8.b(r0)     // Catch:{ Exception -> 0x010d, all -> 0x0111 }
            int r10 = r8.b     // Catch:{ all -> 0x00e9 }
            java.io.Closeable r0 = r8.o     // Catch:{ all -> 0x00e9 }
            mm5 r0 = (defpackage.mm5) r0     // Catch:{ all -> 0x00e9 }
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x00e9 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x00e9 }
            if (r0 == 0) goto L_0x00eb
            java.lang.String r0 = kotlin.text.StringsKt.decodeToString(r0)     // Catch:{ all -> 0x00e9 }
            goto L_0x00ec
        L_0x00e9:
            r7 = move-exception
            goto L_0x0113
        L_0x00eb:
            r0 = r1
        L_0x00ec:
            t64 r2 = r7.getInputData()     // Catch:{ all -> 0x00e9 }
            java.lang.String r3 = "tracer_feature_name"
            java.lang.String r2 = r2.e(r3)     // Catch:{ all -> 0x00e9 }
            t64 r7 = r7.getInputData()     // Catch:{ all -> 0x00e9 }
            java.lang.String r3 = "tracer_feature_tag"
            java.lang.String r7 = r7.e(r3)     // Catch:{ all -> 0x00e9 }
            defpackage.s9a.i(r0, r2, r7)     // Catch:{ all -> 0x00e9 }
            r7 = 200(0xc8, float:2.8E-43)
            if (r10 == r7) goto L_0x0108
            goto L_0x010a
        L_0x0108:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00e9 }
        L_0x010a:
            kotlin.io.CloseableKt.closeFinally(r8, r1)     // Catch:{ Exception -> 0x010d, all -> 0x0111 }
        L_0x010d:
            r9.delete()
            goto L_0x011d
        L_0x0111:
            r7 = move-exception
            goto L_0x0119
        L_0x0113:
            throw r7     // Catch:{ all -> 0x0114 }
        L_0x0114:
            r10 = move-exception
            kotlin.io.CloseableKt.closeFinally(r8, r7)     // Catch:{ Exception -> 0x010d, all -> 0x0111 }
            throw r10     // Catch:{ Exception -> 0x010d, all -> 0x0111 }
        L_0x0119:
            r9.delete()
            throw r7
        L_0x011d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tracer.upload.SampleUploadWorker.d(java.io.File, java.io.File, java.lang.String):void");
    }
}
