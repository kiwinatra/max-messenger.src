package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Parcelable;
import com.yalantis.ucrop.callback.BitmapLoadCallback;
import com.yalantis.ucrop.task.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import jp.co.cyberagent.android.gpuimage.GPUImageNativeLibrary;

/* renamed from: p5  reason: default package */
public final /* synthetic */ class p5 implements qk3, h08, i08, lj4, za3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object v;

    public /* synthetic */ p5(sd sdVar, k28 k28, es8 es8, IOException iOException, boolean z) {
        this.a = 1;
        this.c = k28;
        this.o = es8;
        this.v = iOException;
        this.b = z;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                t5 a2 = t5.a(((a32) obj).a);
                a2.e = this.b;
                a2.i = (String) this.o;
                a2.k = (uk2) this.v;
                q5.T((Activity) this.c, a2);
                return;
            default:
                if0 if0 = (if0) obj;
                ((zc4) this.c).getClass();
                j05 j05 = (j05) this.o;
                n05 n05 = j05.a;
                ArrayList arrayList = n05.a;
                ListIterator listIterator = arrayList.listIterator();
                while (true) {
                    if (!listIterator.hasNext()) {
                        arrayList.add(0, if0);
                        n05.invalidate();
                    } else if (((g05) listIterator.next()) instanceof if0) {
                        listIterator.set(if0);
                        n05.invalidate();
                    }
                }
                j05.b();
                if (this.b) {
                    j05.a.post(new ktg(j05, (h05) this.v, if0, 27));
                    return;
                }
                return;
        }
    }

    public void b(pa3 pa3) {
        Bitmap createBitmap;
        Context context = (Context) ((z3a) this.c).b;
        int d = vzg.d(context);
        Uri uri = (Uri) this.v;
        Bitmap bitmap = new a(context, (Uri) this.o, uri, d, d, (BitmapLoadCallback) null).d().bitmapResult;
        if (bitmap != null) {
            pa3 pa32 = pa3;
            if (((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 131072) {
                hk6 hk6 = new hk6(new fk6("varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}"));
                fk6 fk6 = new fk6("   varying highp vec2 textureCoordinate;\n\n    uniform sampler2D inputImageTexture;\n\n    uniform highp vec2 singleStepOffset;\n    uniform highp vec4 params;\n    uniform highp float brightness;\n\n    const highp vec3 W = vec3(0.299, 0.587, 0.114);\n    const highp mat3 saturateMatrix = mat3(\n        1.1102, -0.0598, -0.061,\n        -0.0774, 1.0826, -0.1186,\n        -0.0228, -0.0228, 1.1772);\n    highp vec2 blurCoordinates[24];\n\n    highp float hardLight(highp float color) {\n    if (color <= 0.5)\n        color = color * color * 2.0;\n    else\n        color = 1.0 - ((1.0 - color)*(1.0 - color) * 2.0);\n    return color;\n}\n\n    void main(){\n    highp vec3 centralColor = texture2D(inputImageTexture, textureCoordinate).rgb;\n    blurCoordinates[0] = textureCoordinate.xy + singleStepOffset * vec2(0.0, -10.0);\n    blurCoordinates[1] = textureCoordinate.xy + singleStepOffset * vec2(0.0, 10.0);\n    blurCoordinates[2] = textureCoordinate.xy + singleStepOffset * vec2(-10.0, 0.0);\n    blurCoordinates[3] = textureCoordinate.xy + singleStepOffset * vec2(10.0, 0.0);\n    blurCoordinates[4] = textureCoordinate.xy + singleStepOffset * vec2(5.0, -8.0);\n    blurCoordinates[5] = textureCoordinate.xy + singleStepOffset * vec2(5.0, 8.0);\n    blurCoordinates[6] = textureCoordinate.xy + singleStepOffset * vec2(-5.0, 8.0);\n    blurCoordinates[7] = textureCoordinate.xy + singleStepOffset * vec2(-5.0, -8.0);\n    blurCoordinates[8] = textureCoordinate.xy + singleStepOffset * vec2(8.0, -5.0);\n    blurCoordinates[9] = textureCoordinate.xy + singleStepOffset * vec2(8.0, 5.0);\n    blurCoordinates[10] = textureCoordinate.xy + singleStepOffset * vec2(-8.0, 5.0);\n    blurCoordinates[11] = textureCoordinate.xy + singleStepOffset * vec2(-8.0, -5.0);\n    blurCoordinates[12] = textureCoordinate.xy + singleStepOffset * vec2(0.0, -6.0);\n    blurCoordinates[13] = textureCoordinate.xy + singleStepOffset * vec2(0.0, 6.0);\n    blurCoordinates[14] = textureCoordinate.xy + singleStepOffset * vec2(6.0, 0.0);\n    blurCoordinates[15] = textureCoordinate.xy + singleStepOffset * vec2(-6.0, 0.0);\n    blurCoordinates[16] = textureCoordinate.xy + singleStepOffset * vec2(-4.0, -4.0);\n    blurCoordinates[17] = textureCoordinate.xy + singleStepOffset * vec2(-4.0, 4.0);\n    blurCoordinates[18] = textureCoordinate.xy + singleStepOffset * vec2(4.0, -4.0);\n    blurCoordinates[19] = textureCoordinate.xy + singleStepOffset * vec2(4.0, 4.0);\n    blurCoordinates[20] = textureCoordinate.xy + singleStepOffset * vec2(-2.0, -2.0);\n    blurCoordinates[21] = textureCoordinate.xy + singleStepOffset * vec2(-2.0, 2.0);\n    blurCoordinates[22] = textureCoordinate.xy + singleStepOffset * vec2(2.0, -2.0);\n    blurCoordinates[23] = textureCoordinate.xy + singleStepOffset * vec2(2.0, 2.0);\n\n    highp float sampleColor = centralColor.g * 22.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[0]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[1]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[2]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[3]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[4]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[5]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[6]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[7]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[8]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[9]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[10]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[11]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[12]).g * 2.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[13]).g * 2.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[14]).g * 2.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[15]).g * 2.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[16]).g * 2.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[17]).g * 2.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[18]).g * 2.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[19]).g * 2.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[20]).g * 3.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[21]).g * 3.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[22]).g * 3.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[23]).g * 3.0;\n\n    sampleColor = sampleColor / 62.0;\n\n    highp float highPass = centralColor.g - sampleColor + 0.5;\n\n    for (int i = 0; i < 5; i++) {\n        highPass = hardLight(highPass);\n    }\n    highp float lumance = dot(centralColor, W);\n\n    highp float alpha = pow(lumance, params.r);\n\n    highp vec3 smoothColor = centralColor + (centralColor-vec3(highPass))*alpha*0.1;\n\n    smoothColor.r = clamp(pow(smoothColor.r, params.g), 0.0, 1.0);\n    smoothColor.g = clamp(pow(smoothColor.g, params.g), 0.0, 1.0);\n    smoothColor.b = clamp(pow(smoothColor.b, params.g), 0.0, 1.0);\n\n    highp vec3 lvse = vec3(1.0)-(vec3(1.0)-smoothColor)*(vec3(1.0)-centralColor);\n    highp vec3 bianliang = max(smoothColor, centralColor);\n    highp vec3 rouguang = 2.0*centralColor*smoothColor + centralColor*centralColor - 2.0*centralColor*centralColor*smoothColor;\n\n    gl_FragColor = vec4(mix(centralColor, lvse, alpha), 1.0);\n    gl_FragColor.rgb = mix(gl_FragColor.rgb, bianliang, alpha);\n    gl_FragColor.rgb = mix(gl_FragColor.rgb, rouguang, params.b);\n\n    highp vec3 satcolor = gl_FragColor.rgb * saturateMatrix;\n    gl_FragColor.rgb = mix(gl_FragColor.rgb, satcolor, params.a);\n    gl_FragColor.rgb = vec3(gl_FragColor.rgb + vec3(brightness));\n}");
                hk6.d(new vj6((Object) hk6, (Object) fk6, false, 6));
                hk6.d(new vr1(1, (Object) hk6, (Object) bitmap));
                hk6 hk62 = new hk6(fk6);
                hk62.w0 = false;
                hk62.x0 = false;
                hk62.v0 = 1;
                hk62.b();
                hk62.y0 = 2;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                EGL10 egl10 = (EGL10) EGLContext.getEGL();
                EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                egl10.eglInitialize(eglGetDisplay, new int[2]);
                int[] iArr = new int[1];
                EGL10 egl102 = egl10;
                EGLDisplay eGLDisplay = eglGetDisplay;
                int[] iArr2 = {12325, 0, 12326, 0, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
                int[] iArr3 = iArr;
                egl102.eglChooseConfig(eGLDisplay, iArr2, (EGLConfig[]) null, 0, iArr3);
                int i = iArr[0];
                EGLConfig[] eGLConfigArr = new EGLConfig[i];
                egl102.eglChooseConfig(eGLDisplay, iArr2, eGLConfigArr, i, iArr3);
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                EGLContext eglCreateContext = egl10.eglCreateContext(eglGetDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                EGLSurface eglCreatePbufferSurface = egl10.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, new int[]{12375, width, 12374, height, 12344});
                egl10.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
                GL10 gl10 = (GL10) eglCreateContext.getGL();
                String name = Thread.currentThread().getName();
                if (Thread.currentThread().getName().equals(name)) {
                    hk62.onSurfaceCreated(gl10, eGLConfig);
                    hk62.onSurfaceChanged(gl10, width, height);
                }
                hk62.d(new vr1(1, (Object) hk62, (Object) bitmap));
                if (!Thread.currentThread().getName().equals(name)) {
                    createBitmap = null;
                } else {
                    hk62.onDrawFrame(gl10);
                    hk62.onDrawFrame(gl10);
                    createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    GPUImageNativeLibrary.adjustBitmap(createBitmap);
                }
                fk6.h = false;
                GLES20.glDeleteProgram(fk6.d);
                hk62.d(new cf(27, hk62));
                hk62.onDrawFrame(gl10);
                hk62.onDrawFrame(gl10);
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, eGLContext);
                egl10.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
                egl10.eglDestroyContext(eglGetDisplay, eglCreateContext);
                egl10.eglTerminate(eglGetDisplay);
                hk6.d(new vj6((Object) hk6, (Object) fk6, false, 6));
                hk6.d(new vr1(1, (Object) hk6, (Object) bitmap));
                o5a.b0(uri.getPath(), createBitmap, 100);
                createBitmap.recycle();
                if (this.b) {
                    try {
                        q8.S(ld9.B().f(qa7.a(uri), (f0) null));
                    } catch (Throwable unused) {
                    }
                }
                if (!pa3.f()) {
                    pa3.b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("OpenGL ES 2.0 is not supported on this phone.");
        } else if (!pa3.f()) {
            IllegalStateException illegalStateException = new IllegalStateException("bitmap not decoded");
            if (!pa3.a(illegalStateException)) {
                n54.D(illegalStateException);
            }
        }
    }

    public void invoke(Object obj) {
        Object obj2 = this.o;
        Object obj3 = this.c;
        boolean z = this.b;
        Object obj4 = this.v;
        switch (this.a) {
            case 1:
                ((sb5) obj).getClass();
                StringBuilder sb = new StringBuilder("MediaLoadData{dataType=");
                es8 es8 = (es8) obj2;
                sb.append(es8.a);
                sb.append(", trackType=");
                sb.append(es8.b);
                sb.append(", trackFormat=");
                sb.append((ca6) es8.g);
                sb.append(", trackSelectionReason=");
                sb.append(es8.c);
                sb.append(", trackSelectionData=");
                sb.append(es8.d);
                sb.append(", mediaStartTimeMs=");
                sb.append(es8.e);
                sb.append(", mediaEndTimeMs=");
                String m = wj6.m(sb, es8.f, "}");
                StringBuilder sb2 = new StringBuilder("LoadEventInfo{loadTaskId");
                k28 k28 = (k28) obj3;
                sb2.append(k28.a);
                sb2.append(", dataSpec");
                sb2.append(k28.b);
                sb2.append(", uri");
                sb2.append(k28.c);
                sb2.append(", responseHeaders");
                sb2.append(k28.d);
                sb2.append(", elapsedRealtimeMs");
                sb2.append(k28.e);
                sb2.append(", loadDurationMs");
                sb2.append(k28.f);
                sb2.append(", bytesLoaded");
                IOException iOException = (IOException) obj4;
                z68.h("sb5", iOException, "onLoadError, wasCanceled %b, loadEventInfo = %s, mediaLoadData = %s", Boolean.valueOf(z), wj6.m(sb2, k28.g, "}"), m);
                return;
            default:
                ((ud) obj).R((td) obj3, (es8) obj2, (IOException) obj4, z);
                return;
        }
    }

    public k0d j(int i, spf spf, int[] iArr) {
        sj4 sj4 = (sj4) this.c;
        sj4.getClass();
        wi4 wi4 = new wi4(0, sj4);
        int i2 = ((int[]) this.v)[i];
        qb7 o2 = tb7.o();
        spf spf2 = spf;
        for (int i3 = 0; i3 < spf2.a; i3++) {
            o2.a(new yi4(i, spf, i3, (ej4) this.o, iArr[i3], this.b, wi4, i2));
        }
        return o2.j();
    }

    public /* synthetic */ p5(td tdVar, l28 l28, es8 es8, IOException iOException, boolean z) {
        this.a = 2;
        this.c = tdVar;
        this.o = es8;
        this.v = iOException;
        this.b = z;
    }

    public /* synthetic */ p5(sj4 sj4, ej4 ej4, boolean z, int[] iArr) {
        this.a = 3;
        this.c = sj4;
        this.o = ej4;
        this.b = z;
        this.v = iArr;
    }

    public /* synthetic */ p5(Activity activity, boolean z, uk2 uk2) {
        this.a = 0;
        this.c = activity;
        this.b = z;
        this.o = null;
        this.v = uk2;
    }

    public /* synthetic */ p5(Object obj, Object obj2, Parcelable parcelable, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.v = parcelable;
        this.b = z;
    }
}
