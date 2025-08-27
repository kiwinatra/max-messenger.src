package ru.ok.android.externcalls.analytics.internal.upload;

import android.app.Application;
import android.content.pm.PackageInfo;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiRequestException;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.externcalls.analytics.internal.api.StreamingItemsApiValue;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;
import ru.ok.android.externcalls.analytics.internal.utils.Files;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b \u0018\u0000 A2\u00020\u0001:\u0002ABB5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\tH\u0004¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0003H\u0004¢\u0006\u0004\b(\u0010)J#\u0010-\u001a\u00028\u0000\"\u0004\b\u0000\u0010*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0004¢\u0006\u0004\b-\u0010.R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0004X\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u00101R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u00102R\u001a\u0010\b\u001a\u00020\u00078\u0004X\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u00106R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u001a\u00108\u001a\u0002078\u0004X\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R$\u0010<\u001a\u0004\u0018\u00010!8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010$¨\u0006C"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader;", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader;", "Ljavax/inject/Provider;", "Ljava/io/File;", "storage", "Ljava/util/concurrent/locks/Lock;", "lock", "", "collector", "", "isContentCompressed", "logTag", "<init>", "(Ljavax/inject/Provider;Ljava/util/concurrent/locks/Lock;Ljava/lang/String;ZLjava/lang/String;)V", "Lwl;", "client", "file", "Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader$UploadResult;", "uploadFileWithContent", "(Lwl;Ljava/io/File;)Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader$UploadResult;", "apiClient", "apiMethod", "Lhs0;", "items", "", "executeApiMethod", "(Lwl;Ljava/lang/String;Lhs0;)V", "Lru/ok/android/externcalls/analytics/internal/upload/UploadException;", "ex", "reportApiInvocationError", "(Lru/ok/android/externcalls/analytics/internal/upload/UploadException;)V", "drop", "()V", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;", "idleStateProvider", "setIdleStateProvider", "(Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;)V", "isDirectory", "ensureStorageIsOfCorrectType", "(Z)Ljava/io/File;", "uploadFile", "(Ljava/io/File;)Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader$UploadResult;", "T", "Lkotlin/Function0;", "block", "withLock", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljavax/inject/Provider;", "getStorage", "()Ljavax/inject/Provider;", "Ljava/util/concurrent/locks/Lock;", "Ljava/lang/String;", "getCollector", "()Ljava/lang/String;", "Z", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "logger", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "getLogger", "()Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "idleState", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;", "getIdleState", "()Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;", "setIdleState", "Companion", "UploadResult", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAbstractUploader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractUploader.kt\nru/ok/android/externcalls/analytics/internal/upload/AbstractUploader\n+ 2 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,181:1\n17#2,6:182\n*S KotlinDebug\n*F\n+ 1 AbstractUploader.kt\nru/ok/android/externcalls/analytics/internal/upload/AbstractUploader\n*L\n115#1:182,6\n*E\n"})
public abstract class AbstractUploader implements Uploader {
    /* access modifiers changed from: private */
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Deprecated
    public static final String SDK_TYPE_STRING = "ANDROID";
    @Deprecated
    public static final int VERSION_INT = 1;
    /* access modifiers changed from: private */
    public static String appVersionString;
    /* access modifiers changed from: private */
    public static final String sdkVersionString = "125.1.0.48";
    private final String collector;
    private volatile Uploader.IdleStateProvider idleState;
    private final boolean isContentCompressed;
    private final Lock lock;
    /* access modifiers changed from: private */
    public final String logTag;
    private final CallAnalyticsLogger logger = CallAnalyticsConfigStorage.INSTANCE.getLogger();
    private final Provider<File> storage;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u00048FX\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader$Companion;", "", "()V", "SDK_TYPE_STRING", "", "VERSION_INT", "", "appVersionString", "applicationVersionParams", "getApplicationVersionParams$annotations", "getApplicationVersionParams", "()Ljava/lang/String;", "platformParam", "getPlatformParam", "sdkVersionString", "getSdkVersionString", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static /* synthetic */ void getApplicationVersionParams$annotations() {
        }

        public final String getApplicationVersionParams() {
            int i;
            String access$getAppVersionString$cp = AbstractUploader.appVersionString;
            if (access$getAppVersionString$cp != null) {
                return access$getAppVersionString$cp;
            }
            String str = ApplicationProvider.c;
            if (str == null) {
                Application w = kv0.w();
                PackageInfo packageInfo = w.getPackageManager().getPackageInfo(w.getPackageName(), 0);
                String str2 = packageInfo.versionName;
                ApplicationProvider.c = str2;
                if (ApplicationProvider.b == null) {
                    ApplicationProvider.b = Integer.valueOf(packageInfo.versionCode);
                }
                str = str2;
            }
            Integer num = ApplicationProvider.b;
            if (num != null) {
                i = num.intValue();
            } else {
                PackageInfo packageInfo2 = kv0.w().getPackageManager().getPackageInfo(kv0.w().getPackageName(), 0);
                int i2 = packageInfo2.versionCode;
                ApplicationProvider.b = Integer.valueOf(i2);
                if (ApplicationProvider.c == null) {
                    ApplicationProvider.c = packageInfo2.versionName;
                }
                i = i2;
            }
            String str3 = str + ":" + i;
            Companion unused = AbstractUploader.Companion;
            AbstractUploader.appVersionString = str3;
            return str3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
            r0 = (r0 = (r0 = r0.getEventMetaParams()).getAppName()).invoke();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String getPlatformParam() {
            /*
                r0 = this;
                ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage r0 = ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage.INSTANCE
                ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig r0 = r0.getConfig()
                if (r0 == 0) goto L_0x001c
                ru.ok.android.externcalls.analytics.config.EventMetaParamsConfig r0 = r0.getEventMetaParams()
                if (r0 == 0) goto L_0x001c
                kotlin.jvm.functions.Function0 r0 = r0.getAppName()
                if (r0 == 0) goto L_0x001c
                java.lang.Object r0 = r0.invoke()
                java.lang.String r0 = (java.lang.String) r0
                if (r0 != 0) goto L_0x001e
            L_0x001c:
                java.lang.String r0 = "debug"
            L_0x001e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader.Companion.getPlatformParam():java.lang.String");
        }

        public final String getSdkVersionString() {
            return AbstractUploader.sdkVersionString;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader$UploadResult;", "", "(Ljava/lang/String;I)V", "SUCCESS", "SKIP", "ERROR", "BAD_CONTENT", "RECOVERABLE_ERROR", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum UploadResult {
        SUCCESS,
        SKIP,
        ERROR,
        BAD_CONTENT,
        RECOVERABLE_ERROR;

        static {
            UploadResult[] $values;
            $ENTRIES = EnumEntriesKt.enumEntries((E[]) $values);
        }

        public static EnumEntries<UploadResult> getEntries() {
            return $ENTRIES;
        }
    }

    public AbstractUploader(Provider<File> provider, Lock lock2, String str, boolean z, String str2) {
        this.storage = provider;
        this.lock = lock2;
        this.collector = str;
        this.isContentCompressed = z;
        this.logTag = str2;
    }

    private final void executeApiMethod(wl wlVar, String str, hs0 hs0) throws IOException, ApiException {
        Companion companion = Companion;
        try {
            wlVar.a(new CallAnalyticsApiRequest(str, companion.getPlatformParam(), companion.getApplicationVersionParams(), SDK_TYPE_STRING, sdkVersionString, 1, hs0, CallAnalyticsConfigStorage.INSTANCE.getLogger()));
        } catch (ApiInvocationException e) {
            reportApiInvocationError(new UploadException(str, e));
            throw e;
        } catch (Throwable th) {
            reportApiInvocationError(new UploadException(str, th));
            throw th;
        }
    }

    public static final String getApplicationVersionParams() {
        return Companion.getApplicationVersionParams();
    }

    private final void reportApiInvocationError(UploadException uploadException) {
        CallAnalyticsLogger logger2 = CallAnalyticsConfigStorage.INSTANCE.getLogger();
        if (logger2 != null) {
            String message = uploadException.getMessage();
            String str = this.logTag;
            if (message == null) {
                message = "";
            }
            logger2.report(str, message, uploadException);
        }
    }

    /* access modifiers changed from: private */
    public final UploadResult uploadFileWithContent(wl wlVar, File file) throws ApiInvocationException, IOException {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            executeApiMethod(wlVar, this.collector, new StreamingItemsApiValue(file, this.isContentCompressed));
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            CallAnalyticsLogger callAnalyticsLogger = this.logger;
            String str = this.logTag;
            callAnalyticsLogger.d(str, "upload completed, took " + currentTimeMillis2 + "ms");
            return UploadResult.SUCCESS;
        } catch (ApiInvocationException e) {
            int i = e.a;
            if (i == 2 || i == 453 || i == 102 || i == 103) {
                this.logger.w(this.logTag, "recoverable invocation error occurred, will retry");
                throw e;
            }
            CallAnalyticsLogger callAnalyticsLogger2 = this.logger;
            String str2 = this.logTag;
            callAnalyticsLogger2.e(str2, "upload failed: " + e.b + ", removing possibly broken logs");
            return UploadResult.BAD_CONTENT;
        } catch (ApiRequestException e2) {
            CallAnalyticsLogger callAnalyticsLogger3 = this.logger;
            String str3 = this.logTag;
            String message = e2.getMessage();
            callAnalyticsLogger3.e(str3, "upload failed: " + message + ", removing likely broken logs");
            return UploadResult.BAD_CONTENT;
        }
    }

    public void drop() {
        withLock(new AbstractUploader$drop$1(this));
    }

    public final File ensureStorageIsOfCorrectType(boolean z) {
        File file = this.storage.get();
        if (file.exists() && file.isDirectory() != z) {
            try {
                Files.delete(file);
            } catch (IOException unused) {
                CallAnalyticsLogger callAnalyticsLogger = this.logger;
                String str = this.logTag;
                String name = file.getName();
                callAnalyticsLogger.d(str, "File " + name + " isDirectory != " + z + " but can not be deleted");
            }
        }
        return file;
    }

    public final String getCollector() {
        return this.collector;
    }

    public final Uploader.IdleStateProvider getIdleState() {
        return this.idleState;
    }

    public final CallAnalyticsLogger getLogger() {
        return this.logger;
    }

    public final Provider<File> getStorage() {
        return this.storage;
    }

    public final void setIdleState(Uploader.IdleStateProvider idleStateProvider) {
        this.idleState = idleStateProvider;
    }

    public void setIdleStateProvider(Uploader.IdleStateProvider idleStateProvider) {
        this.idleState = idleStateProvider;
    }

    public final UploadResult uploadFile(File file) {
        return (UploadResult) withLock(new AbstractUploader$uploadFile$1(this, file));
    }

    public final <T> T withLock(Function0<? extends T> function0) {
        try {
            this.lock.lock();
            return function0.invoke();
        } finally {
            this.lock.unlock();
        }
    }
}
