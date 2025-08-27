package defpackage;

import android.os.SystemClock;
import org.webrtc.Size;

/* renamed from: kv1  reason: default package */
public final class kv1 implements lv1 {
    public final voc a;
    public final zjf b = new zjf();
    public volatile Size c = new Size(0, 0);
    public long d = SystemClock.elapsedRealtime();

    public kv1(voc voc) {
        this.a = voc;
    }

    public final String toString() {
        double b2 = this.b.b();
        Size size = this.c;
        return "fps estimation: " + b2 + ", frame size: " + size;
    }
}
