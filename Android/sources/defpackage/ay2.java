package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.text.Layout;
import android.util.Range;
import android.util.Size;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.uuid.Uuid;
import org.apache.http.util.LangUtils;

/* renamed from: ay2  reason: default package */
public final class ay2 implements q62, ize, v2f {
    public static final byte[] X = {0, 119, -120, -1};
    public static final byte[] Y = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public static final byte[] z = {0, 7, 8, 15};
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object o;
    public Object v;
    public Object w;
    public Object x;
    public Object y;

    public /* synthetic */ ay2(int i) {
        this.a = i;
    }

    public static final void a(ay2 ay2) {
        SparseArray sparseArray = (SparseArray) ay2.w;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.keyAt(i);
            iwe iwe = (iwe) sparseArray.valueAt(i);
            SparseArray sparseArray2 = (SparseArray) ay2.x;
            iwe.getClass();
            List list = (List) sparseArray2.get(0);
            if (list == null) {
                list = new ArrayList();
                sparseArray2.put(0, list);
            }
            list.add(iwe);
        }
        sparseArray.clear();
        ((SparseArray) ay2.v).clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(defpackage.ay2 r4, long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof defpackage.vx2
            if (r0 == 0) goto L_0x0016
            r0 = r7
            vx2 r0 = (defpackage.vx2) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x001b
        L_0x0016:
            vx2 r0 = new vx2
            r0.<init>(r4, r7)
        L_0x001b:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            long r5 = r0.b
            ay2 r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ ChatNotFoundException -> 0x0030 }
            goto L_0x0058
        L_0x0030:
            r7 = move-exception
            goto L_0x005c
        L_0x0032:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r4.o     // Catch:{ ChatNotFoundException -> 0x0030 }
            kotlin.Lazy r7 = (kotlin.Lazy) r7     // Catch:{ ChatNotFoundException -> 0x0030 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ ChatNotFoundException -> 0x0030 }
            r62 r7 = (defpackage.r62) r7     // Catch:{ ChatNotFoundException -> 0x0030 }
            lbe r7 = r7.C(r5)     // Catch:{ ChatNotFoundException -> 0x0030 }
            r0.a = r4     // Catch:{ ChatNotFoundException -> 0x0030 }
            r0.b = r5     // Catch:{ ChatNotFoundException -> 0x0030 }
            r0.v = r3     // Catch:{ ChatNotFoundException -> 0x0030 }
            java.lang.Object r7 = defpackage.bs0.f(r7, r0)     // Catch:{ ChatNotFoundException -> 0x0030 }
            if (r7 != r1) goto L_0x0058
            goto L_0x0073
        L_0x0058:
            a32 r7 = (defpackage.a32) r7     // Catch:{ ChatNotFoundException -> 0x0030 }
            r1 = r7
            goto L_0x0073
        L_0x005c:
            java.lang.Object r4 = r4.b
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "failed to fetch chat for chatId="
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            defpackage.z68.f(r4, r5, r7)
            r4 = 0
            r1 = r4
        L_0x0073:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay2.d(ay2, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(defpackage.ay2 r7, long r8, kotlin.coroutines.Continuation r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof defpackage.wx2
            if (r0 == 0) goto L_0x0016
            r0 = r10
            wx2 r0 = (defpackage.wx2) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x001b
        L_0x0016:
            wx2 r0 = new wx2
            r0.<init>(r7, r10)
        L_0x001b:
            java.lang.Object r10 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            long r8 = r0.b
            ay2 r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ ChatNotFoundException -> 0x0030 }
            goto L_0x006f
        L_0x0030:
            r10 = move-exception
            goto L_0x0073
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r7.o     // Catch:{ ChatNotFoundException -> 0x0030 }
            kotlin.Lazy r10 = (kotlin.Lazy) r10     // Catch:{ ChatNotFoundException -> 0x0030 }
            java.lang.Object r10 = r10.getValue()     // Catch:{ ChatNotFoundException -> 0x0030 }
            r62 r10 = (defpackage.r62) r10     // Catch:{ ChatNotFoundException -> 0x0030 }
            ma3 r2 = r10.g()     // Catch:{ ChatNotFoundException -> 0x0030 }
            d62 r4 = new d62     // Catch:{ ChatNotFoundException -> 0x0030 }
            r5 = 2
            r4.<init>(r10, r8, r5)     // Catch:{ ChatNotFoundException -> 0x0030 }
            mka r5 = new mka     // Catch:{ ChatNotFoundException -> 0x0030 }
            r6 = 2
            r5.<init>(r6, r4)     // Catch:{ ChatNotFoundException -> 0x0030 }
            hb3 r4 = new hb3     // Catch:{ ChatNotFoundException -> 0x0030 }
            r4.<init>(r5, r2)     // Catch:{ ChatNotFoundException -> 0x0030 }
            lfd r10 = r10.y     // Catch:{ ChatNotFoundException -> 0x0030 }
            fce r10 = r4.n(r10)     // Catch:{ ChatNotFoundException -> 0x0030 }
            r0.a = r7     // Catch:{ ChatNotFoundException -> 0x0030 }
            r0.b = r8     // Catch:{ ChatNotFoundException -> 0x0030 }
            r0.v = r3     // Catch:{ ChatNotFoundException -> 0x0030 }
            java.lang.Object r10 = defpackage.bs0.f(r10, r0)     // Catch:{ ChatNotFoundException -> 0x0030 }
            if (r10 != r1) goto L_0x006f
            goto L_0x008a
        L_0x006f:
            a32 r10 = (defpackage.a32) r10     // Catch:{ ChatNotFoundException -> 0x0030 }
            r1 = r10
            goto L_0x008a
        L_0x0073:
            java.lang.Object r7 = r7.b
            java.lang.String r7 = (java.lang.String) r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "failed to fetch chat for serverId="
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            defpackage.z68.f(r7, r8, r10)
            r7 = 0
            r1 = r7
        L_0x008a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay2.e(ay2, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static byte[] g(int i, int i2, ky1 ky1) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ky1.i(i2);
        }
        return bArr;
    }

