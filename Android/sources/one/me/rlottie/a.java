package one.me.rlottie;

import android.os.Handler;
import android.os.Looper;

public abstract class a {
    public static final Handler a = new Handler(Looper.getMainLooper());
    public static final float b = 1.0f;

    public static int a(float f) {
        if (f == c44.DEFAULT_ASPECT_RATIO) {
            return 0;
        }
        return (int) Math.ceil((double) (b * f));
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void c(long j, Runnable runnable) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        Handler handler = a;
        if (i == 0) {
            handler.post(runnable);
        } else {
            handler.postDelayed(runnable, j);
        }
    }

    public static void d(Runnable runnable) {
        c(0, runnable);
    }
}
