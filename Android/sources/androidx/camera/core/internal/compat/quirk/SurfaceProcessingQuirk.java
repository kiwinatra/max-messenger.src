package androidx.camera.core.internal.compat.quirk;

import java.util.Iterator;

public interface SurfaceProcessingQuirk extends icc {
    static boolean d(ykb ykb) {
        Iterator it = ykb.h(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    boolean b() {
        return true;
    }
}
