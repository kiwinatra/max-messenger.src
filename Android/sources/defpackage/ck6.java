package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ck6  reason: default package */
public abstract class ck6 {
    public static final int[] a = {12344};
    public static final int[] b = {12445, 13632, 12344};
    public static final String c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
    public static final String d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
    public static final xj6 e = new xj6(0);
    public static final xj6 f = new xj6(1);
    public static final xj6 g = new xj6(2);
    public static final FloatBuffer h;
    public static final FloatBuffer i;
    public static final pb0 j = new pb0(EGL14.EGL_NO_SURFACE, 0, 0);

    static {
        Locale locale = Locale.US;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer.position(0);
        h = asFloatBuffer;
        float[] fArr = {c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 1.0f, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f, 1.0f};
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(fArr);
        asFloatBuffer2.position(0);
        i = asFloatBuffer2;
    }

    public static void a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            StringBuilder m = g63.m(str, ": EGL error: 0x");
            m.append(Integer.toHexString(eglGetError));
            throw new IllegalStateException(m.toString());
        }
    }

    public static void b(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder m = g63.m(str, ": GL error 0x");
            m.append(Integer.toHexString(glGetError));
            throw new IllegalStateException(m.toString());
        }
    }

    public static void c(Thread thread) {
        bs0.r("Method call must be called on the GL thread.", thread == Thread.currentThread());
    }

    public static void d(AtomicBoolean atomicBoolean, boolean z) {
        bs0.r(z ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized", z == atomicBoolean.get());
    }

    public static void e(int i2, String str) {
        if (i2 < 0) {
            throw new IllegalStateException(wj6.k("Unable to locate '", str, "' in program"));
        }
    }

    public static HashMap f(vy4 vy4, Map map) {
        Object obj;
        zj6 zj6;
        HashMap hashMap = new HashMap();
        zj6[] values = zj6.values();
        int length = values.length;
        for (int i2 = 0; i2 < length; i2++) {
            zj6 zj62 = values[i2];
            xj6 xj6 = (xj6) map.get(zj62);
            if (xj6 != null) {
                obj = new bk6(vy4, xj6);
            } else if (zj62 == zj6.c || zj62 == (zj6 = zj6.b)) {
                obj = new bk6(vy4, zj62);
            } else {
                bs0.r("Unhandled input format: " + zj62, zj62 == zj6.a);
                if (vy4.a()) {
                    obj = new ak6("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    xj6 xj62 = (xj6) map.get(zj6);
                    obj = xj62 != null ? new bk6(vy4, xj62) : new bk6(vy4, zj6);
                }
            }
            Objects.toString(zj62);
            obj.toString();
            hashMap.put(zj62, obj);
        }
        return hashMap;
    }

    public static int g() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        b("glGenTextures");
        int i2 = iArr[0];
        GLES20.glBindTexture(36197, i2);
        b("glBindTexture " + i2);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        b("glTexParameter");
        return i2;
    }

    public static EGLSurface h(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        a("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static String i() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        group2.getClass();
        return g63.i(group, ".", group2);
    }

    public static int j(int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        b("glCreateShader type=" + i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        GLES20.glDeleteShader(glCreateShader);
        StringBuilder o = wj6.o(i2, "Could not compile shader type ", ":");
        o.append(GLES20.glGetShaderInfoLog(glCreateShader));
        throw new IllegalStateException(o.toString());
    }
}
