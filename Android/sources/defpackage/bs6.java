package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* renamed from: bs6  reason: default package */
public final class bs6 implements kha {
    public int a;
    public boolean b;
    public Object c;
    public final Object o;
    public final Object v;
    public Object w;

    public bs6(Class cls, int i) {
        this.a = i;
        this.o = cls;
        this.v = new Rect();
        this.c = new ArrayList();
        this.w = new WeakReference((Object) null);
    }

    public static final void a(adg adg, View view, ViewTreeObserver viewTreeObserver) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(adg);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(adg);
        }
    }

    public static void b(int i, int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        boolean z = false;
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            z = true;
        }
        ld8.i(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: \n" + str, z);
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        ld8.h();
    }

    public Function0 c(zx3 zx3) {
        View view;
        View view2 = zx3.getView();
        zx3 targetController = zx3.getTargetController();
        View view3 = targetController != null ? targetController.getView() : null;
        if (view2 != null) {
            view = view2;
        } else if (view3 == null) {
            return new i2g(4);
        } else {
            view = view3;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        adg adg = new adg(this, view3, view);
        viewTreeObserver.addOnPreDrawListener(adg);
        zx3.addLifecycleListener(new ycg(this, viewTreeObserver, adg, view));
        if (!view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new xcg(view, viewTreeObserver, adg, view, 0));
        } else if (!view.isAttachedToWindow()) {
            a(adg, view, viewTreeObserver);
        } else {
            view.addOnAttachStateChangeListener(new xcg(view, viewTreeObserver, adg, view, 1));
        }
        return new zcg(adg, view, viewTreeObserver);
    }

    public void d(Executor executor, iha iha) {
        ane ane;
        synchronized (this.o) {
            j(iha);
            ane = new ane((AtomicReference) this.v, executor, iha);
            ((HashMap) this.c).put(iha, ane);
            ((CopyOnWriteArraySet) this.w).add(ane);
        }
        ane.a(0);
    }

    public zz7 e() {
        Object obj = ((AtomicReference) this.v).get();
        return obj instanceof fc0 ? new xa7(1, ((fc0) obj).a) : hd8.E(obj);
    }

    public void f() {
        for (zr6 zr6 : (zr6[]) this.o) {
            FloatBuffer floatBuffer = zr6.b;
            n79.k(floatBuffer, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(zr6.a, zr6.c, 5126, false, 0, floatBuffer);
            GLES20.glEnableVertexAttribArray(zr6.a);
            ld8.h();
        }
        for (as6 as6 : (as6[]) this.v) {
            boolean z = this.b;
            int[] iArr = as6.d;
            int i = as6.a;
            int i2 = as6.b;
            if (i2 != 5124) {
                float[] fArr = as6.c;
                if (i2 == 5126) {
                    GLES20.glUniform1fv(i, 1, fArr, 0);
                    ld8.h();
                } else if (i2 != 35678 && i2 != 35815 && i2 != 36198) {
                    switch (i2) {
                        case 35664:
                            GLES20.glUniform2fv(i, 1, fArr, 0);
                            ld8.h();
                            break;
                        case 35665:
                            GLES20.glUniform3fv(i, 1, fArr, 0);
                            ld8.h();
                            break;
                        case 35666:
                            GLES20.glUniform4fv(i, 1, fArr, 0);
                            ld8.h();
                            break;
                        case 35667:
                            GLES20.glUniform2iv(i, 1, iArr, 0);
                            ld8.h();
                            break;
                        case 35668:
                            GLES20.glUniform3iv(i, 1, iArr, 0);
                            ld8.h();
                            break;
                        case 35669:
                            GLES20.glUniform4iv(i, 1, iArr, 0);
                            ld8.h();
                            break;
                        default:
                            switch (i2) {
                                case 35675:
                                    GLES20.glUniformMatrix3fv(i, 1, false, fArr, 0);
                                    ld8.h();
                                    break;
                                case 35676:
                                    GLES20.glUniformMatrix4fv(i, 1, false, fArr, 0);
                                    ld8.h();
                                    break;
                                default:
                                    throw new IllegalStateException(wj6.h(i2, "Unexpected uniform type: "));
                            }
                    }
                } else if (as6.e != 0) {
                    GLES20.glActiveTexture(as6.f + 33984);
                    ld8.h();
                    ld8.d(i2 == 35678 ? 3553 : 36197, as6.e, (i2 != 35678 || z) ? 9728 : 9729);
                    GLES20.glUniform1i(i, as6.f);
                    ld8.h();
                } else {
                    throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                }
            } else {
                GLES20.glUniform1iv(i, 1, iArr, 0);
                ld8.h();
            }
        }
    }

    public int g() {
        int i;
        synchronized (this.o) {
            i = this.a;
            this.a = i + 1;
        }
        return i;
    }

    public void h() {
        ArrayList arrayList;
        synchronized (this.o) {
            try {
                this.b = true;
                arrayList = new ArrayList(((ts) this.v).values());
                ((ts) this.v).clear();
                if (((Runnable) this.c) != null) {
                    Handler handler = (Handler) this.w;
                    handler.getClass();
                    handler.post((Runnable) this.c);
                    this.c = null;
                    this.w = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((rsd) it.next()).n();
        }
    }

    public void i(iha iha) {
        synchronized (this.o) {
            j(iha);
        }
    }

    public void j(iha iha) {
        ane ane = (ane) ((HashMap) this.c).remove(iha);
        if (ane != null) {
            ane.c.set(false);
            ((CopyOnWriteArraySet) this.w).remove(ane);
        }
    }

    public void k() {
        synchronized (this.o) {
            try {
                Iterator it = new HashSet(((HashMap) this.c).keySet()).iterator();
                while (it.hasNext()) {
                    j((iha) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(float[] fArr) {
        zr6 zr6 = (zr6) ((HashMap) this.c).get("aFramePosition");
        zr6.getClass();
        zr6.b = (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
        zr6.c = 4;
    }

    public void m(String str, float f) {
        as6 as6 = (as6) ((HashMap) this.w).get(str);
        as6.getClass();
        as6.c[0] = f;
    }

    public void n(String str, float[] fArr) {
        as6 as6 = (as6) ((HashMap) this.w).get(str);
        as6.getClass();
        System.arraycopy(fArr, 0, as6.c, 0, fArr.length);
    }

    public void o(float[] fArr) {
        as6 as6 = (as6) ((HashMap) this.w).get("uRgbMatrix");
        if (as6 != null) {
            System.arraycopy(fArr, 0, as6.c, 0, fArr.length);
        }
    }

    public void p(int i, Object obj) {
        synchronized (this.o) {
            try {
                rsd rsd = (rsd) ((ts) this.v).remove(Integer.valueOf(i));
                if (rsd != null) {
                    if (rsd.z.getClass() == obj.getClass()) {
                        rsd.l(obj);
                    } else {
                        i8b.V("Type mismatch, expected " + rsd.z.getClass() + ", but was " + obj.getClass());
                    }
                }
                if (((Runnable) this.c) != null && ((ts) this.v).isEmpty()) {
                    h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q(int i, String str) {
        as6 as6 = (as6) ((HashMap) this.w).get(str);
        as6.getClass();
        as6.d[0] = i;
    }

    public void r(int i, int i2, String str) {
        as6 as6 = (as6) ((HashMap) this.w).get(str);
        as6.getClass();
        as6.e = i;
        as6.f = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r1.hasNext() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        ((defpackage.ane) r1.next()).a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        r1 = r3.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        if (r3.a != r4) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r3.b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        r4 = ((java.util.concurrent.CopyOnWriteArraySet) r3.w).iterator();
        r0 = r3.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        r1 = r4;
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.o
            monitor-enter(r0)
            java.lang.Object r1 = r3.v     // Catch:{ all -> 0x0013 }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x0013 }
            java.lang.Object r1 = r1.getAndSet(r4)     // Catch:{ all -> 0x0013 }
            boolean r4 = java.util.Objects.equals(r1, r4)     // Catch:{ all -> 0x0013 }
            if (r4 == 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return
        L_0x0013:
            r3 = move-exception
            goto L_0x005a
        L_0x0015:
            int r4 = r3.a     // Catch:{ all -> 0x0013 }
            r1 = 1
            int r4 = r4 + r1
            r3.a = r4     // Catch:{ all -> 0x0013 }
            boolean r2 = r3.b     // Catch:{ all -> 0x0013 }
            if (r2 == 0) goto L_0x0021
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return
        L_0x0021:
            r3.b = r1     // Catch:{ all -> 0x0013 }
            java.lang.Object r1 = r3.w     // Catch:{ all -> 0x0013 }
            java.util.concurrent.CopyOnWriteArraySet r1 = (java.util.concurrent.CopyOnWriteArraySet) r1     // Catch:{ all -> 0x0013 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
        L_0x002c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r1.next()
            ane r0 = (defpackage.ane) r0
            r0.a(r4)
            goto L_0x002c
        L_0x003c:
            java.lang.Object r1 = r3.o
            monitor-enter(r1)
            int r0 = r3.a     // Catch:{ all -> 0x0048 }
            if (r0 != r4) goto L_0x004a
            r4 = 0
            r3.b = r4     // Catch:{ all -> 0x0048 }
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            goto L_0x0058
        L_0x004a:
            java.lang.Object r4 = r3.w     // Catch:{ all -> 0x0048 }
            java.util.concurrent.CopyOnWriteArraySet r4 = (java.util.concurrent.CopyOnWriteArraySet) r4     // Catch:{ all -> 0x0048 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0048 }
            int r0 = r3.a     // Catch:{ all -> 0x0048 }
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            r1 = r4
            r4 = r0
            goto L_0x002c
        L_0x0058:
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            throw r3
        L_0x005a:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs6.s(java.lang.Object):void");
    }

    public void t() {
        GLES20.glUseProgram(this.a);
        ld8.h();
    }

    public bs6() {
        this.o = new Object();
        this.v = new qae();
    }

    public bs6(Context context, String str, String str2) {
        byte[] bArr;
        byte[] bArr2;
        String Q = v0g.Q(context, str);
        String Q2 = v0g.Q(context, str2);
        int glCreateProgram = GLES20.glCreateProgram();
        this.a = glCreateProgram;
        ld8.h();
        b(glCreateProgram, 35633, Q);
        b(glCreateProgram, 35632, Q2);
        GLES20.glLinkProgram(glCreateProgram);
        int i = 0;
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        int i2 = 1;
        ld8.i("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(glCreateProgram);
        this.c = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.o = new zr6[iArr2[0]];
        int i3 = 0;
        while (i3 < iArr2[0]) {
            int i4 = this.a;
            int[] iArr3 = new int[i2];
            GLES20.glGetProgramiv(i4, 35722, iArr3, 0);
            int i5 = iArr3[0];
            int[] iArr4 = new int[i2];
            int[] iArr5 = new int[i2];
            int[] iArr6 = new int[i2];
            byte[] bArr3 = new byte[i5];
            int i6 = i5;
            int i7 = i4;
            GLES20.glGetActiveAttrib(i4, i3, i5, iArr4, 0, iArr5, 0, iArr6, 0, bArr3, 0);
            int i8 = 0;
            while (true) {
                if (i8 >= i6) {
                    bArr2 = bArr3;
                    i8 = i6;
                    break;
                }
                bArr2 = bArr3;
                if (bArr2[i8] == 0) {
                    break;
                }
                i8++;
                bArr3 = bArr2;
            }
            String str3 = new String(bArr2, 0, i8);
            zr6 zr6 = new zr6(str3, GLES20.glGetAttribLocation(i7, str3));
            ((zr6[]) this.o)[i3] = zr6;
            ((HashMap) this.c).put(str3, zr6);
            i3++;
            i2 = 1;
        }
        this.w = new HashMap();
        int[] iArr7 = new int[1];
        GLES20.glGetProgramiv(this.a, 35718, iArr7, 0);
        this.v = new as6[iArr7[0]];
        for (int i9 = 0; i9 < iArr7[i]; i9++) {
            int i10 = this.a;
            int[] iArr8 = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr8, i);
            int[] iArr9 = new int[1];
            int i11 = iArr8[i];
            byte[] bArr4 = new byte[i11];
            int i12 = i11;
            int[] iArr10 = iArr9;
            GLES20.glGetActiveUniform(i10, i9, i11, new int[1], 0, new int[1], 0, iArr9, 0, bArr4, 0);
            int i13 = 0;
            while (true) {
                if (i13 >= i12) {
                    bArr = bArr4;
                    i13 = i12;
                    break;
                }
                bArr = bArr4;
                if (bArr[i13] == 0) {
                    break;
                }
                i13++;
                bArr4 = bArr;
            }
            i = 0;
            String str4 = new String(bArr, 0, i13);
            as6 as6 = new as6(str4, GLES20.glGetUniformLocation(i10, str4), iArr10[0]);
            ((as6[]) this.v)[i9] = as6;
            ((HashMap) this.w).put(str4, as6);
        }
        ld8.h();
    }

    public bs6(Object obj) {
        this.o = new Object();
        this.a = 0;
        this.b = false;
        this.c = new HashMap();
        this.w = new CopyOnWriteArraySet();
        this.v = new AtomicReference(obj);
    }
}
