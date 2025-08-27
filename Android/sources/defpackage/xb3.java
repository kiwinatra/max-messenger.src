package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xb3  reason: default package */
public final class xb3 implements wb3, ViewTreeObserver.OnDrawListener, Runnable {
    public final long a = (SystemClock.uptimeMillis() + ((long) 10000));
    public Runnable b;
    public boolean c;
    public final /* synthetic */ bc3 o;

    public xb3(bc3 bc3) {
        this.o = bc3;
    }

    public final void a(View view) {
        if (!this.c) {
            this.c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    public final void execute(Runnable runnable) {
        this.b = runnable;
        View decorView = this.o.getWindow().getDecorView();
        if (!this.c) {
            decorView.postOnAnimation(new pr1(17, this));
        } else if (Intrinsics.areEqual((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    public final void onDraw() {
        boolean z;
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
            this.b = null;
            xi6 fullyDrawnReporter = this.o.getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.c) {
                z = fullyDrawnReporter.d;
            }
            if (z) {
                this.c = false;
                this.o.getWindow().getDecorView().post(this);
            }
        } else if (SystemClock.uptimeMillis() > this.a) {
            this.c = false;
            this.o.getWindow().getDecorView().post(this);
        }
    }

    public final void run() {
        this.o.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
