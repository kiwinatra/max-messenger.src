package ru.ok.android.externcalls.analytics.internal.storage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.locks.Lock;
import java.util.zip.GZIPOutputStream;
import javax.inject.Provider;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventSerializer;
import ru.ok.android.externcalls.analytics.internal.utils.Files;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

public final class FileCacheWriter {
    private static final String LOG_TAG = "CallAnalyticsFileCacheWriter";
    private static final long MAX_FILE_LENGTH = 10000000;
    private final boolean compressContent;
    private final Provider<File> file;
    private long length = -1;
    private final Lock lock;
    private final CallAnalyticsLogger logger;
    private final ByteArrayOutputStream proxyStream = new ByteArrayOutputStream();

    public FileCacheWriter(Provider<File> provider, boolean z, Lock lock2) {
        this.file = provider;
        this.lock = lock2;
        this.compressContent = z;
        this.logger = CallAnalyticsConfigStorage.INSTANCE.getLogger();
    }

    private void atomicWrite(boolean z, CallAnalyticsEvent callAnalyticsEvent, OutputStream outputStream) throws IOException {
        OutputStream gZIPOutputStream;
        try {
            this.proxyStream.reset();
            gZIPOutputStream = this.compressContent ? new GZIPOutputStream(this.proxyStream, 1024, true) : this.proxyStream;
            write(z, callAnalyticsEvent, gZIPOutputStream);
            if (gZIPOutputStream != null) {
                gZIPOutputStream.close();
            }
            this.proxyStream.writeTo(outputStream);
            outputStream.flush();
            return;
        } catch (RuntimeException e) {
            this.logger.report(LOG_TAG, "Error writing event to file cache", new FileCacheException(e));
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private void verifyOutputFormat(File file2) {
        this.logger.d(LOG_TAG, "Existing file is not empty, check compression state");
        try {
            if (Files.isCompressed(file2) != this.compressContent) {
                CallAnalyticsLogger callAnalyticsLogger = this.logger;
                callAnalyticsLogger.d(LOG_TAG, "Existing file compression doesn't match expected compression state (" + this.compressContent + "), drop");
                drop();
                return;
            }
            CallAnalyticsLogger callAnalyticsLogger2 = this.logger;
            callAnalyticsLogger2.d(LOG_TAG, "Existing file compression state matches expected one (" + this.compressContent + ")");
        } catch (IOException e) {
            this.logger.e(LOG_TAG, "drop caused by compression conflict failed", e);
        } catch (Throwable th) {
            this.logger.e(LOG_TAG, "Can't check if file compressed or not, drop", th);
            try {
                drop();
            } catch (IOException e2) {
                this.logger.e(LOG_TAG, "drop caused by compression conflict check fault failed", e2);
            }
        }
    }

    private void write(boolean z, CallAnalyticsEvent callAnalyticsEvent, OutputStream outputStream) throws IOException {
        if (z) {
            outputStream.write(Files.SEPARATOR);
        }
        vnb vnb = new vnb(new i6b(outputStream));
        try {
            EventSerializer.INSTANCE.serialize(vnb, callAnalyticsEvent);
            vnb.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void drop() throws IOException {
        File file2 = this.file.get();
        try {
            this.lock.lock();
            if (!file2.exists()) {
                CallAnalyticsLogger callAnalyticsLogger = this.logger;
                callAnalyticsLogger.d(LOG_TAG, "no drop " + file2);
                return;
            }
            Files.delete(file2);
            CallAnalyticsLogger callAnalyticsLogger2 = this.logger;
            callAnalyticsLogger2.d(LOG_TAG, "drop " + file2);
            this.length = Files.length(file2);
            this.lock.unlock();
        } finally {
            this.length = Files.length(file2);
            this.lock.unlock();
        }
    }

    public void grab(Provider<File> provider) throws IOException {
        File file2 = this.file.get();
        try {
            this.lock.lock();
            if (this.length == 0) {
                this.logger.d(LOG_TAG, "grab | input file is empty, cancel");
            } else if (!file2.exists()) {
                CallAnalyticsLogger callAnalyticsLogger = this.logger;
                callAnalyticsLogger.d(LOG_TAG, "grab | file " + file2 + " doesn't exist, cancel");
            } else {
                File file3 = provider.get();
                CallAnalyticsLogger callAnalyticsLogger2 = this.logger;
                callAnalyticsLogger2.d(LOG_TAG, "grab | " + file2 + " >> " + file3);
                if (Files.length(file3) > MAX_FILE_LENGTH) {
                    Files.delete(file3);
                }
                long length2 = Files.length(file3);
                Files.cat(file3, file2, this.compressContent);
                long length3 = Files.length(file3);
                CallAnalyticsLogger callAnalyticsLogger3 = this.logger;
                callAnalyticsLogger3.d(LOG_TAG, "grab | done, size changed: " + length2 + " -> " + length3);
                this.length = Files.length(file2);
                this.lock.unlock();
            }
        } finally {
            this.length = Files.length(file2);
            this.lock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public long length() {
        long j = this.length;
        if (j >= 0) {
            return j;
        }
        File file2 = this.file.get();
        try {
            this.lock.lock();
            long length2 = Files.length(file2);
            this.length = length2;
            if (length2 > 0) {
                verifyOutputFormat(file2);
            }
            this.lock.unlock();
            return this.length;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:19|27|28|29|30|31|32) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0098 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeToCache(ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent r12) {
        /*
            r11 = this;
            java.lang.String r0 = "Can not delete broken file "
            java.lang.String r1 = "Error while writing to disk"
            java.lang.String r2 = "append (c="
            javax.inject.Provider<java.io.File> r3 = r11.file
            java.lang.Object r3 = r3.get()
            java.io.File r3 = (java.io.File) r3
            long r4 = r11.length()
            r6 = 10000000(0x989680, double:4.9406565E-317)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            java.lang.String r5 = "CallAnalyticsFileCacheWriter"
            if (r4 <= 0) goto L_0x002e
            ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger r4 = r11.logger
            java.lang.String r6 = "append file too big, drop"
            r4.w(r5, r6)
            r11.drop()     // Catch:{ IOException -> 0x0026 }
            goto L_0x002e
        L_0x0026:
            r4 = move-exception
            ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger r6 = r11.logger
            java.lang.String r7 = "drop failed"
            r6.e(r5, r7, r4)
        L_0x002e:
            java.util.concurrent.locks.Lock r4 = r11.lock     // Catch:{ IOException -> 0x0077 }
            r4.lock()     // Catch:{ IOException -> 0x0077 }
            ru.ok.android.externcalls.analytics.internal.utils.Files.mkfile(r3)     // Catch:{ IOException -> 0x0077 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0077 }
            r6 = 1
            r4.<init>(r3, r6)     // Catch:{ IOException -> 0x0077 }
            long r7 = ru.ok.android.externcalls.analytics.internal.utils.Files.length((java.io.File) r3)     // Catch:{ all -> 0x0079 }
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r6 = 0
        L_0x0048:
            r11.atomicWrite(r6, r12, r4)     // Catch:{ all -> 0x0079 }
            r4.close()     // Catch:{ IOException -> 0x0077 }
            ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger r4 = r11.logger     // Catch:{ IOException -> 0x0077 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0077 }
            r6.<init>(r2)     // Catch:{ IOException -> 0x0077 }
            boolean r2 = r11.compressContent     // Catch:{ IOException -> 0x0077 }
            r6.append(r2)     // Catch:{ IOException -> 0x0077 }
            java.lang.String r2 = ") "
            r6.append(r2)     // Catch:{ IOException -> 0x0077 }
            r6.append(r12)     // Catch:{ IOException -> 0x0077 }
            java.lang.String r2 = r6.toString()     // Catch:{ IOException -> 0x0077 }
            r4.v(r5, r2)     // Catch:{ IOException -> 0x0077 }
        L_0x0069:
            long r0 = ru.ok.android.externcalls.analytics.internal.utils.Files.length((java.io.File) r3)
            r11.length = r0
            java.util.concurrent.locks.Lock r11 = r11.lock
            r11.unlock()
            goto L_0x00ae
        L_0x0075:
            r12 = move-exception
            goto L_0x00af
        L_0x0077:
            r2 = move-exception
            goto L_0x0083
        L_0x0079:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x007e }
            goto L_0x0082
        L_0x007e:
            r4 = move-exception
            r2.addSuppressed(r4)     // Catch:{ IOException -> 0x0077 }
        L_0x0082:
            throw r2     // Catch:{ IOException -> 0x0077 }
        L_0x0083:
            ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger r4 = r11.logger     // Catch:{ all -> 0x0075 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r6.<init>(r1)     // Catch:{ all -> 0x0075 }
            r6.append(r12)     // Catch:{ all -> 0x0075 }
            java.lang.String r12 = r6.toString()     // Catch:{ all -> 0x0075 }
            r4.e(r5, r12, r2)     // Catch:{ all -> 0x0075 }
            ru.ok.android.externcalls.analytics.internal.utils.Files.delete(r3)     // Catch:{ IOException -> 0x0098 }
            goto L_0x0069
        L_0x0098:
            ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger r12 = r11.logger     // Catch:{ all -> 0x0075 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r1.<init>(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = r3.getPath()     // Catch:{ all -> 0x0075 }
            r1.append(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0075 }
            r12.e(r5, r0, r2)     // Catch:{ all -> 0x0075 }
            goto L_0x0069
        L_0x00ae:
            return
        L_0x00af:
            long r0 = ru.ok.android.externcalls.analytics.internal.utils.Files.length((java.io.File) r3)
            r11.length = r0
            java.util.concurrent.locks.Lock r11 = r11.lock
            r11.unlock()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.analytics.internal.storage.FileCacheWriter.writeToCache(ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent):void");
    }
}
