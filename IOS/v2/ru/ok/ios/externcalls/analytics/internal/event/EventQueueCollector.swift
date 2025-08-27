package ru.ok.android.externcalls.analytics.internal.event;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.inject.Provider;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;
import ru.ok.android.externcalls.analytics.internal.upload.Worker;

public final class EventQueueCollector {
    private static final String APPEND_FILENAME = "append";
    private static final ConcurrentHashMap<String, EventQueueCollector> INSTANCES = new ConcurrentHashMap<>();
    private static final String LOG_DIRNAME = "calls-sdk-analytics";
    private static final String UPLOAD_FILENAME = "upload";
    private static volatile Uploader.IdleStateProvider idleStateProvider = null;
    @SuppressLint({"StaticFieldLeak"})
    private static volatile EventQueueCollector lastInstance;
    private static final LooperProvider looperProvider = new LooperProvider(0);
    /* access modifiers changed from: private */
    public final String apiMethod;
    private final AtomicReference<Boolean> compressionEnabled = new AtomicReference<>();
    /* access modifiers changed from: private */
    @SuppressLint({"StaticFieldLeak"})
    public final Context context;
    private final Lock uploadLock;
    private final AtomicReference<Uploader> uploader = new AtomicReference<>();
    private final AtomicReference<Worker> worker = new AtomicReference<>();

    public interface IdleStateProvider {
        boolean isIdle();
    }

    public static final class LooperProvider implements Provider<Looper> {
        private volatile Looper looper;

        private LooperProvider() {
        }

        public /* synthetic */ LooperProvider(int i) {
            this();
        }

        public Looper get() {
            if (this.looper == null) {
                synchronized (this) {
                    try {
                        if (this.looper == null) {
                            HandlerThread handlerThread = new HandlerThread("one-log");
                            handlerThread.start();
                            this.looper = handlerThread.getLooper();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.looper;
        }
    }

    public final class OneLogFile implements Provider<File> {
        private File cachedFile;
        private final String name;

        public OneLogFile(String str) {
            this.name = str;
        }

        public File get() {
            File file = this.cachedFile;
            if (file != null) {
                return file;
            }
            File file2 = new File(new File(new File(EventQueueCollector.this.context.getFilesDir(), "calls-sdk-analytics"), EventQueueCollector.this.apiMethod), this.name);
            this.cachedFile = file2;
            return file2;
        }
    }

    private EventQueueCollector(Context context2, String str) {
        this.context = context2;
        this.apiMethod = str;
        this.uploadLock = new ReentrantLock();
    }

    public static void clearAllMaxTimeToUpload() {
        for (EventQueueCollector worker2 : INSTANCES.values()) {
            worker2.getWorker().clearMaxMillisToUpload();
        }
    }

    public static void flushAll() {
        for (EventQueueCollector flush : INSTANCES.values()) {
            flush.flush();
        }
    }

    public static EventQueueCollector getInstance(String str) {
        Application application = ApplicationProvider.a;
        Application w = kv0.w();
        EventQueueCollector eventQueueCollector = lastInstance;
        if (eventQueueCollector != null && str.equals(eventQueueCollector.apiMethod)) {
            return eventQueueCollector;
        }
        ConcurrentHashMap<String, EventQueueCollector> concurrentHashMap = INSTANCES;
        EventQueueCollector eventQueueCollector2 = concurrentHashMap.get(str);
        if (eventQueueCollector2 != null) {
            lastInstance = eventQueueCollector2;
            return eventQueueCollector2;
        }
        EventQueueCollector eventQueueCollector3 = new EventQueueCollector(w, str);
        EventQueueCollector putIfAbsent = concurrentHashMap.putIfAbsent(str, eventQueueCollector3);
        if (putIfAbsent != null) {
            lastInstance = putIfAbsent;
            return putIfAbsent;
        }
        eventQueueCollector3.getUploader().setIdleStateProvider(idleStateProvider);
        lastInstance = eventQueueCollector3;
        return eventQueueCollector3;
    }

    private Uploader getUploader() {
        Uploader uploader2 = this.uploader.get();
        if (uploader2 != null) {
            return uploader2;
        }
        Uploader create = Uploader.create(looperProvider, new OneLogFile(UPLOAD_FILENAME), this.uploadLock, this.apiMethod, isContentCompressionEnabled());
        AtomicReference<Uploader> atomicReference = this.uploader;
        while (!atomicReference.compareAndSet((Object) null, create)) {
            if (atomicReference.get() != null) {
                return this.uploader.get();
            }
        }
        return create;
    }

    private Worker getWorker() {
        Worker worker2 = this.worker.get();
        if (worker2 != null) {
            return worker2;
        }
        Worker worker3 = new Worker(looperProvider, new OneLogFile(APPEND_FILENAME), new ReentrantLock(), this.apiMethod, isContentCompressionEnabled());
        AtomicReference<Worker> atomicReference = this.worker;
        while (!atomicReference.compareAndSet((Object) null, worker3)) {
            if (atomicReference.get() != null) {
                return this.worker.get();
            }
        }
        return worker3;
    }

    private boolean isContentCompressionEnabled() {
        Boolean bool = this.compressionEnabled.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        CallAnalyticsConfig config = CallAnalyticsConfigStorage.INSTANCE.getConfig();
        boolean z = config != null && config.getUpload().getCompressContent();
        AtomicReference<Boolean> atomicReference = this.compressionEnabled;
        Boolean valueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet((Object) null, valueOf)) {
            if (atomicReference.get() != null) {
                return this.compressionEnabled.get().booleanValue();
            }
        }
        return z;
    }

    public static void setIdleStateProvider(IdleStateProvider idleStateProvider2) {
        rt3 rt3 = idleStateProvider2 == null ? null : new rt3(26, (Object) idleStateProvider2);
        idleStateProvider = rt3;
        for (EventQueueCollector uploader2 : INSTANCES.values()) {
            Uploader uploader3 = uploader2.getUploader();
            if (uploader3 != null) {
                uploader3.setIdleStateProvider(rt3);
            }
        }
    }

    public void addEvent(CallAnalyticsEvent callAnalyticsEvent) {
        String apiMethodName = callAnalyticsEvent.getApiMethodName();
        if (apiMethodName.equals(this.apiMethod)) {
            getWorker().scheduleEventSend(callAnalyticsEvent);
            return;
        }
        throw new IllegalArgumentException("Unexpected apiMethod ".concat(apiMethodName));
    }

    public void drop() {
        getWorker().drop();
        getUploader().drop();
    }

    public void flush() {
        getWorker().flush();
    }

    /* JADX INFO: finally extract failed */
    public void upload() throws IOException {
        try {
            this.uploadLock.lock();
            Worker worker2 = getWorker();
            Uploader uploader2 = getUploader();
            Objects.requireNonNull(uploader2);
            worker2.grab(new rt3(25, (Object) uploader2));
            this.uploadLock.unlock();
            getUploader().upload();
        } catch (Throwable th) {
            this.uploadLock.unlock();
            throw th;
        }
    }
}
