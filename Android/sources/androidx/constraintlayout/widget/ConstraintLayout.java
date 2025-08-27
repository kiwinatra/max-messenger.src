package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

public class ConstraintLayout extends ViewGroup {
    public static x6e D0;
    public final l8c A0 = new l8c(this, this);
    public int B0 = 0;
    public int C0 = 0;
    public final SparseArray a = new SparseArray();
    public final ArrayList b = new ArrayList(4);
    public final uj3 c = new uj3();
    public int o = 0;
    public int v = 0;
    public pj3 v0 = null;
    public int w = IntCompanionObject.MAX_VALUE;
    public wsb w0 = null;
    public int x = IntCompanionObject.MAX_VALUE;
    public int x0 = -1;
    public boolean y = true;
    public HashMap y0 = new HashMap();
    public int z = 257;
    public final SparseArray z0 = new SparseArray();

    public ConstraintLayout(Context context) {
        super(context);
        H((AttributeSet) null, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [x6e, java.lang.Object] */
    public static x6e getSharedValues() {
        if (D0 == null) {
            ? obj = new Object();
            new SparseIntArray();
            new HashMap();
            D0 = obj;
        }
        return D0;
    }

    public final tj3 G(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof fj3) {
            return ((fj3) view.getLayoutParams()).p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof fj3) {
            return ((fj3) view.getLayoutParams()).p0;
        }
        return null;
    }

    public final void H(AttributeSet attributeSet, int i) {
        uj3 uj3 = this.c;
        uj3.f0 = this;
        l8c l8c = this.A0;
        uj3.u0 = l8c;
        uj3.s0.g = l8c;
        this.a.put(getId(), this);
        this.v0 = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, doc.ConstraintLayout_Layout, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == doc.ConstraintLayout_Layout_android_minWidth) {
                    this.o = obtainStyledAttributes.getDimensionPixelOffset(index, this.o);
                } else if (index == doc.ConstraintLayout_Layout_android_minHeight) {
                    this.v = obtainStyledAttributes.getDimensionPixelOffset(index, this.v);
                } else if (index == doc.ConstraintLayout_Layout_android_maxWidth) {
                    this.w = obtainStyledAttributes.getDimensionPixelOffset(index, this.w);
                } else if (index == doc.ConstraintLayout_Layout_android_maxHeight) {
                    this.x = obtainStyledAttributes.getDimensionPixelOffset(index, this.x);
                } else if (index == doc.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.z = obtainStyledAttributes.getInt(index, this.z);
                } else if (index == doc.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            I(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.w0 = null;
                        }
                    }
                } else if (index == doc.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        pj3 pj3 = new pj3();
                        this.v0 = pj3;
                        pj3.k(resourceId2, getContext());
                    } catch (Resources.NotFoundException unused2) {
                        this.v0 = null;
                    }
                    this.x0 = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        uj3.D0 = this.z;
        gw7.p = uj3.W(ConstantsKt.MINIMUM_BLOCK_SIZE);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [wsb, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I(int r10) {
        /*
            r9 = this;
            wsb r0 = new wsb
            android.content.Context r1 = r9.getContext()
            r0.<init>()
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.a = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.b = r2
            android.content.res.Resources r2 = r1.getResources()
            android.content.res.XmlResourceParser r10 = r2.getXml(r10)
            int r2 = r10.getEventType()     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }
            r3 = 0
        L_0x0024:
            r4 = 1
            if (r2 == r4) goto L_0x00ab
            if (r2 == 0) goto L_0x009c
            r5 = 2
            if (r2 == r5) goto L_0x002e
            goto L_0x009f
        L_0x002e:
            java.lang.String r2 = r10.getName()     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }
            int r6 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }
            r7 = 4
            r8 = 3
            switch(r6) {
                case -1349929691: goto L_0x0068;
                case 80204913: goto L_0x005e;
                case 1382829617: goto L_0x0055;
                case 1657696882: goto L_0x004b;
                case 1901439077: goto L_0x003c;
                default: goto L_0x003b;
            }     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }
        L_0x003b:
            goto L_0x0072
        L_0x003c:
            java.lang.String r4 = "Variant"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }
            if (r2 == 0) goto L_0x0072
            r4 = r8
            goto L_0x0073
        L_0x0046:
            r10 = move-exception
            goto L_0x00a4
        L_0x0048:
            r10 = move-exception
            goto L_0x00a8
        L_0x004b:
            java.lang.String r4 = "layoutDescription"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }
            if (r2 == 0) goto L_0x0072
            r4 = 0
            goto L_0x0073
        L_0x0055:
            java.lang.String r6 = "StateSet"
            boolean r2 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }
            if (r2 == 0) goto L_0x0072
            goto L_0x0073
        L_0x005e:
            java.lang.String r4 = "State"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }
            if (r2 == 0) goto L_0x0072
            r4 = r5
            goto L_0x0073
        L_0x0068:
            java.lang.String r4 = "ConstraintSet"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }
            if (r2 == 0) goto L_0x0072
            r4 = r7
            goto L_0x0073
        L_0x0072:
            r4 = -1
        L_0x0073:
            if (r4 == r5) goto L_0x008d
            if (r4 == r8) goto L_0x007e
            if (r4 == r7) goto L_0x007a
            goto L_0x009f
        L_0x007a:
            r0.c0(r1, r10)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }
            goto L_0x009f
        L_0x007e:
            gj3 r2 = new gj3     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }
            r2.<init>(r1, r10)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }
            if (r3 == 0) goto L_0x009f
            java.lang.Object r4 = r3.o     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }
            r4.add(r2)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }
            goto L_0x009f
        L_0x008d:
            ila r3 = new ila     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }
            r3.<init>((android.content.Context) r1, (android.content.res.XmlResourceParser) r10)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }
            java.lang.Object r2 = r0.a     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }
            int r4 = r3.b     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }
            r2.put(r4, r3)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }
            goto L_0x009f
        L_0x009c:
            r10.getName()     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }
        L_0x009f:
            int r2 = r10.next()     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }
            goto L_0x0024
        L_0x00a4:
            r10.printStackTrace()
            goto L_0x00ab
        L_0x00a8:
            r10.printStackTrace()
        L_0x00ab:
            r9.w0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.I(int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0379 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x04db A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:409:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01bc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void J(defpackage.uj3 r25, int r26, int r27, int r28) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            int r3 = android.view.View.MeasureSpec.getMode(r27)
            int r4 = android.view.View.MeasureSpec.getSize(r27)
            int r5 = android.view.View.MeasureSpec.getMode(r28)
            int r6 = android.view.View.MeasureSpec.getSize(r28)
            int r7 = r24.getPaddingTop()
            r8 = 0
            int r7 = java.lang.Math.max(r8, r7)
            int r9 = r24.getPaddingBottom()
            int r9 = java.lang.Math.max(r8, r9)
            int r10 = r7 + r9
            int r11 = r24.getPaddingWidth()
            l8c r12 = r0.A0
            r12.a = r7
            r12.b = r9
            r12.c = r11
            r12.d = r10
            r9 = r27
            r12.e = r9
            r9 = r28
            r12.f = r9
            int r9 = r24.getPaddingStart()
            int r9 = java.lang.Math.max(r8, r9)
            int r13 = r24.getPaddingEnd()
            int r13 = java.lang.Math.max(r8, r13)
            r14 = 1
            if (r9 > 0) goto L_0x005e
            if (r13 <= 0) goto L_0x0055
            goto L_0x005e
        L_0x0055:
            int r9 = r24.getPaddingLeft()
            int r9 = java.lang.Math.max(r8, r9)
            goto L_0x0075
        L_0x005e:
            android.content.Context r15 = r24.getContext()
            android.content.pm.ApplicationInfo r15 = r15.getApplicationInfo()
            int r15 = r15.flags
            r16 = 4194304(0x400000, float:5.877472E-39)
            r15 = r15 & r16
            if (r15 == 0) goto L_0x0075
            int r15 = r24.getLayoutDirection()
            if (r14 != r15) goto L_0x0075
            r9 = r13
        L_0x0075:
            int r4 = r4 - r11
            int r6 = r6 - r10
            int r10 = r12.d
            int r11 = r12.c
            int r12 = r24.getChildCount()
            r15 = 1073741824(0x40000000, float:2.0)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r13) goto L_0x00a6
            if (r3 == 0) goto L_0x0097
            if (r3 == r15) goto L_0x008c
            r17 = r8
            goto L_0x00b2
        L_0x008c:
            int r14 = r0.w
            int r14 = r14 - r11
            int r14 = java.lang.Math.min(r14, r4)
            r17 = r14
            r14 = 1
            goto L_0x00b2
        L_0x0097:
            if (r12 != 0) goto L_0x00a3
            int r14 = r0.o
            int r14 = java.lang.Math.max(r8, r14)
        L_0x009f:
            r17 = r14
        L_0x00a1:
            r14 = 2
            goto L_0x00b2
        L_0x00a3:
            r17 = r8
            goto L_0x00a1
        L_0x00a6:
            if (r12 != 0) goto L_0x00af
            int r14 = r0.o
            int r14 = java.lang.Math.max(r8, r14)
            goto L_0x009f
        L_0x00af:
            r17 = r4
            goto L_0x00a1
        L_0x00b2:
            if (r5 == r13) goto L_0x00d1
            if (r5 == 0) goto L_0x00c4
            if (r5 == r15) goto L_0x00bb
            r13 = r8
        L_0x00b9:
            r12 = 1
            goto L_0x00dc
        L_0x00bb:
            int r12 = r0.x
            int r12 = r12 - r10
            int r12 = java.lang.Math.min(r12, r6)
            r13 = r12
            goto L_0x00b9
        L_0x00c4:
            if (r12 != 0) goto L_0x00cf
            int r12 = r0.v
            int r12 = java.lang.Math.max(r8, r12)
        L_0x00cc:
            r13 = r12
        L_0x00cd:
            r12 = 2
            goto L_0x00dc
        L_0x00cf:
            r13 = r8
            goto L_0x00cd
        L_0x00d1:
            if (r12 != 0) goto L_0x00da
            int r12 = r0.v
            int r12 = java.lang.Math.max(r8, r12)
            goto L_0x00cc
        L_0x00da:
            r13 = r6
            goto L_0x00cd
        L_0x00dc:
            int r15 = r25.q()
            em4 r8 = r1.s0
            r19 = r6
            r6 = r17
            if (r6 != r15) goto L_0x00ee
            int r15 = r25.k()
            if (r13 == r15) goto L_0x00f0
        L_0x00ee:
            r15 = 1
            goto L_0x00f2
        L_0x00f0:
            r15 = 0
            goto L_0x00f5
        L_0x00f2:
            r8.b = r15
            goto L_0x00f0
        L_0x00f5:
            r1.Y = r15
            r1.Z = r15
            int r15 = r0.w
            int r15 = r15 - r11
            r17 = r8
            int[] r8 = r1.C
            r20 = r4
            r4 = 0
            r8[r4] = r15
            int r15 = r0.x
            int r15 = r15 - r10
            r18 = 1
            r8[r18] = r15
            r1.b0 = r4
            r1.c0 = r4
            r1.M(r14)
            r1.O(r6)
            r1.N(r12)
            r1.L(r13)
            int r6 = r0.o
            int r6 = r6 - r11
            if (r6 >= 0) goto L_0x0124
            r1.b0 = r4
            goto L_0x0126
        L_0x0124:
            r1.b0 = r6
        L_0x0126:
            int r0 = r0.v
            int r0 = r0 - r10
            if (r0 >= 0) goto L_0x012e
            r1.c0 = r4
            goto L_0x0130
        L_0x012e:
            r1.c0 = r0
        L_0x0130:
            r1.x0 = r9
            r1.y0 = r7
            o5h r0 = r1.r0
            r0.getClass()
            l8c r4 = r1.u0
            java.util.ArrayList r6 = r1.q0
            int r6 = r6.size()
            int r7 = r25.q()
            int r9 = r25.k()
            r10 = 128(0x80, float:1.794E-43)
            boolean r10 = defpackage.ev0.k(r2, r10)
            r11 = 64
            if (r10 != 0) goto L_0x015c
            boolean r2 = defpackage.ev0.k(r2, r11)
            if (r2 == 0) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            r2 = 0
            goto L_0x015d
        L_0x015c:
            r2 = 1
        L_0x015d:
            r12 = 3
            if (r2 == 0) goto L_0x0197
            r14 = 0
        L_0x0161:
            if (r14 >= r6) goto L_0x0197
            java.util.ArrayList r15 = r1.q0
            java.lang.Object r15 = r15.get(r14)
            tj3 r15 = (defpackage.tj3) r15
            int[] r11 = r15.p0
            r18 = 0
            r13 = r11[r18]
            if (r13 != r12) goto L_0x0177
            r13 = 1
        L_0x0174:
            r21 = 1
            goto L_0x0179
        L_0x0177:
            r13 = 0
            goto L_0x0174
        L_0x0179:
            r11 = r11[r21]
            if (r11 != r12) goto L_0x017f
            r11 = 1
            goto L_0x0180
        L_0x017f:
            r11 = 0
        L_0x0180:
            if (r13 == 0) goto L_0x018d
            if (r11 == 0) goto L_0x018d
            float r11 = r15.W
            r13 = 0
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x018d
            r11 = 1
            goto L_0x018e
        L_0x018d:
            r11 = 0
        L_0x018e:
            boolean r13 = r15.x()
            if (r13 == 0) goto L_0x019a
            if (r11 == 0) goto L_0x019a
        L_0x0196:
            r2 = 0
        L_0x0197:
            r11 = 1073741824(0x40000000, float:2.0)
            goto L_0x01ba
        L_0x019a:
            boolean r13 = r15.y()
            if (r13 == 0) goto L_0x01a3
            if (r11 == 0) goto L_0x01a3
            goto L_0x0196
        L_0x01a3:
            boolean r11 = r15 instanceof defpackage.cs5
            if (r11 == 0) goto L_0x01a8
            goto L_0x0196
        L_0x01a8:
            boolean r11 = r15.x()
            if (r11 != 0) goto L_0x0196
            boolean r11 = r15.y()
            if (r11 == 0) goto L_0x01b5
            goto L_0x0196
        L_0x01b5:
            int r14 = r14 + 1
            r11 = 64
            goto L_0x0161
        L_0x01ba:
            if (r3 != r11) goto L_0x01be
            if (r5 == r11) goto L_0x01c0
        L_0x01be:
            if (r10 == 0) goto L_0x01c2
        L_0x01c0:
            r11 = 1
            goto L_0x01c3
        L_0x01c2:
            r11 = 0
        L_0x01c3:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x0428
            r13 = 0
            r14 = r8[r13]
            r13 = r20
            int r13 = java.lang.Math.min(r14, r13)
            r14 = 1
            r8 = r8[r14]
            r15 = r19
            int r8 = java.lang.Math.min(r8, r15)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r3 != r15) goto L_0x01e9
            int r12 = r25.q()
            if (r12 == r13) goto L_0x01e9
            r1.O(r13)
            em4 r12 = r1.s0
            r12.a = r14
        L_0x01e9:
            if (r5 != r15) goto L_0x01f8
            int r12 = r25.k()
            if (r12 == r8) goto L_0x01f8
            r1.L(r8)
            em4 r8 = r1.s0
            r8.a = r14
        L_0x01f8:
            if (r3 != r15) goto L_0x0386
            if (r5 != r15) goto L_0x0386
            r8 = r17
            boolean r12 = r8.a
            java.lang.Object r13 = r8.c
            uj3 r13 = (defpackage.uj3) r13
            if (r12 != 0) goto L_0x020d
            boolean r12 = r8.b
            if (r12 == 0) goto L_0x020b
            goto L_0x020d
        L_0x020b:
            r15 = 0
            goto L_0x0242
        L_0x020d:
            java.util.ArrayList r12 = r13.q0
            java.util.Iterator r12 = r12.iterator()
        L_0x0213:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x0230
            java.lang.Object r14 = r12.next()
            tj3 r14 = (defpackage.tj3) r14
            r14.h()
            r15 = 0
            r14.a = r15
            s27 r11 = r14.d
            r11.n()
            w2g r11 = r14.e
            r11.m()
            goto L_0x0213
        L_0x0230:
            r15 = 0
            r13.h()
            r13.a = r15
            s27 r11 = r13.d
            r11.n()
            w2g r11 = r13.e
            r11.m()
            r8.b = r15
        L_0x0242:
            java.lang.Object r11 = r8.d
            uj3 r11 = (defpackage.uj3) r11
            r8.b(r11)
            r13.Y = r15
            r13.Z = r15
            int r11 = r13.j(r15)
            r12 = 1
            int r14 = r13.j(r12)
            boolean r12 = r8.a
            if (r12 == 0) goto L_0x025d
            r8.c()
        L_0x025d:
            int r12 = r13.r()
            int r15 = r13.s()
            r20 = r2
            s27 r2 = r13.d
            fm4 r2 = r2.h
            r2.d(r12)
            w2g r2 = r13.e
            fm4 r2 = r2.h
            r2.d(r15)
            r8.g()
            java.lang.Object r2 = r8.e
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r21 = r4
            r4 = 2
            if (r11 == r4) goto L_0x0288
            if (r14 != r4) goto L_0x0284
            goto L_0x0288
        L_0x0284:
            r22 = r7
        L_0x0286:
            r4 = 1
            goto L_0x02dd
        L_0x0288:
            if (r10 == 0) goto L_0x02a1
            java.util.Iterator r4 = r2.iterator()
        L_0x028e:
            boolean r22 = r4.hasNext()
            if (r22 == 0) goto L_0x02a1
            java.lang.Object r22 = r4.next()
            gng r22 = (defpackage.gng) r22
            boolean r22 = r22.k()
            if (r22 != 0) goto L_0x028e
            r10 = 0
        L_0x02a1:
            if (r10 == 0) goto L_0x02c0
            r4 = 2
            if (r11 != r4) goto L_0x02c0
            r4 = 1
            r13.M(r4)
            r22 = r7
            r4 = 0
            int r7 = r8.d(r13, r4)
            r13.O(r7)
            s27 r4 = r13.d
            uo4 r4 = r4.e
            int r7 = r13.q()
            r4.d(r7)
            goto L_0x02c2
        L_0x02c0:
            r22 = r7
        L_0x02c2:
            if (r10 == 0) goto L_0x0286
            r4 = 2
            if (r14 != r4) goto L_0x0286
            r4 = 1
            r13.N(r4)
            int r7 = r8.d(r13, r4)
            r13.L(r7)
            w2g r7 = r13.e
            uo4 r7 = r7.e
            int r10 = r13.k()
            r7.d(r10)
        L_0x02dd:
            int[] r7 = r13.p0
            r23 = r9
            r10 = 0
            r9 = r7[r10]
            if (r9 == r4) goto L_0x02ec
            r4 = 4
            if (r9 != r4) goto L_0x02ea
            goto L_0x02ec
        L_0x02ea:
            r4 = 0
            goto L_0x0323
        L_0x02ec:
            int r4 = r13.q()
            int r4 = r4 + r12
            s27 r9 = r13.d
            fm4 r9 = r9.i
            r9.d(r4)
            s27 r9 = r13.d
            uo4 r9 = r9.e
            int r4 = r4 - r12
            r9.d(r4)
            r8.g()
            r4 = 1
            r7 = r7[r4]
            if (r7 == r4) goto L_0x030b
            r4 = 4
            if (r7 != r4) goto L_0x031f
        L_0x030b:
            int r4 = r13.k()
            int r4 = r4 + r15
            w2g r7 = r13.e
            fm4 r7 = r7.i
            r7.d(r4)
            w2g r7 = r13.e
            uo4 r7 = r7.e
            int r4 = r4 - r15
            r7.d(r4)
        L_0x031f:
            r8.g()
            r4 = 1
        L_0x0323:
            java.util.Iterator r7 = r2.iterator()
        L_0x0327:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0340
            java.lang.Object r8 = r7.next()
            gng r8 = (defpackage.gng) r8
            tj3 r9 = r8.b
            if (r9 != r13) goto L_0x033c
            boolean r9 = r8.g
            if (r9 != 0) goto L_0x033c
            goto L_0x0327
        L_0x033c:
            r8.e()
            goto L_0x0327
        L_0x0340:
            java.util.Iterator r2 = r2.iterator()
        L_0x0344:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0379
            java.lang.Object r7 = r2.next()
            gng r7 = (defpackage.gng) r7
            if (r4 != 0) goto L_0x0357
            tj3 r8 = r7.b
            if (r8 != r13) goto L_0x0357
            goto L_0x0344
        L_0x0357:
            fm4 r8 = r7.h
            boolean r8 = r8.j
            if (r8 != 0) goto L_0x035f
        L_0x035d:
            r2 = 0
            goto L_0x037a
        L_0x035f:
            fm4 r8 = r7.i
            boolean r8 = r8.j
            if (r8 != 0) goto L_0x036a
            boolean r8 = r7 instanceof defpackage.jv6
            if (r8 != 0) goto L_0x036a
            goto L_0x035d
        L_0x036a:
            uo4 r8 = r7.e
            boolean r8 = r8.j
            if (r8 != 0) goto L_0x0344
            boolean r8 = r7 instanceof defpackage.yy1
            if (r8 != 0) goto L_0x0344
            boolean r7 = r7 instanceof defpackage.jv6
            if (r7 != 0) goto L_0x0344
            goto L_0x035d
        L_0x0379:
            r2 = 1
        L_0x037a:
            r13.M(r11)
            r13.N(r14)
            r7 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            r4 = 2
            goto L_0x0418
        L_0x0386:
            r20 = r2
            r21 = r4
            r22 = r7
            r23 = r9
            r8 = r17
            boolean r2 = r8.a
            java.lang.Object r4 = r8.c
            uj3 r4 = (defpackage.uj3) r4
            if (r2 == 0) goto L_0x03e7
            java.util.ArrayList r2 = r4.q0
            java.util.Iterator r2 = r2.iterator()
        L_0x039e:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x03c7
            java.lang.Object r7 = r2.next()
            tj3 r7 = (defpackage.tj3) r7
            r7.h()
            r9 = 0
            r7.a = r9
            s27 r11 = r7.d
            uo4 r12 = r11.e
            r12.j = r9
            r11.g = r9
            r11.n()
            w2g r7 = r7.e
            uo4 r11 = r7.e
            r11.j = r9
            r7.g = r9
            r7.m()
            goto L_0x039e
        L_0x03c7:
            r9 = 0
            r4.h()
            r4.a = r9
            s27 r2 = r4.d
            uo4 r7 = r2.e
            r7.j = r9
            r2.g = r9
            r2.n()
            w2g r2 = r4.e
            uo4 r7 = r2.e
            r7.j = r9
            r2.g = r9
            r2.m()
            r8.c()
            goto L_0x03e8
        L_0x03e7:
            r9 = 0
        L_0x03e8:
            java.lang.Object r2 = r8.d
            uj3 r2 = (defpackage.uj3) r2
            r8.b(r2)
            r4.Y = r9
            r4.Z = r9
            s27 r2 = r4.d
            fm4 r2 = r2.h
            r2.d(r9)
            w2g r2 = r4.e
            fm4 r2 = r2.h
            r2.d(r9)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r3 != r2) goto L_0x040c
            boolean r4 = r1.T(r9, r10)
            r7 = r4
            r4 = 1
            goto L_0x040e
        L_0x040c:
            r4 = 0
            r7 = 1
        L_0x040e:
            if (r5 != r2) goto L_0x0418
            r8 = 1
            boolean r9 = r1.T(r8, r10)
            r7 = r7 & r9
            int r4 = r4 + 1
        L_0x0418:
            if (r7 == 0) goto L_0x0432
            if (r3 != r2) goto L_0x041e
            r3 = 1
            goto L_0x041f
        L_0x041e:
            r3 = 0
        L_0x041f:
            if (r5 != r2) goto L_0x0423
            r2 = 1
            goto L_0x0424
        L_0x0423:
            r2 = 0
        L_0x0424:
            r1.P(r3, r2)
            goto L_0x0432
        L_0x0428:
            r20 = r2
            r21 = r4
            r22 = r7
            r23 = r9
            r4 = 0
            r7 = 0
        L_0x0432:
            if (r7 == 0) goto L_0x0437
            r2 = 2
            if (r4 == r2) goto L_0x06db
        L_0x0437:
            int r2 = r1.D0
            if (r6 <= 0) goto L_0x0507
            java.util.ArrayList r3 = r1.q0
            int r3 = r3.size()
            r4 = 64
            boolean r4 = r1.W(r4)
            l8c r5 = r1.u0
            r15 = 0
        L_0x044a:
            if (r15 >= r3) goto L_0x04df
            java.util.ArrayList r7 = r1.q0
            java.lang.Object r7 = r7.get(r15)
            tj3 r7 = (defpackage.tj3) r7
            boolean r8 = r7 instanceof defpackage.iv6
            if (r8 == 0) goto L_0x045c
        L_0x0458:
            r8 = 3
            r10 = 0
            goto L_0x04db
        L_0x045c:
            boolean r8 = r7 instanceof defpackage.ii0
            if (r8 == 0) goto L_0x0461
            goto L_0x0458
        L_0x0461:
            boolean r8 = r7.F
            if (r8 == 0) goto L_0x0466
            goto L_0x0458
        L_0x0466:
            if (r4 == 0) goto L_0x047d
            s27 r8 = r7.d
            if (r8 == 0) goto L_0x047d
            w2g r9 = r7.e
            if (r9 == 0) goto L_0x047d
            uo4 r8 = r8.e
            boolean r8 = r8.j
            if (r8 == 0) goto L_0x047d
            uo4 r8 = r9.e
            boolean r8 = r8.j
            if (r8 == 0) goto L_0x047d
            goto L_0x0458
        L_0x047d:
            r8 = 0
            int r9 = r7.j(r8)
            r8 = 1
            int r10 = r7.j(r8)
            r11 = 3
            if (r9 != r11) goto L_0x0496
            int r12 = r7.r
            if (r12 == r8) goto L_0x0496
            if (r10 != r11) goto L_0x0496
            int r11 = r7.s
            if (r11 == r8) goto L_0x0496
            r11 = r8
            goto L_0x0497
        L_0x0496:
            r11 = 0
        L_0x0497:
            if (r11 != 0) goto L_0x04d2
            boolean r12 = r1.W(r8)
            if (r12 == 0) goto L_0x04d2
            boolean r8 = r7 instanceof defpackage.cs5
            if (r8 != 0) goto L_0x04d2
            r8 = 3
            if (r9 != r8) goto L_0x04b3
            int r12 = r7.r
            if (r12 != 0) goto L_0x04b3
            if (r10 == r8) goto L_0x04b3
            boolean r12 = r7.x()
            if (r12 != 0) goto L_0x04b3
            r11 = 1
        L_0x04b3:
            if (r10 != r8) goto L_0x04c2
            int r12 = r7.s
            if (r12 != 0) goto L_0x04c2
            if (r9 == r8) goto L_0x04c2
            boolean r12 = r7.x()
            if (r12 != 0) goto L_0x04c2
            r11 = 1
        L_0x04c2:
            if (r9 == r8) goto L_0x04c9
            if (r10 != r8) goto L_0x04c7
            goto L_0x04c9
        L_0x04c7:
            r10 = 0
            goto L_0x04d4
        L_0x04c9:
            float r9 = r7.W
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x04d4
            r11 = 1
            goto L_0x04d4
        L_0x04d2:
            r8 = 3
            goto L_0x04c7
        L_0x04d4:
            if (r11 == 0) goto L_0x04d7
            goto L_0x04db
        L_0x04d7:
            r9 = 0
            r0.y(r9, r7, r5)
        L_0x04db:
            int r15 = r15 + 1
            goto L_0x044a
        L_0x04df:
            java.lang.Object r3 = r5.g
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            int r4 = r3.getChildCount()
            r15 = 0
        L_0x04e8:
            if (r15 >= r4) goto L_0x04f0
            r3.getChildAt(r15)
            int r15 = r15 + 1
            goto L_0x04e8
        L_0x04f0:
            java.util.ArrayList r3 = r3.b
            int r4 = r3.size()
            if (r4 <= 0) goto L_0x0507
            r15 = 0
        L_0x04f9:
            if (r15 >= r4) goto L_0x0507
            java.lang.Object r5 = r3.get(r15)
            dj3 r5 = (defpackage.dj3) r5
            r5.getClass()
            int r15 = r15 + 1
            goto L_0x04f9
        L_0x0507:
            r0.B(r1)
            java.lang.Object r3 = r0.a
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r5 = r22
            if (r6 <= 0) goto L_0x051d
            r6 = r23
            r15 = 0
            r0.A(r1, r15, r5, r6)
            goto L_0x0520
        L_0x051d:
            r6 = r23
            r15 = 0
        L_0x0520:
            if (r4 <= 0) goto L_0x06d0
            int[] r7 = r1.p0
            r8 = r7[r15]
            r9 = 2
            if (r8 != r9) goto L_0x052c
            r8 = 1
        L_0x052a:
            r10 = 1
            goto L_0x052e
        L_0x052c:
            r8 = r15
            goto L_0x052a
        L_0x052e:
            r7 = r7[r10]
            if (r7 != r9) goto L_0x0534
            r7 = 1
            goto L_0x0535
        L_0x0534:
            r7 = r15
        L_0x0535:
            int r9 = r25.q()
            java.lang.Object r10 = r0.c
            uj3 r10 = (defpackage.uj3) r10
            int r11 = r10.b0
            int r9 = java.lang.Math.max(r9, r11)
            int r11 = r25.k()
            int r10 = r10.c0
            int r10 = java.lang.Math.max(r11, r10)
            r11 = r15
            r12 = r11
        L_0x054f:
            if (r11 >= r4) goto L_0x05de
            java.lang.Object r14 = r3.get(r11)
            tj3 r14 = (defpackage.tj3) r14
            boolean r15 = r14 instanceof defpackage.cs5
            if (r15 != 0) goto L_0x0561
            r16 = r2
            r1 = r21
            goto L_0x05d3
        L_0x0561:
            int r15 = r14.q()
            int r13 = r14.k()
            r16 = r2
            r1 = r21
            r2 = 1
            boolean r19 = r0.y(r2, r14, r1)
            r2 = r12 | r19
            int r12 = r14.q()
            r26 = r2
            int r2 = r14.k()
            if (r12 == r15) goto L_0x05a5
            r14.O(r12)
            if (r8 == 0) goto L_0x05a3
            int r12 = r14.r()
            int r15 = r14.U
            int r12 = r12 + r15
            if (r12 <= r9) goto L_0x05a3
            int r12 = r14.r()
            int r15 = r14.U
            int r12 = r12 + r15
            r15 = 4
            aj3 r19 = r14.i(r15)
            int r15 = r19.e()
            int r15 = r15 + r12
            int r9 = java.lang.Math.max(r9, r15)
        L_0x05a3:
            r15 = 1
            goto L_0x05a7
        L_0x05a5:
            r15 = r26
        L_0x05a7:
            if (r2 == r13) goto L_0x05cd
            r14.L(r2)
            if (r7 == 0) goto L_0x05cc
            int r2 = r14.s()
            int r12 = r14.V
            int r2 = r2 + r12
            if (r2 <= r10) goto L_0x05cc
            int r2 = r14.s()
            int r12 = r14.V
            int r2 = r2 + r12
            r12 = 5
            aj3 r12 = r14.i(r12)
            int r12 = r12.e()
            int r12 = r12 + r2
            int r10 = java.lang.Math.max(r10, r12)
        L_0x05cc:
            r15 = 1
        L_0x05cd:
            cs5 r14 = (defpackage.cs5) r14
            boolean r2 = r14.y0
            r2 = r2 | r15
            r12 = r2
        L_0x05d3:
            int r11 = r11 + 1
            r21 = r1
            r2 = r16
            r15 = 0
            r1 = r25
            goto L_0x054f
        L_0x05de:
            r16 = r2
            r1 = r21
            r2 = 0
            r15 = 2
        L_0x05e4:
            if (r2 >= r15) goto L_0x06cb
            r11 = 0
        L_0x05e7:
            if (r11 >= r4) goto L_0x06af
            java.lang.Object r13 = r3.get(r11)
            tj3 r13 = (defpackage.tj3) r13
            boolean r14 = r13 instanceof defpackage.cy6
            if (r14 == 0) goto L_0x05f7
            boolean r14 = r13 instanceof defpackage.cs5
            if (r14 == 0) goto L_0x061a
        L_0x05f7:
            boolean r14 = r13 instanceof defpackage.iv6
            if (r14 == 0) goto L_0x05fc
            goto L_0x061a
        L_0x05fc:
            int r14 = r13.g0
            r15 = 8
            if (r14 != r15) goto L_0x0603
            goto L_0x061a
        L_0x0603:
            if (r20 == 0) goto L_0x0616
            s27 r14 = r13.d
            uo4 r14 = r14.e
            boolean r14 = r14.j
            if (r14 == 0) goto L_0x0616
            w2g r14 = r13.e
            uo4 r14 = r14.e
            boolean r14 = r14.j
            if (r14 == 0) goto L_0x0616
            goto L_0x061a
        L_0x0616:
            boolean r14 = r13 instanceof defpackage.cs5
            if (r14 == 0) goto L_0x0624
        L_0x061a:
            r21 = r1
            r26 = r3
            r19 = r4
            r14 = 4
            r15 = 5
            goto L_0x06a4
        L_0x0624:
            int r14 = r13.q()
            int r15 = r13.k()
            r26 = r3
            int r3 = r13.a0
            r19 = r4
            r4 = 1
            if (r2 != r4) goto L_0x0636
            r4 = 2
        L_0x0636:
            boolean r4 = r0.y(r4, r13, r1)
            r4 = r4 | r12
            int r12 = r13.q()
            r21 = r1
            int r1 = r13.k()
            if (r12 == r14) goto L_0x066e
            r13.O(r12)
            if (r8 == 0) goto L_0x066b
            int r4 = r13.r()
            int r12 = r13.U
            int r4 = r4 + r12
            if (r4 <= r9) goto L_0x066b
            int r4 = r13.r()
            int r12 = r13.U
            int r4 = r4 + r12
            r14 = 4
            aj3 r12 = r13.i(r14)
            int r12 = r12.e()
            int r12 = r12 + r4
            int r9 = java.lang.Math.max(r9, r12)
            goto L_0x066c
        L_0x066b:
            r14 = 4
        L_0x066c:
            r4 = 1
            goto L_0x066f
        L_0x066e:
            r14 = 4
        L_0x066f:
            if (r1 == r15) goto L_0x0698
            r13.L(r1)
            if (r7 == 0) goto L_0x0695
            int r1 = r13.s()
            int r4 = r13.V
            int r1 = r1 + r4
            if (r1 <= r10) goto L_0x0695
            int r1 = r13.s()
            int r4 = r13.V
            int r1 = r1 + r4
            r15 = 5
            aj3 r4 = r13.i(r15)
            int r4 = r4.e()
            int r4 = r4 + r1
            int r10 = java.lang.Math.max(r10, r4)
            goto L_0x0696
        L_0x0695:
            r15 = 5
        L_0x0696:
            r4 = 1
            goto L_0x0699
        L_0x0698:
            r15 = 5
        L_0x0699:
            boolean r1 = r13.E
            if (r1 == 0) goto L_0x06a3
            int r1 = r13.a0
            if (r3 == r1) goto L_0x06a3
            r12 = 1
            goto L_0x06a4
        L_0x06a3:
            r12 = r4
        L_0x06a4:
            int r11 = r11 + 1
            r3 = r26
            r4 = r19
            r1 = r21
            r15 = 2
            goto L_0x05e7
        L_0x06af:
            r21 = r1
            r26 = r3
            r19 = r4
            r14 = 4
            r15 = 5
            if (r12 == 0) goto L_0x06cb
            int r2 = r2 + 1
            r1 = r25
            r3 = r21
            r0.A(r1, r2, r5, r6)
            r1 = r3
            r4 = r19
            r12 = 0
            r15 = 2
            r3 = r26
            goto L_0x05e4
        L_0x06cb:
            r1 = r25
            r0 = r16
            goto L_0x06d1
        L_0x06d0:
            r0 = r2
        L_0x06d1:
            r1.D0 = r0
            r0 = 512(0x200, float:7.175E-43)
            boolean r0 = r1.W(r0)
            defpackage.gw7.p = r0
        L_0x06db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.J(uj3, int, int, int):void");
    }

    public final void K(tj3 tj3, fj3 fj3, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        tj3 tj32 = (tj3) sparseArray.get(i);
        if (tj32 != null && view != null && (view.getLayoutParams() instanceof fj3)) {
            fj3.c0 = true;
            if (i2 == 6) {
                fj3 fj32 = (fj3) view.getLayoutParams();
                fj32.c0 = true;
                fj32.p0.E = true;
            }
            tj3.i(6).b(tj32.i(i2), fj3.D, fj3.C, true);
            tj3.E = true;
            tj3.i(3).j();
            tj3.i(5).j();
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof fj3;
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((dj3) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i3;
                        float f2 = (float) i4;
                        float f3 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f4 = f2;
                        float f5 = f2;
                        float f6 = f3;
                        float f7 = f;
                        Paint paint2 = paint;
                        canvas2.drawLine(f, f4, f6, f5, paint);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f8 = f3;
                        float f9 = parseInt4;
                        canvas2.drawLine(f8, f5, f6, f9, paint);
                        float f10 = parseInt4;
                        float f11 = f7;
                        canvas2.drawLine(f8, f10, f11, f9, paint);
                        float f12 = f7;
                        canvas2.drawLine(f12, f10, f11, f5, paint);
                        paint.setColor(-16711936);
                        float f13 = f3;
                        Paint paint3 = paint;
                        canvas2.drawLine(f12, f5, f13, parseInt4, paint);
                        canvas2.drawLine(f12, parseInt4, f13, f5, paint);
                    }
                }
            }
        }
    }

    public final void forceLayout() {
        this.y = true;
        super.forceLayout();
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new fj3(-2, -2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, java.lang.Object, fj3] */
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.a = -1;
        marginLayoutParams.b = -1;
        marginLayoutParams.c = -1.0f;
        marginLayoutParams.d = true;
        marginLayoutParams.e = -1;
        marginLayoutParams.f = -1;
        marginLayoutParams.g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.j = -1;
        marginLayoutParams.k = -1;
        marginLayoutParams.l = -1;
        marginLayoutParams.m = -1;
        marginLayoutParams.n = -1;
        marginLayoutParams.o = -1;
        marginLayoutParams.p = -1;
        marginLayoutParams.q = 0;
        marginLayoutParams.r = c44.DEFAULT_ASPECT_RATIO;
        marginLayoutParams.s = -1;
        marginLayoutParams.t = -1;
        marginLayoutParams.u = -1;
        marginLayoutParams.v = -1;
        marginLayoutParams.w = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.x = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.y = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.z = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.A = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.B = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.C = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.D = 0;
        marginLayoutParams.E = 0.5f;
        marginLayoutParams.F = 0.5f;
        marginLayoutParams.G = null;
        marginLayoutParams.H = -1.0f;
        marginLayoutParams.I = -1.0f;
        marginLayoutParams.J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.M = 0;
        marginLayoutParams.N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.P = 0;
        marginLayoutParams.Q = 0;
        marginLayoutParams.R = 1.0f;
        marginLayoutParams.S = 1.0f;
        marginLayoutParams.T = -1;
        marginLayoutParams.U = -1;
        marginLayoutParams.V = -1;
        marginLayoutParams.W = false;
        marginLayoutParams.X = false;
        marginLayoutParams.Y = null;
        marginLayoutParams.Z = 0;
        marginLayoutParams.a0 = true;
        marginLayoutParams.b0 = true;
        marginLayoutParams.c0 = false;
        marginLayoutParams.d0 = false;
        marginLayoutParams.e0 = false;
        marginLayoutParams.f0 = -1;
        marginLayoutParams.g0 = -1;
        marginLayoutParams.h0 = -1;
        marginLayoutParams.i0 = -1;
        marginLayoutParams.j0 = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.k0 = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.l0 = 0.5f;
        marginLayoutParams.p0 = new tj3();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, doc.ConstraintLayout_Layout);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = ej3.a.get(index);
            switch (i2) {
                case 1:
                    marginLayoutParams.V = obtainStyledAttributes.getInt(index, marginLayoutParams.V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.p);
                    marginLayoutParams.p = resourceId;
                    if (resourceId != -1) {
                        break;
                    } else {
                        marginLayoutParams.p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 3:
                    marginLayoutParams.q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.q);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, marginLayoutParams.r) % 360.0f;
                    marginLayoutParams.r = f;
                    if (f >= c44.DEFAULT_ASPECT_RATIO) {
                        break;
                    } else {
                        marginLayoutParams.r = (360.0f - f) % 360.0f;
                        break;
                    }
                case 5:
                    marginLayoutParams.a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.a);
                    break;
                case 6:
                    marginLayoutParams.b = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.b);
                    break;
                case 7:
                    marginLayoutParams.c = obtainStyledAttributes.getFloat(index, marginLayoutParams.c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.e);
                    marginLayoutParams.e = resourceId2;
                    if (resourceId2 != -1) {
                        break;
                    } else {
                        marginLayoutParams.e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f);
                    marginLayoutParams.f = resourceId3;
                    if (resourceId3 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.g);
                    marginLayoutParams.g = resourceId4;
                    if (resourceId4 != -1) {
                        break;
                    } else {
                        marginLayoutParams.g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.h);
                    marginLayoutParams.h = resourceId5;
                    if (resourceId5 != -1) {
                        break;
                    } else {
                        marginLayoutParams.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.i);
                    marginLayoutParams.i = resourceId6;
                    if (resourceId6 != -1) {
                        break;
                    } else {
                        marginLayoutParams.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.j);
                    marginLayoutParams.j = resourceId7;
                    if (resourceId7 != -1) {
                        break;
                    } else {
                        marginLayoutParams.j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case Protos.Attaches.Attach.LOCATION /*14*/:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.k);
                    marginLayoutParams.k = resourceId8;
                    if (resourceId8 != -1) {
                        break;
                    } else {
                        marginLayoutParams.k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.l);
                    marginLayoutParams.l = resourceId9;
                    if (resourceId9 != -1) {
                        break;
                    } else {
                        marginLayoutParams.l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.m);
                    marginLayoutParams.m = resourceId10;
                    if (resourceId10 != -1) {
                        break;
                    } else {
                        marginLayoutParams.m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case LangUtils.HASH_SEED /*17*/:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.s);
                    marginLayoutParams.s = resourceId11;
                    if (resourceId11 != -1) {
                        break;
                    } else {
                        marginLayoutParams.s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.t);
                    marginLayoutParams.t = resourceId12;
                    if (resourceId12 != -1) {
                        break;
                    } else {
                        marginLayoutParams.t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.u);
                    marginLayoutParams.u = resourceId13;
                    if (resourceId13 != -1) {
                        break;
                    } else {
                        marginLayoutParams.u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.v);
                    marginLayoutParams.v = resourceId14;
                    if (resourceId14 != -1) {
                        break;
                    } else {
                        marginLayoutParams.v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 21:
                    marginLayoutParams.w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.w);
                    break;
                case 22:
                    marginLayoutParams.x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.x);
                    break;
                case 23:
                    marginLayoutParams.y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.y);
                    break;
                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                    marginLayoutParams.z = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.z);
                    break;
                case 25:
                    marginLayoutParams.A = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.A);
                    break;
                case 26:
                    marginLayoutParams.B = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.B);
                    break;
                case 27:
                    marginLayoutParams.W = obtainStyledAttributes.getBoolean(index, marginLayoutParams.W);
                    break;
                case 28:
                    marginLayoutParams.X = obtainStyledAttributes.getBoolean(index, marginLayoutParams.X);
                    break;
                case 29:
                    marginLayoutParams.E = obtainStyledAttributes.getFloat(index, marginLayoutParams.E);
                    break;
                case 30:
                    marginLayoutParams.F = obtainStyledAttributes.getFloat(index, marginLayoutParams.F);
                    break;
                case 31:
                    marginLayoutParams.L = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 32:
                    marginLayoutParams.M = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 33:
                    try {
                        marginLayoutParams.N = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.N) != -2) {
                            break;
                        } else {
                            marginLayoutParams.N = -2;
                            break;
                        }
                    }
                case 34:
                    try {
                        marginLayoutParams.P = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.P) != -2) {
                            break;
                        } else {
                            marginLayoutParams.P = -2;
                            break;
                        }
                    }
                case 35:
                    marginLayoutParams.R = Math.max(c44.DEFAULT_ASPECT_RATIO, obtainStyledAttributes.getFloat(index, marginLayoutParams.R));
                    marginLayoutParams.L = 2;
                    break;
                case 36:
                    try {
                        marginLayoutParams.O = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.O) != -2) {
                            break;
                        } else {
                            marginLayoutParams.O = -2;
                            break;
                        }
                    }
                case LangUtils.HASH_OFFSET /*37*/:
                    try {
                        marginLayoutParams.Q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.Q) != -2) {
                            break;
                        } else {
                            marginLayoutParams.Q = -2;
                            break;
                        }
                    }
                case 38:
                    marginLayoutParams.S = Math.max(c44.DEFAULT_ASPECT_RATIO, obtainStyledAttributes.getFloat(index, marginLayoutParams.S));
                    marginLayoutParams.M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            pj3.n(marginLayoutParams, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            marginLayoutParams.H = obtainStyledAttributes.getFloat(index, marginLayoutParams.H);
                            break;
                        case 46:
                            marginLayoutParams.I = obtainStyledAttributes.getFloat(index, marginLayoutParams.I);
                            break;
                        case 47:
                            marginLayoutParams.J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            marginLayoutParams.K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            marginLayoutParams.T = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.T);
                            break;
                        case 50:
                            marginLayoutParams.U = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.U);
                            break;
                        case 51:
                            marginLayoutParams.Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.n);
                            marginLayoutParams.n = resourceId15;
                            if (resourceId15 != -1) {
                                break;
                            } else {
                                marginLayoutParams.n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.o);
                            marginLayoutParams.o = resourceId16;
                            if (resourceId16 != -1) {
                                break;
                            } else {
                                marginLayoutParams.o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            }
                        case 54:
                            marginLayoutParams.D = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.D);
                            break;
                        case 55:
                            marginLayoutParams.C = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    pj3.m(marginLayoutParams, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    pj3.m(marginLayoutParams, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    marginLayoutParams.Z = obtainStyledAttributes.getInt(index, marginLayoutParams.Z);
                                    break;
                                case 67:
                                    marginLayoutParams.d = obtainStyledAttributes.getBoolean(index, marginLayoutParams.d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        marginLayoutParams.a();
        return marginLayoutParams;
    }

    public int getMaxHeight() {
        return this.x;
    }

    public int getMaxWidth() {
        return this.w;
    }

    public int getMinHeight() {
        return this.v;
    }

    public int getMinWidth() {
        return this.o;
    }

    public int getOptimizationLevel() {
        return this.c.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        uj3 uj3 = this.c;
        if (uj3.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                uj3.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                uj3.j = "parent";
            }
        }
        if (uj3.h0 == null) {
            uj3.h0 = uj3.j;
        }
        Iterator it = uj3.q0.iterator();
        while (it.hasNext()) {
            tj3 tj3 = (tj3) it.next();
            View view = (View) tj3.f0;
            if (view != null) {
                if (tj3.j == null && (id = view.getId()) != -1) {
                    tj3.j = getContext().getResources().getResourceEntryName(id);
                }
                if (tj3.h0 == null) {
                    tj3.h0 = tj3.j;
                }
            }
        }
        uj3.n(sb);
        return sb.toString();
    }

    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            fj3 fj3 = (fj3) childAt.getLayoutParams();
            tj3 tj3 = fj3.p0;
            if (childAt.getVisibility() != 8 || fj3.d0 || fj3.e0 || isInEditMode) {
                int r = tj3.r();
                int s = tj3.s();
                childAt.layout(r, s, tj3.q() + r, tj3.k() + s);
            }
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((dj3) arrayList.get(i6)).j();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v113, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0312 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03eb  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r24, int r25) {
        /*
            r23 = this;
            r6 = r23
            r7 = r24
            r8 = r25
            int r0 = r6.B0
            if (r0 != r7) goto L_0x000c
            int r0 = r6.C0
        L_0x000c:
            boolean r0 = r6.y
            r9 = 0
            r10 = 1
            if (r0 != 0) goto L_0x0029
            int r0 = r23.getChildCount()
            r1 = r9
        L_0x0017:
            if (r1 >= r0) goto L_0x0029
            android.view.View r2 = r6.getChildAt(r1)
            boolean r2 = r2.isLayoutRequested()
            if (r2 == 0) goto L_0x0026
            r6.y = r10
            goto L_0x0029
        L_0x0026:
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0029:
            r6.B0 = r7
            r6.C0 = r8
            android.content.Context r0 = r23.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.flags
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0044
            int r0 = r23.getLayoutDirection()
            if (r10 != r0) goto L_0x0044
            r0 = r10
            goto L_0x0045
        L_0x0044:
            r0 = r9
        L_0x0045:
            uj3 r11 = r6.c
            r11.v0 = r0
            boolean r0 = r6.y
            if (r0 == 0) goto L_0x059f
            r6.y = r9
            int r0 = r23.getChildCount()
            r1 = r9
        L_0x0054:
            if (r1 >= r0) goto L_0x0065
            android.view.View r2 = r6.getChildAt(r1)
            boolean r2 = r2.isLayoutRequested()
            if (r2 == 0) goto L_0x0062
            r12 = r10
            goto L_0x0066
        L_0x0062:
            int r1 = r1 + 1
            goto L_0x0054
        L_0x0065:
            r12 = r9
        L_0x0066:
            if (r12 == 0) goto L_0x0598
            boolean r13 = r23.isInEditMode()
            int r14 = r23.getChildCount()
            r0 = r9
        L_0x0071:
            if (r0 >= r14) goto L_0x0084
            android.view.View r1 = r6.getChildAt(r0)
            tj3 r1 = r6.G(r1)
            if (r1 != 0) goto L_0x007e
            goto L_0x0081
        L_0x007e:
            r1.C()
        L_0x0081:
            int r0 = r0 + 1
            goto L_0x0071
        L_0x0084:
            r0 = 0
            r15 = -1
            if (r13 == 0) goto L_0x010e
            r1 = r9
        L_0x0089:
            if (r1 >= r14) goto L_0x010e
            android.view.View r2 = r6.getChildAt(r1)
            android.content.res.Resources r3 = r23.getResources()     // Catch:{ NotFoundException -> 0x0109 }
            int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x0109 }
            java.lang.String r3 = r3.getResourceName(r4)     // Catch:{ NotFoundException -> 0x0109 }
            int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x0109 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NotFoundException -> 0x0109 }
            boolean r5 = r3 instanceof java.lang.String     // Catch:{ NotFoundException -> 0x0109 }
            if (r5 == 0) goto L_0x00c7
            java.util.HashMap r5 = r6.y0     // Catch:{ NotFoundException -> 0x0109 }
            if (r5 != 0) goto L_0x00b2
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ NotFoundException -> 0x0109 }
            r5.<init>()     // Catch:{ NotFoundException -> 0x0109 }
            r6.y0 = r5     // Catch:{ NotFoundException -> 0x0109 }
        L_0x00b2:
            java.lang.String r5 = "/"
            int r5 = r3.indexOf(r5)     // Catch:{ NotFoundException -> 0x0109 }
            if (r5 == r15) goto L_0x00c1
            int r5 = r5 + 1
            java.lang.String r5 = r3.substring(r5)     // Catch:{ NotFoundException -> 0x0109 }
            goto L_0x00c2
        L_0x00c1:
            r5 = r3
        L_0x00c2:
            java.util.HashMap r10 = r6.y0     // Catch:{ NotFoundException -> 0x0109 }
            r10.put(r5, r4)     // Catch:{ NotFoundException -> 0x0109 }
        L_0x00c7:
            r4 = 47
            int r4 = r3.indexOf(r4)     // Catch:{ NotFoundException -> 0x0109 }
            if (r4 == r15) goto L_0x00d5
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)     // Catch:{ NotFoundException -> 0x0109 }
        L_0x00d5:
            int r2 = r2.getId()     // Catch:{ NotFoundException -> 0x0109 }
            if (r2 != 0) goto L_0x00dd
        L_0x00db:
            r2 = r11
            goto L_0x0107
        L_0x00dd:
            android.util.SparseArray r4 = r6.a     // Catch:{ NotFoundException -> 0x0109 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ NotFoundException -> 0x0109 }
            android.view.View r4 = (android.view.View) r4     // Catch:{ NotFoundException -> 0x0109 }
            if (r4 != 0) goto L_0x00f8
            android.view.View r4 = r6.findViewById(r2)     // Catch:{ NotFoundException -> 0x0109 }
            if (r4 == 0) goto L_0x00f8
            if (r4 == r6) goto L_0x00f8
            android.view.ViewParent r2 = r4.getParent()     // Catch:{ NotFoundException -> 0x0109 }
            if (r2 != r6) goto L_0x00f8
            r6.onViewAdded(r4)     // Catch:{ NotFoundException -> 0x0109 }
        L_0x00f8:
            if (r4 != r6) goto L_0x00fb
            goto L_0x00db
        L_0x00fb:
            if (r4 != 0) goto L_0x00ff
            r2 = r0
            goto L_0x0107
        L_0x00ff:
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()     // Catch:{ NotFoundException -> 0x0109 }
            fj3 r2 = (defpackage.fj3) r2     // Catch:{ NotFoundException -> 0x0109 }
            tj3 r2 = r2.p0     // Catch:{ NotFoundException -> 0x0109 }
        L_0x0107:
            r2.h0 = r3     // Catch:{ NotFoundException -> 0x0109 }
        L_0x0109:
            int r1 = r1 + 1
            r10 = 1
            goto L_0x0089
        L_0x010e:
            int r1 = r6.x0
            if (r1 == r15) goto L_0x011f
            r1 = r9
        L_0x0113:
            if (r1 >= r14) goto L_0x011f
            android.view.View r2 = r6.getChildAt(r1)
            r2.getId()
            int r1 = r1 + 1
            goto L_0x0113
        L_0x011f:
            pj3 r1 = r6.v0
            if (r1 == 0) goto L_0x0126
            r1.b(r6)
        L_0x0126:
            java.util.ArrayList r1 = r11.q0
            r1.clear()
            java.util.ArrayList r1 = r6.b
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x01d9
            r3 = r9
        L_0x0134:
            if (r3 >= r2) goto L_0x01d9
            java.lang.Object r4 = r1.get(r3)
            dj3 r4 = (defpackage.dj3) r4
            boolean r5 = r4.isInEditMode()
            if (r5 == 0) goto L_0x0147
            java.lang.String r5 = r4.v
            r4.setIds(r5)
        L_0x0147:
            cy6 r5 = r4.o
            if (r5 != 0) goto L_0x014f
            r17 = r1
            goto L_0x01d0
        L_0x014f:
            r5.r0 = r9
            tj3[] r5 = r5.q0
            java.util.Arrays.fill(r5, r0)
            r5 = r9
        L_0x0157:
            int r0 = r4.b
            if (r5 >= r0) goto L_0x01c9
            int[] r0 = r4.a
            r0 = r0[r5]
            android.util.SparseArray r15 = r6.a
            java.lang.Object r15 = r15.get(r0)
            android.view.View r15 = (android.view.View) r15
            if (r15 != 0) goto L_0x018f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r9 = r4.x
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r10 = r4.g(r6, r0)
            if (r10 == 0) goto L_0x018f
            int[] r15 = r4.a
            r15[r5] = r10
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            r9.put(r15, r0)
            android.util.SparseArray r0 = r6.a
            java.lang.Object r0 = r0.get(r10)
            r15 = r0
            android.view.View r15 = (android.view.View) r15
        L_0x018f:
            if (r15 == 0) goto L_0x01c0
            cy6 r0 = r4.o
            tj3 r9 = r6.G(r15)
            r0.getClass()
            if (r9 == r0) goto L_0x01c0
            if (r9 != 0) goto L_0x019f
            goto L_0x01c0
        L_0x019f:
            int r10 = r0.r0
            r15 = 1
            int r10 = r10 + r15
            tj3[] r15 = r0.q0
            r17 = r1
            int r1 = r15.length
            if (r10 <= r1) goto L_0x01b5
            int r1 = r15.length
            r10 = 2
            int r1 = r1 * r10
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r15, r1)
            tj3[] r1 = (defpackage.tj3[]) r1
            r0.q0 = r1
        L_0x01b5:
            tj3[] r1 = r0.q0
            int r10 = r0.r0
            r1[r10] = r9
            r1 = 1
            int r10 = r10 + r1
            r0.r0 = r10
            goto L_0x01c2
        L_0x01c0:
            r17 = r1
        L_0x01c2:
            int r5 = r5 + 1
            r1 = r17
            r9 = 0
            r15 = -1
            goto L_0x0157
        L_0x01c9:
            r17 = r1
            cy6 r0 = r4.o
            r0.S()
        L_0x01d0:
            int r3 = r3 + 1
            r1 = r17
            r0 = 0
            r9 = 0
            r15 = -1
            goto L_0x0134
        L_0x01d9:
            r0 = 0
        L_0x01da:
            if (r0 >= r14) goto L_0x01e2
            r6.getChildAt(r0)
            int r0 = r0 + 1
            goto L_0x01da
        L_0x01e2:
            android.util.SparseArray r9 = r6.z0
            r9.clear()
            r0 = 0
            r9.put(r0, r11)
            int r0 = r23.getId()
            r9.put(r0, r11)
            r0 = 0
        L_0x01f3:
            if (r0 >= r14) goto L_0x0207
            android.view.View r1 = r6.getChildAt(r0)
            tj3 r2 = r6.G(r1)
            int r1 = r1.getId()
            r9.put(r1, r2)
            int r0 = r0 + 1
            goto L_0x01f3
        L_0x0207:
            r10 = 0
        L_0x0208:
            if (r10 >= r14) goto L_0x0598
            android.view.View r0 = r6.getChildAt(r10)
            tj3 r15 = r6.G(r0)
            if (r15 != 0) goto L_0x021b
        L_0x0214:
            r16 = r14
            r0 = 2
            r3 = 1
            r4 = -1
            goto L_0x058c
        L_0x021b:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r5 = r1
            fj3 r5 = (defpackage.fj3) r5
            java.util.ArrayList r1 = r11.q0
            r1.add(r15)
            tj3 r1 = r15.T
            if (r1 == 0) goto L_0x0235
            uj3 r1 = (defpackage.uj3) r1
            java.util.ArrayList r1 = r1.q0
            r1.remove(r15)
            r15.C()
        L_0x0235:
            r15.T = r11
            r5.a()
            int r1 = r0.getVisibility()
            r15.g0 = r1
            r15.f0 = r0
            boolean r1 = r0 instanceof defpackage.dj3
            if (r1 == 0) goto L_0x024d
            dj3 r0 = (defpackage.dj3) r0
            boolean r1 = r11.v0
            r0.i(r15, r1)
        L_0x024d:
            boolean r0 = r5.d0
            if (r0 == 0) goto L_0x0282
            iv6 r15 = (defpackage.iv6) r15
            int r0 = r5.m0
            int r1 = r5.n0
            float r2 = r5.o0
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x026b
            if (r4 <= 0) goto L_0x0269
            r15.q0 = r2
            r2 = -1
            r15.r0 = r2
            r15.s0 = r2
            goto L_0x0214
        L_0x0269:
            r2 = -1
            goto L_0x0214
        L_0x026b:
            r2 = -1
            if (r0 == r2) goto L_0x0277
            if (r0 <= r2) goto L_0x0214
            r15.q0 = r3
            r15.r0 = r0
            r15.s0 = r2
            goto L_0x0214
        L_0x0277:
            if (r1 == r2) goto L_0x0214
            if (r1 <= r2) goto L_0x0214
            r15.q0 = r3
            r15.r0 = r2
            r15.s0 = r1
            goto L_0x0214
        L_0x0282:
            int r0 = r5.f0
            int r1 = r5.g0
            int r2 = r5.h0
            int r3 = r5.i0
            int r4 = r5.j0
            r16 = r14
            int r14 = r5.k0
            float r7 = r5.l0
            int r8 = r5.p
            r6 = -1
            if (r8 == r6) goto L_0x02b7
            java.lang.Object r0 = r9.get(r8)
            r22 = r0
            tj3 r22 = (defpackage.tj3) r22
            if (r22 == 0) goto L_0x02b4
            float r0 = r5.r
            int r1 = r5.q
            r19 = 7
            r21 = 0
            r17 = r15
            r18 = r19
            r20 = r1
            r17.v(r18, r19, r20, r21, r22)
            r15.D = r0
        L_0x02b4:
            r14 = r5
            goto L_0x03f5
        L_0x02b7:
            if (r0 == r6) goto L_0x02d5
            java.lang.Object r0 = r9.get(r0)
            r22 = r0
            tj3 r22 = (defpackage.tj3) r22
            if (r22 == 0) goto L_0x02d3
            int r0 = r5.leftMargin
            r17 = r15
            r1 = 2
            r18 = r1
            r19 = r1
            r20 = r0
            r21 = r4
            r17.v(r18, r19, r20, r21, r22)
        L_0x02d3:
            r0 = -1
            goto L_0x02f4
        L_0x02d5:
            r0 = r6
            if (r1 == r0) goto L_0x02f4
            java.lang.Object r0 = r9.get(r1)
            r22 = r0
            tj3 r22 = (defpackage.tj3) r22
            if (r22 == 0) goto L_0x02d3
            int r0 = r5.leftMargin
            r17 = r15
            r1 = 2
            r18 = r1
            r1 = 4
            r19 = r1
            r20 = r0
            r21 = r4
            r17.v(r18, r19, r20, r21, r22)
            goto L_0x02d3
        L_0x02f4:
            if (r2 == r0) goto L_0x0312
            java.lang.Object r0 = r9.get(r2)
            r22 = r0
            tj3 r22 = (defpackage.tj3) r22
            if (r22 == 0) goto L_0x032e
            int r0 = r5.rightMargin
            r17 = r15
            r1 = 4
            r18 = r1
            r1 = 2
            r19 = r1
            r20 = r0
            r21 = r14
            r17.v(r18, r19, r20, r21, r22)
            goto L_0x032e
        L_0x0312:
            if (r3 == r0) goto L_0x032e
            java.lang.Object r0 = r9.get(r3)
            r22 = r0
            tj3 r22 = (defpackage.tj3) r22
            if (r22 == 0) goto L_0x032e
            int r0 = r5.rightMargin
            r17 = r15
            r1 = 4
            r18 = r1
            r19 = r1
            r20 = r0
            r21 = r14
            r17.v(r18, r19, r20, r21, r22)
        L_0x032e:
            int r0 = r5.i
            r1 = -1
            if (r0 == r1) goto L_0x0350
            java.lang.Object r0 = r9.get(r0)
            r22 = r0
            tj3 r22 = (defpackage.tj3) r22
            if (r22 == 0) goto L_0x0372
            int r0 = r5.topMargin
            int r1 = r5.x
            r17 = r15
            r2 = 3
            r18 = r2
            r19 = r2
            r20 = r0
            r21 = r1
            r17.v(r18, r19, r20, r21, r22)
            goto L_0x0372
        L_0x0350:
            int r0 = r5.j
            r1 = -1
            if (r0 == r1) goto L_0x0372
            java.lang.Object r0 = r9.get(r0)
            r22 = r0
            tj3 r22 = (defpackage.tj3) r22
            if (r22 == 0) goto L_0x0372
            int r0 = r5.topMargin
            int r1 = r5.x
            r17 = r15
            r2 = 3
            r18 = r2
            r2 = 5
            r19 = r2
            r20 = r0
            r21 = r1
            r17.v(r18, r19, r20, r21, r22)
        L_0x0372:
            int r0 = r5.k
            r1 = -1
            if (r0 == r1) goto L_0x0395
            java.lang.Object r0 = r9.get(r0)
            r22 = r0
            tj3 r22 = (defpackage.tj3) r22
            if (r22 == 0) goto L_0x03b6
            int r0 = r5.bottomMargin
            int r1 = r5.z
            r17 = r15
            r2 = 5
            r18 = r2
            r2 = 3
            r19 = r2
            r20 = r0
            r21 = r1
            r17.v(r18, r19, r20, r21, r22)
            goto L_0x03b6
        L_0x0395:
            int r0 = r5.l
            r1 = -1
            if (r0 == r1) goto L_0x03b6
            java.lang.Object r0 = r9.get(r0)
            r22 = r0
            tj3 r22 = (defpackage.tj3) r22
            if (r22 == 0) goto L_0x03b6
            int r0 = r5.bottomMargin
            int r1 = r5.z
            r17 = r15
            r2 = 5
            r18 = r2
            r19 = r2
            r20 = r0
            r21 = r1
            r17.v(r18, r19, r20, r21, r22)
        L_0x03b6:
            int r4 = r5.m
            r6 = -1
            if (r4 == r6) goto L_0x03c8
            r8 = 6
            r0 = r23
            r1 = r15
            r2 = r5
            r3 = r9
            r14 = r5
            r5 = r8
            r0.K(r1, r2, r3, r4, r5)
        L_0x03c6:
            r0 = 0
            goto L_0x03e7
        L_0x03c8:
            r14 = r5
            int r4 = r14.n
            if (r4 == r6) goto L_0x03d8
            r0 = r23
            r1 = r15
            r2 = r14
            r3 = r9
            r8 = 3
            r5 = r8
            r0.K(r1, r2, r3, r4, r5)
            goto L_0x03c6
        L_0x03d8:
            int r4 = r14.o
            if (r4 == r6) goto L_0x03c6
            r0 = r23
            r1 = r15
            r2 = r14
            r3 = r9
            r6 = 5
            r5 = r6
            r0.K(r1, r2, r3, r4, r5)
            goto L_0x03c6
        L_0x03e7:
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 < 0) goto L_0x03ed
            r15.d0 = r7
        L_0x03ed:
            float r1 = r14.F
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x03f5
            r15.e0 = r1
        L_0x03f5:
            if (r13 == 0) goto L_0x0406
            int r0 = r14.T
            r1 = -1
            if (r0 != r1) goto L_0x0400
            int r2 = r14.U
            if (r2 == r1) goto L_0x0406
        L_0x0400:
            int r1 = r14.U
            r15.Y = r0
            r15.Z = r1
        L_0x0406:
            boolean r0 = r14.a0
            r1 = 3
            r2 = 4
            r3 = -2
            if (r0 != 0) goto L_0x0439
            int r0 = r14.width
            r4 = -1
            if (r0 != r4) goto L_0x0431
            boolean r0 = r14.W
            if (r0 == 0) goto L_0x041b
            r15.M(r1)
        L_0x0419:
            r0 = 2
            goto L_0x041f
        L_0x041b:
            r15.M(r2)
            goto L_0x0419
        L_0x041f:
            aj3 r0 = r15.i(r0)
            int r4 = r14.leftMargin
            r0.g = r4
            r0 = 4
            aj3 r0 = r15.i(r0)
            int r4 = r14.rightMargin
            r0.g = r4
            goto L_0x044a
        L_0x0431:
            r15.M(r1)
            r0 = 0
            r15.O(r0)
            goto L_0x044a
        L_0x0439:
            r0 = 1
            r15.M(r0)
            int r0 = r14.width
            r15.O(r0)
            int r0 = r14.width
            if (r0 != r3) goto L_0x044a
            r0 = 2
            r15.M(r0)
        L_0x044a:
            boolean r0 = r14.b0
            if (r0 != 0) goto L_0x047a
            int r0 = r14.height
            r4 = -1
            if (r0 != r4) goto L_0x0472
            boolean r0 = r14.X
            if (r0 == 0) goto L_0x045c
            r15.N(r1)
        L_0x045a:
            r0 = 3
            goto L_0x0460
        L_0x045c:
            r15.N(r2)
            goto L_0x045a
        L_0x0460:
            aj3 r0 = r15.i(r0)
            int r2 = r14.topMargin
            r0.g = r2
            r0 = 5
            aj3 r0 = r15.i(r0)
            int r2 = r14.bottomMargin
            r0.g = r2
            goto L_0x048c
        L_0x0472:
            r15.N(r1)
            r0 = 0
            r15.L(r0)
            goto L_0x048c
        L_0x047a:
            r0 = 1
            r4 = -1
            r15.N(r0)
            int r0 = r14.height
            r15.L(r0)
            int r0 = r14.height
            if (r0 != r3) goto L_0x048c
            r0 = 2
            r15.N(r0)
        L_0x048c:
            java.lang.String r0 = r14.G
            if (r0 == 0) goto L_0x0496
            int r2 = r0.length()
            if (r2 != 0) goto L_0x0499
        L_0x0496:
            r2 = 0
            goto L_0x0525
        L_0x0499:
            int r2 = r0.length()
            r3 = 44
            int r3 = r0.indexOf(r3)
            if (r3 <= 0) goto L_0x04c6
            int r5 = r2 + -1
            if (r3 >= r5) goto L_0x04c6
            r5 = 0
            java.lang.String r6 = r0.substring(r5, r3)
            java.lang.String r5 = "W"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x04b8
            r5 = 0
            goto L_0x04c3
        L_0x04b8:
            java.lang.String r5 = "H"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x04c2
            r5 = 1
            goto L_0x04c3
        L_0x04c2:
            r5 = r4
        L_0x04c3:
            int r3 = r3 + 1
            goto L_0x04c8
        L_0x04c6:
            r5 = r4
            r3 = 0
        L_0x04c8:
            r6 = 58
            int r6 = r0.indexOf(r6)
            if (r6 < 0) goto L_0x050b
            int r2 = r2 + -1
            if (r6 >= r2) goto L_0x050b
            java.lang.String r2 = r0.substring(r3, r6)
            int r6 = r6 + 1
            java.lang.String r0 = r0.substring(r6)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x051a
            int r3 = r0.length()
            if (r3 <= 0) goto L_0x051a
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x051a }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x051a }
            r3 = 0
            int r6 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x051a
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x051a
            r3 = 1
            if (r5 != r3) goto L_0x0504
            float r0 = r0 / r2
            float r0 = java.lang.Math.abs(r0)     // Catch:{ NumberFormatException -> 0x051a }
            goto L_0x0509
        L_0x0504:
            float r2 = r2 / r0
            float r0 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x051a }
        L_0x0509:
            r2 = 0
            goto L_0x051c
        L_0x050b:
            java.lang.String r0 = r0.substring(r3)
            int r2 = r0.length()
            if (r2 <= 0) goto L_0x051a
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x051a }
            goto L_0x0509
        L_0x051a:
            r0 = 0
            goto L_0x0509
        L_0x051c:
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0527
            r15.W = r0
            r15.X = r5
            goto L_0x0527
        L_0x0525:
            r15.W = r2
        L_0x0527:
            float r0 = r14.H
            float[] r2 = r15.k0
            r3 = 0
            r2[r3] = r0
            float r0 = r14.I
            r3 = 1
            r2[r3] = r0
            int r0 = r14.J
            r15.i0 = r0
            int r0 = r14.K
            r15.j0 = r0
            int r0 = r14.Z
            if (r0 < 0) goto L_0x0543
            if (r0 > r1) goto L_0x0543
            r15.q = r0
        L_0x0543:
            int r0 = r14.L
            int r1 = r14.N
            int r2 = r14.P
            float r5 = r14.R
            r15.r = r0
            r15.u = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x0555
            r2 = 0
        L_0x0555:
            r15.v = r2
            r15.w = r5
            r2 = 0
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r6 <= 0) goto L_0x0569
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0569
            if (r0 != 0) goto L_0x0569
            r0 = 2
            r15.r = r0
        L_0x0569:
            int r0 = r14.M
            int r5 = r14.O
            int r6 = r14.Q
            float r7 = r14.S
            r15.s = r0
            r15.x = r5
            if (r6 != r1) goto L_0x0578
            r6 = 0
        L_0x0578:
            r15.y = r6
            r15.z = r7
            r1 = 0
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x058b
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x058b
            if (r0 != 0) goto L_0x058b
            r0 = 2
            r15.s = r0
            goto L_0x058c
        L_0x058b:
            r0 = 2
        L_0x058c:
            int r10 = r10 + 1
            r6 = r23
            r7 = r24
            r8 = r25
            r14 = r16
            goto L_0x0208
        L_0x0598:
            if (r12 == 0) goto L_0x059f
            o5h r0 = r11.r0
            r0.B(r11)
        L_0x059f:
            r0 = r23
            int r1 = r0.z
            r2 = r24
            r3 = r25
            r0.J(r11, r1, r2, r3)
            int r1 = r11.q()
            int r4 = r11.k()
            boolean r5 = r11.E0
            boolean r6 = r11.F0
            l8c r7 = r0.A0
            int r8 = r7.d
            int r7 = r7.c
            int r1 = r1 + r7
            int r4 = r4 + r8
            r7 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r2, r7)
            int r2 = android.view.View.resolveSizeAndState(r4, r3, r7)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            r2 = r2 & r3
            int r3 = r0.w
            int r1 = java.lang.Math.min(r3, r1)
            int r3 = r0.x
            int r2 = java.lang.Math.min(r3, r2)
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            if (r5 == 0) goto L_0x05dd
            r1 = r1 | r3
        L_0x05dd:
            if (r6 == 0) goto L_0x05e0
            r2 = r2 | r3
        L_0x05e0:
            r0.setMeasuredDimension(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        tj3 G = G(view);
        if ((view instanceof Guideline) && !(G instanceof iv6)) {
            fj3 fj3 = (fj3) view.getLayoutParams();
            iv6 iv6 = new iv6();
            fj3.p0 = iv6;
            fj3.d0 = true;
            iv6.S(fj3.V);
        }
        if (view instanceof dj3) {
            dj3 dj3 = (dj3) view;
            dj3.k();
            ((fj3) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.b;
            if (!arrayList.contains(dj3)) {
                arrayList.add(dj3);
            }
        }
        this.a.put(view.getId(), view);
        this.y = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        tj3 G = G(view);
        this.c.q0.remove(G);
        G.C();
        this.b.remove(view);
        this.y = true;
    }

    public final void requestLayout() {
        this.y = true;
        super.requestLayout();
    }

    public void setConstraintSet(pj3 pj3) {
        this.v0 = pj3;
    }

    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.x) {
            this.x = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.w) {
            this.w = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.v) {
            this.v = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.o) {
            this.o = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(xj3 xj3) {
        wsb wsb = this.w0;
        if (wsb != null) {
            wsb.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.z = i;
        uj3 uj3 = this.c;
        uj3.D0 = i;
        gw7.p = uj3.W(ConstantsKt.MINIMUM_BLOCK_SIZE);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        H(attributeSet, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        H(attributeSet, i);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, fj3] */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.a = -1;
        marginLayoutParams.b = -1;
        marginLayoutParams.c = -1.0f;
        marginLayoutParams.d = true;
        marginLayoutParams.e = -1;
        marginLayoutParams.f = -1;
        marginLayoutParams.g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.j = -1;
        marginLayoutParams.k = -1;
        marginLayoutParams.l = -1;
        marginLayoutParams.m = -1;
        marginLayoutParams.n = -1;
        marginLayoutParams.o = -1;
        marginLayoutParams.p = -1;
        marginLayoutParams.q = 0;
        marginLayoutParams.r = c44.DEFAULT_ASPECT_RATIO;
        marginLayoutParams.s = -1;
        marginLayoutParams.t = -1;
        marginLayoutParams.u = -1;
        marginLayoutParams.v = -1;
        marginLayoutParams.w = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.x = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.y = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.z = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.A = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.B = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.C = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.D = 0;
        marginLayoutParams.E = 0.5f;
        marginLayoutParams.F = 0.5f;
        marginLayoutParams.G = null;
        marginLayoutParams.H = -1.0f;
        marginLayoutParams.I = -1.0f;
        marginLayoutParams.J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.M = 0;
        marginLayoutParams.N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.P = 0;
        marginLayoutParams.Q = 0;
        marginLayoutParams.R = 1.0f;
        marginLayoutParams.S = 1.0f;
        marginLayoutParams.T = -1;
        marginLayoutParams.U = -1;
        marginLayoutParams.V = -1;
        marginLayoutParams.W = false;
        marginLayoutParams.X = false;
        marginLayoutParams.Y = null;
        marginLayoutParams.Z = 0;
        marginLayoutParams.a0 = true;
        marginLayoutParams.b0 = true;
        marginLayoutParams.c0 = false;
        marginLayoutParams.d0 = false;
        marginLayoutParams.e0 = false;
        marginLayoutParams.f0 = -1;
        marginLayoutParams.g0 = -1;
        marginLayoutParams.h0 = -1;
        marginLayoutParams.i0 = -1;
        marginLayoutParams.j0 = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.k0 = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.l0 = 0.5f;
        marginLayoutParams.p0 = new tj3();
        return marginLayoutParams;
    }
}
