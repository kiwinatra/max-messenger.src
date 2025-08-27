package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: kub  reason: default package */
public final class kub extends FrameLayout {
    public final yu9 A0;
    public hub a = hub.PERFORMANCE;
    public sda b;
    public final tgd c;
    public final fub o;
    public boolean v;
    public final xrg v0;
    public final fz9 w;
    public qu1 w0;
    public final AtomicReference x;
    public MotionEvent x0;
    public eu1 y;
    public final gub y0;
    public final lub z;
    public final mx1 z0;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r9v0, types: [fub, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [fz9, u08] */
    /* JADX WARNING: type inference failed for: r0v5, types: [tgd, android.view.View] */
    public kub(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        ? obj = new Object();
        obj.h = iub.FILL_CENTER;
        this.o = obj;
        this.v = true;
        this.w = new u08(jub.a);
        this.x = new AtomicReference();
        this.z = new lub(obj);
        this.y0 = new gub(this);
        this.z0 = new mx1(3, this);
        this.A0 = new yu9(3, (Object) this);
        ev0.g();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, xnc.PreviewView, 0, 0);
        int[] iArr = xnc.PreviewView;
        WeakHashMap weakHashMap = gag.a;
        bag.d(this, context, iArr, (AttributeSet) null, obtainStyledAttributes, 0, 0);
        try {
            int integer = obtainStyledAttributes.getInteger(xnc.PreviewView_scaleType, obj.h.a);
            for (iub iub : iub.values()) {
                if (iub.a == integer) {
                    setScaleType(iub);
                    int integer2 = obtainStyledAttributes.getInteger(xnc.PreviewView_implementationMode, 0);
                    for (hub hub : hub.values()) {
                        if (hub.a == integer2) {
                            setImplementationMode(hub);
                            obtainStyledAttributes.recycle();
                            this.v0 = new xrg(context, new y3a(13, (Object) this));
                            if (getBackground() == null) {
                                setBackgroundColor(fw3.a(getContext(), 17170444));
                            }
                            ? view = new View(context, (AttributeSet) null, 0, 0);
                            view.setBackgroundColor(-1);
                            view.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                            view.setElevation(Float.MAX_VALUE);
                            this.c = view;
                            view.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean c(z3f z3f, hub hub) {
        boolean equals = z3f.e.n().k().equals("androidx.camera.camera2.legacy");
        boolean z2 = (pn4.a.g(SurfaceViewStretchedQuirk.class) == null && pn4.a.g(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (equals || z2) {
            return true;
        }
        int ordinal = hub.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + hub);
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private x87 getScreenFlashInternal() {
        return this.c.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int ordinal = getScaleType().ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (!(ordinal == 3 || ordinal == 4 || ordinal == 5)) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i;
    }

    private void setScreenFlashUiInfo(x87 x87) {
        eu1 eu1 = this.y;
        if (eu1 != null) {
            qgd qgd = qgd.a;
            rgd rgd = new rgd(qgd, x87);
            rgd f = eu1.f();
            eu1.C.put(qgd, rgd);
            rgd f2 = eu1.f();
            if (f2 != null && !f2.equals(f)) {
                rgd f3 = eu1.f();
                if (f3 == null) {
                    y87 y87 = eu1.d;
                    cu1 cu1 = eu1.D;
                    y87.getClass();
                    ugd ugd = new ugd(cu1);
                    y87.t = ugd;
                    y87.d().g(ugd);
                    return;
                }
                y87 y872 = eu1.d;
                y872.getClass();
                ugd ugd2 = new ugd(f3.b);
                y872.t = ugd2;
                y872.d().g(ugd2);
                f3.a.name();
            }
        }
    }

    public final void a(boolean z2) {
        ev0.g();
        dcg viewPort = getViewPort();
        if (this.y != null && viewPort != null && isAttachedToWindow()) {
            try {
                this.y.a(getSurfaceProvider(), viewPort);
            } catch (IllegalStateException e) {
                if (z2) {
                    e.toString();
                    return;
                }
                throw e;
            }
        }
    }

    public final void b() {
        Display display;
        qu1 qu1;
        ev0.g();
        if (this.b != null) {
            if (!(!this.v || (display = getDisplay()) == null || (qu1 = this.w0) == null)) {
                int m = qu1.m(display.getRotation());
                int rotation = display.getRotation();
                fub fub = this.o;
                if (fub.g) {
                    fub.c = m;
                    fub.e = rotation;
                }
            }
            this.b.m();
        }
        lub lub = this.z;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        lub.getClass();
        ev0.g();
        synchronized (lub) {
            try {
                if (!(size.getWidth() == 0 || size.getHeight() == 0)) {
                    Rect rect = lub.c;
                    if (rect != null) {
                        lub.d = lub.b.a(size, layoutDirection, rect);
                    }
                }
                lub.d = null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        eu1 eu1 = this.y;
        if (eu1 != null) {
            getSensorToViewTransform();
            eu1.getClass();
            ev0.g();
        }
    }

    public Bitmap getBitmap() {
        Bitmap g;
        ev0.g();
        sda sda = this.b;
        if (sda == null || (g = sda.g()) == null) {
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) sda.c;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        fub fub = (fub) sda.d;
        if (!fub.f()) {
            return g;
        }
        Matrix d = fub.d();
        RectF e = fub.e(size, layoutDirection);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), g.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(d);
        matrix.postScale(e.width() / ((float) fub.a.getWidth()), e.height() / ((float) fub.a.getHeight()));
        matrix.postTranslate(e.left, e.top);
        canvas.drawBitmap(g, matrix, new Paint(7));
        return createBitmap;
    }

    public eu1 getController() {
        ev0.g();
        return this.y;
    }

    public hub getImplementationMode() {
        ev0.g();
        return this.a;
    }

    public iq9 getMeteringPointFactory() {
        ev0.g();
        return this.z;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [k6b, java.lang.Object] */
    public k6b getOutputTransform() {
        Matrix matrix;
        fub fub = this.o;
        ev0.g();
        try {
            matrix = fub.c(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect rect = fub.b;
        if (matrix == null || rect == null) {
            return null;
        }
        RectF rectF = grf.a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(grf.a, rectF2, Matrix.ScaleToFit.FILL);
        matrix.preConcat(matrix2);
        if (this.b instanceof mhf) {
            matrix.postConcat(getMatrix());
        } else {
            getMatrix().isIdentity();
        }
        new Size(rect.width(), rect.height());
        return new Object();
    }

    public u08 getPreviewStreamState() {
        return this.w;
    }

    public iub getScaleType() {
        ev0.g();
        return this.o.h;
    }

    public x87 getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        ev0.g();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        fub fub = this.o;
        if (!fub.f()) {
            return null;
        }
        Matrix matrix = new Matrix(fub.d);
        matrix.postConcat(fub.c(size, layoutDirection));
        return matrix;
    }

    public aub getSurfaceProvider() {
        ev0.g();
        return this.A0;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [dcg, java.lang.Object] */
    public dcg getViewPort() {
        ev0.g();
        if (getDisplay() == null) {
            return null;
        }
        int rotation = getDisplay().getRotation();
        ev0.g();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Rational rational = new Rational(getWidth(), getHeight());
        int viewPortScaleType = getViewPortScaleType();
        int layoutDirection = getLayoutDirection();
        ? obj = new Object();
        obj.a = viewPortScaleType;
        obj.b = rational;
        obj.c = rotation;
        obj.d = layoutDirection;
        return obj;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.y0, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.z0);
        sda sda = this.b;
        if (sda != null) {
            sda.j();
        }
        a(true);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.z0);
        sda sda = this.b;
        if (sda != null) {
            sda.k();
        }
        eu1 eu1 = this.y;
        if (eu1 != null) {
            eu1.b();
        }
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.y0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ab, code lost:
        if (r9 != false) goto L_0x01de;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            eu1 r2 = r0.y
            if (r2 != 0) goto L_0x000d
            boolean r0 = super.onTouchEvent(r19)
            return r0
        L_0x000d:
            int r2 = r19.getPointerCount()
            r3 = 1
            r4 = 0
            if (r2 != r3) goto L_0x0017
            r2 = r3
            goto L_0x0018
        L_0x0017:
            r2 = r4
        L_0x0018:
            int r5 = r19.getAction()
            if (r5 != r3) goto L_0x0020
            r5 = r3
            goto L_0x0021
        L_0x0020:
            r5 = r4
        L_0x0021:
            long r6 = r19.getEventTime()
            long r8 = r19.getDownTime()
            long r6 = r6 - r8
            int r8 = android.view.ViewConfiguration.getLongPressTimeout()
            long r8 = (long) r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0035
            r6 = r3
            goto L_0x0036
        L_0x0035:
            r6 = r4
        L_0x0036:
            if (r2 == 0) goto L_0x0042
            if (r5 == 0) goto L_0x0042
            if (r6 == 0) goto L_0x0042
            r0.x0 = r1
            r18.performClick()
            return r3
        L_0x0042:
            xrg r0 = r0.v0
            r0.getClass()
            r19.getEventTime()
            r0.getClass()
            int r2 = r19.getActionMasked()
            boolean r5 = r0.c
            if (r5 == 0) goto L_0x005a
            android.view.GestureDetector r5 = r0.l
            r5.onTouchEvent(r1)
        L_0x005a:
            int r5 = r19.getPointerCount()
            int r6 = r19.getButtonState()
            r6 = r6 & 32
            if (r6 == 0) goto L_0x0068
            r6 = r3
            goto L_0x0069
        L_0x0068:
            r6 = r4
        L_0x0069:
            int r7 = r0.k
            r8 = 2
            if (r7 != r8) goto L_0x0072
            if (r6 != 0) goto L_0x0072
            r7 = r3
            goto L_0x0073
        L_0x0072:
            r7 = r4
        L_0x0073:
            if (r2 == r3) goto L_0x007d
            r9 = 3
            if (r2 == r9) goto L_0x007d
            if (r7 == 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r9 = r4
            goto L_0x007e
        L_0x007d:
            r9 = r3
        L_0x007e:
            y3a r10 = r0.b
            r11 = 0
            if (r2 == 0) goto L_0x0085
            if (r9 == 0) goto L_0x00af
        L_0x0085:
            boolean r12 = r0.g
            if (r12 == 0) goto L_0x009d
            vrg r12 = new vrg
            r0.a()
            r13 = 23
            r12.<init>(r13)
            r10.d(r12)
            r0.g = r4
            r0.h = r11
            r0.k = r4
            goto L_0x00ab
        L_0x009d:
            boolean r12 = r0.b()
            if (r12 == 0) goto L_0x00ab
            if (r9 == 0) goto L_0x00ab
            r0.g = r4
            r0.h = r11
            r0.k = r4
        L_0x00ab:
            if (r9 == 0) goto L_0x00af
            goto L_0x01de
        L_0x00af:
            boolean r12 = r0.g
            if (r12 != 0) goto L_0x00d1
            boolean r12 = r0.d
            if (r12 == 0) goto L_0x00d1
            boolean r12 = r0.b()
            if (r12 != 0) goto L_0x00d1
            if (r9 != 0) goto L_0x00d1
            if (r6 == 0) goto L_0x00d1
            float r6 = r19.getX()
            r0.i = r6
            float r6 = r19.getY()
            r0.j = r6
            r0.k = r8
            r0.h = r11
        L_0x00d1:
            r6 = 6
            if (r2 == 0) goto L_0x00de
            if (r2 == r6) goto L_0x00de
            r9 = 5
            if (r2 == r9) goto L_0x00de
            if (r7 == 0) goto L_0x00dc
            goto L_0x00de
        L_0x00dc:
            r7 = r4
            goto L_0x00df
        L_0x00de:
            r7 = r3
        L_0x00df:
            if (r2 != r6) goto L_0x00e3
            r6 = r3
            goto L_0x00e4
        L_0x00e3:
            r6 = r4
        L_0x00e4:
            if (r6 == 0) goto L_0x00eb
            int r9 = r19.getActionIndex()
            goto L_0x00ec
        L_0x00eb:
            r9 = -1
        L_0x00ec:
            if (r6 == 0) goto L_0x00f1
            int r6 = r5 + -1
            goto L_0x00f2
        L_0x00f1:
            r6 = r5
        L_0x00f2:
            boolean r12 = r0.b()
            if (r12 == 0) goto L_0x010a
            float r12 = r0.i
            float r13 = r0.j
            float r14 = r19.getY()
            int r14 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r14 >= 0) goto L_0x0106
            r14 = r3
            goto L_0x0107
        L_0x0106:
            r14 = r4
        L_0x0107:
            r0.m = r14
            goto L_0x0127
        L_0x010a:
            r12 = r4
            r13 = r11
            r14 = r13
        L_0x010d:
            if (r12 >= r5) goto L_0x011e
            if (r9 == r12) goto L_0x011b
            float r15 = r1.getX(r12)
            float r13 = r13 + r15
            float r15 = r1.getY(r12)
            float r14 = r14 + r15
        L_0x011b:
            int r12 = r12 + 1
            goto L_0x010d
        L_0x011e:
            float r12 = (float) r6
            float r13 = r13 / r12
            float r12 = r14 / r12
            r17 = r13
            r13 = r12
            r12 = r17
        L_0x0127:
            r15 = r4
            r14 = r11
        L_0x0129:
            if (r15 >= r5) goto L_0x0149
            if (r9 == r15) goto L_0x0146
            float r16 = r1.getX(r15)
            float r16 = r16 - r12
            float r16 = java.lang.Math.abs(r16)
            float r16 = r16 + r11
            float r11 = r1.getY(r15)
            float r11 = r11 - r13
            float r11 = java.lang.Math.abs(r11)
            float r11 = r11 + r14
            r14 = r11
            r11 = r16
        L_0x0146:
            int r15 = r15 + 1
            goto L_0x0129
        L_0x0149:
            float r1 = (float) r6
            float r11 = r11 / r1
            float r14 = r14 / r1
            float r1 = (float) r8
            float r11 = r11 * r1
            float r14 = r14 * r1
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x0156
            goto L_0x015d
        L_0x0156:
            double r5 = (double) r11
            double r14 = (double) r14
            double r5 = java.lang.Math.hypot(r5, r14)
            float r14 = (float) r5
        L_0x015d:
            boolean r1 = r0.g
            kotlin.math.MathKt.roundToInt((float) r12)
            r0.getClass()
            kotlin.math.MathKt.roundToInt((float) r13)
            r0.getClass()
            boolean r5 = r0.b()
            if (r5 != 0) goto L_0x018d
            boolean r5 = r0.g
            if (r5 == 0) goto L_0x018d
            float r5 = (float) r4
            int r5 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x017c
            if (r7 == 0) goto L_0x018d
        L_0x017c:
            vrg r5 = new vrg
            r0.a()
            r6 = 23
            r5.<init>(r6)
            r10.d(r5)
            r0.g = r4
            r0.h = r14
        L_0x018d:
            if (r7 == 0) goto L_0x0195
            r0.e = r14
            r0.f = r14
            r0.h = r14
        L_0x0195:
            boolean r5 = r0.b()
            int r6 = r0.a
            if (r5 == 0) goto L_0x019e
            r4 = r6
        L_0x019e:
            boolean r5 = r0.g
            if (r5 != 0) goto L_0x01c6
            float r4 = (float) r4
            int r4 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x01c6
            if (r1 != 0) goto L_0x01b6
            float r1 = r0.h
            float r1 = r14 - r1
            float r1 = java.lang.Math.abs(r1)
            float r4 = (float) r6
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x01c6
        L_0x01b6:
            r0.e = r14
            r0.f = r14
            vrg r1 = new vrg
            r4 = 23
            r1.<init>(r4)
            r10.d(r1)
            r0.g = r3
        L_0x01c6:
            if (r2 != r8) goto L_0x01de
            r0.e = r14
            boolean r1 = r0.g
            if (r1 == 0) goto L_0x01da
            wrg r1 = new wrg
            float r2 = r0.a()
            r1.<init>(r2)
            r10.d(r1)
        L_0x01da:
            float r1 = r0.e
            r0.f = r1
        L_0x01de:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kub.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, u05] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, u05] */
    public final boolean performClick() {
        if (this.y != null) {
            MotionEvent motionEvent = this.x0;
            float x2 = motionEvent != null ? motionEvent.getX() : ((float) getWidth()) / 2.0f;
            MotionEvent motionEvent2 = this.x0;
            float y2 = motionEvent2 != null ? motionEvent2.getY() : ((float) getHeight()) / 2.0f;
            eu1 eu1 = this.y;
            if (eu1.i() && eu1.t) {
                eu1.w.i(1);
                lub lub = this.z;
                hq9 a2 = lub.a(x2, y2, 0.16666667f);
                hq9 a3 = lub.a(x2, y2, 0.25f);
                ? obj = new Object();
                obj.b = new ArrayList();
                obj.c = new ArrayList();
                obj.o = new ArrayList();
                obj.a = MultiFileUploader.UPLOAD_NEXT_INTERVAL;
                obj.b(a2, 1);
                obj.b(a3, 2);
                ? obj2 = new Object();
                obj2.b = Collections.unmodifiableList((ArrayList) obj.b);
                obj2.c = Collections.unmodifiableList((ArrayList) obj.c);
                obj2.o = Collections.unmodifiableList((ArrayList) obj.o);
                obj2.a = obj.a;
                hd8.a(((au1) eu1.m.c.z0.d).h(obj2), new e4(7, (Object) eu1), ryg.j());
            }
        }
        this.x0 = null;
        return super.performClick();
    }

    public void setController(eu1 eu1) {
        ev0.g();
        eu1 eu12 = this.y;
        if (!(eu12 == null || eu12 == eu1)) {
            eu12.b();
            setScreenFlashUiInfo((x87) null);
        }
        this.y = eu1;
        a(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(hub hub) {
        ev0.g();
        this.a = hub;
    }

    public void setScaleType(iub iub) {
        ev0.g();
        this.o.h = iub;
        b();
        a(false);
    }

    public void setScreenFlashOverlayColor(int i) {
        this.c.setBackgroundColor(i);
    }

    public void setScreenFlashWindow(Window window) {
        ev0.g();
        this.c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }
}
