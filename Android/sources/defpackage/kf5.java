package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.work.WorkRequest;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: kf5  reason: default package */
public final class kf5 extends q2 {
    public static final int[] E0 = {2, 3, 6, 7, 8, 9, 11, 14};
    public static final long F0 = (v0g.O() ? WorkRequest.MIN_BACKOFF_MILLIS : 500);
    public je6 A0;
    public ScheduledFuture B0;
    public boolean C0;
    public long D0;
    public final ConcurrentLinkedQueue X;
    public final ScheduledExecutorService Y;
    public final boolean Z;
    public final yr6 o;
    public gf5 v;
    public final boolean v0;
    public final int w;
    public int w0;
    public final Surface x;
    public int x0;
    public final SurfaceTexture y;
    public boolean y0;
    public final float[] z;
    public je6 z0;

    public kf5(yr6 yr6, gy0 gy0, boolean z2, boolean z3) {
        super(gy0);
        this.o = yr6;
        this.Z = z2;
        this.v0 = z3;
        try {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            ld8.h();
            int i = iArr[0];
            ld8.d(36197, i, 9729);
            this.w = i;
            SurfaceTexture surfaceTexture = new SurfaceTexture(i);
            this.y = surfaceTexture;
            this.z = new float[16];
            this.X = new ConcurrentLinkedQueue();
            this.Y = Executors.newSingleThreadScheduledExecutor(new td3(3, "ExtTexMgr:Timer"));
            surfaceTexture.setOnFrameAvailableListener(new if5(this, gy0));
            this.x = new Surface(surfaceTexture);
            this.D0 = -9223372036854775807L;
        } catch (GlUtil$GlException e) {
            throw new Exception(e);
        }
    }

    public static float Z(float f, int i) {
        float f2 = 1.0f;
        float f3 = 1.0f;
        for (int i2 = 2; i2 <= 256; i2 *= 2) {
            int i3 = (((i + i2) - 1) / i2) * i2;
            for (int i4 = 0; i4 <= 2; i4++) {
                float f4 = (float) i;
                float f5 = (float) i3;
                float f6 = (f4 - ((float) i4)) / f5;
                if (Math.abs(f6 - f) < Math.abs(f2 - f)) {
                    f3 = f4 / f5;
                    f2 = f6;
                }
            }
        }
        return Math.abs(f2 - f) > 1.0E-9f ? f : f3;
    }

    public final void G() {
        this.w0 = 0;
        this.z0 = null;
        this.X.clear();
        this.A0 = null;
        super.G();
    }

    public final Surface H() {
        return this.x;
    }

    public final int I() {
        return this.X.size();
    }

    public final void Q(je6 je6) {
        this.A0 = je6;
        if (!this.Z) {
            this.X.add(je6);
        }
        ((gy0) this.a).v(new hf5(this, 0));
    }

