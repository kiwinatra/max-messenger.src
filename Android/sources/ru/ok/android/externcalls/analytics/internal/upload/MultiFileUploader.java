package ru.ok.android.externcalls.analytics.internal.upload;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;
import ru.ok.android.externcalls.analytics.internal.utils.Files;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 -2\u00020\u0001:\u0003-./BM\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\u0016\u0010\u001b\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0006H\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006H\u0002J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u001dH\u0002J\u0010\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u000eH\u0002J\b\u0010%\u001a\u00020\u0006H\u0016J\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020 H\u0002J\b\u0010)\u001a\u00020 H\u0002J\b\u0010*\u001a\u00020 H\u0016J\u0010\u0010+\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0006H\u0002J\b\u0010,\u001a\u00020\fH\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0004¢\u0006\u0004\n\u0002\u0010\u001a¨\u00060"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader;", "Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader;", "looperProvider", "Ljavax/inject/Provider;", "Landroid/os/Looper;", "dir", "Ljava/io/File;", "lock", "Ljava/util/concurrent/locks/Lock;", "collector", "", "isContentCompressed", "", "fileCountLimit", "", "timeBeforeNextUploadMs", "", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljava/util/concurrent/locks/Lock;Ljava/lang/String;ZILjava/lang/Long;)V", "fileIndexStringLength", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "scaleUpNextUploadTimeout", "Ljava/lang/Long;", "calcBestNameForNewFile", "files", "", "createNewFile", "dropOldestFile", "", "file", "getAllFiles", "getFileNameForIndex", "index", "getSink", "getStorageInfo", "Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader$StorageInfo;", "scheduleNextUpload", "triggerUpload", "upload", "uploadFileWithResultCheck", "uploadImpl", "Companion", "LooperCallback", "StorageInfo", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMultiFileUploader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiFileUploader.kt\nru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1855#2,2:215\n1#3:217\n*S KotlinDebug\n*F\n+ 1 MultiFileUploader.kt\nru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader\n*L\n148#1:215,2\n*E\n"})
public final class MultiFileUploader extends AbstractUploader {
    @Deprecated
    public static final String CHUNK_FILE_NAME_PREFIX = "chunk";
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Deprecated
    public static final String LOG_TAG = "CallAnalyticsUploaderV2";
    @Deprecated
    public static final int MSG_TRY_UPLOAD_NEXT = 1001;
    @Deprecated
    public static final long UPLOAD_NEXT_INTERVAL = 5000;
    /* access modifiers changed from: private */
    public final int fileCountLimit;
    private final int fileIndexStringLength;
    private final Lazy handler$delegate;
    /* access modifiers changed from: private */
    public final Provider<Looper> looperProvider;
    private volatile int scaleUpNextUploadTimeout;
    private final Long timeBeforeNextUploadMs;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader$Companion;", "", "()V", "CHUNK_FILE_NAME_PREFIX", "", "LOG_TAG", "MSG_TRY_UPLOAD_NEXT", "", "UPLOAD_NEXT_INTERVAL", "", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader$LooperCallback;", "Landroid/os/Handler$Callback;", "uploader", "Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader;", "(Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader;)V", "getUploader", "()Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader;", "handleMessage", "", "msg", "Landroid/os/Message;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LooperCallback implements Handler.Callback {
        private final MultiFileUploader uploader;

        public LooperCallback(MultiFileUploader multiFileUploader) {
            this.uploader = multiFileUploader;
        }

