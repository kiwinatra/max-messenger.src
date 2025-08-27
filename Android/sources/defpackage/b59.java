package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Path;
import android.graphics.Rect;
import android.media.ImageReader;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.lifecycle.SavedStateHandlesVM;
import androidx.media3.common.ParserException;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmClassMappingKt;
import org.apache.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.messages.views.fragments.base.FrgBaseNonUi;

/* renamed from: b59  reason: default package */
public abstract class b59 implements tde {
    public static final long[] a = {WorkRequest.MIN_BACKOFF_MILLIS, 15000};
    public static final u47 b = new u47(HttpStatus.SC_NOT_FOUND, "SC_NOT_FOUND");
    public static final u47 c = new u47(HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE, "SC_REQUESTED_RANGE_NOT_SATISFIABLE");
    public static final u47 d = new u47(500, "SC_INTERNAL_SERVER_ERROR");
    public static final u47 e = new u47(HttpStatus.SC_BAD_REQUEST, "SC_BAD_REQUEST");
    public static final u47 f = new u47(HttpStatus.SC_PRECONDITION_FAILED, "SC_PRECONDITION_FAILED");
    public static final u47 g = new u47(HttpStatus.SC_FORBIDDEN, "SC_FORBIDDEN");
    public static final u47 h = new u47(HttpStatus.SC_CONFLICT, "SC_CONFLICT");
    public static final u47 i = new u47(HttpStatus.SC_REQUEST_TOO_LONG, "SC_REQUEST_ENTITY_TOO_LARGE");
    public static final u47 j = new u47(HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, "SC_UNSUPPORTED_MEDIA_TYPE");
    public static final u47 k = new u47(HttpStatus.SC_NOT_ACCEPTABLE, "SC_NOT_ACCEPTABLE");
    public static final u47 l = new u47(-1, "UNKNOWN_ERROR");
    public static final u47 m = new u47(-100, "FILE_NOT_FOUND");
    public static final u47 n = new u47(-101, "FILE_ZERO_LENGTH");
    public static final s9a o = new s9a(18, (byte) 0);
    public static final t9a p = new t9a(18);
    public static final p9a q = new p9a(18);
    public static Boolean r;
    public static Boolean s;
    public static Boolean t;
    public static Boolean u;
    public static final /* synthetic */ int v = 0;

    public static u47 A(int i2, String str) {
        u47 u47 = i2 != 400 ? i2 != 406 ? i2 != 409 ? i2 != 500 ? i2 != 403 ? i2 != 404 ? i2 != 412 ? i2 != 413 ? i2 != 415 ? i2 != 416 ? new u47(i2, (String) null) : c : j : i : f : b : g : d : h : k : e;
        return str == null ? u47 : new u47(u47.a, u47.b, str);
    }

