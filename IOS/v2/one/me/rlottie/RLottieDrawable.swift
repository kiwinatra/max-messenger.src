package one.me.rlottie;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArraySet;
import android.view.View;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import one.me.rlottie.RLottie;
import one.me.rlottie.network.LottieDownloadListener;

public class RLottieDrawable extends BitmapDrawable implements Animatable, yo0, LottieDownloadListener {
    public static final Handler F1 = new Handler(Looper.getMainLooper());
    public static final ThreadLocal G1 = new ThreadLocal();
    public static final ThreadLocal H1 = new ThreadLocal();
    public static final e I1 = new e();
    public static final Rect J1 = new Rect();
    public static Gson gson;
    public static d lottieCacheGenerateQueue;
    public int A0;
    public volatile Throwable A1;
    public int B0;
    public String B1;
    public long C0;
    public final Set C1;
    public volatile boolean D0;
    public final Set D1;
    public Runnable E0;
    public final Set E1;
    public Runnable F0;
    public volatile Bitmap G0;
    public volatile Bitmap H0;
    public volatile Bitmap I0;
    public boolean J0;
    public CountDownLatch K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public int Q0;
    public boolean R0;
    public float S0;
    public float T0;
    public boolean U0;
    public boolean V0;
    public final RectF W0;
    public volatile HashMap X;
    public final RectF[] X0;
    public HashMap Y;
    public final Paint[] Y0;
    public boolean Z;
    public volatile boolean Z0;
    public final int a;
    public volatile boolean a1;
    public final int b;
    public volatile long b1;
    public final int[] c;
    public boolean c1;
    public boolean d1;
    public boolean e1;
    public File f1;
    public boolean g1;
    public Runnable h1;
    public Runnable i1;
    public View j1;
    public g7a k1;
    public final qoc l1;
    public final qoc m1;
    public boolean n1;
    public int o;
    public final qoc o1;
    public final qoc p1;
    public c q1;
    public int r1;
    public boolean s1;
    public boolean scaleByCanvas;
    public boolean skipFrameUpdate;
    public Rect srcRect;
    public boolean t1;
    public final i u1;
    public int v;
    public boolean v0;
    public long v1;
    public boolean w;
    public WeakReference w0;
    public int w1;
    public Runnable whenCacheDone;
    public int[] x;
    public View x0;
    public Bitmap x1;
    public int[] y;
    public final ArraySet y0;
    public String y1;
    public final HashMap z;
    public int z0;
    public volatile boolean z1;

    public interface DrawableLoadListener {
        void onError(Throwable th) {
        }

        void onLoaded(RLottieDrawable rLottieDrawable) {
        }
    }

    public interface OnAllFramesRenderedListener {
        void onAllFramesRendered(RLottieDrawable rLottieDrawable, boolean z);
    }

    public interface OnNextFrameRenderedListener {
        void onNextFrameRendered(RLottieDrawable rLottieDrawable, int i);
    }

    public RLottieDrawable(File file, int i, int i2, xo0 xo0, boolean z2) {
        this(file, i, i2, xo0, z2, (int[]) null, 0);
    }

    public static /* synthetic */ void a(long j, long j2) {
        if (j != 0) {
            destroy(j);
        }
        if (j2 != 0) {
            destroy(j2);
        }
    }

    public static /* synthetic */ void b(long j, long j2) {
        if (j != 0) {
            destroy(j);
        }
        if (j2 != 0) {
            destroy(j2);
        }
    }

    public static void c(RLottieDrawable rLottieDrawable) {
        Runnable runnable = rLottieDrawable.h1;
        if (runnable != null) {
            runnable.run();
            rLottieDrawable.h1 = null;
        }
    }

    /* access modifiers changed from: private */
    public static native long create(String str, String str2, int i, int i2, int[] iArr, boolean z2, int[] iArr2, boolean z3, int i3);

    private static native long createWithJson(String str, String str2, int[] iArr, int[] iArr2);

    /* access modifiers changed from: private */
    public static native void destroy(long j);

    public static native int foo();

    public static native double getDuration(String str, String str2);

    public static native int getFrame(long j, int i, Bitmap bitmap, int i2, int i3, int i4, boolean z2);

    public static native long getFramesCount(String str, String str2);

    /* access modifiers changed from: private */
    public static native void replaceColors(long j, int[] iArr);

    /* access modifiers changed from: private */
    public static native void setLayerColor(long j, String str, int i);

    public void addDrawableLoadListener(DrawableLoadListener drawableLoadListener) {
        this.C1.add(drawableLoadListener);
        if (this.z1) {
            drawableLoadListener.onLoaded(this);
        } else if (this.A1 != null) {
            drawableLoadListener.onError(this.A1);
        }
    }

    public void addOnAllFramesRenderedListener(OnAllFramesRenderedListener onAllFramesRenderedListener) {
        this.E1.add(onAllFramesRenderedListener);
    }

    public void addOnNextFrameRenderedListener(OnNextFrameRenderedListener onNextFrameRenderedListener) {
        this.D1.add(onNextFrameRenderedListener);
    }