    public static int[] h() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = j(KotlinVersion.MAX_COMPONENT_VALUE, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = 127;
                int i3 = (i & 1) != 0 ? 127 : 0;
                int i4 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = j(KotlinVersion.MAX_COMPONENT_VALUE, i3, i4, i2);
            }
        }
        return iArr;
    }

    public static int[] i() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i2 = KotlinVersion.MAX_COMPONENT_VALUE;
            if (i < 8) {
                int i3 = (i & 1) != 0 ? 255 : 0;
                int i4 = (i & 2) != 0 ? 255 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = j(63, i3, i4, i2);
            } else {
                int i5 = i & 136;
                int i6 = 170;
                int i7 = 85;
                if (i5 == 0) {
                    int i8 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i9 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = j(KotlinVersion.MAX_COMPONENT_VALUE, i8, i9, i7 + i6);
                } else if (i5 != 8) {
                    int i10 = 43;
                    if (i5 == 128) {
                        int i11 = ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0);
                        int i12 = ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        int i13 = i10 + 127;
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = j(KotlinVersion.MAX_COMPONENT_VALUE, i11, i12, i13 + i7);
                    } else if (i5 == 136) {
                        int i14 = ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0);
                        int i15 = ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = j(KotlinVersion.MAX_COMPONENT_VALUE, i14, i15, i10 + i7);
                    }
                } else {
                    int i16 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i17 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = j(127, i16, i17, i7 + i6);
                }
            }
        }
        return iArr;
    }

    public static int j(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v32, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v7, types: [byte] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x022b A[LOOP:3: B:84:0x017a->B:113:0x022b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0226 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void n(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            r0 = r23
            r1 = r25
            r8 = r28
            ky1 r9 = new ky1
            int r2 = r0.length
            r3 = 2
            r4 = 0
            r9.<init>((byte[]) r0, (byte) r4, (int) r2, (int) r3)
            r2 = r26
            r10 = r27
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0015:
            int r3 = r9.b()
            if (r3 == 0) goto L_0x0236
            r14 = 8
            int r3 = r9.i(r14)
            r4 = 240(0xf0, float:3.36E-43)
            if (r3 == r4) goto L_0x0230
            r15 = 1
            r16 = 0
            r7 = 3
            r6 = 4
            r5 = 2
            switch(r3) {
                case 16: goto L_0x015f;
                case 17: goto L_0x00a0;
                case 18: goto L_0x0043;
                default: goto L_0x002e;
            }
        L_0x002e:
            switch(r3) {
                case 32: goto L_0x003e;
                case 33: goto L_0x0039;
                case 34: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0015
        L_0x0032:
            r3 = 16
            byte[] r12 = g(r3, r14, r9)
            goto L_0x0015
        L_0x0039:
            byte[] r11 = g(r6, r14, r9)
            goto L_0x0015
        L_0x003e:
            byte[] r13 = g(r6, r6, r9)
            goto L_0x0015
        L_0x0043:
            r7 = r2
            r2 = r16
        L_0x0046:
            int r3 = r9.i(r14)
            if (r3 == 0) goto L_0x0051
            r17 = r2
            r18 = r15
            goto L_0x0079
        L_0x0051:
            boolean r3 = r9.h()
            r4 = 7
            if (r3 != 0) goto L_0x006c
            int r3 = r9.i(r4)
            if (r3 == 0) goto L_0x0065
            r17 = r2
            r18 = r3
            r3 = r16
            goto L_0x0079
        L_0x0065:
            r17 = r15
            r3 = r16
            r18 = r3
            goto L_0x0079
        L_0x006c:
            int r3 = r9.i(r4)
            int r4 = r9.i(r14)
            r17 = r2
            r18 = r3
            r3 = r4
        L_0x0079:
            if (r18 == 0) goto L_0x0094
            if (r8 == 0) goto L_0x0094
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r7
            float r4 = (float) r10
            int r2 = r7 + r18
            float r5 = (float) r2
            int r2 = r10 + 1
            float r6 = (float) r2
            r2 = r29
            r19 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0096
        L_0x0094:
            r19 = r7
        L_0x0096:
            int r7 = r19 + r18
            if (r17 == 0) goto L_0x009d
        L_0x009a:
            r2 = r7
            goto L_0x0015
        L_0x009d:
            r2 = r17
            goto L_0x0046
        L_0x00a0:
            if (r1 != r7) goto L_0x00ab
            if (r12 != 0) goto L_0x00a7
            byte[] r3 = Y
            goto L_0x00a8
        L_0x00a7:
            r3 = r12
        L_0x00a8:
            r17 = r3
            goto L_0x00ad
        L_0x00ab:
            r17 = 0
        L_0x00ad:
            r4 = r2
            r2 = r16
        L_0x00b0:
            int r3 = r9.i(r6)
            if (r3 == 0) goto L_0x00bc
            r18 = r2
            r19 = r15
            goto L_0x011d
        L_0x00bc:
            boolean r3 = r9.h()
            if (r3 != 0) goto L_0x00d8
            int r3 = r9.i(r7)
            if (r3 == 0) goto L_0x00d1
            int r3 = r3 + 2
            r18 = r2
            r19 = r3
        L_0x00ce:
            r3 = r16
            goto L_0x011d
        L_0x00d1:
            r18 = r15
        L_0x00d3:
            r3 = r16
            r19 = r3
            goto L_0x011d
        L_0x00d8:
            boolean r3 = r9.h()
            if (r3 != 0) goto L_0x00ee
            int r3 = r9.i(r5)
            int r3 = r3 + r6
            int r18 = r9.i(r6)
        L_0x00e7:
            r19 = r3
            r3 = r18
            r18 = r2
            goto L_0x011d
        L_0x00ee:
            int r3 = r9.i(r5)
            if (r3 == 0) goto L_0x0118
            if (r3 == r15) goto L_0x0113
            if (r3 == r5) goto L_0x0108
            if (r3 == r7) goto L_0x00fd
            r18 = r2
            goto L_0x00d3
        L_0x00fd:
            int r3 = r9.i(r14)
            int r3 = r3 + 25
            int r18 = r9.i(r6)
            goto L_0x00e7
        L_0x0108:
            int r3 = r9.i(r6)
            int r3 = r3 + 9
            int r18 = r9.i(r6)
            goto L_0x00e7
        L_0x0113:
            r18 = r2
            r19 = r5
            goto L_0x00ce
        L_0x0118:
            r18 = r2
            r19 = r15
            goto L_0x00ce
        L_0x011d:
            if (r19 == 0) goto L_0x0148
            if (r8 == 0) goto L_0x0148
            if (r17 == 0) goto L_0x0125
            byte r3 = r17[r3]
        L_0x0125:
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r4
            float r2 = (float) r10
            int r0 = r4 + r19
            float r0 = (float) r0
            int r5 = r10 + 1
            float r5 = (float) r5
            r20 = r2
            r2 = r29
            r21 = r4
            r4 = r20
            r22 = r5
            r14 = 2
            r5 = r0
            r0 = r6
            r6 = r22
            r0 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x014c
        L_0x0148:
            r21 = r4
            r14 = r5
            r0 = r7
        L_0x014c:
            int r4 = r21 + r19
            if (r18 == 0) goto L_0x0156
            r9.c()
            r2 = r4
            goto L_0x0015
        L_0x0156:
            r7 = r0
            r5 = r14
            r2 = r18
            r6 = 4
            r14 = 8
            goto L_0x00b0
        L_0x015f:
            r14 = r5
            r0 = r7
            if (r1 != r0) goto L_0x016c
            if (r11 != 0) goto L_0x0168
            byte[] r3 = X
            goto L_0x0169
        L_0x0168:
            r3 = r11
        L_0x0169:
            r17 = r3
            goto L_0x0177
        L_0x016c:
            if (r1 != r14) goto L_0x0175
            if (r13 != 0) goto L_0x0173
            byte[] r3 = z
            goto L_0x0169
        L_0x0173:
            r3 = r13
            goto L_0x0169
        L_0x0175:
            r17 = 0
        L_0x0177:
            r7 = r2
            r2 = r16
        L_0x017a:
            int r3 = r9.i(r14)
            if (r3 == 0) goto L_0x0189
            r18 = r2
            r19 = r15
        L_0x0184:
            r5 = 4
            r6 = 8
            goto L_0x01f6
        L_0x0189:
            boolean r3 = r9.h()
            if (r3 == 0) goto L_0x019e
            int r3 = r9.i(r0)
            int r5 = r3 + 3
            int r3 = r9.i(r14)
            r18 = r2
            r19 = r5
            goto L_0x0184
        L_0x019e:
            boolean r3 = r9.h()
            if (r3 == 0) goto L_0x01ab
            r18 = r2
            r19 = r15
            r3 = r16
            goto L_0x0184
        L_0x01ab:
            int r3 = r9.i(r14)
            if (r3 == 0) goto L_0x01ed
            if (r3 == r15) goto L_0x01e3
            if (r3 == r14) goto L_0x01d0
            if (r3 == r0) goto L_0x01be
            r18 = r2
            r3 = r16
            r19 = r3
            goto L_0x0184
        L_0x01be:
            r6 = 8
            int r3 = r9.i(r6)
            int r5 = r3 + 29
            int r3 = r9.i(r14)
            r18 = r2
            r19 = r5
            r5 = 4
            goto L_0x01f6
        L_0x01d0:
            r5 = 4
            r6 = 8
            int r3 = r9.i(r5)
            int r3 = r3 + 12
            int r4 = r9.i(r14)
            r18 = r2
            r19 = r3
            r3 = r4
            goto L_0x01f6
        L_0x01e3:
            r5 = 4
            r6 = 8
            r18 = r2
            r19 = r14
            r3 = r16
            goto L_0x01f6
        L_0x01ed:
            r5 = 4
            r6 = 8
            r18 = r15
            r3 = r16
            r19 = r3
        L_0x01f6:
            if (r19 == 0) goto L_0x021d
            if (r8 == 0) goto L_0x021d
            if (r17 == 0) goto L_0x01fe
            byte r3 = r17[r3]
        L_0x01fe:
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r7
            float r4 = (float) r10
            int r2 = r7 + r19
            float r2 = (float) r2
            int r0 = r10 + 1
            float r0 = (float) r0
            r21 = r2
            r2 = r29
            r22 = r5
            r5 = r21
            r21 = r6
            r6 = r0
            r0 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0222
        L_0x021d:
            r22 = r5
            r21 = r6
            r0 = r7
        L_0x0222:
            int r7 = r0 + r19
            if (r18 == 0) goto L_0x022b
            r9.c()
            goto L_0x009a
        L_0x022b:
            r2 = r18
            r0 = 3
            goto L_0x017a
        L_0x0230:
            int r10 = r10 + 2
            r2 = r26
            goto L_0x0015
        L_0x0236:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay2.n(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static ey4 o(ky1 ky1, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ky1 ky12 = ky1;
        int i7 = 8;
        int i8 = ky12.i(8);
        ky12.t(8);
        int i9 = 2;
        int i10 = i - 2;
        int i11 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] h = h();
        int[] i12 = i();
        while (i10 > 0) {
            int i13 = ky12.i(i7);
            int i14 = ky12.i(i7);
            int[] iArr2 = (i14 & Uuid.SIZE_BITS) != 0 ? iArr : (i14 & 64) != 0 ? h : i12;
            if ((i14 & 1) != 0) {
                i5 = ky12.i(i7);
                i4 = ky12.i(i7);
                i3 = ky12.i(i7);
                i2 = ky12.i(i7);
                i6 = i10 - 6;
            } else {
                i3 = ky12.i(4) << 4;
                i6 = i10 - 4;
                int i15 = ky12.i(4) << 4;
                i2 = ky12.i(i9) << 6;
                i5 = ky12.i(6) << i9;
                i4 = i15;
            }
            if (i5 == 0) {
                i4 = i11;
                i3 = i4;
                i2 = 255;
            }
            double d = (double) i5;
            double d2 = (double) (i4 - 128);
            double d3 = (double) (i3 - 128);
            iArr2[i13] = j((byte) (255 - (i2 & KotlinVersion.MAX_COMPONENT_VALUE)), v0g.j((int) ((1.402d * d2) + d), 0, KotlinVersion.MAX_COMPONENT_VALUE), v0g.j((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, KotlinVersion.MAX_COMPONENT_VALUE), v0g.j((int) ((d3 * 1.772d) + d), 0, KotlinVersion.MAX_COMPONENT_VALUE));
            i10 = i6;
            i11 = 0;
            i8 = i8;
            i12 = i12;
            i7 = 8;
            i9 = 2;
        }
        return new ey4(i8, iArr, h, i12);
    }

    public static hy4 p(ky1 ky1) {
        byte[] bArr;
        int i = ky1.i(16);
        ky1.t(4);
        int i2 = ky1.i(2);
        boolean h = ky1.h();
        ky1.t(1);
        byte[] bArr2 = v0g.f;
        if (i2 == 1) {
            ky1.t(ky1.i(8) * 16);
        } else if (i2 == 0) {
            int i3 = ky1.i(16);
            int i4 = ky1.i(16);
            if (i3 > 0) {
                bArr2 = new byte[i3];
                ky1.l(i3, bArr2);
            }
            if (i4 > 0) {
                bArr = new byte[i4];
                ky1.l(i4, bArr);
                return new hy4(i, h, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new hy4(i, h, bArr2, bArr);
    }

    public void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tz9 tz9 = (tz9) ((ConcurrentHashMap) this.x).remove(Long.valueOf(((Number) it.next()).longValue()));
            if (tz9 != null) {
                a32 a32 = (a32) tz9.getValue();
                tz9.setValue((Object) null);
                if (a32 != null) {
                    m72 m72 = a32.b;
                    if (m72.a != 0 || m72.h(((cjd) ((Lazy) this.v).getValue()).a())) {
                        tz9 tz92 = (tz9) ((ConcurrentHashMap) this.y).remove(Long.valueOf(m72.a));
                        if (tz92 != null) {
                            tz92.setValue((Object) null);
                        }
                    } else {
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a32 a32 = (a32) it.next();
            ((tz9) ((ConcurrentHashMap) this.x).computeIfAbsent(Long.valueOf(a32.a), new yi(2, new sx2(a32, 1)))).setValue(a32);
            m72 m72 = a32.b;
            if (m72.a != 0 || m72.h(((cjd) ((Lazy) this.v).getValue()).a())) {
                ((tz9) ((ConcurrentHashMap) this.y).computeIfAbsent(Long.valueOf(m72.a), new yi(3, new sx2(a32, 0)))).setValue(a32);
            } else {
                return;
            }
        }
    }

    public Object get() {
        sa0 sa0 = (sa0) this.w;
        int i = sa0.d;
        Range range = z3f.p;
        Range range2 = (Range) this.y;
        int intValue = !Objects.equals(range2, range) ? ((Integer) range2.clamp(Integer.valueOf(i))).intValue() : i;
        Integer valueOf = Integer.valueOf(intValue);
        Integer valueOf2 = Integer.valueOf(i);
        boolean equals = Objects.equals(range2, range);
        Object obj = range2;
        if (!equals) {
            obj = "<UNSPECIFIED>";
        }
        String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", new Object[]{valueOf, valueOf2, obj});
        Range range3 = ((yc0) this.o).c;
        int i2 = ((vy4) this.x).b;
        Size size = (Size) this.v;
        int i3 = intValue;
        int c2 = e4g.c(sa0.c, i2, sa0.h, i3, sa0.d, size.getWidth(), sa0.e, size.getHeight(), sa0.f, range3);
        String str = (String) this.b;
        int i4 = sa0.g;
        vc0 a2 = e4g.a(i4, str);
        n09 a3 = uc0.a();
        if (str != null) {
            a3.a = str;
            xjf xjf = (xjf) this.c;
            if (xjf != null) {
                a3.c = xjf;
                a3.o = size;
                a3.z = Integer.valueOf(c2);
                a3.x = Integer.valueOf(intValue);
                a3.b = Integer.valueOf(i4);
                a3.w = a2;
                return a3.a();
            }
            throw new NullPointerException("Null inputTimebase");
        }
        throw new NullPointerException("Null mimeType");
    }

    public Object k(int i) {
        SparseArray sparseArray = (SparseArray) this.v;
        if (sparseArray.indexOfKey(i) >= 0) {
            return sparseArray.get(i);
        }
        Object a2 = ((owe) this.o).a(i);
        sparseArray.put(i, a2);
        return a2;
    }

    public iwe l(int i) {
        SparseArray sparseArray = (SparseArray) this.w;
        iwe iwe = (iwe) sparseArray.get(i);
        if (iwe == null) {
            owe owe = (owe) this.o;
            owe.getClass();
            List list = (List) ((SparseArray) this.x).get(0);
            Collection collection = list;
            RecyclerView recyclerView = (RecyclerView) this.b;
            iwe = (collection == null || collection.isEmpty()) ? owe.b(recyclerView) : (iwe) list.remove(0);
            sparseArray.put(i, iwe);
            owe.c(iwe, i);
            View view = iwe.a;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(marginLayoutParams.width == -1 ? View.MeasureSpec.makeMeasureSpec((recyclerView.getMeasuredWidth() - marginLayoutParams.rightMargin) - recyclerView.getScrollBarSize(), 1073741824) : ViewGroup.getChildMeasureSpec(recyclerView.getMeasuredWidth(), 0, view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(recyclerView.getMeasuredHeight(), 0, view.getLayoutParams().height));
            iq.J(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), view, (RecyclerView) this.b);
            iwe.b = marginLayoutParams.getMarginStart();
            iwe.c = marginLayoutParams.topMargin;
        }
        return iwe;
    }

    public void m(byte[] bArr, int i, int i2, hze hze, pk3 pk3) {
        py4 py4;
        q44 q44;
        char c2;
        char c3;
        int i3;
        int i4;
        fy4 fy4;
        ArrayList arrayList;
        int i5;
        py4 py42;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        my4 my4;
        my4 my42;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = i;
        int i16 = 8;
        int i17 = 0;
        ky1 ky1 = new ky1(bArr, (byte) 0, i15 + i2, 2);
        ky1.q(i15);
        while (true) {
            int b2 = ky1.b();
            py4 = (py4) this.x;
            if (b2 < 48 || ky1.i(i16) != 15) {
                iy4 iy4 = (iy4) py4.i;
            } else {
                int i18 = ky1.i(i16);
                int i19 = 16;
                int i20 = ky1.i(16);
                int i21 = ky1.i(16);
                int f = ky1.f() + i21;
                if (i21 * 8 > ky1.b()) {
                    i8b.V("Data field length exceeds limit");
                    ky1.t(ky1.b());
                } else {
                    switch (i18) {
                        case 16:
                            if (i20 == py4.a) {
                                iy4 iy42 = (iy4) py4.i;
                                ky1.i(i16);
                                int i22 = ky1.i(4);
                                int i23 = ky1.i(2);
                                ky1.t(2);
                                int i24 = i21 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i24 > 0) {
                                    int i25 = ky1.i(i16);
                                    ky1.t(i16);
                                    i24 -= 6;
                                    sparseArray.put(i25, new ky4(ky1.i(16), ky1.i(16)));
                                    i16 = 8;
                                }
                                iy4 iy43 = new iy4(i22, i23, sparseArray);
                                if (i23 == 0) {
                                    if (!(iy42 == null || iy42.a == i22)) {
                                        py4.i = iy43;
                                        break;
                                    }
                                } else {
                                    py4.i = iy43;
                                    py4.c.clear();
                                    py4.d.clear();
                                    py4.e.clear();
                                    break;
                                }
                            }
                            break;
                        case LangUtils.HASH_SEED /*17*/:
                            iy4 iy44 = (iy4) py4.i;
                            if (i20 == py4.a && iy44 != null) {
                                int i26 = ky1.i(i16);
                                ky1.t(4);
                                boolean h = ky1.h();
                                ky1.t(3);
                                int i27 = ky1.i(16);
                                int i28 = ky1.i(16);
                                ky1.i(3);
                                int i29 = ky1.i(3);
                                ky1.t(2);
                                int i30 = ky1.i(i16);
                                int i31 = ky1.i(i16);
                                int i32 = ky1.i(4);
                                int i33 = ky1.i(2);
                                ky1.t(2);
                                int i34 = i21 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i34 > 0) {
                                    int i35 = ky1.i(i19);
                                    int i36 = ky1.i(2);
                                    ky1.i(2);
                                    int i37 = ky1.i(12);
                                    ky1.t(4);
                                    int i38 = ky1.i(12);
                                    int i39 = i34 - 6;
                                    if (i36 == 1 || i36 == 2) {
                                        ky1.i(i16);
                                        ky1.i(i16);
                                        i34 -= 8;
                                    } else {
                                        i34 = i39;
                                    }
                                    sparseArray2.put(i35, new oy4(i37, i38));
                                    i19 = 16;
                                }
                                my4 my43 = new my4(i26, h, i27, i28, i29, i30, i31, i32, i33, sparseArray2);
                                SparseArray sparseArray3 = py4.c;
                                if (iy44.b == 0 && (my42 = (my4) sparseArray3.get(i26)) != null) {
                                    int i40 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = my42.j;
                                        if (i40 < sparseArray4.size()) {
                                            my43.j.put(sparseArray4.keyAt(i40), (oy4) sparseArray4.valueAt(i40));
                                            i40++;
                                        }
                                    }
                                }
                                sparseArray3.put(my43.a, my43);
                                break;
                            }
                        case 18:
                            if (i20 != py4.a) {
                                if (i20 == py4.b) {
                                    ey4 o2 = o(ky1, i21);
                                    py4.f.put(o2.a, o2);
                                    break;
                                }
                            } else {
                                ey4 o3 = o(ky1, i21);
                                py4.d.put(o3.a, o3);
                                break;
                            }
                            break;
                        case 19:
                            if (i20 != py4.a) {
                                if (i20 == py4.b) {
                                    hy4 p = p(ky1);
                                    py4.g.put(p.a, p);
                                    break;
                                }
                            } else {
                                hy4 p2 = p(ky1);
                                py4.e.put(p2.a, p2);
                                break;
                            }
                            break;
                        case 20:
                            if (i20 == py4.a) {
                                ky1.t(4);
                                boolean h2 = ky1.h();
                                ky1.t(3);
                                int i41 = ky1.i(16);
                                int i42 = ky1.i(16);
                                if (h2) {
                                    int i43 = ky1.i(16);
                                    int i44 = ky1.i(16);
                                    int i45 = ky1.i(16);
                                    i14 = i43;
                                    i11 = ky1.i(16);
                                    i13 = i44;
                                    i12 = i45;
                                } else {
                                    i14 = i17;
                                    i12 = i14;
                                    i13 = i41;
                                    i11 = i42;
                                }
                                py4.h = new fy4(i41, i42, i14, i13, i12, i11);
                                break;
                            }
                            break;
                    }
                    ky1.u(f - ky1.f());
                }
                i16 = 8;
                i17 = 0;
            }
        }
        iy4 iy45 = (iy4) py4.i;
        if (iy45 == null) {
            lx5 lx5 = tb7.b;
            q44 = new q44(-9223372036854775807L, -9223372036854775807L, k0d.v);
        } else {
            fy4 fy42 = (fy4) py4.h;
            if (fy42 == null) {
                fy42 = (fy4) this.v;
            }
            Bitmap bitmap = (Bitmap) this.y;
            Canvas canvas = (Canvas) this.o;
            if (!(bitmap != null && fy42.a + 1 == bitmap.getWidth() && fy42.b + 1 == ((Bitmap) this.y).getHeight())) {
                Bitmap createBitmap = Bitmap.createBitmap(fy42.a + 1, fy42.b + 1, Bitmap.Config.ARGB_8888);
                this.y = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            int i46 = 0;
            while (true) {
                SparseArray sparseArray5 = iy45.c;
                if (i46 < sparseArray5.size()) {
                    canvas.save();
                    ky4 ky4 = (ky4) sparseArray5.valueAt(i46);
                    my4 my44 = (my4) py4.c.get(sparseArray5.keyAt(i46));
                    int i47 = ky4.a + fy42.c;
                    int i48 = ky4.b + fy42.e;
                    int min = Math.min(my44.c + i47, fy42.d);
                    int i49 = my44.d;
                    int i50 = i48 + i49;
                    canvas.clipRect(i47, i48, min, Math.min(i50, fy42.f));
                    SparseArray sparseArray6 = py4.d;
                    int i51 = my44.f;
                    ey4 ey4 = (ey4) sparseArray6.get(i51);
                    if (ey4 == null && (ey4 = (ey4) py4.f.get(i51)) == null) {
                        ey4 = (ey4) this.w;
                    }
                    int i52 = 0;
                    while (true) {
                        SparseArray sparseArray7 = my44.j;
                        if (i52 < sparseArray7.size()) {
                            int keyAt = sparseArray7.keyAt(i52);
                            oy4 oy4 = (oy4) sparseArray7.valueAt(i52);
                            iy4 iy46 = iy45;
                            hy4 hy4 = (hy4) py4.e.get(keyAt);
                            if (hy4 == null) {
                                hy4 = (hy4) py4.g.get(keyAt);
                            }
                            if (hy4 != null) {
                                Paint paint = hy4.b ? null : (Paint) this.b;
                                py42 = py4;
                                int i53 = oy4.a + i47;
                                int i54 = oy4.b + i48;
                                i5 = i46;
                                int i55 = my44.e;
                                i6 = i52;
                                arrayList = arrayList2;
                                int i56 = i50;
                                int[] iArr = i55 == 3 ? ey4.d : i55 == 2 ? ey4.c : ey4.b;
                                fy4 = fy42;
                                int i57 = i49;
                                int i58 = i55;
                                i8 = i57;
                                int i59 = i48;
                                int i60 = i53;
                                i7 = i56;
                                i10 = i47;
                                i9 = i59;
                                my4 = my44;
                                Paint paint2 = paint;
                                Canvas canvas2 = canvas;
                                n(hy4.c, iArr, i58, i60, i54, paint2, canvas2);
                                n(hy4.d, iArr, i58, i60, i54 + 1, paint2, canvas2);
                            } else {
                                fy4 = fy42;
                                arrayList = arrayList2;
                                i5 = i46;
                                py42 = py4;
                                i6 = i52;
                                i7 = i50;
                                i8 = i49;
                                i9 = i48;
                                i10 = i47;
                                my4 = my44;
                            }
                            i52 = i6 + 1;
                            iy45 = iy46;
                            my44 = my4;
                            i47 = i10;
                            py4 = py42;
                            i46 = i5;
                            arrayList2 = arrayList;
                            fy42 = fy4;
                            i49 = i8;
                            i50 = i7;
                            i48 = i9;
                        } else {
                            iy4 iy47 = iy45;
                            fy4 fy43 = fy42;
                            ArrayList arrayList3 = arrayList2;
                            int i61 = i46;
                            py4 py43 = py4;
                            int i62 = i50;
                            int i63 = i49;
                            int i64 = i48;
                            int i65 = i47;
                            my4 my45 = my44;
                            boolean z2 = my45.b;
                            int i66 = my45.c;
                            if (z2) {
                                int i67 = my45.e;
                                c3 = 3;
                                if (i67 == 3) {
                                    i4 = ey4.d[my45.g];
                                    c2 = 2;
                                } else {
                                    c2 = 2;
                                    i4 = i67 == 2 ? ey4.c[my45.h] : ey4.b[my45.i];
                                }
                                Paint paint3 = (Paint) this.c;
                                paint3.setColor(i4);
                                i3 = i64;
                                canvas.drawRect((float) i65, (float) i3, (float) (i65 + i66), (float) i62, paint3);
                            } else {
                                i3 = i64;
                                c3 = 3;
                                c2 = 2;
                            }
                            int i68 = i63;
                            Bitmap createBitmap2 = Bitmap.createBitmap((Bitmap) this.y, i65, i3, i66, i68);
                            float f2 = (float) i65;
                            fy4 fy44 = fy43;
                            float f3 = (float) fy44.a;
                            float f4 = f2 / f3;
                            float f5 = (float) fy44.b;
                            ArrayList arrayList4 = arrayList3;
                            arrayList4.add(new n44((CharSequence) null, (Layout.Alignment) null, (Layout.Alignment) null, createBitmap2, ((float) i3) / f5, 0, 0, f4, 0, IntCompanionObject.MIN_VALUE, -3.4028235E38f, ((float) i66) / f3, ((float) i68) / f5, false, -16777216, IntCompanionObject.MIN_VALUE, c44.DEFAULT_ASPECT_RATIO));
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas.restore();
                            py4 = py43;
                            iy45 = iy47;
                            fy4 fy45 = fy44;
                            arrayList2 = arrayList4;
                            fy42 = fy45;
                            char c4 = c3;
                            i46 = i61 + 1;
                            char c5 = c2;
                            char c6 = c4;
                        }
                    }
                } else {
                    q44 = new q44(-9223372036854775807L, -9223372036854775807L, arrayList2);
                }
            }
        }
        pk3.accept(q44);
    }

    public int q() {
        return 2;
    }

    public void reset() {
        switch (this.a) {
            case 1:
                py4 py4 = (py4) this.x;
                py4.c.clear();
                py4.d.clear();
                py4.e.clear();
                py4.f.clear();
                py4.g.clear();
                py4.h = null;
                py4.i = null;
                return;
            default:
                ((yl4) this.b).b = -1;
                ((yl4) this.c).b = -1;
                ((yl4) this.o).b = -1;
                ((yl4) this.v).b = -1;
                ((yl4) this.w).b = -1;
                ((yl4) this.x).b = -1;
                return;
        }
    }

    public ay2() {
        this.a = 4;
        this.b = new yl4(0);
        this.c = new yl4(0);
        this.o = new yl4(0);
        this.v = new yl4(0);
        this.w = new yl4(0);
        this.x = new yl4(0);
        this.y = new xga();
    }

    public ay2(gaf gaf, Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = 0;
        this.b = ay2.class.getName();
        this.c = lazy;
        this.o = lazy2;
        this.v = lazy3;
        this.w = LazyKt.lazy(new tx2(gaf, 0));
        this.x = new ConcurrentHashMap();
        this.y = new ConcurrentHashMap();
    }

    public ay2(Context context, q04 q04, vcd vcd, Lazy lazy, Lazy lazy2) {
        this.a = 3;
        this.b = context;
        this.x = q04;
        this.y = vcd;
        this.c = lazy;
        this.o = lazy2;
        qr3 qr3 = new qr3(6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.v = LazyKt.lazy(lazyThreadSafetyMode, qr3);
        this.w = LazyKt.lazy(lazyThreadSafetyMode, new qr3(7));
    }

    public ay2(RecyclerView recyclerView, tyc tyc, owe owe) {
        this.a = 6;
        this.v = new SparseArray();
        this.w = new SparseArray();
        this.x = new SparseArray();
        this.b = recyclerView;
        this.c = tyc;
        this.o = owe;
        jwe jwe = new jwe(0, this, recyclerView);
        tyc.A(jwe);
        this.y = jwe;
    }

    public ay2(String str, xjf xjf, yc0 yc0, Size size, sa0 sa0, vy4 vy4, Range range) {
        this.a = 7;
        this.b = str;
        this.c = xjf;
        this.o = yc0;
        this.v = size;
        this.w = sa0;
        this.x = vy4;
        this.y = range;
    }

    public ay2(List list) {
        this.a = 1;
        l8b l8b = new l8b((byte[]) list.get(0));
        int A = l8b.A();
        int A2 = l8b.A();
        Paint paint = new Paint();
        this.b = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        this.o = new Canvas();
        this.v = new fy4(719, 575, 0, 719, 0, 575);
        this.w = new ey4(0, new int[]{0, -1, -16777216, -8421505}, h(), i());
        this.x = new py4(A, A2, 1);
    }
}
