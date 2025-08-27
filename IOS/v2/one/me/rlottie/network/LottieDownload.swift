package one.me.rlottie.network;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0011¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\n¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001a¢\u0006\u0004\b)\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010.R:\u00103\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a01 2*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a01\u0018\u000100000/8\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lone/me/rlottie/network/LottieDownload;", "", "Lone/me/rlottie/network/LottieNetworkFetcher;", "lottieNetworkFetcher", "Lmb8;", "lottieNetworkCache", "Ljava/util/concurrent/ExecutorService;", "executorService", "", "url", "", "networkFetchEnabled", "<init>", "(Lone/me/rlottie/network/LottieNetworkFetcher;Lmb8;Ljava/util/concurrent/ExecutorService;Ljava/lang/String;Z)V", "Ljava/io/File;", "file", "originalName", "", "notifyLoaded", "(Ljava/io/File;Ljava/lang/String;)V", "", "e", "notifyError", "(Ljava/lang/Throwable;)V", "Llb8;", "cacheEntry", "Lone/me/rlottie/network/LottieDownloadListener;", "listener", "handleResult", "(Llb8;Lone/me/rlottie/network/LottieDownloadListener;)V", "lottieDownloadListener", "restartWithListener", "(Lone/me/rlottie/network/LottieDownloadListener;)V", "addListenerInternal", "hasListener", "(Lone/me/rlottie/network/LottieDownloadListener;)Z", "start", "()V", "enabled", "setNetworkFetchEnabledAndRestartDownloadIfNeeded", "(Z)V", "withListener", "Lone/me/rlottie/network/LottieNetworkFetcher;", "Lmb8;", "Ljava/util/concurrent/ExecutorService;", "Ljava/lang/String;", "Z", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/ArrayList;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "listeners", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/Future;", "result", "Ljava/util/concurrent/Future;", "rlottie_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nLottieDownload.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LottieDownload.kt\none/me/rlottie/network/LottieDownload\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1863#2,2:200\n1863#2,2:202\n1#3:204\n*S KotlinDebug\n*F\n+ 1 LottieDownload.kt\none/me/rlottie/network/LottieDownload\n*L\n86#1:200,2\n93#1:202,2\n*E\n"})
public final class LottieDownload {
    private final ExecutorService executorService;
    private final AtomicReference<ArrayList<WeakReference<LottieDownloadListener>>> listeners;
    private final mb8 lottieNetworkCache;
    private final LottieNetworkFetcher lottieNetworkFetcher;
    private volatile boolean networkFetchEnabled;
    private volatile Future<lb8> result;
    private final String url;

    public LottieDownload(LottieNetworkFetcher lottieNetworkFetcher2, mb8 mb8, ExecutorService executorService2, String str, boolean z) {
        this.lottieNetworkFetcher = lottieNetworkFetcher2;
        this.lottieNetworkCache = mb8;
        this.executorService = executorService2;
        this.url = str;
        this.networkFetchEnabled = z;
        this.listeners = new AtomicReference<>(new ArrayList());
    }

