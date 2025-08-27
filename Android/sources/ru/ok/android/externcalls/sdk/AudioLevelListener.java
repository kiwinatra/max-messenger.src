package ru.ok.android.externcalls.sdk;

import android.os.Handler;

public class AudioLevelListener implements mq9 {
    private final Handler handler;
    private boolean isActive = true;
    private final tmg noise;
    private final Runnable reporter;
    private final short triggerDiff;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, tmg] */
    public AudioLevelListener(short s, Handler handler2, Runnable runnable) {
        ? obj = new Object();
        obj.a = Float.NaN;
        this.noise = obj;
        this.reporter = runnable;
        this.triggerDiff = s;
        this.handler = handler2;
        obj.a = !Float.isNaN(obj.a) ? c44.DEFAULT_ASPECT_RATIO + (0.95f * obj.a) : c44.DEFAULT_ASPECT_RATIO;
    }

    public void listen() {
        this.isActive = true;
    }

    public void onSample(int i, int i2, int i3, z6b z6b) {
        float f;
        if (this.isActive) {
            float f2 = Float.NaN;
            if (Float.isNaN(Float.NaN)) {
                f2 = c44.DEFAULT_ASPECT_RATIO;
            }
            for (int i4 = 0; i4 < z6b.a; i4++) {
                float abs = (float) Math.abs(z6b.a(i4));
                if (Float.isNaN(f)) {
                    f = abs;
                } else {
                    f = (0.3f * abs) + (0.7f * f);
                }
                tmg tmg = this.noise;
                if (!Float.isNaN(tmg.a)) {
                    abs = (abs * 0.05f) + (0.95f * tmg.a);
                }
                tmg.a = abs;
                if (f - this.noise.a > ((float) this.triggerDiff)) {
                    this.handler.post(this.reporter);
                    return;
                }
            }
        }
    }

    public void stop() {
        this.isActive = false;
    }
}
