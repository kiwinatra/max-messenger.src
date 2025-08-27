package ru.ok.android.externcalls.analytics.internal.upload;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class MultiFileUploader$getSink$1 extends Lambda implements Function0<File> {
    final /* synthetic */ MultiFileUploader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiFileUploader$getSink$1(MultiFileUploader multiFileUploader) {
        super(0);
        this.this$0 = multiFileUploader;
    }

    public final File invoke() {
        this.this$0.ensureStorageIsOfCorrectType(true);
        return this.this$0.createNewFile();
    }
}
