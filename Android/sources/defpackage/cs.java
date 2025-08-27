package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import android.view.GestureDetector;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.UByte;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: cs  reason: default package */
public class cs implements pyc, on0, mj6 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object o;

    public /* synthetic */ cs(int i, byte b2) {
        this.a = i;
    }

    public static cs E(char c2) {
        return new cs(new d6a(8, (Object) new q22(c2)));
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r16v3, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r11v11, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0208, code lost:
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x020b, code lost:
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x020e, code lost:
        r11 = new android.graphics.LinearGradient(r12, r26, r25, r24, (int[]) r0.b, (float[]) r0.c, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0225, code lost:
        r3 = new android.graphics.SweepGradient(r20, r21, (int[]) r0.b, (float[]) r0.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0237, code lost:
        r5 = r20;
        r9 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x023e, code lost:
        if (r22 <= defpackage.c44.DEFAULT_ASPECT_RATIO) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0243, code lost:
        if (r6 == 1) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0246, code lost:
        if (r6 == 2) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0248, code lost:
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x024b, code lost:
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x024e, code lost:
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0250, code lost:
        r16 = new android.graphics.RadialGradient(r5, r9, r22, (int[]) r0.b, (float[]) r0.c, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0270, code lost:
        return new defpackage.cs((android.graphics.Shader) r3, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0278, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01dd, code lost:
        if (r15.size() <= 0) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01df, code lost:
        r0 = new defpackage.npg(r15, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01e5, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e6, code lost:
        if (r0 == null) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ea, code lost:
        if (r18 == false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ec, code lost:
        r0 = new defpackage.npg(r7, r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01f2, code lost:
        r0 = new defpackage.npg(r7, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01f8, code lost:
        if (r8 == 1) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01fb, code lost:
        if (r8 == 2) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ff, code lost:
        if (r6 == 1) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0201, code lost:
        if (r6 == 2) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0203, code lost:
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.cs k(android.content.res.Resources r27, int r28, android.content.res.Resources.Theme r29) {
        /*
            r0 = r27
            r1 = r29
            java.lang.String r2 = "gradient"
            android.content.res.XmlResourceParser r3 = r27.getXml(r28)
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r3)
        L_0x000e:
            int r5 = r3.next()
            r6 = 2
            r7 = 1
            if (r5 == r6) goto L_0x0019
            if (r5 == r7) goto L_0x0019
            goto L_0x000e
        L_0x0019:
            if (r5 != r6) goto L_0x0297
            java.lang.String r5 = r3.getName()
            r5.getClass()
            r8 = 0
            boolean r9 = r5.equals(r2)
            if (r9 != 0) goto L_0x005d
            java.lang.String r2 = "selector"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x003f
            android.content.res.ColorStateList r0 = defpackage.v53.b(r0, r3, r4, r1)
            cs r1 = new cs
            int r2 = r0.getDefaultColor()
            r1.<init>((android.graphics.Shader) r8, (android.content.res.ColorStateList) r0, (int) r2)
            return r1
        L_0x003f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": unsupported complex color tag "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x005d:
            java.lang.String r5 = r3.getName()
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0279
            int[] r2 = defpackage.foc.GradientColor
            android.content.res.TypedArray r2 = defpackage.b0h.F(r0, r1, r4, r2)
            int r5 = defpackage.foc.GradientColor_android_startX
            java.lang.String r9 = "startX"
            boolean r9 = defpackage.b0h.D(r3, r9)
            r10 = 0
            if (r9 != 0) goto L_0x007a
            r12 = r10
            goto L_0x007f
        L_0x007a:
            float r5 = r2.getFloat(r5, r10)
            r12 = r5
        L_0x007f:
            int r5 = defpackage.foc.GradientColor_android_startY
            java.lang.String r9 = "startY"
            boolean r9 = defpackage.b0h.D(r3, r9)
            if (r9 != 0) goto L_0x008b
            r13 = r10
            goto L_0x0090
        L_0x008b:
            float r5 = r2.getFloat(r5, r10)
            r13 = r5
        L_0x0090:
            int r5 = defpackage.foc.GradientColor_android_endX
            java.lang.String r9 = "endX"
            boolean r9 = defpackage.b0h.D(r3, r9)
            if (r9 != 0) goto L_0x009c
            r14 = r10
            goto L_0x00a1
        L_0x009c:
            float r5 = r2.getFloat(r5, r10)
            r14 = r5
        L_0x00a1:
            int r5 = defpackage.foc.GradientColor_android_endY
            java.lang.String r9 = "endY"
            boolean r9 = defpackage.b0h.D(r3, r9)
            if (r9 != 0) goto L_0x00ad
            r15 = r10
            goto L_0x00b2
        L_0x00ad:
            float r5 = r2.getFloat(r5, r10)
            r15 = r5
        L_0x00b2:
            int r5 = defpackage.foc.GradientColor_android_centerX
            java.lang.String r9 = "centerX"
            boolean r9 = defpackage.b0h.D(r3, r9)
            if (r9 != 0) goto L_0x00be
            r5 = r10
            goto L_0x00c2
        L_0x00be:
            float r5 = r2.getFloat(r5, r10)
        L_0x00c2:
            int r9 = defpackage.foc.GradientColor_android_centerY
            java.lang.String r11 = "centerY"
            boolean r11 = defpackage.b0h.D(r3, r11)
            if (r11 != 0) goto L_0x00ce
            r9 = r10
            goto L_0x00d2
        L_0x00ce:
            float r9 = r2.getFloat(r9, r10)
        L_0x00d2:
            int r11 = defpackage.foc.GradientColor_android_type
            java.lang.String r8 = "type"
            boolean r8 = defpackage.b0h.D(r3, r8)
            r6 = 0
            if (r8 != 0) goto L_0x00df
            r8 = r6
            goto L_0x00e3
        L_0x00df:
            int r8 = r2.getInt(r11, r6)
        L_0x00e3:
            int r11 = defpackage.foc.GradientColor_android_startColor
            java.lang.String r7 = "startColor"
            boolean r7 = defpackage.b0h.D(r3, r7)
            if (r7 != 0) goto L_0x00ef
            r7 = r6
            goto L_0x00f3
        L_0x00ef:
            int r7 = r2.getColor(r11, r6)
        L_0x00f3:
            java.lang.String r11 = "centerColor"
            boolean r18 = defpackage.b0h.D(r3, r11)
            int r10 = defpackage.foc.GradientColor_android_centerColor
            boolean r11 = defpackage.b0h.D(r3, r11)
            if (r11 != 0) goto L_0x0103
            r10 = r6
            goto L_0x0107
        L_0x0103:
            int r10 = r2.getColor(r10, r6)
        L_0x0107:
            int r11 = defpackage.foc.GradientColor_android_endColor
            java.lang.String r6 = "endColor"
            boolean r6 = defpackage.b0h.D(r3, r6)
            if (r6 != 0) goto L_0x0113
            r11 = 0
            goto L_0x011a
        L_0x0113:
            r6 = 0
            int r23 = r2.getColor(r11, r6)
            r11 = r23
        L_0x011a:
            int r6 = defpackage.foc.GradientColor_android_tileMode
            r20 = r5
            java.lang.String r5 = "tileMode"
            boolean r5 = defpackage.b0h.D(r3, r5)
            if (r5 != 0) goto L_0x0128
            r6 = 0
            goto L_0x012d
        L_0x0128:
            r5 = 0
            int r6 = r2.getInt(r6, r5)
        L_0x012d:
            int r5 = defpackage.foc.GradientColor_android_gradientRadius
            r21 = r9
            java.lang.String r9 = "gradientRadius"
            boolean r9 = defpackage.b0h.D(r3, r9)
            if (r9 != 0) goto L_0x013b
            r5 = 0
            goto L_0x0140
        L_0x013b:
            r9 = 0
            float r5 = r2.getFloat(r5, r9)
        L_0x0140:
            r2.recycle()
            int r2 = r3.getDepth()
            r9 = 1
            int r2 = r2 + r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r22 = r5
            r5 = 20
            r9.<init>(r5)
            r24 = r15
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r5)
        L_0x0159:
            int r5 = r3.next()
            r25 = r14
            r14 = 1
            if (r5 == r14) goto L_0x01d7
            int r14 = r3.getDepth()
            r26 = r13
            if (r14 >= r2) goto L_0x016d
            r13 = 3
            if (r5 == r13) goto L_0x01d9
        L_0x016d:
            r13 = 2
            if (r5 == r13) goto L_0x0175
        L_0x0170:
            r14 = r25
            r13 = r26
            goto L_0x0159
        L_0x0175:
            if (r14 > r2) goto L_0x01b9
            java.lang.String r5 = r3.getName()
            java.lang.String r13 = "item"
            boolean r5 = r5.equals(r13)
            if (r5 != 0) goto L_0x0184
            goto L_0x0170
        L_0x0184:
            int[] r5 = defpackage.foc.GradientColorItem
            android.content.res.TypedArray r5 = defpackage.b0h.F(r0, r1, r4, r5)
            int r13 = defpackage.foc.GradientColorItem_android_color
            boolean r13 = r5.hasValue(r13)
            int r14 = defpackage.foc.GradientColorItem_android_offset
            boolean r14 = r5.hasValue(r14)
            if (r13 == 0) goto L_0x01bc
            if (r14 == 0) goto L_0x01bc
            int r13 = defpackage.foc.GradientColorItem_android_color
            r14 = 0
            int r13 = r5.getColor(r13, r14)
            int r14 = defpackage.foc.GradientColorItem_android_offset
            r0 = 0
            float r14 = r5.getFloat(r14, r0)
            r5.recycle()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r15.add(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r14)
            r9.add(r0)
        L_0x01b9:
            r0 = r27
            goto L_0x0170
        L_0x01bc:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01d7:
            r26 = r13
        L_0x01d9:
            int r0 = r15.size()
            if (r0 <= 0) goto L_0x01e5
            npg r0 = new npg
            r0.<init>((java.util.ArrayList) r15, (java.util.ArrayList) r9)
            goto L_0x01e6
        L_0x01e5:
            r0 = 0
        L_0x01e6:
            if (r0 == 0) goto L_0x01ea
        L_0x01e8:
            r1 = 1
            goto L_0x01f8
        L_0x01ea:
            if (r18 == 0) goto L_0x01f2
            npg r0 = new npg
            r0.<init>((int) r7, (int) r10, (int) r11)
            goto L_0x01e8
        L_0x01f2:
            npg r0 = new npg
            r0.<init>((int) r7, (int) r11)
            goto L_0x01e8
        L_0x01f8:
            if (r8 == r1) goto L_0x0237
            r2 = 2
            if (r8 == r2) goto L_0x0225
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            if (r6 == r1) goto L_0x020b
            if (r6 == r2) goto L_0x0208
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
        L_0x0205:
            r18 = r1
            goto L_0x020e
        L_0x0208:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x0205
        L_0x020b:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT
            goto L_0x0205
        L_0x020e:
            java.lang.Object r1 = r0.b
            r16 = r1
            int[] r16 = (int[]) r16
            java.lang.Object r0 = r0.c
            r17 = r0
            float[] r17 = (float[]) r17
            r11 = r3
            r13 = r26
            r14 = r25
            r15 = r24
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0269
        L_0x0225:
            android.graphics.SweepGradient r3 = new android.graphics.SweepGradient
            java.lang.Object r1 = r0.b
            int[] r1 = (int[]) r1
            java.lang.Object r0 = r0.c
            float[] r0 = (float[]) r0
            r5 = r20
            r9 = r21
            r3.<init>(r5, r9, r1, r0)
            goto L_0x0269
        L_0x0237:
            r5 = r20
            r9 = r21
            r1 = 0
            int r1 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0271
            android.graphics.RadialGradient r3 = new android.graphics.RadialGradient
            r1 = 1
            if (r6 == r1) goto L_0x024e
            r1 = 2
            if (r6 == r1) goto L_0x024b
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
            goto L_0x0250
        L_0x024b:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x0250
        L_0x024e:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT
        L_0x0250:
            java.lang.Object r2 = r0.b
            r20 = r2
            int[] r20 = (int[]) r20
            java.lang.Object r0 = r0.c
            r21 = r0
            float[] r21 = (float[]) r21
            r16 = r3
            r17 = r5
            r18 = r9
            r19 = r22
            r22 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
        L_0x0269:
            cs r0 = new cs
            r1 = 0
            r2 = 0
            r0.<init>((android.graphics.Shader) r3, (android.content.res.ColorStateList) r1, (int) r2)
            return r0
        L_0x0271:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)
            throw r0
        L_0x0279:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid gradient color tag "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0297:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs.k(android.content.res.Resources, int, android.content.res.Resources$Theme):cs");
    }

    public void A(l28 l28, int i, IOException iOException, boolean z) {
        z(l28, i, -1, (ea6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public void B(l28 l28, es8 es8, IOException iOException, boolean z) {
        Iterator it = ((CopyOnWriteArrayList) this.o).iterator();
        while (it.hasNext()) {
            tz8 tz8 = (tz8) it.next();
            v0g.W(tz8.a, new dl4(this, tz8.b, l28, es8, iOException, z, 2));
        }
    }

    public void C(l28 l28, int i, int i2, ea6 ea6, int i3, Object obj, long j, long j2) {
        es8 es8 = new es8(i, i2, ea6, i3, obj, v0g.h0(j), v0g.h0(j2));
        l28 l282 = l28;
        D(l28, es8);
    }

    public void D(l28 l28, es8 es8) {
        Iterator it = ((CopyOnWriteArrayList) this.o).iterator();
        while (it.hasNext()) {
            tz8 tz8 = (tz8) it.next();
            v0g.W(tz8.a, new rz8(this, tz8.b, l28, es8, 0));
        }
    }

    public cs F(Object obj, Object obj2) {
        int i = (this.b + 1) * 2;
        Object[] objArr = (Object[]) this.c;
        if (i > objArr.length) {
            this.c = Arrays.copyOf(objArr, jb7.h(objArr.length, i));
        }
        m5a.l(obj, obj2);
        Object[] objArr2 = (Object[]) this.c;
        int i2 = this.b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
        return this;
    }

    public synchronized void G(Object obj, Object obj2) {
        Object remove = ((LinkedHashMap) this.o).remove(obj);
        this.b -= remove == null ? 0 : ((d1g) this.c).i(remove);
        ((LinkedHashMap) this.o).put(obj, obj2);
        this.b += ((d1g) this.c).i(obj2);
    }

    public void H(Map.Entry entry) {
        F(entry.getKey(), entry.getValue());
    }

    public cs I(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.b) * 2;
            Object[] objArr = (Object[]) this.c;
            if (size > objArr.length) {
                this.c = Arrays.copyOf(objArr, jb7.h(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            H((Map.Entry) it.next());
        }
        return this;
    }

    public synchronized Object J(Object obj) {
        Object remove;
        remove = ((LinkedHashMap) this.o).remove(obj);
        this.b -= remove == null ? 0 : ((d1g) this.c).i(remove);
        return remove;
    }

    public synchronized ArrayList K(psb psb) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((LinkedHashMap) this.o).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (psb.apply(entry.getKey())) {
                arrayList.add(entry.getValue());
                int i = this.b;
                Object value = entry.getValue();
                this.b = i - (value == null ? 0 : ((d1g) this.c).i(value));
                it.remove();
            }
        }
        return arrayList;
    }

    public List L(CharSequence charSequence) {
        charSequence.getClass();
        d6a d6a = (d6a) this.o;
        d6a.getClass();
        nhe nhe = new nhe(d6a, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (nhe.hasNext()) {
            arrayList.add((String) nhe.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void M(es8 es8) {
        nz8 nz8 = (nz8) this.c;
        nz8.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.o).iterator();
        while (it.hasNext()) {
            tz8 tz8 = (tz8) it.next();
            v0g.W(tz8.a, new jh3(13, this, tz8.b, nz8, es8));
        }
    }

    public void a(Object obj) {
        yx8 yx8 = ((iy8) this.o).w;
        Handler handler = yx8.l;
        int i = this.b;
        cx8 cx8 = (cx8) this.c;
        v0g.W(handler, new uo5(yx8, cx8, new w55((Object) this, i, (Object) (List) obj, (Object) cx8, 3), 29));
    }

    public boolean b(pye pye) {
        Object obj;
        Object obj2 = this.c;
        while (true) {
            Object[] objArr = obj2;
            int i = 0;
            if (objArr == null) {
                return false;
            }
            while (i < 4 && (obj = objArr[i]) != null) {
                if (obj == lea.a) {
                    pye.b();
                    return true;
                } else if (obj instanceof jea) {
                    pye.onError(((jea) obj).a);
                    return true;
                } else {
                    if (obj instanceof kea) {
                        pye.e(((kea) obj).a);
                    } else {
                        pye.d(obj);
                    }
                    i++;
                }
            }
            obj2 = objArr[4];
        }
    }

    public void c(Object obj) {
        int i = this.b;
        if (i == 4) {
            Object obj2 = new Object[5];
            ((Object[]) this.o)[4] = obj2;
            this.o = obj2;
            i = 0;
        }
        ((Object[]) this.o)[i] = obj;
        this.b = i + 1;
    }

    public sc0 d() {
        String str = ((Long) this.o) == null ? " tokenExpirationTimestamp" : "";
        if (str.isEmpty()) {
            return new sc0(this.b, (String) this.c, ((Long) this.o).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public nn0 f(gf4 gf4, long j) {
        gf4 gf42 = gf4;
        long j2 = gf42.o;
        long n = n(gf4);
        long r = gf4.r();
        gf42.a(Math.max(6, ((uq5) this.c).d), false);
        long n2 = n(gf4);
        return (n > j || n2 <= j) ? n2 <= j ? new nn0(-2, n2, gf4.r()) : new nn0(-1, n, j2) : new nn0(0, -9223372036854775807L, r);
    }

    public void g(Throwable th) {
    }

    public wb7 h() {
        p0d p0d;
        vb7 vb7 = (vb7) this.o;
        if (vb7 == null) {
            int i = this.b;
            Object[] objArr = (Object[]) this.c;
            if (i == 0) {
                p0d = p0d.y;
            } else if (i == 1) {
                Objects.requireNonNull(objArr[0]);
                Objects.requireNonNull(objArr[1]);
                p0d = new p0d((Object) null, objArr, 1);
            } else {
                b0h.i(i, objArr.length >> 1);
                Object j = p0d.j(objArr, i, dc7.n(i), 0);
                if (j instanceof Object[]) {
                    Object[] objArr2 = (Object[]) j;
                    this.o = (vb7) objArr2[2];
                    Object obj = objArr2[0];
                    int intValue = ((Integer) objArr2[1]).intValue();
                    objArr = Arrays.copyOf(objArr, intValue * 2);
                    j = obj;
                    i = intValue;
                }
                p0d = new p0d(j, objArr, i);
            }
            vb7 vb72 = (vb7) this.o;
            if (vb72 == null) {
                return p0d;
            }
            throw vb72.a();
        }
        throw vb7.a();
    }

    public td4 i(y28 y28, y54 y54, qpg qpg, int i, int[] iArr, md5 md5, int i2, long j, boolean z, ArrayList arrayList, gpb gpb, brf brf) {
        brf brf2 = brf;
        j74 a2 = ((g74) this.c).a();
        if (brf2 != null) {
            a2.H(brf2);
        }
        return new td4((qf4) this.o, y28, y54, qpg, i, iArr, md5, i2, a2, j, this.b, z, arrayList, gpb);
    }

    public boolean j(UnsatisfiedLinkError unsatisfiedLinkError, nfe[] nfeArr) {
        int i;
        Context context = (Context) this.c;
        String str = context.getApplicationInfo().sourceDir;
        boolean exists = new File(str).exists();
        ni0 ni0 = (ni0) this.o;
        if (!exists || !ni0.K(str)) {
            int i2 = this.b;
            synchronized (ni0) {
                i = ni0.b;
            }
            return i2 != i;
        }
        for (int i3 = 0; i3 < nfeArr.length; i3++) {
            nfe nfe = nfeArr[i3];
            if (nfe instanceof oyc) {
                nfeArr[i3] = ((oyc) nfe).a(context);
            }
        }
        return true;
    }

    public void l(int i, ea6 ea6, int i2, Object obj, long j) {
        m(new es8(1, i, ea6, i2, obj, v0g.h0(j), -9223372036854775807L));
    }

    public void m(es8 es8) {
        Iterator it = ((CopyOnWriteArrayList) this.o).iterator();
        while (it.hasNext()) {
            tz8 tz8 = (tz8) it.next();
            v0g.W(tz8.a, new x55((Object) this, (Object) tz8.b, (Object) es8, 20));
        }
    }

    public long n(gf4 gf4) {
        long j;
        yl4 yl4;
        uq5 uq5;
        boolean z;
        int c2;
        gf4 gf42 = gf4;
        while (true) {
            long r = gf4.r();
            j = gf42.c;
            int i = (r > (j - 6) ? 1 : (r == (j - 6) ? 0 : -1));
            yl4 = (yl4) this.o;
            uq5 = (uq5) this.c;
            if (i >= 0) {
                break;
            }
            long r2 = gf4.r();
            int i2 = 2;
            byte[] bArr = new byte[2];
            gf42.q(bArr, 0, 2, false);
            byte b2 = ((bArr[0] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE);
            int i3 = this.b;
            if (b2 != i3) {
                gf42.w = 0;
                gf42.a((int) (r2 - gf42.o), false);
                z = false;
            } else {
                g1g g1g = new g1g(16);
                System.arraycopy(bArr, 0, g1g.a, 0, 2);
                byte[] bArr2 = g1g.a;
                int i4 = 0;
                while (i4 < 14 && (c2 = gf42.c(i2 + i4, bArr2, 14 - i4)) != -1) {
                    i4 += c2;
                    i2 = 2;
                }
                g1g.G(i4);
                gf42.w = 0;
                gf42.a((int) (r2 - gf42.o), false);
                z = hsg.g(g1g, uq5, i3, yl4);
            }
            if (z) {
                break;
            }
            gf42.a(1, false);
        }
        if (gf4.r() < j - 6) {
            return yl4.b;
        }
        gf42.a((int) (j - gf4.r()), false);
        return uq5.k;
    }

    public void o(bs bsVar) {
        Object[] objArr;
        Object[] objArr2 = (Object[]) this.c;
        while (objArr2 != null) {
            int i = 0;
            while (i < 4 && (objArr = objArr2[i]) != null) {
                if (!bsVar.test(objArr)) {
                    i++;
                } else {
                    return;
                }
            }
            objArr2 = objArr2[4];
        }
    }

    public void p(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        ((String) this.o).concat(str);
    }

    public Object q(int i) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        switch (this.a) {
            case 16:
                if (this.b == -1) {
                    this.b = 0;
                }
                while (true) {
                    int i2 = this.b;
                    sparseArray = (SparseArray) this.c;
                    if (i2 > 0 && i < sparseArray.keyAt(i2)) {
                        this.b--;
                    }
                }
                while (this.b < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.b + 1)) {
                    this.b++;
                }
                return sparseArray.valueAt(this.b);
            default:
                if (this.b == -1) {
                    this.b = 0;
                }
                while (true) {
                    int i3 = this.b;
                    sparseArray2 = (SparseArray) this.c;
                    if (i3 > 0 && i < sparseArray2.keyAt(i3)) {
                        this.b--;
                    }
                }
                while (this.b < sparseArray2.size() - 1 && i >= sparseArray2.keyAt(this.b + 1)) {
                    this.b++;
                }
                return sparseArray2.valueAt(this.b);
        }
    }

    public synchronized int r() {
        return ((LinkedHashMap) this.o).size();
    }

    public String s() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.c)[i2];
            if (obj instanceof usd) {
                usd usd = (usd) obj;
                if (!Intrinsics.areEqual((Object) usd.getKind(), (Object) hye.p)) {
                    int i3 = ((int[]) this.o)[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(usd.f(i3));
                    }
                } else if (((int[]) this.o)[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.o)[i2]);
                    sb.append("]");
                }
            } else if (obj != v02.o) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public synchronized int t() {
        return this.b;
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return s();
            case 19:
                StringBuilder sb = new StringBuilder();
                if (((y8c) this.c) == y8c.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.b);
                sb.append(' ');
                sb.append((String) this.o);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = (android.content.res.ColorStateList) r1.o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean u() {
        /*
            r1 = this;
            java.lang.Object r0 = r1.c
            android.graphics.Shader r0 = (android.graphics.Shader) r0
            if (r0 != 0) goto L_0x0014
            java.lang.Object r1 = r1.o
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            if (r1 == 0) goto L_0x0014
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x0014
            r1 = 1
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs.u():boolean");
    }

    public void v(l28 l28, int i, int i2, ea6 ea6, int i3, Object obj, long j, long j2) {
        es8 es8 = new es8(i, i2, ea6, i3, obj, v0g.h0(j), v0g.h0(j2));
        l28 l282 = l28;
        w(l28, es8);
    }

    public void w(l28 l28, es8 es8) {
        Iterator it = ((CopyOnWriteArrayList) this.o).iterator();
        while (it.hasNext()) {
            tz8 tz8 = (tz8) it.next();
            v0g.W(tz8.a, new rz8(this, tz8.b, l28, es8, 2));
        }
    }

    public void x(l28 l28, int i, int i2, ea6 ea6, int i3, Object obj, long j, long j2) {
        es8 es8 = new es8(i, i2, ea6, i3, obj, v0g.h0(j), v0g.h0(j2));
        l28 l282 = l28;
        y(l28, es8);
    }

    public void y(l28 l28, es8 es8) {
        Iterator it = ((CopyOnWriteArrayList) this.o).iterator();
        while (it.hasNext()) {
            tz8 tz8 = (tz8) it.next();
            v0g.W(tz8.a, new rz8(this, tz8.b, l28, es8, 1));
        }
    }

    public void z(l28 l28, int i, int i2, ea6 ea6, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        es8 es8 = new es8(i, i2, ea6, i3, obj, v0g.h0(j), v0g.h0(j2));
        l28 l282 = l28;
        B(l28, es8, iOException, z);
    }

    public /* synthetic */ cs(String str, int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.o = str;
    }

    public cs(String str, String[] strArr) {
        String str2;
        this.a = 12;
        boolean z = false;
        if (r0 == 0) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str3);
            }
            sb.append("] ");
            str2 = sb.toString();
        }
        this.o = str2;
        this.c = str;
        vzg.g(str.length() <= 23 ? true : z, "tag \"%s\" is longer than the %d character maximum", str, 23);
        int i = 2;
        while (i <= 7 && !Log.isLoggable((String) this.c, i)) {
            i++;
        }
        this.b = i;
    }

    public cs(Context context) {
        this.a = 7;
        this.o = new GestureDetector(context, new q00(9, this));
    }

    public cs(Context context, ni0 ni0) {
        int i;
        this.a = 6;
        this.c = context;
        this.o = ni0;
        synchronized (ni0) {
            i = ni0.b;
        }
        this.b = i;
    }

    public cs(ox0 ox0) {
        this.a = 3;
        this.o = new LinkedHashMap();
        this.b = 0;
        this.c = ox0;
    }

    public cs() {
        this.a = 0;
        Object[] objArr = new Object[5];
        this.c = objArr;
        this.o = objArr;
    }

    public cs(qbb qbb) {
        this.a = 16;
        this.c = new SparseArray();
        this.o = qbb;
        this.b = -1;
    }

    public cs(qbb qbb, byte b2) {
        this.a = 17;
        this.c = new SparseArray();
        this.o = qbb;
        this.b = -1;
    }

    public cs(Shader shader, ColorStateList colorStateList, int i) {
        this.a = 2;
        this.c = shader;
        this.o = colorStateList;
        this.b = i;
    }

    public cs(uq5 uq5, int i) {
        this.a = 8;
        this.c = uq5;
        this.b = i;
        this.o = new yl4(6, false);
    }

    public cs(g74 g74) {
        this.a = 4;
        this.o = ov0.X;
        this.c = g74;
        this.b = 1;
    }

    public cs(d6a d6a) {
        this.a = 18;
        this.o = d6a;
        this.c = r22.b;
        this.b = IntCompanionObject.MAX_VALUE;
    }

    public cs(CopyOnWriteArrayList copyOnWriteArrayList, int i, nz8 nz8) {
        this.a = 15;
        this.o = copyOnWriteArrayList;
        this.b = i;
        this.c = nz8;
    }

    public cs(int i) {
        this.a = 10;
        this.c = new Object[(i * 2)];
        this.b = 0;
    }

    public cs(iy8 iy8, cx8 cx8, int i) {
        this.a = 14;
        this.o = iy8;
        this.c = cx8;
        this.b = i;
    }

    public cs(int i, List list, je6 je6) {
        this.a = 5;
        this.b = i;
        this.c = list;
        this.o = je6;
    }
}
