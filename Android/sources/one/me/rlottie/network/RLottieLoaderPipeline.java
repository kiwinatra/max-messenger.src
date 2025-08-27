package one.me.rlottie.network;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import one.me.rlottie.RLottie;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR:\u0010\u000e\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b \r*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\f0\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lone/me/rlottie/network/RLottieLoaderPipeline;", "", "<init>", "()V", "", "url", "", "networkFetchEnabled", "Lone/me/rlottie/network/LottieDownload;", "download", "(Ljava/lang/String;Z)Lone/me/rlottie/network/LottieDownload;", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/HashMap;", "kotlin.jvm.PlatformType", "downloads", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/ExecutorService;", "executorService$delegate", "Lkotlin/Lazy;", "getExecutorService", "()Ljava/util/concurrent/ExecutorService;", "executorService", "Lmb8;", "networkCache", "Lmb8;", "rlottie_release"}, k = 1, mv = {2, 0, 0})
public final class RLottieLoaderPipeline {
    public static final RLottieLoaderPipeline INSTANCE = new RLottieLoaderPipeline();
    private static final AtomicReference<HashMap<String, LottieDownload>> downloads = new AtomicReference<>(new HashMap());
    private static final Lazy executorService$delegate = RLottie.getConfig().getDownloadExecutor();
    private static final mb8 networkCache = new mb8(RLottie.getConfig().getCacheProvider());

    private RLottieLoaderPipeline() {
    }

    @JvmStatic
    @JvmOverloads
    public static final LottieDownload download(String str) {
        return download$default(str, false, 2, (Object) null);
    }

    public static /* synthetic */ LottieDownload download$default(String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return download(str, z);
    }

    private final ExecutorService getExecutorService() {
        return (ExecutorService) executorService$delegate.getValue();
    }

    @JvmStatic
    @JvmOverloads
    public static final LottieDownload download(String str, boolean z) {
        LottieDownload lottieDownload;
        loop0:
        while (true) {
            AtomicReference<HashMap<String, LottieDownload>> atomicReference = downloads;
            HashMap<String, LottieDownload> hashMap = atomicReference.get();
            HashMap hashMap2 = new HashMap(hashMap);
            lottieDownload = (LottieDownload) hashMap2.get(str);
            if (lottieDownload == null) {
                lottieDownload = new LottieDownload(RLottie.getConfig().getFetcher(), networkCache, INSTANCE.getExecutorService(), str, z);
                hashMap2.put(str, lottieDownload);
                lottieDownload.start();
                hashMap2.put(str, lottieDownload);
            }
            while (true) {
                if (atomicReference.compareAndSet(hashMap, hashMap2)) {
                    break loop0;
                } else if (atomicReference.get() != hashMap) {
                }
            }
        }
        if (z) {
            lottieDownload.setNetworkFetchEnabledAndRestartDownloadIfNeeded(true);
        }
        return lottieDownload;
    }
}
