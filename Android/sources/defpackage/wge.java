package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: wge  reason: default package */
public final class wge extends GLSurfaceView {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final SensorManager b;
    public final Sensor c;
    public final j5b o;
    public final Handler v = new Handler(Looper.getMainLooper());
    public boolean v0;
    public final fed w;
    public boolean w0;
    public SurfaceTexture x;
    public Surface y;
    public boolean z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wge(Context context) {
        super(context, (AttributeSet) null);
        Sensor sensor = null;
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.b = sensorManager;
        sensor = t0g.a >= 18 ? sensorManager.getDefaultSensor(15) : sensor;
        this.c = sensor == null ? sensorManager.getDefaultSensor(11) : sensor;
        fed fed = new fed();
        this.w = fed;
        vge vge = new vge(this, fed);
        gof gof = new gof(context, vge);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.o = new j5b(windowManager.getDefaultDisplay(), gof, vge);
        this.z = true;
        setEGLContextClientVersion(2);
        setRenderer(vge);
        setOnTouchListener(gof);
    }

    public final void a() {
        boolean z2 = this.z && this.v0;
        Sensor sensor = this.c;
        if (sensor != null && z2 != this.w0) {
            j5b j5b = this.o;
            SensorManager sensorManager = this.b;
            if (z2) {
                sensorManager.registerListener(j5b, sensor, 0);
            } else {
                sensorManager.unregisterListener(j5b);
            }
            this.w0 = z2;
        }
    }

    public yu1 getCameraMotionListener() {
        return this.w;
    }

    public q5g getVideoFrameMetadataListener() {
        return this.w;
    }

    public Surface getVideoSurface() {
        return this.y;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v.post(new mgd(12, this));
    }

    public final void onPause() {
        this.v0 = false;
        a();
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.v0 = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.w.Y = i;
    }

    public void setUseSensorRotation(boolean z2) {
        this.z = z2;
        a();
    }
}