        public final MultiFileUploader getUploader() {
            return this.uploader;
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1001) {
                return false;
            }
            this.uploader.triggerUpload();
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader$StorageInfo;", "", "oldestFile", "Ljava/io/File;", "allFiles", "", "(Ljava/io/File;Ljava/util/List;)V", "getAllFiles", "()Ljava/util/List;", "getOldestFile", "()Ljava/io/File;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StorageInfo {
        private final List<File> allFiles;
        private final File oldestFile;

        public StorageInfo(File file, List<? extends File> list) {
            this.oldestFile = file;
            this.allFiles = list;
        }

        public final List<File> getAllFiles() {
            return this.allFiles;
        }

        public final File getOldestFile() {
            return this.oldestFile;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader$UploadResult[] r0 = ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader.UploadResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader$UploadResult r1 = ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader.UploadResult.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader$UploadResult r1 = ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader.UploadResult.RECOVERABLE_ERROR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader$UploadResult r1 = ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader.UploadResult.SKIP     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader$UploadResult r1 = ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader.UploadResult.BAD_CONTENT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader$UploadResult r1 = ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader.UploadResult.ERROR     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MultiFileUploader(Provider provider, Provider provider2, Lock lock, String str, boolean z, int i, Long l, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(provider, provider2, lock, str, z, (i2 & 32) != 0 ? 10 : i, l);
    }

    /* access modifiers changed from: private */
    public final String calcBestNameForNewFile(List<? extends File> list) {
        Object obj;
        int i = this.fileCountLimit;
        for (int i2 = 0; i2 < i; i2++) {
            String fileNameForIndex = getFileNameForIndex(i2);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) fileNameForIndex, (Object) ((File) obj).getName())) {
                    break;
                }
            }
            if (obj == null) {
                if (!new File(getStorage().get(), fileNameForIndex).exists()) {
                    getLogger().d(LOG_TAG, "Name: " + fileNameForIndex + " not found, provide it");
                    return fileNameForIndex;
                }
                getLogger().d(LOG_TAG, "Name: " + fileNameForIndex + " not listed but file exists");
            }
        }
        String fileNameForIndex2 = getFileNameForIndex(0);
        getLogger().d(LOG_TAG, "Nothing found, default to " + fileNameForIndex2);
        return fileNameForIndex2;
    }

    /* access modifiers changed from: private */
    public final File createNewFile() {
        return (File) withLock(new MultiFileUploader$createNewFile$1(this));
    }

    /* access modifiers changed from: private */
    public final void dropOldestFile(File file) {
        try {
            Files.delete(file);
            CallAnalyticsLogger logger = getLogger();
            String path = file.getPath();
            logger.d(LOG_TAG, "Oldest file " + path + " dropped");
        } catch (IOException e) {
            getLogger().e(LOG_TAG, wj6.k("Oldest file ", file.getPath(), " drop request failed"), e);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r0 = kotlin.collections.ArraysKt.filterNotNull(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.io.File> getAllFiles() {
        /*
            r0 = this;
            javax.inject.Provider r0 = r0.getStorage()
            java.lang.Object r0 = r0.get()
            java.io.File r0 = (java.io.File) r0
            java.io.File[] r0 = r0.listFiles()
            if (r0 == 0) goto L_0x0016
            java.util.List r0 = kotlin.collections.ArraysKt.filterNotNull(r0)
            if (r0 != 0) goto L_0x001a
        L_0x0016:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.getAllFiles():java.util.List");
    }

    private final String getFileNameForIndex(int i) {
        return this.fileIndexStringLength > 1 ? a81.m("chunk_", StringsKt.padStart(String.valueOf(i), this.fileIndexStringLength, '_')) : wj6.h(i, "chunk_");
    }

    private final Handler getHandler() {
        return (Handler) this.handler$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final StorageInfo getStorageInfo() {
        List<File> allFiles = getAllFiles();
        File file = null;
        long j = 0;
        for (File file2 : allFiles) {
            if (file2.exists() && (file == null || file2.lastModified() < j)) {
                j = file2.lastModified();
                file = file2;
            }
        }
        return new StorageInfo(file, allFiles);
    }

    /* access modifiers changed from: private */
    public final void scheduleNextUpload() {
        if (!getStorageInfo().getAllFiles().isEmpty()) {
            Handler handler = getHandler();
            Long l = this.timeBeforeNextUploadMs;
            long longValue = (l != null ? l.longValue() : UPLOAD_NEXT_INTERVAL) * ((long) this.scaleUpNextUploadTimeout);
            getLogger().d(LOG_TAG, wj6.j(longValue, "schedule next upload pass in ", " ms"));
            handler.removeMessages(MSG_TRY_UPLOAD_NEXT);
            handler.sendMessageDelayed(handler.obtainMessage(MSG_TRY_UPLOAD_NEXT), longValue);
            return;
        }
        getLogger().d(LOG_TAG, "empty storage, won't schedule new upload");
    }

    /* access modifiers changed from: private */
    public final void triggerUpload() {
        UploadStarter.INSTANCE.startUpload(getCollector());
    }

    private final boolean uploadFileWithResultCheck(File file) {
        int i = WhenMappings.$EnumSwitchMapping$0[uploadFile(file).ordinal()];
        if (i == 1 || i == 2) {
            this.scaleUpNextUploadTimeout = 1;
            return true;
        }
        if (!(i == 3 || i == 4)) {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            } else if (this.scaleUpNextUploadTimeout < 6) {
                this.scaleUpNextUploadTimeout *= 2;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final boolean uploadImpl() {
        StorageInfo storageInfo = getStorageInfo();
        File oldestFile = storageInfo.getOldestFile();
        getLogger().d(LOG_TAG, "Try to upload oldest file first");
        if (oldestFile == null || !uploadFileWithResultCheck(oldestFile)) {
            getLogger().d(LOG_TAG, "Try to upload first from the list");
            for (File next : storageInfo.getAllFiles()) {
                if (uploadFileWithResultCheck(next)) {
                    CallAnalyticsLogger logger = getLogger();
                    String path = next.getPath();
                    logger.d(LOG_TAG, "File upload completed: " + path);
                    return true;
                }
            }
            getLogger().d(LOG_TAG, "No files were uploaded");
            return false;
        }
        CallAnalyticsLogger logger2 = getLogger();
        String path2 = oldestFile.getPath();
        logger2.d(LOG_TAG, "Oldest file upload completed: " + path2);
        return true;
    }

    public File getSink() {
        return (File) withLock(new MultiFileUploader$getSink$1(this));
    }

    public void upload() {
        Uploader.IdleStateProvider idleState = getIdleState();
        if (idleState == null || idleState.isIdle()) {
            withLock(new MultiFileUploader$upload$1(this));
        } else {
            getLogger().d(LOG_TAG, "call is not idle, postpone upload");
        }
    }

    public MultiFileUploader(Provider<Looper> provider, Provider<File> provider2, Lock lock, String str, boolean z, int i, Long l) {
        super(provider2, lock, str, z, LOG_TAG);
        this.looperProvider = provider;
        this.fileCountLimit = i;
        this.timeBeforeNextUploadMs = l;
        int i2 = 10;
        if (i <= 10) {
            i2 = 1;
        } else if (i <= 100) {
            i2 = 2;
        } else if (i <= 1000) {
            i2 = 3;
        }
        this.fileIndexStringLength = i2;
        this.scaleUpNextUploadTimeout = 1;
        this.handler$delegate = LazyKt.lazy(new MultiFileUploader$handler$2(this));
    }
}
