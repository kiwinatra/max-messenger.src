package ru.ok.android.externcalls.analytics.internal.upload;

import android.os.Looper;
import java.io.File;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/Uploader;", "", "drop", "", "getSink", "Ljava/io/File;", "setIdleStateProvider", "idleStateProvider", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;", "upload", "Companion", "IdleStateProvider", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Uploader {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/Uploader$Companion;", "", "()V", "create", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader;", "looperProvider", "Ljavax/inject/Provider;", "Landroid/os/Looper;", "uploadFile", "Ljava/io/File;", "uploadLock", "Ljava/util/concurrent/locks/Lock;", "apiMethod", "", "isContentCompressed", "", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
            r0 = r0.getUpload();
         */
        @kotlin.jvm.JvmStatic
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final ru.ok.android.externcalls.analytics.internal.upload.Uploader create(javax.inject.Provider<android.os.Looper> r11, javax.inject.Provider<java.io.File> r12, java.util.concurrent.locks.Lock r13, java.lang.String r14, boolean r15) {
            /*
                r10 = this;
                ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage r10 = ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage.INSTANCE
                ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig r0 = r10.getConfig()
                r1 = 1
                if (r0 == 0) goto L_0x0015
                ru.ok.android.externcalls.analytics.config.UploadConfig r0 = r0.getUpload()
                if (r0 == 0) goto L_0x0015
                int r0 = r0.getMaxLocalCacheFileCount()
                r8 = r0
                goto L_0x0016
            L_0x0015:
                r8 = r1
            L_0x0016:
                ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig r0 = r10.getConfig()
                if (r0 == 0) goto L_0x0028
                ru.ok.android.externcalls.analytics.config.UploadConfig r0 = r0.getUpload()
                if (r0 == 0) goto L_0x0028
                java.lang.Long r0 = r0.getTimeToUploadNextMs()
            L_0x0026:
                r9 = r0
                goto L_0x002a
            L_0x0028:
                r0 = 0
                goto L_0x0026
            L_0x002a:
                ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig r10 = r10.getConfig()
                if (r10 == 0) goto L_0x003c
                ru.ok.android.externcalls.analytics.config.UploadConfig r10 = r10.getUpload()
                if (r10 == 0) goto L_0x003c
                boolean r10 = r10.getDisableUploadWhenCallIsActive()
            L_0x003a:
                r6 = r10
                goto L_0x003e
            L_0x003c:
                r10 = 0
                goto L_0x003a
            L_0x003e:
                if (r8 <= r1) goto L_0x004c
                ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader r10 = new ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader
                r2 = r10
                r3 = r11
                r4 = r12
                r5 = r13
                r6 = r14
                r7 = r15
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                goto L_0x0056
            L_0x004c:
                ru.ok.android.externcalls.analytics.internal.upload.SingleFileUploader r10 = new ru.ok.android.externcalls.analytics.internal.upload.SingleFileUploader
                r2 = r10
                r3 = r12
                r4 = r13
                r5 = r14
                r7 = r15
                r2.<init>(r3, r4, r5, r6, r7)
            L_0x0056:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.analytics.internal.upload.Uploader.Companion.create(javax.inject.Provider, javax.inject.Provider, java.util.concurrent.locks.Lock, java.lang.String, boolean):ru.ok.android.externcalls.analytics.internal.upload.Uploader");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;", "", "isIdle", "", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface IdleStateProvider {
        boolean isIdle();
    }

    @JvmStatic
    static Uploader create(Provider<Looper> provider, Provider<File> provider2, Lock lock, String str, boolean z) {
        return Companion.create(provider, provider2, lock, str, z);
    }

    void drop();

    File getSink();

    void setIdleStateProvider(IdleStateProvider idleStateProvider) {
    }

    void upload();
}
