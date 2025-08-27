package ru.ok.messages.calls.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

public final class TextureViewRenderer extends TextureView implements TextureView.SurfaceTextureListener, VideoSink {
    public static final /* synthetic */ int A0 = 0;
    public final RendererCommon.VideoLayoutMeasure a = new RendererCommon.VideoLayoutMeasure();
    public final laf b = new laf(getResourceName());
    public final Object c = new Object();
    public boolean o;
    public int v;
    public int v0;
    public int w;
    public Runnable w0;
    public int x;
    public jaf x0;
    public boolean y;
    public t9a y0;
    public int z;
    public final Matrix z0 = new Matrix();

    public TextureViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setSurfaceTextureListener(this);
    }

    private String getResourceName() {
        try {
            return getResources().getResourceEntryName(getId()) + ": ";
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    public final void a(int i, int i2) {
        int i3;
        z68.c("TextureViewRenderer", "adjustAspectRatio: videoWidth %d videoHeight %d", Integer.valueOf(i), Integer.valueOf(i2));
        int width = getWidth();
        int height = getHeight();
        double d = ((double) i2) / ((double) i);
        int i4 = (int) (((double) width) * d);
        if (height > i4) {
            i3 = width;
        } else {
            i3 = (int) (((double) height) / d);
            i4 = height;
        }
        int i5 = (width - i3) / 2;
        int i6 = (height - i4) / 2;
        StringBuilder n = a81.n("video=", i, "x", i2, " view=");
        g63.o(n, width, "x", height, " newView=");
        g63.o(n, i3, "x", i4, " off=");
        n.append(i5);
        n.append(",");
        n.append(i6);
        z68.a("TextureViewRenderer", n.toString());
        Matrix matrix = this.z0;
        getTransform(matrix);
        matrix.setScale(((float) i3) / ((float) width), ((float) i4) / ((float) height));
        matrix.postTranslate((float) i5, (float) i6);
        setTransform(matrix);
    }

    public final void b() {
        z68.a("TextureViewRenderer", "updateSurfaceSize");
        ThreadUtils.checkIsOnMainThread();
        synchronized (this.c) {
            try {
                if (!this.y || this.v == 0 || this.w == 0 || getWidth() == 0 || getHeight() == 0) {
                    this.v0 = 0;
                    this.z = 0;
                } else {
                    float width = ((float) getWidth()) / ((float) getHeight());
                    int i = this.v;
                    int i2 = this.w;
                    if (((float) i) / ((float) i2) > width) {
                        i = (int) (((float) i2) * width);
                    } else {
                        i2 = (int) (((float) i) / width);
                    }
                    int min = Math.min(getWidth(), i);
                    int min2 = Math.min(getHeight(), i2);
                    z68.a("TextureViewRenderer", "updateSurfaceSize: layout size: " + getWidth() + "x" + getHeight() + ", frame size: " + this.v + "x" + this.w + ", requested surface size: " + min + "x" + min2 + ", old surface size: " + this.z + "x" + this.v0);
                    if (min == this.z) {
                        if (min2 != this.v0) {
                        }
                    }
                    this.z = min;
                    this.v0 = min2;
                    a(min, min2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onFrame(VideoFrame videoFrame) {
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        int width = buffer.getWidth();
        int height = buffer.getHeight();
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        int rotation = videoFrame.getRotation();
        synchronized (this.c) {
            try {
                if (!this.o) {
                    this.o = true;
                    z68.a("TextureViewRenderer", "updateFrameDimensionsAndReportEvents. Reporting first rendered frame.");
                }
                if (!(this.v == rotatedWidth && this.w == rotatedHeight && this.x == rotation)) {
                    z68.c("TextureViewRenderer", "updateFrameDimensionsAndReportEvents. Reporting frame resolution changed to: newWidth %d, newHeight %d, newRotatedFrameWidth %d, newRotatedFrameHeight %d, newFrameRotation %d", Integer.valueOf(width), Integer.valueOf(height), Integer.valueOf(rotatedWidth), Integer.valueOf(rotatedHeight), Integer.valueOf(rotation));
                    this.w = rotatedHeight;
                    this.v = rotatedWidth;
                    this.x = rotation;
                    post(new haf(4, (Object) this));
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.b.onFrame(videoFrame);
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        ThreadUtils.checkIsOnMainThread();
        z68.c("TextureViewRenderer", "onLayout: left %d top %d right %d bottom %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        this.b.c(((float) (i3 - i)) / ((float) (i4 - i2)));
        b();
    }

    public final void onMeasure(int i, int i2) {
        Point measure;
        ThreadUtils.checkIsOnMainThread();
        synchronized (this.c) {
            measure = this.a.measure(i, i2, this.v, this.w);
        }
        setMeasuredDimension(measure.x, measure.y);
        z68.c("TextureViewRenderer", "onMeasure: width %d height %d", Integer.valueOf(measure.x), Integer.valueOf(measure.y));
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        z68.c("TextureViewRenderer", "onSurfaceTextureAvailable: available", new Object[0]);
        ThreadUtils.checkIsOnMainThread();
        laf laf = this.b;
        iaf iaf = laf.Y;
        synchronized (iaf) {
            iaf.a = surfaceTexture;
        }
        synchronized (laf.b) {
        }
        this.v0 = 0;
        this.z = 0;
        b();
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ThreadUtils.checkIsOnMainThread();
        z68.c("TextureViewRenderer", "onSurfaceTextureDestroyed:", new Object[0]);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        laf laf = this.b;
        iaf iaf = laf.Y;
        synchronized (iaf) {
            iaf.a = null;
        }
        synchronized (laf.b) {
        }
        countDownLatch.countDown();
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        this.o = false;
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        z68.a("TextureViewRenderer", "onSurfaceTextureSizeChanged: size: " + i + "x" + i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Runnable runnable = this.w0;
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Exception e) {
                z68.f("TextureViewRenderer", "runOnNextFrameRunnable: failed to run", e);
            } catch (Throwable th) {
                this.w0 = null;
                throw th;
            }
            this.w0 = null;
        }
    }

    public void setEnableHardwareScaler(boolean z2) {
        ThreadUtils.checkIsOnMainThread();
        this.y = z2;
        b();
    }

    public void setFpsReduction(float f) {
        laf laf = this.b;
        laf.getClass();
        laf.b("setFpsReduction: " + f);
        synchronized (laf.c) {
            try {
                long j = laf.o;
                if (f <= c44.DEFAULT_ASPECT_RATIO) {
                    laf.o = LongCompanionObject.MAX_VALUE;
                } else {
                    laf.o = (long) (((float) TimeUnit.SECONDS.toNanos(1)) / f);
                }
                if (laf.o != j) {
                    System.nanoTime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setMirror(boolean z2) {
        laf laf = this.b;
        laf.getClass();
        laf.b("setMirrorHorizontally: " + z2);
        synchronized (laf.w) {
        }
    }

    public void setOnNextFrameRunnable(Runnable runnable) {
        this.w0 = runnable;
    }

    public void setOnNextVideoFrameRunnable(Runnable runnable) {
        if (this.x0 != null) {
            this.x0 = null;
            laf laf = this.b;
            laf.getClass();
            new CountDownLatch(1);
            synchronized (laf.b) {
            }
        }
        if (runnable != null) {
            this.x0 = new s9a(20, this, runnable);
            synchronized (this.b.b) {
            }
        }
    }

    public void setPeriodicVideoFrameListener(jaf jaf) {
        if (this.y0 != null) {
            this.y0 = null;
            laf laf = this.b;
            laf.getClass();
            new CountDownLatch(1);
            synchronized (laf.b) {
            }
        }
        if (jaf != null) {
            this.y0 = new t9a(this, jaf);
            synchronized (this.b.b) {
            }
        }
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.a.setScalingType(scalingType);
    }

    public void setStatisticsListener(kaf kaf) {
        laf laf = this.b;
        if (laf != null) {
            laf.getClass();
        }
    }

    public void setVideoAspect(float f) {
        this.b.c(f);
    }
}