    public static List B(x23 x23) {
        String string = ((qjd) x23).g.getString("app.currentProxyList", (String) null);
        if (cvg.A(string)) {
            return Collections.emptyList();
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    ph3 a2 = ph3.a((JSONObject) jSONArray.get(i2));
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                } catch (JSONException e2) {
                    z68.f("b59", "parse proxy from string exception " + e2.getMessage(), (Throwable) null);
                }
            }
            return arrayList;
        } catch (JSONException e3) {
            z68.f("b59", "parse from string exception " + e3.getMessage(), (Throwable) null);
            return Collections.emptyList();
        }
    }

    public static final boolean C() {
        if (Build.VERSION.SDK_INT > 32) {
            Lazy lazy = j2g.a;
            return ((Boolean) j2g.a.getValue()).booleanValue();
        }
    }

    public static final SavedStateHandlesVM F(hbg hbg) {
        return (SavedStateHandlesVM) new o5h(hbg.getViewModelStore(), new k41(1), hbg instanceof tw6 ? ((tw6) hbg).getDefaultViewModelCreationExtras() : w34.b).x(JvmClassMappingKt.getKotlinClass(SavedStateHandlesVM.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static boolean J(u47 u47) {
        return i.equals(u47) || j.equals(u47) || k.equals(u47) || d.equals(u47) || m.equals(u47) || n.equals(u47);
    }

    public static boolean K(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (r == null) {
            r = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        r.booleanValue();
        if (s == null) {
            s = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return s.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    public static void L(lab[] labArr, Path path) {
        int i2;
        int i3;
        int i4;
        char c2;
        int i5;
        lab lab;
        int i6;
        char c3;
        int i7;
        int i8;
        lab lab2;
        float f2;
        float f3;
        int i9;
        char c4;
        int i10;
        int i11;
        float f4;
        float f5;
        int i12;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        lab[] labArr2 = labArr;
        Path path2 = path;
        int i13 = 6;
        float[] fArr = new float[6];
        int length = labArr2.length;
        int i14 = 0;
        char c5 = 'm';
        while (i14 < length) {
            lab lab3 = labArr2[i14];
            char c6 = lab3.a;
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr[2];
            float f19 = fArr[3];
            float f20 = fArr[4];
            float f21 = fArr[5];
            switch (c6) {
                case 'A':
                case 'a':
                    i2 = 7;
                    break;
                case 'C':
                case 'c':
                    i2 = i13;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path2.moveTo(f20, f21);
                    f16 = f20;
                    f18 = f16;
                    f17 = f21;
                    f19 = f17;
                    break;
            }
            i2 = 2;
            float f22 = f20;
            float f23 = f21;
            float f24 = f16;
            float f25 = f17;
            int i15 = 0;
            while (true) {
                float[] fArr2 = lab3.b;
                if (i15 < fArr2.length) {
                    if (c6 != 'A') {
                        if (c6 != 'C') {
                            if (c6 == 'H') {
                                float[] fArr3 = fArr2;
                                i3 = i15;
                                c2 = c6;
                                i4 = i14;
                                i5 = length;
                                lab = lab3;
                                path2.lineTo(fArr3[i3], f25);
                                f24 = fArr3[i3];
                            } else if (c6 == 'Q') {
                                float[] fArr4 = fArr2;
                                i9 = i15;
                                c4 = c6;
                                i10 = i14;
                                i11 = length;
                                lab = lab3;
                                int i16 = i9 + 1;
                                int i17 = i9 + 2;
                                int i18 = i9 + 3;
                                path2.quadTo(fArr4[i9], fArr4[i16], fArr4[i17], fArr4[i18]);
                                f4 = fArr4[i9];
                                f5 = fArr4[i16];
                                f24 = fArr4[i17];
                                f25 = fArr4[i18];
                            } else if (c6 == 'V') {
                                float[] fArr5 = fArr2;
                                i3 = i15;
                                c2 = c6;
                                i4 = i14;
                                i5 = length;
                                lab = lab3;
                                path2.lineTo(f24, fArr5[i3]);
                                f25 = fArr5[i3];
                            } else if (c6 != 'a') {
                                if (c6 != 'c') {
                                    if (c6 == 'h') {
                                        float[] fArr6 = fArr2;
                                        i3 = i15;
                                        float f26 = f25;
                                        path2.rLineTo(fArr6[i3], c44.DEFAULT_ASPECT_RATIO);
                                        f24 += fArr6[i3];
                                    } else if (c6 == 'q') {
                                        float[] fArr7 = fArr2;
                                        i3 = i15;
                                        float f27 = f25;
                                        float f28 = f24;
                                        int i19 = i3 + 1;
                                        int i20 = i3 + 2;
                                        int i21 = i3 + 3;
                                        path2.rQuadTo(fArr7[i3], fArr7[i19], fArr7[i20], fArr7[i21]);
                                        float f29 = f28 + fArr7[i3];
                                        float f30 = f28 + fArr7[i20];
                                        f25 = f27 + fArr7[i21];
                                        f19 = fArr7[i19] + f27;
                                        f18 = f29;
                                        c2 = c6;
                                        i4 = i14;
                                        i5 = length;
                                        f24 = f30;
                                    } else if (c6 == 'v') {
                                        float[] fArr8 = fArr2;
                                        i3 = i15;
                                        float f31 = f24;
                                        path2.rLineTo(c44.DEFAULT_ASPECT_RATIO, fArr8[i3]);
                                        f25 += fArr8[i3];
                                    } else if (c6 != 'L') {
                                        if (c6 == 'M') {
                                            float[] fArr9 = fArr2;
                                            i3 = i15;
                                            f24 = fArr9[i3];
                                            f25 = fArr9[i3 + 1];
                                            if (i3 > 0) {
                                                path2.lineTo(f24, f25);
                                            } else {
                                                path2.moveTo(f24, f25);
                                            }
                                        } else if (c6 != 'S') {
                                            if (c6 == 'T') {
                                                float[] fArr10 = fArr2;
                                                i12 = i15;
                                                float f32 = f25;
                                                float f33 = f24;
                                                if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                    f6 = (f33 * 2.0f) - f18;
                                                    f7 = (f32 * 2.0f) - f19;
                                                } else {
                                                    f6 = f33;
                                                    f7 = f32;
                                                }
                                                int i22 = i12 + 1;
                                                path2.quadTo(f6, f7, fArr10[i12], fArr10[i22]);
                                                f8 = fArr10[i12];
                                                f9 = fArr10[i22];
                                            } else if (c6 == 'l') {
                                                float[] fArr11 = fArr2;
                                                i3 = i15;
                                                int i23 = i3 + 1;
                                                path2.rLineTo(fArr11[i3], fArr11[i23]);
                                                f24 += fArr11[i3];
                                                f25 += fArr11[i23];
                                            } else if (c6 == 'm') {
                                                float[] fArr12 = fArr2;
                                                i3 = i15;
                                                float f34 = fArr12[i3];
                                                f24 += f34;
                                                float f35 = fArr12[i3 + 1];
                                                f25 += f35;
                                                if (i3 > 0) {
                                                    path2.rLineTo(f34, f35);
                                                } else {
                                                    path2.rMoveTo(f34, f35);
                                                }
                                            } else if (c6 == 's') {
                                                if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                    float f36 = f24 - f18;
                                                    f13 = f25 - f19;
                                                    f12 = f36;
                                                } else {
                                                    f13 = c44.DEFAULT_ASPECT_RATIO;
                                                    f12 = c44.DEFAULT_ASPECT_RATIO;
                                                }
                                                int i24 = i15 + 1;
                                                int i25 = i15 + 2;
                                                int i26 = i15 + 3;
                                                float[] fArr13 = fArr2;
                                                i12 = i15;
                                                float f37 = f25;
                                                float f38 = f24;
                                                path.rCubicTo(f12, f13, fArr2[i15], fArr2[i24], fArr2[i25], fArr2[i26]);
                                                f6 = f38 + fArr13[i12];
                                                f7 = f37 + fArr13[i24];
                                                f8 = f38 + fArr13[i25];
                                                f9 = fArr13[i26] + f37;
                                            } else if (c6 != 't') {
                                                i3 = i15;
                                            } else {
                                                if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                    f14 = f24 - f18;
                                                    f15 = f25 - f19;
                                                } else {
                                                    f15 = 0;
                                                    f14 = 0;
                                                }
                                                int i27 = i15 + 1;
                                                path2.rQuadTo(f14, f15, fArr2[i15], fArr2[i27]);
                                                float f39 = f14 + f24;
                                                float f40 = f15 + f25;
                                                f24 += fArr2[i15];
                                                f25 += fArr2[i27];
                                                f19 = f40;
                                                i3 = i15;
                                                c2 = c6;
                                                i4 = i14;
                                                i5 = length;
                                                f18 = f39;
                                            }
                                            f19 = f7;
                                            f18 = f6;
                                            c2 = c6;
                                            i4 = i14;
                                            i5 = length;
                                            f24 = f8;
                                            f25 = f9;
                                        } else {
                                            float[] fArr14 = fArr2;
                                            i3 = i15;
                                            float f41 = f25;
                                            float f42 = f24;
                                            if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                f10 = (f41 * 2.0f) - f19;
                                                f11 = (f42 * 2.0f) - f18;
                                            } else {
                                                f11 = f42;
                                                f10 = f41;
                                            }
                                            int i28 = i3 + 1;
                                            int i29 = i3 + 2;
                                            int i30 = i3 + 3;
                                            path.cubicTo(f11, f10, fArr14[i3], fArr14[i28], fArr14[i29], fArr14[i30]);
                                            float f43 = fArr14[i3];
                                            float f44 = fArr14[i28];
                                            f24 = fArr14[i29];
                                            f25 = fArr14[i30];
                                            f19 = f44;
                                            f18 = f43;
                                        }
                                        f23 = f25;
                                        f22 = f24;
                                    } else {
                                        float[] fArr15 = fArr2;
                                        i3 = i15;
                                        int i31 = i3 + 1;
                                        path2.lineTo(fArr15[i3], fArr15[i31]);
                                        f24 = fArr15[i3];
                                        f25 = fArr15[i31];
                                    }
                                    c2 = c6;
                                    i4 = i14;
                                    i5 = length;
                                } else {
                                    float[] fArr16 = fArr2;
                                    i12 = i15;
                                    float f45 = f25;
                                    float f46 = f24;
                                    int i32 = i12 + 2;
                                    int i33 = i12 + 3;
                                    int i34 = i12 + 4;
                                    int i35 = i12 + 5;
                                    path.rCubicTo(fArr16[i12], fArr16[i12 + 1], fArr16[i32], fArr16[i33], fArr16[i34], fArr16[i35]);
                                    f6 = f46 + fArr16[i32];
                                    f7 = f45 + fArr16[i33];
                                    f8 = f46 + fArr16[i34];
                                    f9 = fArr16[i35] + f45;
                                    f19 = f7;
                                    f18 = f6;
                                    c2 = c6;
                                    i4 = i14;
                                    i5 = length;
                                    f24 = f8;
                                    f25 = f9;
                                }
                                lab = lab3;
                            } else {
                                float[] fArr17 = fArr2;
                                i6 = i15;
                                float f47 = f25;
                                float f48 = f24;
                                int i36 = i6 + 5;
                                int i37 = i6 + 6;
                                c3 = c6;
                                i8 = length;
                                lab2 = lab3;
                                i7 = i14;
                                lab.a(path, f48, f47, fArr17[i36] + f48, fArr17[i37] + f47, fArr17[i6], fArr17[i6 + 1], fArr17[i6 + 2], fArr17[i6 + 3] != c44.DEFAULT_ASPECT_RATIO, fArr17[i6 + 4] != c44.DEFAULT_ASPECT_RATIO);
                                f2 = f48 + fArr17[i36];
                                f3 = f47 + fArr17[i37];
                            }
                            i15 = i3 + i2;
                            lab[] labArr3 = labArr;
                            lab3 = lab;
                            length = i5;
                            c5 = c2;
                            c6 = c5;
                            i14 = i4;
                        } else {
                            float[] fArr18 = fArr2;
                            i9 = i15;
                            c4 = c6;
                            i10 = i14;
                            i11 = length;
                            lab = lab3;
                            int i38 = i9 + 2;
                            int i39 = i9 + 3;
                            int i40 = i9 + 4;
                            int i41 = i9 + 5;
                            path.cubicTo(fArr18[i9], fArr18[i9 + 1], fArr18[i38], fArr18[i39], fArr18[i40], fArr18[i41]);
                            f24 = fArr18[i40];
                            f25 = fArr18[i41];
                            f4 = fArr18[i38];
                            f5 = fArr18[i39];
                        }
                        f18 = f4;
                        f19 = f5;
                        i15 = i3 + i2;
                        lab[] labArr32 = labArr;
                        lab3 = lab;
                        length = i5;
                        c5 = c2;
                        c6 = c5;
                        i14 = i4;
                    } else {
                        float[] fArr19 = fArr2;
                        i6 = i15;
                        c3 = c6;
                        i7 = i14;
                        i8 = length;
                        lab2 = lab3;
                        int i42 = i6 + 5;
                        int i43 = i6 + 6;
                        lab.a(path, f24, f25, fArr19[i42], fArr19[i43], fArr19[i6], fArr19[i6 + 1], fArr19[i6 + 2], fArr19[i6 + 3] != c44.DEFAULT_ASPECT_RATIO, fArr19[i6 + 4] != c44.DEFAULT_ASPECT_RATIO);
                        f2 = fArr19[i42];
                        f3 = fArr19[i43];
                    }
                    f19 = f25;
                    f18 = f24;
                    i15 = i3 + i2;
                    lab[] labArr322 = labArr;
                    lab3 = lab;
                    length = i5;
                    c5 = c2;
                    c6 = c5;
                    i14 = i4;
                } else {
                    fArr[0] = f24;
                    fArr[1] = f25;
                    fArr[2] = f18;
                    fArr[3] = f19;
                    fArr[4] = f22;
                    fArr[5] = f23;
                    c5 = lab3.a;
                    i14++;
                    labArr2 = labArr;
                    length = length;
                    i13 = 6;
                }
            }
        }
    }

    public static final CharSequence R(Context context) {
        ClipData.Item itemAt;
        ClipData primaryClip = ((ClipboardManager) context.getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null) {
            return null;
        }
        return itemAt.getText();
    }

    public static int S(ky1 ky1, int i2, int i3, int i4) {
        n79.g(Math.max(Math.max(i2, i3), i4) <= 31);
        int i5 = (1 << i2) - 1;
        int i6 = (1 << i3) - 1;
        f6e.h(f6e.h(i5, i6), 1 << i4);
        if (ky1.b() < i2) {
            return -1;
        }
        int i7 = ky1.i(i2);
        if (i7 != i5) {
            return i7;
        }
        if (ky1.b() < i3) {
            return -1;
        }
        int i8 = ky1.i(i3);
        int i9 = i7 + i8;
        if (i8 != i6) {
            return i9;
        }
        if (ky1.b() < i4) {
            return -1;
        }
        return i9 + ky1.i(i4);
    }

    public static TypedValue T(int i2, Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean U(int i2, Context context, boolean z) {
        TypedValue T = T(i2, context);
        return (T == null || T.type != 18) ? z : T.data != 0;
    }

    public static TypedValue V(int i2, Context context, String str) {
        TypedValue T = T(i2, context);
        if (T != null) {
            return T;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i2)}));
    }

    public static void Z(ky1 ky1) {
        ky1.t(3);
        ky1.t(8);
        boolean h2 = ky1.h();
        boolean h3 = ky1.h();
        if (h2) {
            ky1.t(5);
        }
        if (h3) {
            ky1.t(6);
        }
    }

    public static void a0(ky1 ky1) {
        int i2;
        int i3 = ky1.i(2);
        int i4 = 6;
        if (i3 == 0) {
            ky1.t(6);
            return;
        }
        int i5 = 5;
        int S = S(ky1, 5, 8, 16) + 1;
        if (i3 == 1) {
            ky1.t(S * 7);
        } else if (i3 == 2) {
            boolean h2 = ky1.h();
            int i6 = h2 ? 1 : 5;
            if (h2) {
                i5 = 7;
            }
            if (h2) {
                i4 = 8;
            }
            int i7 = 0;
            while (i7 < S) {
                if (ky1.h()) {
                    ky1.t(7);
                    i2 = 0;
                } else {
                    if (ky1.i(2) == 3 && ky1.i(i5) * i6 != 0) {
                        ky1.s();
                    }
                    i2 = ky1.i(i4) * i6;
                    if (!(i2 == 0 || i2 == 180)) {
                        ky1.s();
                    }
                    ky1.s();
                }
                if (!(i2 == 0 || i2 == 180 || !ky1.h())) {
                    i7++;
                }
                i7++;
            }
        }
    }

    public static void c(ed6 ed6, int i2, a aVar, String str) {
        ed6.getClass();
        xe0 xe0 = new xe0(ed6);
        xe0.h(i2, aVar, str, 1);
        xe0.e(false);
    }

    public static i8f c0(voa voa, k2b k2b) {
        int ordinal = voa.ordinal();
        if (ordinal == 0) {
            int i2 = k2b.getIcon().f;
            int i3 = k2b.getText().e;
            k2b.c().a.getClass();
            return new i8f(i2, i3, -16745729, true);
        } else if (ordinal == 1) {
            return new i8f(k2b.getIcon().i, k2b.getText().f, k2b.c().a.g, true);
        } else {
            if (ordinal == 2) {
                return new i8f(k2b.b().b.f, k2b.b().c.h, k2b.b().c.h, false);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static void d(c cVar, FrgBaseNonUi frgBaseNonUi, String str) {
        cVar.getClass();
        xe0 xe0 = new xe0(cVar);
        xe0.h(0, frgBaseNonUi, str, 1);
        xe0.e(false);
    }

    public static final Set d0(String str) {
        if (str.length() == 0) {
            return null;
        }
        int i2 = 0;
        int l2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, ",", 0, false, 4, (Object) null);
        if (l2 == -1) {
            return SetsKt.setOf(str);
        }
        ws wsVar = new ws(10);
        do {
            wsVar.add(str.substring(i2, l2));
            i2 = l2 + 1;
            l2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, ",", i2, false, 4, (Object) null);
        } while (l2 != -1);
        wsVar.add(str.substring(i2, str.length()));
        return wsVar;
    }

    public static void e(Set set, x23 x23) {
        List<v14> list;
        List list2;
        List list3;
        List list4;
        String string = ((qjd) x23).g.getString("app.pushProxyList", (String) null);
        if (cvg.A(string)) {
            z68.c("b59", "getProxiesFromPushString: empty string", new Object[0]);
            list = Collections.emptyList();
        } else {
            String[] split = string.split("\\s*;\\s*");
            ArrayList arrayList = new ArrayList(split.length);
            int length = split.length;
            int i2 = 0;
            int i3 = 0;
            while (i3 < length) {
                String[] split2 = split[i3].split("\\s*>\\s*");
                if (split2.length != 2) {
                    z68.f("b59", "getProxiesFromPushString: failed to parse, no country from proxies delimiter", (Throwable) null);
                } else {
                    String str = split2[i2];
                    if (cvg.A(str)) {
                        z68.c("b59", "getCountriesFromString: empty string", new Object[0]);
                        list3 = Collections.emptyList();
                    } else {
                        list3 = Arrays.asList(str.split("\\s*,\\s*"));
                    }
                    String str2 = split2[1];
                    if (cvg.A(str2)) {
                        z68.c("b59", "getProxiesFromString: empty string", new Object[0]);
                        list4 = Collections.emptyList();
                    } else {
                        String[] split3 = str2.replace("\"", "").split("\\s*,\\s*");
                        if (split3.length == 0) {
                            z68.n("b59", (IOException) null, "data field have no data", Arrays.copyOf(new Object[i2], i2));
                            list4 = Collections.emptyList();
                        } else {
                            ArrayList arrayList2 = new ArrayList(split3.length);
                            int length2 = split3.length;
                            int i4 = i2;
                            while (i4 < length2) {
                                String[] split4 = split3[i4].split("\\s*:\\s*");
                                if (split4.length >= 2) {
                                    String trim = split4[i2].trim();
                                    String trim2 = split4[1].trim();
                                    if (!trim.isEmpty() && !trim2.isEmpty()) {
                                        arrayList2.add(new ph3(trim, trim2));
                                    }
                                }
                                i4++;
                                i2 = 0;
                            }
                            list4 = arrayList2;
                        }
                    }
                    arrayList.add(new v14(list3, list4));
                }
                i3++;
                i2 = 0;
            }
            list = arrayList;
        }
        if (list != null && !list.isEmpty()) {
            String string2 = ((a33) x23).g.getString("app.location.country.code", (String) null);
            if (!cvg.A(string2)) {
                String trim3 = string2.toLowerCase().trim();
                for (v14 v14 : list) {
                    for (String lowerCase : v14.a) {
                        if (!lowerCase.toLowerCase().trim().equals(trim3) || (list2 = v14.b) == null || list2.isEmpty()) {
                            Set set2 = set;
                        } else {
                            set.addAll(list2);
                        }
                    }
                    Set set3 = set;
                }
            }
        }
    }

    public static final twd e0(qj1 qj1) {
        ue1 ue1 = qj1.f;
        Long l2 = qj1.g;
        return new twd(qj1.e, ue1, qj1.a, l2, qj1.b, qj1.d, qj1.c);
    }

    public static final void f(yag yag, mdd mdd, ju7 ju7) {
        idd idd = (idd) yag.h("androidx.lifecycle.savedstate.vm.tag");
        if (idd != null && !idd.c) {
            idd.a(mdd, ju7);
            f0(mdd, ju7);
        }
    }

    public static void f0(mdd mdd, ju7 ju7) {
        iu7 iu7 = ((lv7) ju7).d;
        if (iu7 == iu7.b || iu7.a(iu7.o)) {
            mdd.d();
        } else {
            ju7.a(new pg4(3, ju7, mdd));
        }
    }

    public static boolean g(lab[] labArr, lab[] labArr2) {
        if (labArr == null || labArr2 == null || labArr.length != labArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < labArr.length; i2++) {
            lab lab = labArr[i2];
            char c2 = lab.a;
            lab lab2 = labArr2[i2];
            if (c2 != lab2.a || lab.b.length != lab2.b.length) {
                return false;
            }
        }
        return true;
    }

    public static final void g0(fwf fwf) {
        fwf.e(u50.class, new em(4));
    }

    public static void h(String str, boolean z) {
        if (!z) {
            throw ParserException.a(str, (RuntimeException) null);
        }
    }

    public static void k(Context context, String str) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Copied Text", str));
    }

    public static float[] l(float[] fArr, int i2) {
        if (i2 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i2, length);
                float[] fArr2 = new float[i2];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static final idd m(mdd mdd, ju7 ju7, String str, Bundle bundle) {
        Bundle a2 = mdd.a(str);
        Class[] clsArr = hdd.f;
        idd idd = new idd(str, hi7.i(a2, bundle));
        idd.a(mdd, ju7);
        f0(mdd, ju7);
        return idd;
    }

    public static he n(int i2, int i3, int i4, int i5) {
        return new he(ImageReader.newInstance(i2, i3, i4, i5));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0083, code lost:
        r13 = 0;
        r15 = 1;
        r16 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008d, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0096 A[Catch:{ NumberFormatException -> 0x00aa }, LOOP:3: B:22:0x0068->B:41:0x0096, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0095 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.lab[] o(java.lang.String r17) {
        /*
            r0 = r17
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r5 = r2
            r4 = 1
        L_0x000a:
            int r6 = r17.length()
            if (r4 >= r6) goto L_0x00de
        L_0x0010:
            int r6 = r17.length()
            r7 = 69
            r8 = 101(0x65, float:1.42E-43)
            if (r4 >= r6) goto L_0x0034
            char r6 = r0.charAt(r4)
            int r9 = r6 + -65
            int r10 = r6 + -90
            int r10 = r10 * r9
            if (r10 <= 0) goto L_0x002c
            int r9 = r6 + -97
            int r10 = r6 + -122
            int r10 = r10 * r9
            if (r10 > 0) goto L_0x0031
        L_0x002c:
            if (r6 == r8) goto L_0x0031
            if (r6 == r7) goto L_0x0031
            goto L_0x0034
        L_0x0031:
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0034:
            java.lang.String r5 = r0.substring(r5, r4)
            java.lang.String r5 = r5.trim()
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x00d7
            char r6 = r5.charAt(r2)
            r9 = 122(0x7a, float:1.71E-43)
            if (r6 == r9) goto L_0x00c9
            char r6 = r5.charAt(r2)
            r9 = 90
            if (r6 != r9) goto L_0x0054
            goto L_0x00c9
        L_0x0054:
            int r6 = r5.length()     // Catch:{ NumberFormatException -> 0x00aa }
            float[] r6 = new float[r6]     // Catch:{ NumberFormatException -> 0x00aa }
            int r9 = r5.length()     // Catch:{ NumberFormatException -> 0x00aa }
            r11 = r2
            r10 = 1
        L_0x0060:
            if (r10 >= r9) goto L_0x00b4
            r13 = r2
            r14 = r13
            r15 = r14
            r16 = r15
            r12 = r10
        L_0x0068:
            int r3 = r5.length()     // Catch:{ NumberFormatException -> 0x00aa }
            if (r12 >= r3) goto L_0x009a
            char r3 = r5.charAt(r12)     // Catch:{ NumberFormatException -> 0x00aa }
            r2 = 32
            if (r3 == r2) goto L_0x0091
            if (r3 == r7) goto L_0x008f
            if (r3 == r8) goto L_0x008f
            switch(r3) {
                case 44: goto L_0x0091;
                case 45: goto L_0x0088;
                case 46: goto L_0x007e;
                default: goto L_0x007d;
            }     // Catch:{ NumberFormatException -> 0x00aa }
        L_0x007d:
            goto L_0x008d
        L_0x007e:
            if (r14 != 0) goto L_0x0083
            r13 = 0
            r14 = 1
            goto L_0x0093
        L_0x0083:
            r13 = 0
            r15 = 1
            r16 = 1
            goto L_0x0093
        L_0x0088:
            if (r12 == r10) goto L_0x008d
            if (r13 != 0) goto L_0x008d
            goto L_0x0083
        L_0x008d:
            r13 = 0
            goto L_0x0093
        L_0x008f:
            r13 = 1
            goto L_0x0093
        L_0x0091:
            r13 = 0
            r15 = 1
        L_0x0093:
            if (r15 == 0) goto L_0x0096
            goto L_0x009a
        L_0x0096:
            int r12 = r12 + 1
            r2 = 0
            goto L_0x0068
        L_0x009a:
            if (r10 >= r12) goto L_0x00ac
            int r2 = r11 + 1
            java.lang.String r3 = r5.substring(r10, r12)     // Catch:{ NumberFormatException -> 0x00aa }
            float r3 = java.lang.Float.parseFloat(r3)     // Catch:{ NumberFormatException -> 0x00aa }
            r6[r11] = r3     // Catch:{ NumberFormatException -> 0x00aa }
            r11 = r2
            goto L_0x00ac
        L_0x00aa:
            r0 = move-exception
            goto L_0x00bb
        L_0x00ac:
            if (r16 == 0) goto L_0x00b1
            r10 = r12
        L_0x00af:
            r2 = 0
            goto L_0x0060
        L_0x00b1:
            int r10 = r12 + 1
            goto L_0x00af
        L_0x00b4:
            float[] r2 = l(r6, r11)     // Catch:{ NumberFormatException -> 0x00aa }
            r3 = r2
            r2 = 0
            goto L_0x00cb
        L_0x00bb:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "error in parsing \""
            java.lang.String r3 = "\""
            java.lang.String r2 = defpackage.wj6.k(r2, r5, r3)
            r1.<init>(r2, r0)
            throw r1
        L_0x00c9:
            float[] r3 = new float[r2]
        L_0x00cb:
            char r5 = r5.charAt(r2)
            lab r2 = new lab
            r2.<init>(r5, r3)
            r1.add(r2)
        L_0x00d7:
            int r2 = r4 + 1
            r5 = r4
            r4 = r2
            r2 = 0
            goto L_0x000a
        L_0x00de:
            int r4 = r4 - r5
            r2 = 1
            if (r4 != r2) goto L_0x00f8
            int r2 = r17.length()
            if (r5 >= r2) goto L_0x00f8
            char r0 = r0.charAt(r5)
            r2 = 0
            float[] r3 = new float[r2]
            lab r4 = new lab
            r4.<init>(r0, r3)
            r1.add(r4)
            goto L_0x00f9
        L_0x00f8:
            r2 = 0
        L_0x00f9:
            lab[] r0 = new defpackage.lab[r2]
            java.lang.Object[] r0 = r1.toArray(r0)
            lab[] r0 = (defpackage.lab[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b59.o(java.lang.String):lab[]");
    }

    public static Path p(String str) {
        Path path = new Path();
        try {
            L(o(str), path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(str), e2);
        }
    }

    public static final hdd q(zy9 zy9) {
        s9a s9a = o;
        LinkedHashMap linkedHashMap = zy9.a;
        odd odd = (odd) linkedHashMap.get(s9a);
        if (odd != null) {
            hbg hbg = (hbg) linkedHashMap.get(p);
            if (hbg != null) {
                Bundle bundle = (Bundle) linkedHashMap.get(q);
                String str = (String) linkedHashMap.get(u9a.y);
                if (str != null) {
                    ldd b2 = odd.getSavedStateRegistry().b();
                    jdd jdd = b2 instanceof jdd ? (jdd) b2 : null;
                    if (jdd != null) {
                        SavedStateHandlesVM F = F(hbg);
                        hdd hdd = (hdd) F.c.get(str);
                        if (hdd != null) {
                            return hdd;
                        }
                        Class[] clsArr = hdd.f;
                        jdd.b();
                        Bundle bundle2 = jdd.c;
                        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
                        Bundle bundle4 = jdd.c;
                        if (bundle4 != null) {
                            bundle4.remove(str);
                        }
                        Bundle bundle5 = jdd.c;
                        if (bundle5 != null && bundle5.isEmpty()) {
                            jdd.c = null;
                        }
                        hdd i2 = hi7.i(bundle3, bundle);
                        F.c.put(str, i2);
                        return i2;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static lab[] r(lab[] labArr) {
        lab[] labArr2 = new lab[labArr.length];
        for (int i2 = 0; i2 < labArr.length; i2++) {
            labArr2[i2] = new lab(labArr[i2]);
        }
        return labArr2;
    }

    public static ph3 s(x23 x23) {
        a33 a33 = (a33) x23;
        String z = a33.z();
        String A = a33.A();
        if (cvg.A(z) || cvg.A(A)) {
            return null;
        }
        return new ph3(z, A, a33.c("server.useTls", true));
    }

    public static final void u(odd odd) {
        iu7 iu7 = ((lv7) odd.getLifecycle()).d;
        if (iu7 != iu7.b && iu7 != iu7.c) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (odd.getSavedStateRegistry().b() == null) {
            jdd jdd = new jdd(odd.getSavedStateRegistry(), (hbg) odd);
            odd.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", jdd);
            odd.getLifecycle().a(new qyc(8, jdd));
        }
    }

    public static final void w(View view, int i2, int i3) {
        Rect rect = new Rect();
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new cof(view, rect, i2, i3));
            return;
        }
        view.getHitRect(rect);
        if (rect.width() < i2) {
            int width = (i2 - rect.width()) / 2;
            rect.left -= width;
            rect.right += width;
        }
        if (rect.height() < i3) {
            int height = (i3 - rect.height()) / 2;
            rect.top -= height;
            rect.bottom += height;
        }
        view.setTouchDelegate(new od5(rect, view));
    }

    public static final void x(int i2, int i3, int i4, int i5, View view, View view2) {
        if (view != null) {
            view.post(new xc3(view2, i2, i3, i4, i5, view, 1));
        }
    }

    public abstract void D(s4e s4e, float f2, float f3);

    public abstract int E();

    public abstract Context G();

    public abstract u08 H();

    public boolean I() {
        return false;
    }

    public abstract void M();

    public void N() {
    }

    public abstract boolean O(int i2, KeyEvent keyEvent);

    public boolean P(KeyEvent keyEvent) {
        return false;
    }

    public boolean Q() {
        return false;
    }

    public abstract void W(boolean z);

    public abstract void X(boolean z);

    public abstract void Y(CharSequence charSequence);

    public float a(View view, ViewGroup viewGroup) {
        return view.getTranslationX();
    }

    public b8 b0(p7d p7d) {
        return null;
    }

    public boolean i() {
        return false;
    }

    public abstract boolean j();

    public abstract void t(boolean z);

    public abstract u4b v();

    public abstract void z(Rect rect, Rect rect2);
}
