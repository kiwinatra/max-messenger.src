package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: w6b  reason: default package */
public final class w6b implements Handler.Callback {
    public static final ExecutorService o;
    public static final ThreadLocal v = new ThreadLocal();
    public final ExecutorService a = o;
    public final Handler b = null;
    public final yoc c;

    static {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        o = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new gc(11));
    }

    public w6b(yoc yoc) {
        this.c = yoc;
    }

    public final boolean handleMessage(Message message) {
        qug qug = (qug) message.obj;
        if (qug.c) {
            return true;
        }
        qug.o++;
        this.c.log(jme.app_event, "rtc.long.executor.task." + qug.o, qug.a);
        if (qug.o >= 4) {
            return true;
        }
        Handler handler = this.b;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.obj = qug;
            this.b.sendMessageDelayed(obtainMessage, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
            return true;
        }
        throw new IllegalStateException("No task duration check thread");
    }
}
