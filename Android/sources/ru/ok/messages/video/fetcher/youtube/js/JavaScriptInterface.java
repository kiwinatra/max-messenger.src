package ru.ok.messages.video.fetcher.youtube.js;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import androidx.annotation.Keep;
import java.util.concurrent.atomic.AtomicReference;

public class JavaScriptInterface {
    public final qpg a;

    public JavaScriptInterface(qpg qpg) {
        this.a = qpg;
    }

    @JavascriptInterface
    @Keep
    public void returnResultToJava(String str) {
        qpg qpg = this.a;
        nrg nrg = (nrg) ((AtomicReference) qpg.c).getAndSet((Object) null);
        if (nrg != null) {
            ((Handler) qpg.o).post(new uj6(10, str, nrg));
        }
    }
}
