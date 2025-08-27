package one.me.rlottie;

import android.content.Context;
import android.content.res.Resources;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import one.me.rlottie.network.LottieCacheDirProvider;
import one.me.rlottie.network.LottieNetworkFetcher;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0007J\r\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0013R$\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\f8FX\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lone/me/rlottie/RLottie;", "", "<init>", "()V", "config", "Lone/me/rlottie/RLottie$Config;", "getConfig$annotations", "getConfig", "()Lone/me/rlottie/RLottie$Config;", "setConfig", "(Lone/me/rlottie/RLottie$Config;)V", "logger", "Lone/me/rlottie/RLottie$Logger;", "getLogger$annotations", "getLogger", "()Lone/me/rlottie/RLottie$Logger;", "init", "", "checkNativeLibraryLoad", "checkNativeLibraryLoad$rlottie_release", "Logger", "WorkQueue", "Config", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RLottie {
    public static final RLottie INSTANCE = new RLottie();
    public static Config config;

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0010\u0010\u0011\u001a\u00020\u00128\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u00128\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u00158\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u00020\u001a8\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lone/me/rlottie/RLottie$Config;", "", "context", "Landroid/content/Context;", "downloadExecutor", "Lkotlin/Lazy;", "Ljava/util/concurrent/ExecutorService;", "fetcher", "Lone/me/rlottie/network/LottieNetworkFetcher;", "cacheProvider", "Lone/me/rlottie/network/LottieCacheDirProvider;", "nativeLibraryLoader", "Lone/me/rlottie/NativeLibraryLoader;", "screenRefreshRate", "", "logger", "Lone/me/rlottie/RLottie$Logger;", "corePoolSize", "", "maxPoolSize", "workQueue", "Lone/me/rlottie/RLottie$WorkQueue;", "isHighPerformanceDevice", "Lkotlin/Function0;", "", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/Context;Lkotlin/Lazy;Lone/me/rlottie/network/LottieNetworkFetcher;Lone/me/rlottie/network/LottieCacheDirProvider;Lone/me/rlottie/NativeLibraryLoader;FLone/me/rlottie/RLottie$Logger;IILone/me/rlottie/RLottie$WorkQueue;Lkotlin/jvm/functions/Function0;Landroid/content/res/Resources;)V", "getDownloadExecutor", "()Lkotlin/Lazy;", "getFetcher", "()Lone/me/rlottie/network/LottieNetworkFetcher;", "getCacheProvider", "()Lone/me/rlottie/network/LottieCacheDirProvider;", "getNativeLibraryLoader", "()Lone/me/rlottie/NativeLibraryLoader;", "getLogger", "()Lone/me/rlottie/RLottie$Logger;", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Config {
        private final LottieCacheDirProvider cacheProvider;
        @JvmField
        public final int corePoolSize;
        private final Lazy<ExecutorService> downloadExecutor;
        private final LottieNetworkFetcher fetcher;
        @JvmField
        public final Function0<Boolean> isHighPerformanceDevice;
        private final Logger logger;
        @JvmField
        public final int maxPoolSize;
        private final NativeLibraryLoader nativeLibraryLoader;
        @JvmField
        public final Resources resources;
        @JvmField
        public final float screenRefreshRate;
        @JvmField
        public final WorkQueue workQueue;

        @JvmOverloads
        public Config(Context context, Lazy<? extends ExecutorService> lazy, WorkQueue workQueue2) {
            this(context, lazy, (LottieNetworkFetcher) null, (LottieCacheDirProvider) null, (NativeLibraryLoader) null, c44.DEFAULT_ASPECT_RATIO, (Logger) null, 0, 0, workQueue2, (Function0) null, (Resources) null, 3580, (DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: private */
        public static final boolean _init_$lambda$0() {
            return true;
        }

        public final LottieCacheDirProvider getCacheProvider() {
            return this.cacheProvider;
        }

        public final Lazy<ExecutorService> getDownloadExecutor() {
            return this.downloadExecutor;
        }

        public final LottieNetworkFetcher getFetcher() {
            return this.fetcher;
        }

        public final Logger getLogger() {
            return this.logger;
        }

        public final NativeLibraryLoader getNativeLibraryLoader() {
            return this.nativeLibraryLoader;
        }

        @JvmOverloads
        public Config(Context context, Lazy<? extends ExecutorService> lazy, LottieNetworkFetcher lottieNetworkFetcher, WorkQueue workQueue2) {
            this(context, lazy, lottieNetworkFetcher, (LottieCacheDirProvider) null, (NativeLibraryLoader) null, c44.DEFAULT_ASPECT_RATIO, (Logger) null, 0, 0, workQueue2, (Function0) null, (Resources) null, 3576, (DefaultConstructorMarker) null);
        }

        @JvmOverloads
        public Config(Context context, Lazy<? extends ExecutorService> lazy, LottieNetworkFetcher lottieNetworkFetcher, LottieCacheDirProvider lottieCacheDirProvider, NativeLibraryLoader nativeLibraryLoader2, float f, Logger logger2, int i, int i2, WorkQueue workQueue2) {
            this(context, lazy, lottieNetworkFetcher, lottieCacheDirProvider, nativeLibraryLoader2, f, logger2, i, i2, workQueue2, (Function0) null, (Resources) null, 3072, (DefaultConstructorMarker) null);
        }

        @JvmOverloads
        public Config(Context context, Lazy<? extends ExecutorService> lazy, LottieNetworkFetcher lottieNetworkFetcher, LottieCacheDirProvider lottieCacheDirProvider, NativeLibraryLoader nativeLibraryLoader2, float f, Logger logger2, int i, int i2, WorkQueue workQueue2, Function0<Boolean> function0) {
            this(context, lazy, lottieNetworkFetcher, lottieCacheDirProvider, nativeLibraryLoader2, f, logger2, i, i2, workQueue2, function0, (Resources) null, 2048, (DefaultConstructorMarker) null);
        }

        @JvmOverloads
        public Config(Context context, Lazy<? extends ExecutorService> lazy, LottieNetworkFetcher lottieNetworkFetcher, LottieCacheDirProvider lottieCacheDirProvider, NativeLibraryLoader nativeLibraryLoader2, float f, Logger logger2, int i, WorkQueue workQueue2) {
            this(context, lazy, lottieNetworkFetcher, lottieCacheDirProvider, nativeLibraryLoader2, f, logger2, i, 0, workQueue2, (Function0) null, (Resources) null, 3328, (DefaultConstructorMarker) null);
        }

        @JvmOverloads
        public Config(Context context, Lazy<? extends ExecutorService> lazy, LottieNetworkFetcher lottieNetworkFetcher, LottieCacheDirProvider lottieCacheDirProvider, NativeLibraryLoader nativeLibraryLoader2, float f, Logger logger2, WorkQueue workQueue2) {
            this(context, lazy, lottieNetworkFetcher, lottieCacheDirProvider, nativeLibraryLoader2, f, logger2, 0, 0, workQueue2, (Function0) null, (Resources) null, 3456, (DefaultConstructorMarker) null);
        }

        @JvmOverloads
        public Config(Context context, Lazy<? extends ExecutorService> lazy, LottieNetworkFetcher lottieNetworkFetcher, LottieCacheDirProvider lottieCacheDirProvider, NativeLibraryLoader nativeLibraryLoader2, float f, WorkQueue workQueue2) {
            this(context, lazy, lottieNetworkFetcher, lottieCacheDirProvider, nativeLibraryLoader2, f, (Logger) null, 0, 0, workQueue2, (Function0) null, (Resources) null, 3520, (DefaultConstructorMarker) null);
        }

        @JvmOverloads
        public Config(Context context, Lazy<? extends ExecutorService> lazy, LottieNetworkFetcher lottieNetworkFetcher, LottieCacheDirProvider lottieCacheDirProvider, NativeLibraryLoader nativeLibraryLoader2, WorkQueue workQueue2) {
            this(context, lazy, lottieNetworkFetcher, lottieCacheDirProvider, nativeLibraryLoader2, c44.DEFAULT_ASPECT_RATIO, (Logger) null, 0, 0, workQueue2, (Function0) null, (Resources) null, 3552, (DefaultConstructorMarker) null);
        }

        @JvmOverloads
        public Config(Context context, Lazy<? extends ExecutorService> lazy, LottieNetworkFetcher lottieNetworkFetcher, LottieCacheDirProvider lottieCacheDirProvider, WorkQueue workQueue2) {
            this(context, lazy, lottieNetworkFetcher, lottieCacheDirProvider, (NativeLibraryLoader) null, c44.DEFAULT_ASPECT_RATIO, (Logger) null, 0, 0, workQueue2, (Function0) null, (Resources) null, 3568, (DefaultConstructorMarker) null);
        }

        @JvmOverloads
        public Config(Context context, Lazy<? extends ExecutorService> lazy, LottieNetworkFetcher lottieNetworkFetcher, LottieCacheDirProvider lottieCacheDirProvider, NativeLibraryLoader nativeLibraryLoader2, float f, Logger logger2, int i, int i2, WorkQueue workQueue2, Function0<Boolean> function0, Resources resources2) {
            this.downloadExecutor = lazy;
            this.fetcher = lottieNetworkFetcher;
            this.cacheProvider = lottieCacheDirProvider;
            this.nativeLibraryLoader = nativeLibraryLoader2;
            this.screenRefreshRate = f;
            this.logger = logger2;
            this.corePoolSize = i;
            this.maxPoolSize = i2;
            this.workQueue = workQueue2;
            this.isHighPerformanceDevice = function0;
            this.resources = resources2;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Config(android.content.Context r14, kotlin.Lazy r15, one.me.rlottie.network.LottieNetworkFetcher r16, one.me.rlottie.network.LottieCacheDirProvider r17, one.me.rlottie.NativeLibraryLoader r18, float r19, one.me.rlottie.RLottie.Logger r20, int r21, int r22, one.me.rlottie.RLottie.WorkQueue r23, kotlin.jvm.functions.Function0 r24, android.content.res.Resources r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
            /*
                r13 = this;
                r1 = r14
                r0 = r26
                r2 = r0 & 4
                if (r2 == 0) goto L_0x000b
                wc8 r2 = defpackage.wc8.b
                r3 = r2
                goto L_0x000d
            L_0x000b:
                r3 = r16
            L_0x000d:
                r2 = r0 & 8
                if (r2 == 0) goto L_0x0018
                dm4 r2 = new dm4
                r2.<init>((android.content.Context) r14)
                r4 = r2
                goto L_0x001a
            L_0x0018:
                r4 = r17
            L_0x001a:
                r2 = r0 & 16
                if (r2 == 0) goto L_0x0026
                one.me.rlottie.NativeLibraryLoader$Companion r2 = one.me.rlottie.NativeLibraryLoader.Companion
                one.me.rlottie.NativeLibraryLoader r2 = r2.getDefault()
                r5 = r2
                goto L_0x0028
            L_0x0026:
                r5 = r18
            L_0x0028:
                r2 = r0 & 32
                if (r2 == 0) goto L_0x0052
                java.lang.String r2 = "display"
                java.lang.Object r2 = r14.getSystemService(r2)
                if (r2 == 0) goto L_0x004e
                android.hardware.display.DisplayManager r2 = (android.hardware.display.DisplayManager) r2
                android.view.Display[] r2 = r2.getDisplays()
                int r6 = r2.length
                r7 = 0
                r8 = 1
                if (r6 != 0) goto L_0x0041
                r6 = r8
                goto L_0x0042
            L_0x0041:
                r6 = r7
            L_0x0042:
                r6 = r6 ^ r8
                if (r6 == 0) goto L_0x004c
                r2 = r2[r7]
                float r2 = r2.getRefreshRate()
                goto L_0x0050
            L_0x004c:
                r2 = 0
                goto L_0x0050
            L_0x004e:
                r2 = 1114636288(0x42700000, float:60.0)
            L_0x0050:
                r6 = r2
                goto L_0x0054
            L_0x0052:
                r6 = r19
            L_0x0054:
                r2 = r0 & 64
                if (r2 == 0) goto L_0x0060
                one.me.rlottie.RLottie$Logger$Companion r2 = one.me.rlottie.RLottie.Logger.Companion
                one.me.rlottie.RLottie$Logger r2 = r2.getDefault$rlottie_release()
                r7 = r2
                goto L_0x0062
            L_0x0060:
                r7 = r20
            L_0x0062:
                r2 = r0 & 128(0x80, float:1.794E-43)
                if (r2 == 0) goto L_0x0070
                java.lang.Runtime r2 = java.lang.Runtime.getRuntime()
                int r2 = r2.availableProcessors()
                r8 = r2
                goto L_0x0072
            L_0x0070:
                r8 = r21
            L_0x0072:
                r2 = r0 & 256(0x100, float:3.59E-43)
                if (r2 == 0) goto L_0x0079
                r2 = 6
                r9 = r2
                goto L_0x007b
            L_0x0079:
                r9 = r22
            L_0x007b:
                r2 = r0 & 1024(0x400, float:1.435E-42)
                if (r2 == 0) goto L_0x0088
                mxb r2 = new mxb
                r10 = 13
                r2.<init>(r10)
                r11 = r2
                goto L_0x008a
            L_0x0088:
                r11 = r24
            L_0x008a:
                r0 = r0 & 2048(0x800, float:2.87E-42)
                if (r0 == 0) goto L_0x0094
                android.content.res.Resources r0 = r14.getResources()
                r12 = r0
                goto L_0x0096
            L_0x0094:
                r12 = r25
            L_0x0096:
                r0 = r13
                r1 = r14
                r2 = r15
                r10 = r23
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: one.me.rlottie.RLottie.Config.<init>(android.content.Context, kotlin.Lazy, one.me.rlottie.network.LottieNetworkFetcher, one.me.rlottie.network.LottieCacheDirProvider, one.me.rlottie.NativeLibraryLoader, float, one.me.rlottie.RLottie$Logger, int, int, one.me.rlottie.RLottie$WorkQueue, kotlin.jvm.functions.Function0, android.content.res.Resources, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0014\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lone/me/rlottie/RLottie$Logger;", "", "d", "", "message", "", "e", "error", "", "Companion", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Logger {
        public static final Companion Companion = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/me/rlottie/RLottie$Logger$Companion;", "", "<init>", "()V", "Default", "Lone/me/rlottie/RLottie$Logger;", "getDefault$rlottie_release", "()Lone/me/rlottie/RLottie$Logger;", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static final Logger Default = new Object();

            private Companion() {
            }

            public final Logger getDefault$rlottie_release() {
                return Default;
            }
        }

        static /* synthetic */ void e$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    th = null;
                }
                logger.e(str, th);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
        }

        void d(String str) {
        }

        void e(String str, Throwable th) {
        }

        static /* synthetic */ void e$default(Logger logger, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                logger.e(th);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
        }

        void e(Throwable th) {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lone/me/rlottie/RLottie$WorkQueue;", "", "post", "", "action", "Ljava/lang/Runnable;", "delay", "", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface WorkQueue {
        void post(Runnable runnable) {
        }

        void post(Runnable runnable, long j) {
        }
    }

    private RLottie() {
    }

    public static final Config getConfig() {
        Config config2 = config;
        if (config2 != null) {
            return config2;
        }
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getConfig$annotations() {
    }

    public static final Logger getLogger() {
        return getConfig().getLogger();
    }

    @JvmStatic
    public static /* synthetic */ void getLogger$annotations() {
    }

    @JvmStatic
    public static final void init(Config config2) {
        setConfig(config2);
        config2.getNativeLibraryLoader().load();
    }

    public static final void setConfig(Config config2) {
        config = config2;
    }

    public final void checkNativeLibraryLoad$rlottie_release() {
        try {
            RLottieDrawable.foo();
        } catch (UnsatisfiedLinkError unused) {
            NativeLibraryLoader.Companion.getDefault().load();
        }
    }
}
