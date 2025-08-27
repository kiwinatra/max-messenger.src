package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.jpountz.lz4.LZ4Factory;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import org.apache.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.api.json.JsonStateException;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: kr7  reason: default package */
public abstract class kr7 {
    public static final byte[] X = {48, 48, 49, 0};
    public static final byte[] Y = {48, 48, 50, 0};
    public static volatile LZ4Factory b;
    public static final bpa c = new bpa(10, "RESUME_TOKEN");
    public static final h97 o = new h97("SVG", ".svg");
    public static final byte[] v = {48, 49, 53, 0};
    public static final byte[] w = {48, 49, 48, 0};
    public static final byte[] x = {48, 48, 57, 0};
    public static final byte[] y = {48, 48, 53, 0};
    public static final byte[] z = {48, 48, 49, 0};
    public final /* synthetic */ int a;

    public /* synthetic */ kr7(int i) {
        this.a = i;
    }

    public static final void A(Activity activity) {
        View currentFocus;
        if (activity != null && (currentFocus = activity.getWindow().getCurrentFocus()) != null) {
            B(activity, currentFocus);
        }
    }

    public static final void B(Context context, View view) {
        view.clearFocus();
        try {
            Result.Companion companion = Result.Companion;
            Result.m23constructorimpl(Boolean.valueOf(((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m23constructorimpl(ResultKt.createFailure(th));
        }
    }

    public static final void C(View view) {
        if (view != null) {
            B(view.getContext(), view);
        }
    }

    public static long D(long... jArr) {
        if (jArr.length > 0) {
            long j = jArr[0];
            for (int i = 1; i < jArr.length; i++) {
                long j2 = jArr[i];
                if (j2 > j) {
                    j = j2;
                }
            }
            return j;
        }
        throw new IllegalArgumentException();
    }

    public static JSONObject E(sp7 sp7) {
        try {
            JSONObject jSONObject = new JSONObject();
            sp7.t();
            while (sp7.peek() != 125) {
                jSONObject.put(sp7.name(), F(sp7, JSONObject.NULL));
            }
            sp7.r();
            return jSONObject;
        } catch (JSONException e) {
            throw new AssertionError(e);
        }
    }

    public static Object F(sp7 sp7, Object obj) {
        try {
            int peek = sp7.peek();
            if (peek == 34) {
                return sp7.I();
            }
            if (peek == 49) {
                String W = sp7.W();
                if (W.indexOf(46) >= 0 || W.indexOf(HttpStatus.SC_SWITCHING_PROTOCOLS) >= 0 || W.indexOf(69) >= 0) {
                    return Double.valueOf(Double.parseDouble(W));
                }
                long parseLong = Long.parseLong(W);
                return (parseLong < -2147483648L || parseLong > 2147483647L) ? Long.valueOf(parseLong) : Integer.valueOf((int) parseLong);
            } else if (peek == 91) {
                JSONArray jSONArray = new JSONArray();
                sp7.v();
                while (sp7.peek() != 93) {
                    jSONArray.put(F(sp7, (Object) null));
                }
                sp7.u();
                return jSONArray;
            } else if (peek == 98) {
                return Boolean.valueOf(sp7.b0());
            } else {
                if (peek == 110) {
                    sp7.A();
                    return obj;
                } else if (peek == 123) {
                    return E(sp7);
                } else {
                    throw JsonStateException.d(peek);
                }
            }
        } catch (JsonTypeMismatchException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ex0 G(defpackage.lx6 r25) {
        /*
            r0 = r25
            int r1 = r25.size()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x001a:
            if (r6 >= r1) goto L_0x01c8
            java.lang.String r2 = r0.d(r6)
            java.lang.String r5 = r0.f(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = kotlin.text.StringsKt__StringsJVMKt.equals(r2, r3, true)
            if (r3 == 0) goto L_0x0032
            if (r8 == 0) goto L_0x0030
        L_0x002e:
            r7 = 0
            goto L_0x003b
        L_0x0030:
            r8 = r5
            goto L_0x003b
        L_0x0032:
            java.lang.String r3 = "Pragma"
            boolean r2 = kotlin.text.StringsKt__StringsJVMKt.equals(r2, r3, true)
            if (r2 == 0) goto L_0x01be
            goto L_0x002e
        L_0x003b:
            r2 = 0
        L_0x003c:
            int r3 = r5.length()
            if (r2 >= r3) goto L_0x01b7
            int r3 = r5.length()
            r4 = r2
        L_0x0047:
            if (r4 >= r3) goto L_0x005f
            char r0 = r5.charAt(r4)
            r22 = r1
            java.lang.String r1 = "=,;"
            boolean r0 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r1, (char) r0, false, 2, (java.lang.Object) null)
            if (r0 == 0) goto L_0x0058
            goto L_0x0065
        L_0x0058:
            r0 = 1
            int r4 = r4 + r0
            r0 = r25
            r1 = r22
            goto L_0x0047
        L_0x005f:
            r22 = r1
            int r4 = r5.length()
        L_0x0065:
            java.lang.String r0 = r5.substring(r2, r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
            if (r0 == 0) goto L_0x01b1
            java.lang.CharSequence r0 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r0)
            java.lang.String r0 = r0.toString()
            int r2 = r5.length()
            if (r4 == r2) goto L_0x008b
            char r2 = r5.charAt(r4)
            r3 = 44
            if (r2 == r3) goto L_0x008b
            char r2 = r5.charAt(r4)
            r3 = 59
            if (r2 != r3) goto L_0x0090
        L_0x008b:
            r23 = r7
            r1 = 1
            goto L_0x0109
        L_0x0090:
            r2 = 1
            int r4 = r4 + r2
            byte[] r2 = defpackage.u0g.a
            int r2 = r5.length()
        L_0x0098:
            if (r4 >= r2) goto L_0x00af
            char r3 = r5.charAt(r4)
            r23 = r2
            r2 = 32
            if (r3 == r2) goto L_0x00aa
            r2 = 9
            if (r3 == r2) goto L_0x00aa
            r2 = 1
            goto L_0x00b4
        L_0x00aa:
            r2 = 1
            int r4 = r4 + r2
            r2 = r23
            goto L_0x0098
        L_0x00af:
            r2 = 1
            int r4 = r5.length()
        L_0x00b4:
            int r3 = r5.length()
            if (r4 >= r3) goto L_0x00d1
            char r3 = r5.charAt(r4)
            r23 = r7
            r7 = 34
            if (r3 != r7) goto L_0x00d3
            int r4 = r4 + r2
            r1 = 4
            int r1 = kotlin.text.StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) r5, (char) r7, (int) r4, false, (int) r1, (java.lang.Object) null)
            java.lang.String r3 = r5.substring(r4, r1)
            int r1 = r1 + r2
            r2 = r1
            goto L_0x010c
        L_0x00d1:
            r23 = r7
        L_0x00d3:
            int r2 = r5.length()
            r3 = r4
        L_0x00d8:
            if (r3 >= r2) goto L_0x00ee
            char r7 = r5.charAt(r3)
            r24 = r2
            java.lang.String r2 = ",;"
            boolean r2 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r2, (char) r7, false, 2, (java.lang.Object) null)
            if (r2 == 0) goto L_0x00e9
            goto L_0x00f2
        L_0x00e9:
            r2 = 1
            int r3 = r3 + r2
            r2 = r24
            goto L_0x00d8
        L_0x00ee:
            int r3 = r5.length()
        L_0x00f2:
            java.lang.String r2 = r5.substring(r4, r3)
            if (r2 == 0) goto L_0x0103
            java.lang.CharSequence r1 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r2)
            java.lang.String r1 = r1.toString()
            r2 = r3
            r3 = r1
            goto L_0x010c
        L_0x0103:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0109:
            int r4 = r4 + r1
            r2 = r4
            r3 = 0
        L_0x010c:
            java.lang.String r1 = "no-cache"
            boolean r1 = kotlin.text.StringsKt__StringsJVMKt.equals(r1, r0, true)
            if (r1 == 0) goto L_0x0118
            r4 = -1
            r9 = 1
            goto L_0x01a9
        L_0x0118:
            java.lang.String r1 = "no-store"
            boolean r1 = kotlin.text.StringsKt__StringsJVMKt.equals(r1, r0, true)
            if (r1 == 0) goto L_0x0124
            r4 = -1
            r10 = 1
            goto L_0x01a9
        L_0x0124:
            java.lang.String r1 = "max-age"
            boolean r1 = kotlin.text.StringsKt__StringsJVMKt.equals(r1, r0, true)
            if (r1 == 0) goto L_0x0135
            r1 = -1
            int r0 = defpackage.u0g.w(r1, r3)
            r11 = r0
        L_0x0132:
            r4 = r1
            goto L_0x01a9
        L_0x0135:
            r1 = -1
            java.lang.String r4 = "s-maxage"
            boolean r4 = kotlin.text.StringsKt__StringsJVMKt.equals(r4, r0, true)
            if (r4 == 0) goto L_0x0144
            int r0 = defpackage.u0g.w(r1, r3)
            r12 = r0
            goto L_0x0132
        L_0x0144:
            java.lang.String r1 = "private"
            boolean r1 = kotlin.text.StringsKt__StringsJVMKt.equals(r1, r0, true)
            if (r1 == 0) goto L_0x014f
            r4 = -1
            r13 = 1
            goto L_0x01a9
        L_0x014f:
            java.lang.String r1 = "public"
            boolean r1 = kotlin.text.StringsKt__StringsJVMKt.equals(r1, r0, true)
            if (r1 == 0) goto L_0x015a
            r4 = -1
            r14 = 1
            goto L_0x01a9
        L_0x015a:
            java.lang.String r1 = "must-revalidate"
            boolean r1 = kotlin.text.StringsKt__StringsJVMKt.equals(r1, r0, true)
            if (r1 == 0) goto L_0x0165
            r4 = -1
            r15 = 1
            goto L_0x01a9
        L_0x0165:
            java.lang.String r1 = "max-stale"
            boolean r1 = kotlin.text.StringsKt__StringsJVMKt.equals(r1, r0, true)
            if (r1 == 0) goto L_0x0178
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r0 = defpackage.u0g.w(r0, r3)
            r16 = r0
            r4 = -1
            goto L_0x01a9
        L_0x0178:
            java.lang.String r1 = "min-fresh"
            boolean r1 = kotlin.text.StringsKt__StringsJVMKt.equals(r1, r0, true)
            if (r1 == 0) goto L_0x0188
            r4 = -1
            int r0 = defpackage.u0g.w(r4, r3)
            r17 = r0
            goto L_0x01a9
        L_0x0188:
            r4 = -1
            java.lang.String r1 = "only-if-cached"
            boolean r1 = kotlin.text.StringsKt__StringsJVMKt.equals(r1, r0, true)
            if (r1 == 0) goto L_0x0194
            r18 = 1
            goto L_0x01a9
        L_0x0194:
            java.lang.String r1 = "no-transform"
            boolean r1 = kotlin.text.StringsKt__StringsJVMKt.equals(r1, r0, true)
            if (r1 == 0) goto L_0x019f
            r19 = 1
            goto L_0x01a9
        L_0x019f:
            java.lang.String r1 = "immutable"
            boolean r0 = kotlin.text.StringsKt__StringsJVMKt.equals(r1, r0, true)
            if (r0 == 0) goto L_0x01a9
            r20 = 1
        L_0x01a9:
            r0 = r25
            r1 = r22
            r7 = r23
            goto L_0x003c
        L_0x01b1:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x01b7:
            r22 = r1
            r23 = r7
        L_0x01bb:
            r4 = -1
            r0 = 1
            goto L_0x01c1
        L_0x01be:
            r22 = r1
            goto L_0x01bb
        L_0x01c1:
            int r6 = r6 + r0
            r0 = r25
            r1 = r22
            goto L_0x001a
        L_0x01c8:
            if (r7 != 0) goto L_0x01cd
            r21 = 0
            goto L_0x01cf
        L_0x01cd:
            r21 = r8
        L_0x01cf:
            ex0 r0 = new ex0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr7.G(lx6):ex0");
    }

    public static final int H(String str) {
        int length = str.length();
        if (length == 2) {
            StringBuilder sb = new StringBuilder("#");
            for (int i = 0; i < 8; i++) {
                sb.append(str.charAt(1));
            }
            return Color.parseColor(sb.toString());
        } else if (length == 4) {
            return Color.parseColor("#" + str.charAt(1) + str.charAt(1) + str.charAt(2) + str.charAt(2) + str.charAt(3) + str.charAt(3));
        } else if (length == 7) {
            return Color.parseColor(str);
        } else {
            if (length != 9) {
                return 0;
            }
            return Color.parseColor(str);
        }
    }

    public static void K(y05 y05, ByteBuffer byteBuffer, int i, long j) {
        int c2;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (c2 = y05.c(j, byteBuffer)) != -1) {
            j += (long) c2;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new UnsatisfiedLinkError("ELF file truncated");
    }

    public static void L(yf7 yf7, String str, int i, int i2, boolean z2) {
        if (yf7.b.equals(str)) {
            List list = yf7.a;
            if (((xv0) ((ew0) list.get(i)).get(i2)).y != z2) {
                ((ew0) list.get(i)).set(i2, ((xv0) ((ew0) list.get(i)).get(i2)).a(z2));
            }
        }
    }

    public static void M(j10 j10, long j, long j2, boolean z2) {
        boolean X2 = ld8.X(j10);
        if ((j10.d != null || X2) && !z2 && j2 != 0) {
            if (j2 - j <= CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS) {
                j = 0;
            }
            if (X2) {
                h20 a2 = j10.b().d.d.a();
                a2.k = j;
                a2.e = (long) ((int) j2);
                a2.j = false;
                k20 k20 = new k20(a2);
                j10 j3 = j10.b().d.j();
                j3.d = k20;
                l20 a3 = j3.a();
                r10 a4 = j10.b().a();
                a4.e = a3;
                j10.r = new s10(a4);
                return;
            }
            h20 a5 = j10.c().a();
            a5.k = j;
            a5.e = (long) ((int) j2);
            a5.j = false;
            j10.d = new k20(a5);
        }
    }

    public static void N(CharSequence charSequence, Widget widget) {
        KProperty[] kPropertyArr = BottomSheetWidget.v0;
        kgf kgf = new kgf(iua.a, ArraysKt.toList((T[]) new Object[]{charSequence}));
        e9d e9d = null;
        ng3 a2 = b0h.a(kgf, (Bundle) null, 6);
        a2.f(new igf(iua.f));
        a2.b(gua.c, new igf(iua.e));
        a2.d(gua.b, new igf(iua.d));
        a2.a.putBoolean("memorize_keyboard", false);
        ConfirmationBottomSheet e = a2.e();
        e.setTargetController(widget);
        zx3 zx3 = widget;
        while (zx3.getParentController() != null) {
            zx3 = zx3.getParentController();
        }
        l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
        if (l9d != null) {
            e9d = l9d.K();
        }
        e.p0(widget);
        if (e9d != null) {
            i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
            a81.t(false, i9d, true, "BottomSheetWidget");
            e9d.G(i9d);
        }
    }

    public static final e99 O(szf szf) {
        int i = tzf.$EnumSwitchMapping$0[szf.ordinal()];
        if (i == 1) {
            return e99.LINK;
        }
        if (i == 2) {
            return e99.PHONE_NUMBER;
        }
        if (i == 3) {
            return e99.EMAIL;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [b20, java.lang.Object] */
    public static void P(m20 m20, String str, qk3 qk3) {
        for (int i = 0; i < m20.b(); i++) {
            l20 d = m20.d(i);
            if (ld8.x(str, d.q)) {
                j10 j = d.j();
                qk3.accept(j);
                m20.e(i, j.a());
                return;
            }
            if (d.g()) {
                c20 c20 = d.g;
                if (c20.b()) {
                    l20 l20 = c20.g;
                    if (ld8.x(str, l20.q)) {
                        j10 j2 = l20.j();
                        qk3.accept(j2);
                        ? obj = new Object();
                        obj.a = c20.a;
                        obj.b = c20.b;
                        obj.c = c20.c;
                        obj.d = c20.d;
                        obj.e = c20.e;
                        obj.f = c20.f;
                        obj.g = l20;
                        obj.h = c20.h;
                        obj.g = j2.a();
                        j10 j3 = d.j();
                        j3.g = new c20(obj);
                        m20.e(i, j3.a());
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public static void Q(j10 j10, d20 d20, long j) {
        j10.i = d20;
        if (d20.b()) {
            j10.j = j;
        }
        if (d20 == d20.a) {
            j10.k = c44.DEFAULT_ASPECT_RATIO;
        }
    }

    /* JADX WARNING: type inference failed for: r1v19, types: [java.lang.Object, m10] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void R(defpackage.ha9 r22, defpackage.m20 r23, defpackage.w28 r24) {
        /*
            r0 = r23
            r1 = r24
            java.lang.Object r2 = r1.c
            zf7 r2 = (defpackage.zf7) r2
            r0.b = r2
            boolean r2 = r22.q()
            if (r2 == 0) goto L_0x0011
            return
        L_0x0011:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            m20 r3 = r24.Q()
            r5 = 0
        L_0x001b:
            int r6 = r24.G()
            if (r5 >= r6) goto L_0x0287
            l20 r6 = r1.F(r5)
            r7 = 0
        L_0x0026:
            int r8 = r23.b()
            if (r7 >= r8) goto L_0x0271
            l20 r8 = r0.d(r7)
            java.lang.String r9 = r8.q
            boolean r9 = r2.contains(r9)
            if (r9 == 0) goto L_0x003e
        L_0x0038:
            r16 = r2
            r17 = r3
            goto L_0x0265
        L_0x003e:
            g20 r9 = r6.a
            g20 r10 = r8.a
            if (r9 == r10) goto L_0x0045
            goto L_0x0038
        L_0x0045:
            boolean r9 = r8.f()
            n10 r10 = r8.k
            s10 r11 = r8.j
            k20 r12 = r8.d
            i10 r13 = r8.e
            x10 r14 = r8.b
            n10 r15 = r6.k
            s10 r4 = r6.j
            k20 r1 = r6.d
            i10 r0 = r6.e
            r16 = r2
            x10 r2 = r6.b
            if (r9 == 0) goto L_0x007f
            boolean r9 = r6.f()
            if (r9 == 0) goto L_0x007f
            r17 = r10
            long r9 = r14.y
            r18 = r14
            r19 = r15
            long r14 = r2.y
            int r9 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x0076
            goto L_0x0085
        L_0x0076:
            r9 = r17
            r10 = r19
            r17 = r3
            r19 = r4
            goto L_0x00dd
        L_0x007f:
            r17 = r10
            r18 = r14
            r19 = r15
        L_0x0085:
            boolean r9 = r8.a()
            if (r9 == 0) goto L_0x0099
            boolean r9 = r6.a()
            if (r9 == 0) goto L_0x0099
            long r9 = r13.a
            long r14 = r0.a
            int r9 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x0076
        L_0x0099:
            boolean r9 = r8.i()
            if (r9 == 0) goto L_0x00ad
            boolean r9 = r6.i()
            if (r9 == 0) goto L_0x00ad
            long r9 = r12.a
            long r14 = r1.a
            int r9 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x0076
        L_0x00ad:
            boolean r9 = r8.c()
            if (r9 == 0) goto L_0x00c1
            boolean r9 = r6.c()
            if (r9 == 0) goto L_0x00c1
            long r9 = r11.a
            long r14 = r4.a
            int r9 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x0076
        L_0x00c1:
            boolean r9 = r8.b()
            if (r9 == 0) goto L_0x00e0
            boolean r9 = r6.b()
            if (r9 == 0) goto L_0x00e0
            r9 = r17
            long r14 = r9.b
            r17 = r3
            r10 = r19
            r19 = r4
            long r3 = r10.b
            int r3 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x00e8
        L_0x00dd:
            r3 = r18
            goto L_0x0108
        L_0x00e0:
            r9 = r17
            r10 = r19
            r17 = r3
            r19 = r4
        L_0x00e8:
            boolean r3 = r8.f()
            if (r3 == 0) goto L_0x0265
            boolean r3 = r6.f()
            if (r3 != 0) goto L_0x00f6
            goto L_0x0265
        L_0x00f6:
            r3 = r18
            long r14 = r3.y
            r20 = 0
            int r4 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r4 != 0) goto L_0x0265
            long r14 = r2.y
            int r4 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r4 == 0) goto L_0x0265
            if (r5 != r7) goto L_0x0265
        L_0x0108:
            boolean r4 = r6.f()
            if (r4 != 0) goto L_0x012c
            boolean r4 = r6.a()
            if (r4 != 0) goto L_0x012c
            boolean r4 = r6.i()
            if (r4 != 0) goto L_0x012c
            boolean r4 = r6.c()
            if (r4 != 0) goto L_0x012c
            boolean r4 = r6.b()
            if (r4 != 0) goto L_0x012c
            boolean r4 = r6.e()
            if (r4 == 0) goto L_0x0262
        L_0x012c:
            j10 r4 = r6.j()
            java.lang.String r7 = r8.r
            r4.m = r7
            java.lang.String r7 = r8.q
            r4.l = r7
            d20 r7 = r8.n
            r4.i = r7
            long r14 = r8.t
            r4.o = r14
            long r14 = r8.u
            r4.p = r14
            long r14 = r8.v
            r4.u = r14
            long r14 = r8.o
            r4.j = r14
            z10 r7 = r8.w
            r4.w = r7
            boolean r7 = r8.x
            if (r7 == 0) goto L_0x015a
            boolean r7 = r6.y
            if (r7 == 0) goto L_0x015a
            r7 = 1
            goto L_0x015b
        L_0x015a:
            r7 = 0
        L_0x015b:
            r4.x = r7
            boolean r7 = r6.i()
            if (r7 == 0) goto L_0x018e
            boolean r7 = r1.f
            if (r7 != 0) goto L_0x018e
            h20 r1 = r1.a()
            long r14 = r12.j
            r1.k = r14
            int r7 = r12.d
            r1.b = r7
            int r7 = r12.e
            r1.c = r7
            j20 r7 = r12.k
            r1.o = r7
            boolean r7 = r12.n
            r1.l = r7
            int r7 = r12.o
            r1.i = r7
            int r7 = r12.p
            r1.m = r7
            k20 r7 = new k20
            r7.<init>(r1)
            r4.d = r7
        L_0x018e:
            boolean r1 = defpackage.ld8.Y(r6)
            if (r1 == 0) goto L_0x01e2
            boolean r1 = defpackage.ld8.Y(r8)
            if (r1 == 0) goto L_0x01e2
            l20 r1 = r11.d
            k20 r1 = r1.d
            r7 = r19
            l20 r11 = r7.d
            k20 r11 = r11.d
            h20 r11 = r11.a()
            long r14 = r1.j
            r11.k = r14
            int r12 = r1.d
            r11.b = r12
            int r12 = r1.e
            r11.c = r12
            j20 r12 = r1.k
            r11.o = r12
            boolean r12 = r1.n
            r11.l = r12
            int r12 = r1.o
            r11.i = r12
            int r1 = r1.p
            r11.m = r1
            k20 r1 = new k20
            r1.<init>(r11)
            l20 r11 = r7.d
            j10 r11 = r11.j()
            r11.d = r1
            l20 r1 = r11.a()
            r10 r7 = r7.a()
            r7.e = r1
            s10 r1 = new s10
            r1.<init>(r7)
            r4.r = r1
        L_0x01e2:
            boolean r1 = r6.b()
            if (r1 == 0) goto L_0x0218
            m10 r1 = new m10
            r1.<init>()
            java.lang.String r7 = r10.a
            r1.a = r7
            long r11 = r10.b
            r1.b = r11
            java.lang.String r7 = r10.c
            r1.c = r7
            java.lang.String r7 = r10.f
            r1.f = r7
            java.lang.String r7 = r10.g
            r1.g = r7
            java.lang.String r7 = r10.h
            r1.h = r7
            java.lang.String r7 = r10.d
            r1.d = r7
            java.lang.String r7 = r10.e
            r1.e = r7
            java.lang.String r7 = r9.h
            r1.h = r7
            n10 r7 = new n10
            r7.<init>(r1)
            r4.s = r7
        L_0x0218:
            boolean r1 = r6.f()
            if (r1 == 0) goto L_0x022d
            w10 r1 = r2.b()
            java.lang.String r2 = r3.X
            r1.j = r2
            x10 r2 = new x10
            r2.<init>(r1)
            r4.b = r2
        L_0x022d:
            boolean r1 = r6.e()
            if (r1 == 0) goto L_0x0245
            u10 r1 = r6.m
            t10 r1 = r1.a()
            u10 r2 = r8.m
            v10 r2 = r2.i
            r1.i = r2
            u10 r1 = r1.a()
            r4.v = r1
        L_0x0245:
            boolean r1 = r6.a()
            if (r1 == 0) goto L_0x025e
            h10 r0 = r0.a()
            long r1 = r13.g
            r0.g = r1
            long r1 = r13.h
            r0.h = r1
            i10 r1 = new i10
            r1.<init>(r0)
            r4.e = r1
        L_0x025e:
            l20 r6 = r4.a()
        L_0x0262:
            r0 = r17
            goto L_0x0274
        L_0x0265:
            int r7 = r7 + 1
            r0 = r23
            r1 = r24
            r2 = r16
            r3 = r17
            goto L_0x0026
        L_0x0271:
            r16 = r2
            r0 = r3
        L_0x0274:
            r0.e(r5, r6)
            java.lang.String r1 = r6.q
            r2 = r16
            r2.add(r1)
            int r5 = r5 + 1
            r1 = r24
            r3 = r0
            r0 = r23
            goto L_0x001b
        L_0x0287:
            r0 = r3
            w28 r0 = r0.c()
            java.lang.Object r0 = r0.b
            java.util.List r0 = (java.util.List) r0
            r1 = r23
            r1.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr7.R(ha9, m20, w28):void");
    }

    public static final void S(fwf fwf) {
        fwf.c(oa4.class, new ufg(6));
    }

    public static final yq9 a(nf7 nf7, vq7 vq7) {
        nf7 nf72 = nf7;
        long j = nf72.a;
        String str = nf72.b;
        String str2 = nf72.c;
        String str3 = str2.length() == 0 ? null : str2;
        String str4 = nf72.d;
        rf7[] rf7Arr = nf72.q;
        rf7[] rf7Arr2 = (rf7Arr.length == 0) ^ true ? rf7Arr : null;
        String str5 = nf72.p;
        String str6 = str5.length() == 0 ? null : str5;
        String str7 = nf72.e;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = str7;
        long j2 = nf72.f;
        int i = nf72.g;
        int i2 = nf72.h;
        boolean z2 = nf72.i;
        int i3 = i;
        boolean z3 = nf72.j;
        boolean z4 = nf72.k;
        long j3 = j2;
        long j4 = nf72.l;
        boolean z5 = z2;
        long j5 = nf72.m;
        Long valueOf = j5 > 0 ? Long.valueOf(j5) : null;
        long j6 = nf72.r;
        String str9 = nf72.n;
        String str10 = str9.length() == 0 ? null : str9;
        byte[] bArr = nf72.o;
        return new yq9(j, str, str3, str4, rf7Arr2, str6, str8, j3, i3, i2, z5, z3, z4, j4, valueOf, j6, nf72.s, str10, (bArr.length == 0) ^ true ? bArr : null, (CharSequence) vq7.invoke(nf72), nf72.t);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [q2f, qm7] */
    public static q2f b() {
        return new qm7((pm7) null);
    }

    public static Object c(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void e(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Integer[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Integer[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Integer[], java.io.Serializable] */
    public static final Bundle f(Collection collection) {
        Bundle bundle = new Bundle((collection.size() * 5) + 1);
        bundle.putInt("size", collection.size());
        int[] iArr = new int[collection.size()];
        ? r2 = new Integer[collection.size()];
        ? r3 = new Integer[collection.size()];
        ? r4 = new Integer[collection.size()];
        int i = 0;
        for (Object next : collection) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ow3 ow3 = (ow3) next;
            iArr[i] = ow3.a;
            bundle.putParcelable(wj6.h(i, "text_"), ow3.b);
            r2[i] = ow3.c;
            r3[i] = ow3.d;
            r4[i] = ow3.e;
            i = i2;
        }
        bundle.putIntArray("ids", iArr);
        bundle.putSerializable("textColors", r2);
        bundle.putSerializable("icons", r3);
        bundle.putSerializable("iconColors", r4);
        return bundle;
    }

    public static final Collection g(Bundle bundle) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            int i = bundle.getInt("size");
            int[] intArray = bundle.getIntArray("ids");
            if (intArray != null) {
                Integer[] numArr = (Integer[]) bundle.getSerializable("textColors");
                Integer[] numArr2 = (Integer[]) bundle.getSerializable("icons");
                Integer[] numArr3 = (Integer[]) bundle.getSerializable("iconColors");
                IntRange until = RangesKt.until(0, i);
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
                Iterator it = until.iterator();
                while (it.hasNext()) {
                    int nextInt = ((IntIterator) it).nextInt();
                    int i2 = intArray[nextInt];
                    Parcelable parcelable = bundle.getParcelable("text_" + nextInt);
                    if (parcelable != null) {
                        arrayList.add(new ow3(i2, (ngf) parcelable, numArr[nextInt], numArr2[nextInt], numArr3[nextInt]));
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                obj = Result.m23constructorimpl(arrayList);
                Throwable r0 = Result.m26exceptionOrNullimpl(obj);
                if (r0 != null) {
                    r0.printStackTrace();
                }
                if (Result.m29isFailureimpl(obj)) {
                    obj = null;
                }
                List list = (List) obj;
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                return list;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
    }

    public static final LinkedHashMap h(AttributeSet attributeSet) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            linkedHashMap.put(attributeSet.getAttributeName(i), Integer.valueOf(i));
        }
        return linkedHashMap;
    }

    public static final void i(ni0 ni0, View view) {
        if (view != null) {
            tr1.u((float) 2, vo4.c().getDisplayMetrics().density, ni0.d(view.getId()));
            return;
        }
        ni0.b(0);
    }

    public static final void m(pj3 pj3, View view, View view2, int i) {
        if (view != null) {
            int id = view.getId();
            pj3.e(id, 3, 0, 3);
            pj3.e(id, 4, 0, 4);
            if (view2 != null) {
                pj3.e(id, 7, view2.getId(), 6);
                new ila(pj3, 7, id, 4).e(i);
            } else {
                pj3.e(id, 7, 0, 7);
            }
        }
        if (view2 != null) {
            int id2 = view2.getId();
            pj3.e(id2, 3, 0, 3);
            pj3.e(id2, 4, 0, 4);
            pj3.e(id2, 7, 0, 7);
        }
    }

    public static final void n(pj3 pj3, View view) {
        if (view != null) {
            int id = view.getId();
            pj3.e(id, 3, 0, 3);
            pj3.e(id, 4, 0, 4);
        }
    }

    public static u3c r(Collection collection, ngf ngf, ngf ngf2) {
        int i = jxa.A0;
        igf igf = new igf(lxa.a2);
        og3 og3 = og3.a;
        return new u3c(ngf, ngf2, CollectionsKt.listOf(new pg3(i, igf, og3), new pg3(jxa.C0, new igf(lxa.c2), og3), new pg3(jxa.B0, new igf(lxa.b2), og3.b)), o54.f(TuplesKt.to("profile:memberslist:ids_to_delete", CollectionsKt.toLongArray(collection))));
    }

    public static String[] s(y05 y05) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        int i;
        long j6;
        long j7;
        long j8;
        long j9;
        char c2;
        long j10;
        long j11;
        long j12;
        short s;
        long j13;
        long j14;
        long j15;
        long j16;
        y05 y052 = y05;
        int i2 = 8;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long x2 = x(y052, allocate, 0);
        if (x2 == 1179403647) {
            K(y052, allocate, 1, 4);
            boolean z2 = ((short) (allocate.get() & UByte.MAX_VALUE)) == 1;
            K(y052, allocate, 1, 5);
            if (((short) (allocate.get() & UByte.MAX_VALUE)) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            if (z2) {
                j = x(y052, allocate, 28);
            } else {
                K(y052, allocate, 8, 32);
                j = allocate.getLong();
            }
            if (z2) {
                K(y052, allocate, 2, 44);
                j2 = (long) (allocate.getShort() & UShort.MAX_VALUE);
            } else {
                K(y052, allocate, 2, 56);
                j2 = (long) (allocate.getShort() & UShort.MAX_VALUE);
            }
            K(y052, allocate, 2, z2 ? 42 : 54);
            short s2 = allocate.getShort() & UShort.MAX_VALUE;
            if (j2 == 65535) {
                if (z2) {
                    j16 = x(y052, allocate, 32);
                } else {
                    K(y052, allocate, 8, 40);
                    j16 = allocate.getLong();
                }
                j2 = z2 ? x(y052, allocate, j16 + 28) : x(y052, allocate, j16 + 44);
            }
            long j17 = j;
            long j18 = 0;
            while (true) {
                if (j18 >= j2) {
                    j3 = 0;
                    break;
                }
                if ((z2 ? x(y052, allocate, j17) : x(y052, allocate, j17)) != 2) {
                    j17 += (long) s2;
                    j18++;
                } else if (z2) {
                    j3 = x(y052, allocate, j17 + 4);
                } else {
                    K(y052, allocate, 8, j17 + 8);
                    j3 = allocate.getLong();
                }
            }
            if (j3 != 0) {
                long j19 = j3;
                int i3 = 0;
                long j20 = 0;
                while (true) {
                    if (z2) {
                        j4 = x(y052, allocate, j19);
                    } else {
                        K(y052, allocate, i2, j19);
                        j4 = allocate.getLong();
                    }
                    int i4 = (j4 > 1 ? 1 : (j4 == 1 ? 0 : -1));
                    char c3 = CharCompanionObject.MAX_VALUE;
                    if (i4 != 0) {
                        j5 = j3;
                        if (j4 == 5) {
                            if (z2) {
                                j15 = x(y052, allocate, j19 + 4);
                            } else {
                                K(y052, allocate, 8, j19 + 8);
                                j15 = allocate.getLong();
                            }
                            j20 = j15;
                        }
                    } else if (i3 != Integer.MAX_VALUE) {
                        i3++;
                        j5 = j3;
                    } else {
                        throw new UnsatisfiedLinkError("malformed DT_NEEDED section");
                    }
                    j19 += z2 ? 8 : 16;
                    if (j4 != 0) {
                        long j21 = j2;
                        long j22 = j20;
                        j2 = j21;
                        j3 = j5;
                        i2 = 8;
                    } else if (j20 != 0) {
                        long j23 = j;
                        int i5 = 0;
                        while (true) {
                            if (((long) i5) >= j2) {
                                i = i3;
                                j6 = 0;
                                j7 = 0;
                                break;
                            }
                            if ((z2 ? x(y052, allocate, j23) : x(y052, allocate, j23)) == 1) {
                                if (z2) {
                                    j11 = j2;
                                    j12 = x(y052, allocate, j23 + 8);
                                } else {
                                    j11 = j2;
                                    K(y052, allocate, 8, j23 + 16);
                                    j12 = allocate.getLong();
                                }
                                if (z2) {
                                    j13 = x(y052, allocate, j23 + 20);
                                    s = s2;
                                    i = i3;
                                } else {
                                    s = s2;
                                    i = i3;
                                    K(y052, allocate, 8, j23 + 40);
                                    j13 = allocate.getLong();
                                }
                                if (j12 > j20 || j20 >= j13 + j12) {
                                    s2 = s;
                                } else {
                                    if (z2) {
                                        j14 = x(y052, allocate, j23 + 4);
                                    } else {
                                        K(y052, allocate, 8, j23 + 8);
                                        j14 = allocate.getLong();
                                    }
                                    j7 = j14 + (j20 - j12);
                                    j6 = 0;
                                }
                            } else {
                                i = i3;
                                j11 = j2;
                            }
                            j23 += (long) s2;
                            i5++;
                            i3 = i;
                            j2 = j11;
                        }
                        if (j7 != j6) {
                            int i6 = i;
                            String[] strArr = new String[i6];
                            long j24 = j5;
                            int i7 = 0;
                            while (true) {
                                if (z2) {
                                    j8 = x(y052, allocate, j24);
                                } else {
                                    K(y052, allocate, 8, j24);
                                    j8 = allocate.getLong();
                                }
                                if (j8 == 1) {
                                    if (z2) {
                                        j10 = x(y052, allocate, j24 + 4);
                                    } else {
                                        K(y052, allocate, 8, j24 + 8);
                                        j10 = allocate.getLong();
                                    }
                                    long j25 = j10 + j7;
                                    StringBuilder sb = new StringBuilder();
                                    while (true) {
                                        long j26 = j25 + 1;
                                        j9 = j7;
                                        K(y052, allocate, 1, j25);
                                        short s3 = (short) (allocate.get() & UByte.MAX_VALUE);
                                        if (s3 == 0) {
                                            break;
                                        }
                                        sb.append((char) s3);
                                        j25 = j26;
                                        j7 = j9;
                                    }
                                    strArr[i7] = sb.toString();
                                    c2 = CharCompanionObject.MAX_VALUE;
                                    if (i7 != Integer.MAX_VALUE) {
                                        i7++;
                                    } else {
                                        throw new UnsatisfiedLinkError("malformed DT_NEEDED section");
                                    }
                                } else {
                                    j9 = j7;
                                    c2 = c3;
                                }
                                j24 += z2 ? 8 : 16;
                                if (j8 != 0) {
                                    c3 = c2;
                                    j7 = j9;
                                } else if (i7 == i6) {
                                    return strArr;
                                } else {
                                    throw new UnsatisfiedLinkError("malformed DT_NEEDED section");
                                }
                            }
                        } else {
                            throw new UnsatisfiedLinkError("did not find file offset of DT_STRTAB table");
                        }
                    } else {
                        throw new UnsatisfiedLinkError("Dynamic section string-table not found");
                    }
                }
            } else {
                throw new UnsatisfiedLinkError("ELF file does not contain dynamic linking information");
            }
        } else {
            throw new UnsatisfiedLinkError("file is not ELF: magic is 0x" + Long.toHexString(x2) + ", it should be " + Long.toHexString(1179403647));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r4 = r4.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long t(defpackage.a32 r4) {
        /*
            long r0 = r4.o()
            a89 r4 = r4.c
            if (r4 == 0) goto L_0x000f
            ha9 r4 = r4.a
            if (r4 == 0) goto L_0x000f
            long r2 = r4.o
            goto L_0x0014
        L_0x000f:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0014:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0019
            r0 = r2
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr7.t(a32):long");
    }

    public static LZ4Factory u() {
        if (b == null) {
            synchronized (kr7.class) {
                try {
                    if (b == null) {
                        b = LZ4Factory.fastestInstance();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static Matrix v(ft ftVar, ft ftVar2, int i) {
        int y2 = tr1.y(i);
        int i2 = ftVar.c;
        int i3 = ftVar.b;
        int i4 = ftVar2.c;
        int i5 = ftVar2.b;
        if (y2 == 0) {
            Matrix matrix = new Matrix();
            matrix.setScale(((float) i3) / ((float) i5), ((float) i2) / ((float) i4), c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
            return matrix;
        } else if (y2 == 1) {
            float f = ((float) i5) / ((float) i3);
            float f2 = (float) i4;
            float f3 = f2 / ((float) i2);
            float min = Math.min(f, f3);
            Matrix matrix2 = new Matrix();
            matrix2.setScale(min / f, min / f3, ((float) i5) / 2.0f, f2 / 2.0f);
            return matrix2;
        } else if (y2 == 2) {
            float f4 = ((float) i5) / ((float) i3);
            float f5 = (float) i4;
            float f6 = f5 / ((float) i2);
            float max = Math.max(f4, f6);
            Matrix matrix3 = new Matrix();
            matrix3.setScale(max / f4, max / f6, ((float) i5) / 2.0f, f5 / 2.0f);
            return matrix3;
        } else {
            throw new IllegalArgumentException("Unknown scale type = ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "CENTER_CROP" : "FIT_CENTER" : "NONE"));
        }
    }

    public static final int w(View view) {
        if (view == null) {
            return 0;
        }
        return g63.b((float) 12, vo4.c().getDisplayMetrics().density, view.getMeasuredWidth());
    }

    public static long x(y05 y05, ByteBuffer byteBuffer, long j) {
        K(y05, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public static int y(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final void z(zx3 zx3) {
        Activity activity = zx3.getActivity();
        if (activity != null) {
            A(activity);
        }
    }

    public abstract void I(m1 m1Var, m1 m1Var2);

    public abstract void J(m1 m1Var, Thread thread);

    public abstract boolean j(o1 o1Var, z0 z0Var, z0 z0Var2);

    public abstract boolean k(o1 o1Var, Object obj, Object obj2);

    public abstract boolean l(o1 o1Var, m1 m1Var, m1 m1Var2);

    public rp9 o(wp9 wp9) {
        ByteBuffer byteBuffer = wp9.o;
        byteBuffer.getClass();
        y64.g(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (wp9.h(IntCompanionObject.MIN_VALUE)) {
            return null;
        }
        return p(wp9, byteBuffer);
    }

    public abstract rp9 p(wp9 wp9, ByteBuffer byteBuffer);

    public abstract Object q();

    public String toString() {
        switch (this.a) {
            case 11:
                return q().toString();
            default:
                return super.toString();
        }
    }
}
