package defpackage;

import android.content.Context;
import android.opengl.EGLDisplay;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: gk4  reason: default package */
public final class gk4 implements x5g {
    public static final /* synthetic */ int s = 0;
    public final Context a;
    public final yr6 b;
    public final EGLDisplay c;
    public final th7 d;
    public final gy0 e;
    public final w5g f;
    public final Executor g;
    public final boolean h;
    public final vo5 i;
    public final ArrayList j;
    public final bv1 k;
    public cs l;
    public boolean m;
    public final ArrayList n = new ArrayList();
    public final Object o = new Object();
    public final m53 p;
    public volatile je6 q;
    public volatile boolean r;

    static {
        cs8.a("media3.effect");
    }

    public gk4(Context context, yr6 yr6, EGLDisplay eGLDisplay, th7 th7, gy0 gy0, w5g w5g, Executor executor, vo5 vo5, boolean z, m53 m53) {
        this.a = context;
        this.b = yr6;
        this.c = eGLDisplay;
        this.d = th7;
        this.e = gy0;
        this.f = w5g;
        this.g = executor;
        this.h = z;
        this.p = m53;
        this.i = vo5;
        this.j = new ArrayList();
        bv1 bv1 = new bv1(2, false, false);
        this.k = bv1;
        bv1.g();
        vo5.A = new fm3(this, executor, w5g, gy0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: jb7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: jb7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: qb7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: qb7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: jb7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: jb7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v16, resolved type: qb7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: qb7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: jb7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: jb7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: jb7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v19, resolved type: jb7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: qb7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v21, resolved type: qb7} */
    /* JADX WARNING: type inference failed for: r0v7, types: [es6, java.lang.Object, qr0] */
    /* JADX WARNING: type inference failed for: r12v12, types: [qb7, jb7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.cs r20, boolean r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 0
            r3 = 1
            java.lang.Object r4 = r1.o
            je6 r4 = (defpackage.je6) r4
            m53 r4 = r4.a
            boolean r5 = defpackage.m53.g(r4)
            r6 = 6
            if (r5 == 0) goto L_0x001d
            int r5 = r4.a
            if (r5 != r6) goto L_0x0019
            r5 = r3
            goto L_0x001a
        L_0x0019:
            r5 = r2
        L_0x001a:
            defpackage.n79.g(r5)
        L_0x001d:
            boolean r5 = defpackage.m53.g(r4)
            m53 r7 = r0.p
            if (r5 != 0) goto L_0x002b
            boolean r5 = defpackage.m53.g(r7)
            if (r5 == 0) goto L_0x0046
        L_0x002b:
            int[] r5 = new int[r3]     // Catch:{ GlUtil$GlException -> 0x03be }
            android.opengl.EGLDisplay r8 = android.opengl.EGL14.eglGetDisplay(r2)     // Catch:{ GlUtil$GlException -> 0x03be }
            android.opengl.EGLContext r9 = android.opengl.EGL14.eglGetCurrentContext()     // Catch:{ GlUtil$GlException -> 0x03be }
            r10 = 12440(0x3098, float:1.7432E-41)
            android.opengl.EGL14.eglQueryContext(r8, r9, r10, r5, r2)     // Catch:{ GlUtil$GlException -> 0x03be }
            defpackage.ld8.h()     // Catch:{ GlUtil$GlException -> 0x03be }
            r5 = r5[r2]     // Catch:{ GlUtil$GlException -> 0x03be }
            long r8 = (long) r5
            r10 = 3
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x03b6
        L_0x0046:
            boolean r5 = r4.e()
            defpackage.n79.g(r5)
            int r5 = r4.c
            if (r5 == r3) goto L_0x0053
            r5 = r3
            goto L_0x0054
        L_0x0053:
            r5 = r2
        L_0x0054:
            defpackage.n79.g(r5)
            boolean r5 = r7.e()
            defpackage.n79.g(r5)
            int r5 = r7.c
            if (r5 == r3) goto L_0x0064
            r8 = r3
            goto L_0x0065
        L_0x0064:
            r8 = r2
        L_0x0065:
            defpackage.n79.g(r8)
            boolean r8 = defpackage.m53.g(r4)
            boolean r9 = defpackage.m53.g(r7)
            r10 = 3
            if (r8 == r9) goto L_0x009e
            int r8 = r4.a
            int r9 = r7.a
            if (r8 != r6) goto L_0x0088
            if (r9 == r6) goto L_0x0088
            boolean r8 = defpackage.m53.g(r4)
            if (r8 == 0) goto L_0x0088
            r8 = 10
            if (r5 == r8) goto L_0x0098
            if (r5 != r10) goto L_0x0088
            goto L_0x0098
        L_0x0088:
            m53 r5 = defpackage.m53.i
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x009a
            if (r9 != r6) goto L_0x009a
            boolean r4 = defpackage.m53.g(r7)
            if (r4 == 0) goto L_0x009a
        L_0x0098:
            r4 = r3
            goto L_0x009b
        L_0x009a:
            r4 = r2
        L_0x009b:
            defpackage.n79.g(r4)
        L_0x009e:
            java.util.ArrayList r4 = r0.n
            java.util.concurrent.Executor r5 = r0.g
            th7 r8 = r0.d
            java.lang.Object r9 = r1.c
            java.util.List r9 = (java.util.List) r9
            if (r21 != 0) goto L_0x00b0
            boolean r11 = r4.equals(r9)
            if (r11 != 0) goto L_0x01b7
        L_0x00b0:
            java.util.ArrayList r11 = r0.j
            boolean r12 = r11.isEmpty()
            if (r12 != 0) goto L_0x00cd
            r12 = r2
        L_0x00b9:
            int r13 = r11.size()
            if (r12 >= r13) goto L_0x00ca
            java.lang.Object r13 = r11.get(r12)
            fs6 r13 = (defpackage.fs6) r13
            r13.release()
            int r12 = r12 + r3
            goto L_0x00b9
        L_0x00ca:
            r11.clear()
        L_0x00cd:
            qb7 r12 = new qb7
            r13 = 4
            r12.<init>(r13)
            qb7 r14 = new qb7
            r14.<init>(r13)
            qb7 r15 = new qb7
            r15.<init>(r13)
            r6 = r2
        L_0x00de:
            int r10 = r9.size()
            if (r6 >= r10) goto L_0x0149
            java.lang.Object r10 = r9.get(r6)
            hh8 r10 = (defpackage.hh8) r10
            boolean r2 = r10 instanceof defpackage.hh8
            java.lang.String r3 = "DefaultVideoFrameProcessor only supports GlEffects"
            defpackage.n79.f(r3, r2)
            boolean r2 = r10 instanceof defpackage.hh8
            if (r2 == 0) goto L_0x00ff
            hh8 r10 = (defpackage.hh8) r10
            r14.a(r10)
            r17 = r7
            r2 = r13
        L_0x00fd:
            r3 = 1
            goto L_0x0143
        L_0x00ff:
            k0d r2 = r14.j()
            k0d r3 = r15.j()
            boolean r13 = defpackage.m53.g(r7)
            boolean r16 = r2.isEmpty()
            r17 = r7
            android.content.Context r7 = r0.a
            if (r16 == 0) goto L_0x011e
            boolean r16 = r3.isEmpty()
            if (r16 != 0) goto L_0x011c
            goto L_0x011e
        L_0x011c:
            r2 = 4
            goto L_0x0130
        L_0x011e:
            gi4 r2 = defpackage.gi4.h(r7, r2, r3, r13)
            r12.a(r2)
            qb7 r14 = new qb7
            r2 = 4
            r14.<init>(r2)
            qb7 r15 = new qb7
            r15.<init>(r2)
        L_0x0130:
            hh8 r10 = (defpackage.hh8) r10
            r10.getClass()
            k0d r3 = defpackage.tb7.t(r10)
            k0d r10 = defpackage.k0d.v
            gi4 r3 = defpackage.gi4.h(r7, r3, r10, r13)
            r12.a(r3)
            goto L_0x00fd
        L_0x0143:
            int r6 = r6 + r3
            r13 = r2
            r7 = r17
            r2 = 0
            goto L_0x00de
        L_0x0149:
            k0d r2 = r14.j()
            k0d r3 = r15.j()
            vo5 r6 = r0.i
            java.util.ArrayList r7 = r6.b
            r7.clear()
            r7.addAll(r2)
            java.util.ArrayList r2 = r6.c
            r2.clear()
            r2.addAll(r3)
            r2 = 1
            r6.B = r2
            k0d r2 = r12.j()
            r11.addAll(r2)
            java.lang.Object r2 = defpackage.b0h.v(r11, r6)
            fs6 r2 = (defpackage.fs6) r2
            r8.j = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r11)
            r2.add(r6)
            r3 = 0
        L_0x017e:
            int r6 = r2.size()
            r7 = 1
            int r6 = r6 - r7
            if (r3 >= r6) goto L_0x01b1
            java.lang.Object r6 = r2.get(r3)
            fs6 r6 = (defpackage.fs6) r6
            int r3 = r3 + r7
            java.lang.Object r7 = r2.get(r3)
            fs6 r7 = (defpackage.fs6) r7
            l15 r10 = new l15
            yr6 r11 = r0.b
            gy0 r12 = r0.e
            r10.<init>(r11, r6, r7, r12)
            r6.f(r10)
            w5g r11 = r0.f
            java.util.Objects.requireNonNull(r11)
            ak4 r12 = new ak4
            r13 = 0
            r12.<init>(r11, r13)
            r6.e(r5, r12)
            r7.g(r10)
            goto L_0x017e
        L_0x01b1:
            r4.clear()
            r4.addAll(r9)
        L_0x01b7:
            fs6 r2 = r8.j
            defpackage.n79.o(r2)
            android.util.SparseArray r2 = r8.g
            int r3 = r1.b
            boolean r4 = defpackage.v0g.l(r2, r3)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Input type not registered: "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            defpackage.n79.m(r6, r4)
            r13 = 0
        L_0x01d6:
            int r4 = r2.size()
            java.lang.Object r6 = r1.o
            je6 r6 = (defpackage.je6) r6
            if (r13 >= r4) goto L_0x0397
            int r4 = r2.keyAt(r13)
            java.lang.Object r7 = r2.get(r4)
            sh7 r7 = (defpackage.sh7) r7
            if (r4 != r3) goto L_0x037e
            m53 r4 = r7.c
            q2 r9 = r7.a
            if (r4 == 0) goto L_0x0202
            m53 r10 = r6.a
            boolean r4 = r10.equals(r4)
            if (r4 != 0) goto L_0x01fb
            goto L_0x0202
        L_0x01fb:
            r16 = r2
            r18 = r5
            r5 = 6
            goto L_0x0346
        L_0x0202:
            m53 r4 = r6.a
            java.lang.String r10 = "uApplyHdrToSdrToneMapping"
            java.lang.String r11 = "uInputColorTransfer"
            java.lang.String r12 = "shaders/vertex_shader_transformation_es3.glsl"
            java.lang.String r14 = "shaders/vertex_shader_transformation_es2.glsl"
            int r15 = r8.h
            r16 = r2
            m53 r2 = r8.b
            r21 = r12
            android.content.Context r12 = r8.a
            r17 = r14
            r14 = 2
            r18 = r5
            r5 = 1
            if (r3 == r5) goto L_0x02a5
            if (r3 == r14) goto L_0x0230
            r5 = 3
            if (r3 != r5) goto L_0x0224
            goto L_0x0230
        L_0x0224:
            androidx.media3.common.VideoFrameProcessingException r0 = new androidx.media3.common.VideoFrameProcessingException
            java.lang.String r1 = "Unsupported input type "
            java.lang.String r1 = defpackage.wj6.h(r3, r1)
            r0.<init>(r1)
            throw r0
        L_0x0230:
            k0d r5 = defpackage.gi4.v
            int r5 = r4.c
            if (r5 != r14) goto L_0x023b
            if (r3 != r14) goto L_0x0239
            goto L_0x023b
        L_0x0239:
            r5 = 0
            goto L_0x023c
        L_0x023b:
            r5 = 1
        L_0x023c:
            defpackage.n79.n(r5)
            boolean r5 = defpackage.m53.g(r4)
            if (r3 != r14) goto L_0x024c
            int r14 = r2.a
            r1 = 6
            if (r14 != r1) goto L_0x024c
            r1 = 1
            goto L_0x024d
        L_0x024c:
            r1 = 0
        L_0x024d:
            if (r5 != 0) goto L_0x0255
            if (r1 == 0) goto L_0x0252
            goto L_0x0255
        L_0x0252:
            r14 = r17
            goto L_0x0257
        L_0x0255:
            r14 = r21
        L_0x0257:
            if (r1 == 0) goto L_0x025e
            java.lang.String r17 = "shaders/fragment_shader_transformation_ultra_hdr_es3.glsl"
        L_0x025b:
            r0 = r17
            goto L_0x0266
        L_0x025e:
            if (r5 == 0) goto L_0x0263
            java.lang.String r17 = "shaders/fragment_shader_transformation_hdr_internal_es3.glsl"
            goto L_0x025b
        L_0x0263:
            java.lang.String r17 = "shaders/fragment_shader_transformation_sdr_internal_es2.glsl"
            goto L_0x025b
        L_0x0266:
            bs6 r0 = defpackage.gi4.j(r12, r14, r0)
            if (r1 != 0) goto L_0x0282
            int r1 = r4.c
            if (r5 != 0) goto L_0x0279
            r12 = 2
            if (r1 == r12) goto L_0x0279
            r14 = 3
            if (r1 != r14) goto L_0x0277
            goto L_0x027a
        L_0x0277:
            r12 = 0
            goto L_0x027b
        L_0x0279:
            r14 = 3
        L_0x027a:
            r12 = 1
        L_0x027b:
            defpackage.n79.g(r12)
            r0.q(r1, r11)
            goto L_0x0283
        L_0x0282:
            r14 = 3
        L_0x0283:
            if (r5 == 0) goto L_0x0290
            int r1 = r2.a
            r5 = 6
            if (r1 == r5) goto L_0x028c
            r1 = 1
            goto L_0x028d
        L_0x028c:
            r1 = 0
        L_0x028d:
            r0.q(r1, r10)
        L_0x0290:
            k0d r1 = defpackage.k0d.v
            r5 = 2
            if (r3 != r5) goto L_0x029e
            fi4 r1 = new fi4
            r1.<init>()
            k0d r1 = defpackage.tb7.t(r1)
        L_0x029e:
            gi4 r0 = defpackage.gi4.k(r0, r4, r2, r15, r1)
            r5 = 6
            goto L_0x0329
        L_0x02a5:
            r14 = 3
            k0d r0 = defpackage.gi4.v
            boolean r0 = defpackage.m53.g(r4)
            if (r0 == 0) goto L_0x02b1
            r1 = r21
            goto L_0x02b3
        L_0x02b1:
            r1 = r17
        L_0x02b3:
            if (r0 == 0) goto L_0x02b8
            java.lang.String r5 = "shaders/fragment_shader_transformation_external_yuv_es3.glsl"
            goto L_0x02ba
        L_0x02b8:
            java.lang.String r5 = "shaders/fragment_shader_transformation_sdr_external_es2.glsl"
        L_0x02ba:
            bs6 r1 = defpackage.gi4.j(r12, r1, r5)
            if (r0 == 0) goto L_0x031e
            android.opengl.EGLContext r0 = android.opengl.EGL14.eglGetCurrentContext()
            android.opengl.EGLContext r5 = android.opengl.EGL14.EGL_NO_CONTEXT
            boolean r0 = defpackage.v0g.a(r0, r5)
            if (r0 == 0) goto L_0x02e6
            android.opengl.EGLDisplay r0 = defpackage.ld8.H()     // Catch:{ GlUtil$GlException -> 0x0316 }
            android.opengl.EGLContext r12 = android.opengl.EGL14.EGL_NO_CONTEXT     // Catch:{ GlUtil$GlException -> 0x0316 }
            int[] r14 = defpackage.ld8.c     // Catch:{ GlUtil$GlException -> 0x0316 }
            r5 = 2
            android.opengl.EGLContext r5 = defpackage.ld8.r(r12, r0, r5, r14)     // Catch:{ GlUtil$GlException -> 0x0316 }
            defpackage.ld8.s(r5, r0)     // Catch:{ GlUtil$GlException -> 0x0316 }
            r12 = 7939(0x1f03, float:1.1125E-41)
            java.lang.String r12 = android.opengl.GLES20.glGetString(r12)     // Catch:{ GlUtil$GlException -> 0x0316 }
            defpackage.ld8.v(r5, r0)     // Catch:{ GlUtil$GlException -> 0x0316 }
            goto L_0x02ec
        L_0x02e6:
            r0 = 7939(0x1f03, float:1.1125E-41)
            java.lang.String r12 = android.opengl.GLES20.glGetString(r0)
        L_0x02ec:
            if (r12 == 0) goto L_0x0316
            java.lang.String r0 = "GL_EXT_YUV_target"
            boolean r0 = r12.contains(r0)
            if (r0 == 0) goto L_0x0316
            int r0 = r4.b
            r5 = 1
            if (r0 != r5) goto L_0x02fe
            float[] r0 = defpackage.gi4.w
            goto L_0x0300
        L_0x02fe:
            float[] r0 = defpackage.gi4.x
        L_0x0300:
            java.lang.String r5 = "uYuvToRgbColorTransform"
            r1.n(r5, r0)
            int r0 = r4.c
            r1.q(r0, r11)
            int r0 = r2.a
            r5 = 6
            if (r0 == r5) goto L_0x0311
            r0 = 1
            goto L_0x0312
        L_0x0311:
            r0 = 0
        L_0x0312:
            r1.q(r0, r10)
            goto L_0x031f
        L_0x0316:
            androidx.media3.common.VideoFrameProcessingException r0 = new androidx.media3.common.VideoFrameProcessingException
            java.lang.String r1 = "The EXT_YUV_target extension is required for HDR editing input."
            r0.<init>(r1)
            throw r0
        L_0x031e:
            r5 = 6
        L_0x031f:
            boolean r0 = r8.i
            r1.b = r0
            k0d r0 = defpackage.k0d.v
            gi4 r0 = defpackage.gi4.k(r1, r4, r2, r15, r0)
        L_0x0329:
            java.util.concurrent.Executor r1 = r8.f
            r0.e = r1
            cs6 r1 = r8.e
            r0.d = r1
            gf5 r1 = r7.b
            if (r1 == 0) goto L_0x033a
            gi4 r1 = (defpackage.gi4) r1
            r1.release()
        L_0x033a:
            r7.b = r0
            r9.X(r0)
            r0.g(r9)
            m53 r0 = r6.a
            r7.c = r0
        L_0x0346:
            qr0 r0 = new qr0
            gf5 r1 = r7.b
            r1.getClass()
            fs6 r2 = r8.j
            yr6 r4 = r8.c
            gi4 r1 = (defpackage.gi4) r1
            gy0 r6 = r8.d
            r0.<init>()
            l15 r10 = new l15
            r10.<init>(r4, r1, r2, r6)
            r0.b = r10
            r7.d = r0
            gf5 r1 = r7.b
            r1.getClass()
            kj0 r1 = (defpackage.kj0) r1
            r1.c = r0
            qr0 r0 = r7.d
            if (r0 != 0) goto L_0x036f
            goto L_0x0372
        L_0x036f:
            r1 = 1
            r0.a = r1
        L_0x0372:
            fs6 r1 = r8.j
            r0.getClass()
            r1.g(r0)
            r8.k = r9
        L_0x037c:
            r0 = 1
            goto L_0x038c
        L_0x037e:
            r16 = r2
            r18 = r5
            r5 = 6
            qr0 r0 = r7.d
            if (r0 != 0) goto L_0x0388
            goto L_0x037c
        L_0x0388:
            r1 = 0
            r0.a = r1
            goto L_0x037c
        L_0x038c:
            int r13 = r13 + r0
            r0 = r19
            r1 = r20
            r2 = r16
            r5 = r18
            goto L_0x01d6
        L_0x0397:
            r18 = r5
            q2 r0 = r8.k
            r0.getClass()
            r0.U(r6)
            r0 = r19
            bv1 r1 = r0.k
            r1.g()
            bk4 r1 = new bk4
            r2 = r20
            r3 = 0
            r1.<init>(r3, r0, r2)
            r0 = r18
            r0.execute(r1)
            return
        L_0x03b6:
            androidx.media3.common.VideoFrameProcessingException r0 = new androidx.media3.common.VideoFrameProcessingException
            java.lang.String r1 = "OpenGL ES 3.0 context support is required for HDR input or output."
            r0.<init>(r1)
            throw r0
        L_0x03be:
            r0 = move-exception
            androidx.media3.common.VideoFrameProcessingException r0 = androidx.media3.common.VideoFrameProcessingException.a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk4.a(cs, boolean):void");
    }

    public final boolean b() {
        n79.n(!this.r);
        n79.p(this.q, "registerInputStream must be called before registering input frames");
        if (!this.k.e()) {
            return false;
        }
        q2 q2Var = this.d.k;
        n79.o(q2Var);
        q2Var.Q(this.q);
        return true;
    }

    public final void c(int i2, List list, je6 je6) {
        je6 je62;
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            LinkedHashMap linkedHashMap = p94.a;
            synchronized (p94.class) {
            }
            float f2 = je6.d;
            if (f2 > 1.0f) {
                je62 = new je6(je6.a, (int) (((float) je6.b) * f2), je6.c, 1.0f, je6.e);
            } else if (f2 < 1.0f) {
                je62 = new je6(je6.a, je6.b, (int) (((float) je6.c) / f2), 1.0f, je6.e);
            } else {
                je62 = je6;
            }
            this.q = je62;
            try {
                this.k.a();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                this.g.execute(new bk4(1, this, e2));
            }
            synchronized (this.o) {
                try {
                    cs csVar = new cs(i2, list, je6);
                    if (!this.m) {
                        this.m = true;
                        this.k.c();
                        this.e.v(new ck4(this, csVar, 0));
                    } else {
                        this.l = csVar;
                        this.k.c();
                        q2 q2Var = this.d.k;
                        n79.o(q2Var);
                        q2Var.Y();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new IllegalArgumentException(String.valueOf(i2));
    }

    public final void d() {
        try {
            this.e.t(new dk4(2, this));
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(e2);
        }
    }

    public final void e(r3f r3f) {
        vo5 vo5 = this.i;
        vo5.getClass();
        try {
            vo5.i.o(new az1(2, vo5, r3f));
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            vo5.j.execute(new bk4(29, vo5, e2));
        }
    }

    public final void f() {
        p94.a();
        n79.n(!this.r);
        this.r = true;
        q2 q2Var = this.d.k;
        q2Var.getClass();
        q2Var.Y();
    }
}
