package defpackage;

import android.media.ImageReader;
import java.util.concurrent.Executor;

/* renamed from: ge  reason: default package */
public final /* synthetic */ class ge implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ he a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ ia7 c;

    public /* synthetic */ ge(he heVar, Executor executor, ia7 ia7) {
        this.a = heVar;
        this.b = executor;
        this.c = ia7;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        he heVar = this.a;
        Executor executor = this.b;
        ia7 ia7 = this.c;
        synchronized (heVar.o) {
            try {
                if (!heVar.b) {
                    executor.execute(new c(3, heVar, ia7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
