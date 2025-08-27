package defpackage;

import android.os.Handler;
import android.os.Message;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: qug  reason: default package */
public final class qug implements Runnable {
    public final String a;
    public final Runnable b;
    public volatile boolean c = false;
    public int o = 0;
    public final /* synthetic */ w6b v;

    public qug(w6b w6b, String str, Runnable runnable) {
        this.v = w6b;
        this.a = str;
        this.b = runnable;
    }

    public final void run() {
        Handler handler = this.v.b;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.obj = this;
            this.v.b.sendMessageDelayed(obtainMessage, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
        }
        this.b.run();
        this.c = true;
    }
}
