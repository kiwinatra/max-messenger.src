package one.me.rlottie.network;

import java.io.File;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lone/me/rlottie/network/LottieDownloadListener;", "", "onFinished", "", "url", "", "file", "Ljava/io/File;", "originalName", "onFailed", "throwable", "", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LottieDownloadListener {
    void onFailed(Throwable th);

    void onFinished(String str, File file, String str2);
}
