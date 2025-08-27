package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: jfg  reason: default package */
public final class jfg extends WeakReference implements mq4 {
    public final void dispose() {
        mq4 mq4 = (mq4) get();
        if (mq4 != null) {
            mq4.dispose();
        }
    }

    public final boolean f() {
        mq4 mq4 = (mq4) get();
        return mq4 == null || mq4.f();
    }
}
