package ru.ok.android.externcalls.analytics.internal.upload;

import java.io.File;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/SingleFileUploader;", "Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader;", "file", "Ljavax/inject/Provider;", "Ljava/io/File;", "lock", "Ljava/util/concurrent/locks/Lock;", "collector", "", "disableUploadWhenCallIsActive", "", "isContentCompressed", "(Ljavax/inject/Provider;Ljava/util/concurrent/locks/Lock;Ljava/lang/String;ZZ)V", "getSink", "upload", "", "Companion", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SingleFileUploader extends AbstractUploader {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String LOG_TAG = "CallAnalyticsUploader";
    private final boolean disableUploadWhenCallIsActive;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/SingleFileUploader$Companion;", "", "()V", "LOG_TAG", "", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SingleFileUploader(Provider provider, Lock lock, String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(provider, lock, str, (i & 8) != 0 ? false : z, z2);
    }

    public File getSink() {
        return (File) withLock(new SingleFileUploader$getSink$1(this));
    }

    public void upload() {
        Uploader.IdleStateProvider idleState;
        if (!this.disableUploadWhenCallIsActive || (idleState = getIdleState()) == null || idleState.isIdle()) {
            try {
                uploadFile(getStorage().get());
            } catch (Throwable th) {
                getLogger().report(LOG_TAG, "Upload failed", new UploadException(getCollector(), th));
            }
        } else {
            getLogger().d(LOG_TAG, "call is not idle, postpone upload");
        }
    }

    public SingleFileUploader(Provider<File> provider, Lock lock, String str, boolean z, boolean z2) {
        super(provider, lock, str, z2, LOG_TAG);
        this.disableUploadWhenCallIsActive = z;
    }
}
