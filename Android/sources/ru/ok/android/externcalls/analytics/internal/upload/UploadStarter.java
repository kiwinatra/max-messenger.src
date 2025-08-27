package ru.ok.android.externcalls.analytics.internal.upload;

import java.io.IOException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/UploadStarter;", "", "()V", "LOG_TAG", "", "startUpload", "", "apiMethod", "upload", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UploadStarter {
    public static final UploadStarter INSTANCE = new UploadStarter();
    private static final String LOG_TAG = "UploadStarter";

    private UploadStarter() {
    }

    /* access modifiers changed from: private */
    public static final void startUpload$lambda$0(String str) {
        try {
            INSTANCE.upload(str);
        } catch (IOException e) {
            CallAnalyticsConfigStorage.INSTANCE.getLogger().e(LOG_TAG, "Cannot upload", e);
        }
    }

    public final void startUpload(String str) {
        Executor uploadExecutor = CallAnalyticsConfigStorage.INSTANCE.getUpload().getUploadExecutor();
        if (uploadExecutor == null) {
            UploadService.startUpload(str);
        } else {
            uploadExecutor.execute(new qof(4, str));
        }
    }

    public final void upload(String str) throws IOException {
        EventQueueCollector.getInstance(str).upload();
    }
}
