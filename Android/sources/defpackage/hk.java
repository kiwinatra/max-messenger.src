package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import kotlin.ranges.LongRange;

/* renamed from: hk  reason: default package */
public final class hk implements Runnable {
    public static final Handler o = new Handler(Looper.getMainLooper());
    public static volatile long v = -1;
    public final long a;
    public final WeakReference b;
    public volatile boolean c;

    public hk(View view) {
        this(view, 0);
    }

    public final void a() {
        this.c = false;
        if (this.b.get() != null) {
            o.postDelayed(this, this.a);
        }
    }

    public final void run() {
        if (this.c) {
            o.removeCallbacks(this);
            return;
        }
        View view = (View) this.b.get();
        if (view != null) {
            if (view.getParent() == null) {
                this.b.clear();
                return;
            }
            if (view.isAttachedToWindow()) {
                view.invalidate();
            }
            o.postDelayed(this, this.a);
        }
    }

    public hk(View view, int i) {
        Display display;
        long j;
        Context context = view.getContext();
        if (v == -1) {
            if (Build.VERSION.SDK_INT >= 30) {
                display = context.getDisplay();
            } else {
                display = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            }
            Long valueOf = display != null ? Long.valueOf((long) display.getRefreshRate()) : null;
            LongRange longRange = new LongRange(0, 30);
            if (valueOf == null || !longRange.contains(valueOf.longValue())) {
                LongRange longRange2 = new LongRange((long) 31, 60);
                if (valueOf == null || !longRange2.contains(valueOf.longValue())) {
                    j = (valueOf == null || !new LongRange((long) 61, 90).contains(valueOf.longValue())) ? 6 : 9;
                } else {
                    j = 12;
                }
            } else {
                j = 16;
            }
            v = j;
        }
        this.a = v;
        this.b = new WeakReference(view);
    }
}
