package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: yh  reason: default package */
public final class yh {
    public static final p3a c = new p3a(4);
    public final Context a;
    public final Resources b;

    public yh(Context context) {
        this.a = context;
        this.b = context.getResources();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        r7 = r3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator a(android.content.res.XmlResourceParser r20, android.animation.AnimatorSet r21, int r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int r3 = r20.getEventType()
            int r4 = r20.getDepth()
            r20.next()
            r6 = 0
            r7 = 0
        L_0x0013:
            r8 = 3
            r9 = 0
            if (r3 != r8) goto L_0x001d
            int r8 = r20.getDepth()
            if (r8 <= r4) goto L_0x01e7
        L_0x001d:
            r8 = 1
            if (r3 == r8) goto L_0x01e7
            r10 = 2
            if (r3 == r10) goto L_0x0028
            int r3 = r20.next()
            goto L_0x0013
        L_0x0028:
            java.lang.String r3 = r20.getName()
            if (r3 == 0) goto L_0x0068
            int r11 = r3.hashCode()
            switch(r11) {
                case -1678405661: goto L_0x01ba;
                case -1493597370: goto L_0x007e;
                case -795202841: goto L_0x006c;
                case 113762: goto L_0x0036;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x0068
        L_0x0036:
            java.lang.String r8 = "set"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L_0x003f
            goto L_0x0035
        L_0x003f:
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            java.util.LinkedHashMap r7 = defpackage.kr7.h(r20)
            java.lang.String r8 = "ordering"
            java.lang.Object r7 = r7.get(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x0064
            int r7 = r7.intValue()
            java.lang.String r7 = r1.getAttributeValue(r7)
            java.lang.Integer r7 = kotlin.text.StringsKt.toIntOrNull(r7)
            if (r7 == 0) goto L_0x0064
            int r9 = r7.intValue()
        L_0x0064:
            r0.a(r1, r3, r9)
        L_0x0067:
            r7 = r3
        L_0x0068:
            r18 = r4
            goto L_0x01cd
        L_0x006c:
            java.lang.String r8 = "animator"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L_0x0075
            goto L_0x0035
        L_0x0075:
            android.animation.ValueAnimator r3 = new android.animation.ValueAnimator
            r3.<init>()
            r0.b(r3, r1)
            goto L_0x0067
        L_0x007e:
            java.lang.String r11 = "objectAnimator"
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L_0x0068
            jy0 r3 = new jy0
            r3.<init>(r1)
            android.animation.ObjectAnimator r7 = new android.animation.ObjectAnimator
            r7.<init>()
            r0.b(r7, r3)
            hh r11 = defpackage.hh.v
            android.content.Context r12 = r0.a
            java.lang.Object r11 = r11.C(r12, r3)
            java.lang.String r11 = (java.lang.String) r11
            int r13 = r11.length()
            if (r13 <= 0) goto L_0x01ac
            jh r13 = defpackage.jh.v
            java.lang.Object r13 = r13.C(r12, r3)
            java.lang.String r13 = (java.lang.String) r13
            kh r14 = defpackage.kh.v
            java.lang.Object r14 = r14.C(r12, r3)
            java.lang.String r14 = (java.lang.String) r14
            rh r15 = defpackage.rh.v
            java.lang.Object r3 = r15.C(r12, r3)
            ei r3 = (defpackage.ei) r3
            boolean r12 = r3 instanceof defpackage.ci
            if (r12 != 0) goto L_0x00c1
            boolean r3 = r3 instanceof defpackage.di
        L_0x00c1:
            int r3 = r13.length()
            if (r3 != 0) goto L_0x00d6
            int r3 = r13.length()
            if (r3 == 0) goto L_0x00ce
            goto L_0x00d6
        L_0x00ce:
            android.view.InflateException r0 = new android.view.InflateException
            java.lang.String r1 = "propertyXName or propertyYName is need for PathData"
            r0.<init>(r1)
            throw r0
        L_0x00d6:
            android.graphics.Path r11 = defpackage.b59.p(r11)
            android.graphics.PathMeasure r15 = new android.graphics.PathMeasure
            r15.<init>(r11, r9)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r16 = 0
            java.lang.Float r12 = java.lang.Float.valueOf(r16)
            r3.add(r12)
            r12 = r16
        L_0x00ef:
            float r17 = r15.getLength()
            float r12 = r17 + r12
            java.lang.Float r5 = java.lang.Float.valueOf(r12)
            r3.add(r5)
            boolean r5 = r15.nextContour()
            if (r5 != 0) goto L_0x01a6
            android.graphics.PathMeasure r5 = new android.graphics.PathMeasure
            r5.<init>(r11, r9)
            r11 = 1056964608(0x3f000000, float:0.5)
            float r11 = r12 / r11
            int r11 = (int) r11
            int r11 = r11 + r8
            r15 = 100
            int r11 = java.lang.Math.min(r15, r11)
            float[] r15 = new float[r11]
            float[] r8 = new float[r11]
            float[] r10 = new float[r10]
            int r9 = r11 + -1
            float r9 = (float) r9
            float r12 = r12 / r9
            r0 = 0
            r9 = 0
        L_0x011f:
            if (r9 >= r11) goto L_0x0160
            java.lang.Object r18 = r3.get(r0)
            java.lang.Number r18 = (java.lang.Number) r18
            float r18 = r18.floatValue()
            float r1 = r16 - r18
            r18 = r4
            r4 = 0
            r5.getPosTan(r1, r10, r4)
            r1 = 0
            r17 = r10[r1]
            r15[r9] = r17
            r1 = 1
            r17 = r10[r1]
            r8[r9] = r17
            float r16 = r16 + r12
            int r1 = r0 + 1
            int r4 = r3.size()
            if (r1 >= r4) goto L_0x0159
            java.lang.Object r4 = r3.get(r1)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r4 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0159
            r5.nextContour()
            r0 = r1
        L_0x0159:
            int r9 = r9 + 1
            r1 = r20
            r4 = r18
            goto L_0x011f
        L_0x0160:
            r18 = r4
            int r0 = r13.length()
            if (r0 <= 0) goto L_0x0169
            goto L_0x016a
        L_0x0169:
            r13 = 0
        L_0x016a:
            if (r13 == 0) goto L_0x0175
            float[] r0 = java.util.Arrays.copyOf(r15, r11)
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r13, r0)
            goto L_0x0176
        L_0x0175:
            r0 = 0
        L_0x0176:
            int r1 = r14.length()
            if (r1 <= 0) goto L_0x017d
            goto L_0x017e
        L_0x017d:
            r14 = 0
        L_0x017e:
            if (r14 == 0) goto L_0x0189
            float[] r1 = java.util.Arrays.copyOf(r8, r11)
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofFloat(r14, r1)
            goto L_0x018a
        L_0x0189:
            r1 = 0
        L_0x018a:
            if (r0 != 0) goto L_0x0194
            android.animation.PropertyValuesHolder[] r0 = new android.animation.PropertyValuesHolder[]{r1}
            r7.setValues(r0)
            goto L_0x01cd
        L_0x0194:
            if (r1 != 0) goto L_0x019e
            android.animation.PropertyValuesHolder[] r0 = new android.animation.PropertyValuesHolder[]{r0}
            r7.setValues(r0)
            goto L_0x01cd
        L_0x019e:
            android.animation.PropertyValuesHolder[] r0 = new android.animation.PropertyValuesHolder[]{r0, r1}
            r7.setValues(r0)
            goto L_0x01cd
        L_0x01a6:
            r0 = r19
            r1 = r20
            goto L_0x00ef
        L_0x01ac:
            r18 = r4
            ih r0 = defpackage.ih.v
            java.lang.Object r0 = r0.C(r12, r3)
            java.lang.String r0 = (java.lang.String) r0
            r7.setPropertyName(r0)
            goto L_0x01cd
        L_0x01ba:
            r18 = r4
            java.lang.String r0 = "propertyValuesHolder"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x01c5
            goto L_0x01cd
        L_0x01c5:
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            java.lang.String r1 = "An operation is not implemented: Not implemented yet"
            r0.<init>(r1)
            throw r0
        L_0x01cd:
            if (r2 == 0) goto L_0x01db
            if (r6 != 0) goto L_0x01d6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x01d6:
            if (r7 == 0) goto L_0x01db
            r6.add(r7)
        L_0x01db:
            int r3 = r20.next()
            r0 = r19
            r1 = r20
            r4 = r18
            goto L_0x0013
        L_0x01e7:
            if (r2 == 0) goto L_0x0214
            if (r6 == 0) goto L_0x0214
            if (r22 != 0) goto L_0x0201
            r0 = 0
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            java.lang.Object[] r0 = r6.toArray(r0)
            android.animation.Animator[] r0 = (android.animation.Animator[]) r0
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            android.animation.Animator[] r0 = (android.animation.Animator[]) r0
            r2.playTogether(r0)
            goto L_0x0214
        L_0x0201:
            r0 = 0
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            java.lang.Object[] r0 = r6.toArray(r0)
            android.animation.Animator[] r0 = (android.animation.Animator[]) r0
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            android.animation.Animator[] r0 = (android.animation.Animator[]) r0
            r2.playSequentially(r0)
        L_0x0214:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh.a(android.content.res.XmlResourceParser, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: android.animation.PropertyValuesHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v2, types: [android.animation.PropertyValuesHolder] */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: type inference failed for: r8v15 */
    /* JADX WARNING: type inference failed for: r8v16 */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: type inference failed for: r8v18 */
    /* JADX WARNING: type inference failed for: r8v19 */
    /* JADX WARNING: type inference failed for: r8v20 */
    /* JADX WARNING: type inference failed for: r8v21 */
    /* JADX WARNING: type inference failed for: r8v22 */
    /* JADX WARNING: type inference failed for: r8v23 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.animation.ValueAnimator r10, android.content.res.XmlResourceParser r11) {
        /*
            r9 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            gh r3 = defpackage.gh.v
            android.content.Context r9 = r9.a
            java.lang.Object r3 = r3.C(r9, r11)
            android.animation.TimeInterpolator r3 = (android.animation.TimeInterpolator) r3
            r10.setInterpolator(r3)
            fh r3 = defpackage.fh.v
            java.lang.Object r3 = r3.C(r9, r11)
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            r10.setDuration(r3)
            nh r3 = defpackage.nh.v
            java.lang.Object r3 = r3.C(r9, r11)
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            r10.setStartDelay(r3)
            lh r3 = defpackage.lh.v
            java.lang.Object r3 = r3.C(r9, r11)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r10.setRepeatCount(r3)
            mh r3 = defpackage.mh.v
            java.lang.Object r3 = r3.C(r9, r11)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r10.setRepeatMode(r3)
            ih r3 = defpackage.ih.v
            java.lang.Object r3 = r3.C(r9, r11)
            java.lang.String r3 = (java.lang.String) r3
            ph r4 = defpackage.ph.v
            java.lang.Object r4 = r4.C(r9, r11)
            ei r4 = (defpackage.ei) r4
            qh r5 = defpackage.qh.v
            java.lang.Object r5 = r5.C(r9, r11)
            ei r5 = (defpackage.ei) r5
            rh r6 = defpackage.rh.v
            java.lang.Object r9 = r6.C(r9, r11)
            ei r9 = (defpackage.ei) r9
            boolean r11 = r4 instanceof defpackage.zh
            r6 = 0
            if (r11 != 0) goto L_0x0080
            boolean r11 = r5 instanceof defpackage.zh
            if (r11 == 0) goto L_0x0076
            goto L_0x0080
        L_0x0076:
            boolean r11 = r9 instanceof defpackage.di
            if (r11 == 0) goto L_0x0085
            ai r9 = new ai
            r9.<init>(r6)
            goto L_0x0085
        L_0x0080:
            zh r9 = new zh
            r9.<init>(r2)
        L_0x0085:
            boolean r11 = r9 instanceof defpackage.ai
            boolean r7 = r9 instanceof defpackage.ci
            r8 = 0
            if (r7 == 0) goto L_0x0114
            boolean r9 = r4 instanceof defpackage.ci
            if (r9 == 0) goto L_0x0094
            r11 = r4
            ci r11 = (defpackage.ci) r11
            goto L_0x0095
        L_0x0094:
            r11 = r8
        L_0x0095:
            if (r11 == 0) goto L_0x00a1
            java.lang.String r11 = r11.a
            if (r11 != 0) goto L_0x009c
            goto L_0x00a1
        L_0x009c:
            lab[] r11 = defpackage.b59.o(r11)
            goto L_0x00a2
        L_0x00a1:
            r11 = r8
        L_0x00a2:
            boolean r0 = r5 instanceof defpackage.ci
            if (r0 == 0) goto L_0x00aa
            r1 = r5
            ci r1 = (defpackage.ci) r1
            goto L_0x00ab
        L_0x00aa:
            r1 = r8
        L_0x00ab:
            if (r1 == 0) goto L_0x00b7
            java.lang.String r1 = r1.a
            if (r1 != 0) goto L_0x00b2
            goto L_0x00b7
        L_0x00b2:
            lab[] r1 = defpackage.b59.o(r1)
            goto L_0x00b8
        L_0x00b7:
            r1 = r8
        L_0x00b8:
            if (r11 != 0) goto L_0x00bc
            if (r1 == 0) goto L_0x019e
        L_0x00bc:
            if (r11 == 0) goto L_0x0103
            p8c r2 = new p8c
            r2.<init>()
            if (r1 == 0) goto L_0x00f9
            boolean r6 = defpackage.b59.g(r11, r1)
            if (r6 != 0) goto L_0x00ef
            android.view.InflateException r10 = new android.view.InflateException
            if (r9 == 0) goto L_0x00d2
            ci r4 = (defpackage.ci) r4
            goto L_0x00d3
        L_0x00d2:
            r4 = r8
        L_0x00d3:
            if (r4 == 0) goto L_0x00d8
            java.lang.String r9 = r4.a
            goto L_0x00d9
        L_0x00d8:
            r9 = r8
        L_0x00d9:
            if (r0 == 0) goto L_0x00de
            ci r5 = (defpackage.ci) r5
            goto L_0x00df
        L_0x00de:
            r5 = r8
        L_0x00df:
            if (r5 == 0) goto L_0x00e3
            java.lang.String r8 = r5.a
        L_0x00e3:
            java.lang.String r11 = "Can't morph from "
            java.lang.String r0 = " to "
            java.lang.String r9 = defpackage.g63.j(r11, r9, r0, r8)
            r10.<init>(r9)
            throw r10
        L_0x00ef:
            java.lang.Object[] r9 = new java.lang.Object[]{r11, r1}
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofObject(r3, r2, r9)
            goto L_0x019e
        L_0x00f9:
            java.lang.Object[] r9 = new java.lang.Object[]{r11}
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofObject(r3, r2, r9)
            goto L_0x019e
        L_0x0103:
            if (r1 == 0) goto L_0x019e
            p8c r9 = new p8c
            r9.<init>()
            java.lang.Object[] r11 = new java.lang.Object[]{r1}
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofObject(r3, r9, r11)
            goto L_0x019e
        L_0x0114:
            boolean r9 = r9 instanceof defpackage.zh
            if (r9 == 0) goto L_0x011e
            android.animation.ArgbEvaluator r9 = new android.animation.ArgbEvaluator
            r9.<init>()
            goto L_0x011f
        L_0x011e:
            r9 = r8
        L_0x011f:
            if (r11 == 0) goto L_0x0150
            if (r4 == 0) goto L_0x0141
            ai r4 = (defpackage.ai) r4
            float r11 = r4.a
            if (r5 == 0) goto L_0x0138
            ai r5 = (defpackage.ai) r5
            float r4 = r5.a
            float[] r0 = new float[r0]
            r0[r2] = r11
            r0[r1] = r4
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofFloat(r3, r0)
            goto L_0x0197
        L_0x0138:
            float[] r0 = new float[r1]
            r0[r2] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofFloat(r3, r0)
            goto L_0x0197
        L_0x0141:
            ai r5 = (defpackage.ai) r5
            float r11 = r5.a
            float[] r0 = new float[r0]
            r0[r2] = r6
            r0[r1] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofFloat(r3, r0)
            goto L_0x0197
        L_0x0150:
            if (r4 == 0) goto L_0x0180
            boolean r11 = r4 instanceof defpackage.zh
            if (r11 == 0) goto L_0x015b
            zh r4 = (defpackage.zh) r4
            int r11 = r4.a
            goto L_0x015f
        L_0x015b:
            bi r4 = (defpackage.bi) r4
            int r11 = r4.a
        L_0x015f:
            if (r5 == 0) goto L_0x0177
            boolean r0 = r5 instanceof defpackage.zh
            if (r0 == 0) goto L_0x016a
            zh r5 = (defpackage.zh) r5
            int r0 = r5.a
            goto L_0x016e
        L_0x016a:
            bi r5 = (defpackage.bi) r5
            int r0 = r5.a
        L_0x016e:
            int[] r11 = new int[]{r11, r0}
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r3, r11)
            goto L_0x0197
        L_0x0177:
            int[] r11 = new int[]{r11}
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r3, r11)
            goto L_0x0197
        L_0x0180:
            if (r5 == 0) goto L_0x0197
            boolean r11 = r5 instanceof defpackage.zh
            if (r11 == 0) goto L_0x018b
            zh r5 = (defpackage.zh) r5
            int r11 = r5.a
            goto L_0x018f
        L_0x018b:
            bi r5 = (defpackage.bi) r5
            int r11 = r5.a
        L_0x018f:
            int[] r11 = new int[]{r11}
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r3, r11)
        L_0x0197:
            if (r8 == 0) goto L_0x019e
            if (r9 == 0) goto L_0x019e
            r8.setEvaluator(r9)
        L_0x019e:
            if (r8 == 0) goto L_0x01a7
            android.animation.PropertyValuesHolder[] r9 = new android.animation.PropertyValuesHolder[]{r8}
            r10.setValues(r9)
        L_0x01a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh.b(android.animation.ValueAnimator, android.content.res.XmlResourceParser):void");
    }
}
