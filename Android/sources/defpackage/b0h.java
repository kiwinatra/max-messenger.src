package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.media3.common.ParserException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: b0h  reason: default package */
public abstract class b0h {
    public static final nfd a = new nfd(11);
    public static final byte[] b = {0, 0, 0, 1};
    public static final float[] c = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object d = new Object();
    public static int[] e = new int[10];
    public static final ekd f = new ekd(19);
    public static final /* synthetic */ int g = 0;

    public static int A(Context context) {
        int roundToInt = MathKt.roundToInt(((float) 81) * vo4.c().getDisplayMetrics().density);
        return RangesKt.coerceAtLeast((context.getResources().getDisplayMetrics().widthPixels - (MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density) * 2)) / (roundToInt + MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density)), 1);
    }

    public static Locale B() {
        return Resources.getSystem().getConfiguration().getLocales().get(0);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.u33 C(defpackage.yag r4) {
        /*
            ekd r0 = f
            monitor-enter(r0)
            java.lang.String r1 = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY"
            java.lang.AutoCloseable r1 = r4.h(r1)     // Catch:{ all -> 0x002f }
            u33 r1 = (defpackage.u33) r1     // Catch:{ all -> 0x002f }
            if (r1 != 0) goto L_0x0031
            bi4 r1 = defpackage.dq4.a     // Catch:{ NotImplementedError -> 0x0019, IllegalStateException -> 0x0016 }
            gc8 r1 = defpackage.lc8.a     // Catch:{ NotImplementedError -> 0x0019, IllegalStateException -> 0x0016 }
            gc8 r1 = r1.t0()     // Catch:{ NotImplementedError -> 0x0019, IllegalStateException -> 0x0016 }
            goto L_0x001b
        L_0x0016:
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE     // Catch:{ all -> 0x002f }
            goto L_0x001b
        L_0x0019:
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE     // Catch:{ all -> 0x002f }
        L_0x001b:
            u33 r2 = new u33     // Catch:{ all -> 0x002f }
            q2f r3 = defpackage.kr7.b()     // Catch:{ all -> 0x002f }
            kotlin.coroutines.CoroutineContext r1 = r1.plus(r3)     // Catch:{ all -> 0x002f }
            r2.<init>(r1)     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY"
            r4.f(r1, r2)     // Catch:{ all -> 0x002f }
            r1 = r2
            goto L_0x0031
        L_0x002f:
            r4 = move-exception
            goto L_0x0033
        L_0x0031:
            monitor-exit(r0)
            return r1
        L_0x0033:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b0h.C(yag):u33");
    }

    public static boolean D(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static boolean E(d9d d9d) {
        Boolean bool;
        try {
            bool = (Boolean) d9d.c(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException unused) {
            if (qn4.a.g(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", new Object[]{Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)});
            } else {
                String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", new Object[]{Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)});
            }
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static TypedArray F(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static float G(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return gz4.c(edgeEffect, f2, f3);
        }
        fz4.a(edgeEffect, f2, f3);
        return f2;
    }

    public static final void H(View view, Function3 function3) {
        Object obj;
        Object tag = view.getTag(jic.oneme_theme_attach_listener);
        if ((tag instanceof View.OnAttachStateChangeListener ? (View.OnAttachStateChangeListener) tag : null) != null) {
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.m23constructorimpl(view.getResources().getResourceName(view.getId()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m23constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m26exceptionOrNullimpl(obj) != null) {
                obj = view.getClass().getName();
            }
            z68.p("ViewThemeUtils", "try to observe onThemeChanged more than once for " + ((String) obj));
            return;
        }
        kcg kcg = new kcg(view, function3);
        view.setTag(jic.oneme_theme_attach_listener, kcg);
        if (view.isAttachedToWindow()) {
            kcg.onViewAttachedToWindow(view);
        }
        view.addOnAttachStateChangeListener(kcg);
    }

    public static x4a I(int i, byte[] bArr, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr;
        int i8;
        int i9;
        int i10;
        int i11;
        ky1 ky1 = new ky1(i + 2, i2, 4, bArr);
        int i12 = 4;
        ky1.t(4);
        int i13 = ky1.i(3);
        ky1.s();
        int i14 = ky1.i(2);
        boolean h = ky1.h();
        int i15 = ky1.i(5);
        int i16 = 0;
        for (int i17 = 0; i17 < 32; i17++) {
            if (ky1.h()) {
                i16 |= 1 << i17;
            }
        }
        int[] iArr2 = new int[6];
        for (int i18 = 0; i18 < 6; i18++) {
            iArr2[i18] = ky1.i(8);
        }
        int i19 = ky1.i(8);
        int i20 = 0;
        for (int i21 = 0; i21 < i13; i21++) {
            if (ky1.h()) {
                i20 += 89;
            }
            if (ky1.h()) {
                i20 += 8;
            }
        }
        ky1.t(i20);
        if (i13 > 0) {
            ky1.t((8 - i13) * 2);
        }
        ky1.m();
        int m = ky1.m();
        if (m == 3) {
            ky1.s();
        }
        int m2 = ky1.m();
        int m3 = ky1.m();
        if (ky1.h()) {
            int m4 = ky1.m();
            int m5 = ky1.m();
            int m6 = ky1.m();
            int m7 = ky1.m();
            m2 -= (m4 + m5) * ((m == 1 || m == 2) ? 2 : 1);
            m3 -= (m6 + m7) * (m == 1 ? 2 : 1);
        }
        int i22 = m3;
        int i23 = m2;
        int m8 = ky1.m();
        int m9 = ky1.m();
        int m10 = ky1.m();
        int i24 = -1;
        int i25 = -1;
        for (int i26 = ky1.h() ? 0 : i13; i26 <= i13; i26++) {
            ky1.m();
            i25 = Math.max(ky1.m(), i25);
            ky1.m();
        }
        ky1.m();
        ky1.m();
        ky1.m();
        ky1.m();
        ky1.m();
        ky1.m();
        if (ky1.h() && ky1.h()) {
            int i27 = 0;
            while (i27 < i12) {
                int i28 = 0;
                while (i28 < 6) {
                    if (!ky1.h()) {
                        ky1.m();
                    } else {
                        int min = Math.min(64, 1 << ((i27 << 1) + i12));
                        if (i27 > 1) {
                            ky1.n();
                        }
                        for (int i29 = 0; i29 < min; i29++) {
                            ky1.n();
                        }
                    }
                    i28 += i27 == 3 ? 3 : 1;
                    i12 = 4;
                }
                i27++;
                i12 = 4;
            }
        }
        ky1.t(2);
        if (ky1.h()) {
            ky1.t(8);
            ky1.m();
            ky1.m();
            ky1.s();
        }
        int m11 = ky1.m();
        int[] iArr3 = new int[0];
        int[] iArr4 = new int[0];
        int i30 = 0;
        int i31 = -1;
        int i32 = -1;
        while (i30 < m11) {
            if (i30 == 0 || !ky1.h()) {
                i10 = m11;
                i6 = i15;
                i7 = i16;
                iArr = iArr2;
                i8 = i19;
                i9 = i25;
                int m12 = ky1.m();
                int m13 = ky1.m();
                iArr3 = new int[m12];
                int i33 = 0;
                while (i33 < m12) {
                    iArr3[i33] = (i33 > 0 ? iArr3[i33 - 1] : 0) - (ky1.m() + 1);
                    ky1.s();
                    i33++;
                }
                iArr4 = new int[m13];
                int i34 = 0;
                while (i34 < m13) {
                    iArr4[i34] = ky1.m() + 1 + (i34 > 0 ? iArr4[i34 - 1] : 0);
                    ky1.s();
                    i34++;
                }
                int i35 = m13;
                i31 = m12;
                i11 = i35;
            } else {
                i10 = m11;
                int i36 = i31 + i32;
                int m14 = (1 - ((ky1.h() ? 1 : 0) * true)) * (ky1.m() + 1);
                i9 = i25;
                int i37 = i36 + 1;
                i8 = i19;
                boolean[] zArr = new boolean[i37];
                iArr = iArr2;
                for (int i38 = 0; i38 <= i36; i38++) {
                    if (!ky1.h()) {
                        zArr[i38] = ky1.h();
                    } else {
                        zArr[i38] = true;
                    }
                }
                int[] iArr5 = new int[i37];
                int[] iArr6 = new int[i37];
                int i39 = 0;
                for (int i40 = i32 - 1; i40 >= 0; i40--) {
                    int i41 = iArr4[i40] + m14;
                    if (i41 < 0 && zArr[i31 + i40]) {
                        iArr5[i39] = i41;
                        i39++;
                    }
                }
                if (m14 < 0 && zArr[i36]) {
                    iArr5[i39] = m14;
                    i39++;
                }
                i7 = i16;
                int i42 = i39;
                i6 = i15;
                for (int i43 = 0; i43 < i31; i43++) {
                    int i44 = iArr3[i43] + m14;
                    if (i44 < 0 && zArr[i43]) {
                        iArr5[i42] = i44;
                        i42++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr5, i42);
                int i45 = 0;
                for (int i46 = i31 - 1; i46 >= 0; i46--) {
                    int i47 = iArr3[i46] + m14;
                    if (i47 > 0 && zArr[i46]) {
                        iArr6[i45] = i47;
                        i45++;
                    }
                }
                if (m14 > 0 && zArr[i36]) {
                    iArr6[i45] = m14;
                    i45++;
                }
                i11 = i45;
                for (int i48 = 0; i48 < i32; i48++) {
                    int i49 = iArr4[i48] + m14;
                    if (i49 > 0 && zArr[i31 + i48]) {
                        iArr6[i11] = i49;
                        i11++;
                    }
                }
                iArr4 = Arrays.copyOf(iArr6, i11);
                iArr3 = copyOf;
                i31 = i42;
            }
            i30++;
            i32 = i11;
            m11 = i10;
            i25 = i9;
            i19 = i8;
            iArr2 = iArr;
            i16 = i7;
            i15 = i6;
        }
        int i50 = i15;
        int i51 = i16;
        int[] iArr7 = iArr2;
        int i52 = i19;
        int i53 = i25;
        if (ky1.h()) {
            int m15 = ky1.m();
            for (int i54 = 0; i54 < m15; i54++) {
                ky1.t(m10 + 5);
            }
        }
        int i55 = 2;
        ky1.t(2);
        float f2 = 1.0f;
        if (ky1.h()) {
            if (ky1.h()) {
                int i56 = ky1.i(8);
                if (i56 == 255) {
                    int i57 = ky1.i(16);
                    int i58 = ky1.i(16);
                    if (!(i57 == 0 || i58 == 0)) {
                        f2 = ((float) i57) / ((float) i58);
                    }
                } else if (i56 < 17) {
                    f2 = c[i56];
                } else {
                    i2a.m(i56, "Unexpected aspect_ratio_idc value: ");
                }
            }
            if (ky1.h()) {
                ky1.s();
            }
            if (ky1.h()) {
                ky1.t(3);
                if (ky1.h()) {
                    i55 = 1;
                }
                if (ky1.h()) {
                    int i59 = ky1.i(8);
                    int i60 = ky1.i(8);
                    ky1.t(8);
                    i24 = m53.h(i59);
                    i5 = m53.i(i60);
                } else {
                    i5 = -1;
                }
            } else {
                i55 = -1;
                i5 = -1;
            }
            if (ky1.h()) {
                ky1.m();
                ky1.m();
            }
            ky1.s();
            if (ky1.h()) {
                i22 *= 2;
            }
            i3 = i55;
            i4 = i22;
        } else {
            i4 = i22;
            i5 = -1;
            i3 = -1;
        }
        return new x4a(i14, h, i50, i51, m8, m9, iArr7, i52, i23, i4, f2, i53, i24, i3, i5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0185  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.b5a J(int r30, byte[] r31, int r32) {
        /*
            r0 = 1
            int r1 = r30 + 1
            ky1 r2 = new ky1
            r3 = 4
            r4 = r31
            r5 = r32
            r2.<init>((int) r1, (int) r5, (int) r3, (byte[]) r4)
            r1 = 8
            int r4 = r2.i(r1)
            int r5 = r2.i(r1)
            int r6 = r2.i(r1)
            int r7 = r2.m()
            r3 = 16
            r8 = 86
            r9 = 44
            r10 = 244(0xf4, float:3.42E-43)
            r11 = 122(0x7a, float:1.71E-43)
            r12 = 110(0x6e, float:1.54E-43)
            r13 = 100
            r14 = 3
            if (r4 == r13) goto L_0x0051
            if (r4 == r12) goto L_0x0051
            if (r4 == r11) goto L_0x0051
            if (r4 == r10) goto L_0x0051
            if (r4 == r9) goto L_0x0051
            r15 = 83
            if (r4 == r15) goto L_0x0051
            if (r4 == r8) goto L_0x0051
            r15 = 118(0x76, float:1.65E-43)
            if (r4 == r15) goto L_0x0051
            r15 = 128(0x80, float:1.794E-43)
            if (r4 == r15) goto L_0x0051
            r15 = 138(0x8a, float:1.93E-43)
            if (r4 != r15) goto L_0x004b
            goto L_0x0051
        L_0x004b:
            r15 = r0
            r11 = 0
            r12 = 0
            r13 = 0
            goto L_0x00b4
        L_0x0051:
            int r15 = r2.m()
            if (r15 != r14) goto L_0x005c
            boolean r16 = r2.h()
            goto L_0x005e
        L_0x005c:
            r16 = 0
        L_0x005e:
            int r17 = r2.m()
            int r18 = r2.m()
            r2.s()
            boolean r19 = r2.h()
            if (r19 == 0) goto L_0x00ae
            if (r15 == r14) goto L_0x0072
            goto L_0x0076
        L_0x0072:
            r19 = 12
            r1 = r19
        L_0x0076:
            r10 = 0
        L_0x0077:
            if (r10 >= r1) goto L_0x00ae
            boolean r19 = r2.h()
            if (r19 == 0) goto L_0x00a5
            r11 = 6
            if (r10 >= r11) goto L_0x0084
            r11 = r3
            goto L_0x0086
        L_0x0084:
            r11 = 64
        L_0x0086:
            r12 = 0
            r20 = 8
            r21 = 8
        L_0x008b:
            if (r12 >= r11) goto L_0x00a5
            if (r20 == 0) goto L_0x009b
            int r20 = r2.n()
            int r13 = r20 + r21
            int r13 = r13 + 256
            int r13 = r13 % 256
            r20 = r13
        L_0x009b:
            if (r20 != 0) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            r21 = r20
        L_0x00a0:
            int r12 = r12 + 1
            r13 = 100
            goto L_0x008b
        L_0x00a5:
            int r10 = r10 + 1
            r11 = 122(0x7a, float:1.71E-43)
            r12 = 110(0x6e, float:1.54E-43)
            r13 = 100
            goto L_0x0077
        L_0x00ae:
            r13 = r16
            r11 = r17
            r12 = r18
        L_0x00b4:
            int r1 = r2.m()
            int r1 = r1 + 4
            int r10 = r2.m()
            if (r10 != 0) goto L_0x00cf
            int r16 = r2.m()
            int r16 = r16 + 4
            r20 = r10
            r23 = r15
            r24 = r16
        L_0x00cc:
            r25 = 0
            goto L_0x00fc
        L_0x00cf:
            if (r10 != r0) goto L_0x00f5
            boolean r16 = r2.h()
            r2.n()
            r2.n()
            int r8 = r2.m()
            r20 = r10
            long r9 = (long) r8
            r23 = r15
            r8 = 0
        L_0x00e5:
            long r14 = (long) r8
            int r14 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r14 >= 0) goto L_0x00f0
            r2.m()
            int r8 = r8 + 1
            goto L_0x00e5
        L_0x00f0:
            r25 = r16
            r24 = 0
            goto L_0x00fc
        L_0x00f5:
            r20 = r10
            r23 = r15
            r24 = 0
            goto L_0x00cc
        L_0x00fc:
            r2.m()
            r2.s()
            int r8 = r2.m()
            int r8 = r8 + r0
            int r9 = r2.m()
            int r9 = r9 + r0
            boolean r14 = r2.h()
            int r10 = 2 - r14
            int r9 = r9 * r10
            if (r14 != 0) goto L_0x0118
            r2.s()
        L_0x0118:
            r2.s()
            int r8 = r8 * r3
            int r9 = r9 * r3
            boolean r15 = r2.h()
            r16 = 2
            if (r15 == 0) goto L_0x015c
            int r15 = r2.m()
            int r26 = r2.m()
            int r27 = r2.m()
            int r28 = r2.m()
            if (r23 != 0) goto L_0x013b
            r3 = r0
            r29 = r3
            goto L_0x014e
        L_0x013b:
            r0 = r23
            r3 = 3
            if (r0 != r3) goto L_0x0144
            r3 = 1
            r29 = 1
            goto L_0x0147
        L_0x0144:
            r29 = r16
            r3 = 1
        L_0x0147:
            if (r0 != r3) goto L_0x014c
            r0 = r16
            goto L_0x014d
        L_0x014c:
            r0 = r3
        L_0x014d:
            int r10 = r10 * r0
        L_0x014e:
            int r15 = r15 + r26
            int r15 = r15 * r29
            int r8 = r8 - r15
            int r27 = r27 + r28
            int r27 = r27 * r10
            int r9 = r9 - r27
        L_0x0159:
            r0 = 44
            goto L_0x015e
        L_0x015c:
            r3 = r0
            goto L_0x0159
        L_0x015e:
            if (r4 == r0) goto L_0x0174
            r0 = 86
            if (r4 == r0) goto L_0x0174
            r0 = 100
            if (r4 == r0) goto L_0x0174
            r0 = 110(0x6e, float:1.54E-43)
            if (r4 == r0) goto L_0x0174
            r0 = 122(0x7a, float:1.71E-43)
            if (r4 == r0) goto L_0x0174
            r0 = 244(0xf4, float:3.42E-43)
            if (r4 != r0) goto L_0x017a
        L_0x0174:
            r0 = r5 & 16
            if (r0 == 0) goto L_0x017a
            r15 = 0
            goto L_0x017c
        L_0x017a:
            r15 = 16
        L_0x017c:
            boolean r0 = r2.h()
            r10 = -1
            r17 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x025a
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x01b6
            r0 = 8
            int r3 = r2.i(r0)
            r0 = 255(0xff, float:3.57E-43)
            if (r3 != r0) goto L_0x01a8
            r0 = 16
            int r3 = r2.i(r0)
            int r0 = r2.i(r0)
            if (r3 == 0) goto L_0x01b6
            if (r0 == 0) goto L_0x01b6
            float r3 = (float) r3
            float r0 = (float) r0
            float r17 = r3 / r0
            goto L_0x01b6
        L_0x01a8:
            r0 = 17
            if (r3 >= r0) goto L_0x01b1
            float[] r0 = c
            r17 = r0[r3]
            goto L_0x01b6
        L_0x01b1:
            java.lang.String r0 = "Unexpected aspect_ratio_idc value: "
            defpackage.i2a.m(r3, r0)
        L_0x01b6:
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x01bf
            r2.s()
        L_0x01bf:
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x01f1
            r0 = 3
            r2.t(r0)
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x01d1
            r0 = 1
            goto L_0x01d3
        L_0x01d1:
            r0 = r16
        L_0x01d3:
            boolean r3 = r2.h()
            if (r3 == 0) goto L_0x01ef
            r3 = 8
            int r10 = r2.i(r3)
            int r16 = r2.i(r3)
            r2.t(r3)
            int r10 = defpackage.m53.h(r10)
            int r3 = defpackage.m53.i(r16)
            goto L_0x01f3
        L_0x01ef:
            r3 = r10
            goto L_0x01f3
        L_0x01f1:
            r0 = r10
            r3 = r0
        L_0x01f3:
            boolean r16 = r2.h()
            if (r16 == 0) goto L_0x01ff
            r2.m()
            r2.m()
        L_0x01ff:
            boolean r16 = r2.h()
            r30 = r0
            if (r16 == 0) goto L_0x020c
            r0 = 65
            r2.t(r0)
        L_0x020c:
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x0215
            M(r2)
        L_0x0215:
            boolean r16 = r2.h()
            if (r16 == 0) goto L_0x021e
            M(r2)
        L_0x021e:
            if (r0 != 0) goto L_0x0222
            if (r16 == 0) goto L_0x0225
        L_0x0222:
            r2.s()
        L_0x0225:
            r2.s()
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x024f
            r2.s()
            r2.m()
            r2.m()
            r2.m()
            r2.m()
            int r0 = r2.m()
            r2.m()
            r22 = r0
            r21 = r3
            r19 = r10
            r10 = r17
            r0 = r30
            goto L_0x0260
        L_0x024f:
            r0 = r30
            r21 = r3
            r19 = r10
        L_0x0255:
            r22 = r15
            r10 = r17
            goto L_0x0260
        L_0x025a:
            r0 = r10
            r19 = r0
            r21 = r19
            goto L_0x0255
        L_0x0260:
            b5a r2 = new b5a
            r3 = r2
            r16 = r20
            r15 = r1
            r17 = r24
            r18 = r25
            r20 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b0h.J(int, byte[], int):b5a");
    }

    public static final boolean K(View view, sw6 sw6) {
        Boolean bool;
        try {
            Result.Companion companion = Result.Companion;
            bool = Result.m23constructorimpl(Boolean.valueOf(view.performHapticFeedback(sw6.a())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            bool = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool2 = Boolean.FALSE;
        if (Result.m29isFailureimpl(bool)) {
            bool = bool2;
        }
        return ((Boolean) bool).booleanValue();
    }

    public static void L(Context context, x23 x23) {
        String str;
        qjd qjd = (qjd) x23;
        String q = qjd.q();
        z68.c("b0h", "setupLocale " + q, new Object[0]);
        if (cvg.A(q)) {
            Locale B = B();
            if (B == null) {
                B = Locale.ENGLISH;
            } else {
                qjd.l("user.systemLang", B.getLanguage());
            }
            ArrayList O = O();
            String language = B.getLanguage();
            String language2 = B.getLanguage();
            Locale locale = new Locale("be");
            Locale locale2 = new Locale("bg");
            if (language2.equals(locale.getLanguage()) || language2.equals(locale2.getLanguage())) {
                str = "ru";
            } else if (true ^ ((Boolean) new oha(new mha(jha.n(O), new n77(25), 1), new lc5(27, (Object) B)).f()).booleanValue()) {
                str = Locale.ENGLISH.getLanguage();
            } else {
                q = language;
                z68.c("b0h", "setupLocaleInitial: " + q, new Object[0]);
                qjd.l("user.lang", q);
            }
            q = str;
            z68.c("b0h", "setupLocaleInitial: " + q, new Object[0]);
            qjd.l("user.lang", q);
        }
        Locale locale3 = new Locale(q);
        Locale.setDefault(locale3);
        Configuration configuration = new Configuration();
        configuration.fontScale = c44.DEFAULT_ASPECT_RATIO;
        configuration.setLocale(locale3);
        configuration.setLayoutDirection(locale3);
        context.createConfigurationContext(configuration);
    }

    public static void M(ky1 ky1) {
        int m = ky1.m() + 1;
        ky1.t(8);
        for (int i = 0; i < m; i++) {
            ky1.m();
            ky1.m();
            ky1.s();
        }
        ky1.t(20);
    }

    public static void N(List list, msb msb, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (msb.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static ArrayList O() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Locale("ru"));
        arrayList.add(new Locale("en"));
        arrayList.add(new Locale("az"));
        arrayList.add(new Locale("de"));
        arrayList.add(new Locale("hy"));
        arrayList.add(new Locale("it"));
        arrayList.add(new Locale("es"));
        arrayList.add(new Locale("ka"));
        arrayList.add(new Locale("kk"));
        arrayList.add(new Locale("ky"));
        arrayList.add(new Locale("ro"));
        arrayList.add(new Locale("tg"));
        arrayList.add(new Locale("tr"));
        arrayList.add(new Locale("uk"));
        arrayList.add(new Locale("uz"));
        arrayList.add(new Locale("fa"));
        arrayList.add(new Locale("ar"));
        arrayList.add(new Locale("pt"));
        return arrayList;
    }

    public static int P(int i, byte[] bArr) {
        int i2;
        synchronized (d) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = e;
                    if (iArr.length <= i4) {
                        e = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    e[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = e[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    public static final void Q(fwf fwf) {
        fwf.c(oa4.class, new qid(15));
        fwf.c(dn4.class, new qid(16));
    }

    public static String R(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e2) {
                    String i3 = g63.i(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(i3), e2);
                    str2 = rae.p("<", i3, " threw ", e2.getClass().getName(), ">");
                }
            }
            objArr[i2] = str2;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i4 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i4)) == -1) {
                sb.append(str, i4, str.length());
            } else {
                sb.append(str, i4, indexOf);
                sb.append(objArr[i]);
                i4 = indexOf + 2;
                i++;
            }
        }
        sb.append(str, i4, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i5 = i + 1; i5 < objArr.length; i5++) {
                sb.append(", ");
                sb.append(objArr[i5]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static xzg S() {
        String str;
        Class<b0h> cls = b0h.class;
        ClassLoader classLoader = cls.getClassLoader();
        Class<xzg> cls2 = xzg.class;
        if (cls2.equals(cls2)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else if (!cls2.getPackage().equals(cls.getPackage())) {
            throw new IllegalArgumentException(cls2.getName());
        } else {
            str = cls2.getPackage().getName() + ".BlazeGenerated" + cls2.getSimpleName() + "Loader";
        }
        try {
            rae.w(Class.forName(str, true, classLoader).getConstructor((Class[]) null).newInstance((Object[]) null));
            throw null;
        } catch (NoSuchMethodException e2) {
            throw new IllegalStateException(e2);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        } catch (IllegalAccessException e4) {
            throw new IllegalStateException(e4);
        } catch (InvocationTargetException e5) {
            throw new IllegalStateException(e5);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(cls, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    rae.w(it.next());
                    throw null;
                } catch (ServiceConfigurationError e6) {
                    Logger.getLogger(wzg.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls2.getSimpleName()), e6);
                }
            }
            if (arrayList.size() == 1) {
                return (xzg) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (xzg) cls2.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (IllegalAccessException e8) {
                throw new IllegalStateException(e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException(e9);
            }
        }
    }

    public static ng3 a(ngf ngf, Bundle bundle, int i) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        return new ng3(ngf, bundle, (jgd) null);
    }

    public static void b(fma fma, jv7 jv7, Function1 function1) {
        wx3 wx3 = new wx3(true, function1);
        if (jv7 != null) {
            fma.a(jv7, wx3);
        } else {
            fma.b(wx3);
        }
    }

    public static final String c(long j) {
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long j2 = j - (3600000 * hours);
        long j3 = j2 / 60000;
        long j4 = (j2 - (60000 * j3)) / ((long) 1000);
        if (hours > 0) {
            return String.format(hours + ":%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j4)}, 2));
        }
        return String.format(j3 + ":%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4)}, 1));
    }

    public static final String d(long j) {
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long j2 = j - (3600000 * hours);
        long j3 = j2 / 60000;
        long j4 = (long) 1000;
        long j5 = (j2 - (60000 * j3)) / j4;
        long j6 = (j % j4) / ((long) 10);
        if (hours <= 0) {
            return String.format("%02d:%02d,%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j5), Long.valueOf(j6)}, 3));
        }
        return String.format(hours + ":%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j5), Long.valueOf(j6)}, 3));
    }

    public static String e(int i, int i2, String str) {
        if (i < 0) {
            return tf6.Y("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return tf6.Y("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(wj6.h(i2, "negative size: "));
    }

    public static void f(long j, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(tf6.Y(str, Long.valueOf(j)));
        }
    }

    public static void g(int i, int i2) {
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str = tf6.Y("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 >= 0) {
                str = tf6.Y("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                throw new IllegalArgumentException(wj6.h(i2, "negative size: "));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void i(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(e(i, i2, "index"));
        }
    }

    public static void j(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? e(i, i3, "start index") : (i2 < 0 || i2 > i3) ? e(i2, i3, "end index") : tf6.Y("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void k(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void l(j74 j74) {
        if (j74 != null) {
            try {
                j74.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void m(long j, g1g g1g, ypf[] ypfArr) {
        int i;
        while (true) {
            boolean z = true;
            if (g1g.c() > 1) {
                int i2 = 0;
                while (true) {
                    if (g1g.c() != 0) {
                        int v = g1g.v();
                        i2 += v;
                        if (v != 255) {
                            i = i2;
                            break;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                int i3 = 0;
                while (true) {
                    if (g1g.c() != 0) {
                        int v2 = g1g.v();
                        i3 += v2;
                        if (v2 != 255) {
                            break;
                        }
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                int i4 = g1g.b + i3;
                if (i3 == -1 || i3 > g1g.c()) {
                    i4 = g1g.c;
                } else if (i == 4 && i3 >= 8) {
                    int v3 = g1g.v();
                    int A = g1g.A();
                    int h = A == 49 ? g1g.h() : 0;
                    int v4 = g1g.v();
                    if (A == 47) {
                        g1g.I(1);
                    }
                    boolean z2 = v3 == 181 && (A == 49 || A == 47) && v4 == 3;
                    if (A == 49) {
                        if (h != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        n(j, g1g, ypfArr);
                    }
                }
                g1g.H(i4);
            } else {
                return;
            }
        }
    }

    public static void n(long j, g1g g1g, ypf[] ypfArr) {
        int v = g1g.v();
        if ((v & 64) != 0) {
            g1g.I(1);
            int i = (v & 31) * 3;
            int i2 = g1g.b;
            for (ypf ypf : ypfArr) {
                g1g.H(i2);
                ypf.c(i, g1g);
                if (j != -9223372036854775807L) {
                    ypf.b(j, 1, i, 0, (wpf) null);
                }
            }
        }
    }

    public static final h6d o(Context context, String str, Class cls) {
        if (true ^ (str == null || StringsKt.isBlank(str))) {
            return new h6d(context, str, cls);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
    }

    public static Bitmap p(byte[] bArr, int i, BitmapFactory.Options options) {
        int i2 = 0;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (decodeByteArray != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ab5 ab5 = new ab5((InputStream) byteArrayInputStream);
                byteArrayInputStream.close();
                switch (ab5.e(1, "Orientation")) {
                    case 3:
                    case 4:
                        i2 = 180;
                        break;
                    case 5:
                    case 8:
                        i2 = 270;
                        break;
                    case 6:
                    case 7:
                        i2 = 90;
                        break;
                }
                if (i2 == 0) {
                    return decodeByteArray;
                }
                Matrix matrix = new Matrix();
                matrix.postRotate((float) i2);
                return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw ParserException.a("Could not decode image data", new IllegalStateException());
        }
        throw th;
    }

    public static int q(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        boolean z = false;
        n79.n(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            k(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            k(zArr);
            return i - 2;
        } else if (i3 <= 2 || !zArr[2] || bArr[i] != 0 || bArr[i + 1] != 1) {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                byte b2 = bArr[i5];
                if ((b2 & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                        k(zArr);
                        return i6;
                    }
                    i5 -= 2;
                }
                i5 += 3;
            }
            zArr[0] = i3 <= 2 ? !(i3 != 2 ? !zArr[1] || bArr[i4] != 1 : !(zArr[2] && bArr[i2 + -2] == 0 && bArr[i4] == 1)) : bArr[i2 + -3] == 0 && bArr[i2 + -2] == 0 && bArr[i4] == 1;
            zArr[1] = i3 <= 1 ? !(!zArr[2] || bArr[i4] != 0) : bArr[i2 + -2] == 0 && bArr[i4] == 0;
            if (bArr[i4] == 0) {
                z = true;
            }
            zArr[2] = z;
            return i2;
        } else {
            k(zArr);
            return i - 1;
        }
    }

    public static ApiException r(Status status) {
        return status.c != null ? new ApiException(status) : new ApiException(status);
    }

    public static int s(int i, int i2, Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static int t(Context context) {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean z = displayMetrics.widthPixels < displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(z ? gec.mr_dialog_fixed_width_minor : gec.mr_dialog_fixed_width_major, typedValue, true);
        int i = typedValue.type;
        if (i == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else if (i != 6) {
            return -2;
        } else {
            int i2 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction((float) i2, (float) i2);
        }
        return (int) fraction;
    }

    public static float u(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? gz4.b(edgeEffect) : c44.DEFAULT_ASPECT_RATIO;
    }

    public static Object v(Iterable iterable, Object obj) {
        Iterator it = iterable.iterator();
        return it.hasNext() ? it.next() : obj;
    }

    public static Object w(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return a81.i(1, list);
            }
            throw new NoSuchElementException();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object x(ArrayList arrayList) {
        Object obj = null;
        if (arrayList instanceof Collection) {
            if (arrayList.isEmpty()) {
                return null;
            }
            if (arrayList instanceof List) {
                return a81.h(1, arrayList);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            do {
                obj = it.next();
            } while (it.hasNext());
        }
        return obj;
    }

    public static cs y(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        cs csVar;
        if (D(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new cs((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                csVar = cs.k(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception unused) {
                csVar = null;
            }
            if (csVar != null) {
                return csVar;
            }
        }
        return new cs((Shader) null, (ColorStateList) null, 0);
    }

    public static Object z(k0d k0d) {
        lx5 r = k0d.listIterator(0);
        Object next = r.next();
        if (!r.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && r.hasNext(); i++) {
            sb.append(", ");
            sb.append(r.next());
        }
        if (r.hasNext()) {
            sb.append(", ...");
        }
        sb.append(Typography.greater);
        throw new IllegalArgumentException(sb.toString());
    }
}
