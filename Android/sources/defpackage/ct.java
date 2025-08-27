package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Parcelable;
import android.text.format.Time;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.apache.http.protocol.HTTP;
import org.json.JSONObject;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ct  reason: default package */
public abstract class ct {
    public static final Continuation[] a = new Continuation[0];
    public static final frg b = new frg("CRASH_FREE", 2);
    public static final Object[] c = new Object[0];
    public static final int[] d = new int[0];
    public static final long[] e = new long[0];
    public static final float[] f = new float[0];
    public static final String[] g = new String[0];
    public static final byte[] h = new byte[0];
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;

    public static final void A(int i2, int i3, int i4, int i5, View view, View view2) {
        if (z(view)) {
            view.layout(view2.getMeasuredWidth() - i4, i3, view2.getMeasuredWidth() - i2, i5);
        } else {
            view.layout(i2, i3, i4, i5);
        }
    }

    public static lx6 B(String... strArr) {
        if (strArr.length % 2 == 0) {
            Object clone = strArr.clone();
            if (clone != null) {
                String[] strArr2 = (String[]) clone;
                int length = strArr2.length;
                int i2 = 0;
                while (i2 < length) {
                    String str = strArr2[i2];
                    if (str == null) {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    } else if (str != null) {
                        strArr2[i2] = StringsKt.trim((CharSequence) str).toString();
                        i2++;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                }
                IntProgression step = RangesKt.step((IntProgression) ArraysKt.getIndices((T[]) strArr2), 2);
                int first = step.getFirst();
                int last = step.getLast();
                int step2 = step.getStep();
                if (step2 < 0 ? first >= last : first <= last) {
                    while (true) {
                        String str2 = strArr2[first];
                        String str3 = strArr2[first + 1];
                        e(str2);
                        g(str3, str2);
                        if (first == last) {
                            break;
                        }
                        first += step2;
                    }
                }
                return new lx6(strArr2);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        }
        throw new IllegalArgumentException("Expected alternating header names and values".toString());
    }

    public static final String C(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.optString(str);
        }
        return null;
    }

    public static PorterDuff.Mode D(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return PorterDuff.Mode.MULTIPLY;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static String E(X509Certificate x509Certificate) {
        if (x509Certificate instanceof X509Certificate) {
            return "sha256/" + wc8.r(x509Certificate.getPublicKey().getEncoded()).b("SHA-256").a();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
    }

    public static String F(w78 w78, String str, String str2, Long l) {
        StringBuilder sb = new StringBuilder();
        long longValue = l.longValue();
        ThreadLocal threadLocal = p78.i;
        m78 m78 = (m78) threadLocal.get();
        if (m78 == null) {
            m78 = new m78();
            threadLocal.set(m78);
        }
        String str3 = m78.d;
        if (m78.c != longValue || str3 == null) {
            Time time = m78.a;
            time.set(longValue);
            StringBuilder sb2 = m78.b;
            sb2.setLength(0);
            int i2 = (int) (longValue % 1000);
            a(sb2, time.month + 1);
            sb2.append('-');
            a(sb2, time.monthDay);
            sb2.append(' ');
            a(sb2, time.hour);
            sb2.append(':');
            a(sb2, time.minute);
            sb2.append(':');
            a(sb2, time.second);
            sb2.append('.');
            if (i2 < 10) {
                sb2.append('0');
            }
            if (i2 < 100) {
                sb2.append('0');
            }
            sb2.append(i2);
            str3 = sb2.toString();
            m78.d = str3;
            m78.c = longValue;
        }
        sb.append(str3);
        sb.append(' ');
        sb.append(w78.b);
        sb.append(' ');
        sb.append(str);
        sb.append(' ');
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static final void G(View view, long j2, View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            view.setOnClickListener(new t84(j2, onClickListener));
        } else {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public static final void H(View view, View.OnClickListener onClickListener) {
        G(view, 300, onClickListener);
    }

    public static boolean J(eq7 eq7, eq7 eq72, hw0 hw0) {
        if (eq72 == null) {
            return false;
        }
        List a2 = eq7.a();
        List a3 = eq72.a();
        if (a2.size() != a3.size()) {
            return false;
        }
        for (int i2 = 0; i2 < a2.size(); i2++) {
            if (((ew0) a2.get(i2)).size() != ((ew0) a3.get(i2)).size()) {
                return false;
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < a2.size(); i3++) {
            ew0 ew0 = (ew0) a2.get(i3);
            for (int i4 = 0; i4 < ew0.size(); i4++) {
                xv0 xv0 = (xv0) ew0.get(i4);
                xv0 xv02 = (xv0) ((ew0) a3.get(i3)).get(i4);
                if (xv0.y != xv02.y && xv0.equals(xv02)) {
                    hw0.accept(eq7);
                    z = true;
                }
            }
        }
        return z;
    }

    public static final void K(fwf fwf) {
        fwf.e(vj9.class, new s4(8));
        fwf.e(zz.class, new s4(9));
        fwf.e(z89.class, new s4(10));
        fwf.e(msa.class, new s4(11));
        fwf.e(cpb.class, new em(1));
        fwf.e(j00.class, new em(2));
        fwf.e(h90.class, new em(3));
    }

    public static final void L(fwf fwf) {
        fwf.c(oa4.class, new qid(22));
    }

    public static void M(int i2, Object[] objArr) {
        int i3 = 0;
        while (i3 < i2) {
            if (objArr[i3] != null) {
                i3++;
            } else {
                throw new NullPointerException(wj6.h(i3, "at index "));
            }
        }
    }

    public static void a(StringBuilder sb, int i2) {
        if (i2 < 10) {
            sb.append('0');
        }
        sb.append(i2);
    }

    public static final void b(View view) {
        Context context = view.getContext();
        ece ece = cs7.b;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        ece.getClass();
        view.setLayoutDirection((layoutDirection == 1 ? cs7.RTL : cs7.LTR).a);
    }

    public static String c(String str, String str2) {
        StringBuilder o = tr1.o(str);
        if (!(str2 == null || str2.length() == 0)) {
            o.append(' ');
            o.append(str2);
        }
        return StringsKt.trim((CharSequence) o.toString()).toString();
    }

    public static void d(int i2, ArrayList arrayList, hw0 hw0, int i3, int i4, boolean z) {
        int i5 = z ? i2 : 0;
        Iterator it = arrayList.iterator();
        int i6 = 0;
        int i7 = 0;
        while (it.hasNext()) {
            tq0 tq0 = (tq0) it.next();
            int i8 = tq0.c;
            if (i8 != -1) {
                i7 = (i2 - (i8 * i3)) / i8;
                i5 = z ? i2 : 0;
            }
            boolean z2 = tq0.f;
            if (z2) {
                i7 += i3;
            }
            float f2 = (float) i5;
            float f3 = (float) i6;
            boolean z3 = tq0.d;
            int i9 = z ? z3 ? i5 - i2 : i5 - i7 : z3 ? i5 + i2 : i5 + i7;
            int i10 = i6 + i4;
            a20 a20 = tq0.b;
            a20.b = f2;
            a20.c = f3;
            a20.d = (float) i9;
            a20.e = (float) i10;
            hw0 hw02 = hw0;
            hw0.accept(tq0);
            i5 = z ? (i5 - i7) - i3 : i5 + i7 + i3;
            if (z2) {
                i6 = i10 + i3;
            }
        }
    }

    public static void e(String str) {
        if (str.length() > 0) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if ('!' > charAt || '~' < charAt) {
                    throw new IllegalArgumentException(u0g.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str).toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty".toString());
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void g(String str, String str2) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt == 9 || (' ' <= charAt && '~' >= charAt)) {
                i2++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(u0g.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i2), str2));
                sb.append(u0g.p(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static pj3 h(ConstraintLayout constraintLayout) {
        pj3 pj3 = new pj3();
        pj3.d(constraintLayout);
        return pj3;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String, java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:17|18|19|20|23|24) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x008c */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ab A[SYNTHETIC, Splitter:B:39:0x00ab] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b0 A[Catch:{ Exception -> 0x00b3 }, DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri i(android.net.Uri r7, android.content.Context r8, defpackage.ln5 r9) {
        /*
            java.lang.String r0 = "ct"
            java.lang.String r1 = "Uri is from FileProvider, need copy: "
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0021 }
            r3.<init>(r1)     // Catch:{ all -> 0x0021 }
            r3.append(r7)     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0021 }
            defpackage.z68.c(r0, r1, new java.lang.Object[0])     // Catch:{ all -> 0x0021 }
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = r1.getType(r7)     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0025
            java.lang.String r1 = "application/octet-stream"
            goto L_0x0025
        L_0x0021:
            r8 = move-exception
            r4 = r2
            goto L_0x00a4
        L_0x0025:
            android.webkit.MimeTypeMap r3 = android.webkit.MimeTypeMap.getSingleton()     // Catch:{ all -> 0x0021 }
            java.lang.String r3 = r3.getExtensionFromMimeType(r1)     // Catch:{ all -> 0x0021 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0021 }
            r4.<init>()     // Catch:{ all -> 0x0021 }
            java.lang.String r5 = r7.getLastPathSegment()     // Catch:{ all -> 0x0021 }
            if (r5 == 0) goto L_0x003f
            java.lang.String r5 = r7.getLastPathSegment()     // Catch:{ all -> 0x0021 }
            r4.append(r5)     // Catch:{ all -> 0x0021 }
        L_0x003f:
            if (r3 == 0) goto L_0x0053
            java.lang.String r5 = r4.toString()     // Catch:{ all -> 0x0021 }
            boolean r5 = r5.endsWith(r3)     // Catch:{ all -> 0x0021 }
            if (r5 != 0) goto L_0x0053
            java.lang.String r5 = "."
            r4.append(r5)     // Catch:{ all -> 0x0021 }
            r4.append(r3)     // Catch:{ all -> 0x0021 }
        L_0x0053:
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0021 }
            po5 r9 = (defpackage.po5) r9     // Catch:{ all -> 0x0021 }
            java.io.File r9 = r9.r(r3)     // Catch:{ all -> 0x0021 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0021 }
            r3.<init>(r9)     // Catch:{ all -> 0x0021 }
            android.content.ContentResolver r4 = r8.getContentResolver()     // Catch:{ all -> 0x00a1 }
            java.io.InputStream r4 = r4.openInputStream(r7)     // Catch:{ all -> 0x00a1 }
            defpackage.j4b.n(r4, r3)     // Catch:{ all -> 0x0089 }
            r3.close()     // Catch:{ all -> 0x0089 }
            r4.close()     // Catch:{ all -> 0x0089 }
            android.net.Uri r9 = android.net.Uri.fromFile(r9)     // Catch:{ all -> 0x0089 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0089 }
            r5.<init>()     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = "mime_type"
            r5.put(r6, r1)     // Catch:{ all -> 0x0089 }
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x008c }
            r1.update(r9, r5, r2, r2)     // Catch:{ IllegalArgumentException -> 0x008c }
            goto L_0x009a
        L_0x0089:
            r8 = move-exception
        L_0x008a:
            r2 = r3
            goto L_0x00a4
        L_0x008c:
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x0094 }
            r8.insert(r9, r5)     // Catch:{ IllegalArgumentException -> 0x0094 }
            goto L_0x009a
        L_0x0094:
            r8 = move-exception
            java.lang.String r1 = "copyContentOfUri failed to copy mimetype"
            defpackage.z68.o(r0, r1, r8)     // Catch:{ all -> 0x0089 }
        L_0x009a:
            r3.close()     // Catch:{ Exception -> 0x00a0 }
            r4.close()     // Catch:{ Exception -> 0x00a0 }
        L_0x00a0:
            return r9
        L_0x00a1:
            r8 = move-exception
            r4 = r2
            goto L_0x008a
        L_0x00a4:
            java.lang.String r9 = "handleSingleMediaIntent failed to copy FileProvider uri: "
            defpackage.z68.f(r0, r9, r8)     // Catch:{ all -> 0x00b4 }
            if (r2 == 0) goto L_0x00ae
            r2.close()     // Catch:{ Exception -> 0x00b3 }
        L_0x00ae:
            if (r4 == 0) goto L_0x00b3
            r4.close()     // Catch:{ Exception -> 0x00b3 }
        L_0x00b3:
            return r7
        L_0x00b4:
            r7 = move-exception
            if (r2 == 0) goto L_0x00ba
            r2.close()     // Catch:{ Exception -> 0x00bf }
        L_0x00ba:
            if (r4 == 0) goto L_0x00bf
            r4.close()     // Catch:{ Exception -> 0x00bf }
        L_0x00bf:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct.i(android.net.Uri, android.content.Context, ln5):android.net.Uri");
    }

    public static float j(int i2, Context context) {
        return TypedValue.applyDimension(1, (float) i2, context.getResources().getDisplayMetrics());
    }

    public static final co1 k(bs5 bs5, ju7 ju7, iu7 iu7) {
        return bs0.k(new xs5(ju7, iu7, bs5, (Continuation) null));
    }

    public static f19 l(String str) {
        Matcher matcher = f19.d.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            if (group != null) {
                String lowerCase = group.toLowerCase(locale);
                String group2 = matcher.group(2);
                if (group2 != null) {
                    group2.toLowerCase(locale);
                    ArrayList arrayList = new ArrayList();
                    Matcher matcher2 = f19.e.matcher(str);
                    int end = matcher.end();
                    while (end < str.length()) {
                        matcher2.region(end, str.length());
                        if (matcher2.lookingAt()) {
                            String group3 = matcher2.group(1);
                            if (group3 == null) {
                                end = matcher2.end();
                            } else {
                                String group4 = matcher2.group(2);
                                if (group4 == null) {
                                    group4 = matcher2.group(3);
                                } else if (StringsKt__StringsJVMKt.startsWith$default(group4, "'", false, 2, (Object) null) && StringsKt__StringsJVMKt.endsWith$default(group4, "'", false, 2, (Object) null) && group4.length() > 2) {
                                    group4 = group4.substring(1, group4.length() - 1);
                                }
                                arrayList.add(group3);
                                arrayList.add(group4);
                                end = matcher2.end();
                            }
                        } else {
                            throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + Typography.quote).toString());
                        }
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array != null) {
                        return new f19(str, lowerCase, (String[]) array);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        throw new IllegalArgumentException(("No subtype found for: \"" + str + Typography.quote).toString());
    }

    public static ViewGroup m(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static p1e n(View view) {
        ViewGroup m = m(view);
        if (m == null) {
            return null;
        }
        return new p1e(m);
    }

    public static int o() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        int[] iArr = new int[2];
        EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        EGL14.eglChooseConfig(eglGetDisplay, new int[]{12351, 12430, 12329, 0, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] == 0) {
            return 0;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
        EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
        int[] iArr3 = new int[1];
        GLES20.glGetIntegerv(3379, iArr3, 0);
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
        EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
        EGL14.eglTerminate(eglGetDisplay);
        return iArr3[0];
    }

    public static int p(int i2) {
        return i2 >= MathKt.roundToInt(((float) 72) * vo4.c().getDisplayMetrics().density) ? MathKt.roundToInt(((float) 36) * vo4.c().getDisplayMetrics().density) : i2 >= MathKt.roundToInt(((float) 64) * vo4.c().getDisplayMetrics().density) ? MathKt.roundToInt(((float) 32) * vo4.c().getDisplayMetrics().density) : i2 >= MathKt.roundToInt(((float) 48) * vo4.c().getDisplayMetrics().density) ? MathKt.roundToInt(((float) 28) * vo4.c().getDisplayMetrics().density) : i2 >= MathKt.roundToInt(((float) 36) * vo4.c().getDisplayMetrics().density) ? MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density) : i2 >= MathKt.roundToInt(((float) 32) * vo4.c().getDisplayMetrics().density) ? MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density) : i2 >= 28 ? MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density) : MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
    }

    public static final int q(i43 i43, int i2) {
        int c2 = i43.c();
        i43.u(i2);
        int i3 = 1;
        while (i43.s() == i2) {
            i43.u(i2);
            i3++;
        }
        i43.t(c2);
        return i3;
    }

    public static int r(Intent intent) {
        String type = intent.getType();
        o9a o9a = sq9.b;
        boolean z = false;
        if ((type != null ? StringsKt__StringsJVMKt.startsWith(type, HTTP.PLAIN_TEXT_TYPE, true) : false) && intent.getParcelableExtra("android.intent.extra.STREAM") == null && intent.getParcelableArrayListExtra("android.intent.extra.STREAM") == null) {
            return 0;
        }
        o9a o9a2 = sq9.b;
        if (type != null) {
            z = StringsKt__StringsJVMKt.startsWith(type, "text/x-vcard", true);
        }
        if (z) {
            return 5;
        }
        sq9.b.getClass();
        if (o9a.l(type)) {
            return 1;
        }
        return o9a.m(type) ? 2 : 4;
    }

    public static final int s(View view) {
        return z(view) ? view.getRight() : view.getLeft();
    }

    public static ArrayList t(Intent intent, Context context, m95 m95, ln5 ln5) {
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        if (parcelableArrayListExtra != null) {
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                Parcelable parcelable = (Parcelable) it.next();
                Uri parse = parcelable == null ? null : parcelable instanceof Uri ? (Uri) parcelable : Uri.parse(parcelable.toString());
                if (parse != null && !o5a.L(parse, context, m95)) {
                    if (ln5 != null) {
                        parse = i(parse, context, ln5);
                    }
                    arrayList.add(parse);
                }
            }
        }
        return arrayList;
    }

    public static ArrayList u(Intent intent, Context context, m95 m95, ln5 ln5) {
        ArrayList arrayList = new ArrayList();
        Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.STREAM");
        if (parcelableExtra == null) {
            return arrayList;
        }
        Uri parse = parcelableExtra instanceof Uri ? (Uri) parcelableExtra : Uri.parse(parcelableExtra.toString());
        if (parse == null) {
            return arrayList;
        }
        if (parse.toString().startsWith("content://ru.oneme.app")) {
            arrayList.add(parse);
        } else if (!o5a.L(parse, context, m95)) {
            if (ln5 != null) {
                parse = i(parse, context, ln5);
            }
            arrayList.add(parse);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r2 = r2.getCharSequenceExtra("android.intent.extra.TEXT");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String v(android.content.Intent r2) {
        /*
            java.lang.String r0 = "android.intent.extra.TEXT"
            java.lang.String r1 = r2.getStringExtra(r0)
            if (r1 != 0) goto L_0x0012
            java.lang.CharSequence r2 = r2.getCharSequenceExtra(r0)
            if (r2 == 0) goto L_0x0012
            java.lang.String r1 = r2.toString()
        L_0x0012:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct.v(android.content.Intent):java.lang.String");
    }

    public static npg w() {
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Map a2 = fif.a(allStackTraces);
        Throwable th = null;
        try {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            T t = null;
            for (Map.Entry next : allStackTraces.entrySet()) {
                Thread thread = (Thread) next.getKey();
                StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) next.getValue();
                String str = thread.getName() + " (state=" + thread.getState() + ", pid=" + thread.getId() + ")";
                if (StringsKt__StringsJVMKt.equals(thread.getName(), "main", true)) {
                    T th2 = new Throwable(str);
                    th2.setStackTrace(stackTraceElementArr);
                    objectRef2.element = th2;
                } else if (objectRef.element != null) {
                    T th3 = new Throwable(str, (Throwable) objectRef.element);
                    th3.setStackTrace(stackTraceElementArr);
                    objectRef.element = th3;
                } else {
                    t = new Throwable(str);
                    t.setStackTrace(stackTraceElementArr);
                    objectRef.element = t;
                }
            }
            T t2 = objectRef2.element;
            if (!(t2 == null || t == null)) {
                t.initCause((Throwable) t2);
            }
            th = (Throwable) objectRef.element;
        } catch (Throwable unused) {
        }
        return new npg(25, (Object) a2, (Object) th);
    }

    public static boolean x(View view) {
        WeakHashMap weakHashMap = gag.a;
        return view.getLayoutDirection() == 1;
    }

    public static final boolean y(Context context) {
        ece ece = cs7.b;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        ece.getClass();
        return (layoutDirection == 1 ? cs7.RTL : cs7.LTR) == cs7.RTL;
    }

    public static final boolean z(View view) {
        return y(view.getContext());
    }
}