    public void addParentView(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.y0.add(imageReceiver);
        }
    }

    public void beginApplyLayerColors() {
        this.P0 = true;
    }

    public void cacheFrame(int i) {
        if (this.w1 != i || this.x1 == null) {
            if (this.x1 == null) {
                this.x1 = Bitmap.createBitmap(this.a, this.b, Bitmap.Config.ARGB_8888);
            }
            long j = this.b1;
            this.w1 = i;
            Bitmap bitmap = this.x1;
            getFrame(j, i, bitmap, this.a, this.b, bitmap.getRowBytes(), true);
        }
    }

    public boolean canLoadFrames() {
        return this.g1 ? this.q1 != null : this.b1 != 0;
    }

    public void checkCache(Runnable runnable) {
        if (this.q1 == null) {
            a.d(runnable);
            return;
        }
        this.n1 = true;
        if (lottieCacheGenerateQueue == null) {
            lottieCacheGenerateQueue = new d("rlottie-generator-queue");
        }
        if (this.E0 == null) {
            c.z++;
            d dVar = lottieCacheGenerateQueue;
            poc poc = new poc(this, runnable, 0);
            this.E0 = poc;
            dVar.a(poc);
        }
    }

    public void checkCacheCancel() {
        if (this.q1 != null && lottieCacheGenerateQueue != null && this.E0 != null && this.y0.isEmpty() && getCallback() == null) {
            View view = this.j1;
            if (view == null || !view.isAttachedToWindow()) {
                Runnable runnable = this.E0;
                if (runnable != null) {
                    d dVar = lottieCacheGenerateQueue;
                    dVar.getClass();
                    try {
                        dVar.b.await();
                        dVar.a.removeCallbacks(runnable);
                    } catch (Exception e) {
                        RLottie.getLogger().e(e);
                    }
                    c.c();
                    this.E0 = null;
                }
                this.n1 = false;
                this.s1 = false;
            }
        }
    }

    public void commitApplyLayerColors() {
        if (this.P0) {
            this.P0 = false;
            if (!this.Z0 && this.M0) {
                if (this.Q0 <= 2) {
                    this.Q0 = 0;
                }
                this.D0 = false;
                this.N0 = false;
                if (!o()) {
                    this.O0 = true;
                }
            }
            invalidateInternal();
        }
    }

    public void draw(Canvas canvas) {
        drawInternal(canvas, getPaint(), false, 0, 0);
    }

    public void drawFrame(Canvas canvas, int i) {
        cacheFrame(i);
        if (this.x1 != null) {
            int i2 = this.a;
            int i3 = this.b;
            Rect rect = J1;
            rect.set(0, 0, i2, i3);
            canvas.drawBitmap(this.x1, rect, getBounds(), getPaint());
        }
    }

    public void drawInBackground(Canvas canvas, float f, float f2, float f3, float f4, int i, ColorFilter colorFilter, int i2) {
        RectF[] rectFArr = this.X0;
        RectF rectF = rectFArr[i2];
        Paint[] paintArr = this.Y0;
        if (rectF == null) {
            rectFArr[i2] = new RectF();
            paintArr[i2] = new Paint(1);
            paintArr[i2].setFilterBitmap(true);
        }
        paintArr[i2].setAlpha(i);
        paintArr[i2].setColorFilter(colorFilter);
        rectFArr[i2].set(f, f2, f3 + f, f4 + f2);
        drawInternal(canvas, (Paint) null, true, 0, i2);
    }

    public void drawInternal(Canvas canvas, Paint paint, boolean z2, long j, int i) {
        float f;
        float f2;
        if (canLoadFrames() && !this.L0) {
            boolean z3 = true;
            if (!z2) {
                z2 = !Looper.getMainLooper().isCurrentThread();
            }
            if (!z2) {
                updateCurrentFrame(j, false);
            }
            RectF rectF = z2 ? this.X0[i] : this.W0;
            if (rectF == null) {
                rectF = this.W0;
            }
            if (paint == null) {
                paint = z2 ? this.Y0[i] : getPaint();
            }
            if (paint.getAlpha() != 0) {
                if (!hasBitmap()) {
                    RLottie.getLogger().d("!hasBitmap() " + this.y1);
                }
                if (this.G0 == null) {
                    RLottie.getLogger().d("rendering bitmap is null");
                }
                if (!this.d1 && this.G0 != null) {
                    if (!z2) {
                        rectF.set(getBounds());
                        if (this.U0) {
                            this.S0 = rectF.width() / ((float) this.a);
                            this.T0 = rectF.height() / ((float) this.b);
                            this.U0 = false;
                            if (Math.abs(rectF.width() - ((float) this.a)) < ((float) a.a(1.0f)) && Math.abs(rectF.height() - ((float) this.b)) < ((float) a.a(1.0f))) {
                                z3 = false;
                            }
                            this.V0 = z3;
                        }
                        f2 = this.S0;
                        f = this.T0;
                        z3 = this.V0;
                    } else {
                        float width = rectF.width() / ((float) this.a);
                        float height = rectF.height() / ((float) this.b);
                        if (Math.abs(rectF.width() - ((float) this.a)) < ((float) a.a(1.0f)) && Math.abs(rectF.height() - ((float) this.b)) < ((float) a.a(1.0f))) {
                            z3 = false;
                        }
                        f2 = width;
                        f = height;
                    }
                    if (!z3) {
                        try {
                            canvas.drawBitmap(this.G0, rectF.left, rectF.top, paint);
                        } catch (Exception e) {
                            RLottie.getLogger().e(e);
                        }
                    } else if (this.scaleByCanvas) {
                        this.srcRect.set(0, 0, this.G0.getWidth(), this.G0.getHeight());
                        canvas.drawBitmap(this.G0, this.srcRect, rectF, paint);
                    } else {
                        canvas.save();
                        canvas.translate(rectF.left, rectF.top);
                        canvas.scale(f2, f);
                        canvas.drawBitmap(this.G0, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, paint);
                        canvas.restore();
                    }
                    if (this.Z0 && !z2) {
                        invalidateInternal();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        r4 = (one.me.rlottie.RLottieDrawable) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            if (r3 != r4) goto L_0x0004
            r3 = 1
            return r3
        L_0x0004:
            boolean r0 = r4 instanceof one.me.rlottie.RLottieDrawable
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            one.me.rlottie.RLottieDrawable r4 = (one.me.rlottie.RLottieDrawable) r4
            int r0 = r4.a
            int r2 = r3.a
            if (r2 == r0) goto L_0x0013
            return r1
        L_0x0013:
            int r0 = r3.b
            int r2 = r4.b
            if (r0 == r2) goto L_0x001a
            return r1
        L_0x001a:
            int r0 = r3.z0
            int r2 = r4.z0
            if (r0 == r2) goto L_0x0021
            return r1
        L_0x0021:
            java.lang.String r3 = r3.B1
            java.lang.String r4 = r4.B1
            boolean r3 = java.util.Objects.equals(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.rlottie.RLottieDrawable.equals(java.lang.Object):boolean");
    }

    public final void finalize() {
        try {
            recycle(false);
        } finally {
            super.finalize();
        }
    }

    public Bitmap getAnimatedBitmap() {
        if (this.G0 != null) {
            return this.G0;
        }
        if (this.H0 != null) {
            return this.H0;
        }
        return null;
    }

    public Bitmap getBackgroundBitmap() {
        return this.I0;
    }

    public int getCurrentFrame() {
        return this.Q0;
    }

    public String getCurrentUrl() {
        return this.y1;
    }

    public int getCustomEndFrame() {
        return this.v;
    }

    public long getDuration() {
        int[] iArr = this.c;
        return (long) ((((float) iArr[0]) / ((float) iArr[1])) * 1000.0f);
    }

    public Bitmap getFirstFrame(Bitmap bitmap) {
        String file = ((File) this.k1.c).toString();
        g7a g7a = this.k1;
        g7a.getClass();
        int i = g7a.a;
        int i2 = this.b;
        long create = create(file, (String) null, this.a, i2, new int[3], false, (int[]) g7a.b, false, i);
        if (create == 0) {
            return bitmap;
        }
        long j = create;
        Bitmap bitmap2 = bitmap;
        getFrame(j, 0, bitmap2, this.a, this.b, bitmap.getRowBytes(), true);
        destroy(create);
        return bitmap;
    }

    public int getFramesCount() {
        return this.c[0];
    }

    public float getGeneratingCacheProgress() {
        c cVar = this.q1;
        if (cVar == null) {
            return 1.0f;
        }
        if (this.E0 != null) {
            float framesCount = ((float) cVar.d.get()) / ((float) getFramesCount());
            if (Float.isNaN(framesCount)) {
                return c44.DEFAULT_ASPECT_RATIO;
            }
            if (Float.isInfinite(framesCount)) {
                return 1.0f;
            }
            return Math.max(Math.min(framesCount, 1.0f), c44.DEFAULT_ASPECT_RATIO);
        } else if (!cVar.p) {
            return -2.0f;
        } else {
            c cVar2 = this.q1;
            if (!cVar2.q || !cVar2.j) {
                return c44.DEFAULT_ASPECT_RATIO;
            }
            return 1.0f;
        }
    }

    public int getIntrinsicHeight() {
        return this.b;
    }

    public int getIntrinsicWidth() {
        return this.a;
    }

    public long getLastFrameTime() {
        return this.C0;
    }

    public int getMinimumHeight() {
        return this.b;
    }

    public int getMinimumWidth() {
        return this.a;
    }

    public int getNextFrame(Bitmap bitmap) {
        long j = this.v1;
        if (j == 0) {
            return -1;
        }
        int i = this.R0 ? 2 : 1;
        if (getFrame(j, this.r1, bitmap, this.a, this.b, bitmap.getRowBytes(), true) == -5) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return getNextFrame(bitmap);
        }
        int i2 = this.r1 + i;
        this.r1 = i2;
        return i2 > this.c[0] ? 0 : 1;
    }

    public Bitmap getNextRenderingBitmap() {
        return this.H0;
    }

    public int getOpacity() {
        return -2;
    }

    public Bitmap getRenderingBitmap() {
        return this.G0;
    }

    public float getScaleX() {
        return this.S0;
    }

    public float getScaleY() {
        return this.T0;
    }

    public int getTimeBetweenFrames() {
        return this.o;
    }

    public final void h() {
        Runnable runnable = this.E0;
        if (runnable != null) {
            d dVar = lottieCacheGenerateQueue;
            dVar.getClass();
            try {
                dVar.b.await();
                dVar.a.removeCallbacks(runnable);
            } catch (Exception e) {
                RLottie.getLogger().e(e);
            }
            c.c();
            this.E0 = null;
        }
        if (!hasParent() && this.H0 != null && this.F0 != null) {
            this.F0 = null;
            this.H0 = null;
        }
    }

    public boolean hasBaseDice() {
        return this.b1 != 0;
    }

    public boolean hasBitmap() {
        return !this.a1 && !(this.G0 == null && this.H0 == null) && !this.d1;
    }

    public boolean hasParent() {
        return (this.y0.isEmpty() && this.j1 == null && getCallback() == null) ? false : true;
    }

    public boolean hasParentViews() {
        return !this.y0.isEmpty();
    }

    public boolean hasVibrationPattern() {
        return this.Y != null;
    }

    public int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        String str = this.B1;
        return Integer.hashCode(this.z0) + ((i + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final void i() {
        if (this.L0) {
            h();
            if (this.F0 == null && this.E0 == null && this.b1 != 0) {
                l(true);
            }
        }
        if (this.b1 == 0 && this.q1 == null) {
            m();
            return;
        }
        this.J0 = true;
        if (!hasParent()) {
            RLottie.Logger logger = RLottie.getLogger();
            logger.d("RLottieDrawable. Call stop because !hasParentView() " + this.y1);
            stop();
        }
        if (this.Z0) {
            o();
        }
    }

    public void invalidateInternal() {
        if (!this.a1) {
            Iterator it = this.y0.iterator();
            while (it.hasNext()) {
                ((ImageReceiver) it.next()).invalidate();
            }
            View view = this.j1;
            if (view != null) {
                view.invalidate();
            }
            if (getCallback() != null) {
                invalidateSelf();
            }
        }
    }

    public boolean isApplyTransformation() {
        return this.U0;
    }

    public boolean isCacheFallbacked() {
        return false;
    }

    public boolean isForceFrameRedraw() {
        return this.O0;
    }

    public boolean isGeneratingCache() {
        return this.E0 != null;
    }

    public boolean isHeavyDrawable() {
        return true;
    }

    public boolean isLastFrame() {
        return this.Q0 == getFramesCount() - 1;
    }

    public boolean isLoadingFailed() {
        return !this.z1 && this.A1 != null;
    }

    public boolean isNeedScale() {
        return this.V0;
    }

    public boolean isRecycled() {
        return this.a1;
    }

    public boolean isRunning() {
        return this.Z0;
    }

    public boolean isWaitingForNextTask() {
        return this.J0;
    }

    public final void j() {
        this.z1 = true;
        this.A1 = null;
        if (a.b()) {
            Iterator it = new ArrayList(this.C1).iterator();
            while (it.hasNext()) {
                ((DrawableLoadListener) it.next()).onLoaded(this);
            }
            return;
        }
        a.d(new ooc(this, 1));
    }

    public final void k(File file, int[] iArr) {
        if (gson == null) {
            gson = new Gson();
        }
        Class<h88> cls = h88.class;
        if (file != null) {
            try {
                FileReader fileReader = new FileReader(file.getAbsolutePath());
                rae.w(gson.fromJson(fileReader, cls));
                try {
                    fileReader.close();
                } catch (Exception unused) {
                }
            } catch (Exception e) {
                RLottie.getLogger().e(e);
                String absolutePath = file.getAbsolutePath();
                g7a g7a = this.k1;
                boolean z2 = this.R0;
                int i = g7a.a;
                int i2 = this.b;
                long create = create(absolutePath, (String) null, this.a, i2, iArr, false, (int[]) g7a.b, z2, i);
                if (create != 0) {
                    destroy(create);
                    return;
                }
                return;
            }
        } else {
            rae.w(gson.fromJson((String) null, cls));
        }
        throw null;
    }

    public final void l(boolean z2) {
        long j = this.b1;
        this.b1 = 0;
        if (j != 0) {
            if (z2) {
                g.a(new noc(0, j, 0), false);
            } else {
                RLottie.config.workQueue.post(new noc(1, j, 0));
            }
        }
    }

    public final void m() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.G0);
        arrayList.add(this.I0);
        arrayList.add(this.H0);
        this.H0 = null;
        this.G0 = null;
        this.I0 = null;
        Handler handler = a.a;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                Bitmap bitmap = (Bitmap) arrayList.get(i);
                if (bitmap != null && !bitmap.isRecycled()) {
                    arrayList2.add(new WeakReference(bitmap));
                }
            }
            a.d(new ue(0, arrayList2));
        }
        if (this.h1 != null) {
            this.h1 = null;
        }
    }

    public void multiplySpeed(float f) {
        this.o *= (int) (1.0f / f);
    }

    public final void n() {
        if (!this.P0 && !this.Z0 && this.M0) {
            if (this.Q0 <= 2) {
                this.Q0 = 0;
            }
            this.D0 = false;
            this.N0 = false;
            if (!o()) {
                this.O0 = true;
            }
        }
        invalidateInternal();
    }

    public final boolean o() {
        boolean z2;
        boolean z3 = false;
        if (this.F0 != null || this.H0 != null || !canLoadFrames() || this.L0 || (!this.Z0 && (!(z2 = this.M0) || (z2 && this.N0)))) {
            return false;
        }
        if (this.n1 && !this.t1) {
            return false;
        }
        if (!this.z.isEmpty()) {
            this.X.putAll(this.z);
            this.z.clear();
        }
        int[] iArr = this.x;
        if (iArr != null) {
            this.y = iArr;
            this.x = null;
        }
        this.F0 = this.u1;
        if (!this.R0 || !a.b()) {
            I1.b(this.F0);
        } else {
            Runnable runnable = this.F0;
            if (this.K0 != null) {
                z3 = true;
            }
            g.a(runnable, z3);
        }
        return true;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.U0 = true;
    }

    public void onFailed(Throwable th) {
        RLottie.getLogger().e(th);
        this.z1 = false;
        this.A1 = th;
        a.d(new ovb(7, this, th));
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [xo0, java.lang.Object] */
    public void onFinished(String str, File file, String str2) {
        getPaint().setFlags(2);
        this.B1 = file.getAbsolutePath();
        this.f1 = file;
        if (this.g1 && lottieCacheGenerateQueue == null) {
            lottieCacheGenerateQueue = new d("rlottie-generator-queue");
        }
        if (this.g1) {
            this.q1 = new c(file, this, new Object(), this.a, this.b, !this.R0);
            g7a g7a = new g7a(this);
            this.k1 = g7a;
            g7a.c = file.getAbsoluteFile();
            this.k1.getClass();
            this.b1 = create(file.getAbsolutePath(), (String) null, this.a, this.b, this.c, this.g1, (int[]) null, this.R0, 0);
            destroy(this.b1);
            this.b1 = 0;
        } else {
            this.b1 = create(file.getAbsolutePath(), (String) null, this.a, this.b, this.c, this.g1, (int[]) null, this.R0, 0);
            if (this.b1 == 0) {
                file.delete();
            }
        }
        if (this.R0 && this.c[1] < 60) {
            this.R0 = false;
        }
        this.o = Math.max(this.R0 ? 33 : 16, (int) (1000.0f / ((float) this.c[1])));
        j();
        a.d(new ooc(this, 0));
    }

    public final void p(long j, long j2, boolean z2, long j3) {
        int i;
        this.I0 = this.G0;
        this.G0 = this.H0;
        this.H0 = null;
        if (this.D0 || (this.A0 == 0 && this.z0 == 1)) {
            stop();
        }
        this.F0 = null;
        if (this.e1) {
            this.e1 = false;
        } else if (this.d1) {
            this.d1 = false;
        }
        this.N0 = true;
        this.J0 = false;
        if (RLottie.config.screenRefreshRate <= 60.0f) {
            this.C0 = j;
        } else {
            this.C0 = j - Math.min(16, j2 - j3);
        }
        if (z2 && this.O0) {
            this.N0 = false;
            this.O0 = false;
        }
        Set set = this.D1;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((OnNextFrameRenderedListener) it.next()).onNextFrameRendered(this, this.Q0);
                it.remove();
            }
        }
        if (isLastFrame() && ((i = this.z0) == 2 || i == 1 || i == 3 || this.D0)) {
            for (OnAllFramesRenderedListener onAllFramesRenderedListener : this.E1) {
                int i2 = this.z0;
                onAllFramesRenderedListener.onAllFramesRendered(this, i2 == 2 || i2 == 1 || i2 == 3);
            }
        }
        o();
    }

    public void post(Runnable runnable) {
        if (!this.R0 || !a.b()) {
            I1.b(new i40(runnable, 5));
        } else {
            g.a(new i40(runnable, 4), this.K0 != null);
        }
    }

    public void prepareForGenerateCache() {
        File file;
        String file2 = ((File) this.k1.c).toString();
        g7a g7a = this.k1;
        g7a.getClass();
        int i = g7a.a;
        int i2 = this.b;
        long create = create(file2, (String) null, this.a, i2, new int[3], false, (int[]) g7a.b, false, i);
        this.v1 = create;
        if (create == 0 && (file = this.f1) != null) {
            file.delete();
        }
    }

    public void recycle(boolean z2) {
        this.Z0 = false;
        this.a1 = true;
        h();
        if (this.F0 == null && this.E0 == null && !this.n1) {
            l(z2);
            c cVar = this.q1;
            if (cVar != null) {
                RandomAccessFile randomAccessFile = cVar.s;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    cVar.s = null;
                }
                cVar.r = true;
                this.q1 = null;
            }
            m();
            return;
        }
        this.L0 = true;
    }

    public void releaseForGenerateCache() {
        long j = this.v1;
        if (j != 0) {
            destroy(j);
            this.v1 = 0;
        }
    }

    public void removeDrawableLoadListener(DrawableLoadListener drawableLoadListener) {
        this.C1.remove(drawableLoadListener);
    }

    public void removeOnAllFramesRenderedListener(OnAllFramesRenderedListener onAllFramesRenderedListener) {
        this.E1.remove(onAllFramesRenderedListener);
    }

    public void removeOnNextFrameRenderedListener(OnNextFrameRenderedListener onNextFrameRenderedListener) {
        this.D1.remove(onNextFrameRenderedListener);
    }

    public void removeParentView(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.y0.remove(imageReceiver);
            checkCacheCancel();
        }
    }

    public void replaceColors(int[] iArr) {
        this.x = iArr;
        n();
    }

    public void resetVibrationAfterRestart(boolean z2) {
        this.Z = z2;
    }

    public boolean restart() {
        return restart(false);
    }

    public void setAllowDecodeSingleFrame(boolean z2) {
        this.M0 = z2;
        if (z2) {
            o();
        }
    }

    public void setAllowDrawFramesWhileCacheGenerating(boolean z2) {
        this.t1 = z2;
    }

    public void setAllowVibration(boolean z2) {
        this.v0 = z2;
    }

    public void setAutoRepeat(int i) {
        if (this.z0 != 2 || i != 3 || this.Q0 == 0) {
            this.z0 = i;
        }
    }

    public void setAutoRepeatCount(int i) {
        this.A0 = i;
    }

    public void setAutoRepeatTimeout(long j) {
    }

    public void setCurrentFrame(int i) {
        setCurrentFrame(i, true);
    }

    public void setCurrentParentView(View view) {
        this.x0 = view;
    }

    public boolean setCustomEndFrame(int i) {
        if (this.v == i || i > this.c[0]) {
            return false;
        }
        this.v = i;
        return true;
    }

    public void setGeneratingFrame(int i) {
        this.r1 = i;
    }

    public void setInvalidateOnProgressSet(boolean z2) {
        this.c1 = z2;
    }

    public void setLayerColor(String str, int i) {
        this.z.put(str, Integer.valueOf(i));
        n();
    }

    public void setMasterParent(View view) {
        this.j1 = view;
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        this.h1 = runnable;
    }

    public void setOnFinishCallback(Runnable runnable, int i) {
        if (runnable != null) {
            this.w0 = new WeakReference(runnable);
        } else if (this.w0 != null) {
            this.w0 = null;
        }
    }

    public void setOnFrameReadyRunnable(Runnable runnable) {
        this.i1 = runnable;
    }

    public void setPlayInDirectionOfCustomEndFrame(boolean z2) {
        this.w = z2;
    }

    public void setProgress(float f) {
        setProgress(f, true);
    }

    public void setProgressMs(long j) {
        setCurrentFrame((int) ((Math.max(0, j) / ((long) this.o)) % ((long) this.c[0])), true, true);
    }

    public void setVibrationPattern(HashMap<Integer, Integer> hashMap) {
        this.Y = hashMap;
    }

    public void start() {
        if (this.Z0) {
            return;
        }
        if ((this.z0 < 2 || this.B0 == 0) && this.v != this.Q0) {
            this.Z0 = true;
            if (this.c1) {
                this.d1 = true;
                if (this.F0 != null) {
                    this.e1 = true;
                }
            }
            o();
            invalidateInternal();
        }
    }

    public void stop() {
        RLottie.Logger logger = RLottie.getLogger();
        logger.d("Stop url: " + getCurrentUrl() + " class: " + hashCode());
        this.Z0 = false;
    }

    public void updateCurrentFrame(long j, boolean z2) {
        int i;
        Integer num;
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        long j2 = j;
        long j3 = j2 - this.C0;
        if (!z2 || this.R0) {
            float f = RLottie.config.screenRefreshRate;
            i = (f <= 60.0f || (z2 && f <= 80.0f)) ? this.o - 6 : this.o;
        } else {
            i = this.o - 16;
        }
        if (this.Z0) {
            if (this.G0 == null && this.H0 == null) {
                o();
            } else if (this.H0 == null) {
            } else {
                if (this.G0 == null || (j3 >= ((long) i) && !this.skipFrameUpdate)) {
                    HashMap hashMap = this.Y;
                    if (!(hashMap == null || this.x0 == null || !this.v0 || (num = (Integer) hashMap.get(Integer.valueOf(this.Q0 - 1))) == null)) {
                        this.x0.performHapticFeedback(num.intValue() == 1 ? 0 : 3, 2);
                    }
                    p(j2, j3, false, (long) i);
                }
            }
        } else if ((this.O0 || (this.M0 && j3 >= ((long) i))) && this.H0 != null) {
            p(j2, j3, true, (long) i);
        }
    }

    public RLottieDrawable(File file, int i, int i2, xo0 xo0, boolean z2, int[] iArr, int i3) {
        int[] iArr2;
        char c2;
        File file2 = file;
        boolean z3 = z2;
        int[] iArr3 = new int[3];
        this.c = iArr3;
        this.v = -1;
        this.z = new HashMap();
        this.X = new HashMap();
        this.Z = false;
        this.v0 = true;
        this.y0 = new ArraySet();
        this.z0 = 1;
        this.A0 = -1;
        this.S0 = 1.0f;
        this.T0 = 1.0f;
        this.W0 = new RectF();
        this.X0 = new RectF[2];
        this.Y0 = new Paint[2];
        this.l1 = new qoc(this, 0);
        this.m1 = new qoc(this, 1);
        this.o1 = new qoc(this, 2);
        this.p1 = new qoc(this, 3);
        this.u1 = new i(this);
        this.srcRect = new Rect();
        this.w1 = -1;
        this.y1 = null;
        this.z1 = false;
        this.A1 = null;
        this.C1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.D1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.E1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.a = i;
        this.b = i2;
        this.R0 = z3;
        this.B1 = file.getAbsolutePath();
        this.g1 = xo0 != null;
        getPaint().setFlags(2);
        this.f1 = file2;
        if (this.g1 && lottieCacheGenerateQueue == null) {
            lottieCacheGenerateQueue = new d("rlottie-generator-queue");
        }
        if (this.g1) {
            g7a g7a = new g7a(this);
            this.k1 = g7a;
            g7a.c = file.getAbsoluteFile();
            g7a g7a2 = this.k1;
            g7a2.getClass();
            g7a2.b = iArr;
            g7a2.a = i3;
            k(file2, iArr3);
            if (this.R0 && iArr3[1] < 60) {
                this.R0 = false;
            }
            this.q1 = new c(file, this, xo0, i, i2, !z3);
            c2 = 1;
            iArr2 = iArr3;
        } else {
            int[] iArr4 = iArr;
            int i4 = i3;
            c2 = 1;
            iArr2 = iArr3;
            this.b1 = create(file.getAbsolutePath(), (String) null, i, i2, iArr3, this.g1, iArr, this.R0, i3);
            if (this.b1 == 0) {
                RLottie.getLogger().d("RLottieDrawable nativePtr == 0 " + file.getAbsolutePath() + " remove file");
                file.delete();
            }
            if (this.R0 && iArr2[1] < 60) {
                this.R0 = false;
            }
        }
        this.o = Math.max(this.R0 ? 33 : 16, (int) (1000.0f / ((float) iArr2[c2])));
        j();
    }

    public void draw(Canvas canvas, Paint paint) {
        drawInternal(canvas, paint, false, 0, 0);
    }

    public boolean restart(boolean z2) {
        if (!z2 && ((this.z0 < 2 || this.B0 == 0) && this.A0 < 0)) {
            return false;
        }
        this.B0 = 0;
        this.z0 = 2;
        start();
        return true;
    }

    public void setCurrentFrame(int i, boolean z2) {
        setCurrentFrame(i, z2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        if (r3 > 1.0f) goto L_0x0005;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setProgress(float r3, boolean r4) {
        /*
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0007
        L_0x0005:
            r3 = r0
            goto L_0x000e
        L_0x0007:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x000e
            goto L_0x0005
        L_0x000e:
            int[] r0 = r2.c
            r1 = 0
            r0 = r0[r1]
            float r0 = (float) r0
            float r0 = r0 * r3
            int r3 = (int) r0
            r2.setCurrentFrame(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.rlottie.RLottieDrawable.setProgress(float, boolean):void");
    }

    public void setCurrentFrame(int i, boolean z2, boolean z3) {
        if (i >= 0 && i <= this.c[0]) {
            if (this.Q0 != i || z3) {
                this.Q0 = i;
                this.D0 = false;
                this.N0 = false;
                if (this.c1) {
                    this.d1 = true;
                    if (this.F0 != null) {
                        this.e1 = true;
                    }
                }
                if ((!z2 || z3) && this.J0 && this.H0 != null) {
                    this.I0 = this.H0;
                    this.H0 = null;
                    this.F0 = null;
                    this.J0 = false;
                }
                if (!z2 && this.F0 == null) {
                    this.K0 = new CountDownLatch(1);
                }
                if (z3 && !this.Z0) {
                    this.Z0 = true;
                }
                if (!o()) {
                    this.O0 = true;
                } else if (!z2) {
                    try {
                        this.K0.await();
                    } catch (Exception e) {
                        RLottie.getLogger().e(e);
                    }
                    this.K0 = null;
                }
                invalidateSelf();
            }
        }
    }

    public RLottieDrawable(int i, String str, int i2, int i3) {
        this(i, str, i2, i3, true, (int[]) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0101 A[SYNTHETIC, Splitter:B:26:0x0101] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x010a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RLottieDrawable(int r10, java.lang.String r11, int r12, int r13, boolean r14, int[] r15) {
        /*
            r9 = this;
            r9.<init>()
            r0 = 3
            int[] r0 = new int[r0]
            r9.c = r0
            r0 = -1
            r9.v = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r9.z = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r9.X = r1
            r1 = 0
            r9.Z = r1
            r2 = 1
            r9.v0 = r2
            android.util.ArraySet r3 = new android.util.ArraySet
            r3.<init>()
            r9.y0 = r3
            r9.z0 = r2
            r9.A0 = r0
            r3 = 1065353216(0x3f800000, float:1.0)
            r9.S0 = r3
            r9.T0 = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r9.W0 = r3
            r3 = 2
            android.graphics.RectF[] r4 = new android.graphics.RectF[r3]
            r9.X0 = r4
            android.graphics.Paint[] r4 = new android.graphics.Paint[r3]
            r9.Y0 = r4
            qoc r4 = new qoc
            r5 = 0
            r4.<init>(r9, r5)
            r9.l1 = r4
            qoc r4 = new qoc
            r5 = 1
            r4.<init>(r9, r5)
            r9.m1 = r4
            qoc r4 = new qoc
            r5 = 2
            r4.<init>(r9, r5)
            r9.o1 = r4
            qoc r4 = new qoc
            r5 = 3
            r4.<init>(r9, r5)
            r9.p1 = r4
            one.me.rlottie.i r4 = new one.me.rlottie.i
            r4.<init>(r9)
            r9.u1 = r4
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r9.srcRect = r4
            r9.w1 = r0
            r0 = 0
            r9.y1 = r0
            r9.z1 = r1
            r9.A1 = r0
            java.util.WeakHashMap r4 = new java.util.WeakHashMap
            r4.<init>()
            java.util.Set r4 = java.util.Collections.newSetFromMap(r4)
            java.util.Set r4 = java.util.Collections.synchronizedSet(r4)
            r9.C1 = r4
            java.util.WeakHashMap r4 = new java.util.WeakHashMap
            r4.<init>()
            java.util.Set r4 = java.util.Collections.newSetFromMap(r4)
            java.util.Set r4 = java.util.Collections.synchronizedSet(r4)
            r9.D1 = r4
            java.util.WeakHashMap r4 = new java.util.WeakHashMap
            r4.<init>()
            java.util.Set r4 = java.util.Collections.newSetFromMap(r4)
            java.util.Set r4 = java.util.Collections.synchronizedSet(r4)
            r9.E1 = r4
            r9.a = r12
            r9.b = r13
            r9.z0 = r1
            java.lang.ThreadLocal r12 = G1
            java.lang.Object r13 = r12.get()
            byte[] r13 = (byte[]) r13
            if (r13 != 0) goto L_0x00bb
            r13 = 65536(0x10000, float:9.18355E-41)
            byte[] r13 = new byte[r13]
            r12.set(r13)
        L_0x00bb:
            one.me.rlottie.RLottie$Config r4 = one.me.rlottie.RLottie.getConfig()     // Catch:{ all -> 0x00fe }
            android.content.res.Resources r4 = r4.resources     // Catch:{ all -> 0x00fe }
            java.io.InputStream r10 = r4.openRawResource(r10)     // Catch:{ all -> 0x00fe }
            java.lang.ThreadLocal r4 = H1     // Catch:{ all -> 0x00ff }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x00ff }
            byte[] r5 = (byte[]) r5     // Catch:{ all -> 0x00ff }
            if (r5 != 0) goto L_0x00d6
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x00ff }
            r4.set(r5)     // Catch:{ all -> 0x00ff }
        L_0x00d6:
            r4 = r1
        L_0x00d7:
            int r6 = r5.length     // Catch:{ all -> 0x00ff }
            int r6 = r10.read(r5, r1, r6)     // Catch:{ all -> 0x00ff }
            if (r6 < 0) goto L_0x00f5
            int r7 = r13.length     // Catch:{ all -> 0x00ff }
            int r8 = r4 + r6
            if (r7 >= r8) goto L_0x00ee
            int r7 = r13.length     // Catch:{ all -> 0x00ff }
            int r7 = r7 * r3
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x00ff }
            java.lang.System.arraycopy(r13, r1, r7, r1, r4)     // Catch:{ all -> 0x00ff }
            r12.set(r7)     // Catch:{ all -> 0x00ff }
            r13 = r7
        L_0x00ee:
            if (r6 <= 0) goto L_0x00d7
            java.lang.System.arraycopy(r5, r1, r13, r4, r6)     // Catch:{ all -> 0x00ff }
            r4 = r8
            goto L_0x00d7
        L_0x00f5:
            r10.close()     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r13, r1, r4)
            goto L_0x0104
        L_0x00fe:
            r10 = r0
        L_0x00ff:
            if (r10 == 0) goto L_0x0104
            r10.close()     // Catch:{ all -> 0x0104 }
        L_0x0104:
            boolean r10 = android.text.TextUtils.isEmpty(r0)
            if (r10 == 0) goto L_0x010b
            return
        L_0x010b:
            android.graphics.Paint r10 = r9.getPaint()
            r10.setFlags(r3)
            int[] r10 = r9.c
            long r10 = createWithJson(r0, r11, r10, r15)
            r9.b1 = r10
            int[] r10 = r9.c
            r10 = r10[r2]
            float r10 = (float) r10
            r11 = 1148846080(0x447a0000, float:1000.0)
            float r11 = r11 / r10
            int r10 = (int) r11
            r11 = 16
            int r10 = java.lang.Math.max(r11, r10)
            r9.o = r10
            if (r14 == 0) goto L_0x0130
            r9.setAllowDecodeSingleFrame(r2)
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.rlottie.RLottieDrawable.<init>(int, java.lang.String, int, int, boolean, int[]):void");
    }

    public RLottieDrawable(String str, String str2, int i, int i2, boolean z2, int[] iArr) {
        int[] iArr2 = new int[3];
        this.c = iArr2;
        this.v = -1;
        this.z = new HashMap();
        this.X = new HashMap();
        this.Z = false;
        this.v0 = true;
        this.y0 = new ArraySet();
        this.z0 = 1;
        this.A0 = -1;
        this.S0 = 1.0f;
        this.T0 = 1.0f;
        this.W0 = new RectF();
        this.X0 = new RectF[2];
        this.Y0 = new Paint[2];
        this.l1 = new qoc(this, 0);
        this.m1 = new qoc(this, 1);
        this.o1 = new qoc(this, 2);
        this.p1 = new qoc(this, 3);
        this.u1 = new i(this);
        this.srcRect = new Rect();
        this.w1 = -1;
        this.y1 = null;
        this.z1 = false;
        this.A1 = null;
        this.C1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.D1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.E1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.a = i;
        this.b = i2;
        this.B1 = str2;
        if (!TextUtils.isEmpty(str)) {
            getPaint().setFlags(2);
            this.b1 = createWithJson(str, str2, iArr2, iArr);
            this.o = Math.max(16, (int) (1000.0f / ((float) iArr2[1])));
            if (z2) {
                setAllowDecodeSingleFrame(true);
            }
            j();
        }
    }
}
