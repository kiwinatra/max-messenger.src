package defpackage;

import java.util.Set;
import one.me.rlottie.RLottieImageViewUtils;

/* renamed from: hb8  reason: default package */
public final class hb8 {
    public Set a;

    public final void a() {
        Set<fb8> set = this.a;
        if (set != null) {
            for (fb8 fb8 : set) {
                db8 db8 = (db8) fb8;
                db8.getClass();
                RLottieImageViewUtils.release(db8);
                db8.x = null;
            }
        }
    }
}
