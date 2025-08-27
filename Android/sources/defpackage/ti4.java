package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Triple;

/* renamed from: ti4  reason: default package */
public final class ti4 implements t3f, SurfaceTexture.OnFrameAvailableListener {
    public boolean X = false;
    public final ArrayList Y = new ArrayList();
    public final nr4 a;
    public final HandlerThread b;
    public final ew6 c;
    public final Handler o;
    public final AtomicBoolean v = new AtomicBoolean(false);
    public final float[] w = new float[16];
    public final float[] x = new float[16];
    public final LinkedHashMap y = new LinkedHashMap();
    public int z = 0;

    public ti4(vy4 vy4) {
        Map emptyMap = Collections.emptyMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.o = handler;
        this.c = new ew6(handler);
        this.a = new nr4();
        try {
            m5a.F(new u00((Object) this, (Object) vy4, (Object) emptyMap, 5)).get();
        } catch (InterruptedException | ExecutionException e) {
            e = e;
            e = e instanceof ExecutionException ? e.getCause() : e;
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
        } catch (RuntimeException e2) {
            release();
            throw e2;
        }
    }

    public final void a(z3f z3f) {
        if (this.v.get()) {
            z3f.d();
        } else {
            e(new ir1(29, this, z3f), new ri4(z3f, 0));
        }
    }

    public final zz7 b(int i, int i2) {
        return hd8.J(m5a.F(new pb4(this, i, i2)));
    }

    public final void c(s3f s3f) {
        if (this.v.get()) {
            s3f.close();
            return;
        }
        ir1 ir1 = new ir1(28, this, s3f);
        Objects.requireNonNull(s3f);
        e(ir1, new ne4(3, s3f));
    }

    public final void d() {
        if (this.X && this.z == 0) {
            LinkedHashMap linkedHashMap = this.y;
            for (s3f close : linkedHashMap.keySet()) {
                close.close();
            }
            Iterator it = this.Y.iterator();
            while (it.hasNext()) {
                ((na0) it.next()).c.d(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            nr4 nr4 = this.a;
            if (((AtomicBoolean) nr4.c).getAndSet(false)) {
                ck6.c((Thread) nr4.e);
                nr4.p();
            }
            this.b.quit();
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new ktg(this, runnable2, runnable, 21));
        } catch (RejectedExecutionException unused) {
            runnable2.run();
        }
    }

    public final void f(Exception exc) {
        ArrayList arrayList = this.Y;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((na0) it.next()).c.d(exc);
        }
        arrayList.clear();
    }

    public final Bitmap g(Size size, float[] fArr, int i) {
        int i2 = i;
        float[] fArr2 = (float[]) fArr.clone();
        y7e.R(fArr2, (float) i2);
        y7e.S(fArr2);
        Size g = grf.g(size, i2);
        nr4 nr4 = this.a;
        nr4.getClass();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(g.getHeight() * g.getWidth() * 4);
        bs0.m("ByteBuffer capacity is not equal to width * height * 4.", allocateDirect.capacity() == (g.getHeight() * g.getWidth()) * 4);
        bs0.m("ByteBuffer is not direct.", allocateDirect.isDirect());
        int[] iArr = ck6.a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        ck6.b("glGenTextures");
        int i3 = iArr2[0];
        GLES20.glActiveTexture(33985);
        ck6.b("glActiveTexture");
        GLES20.glBindTexture(3553, i3);
        ck6.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, g.getWidth(), g.getHeight(), 0, 6407, 5121, (Buffer) null);
        ck6.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        ck6.b("glGenFramebuffers");
        int i4 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i4);
        ck6.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i3, 0);
        ck6.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        ck6.b("glActiveTexture");
        GLES20.glBindTexture(36197, nr4.b);
        ck6.b("glBindTexture");
        nr4.k = null;
        GLES20.glViewport(0, 0, g.getWidth(), g.getHeight());
        GLES20.glScissor(0, 0, g.getWidth(), g.getHeight());
        ak6 ak6 = (ak6) nr4.m;
        ak6.getClass();
        if (ak6 instanceof bk6) {
            GLES20.glUniformMatrix4fv(((bk6) ak6).f, 1, false, fArr2, 0);
            ck6.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        ck6.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, g.getWidth(), g.getHeight(), 6408, 5121, allocateDirect);
        ck6.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i3}, 0);
        ck6.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i4}, 0);
        ck6.b("glDeleteFramebuffers");
        int i5 = nr4.b;
        GLES20.glActiveTexture(33984);
        ck6.b("glActiveTexture");
        GLES20.glBindTexture(36197, i5);
        ck6.b("glBindTexture");
        Bitmap createBitmap = Bitmap.createBitmap(g.getWidth(), g.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.e(createBitmap, allocateDirect, g.getWidth() * 4);
        return createBitmap;
    }

    public final void h(Triple triple) {
        ByteArrayOutputStream byteArrayOutputStream;
        ArrayList arrayList = this.Y;
        if (!arrayList.isEmpty()) {
            if (triple == null) {
                f(new Exception("Failed to snapshot: no JPEG Surface."));
                return;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                Iterator it = arrayList.iterator();
                int i = -1;
                int i2 = -1;
                Bitmap bitmap = null;
                byte[] bArr = null;
                while (it.hasNext()) {
                    na0 na0 = (na0) it.next();
                    int i3 = na0.b;
                    if (i != i3 || bitmap == null) {
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        bitmap = g((Size) triple.getSecond(), (float[]) triple.getThird(), i3);
                        i2 = -1;
                        i = i3;
                    }
                    int i4 = na0.a;
                    if (i2 != i4) {
                        byteArrayOutputStream.reset();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
                        bArr = byteArrayOutputStream.toByteArray();
                        i2 = i4;
                    }
                    Objects.requireNonNull(bArr);
                    ImageProcessingUtil.f(bArr, (Surface) triple.getFirst());
                    na0.c.b((Object) null);
                    it.remove();
                }
                byteArrayOutputStream.close();
                return;
            } catch (IOException e) {
                f(e);
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            return;
        }
        throw th;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (!this.v.get()) {
            surfaceTexture.updateTexImage();
            float[] fArr = this.w;
            surfaceTexture.getTransformMatrix(fArr);
            Triple triple = null;
            while (true) {
                Triple triple2 = triple;
                for (Map.Entry entry : this.y.entrySet()) {
                    Surface surface = (Surface) entry.getValue();
                    s3f s3f = (s3f) entry.getKey();
                    float[] fArr2 = s3f.v;
                    float[] fArr3 = this.x;
                    Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
                    int i = s3f.c;
                    if (i == 34) {
                        try {
                            this.a.r(surfaceTexture.getTimestamp(), fArr3, surface);
                        } catch (RuntimeException unused) {
                        }
                    } else {
                        boolean z2 = true;
                        bs0.r("Unsupported format: " + i, i == 256);
                        if (triple2 != null) {
                            z2 = false;
                        }
                        bs0.r("Only one JPEG output is supported.", z2);
                        triple = new Triple(surface, s3f.o, (float[]) fArr3.clone());
                    }
                }
                try {
                    h(triple2);
                    return;
                } catch (RuntimeException e) {
                    f(e);
                    return;
                }
            }
        }
    }

    public final void release() {
        if (!this.v.getAndSet(true)) {
            e(new ne4(4, this), new gc(5));
        }
    }
}
