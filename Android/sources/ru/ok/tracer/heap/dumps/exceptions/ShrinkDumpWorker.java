package ru.ok.tracer.heap.dumps.exceptions;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tracer/heap/dumps/exceptions/ShrinkDumpWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tracer-heap-dumps_release"}, k = 1, mv = {1, 7, 1})
public final class ShrinkDumpWorker extends Worker {
    public ShrinkDumpWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r7, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a0, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a2, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a6, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.d08 b() {
        /*
            r11 = this;
            t64 r0 = r11.getInputData()
            java.lang.String r1 = "param_dump_path"
            java.lang.String r0 = r0.e(r1)
            if (r0 == 0) goto L_0x00b0
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0014
            goto L_0x00b0
        L_0x0014:
            t64 r1 = r11.getInputData()
            java.lang.String r2 = "param_tag"
            java.lang.String r6 = r1.e(r2)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            long r2 = r1.length()
            r4 = 1048576(0x100000, double:5.180654E-318)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0036
            r1.delete()
            c08 r11 = defpackage.d08.b()
            return r11
        L_0x0036:
            frg r4 = defpackage.kv0.b
            boolean r0 = defpackage.pf6.l(r4)
            if (r0 == 0) goto L_0x0046
            r1.delete()
            c08 r11 = defpackage.d08.b()
            return r11
        L_0x0046:
            android.content.Context r0 = r11.getApplicationContext()     // Catch:{ IOException -> 0x00ab }
            java.io.File r5 = defpackage.sq6.x(r0, r4)     // Catch:{ IOException -> 0x00ab }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0096 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ all -> 0x0096 }
            r7.<init>(r1)     // Catch:{ all -> 0x0096 }
            r0.<init>(r7)     // Catch:{ all -> 0x0096 }
            int r7 = defpackage.h37.Z     // Catch:{ all -> 0x0096 }
            java.io.DataInputStream r7 = new java.io.DataInputStream     // Catch:{ all -> 0x0096 }
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0096 }
            r8.<init>(r0)     // Catch:{ all -> 0x0096 }
            r7.<init>(r8)     // Catch:{ all -> 0x0096 }
            h37 r0 = new h37     // Catch:{ all -> 0x0096 }
            r0.<init>(r7)     // Catch:{ all -> 0x0096 }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0098 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ all -> 0x0098 }
            r8.<init>(r5)     // Catch:{ all -> 0x0098 }
            r7.<init>(r8)     // Catch:{ all -> 0x0098 }
            r8 = 0
            r9 = 0
            r10 = 2
            kotlin.io.ByteStreamsKt.copyTo$default(r0, r7, r8, r10, r9)     // Catch:{ all -> 0x009a }
            kotlin.io.CloseableKt.closeFinally(r7, r9)     // Catch:{ all -> 0x0098 }
            kotlin.io.CloseableKt.closeFinally(r0, r9)     // Catch:{ all -> 0x0096 }
            r1.delete()
            android.content.Context r11 = r11.getApplicationContext()
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            r9 = 72
            r8 = 0
            r3 = r11
            defpackage.gga.q(r3, r4, r5, r6, r7, r8, r9)
            c08 r11 = defpackage.d08.b()
            return r11
        L_0x0096:
            r11 = move-exception
            goto L_0x00a7
        L_0x0098:
            r11 = move-exception
            goto L_0x00a1
        L_0x009a:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x009c }
        L_0x009c:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r7, r11)     // Catch:{ all -> 0x0098 }
            throw r2     // Catch:{ all -> 0x0098 }
        L_0x00a1:
            throw r11     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r11)     // Catch:{ all -> 0x0096 }
            throw r2     // Catch:{ all -> 0x0096 }
        L_0x00a7:
            r1.delete()
            throw r11
        L_0x00ab:
            a08 r11 = defpackage.d08.a()
            return r11
        L_0x00b0:
            a08 r11 = defpackage.d08.a()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tracer.heap.dumps.exceptions.ShrinkDumpWorker.b():d08");
    }
}
