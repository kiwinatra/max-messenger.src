package defpackage;

import android.view.Choreographer;

/* renamed from: z1c  reason: default package */
public abstract class z1c {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new mg(1, runnable));
    }
}