    public final void T() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ((gy0) this.a).v(new jf5(this, countDownLatch, 0));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            i8b.V("Interrupted when waiting for MediaCodec frames to arrive.");
        }
    }

    public final void X(gi4 gi4) {
        ((gy0) this.a).v(new az1(1, this, gi4));
    }

    public final void Y() {
        ((gy0) this.a).v(new hf5(this, 3));
    }

    public final void a0() {
        je6 je6;
        boolean z2 = true;
        if (this.w0 != 0 && this.x0 != 0 && this.z0 == null) {
            this.y.updateTexImage();
            this.x0--;
            if (this.Z) {
                je6 = this.A0;
                je6.getClass();
            } else {
                je6 = (je6) this.X.element();
            }
            this.z0 = je6;
            this.w0--;
            this.y.getTransformMatrix(this.z);
            long timestamp = (this.y.getTimestamp() / 1000) + je6.e;
            if (this.v0) {
                float[] fArr = this.z;
                int i = je6.b;
                int i2 = je6.c;
                char c = 0;
                boolean z3 = fArr.length != 16;
                int[] iArr = E0;
                for (int i3 = 0; i3 < 8; i3++) {
                    z3 |= Math.abs(fArr[iArr[i3]]) > 1.0E-9f;
                }
                boolean z4 = z3 | (Math.abs(fArr[10] - 1.0f) > 1.0E-9f) | (Math.abs(fArr[15] - 1.0f) > 1.0E-9f);
                char c2 = 13;
                char c3 = 12;
                char c4 = 4;
                if (Math.abs(fArr[0]) > 1.0E-9f && Math.abs(fArr[5]) > 1.0E-9f) {
                    boolean z5 = z4 | (Math.abs(fArr[1]) > 1.0E-9f);
                    if (Math.abs(fArr[4]) <= 1.0E-9f) {
                        z2 = false;
                    }
                    z2 |= z5;
                    c4 = 5;
                    c3 = 13;
                    c2 = 12;
                } else if (Math.abs(fArr[1]) <= 1.0E-9f || Math.abs(fArr[4]) <= 1.0E-9f) {
                    c = 65535;
                    c2 = 65535;
                    c3 = 65535;
                    c4 = 65535;
                } else {
                    boolean z6 = z4 | (Math.abs(fArr[0]) > 1.0E-9f);
                    if (Math.abs(fArr[5]) > 1.0E-9f) {
                        c = 1;
                    }
                    boolean z7 = z6 | c;
                    c = 1;
                    z2 = z7;
                }
                if (z2) {
                    LinkedHashMap linkedHashMap = p94.a;
                    synchronized (p94.class) {
                    }
                } else {
                    float f = fArr[c];
                    float f2 = fArr[c2];
                    if (Math.abs(f) + 1.0E-9f < 1.0f) {
                        float copySign = Math.copySign(Z(Math.abs(f), i), f);
                        float f3 = i2a.f(f, copySign, 0.5f, f2);
                        LinkedHashMap linkedHashMap2 = p94.a;
                        synchronized (p94.class) {
                        }
                        fArr[c] = copySign;
                        fArr[c2] = f3;
                    }
                    float f4 = fArr[c4];
                    float f5 = fArr[c3];
                    if (Math.abs(f4) + 1.0E-9f < 1.0f) {
                        float copySign2 = Math.copySign(Z(Math.abs(f4), i2), f4);
                        float f6 = i2a.f(f4, copySign2, 0.5f, f5);
                        LinkedHashMap linkedHashMap3 = p94.a;
                        synchronized (p94.class) {
                        }
                        fArr[c4] = copySign2;
                        fArr[c3] = f6;
                    }
                }
            }
            gf5 gf5 = this.v;
            gf5.getClass();
            ((gi4) gf5).h.n("uTexTransformationMatrix", this.z);
            gf5 gf52 = this.v;
            gf52.getClass();
            ((kj0) gf52).a(this.o, new gs6(this.w, -1, je6.b, je6.c), timestamp);
            if (!this.Z) {
                n79.o((je6) this.X.remove());
            }
            p94.a();
        }
    }

    public final void c0(CountDownLatch countDownLatch) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        while (true) {
            int i = this.x0;
            concurrentLinkedQueue = this.X;
            if (i <= 0) {
                break;
            }
            this.x0 = i - 1;
            this.y.updateTexImage();
            concurrentLinkedQueue.remove();
        }
        if (concurrentLinkedQueue.isEmpty() || (this.D0 != -9223372036854775807L && System.currentTimeMillis() - this.D0 >= F0)) {
            this.D0 = -9223372036854775807L;
            countDownLatch.countDown();
            return;
        }
        if (this.D0 == -9223372036854775807L) {
            this.D0 = System.currentTimeMillis();
        }
        this.Y.schedule(new bk4(26, this, countDownLatch), 10, TimeUnit.MILLISECONDS);
    }

    public final void r() {
        ((gy0) this.a).v(new hf5(this, 5));
    }

    public final void release() {
        this.y.release();
        this.x.release();
        this.Y.shutdownNow();
    }

    public final void v(gs6 gs6) {
        ((gy0) this.a).v(new hf5(this, 1));
    }
}
