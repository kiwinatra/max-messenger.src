package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Looper;
import android.util.Base64;
import android.view.View;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: m58  reason: default package */
public abstract class m58 implements s55, xdd {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};
    public static final nfd c = new nfd(12);
    public static final xvg d = new xvg(5);
    public static final dj6 e = new Object();
    public static final gga f = new gga(12);
    public static final ekd g = new ekd(12);
    public static final dbe h = new dbe(12);
    public static final bp7 i = new bp7(2);
    public static final /* synthetic */ int j = 0;

    public static boolean A(String str) {
        return "service.unavailable".equals(str) || "io.exception".equals(str) || "service.timeout".equals(str);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [s2f, java.lang.Object, y2f] */
    public static s2f B(s2f s2f) {
        if ((s2f instanceof y2f) || (s2f instanceof x2f)) {
            return s2f;
        }
        if (s2f instanceof Serializable) {
            return new x2f(s2f);
        }
        ? obj = new Object();
        obj.a = s2f;
        return obj;
    }

    public static List C(List list) {
        if (list.size() == 1) {
            Object obj = list.get(0);
            return obj instanceof String ? obj.equals("Selection-Changed") ? Collections.singletonList("EDIT") : Collections.emptyList() : (List) obj;
        }
        HashSet hashSet = new HashSet();
        for (Object next : list) {
            if (next instanceof List) {
                hashSet.addAll((List) next);
            } else if ((next instanceof String) && next.equals("Selection-Changed")) {
                hashSet.add("EDIT");
            }
        }
        return new ArrayList(hashSet);
    }

    public static void D(Context context, l20 l20, po5 po5) {
        File h2 = po5.h(l20);
        if (h2.exists()) {
            String r = o5a.r(l20.j.c);
            if ("application/vnd.android.package-archive".equals(r)) {
                try {
                    if (context.getPackageManager().canRequestPackageInstalls()) {
                        y64.B(new nn(context, 1));
                    }
                } catch (SecurityException e2) {
                    z68.f("m58", "fail to install apk", e2);
                    if (e2.toString().contains("REQUEST_INSTALL_PACKAGES")) {
                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                        intent.setDataAndType(po5.f(context, h2), r);
                        context.startActivity(intent);
                    }
                }
            } else {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setFlags(1);
                intent2.setDataAndType(po5.f(context, h2), r != null ? r : "*/*");
                if (r != null) {
                    try {
                        context.startActivity(intent2);
                    } catch (Exception unused) {
                        intent2.setDataAndType(po5.f(context, h2), "*/*");
                        context.startActivity(intent2);
                    }
                } else {
                    context.startActivity(intent2);
                }
            }
        } else {
            throw new FileNotFoundException("attach file not found");
        }
    }

    public static void E(Context context, a89 a89, l20 l20, fa9 fa9, po5 po5) {
        try {
            ((qra) ym.e()).c().e("ACTION_FILE_OPEN_VIEWER");
            D(context, l20, po5);
        } catch (FileNotFoundException unused) {
            z68.f("m58", "file attach file not found", (Throwable) null);
            hi7.b0(0, context, context.getString(qad.w2));
            fa9.w(a89.a, l20.q, d20.a);
        } catch (Exception e2) {
            z68.f("m58", "cant open file attach.", e2);
            hi7.b0(0, context, context.getString(qad.o0));
        }
    }

    public static void F(zp7 zp7, Object obj) {
        if (obj == null || (obj instanceof String)) {
            String str = (String) obj;
            v1 v1Var = (v1) zp7;
            if (str != null) {
                v1Var.i(str);
            } else {
                v1Var.d0();
            }
        } else if (obj == JSONObject.NULL) {
            zp7.d0();
        } else if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            v1 v1Var2 = (v1) zp7;
            v1Var2.getClass();
            v1Var2.a(String.valueOf(booleanValue));
        } else if ((obj instanceof Double) || (obj instanceof Float)) {
            ((v1) zp7).b(((Number) obj).doubleValue());
        } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof Byte)) {
            long longValue = ((Number) obj).longValue();
            v1 v1Var3 = (v1) zp7;
            v1Var3.getClass();
            v1Var3.a(Long.toString(longValue));
        } else if (obj instanceof JSONObject) {
            G(zp7, (JSONObject) obj);
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            zp7.v();
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                F(zp7, jSONArray.opt(i2));
            }
            zp7.u();
        } else {
            throw new IllegalArgumentException("Don't know how to write " + obj);
        }
    }

    public static void G(zp7 zp7, JSONObject jSONObject) {
        zp7.t();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            zp7.h0(next);
            F(zp7, jSONObject.opt(next));
        }
        zp7.r();
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList H(defpackage.g1g r28) {
        /*
            r0 = r28
            int r1 = r28.v()
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            r1 = 7
            r0.I(r1)
            int r3 = r28.h()
            r4 = 1684433976(0x64666c38, float:1.7002196E22)
            r5 = 1
            if (r3 != r4) goto L_0x0039
            g1g r3 = new g1g
            r4 = 3
            r6 = 0
            r3.<init>((int) r4, (boolean) r6)
            java.util.zip.Inflater r4 = new java.util.zip.Inflater
            r4.<init>(r5)
            boolean r0 = defpackage.t0g.A(r0, r3, r4)     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x002e
            r4.end()
            return r2
        L_0x002e:
            r4.end()
            r0 = r3
            goto L_0x003f
        L_0x0033:
            r0 = move-exception
            r1 = r0
            r4.end()
            throw r1
        L_0x0039:
            r4 = 1918990112(0x72617720, float:4.465801E30)
            if (r3 == r4) goto L_0x003f
            return r2
        L_0x003f:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r0.b
            int r6 = r0.c
        L_0x0048:
            if (r4 >= r6) goto L_0x01cf
            int r7 = r0.h()
            int r7 = r7 + r4
            if (r7 <= r4) goto L_0x01b5
            if (r7 <= r6) goto L_0x0055
            goto L_0x01b5
        L_0x0055:
            int r4 = r0.h()
            r8 = 1835365224(0x6d657368, float:4.438224E27)
            if (r4 != r8) goto L_0x01bd
            int r4 = r0.h()
            r8 = 10000(0x2710, float:1.4013E-41)
            if (r4 <= r8) goto L_0x006f
        L_0x0066:
            r1 = r2
            r28 = r3
            r20 = r5
            r19 = r6
            goto L_0x01b3
        L_0x006f:
            float[] r8 = new float[r4]
            r10 = 0
        L_0x0072:
            if (r10 >= r4) goto L_0x0081
            int r11 = r0.h()
            float r11 = java.lang.Float.intBitsToFloat(r11)
            r8[r10] = r11
            int r10 = r10 + 1
            goto L_0x0072
        L_0x0081:
            int r10 = r0.h()
            r11 = 32000(0x7d00, float:4.4842E-41)
            if (r10 <= r11) goto L_0x008a
            goto L_0x0066
        L_0x008a:
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r13 = java.lang.Math.log(r11)
            r28 = r3
            double r2 = (double) r4
            double r2 = r2 * r11
            double r2 = java.lang.Math.log(r2)
            double r2 = r2 / r13
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            ky1 r3 = new ky1
            byte[] r9 = r0.a
            int r15 = r9.length
            r11 = 1
            r12 = 0
            r3.<init>((byte[]) r9, (byte) r12, (int) r15, (int) r11)
            int r9 = r0.b
            r11 = 8
            int r9 = r9 * r11
            r3.q(r9)
            int r9 = r10 * 5
            float[] r9 = new float[r9]
            r12 = 5
            int[] r15 = new int[r12]
            r11 = 0
            r18 = 0
        L_0x00ba:
            if (r11 >= r10) goto L_0x00ed
            r1 = 0
        L_0x00bd:
            if (r1 >= r12) goto L_0x00e8
            r19 = r15[r1]
            int r20 = r3.i(r2)
            int r21 = r20 >> 1
            r12 = r20 & 1
            int r12 = -r12
            r12 = r21 ^ r12
            int r12 = r12 + r19
            if (r12 >= r4) goto L_0x00e1
            if (r12 >= 0) goto L_0x00d3
            goto L_0x00e1
        L_0x00d3:
            int r19 = r18 + 1
            r20 = r8[r12]
            r9[r18] = r20
            r15[r1] = r12
            int r1 = r1 + 1
            r18 = r19
            r12 = 5
            goto L_0x00bd
        L_0x00e1:
            r20 = r5
            r19 = r6
        L_0x00e5:
            r1 = 0
            goto L_0x01b3
        L_0x00e8:
            int r11 = r11 + 1
            r1 = 7
            r12 = 5
            goto L_0x00ba
        L_0x00ed:
            int r1 = r3.g()
            r2 = 7
            int r1 = r1 + r2
            r1 = r1 & -8
            r3.q(r1)
            r1 = 32
            int r4 = r3.i(r1)
            yy[] r8 = new defpackage.yy[r4]
            r11 = 0
        L_0x0101:
            if (r11 >= r4) goto L_0x01aa
            r12 = 8
            int r15 = r3.i(r12)
            int r2 = r3.i(r12)
            int r12 = r3.i(r1)
            r1 = 128000(0x1f400, float:1.79366E-40)
            if (r12 <= r1) goto L_0x0117
            goto L_0x00e1
        L_0x0117:
            r19 = r6
            double r5 = (double) r10
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = r5 * r16
            double r5 = java.lang.Math.log(r5)
            double r5 = r5 / r13
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            int r6 = r12 * 3
            float[] r6 = new float[r6]
            int r1 = r12 * 2
            float[] r1 = new float[r1]
            r21 = r1
            r1 = 0
            r22 = 0
        L_0x0135:
            if (r1 >= r12) goto L_0x018c
            int r23 = r3.i(r5)
            int r24 = r23 >> 1
            r25 = r3
            r20 = 1
            r3 = r23 & 1
            r27 = r21
            r21 = r4
            r4 = r27
            int r3 = -r3
            r3 = r24 ^ r3
            int r3 = r3 + r22
            if (r3 < 0) goto L_0x0152
            if (r3 < r10) goto L_0x0155
        L_0x0152:
            r20 = 1
            goto L_0x00e5
        L_0x0155:
            int r22 = r1 * 3
            int r23 = r3 * 5
            r24 = r9[r23]
            r6[r22] = r24
            int r24 = r22 + 1
            int r26 = r23 + 1
            r26 = r9[r26]
            r6[r24] = r26
            int r22 = r22 + 2
            int r24 = r23 + 2
            r24 = r9[r24]
            r6[r22] = r24
            int r22 = r1 * 2
            int r24 = r23 + 3
            r24 = r9[r24]
            r4[r22] = r24
            r20 = 1
            int r22 = r22 + 1
            int r23 = r23 + 4
            r23 = r9[r23]
            r4[r22] = r23
            int r1 = r1 + 1
            r22 = r3
            r3 = r25
            r27 = r21
            r21 = r4
            r4 = r27
            goto L_0x0135
        L_0x018c:
            r25 = r3
            r20 = 1
            r27 = r21
            r21 = r4
            r4 = r27
            yy r1 = new yy
            r1.<init>(r15, r6, r4, r2)
            r8[r11] = r1
            int r11 = r11 + 1
            r6 = r19
            r5 = r20
            r4 = r21
            r1 = 32
            r2 = 7
            goto L_0x0101
        L_0x01aa:
            r20 = r5
            r19 = r6
            j8c r1 = new j8c
            r1.<init>(r8)
        L_0x01b3:
            if (r1 != 0) goto L_0x01b7
        L_0x01b5:
            r2 = 0
            goto L_0x01d0
        L_0x01b7:
            r2 = r28
            r2.add(r1)
            goto L_0x01c2
        L_0x01bd:
            r2 = r3
            r20 = r5
            r19 = r6
        L_0x01c2:
            r0.H(r7)
            r3 = r2
            r4 = r7
            r6 = r19
            r5 = r20
            r1 = 7
            r2 = 0
            goto L_0x0048
        L_0x01cf:
            r2 = r3
        L_0x01d0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m58.H(g1g):java.util.ArrayList");
    }

    public static String I(Object obj) {
        return "'" + String.valueOf(obj) + "'";
    }

    public static boolean J(String str) {
        return str != null && str.trim().length() > 0;
    }

    public static int K(int i2, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i2});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final String L(byte b2) {
        return b2 == 1 ? "quotation mark '\"'" : b2 == 2 ? "string escape sequence '\\'" : b2 == 4 ? "comma ','" : b2 == 5 ? "colon ':'" : b2 == 6 ? "start of the object '{'" : b2 == 7 ? "end of the object '}'" : b2 == 8 ? "start of the array '['" : b2 == 9 ? "end of the array ']'" : b2 == 10 ? "end of the input" : b2 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }

    public static boolean M(ep1 ep1) {
        if (Looper.myLooper() == null) {
            Lazy lazy = pm4.c;
            if (((ThreadLocal) lazy.getValue()) != null) {
                ThreadLocal threadLocal = (ThreadLocal) lazy.getValue();
                pm4 pm4 = new pm4(threadLocal);
                Looper looper = pm4.b;
                try {
                    ep1.invoke(pm4);
                    if (Intrinsics.areEqual((Object) looper.getThread(), (Object) Thread.currentThread())) {
                        threadLocal.remove();
                        return true;
                    }
                    throw new IllegalStateException("Illegal thread".toString());
                } catch (Throwable th) {
                    if (Intrinsics.areEqual((Object) looper.getThread(), (Object) Thread.currentThread())) {
                        pm4.a.remove();
                        throw th;
                    }
                    throw new IllegalStateException("Illegal thread".toString());
                }
            }
        }
        return false;
    }

    public static final lw3 b(ix3 ix3) {
        int i2 = dx3.$EnumSwitchMapping$0[ix3.ordinal()];
        if (i2 == 1) {
            return new vs6(13);
        }
        if (i2 == 2) {
            return new yw3();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void c(View view, v2b v2b, k2b k2b) {
        OneMeButton oneMeButton = null;
        if (v2b instanceof t2b) {
            d3b d3b = ((t2b) v2b).a;
            if (d3b instanceof a3b) {
                if (view instanceof OneMeButton) {
                    oneMeButton = (OneMeButton) view;
                }
                if (oneMeButton != null) {
                    oneMeButton.setSize(aqa.b);
                    oneMeButton.setMode(zpa.o);
                    oneMeButton.setAppearance(xpa.c);
                }
            } else if (!(d3b instanceof c3b) && !(d3b instanceof b3b)) {
                throw new NoWhenBranchMatchedException();
            }
        } else if ((v2b instanceof p2b) || (v2b instanceof q2b)) {
            if (view instanceof OneMeButton) {
                oneMeButton = (OneMeButton) view;
            }
            if (oneMeButton != null) {
                oneMeButton.setSize(aqa.b);
                oneMeButton.setMode(zpa.o);
                oneMeButton.setAppearance(xpa.c);
                oneMeButton.setCustomTheme(k2b);
            }
        } else if (!(v2b instanceof s2b)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: one.me.sdk.uikit.common.button.OneMeButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: one.me.sdk.uikit.common.button.OneMeButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: one.me.sdk.uikit.common.button.OneMeButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: pza} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(android.view.View r2, defpackage.x2b r3, boolean r4) {
        /*
            boolean r0 = r3 instanceof defpackage.u2b
            r1 = 0
            if (r0 == 0) goto L_0x0063
            u2b r3 = (defpackage.u2b) r3
            if (r4 == 0) goto L_0x000c
            d3b r3 = r3.b
            goto L_0x000e
        L_0x000c:
            d3b r3 = r3.a
        L_0x000e:
            boolean r4 = r3 instanceof defpackage.c3b
            if (r4 == 0) goto L_0x0022
            boolean r3 = r2 instanceof defpackage.pza
            if (r3 == 0) goto L_0x0019
            r1 = r2
            pza r1 = (defpackage.pza) r1
        L_0x0019:
            if (r1 == 0) goto L_0x00ab
            lza r2 = defpackage.lza.b
            r1.setCollapsedStyle(r2)
            goto L_0x00ab
        L_0x0022:
            boolean r4 = r3 instanceof defpackage.a3b
            if (r4 == 0) goto L_0x0040
            boolean r3 = r2 instanceof one.me.sdk.uikit.common.button.OneMeButton
            if (r3 == 0) goto L_0x002d
            r1 = r2
            one.me.sdk.uikit.common.button.OneMeButton r1 = (one.me.sdk.uikit.common.button.OneMeButton) r1
        L_0x002d:
            if (r1 == 0) goto L_0x00ab
            aqa r2 = defpackage.aqa.b
            r1.setSize(r2)
            zpa r2 = defpackage.zpa.o
            r1.setMode(r2)
            xpa r2 = defpackage.xpa.c
            r1.setAppearance(r2)
            goto L_0x00ab
        L_0x0040:
            boolean r4 = r3 instanceof defpackage.b3b
            if (r4 == 0) goto L_0x005a
            boolean r4 = r2 instanceof android.widget.ImageView
            if (r4 == 0) goto L_0x004b
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            goto L_0x004c
        L_0x004b:
            r2 = r1
        L_0x004c:
            if (r2 == 0) goto L_0x00ab
            zpd r4 = new zpd
            b3b r3 = (defpackage.b3b) r3
            r0 = 3
            r4.<init>((java.lang.Object) r3, (kotlin.coroutines.Continuation) r1, (int) r0)
            defpackage.b0h.H(r2, r4)
            goto L_0x00ab
        L_0x005a:
            if (r3 != 0) goto L_0x005d
            goto L_0x00ab
        L_0x005d:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
        L_0x0063:
            boolean r4 = r3 instanceof defpackage.w2b
            if (r4 == 0) goto L_0x0080
            boolean r3 = r2 instanceof one.me.sdk.uikit.common.button.OneMeButton
            if (r3 == 0) goto L_0x006e
            r1 = r2
            one.me.sdk.uikit.common.button.OneMeButton r1 = (one.me.sdk.uikit.common.button.OneMeButton) r1
        L_0x006e:
            if (r1 == 0) goto L_0x00ab
            aqa r2 = defpackage.aqa.a
            r1.setSize(r2)
            zpa r2 = defpackage.zpa.o
            r1.setMode(r2)
            xpa r2 = defpackage.xpa.c
            r1.setAppearance(r2)
            goto L_0x00ab
        L_0x0080:
            boolean r4 = r3 instanceof defpackage.r2b
            if (r4 != 0) goto L_0x0093
            boolean r4 = r3 instanceof defpackage.q2b
            if (r4 != 0) goto L_0x0093
            boolean r2 = r3 instanceof defpackage.s2b
            if (r2 == 0) goto L_0x008d
            goto L_0x00ab
        L_0x008d:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
        L_0x0093:
            boolean r3 = r2 instanceof one.me.sdk.uikit.common.button.OneMeButton
            if (r3 == 0) goto L_0x009a
            r1 = r2
            one.me.sdk.uikit.common.button.OneMeButton r1 = (one.me.sdk.uikit.common.button.OneMeButton) r1
        L_0x009a:
            if (r1 == 0) goto L_0x00ab
            aqa r2 = defpackage.aqa.b
            r1.setSize(r2)
            zpa r2 = defpackage.zpa.o
            r1.setMode(r2)
            xpa r2 = defpackage.xpa.c
            r1.setAppearance(r2)
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m58.d(android.view.View, x2b, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: one.me.sdk.uikit.common.button.OneMeButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: one.me.sdk.uikit.common.button.OneMeButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: pza} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(android.view.View r3, defpackage.x2b r4, boolean r5) {
        /*
            boolean r0 = r4 instanceof defpackage.u2b
            r1 = 0
            if (r0 == 0) goto L_0x006c
            u2b r4 = (defpackage.u2b) r4
            if (r5 == 0) goto L_0x000c
            d3b r4 = r4.b
            goto L_0x000e
        L_0x000c:
            d3b r4 = r4.a
        L_0x000e:
            if (r5 == 0) goto L_0x0013
            zpa r0 = defpackage.zpa.a
            goto L_0x0015
        L_0x0013:
            zpa r0 = defpackage.zpa.b
        L_0x0015:
            boolean r2 = r4 instanceof defpackage.c3b
            if (r2 == 0) goto L_0x0029
            boolean r4 = r3 instanceof defpackage.pza
            if (r4 == 0) goto L_0x0020
            r1 = r3
            pza r1 = (defpackage.pza) r1
        L_0x0020:
            if (r1 == 0) goto L_0x00a0
            lza r3 = defpackage.lza.a
            r1.setCollapsedStyle(r3)
            goto L_0x00a0
        L_0x0029:
            boolean r2 = r4 instanceof defpackage.a3b
            if (r2 == 0) goto L_0x0049
            boolean r4 = r3 instanceof one.me.sdk.uikit.common.button.OneMeButton
            if (r4 == 0) goto L_0x0034
            r1 = r3
            one.me.sdk.uikit.common.button.OneMeButton r1 = (one.me.sdk.uikit.common.button.OneMeButton) r1
        L_0x0034:
            if (r1 == 0) goto L_0x00a0
            aqa r3 = defpackage.aqa.a
            r1.setSize(r3)
            r1.setMode(r0)
            if (r5 == 0) goto L_0x0043
            xpa r3 = defpackage.xpa.o
            goto L_0x0045
        L_0x0043:
            xpa r3 = defpackage.xpa.c
        L_0x0045:
            r1.setAppearance(r3)
            goto L_0x00a0
        L_0x0049:
            boolean r5 = r4 instanceof defpackage.b3b
            if (r5 == 0) goto L_0x0063
            boolean r4 = r3 instanceof android.widget.ImageView
            if (r4 == 0) goto L_0x0055
            r4 = r3
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            goto L_0x0056
        L_0x0055:
            r4 = r1
        L_0x0056:
            if (r4 == 0) goto L_0x00a0
            qrb r5 = new qrb
            r0 = 16
            r5.<init>((java.lang.Object) r3, (kotlin.coroutines.Continuation) r1, (int) r0)
            defpackage.b0h.H(r4, r5)
            goto L_0x00a0
        L_0x0063:
            if (r4 != 0) goto L_0x0066
            goto L_0x00a0
        L_0x0066:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L_0x006c:
            boolean r0 = r4 instanceof defpackage.w2b
            if (r0 != 0) goto L_0x0083
            boolean r0 = r4 instanceof defpackage.r2b
            if (r0 != 0) goto L_0x0083
            boolean r0 = r4 instanceof defpackage.q2b
            if (r0 != 0) goto L_0x0083
            boolean r3 = r4 instanceof defpackage.s2b
            if (r3 == 0) goto L_0x007d
            goto L_0x00a0
        L_0x007d:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L_0x0083:
            boolean r4 = r3 instanceof one.me.sdk.uikit.common.button.OneMeButton
            if (r4 == 0) goto L_0x008a
            r1 = r3
            one.me.sdk.uikit.common.button.OneMeButton r1 = (one.me.sdk.uikit.common.button.OneMeButton) r1
        L_0x008a:
            if (r1 == 0) goto L_0x00a0
            aqa r3 = defpackage.aqa.b
            r1.setSize(r3)
            zpa r3 = defpackage.zpa.o
            r1.setMode(r3)
            if (r5 == 0) goto L_0x009b
            xpa r3 = defpackage.xpa.o
            goto L_0x009d
        L_0x009b:
            xpa r3 = defpackage.xpa.c
        L_0x009d:
            r1.setAppearance(r3)
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m58.e(android.view.View, x2b, boolean):void");
    }

    public static String f(int i2, boolean z, int i3, int i4, int[] iArr, int i5) {
        Object[] objArr = {b[i2], Integer.valueOf(i3), Integer.valueOf(i4), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i5)};
        int i6 = t0g.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i7 = 0; i7 < length; i7++) {
            sb.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i7])}));
        }
        return sb.toString();
    }

    public static final byte g(char c2) {
        if (c2 < '~') {
            return o22.b[c2];
        }
        return 0;
    }

    public static boolean h(byte[] bArr, String str) {
        if (bArr.length != str.length()) {
            return false;
        }
        IntRange indices = ArraysKt.getIndices(bArr);
        if (!(indices instanceof Collection) || !((Collection) indices).isEmpty()) {
            Iterator it = indices.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                if (((byte) str.charAt(nextInt)) != bArr[nextInt]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int i(Comparable comparable, Comparable comparable2) {
        if (comparable != null && comparable2 != null) {
            return comparable.compareTo(comparable2);
        }
        if (!(comparable == null && comparable2 == null)) {
            if (comparable != null || comparable2 == null) {
                return (comparable == null || comparable2 != null) ? 0 : 1;
            }
            return -1;
        }
    }

    public static final boolean j(long j2, List list) {
        Iterable<l03> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (l03 l03 : iterable) {
            if (l03.a() <= j2 && j2 <= l03.b()) {
                return true;
            }
        }
        return false;
    }

    public static final l03 m(long j2, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            l03 l03 = (l03) obj;
            if (l03.a() <= j2 && j2 <= l03.b()) {
                break;
            }
        }
        return (l03) obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: l03} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.l03 n(long r5, java.util.List r7) {
        /*
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x000b:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0024
            java.lang.Object r1 = r7.next()
            r2 = r1
            l03 r2 = (defpackage.l03) r2
            long r2 = r2.a()
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x000b
            r0.add(r1)
            goto L_0x000b
        L_0x0024:
            java.util.Iterator r5 = r0.iterator()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L_0x0030
            r5 = 0
            goto L_0x005b
        L_0x0030:
            java.lang.Object r6 = r5.next()
            boolean r7 = r5.hasNext()
            if (r7 != 0) goto L_0x003c
        L_0x003a:
            r5 = r6
            goto L_0x005b
        L_0x003c:
            r7 = r6
            l03 r7 = (defpackage.l03) r7
            long r0 = r7.b()
        L_0x0043:
            java.lang.Object r7 = r5.next()
            r2 = r7
            l03 r2 = (defpackage.l03) r2
            long r2 = r2.b()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0054
            r6 = r7
            r0 = r2
        L_0x0054:
            boolean r7 = r5.hasNext()
            if (r7 != 0) goto L_0x0043
            goto L_0x003a
        L_0x005b:
            l03 r5 = (defpackage.l03) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m58.n(long, java.util.List):l03");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: l03} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.l03 o(long r5, java.util.List r7) {
        /*
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x000b:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0024
            java.lang.Object r1 = r7.next()
            r2 = r1
            l03 r2 = (defpackage.l03) r2
            long r2 = r2.b()
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x000b
            r0.add(r1)
            goto L_0x000b
        L_0x0024:
            java.util.Iterator r5 = r0.iterator()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L_0x0030
            r5 = 0
            goto L_0x005b
        L_0x0030:
            java.lang.Object r6 = r5.next()
            boolean r7 = r5.hasNext()
            if (r7 != 0) goto L_0x003c
        L_0x003a:
            r5 = r6
            goto L_0x005b
        L_0x003c:
            r7 = r6
            l03 r7 = (defpackage.l03) r7
            long r0 = r7.b()
        L_0x0043:
            java.lang.Object r7 = r5.next()
            r2 = r7
            l03 r2 = (defpackage.l03) r2
            long r2 = r2.b()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0054
            r6 = r7
            r0 = r2
        L_0x0054:
            boolean r7 = r5.hasNext()
            if (r7 != 0) goto L_0x0043
            goto L_0x003a
        L_0x005b:
            l03 r5 = (defpackage.l03) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m58.o(long, java.util.List):l03");
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [long[], java.io.Serializable] */
    public static final n86 p(Map map) {
        n86 n86 = new n86(0);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (re8.$EnumSwitchMapping$0[((q82) entry.getKey()).ordinal()] == 1) {
                n86.b = (long[]) value;
            }
        }
        return n86;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [int[], java.io.Serializable] */
    public static final n86 q(Collection collection) {
        n86 n86 = new n86(1);
        Iterator it = collection.iterator();
        int size = collection.size();
        ? r2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            r2[i2] = ((a26) it.next()).a;
        }
        n86.b = r2;
        return n86;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [o86[], java.io.Serializable] */
    public static final n86 r(List list) {
        n86 n86 = new n86(2);
        int size = list.size();
        ? r2 = new o86[size];
        for (int i2 = 0; i2 < size; i2++) {
            r56 r56 = (r56) list.get(i2);
            o86 o86 = new o86();
            o86.a = r56.a;
            o86.b = r56.b;
            o86.c = r56.c;
            String str = "";
            String str2 = r56.d;
            if (str2 == null) {
                str2 = str;
            }
            o86.d = str2;
            Long l = r56.e;
            o86.e = l != null ? l.longValue() : -1;
            String str3 = r56.g;
            if (str3 == null) {
                str3 = str;
            }
            o86.f = str3;
            String str4 = r56.h;
            if (str4 == null) {
                str4 = str;
            }
            o86.g = str4;
            String str5 = r56.f;
            if (str5 != null) {
                str = str5;
            }
            o86.h = str;
            Unit unit = Unit.INSTANCE;
            r2[i2] = o86;
        }
        n86.b = r2;
        return n86;
    }

    public static final EnumSet s(n86 n86) {
        Object obj;
        int[] iArr = (int[]) n86.b;
        EnumSet<E> noneOf = EnumSet.noneOf(a26.class);
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            a26.b.getClass();
            Iterator it = a26.w.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((a26) obj).a == i3) {
                    break;
                }
            }
            a26 a26 = (a26) obj;
            if (a26 != null) {
                noneOf.add(a26);
                i2++;
            } else {
                throw new IllegalStateException(("unsupported type " + i3).toString());
            }
        }
        return noneOf;
    }

    public static final ArrayList t(n86 n86) {
        o86[] o86Arr = (o86[]) n86.b;
        ArrayList arrayList = new ArrayList(o86Arr.length);
        for (o86 o86 : o86Arr) {
            long j2 = o86.a;
            String str = o86.b;
            String str2 = o86.c;
            String str3 = o86.d;
            String str4 = (str3 == null || str3.length() == 0) ? null : str3;
            long j3 = o86.e;
            Long valueOf = j3 == -1 ? null : Long.valueOf(j3);
            String str5 = o86.f;
            String str6 = (str5 == null || str5.length() == 0) ? null : str5;
            String str7 = o86.g;
            String str8 = (str7 == null || str7.length() == 0) ? null : str7;
            String str9 = o86.h;
            if (str9 == null || str9.length() == 0) {
                str9 = null;
            }
            arrayList.add(new r56(j2, str, str2, str4, valueOf, str9, str6, str8));
        }
        return arrayList;
    }

    public static void u(InputStream inputStream) {
        inputStream.read();
        inputStream.read();
        inputStream.read();
        inputStream.read();
    }

    public static final ArrayList v(qx0 qx0) {
        String str;
        try {
            ArrayList arrayList = new ArrayList(1);
            if (qx0.b()) {
                str = qx0.c();
            } else {
                byte[] bytes = qx0.c().getBytes(Charset.forName("UTF-8"));
                MessageDigest instance = MessageDigest.getInstance("SHA-1");
                instance.update(bytes, 0, bytes.length);
                str = Base64.encodeToString(instance.digest(), 11);
            }
            arrayList.add(str);
            return arrayList;
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        } catch (UnsupportedEncodingException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static Pair x(InputStream inputStream) {
        inputStream.skip(7);
        int read = inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE;
        int read2 = inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE;
        int read3 = inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (read != 157 || read2 != 1 || read3 != 42) {
            return null;
        }
        return new Pair(Integer.valueOf((inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE) | ((inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE) << 8)), Integer.valueOf(((inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE) << 8) | (inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE)));
    }

    public static Pair y(InputStream inputStream) {
        u(inputStream);
        if ((inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE) != 47) {
            return null;
        }
        int read = inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE;
        int read2 = inputStream.read();
        return new Pair(Integer.valueOf((read | ((read2 & 63) << 8)) + 1), Integer.valueOf((((inputStream.read() & 15) << 10) | ((inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE) << 2) | ((read2 & 192) >> 6)) + 1));
    }

    public static int z(int i2, Object obj) {
        if (obj == null) {
            return i2 * 37;
        }
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            for (int i3 = 0; i3 < length; i3++) {
                i2 = z(i2, Array.get(obj, i3));
            }
            return i2;
        }
        return (i2 * 37) + obj.hashCode();
    }

    public Matrix a(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3) {
        int i4 = i2;
        int i5 = i3;
        w(matrix, rect, i4, i5, f2, f3, ((float) rect.width()) / ((float) i4), ((float) rect.height()) / ((float) i5));
        return matrix;
    }

    public sp9 k(xp9 xp9) {
        ByteBuffer byteBuffer = xp9.v;
        byteBuffer.getClass();
        n79.g(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return l(xp9, byteBuffer);
    }

    public abstract sp9 l(xp9 xp9, ByteBuffer byteBuffer);

    public abstract void w(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3, float f4, float f5);
}
