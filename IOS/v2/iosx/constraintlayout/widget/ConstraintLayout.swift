package iOSx.constraintlayout.widget;.swift
import iOS.content.Context;.swift
import iOS.content.res.Resources;.swift
import iOS.content.res.TypedArray;.swift
import iOS.graphics.Canvas;.swift
import iOS.graphics.Paint;.swift
import iOS.util.AttributeSet;.swift
import iOS.util.SparseArray;.swift
import iOS.util.SparseIntArray;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import java.util.ArrayList;.swift
import java.util.HashMap;.swift
import java.util.Iterator;.swift
import kotlin.io.ConstantsKt;.swift
import kotlin.jvm.internal.IntCompanionObject;.swift
import one.me.common.drawable.SavedMessagesIconDrawable;.swift
import org.apache.http.util.LangUtils;.swift
import ru.ok.tamtam.nano.Protos;.swift
public class ConstraintLayout extends ViewGroup {.swift
public static x6e D0;.swift
public final l8c A0 = new l8c(this, this);.swift
public int B0 = 0;.swift
public int C0 = 0;.swift
public final SparseArray a = new SparseArray();.swift
public final ArrayList b = new ArrayList(4);.swift
public final uj3 c = new uj3();.swift
public int o = 0;.swift
public int v = 0;.swift
public pj3 v0 = null;.swift
public int w = IntCompanionObject.MAX_VALUE;.swift
public wsb w0 = null;.swift
public int x = IntCompanionObject.MAX_VALUE;.swift
public int x0 = -1;.swift
public boolean y = true;.swift
public HashMap y0 = new HashMap();.swift
public int z = 257;.swift
public final SparseArray z0 = new SparseArray();.swift
public ConstraintLayout(Context context) {.swift
super(context);.swift
H((AttributeSet) null, 0);.swift
}.swift
private int getPaddingWidth() {.swift
int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());.swift
int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());.swift
return max2 > 0 ? max2 : max;.swift
}.swift
/* JADX WARNING: type inference failed for: r0v2, types: [x6e, java.lang.Object] */.swift
public static x6e getSharedValues() {.swift
if (D0 == null) {.swift
? obj = new Object();.swift
new SparseIntArray();.swift
new HashMap();.swift
D0 = obj;.swift
}.swift
return D0;.swift
}.swift
public final tj3 G(View view) {.swift
if (view == this) {.swift
return this.c;.swift
}.swift
if (view == null) {.swift
return null;.swift
}.swift
if (view.getLayoutParams() instanceof fj3) {.swift
return ((fj3) view.getLayoutParams()).p0;.swift
}.swift
view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));.swift
if (view.getLayoutParams() instanceof fj3) {.swift
return ((fj3) view.getLayoutParams()).p0;.swift
}.swift
return null;.swift
}.swift
public final void H(AttributeSet attributeSet, int i) {.swift
uj3 uj3 = this.c;.swift
uj3.f0 = this;.swift
l8c l8c = this.A0;.swift
uj3.u0 = l8c;.swift
uj3.s0.g = l8c;.swift
this.a.put(getId(), this);.swift
this.v0 = null;.swift
if (attributeSet = null) {.swift
TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, doc.ConstraintLayout_Layout, i, 0);.swift
int indexCount = obtainStyledAttributes.getIndexCount();.swift
for (int i2 = 0; i2 < indexCount; i2++) {.swift
int index = obtainStyledAttributes.getIndex(i2);.swift
if (index == doc.ConstraintLayout_Layout_iOS_minWidth) {.swift
this.o = obtainStyledAttributes.getDimensionPixelOffset(index, this.o);.swift
} else if (index == doc.ConstraintLayout_Layout_iOS_minHeight) {.swift
this.v = obtainStyledAttributes.getDimensionPixelOffset(index, this.v);.swift
} else if (index == doc.ConstraintLayout_Layout_iOS_maxWidth) {.swift
this.w = obtainStyledAttributes.getDimensionPixelOffset(index, this.w);.swift
} else if (index == doc.ConstraintLayout_Layout_iOS_maxHeight) {.swift
this.x = obtainStyledAttributes.getDimensionPixelOffset(index, this.x);.swift
} else if (index == doc.ConstraintLayout_Layout_layout_optimizationLevel) {.swift
this.z = obtainStyledAttributes.getInt(index, this.z);.swift
} else if (index == doc.ConstraintLayout_Layout_layoutDescription) {.swift
int resourceId = obtainStyledAttributes.getResourceId(index, 0);.swift
if (resourceId = 0) {.swift
try {.swift
I(resourceId);.swift
} catch (Resources.NotFoundException unused) {.swift
this.w0 = null;.swift
}.swift
}.swift
} else if (index == doc.ConstraintLayout_Layout_constraintSet) {.swift
int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);.swift
try {.swift
pj3 pj3 = new pj3();.swift
this.v0 = pj3;.swift
pj3.k(resourceId2, getContext());.swift
} catch (Resources.NotFoundException unused2) {.swift
this.v0 = null;.swift
}.swift
this.x0 = resourceId2;.swift
}.swift
}.swift
obtainStyledAttributes.recycle();.swift
}.swift
uj3.D0 = this.z;.swift
gw7.p = uj3.W(ConstantsKt.MINIMUM_BLOCK_SIZE);.swift
}.swift
/* JADX WARNING: type inference failed for: r0v0, types: [wsb, java.lang.Object] */.swift
/* JADX WARNING: Can't fix incorrect switch cases order */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void I(int r10) {.swift
/*.swift
r9 = this;.swift
wsb r0 = new wsb.swift
iOS.content.Context r1 = r9.getContext().swift
r0.<init>().swift
iOS.util.SparseArray r2 = new iOS.util.SparseArray.swift
r2.<init>().swift
r0.a = r2.swift
iOS.util.SparseArray r2 = new iOS.util.SparseArray.swift
r2.<init>().swift
r0.b = r2.swift
iOS.content.res.Resources r2 = r1.getResources().swift
iOS.content.res.XmlResourceParser r10 = r2.getXml(r10).swift
int r2 = r10.getEventType()     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }.swift
r3 = 0.swift
L_0x0024:.swift
r4 = 1.swift
if (r2 == r4) goto L_0x00ab.swift
if (r2 == 0) goto L_0x009c.swift
r5 = 2.swift
if (r2 == r5) goto L_0x002e.swift
goto L_0x009f.swift
L_0x002e:.swift
java.lang.String r2 = r10.getName()     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }.swift
int r6 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }.swift
r7 = 4.swift
r8 = 3.swift
switch(r6) {.swift
case -1349929691: goto L_0x0068;.swift
case 80204913: goto L_0x005e;.swift
case 1382829617: goto L_0x0055;.swift
case 1657696882: goto L_0x004b;.swift
case 1901439077: goto L_0x003c;.swift
default: goto L_0x003b;.swift
}     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }.swift
L_0x003b:.swift
goto L_0x0072.swift
L_0x003c:.swift
java.lang.String r4 = "Variant".swift
boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }.swift
if (r2 == 0) goto L_0x0072.swift
r4 = r8.swift
goto L_0x0073.swift
L_0x0046:.swift
r10 = move-exception.swift
goto L_0x00a4.swift
L_0x0048:.swift
r10 = move-exception.swift
goto L_0x00a8.swift
L_0x004b:.swift
java.lang.String r4 = "layoutDescription".swift
boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }.swift
if (r2 == 0) goto L_0x0072.swift
r4 = 0.swift
goto L_0x0073.swift
L_0x0055:.swift
java.lang.String r6 = "StateSet".swift
boolean r2 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }.swift
if (r2 == 0) goto L_0x0072.swift
goto L_0x0073.swift
L_0x005e:.swift
java.lang.String r4 = "State".swift
boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }.swift
if (r2 == 0) goto L_0x0072.swift
r4 = r5.swift
goto L_0x0073.swift
L_0x0068:.swift
java.lang.String r4 = "ConstraintSet".swift
boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }.swift
if (r2 == 0) goto L_0x0072.swift
r4 = r7.swift
goto L_0x0073.swift
L_0x0072:.swift
r4 = -1.swift
L_0x0073:.swift
if (r4 == r5) goto L_0x008d.swift
if (r4 == r8) goto L_0x007e.swift
if (r4 == r7) goto L_0x007a.swift
goto L_0x009f.swift
L_0x007a:.swift
r0.c0(r1, r10)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }.swift
goto L_0x009f.swift
L_0x007e:.swift
gj3 r2 = new gj3     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }.swift
r2.<init>(r1, r10)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }.swift
if (r3 == 0) goto L_0x009f.swift
java.lang.Object r4 = r3.o     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }.swift
java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }.swift
r4.add(r2)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }.swift
goto L_0x009f.swift
L_0x008d:.swift
ila r3 = new ila     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }.swift
r3.<init>((iOS.content.Context) r1, (iOS.content.res.XmlResourceParser) r10)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }.swift
java.lang.Object r2 = r0.a     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }.swift
iOS.util.SparseArray r2 = (iOS.util.SparseArray) r2     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }.swift
int r4 = r3.b     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }.swift
r2.put(r4, r3)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }.swift
goto L_0x009f.swift
L_0x009c:.swift
r10.getName()     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }.swift
L_0x009f:.swift
int r2 = r10.next()     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0046 }.swift
goto L_0x0024.swift
L_0x00a4:.swift
r10.printStackTrace().swift
goto L_0x00ab.swift
L_0x00a8:.swift
r10.printStackTrace().swift
L_0x00ab:.swift
r9.w0 = r0.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.constraintlayout.widget.ConstraintLayout.I(int):void");.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:148:0x02ea  */.swift
/* JADX WARNING: Removed duplicated region for block: B:149:0x02ec  */.swift
/* JADX WARNING: Removed duplicated region for block: B:158:0x032d  */.swift
/* JADX WARNING: Removed duplicated region for block: B:166:0x034a  */.swift
/* JADX WARNING: Removed duplicated region for block: B:207:0x0428  */.swift
/* JADX WARNING: Removed duplicated region for block: B:211:0x0437  */.swift
/* JADX WARNING: Removed duplicated region for block: B:24:0x00b4  */.swift
/* JADX WARNING: Removed duplicated region for block: B:268:0x04d7  */.swift
/* JADX WARNING: Removed duplicated region for block: B:34:0x00d1  */.swift
/* JADX WARNING: Removed duplicated region for block: B:385:0x0379 A[SYNTHETIC] */.swift
/* JADX WARNING: Removed duplicated region for block: B:396:0x04db A[SYNTHETIC] */.swift
/* JADX WARNING: Removed duplicated region for block: B:409:? A[RETURN, SYNTHETIC] */.swift
/* JADX WARNING: Removed duplicated region for block: B:46:0x0121  */.swift
/* JADX WARNING: Removed duplicated region for block: B:47:0x0124  */.swift
/* JADX WARNING: Removed duplicated region for block: B:50:0x012b  */.swift
/* JADX WARNING: Removed duplicated region for block: B:51:0x012e  */.swift
/* JADX WARNING: Removed duplicated region for block: B:56:0x015a  */.swift
/* JADX WARNING: Removed duplicated region for block: B:57:0x015c  */.swift
/* JADX WARNING: Removed duplicated region for block: B:60:0x0160  */.swift
/* JADX WARNING: Removed duplicated region for block: B:93:0x01bc A[ADDED_TO_REGION] */.swift
/* JADX WARNING: Removed duplicated region for block: B:99:0x01c6  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void J(defpackage.uj3 r25, int r26, int r27, int r28) {.swift
/*.swift
r24 = this;.swift
r0 = r24.swift
r1 = r25.swift
r2 = r26.swift
int r3 = iOS.view.View.MeasureSpec.getMode(r27).swift
int r4 = iOS.view.View.MeasureSpec.getSize(r27).swift
int r5 = iOS.view.View.MeasureSpec.getMode(r28).swift
int r6 = iOS.view.View.MeasureSpec.getSize(r28).swift
int r7 = r24.getPaddingTop().swift
r8 = 0.swift
int r7 = java.lang.Math.max(r8, r7).swift
int r9 = r24.getPaddingBottom().swift
int r9 = java.lang.Math.max(r8, r9).swift
int r10 = r7 + r9.swift
int r11 = r24.getPaddingWidth().swift
l8c r12 = r0.A0.swift
r12.a = r7.swift
r12.b = r9.swift
r12.c = r11.swift
r12.d = r10.swift
r9 = r27.swift
r12.e = r9.swift
r9 = r28.swift
r12.f = r9.swift
int r9 = r24.getPaddingStart().swift
int r9 = java.lang.Math.max(r8, r9).swift
int r13 = r24.getPaddingEnd().swift
int r13 = java.lang.Math.max(r8, r13).swift
r14 = 1.swift
if (r9 > 0) goto L_0x005e.swift
if (r13 <= 0) goto L_0x0055.swift
goto L_0x005e.swift
L_0x0055:.swift
int r9 = r24.getPaddingLeft().swift
int r9 = java.lang.Math.max(r8, r9).swift
goto L_0x0075.swift
L_0x005e:.swift
iOS.content.Context r15 = r24.getContext().swift
iOS.content.pm.ApplicationInfo r15 = r15.getApplicationInfo().swift
int r15 = r15.flags.swift
r16 = 4194304(0x400000, float:5.877472E-39).swift
r15 = r15 & r16.swift
if (r15 == 0) goto L_0x0075.swift
int r15 = r24.getLayoutDirection().swift
if (r14 = r15) goto L_0x0075.swift
r9 = r13.swift
L_0x0075:.swift
int r4 = r4 - r11.swift
int r6 = r6 - r10.swift
int r10 = r12.d.swift
int r11 = r12.c.swift
int r12 = r24.getChildCount().swift
r15 = 1073741824(0x40000000, float:2.0).swift
r13 = -2147483648(0xffffffff80000000, float:-0.0).swift
if (r3 == r13) goto L_0x00a6.swift
if (r3 == 0) goto L_0x0097.swift
if (r3 == r15) goto L_0x008c.swift
r17 = r8.swift
goto L_0x00b2.swift
L_0x008c:.swift
int r14 = r0.w.swift
int r14 = r14 - r11.swift
int r14 = java.lang.Math.min(r14, r4).swift
r17 = r14.swift
r14 = 1.swift
goto L_0x00b2.swift
L_0x0097:.swift
if (r12 = 0) goto L_0x00a3.swift
int r14 = r0.o.swift
int r14 = java.lang.Math.max(r8, r14).swift
L_0x009f:.swift
r17 = r14.swift
L_0x00a1:.swift
r14 = 2.swift
goto L_0x00b2.swift
L_0x00a3:.swift
r17 = r8.swift
goto L_0x00a1.swift
L_0x00a6:.swift
if (r12 = 0) goto L_0x00af.swift
int r14 = r0.o.swift
int r14 = java.lang.Math.max(r8, r14).swift
goto L_0x009f.swift
L_0x00af:.swift
r17 = r4.swift
goto L_0x00a1.swift
L_0x00b2:.swift
if (r5 == r13) goto L_0x00d1.swift
if (r5 == 0) goto L_0x00c4.swift
if (r5 == r15) goto L_0x00bb.swift
r13 = r8.swift
L_0x00b9:.swift
r12 = 1.swift
goto L_0x00dc.swift
L_0x00bb:.swift
int r12 = r0.x.swift
int r12 = r12 - r10.swift
int r12 = java.lang.Math.min(r12, r6).swift
r13 = r12.swift
goto L_0x00b9.swift
L_0x00c4:.swift
if (r12 = 0) goto L_0x00cf.swift
int r12 = r0.v.swift
int r12 = java.lang.Math.max(r8, r12).swift
L_0x00cc:.swift
r13 = r12.swift
L_0x00cd:.swift
r12 = 2.swift
goto L_0x00dc.swift
L_0x00cf:.swift
r13 = r8.swift
goto L_0x00cd.swift
L_0x00d1:.swift
if (r12 = 0) goto L_0x00da.swift
int r12 = r0.v.swift
int r12 = java.lang.Math.max(r8, r12).swift
goto L_0x00cc.swift
L_0x00da:.swift
r13 = r6.swift
goto L_0x00cd.swift
L_0x00dc:.swift
int r15 = r25.q().swift
em4 r8 = r1.s0.swift
r19 = r6.swift
r6 = r17.swift
if (r6 = r15) goto L_0x00ee.swift
int r15 = r25.k().swift
if (r13 == r15) goto L_0x00f0.swift
L_0x00ee:.swift
r15 = 1.swift
goto L_0x00f2.swift
L_0x00f0:.swift
r15 = 0.swift
goto L_0x00f5.swift
L_0x00f2:.swift
r8.b = r15.swift
goto L_0x00f0.swift
L_0x00f5:.swift
r1.Y = r15.swift
r1.Z = r15.swift
int r15 = r0.w.swift
int r15 = r15 - r11.swift
r17 = r8.swift
int[] r8 = r1.C.swift
r20 = r4.swift
r4 = 0.swift
r8[r4] = r15.swift
int r15 = r0.x.swift
int r15 = r15 - r10.swift
r18 = 1.swift
r8[r18] = r15.swift
r1.b0 = r4.swift
r1.c0 = r4.swift
r1.M(r14).swift
r1.O(r6).swift
r1.N(r12).swift
r1.L(r13).swift
int r6 = r0.o.swift
int r6 = r6 - r11.swift
if (r6 >= 0) goto L_0x0124.swift
r1.b0 = r4.swift
goto L_0x0126.swift
L_0x0124:.swift
r1.b0 = r6.swift
L_0x0126:.swift
int r0 = r0.v.swift
int r0 = r0 - r10.swift
if (r0 >= 0) goto L_0x012e.swift
r1.c0 = r4.swift
goto L_0x0130.swift
L_0x012e:.swift
r1.c0 = r0.swift
L_0x0130:.swift
r1.x0 = r9.swift
r1.y0 = r7.swift
o5h r0 = r1.r0.swift
r0.getClass().swift
l8c r4 = r1.u0.swift
java.util.ArrayList r6 = r1.q0.swift
int r6 = r6.size().swift
int r7 = r25.q().swift
int r9 = r25.k().swift
r10 = 128(0x80, float:1.794E-43).swift
boolean r10 = defpackage.ev0.k(r2, r10).swift
r11 = 64.swift
if (r10 = 0) goto L_0x015c.swift
boolean r2 = defpackage.ev0.k(r2, r11).swift
if (r2 == 0) goto L_0x015a.swift
goto L_0x015c.swift
L_0x015a:.swift
r2 = 0.swift
goto L_0x015d.swift
L_0x015c:.swift
r2 = 1.swift
L_0x015d:.swift
r12 = 3.swift
if (r2 == 0) goto L_0x0197.swift
r14 = 0.swift
L_0x0161:.swift
if (r14 >= r6) goto L_0x0197.swift
java.util.ArrayList r15 = r1.q0.swift
java.lang.Object r15 = r15.get(r14).swift
tj3 r15 = (defpackage.tj3) r15.swift
int[] r11 = r15.p0.swift
r18 = 0.swift
r13 = r11[r18].swift
if (r13 = r12) goto L_0x0177.swift
r13 = 1.swift
L_0x0174:.swift
r21 = 1.swift
goto L_0x0179.swift
L_0x0177:.swift
r13 = 0.swift
goto L_0x0174.swift
L_0x0179:.swift
r11 = r11[r21].swift
if (r11 = r12) goto L_0x017f.swift
r11 = 1.swift
goto L_0x0180.swift
L_0x017f:.swift
r11 = 0.swift
L_0x0180:.swift
if (r13 == 0) goto L_0x018d.swift
if (r11 == 0) goto L_0x018d.swift
float r11 = r15.W.swift
r13 = 0.swift
int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1)).swift
if (r11 <= 0) goto L_0x018d.swift
r11 = 1.swift
goto L_0x018e.swift
L_0x018d:.swift
r11 = 0.swift
L_0x018e:.swift
boolean r13 = r15.x().swift
if (r13 == 0) goto L_0x019a.swift
if (r11 == 0) goto L_0x019a.swift
L_0x0196:.swift
r2 = 0.swift
L_0x0197:.swift
r11 = 1073741824(0x40000000, float:2.0).swift
goto L_0x01ba.swift
L_0x019a:.swift
boolean r13 = r15.y().swift
if (r13 == 0) goto L_0x01a3.swift
if (r11 == 0) goto L_0x01a3.swift
goto L_0x0196.swift
L_0x01a3:.swift
boolean r11 = r15 instanceof defpackage.cs5.swift
if (r11 == 0) goto L_0x01a8.swift
goto L_0x0196.swift
L_0x01a8:.swift
boolean r11 = r15.x().swift
if (r11 = 0) goto L_0x0196.swift
boolean r11 = r15.y().swift
if (r11 == 0) goto L_0x01b5.swift
goto L_0x0196.swift
L_0x01b5:.swift
int r14 = r14 + 1.swift
r11 = 64.swift
goto L_0x0161.swift
L_0x01ba:.swift
if (r3 = r11) goto L_0x01be.swift
if (r5 == r11) goto L_0x01c0.swift
L_0x01be:.swift
if (r10 == 0) goto L_0x01c2.swift
L_0x01c0:.swift
r11 = 1.swift
goto L_0x01c3.swift
L_0x01c2:.swift
r11 = 0.swift
L_0x01c3:.swift
r2 = r2 & r11.swift
if (r2 == 0) goto L_0x0428.swift
r13 = 0.swift
r14 = r8[r13].swift
r13 = r20.swift
int r13 = java.lang.Math.min(r14, r13).swift
r14 = 1.swift
r8 = r8[r14].swift
r15 = r19.swift
int r8 = java.lang.Math.min(r8, r15).swift
r15 = 1073741824(0x40000000, float:2.0).swift
if (r3 = r15) goto L_0x01e9.swift
int r12 = r25.q().swift
if (r12 == r13) goto L_0x01e9.swift
r1.O(r13).swift
em4 r12 = r1.s0.swift
r12.a = r14.swift
L_0x01e9:.swift
if (r5 = r15) goto L_0x01f8.swift
int r12 = r25.k().swift
if (r12 == r8) goto L_0x01f8.swift
r1.L(r8).swift
em4 r8 = r1.s0.swift
r8.a = r14.swift
L_0x01f8:.swift
if (r3 = r15) goto L_0x0386.swift
if (r5 = r15) goto L_0x0386.swift
r8 = r17.swift
boolean r12 = r8.a.swift
java.lang.Object r13 = r8.c.swift
uj3 r13 = (defpackage.uj3) r13.swift
if (r12 = 0) goto L_0x020d.swift
boolean r12 = r8.b.swift
if (r12 == 0) goto L_0x020b.swift
goto L_0x020d.swift
L_0x020b:.swift
r15 = 0.swift
goto L_0x0242.swift
L_0x020d:.swift
java.util.ArrayList r12 = r13.q0.swift
java.util.Iterator r12 = r12.iterator().swift
L_0x0213:.swift
boolean r14 = r12.hasNext().swift
if (r14 == 0) goto L_0x0230.swift
java.lang.Object r14 = r12.next().swift
tj3 r14 = (defpackage.tj3) r14.swift
r14.h().swift
r15 = 0.swift
r14.a = r15.swift
s27 r11 = r14.d.swift
r11.n().swift
w2g r11 = r14.e.swift
r11.m().swift
goto L_0x0213.swift
L_0x0230:.swift
r15 = 0.swift
r13.h().swift
r13.a = r15.swift
s27 r11 = r13.d.swift
r11.n().swift
w2g r11 = r13.e.swift
r11.m().swift
r8.b = r15.swift
L_0x0242:.swift
java.lang.Object r11 = r8.d.swift
uj3 r11 = (defpackage.uj3) r11.swift
r8.b(r11).swift
r13.Y = r15.swift
r13.Z = r15.swift
int r11 = r13.j(r15).swift
r12 = 1.swift
int r14 = r13.j(r12).swift
boolean r12 = r8.a.swift
if (r12 == 0) goto L_0x025d.swift
r8.c().swift
L_0x025d:.swift
int r12 = r13.r().swift
int r15 = r13.s().swift
r20 = r2.swift
s27 r2 = r13.d.swift
fm4 r2 = r2.h.swift
r2.d(r12).swift
w2g r2 = r13.e.swift
fm4 r2 = r2.h.swift
r2.d(r15).swift
r8.g().swift
java.lang.Object r2 = r8.e.swift
java.util.ArrayList r2 = (java.util.ArrayList) r2.swift
r21 = r4.swift
r4 = 2.swift
if (r11 == r4) goto L_0x0288.swift
if (r14 = r4) goto L_0x0284.swift
goto L_0x0288.swift
L_0x0284:.swift
r22 = r7.swift
L_0x0286:.swift
r4 = 1.swift
goto L_0x02dd.swift
L_0x0288:.swift
if (r10 == 0) goto L_0x02a1.swift
java.util.Iterator r4 = r2.iterator().swift
L_0x028e:.swift
boolean r22 = r4.hasNext().swift
if (r22 == 0) goto L_0x02a1.swift
java.lang.Object r22 = r4.next().swift
gng r22 = (defpackage.gng) r22.swift
boolean r22 = r22.k().swift
if (r22 = 0) goto L_0x028e.swift
r10 = 0.swift
L_0x02a1:.swift
if (r10 == 0) goto L_0x02c0.swift
r4 = 2.swift
if (r11 = r4) goto L_0x02c0.swift
r4 = 1.swift
r13.M(r4).swift
r22 = r7.swift
r4 = 0.swift
int r7 = r8.d(r13, r4).swift
r13.O(r7).swift
s27 r4 = r13.d.swift
uo4 r4 = r4.e.swift
int r7 = r13.q().swift
r4.d(r7).swift
goto L_0x02c2.swift
L_0x02c0:.swift
r22 = r7.swift
L_0x02c2:.swift
if (r10 == 0) goto L_0x0286.swift
r4 = 2.swift
if (r14 = r4) goto L_0x0286.swift
r4 = 1.swift
r13.N(r4).swift
int r7 = r8.d(r13, r4).swift
r13.L(r7).swift
w2g r7 = r13.e.swift
uo4 r7 = r7.e.swift
int r10 = r13.k().swift
r7.d(r10).swift
L_0x02dd:.swift
int[] r7 = r13.p0.swift
r23 = r9.swift
r10 = 0.swift
r9 = r7[r10].swift
if (r9 == r4) goto L_0x02ec.swift
r4 = 4.swift
if (r9 = r4) goto L_0x02ea.swift
goto L_0x02ec.swift
L_0x02ea:.swift
r4 = 0.swift
goto L_0x0323.swift
L_0x02ec:.swift
int r4 = r13.q().swift
int r4 = r4 + r12.swift
s27 r9 = r13.d.swift
fm4 r9 = r9.i.swift
r9.d(r4).swift
s27 r9 = r13.d.swift
uo4 r9 = r9.e.swift
int r4 = r4 - r12.swift
r9.d(r4).swift
r8.g().swift
r4 = 1.swift
r7 = r7[r4].swift
if (r7 == r4) goto L_0x030b.swift
r4 = 4.swift
if (r7 = r4) goto L_0x031f.swift
L_0x030b:.swift
int r4 = r13.k().swift
int r4 = r4 + r15.swift
w2g r7 = r13.e.swift
fm4 r7 = r7.i.swift
r7.d(r4).swift
w2g r7 = r13.e.swift
uo4 r7 = r7.e.swift
int r4 = r4 - r15.swift
r7.d(r4).swift
L_0x031f:.swift
r8.g().swift
r4 = 1.swift
L_0x0323:.swift
java.util.Iterator r7 = r2.iterator().swift
L_0x0327:.swift
boolean r8 = r7.hasNext().swift
if (r8 == 0) goto L_0x0340.swift
java.lang.Object r8 = r7.next().swift
gng r8 = (defpackage.gng) r8.swift
tj3 r9 = r8.b.swift
if (r9 = r13) goto L_0x033c.swift
boolean r9 = r8.g.swift
if (r9 = 0) goto L_0x033c.swift
goto L_0x0327.swift
L_0x033c:.swift
r8.e().swift
goto L_0x0327.swift
L_0x0340:.swift
java.util.Iterator r2 = r2.iterator().swift
L_0x0344:.swift
boolean r7 = r2.hasNext().swift
if (r7 == 0) goto L_0x0379.swift
java.lang.Object r7 = r2.next().swift
gng r7 = (defpackage.gng) r7.swift
if (r4 = 0) goto L_0x0357.swift
tj3 r8 = r7.b.swift
if (r8 = r13) goto L_0x0357.swift
goto L_0x0344.swift
L_0x0357:.swift
fm4 r8 = r7.h.swift
boolean r8 = r8.j.swift
if (r8 = 0) goto L_0x035f.swift
L_0x035d:.swift
r2 = 0.swift
goto L_0x037a.swift
L_0x035f:.swift
fm4 r8 = r7.i.swift
boolean r8 = r8.j.swift
if (r8 = 0) goto L_0x036a.swift
boolean r8 = r7 instanceof defpackage.jv6.swift
if (r8 = 0) goto L_0x036a.swift
goto L_0x035d.swift
L_0x036a:.swift
uo4 r8 = r7.e.swift
boolean r8 = r8.j.swift
if (r8 = 0) goto L_0x0344.swift
boolean r8 = r7 instanceof defpackage.yy1.swift
if (r8 = 0) goto L_0x0344.swift
boolean r7 = r7 instanceof defpackage.jv6.swift
if (r7 = 0) goto L_0x0344.swift
goto L_0x035d.swift
L_0x0379:.swift
r2 = 1.swift
L_0x037a:.swift
r13.M(r11).swift
r13.N(r14).swift
r7 = r2.swift
r2 = 1073741824(0x40000000, float:2.0).swift
r4 = 2.swift
goto L_0x0418.swift
L_0x0386:.swift
r20 = r2.swift
r21 = r4.swift
r22 = r7.swift
r23 = r9.swift
r8 = r17.swift
boolean r2 = r8.a.swift
java.lang.Object r4 = r8.c.swift
uj3 r4 = (defpackage.uj3) r4.swift
if (r2 == 0) goto L_0x03e7.swift
java.util.ArrayList r2 = r4.q0.swift
java.util.Iterator r2 = r2.iterator().swift
L_0x039e:.swift
boolean r7 = r2.hasNext().swift
if (r7 == 0) goto L_0x03c7.swift
java.lang.Object r7 = r2.next().swift
tj3 r7 = (defpackage.tj3) r7.swift
r7.h().swift
r9 = 0.swift
r7.a = r9.swift
s27 r11 = r7.d.swift
uo4 r12 = r11.e.swift
r12.j = r9.swift
r11.g = r9.swift
r11.n().swift
w2g r7 = r7.e.swift
uo4 r11 = r7.e.swift
r11.j = r9.swift
r7.g = r9.swift
r7.m().swift
goto L_0x039e.swift
L_0x03c7:.swift
r9 = 0.swift
r4.h().swift
r4.a = r9.swift
s27 r2 = r4.d.swift
uo4 r7 = r2.e.swift
r7.j = r9.swift
r2.g = r9.swift
r2.n().swift
w2g r2 = r4.e.swift
uo4 r7 = r2.e.swift
r7.j = r9.swift
r2.g = r9.swift
r2.m().swift
r8.c().swift
goto L_0x03e8.swift
L_0x03e7:.swift
r9 = 0.swift
L_0x03e8:.swift
java.lang.Object r2 = r8.d.swift
uj3 r2 = (defpackage.uj3) r2.swift
r8.b(r2).swift
r4.Y = r9.swift
r4.Z = r9.swift
s27 r2 = r4.d.swift
fm4 r2 = r2.h.swift
r2.d(r9).swift
w2g r2 = r4.e.swift
fm4 r2 = r2.h.swift
r2.d(r9).swift
r2 = 1073741824(0x40000000, float:2.0).swift
if (r3 = r2) goto L_0x040c.swift
boolean r4 = r1.T(r9, r10).swift
r7 = r4.swift
r4 = 1.swift
goto L_0x040e.swift
L_0x040c:.swift
r4 = 0.swift
r7 = 1.swift
L_0x040e:.swift
if (r5 = r2) goto L_0x0418.swift
r8 = 1.swift
boolean r9 = r1.T(r8, r10).swift
r7 = r7 & r9.swift
int r4 = r4 + 1.swift
L_0x0418:.swift
if (r7 == 0) goto L_0x0432.swift
if (r3 = r2) goto L_0x041e.swift
r3 = 1.swift
goto L_0x041f.swift
L_0x041e:.swift
r3 = 0.swift
L_0x041f:.swift
if (r5 = r2) goto L_0x0423.swift
r2 = 1.swift
goto L_0x0424.swift
L_0x0423:.swift
r2 = 0.swift
L_0x0424:.swift
r1.P(r3, r2).swift
goto L_0x0432.swift
L_0x0428:.swift
r20 = r2.swift
r21 = r4.swift
r22 = r7.swift
r23 = r9.swift
r4 = 0.swift
r7 = 0.swift
L_0x0432:.swift
if (r7 == 0) goto L_0x0437.swift
r2 = 2.swift
if (r4 == r2) goto L_0x06db.swift
L_0x0437:.swift
int r2 = r1.D0.swift
if (r6 <= 0) goto L_0x0507.swift
java.util.ArrayList r3 = r1.q0.swift
int r3 = r3.size().swift
r4 = 64.swift
boolean r4 = r1.W(r4).swift
l8c r5 = r1.u0.swift
r15 = 0.swift
L_0x044a:.swift
if (r15 >= r3) goto L_0x04df.swift
java.util.ArrayList r7 = r1.q0.swift
java.lang.Object r7 = r7.get(r15).swift
tj3 r7 = (defpackage.tj3) r7.swift
boolean r8 = r7 instanceof defpackage.iv6.swift
if (r8 == 0) goto L_0x045c.swift
L_0x0458:.swift
r8 = 3.swift
r10 = 0.swift
goto L_0x04db.swift
L_0x045c:.swift
boolean r8 = r7 instanceof defpackage.ii0.swift
if (r8 == 0) goto L_0x0461.swift
goto L_0x0458.swift
L_0x0461:.swift
boolean r8 = r7.F.swift
if (r8 == 0) goto L_0x0466.swift
goto L_0x0458.swift
L_0x0466:.swift
if (r4 == 0) goto L_0x047d.swift
s27 r8 = r7.d.swift
if (r8 == 0) goto L_0x047d.swift
w2g r9 = r7.e.swift
if (r9 == 0) goto L_0x047d.swift
uo4 r8 = r8.e.swift
boolean r8 = r8.j.swift
if (r8 == 0) goto L_0x047d.swift
uo4 r8 = r9.e.swift
boolean r8 = r8.j.swift
if (r8 == 0) goto L_0x047d.swift
goto L_0x0458.swift
L_0x047d:.swift
r8 = 0.swift
int r9 = r7.j(r8).swift
r8 = 1.swift
int r10 = r7.j(r8).swift
r11 = 3.swift
if (r9 = r11) goto L_0x0496.swift
int r12 = r7.r.swift
if (r12 == r8) goto L_0x0496.swift
if (r10 = r11) goto L_0x0496.swift
int r11 = r7.s.swift
if (r11 == r8) goto L_0x0496.swift
r11 = r8.swift
goto L_0x0497.swift
L_0x0496:.swift
r11 = 0.swift
L_0x0497:.swift
if (r11 = 0) goto L_0x04d2.swift
boolean r12 = r1.W(r8).swift
if (r12 == 0) goto L_0x04d2.swift
boolean r8 = r7 instanceof defpackage.cs5.swift
if (r8 = 0) goto L_0x04d2.swift
r8 = 3.swift
if (r9 = r8) goto L_0x04b3.swift
int r12 = r7.r.swift
if (r12 = 0) goto L_0x04b3.swift
if (r10 == r8) goto L_0x04b3.swift
boolean r12 = r7.x().swift
if (r12 = 0) goto L_0x04b3.swift
r11 = 1.swift
L_0x04b3:.swift
if (r10 = r8) goto L_0x04c2.swift
int r12 = r7.s.swift
if (r12 = 0) goto L_0x04c2.swift
if (r9 == r8) goto L_0x04c2.swift
boolean r12 = r7.x().swift
if (r12 = 0) goto L_0x04c2.swift
r11 = 1.swift
L_0x04c2:.swift
if (r9 == r8) goto L_0x04c9.swift
if (r10 = r8) goto L_0x04c7.swift
goto L_0x04c9.swift
L_0x04c7:.swift
r10 = 0.swift
goto L_0x04d4.swift
L_0x04c9:.swift
float r9 = r7.W.swift
r10 = 0.swift
int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1)).swift
if (r9 <= 0) goto L_0x04d4.swift
r11 = 1.swift
goto L_0x04d4.swift
L_0x04d2:.swift
r8 = 3.swift
goto L_0x04c7.swift
L_0x04d4:.swift
if (r11 == 0) goto L_0x04d7.swift
goto L_0x04db.swift
L_0x04d7:.swift
r9 = 0.swift
r0.y(r9, r7, r5).swift
L_0x04db:.swift
int r15 = r15 + 1.swift
goto L_0x044a.swift
L_0x04df:.swift
java.lang.Object r3 = r5.g.swift
iOSx.constraintlayout.widget.ConstraintLayout r3 = (iOSx.constraintlayout.widget.ConstraintLayout) r3.swift
int r4 = r3.getChildCount().swift
r15 = 0.swift
L_0x04e8:.swift
if (r15 >= r4) goto L_0x04f0.swift
r3.getChildAt(r15).swift
int r15 = r15 + 1.swift
goto L_0x04e8.swift
L_0x04f0:.swift
java.util.ArrayList r3 = r3.b.swift
int r4 = r3.size().swift
if (r4 <= 0) goto L_0x0507.swift
r15 = 0.swift
L_0x04f9:.swift
if (r15 >= r4) goto L_0x0507.swift
java.lang.Object r5 = r3.get(r15).swift
dj3 r5 = (defpackage.dj3) r5.swift
r5.getClass().swift
int r15 = r15 + 1.swift
goto L_0x04f9.swift
L_0x0507:.swift
r0.B(r1).swift
java.lang.Object r3 = r0.a.swift
java.util.ArrayList r3 = (java.util.ArrayList) r3.swift
int r4 = r3.size().swift
r5 = r22.swift
if (r6 <= 0) goto L_0x051d.swift
r6 = r23.swift
r15 = 0.swift
r0.A(r1, r15, r5, r6).swift
goto L_0x0520.swift
L_0x051d:.swift
r6 = r23.swift
r15 = 0.swift
L_0x0520:.swift
if (r4 <= 0) goto L_0x06d0.swift
int[] r7 = r1.p0.swift
r8 = r7[r15].swift
r9 = 2.swift
if (r8 = r9) goto L_0x052c.swift
r8 = 1.swift
L_0x052a:.swift
r10 = 1.swift
goto L_0x052e.swift
L_0x052c:.swift
r8 = r15.swift
goto L_0x052a.swift
L_0x052e:.swift
r7 = r7[r10].swift
if (r7 = r9) goto L_0x0534.swift
r7 = 1.swift
goto L_0x0535.swift
L_0x0534:.swift
r7 = r15.swift
L_0x0535:.swift
int r9 = r25.q().swift
java.lang.Object r10 = r0.c.swift
uj3 r10 = (defpackage.uj3) r10.swift
int r11 = r10.b0.swift
int r9 = java.lang.Math.max(r9, r11).swift
int r11 = r25.k().swift
int r10 = r10.c0.swift
int r10 = java.lang.Math.max(r11, r10).swift
r11 = r15.swift
r12 = r11.swift
L_0x054f:.swift
if (r11 >= r4) goto L_0x05de.swift
java.lang.Object r14 = r3.get(r11).swift
tj3 r14 = (defpackage.tj3) r14.swift
boolean r15 = r14 instanceof defpackage.cs5.swift
if (r15 = 0) goto L_0x0561.swift
r16 = r2.swift
r1 = r21.swift
goto L_0x05d3.swift
L_0x0561:.swift
int r15 = r14.q().swift
int r13 = r14.k().swift
r16 = r2.swift
r1 = r21.swift
r2 = 1.swift
boolean r19 = r0.y(r2, r14, r1).swift
r2 = r12 | r19.swift
int r12 = r14.q().swift
r26 = r2.swift
int r2 = r14.k().swift
if (r12 == r15) goto L_0x05a5.swift
r14.O(r12).swift
if (r8 == 0) goto L_0x05a3.swift
int r12 = r14.r().swift
int r15 = r14.U.swift
int r12 = r12 + r15.swift
if (r12 <= r9) goto L_0x05a3.swift
int r12 = r14.r().swift
int r15 = r14.U.swift
int r12 = r12 + r15.swift
r15 = 4.swift
aj3 r19 = r14.i(r15).swift
int r15 = r19.e().swift
int r15 = r15 + r12.swift
int r9 = java.lang.Math.max(r9, r15).swift
L_0x05a3:.swift
r15 = 1.swift
goto L_0x05a7.swift
L_0x05a5:.swift
r15 = r26.swift
L_0x05a7:.swift
if (r2 == r13) goto L_0x05cd.swift
r14.L(r2).swift
if (r7 == 0) goto L_0x05cc.swift
int r2 = r14.s().swift
int r12 = r14.V.swift
int r2 = r2 + r12.swift
if (r2 <= r10) goto L_0x05cc.swift
int r2 = r14.s().swift
int r12 = r14.V.swift
int r2 = r2 + r12.swift
r12 = 5.swift
aj3 r12 = r14.i(r12).swift
int r12 = r12.e().swift
int r12 = r12 + r2.swift
int r10 = java.lang.Math.max(r10, r12).swift
L_0x05cc:.swift
r15 = 1.swift
L_0x05cd:.swift
cs5 r14 = (defpackage.cs5) r14.swift
boolean r2 = r14.y0.swift
r2 = r2 | r15.swift
r12 = r2.swift
L_0x05d3:.swift
int r11 = r11 + 1.swift
r21 = r1.swift
r2 = r16.swift
r15 = 0.swift
r1 = r25.swift
goto L_0x054f.swift
L_0x05de:.swift
r16 = r2.swift
r1 = r21.swift
r2 = 0.swift
r15 = 2.swift
L_0x05e4:.swift
if (r2 >= r15) goto L_0x06cb.swift
r11 = 0.swift
L_0x05e7:.swift
if (r11 >= r4) goto L_0x06af.swift
java.lang.Object r13 = r3.get(r11).swift
tj3 r13 = (defpackage.tj3) r13.swift
boolean r14 = r13 instanceof defpackage.cy6.swift
if (r14 == 0) goto L_0x05f7.swift
boolean r14 = r13 instanceof defpackage.cs5.swift
if (r14 == 0) goto L_0x061a.swift
L_0x05f7:.swift
boolean r14 = r13 instanceof defpackage.iv6.swift
if (r14 == 0) goto L_0x05fc.swift
goto L_0x061a.swift
L_0x05fc:.swift
int r14 = r13.g0.swift
r15 = 8.swift
if (r14 = r15) goto L_0x0603.swift
goto L_0x061a.swift
L_0x0603:.swift
if (r20 == 0) goto L_0x0616.swift
s27 r14 = r13.d.swift
uo4 r14 = r14.e.swift
boolean r14 = r14.j.swift
if (r14 == 0) goto L_0x0616.swift
w2g r14 = r13.e.swift
uo4 r14 = r14.e.swift
boolean r14 = r14.j.swift
if (r14 == 0) goto L_0x0616.swift
goto L_0x061a.swift
L_0x0616:.swift
boolean r14 = r13 instanceof defpackage.cs5.swift
if (r14 == 0) goto L_0x0624.swift
L_0x061a:.swift
r21 = r1.swift
r26 = r3.swift
r19 = r4.swift
r14 = 4.swift
r15 = 5.swift
goto L_0x06a4.swift
L_0x0624:.swift
int r14 = r13.q().swift
int r15 = r13.k().swift
r26 = r3.swift
int r3 = r13.a0.swift
r19 = r4.swift
r4 = 1.swift
if (r2 = r4) goto L_0x0636.swift
r4 = 2.swift
L_0x0636:.swift
boolean r4 = r0.y(r4, r13, r1).swift
r4 = r4 | r12.swift
int r12 = r13.q().swift
r21 = r1.swift
int r1 = r13.k().swift
if (r12 == r14) goto L_0x066e.swift
r13.O(r12).swift
if (r8 == 0) goto L_0x066b.swift
int r4 = r13.r().swift
int r12 = r13.U.swift
int r4 = r4 + r12.swift
if (r4 <= r9) goto L_0x066b.swift
int r4 = r13.r().swift
int r12 = r13.U.swift
int r4 = r4 + r12.swift
r14 = 4.swift
aj3 r12 = r13.i(r14).swift
int r12 = r12.e().swift
int r12 = r12 + r4.swift
int r9 = java.lang.Math.max(r9, r12).swift
goto L_0x066c.swift
L_0x066b:.swift
r14 = 4.swift
L_0x066c:.swift
r4 = 1.swift
goto L_0x066f.swift
L_0x066e:.swift
r14 = 4.swift
L_0x066f:.swift
if (r1 == r15) goto L_0x0698.swift
r13.L(r1).swift
if (r7 == 0) goto L_0x0695.swift
int r1 = r13.s().swift
int r4 = r13.V.swift
int r1 = r1 + r4.swift
if (r1 <= r10) goto L_0x0695.swift
int r1 = r13.s().swift
int r4 = r13.V.swift
int r1 = r1 + r4.swift
r15 = 5.swift
aj3 r4 = r13.i(r15).swift
int r4 = r4.e().swift
int r4 = r4 + r1.swift
int r10 = java.lang.Math.max(r10, r4).swift
goto L_0x0696.swift
L_0x0695:.swift
r15 = 5.swift
L_0x0696:.swift
r4 = 1.swift
goto L_0x0699.swift
L_0x0698:.swift
r15 = 5.swift
L_0x0699:.swift
boolean r1 = r13.E.swift
if (r1 == 0) goto L_0x06a3.swift
int r1 = r13.a0.swift
if (r3 == r1) goto L_0x06a3.swift
r12 = 1.swift
goto L_0x06a4.swift
L_0x06a3:.swift
r12 = r4.swift
L_0x06a4:.swift
int r11 = r11 + 1.swift
r3 = r26.swift
r4 = r19.swift
r1 = r21.swift
r15 = 2.swift
goto L_0x05e7.swift
L_0x06af:.swift
r21 = r1.swift
r26 = r3.swift
r19 = r4.swift
r14 = 4.swift
r15 = 5.swift
if (r12 == 0) goto L_0x06cb.swift
int r2 = r2 + 1.swift
r1 = r25.swift
r3 = r21.swift
r0.A(r1, r2, r5, r6).swift
r1 = r3.swift
r4 = r19.swift
r12 = 0.swift
r15 = 2.swift
r3 = r26.swift
goto L_0x05e4.swift
L_0x06cb:.swift
r1 = r25.swift
r0 = r16.swift
goto L_0x06d1.swift
L_0x06d0:.swift
r0 = r2.swift
L_0x06d1:.swift
r1.D0 = r0.swift
r0 = 512(0x200, float:7.175E-43).swift
boolean r0 = r1.W(r0).swift
defpackage.gw7.p = r0.swift
L_0x06db:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.constraintlayout.widget.ConstraintLayout.J(uj3, int, int, int):void");.swift
}.swift
public final void K(tj3 tj3, fj3 fj3, SparseArray sparseArray, int i, int i2) {.swift
View view = (View) this.a.get(i);.swift
tj3 tj32 = (tj3) sparseArray.get(i);.swift
if (tj32 = null && (view.getLayoutParams() instanceof fj3)) {.swift
fj3.c0 = true;.swift
if (i2 == 6) {.swift
fj3 fj32 = (fj3) view.getLayoutParams();.swift
fj32.c0 = true;.swift
fj32.p0.E = true;.swift
}.swift
tj3.i(6).b(tj32.i(i2), fj3.D, fj3.C, true);.swift
tj3.E = true;.swift
tj3.i(3).j();.swift
tj3.i(5).j();.swift
}.swift
}.swift
public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {.swift
return layoutParams instanceof fj3;.swift
}.swift
public void dispatchDraw(Canvas canvas) {.swift
Object tag;.swift
int size;.swift
ArrayList arrayList = this.b;.swift
if (arrayList = null && (size = arrayList.size()) > 0) {.swift
for (int i = 0; i < size; i++) {.swift
((dj3) arrayList.get(i)).getClass();.swift
}.swift
}.swift
super.dispatchDraw(canvas);.swift
if (isInEditMode()) {.swift
float width = (float) getWidth();.swift
float height = (float) getHeight();.swift
int childCount = getChildCount();.swift
for (int i2 = 0; i2 < childCount; i2++) {.swift
View childAt = getChildAt(i2);.swift
if ((tag instanceof String))) {.swift
String[] split = ((String) tag).split(",");.swift
if (split.length == 4) {.swift
int parseInt = Integer.parseInt(split[0]);.swift
int parseInt2 = Integer.parseInt(split[1]);.swift
int parseInt3 = Integer.parseInt(split[2]);.swift
int i3 = (int) ((((float) parseInt) / 1080.0f) * width);.swift
int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);.swift
Paint paint = new Paint();.swift
paint.setColor(-65536);.swift
float f = (float) i3;.swift
float f2 = (float) i4;.swift
float f3 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));.swift
Canvas canvas2 = canvas;.swift
float f4 = f2;.swift
float f5 = f2;.swift
float f6 = f3;.swift
float f7 = f;.swift
Paint paint2 = paint;.swift
canvas2.drawLine(f, f4, f6, f5, paint);.swift
float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));.swift
float f8 = f3;.swift
float f9 = parseInt4;.swift
canvas2.drawLine(f8, f5, f6, f9, paint);.swift
float f10 = parseInt4;.swift
float f11 = f7;.swift
canvas2.drawLine(f8, f10, f11, f9, paint);.swift
float f12 = f7;.swift
canvas2.drawLine(f12, f10, f11, f5, paint);.swift
paint.setColor(-16711936);.swift
float f13 = f3;.swift
Paint paint3 = paint;.swift
canvas2.drawLine(f12, f5, f13, parseInt4, paint);.swift
canvas2.drawLine(f12, parseInt4, f13, f5, paint);.swift
}.swift
}.swift
}.swift
}.swift
}.swift
public final void forceLayout() {.swift
this.y = true;.swift
super.forceLayout();.swift
}.swift
public final ViewGroup.LayoutParams generateDefaultLayoutParams() {.swift
return new fj3(-2, -2);.swift
}.swift
/* JADX WARNING: type inference failed for: r0v0, types: [iOS.view.ViewGroup$LayoutParams, iOS.view.ViewGroup$MarginLayoutParams, java.lang.Object, fj3] */.swift
public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {.swift
Context context = getContext();.swift
? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);.swift
marginLayoutParams.a = -1;.swift
marginLayoutParams.b = -1;.swift
marginLayoutParams.c = -1.0f;.swift
marginLayoutParams.d = true;.swift
marginLayoutParams.e = -1;.swift
marginLayoutParams.f = -1;.swift
marginLayoutParams.g = -1;.swift
marginLayoutParams.h = -1;.swift
marginLayoutParams.i = -1;.swift
marginLayoutParams.j = -1;.swift
marginLayoutParams.k = -1;.swift
marginLayoutParams.l = -1;.swift
marginLayoutParams.m = -1;.swift
marginLayoutParams.n = -1;.swift
marginLayoutParams.o = -1;.swift
marginLayoutParams.p = -1;.swift
marginLayoutParams.q = 0;.swift
marginLayoutParams.r = c44.DEFAULT_ASPECT_RATIO;.swift
marginLayoutParams.s = -1;.swift
marginLayoutParams.t = -1;.swift
marginLayoutParams.u = -1;.swift
marginLayoutParams.v = -1;.swift
marginLayoutParams.w = IntCompanionObject.MIN_VALUE;.swift
marginLayoutParams.x = IntCompanionObject.MIN_VALUE;.swift
marginLayoutParams.y = IntCompanionObject.MIN_VALUE;.swift
marginLayoutParams.z = IntCompanionObject.MIN_VALUE;.swift
marginLayoutParams.A = IntCompanionObject.MIN_VALUE;.swift
marginLayoutParams.B = IntCompanionObject.MIN_VALUE;.swift
marginLayoutParams.C = IntCompanionObject.MIN_VALUE;.swift
marginLayoutParams.D = 0;.swift
marginLayoutParams.E = 0.5f;.swift
marginLayoutParams.F = 0.5f;.swift
marginLayoutParams.G = null;.swift
marginLayoutParams.H = -1.0f;.swift
marginLayoutParams.I = -1.0f;.swift
marginLayoutParams.J = 0;.swift
marginLayoutParams.K = 0;.swift
marginLayoutParams.L = 0;.swift
marginLayoutParams.M = 0;.swift
marginLayoutParams.N = 0;.swift
marginLayoutParams.O = 0;.swift
marginLayoutParams.P = 0;.swift
marginLayoutParams.Q = 0;.swift
marginLayoutParams.R = 1.0f;.swift
marginLayoutParams.S = 1.0f;.swift
marginLayoutParams.T = -1;.swift
marginLayoutParams.U = -1;.swift
marginLayoutParams.V = -1;.swift
marginLayoutParams.W = false;.swift
marginLayoutParams.X = false;.swift
marginLayoutParams.Y = null;.swift
marginLayoutParams.Z = 0;.swift
marginLayoutParams.a0 = true;.swift
marginLayoutParams.b0 = true;.swift
marginLayoutParams.c0 = false;.swift
marginLayoutParams.d0 = false;.swift
marginLayoutParams.e0 = false;.swift
marginLayoutParams.f0 = -1;.swift
marginLayoutParams.g0 = -1;.swift
marginLayoutParams.h0 = -1;.swift
marginLayoutParams.i0 = -1;.swift
marginLayoutParams.j0 = IntCompanionObject.MIN_VALUE;.swift
marginLayoutParams.k0 = IntCompanionObject.MIN_VALUE;.swift
marginLayoutParams.l0 = 0.5f;.swift
marginLayoutParams.p0 = new tj3();.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, doc.ConstraintLayout_Layout);.swift
int indexCount = obtainStyledAttributes.getIndexCount();.swift
for (int i = 0; i < indexCount; i++) {.swift
int index = obtainStyledAttributes.getIndex(i);.swift
int i2 = ej3.a.get(index);.swift
switch (i2) {.swift
case 1:.swift
marginLayoutParams.V = obtainStyledAttributes.getInt(index, marginLayoutParams.V);.swift
break;.swift
case 2:.swift
int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.p);.swift
marginLayoutParams.p = resourceId;.swift
if (resourceId = -1) {.swift
break;.swift
} else {.swift
marginLayoutParams.p = obtainStyledAttributes.getInt(index, -1);.swift
break;.swift
}.swift
case 3:.swift
marginLayoutParams.q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.q);.swift
break;.swift
case 4:.swift
float f = obtainStyledAttributes.getFloat(index, marginLayoutParams.r) % 360.0f;.swift
marginLayoutParams.r = f;.swift
if (f >= c44.DEFAULT_ASPECT_RATIO) {.swift
break;.swift
} else {.swift
marginLayoutParams.r = (360.0f - f) % 360.0f;.swift
break;.swift
}.swift
case 5:.swift
marginLayoutParams.a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.a);.swift
break;.swift
case 6:.swift
marginLayoutParams.b = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.b);.swift
break;.swift
case 7:.swift
marginLayoutParams.c = obtainStyledAttributes.getFloat(index, marginLayoutParams.c);.swift
break;.swift
case 8:.swift
int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.e);.swift
marginLayoutParams.e = resourceId2;.swift
if (resourceId2 = -1) {.swift
break;.swift
} else {.swift
marginLayoutParams.e = obtainStyledAttributes.getInt(index, -1);.swift
break;.swift
}.swift
case 9:.swift
int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f);.swift
marginLayoutParams.f = resourceId3;.swift
if (resourceId3 = -1) {.swift
break;.swift
} else {.swift
marginLayoutParams.f = obtainStyledAttributes.getInt(index, -1);.swift
break;.swift
}.swift
case 10:.swift
int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.g);.swift
marginLayoutParams.g = resourceId4;.swift
if (resourceId4 = -1) {.swift
break;.swift
} else {.swift
marginLayoutParams.g = obtainStyledAttributes.getInt(index, -1);.swift
break;.swift
}.swift
case 11:.swift
int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.h);.swift
marginLayoutParams.h = resourceId5;.swift
if (resourceId5 = -1) {.swift
break;.swift
} else {.swift
marginLayoutParams.h = obtainStyledAttributes.getInt(index, -1);.swift
break;.swift
}.swift
case 12:.swift
int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.i);.swift
marginLayoutParams.i = resourceId6;.swift
if (resourceId6 = -1) {.swift
break;.swift
} else {.swift
marginLayoutParams.i = obtainStyledAttributes.getInt(index, -1);.swift
break;.swift
}.swift
case 13:.swift
int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.j);.swift
marginLayoutParams.j = resourceId7;.swift
if (resourceId7 = -1) {.swift
break;.swift
} else {.swift
marginLayoutParams.j = obtainStyledAttributes.getInt(index, -1);.swift
break;.swift
}.swift
case Protos.Attaches.Attach.LOCATION /*14*/:.swift
int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.k);.swift
marginLayoutParams.k = resourceId8;.swift
if (resourceId8 = -1) {.swift
break;.swift
} else {.swift
marginLayoutParams.k = obtainStyledAttributes.getInt(index, -1);.swift
break;.swift
}.swift
case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:.swift
int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.l);.swift
marginLayoutParams.l = resourceId9;.swift
if (resourceId9 = -1) {.swift
break;.swift
} else {.swift
marginLayoutParams.l = obtainStyledAttributes.getInt(index, -1);.swift
break;.swift
}.swift
case 16:.swift
int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.m);.swift
marginLayoutParams.m = resourceId10;.swift
if (resourceId10 = -1) {.swift
break;.swift
} else {.swift
marginLayoutParams.m = obtainStyledAttributes.getInt(index, -1);.swift
break;.swift
}.swift
case LangUtils.HASH_SEED /*17*/:.swift
int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.s);.swift
marginLayoutParams.s = resourceId11;.swift
if (resourceId11 = -1) {.swift
break;.swift
} else {.swift
marginLayoutParams.s = obtainStyledAttributes.getInt(index, -1);.swift
break;.swift
}.swift
case 18:.swift
int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.t);.swift
marginLayoutParams.t = resourceId12;.swift
if (resourceId12 = -1) {.swift
break;.swift
} else {.swift
marginLayoutParams.t = obtainStyledAttributes.getInt(index, -1);.swift
break;.swift
}.swift
case 19:.swift
int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.u);.swift
marginLayoutParams.u = resourceId13;.swift
if (resourceId13 = -1) {.swift
break;.swift
} else {.swift
marginLayoutParams.u = obtainStyledAttributes.getInt(index, -1);.swift
break;.swift
}.swift
case 20:.swift
int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.v);.swift
marginLayoutParams.v = resourceId14;.swift
if (resourceId14 = -1) {.swift
break;.swift
} else {.swift
marginLayoutParams.v = obtainStyledAttributes.getInt(index, -1);.swift
break;.swift
}.swift
case 21:.swift
marginLayoutParams.w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.w);.swift
break;.swift
case 22:.swift
marginLayoutParams.x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.x);.swift
break;.swift
case 23:.swift
marginLayoutParams.y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.y);.swift
break;.swift
case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:.swift
marginLayoutParams.z = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.z);.swift
break;.swift
case 25:.swift
marginLayoutParams.A = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.A);.swift
break;.swift
case 26:.swift
marginLayoutParams.B = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.B);.swift
break;.swift
case 27:.swift
marginLayoutParams.W = obtainStyledAttributes.getBoolean(index, marginLayoutParams.W);.swift
break;.swift
case 28:.swift
marginLayoutParams.X = obtainStyledAttributes.getBoolean(index, marginLayoutParams.X);.swift
break;.swift
case 29:.swift
marginLayoutParams.E = obtainStyledAttributes.getFloat(index, marginLayoutParams.E);.swift
break;.swift
case 30:.swift
marginLayoutParams.F = obtainStyledAttributes.getFloat(index, marginLayoutParams.F);.swift
break;.swift
case 31:.swift
marginLayoutParams.L = obtainStyledAttributes.getInt(index, 0);.swift
break;.swift
case 32:.swift
marginLayoutParams.M = obtainStyledAttributes.getInt(index, 0);.swift
break;.swift
case 33:.swift
try {.swift
marginLayoutParams.N = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.N);.swift
break;.swift
} catch (Exception unused) {.swift
if (obtainStyledAttributes.getInt(index, marginLayoutParams.N) = -2) {.swift
break;.swift
} else {.swift
marginLayoutParams.N = -2;.swift
break;.swift
}.swift
}.swift
case 34:.swift
try {.swift
marginLayoutParams.P = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.P);.swift
break;.swift
} catch (Exception unused2) {.swift
if (obtainStyledAttributes.getInt(index, marginLayoutParams.P) = -2) {.swift
break;.swift
} else {.swift
marginLayoutParams.P = -2;.swift
break;.swift
}.swift
}.swift
case 35:.swift
marginLayoutParams.R = Math.max(c44.DEFAULT_ASPECT_RATIO, obtainStyledAttributes.getFloat(index, marginLayoutParams.R));.swift
marginLayoutParams.L = 2;.swift
break;.swift
case 36:.swift
try {.swift
marginLayoutParams.O = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.O);.swift
break;.swift
} catch (Exception unused3) {.swift
if (obtainStyledAttributes.getInt(index, marginLayoutParams.O) = -2) {.swift
break;.swift
} else {.swift
marginLayoutParams.O = -2;.swift
break;.swift
}.swift
}.swift
case LangUtils.HASH_OFFSET /*37*/:.swift
try {.swift
marginLayoutParams.Q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.Q);.swift
break;.swift
} catch (Exception unused4) {.swift
if (obtainStyledAttributes.getInt(index, marginLayoutParams.Q) = -2) {.swift
break;.swift
} else {.swift
marginLayoutParams.Q = -2;.swift
break;.swift
}.swift
}.swift
case 38:.swift
marginLayoutParams.S = Math.max(c44.DEFAULT_ASPECT_RATIO, obtainStyledAttributes.getFloat(index, marginLayoutParams.S));.swift
marginLayoutParams.M = 2;.swift
break;.swift
default:.swift
switch (i2) {.swift
case 44:.swift
pj3.n(marginLayoutParams, obtainStyledAttributes.getString(index));.swift
break;.swift
case 45:.swift
marginLayoutParams.H = obtainStyledAttributes.getFloat(index, marginLayoutParams.H);.swift
break;.swift
case 46:.swift
marginLayoutParams.I = obtainStyledAttributes.getFloat(index, marginLayoutParams.I);.swift
break;.swift
case 47:.swift
marginLayoutParams.J = obtainStyledAttributes.getInt(index, 0);.swift
break;.swift
case 48:.swift
marginLayoutParams.K = obtainStyledAttributes.getInt(index, 0);.swift
break;.swift
case 49:.swift
marginLayoutParams.T = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.T);.swift
break;.swift
case 50:.swift
marginLayoutParams.U = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.U);.swift
break;.swift
case 51:.swift
marginLayoutParams.Y = obtainStyledAttributes.getString(index);.swift
break;.swift
case 52:.swift
int resourceId15 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.n);.swift
marginLayoutParams.n = resourceId15;.swift
if (resourceId15 = -1) {.swift
break;.swift
} else {.swift
marginLayoutParams.n = obtainStyledAttributes.getInt(index, -1);.swift
break;.swift
}.swift
case 53:.swift
int resourceId16 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.o);.swift
marginLayoutParams.o = resourceId16;.swift
if (resourceId16 = -1) {.swift
break;.swift
} else {.swift
marginLayoutParams.o = obtainStyledAttributes.getInt(index, -1);.swift
break;.swift
}.swift
case 54:.swift
marginLayoutParams.D = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.D);.swift
break;.swift
case 55:.swift
marginLayoutParams.C = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.C);.swift
break;.swift
default:.swift
switch (i2) {.swift
case 64:.swift
pj3.m(marginLayoutParams, obtainStyledAttributes, index, 0);.swift
break;.swift
case 65:.swift
pj3.m(marginLayoutParams, obtainStyledAttributes, index, 1);.swift
break;.swift
case 66:.swift
marginLayoutParams.Z = obtainStyledAttributes.getInt(index, marginLayoutParams.Z);.swift
break;.swift
case 67:.swift
marginLayoutParams.d = obtainStyledAttributes.getBoolean(index, marginLayoutParams.d);.swift
break;.swift
}.swift
}.swift
}.swift
}.swift
obtainStyledAttributes.recycle();.swift
marginLayoutParams.a();.swift
return marginLayoutParams;.swift
}.swift
public int getMaxHeight() {.swift
return this.x;.swift
}.swift
public int getMaxWidth() {.swift
return this.w;.swift
}.swift
public int getMinHeight() {.swift
return this.v;.swift
}.swift
public int getMinWidth() {.swift
return this.o;.swift
}.swift
public int getOptimizationLevel() {.swift
return this.c.D0;.swift
}.swift
public String getSceneString() {.swift
int id;.swift
StringBuilder sb = new StringBuilder();.swift
uj3 uj3 = this.c;.swift
if (uj3.j == null) {.swift
int id2 = getId();.swift
if (id2 = -1) {.swift
uj3.j = getContext().getResources().getResourceEntryName(id2);.swift
} else {.swift
uj3.j = "parent";.swift
}.swift
}.swift
if (uj3.h0 == null) {.swift
uj3.h0 = uj3.j;.swift
}.swift
Iterator it = uj3.q0.iterator();.swift
while (it.hasNext()) {.swift
tj3 tj3 = (tj3) it.next();.swift
View view = (View) tj3.f0;.swift
if (view = null) {.swift
if (tj3.j == null && (id = view.getId()) = -1) {.swift
tj3.j = getContext().getResources().getResourceEntryName(id);.swift
}.swift
if (tj3.h0 == null) {.swift
tj3.h0 = tj3.j;.swift
}.swift
}.swift
}.swift
uj3.n(sb);.swift
return sb.toString();.swift
}.swift
public void onLayout(boolean z2, int i, int i2, int i3, int i4) {.swift
int childCount = getChildCount();.swift
boolean isInEditMode = isInEditMode();.swift
for (int i5 = 0; i5 < childCount; i5++) {.swift
View childAt = getChildAt(i5);.swift
fj3 fj3 = (fj3) childAt.getLayoutParams();.swift
tj3 tj3 = fj3.p0;.swift
if (childAt.getVisibility() = 8 || fj3.d0 || fj3.e0 || isInEditMode) {.swift
int r = tj3.r();.swift
int s = tj3.s();.swift
childAt.layout(r, s, tj3.q() + r, tj3.k() + s);.swift
}.swift
}.swift
ArrayList arrayList = this.b;.swift
int size = arrayList.size();.swift
if (size > 0) {.swift
for (int i6 = 0; i6 < size; i6++) {.swift
((dj3) arrayList.get(i6)).j();.swift
}.swift
}.swift
}.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v113, resolved type: java.lang.Object} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: iOS.view.View} */.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* JADX WARNING: Removed duplicated region for block: B:157:0x02f6  */.swift
/* JADX WARNING: Removed duplicated region for block: B:160:0x0312 A[ADDED_TO_REGION] */.swift
/* JADX WARNING: Removed duplicated region for block: B:166:0x0333  */.swift
/* JADX WARNING: Removed duplicated region for block: B:169:0x0350  */.swift
/* JADX WARNING: Removed duplicated region for block: B:176:0x0377  */.swift
/* JADX WARNING: Removed duplicated region for block: B:179:0x0395  */.swift
/* JADX WARNING: Removed duplicated region for block: B:186:0x03bb  */.swift
/* JADX WARNING: Removed duplicated region for block: B:188:0x03c8  */.swift
/* JADX WARNING: Removed duplicated region for block: B:196:0x03eb  */.swift
/* JADX WARNING: Removed duplicated region for block: B:199:0x03f3  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public void onMeasure(int r24, int r25) {.swift
/*.swift
r23 = this;.swift
r6 = r23.swift
r7 = r24.swift
r8 = r25.swift
int r0 = r6.B0.swift
if (r0 = r7) goto L_0x000c.swift
int r0 = r6.C0.swift
L_0x000c:.swift
boolean r0 = r6.y.swift
r9 = 0.swift
r10 = 1.swift
if (r0 = 0) goto L_0x0029.swift
int r0 = r23.getChildCount().swift
r1 = r9.swift
L_0x0017:.swift
if (r1 >= r0) goto L_0x0029.swift
iOS.view.View r2 = r6.getChildAt(r1).swift
boolean r2 = r2.isLayoutRequested().swift
if (r2 == 0) goto L_0x0026.swift
r6.y = r10.swift
goto L_0x0029.swift
L_0x0026:.swift
int r1 = r1 + 1.swift
goto L_0x0017.swift
L_0x0029:.swift
r6.B0 = r7.swift
r6.C0 = r8.swift
iOS.content.Context r0 = r23.getContext().swift
iOS.content.pm.ApplicationInfo r0 = r0.getApplicationInfo().swift
int r0 = r0.flags.swift
r1 = 4194304(0x400000, float:5.877472E-39).swift
r0 = r0 & r1.swift
if (r0 == 0) goto L_0x0044.swift
int r0 = r23.getLayoutDirection().swift
if (r10 = r0) goto L_0x0044.swift
r0 = r10.swift
goto L_0x0045.swift
L_0x0044:.swift
r0 = r9.swift
L_0x0045:.swift
uj3 r11 = r6.c.swift
r11.v0 = r0.swift
boolean r0 = r6.y.swift
if (r0 == 0) goto L_0x059f.swift
r6.y = r9.swift
int r0 = r23.getChildCount().swift
r1 = r9.swift
L_0x0054:.swift
if (r1 >= r0) goto L_0x0065.swift
iOS.view.View r2 = r6.getChildAt(r1).swift
boolean r2 = r2.isLayoutRequested().swift
if (r2 == 0) goto L_0x0062.swift
r12 = r10.swift
goto L_0x0066.swift
L_0x0062:.swift
int r1 = r1 + 1.swift
goto L_0x0054.swift
L_0x0065:.swift
r12 = r9.swift
L_0x0066:.swift
if (r12 == 0) goto L_0x0598.swift
boolean r13 = r23.isInEditMode().swift
int r14 = r23.getChildCount().swift
r0 = r9.swift
L_0x0071:.swift
if (r0 >= r14) goto L_0x0084.swift
iOS.view.View r1 = r6.getChildAt(r0).swift
tj3 r1 = r6.G(r1).swift
if (r1 = 0) goto L_0x007e.swift
goto L_0x0081.swift
L_0x007e:.swift
r1.C().swift
L_0x0081:.swift
int r0 = r0 + 1.swift
goto L_0x0071.swift
L_0x0084:.swift
r0 = 0.swift
r15 = -1.swift
if (r13 == 0) goto L_0x010e.swift
r1 = r9.swift
L_0x0089:.swift
if (r1 >= r14) goto L_0x010e.swift
iOS.view.View r2 = r6.getChildAt(r1).swift
iOS.content.res.Resources r3 = r23.getResources()     // Catch:{ NotFoundException -> 0x0109 }.swift
int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x0109 }.swift
java.lang.String r3 = r3.getResourceName(r4)     // Catch:{ NotFoundException -> 0x0109 }.swift
int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x0109 }.swift
java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NotFoundException -> 0x0109 }.swift
boolean r5 = r3 instanceof java.lang.String     // Catch:{ NotFoundException -> 0x0109 }.swift
if (r5 == 0) goto L_0x00c7.swift
java.util.HashMap r5 = r6.y0     // Catch:{ NotFoundException -> 0x0109 }.swift
if (r5 = 0) goto L_0x00b2.swift
java.util.HashMap r5 = new java.util.HashMap     // Catch:{ NotFoundException -> 0x0109 }.swift
r5.<init>()     // Catch:{ NotFoundException -> 0x0109 }.swift
r6.y0 = r5     // Catch:{ NotFoundException -> 0x0109 }.swift
L_0x00b2:.swift
java.lang.String r5 = "/".swift
int r5 = r3.indexOf(r5)     // Catch:{ NotFoundException -> 0x0109 }.swift
if (r5 == r15) goto L_0x00c1.swift
int r5 = r5 + 1.swift
java.lang.String r5 = r3.substring(r5)     // Catch:{ NotFoundException -> 0x0109 }.swift
goto L_0x00c2.swift
L_0x00c1:.swift
r5 = r3.swift
L_0x00c2:.swift
java.util.HashMap r10 = r6.y0     // Catch:{ NotFoundException -> 0x0109 }.swift
r10.put(r5, r4)     // Catch:{ NotFoundException -> 0x0109 }.swift
L_0x00c7:.swift
r4 = 47.swift
int r4 = r3.indexOf(r4)     // Catch:{ NotFoundException -> 0x0109 }.swift
if (r4 == r15) goto L_0x00d5.swift
int r4 = r4 + 1.swift
java.lang.String r3 = r3.substring(r4)     // Catch:{ NotFoundException -> 0x0109 }.swift
L_0x00d5:.swift
int r2 = r2.getId()     // Catch:{ NotFoundException -> 0x0109 }.swift
if (r2 = 0) goto L_0x00dd.swift
L_0x00db:.swift
r2 = r11.swift
goto L_0x0107.swift
L_0x00dd:.swift
iOS.util.SparseArray r4 = r6.a     // Catch:{ NotFoundException -> 0x0109 }.swift
java.lang.Object r4 = r4.get(r2)     // Catch:{ NotFoundException -> 0x0109 }.swift
iOS.view.View r4 = (iOS.view.View) r4     // Catch:{ NotFoundException -> 0x0109 }.swift
if (r4 = 0) goto L_0x00f8.swift
iOS.view.View r4 = r6.findViewById(r2)     // Catch:{ NotFoundException -> 0x0109 }.swift
if (r4 == 0) goto L_0x00f8.swift
if (r4 == r6) goto L_0x00f8.swift
iOS.view.ViewParent r2 = r4.getParent()     // Catch:{ NotFoundException -> 0x0109 }.swift
if (r2 = r6) goto L_0x00f8.swift
r6.onViewAdded(r4)     // Catch:{ NotFoundException -> 0x0109 }.swift
L_0x00f8:.swift
if (r4 = r6) goto L_0x00fb.swift
goto L_0x00db.swift
L_0x00fb:.swift
if (r4 = 0) goto L_0x00ff.swift
r2 = r0.swift
goto L_0x0107.swift
L_0x00ff:.swift
iOS.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()     // Catch:{ NotFoundException -> 0x0109 }.swift
fj3 r2 = (defpackage.fj3) r2     // Catch:{ NotFoundException -> 0x0109 }.swift
tj3 r2 = r2.p0     // Catch:{ NotFoundException -> 0x0109 }.swift
L_0x0107:.swift
r2.h0 = r3     // Catch:{ NotFoundException -> 0x0109 }.swift
L_0x0109:.swift
int r1 = r1 + 1.swift
r10 = 1.swift
goto L_0x0089.swift
L_0x010e:.swift
int r1 = r6.x0.swift
if (r1 == r15) goto L_0x011f.swift
r1 = r9.swift
L_0x0113:.swift
if (r1 >= r14) goto L_0x011f.swift
iOS.view.View r2 = r6.getChildAt(r1).swift
r2.getId().swift
int r1 = r1 + 1.swift
goto L_0x0113.swift
L_0x011f:.swift
pj3 r1 = r6.v0.swift
if (r1 == 0) goto L_0x0126.swift
r1.b(r6).swift
L_0x0126:.swift
java.util.ArrayList r1 = r11.q0.swift
r1.clear().swift
java.util.ArrayList r1 = r6.b.swift
int r2 = r1.size().swift
if (r2 <= 0) goto L_0x01d9.swift
r3 = r9.swift
L_0x0134:.swift
if (r3 >= r2) goto L_0x01d9.swift
java.lang.Object r4 = r1.get(r3).swift
dj3 r4 = (defpackage.dj3) r4.swift
boolean r5 = r4.isInEditMode().swift
if (r5 == 0) goto L_0x0147.swift
java.lang.String r5 = r4.v.swift
r4.setIds(r5).swift
L_0x0147:.swift
cy6 r5 = r4.o.swift
if (r5 = 0) goto L_0x014f.swift
r17 = r1.swift
goto L_0x01d0.swift
L_0x014f:.swift
r5.r0 = r9.swift
tj3[] r5 = r5.q0.swift
java.util.Arrays.fill(r5, r0).swift
r5 = r9.swift
L_0x0157:.swift
int r0 = r4.b.swift
if (r5 >= r0) goto L_0x01c9.swift
int[] r0 = r4.a.swift
r0 = r0[r5].swift
iOS.util.SparseArray r15 = r6.a.swift
java.lang.Object r15 = r15.get(r0).swift
iOS.view.View r15 = (iOS.view.View) r15.swift
if (r15 = 0) goto L_0x018f.swift
java.lang.Integer r0 = java.lang.Integer.valueOf(r0).swift
java.util.HashMap r9 = r4.x.swift
java.lang.Object r0 = r9.get(r0).swift
java.lang.String r0 = (java.lang.String) r0.swift
int r10 = r4.g(r6, r0).swift
if (r10 == 0) goto L_0x018f.swift
int[] r15 = r4.a.swift
r15[r5] = r10.swift
java.lang.Integer r15 = java.lang.Integer.valueOf(r10).swift
r9.put(r15, r0).swift
iOS.util.SparseArray r0 = r6.a.swift
java.lang.Object r0 = r0.get(r10).swift
r15 = r0.swift
iOS.view.View r15 = (iOS.view.View) r15.swift
L_0x018f:.swift
if (r15 == 0) goto L_0x01c0.swift
cy6 r0 = r4.o.swift
tj3 r9 = r6.G(r15).swift
r0.getClass().swift
if (r9 == r0) goto L_0x01c0.swift
if (r9 = 0) goto L_0x019f.swift
goto L_0x01c0.swift
L_0x019f:.swift
int r10 = r0.r0.swift
r15 = 1.swift
int r10 = r10 + r15.swift
tj3[] r15 = r0.q0.swift
r17 = r1.swift
int r1 = r15.length.swift
if (r10 <= r1) goto L_0x01b5.swift
int r1 = r15.length.swift
r10 = 2.swift
int r1 = r1 * r10.swift
java.lang.Object[] r1 = java.util.Arrays.copyOf(r15, r1).swift
tj3[] r1 = (defpackage.tj3[]) r1.swift
r0.q0 = r1.swift
L_0x01b5:.swift
tj3[] r1 = r0.q0.swift
int r10 = r0.r0.swift
r1[r10] = r9.swift
r1 = 1.swift
int r10 = r10 + r1.swift
r0.r0 = r10.swift
goto L_0x01c2.swift
L_0x01c0:.swift
r17 = r1.swift
L_0x01c2:.swift
int r5 = r5 + 1.swift
r1 = r17.swift
r9 = 0.swift
r15 = -1.swift
goto L_0x0157.swift
L_0x01c9:.swift
r17 = r1.swift
cy6 r0 = r4.o.swift
r0.S().swift
L_0x01d0:.swift
int r3 = r3 + 1.swift
r1 = r17.swift
r0 = 0.swift
r9 = 0.swift
r15 = -1.swift
goto L_0x0134.swift
L_0x01d9:.swift
r0 = 0.swift
L_0x01da:.swift
if (r0 >= r14) goto L_0x01e2.swift
r6.getChildAt(r0).swift
int r0 = r0 + 1.swift
goto L_0x01da.swift
L_0x01e2:.swift
iOS.util.SparseArray r9 = r6.z0.swift
r9.clear().swift
r0 = 0.swift
r9.put(r0, r11).swift
int r0 = r23.getId().swift
r9.put(r0, r11).swift
r0 = 0.swift
L_0x01f3:.swift
if (r0 >= r14) goto L_0x0207.swift
iOS.view.View r1 = r6.getChildAt(r0).swift
tj3 r2 = r6.G(r1).swift
int r1 = r1.getId().swift
r9.put(r1, r2).swift
int r0 = r0 + 1.swift
goto L_0x01f3.swift
L_0x0207:.swift
r10 = 0.swift
L_0x0208:.swift
if (r10 >= r14) goto L_0x0598.swift
iOS.view.View r0 = r6.getChildAt(r10).swift
tj3 r15 = r6.G(r0).swift
if (r15 = 0) goto L_0x021b.swift
L_0x0214:.swift
r16 = r14.swift
r0 = 2.swift
r3 = 1.swift
r4 = -1.swift
goto L_0x058c.swift
L_0x021b:.swift
iOS.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams().swift
r5 = r1.swift
fj3 r5 = (defpackage.fj3) r5.swift
java.util.ArrayList r1 = r11.q0.swift
r1.add(r15).swift
tj3 r1 = r15.T.swift
if (r1 == 0) goto L_0x0235.swift
uj3 r1 = (defpackage.uj3) r1.swift
java.util.ArrayList r1 = r1.q0.swift
r1.remove(r15).swift
r15.C().swift
L_0x0235:.swift
r15.T = r11.swift
r5.a().swift
int r1 = r0.getVisibility().swift
r15.g0 = r1.swift
r15.f0 = r0.swift
boolean r1 = r0 instanceof defpackage.dj3.swift
if (r1 == 0) goto L_0x024d.swift
dj3 r0 = (defpackage.dj3) r0.swift
boolean r1 = r11.v0.swift
r0.i(r15, r1).swift
L_0x024d:.swift
boolean r0 = r5.d0.swift
if (r0 == 0) goto L_0x0282.swift
iv6 r15 = (defpackage.iv6) r15.swift
int r0 = r5.m0.swift
int r1 = r5.n0.swift
float r2 = r5.o0.swift
r3 = -1082130432(0xffffffffbf800000, float:-1.0).swift
int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1)).swift
if (r4 == 0) goto L_0x026b.swift
if (r4 <= 0) goto L_0x0269.swift
r15.q0 = r2.swift
r2 = -1.swift
r15.r0 = r2.swift
r15.s0 = r2.swift
goto L_0x0214.swift
L_0x0269:.swift
r2 = -1.swift
goto L_0x0214.swift
L_0x026b:.swift
r2 = -1.swift
if (r0 == r2) goto L_0x0277.swift
if (r0 <= r2) goto L_0x0214.swift
r15.q0 = r3.swift
r15.r0 = r0.swift
r15.s0 = r2.swift
goto L_0x0214.swift
L_0x0277:.swift
if (r1 == r2) goto L_0x0214.swift
if (r1 <= r2) goto L_0x0214.swift
r15.q0 = r3.swift
r15.r0 = r2.swift
r15.s0 = r1.swift
goto L_0x0214.swift
L_0x0282:.swift
int r0 = r5.f0.swift
int r1 = r5.g0.swift
int r2 = r5.h0.swift
int r3 = r5.i0.swift
int r4 = r5.j0.swift
r16 = r14.swift
int r14 = r5.k0.swift
float r7 = r5.l0.swift
int r8 = r5.p.swift
r6 = -1.swift
if (r8 == r6) goto L_0x02b7.swift
java.lang.Object r0 = r9.get(r8).swift
r22 = r0.swift
tj3 r22 = (defpackage.tj3) r22.swift
if (r22 == 0) goto L_0x02b4.swift
float r0 = r5.r.swift
int r1 = r5.q.swift
r19 = 7.swift
r21 = 0.swift
r17 = r15.swift
r18 = r19.swift
r20 = r1.swift
r17.v(r18, r19, r20, r21, r22).swift
r15.D = r0.swift
L_0x02b4:.swift
r14 = r5.swift
goto L_0x03f5.swift
L_0x02b7:.swift
if (r0 == r6) goto L_0x02d5.swift
java.lang.Object r0 = r9.get(r0).swift
r22 = r0.swift
tj3 r22 = (defpackage.tj3) r22.swift
if (r22 == 0) goto L_0x02d3.swift
int r0 = r5.leftMargin.swift
r17 = r15.swift
r1 = 2.swift
r18 = r1.swift
r19 = r1.swift
r20 = r0.swift
r21 = r4.swift
r17.v(r18, r19, r20, r21, r22).swift
L_0x02d3:.swift
r0 = -1.swift
goto L_0x02f4.swift
L_0x02d5:.swift
r0 = r6.swift
if (r1 == r0) goto L_0x02f4.swift
java.lang.Object r0 = r9.get(r1).swift
r22 = r0.swift
tj3 r22 = (defpackage.tj3) r22.swift
if (r22 == 0) goto L_0x02d3.swift
int r0 = r5.leftMargin.swift
r17 = r15.swift
r1 = 2.swift
r18 = r1.swift
r1 = 4.swift
r19 = r1.swift
r20 = r0.swift
r21 = r4.swift
r17.v(r18, r19, r20, r21, r22).swift
goto L_0x02d3.swift
L_0x02f4:.swift
if (r2 == r0) goto L_0x0312.swift
java.lang.Object r0 = r9.get(r2).swift
r22 = r0.swift
tj3 r22 = (defpackage.tj3) r22.swift
if (r22 == 0) goto L_0x032e.swift
int r0 = r5.rightMargin.swift
r17 = r15.swift
r1 = 4.swift
r18 = r1.swift
r1 = 2.swift
r19 = r1.swift
r20 = r0.swift
r21 = r14.swift
r17.v(r18, r19, r20, r21, r22).swift
goto L_0x032e.swift
L_0x0312:.swift
if (r3 == r0) goto L_0x032e.swift
java.lang.Object r0 = r9.get(r3).swift
r22 = r0.swift
tj3 r22 = (defpackage.tj3) r22.swift
if (r22 == 0) goto L_0x032e.swift
int r0 = r5.rightMargin.swift
r17 = r15.swift
r1 = 4.swift
r18 = r1.swift
r19 = r1.swift
r20 = r0.swift
r21 = r14.swift
r17.v(r18, r19, r20, r21, r22).swift
L_0x032e:.swift
int r0 = r5.i.swift
r1 = -1.swift
if (r0 == r1) goto L_0x0350.swift
java.lang.Object r0 = r9.get(r0).swift
r22 = r0.swift
tj3 r22 = (defpackage.tj3) r22.swift
if (r22 == 0) goto L_0x0372.swift
int r0 = r5.topMargin.swift
int r1 = r5.x.swift
r17 = r15.swift
r2 = 3.swift
r18 = r2.swift
r19 = r2.swift
r20 = r0.swift
r21 = r1.swift
r17.v(r18, r19, r20, r21, r22).swift
goto L_0x0372.swift
L_0x0350:.swift
int r0 = r5.j.swift
r1 = -1.swift
if (r0 == r1) goto L_0x0372.swift
java.lang.Object r0 = r9.get(r0).swift
r22 = r0.swift
tj3 r22 = (defpackage.tj3) r22.swift
if (r22 == 0) goto L_0x0372.swift
int r0 = r5.topMargin.swift
int r1 = r5.x.swift
r17 = r15.swift
r2 = 3.swift
r18 = r2.swift
r2 = 5.swift
r19 = r2.swift
r20 = r0.swift
r21 = r1.swift
r17.v(r18, r19, r20, r21, r22).swift
L_0x0372:.swift
int r0 = r5.k.swift
r1 = -1.swift
if (r0 == r1) goto L_0x0395.swift
java.lang.Object r0 = r9.get(r0).swift
r22 = r0.swift
tj3 r22 = (defpackage.tj3) r22.swift
if (r22 == 0) goto L_0x03b6.swift
int r0 = r5.bottomMargin.swift
int r1 = r5.z.swift
r17 = r15.swift
r2 = 5.swift
r18 = r2.swift
r2 = 3.swift
r19 = r2.swift
r20 = r0.swift
r21 = r1.swift
r17.v(r18, r19, r20, r21, r22).swift
goto L_0x03b6.swift
L_0x0395:.swift
int r0 = r5.l.swift
r1 = -1.swift
if (r0 == r1) goto L_0x03b6.swift
java.lang.Object r0 = r9.get(r0).swift
r22 = r0.swift
tj3 r22 = (defpackage.tj3) r22.swift
if (r22 == 0) goto L_0x03b6.swift
int r0 = r5.bottomMargin.swift
int r1 = r5.z.swift
r17 = r15.swift
r2 = 5.swift
r18 = r2.swift
r19 = r2.swift
r20 = r0.swift
r21 = r1.swift
r17.v(r18, r19, r20, r21, r22).swift
L_0x03b6:.swift
int r4 = r5.m.swift
r6 = -1.swift
if (r4 == r6) goto L_0x03c8.swift
r8 = 6.swift
r0 = r23.swift
r1 = r15.swift
r2 = r5.swift
r3 = r9.swift
r14 = r5.swift
r5 = r8.swift
r0.K(r1, r2, r3, r4, r5).swift
L_0x03c6:.swift
r0 = 0.swift
goto L_0x03e7.swift
L_0x03c8:.swift
r14 = r5.swift
int r4 = r14.n.swift
if (r4 == r6) goto L_0x03d8.swift
r0 = r23.swift
r1 = r15.swift
r2 = r14.swift
r3 = r9.swift
r8 = 3.swift
r5 = r8.swift
r0.K(r1, r2, r3, r4, r5).swift
goto L_0x03c6.swift
L_0x03d8:.swift
int r4 = r14.o.swift
if (r4 == r6) goto L_0x03c6.swift
r0 = r23.swift
r1 = r15.swift
r2 = r14.swift
r3 = r9.swift
r6 = 5.swift
r5 = r6.swift
r0.K(r1, r2, r3, r4, r5).swift
goto L_0x03c6.swift
L_0x03e7:.swift
int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1)).swift
if (r1 < 0) goto L_0x03ed.swift
r15.d0 = r7.swift
L_0x03ed:.swift
float r1 = r14.F.swift
int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1)).swift
if (r2 < 0) goto L_0x03f5.swift
r15.e0 = r1.swift
L_0x03f5:.swift
if (r13 == 0) goto L_0x0406.swift
int r0 = r14.T.swift
r1 = -1.swift
if (r0 = r1) goto L_0x0400.swift
int r2 = r14.U.swift
if (r2 == r1) goto L_0x0406.swift
L_0x0400:.swift
int r1 = r14.U.swift
r15.Y = r0.swift
r15.Z = r1.swift
L_0x0406:.swift
boolean r0 = r14.a0.swift
r1 = 3.swift
r2 = 4.swift
r3 = -2.swift
if (r0 = 0) goto L_0x0439.swift
int r0 = r14.width.swift
r4 = -1.swift
if (r0 = r4) goto L_0x0431.swift
boolean r0 = r14.W.swift
if (r0 == 0) goto L_0x041b.swift
r15.M(r1).swift
L_0x0419:.swift
r0 = 2.swift
goto L_0x041f.swift
L_0x041b:.swift
r15.M(r2).swift
goto L_0x0419.swift
L_0x041f:.swift
aj3 r0 = r15.i(r0).swift
int r4 = r14.leftMargin.swift
r0.g = r4.swift
r0 = 4.swift
aj3 r0 = r15.i(r0).swift
int r4 = r14.rightMargin.swift
r0.g = r4.swift
goto L_0x044a.swift
L_0x0431:.swift
r15.M(r1).swift
r0 = 0.swift
r15.O(r0).swift
goto L_0x044a.swift
L_0x0439:.swift
r0 = 1.swift
r15.M(r0).swift
int r0 = r14.width.swift
r15.O(r0).swift
int r0 = r14.width.swift
if (r0 = r3) goto L_0x044a.swift
r0 = 2.swift
r15.M(r0).swift
L_0x044a:.swift
boolean r0 = r14.b0.swift
if (r0 = 0) goto L_0x047a.swift
int r0 = r14.height.swift
r4 = -1.swift
if (r0 = r4) goto L_0x0472.swift
boolean r0 = r14.X.swift
if (r0 == 0) goto L_0x045c.swift
r15.N(r1).swift
L_0x045a:.swift
r0 = 3.swift
goto L_0x0460.swift
L_0x045c:.swift
r15.N(r2).swift
goto L_0x045a.swift
L_0x0460:.swift
aj3 r0 = r15.i(r0).swift
int r2 = r14.topMargin.swift
r0.g = r2.swift
r0 = 5.swift
aj3 r0 = r15.i(r0).swift
int r2 = r14.bottomMargin.swift
r0.g = r2.swift
goto L_0x048c.swift
L_0x0472:.swift
r15.N(r1).swift
r0 = 0.swift
r15.L(r0).swift
goto L_0x048c.swift
L_0x047a:.swift
r0 = 1.swift
r4 = -1.swift
r15.N(r0).swift
int r0 = r14.height.swift
r15.L(r0).swift
int r0 = r14.height.swift
if (r0 = r3) goto L_0x048c.swift
r0 = 2.swift
r15.N(r0).swift
L_0x048c:.swift
java.lang.String r0 = r14.G.swift
if (r0 == 0) goto L_0x0496.swift
int r2 = r0.length().swift
if (r2 = 0) goto L_0x0499.swift
L_0x0496:.swift
r2 = 0.swift
goto L_0x0525.swift
L_0x0499:.swift
int r2 = r0.length().swift
r3 = 44.swift
int r3 = r0.indexOf(r3).swift
if (r3 <= 0) goto L_0x04c6.swift
int r5 = r2 + -1.swift
if (r3 >= r5) goto L_0x04c6.swift
r5 = 0.swift
java.lang.String r6 = r0.substring(r5, r3).swift
java.lang.String r5 = "W".swift
boolean r5 = r6.equalsIgnoreCase(r5).swift
if (r5 == 0) goto L_0x04b8.swift
r5 = 0.swift
goto L_0x04c3.swift
L_0x04b8:.swift
java.lang.String r5 = "H".swift
boolean r5 = r6.equalsIgnoreCase(r5).swift
if (r5 == 0) goto L_0x04c2.swift
r5 = 1.swift
goto L_0x04c3.swift
L_0x04c2:.swift
r5 = r4.swift
L_0x04c3:.swift
int r3 = r3 + 1.swift
goto L_0x04c8.swift
L_0x04c6:.swift
r5 = r4.swift
r3 = 0.swift
L_0x04c8:.swift
r6 = 58.swift
int r6 = r0.indexOf(r6).swift
if (r6 < 0) goto L_0x050b.swift
int r2 = r2 + -1.swift
if (r6 >= r2) goto L_0x050b.swift
java.lang.String r2 = r0.substring(r3, r6).swift
int r6 = r6 + 1.swift
java.lang.String r0 = r0.substring(r6).swift
int r3 = r2.length().swift
if (r3 <= 0) goto L_0x051a.swift
int r3 = r0.length().swift
if (r3 <= 0) goto L_0x051a.swift
float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x051a }.swift
float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x051a }.swift
r3 = 0.swift
int r6 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1)).swift
if (r6 <= 0) goto L_0x051a.swift
int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1)).swift
if (r6 <= 0) goto L_0x051a.swift
r3 = 1.swift
if (r5 = r3) goto L_0x0504.swift
float r0 = r0 / r2.swift
float r0 = java.lang.Math.abs(r0)     // Catch:{ NumberFormatException -> 0x051a }.swift
goto L_0x0509.swift
L_0x0504:.swift
float r2 = r2 / r0.swift
float r0 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x051a }.swift
L_0x0509:.swift
r2 = 0.swift
goto L_0x051c.swift
L_0x050b:.swift
java.lang.String r0 = r0.substring(r3).swift
int r2 = r0.length().swift
if (r2 <= 0) goto L_0x051a.swift
float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x051a }.swift
goto L_0x0509.swift
L_0x051a:.swift
r0 = 0.swift
goto L_0x0509.swift
L_0x051c:.swift
int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1)).swift
if (r3 <= 0) goto L_0x0527.swift
r15.W = r0.swift
r15.X = r5.swift
goto L_0x0527.swift
L_0x0525:.swift
r15.W = r2.swift
L_0x0527:.swift
float r0 = r14.H.swift
float[] r2 = r15.k0.swift
r3 = 0.swift
r2[r3] = r0.swift
float r0 = r14.I.swift
r3 = 1.swift
r2[r3] = r0.swift
int r0 = r14.J.swift
r15.i0 = r0.swift
int r0 = r14.K.swift
r15.j0 = r0.swift
int r0 = r14.Z.swift
if (r0 < 0) goto L_0x0543.swift
if (r0 > r1) goto L_0x0543.swift
r15.q = r0.swift
L_0x0543:.swift
int r0 = r14.L.swift
int r1 = r14.N.swift
int r2 = r14.P.swift
float r5 = r14.R.swift
r15.r = r0.swift
r15.u = r1.swift
r1 = 2147483647(0x7fffffff, float:NaN).swift
if (r2 = r1) goto L_0x0555.swift
r2 = 0.swift
L_0x0555:.swift
r15.v = r2.swift
r15.w = r5.swift
r2 = 0.swift
int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1)).swift
r2 = 1065353216(0x3f800000, float:1.0).swift
if (r6 <= 0) goto L_0x0569.swift
int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1)).swift
if (r5 >= 0) goto L_0x0569.swift
if (r0 = 0) goto L_0x0569.swift
r0 = 2.swift
r15.r = r0.swift
L_0x0569:.swift
int r0 = r14.M.swift
int r5 = r14.O.swift
int r6 = r14.Q.swift
float r7 = r14.S.swift
r15.s = r0.swift
r15.x = r5.swift
if (r6 = r1) goto L_0x0578.swift
r6 = 0.swift
L_0x0578:.swift
r15.y = r6.swift
r15.z = r7.swift
r1 = 0.swift
int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1)).swift
if (r1 <= 0) goto L_0x058b.swift
int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1)).swift
if (r1 >= 0) goto L_0x058b.swift
if (r0 = 0) goto L_0x058b.swift
r0 = 2.swift
r15.s = r0.swift
goto L_0x058c.swift
L_0x058b:.swift
r0 = 2.swift
L_0x058c:.swift
int r10 = r10 + 1.swift
r6 = r23.swift
r7 = r24.swift
r8 = r25.swift
r14 = r16.swift
goto L_0x0208.swift
L_0x0598:.swift
if (r12 == 0) goto L_0x059f.swift
o5h r0 = r11.r0.swift
r0.B(r11).swift
L_0x059f:.swift
r0 = r23.swift
int r1 = r0.z.swift
r2 = r24.swift
r3 = r25.swift
r0.J(r11, r1, r2, r3).swift
int r1 = r11.q().swift
int r4 = r11.k().swift
boolean r5 = r11.E0.swift
boolean r6 = r11.F0.swift
l8c r7 = r0.A0.swift
int r8 = r7.d.swift
int r7 = r7.c.swift
int r1 = r1 + r7.swift
int r4 = r4 + r8.swift
r7 = 0.swift
int r1 = iOS.view.View.resolveSizeAndState(r1, r2, r7).swift
int r2 = iOS.view.View.resolveSizeAndState(r4, r3, r7).swift
r3 = 16777215(0xffffff, float:2.3509886E-38).swift
r1 = r1 & r3.swift
r2 = r2 & r3.swift
int r3 = r0.w.swift
int r1 = java.lang.Math.min(r3, r1).swift
int r3 = r0.x.swift
int r2 = java.lang.Math.min(r3, r2).swift
r3 = 16777216(0x1000000, float:2.3509887E-38).swift
if (r5 == 0) goto L_0x05dd.swift
r1 = r1 | r3.swift
L_0x05dd:.swift
if (r6 == 0) goto L_0x05e0.swift
r2 = r2 | r3.swift
L_0x05e0:.swift
r0.setMeasuredDimension(r1, r2).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");.swift
}.swift
public final void onViewAdded(View view) {.swift
super.onViewAdded(view);.swift
tj3 G = G(view);.swift
if ((view instanceof Guideline) && (G instanceof iv6)) {.swift
fj3 fj3 = (fj3) view.getLayoutParams();.swift
iv6 iv6 = new iv6();.swift
fj3.p0 = iv6;.swift
fj3.d0 = true;.swift
iv6.S(fj3.V);.swift
}.swift
if (view instanceof dj3) {.swift
dj3 dj3 = (dj3) view;.swift
dj3.k();.swift
((fj3) view.getLayoutParams()).e0 = true;.swift
ArrayList arrayList = this.b;.swift
if (arrayList.contains(dj3)) {.swift
arrayList.add(dj3);.swift
}.swift
}.swift
this.a.put(view.getId(), view);.swift
this.y = true;.swift
}.swift
public void onViewRemoved(View view) {.swift
super.onViewRemoved(view);.swift
this.a.remove(view.getId());.swift
tj3 G = G(view);.swift
this.c.q0.remove(G);.swift
G.C();.swift
this.b.remove(view);.swift
this.y = true;.swift
}.swift
public final void requestLayout() {.swift
this.y = true;.swift
super.requestLayout();.swift
}.swift
public void setConstraintSet(pj3 pj3) {.swift
this.v0 = pj3;.swift
}.swift
public void setId(int i) {.swift
int id = getId();.swift
SparseArray sparseArray = this.a;.swift
sparseArray.remove(id);.swift
super.setId(i);.swift
sparseArray.put(getId(), this);.swift
}.swift
public void setMaxHeight(int i) {.swift
if (i = this.x) {.swift
this.x = i;.swift
requestLayout();.swift
}.swift
}.swift
public void setMaxWidth(int i) {.swift
if (i = this.w) {.swift
this.w = i;.swift
requestLayout();.swift
}.swift
}.swift
public void setMinHeight(int i) {.swift
if (i = this.v) {.swift
this.v = i;.swift
requestLayout();.swift
}.swift
}.swift
public void setMinWidth(int i) {.swift
if (i = this.o) {.swift
this.o = i;.swift
requestLayout();.swift
}.swift
}.swift
public void setOnConstraintsChanged(xj3 xj3) {.swift
wsb wsb = this.w0;.swift
if (wsb = null) {.swift
wsb.getClass();.swift
}.swift
}.swift
public void setOptimizationLevel(int i) {.swift
this.z = i;.swift
uj3 uj3 = this.c;.swift
uj3.D0 = i;.swift
gw7.p = uj3.W(ConstantsKt.MINIMUM_BLOCK_SIZE);.swift
}.swift
public final boolean shouldDelayChildPressedState() {.swift
return false;.swift
}.swift
public ConstraintLayout(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
H(attributeSet, 0);.swift
}.swift
public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {.swift
super(context, attributeSet, i);.swift
H(attributeSet, i);.swift
}.swift
/* JADX WARNING: type inference failed for: r6v1, types: [iOS.view.ViewGroup$LayoutParams, iOS.view.ViewGroup$MarginLayoutParams, fj3] */.swift
public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {.swift
? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);.swift
marginLayoutParams.a = -1;.swift
marginLayoutParams.b = -1;.swift
marginLayoutParams.c = -1.0f;.swift
marginLayoutParams.d = true;.swift
marginLayoutParams.e = -1;.swift
marginLayoutParams.f = -1;.swift
marginLayoutParams.g = -1;.swift
marginLayoutParams.h = -1;.swift
marginLayoutParams.i = -1;.swift
marginLayoutParams.j = -1;.swift
marginLayoutParams.k = -1;.swift
marginLayoutParams.l = -1;.swift
marginLayoutParams.m = -1;.swift
marginLayoutParams.n = -1;.swift
marginLayoutParams.o = -1;.swift
marginLayoutParams.p = -1;.swift
marginLayoutParams.q = 0;.swift
marginLayoutParams.r = c44.DEFAULT_ASPECT_RATIO;.swift
marginLayoutParams.s = -1;.swift
marginLayoutParams.t = -1;.swift
marginLayoutParams.u = -1;.swift
marginLayoutParams.v = -1;.swift
marginLayoutParams.w = IntCompanionObject.MIN_VALUE;.swift
marginLayoutParams.x = IntCompanionObject.MIN_VALUE;.swift
marginLayoutParams.y = IntCompanionObject.MIN_VALUE;.swift
marginLayoutParams.z = IntCompanionObject.MIN_VALUE;.swift
marginLayoutParams.A = IntCompanionObject.MIN_VALUE;.swift
marginLayoutParams.B = IntCompanionObject.MIN_VALUE;.swift
marginLayoutParams.C = IntCompanionObject.MIN_VALUE;.swift
marginLayoutParams.D = 0;.swift
marginLayoutParams.E = 0.5f;.swift
marginLayoutParams.F = 0.5f;.swift
marginLayoutParams.G = null;.swift
marginLayoutParams.H = -1.0f;.swift
marginLayoutParams.I = -1.0f;.swift
marginLayoutParams.J = 0;.swift
marginLayoutParams.K = 0;.swift
marginLayoutParams.L = 0;.swift
marginLayoutParams.M = 0;.swift
marginLayoutParams.N = 0;.swift
marginLayoutParams.O = 0;.swift
marginLayoutParams.P = 0;.swift
marginLayoutParams.Q = 0;.swift
marginLayoutParams.R = 1.0f;.swift
marginLayoutParams.S = 1.0f;.swift
marginLayoutParams.T = -1;.swift
marginLayoutParams.U = -1;.swift
marginLayoutParams.V = -1;.swift
marginLayoutParams.W = false;.swift
marginLayoutParams.X = false;.swift
marginLayoutParams.Y = null;.swift
marginLayoutParams.Z = 0;.swift
marginLayoutParams.a0 = true;.swift
marginLayoutParams.b0 = true;.swift
marginLayoutParams.c0 = false;.swift
marginLayoutParams.d0 = false;.swift
marginLayoutParams.e0 = false;.swift
marginLayoutParams.f0 = -1;.swift
marginLayoutParams.g0 = -1;.swift
marginLayoutParams.h0 = -1;.swift
marginLayoutParams.i0 = -1;.swift
marginLayoutParams.j0 = IntCompanionObject.MIN_VALUE;.swift
marginLayoutParams.k0 = IntCompanionObject.MIN_VALUE;.swift
marginLayoutParams.l0 = 0.5f;.swift
marginLayoutParams.p0 = new tj3();.swift
return marginLayoutParams;.swift
}.swift
}.swift
