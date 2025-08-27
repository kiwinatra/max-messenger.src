package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* renamed from: odg  reason: default package */
public abstract class odg extends yrf {
    public static final String[] R0 = {"android:visibility:visibility", "android:visibility:parent"};
    public int Q0 = 3;

    public static void Q(isf isf) {
        int visibility = isf.b.getVisibility();
        HashMap hashMap = isf.a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = isf.b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ndg, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ndg R(defpackage.isf r8, defpackage.isf r9) {
        /*
            ndg r0 = new ndg
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x002f
            java.util.HashMap r6 = r8.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L_0x002f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L_0x0033
        L_0x002f:
            r0.c = r3
            r0.e = r2
        L_0x0033:
            if (r9 == 0) goto L_0x0052
            java.util.HashMap r6 = r9.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L_0x0052
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L_0x0056
        L_0x0052:
            r0.d = r3
            r0.f = r2
        L_0x0056:
            r2 = 1
            if (r8 == 0) goto L_0x008a
            if (r9 == 0) goto L_0x008a
            int r8 = r0.c
            int r9 = r0.d
            if (r8 != r9) goto L_0x0068
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f
            if (r3 != r4) goto L_0x0068
            return r0
        L_0x0068:
            if (r8 == r9) goto L_0x0078
            if (r8 != 0) goto L_0x0071
            r0.b = r1
            r0.a = r2
            goto L_0x009f
        L_0x0071:
            if (r9 != 0) goto L_0x009f
            r0.b = r2
            r0.a = r2
            goto L_0x009f
        L_0x0078:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L_0x0081
            r0.b = r1
            r0.a = r2
            goto L_0x009f
        L_0x0081:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L_0x009f
            r0.b = r2
            r0.a = r2
            goto L_0x009f
        L_0x008a:
            if (r8 != 0) goto L_0x0095
            int r8 = r0.d
            if (r8 != 0) goto L_0x0095
            r0.b = r2
            r0.a = r2
            goto L_0x009f
        L_0x0095:
            if (r9 != 0) goto L_0x009f
            int r8 = r0.c
            if (r8 != 0) goto L_0x009f
            r0.b = r1
            r0.a = r2
        L_0x009f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.odg.R(isf, isf):ndg");
    }

    public abstract ObjectAnimator S(ViewGroup viewGroup, View view, isf isf, isf isf2);

    public abstract ObjectAnimator T(ViewGroup viewGroup, View view, isf isf, isf isf2);

    public void f(isf isf) {
        Q(isf);
    }

    /* JADX WARNING: type inference failed for: r16v8, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (R(r(r5, false), v(r5, false)).a != false) goto L_0x0044;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator m(android.view.ViewGroup r21, defpackage.isf r22, defpackage.isf r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            ndg r4 = R(r22, r23)
            boolean r5 = r4.a
            if (r5 == 0) goto L_0x0019
            android.view.ViewGroup r5 = r4.e
            if (r5 != 0) goto L_0x001c
            android.view.ViewGroup r5 = r4.f
            if (r5 == 0) goto L_0x0019
            goto L_0x001c
        L_0x0019:
            r0 = 0
            goto L_0x026f
        L_0x001c:
            boolean r5 = r4.b
            r7 = 0
            r8 = 1
            if (r5 == 0) goto L_0x004b
            int r4 = r0.Q0
            r4 = r4 & r8
            if (r4 != r8) goto L_0x0044
            if (r3 != 0) goto L_0x002a
            goto L_0x0044
        L_0x002a:
            android.view.View r4 = r3.b
            if (r2 != 0) goto L_0x0046
            android.view.ViewParent r5 = r4.getParent()
            android.view.View r5 = (android.view.View) r5
            isf r8 = r0.r(r5, r7)
            isf r5 = r0.v(r5, r7)
            ndg r5 = R(r8, r5)
            boolean r5 = r5.a
            if (r5 == 0) goto L_0x0046
        L_0x0044:
            r6 = 0
            goto L_0x004a
        L_0x0046:
            android.animation.ObjectAnimator r6 = r0.S(r1, r4, r2, r3)
        L_0x004a:
            return r6
        L_0x004b:
            int r4 = r4.d
            int r5 = r0.Q0
            r9 = 2
            r5 = r5 & r9
            if (r5 == r9) goto L_0x0056
        L_0x0053:
            r6 = 0
            goto L_0x026e
        L_0x0056:
            if (r2 != 0) goto L_0x0059
            goto L_0x0053
        L_0x0059:
            if (r3 == 0) goto L_0x005e
            android.view.View r5 = r3.b
            goto L_0x005f
        L_0x005e:
            r5 = 0
        L_0x005f:
            int r10 = defpackage.yfc.save_overlay_view
            android.view.View r11 = r2.b
            java.lang.Object r10 = r11.getTag(r10)
            android.view.View r10 = (android.view.View) r10
            if (r10 == 0) goto L_0x0071
            r18 = r4
            r7 = r8
            r6 = 0
            goto L_0x01db
        L_0x0071:
            if (r5 == 0) goto L_0x0088
            android.view.ViewParent r10 = r5.getParent()
            if (r10 != 0) goto L_0x007a
            goto L_0x0088
        L_0x007a:
            r10 = 4
            if (r4 != r10) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            if (r11 != r5) goto L_0x0084
        L_0x0080:
            r10 = r5
            r12 = r7
            r5 = 0
            goto L_0x008c
        L_0x0084:
            r12 = r8
            r5 = 0
        L_0x0086:
            r10 = 0
            goto L_0x008c
        L_0x0088:
            if (r5 == 0) goto L_0x0084
            r12 = r7
            goto L_0x0086
        L_0x008c:
            if (r12 == 0) goto L_0x01d5
            android.view.ViewParent r12 = r11.getParent()
            if (r12 != 0) goto L_0x009a
            r18 = r4
            r6 = r10
            r10 = r11
            goto L_0x01db
        L_0x009a:
            android.view.ViewParent r12 = r11.getParent()
            boolean r12 = r12 instanceof android.view.View
            if (r12 == 0) goto L_0x01d5
            android.view.ViewParent r12 = r11.getParent()
            android.view.View r12 = (android.view.View) r12
            isf r13 = r0.v(r12, r8)
            isf r14 = r0.r(r12, r8)
            ndg r13 = R(r13, r14)
            boolean r13 = r13.a
            if (r13 != 0) goto L_0x01c0
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            int r13 = r12.getScrollX()
            int r13 = -r13
            float r13 = (float) r13
            int r12 = r12.getScrollY()
            int r12 = -r12
            float r12 = (float) r12
            r5.setTranslate(r13, r12)
            dz1 r12 = defpackage.tcg.a
            r11.transformMatrixToGlobal(r5)
            r1.transformMatrixToLocal(r5)
            android.graphics.RectF r12 = new android.graphics.RectF
            int r13 = r11.getWidth()
            float r13 = (float) r13
            int r14 = r11.getHeight()
            float r14 = (float) r14
            r15 = 0
            r12.<init>(r15, r15, r13, r14)
            r5.mapRect(r12)
            float r13 = r12.left
            int r13 = java.lang.Math.round(r13)
            float r14 = r12.top
            int r14 = java.lang.Math.round(r14)
            float r15 = r12.right
            int r15 = java.lang.Math.round(r15)
            float r6 = r12.bottom
            int r6 = java.lang.Math.round(r6)
            android.widget.ImageView r9 = new android.widget.ImageView
            android.content.Context r7 = r11.getContext()
            r9.<init>(r7)
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_CROP
            r9.setScaleType(r7)
            boolean r7 = r11.isAttachedToWindow()
            r7 = r7 ^ r8
            boolean r16 = r21.isAttachedToWindow()
            if (r7 == 0) goto L_0x013f
            if (r16 != 0) goto L_0x0121
            r18 = r4
            r16 = r10
            r0 = 0
            goto L_0x01a2
        L_0x0121:
            android.view.ViewParent r16 = r11.getParent()
            r8 = r16
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            int r16 = r8.indexOfChild(r11)
            r17 = r8
            android.view.ViewGroupOverlay r8 = r21.getOverlay()
            r8.add(r11)
            r8 = r17
            r19 = r16
            r16 = r10
            r10 = r19
            goto L_0x0143
        L_0x013f:
            r16 = r10
            r8 = 0
            r10 = 0
        L_0x0143:
            float r17 = r12.width()
            r18 = r4
            int r4 = java.lang.Math.round(r17)
            float r17 = r12.height()
            int r0 = java.lang.Math.round(r17)
            if (r4 <= 0) goto L_0x0195
            if (r0 <= 0) goto L_0x0195
            int r3 = r4 * r0
            float r3 = (float) r3
            r17 = 1233125376(0x49800000, float:1048576.0)
            float r3 = r17 / r3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r2, r3)
            float r3 = (float) r4
            float r3 = r3 * r2
            int r3 = java.lang.Math.round(r3)
            float r0 = (float) r0
            float r0 = r0 * r2
            int r0 = java.lang.Math.round(r0)
            float r4 = r12.left
            float r4 = -r4
            float r12 = r12.top
            float r12 = -r12
            r5.postTranslate(r4, r12)
            r5.postScale(r2, r2)
            android.graphics.Picture r2 = new android.graphics.Picture
            r2.<init>()
            android.graphics.Canvas r0 = r2.beginRecording(r3, r0)
            r0.concat(r5)
            r11.draw(r0)
            r2.endRecording()
            android.graphics.Bitmap r0 = defpackage.hsf.a(r2)
            goto L_0x0196
        L_0x0195:
            r0 = 0
        L_0x0196:
            if (r7 == 0) goto L_0x01a2
            android.view.ViewGroupOverlay r2 = r21.getOverlay()
            r2.remove(r11)
            r8.addView(r11, r10)
        L_0x01a2:
            if (r0 == 0) goto L_0x01a7
            r9.setImageBitmap(r0)
        L_0x01a7:
            int r0 = r15 - r13
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r3 = r6 - r14
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r9.measure(r0, r2)
            r9.layout(r13, r14, r15, r6)
            r10 = r9
        L_0x01bc:
            r6 = r16
            r7 = 0
            goto L_0x01db
        L_0x01c0:
            r18 = r4
            r16 = r10
            int r0 = r12.getId()
            android.view.ViewParent r2 = r12.getParent()
            if (r2 != 0) goto L_0x01d9
            r2 = -1
            if (r0 == r2) goto L_0x01d9
            r1.findViewById(r0)
            goto L_0x01d9
        L_0x01d5:
            r18 = r4
            r16 = r10
        L_0x01d9:
            r10 = r5
            goto L_0x01bc
        L_0x01db:
            if (r10 == 0) goto L_0x0240
            r0 = r22
            if (r7 != 0) goto L_0x0214
            java.util.HashMap r2 = r0.a
            java.lang.String r3 = "android:visibility:screenLocation"
            java.lang.Object r2 = r2.get(r3)
            int[] r2 = (int[]) r2
            r3 = 0
            r4 = r2[r3]
            r5 = 1
            r2 = r2[r5]
            r6 = 2
            int[] r6 = new int[r6]
            r1.getLocationOnScreen(r6)
            r3 = r6[r3]
            int r4 = r4 - r3
            int r3 = r10.getLeft()
            int r4 = r4 - r3
            r10.offsetLeftAndRight(r4)
            r3 = r6[r5]
            int r2 = r2 - r3
            int r3 = r10.getTop()
            int r2 = r2 - r3
            r10.offsetTopAndBottom(r2)
            android.view.ViewGroupOverlay r2 = r21.getOverlay()
            r2.add(r10)
        L_0x0214:
            r2 = r20
            r3 = r23
            android.animation.ObjectAnimator r6 = r2.T(r1, r10, r0, r3)
            if (r7 != 0) goto L_0x026e
            if (r6 != 0) goto L_0x0228
            android.view.ViewGroupOverlay r0 = r21.getOverlay()
            r0.remove(r10)
            goto L_0x026e
        L_0x0228:
            int r0 = defpackage.yfc.save_overlay_view
            r11.setTag(r0, r10)
            mdg r0 = new mdg
            r0.<init>(r2, r1, r10, r11)
            r6.addListener(r0)
            r6.addPauseListener(r0)
            yrf r1 = r20.s()
            r1.a(r0)
            goto L_0x026e
        L_0x0240:
            r2 = r20
            r0 = r22
            r3 = r23
            if (r6 == 0) goto L_0x0053
            int r4 = r6.getVisibility()
            dz1 r5 = defpackage.tcg.a
            r5 = 0
            r6.setTransitionVisibility(r5)
            android.animation.ObjectAnimator r0 = r2.T(r1, r6, r0, r3)
            if (r0 == 0) goto L_0x026a
            ldg r1 = new ldg
            r3 = r18
            r1.<init>(r6, r3)
            r0.addListener(r1)
            yrf r2 = r20.s()
            r2.a(r1)
            goto L_0x026d
        L_0x026a:
            r6.setTransitionVisibility(r4)
        L_0x026d:
            r6 = r0
        L_0x026e:
            return r6
        L_0x026f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.odg.m(android.view.ViewGroup, isf, isf):android.animation.Animator");
    }

    public final String[] u() {
        return R0;
    }

    public final boolean x(isf isf, isf isf2) {
        if (isf == null && isf2 == null) {
            return false;
        }
        if (isf != null && isf2 != null && isf2.a.containsKey("android:visibility:visibility") != isf.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        ndg R = R(isf, isf2);
        if (R.a) {
            return R.c == 0 || R.d == 0;
        }
        return false;
    }
}
