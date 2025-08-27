package ru.ok.android.externcalls.analytics.internal.upload;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader;
import ru.ok.android.externcalls.analytics.internal.utils.Files;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader$UploadResult;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class AbstractUploader$uploadFile$1 extends Lambda implements Function0<AbstractUploader.UploadResult> {
    final /* synthetic */ File $file;
    final /* synthetic */ AbstractUploader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractUploader$uploadFile$1(AbstractUploader abstractUploader, File file) {
        super(0);
        this.this$0 = abstractUploader;
        this.$file = file;
    }

    public final AbstractUploader.UploadResult invoke() {
        CallAnalyticsConfig config = CallAnalyticsConfigStorage.INSTANCE.getConfig();
        if (config == null) {
            this.this$0.getLogger().d(this.this$0.logTag, "api not initialized, will retry");
            return AbstractUploader.UploadResult.SKIP;
        }
        try {
            if (this.$file.isFile()) {
                if (Files.length(this.$file) != 0) {
                    AbstractUploader.UploadResult access$uploadFileWithContent = this.this$0.uploadFileWithContent(config.getOkApi().a(), this.$file);
                    Files.delete(this.$file);
                    return access$uploadFileWithContent;
                }
            }
            this.this$0.getLogger().d(this.this$0.logTag, "nothing to upload");
            try {
                Files.delete(this.$file);
            } catch (Throwable th) {
                CallAnalyticsLogger logger = this.this$0.getLogger();
                String access$getLogTag$p = this.this$0.logTag;
                String path = this.$file.getPath();
                logger.e(access$getLogTag$p, "can't delete empty file " + path, th);
            }
            return AbstractUploader.UploadResult.SKIP;
        } catch (IOException e) {
            this.this$0.getLogger().e(this.this$0.logTag, "upload failed due to io error", e);
            return AbstractUploader.UploadResult.ERROR;
        } catch (ApiException e2) {
            this.this$0.getLogger().e(this.this$0.logTag, "upload failed due to api error", e2);
            return AbstractUploader.UploadResult.RECOVERABLE_ERROR;
        }
    }
}