    private final void addListenerInternal(LottieDownloadListener lottieDownloadListener) {
        if (!hasListener(lottieDownloadListener)) {
            while (true) {
                ArrayList<WeakReference<LottieDownloadListener>> arrayList = this.listeners.get();
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList2.add(new WeakReference(lottieDownloadListener));
                AtomicReference<ArrayList<WeakReference<LottieDownloadListener>>> atomicReference = this.listeners;
                while (true) {
                    if (!atomicReference.compareAndSet(arrayList, arrayList2)) {
                        if (atomicReference.get() != arrayList) {
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private final void handleResult(lb8 lb8, LottieDownloadListener lottieDownloadListener) {
        if (lb8 != null) {
            try {
                if (lb8.b.exists()) {
                    if (lb8.b.canRead()) {
                        lottieDownloadListener.onFinished(this.url, lb8.b, lb8.a);
                        return;
                    }
                }
            } catch (Throwable th) {
                if (th instanceof ExecutionException) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        lottieDownloadListener.onFailed(cause);
                    }
                } else {
                    lottieDownloadListener.onFailed(th);
                }
                if (this.networkFetchEnabled) {
                    restartWithListener(lottieDownloadListener);
                    return;
                }
                return;
            }
        }
        if (this.networkFetchEnabled) {
            restartWithListener(lottieDownloadListener);
        }
    }

    private final boolean hasListener(LottieDownloadListener lottieDownloadListener) {
        boolean z = false;
        while (true) {
            ArrayList<WeakReference<LottieDownloadListener>> arrayList = this.listeners.get();
            ArrayList arrayList2 = new ArrayList(arrayList);
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    it.remove();
                } else if (weakReference.get() == lottieDownloadListener) {
                    z = true;
                    break;
                }
            }
            AtomicReference<ArrayList<WeakReference<LottieDownloadListener>>> atomicReference = this.listeners;
            while (true) {
                if (atomicReference.compareAndSet(arrayList, arrayList2)) {
                    return z;
                }
                if (atomicReference.get() != arrayList) {
                }
            }
        }
    }

    private final void notifyError(Throwable th) {
        for (WeakReference weakReference : this.listeners.get()) {
            LottieDownloadListener lottieDownloadListener = (LottieDownloadListener) weakReference.get();
            if (lottieDownloadListener != null) {
                lottieDownloadListener.onFailed(th);
            }
            weakReference.clear();
        }
    }

    private final void notifyLoaded(File file, String str) {
        for (WeakReference weakReference : this.listeners.get()) {
            LottieDownloadListener lottieDownloadListener = (LottieDownloadListener) weakReference.get();
            if (lottieDownloadListener != null) {
                lottieDownloadListener.onFinished(this.url, file, str);
            }
            weakReference.clear();
        }
    }

    private final void restartWithListener(LottieDownloadListener lottieDownloadListener) {
        addListenerInternal(lottieDownloadListener);
        start();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: one.me.rlottie.network.LottieFetchCall} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.io.FileOutputStream} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.lb8 start$lambda$3(one.me.rlottie.network.LottieDownload r10) {
        /*
            r0 = 0
            mb8 r1 = r10.lottieNetworkCache     // Catch:{ all -> 0x002f }
            java.lang.String r2 = r10.url     // Catch:{ all -> 0x002f }
            lb8 r1 = r1.b(r2)     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0037
            java.io.File r2 = r1.b     // Catch:{ all -> 0x002f }
            boolean r2 = r2.exists()     // Catch:{ all -> 0x002f }
            if (r2 == 0) goto L_0x0037
            java.io.File r2 = r1.b     // Catch:{ all -> 0x002f }
            boolean r2 = r2.canRead()     // Catch:{ all -> 0x002f }
            if (r2 == 0) goto L_0x0037
            java.io.File r2 = r1.b     // Catch:{ all -> 0x002f }
            java.lang.String r3 = r1.a     // Catch:{ all -> 0x002f }
            r10.notifyLoaded(r2, r3)     // Catch:{ all -> 0x002f }
            defpackage.nl7.a(r0)
            defpackage.nl7.a(r0)
            defpackage.nl7.a(r0)
            defpackage.nl7.c(r0)
            return r1
        L_0x002f:
            r1 = move-exception
            r2 = r0
            r3 = r2
            r4 = r3
        L_0x0033:
            r5 = r1
            r1 = r4
            goto L_0x00fb
        L_0x0037:
            boolean r1 = r10.networkFetchEnabled     // Catch:{ all -> 0x002f }
            if (r1 != 0) goto L_0x0048
            defpackage.nl7.a(r0)
            defpackage.nl7.a(r0)
            defpackage.nl7.a(r0)
            defpackage.nl7.c(r0)
            return r0
        L_0x0048:
            mb8 r1 = r10.lottieNetworkCache     // Catch:{ all -> 0x002f }
            java.lang.String r2 = r10.url     // Catch:{ all -> 0x002f }
            r1.getClass()     // Catch:{ all -> 0x002f }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x002f }
            one.me.rlottie.network.LottieCacheDirProvider r1 = r1.a     // Catch:{ all -> 0x002f }
            java.io.File r1 = r1.getCacheDir()     // Catch:{ all -> 0x002f }
            java.lang.String r2 = defpackage.mb8.a(r2)     // Catch:{ all -> 0x002f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x002f }
            r4.<init>()     // Catch:{ all -> 0x002f }
            r4.append(r2)     // Catch:{ all -> 0x002f }
            java.lang.String r2 = ".temp"
            r4.append(r2)     // Catch:{ all -> 0x002f }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x002f }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x002f }
            java.io.File r1 = r3.getParentFile()     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0078
            r1.mkdirs()     // Catch:{ all -> 0x002f }
        L_0x0078:
            boolean r1 = r3.exists()     // Catch:{ all -> 0x002f }
            if (r1 != 0) goto L_0x0081
            r3.createNewFile()     // Catch:{ all -> 0x002f }
        L_0x0081:
            one.me.rlottie.network.LottieNetworkFetcher r1 = r10.lottieNetworkFetcher     // Catch:{ all -> 0x00f6 }
            java.lang.String r2 = r10.url     // Catch:{ all -> 0x00f6 }
            one.me.rlottie.network.LottieFetchCall r1 = r1.fetch(r2)     // Catch:{ all -> 0x00f6 }
            boolean r2 = r1.isSuccessful()     // Catch:{ all -> 0x00e9 }
            if (r2 == 0) goto L_0x00ee
            java.io.InputStream r2 = r1.bodyByteStream()     // Catch:{ all -> 0x00e9 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x00e5 }
            r5 = 0
            r4.<init>(r3, r5)     // Catch:{ all -> 0x00e5 }
            r6 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x00af }
            kotlin.jvm.internal.Ref$IntRef r7 = new kotlin.jvm.internal.Ref$IntRef     // Catch:{ all -> 0x00af }
            r7.<init>()     // Catch:{ all -> 0x00af }
        L_0x00a2:
            int r8 = r2.read(r6)     // Catch:{ all -> 0x00af }
            r7.element = r8     // Catch:{ all -> 0x00af }
            r9 = -1
            if (r8 == r9) goto L_0x00b1
            r4.write(r6, r5, r8)     // Catch:{ all -> 0x00af }
            goto L_0x00a2
        L_0x00af:
            r5 = move-exception
            goto L_0x00fb
        L_0x00b1:
            r4.flush()     // Catch:{ all -> 0x00af }
            java.lang.String r5 = r1.fileName()     // Catch:{ all -> 0x00af }
            mb8 r6 = r10.lottieNetworkCache     // Catch:{ all -> 0x00af }
            java.lang.String r7 = r10.url     // Catch:{ all -> 0x00af }
            java.io.File r6 = r6.c(r7, r5)     // Catch:{ all -> 0x00af }
            java.io.File r7 = r6.getParentFile()     // Catch:{ all -> 0x00af }
            if (r7 == 0) goto L_0x00c9
            r7.mkdirs()     // Catch:{ all -> 0x00af }
        L_0x00c9:
            defpackage.nl7.b(r3, r6)     // Catch:{ all -> 0x00e1 }
            r10.notifyLoaded(r6, r5)     // Catch:{ all -> 0x00e1 }
            lb8 r0 = new lb8     // Catch:{ all -> 0x00e1 }
            r0.<init>(r6, r5)     // Catch:{ all -> 0x00e1 }
            defpackage.nl7.a(r1)
            defpackage.nl7.a(r2)
            defpackage.nl7.a(r4)
            defpackage.nl7.c(r3)
            return r0
        L_0x00e1:
            r0 = move-exception
            r5 = r0
            r0 = r6
            goto L_0x00fb
        L_0x00e5:
            r4 = move-exception
            r5 = r4
            r4 = r0
            goto L_0x00fb
        L_0x00e9:
            r2 = move-exception
            r4 = r0
            r5 = r2
            r2 = r4
            goto L_0x00fb
        L_0x00ee:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ all -> 0x00e9 }
            java.lang.String r4 = r10.url     // Catch:{ all -> 0x00e9 }
            r2.<init>(r4)     // Catch:{ all -> 0x00e9 }
            throw r2     // Catch:{ all -> 0x00e9 }
        L_0x00f6:
            r1 = move-exception
            r2 = r0
            r4 = r2
            goto L_0x0033
        L_0x00fb:
            defpackage.nl7.c(r0)     // Catch:{ all -> 0x0102 }
            r10.notifyError(r5)     // Catch:{ all -> 0x0102 }
            throw r5     // Catch:{ all -> 0x0102 }
        L_0x0102:
            r10 = move-exception
            defpackage.nl7.a(r1)
            defpackage.nl7.a(r2)
            defpackage.nl7.a(r4)
            defpackage.nl7.c(r3)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.rlottie.network.LottieDownload.start$lambda$3(one.me.rlottie.network.LottieDownload):lb8");
    }

    /* access modifiers changed from: private */
    public static final void withListener$lambda$6(LottieDownload lottieDownload, LottieDownloadListener lottieDownloadListener) {
        try {
            Future<lb8> future = lottieDownload.result;
            lottieDownload.handleResult(future != null ? future.get() : null, lottieDownloadListener);
        } catch (Throwable th) {
            if (th instanceof ExecutionException) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    lottieDownloadListener.onFailed(cause);
                }
            } else {
                lottieDownloadListener.onFailed(th);
            }
            if (lottieDownload.networkFetchEnabled) {
                lottieDownload.restartWithListener(lottieDownloadListener);
            }
        }
    }

    public final void setNetworkFetchEnabledAndRestartDownloadIfNeeded(boolean z) {
        boolean z2 = this.networkFetchEnabled;
        this.networkFetchEnabled = z;
        if (!z2 && this.networkFetchEnabled) {
            start();
        }
    }

    public final void start() {
        Future<lb8> future = this.result;
        if (future == null || future.isDone()) {
            this.result = this.executorService.submit(new h5(13, this));
        }
    }

    public final void withListener(LottieDownloadListener lottieDownloadListener) {
        Future<lb8> future;
        if (this.result == null || ((future = this.result) != null && !future.isDone())) {
            addListenerInternal(lottieDownloadListener);
        } else {
            this.executorService.execute(new uo5(25, (Object) this, (Object) lottieDownloadListener));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LottieDownload(LottieNetworkFetcher lottieNetworkFetcher2, mb8 mb8, ExecutorService executorService2, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lottieNetworkFetcher2, mb8, executorService2, str, (i & 16) != 0 ? true : z);
    }
}
