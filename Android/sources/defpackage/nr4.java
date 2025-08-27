package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Size;
import android.view.GestureDetector;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.math.MathKt;
import org.webrtc.EglBase;

/* renamed from: nr4  reason: default package */
public class nr4 implements fof {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;

    public nr4(Context context, tlb tlb, lce lce, xga xga) {
        this.a = 0;
        this.c = tlb;
        this.d = lce;
        this.e = xga;
        cs csVar = new cs(context);
        this.f = csVar;
        cs csVar2 = new cs(context);
        this.g = csVar2;
        this.h = new GestureDetector(context, new q00(10, this));
        this.i = new nm1(27, this);
        this.j = new Rect();
        this.b = MathKt.roundToInt(((float) 92) * vo4.c().getDisplayMetrics().density);
        lr4 lr4 = new lr4(this, context, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.k = LazyKt.lazy(lazyThreadSafetyMode, lr4);
        this.l = LazyKt.lazy(lazyThreadSafetyMode, new lr4(this, context, 1));
        csVar2.c = new wie(18, (Object) this);
        csVar.c = new e4(15, (Object) this);
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r5v4, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(defpackage.nr4 r16, boolean r17, int r18) {
        /*
            r0 = r16
            java.lang.Object r1 = r0.i
            nm1 r1 = (defpackage.nm1) r1
            si0 r2 = new si0
            r3 = 4
            r2.<init>(r3, r1)
            java.lang.Object r3 = r0.c
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r3.removeCallbacks(r2)
            android.content.Context r2 = r3.getContext()
            int r4 = defpackage.dra.c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r18)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r2 = r2.getString(r4, r5)
            r4 = 0
            r5 = 0
            if (r17 == 0) goto L_0x0061
            android.view.ViewGroup r6 = r16.k()
            java.lang.Object r7 = r0.m
            android.animation.Animator r7 = (android.animation.Animator) r7
            android.animation.Animator r6 = c(r6, r7)
            r0.m = r6
            android.view.ViewGroup r6 = r16.k()
            defpackage.y7e.c(r3, r6, -1)
            android.view.ViewGroup r6 = r16.k()
            android.view.View r5 = r6.getChildAt(r5)
            boolean r6 = r5 instanceof android.widget.TextView
            if (r6 == 0) goto L_0x004d
            r4 = r5
            android.widget.TextView r4 = (android.widget.TextView) r4
        L_0x004d:
            if (r4 == 0) goto L_0x0052
            r4.setText(r2)
        L_0x0052:
            android.view.ViewGroup r2 = r16.k()
            java.lang.Object r4 = r0.m
            android.animation.Animator r4 = (android.animation.Animator) r4
            android.animation.Animator r2 = b(r2, r4)
            r0.m = r2
            goto L_0x0098
        L_0x0061:
            android.view.ViewGroup r6 = r16.l()
            java.lang.Object r7 = r0.n
            android.animation.Animator r7 = (android.animation.Animator) r7
            android.animation.Animator r6 = c(r6, r7)
            r0.n = r6
            android.view.ViewGroup r6 = r16.l()
            defpackage.y7e.c(r3, r6, -1)
            android.view.ViewGroup r6 = r16.l()
            android.view.View r5 = r6.getChildAt(r5)
            boolean r6 = r5 instanceof android.widget.TextView
            if (r6 == 0) goto L_0x0085
            r4 = r5
            android.widget.TextView r4 = (android.widget.TextView) r4
        L_0x0085:
            if (r4 == 0) goto L_0x008a
            r4.setText(r2)
        L_0x008a:
            android.view.ViewGroup r2 = r16.l()
            java.lang.Object r4 = r0.n
            android.animation.Animator r4 = (android.animation.Animator) r4
            android.animation.Animator r2 = b(r2, r4)
            r0.n = r2
        L_0x0098:
            java.lang.Object r2 = r0.d
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            java.lang.Object r2 = r2.invoke()
            n7g r2 = (defpackage.n7g) r2
            if (r2 != 0) goto L_0x00b1
            java.lang.Class<nr4> r0 = defpackage.nr4.class
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "Media viewer. Can't seek by double tap because player is null"
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
            goto L_0x012c
        L_0x00b1:
            long r4 = r2.F0()
            r6 = 10000(0x2710, float:1.4013E-41)
            long r6 = (long) r6
            if (r17 == 0) goto L_0x00bc
            long r4 = r4 + r6
            goto L_0x00bd
        L_0x00bc:
            long r4 = r4 - r6
        L_0x00bd:
            long r6 = r2.G0()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x00c9
            r16.d()
            r4 = r6
        L_0x00c9:
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x00d3
            r16.d()
            r4 = r6
        L_0x00d3:
            tc5 r8 = r2.v
            int r9 = r8.getPlaybackState()
            r10 = 3
            if (r9 != r10) goto L_0x00e3
            boolean r9 = r8.q()
            if (r9 != 0) goto L_0x00e3
            goto L_0x00ea
        L_0x00e3:
            int r8 = r8.getPlaybackState()
            r9 = 1
            if (r8 != r9) goto L_0x011e
        L_0x00ea:
            java.lang.Object r0 = r0.e
            xga r0 = (defpackage.xga) r0
            r0.getClass()
            kotlin.reflect.KProperty[] r8 = one.me.chatmedia.viewer.video.VideoViewerWidget.X
            java.lang.Object r0 = r0.b
            one.me.chatmedia.viewer.video.VideoViewerWidget r0 = (one.me.chatmedia.viewer.video.VideoViewerWidget) r0
            j9g r0 = r0.e0()
            if (r0 == 0) goto L_0x011e
            one.me.chatmedia.viewer.ChatMediaViewerScreen r0 = (one.me.chatmedia.viewer.ChatMediaViewerScreen) r0
            hf7 r9 = r0.o0()
            n7g r8 = r0.p0()
            g4g r10 = r8.y
            if (r10 == 0) goto L_0x0111
            tc5 r6 = r8.v
            long r6 = r6.T()
        L_0x0111:
            r12 = r6
            n7g r0 = r0.p0()
            long r14 = r0.G0()
            r10 = r4
            r9.c(r10, r12, r14)
        L_0x011e:
            r2.I0(r4)
            si0 r0 = new si0
            r2 = 5
            r0.<init>(r2, r1)
            r1 = 600(0x258, double:2.964E-321)
            r3.postDelayed(r0, r1)
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nr4.a(nr4, boolean, int):void");
    }

    public static Animator b(ViewGroup viewGroup, Animator animator) {
        if (viewGroup.getVisibility() == 0 && animator != null && animator.isRunning()) {
            return animator;
        }
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, View.ALPHA, new float[]{viewGroup.getAlpha(), 1.0f});
        ofFloat.setDuration(200);
        ofFloat.addListener(new mr4(viewGroup, 0));
        ofFloat.start();
        return ofFloat;
    }

    public static Animator c(ViewGroup viewGroup, Animator animator) {
        if (viewGroup.getVisibility() != 0) {
            return animator;
        }
        if (animator != null && animator.isRunning()) {
            return animator;
        }
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, View.ALPHA, new float[]{viewGroup.getAlpha(), 0.0f});
        ofFloat.setDuration(200);
        ofFloat.addListener(new mr4(viewGroup, 1));
        ofFloat.start();
        return ofFloat;
    }

    public void d() {
        if (k().getVisibility() == 0) {
            this.m = c(k(), (Animator) this.m);
        }
        if (l().getVisibility() == 0) {
            this.n = c(l(), (Animator) this.n);
        }
        ((cs) this.f).b = 0;
        ((cs) this.g).b = 0;
    }

    public void e() {
        int y = tr1.y(this.b);
        if (y == 0 || y == 1) {
            s();
        } else if (y == 2 || y == 3) {
            this.b = 3;
        } else if (y != 4) {
            throw new IllegalStateException("State " + wzf.r(this.b) + " is not handled");
        }
    }

    public FrameLayout f(Context context, boolean z) {
        FrameLayout frameLayout = new FrameLayout(context);
        int i2 = z ? 8388629 : 8388627;
        int i3 = this.b;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3, i2);
        if (z) {
            layoutParams.rightMargin = MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density);
        } else {
            layoutParams.leftMargin = MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density);
        }
        frameLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        puf.D.b(textView, uy4.b);
        textView.setTextColor(l2b.i.e);
        int i4 = z ? bra.a : bra.b;
        int i5 = l2b.f.f;
        Drawable b2 = ew3.b(textView.getContext(), i4);
        iq.a0(b2, i5);
        ArrayList arrayList = wgf.a;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, b2, (Drawable) null, (Drawable) null);
        frameLayout.addView(textView);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        l2b.d.getClass();
        shapeDrawable.setTint(-1728053248);
        frameLayout.setBackground(shapeDrawable);
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    public void g(vy4 vy4, m7f m7f) {
        m7f m7f2 = m7f;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f = eglGetDisplay;
        if (!Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            int i2 = 2;
            int[] iArr = new int[2];
            if (EGL14.eglInitialize((EGLDisplay) this.f, iArr, 0, iArr, 1)) {
                if (m7f2 != null) {
                    String str = iArr[0] + "." + iArr[1];
                    if (str != null) {
                        m7f2.b = str;
                    } else {
                        throw new NullPointerException("Null eglVersion");
                    }
                }
                int i3 = vy4.a() ? 10 : 8;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig((EGLDisplay) this.f, new int[]{12324, i3, 12323, i3, 12322, i3, 12321, vy4.a() ? 2 : 8, 12325, 0, 12326, 0, 12352, vy4.a() ? 64 : 4, EglBase.EGL_RECORDABLE_ANDROID, vy4.a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    if (vy4.a()) {
                        i2 = 3;
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.f, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, i2, 12344}, 0);
                    ck6.a("eglCreateContext");
                    this.i = eGLConfig;
                    this.g = eglCreateContext;
                    EGL14.eglQueryContext((EGLDisplay) this.f, eglCreateContext, 12440, new int[1], 0);
                    return;
                }
                throw new IllegalStateException("Unable to find a suitable EGLConfig");
            }
            this.f = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        throw new IllegalStateException("Unable to get EGL14 display");
    }

    public pb0 h(Surface surface) {
        try {
            EGLConfig eGLConfig = (EGLConfig) this.i;
            Objects.requireNonNull(eGLConfig);
            EGLSurface h2 = ck6.h((EGLDisplay) this.f, eGLConfig, surface, (int[]) this.h);
            EGLDisplay eGLDisplay = (EGLDisplay) this.f;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay, h2, 12375, iArr, 0);
            int i2 = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay, h2, 12374, iArr2, 0);
            Size size = new Size(i2, iArr2[0]);
            return new pb0(h2, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e2) {
            e2.getMessage();
            return null;
        }
    }

    public void i() {
        EGLConfig eGLConfig = (EGLConfig) this.i;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = ck6.a;
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface((EGLDisplay) this.f, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        ck6.a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            this.j = eglCreatePbufferSurface;
            return;
        }
        throw new IllegalStateException("surface was null");
    }

    public v7b j(vy4 vy4) {
        ck6.d((AtomicBoolean) this.c, false);
        try {
            g(vy4, (m7f) null);
            i();
            n((EGLSurface) this.j);
            String glGetString = GLES20.glGetString(7939);
            String eglQueryString = EGL14.eglQueryString((EGLDisplay) this.f, 12373);
            if (glGetString == null) {
                glGetString = "";
            }
            if (eglQueryString == null) {
                eglQueryString = "";
            }
            return new v7b(glGetString, eglQueryString);
        } catch (IllegalStateException e2) {
            e2.getMessage();
            return new v7b("", "");
        } finally {
            p();
        }
    }

    public ViewGroup k() {
        return (ViewGroup) ((Lazy) this.k).getValue();
    }

    public ViewGroup l() {
        return (ViewGroup) ((Lazy) this.l).getValue();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, m7f] */
    public ya0 m(vy4 vy4, Map map) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
        ck6.d(atomicBoolean, false);
        ? obj = new Object();
        obj.a = "0.0";
        obj.b = "0.0";
        String str = "";
        obj.c = str;
        obj.o = str;
        try {
            if (vy4.a()) {
                v7b j2 = j(vy4);
                String str2 = (String) j2.a;
                str2.getClass();
                String str3 = (String) j2.b;
                str3.getClass();
                if (!str2.contains("GL_EXT_YUV_target")) {
                    vy4 = vy4.d;
                }
                int[] iArr = ck6.a;
                if (vy4.a == 3 && str3.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                    iArr = ck6.b;
                }
                this.h = iArr;
                obj.c = str2;
                obj.o = str3;
            }
            g(vy4, obj);
            i();
            n((EGLSurface) this.j);
            String i2 = ck6.i();
            if (i2 != null) {
                obj.a = i2;
                this.l = ck6.f(vy4, map);
                int g2 = ck6.g();
                this.b = g2;
                t(g2);
                this.e = Thread.currentThread();
                atomicBoolean.set(true);
                if (((String) obj.a) == null) {
                    str = " glVersion";
                }
                if (((String) obj.b) == null) {
                    str = str.concat(" eglVersion");
                }
                if (((String) obj.c) == null) {
                    str = tr1.j(str, " glExtensions");
                }
                if (((String) obj.o) == null) {
                    str = tr1.j(str, " eglExtensions");
                }
                if (str.isEmpty()) {
                    return new ya0((String) obj.a, (String) obj.b, (String) obj.c, (String) obj.o);
                }
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
            throw new NullPointerException("Null glVersion");
        } catch (IllegalArgumentException | IllegalStateException e2) {
            p();
            throw e2;
        }
    }

    public void n(EGLSurface eGLSurface) {
        ((EGLDisplay) this.f).getClass();
        ((EGLContext) this.g).getClass();
        if (!EGL14.eglMakeCurrent((EGLDisplay) this.f, eGLSurface, eGLSurface, (EGLContext) this.g)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void o(Surface surface) {
        ck6.d((AtomicBoolean) this.c, true);
        ck6.c((Thread) this.e);
        HashMap hashMap = (HashMap) this.d;
        if (!hashMap.containsKey(surface)) {
            hashMap.put(surface, ck6.j);
        }
    }

    public void p() {
        for (ak6 ak6 : ((Map) this.l).values()) {
            GLES20.glDeleteProgram(ak6.a);
        }
        this.l = Collections.emptyMap();
        this.m = null;
        if (!Objects.equals((EGLDisplay) this.f, EGL14.EGL_NO_DISPLAY)) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent((EGLDisplay) this.f, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            HashMap hashMap = (HashMap) this.d;
            for (pb0 pb0 : hashMap.values()) {
                if (!Objects.equals(pb0.a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.f, pb0.a)) {
                    try {
                        ck6.a("eglDestroySurface");
                    } catch (IllegalStateException e2) {
                        e2.toString();
                    }
                }
            }
            hashMap.clear();
            if (!Objects.equals((EGLSurface) this.j, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.f, (EGLSurface) this.j);
                this.j = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals((EGLContext) this.g, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.f, (EGLContext) this.g);
                this.g = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.f);
            this.f = EGL14.EGL_NO_DISPLAY;
        }
        this.i = null;
        this.b = -1;
        this.n = zj6.a;
        this.k = null;
        this.e = null;
    }

    public void q(Surface surface, boolean z) {
        if (((Surface) this.k) == surface) {
            this.k = null;
            n((EGLSurface) this.j);
        }
        HashMap hashMap = (HashMap) this.d;
        pb0 pb0 = z ? (pb0) hashMap.remove(surface) : (pb0) hashMap.put(surface, ck6.j);
        if (pb0 != null && pb0 != ck6.j) {
            try {
                EGL14.eglDestroySurface((EGLDisplay) this.f, pb0.a);
            } catch (RuntimeException e2) {
                e2.getMessage();
            }
        }
    }

    public void r(long j2, float[] fArr, Surface surface) {
        ck6.d((AtomicBoolean) this.c, true);
        ck6.c((Thread) this.e);
        HashMap hashMap = (HashMap) this.d;
        bs0.r("The surface is not registered.", hashMap.containsKey(surface));
        pb0 pb0 = (pb0) hashMap.get(surface);
        Objects.requireNonNull(pb0);
        if (pb0 == ck6.j) {
            pb0 = h(surface);
            if (pb0 != null) {
                hashMap.put(surface, pb0);
            } else {
                return;
            }
        }
        Surface surface2 = (Surface) this.k;
        EGLSurface eGLSurface = pb0.a;
        if (surface != surface2) {
            n(eGLSurface);
            this.k = surface;
            int i2 = pb0.b;
            int i3 = pb0.c;
            GLES20.glViewport(0, 0, i2, i3);
            GLES20.glScissor(0, 0, i2, i3);
        }
        ak6 ak6 = (ak6) this.m;
        ak6.getClass();
        if (ak6 instanceof bk6) {
            GLES20.glUniformMatrix4fv(((bk6) ak6).f, 1, false, fArr, 0);
            ck6.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        ck6.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f, eGLSurface, j2);
        if (!EGL14.eglSwapBuffers((EGLDisplay) this.f, eGLSurface)) {
            Integer.toHexString(EGL14.eglGetError());
            q(surface, false);
        }
    }

    public void s() {
        int y = tr1.y(this.b);
        if (y == 0) {
            this.b = 5;
        } else if (y == 1 || y == 2 || y == 3) {
            this.b = 5;
            ((do1) this.n).b((g65) this.f);
            this.h = null;
            g65 g65 = (g65) this.f;
            if (g65 != null) {
                Objects.toString(g65);
                g65 g652 = (g65) this.f;
                g652.getClass();
                g652.h.execute(new u55(g652, 4));
                ((g65) this.f).i.d(new qof(7, this), (Executor) this.d);
                this.f = null;
                return;
            }
            ((do1) this.l).b((Object) null);
        } else if (y != 4) {
            throw new IllegalStateException("State " + wzf.r(this.b) + " is not handled");
        }
    }

    public void t(int i2) {
        ak6 ak6 = (ak6) ((Map) this.l).get((zj6) this.n);
        if (ak6 != null) {
            if (((ak6) this.m) != ak6) {
                this.m = ak6;
                ak6.b();
                Objects.toString((zj6) this.n);
                Objects.toString((ak6) this.m);
            }
            GLES20.glActiveTexture(33984);
            ck6.b("glActiveTexture");
            GLES20.glBindTexture(36197, i2);
            ck6.b("glBindTexture");
            return;
        }
        throw new IllegalStateException("Unable to configure program for input format: " + ((zj6) this.n));
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString((z3f) this.h, "SURFACE_REQUEST_NOT_CONFIGURED");
            default:
                return super.toString();
        }
    }

    public nr4() {
        this.a = 1;
        this.c = new AtomicBoolean(false);
        this.d = new HashMap();
        this.f = EGL14.EGL_NO_DISPLAY;
        this.g = EGL14.EGL_NO_CONTEXT;
        this.h = ck6.a;
        this.j = EGL14.EGL_NO_SURFACE;
        this.l = Collections.emptyMap();
        this.m = null;
        this.n = zj6.a;
        this.b = -1;
    }

    public nr4(ts1 ts1, tsd tsd, Executor executor) {
        this.a = 2;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.b = 1;
        this.k = new xa7(1, new IllegalStateException("Cannot close the encoder before configuring."));
        this.l = null;
        this.m = new xa7(1, new IllegalStateException("Cannot close the encoder before configuring."));
        this.n = null;
        this.c = executor;
        this.d = tsd;
        this.e = ts1;
    }
}
