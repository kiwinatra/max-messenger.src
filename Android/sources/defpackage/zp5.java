package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;

/* renamed from: zp5  reason: default package */
public final class zp5 implements Drawable.Callback {
    public final WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap();
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final ArrayList o = new ArrayList();
    public final /* synthetic */ bq5 v;

    public zp5(bq5 bq5, WeakHashMap weakHashMap) {
        this.v = bq5;
        this.a = weakHashMap;
    }

    public final void invalidateDrawable(Drawable drawable) {
        bq5 bq5;
        AtomicBoolean atomicBoolean = this.c;
        if (atomicBoolean.compareAndSet(false, true)) {
            WeakHashMap weakHashMap = this.a;
            Set keySet = weakHashMap.keySet();
            ArrayList arrayList = this.o;
            Iterator it = keySet.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                bq5 = this.v;
                if (!hasNext) {
                    break;
                }
                Object next = it.next();
                if (!wgf.a((TextView) next, bq5)) {
                    arrayList.add(next);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bq5.c((TextView) arrayList.get(i));
            }
            arrayList.clear();
            for (TextView textView : weakHashMap.keySet()) {
                if (!Looper.getMainLooper().isCurrentThread()) {
                    Handler handler = textView.getHandler();
                    if (handler != null) {
                        handler.postAtFrontOfQueue(new wp5(bq5, textView, this, 0));
                    } else {
                        textView.post(new wp5(bq5, textView, this, 1));
                    }
                } else if (bq5.b) {
                    u3b.a(textView, new wp5((View) textView, textView, bq5, this));
                } else {
                    textView.invalidate();
                    atomicBoolean.set(false);
                }
            }
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        bq5 bq5 = this.v;
        boolean z = bq5.b;
        WeakHashMap weakHashMap = this.a;
        if (z) {
            x55 x55 = new x55((Object) runnable, (Object) this, (Object) bq5, 6);
            this.b.put(runnable, x55);
            TextView textView = (TextView) CollectionsKt.firstOrNull(weakHashMap.keySet());
            if (textView != null) {
                textView.postDelayed(x55, j - SystemClock.uptimeMillis());
                return;
            }
            return;
        }
        TextView textView2 = (TextView) CollectionsKt.firstOrNull(weakHashMap.keySet());
        if (textView2 != null) {
            textView2.postDelayed(runnable, j - SystemClock.uptimeMillis());
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        boolean z = this.v.b;
        WeakHashMap weakHashMap = this.a;
        if (z) {
            Runnable runnable2 = (Runnable) this.b.remove(runnable);
            for (TextView textView : weakHashMap.keySet()) {
                if (Looper.getMainLooper().isCurrentThread()) {
                    textView.removeCallbacks(runnable2);
                } else {
                    Handler handler = textView.getHandler();
                    if (handler != null) {
                        handler.postAtFrontOfQueue(new xp5(textView, runnable2, 1));
                    } else {
                        textView.post(new yp5(textView, runnable2, 1));
                    }
                }
            }
            return;
        }
        for (TextView textView2 : weakHashMap.keySet()) {
            if (Looper.getMainLooper().isCurrentThread()) {
                textView2.removeCallbacks(runnable);
            } else {
                Handler handler2 = textView2.getHandler();
                if (handler2 != null) {
                    handler2.postAtFrontOfQueue(new xp5(textView2, runnable, 0));
                } else {
                    textView2.post(new yp5(textView2, runnable, 0));
                }
            }
        }
    }
}
