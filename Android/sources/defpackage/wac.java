package defpackage;

import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: wac  reason: default package */
public final class wac implements h65 {
    public static final HashMap o;
    public final h65 a;
    public final qu1 b;
    public final ykb c;

    static {
        HashMap hashMap = new HashMap();
        o = hashMap;
        hashMap.put(1, yb0.i);
        hashMap.put(8, yb0.g);
        hashMap.put(6, yb0.f);
        hashMap.put(5, yb0.e);
        hashMap.put(4, yb0.d);
        hashMap.put(0, yb0.h);
    }

    public wac(qu1 qu1, h65 h65, ykb ykb) {
        this.a = h65;
        this.b = qu1;
        this.c = ykb;
    }

    public final boolean m(int i) {
        if (this.a.m(i)) {
            yb0 yb0 = (yb0) o.get(Integer.valueOf(i));
            if (yb0 != null) {
                Iterator it = this.c.h(VideoQualityQuirk.class).iterator();
                while (it.hasNext()) {
                    VideoQualityQuirk videoQualityQuirk = (VideoQualityQuirk) it.next();
                    if (videoQualityQuirk != null && videoQualityQuirk.a(this.b, yb0)) {
                        if ((videoQualityQuirk instanceof SurfaceProcessingQuirk) && ((SurfaceProcessingQuirk) videoQualityQuirk).b()) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final i65 o(int i) {
        if (!m(i)) {
            return null;
        }
        return this.a.o(i);
    }
}
