package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* renamed from: xf  reason: default package */
public final class xf implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ((ag) this.b).invalidateSelf();
                return;
            case 1:
                Drawable.Callback callback = ((cl) this.b).getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            case 2:
                ((eoa) this.b).invalidateSelf();
                return;
            case 3:
                boolean isCurrentThread = Looper.getMainLooper().isCurrentThread();
                e1b e1b = (e1b) this.b;
                if (isCurrentThread) {
                    e1b.invalidate();
                    return;
                }
                Handler handler = e1b.getHandler();
                if (handler != null) {
                    handler.postAtFrontOfQueue(new d1b(e1b, 0));
                    return;
                } else {
                    e1b.post(new d1b(e1b, 1));
                    return;
                }
            default:
                ((nzf) this.b).invalidateSelf();
                return;
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.a) {
            case 0:
                ((ag) this.b).scheduleSelf(runnable, j);
                return;
            case 1:
                Drawable.Callback callback = ((cl) this.b).getCallback();
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    return;
                }
                return;
            case 2:
                ((eoa) this.b).scheduleSelf(runnable, j);
                return;
            case 3:
                ((e1b) this.b).postDelayed(runnable, j);
                return;
            default:
                ((nzf) this.b).scheduleSelf(runnable, j);
                return;
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                ((ag) this.b).unscheduleSelf(runnable);
                return;
            case 1:
                Drawable.Callback callback = ((cl) this.b).getCallback();
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 2:
                ((eoa) this.b).unscheduleSelf(runnable);
                return;
            case 3:
                boolean isCurrentThread = Looper.getMainLooper().isCurrentThread();
                e1b e1b = (e1b) this.b;
                if (isCurrentThread) {
                    e1b.removeCallbacks(runnable);
                    return;
                }
                Handler handler = e1b.getHandler();
                if (handler != null) {
                    handler.postAtFrontOfQueue(new vj6(14, (Object) e1b, (Object) runnable));
                    return;
                } else {
                    e1b.post(new uj6(17, e1b, runnable));
                    return;
                }
            default:
                ((nzf) this.b).unscheduleSelf(runnable);
                return;
        }
    }
}
