package ru.ok.android.externcalls.analytics.internal.upload;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;
import kotlin.jvm.internal.LongCompanionObject;
import ru.ok.android.externcalls.analytics.config.UploadConfig;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.storage.FileCacheWriter;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

public final class Worker {
    private static final String LOG_TAG = "CallAnalyticsWorker";
    private static final int MSG_APPEND = 0;
    private static final int MSG_FLUSH = 1;
    private static final int MSG_UPLOAD_MAX_TIMEOUT = 3;
    private static final int MSG_UPLOAD_SILENCE_TIMEOUT = 2;
    private static volatile Looper looper;
    private final String apiMethod;
    private final FileCacheWriter fileCacheWriter;
    private final Handler handler;
    private int itemCount = 0;
    private final CallAnalyticsLogger logger;
    private final ConcurrentHashMap<String, Long> millisToUpload = new ConcurrentHashMap<>();
    private volatile long millisToUploadAny = LongCompanionObject.MAX_VALUE;

    public class Callback implements Handler.Callback {
        public /* synthetic */ Callback(Worker worker, int i) {
            this();
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                Worker.this.handleAppend((CallAnalyticsEvent) message.obj);
                return true;
            } else if (i == 1) {
                Worker.this.handleFlush((ConditionVariable) message.obj);
                return true;
            } else if (i == 2) {
                Worker.this.handleUploadSilenceTimeout();
                return true;
            } else if (i != 3) {
                return false;
            } else {
                Worker.this.handleUploadMaxTimeout();
                return true;
            }
        }

        private Callback() {
        }
    }

    public Worker(Provider<Looper> provider, Provider<File> provider2, Lock lock, String str, boolean z) {
        this.apiMethod = str;
        this.fileCacheWriter = new FileCacheWriter(provider2, z, lock);
        this.handler = new Handler(provider.get(), new Callback(this, 0));
        this.logger = CallAnalyticsConfigStorage.INSTANCE.getLogger();
    }

    private long getMaxTimeToUpload(String str) {
        Long l = this.millisToUpload.get(str);
        return (l == null || l.longValue() >= LongCompanionObject.MAX_VALUE) ? this.millisToUploadAny < LongCompanionObject.MAX_VALUE ? this.millisToUploadAny : CallAnalyticsConfigStorage.INSTANCE.getUpload().getMaxTimeToUploadMillis() : l.longValue();
    }

    /* access modifiers changed from: private */
    public void handleAppend(CallAnalyticsEvent callAnalyticsEvent) {
        this.fileCacheWriter.writeToCache(callAnalyticsEvent);
        this.itemCount++;
        UploadConfig upload = CallAnalyticsConfigStorage.INSTANCE.getUpload();
        int fileLengthTriggerToUploadBytes = upload.getFileLengthTriggerToUploadBytes();
        int eventCountToUploadNumber = upload.getEventCountToUploadNumber();
        long length = this.fileCacheWriter.length();
        if (length >= ((long) fileLengthTriggerToUploadBytes)) {
            this.logger.d(LOG_TAG, "trigger | log file size exceeded " + (fileLengthTriggerToUploadBytes / 1000) + "Kb, log items count: " + this.itemCount);
            startUpload();
        } else if (this.itemCount >= eventCountToUploadNumber) {
            this.logger.d(LOG_TAG, "trigger | log items count exceeded " + eventCountToUploadNumber + "s, file size: " + length);
            startUpload();
        }
    }

    /* access modifiers changed from: private */
    public void handleFlush(ConditionVariable conditionVariable) {
        conditionVariable.open();
        this.logger.d(LOG_TAG, "trigger flush");
        startUpload();
    }

    /* access modifiers changed from: private */
    public void handleUploadMaxTimeout() {
        this.logger.d(LOG_TAG, "trigger | max time since log item passed");
        startUpload();
    }

    /* access modifiers changed from: private */
    public void handleUploadSilenceTimeout() {
        this.logger.d(LOG_TAG, wj6.j(CallAnalyticsConfigStorage.INSTANCE.getUpload().getSilenceToUploadMillis(), "trigger | time since last log item exceeded ", "ms"));
        startUpload();
    }

    private void startUpload() {
        UploadStarter.INSTANCE.startUpload(this.apiMethod);
    }

    public void clearMaxMillisToUpload() {
        this.millisToUploadAny = LongCompanionObject.MAX_VALUE;
        this.millisToUpload.clear();
    }

    public void drop() {
        try {
            this.fileCacheWriter.drop();
        } catch (IOException e) {
            this.logger.e(LOG_TAG, "drop failed", e);
        }
    }

    public void flush() {
        flush(new ConditionVariable());
    }

    public void grab(Provider<File> provider) throws IOException {
        if (provider != null) {
            this.fileCacheWriter.grab(provider);
        }
    }

    public void scheduleEventSend(CallAnalyticsEvent callAnalyticsEvent) {
        Handler handler2 = this.handler;
        handler2.sendMessage(Message.obtain(handler2, 0, callAnalyticsEvent));
        long silenceToUploadMillis = CallAnalyticsConfigStorage.INSTANCE.getUpload().getSilenceToUploadMillis();
        if (silenceToUploadMillis < LongCompanionObject.MAX_VALUE) {
            this.handler.removeMessages(2);
            this.handler.sendEmptyMessageDelayed(2, silenceToUploadMillis);
        }
    }

    public void setMaxMillisToUpload(String str, long j) {
        if (j < LongCompanionObject.MAX_VALUE) {
            this.millisToUpload.put(str, Long.valueOf(j));
        } else {
            this.millisToUpload.remove(str);
        }
    }

    public void setMaxMillisToUploadAny(long j) {
        this.millisToUploadAny = j;
    }

    private void flush(ConditionVariable conditionVariable) {
        Message.obtain(this.handler, 1, conditionVariable).sendToTarget();
        conditionVariable.block();
    }
}
