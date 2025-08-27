package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.a;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;

/* renamed from: hr6  reason: default package */
public final class hr6 implements Provider {
    public static final /* synthetic */ int w = 0;
    public Object a;
    public Object b;
    public Object c;
    public Object o;
    public Object v;

    public hr6(ar5 ar5) {
        this.a = ar5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.hr6 r4, long r5, java.util.List r7, kotlin.coroutines.Continuation r8) {
        /*
            r4.getClass()
            boolean r0 = r8 instanceof defpackage.fr6
            if (r0 == 0) goto L_0x0016
            r0 = r8
            fr6 r0 = (defpackage.fr6) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x001b
        L_0x0016:
            fr6 r0 = new fr6
            r0.<init>(r4, r8)
        L_0x001b:
            java.lang.Object r8 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x004f
        L_0x002c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r4 = r4.c
            kotlin.Lazy r4 = (kotlin.Lazy) r4
            java.lang.Object r4 = r4.getValue()
            ocf r4 = (defpackage.ocf) r4
            np2 r8 = new np2
            r8.<init>((long) r5, (java.util.List) r7)
            r0.c = r3
            java.lang.Object r8 = r4.e(r8, r0)
            if (r8 != r1) goto L_0x004f
            goto L_0x0053
        L_0x004f:
            qv9 r8 = (defpackage.qv9) r8
            java.util.List r1 = r8.o
        L_0x0053:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hr6.a(hr6, long, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void A(String str) {
        Class<Object> cls = Object.class;
        if (str == null) {
            ((Map) this.v).remove(cls);
            return;
        }
        if (((Map) this.v).isEmpty()) {
            this.v = new LinkedHashMap();
        }
        ((Map) this.v).put(cls, cls.cast(str));
    }

    public void B(View view, int i, int i2, int i3) {
        long[] jArr = (long[]) this.o;
        if (jArr != null) {
            jArr[i] = (((long) i2) & 4294967295L) | (((long) i3) << 32);
        }
        long[] jArr2 = (long[]) this.v;
        if (jArr2 != null) {
            jArr2[i] = (((long) view.getMeasuredWidth()) & 4294967295L) | (((long) view.getMeasuredHeight()) << 32);
        }
    }

    public void C(String str) {
        if (StringsKt__StringsJVMKt.startsWith(str, "ws:", true)) {
            str = "http:" + str.substring(3);
        } else if (StringsKt__StringsJVMKt.startsWith(str, "wss:", true)) {
            str = "https:" + str.substring(4);
        }
        sd3 sd3 = new sd3();
        sd3.n((m57) null, str);
        this.a = sd3.c();
    }

    public void b(List list, cr5 cr5, int i, int i2) {
        cr5.i = i2;
        ((ar5) this.a).getClass();
        cr5.l = i;
        list.add(cr5);
    }

    public y2d c() {
        m57 m57 = (m57) this.a;
        if (m57 != null) {
            String str = (String) this.b;
            lx6 n = ((e4) this.c).n();
            hd8 hd8 = (hd8) this.o;
            Map map = (Map) this.v;
            byte[] bArr = u0g.a;
            return new y2d(m57, str, n, hd8, map.isEmpty() ? MapsKt.emptyMap() : Collections.unmodifiableMap(new LinkedHashMap(map)));
        }
        throw new IllegalStateException("url == null".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x047f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x024e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(defpackage.rt6 r26, int r27, int r28, int r29, int r30, int r31, java.util.List r32) {
        /*
            r25 = this;
            r0 = r25
            r1 = r31
            java.lang.Object r3 = r0.a
            ar5 r3 = (defpackage.ar5) r3
            r4 = r3
            com.google.android.flexbox.FlexboxLayoutManager r4 = (com.google.android.flexbox.FlexboxLayoutManager) r4
            boolean r5 = r4.c1()
            int r6 = android.view.View.MeasureSpec.getMode(r27)
            int r7 = android.view.View.MeasureSpec.getSize(r27)
            if (r32 != 0) goto L_0x0021
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = r26
            goto L_0x0025
        L_0x0021:
            r9 = r26
            r8 = r32
        L_0x0025:
            r9.b = r8
            r10 = -1
            if (r1 != r10) goto L_0x002c
            r11 = 1
            goto L_0x002d
        L_0x002c:
            r11 = 0
        L_0x002d:
            if (r5 == 0) goto L_0x003f
            r12 = r3
            androidx.recyclerview.widget.a r12 = (androidx.recyclerview.widget.a) r12
            androidx.recyclerview.widget.RecyclerView r12 = r12.b
            if (r12 == 0) goto L_0x003d
            java.util.WeakHashMap r13 = defpackage.gag.a
            int r12 = r12.getPaddingStart()
            goto L_0x0046
        L_0x003d:
            r12 = 0
            goto L_0x0046
        L_0x003f:
            r12 = r3
            androidx.recyclerview.widget.a r12 = (androidx.recyclerview.widget.a) r12
            int r12 = r12.L()
        L_0x0046:
            if (r5 == 0) goto L_0x0058
            r13 = r3
            androidx.recyclerview.widget.a r13 = (androidx.recyclerview.widget.a) r13
            androidx.recyclerview.widget.RecyclerView r13 = r13.b
            if (r13 == 0) goto L_0x0056
            java.util.WeakHashMap r14 = defpackage.gag.a
            int r13 = r13.getPaddingEnd()
            goto L_0x005f
        L_0x0056:
            r13 = 0
            goto L_0x005f
        L_0x0058:
            r13 = r3
            androidx.recyclerview.widget.a r13 = (androidx.recyclerview.widget.a) r13
            int r13 = r13.I()
        L_0x005f:
            if (r5 == 0) goto L_0x0069
            r14 = r3
            androidx.recyclerview.widget.a r14 = (androidx.recyclerview.widget.a) r14
            int r14 = r14.L()
            goto L_0x0078
        L_0x0069:
            r14 = r3
            androidx.recyclerview.widget.a r14 = (androidx.recyclerview.widget.a) r14
            androidx.recyclerview.widget.RecyclerView r14 = r14.b
            if (r14 == 0) goto L_0x0077
            java.util.WeakHashMap r15 = defpackage.gag.a
            int r14 = r14.getPaddingStart()
            goto L_0x0078
        L_0x0077:
            r14 = 0
        L_0x0078:
            if (r5 == 0) goto L_0x0082
            r15 = r3
            androidx.recyclerview.widget.a r15 = (androidx.recyclerview.widget.a) r15
            int r15 = r15.I()
            goto L_0x0091
        L_0x0082:
            r15 = r3
            androidx.recyclerview.widget.a r15 = (androidx.recyclerview.widget.a) r15
            androidx.recyclerview.widget.RecyclerView r15 = r15.b
            if (r15 == 0) goto L_0x0090
            java.util.WeakHashMap r16 = defpackage.gag.a
            int r15 = r15.getPaddingEnd()
            goto L_0x0091
        L_0x0090:
            r15 = 0
        L_0x0091:
            cr5 r9 = new cr5
            r9.<init>()
            r10 = r30
            r9.k = r10
            int r12 = r12 + r13
            r9.a = r12
            lzc r13 = r4.y
            int r13 = r13.b()
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r19 = r16
            r17 = 0
            r18 = 0
        L_0x00ab:
            if (r10 >= r13) goto L_0x049a
            android.view.View r2 = r4.Y0(r10)
            if (r2 != 0) goto L_0x00d1
            r20 = 1
            int r2 = r13 + -1
            if (r10 != r2) goto L_0x00cc
            int r2 = r9.d
            r30 = r11
            int r11 = r9.e
            int r2 = r2 - r11
            r11 = r17
            if (r2 == 0) goto L_0x00c7
            r0.b(r8, r9, r10, r11)
        L_0x00c7:
            r17 = r3
            r32 = r14
            goto L_0x00f6
        L_0x00cc:
            r30 = r11
            r11 = r17
            goto L_0x00c7
        L_0x00d1:
            r30 = r11
            r11 = r17
            int r1 = r2.getVisibility()
            r17 = r3
            r3 = 8
            if (r1 != r3) goto L_0x010e
            int r1 = r9.e
            r2 = 1
            int r1 = r1 + r2
            r9.e = r1
            int r3 = r9.d
            int r3 = r3 + r2
            r9.d = r3
            r32 = r14
            int r14 = r13 + -1
            if (r10 != r14) goto L_0x00f6
            int r3 = r3 - r1
            if (r3 == 0) goto L_0x00f6
            r0.b(r8, r9, r10, r11)
        L_0x00f6:
            r2 = r31
            r24 = r5
            r22 = r6
            r21 = r7
            r5 = r8
            r8 = r11
            r20 = r13
            r1 = r19
            r3 = -1
            r7 = 1
            r6 = r29
            r11 = r30
            r19 = r12
            goto L_0x0483
        L_0x010e:
            r32 = r14
            boolean r1 = r2 instanceof android.widget.CompoundButton
            if (r1 == 0) goto L_0x014c
            r1 = r2
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            br5 r3 = (defpackage.br5) r3
            er5 r3 = (defpackage.er5) r3
            int r14 = r3.z
            r20 = r13
            int r13 = r3.X
            android.graphics.drawable.Drawable r1 = defpackage.kd3.a(r1)
            if (r1 != 0) goto L_0x012e
            r21 = 0
            goto L_0x0132
        L_0x012e:
            int r21 = r1.getMinimumWidth()
        L_0x0132:
            if (r1 != 0) goto L_0x0138
            r1 = -1
            r22 = 0
            goto L_0x013f
        L_0x0138:
            int r1 = r1.getMinimumHeight()
            r22 = r1
            r1 = -1
        L_0x013f:
            if (r14 != r1) goto L_0x0143
            r14 = r21
        L_0x0143:
            r3.z = r14
            if (r13 != r1) goto L_0x0149
            r13 = r22
        L_0x0149:
            r3.X = r13
            goto L_0x014e
        L_0x014c:
            r20 = r13
        L_0x014e:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            br5 r1 = (defpackage.br5) r1
            r3 = r1
            er5 r3 = (defpackage.er5) r3
            int r13 = r3.x
            r14 = 4
            if (r13 != r14) goto L_0x0165
            java.util.ArrayList r13 = r9.j
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            r13.add(r14)
        L_0x0165:
            if (r5 == 0) goto L_0x016a
            int r13 = r3.width
            goto L_0x016c
        L_0x016a:
            int r13 = r3.height
        L_0x016c:
            float r14 = r3.y
            r21 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r21 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r21 == 0) goto L_0x0181
            r21 = r13
            r13 = 1073741824(0x40000000, float:2.0)
            if (r6 != r13) goto L_0x0183
            float r13 = (float) r7
            float r13 = r13 * r14
            int r13 = java.lang.Math.round(r13)
            goto L_0x0185
        L_0x0181:
            r21 = r13
        L_0x0183:
            r13 = r21
        L_0x0185:
            if (r5 == 0) goto L_0x01cb
            int r14 = r3.leftMargin
            int r14 = r14 + r12
            r21 = r7
            r7 = r1
            er5 r7 = (defpackage.er5) r7
            int r7 = r7.rightMargin
            int r7 = r7 + r14
            int r14 = r4.n
            r22 = r6
            int r6 = r4.l
            r23 = r8
            boolean r8 = r4.e()
            int r6 = androidx.recyclerview.widget.a.x(r8, r14, r6, r7, r13)
            int r14 = r32 + r15
            r7 = r1
            er5 r7 = (defpackage.er5) r7
            int r7 = r7.topMargin
            int r7 = r7 + r14
            r8 = r1
            er5 r8 = (defpackage.er5) r8
            int r8 = r8.bottomMargin
            int r8 = r8 + r7
            int r8 = r8 + r11
            r7 = r1
            er5 r7 = (defpackage.er5) r7
            int r7 = r7.height
            int r13 = r4.o
            int r14 = r4.m
            r24 = r5
            boolean r5 = r4.f()
            int r5 = androidx.recyclerview.widget.a.x(r5, r13, r14, r8, r7)
            r2.measure(r6, r5)
            r0.B(r2, r10, r6, r5)
            goto L_0x020e
        L_0x01cb:
            r24 = r5
            r22 = r6
            r21 = r7
            r23 = r8
            int r14 = r32 + r15
            int r5 = r3.leftMargin
            int r5 = r5 + r14
            r6 = r1
            er5 r6 = (defpackage.er5) r6
            int r6 = r6.rightMargin
            int r6 = r6 + r5
            int r6 = r6 + r11
            r5 = r1
            er5 r5 = (defpackage.er5) r5
            int r5 = r5.width
            int r7 = r4.n
            int r8 = r4.l
            boolean r14 = r4.e()
            int r5 = androidx.recyclerview.widget.a.x(r14, r7, r8, r6, r5)
            r6 = r1
            er5 r6 = (defpackage.er5) r6
            int r6 = r6.topMargin
            int r6 = r6 + r12
            r7 = r1
            er5 r7 = (defpackage.er5) r7
            int r7 = r7.bottomMargin
            int r7 = r7 + r6
            int r6 = r4.o
            int r8 = r4.m
            boolean r14 = r4.f()
            int r6 = androidx.recyclerview.widget.a.x(r14, r6, r8, r7, r13)
            r2.measure(r5, r6)
            r0.B(r2, r10, r5, r6)
        L_0x020e:
            r4.k1(r2, r10)
            r0.e(r2, r10)
            int r5 = r2.getMeasuredState()
            r7 = r18
            int r18 = android.view.View.combineMeasuredStates(r7, r5)
            int r5 = r9.a
            if (r24 == 0) goto L_0x0227
            int r7 = r2.getMeasuredWidth()
            goto L_0x022b
        L_0x0227:
            int r7 = r2.getMeasuredHeight()
        L_0x022b:
            if (r24 == 0) goto L_0x0230
            int r8 = r3.leftMargin
            goto L_0x0232
        L_0x0230:
            int r8 = r3.topMargin
        L_0x0232:
            int r8 = r8 + r7
            if (r24 == 0) goto L_0x023b
            r7 = r1
            er5 r7 = (defpackage.er5) r7
            int r7 = r7.rightMargin
            goto L_0x0240
        L_0x023b:
            r7 = r1
            er5 r7 = (defpackage.er5) r7
            int r7 = r7.bottomMargin
        L_0x0240:
            int r7 = r7 + r8
            int r8 = r23.size()
            int r13 = r4.q
            if (r13 != 0) goto L_0x024e
        L_0x0249:
            r5 = r23
            r6 = 1
            goto L_0x032e
        L_0x024e:
            boolean r13 = r3.v0
            if (r13 == 0) goto L_0x0255
            r7 = r21
            goto L_0x029b
        L_0x0255:
            if (r22 != 0) goto L_0x0258
            goto L_0x0249
        L_0x0258:
            int r13 = r4.s
            r14 = -1
            if (r13 == r14) goto L_0x0262
            r14 = 1
            int r8 = r8 + r14
            if (r13 > r8) goto L_0x0262
            goto L_0x0249
        L_0x0262:
            boolean r8 = r4.c1()
            if (r8 == 0) goto L_0x027e
            android.view.ViewGroup$LayoutParams r8 = r2.getLayoutParams()
            bzc r8 = (defpackage.bzc) r8
            android.graphics.Rect r8 = r8.b
            int r8 = r8.left
            android.view.ViewGroup$LayoutParams r13 = r2.getLayoutParams()
            bzc r13 = (defpackage.bzc) r13
            android.graphics.Rect r13 = r13.b
            int r13 = r13.right
        L_0x027c:
            int r8 = r8 + r13
            goto L_0x0293
        L_0x027e:
            android.view.ViewGroup$LayoutParams r8 = r2.getLayoutParams()
            bzc r8 = (defpackage.bzc) r8
            android.graphics.Rect r8 = r8.b
            int r8 = r8.top
            android.view.ViewGroup$LayoutParams r13 = r2.getLayoutParams()
            bzc r13 = (defpackage.bzc) r13
            android.graphics.Rect r13 = r13.b
            int r13 = r13.bottom
            goto L_0x027c
        L_0x0293:
            if (r8 <= 0) goto L_0x0296
            int r7 = r7 + r8
        L_0x0296:
            int r5 = r5 + r7
            r7 = r21
            if (r7 >= r5) goto L_0x032a
        L_0x029b:
            int r5 = r9.d
            int r8 = r9.e
            int r5 = r5 - r8
            if (r5 <= 0) goto L_0x02b4
            if (r10 <= 0) goto L_0x02aa
            r5 = 1
            int r8 = r10 + -1
            r5 = r23
            goto L_0x02ad
        L_0x02aa:
            r5 = r23
            r8 = 0
        L_0x02ad:
            r0.b(r5, r9, r8, r11)
            int r8 = r9.c
            int r8 = r8 + r11
            goto L_0x02b7
        L_0x02b4:
            r5 = r23
            r8 = r11
        L_0x02b7:
            if (r24 == 0) goto L_0x02ec
            int r9 = r3.height
            r11 = -1
            if (r9 != r11) goto L_0x02e9
            r9 = r17
            androidx.recyclerview.widget.a r9 = (androidx.recyclerview.widget.a) r9
            int r11 = r9.L()
            int r9 = r9.I()
            int r9 = r9 + r11
            int r11 = r3.topMargin
            int r9 = r9 + r11
            int r11 = r3.bottomMargin
            int r9 = r9 + r11
            int r9 = r9 + r8
            int r11 = r3.height
            int r13 = r4.o
            int r14 = r4.m
            r21 = r7
            boolean r7 = r4.f()
            int r7 = androidx.recyclerview.widget.a.x(r7, r13, r14, r9, r11)
            r2.measure(r6, r7)
            r0.e(r2, r10)
            goto L_0x031b
        L_0x02e9:
            r21 = r7
            goto L_0x031b
        L_0x02ec:
            r21 = r7
            int r7 = r3.width
            r9 = -1
            if (r7 != r9) goto L_0x031b
            r7 = r17
            androidx.recyclerview.widget.a r7 = (androidx.recyclerview.widget.a) r7
            int r9 = r7.J()
            int r7 = r7.K()
            int r7 = r7 + r9
            int r9 = r3.leftMargin
            int r7 = r7 + r9
            int r9 = r3.rightMargin
            int r7 = r7 + r9
            int r7 = r7 + r8
            int r9 = r3.width
            int r11 = r4.n
            int r13 = r4.l
            boolean r14 = r4.e()
            int r7 = androidx.recyclerview.widget.a.x(r14, r11, r13, r7, r9)
            r2.measure(r7, r6)
            r0.e(r2, r10)
        L_0x031b:
            cr5 r9 = new cr5
            r9.<init>()
            r6 = 1
            r9.d = r6
            r9.a = r12
            r9.k = r10
            r6 = r16
            goto L_0x0336
        L_0x032a:
            r21 = r7
            goto L_0x0249
        L_0x032e:
            int r7 = r9.d
            int r7 = r7 + r6
            r9.d = r7
            r8 = r11
            r6 = r19
        L_0x0336:
            boolean r7 = r9.m
            float r11 = r3.v
            r13 = 0
            int r14 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r14 == 0) goto L_0x0341
            r14 = 1
            goto L_0x0342
        L_0x0341:
            r14 = 0
        L_0x0342:
            r7 = r7 | r14
            r9.m = r7
            boolean r7 = r9.n
            float r14 = r3.w
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 == 0) goto L_0x034f
            r13 = 1
            goto L_0x0350
        L_0x034f:
            r13 = 0
        L_0x0350:
            r7 = r7 | r13
            r9.n = r7
            java.lang.Object r7 = r0.c
            int[] r7 = (int[]) r7
            if (r7 == 0) goto L_0x035f
            int r13 = r5.size()
            r7[r10] = r13
        L_0x035f:
            int r7 = r9.a
            if (r24 == 0) goto L_0x0368
            int r13 = r2.getMeasuredWidth()
            goto L_0x036c
        L_0x0368:
            int r13 = r2.getMeasuredHeight()
        L_0x036c:
            if (r24 == 0) goto L_0x0376
            r19 = r12
            r12 = r1
            er5 r12 = (defpackage.er5) r12
            int r12 = r12.leftMargin
            goto L_0x037d
        L_0x0376:
            r19 = r12
            r12 = r1
            er5 r12 = (defpackage.er5) r12
            int r12 = r12.topMargin
        L_0x037d:
            int r12 = r12 + r13
            if (r24 == 0) goto L_0x0386
            r13 = r1
            er5 r13 = (defpackage.er5) r13
            int r13 = r13.rightMargin
            goto L_0x038b
        L_0x0386:
            r13 = r1
            er5 r13 = (defpackage.er5) r13
            int r13 = r13.bottomMargin
        L_0x038b:
            int r13 = r13 + r12
            int r13 = r13 + r7
            r9.a = r13
            float r7 = r9.f
            float r7 = r7 + r11
            r9.f = r7
            float r7 = r9.g
            float r7 = r7 + r14
            r9.g = r7
            android.graphics.Rect r7 = com.google.android.flexbox.FlexboxLayoutManager.N
            r4.d(r7, r2)
            boolean r7 = r4.c1()
            if (r7 == 0) goto L_0x03c4
            android.view.ViewGroup$LayoutParams r7 = r2.getLayoutParams()
            bzc r7 = (defpackage.bzc) r7
            android.graphics.Rect r7 = r7.b
            int r7 = r7.left
            android.view.ViewGroup$LayoutParams r11 = r2.getLayoutParams()
            bzc r11 = (defpackage.bzc) r11
            android.graphics.Rect r11 = r11.b
            int r11 = r11.right
            int r7 = r7 + r11
            int r11 = r9.a
            int r11 = r11 + r7
            r9.a = r11
            int r11 = r9.b
            int r11 = r11 + r7
            r9.b = r11
            goto L_0x03e3
        L_0x03c4:
            android.view.ViewGroup$LayoutParams r7 = r2.getLayoutParams()
            bzc r7 = (defpackage.bzc) r7
            android.graphics.Rect r7 = r7.b
            int r7 = r7.top
            android.view.ViewGroup$LayoutParams r11 = r2.getLayoutParams()
            bzc r11 = (defpackage.bzc) r11
            android.graphics.Rect r11 = r11.b
            int r11 = r11.bottom
            int r7 = r7 + r11
            int r11 = r9.a
            int r11 = r11 + r7
            r9.a = r11
            int r11 = r9.b
            int r11 = r11 + r7
            r9.b = r11
        L_0x03e3:
            if (r24 == 0) goto L_0x03ea
            int r7 = r2.getMeasuredHeight()
            goto L_0x03ee
        L_0x03ea:
            int r7 = r2.getMeasuredWidth()
        L_0x03ee:
            if (r24 == 0) goto L_0x03f6
            r11 = r1
            er5 r11 = (defpackage.er5) r11
            int r11 = r11.topMargin
            goto L_0x03fb
        L_0x03f6:
            r11 = r1
            er5 r11 = (defpackage.er5) r11
            int r11 = r11.leftMargin
        L_0x03fb:
            int r11 = r11 + r7
            if (r24 == 0) goto L_0x0403
            er5 r1 = (defpackage.er5) r1
            int r1 = r1.bottomMargin
            goto L_0x0407
        L_0x0403:
            er5 r1 = (defpackage.er5) r1
            int r1 = r1.rightMargin
        L_0x0407:
            int r1 = r1 + r11
            int r7 = r4.X0(r2)
            int r7 = r7 + r1
            int r1 = java.lang.Math.max(r6, r7)
            int r6 = r9.c
            int r6 = java.lang.Math.max(r6, r1)
            r9.c = r6
            if (r24 == 0) goto L_0x042f
            int r6 = r4.q
            r7 = 2
            if (r6 == r7) goto L_0x0431
            int r6 = r9.h
            int r2 = r2.getBaseline()
            int r3 = r3.topMargin
            int r2 = r2 + r3
            int r2 = java.lang.Math.max(r6, r2)
            r9.h = r2
        L_0x042f:
            r2 = 1
            goto L_0x0446
        L_0x0431:
            int r6 = r9.h
            int r7 = r2.getMeasuredHeight()
            int r2 = r2.getBaseline()
            int r7 = r7 - r2
            int r2 = r3.bottomMargin
            int r7 = r7 + r2
            int r2 = java.lang.Math.max(r6, r7)
            r9.h = r2
            goto L_0x042f
        L_0x0446:
            int r13 = r20 + -1
            if (r10 != r13) goto L_0x0457
            int r2 = r9.d
            int r3 = r9.e
            int r2 = r2 - r3
            if (r2 == 0) goto L_0x0457
            r0.b(r5, r9, r10, r8)
            int r2 = r9.c
            int r8 = r8 + r2
        L_0x0457:
            r2 = r31
            r3 = -1
            if (r2 == r3) goto L_0x0479
            int r6 = r5.size()
            if (r6 <= 0) goto L_0x0479
            r6 = 1
            java.lang.Object r7 = defpackage.a81.i(r6, r5)
            cr5 r7 = (defpackage.cr5) r7
            int r6 = r7.l
            if (r6 < r2) goto L_0x0479
            if (r10 < r2) goto L_0x0479
            if (r30 != 0) goto L_0x0479
            int r6 = r9.c
            int r6 = -r6
            r8 = r6
            r11 = 1
            r6 = r29
            goto L_0x047d
        L_0x0479:
            r6 = r29
            r11 = r30
        L_0x047d:
            if (r8 <= r6) goto L_0x0482
            if (r11 == 0) goto L_0x0482
            goto L_0x049a
        L_0x0482:
            r7 = 1
        L_0x0483:
            int r10 = r10 + r7
            r14 = r32
            r3 = r17
            r12 = r19
            r13 = r20
            r7 = r21
            r6 = r22
            r19 = r1
            r1 = r2
            r17 = r8
            r8 = r5
            r5 = r24
            goto L_0x00ab
        L_0x049a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hr6.d(rt6, int, int, int, int, int, java.util.List):void");
    }

    public void e(View view, int i) {
        boolean z;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        er5 er5 = (er5) ((br5) view.getLayoutParams());
        int i2 = er5.z;
        boolean z2 = true;
        if (measuredWidth >= i2 && measuredWidth <= (i2 = er5.Y)) {
            z = false;
        } else {
            measuredWidth = i2;
            z = true;
        }
        int i3 = er5.X;
        if (measuredHeight < i3) {
            measuredHeight = i3;
        } else {
            int i4 = er5.Z;
            if (measuredHeight > i4) {
                measuredHeight = i4;
            } else {
                z2 = z;
            }
        }
        if (z2) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            B(view, i, makeMeasureSpec, makeMeasureSpec2);
            ((FlexboxLayoutManager) ((ar5) this.a)).k1(view, i);
        }
    }

    public void f(int i, List list) {
        int i2 = ((int[]) this.c)[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = (int[]) this.c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = (long[]) this.o;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0);
        } else {
            Arrays.fill(jArr, i, length2, 0);
        }
    }

    public void g(String str, ArrayList arrayList) {
        Intent intent = (Intent) this.b;
        String[] stringArrayExtra = intent.getStringArrayExtra(str);
        int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
        String[] strArr = new String[(arrayList.size() + length)];
        arrayList.toArray(strArr);
        if (stringArrayExtra != null) {
            System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
        }
        intent.putExtra(str, strArr);
    }

    public Object get() {
        return new qsf((lzf) ((Provider) this.a).get(), (lzf) ((Provider) this.b).get(), (kfd) ((Provider) this.c).get(), (zyf) ((Provider) this.o).get(), (zog) ((Provider) this.v).get());
    }

    public void h(int i, int i2, int i3) {
        int i4;
        int J;
        int K;
        ar5 ar5 = (ar5) this.a;
        int b2 = ((FlexboxLayoutManager) ar5).y.b();
        boolean[] zArr = (boolean[]) this.b;
        int i5 = 0;
        if (zArr == null) {
            this.b = new boolean[Math.max(b2, 10)];
        } else if (zArr.length < b2) {
            this.b = new boolean[Math.max(zArr.length * 2, b2)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 < ((FlexboxLayoutManager) ar5).y.b()) {
            int i6 = ((FlexboxLayoutManager) ar5).p;
            int i7 = ((FlexboxLayoutManager) ar5).p;
            if (i7 == 0 || i7 == 1) {
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                int Z0 = ((FlexboxLayoutManager) ar5).Z0();
                if (mode != 1073741824) {
                    size = Math.min(Z0, size);
                }
                J = ((a) ar5).J();
                K = ((a) ar5).K();
            } else if (i7 == 2 || i7 == 3) {
                int mode2 = View.MeasureSpec.getMode(i2);
                i4 = View.MeasureSpec.getSize(i2);
                if (mode2 != 1073741824) {
                    i4 = ((FlexboxLayoutManager) ar5).Z0();
                }
                J = ((a) ar5).L();
                K = ((a) ar5).I();
            } else {
                throw new IllegalArgumentException(wj6.h(i6, "Invalid flex direction: "));
            }
            int i8 = K + J;
            int[] iArr = (int[]) this.c;
            if (iArr != null) {
                i5 = iArr[i3];
            }
            List list = ((FlexboxLayoutManager) ar5).v;
            int size2 = list.size();
            while (i5 < size2) {
                cr5 cr5 = (cr5) list.get(i5);
                int i9 = cr5.a;
                if (i9 < i4 && cr5.m) {
                    l(i, i2, cr5, i4, i8, false);
                } else if (i9 > i4 && cr5.n) {
                    v(i, i2, cr5, i4, i8, false);
                }
                i5++;
            }
        }
    }

    public void i(int i) {
        int[] iArr = (int[]) this.c;
        if (iArr == null) {
            this.c = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.c = Arrays.copyOf((int[]) this.c, Math.max(iArr.length * 2, i));
        }
    }

    public void j(int i) {
        long[] jArr = (long[]) this.o;
        if (jArr == null) {
            this.o = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.o = Arrays.copyOf((long[]) this.o, Math.max(jArr.length * 2, i));
        }
    }

    public void k(int i) {
        long[] jArr = (long[]) this.v;
        if (jArr == null) {
            this.v = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.v = Arrays.copyOf((long[]) this.v, Math.max(jArr.length * 2, i));
        }
    }

    public void l(int i, int i2, cr5 cr5, int i3, int i4, boolean z) {
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        double d;
        int i9;
        int i10;
        double d2;
        cr5 cr52 = cr5;
        int i11 = i3;
        float f = cr52.f;
        boolean z3 = false;
        if (f > c44.DEFAULT_ASPECT_RATIO && i11 >= (i5 = cr52.a)) {
            float f2 = ((float) (i11 - i5)) / f;
            cr52.a = i4 + cr52.b;
            if (!z) {
                cr52.c = IntCompanionObject.MIN_VALUE;
            }
            int i12 = 0;
            boolean z4 = false;
            int i13 = 0;
            float f3 = 0.0f;
            while (i12 < cr52.d) {
                int i14 = cr52.k + i12;
                FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) ((ar5) this.a);
                View Y0 = flexboxLayoutManager.Y0(i14);
                if (Y0 == null || Y0.getVisibility() == 8) {
                    int i15 = i2;
                    z2 = z3;
                    i7 = i5;
                    i6 = i12;
                } else {
                    br5 br5 = (br5) Y0.getLayoutParams();
                    int i16 = flexboxLayoutManager.p;
                    if (i16 == 0 || i16 == 1) {
                        int i17 = i;
                        int i18 = i5;
                        i6 = i12;
                        int measuredWidth = Y0.getMeasuredWidth();
                        long[] jArr = (long[]) this.v;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i14];
                        }
                        int measuredHeight = Y0.getMeasuredHeight();
                        long[] jArr2 = (long[]) this.v;
                        if (jArr2 != null) {
                            long j = jArr2[i14];
                            i7 = i18;
                            measuredHeight = (int) (j >> 32);
                        } else {
                            i7 = i18;
                        }
                        if (!((boolean[]) this.b)[i14]) {
                            er5 er5 = (er5) br5;
                            float f4 = er5.v;
                            z2 = false;
                            if (f4 > c44.DEFAULT_ASPECT_RATIO) {
                                float f5 = (f2 * f4) + ((float) measuredWidth);
                                if (i6 == cr52.d - 1) {
                                    f5 += f3;
                                    f3 = 0.0f;
                                }
                                int round = Math.round(f5);
                                int i19 = er5.Y;
                                if (round > i19) {
                                    ((boolean[]) this.b)[i14] = true;
                                    cr52.f -= f4;
                                    round = i19;
                                    z4 = true;
                                } else {
                                    float f6 = (f5 - ((float) round)) + f3;
                                    double d3 = (double) f6;
                                    if (d3 > 1.0d) {
                                        round++;
                                        d = d3 - 1.0d;
                                    } else {
                                        if (d3 < -1.0d) {
                                            round--;
                                            d = d3 + 1.0d;
                                        }
                                        f3 = f6;
                                    }
                                    f6 = (float) d;
                                    f3 = f6;
                                }
                                int m = m(i2, br5, cr52.i);
                                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                                Y0.measure(makeMeasureSpec, m);
                                int measuredWidth2 = Y0.getMeasuredWidth();
                                int measuredHeight2 = Y0.getMeasuredHeight();
                                B(Y0, i14, makeMeasureSpec, m);
                                flexboxLayoutManager.k1(Y0, i14);
                                measuredWidth = measuredWidth2;
                                measuredHeight = measuredHeight2;
                            } else {
                                int i20 = i2;
                            }
                        } else {
                            int i21 = i2;
                            z2 = false;
                        }
                        er5 er52 = (er5) br5;
                        int max = Math.max(i13, flexboxLayoutManager.X0(Y0) + measuredHeight + er52.topMargin + er52.bottomMargin);
                        cr52.a = measuredWidth + er52.leftMargin + er52.rightMargin + cr52.a;
                        i8 = max;
                    } else {
                        int measuredHeight3 = Y0.getMeasuredHeight();
                        long[] jArr3 = (long[]) this.v;
                        if (jArr3 != null) {
                            long j2 = jArr3[i14];
                            i9 = i5;
                            measuredHeight3 = (int) (j2 >> 32);
                        } else {
                            i9 = i5;
                        }
                        int measuredWidth3 = Y0.getMeasuredWidth();
                        long[] jArr4 = (long[]) this.v;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i14];
                        }
                        if (!((boolean[]) this.b)[i14]) {
                            er5 er53 = (er5) br5;
                            float f7 = er53.v;
                            if (f7 > c44.DEFAULT_ASPECT_RATIO) {
                                float f8 = (f2 * f7) + ((float) measuredHeight3);
                                if (i12 == cr52.d - 1) {
                                    f8 += f3;
                                    f3 = c44.DEFAULT_ASPECT_RATIO;
                                }
                                int round2 = Math.round(f8);
                                int i22 = er53.Z;
                                if (round2 > i22) {
                                    ((boolean[]) this.b)[i14] = true;
                                    cr52.f -= f7;
                                    i10 = i9;
                                    round2 = i22;
                                    z4 = true;
                                    i6 = i12;
                                } else {
                                    float f9 = (f8 - ((float) round2)) + f3;
                                    i6 = i12;
                                    i10 = i9;
                                    double d4 = (double) f9;
                                    if (d4 > 1.0d) {
                                        round2++;
                                        d2 = d4 - 1.0d;
                                    } else if (d4 < -1.0d) {
                                        round2--;
                                        d2 = d4 + 1.0d;
                                    } else {
                                        f3 = f9;
                                    }
                                    f3 = (float) d2;
                                }
                                int n = n(i, br5, cr52.i);
                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                                Y0.measure(n, makeMeasureSpec2);
                                int measuredWidth4 = Y0.getMeasuredWidth();
                                int measuredHeight4 = Y0.getMeasuredHeight();
                                B(Y0, i14, n, makeMeasureSpec2);
                                flexboxLayoutManager.k1(Y0, i14);
                                measuredWidth3 = measuredWidth4;
                                measuredHeight3 = measuredHeight4;
                                er5 er54 = (er5) br5;
                                i8 = Math.max(i13, flexboxLayoutManager.X0(Y0) + measuredWidth3 + er54.leftMargin + er54.rightMargin);
                                cr52.a = measuredHeight3 + er54.topMargin + er54.bottomMargin + cr52.a;
                                int i23 = i2;
                                i7 = i10;
                                z2 = false;
                            }
                        }
                        i6 = i12;
                        i10 = i9;
                        int i24 = i;
                        er5 er542 = (er5) br5;
                        i8 = Math.max(i13, flexboxLayoutManager.X0(Y0) + measuredWidth3 + er542.leftMargin + er542.rightMargin);
                        cr52.a = measuredHeight3 + er542.topMargin + er542.bottomMargin + cr52.a;
                        int i232 = i2;
                        i7 = i10;
                        z2 = false;
                    }
                    cr52.c = Math.max(cr52.c, i8);
                    i13 = i8;
                }
                i12 = i6 + 1;
                i5 = i7;
                z3 = z2;
                int i25 = i3;
            }
            int i26 = i2;
            int i27 = i5;
            if (z4 && i27 != cr52.a) {
                l(i, i2, cr5, i3, i4, true);
            }
        }
    }

    public int m(int i, br5 br5, int i2) {
        ar5 ar5 = (ar5) this.a;
        a aVar = (a) ar5;
        er5 er5 = (er5) br5;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) ar5;
        int x = a.x(flexboxLayoutManager.f(), flexboxLayoutManager.o, flexboxLayoutManager.m, aVar.I() + aVar.L() + er5.topMargin + er5.bottomMargin + i2, er5.height);
        int size = View.MeasureSpec.getSize(x);
        int i3 = er5.Z;
        if (size > i3) {
            return View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(x));
        }
        int i4 = er5.X;
        return size < i4 ? View.MeasureSpec.makeMeasureSpec(i4, View.MeasureSpec.getMode(x)) : x;
    }

    public int n(int i, br5 br5, int i2) {
        ar5 ar5 = (ar5) this.a;
        a aVar = (a) ar5;
        er5 er5 = (er5) br5;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) ar5;
        int x = a.x(flexboxLayoutManager.e(), flexboxLayoutManager.n, flexboxLayoutManager.l, aVar.K() + aVar.J() + er5.leftMargin + er5.rightMargin + i2, er5.width);
        int size = View.MeasureSpec.getSize(x);
        int i3 = er5.Y;
        if (size > i3) {
            return View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(x));
        }
        int i4 = er5.z;
        return size < i4 ? View.MeasureSpec.makeMeasureSpec(i4, View.MeasureSpec.getMode(x)) : x;
    }

    public Intent o() {
        ArrayList arrayList = (ArrayList) this.o;
        if (arrayList != null) {
            g("android.intent.extra.EMAIL", arrayList);
            this.o = null;
        }
        ArrayList arrayList2 = (ArrayList) this.v;
        Intent intent = (Intent) this.b;
        if (arrayList2 == null || arrayList2.size() <= 1) {
            intent.setAction("android.intent.action.SEND");
            ArrayList arrayList3 = (ArrayList) this.v;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                intent.removeExtra("android.intent.extra.STREAM");
                intent.setClipData((ClipData) null);
                intent.setFlags(intent.getFlags() & -2);
            } else {
                intent.putExtra("android.intent.extra.STREAM", (Parcelable) ((ArrayList) this.v).get(0));
                q8.u(intent, (ArrayList) this.v);
            }
        } else {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", (ArrayList) this.v);
            q8.u(intent, (ArrayList) this.v);
        }
        return intent;
    }

    public void p(View view, cr5 cr5, int i, int i2, int i3, int i4) {
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) ((ar5) this.a);
        int i5 = flexboxLayoutManager.r;
        er5 er5 = (er5) ((br5) view.getLayoutParams());
        int i6 = er5.x;
        if (i6 != -1) {
            i5 = i6;
        }
        int i7 = cr5.c;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    int measuredHeight = (((i7 - view.getMeasuredHeight()) + er5.topMargin) - er5.bottomMargin) / 2;
                    if (flexboxLayoutManager.q != 2) {
                        int i8 = i2 + measuredHeight;
                        view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                        return;
                    }
                    int i9 = i2 - measuredHeight;
                    view.layout(i, i9, i3, view.getMeasuredHeight() + i9);
                    return;
                } else if (i5 != 3) {
                    if (i5 != 4) {
                        return;
                    }
                } else if (flexboxLayoutManager.q != 2) {
                    int max = Math.max(cr5.h - view.getBaseline(), er5.topMargin);
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max(view.getBaseline() + (cr5.h - view.getMeasuredHeight()), er5.bottomMargin);
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            } else if (flexboxLayoutManager.q != 2) {
                int i10 = i2 + i7;
                int i11 = er5.bottomMargin;
                view.layout(i, (i10 - view.getMeasuredHeight()) - i11, i3, i10 - i11);
                return;
            } else {
                view.layout(i, view.getMeasuredHeight() + (i2 - i7) + er5.topMargin, i3, view.getMeasuredHeight() + (i4 - i7) + er5.topMargin);
                return;
            }
        }
        if (flexboxLayoutManager.q != 2) {
            int i12 = er5.topMargin;
            view.layout(i, i2 + i12, i3, i4 + i12);
            return;
        }
        int i13 = er5.bottomMargin;
        view.layout(i, i2 - i13, i3, i4 - i13);
    }

    public void q(View view, cr5 cr5, boolean z, int i, int i2, int i3, int i4) {
        int i5 = ((FlexboxLayoutManager) ((ar5) this.a)).r;
        er5 er5 = (er5) ((br5) view.getLayoutParams());
        int i6 = er5.x;
        if (i6 != -1) {
            i5 = i6;
        }
        int i7 = cr5.c;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int marginStart = ((marginLayoutParams.getMarginStart() + (i7 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                    if (!z) {
                        view.layout(i + marginStart, i2, i3 + marginStart, i4);
                        return;
                    } else {
                        view.layout(i - marginStart, i2, i3 - marginStart, i4);
                        return;
                    }
                } else if (!(i5 == 3 || i5 == 4)) {
                    return;
                }
            } else if (!z) {
                view.layout(((i + i7) - view.getMeasuredWidth()) - er5.rightMargin, i2, ((i3 + i7) - view.getMeasuredWidth()) - er5.rightMargin, i4);
                return;
            } else {
                view.layout(view.getMeasuredWidth() + (i - i7) + er5.leftMargin, i2, view.getMeasuredWidth() + (i3 - i7) + er5.leftMargin, i4);
                return;
            }
        }
        if (!z) {
            int i8 = er5.leftMargin;
            view.layout(i + i8, i2, i3 + i8, i4);
            return;
        }
        int i9 = er5.rightMargin;
        view.layout(i - i9, i2, i3 - i9, i4);
    }

    public void r(String str, hd8 hd8) {
        if (str.length() > 0) {
            if (hd8 == null) {
                if (!(!(Intrinsics.areEqual((Object) str, (Object) HttpPost.METHOD_NAME) || Intrinsics.areEqual((Object) str, (Object) HttpPut.METHOD_NAME) || Intrinsics.areEqual((Object) str, (Object) "PATCH") || Intrinsics.areEqual((Object) str, (Object) "PROPPATCH") || Intrinsics.areEqual((Object) str, (Object) "REPORT")))) {
                    throw new IllegalArgumentException(wj6.k("method ", str, " must have a request body.").toString());
                }
            } else if (!tf6.d0(str)) {
                throw new IllegalArgumentException(wj6.k("method ", str, " must not have a request body.").toString());
            }
            this.b = str;
            this.o = hd8;
            return;
        }
        throw new IllegalArgumentException("method.isEmpty() == true".toString());
    }

    public void s(String str) {
        ((e4) this.c).u(str);
    }

    public void t(Uri uri) {
        this.v = null;
        if (uri != null) {
            ArrayList arrayList = new ArrayList();
            this.v = arrayList;
            arrayList.add(uri);
        }
    }

    public void u(CharSequence charSequence) {
        ((Intent) this.b).putExtra("android.intent.extra.TEXT", charSequence);
    }

    public void v(int i, int i2, cr5 cr5, int i3, int i4, boolean z) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        cr5 cr52 = cr5;
        int i9 = i3;
        int i10 = cr52.a;
        float f = cr52.g;
        boolean z3 = false;
        if (f > c44.DEFAULT_ASPECT_RATIO && i9 <= i10) {
            float f2 = ((float) (i10 - i9)) / f;
            cr52.a = i4 + cr52.b;
            if (!z) {
                cr52.c = IntCompanionObject.MIN_VALUE;
            }
            int i11 = 0;
            boolean z4 = false;
            int i12 = 0;
            float f3 = 0.0f;
            while (i11 < cr52.d) {
                int i13 = cr52.k + i11;
                FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) ((ar5) this.a);
                View Y0 = flexboxLayoutManager.Y0(i13);
                if (Y0 == null || Y0.getVisibility() == 8) {
                    int i14 = i2;
                    i6 = i11;
                    z2 = z3;
                    i5 = i10;
                } else {
                    br5 br5 = (br5) Y0.getLayoutParams();
                    int i15 = flexboxLayoutManager.p;
                    if (i15 == 0 || i15 == 1) {
                        i5 = i10;
                        int i16 = i11;
                        int i17 = i;
                        int measuredWidth = Y0.getMeasuredWidth();
                        long[] jArr = (long[]) this.v;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i13];
                        }
                        int measuredHeight = Y0.getMeasuredHeight();
                        long[] jArr2 = (long[]) this.v;
                        if (jArr2 != null) {
                            long j = jArr2[i13];
                            i6 = i16;
                            measuredHeight = (int) (j >> 32);
                        } else {
                            i6 = i16;
                        }
                        if (!((boolean[]) this.b)[i13]) {
                            er5 er5 = (er5) br5;
                            float f4 = er5.w;
                            z2 = false;
                            if (f4 > c44.DEFAULT_ASPECT_RATIO) {
                                float f5 = ((float) measuredWidth) - (f2 * f4);
                                if (i6 == cr52.d - 1) {
                                    f5 += f3;
                                    f3 = 0.0f;
                                }
                                int round = Math.round(f5);
                                int i18 = er5.z;
                                if (round < i18) {
                                    ((boolean[]) this.b)[i13] = true;
                                    cr52.g -= f4;
                                    z4 = true;
                                    round = i18;
                                } else {
                                    float f6 = (f5 - ((float) round)) + f3;
                                    double d = (double) f6;
                                    if (d > 1.0d) {
                                        round++;
                                        f6 -= 1.0f;
                                    } else if (d < -1.0d) {
                                        round--;
                                        f6 += 1.0f;
                                    }
                                    f3 = f6;
                                }
                                int m = m(i2, br5, cr52.i);
                                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                                Y0.measure(makeMeasureSpec, m);
                                int measuredWidth2 = Y0.getMeasuredWidth();
                                int measuredHeight2 = Y0.getMeasuredHeight();
                                B(Y0, i13, makeMeasureSpec, m);
                                flexboxLayoutManager.k1(Y0, i13);
                                measuredWidth = measuredWidth2;
                                measuredHeight = measuredHeight2;
                            } else {
                                int i19 = i2;
                            }
                        } else {
                            int i20 = i2;
                            z2 = false;
                        }
                        er5 er52 = (er5) br5;
                        int max = Math.max(i12, flexboxLayoutManager.X0(Y0) + measuredHeight + er52.topMargin + er52.bottomMargin);
                        cr52.a = measuredWidth + er52.leftMargin + er52.rightMargin + cr52.a;
                        i7 = max;
                    } else {
                        int measuredHeight3 = Y0.getMeasuredHeight();
                        long[] jArr3 = (long[]) this.v;
                        if (jArr3 != null) {
                            measuredHeight3 = (int) (jArr3[i13] >> 32);
                        }
                        int measuredWidth3 = Y0.getMeasuredWidth();
                        long[] jArr4 = (long[]) this.v;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i13];
                        }
                        if (!((boolean[]) this.b)[i13]) {
                            er5 er53 = (er5) br5;
                            float f7 = er53.w;
                            if (f7 > c44.DEFAULT_ASPECT_RATIO) {
                                float f8 = ((float) measuredHeight3) - (f2 * f7);
                                if (i11 == cr52.d - 1) {
                                    f8 += f3;
                                    f3 = c44.DEFAULT_ASPECT_RATIO;
                                }
                                int round2 = Math.round(f8);
                                int i21 = er53.X;
                                if (round2 < i21) {
                                    ((boolean[]) this.b)[i13] = true;
                                    cr52.g -= f7;
                                    i8 = i11;
                                    round2 = i21;
                                    z4 = true;
                                    i5 = i10;
                                } else {
                                    float f9 = (f8 - ((float) round2)) + f3;
                                    i5 = i10;
                                    i8 = i11;
                                    double d2 = (double) f9;
                                    if (d2 > 1.0d) {
                                        round2++;
                                        f9 -= 1.0f;
                                    } else if (d2 < -1.0d) {
                                        round2--;
                                        f9 += 1.0f;
                                    }
                                    f3 = f9;
                                }
                                int n = n(i, br5, cr52.i);
                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                                Y0.measure(n, makeMeasureSpec2);
                                int measuredWidth4 = Y0.getMeasuredWidth();
                                int measuredHeight4 = Y0.getMeasuredHeight();
                                B(Y0, i13, n, makeMeasureSpec2);
                                flexboxLayoutManager.k1(Y0, i13);
                                measuredWidth3 = measuredWidth4;
                                measuredHeight3 = measuredHeight4;
                                er5 er54 = (er5) br5;
                                i7 = Math.max(i12, flexboxLayoutManager.X0(Y0) + measuredWidth3 + er54.leftMargin + er54.rightMargin);
                                cr52.a = measuredHeight3 + er54.topMargin + er54.bottomMargin + cr52.a;
                                int i22 = i2;
                                i6 = i8;
                                z2 = false;
                            }
                        }
                        i5 = i10;
                        i8 = i11;
                        int i23 = i;
                        er5 er542 = (er5) br5;
                        i7 = Math.max(i12, flexboxLayoutManager.X0(Y0) + measuredWidth3 + er542.leftMargin + er542.rightMargin);
                        cr52.a = measuredHeight3 + er542.topMargin + er542.bottomMargin + cr52.a;
                        int i222 = i2;
                        i6 = i8;
                        z2 = false;
                    }
                    cr52.c = Math.max(cr52.c, i7);
                    i12 = i7;
                }
                i11 = i6 + 1;
                int i24 = i3;
                i10 = i5;
                z3 = z2;
            }
            int i25 = i2;
            int i26 = i10;
            if (z4 && i26 != cr52.a) {
                v(i, i2, cr5, i3, i4, true);
            }
        }
    }

    public void w() {
        ((Context) this.a).startActivity(Intent.createChooser(o(), (CharSequence) this.c));
    }

    public void x(View view, int i, int i2) {
        br5 br5 = (br5) view.getLayoutParams();
        er5 er5 = (er5) br5;
        int i3 = (i - ((er5) br5).leftMargin) - er5.rightMargin;
        ar5 ar5 = (ar5) this.a;
        int min = Math.min(Math.max(i3 - ((FlexboxLayoutManager) ar5).X0(view), er5.z), er5.Y);
        long[] jArr = (long[]) this.v;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        B(view, i2, makeMeasureSpec2, makeMeasureSpec);
        ((FlexboxLayoutManager) ar5).k1(view, i2);
    }

    public void y(View view, int i, int i2) {
        br5 br5 = (br5) view.getLayoutParams();
        er5 er5 = (er5) br5;
        int i3 = (i - ((er5) br5).topMargin) - er5.bottomMargin;
        ar5 ar5 = (ar5) this.a;
        int min = Math.min(Math.max(i3 - ((FlexboxLayoutManager) ar5).X0(view), er5.X), er5.Z);
        long[] jArr = (long[]) this.v;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        B(view, i2, makeMeasureSpec, makeMeasureSpec2);
        ((FlexboxLayoutManager) ar5).k1(view, i2);
    }

    public void z(int i) {
        View Y0;
        int i2;
        int i3 = i;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) ((ar5) this.a);
        if (i3 < flexboxLayoutManager.y.b()) {
            int i4 = flexboxLayoutManager.p;
            if (flexboxLayoutManager.r == 4) {
                int[] iArr = (int[]) this.c;
                List list = flexboxLayoutManager.v;
                int size = list.size();
                for (int i5 = iArr != null ? iArr[i3] : 0; i5 < size; i5++) {
                    cr5 cr5 = (cr5) list.get(i5);
                    int i6 = cr5.d;
                    for (int i7 = 0; i7 < i6; i7++) {
                        int i8 = cr5.k + i7;
                        if (i7 < flexboxLayoutManager.y.b() && (Y0 = flexboxLayoutManager.Y0(i8)) != null && Y0.getVisibility() != 8 && ((i2 = ((er5) ((br5) Y0.getLayoutParams())).x) == -1 || i2 == 4)) {
                            if (i4 == 0 || i4 == 1) {
                                y(Y0, cr5.c, i8);
                            } else if (i4 == 2 || i4 == 3) {
                                x(Y0, cr5.c, i8);
                            } else {
                                throw new IllegalArgumentException(wj6.h(i4, "Invalid flex direction: "));
                            }
                        }
                    }
                }
                return;
            }
            for (cr5 cr52 : flexboxLayoutManager.v) {
                Iterator it = cr52.j.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        View Y02 = flexboxLayoutManager.Y0(num.intValue());
                        if (i4 == 0 || i4 == 1) {
                            y(Y02, cr52.c, num.intValue());
                        } else if (i4 == 2 || i4 == 3) {
                            x(Y02, cr52.c, num.intValue());
                        } else {
                            throw new IllegalArgumentException(wj6.h(i4, "Invalid flex direction: "));
                        }
                    }
                }
            }
        }
    }

    public hr6() {
        this.v = new LinkedHashMap();
        this.b = HttpGet.METHOD_NAME;
        this.c = new e4(20);
    }

    public hr6(Context context) {
        Activity activity;
        context.getClass();
        this.a = context;
        Intent action = new Intent().setAction("android.intent.action.SEND");
        this.b = action;
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.addFlags(524288);
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            ComponentName componentName = activity.getComponentName();
            ((Intent) this.b).putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
            ((Intent) this.b).putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        }
    }
}
