package ru.ok.android.externcalls.analytics.internal.upload;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class MultiFileUploader$handler$2 extends Lambda implements Function0<Handler> {
    final /* synthetic */ MultiFileUploader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiFileUploader$handler$2(MultiFileUploader multiFileUploader) {
        super(0);
        this.this$0 = multiFileUploader;
    }

    public final Handler invoke() {
        return new Handler((Looper) this.this$0.looperProvider.get(), new MultiFileUploader.LooperCallback(this.this$0));
    }
}
