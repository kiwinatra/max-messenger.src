package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: j6b  reason: default package */
public final class j6b implements SurfaceTexture.OnFrameAvailableListener {
    public SurfaceTexture a;
    public Surface b;
    public final Object c = new Object();
    public boolean o;
    public khf v;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j6b() {
        /*
            r7 = this;
            r7.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r7.c = r0
            khf r0 = new khf
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1
            r0.<init>(r1, r2)
            r7.v = r0
            r1 = 35633(0x8b31, float:4.9932E-41)
            java.lang.String r3 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n"
            int r1 = defpackage.khf.c(r1, r3)
            r3 = 0
            if (r1 != 0) goto L_0x0022
        L_0x0020:
            r5 = r3
            goto L_0x005b
        L_0x0022:
            r4 = 35632(0x8b30, float:4.9931E-41)
            java.lang.String r5 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"
            int r4 = defpackage.khf.c(r4, r5)
            if (r4 != 0) goto L_0x002e
            goto L_0x0020
        L_0x002e:
            int r5 = android.opengl.GLES20.glCreateProgram()
            java.lang.String r6 = "glCreateProgram"
            defpackage.khf.a(r6)
            android.opengl.GLES20.glAttachShader(r5, r1)
            java.lang.String r1 = "glAttachShader"
            defpackage.khf.a(r1)
            android.opengl.GLES20.glAttachShader(r5, r4)
            defpackage.khf.a(r1)
            android.opengl.GLES20.glLinkProgram(r5)
            int[] r1 = new int[r2]
            r4 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r5, r4, r1, r3)
            r1 = r1[r3]
            if (r1 == r2) goto L_0x005b
            android.opengl.GLES20.glGetProgramInfoLog(r5)
            android.opengl.GLES20.glDeleteProgram(r5)
            goto L_0x0020
        L_0x005b:
            r0.i = r5
            if (r5 == 0) goto L_0x0117
            java.lang.String r1 = "aPosition"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r5, r1)
            r0.m = r1
            java.lang.String r1 = "glGetAttribLocation aPosition"
            defpackage.khf.a(r1)
            int r1 = r0.m
            r4 = -1
            if (r1 == r4) goto L_0x010f
            int r1 = r0.i
            java.lang.String r5 = "aTextureCoord"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r1, r5)
            r0.n = r1
            java.lang.String r1 = "glGetAttribLocation aTextureCoord"
            defpackage.khf.a(r1)
            int r1 = r0.n
            if (r1 == r4) goto L_0x0107
            int r1 = r0.i
            java.lang.String r5 = "uMVPMatrix"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r5)
            r0.k = r1
            java.lang.String r1 = "glGetUniformLocation uMVPMatrix"
            defpackage.khf.a(r1)
            int r1 = r0.k
            if (r1 == r4) goto L_0x00ff
            int r1 = r0.i
            java.lang.String r5 = "uSTMatrix"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r5)
            r0.l = r1
            java.lang.String r1 = "glGetUniformLocation uSTMatrix"
            defpackage.khf.a(r1)
            int r1 = r0.l
            if (r1 == r4) goto L_0x00f7
            int[] r1 = new int[r2]
            android.opengl.GLES20.glGenTextures(r2, r1, r3)
            r1 = r1[r3]
            r0.j = r1
            r0 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r0, r1)
            java.lang.String r1 = "glBindTexture mTextureID"
            defpackage.khf.a(r1)
            r1 = 10241(0x2801, float:1.435E-41)
            r2 = 1175977984(0x46180000, float:9728.0)
            android.opengl.GLES20.glTexParameterf(r0, r1, r2)
            r1 = 10240(0x2800, float:1.4349E-41)
            r2 = 1175979008(0x46180400, float:9729.0)
            android.opengl.GLES20.glTexParameterf(r0, r1, r2)
            r1 = 10242(0x2802, float:1.4352E-41)
            r2 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r0, r1, r2)
            r1 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r0, r1, r2)
            java.lang.String r0 = "glTexParameter"
            defpackage.khf.a(r0)
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            khf r1 = r7.v
            int r1 = r1.j
            r0.<init>(r1)
            r7.a = r0
            r0.setOnFrameAvailableListener(r7)
            android.view.Surface r0 = new android.view.Surface
            android.graphics.SurfaceTexture r1 = r7.a
            r0.<init>(r1)
            r7.b = r0
            return
        L_0x00f7:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Could not get attrib location for uSTMatrix"
            r7.<init>(r0)
            throw r7
        L_0x00ff:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Could not get attrib location for uMVPMatrix"
            r7.<init>(r0)
            throw r7
        L_0x0107:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Could not get attrib location for aTextureCoord"
            r7.<init>(r0)
            throw r7
        L_0x010f:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Could not get attrib location for aPosition"
            r7.<init>(r0)
            throw r7
        L_0x0117:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "failed creating program"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j6b.<init>():void");
    }

    public final void a() {
        this.b.release();
        this.v = null;
        this.b = null;
        this.a = null;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.c) {
            try {
                if (!this.o) {
                    this.o = true;
                    this.c.notifyAll();
                } else {
                    throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
