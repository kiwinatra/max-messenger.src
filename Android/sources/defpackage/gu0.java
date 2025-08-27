package defpackage;

import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;

/* renamed from: gu0  reason: default package */
public final /* synthetic */ class gu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iu0 b;

    public /* synthetic */ gu0(iu0 iu0, int i) {
        this.a = i;
        this.b = iu0;
    }

    public final void run() {
        int i = this.a;
        iu0 iu0 = this.b;
        switch (i) {
            case 0:
                iu0.k.set(false);
                iu0.g.stop();
                synchronized (iu0.e) {
                    iu0.f = null;
                    iu0.c.clear();
                }
                return;
            case 1:
                iu0.getClass();
                try {
                    iu0.g.start();
                    if (!iu0.k.getAndSet(true)) {
                        iu0.c();
                        return;
                    }
                    return;
                } catch (AudioStream$AudioStreamException e) {
                    throw new RuntimeException(e);
                }
            case 2:
                iu0.c();
                return;
            default:
                iu0.k.set(false);
                iu0.g.release();
                synchronized (iu0.e) {
                    iu0.f = null;
                    iu0.c.clear();
                }
                return;
        }
    }
}
