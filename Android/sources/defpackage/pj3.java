package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.IntCompanionObject;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: pj3  reason: default package */
public final class pj3 {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public final HashMap a = new HashMap();
    public final boolean b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
        sparseIntArray.append(doc.Constraint_layout_constraintLeft_toLeftOf, 25);
        sparseIntArray.append(doc.Constraint_layout_constraintLeft_toRightOf, 26);
        sparseIntArray.append(doc.Constraint_layout_constraintRight_toLeftOf, 29);
        sparseIntArray.append(doc.Constraint_layout_constraintRight_toRightOf, 30);
        sparseIntArray.append(doc.Constraint_layout_constraintTop_toTopOf, 36);
        sparseIntArray.append(doc.Constraint_layout_constraintTop_toBottomOf, 35);
        sparseIntArray.append(doc.Constraint_layout_constraintBottom_toTopOf, 4);
        sparseIntArray.append(doc.Constraint_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray.append(doc.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray.append(doc.Constraint_layout_constraintBaseline_toTopOf, 91);
        sparseIntArray.append(doc.Constraint_layout_constraintBaseline_toBottomOf, 92);
        sparseIntArray.append(doc.Constraint_layout_editor_absoluteX, 6);
        sparseIntArray.append(doc.Constraint_layout_editor_absoluteY, 7);
        sparseIntArray.append(doc.Constraint_layout_constraintGuide_begin, 17);
        sparseIntArray.append(doc.Constraint_layout_constraintGuide_end, 18);
        sparseIntArray.append(doc.Constraint_layout_constraintGuide_percent, 19);
        sparseIntArray.append(doc.Constraint_guidelineUseRtl, 99);
        sparseIntArray.append(doc.Constraint_android_orientation, 27);
        sparseIntArray.append(doc.Constraint_layout_constraintStart_toEndOf, 32);
        sparseIntArray.append(doc.Constraint_layout_constraintStart_toStartOf, 33);
        sparseIntArray.append(doc.Constraint_layout_constraintEnd_toStartOf, 10);
        sparseIntArray.append(doc.Constraint_layout_constraintEnd_toEndOf, 9);
        sparseIntArray.append(doc.Constraint_layout_goneMarginLeft, 13);
        sparseIntArray.append(doc.Constraint_layout_goneMarginTop, 16);
        sparseIntArray.append(doc.Constraint_layout_goneMarginRight, 14);
        sparseIntArray.append(doc.Constraint_layout_goneMarginBottom, 11);
        sparseIntArray.append(doc.Constraint_layout_goneMarginStart, 15);
        sparseIntArray.append(doc.Constraint_layout_goneMarginEnd, 12);
        sparseIntArray.append(doc.Constraint_layout_constraintVertical_weight, 40);
        sparseIntArray.append(doc.Constraint_layout_constraintHorizontal_weight, 39);
        sparseIntArray.append(doc.Constraint_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray.append(doc.Constraint_layout_constraintVertical_chainStyle, 42);
        sparseIntArray.append(doc.Constraint_layout_constraintHorizontal_bias, 20);
        sparseIntArray.append(doc.Constraint_layout_constraintVertical_bias, 37);
        sparseIntArray.append(doc.Constraint_layout_constraintDimensionRatio, 5);
        sparseIntArray.append(doc.Constraint_layout_constraintLeft_creator, 87);
        sparseIntArray.append(doc.Constraint_layout_constraintTop_creator, 87);
        sparseIntArray.append(doc.Constraint_layout_constraintRight_creator, 87);
        sparseIntArray.append(doc.Constraint_layout_constraintBottom_creator, 87);
        sparseIntArray.append(doc.Constraint_layout_constraintBaseline_creator, 87);
        sparseIntArray.append(doc.Constraint_android_layout_marginLeft, 24);
        sparseIntArray.append(doc.Constraint_android_layout_marginRight, 28);
        sparseIntArray.append(doc.Constraint_android_layout_marginStart, 31);
        sparseIntArray.append(doc.Constraint_android_layout_marginEnd, 8);
        sparseIntArray.append(doc.Constraint_android_layout_marginTop, 34);
        sparseIntArray.append(doc.Constraint_android_layout_marginBottom, 2);
        sparseIntArray.append(doc.Constraint_android_layout_width, 23);
        sparseIntArray.append(doc.Constraint_android_layout_height, 21);
        sparseIntArray.append(doc.Constraint_layout_constraintWidth, 95);
        sparseIntArray.append(doc.Constraint_layout_constraintHeight, 96);
        sparseIntArray.append(doc.Constraint_android_visibility, 22);
        sparseIntArray.append(doc.Constraint_android_alpha, 43);
        sparseIntArray.append(doc.Constraint_android_elevation, 44);
        sparseIntArray.append(doc.Constraint_android_rotationX, 45);
        sparseIntArray.append(doc.Constraint_android_rotationY, 46);
        sparseIntArray.append(doc.Constraint_android_rotation, 60);
        sparseIntArray.append(doc.Constraint_android_scaleX, 47);
        sparseIntArray.append(doc.Constraint_android_scaleY, 48);
        sparseIntArray.append(doc.Constraint_android_transformPivotX, 49);
        sparseIntArray.append(doc.Constraint_android_transformPivotY, 50);
        sparseIntArray.append(doc.Constraint_android_translationX, 51);
        sparseIntArray.append(doc.Constraint_android_translationY, 52);
        sparseIntArray.append(doc.Constraint_android_translationZ, 53);
        sparseIntArray.append(doc.Constraint_layout_constraintWidth_default, 54);
        sparseIntArray.append(doc.Constraint_layout_constraintHeight_default, 55);
        sparseIntArray.append(doc.Constraint_layout_constraintWidth_max, 56);
        sparseIntArray.append(doc.Constraint_layout_constraintHeight_max, 57);
        sparseIntArray.append(doc.Constraint_layout_constraintWidth_min, 58);
        sparseIntArray.append(doc.Constraint_layout_constraintHeight_min, 59);
        sparseIntArray.append(doc.Constraint_layout_constraintCircle, 61);
        sparseIntArray.append(doc.Constraint_layout_constraintCircleRadius, 62);
        sparseIntArray.append(doc.Constraint_layout_constraintCircleAngle, 63);
        sparseIntArray.append(doc.Constraint_animateRelativeTo, 64);
        sparseIntArray.append(doc.Constraint_transitionEasing, 65);
        sparseIntArray.append(doc.Constraint_drawPath, 66);
        sparseIntArray.append(doc.Constraint_transitionPathRotate, 67);
        sparseIntArray.append(doc.Constraint_motionStagger, 79);
        sparseIntArray.append(doc.Constraint_android_id, 38);
        sparseIntArray.append(doc.Constraint_motionProgress, 68);
        sparseIntArray.append(doc.Constraint_layout_constraintWidth_percent, 69);
        sparseIntArray.append(doc.Constraint_layout_constraintHeight_percent, 70);
        sparseIntArray.append(doc.Constraint_layout_wrapBehaviorInParent, 97);
        sparseIntArray.append(doc.Constraint_chainUseRtl, 71);
        sparseIntArray.append(doc.Constraint_barrierDirection, 72);
        sparseIntArray.append(doc.Constraint_barrierMargin, 73);
        sparseIntArray.append(doc.Constraint_constraint_referenced_ids, 74);
        sparseIntArray.append(doc.Constraint_barrierAllowsGoneWidgets, 75);
        sparseIntArray.append(doc.Constraint_pathMotionArc, 76);
        sparseIntArray.append(doc.Constraint_layout_constraintTag, 77);
        sparseIntArray.append(doc.Constraint_visibilityMode, 78);
        sparseIntArray.append(doc.Constraint_layout_constrainedWidth, 80);
        sparseIntArray.append(doc.Constraint_layout_constrainedHeight, 81);
        sparseIntArray.append(doc.Constraint_polarRelativeTo, 82);
        sparseIntArray.append(doc.Constraint_transformPivotTarget, 83);
        sparseIntArray.append(doc.Constraint_quantizeMotionSteps, 84);
        sparseIntArray.append(doc.Constraint_quantizeMotionPhase, 85);
        sparseIntArray.append(doc.Constraint_quantizeMotionInterpolator, 86);
        sparseIntArray2.append(doc.ConstraintOverride_layout_editor_absoluteY, 6);
        sparseIntArray2.append(doc.ConstraintOverride_layout_editor_absoluteY, 7);
        sparseIntArray2.append(doc.ConstraintOverride_android_orientation, 27);
        sparseIntArray2.append(doc.ConstraintOverride_layout_goneMarginLeft, 13);
        sparseIntArray2.append(doc.ConstraintOverride_layout_goneMarginTop, 16);
        sparseIntArray2.append(doc.ConstraintOverride_layout_goneMarginRight, 14);
        sparseIntArray2.append(doc.ConstraintOverride_layout_goneMarginBottom, 11);
        sparseIntArray2.append(doc.ConstraintOverride_layout_goneMarginStart, 15);
        sparseIntArray2.append(doc.ConstraintOverride_layout_goneMarginEnd, 12);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintVertical_weight, 40);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintVertical_bias, 37);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintDimensionRatio, 5);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintLeft_creator, 87);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintTop_creator, 87);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintRight_creator, 87);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintBottom_creator, 87);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintBaseline_creator, 87);
        sparseIntArray2.append(doc.ConstraintOverride_android_layout_marginLeft, 24);
        sparseIntArray2.append(doc.ConstraintOverride_android_layout_marginRight, 28);
        sparseIntArray2.append(doc.ConstraintOverride_android_layout_marginStart, 31);
        sparseIntArray2.append(doc.ConstraintOverride_android_layout_marginEnd, 8);
        sparseIntArray2.append(doc.ConstraintOverride_android_layout_marginTop, 34);
        sparseIntArray2.append(doc.ConstraintOverride_android_layout_marginBottom, 2);
        sparseIntArray2.append(doc.ConstraintOverride_android_layout_width, 23);
        sparseIntArray2.append(doc.ConstraintOverride_android_layout_height, 21);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintWidth, 95);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintHeight, 96);
        sparseIntArray2.append(doc.ConstraintOverride_android_visibility, 22);
        sparseIntArray2.append(doc.ConstraintOverride_android_alpha, 43);
        sparseIntArray2.append(doc.ConstraintOverride_android_elevation, 44);
        sparseIntArray2.append(doc.ConstraintOverride_android_rotationX, 45);
        sparseIntArray2.append(doc.ConstraintOverride_android_rotationY, 46);
        sparseIntArray2.append(doc.ConstraintOverride_android_rotation, 60);
        sparseIntArray2.append(doc.ConstraintOverride_android_scaleX, 47);
        sparseIntArray2.append(doc.ConstraintOverride_android_scaleY, 48);
        sparseIntArray2.append(doc.ConstraintOverride_android_transformPivotX, 49);
        sparseIntArray2.append(doc.ConstraintOverride_android_transformPivotY, 50);
        sparseIntArray2.append(doc.ConstraintOverride_android_translationX, 51);
        sparseIntArray2.append(doc.ConstraintOverride_android_translationY, 52);
        sparseIntArray2.append(doc.ConstraintOverride_android_translationZ, 53);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintWidth_default, 54);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintHeight_default, 55);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintWidth_max, 56);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintHeight_max, 57);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintWidth_min, 58);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintHeight_min, 59);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintCircleRadius, 62);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintCircleAngle, 63);
        sparseIntArray2.append(doc.ConstraintOverride_animateRelativeTo, 64);
        sparseIntArray2.append(doc.ConstraintOverride_transitionEasing, 65);
        sparseIntArray2.append(doc.ConstraintOverride_drawPath, 66);
        sparseIntArray2.append(doc.ConstraintOverride_transitionPathRotate, 67);
        sparseIntArray2.append(doc.ConstraintOverride_motionStagger, 79);
        sparseIntArray2.append(doc.ConstraintOverride_android_id, 38);
        sparseIntArray2.append(doc.ConstraintOverride_motionTarget, 98);
        sparseIntArray2.append(doc.ConstraintOverride_motionProgress, 68);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintWidth_percent, 69);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintHeight_percent, 70);
        sparseIntArray2.append(doc.ConstraintOverride_chainUseRtl, 71);
        sparseIntArray2.append(doc.ConstraintOverride_barrierDirection, 72);
        sparseIntArray2.append(doc.ConstraintOverride_barrierMargin, 73);
        sparseIntArray2.append(doc.ConstraintOverride_constraint_referenced_ids, 74);
        sparseIntArray2.append(doc.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        sparseIntArray2.append(doc.ConstraintOverride_pathMotionArc, 76);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constraintTag, 77);
        sparseIntArray2.append(doc.ConstraintOverride_visibilityMode, 78);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constrainedWidth, 80);
        sparseIntArray2.append(doc.ConstraintOverride_layout_constrainedHeight, 81);
        sparseIntArray2.append(doc.ConstraintOverride_polarRelativeTo, 82);
        sparseIntArray2.append(doc.ConstraintOverride_transformPivotTarget, 83);
        sparseIntArray2.append(doc.ConstraintOverride_quantizeMotionSteps, 84);
        sparseIntArray2.append(doc.ConstraintOverride_quantizeMotionPhase, 85);
        sparseIntArray2.append(doc.ConstraintOverride_quantizeMotionInterpolator, 86);
        sparseIntArray2.append(doc.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public static int[] h(Barrier barrier, String str) {
        int i;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = pgc.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.y0) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.y0.get(trim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* JADX WARNING: type inference failed for: r12v99, types: [jj3, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x04cf, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x04dd, code lost:
        r0 = r0 + r11;
        r11 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0512, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x052b, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0080, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x066a, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0972, code lost:
        r14 = r14 + r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.kj3 i(android.content.Context r16, android.util.AttributeSet r17, boolean r18) {
        /*
            kj3 r1 = new kj3
            r1.<init>()
            if (r18 == 0) goto L_0x000e
            int[] r2 = defpackage.doc.ConstraintOverride
        L_0x0009:
            r3 = r16
            r4 = r17
            goto L_0x0011
        L_0x000e:
            int[] r2 = defpackage.doc.Constraint
            goto L_0x0009
        L_0x0011:
            android.content.res.TypedArray r2 = r3.obtainStyledAttributes(r4, r2)
            int[] r3 = d
            android.util.SparseIntArray r4 = e
            java.lang.String[] r5 = defpackage.cjf.a
            nj3 r6 = r1.b
            oj3 r7 = r1.e
            mj3 r8 = r1.c
            lj3 r9 = r1.d
            java.lang.String r10 = "/"
            r11 = 3
            r14 = 0
            if (r18 == 0) goto L_0x04e2
            int r15 = r2.getIndexCount()
            jj3 r12 = new jj3
            r12.<init>()
            r13 = 10
            int[] r0 = new int[r13]
            r12.a = r0
            int[] r0 = new int[r13]
            r12.b = r0
            r12.c = r14
            int[] r0 = new int[r13]
            r12.d = r0
            float[] r0 = new float[r13]
            r12.e = r0
            r12.f = r14
            r0 = 5
            int[] r13 = new int[r0]
            r12.g = r13
            java.lang.String[] r13 = new java.lang.String[r0]
            r12.h = r13
            r12.i = r14
            r13 = 4
            int[] r0 = new int[r13]
            r12.j = r0
            boolean[] r0 = new boolean[r13]
            r12.k = r0
            r12.l = r14
            r8.getClass()
            r9.getClass()
            r6.getClass()
            r7.getClass()
            r0 = r14
        L_0x006b:
            if (r0 >= r15) goto L_0x097c
            int r13 = r2.getIndex(r0)
            android.util.SparseIntArray r14 = f
            int r14 = r14.get(r13)
            switch(r14) {
                case 2: goto L_0x04d1;
                case 3: goto L_0x007a;
                case 4: goto L_0x007a;
                case 5: goto L_0x04c7;
                case 6: goto L_0x04bb;
                case 7: goto L_0x04af;
                case 8: goto L_0x04a2;
                case 9: goto L_0x007a;
                case 10: goto L_0x007a;
                case 11: goto L_0x0495;
                case 12: goto L_0x0488;
                case 13: goto L_0x047b;
                case 14: goto L_0x046e;
                case 15: goto L_0x0461;
                case 16: goto L_0x0454;
                case 17: goto L_0x0447;
                case 18: goto L_0x043a;
                case 19: goto L_0x042d;
                case 20: goto L_0x0420;
                case 21: goto L_0x0413;
                case 22: goto L_0x0404;
                case 23: goto L_0x03f7;
                case 24: goto L_0x03ea;
                case 25: goto L_0x007a;
                case 26: goto L_0x007a;
                case 27: goto L_0x03dd;
                case 28: goto L_0x03d0;
                case 29: goto L_0x007a;
                case 30: goto L_0x007a;
                case 31: goto L_0x03c3;
                case 32: goto L_0x007a;
                case 33: goto L_0x007a;
                case 34: goto L_0x03b6;
                case 35: goto L_0x007a;
                case 36: goto L_0x007a;
                case 37: goto L_0x03a9;
                case 38: goto L_0x039a;
                case 39: goto L_0x038d;
                case 40: goto L_0x0380;
                case 41: goto L_0x0373;
                case 42: goto L_0x0366;
                case 43: goto L_0x0359;
                case 44: goto L_0x0348;
                case 45: goto L_0x033b;
                case 46: goto L_0x032e;
                case 47: goto L_0x0321;
                case 48: goto L_0x0314;
                case 49: goto L_0x0307;
                case 50: goto L_0x02fa;
                case 51: goto L_0x02ed;
                case 52: goto L_0x02e0;
                case 53: goto L_0x02d3;
                case 54: goto L_0x02c6;
                case 55: goto L_0x02b9;
                case 56: goto L_0x02ac;
                case 57: goto L_0x029f;
                case 58: goto L_0x0292;
                case 59: goto L_0x0285;
                case 60: goto L_0x0278;
                case 61: goto L_0x007a;
                case 62: goto L_0x026b;
                case 63: goto L_0x025e;
                case 64: goto L_0x0251;
                case 65: goto L_0x022e;
                case 66: goto L_0x0222;
                case 67: goto L_0x0215;
                case 68: goto L_0x0208;
                case 69: goto L_0x01fb;
                case 70: goto L_0x01ee;
                case 71: goto L_0x0080;
                case 72: goto L_0x01e1;
                case 73: goto L_0x01d4;
                case 74: goto L_0x01c9;
                case 75: goto L_0x01bc;
                case 76: goto L_0x01af;
                case 77: goto L_0x01a4;
                case 78: goto L_0x0197;
                case 79: goto L_0x018a;
                case 80: goto L_0x017d;
                case 81: goto L_0x0170;
                case 82: goto L_0x0163;
                case 83: goto L_0x0156;
                case 84: goto L_0x0149;
                case 85: goto L_0x013c;
                case 86: goto L_0x00dd;
                case 87: goto L_0x00d6;
                case 88: goto L_0x007a;
                case 89: goto L_0x007a;
                case 90: goto L_0x007a;
                case 91: goto L_0x007a;
                case 92: goto L_0x007a;
                case 93: goto L_0x00ca;
                case 94: goto L_0x00be;
                case 95: goto L_0x00b9;
                case 96: goto L_0x00b3;
                case 97: goto L_0x00a7;
                case 98: goto L_0x0090;
                case 99: goto L_0x0084;
                default: goto L_0x007a;
            }
        L_0x007a:
            java.lang.Integer.toHexString(r13)
            r4.get(r13)
        L_0x0080:
            r11 = 1
        L_0x0081:
            r14 = 5
            goto L_0x04dd
        L_0x0084:
            boolean r14 = r9.g
            boolean r13 = r2.getBoolean(r13, r14)
            r14 = 99
            r12.d(r14, r13)
            goto L_0x0080
        L_0x0090:
            int r14 = defpackage.jt9.E0
            android.util.TypedValue r14 = r2.peekValue(r13)
            int r14 = r14.type
            if (r14 != r11) goto L_0x009e
            r2.getString(r13)
            goto L_0x0080
        L_0x009e:
            int r14 = r1.a
            int r13 = r2.getResourceId(r13, r14)
            r1.a = r13
            goto L_0x0080
        L_0x00a7:
            int r14 = r9.o0
            int r13 = r2.getInt(r13, r14)
            r14 = 97
            r12.b(r14, r13)
            goto L_0x0080
        L_0x00b3:
            r14 = 1
            m(r12, r2, r13, r14)
            r11 = r14
            goto L_0x0081
        L_0x00b9:
            r14 = 0
            m(r12, r2, r13, r14)
            goto L_0x0080
        L_0x00be:
            int r14 = r9.S
            int r13 = r2.getDimensionPixelSize(r13, r14)
            r14 = 94
            r12.b(r14, r13)
            goto L_0x0080
        L_0x00ca:
            int r14 = r9.L
            int r13 = r2.getDimensionPixelSize(r13, r14)
            r14 = 93
            r12.b(r14, r13)
            goto L_0x0080
        L_0x00d6:
            java.lang.Integer.toHexString(r13)
            r4.get(r13)
            goto L_0x0080
        L_0x00dd:
            android.util.TypedValue r14 = r2.peekValue(r13)
            int r14 = r14.type
            r11 = 1
            if (r14 != r11) goto L_0x00fd
            r11 = -1
            int r13 = r2.getResourceId(r13, r11)
            r8.i = r13
            r14 = 89
            r12.b(r14, r13)
            int r13 = r8.i
            if (r13 == r11) goto L_0x0080
            r11 = -2
            r13 = 88
            r12.b(r13, r11)
            goto L_0x0080
        L_0x00fd:
            r11 = 3
            if (r14 != r11) goto L_0x012f
            java.lang.String r11 = r2.getString(r13)
            r8.h = r11
            r14 = 90
            r12.c(r14, r11)
            java.lang.String r11 = r8.h
            int r11 = r11.indexOf(r10)
            if (r11 <= 0) goto L_0x0127
            r11 = -1
            int r13 = r2.getResourceId(r13, r11)
            r8.i = r13
            r14 = 89
            r12.b(r14, r13)
            r13 = -2
            r14 = 88
            r12.b(r14, r13)
            goto L_0x0080
        L_0x0127:
            r11 = -1
            r14 = 88
            r12.b(r14, r11)
            goto L_0x0080
        L_0x012f:
            r14 = 88
            int r11 = r8.i
            int r11 = r2.getInteger(r13, r11)
            r12.b(r14, r11)
            goto L_0x0080
        L_0x013c:
            float r11 = r8.f
            float r11 = r2.getFloat(r13, r11)
            r13 = 85
            r12.a(r11, r13)
            goto L_0x0080
        L_0x0149:
            int r11 = r8.g
            int r11 = r2.getInteger(r13, r11)
            r13 = 84
            r12.b(r13, r11)
            goto L_0x0080
        L_0x0156:
            int r11 = r7.h
            int r11 = l(r2, r13, r11)
            r13 = 83
            r12.b(r13, r11)
            goto L_0x0080
        L_0x0163:
            int r11 = r8.b
            int r11 = r2.getInteger(r13, r11)
            r13 = 82
            r12.b(r13, r11)
            goto L_0x0080
        L_0x0170:
            boolean r11 = r9.m0
            boolean r11 = r2.getBoolean(r13, r11)
            r13 = 81
            r12.d(r13, r11)
            goto L_0x0080
        L_0x017d:
            boolean r11 = r9.l0
            boolean r11 = r2.getBoolean(r13, r11)
            r13 = 80
            r12.d(r13, r11)
            goto L_0x0080
        L_0x018a:
            float r11 = r8.d
            float r11 = r2.getFloat(r13, r11)
            r13 = 79
            r12.a(r11, r13)
            goto L_0x0080
        L_0x0197:
            int r11 = r6.b
            int r11 = r2.getInt(r13, r11)
            r13 = 78
            r12.b(r13, r11)
            goto L_0x0080
        L_0x01a4:
            r11 = 77
            java.lang.String r13 = r2.getString(r13)
            r12.c(r11, r13)
            goto L_0x0080
        L_0x01af:
            int r11 = r8.c
            int r11 = r2.getInt(r13, r11)
            r13 = 76
            r12.b(r13, r11)
            goto L_0x0080
        L_0x01bc:
            boolean r11 = r9.n0
            boolean r11 = r2.getBoolean(r13, r11)
            r13 = 75
            r12.d(r13, r11)
            goto L_0x0080
        L_0x01c9:
            r11 = 74
            java.lang.String r13 = r2.getString(r13)
            r12.c(r11, r13)
            goto L_0x0080
        L_0x01d4:
            int r11 = r9.g0
            int r11 = r2.getDimensionPixelSize(r13, r11)
            r13 = 73
            r12.b(r13, r11)
            goto L_0x0080
        L_0x01e1:
            int r11 = r9.f0
            int r11 = r2.getInt(r13, r11)
            r13 = 72
            r12.b(r13, r11)
            goto L_0x0080
        L_0x01ee:
            r11 = 70
            r14 = 1065353216(0x3f800000, float:1.0)
            float r13 = r2.getFloat(r13, r14)
            r12.a(r13, r11)
            goto L_0x0080
        L_0x01fb:
            r14 = 1065353216(0x3f800000, float:1.0)
            r11 = 69
            float r13 = r2.getFloat(r13, r14)
            r12.a(r13, r11)
            goto L_0x0080
        L_0x0208:
            float r11 = r6.d
            float r11 = r2.getFloat(r13, r11)
            r13 = 68
            r12.a(r11, r13)
            goto L_0x0080
        L_0x0215:
            float r11 = r8.e
            float r11 = r2.getFloat(r13, r11)
            r13 = 67
            r12.a(r11, r13)
            goto L_0x0080
        L_0x0222:
            r11 = 66
            r14 = 0
            int r13 = r2.getInt(r13, r14)
            r12.b(r11, r13)
            goto L_0x0080
        L_0x022e:
            r14 = 0
            android.util.TypedValue r11 = r2.peekValue(r13)
            int r11 = r11.type
            r14 = 3
            if (r11 != r14) goto L_0x0243
            java.lang.String r11 = r2.getString(r13)
            r14 = 65
            r12.c(r14, r11)
            goto L_0x0080
        L_0x0243:
            r11 = 0
            r14 = 65
            int r13 = r2.getInteger(r13, r11)
            r11 = r5[r13]
            r12.c(r14, r11)
            goto L_0x0080
        L_0x0251:
            int r11 = r8.a
            int r11 = l(r2, r13, r11)
            r13 = 64
            r12.b(r13, r11)
            goto L_0x0080
        L_0x025e:
            float r11 = r9.B
            float r11 = r2.getFloat(r13, r11)
            r13 = 63
            r12.a(r11, r13)
            goto L_0x0080
        L_0x026b:
            int r11 = r9.A
            int r11 = r2.getDimensionPixelSize(r13, r11)
            r13 = 62
            r12.b(r13, r11)
            goto L_0x0080
        L_0x0278:
            float r11 = r7.a
            float r11 = r2.getFloat(r13, r11)
            r13 = 60
            r12.a(r11, r13)
            goto L_0x0080
        L_0x0285:
            int r11 = r9.c0
            int r11 = r2.getDimensionPixelSize(r13, r11)
            r13 = 59
            r12.b(r13, r11)
            goto L_0x0080
        L_0x0292:
            int r11 = r9.b0
            int r11 = r2.getDimensionPixelSize(r13, r11)
            r13 = 58
            r12.b(r13, r11)
            goto L_0x0080
        L_0x029f:
            int r11 = r9.a0
            int r11 = r2.getDimensionPixelSize(r13, r11)
            r13 = 57
            r12.b(r13, r11)
            goto L_0x0080
        L_0x02ac:
            int r11 = r9.Z
            int r11 = r2.getDimensionPixelSize(r13, r11)
            r13 = 56
            r12.b(r13, r11)
            goto L_0x0080
        L_0x02b9:
            int r11 = r9.Y
            int r11 = r2.getInt(r13, r11)
            r13 = 55
            r12.b(r13, r11)
            goto L_0x0080
        L_0x02c6:
            int r11 = r9.X
            int r11 = r2.getInt(r13, r11)
            r13 = 54
            r12.b(r13, r11)
            goto L_0x0080
        L_0x02d3:
            float r11 = r7.k
            float r11 = r2.getDimension(r13, r11)
            r13 = 53
            r12.a(r11, r13)
            goto L_0x0080
        L_0x02e0:
            float r11 = r7.j
            float r11 = r2.getDimension(r13, r11)
            r13 = 52
            r12.a(r11, r13)
            goto L_0x0080
        L_0x02ed:
            float r11 = r7.i
            float r11 = r2.getDimension(r13, r11)
            r13 = 51
            r12.a(r11, r13)
            goto L_0x0080
        L_0x02fa:
            float r11 = r7.g
            float r11 = r2.getDimension(r13, r11)
            r13 = 50
            r12.a(r11, r13)
            goto L_0x0080
        L_0x0307:
            float r11 = r7.f
            float r11 = r2.getDimension(r13, r11)
            r13 = 49
            r12.a(r11, r13)
            goto L_0x0080
        L_0x0314:
            float r11 = r7.e
            float r11 = r2.getFloat(r13, r11)
            r13 = 48
            r12.a(r11, r13)
            goto L_0x0080
        L_0x0321:
            float r11 = r7.d
            float r11 = r2.getFloat(r13, r11)
            r13 = 47
            r12.a(r11, r13)
            goto L_0x0080
        L_0x032e:
            float r11 = r7.c
            float r11 = r2.getFloat(r13, r11)
            r13 = 46
            r12.a(r11, r13)
            goto L_0x0080
        L_0x033b:
            float r11 = r7.b
            float r11 = r2.getFloat(r13, r11)
            r13 = 45
            r12.a(r11, r13)
            goto L_0x0080
        L_0x0348:
            r11 = 44
            r14 = 1
            r12.d(r11, r14)
            float r14 = r7.m
            float r13 = r2.getDimension(r13, r14)
            r12.a(r13, r11)
            goto L_0x0080
        L_0x0359:
            float r11 = r6.c
            float r11 = r2.getFloat(r13, r11)
            r13 = 43
            r12.a(r11, r13)
            goto L_0x0080
        L_0x0366:
            int r11 = r9.W
            int r11 = r2.getInt(r13, r11)
            r13 = 42
            r12.b(r13, r11)
            goto L_0x0080
        L_0x0373:
            int r11 = r9.V
            int r11 = r2.getInt(r13, r11)
            r13 = 41
            r12.b(r13, r11)
            goto L_0x0080
        L_0x0380:
            float r11 = r9.T
            float r11 = r2.getFloat(r13, r11)
            r13 = 40
            r12.a(r11, r13)
            goto L_0x0080
        L_0x038d:
            float r11 = r9.U
            float r11 = r2.getFloat(r13, r11)
            r13 = 39
            r12.a(r11, r13)
            goto L_0x0080
        L_0x039a:
            int r11 = r1.a
            int r11 = r2.getResourceId(r13, r11)
            r1.a = r11
            r13 = 38
            r12.b(r13, r11)
            goto L_0x0080
        L_0x03a9:
            float r11 = r9.x
            float r11 = r2.getFloat(r13, r11)
            r13 = 37
            r12.a(r11, r13)
            goto L_0x0080
        L_0x03b6:
            int r11 = r9.H
            int r11 = r2.getDimensionPixelSize(r13, r11)
            r13 = 34
            r12.b(r13, r11)
            goto L_0x0080
        L_0x03c3:
            int r11 = r9.K
            int r11 = r2.getDimensionPixelSize(r13, r11)
            r13 = 31
            r12.b(r13, r11)
            goto L_0x0080
        L_0x03d0:
            int r11 = r9.G
            int r11 = r2.getDimensionPixelSize(r13, r11)
            r13 = 28
            r12.b(r13, r11)
            goto L_0x0080
        L_0x03dd:
            int r11 = r9.E
            int r11 = r2.getInt(r13, r11)
            r13 = 27
            r12.b(r13, r11)
            goto L_0x0080
        L_0x03ea:
            int r11 = r9.F
            int r11 = r2.getDimensionPixelSize(r13, r11)
            r13 = 24
            r12.b(r13, r11)
            goto L_0x0080
        L_0x03f7:
            int r11 = r9.b
            int r11 = r2.getLayoutDimension(r13, r11)
            r13 = 23
            r12.b(r13, r11)
            goto L_0x0080
        L_0x0404:
            int r11 = r6.a
            int r11 = r2.getInt(r13, r11)
            r11 = r3[r11]
            r13 = 22
            r12.b(r13, r11)
            goto L_0x0080
        L_0x0413:
            int r11 = r9.c
            int r11 = r2.getLayoutDimension(r13, r11)
            r13 = 21
            r12.b(r13, r11)
            goto L_0x0080
        L_0x0420:
            float r11 = r9.w
            float r11 = r2.getFloat(r13, r11)
            r13 = 20
            r12.a(r11, r13)
            goto L_0x0080
        L_0x042d:
            float r11 = r9.f
            float r11 = r2.getFloat(r13, r11)
            r13 = 19
            r12.a(r11, r13)
            goto L_0x0080
        L_0x043a:
            int r11 = r9.e
            int r11 = r2.getDimensionPixelOffset(r13, r11)
            r13 = 18
            r12.b(r13, r11)
            goto L_0x0080
        L_0x0447:
            int r11 = r9.d
            int r11 = r2.getDimensionPixelOffset(r13, r11)
            r13 = 17
            r12.b(r13, r11)
            goto L_0x0080
        L_0x0454:
            int r11 = r9.N
            int r11 = r2.getDimensionPixelSize(r13, r11)
            r13 = 16
            r12.b(r13, r11)
            goto L_0x0080
        L_0x0461:
            int r11 = r9.R
            int r11 = r2.getDimensionPixelSize(r13, r11)
            r13 = 15
            r12.b(r13, r11)
            goto L_0x0080
        L_0x046e:
            int r11 = r9.O
            int r11 = r2.getDimensionPixelSize(r13, r11)
            r13 = 14
            r12.b(r13, r11)
            goto L_0x0080
        L_0x047b:
            int r11 = r9.M
            int r11 = r2.getDimensionPixelSize(r13, r11)
            r13 = 13
            r12.b(r13, r11)
            goto L_0x0080
        L_0x0488:
            int r11 = r9.Q
            int r11 = r2.getDimensionPixelSize(r13, r11)
            r13 = 12
            r12.b(r13, r11)
            goto L_0x0080
        L_0x0495:
            int r11 = r9.P
            int r11 = r2.getDimensionPixelSize(r13, r11)
            r13 = 11
            r12.b(r13, r11)
            goto L_0x0080
        L_0x04a2:
            int r11 = r9.J
            int r11 = r2.getDimensionPixelSize(r13, r11)
            r13 = 8
            r12.b(r13, r11)
            goto L_0x0080
        L_0x04af:
            int r11 = r9.D
            int r11 = r2.getDimensionPixelOffset(r13, r11)
            r13 = 7
            r12.b(r13, r11)
            goto L_0x0080
        L_0x04bb:
            int r11 = r9.C
            int r11 = r2.getDimensionPixelOffset(r13, r11)
            r13 = 6
            r12.b(r13, r11)
            goto L_0x0080
        L_0x04c7:
            java.lang.String r11 = r2.getString(r13)
            r14 = 5
            r12.c(r14, r11)
        L_0x04cf:
            r11 = 1
            goto L_0x04dd
        L_0x04d1:
            r14 = 5
            int r11 = r9.I
            int r11 = r2.getDimensionPixelSize(r13, r11)
            r13 = 2
            r12.b(r13, r11)
            goto L_0x04cf
        L_0x04dd:
            int r0 = r0 + r11
            r11 = 3
            r14 = 0
            goto L_0x006b
        L_0x04e2:
            int r0 = r2.getIndexCount()
            r14 = 0
        L_0x04e7:
            if (r14 >= r0) goto L_0x0975
            int r11 = r2.getIndex(r14)
            int r12 = defpackage.doc.Constraint_android_id
            if (r11 == r12) goto L_0x0505
            int r12 = defpackage.doc.Constraint_android_layout_marginStart
            if (r12 == r11) goto L_0x0505
            int r12 = defpackage.doc.Constraint_android_layout_marginEnd
            if (r12 == r11) goto L_0x0505
            r8.getClass()
            r9.getClass()
            r6.getClass()
            r7.getClass()
        L_0x0505:
            int r12 = r4.get(r11)
            switch(r12) {
                case 1: goto L_0x0966;
                case 2: goto L_0x095a;
                case 3: goto L_0x094e;
                case 4: goto L_0x0942;
                case 5: goto L_0x0938;
                case 6: goto L_0x092c;
                case 7: goto L_0x0920;
                case 8: goto L_0x0914;
                case 9: goto L_0x0908;
                case 10: goto L_0x08fc;
                case 11: goto L_0x08f0;
                case 12: goto L_0x08e4;
                case 13: goto L_0x08d8;
                case 14: goto L_0x08cc;
                case 15: goto L_0x08c0;
                case 16: goto L_0x08b4;
                case 17: goto L_0x08a8;
                case 18: goto L_0x089c;
                case 19: goto L_0x0890;
                case 20: goto L_0x0884;
                case 21: goto L_0x0878;
                case 22: goto L_0x0868;
                case 23: goto L_0x085c;
                case 24: goto L_0x0850;
                case 25: goto L_0x0844;
                case 26: goto L_0x0838;
                case 27: goto L_0x082c;
                case 28: goto L_0x0820;
                case 29: goto L_0x0814;
                case 30: goto L_0x0808;
                case 31: goto L_0x07fc;
                case 32: goto L_0x07f0;
                case 33: goto L_0x07e4;
                case 34: goto L_0x07d8;
                case 35: goto L_0x07cc;
                case 36: goto L_0x07c0;
                case 37: goto L_0x07b4;
                case 38: goto L_0x07a8;
                case 39: goto L_0x079c;
                case 40: goto L_0x0790;
                case 41: goto L_0x0784;
                case 42: goto L_0x0778;
                case 43: goto L_0x076c;
                case 44: goto L_0x075d;
                case 45: goto L_0x0751;
                case 46: goto L_0x0745;
                case 47: goto L_0x0739;
                case 48: goto L_0x072d;
                case 49: goto L_0x0721;
                case 50: goto L_0x0715;
                case 51: goto L_0x0709;
                case 52: goto L_0x06fd;
                case 53: goto L_0x06f1;
                case 54: goto L_0x06e5;
                case 55: goto L_0x06da;
                case 56: goto L_0x06cf;
                case 57: goto L_0x06c4;
                case 58: goto L_0x06b9;
                case 59: goto L_0x06ae;
                case 60: goto L_0x06a3;
                case 61: goto L_0x0698;
                case 62: goto L_0x068d;
                case 63: goto L_0x0682;
                case 64: goto L_0x0677;
                case 65: goto L_0x0659;
                case 66: goto L_0x064d;
                case 67: goto L_0x0640;
                case 68: goto L_0x0633;
                case 69: goto L_0x0628;
                case 70: goto L_0x061d;
                case 71: goto L_0x0512;
                case 72: goto L_0x0612;
                case 73: goto L_0x0607;
                case 74: goto L_0x05fe;
                case 75: goto L_0x05f3;
                case 76: goto L_0x05e8;
                case 77: goto L_0x05df;
                case 78: goto L_0x05d4;
                case 79: goto L_0x05c9;
                case 80: goto L_0x05be;
                case 81: goto L_0x05b3;
                case 82: goto L_0x05a8;
                case 83: goto L_0x059d;
                case 84: goto L_0x0592;
                case 85: goto L_0x0588;
                case 86: goto L_0x055a;
                case 87: goto L_0x0553;
                case 88: goto L_0x050c;
                case 89: goto L_0x050c;
                case 90: goto L_0x050c;
                case 91: goto L_0x054a;
                case 92: goto L_0x0541;
                case 93: goto L_0x0538;
                case 94: goto L_0x052f;
                case 95: goto L_0x0526;
                case 96: goto L_0x0520;
                case 97: goto L_0x0517;
                default: goto L_0x050c;
            }
        L_0x050c:
            java.lang.Integer.toHexString(r11)
            r4.get(r11)
        L_0x0512:
            r11 = 1
        L_0x0513:
            r13 = 3
            r15 = 0
            goto L_0x0972
        L_0x0517:
            int r12 = r9.o0
            int r11 = r2.getInt(r11, r12)
            r9.o0 = r11
            goto L_0x0512
        L_0x0520:
            r12 = 1
            m(r9, r2, r11, r12)
            r11 = r12
            goto L_0x0513
        L_0x0526:
            r12 = 0
            m(r9, r2, r11, r12)
            r15 = r12
        L_0x052b:
            r11 = 1
            r13 = 3
            goto L_0x0972
        L_0x052f:
            int r12 = r9.S
            int r11 = r2.getDimensionPixelSize(r11, r12)
            r9.S = r11
            goto L_0x0512
        L_0x0538:
            int r12 = r9.L
            int r11 = r2.getDimensionPixelSize(r11, r12)
            r9.L = r11
            goto L_0x0512
        L_0x0541:
            int r12 = r9.r
            int r11 = l(r2, r11, r12)
            r9.r = r11
            goto L_0x0512
        L_0x054a:
            int r12 = r9.q
            int r11 = l(r2, r11, r12)
            r9.q = r11
            goto L_0x0512
        L_0x0553:
            java.lang.Integer.toHexString(r11)
            r4.get(r11)
            goto L_0x0512
        L_0x055a:
            android.util.TypedValue r12 = r2.peekValue(r11)
            int r12 = r12.type
            r13 = 1
            if (r12 != r13) goto L_0x056b
            r13 = -1
            int r11 = r2.getResourceId(r11, r13)
            r8.i = r11
            goto L_0x0512
        L_0x056b:
            r13 = -1
            r15 = 3
            if (r12 != r15) goto L_0x0582
            java.lang.String r12 = r2.getString(r11)
            r8.h = r12
            int r12 = r12.indexOf(r10)
            if (r12 <= 0) goto L_0x0512
            int r11 = r2.getResourceId(r11, r13)
            r8.i = r11
            goto L_0x0512
        L_0x0582:
            int r12 = r8.i
            r2.getInteger(r11, r12)
            goto L_0x0512
        L_0x0588:
            r13 = -1
            float r12 = r8.f
            float r11 = r2.getFloat(r11, r12)
            r8.f = r11
            goto L_0x0512
        L_0x0592:
            r13 = -1
            int r12 = r8.g
            int r11 = r2.getInteger(r11, r12)
            r8.g = r11
            goto L_0x0512
        L_0x059d:
            r13 = -1
            int r12 = r7.h
            int r11 = l(r2, r11, r12)
            r7.h = r11
            goto L_0x0512
        L_0x05a8:
            r13 = -1
            int r12 = r8.b
            int r11 = r2.getInteger(r11, r12)
            r8.b = r11
            goto L_0x0512
        L_0x05b3:
            r13 = -1
            boolean r12 = r9.m0
            boolean r11 = r2.getBoolean(r11, r12)
            r9.m0 = r11
            goto L_0x0512
        L_0x05be:
            r13 = -1
            boolean r12 = r9.l0
            boolean r11 = r2.getBoolean(r11, r12)
            r9.l0 = r11
            goto L_0x0512
        L_0x05c9:
            r13 = -1
            float r12 = r8.d
            float r11 = r2.getFloat(r11, r12)
            r8.d = r11
            goto L_0x0512
        L_0x05d4:
            r13 = -1
            int r12 = r6.b
            int r11 = r2.getInt(r11, r12)
            r6.b = r11
            goto L_0x0512
        L_0x05df:
            r13 = -1
            java.lang.String r11 = r2.getString(r11)
            r9.k0 = r11
            goto L_0x0512
        L_0x05e8:
            r13 = -1
            int r12 = r8.c
            int r11 = r2.getInt(r11, r12)
            r8.c = r11
            goto L_0x0512
        L_0x05f3:
            r13 = -1
            boolean r12 = r9.n0
            boolean r11 = r2.getBoolean(r11, r12)
            r9.n0 = r11
            goto L_0x0512
        L_0x05fe:
            r13 = -1
            java.lang.String r11 = r2.getString(r11)
            r9.j0 = r11
            goto L_0x0512
        L_0x0607:
            r13 = -1
            int r12 = r9.g0
            int r11 = r2.getDimensionPixelSize(r11, r12)
            r9.g0 = r11
            goto L_0x0512
        L_0x0612:
            r13 = -1
            int r12 = r9.f0
            int r11 = r2.getInt(r11, r12)
            r9.f0 = r11
            goto L_0x0512
        L_0x061d:
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = -1
            float r11 = r2.getFloat(r11, r12)
            r9.e0 = r11
            goto L_0x0512
        L_0x0628:
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = -1
            float r11 = r2.getFloat(r11, r12)
            r9.d0 = r11
            goto L_0x0512
        L_0x0633:
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = -1
            float r15 = r6.d
            float r11 = r2.getFloat(r11, r15)
            r6.d = r11
            goto L_0x0512
        L_0x0640:
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = -1
            float r15 = r8.e
            float r11 = r2.getFloat(r11, r15)
            r8.e = r11
            goto L_0x0512
        L_0x064d:
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = -1
            r15 = 0
            r2.getInt(r11, r15)
            r8.getClass()
            goto L_0x052b
        L_0x0659:
            r13 = -1
            r15 = 0
            android.util.TypedValue r12 = r2.peekValue(r11)
            int r12 = r12.type
            r13 = 3
            if (r12 != r13) goto L_0x066d
            r2.getString(r11)
            r8.getClass()
        L_0x066a:
            r11 = 1
            goto L_0x0972
        L_0x066d:
            int r11 = r2.getInteger(r11, r15)
            r11 = r5[r11]
            r8.getClass()
            goto L_0x066a
        L_0x0677:
            r13 = 3
            r15 = 0
            int r12 = r8.a
            int r11 = l(r2, r11, r12)
            r8.a = r11
            goto L_0x066a
        L_0x0682:
            r13 = 3
            r15 = 0
            float r12 = r9.B
            float r11 = r2.getFloat(r11, r12)
            r9.B = r11
            goto L_0x066a
        L_0x068d:
            r13 = 3
            r15 = 0
            int r12 = r9.A
            int r11 = r2.getDimensionPixelSize(r11, r12)
            r9.A = r11
            goto L_0x066a
        L_0x0698:
            r13 = 3
            r15 = 0
            int r12 = r9.z
            int r11 = l(r2, r11, r12)
            r9.z = r11
            goto L_0x066a
        L_0x06a3:
            r13 = 3
            r15 = 0
            float r12 = r7.a
            float r11 = r2.getFloat(r11, r12)
            r7.a = r11
            goto L_0x066a
        L_0x06ae:
            r13 = 3
            r15 = 0
            int r12 = r9.c0
            int r11 = r2.getDimensionPixelSize(r11, r12)
            r9.c0 = r11
            goto L_0x066a
        L_0x06b9:
            r13 = 3
            r15 = 0
            int r12 = r9.b0
            int r11 = r2.getDimensionPixelSize(r11, r12)
            r9.b0 = r11
            goto L_0x066a
        L_0x06c4:
            r13 = 3
            r15 = 0
            int r12 = r9.a0
            int r11 = r2.getDimensionPixelSize(r11, r12)
            r9.a0 = r11
            goto L_0x066a
        L_0x06cf:
            r13 = 3
            r15 = 0
            int r12 = r9.Z
            int r11 = r2.getDimensionPixelSize(r11, r12)
            r9.Z = r11
            goto L_0x066a
        L_0x06da:
            r13 = 3
            r15 = 0
            int r12 = r9.Y
            int r11 = r2.getInt(r11, r12)
            r9.Y = r11
            goto L_0x066a
        L_0x06e5:
            r13 = 3
            r15 = 0
            int r12 = r9.X
            int r11 = r2.getInt(r11, r12)
            r9.X = r11
            goto L_0x066a
        L_0x06f1:
            r13 = 3
            r15 = 0
            float r12 = r7.k
            float r11 = r2.getDimension(r11, r12)
            r7.k = r11
            goto L_0x066a
        L_0x06fd:
            r13 = 3
            r15 = 0
            float r12 = r7.j
            float r11 = r2.getDimension(r11, r12)
            r7.j = r11
            goto L_0x066a
        L_0x0709:
            r13 = 3
            r15 = 0
            float r12 = r7.i
            float r11 = r2.getDimension(r11, r12)
            r7.i = r11
            goto L_0x066a
        L_0x0715:
            r13 = 3
            r15 = 0
            float r12 = r7.g
            float r11 = r2.getDimension(r11, r12)
            r7.g = r11
            goto L_0x066a
        L_0x0721:
            r13 = 3
            r15 = 0
            float r12 = r7.f
            float r11 = r2.getDimension(r11, r12)
            r7.f = r11
            goto L_0x066a
        L_0x072d:
            r13 = 3
            r15 = 0
            float r12 = r7.e
            float r11 = r2.getFloat(r11, r12)
            r7.e = r11
            goto L_0x066a
        L_0x0739:
            r13 = 3
            r15 = 0
            float r12 = r7.d
            float r11 = r2.getFloat(r11, r12)
            r7.d = r11
            goto L_0x066a
        L_0x0745:
            r13 = 3
            r15 = 0
            float r12 = r7.c
            float r11 = r2.getFloat(r11, r12)
            r7.c = r11
            goto L_0x066a
        L_0x0751:
            r13 = 3
            r15 = 0
            float r12 = r7.b
            float r11 = r2.getFloat(r11, r12)
            r7.b = r11
            goto L_0x066a
        L_0x075d:
            r12 = 1
            r13 = 3
            r15 = 0
            r7.l = r12
            float r12 = r7.m
            float r11 = r2.getDimension(r11, r12)
            r7.m = r11
            goto L_0x066a
        L_0x076c:
            r13 = 3
            r15 = 0
            float r12 = r6.c
            float r11 = r2.getFloat(r11, r12)
            r6.c = r11
            goto L_0x066a
        L_0x0778:
            r13 = 3
            r15 = 0
            int r12 = r9.W
            int r11 = r2.getInt(r11, r12)
            r9.W = r11
            goto L_0x066a
        L_0x0784:
            r13 = 3
            r15 = 0
            int r12 = r9.V
            int r11 = r2.getInt(r11, r12)
            r9.V = r11
            goto L_0x066a
        L_0x0790:
            r13 = 3
            r15 = 0
            float r12 = r9.T
            float r11 = r2.getFloat(r11, r12)
            r9.T = r11
            goto L_0x066a
        L_0x079c:
            r13 = 3
            r15 = 0
            float r12 = r9.U
            float r11 = r2.getFloat(r11, r12)
            r9.U = r11
            goto L_0x066a
        L_0x07a8:
            r13 = 3
            r15 = 0
            int r12 = r1.a
            int r11 = r2.getResourceId(r11, r12)
            r1.a = r11
            goto L_0x066a
        L_0x07b4:
            r13 = 3
            r15 = 0
            float r12 = r9.x
            float r11 = r2.getFloat(r11, r12)
            r9.x = r11
            goto L_0x066a
        L_0x07c0:
            r13 = 3
            r15 = 0
            int r12 = r9.l
            int r11 = l(r2, r11, r12)
            r9.l = r11
            goto L_0x066a
        L_0x07cc:
            r13 = 3
            r15 = 0
            int r12 = r9.m
            int r11 = l(r2, r11, r12)
            r9.m = r11
            goto L_0x066a
        L_0x07d8:
            r13 = 3
            r15 = 0
            int r12 = r9.H
            int r11 = r2.getDimensionPixelSize(r11, r12)
            r9.H = r11
            goto L_0x066a
        L_0x07e4:
            r13 = 3
            r15 = 0
            int r12 = r9.t
            int r11 = l(r2, r11, r12)
            r9.t = r11
            goto L_0x066a
        L_0x07f0:
            r13 = 3
            r15 = 0
            int r12 = r9.s
            int r11 = l(r2, r11, r12)
            r9.s = r11
            goto L_0x066a
        L_0x07fc:
            r13 = 3
            r15 = 0
            int r12 = r9.K
            int r11 = r2.getDimensionPixelSize(r11, r12)
            r9.K = r11
            goto L_0x066a
        L_0x0808:
            r13 = 3
            r15 = 0
            int r12 = r9.k
            int r11 = l(r2, r11, r12)
            r9.k = r11
            goto L_0x066a
        L_0x0814:
            r13 = 3
            r15 = 0
            int r12 = r9.j
            int r11 = l(r2, r11, r12)
            r9.j = r11
            goto L_0x066a
        L_0x0820:
            r13 = 3
            r15 = 0
            int r12 = r9.G
            int r11 = r2.getDimensionPixelSize(r11, r12)
            r9.G = r11
            goto L_0x066a
        L_0x082c:
            r13 = 3
            r15 = 0
            int r12 = r9.E
            int r11 = r2.getInt(r11, r12)
            r9.E = r11
            goto L_0x066a
        L_0x0838:
            r13 = 3
            r15 = 0
            int r12 = r9.i
            int r11 = l(r2, r11, r12)
            r9.i = r11
            goto L_0x066a
        L_0x0844:
            r13 = 3
            r15 = 0
            int r12 = r9.h
            int r11 = l(r2, r11, r12)
            r9.h = r11
            goto L_0x066a
        L_0x0850:
            r13 = 3
            r15 = 0
            int r12 = r9.F
            int r11 = r2.getDimensionPixelSize(r11, r12)
            r9.F = r11
            goto L_0x066a
        L_0x085c:
            r13 = 3
            r15 = 0
            int r12 = r9.b
            int r11 = r2.getLayoutDimension(r11, r12)
            r9.b = r11
            goto L_0x066a
        L_0x0868:
            r13 = 3
            r15 = 0
            int r12 = r6.a
            int r11 = r2.getInt(r11, r12)
            r6.a = r11
            r11 = r3[r11]
            r6.a = r11
            goto L_0x066a
        L_0x0878:
            r13 = 3
            r15 = 0
            int r12 = r9.c
            int r11 = r2.getLayoutDimension(r11, r12)
            r9.c = r11
            goto L_0x066a
        L_0x0884:
            r13 = 3
            r15 = 0
            float r12 = r9.w
            float r11 = r2.getFloat(r11, r12)
            r9.w = r11
            goto L_0x066a
        L_0x0890:
            r13 = 3
            r15 = 0
            float r12 = r9.f
            float r11 = r2.getFloat(r11, r12)
            r9.f = r11
            goto L_0x066a
        L_0x089c:
            r13 = 3
            r15 = 0
            int r12 = r9.e
            int r11 = r2.getDimensionPixelOffset(r11, r12)
            r9.e = r11
            goto L_0x066a
        L_0x08a8:
            r13 = 3
            r15 = 0
            int r12 = r9.d
            int r11 = r2.getDimensionPixelOffset(r11, r12)
            r9.d = r11
            goto L_0x066a
        L_0x08b4:
            r13 = 3
            r15 = 0
            int r12 = r9.N
            int r11 = r2.getDimensionPixelSize(r11, r12)
            r9.N = r11
            goto L_0x066a
        L_0x08c0:
            r13 = 3
            r15 = 0
            int r12 = r9.R
            int r11 = r2.getDimensionPixelSize(r11, r12)
            r9.R = r11
            goto L_0x066a
        L_0x08cc:
            r13 = 3
            r15 = 0
            int r12 = r9.O
            int r11 = r2.getDimensionPixelSize(r11, r12)
            r9.O = r11
            goto L_0x066a
        L_0x08d8:
            r13 = 3
            r15 = 0
            int r12 = r9.M
            int r11 = r2.getDimensionPixelSize(r11, r12)
            r9.M = r11
            goto L_0x066a
        L_0x08e4:
            r13 = 3
            r15 = 0
            int r12 = r9.Q
            int r11 = r2.getDimensionPixelSize(r11, r12)
            r9.Q = r11
            goto L_0x066a
        L_0x08f0:
            r13 = 3
            r15 = 0
            int r12 = r9.P
            int r11 = r2.getDimensionPixelSize(r11, r12)
            r9.P = r11
            goto L_0x066a
        L_0x08fc:
            r13 = 3
            r15 = 0
            int r12 = r9.u
            int r11 = l(r2, r11, r12)
            r9.u = r11
            goto L_0x066a
        L_0x0908:
            r13 = 3
            r15 = 0
            int r12 = r9.v
            int r11 = l(r2, r11, r12)
            r9.v = r11
            goto L_0x066a
        L_0x0914:
            r13 = 3
            r15 = 0
            int r12 = r9.J
            int r11 = r2.getDimensionPixelSize(r11, r12)
            r9.J = r11
            goto L_0x066a
        L_0x0920:
            r13 = 3
            r15 = 0
            int r12 = r9.D
            int r11 = r2.getDimensionPixelOffset(r11, r12)
            r9.D = r11
            goto L_0x066a
        L_0x092c:
            r13 = 3
            r15 = 0
            int r12 = r9.C
            int r11 = r2.getDimensionPixelOffset(r11, r12)
            r9.C = r11
            goto L_0x066a
        L_0x0938:
            r13 = 3
            r15 = 0
            java.lang.String r11 = r2.getString(r11)
            r9.y = r11
            goto L_0x066a
        L_0x0942:
            r13 = 3
            r15 = 0
            int r12 = r9.n
            int r11 = l(r2, r11, r12)
            r9.n = r11
            goto L_0x066a
        L_0x094e:
            r13 = 3
            r15 = 0
            int r12 = r9.o
            int r11 = l(r2, r11, r12)
            r9.o = r11
            goto L_0x066a
        L_0x095a:
            r13 = 3
            r15 = 0
            int r12 = r9.I
            int r11 = r2.getDimensionPixelSize(r11, r12)
            r9.I = r11
            goto L_0x066a
        L_0x0966:
            r13 = 3
            r15 = 0
            int r12 = r9.p
            int r11 = l(r2, r11, r12)
            r9.p = r11
            goto L_0x066a
        L_0x0972:
            int r14 = r14 + r11
            goto L_0x04e7
        L_0x0975:
            java.lang.String r0 = r9.j0
            if (r0 == 0) goto L_0x097c
            r0 = 0
            r9.i0 = r0
        L_0x097c:
            r2.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pj3.i(android.content.Context, android.util.AttributeSet, boolean):kj3");
    }

    public static int l(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            if (r7 != 0) goto L_0x0003
            return
        L_0x0003:
            android.util.TypedValue r0 = r8.peekValue(r9)
            int r0 = r0.type
            r1 = 3
            r2 = 23
            r3 = 21
            r4 = 1
            r5 = 5
            r6 = 0
            if (r0 == r1) goto L_0x006f
            if (r0 == r5) goto L_0x002c
            int r8 = r8.getInt(r9, r6)
            r9 = -4
            r0 = -2
            if (r8 == r9) goto L_0x002a
            r9 = -3
            if (r8 == r9) goto L_0x0025
            if (r8 == r0) goto L_0x0027
            r9 = -1
            if (r8 == r9) goto L_0x0027
        L_0x0025:
            r4 = r6
            goto L_0x0031
        L_0x0027:
            r4 = r6
            r6 = r8
            goto L_0x0031
        L_0x002a:
            r6 = r0
            goto L_0x0031
        L_0x002c:
            int r8 = r8.getDimensionPixelSize(r9, r6)
            goto L_0x0027
        L_0x0031:
            boolean r8 = r7 instanceof defpackage.fj3
            if (r8 == 0) goto L_0x0043
            fj3 r7 = (defpackage.fj3) r7
            if (r10 != 0) goto L_0x003e
            r7.width = r6
            r7.W = r4
            goto L_0x006e
        L_0x003e:
            r7.height = r6
            r7.X = r4
            goto L_0x006e
        L_0x0043:
            boolean r8 = r7 instanceof defpackage.lj3
            if (r8 == 0) goto L_0x0055
            lj3 r7 = (defpackage.lj3) r7
            if (r10 != 0) goto L_0x0050
            r7.b = r6
            r7.l0 = r4
            goto L_0x006e
        L_0x0050:
            r7.c = r6
            r7.m0 = r4
            goto L_0x006e
        L_0x0055:
            boolean r8 = r7 instanceof defpackage.jj3
            if (r8 == 0) goto L_0x006e
            jj3 r7 = (defpackage.jj3) r7
            if (r10 != 0) goto L_0x0066
            r7.b(r2, r6)
            r8 = 80
            r7.d(r8, r4)
            goto L_0x006e
        L_0x0066:
            r7.b(r3, r6)
            r8 = 81
            r7.d(r8, r4)
        L_0x006e:
            return
        L_0x006f:
            java.lang.String r8 = r8.getString(r9)
            if (r8 != 0) goto L_0x0077
            goto L_0x0177
        L_0x0077:
            r9 = 61
            int r9 = r8.indexOf(r9)
            int r0 = r8.length()
            if (r9 <= 0) goto L_0x0177
            int r0 = r0 - r4
            if (r9 >= r0) goto L_0x0177
            java.lang.String r0 = r8.substring(r6, r9)
            int r9 = r9 + r4
            java.lang.String r8 = r8.substring(r9)
            int r9 = r8.length()
            if (r9 <= 0) goto L_0x0177
            java.lang.String r9 = r0.trim()
            java.lang.String r8 = r8.trim()
            java.lang.String r0 = "ratio"
            boolean r0 = r0.equalsIgnoreCase(r9)
            if (r0 == 0) goto L_0x00cc
            boolean r9 = r7 instanceof defpackage.fj3
            if (r9 == 0) goto L_0x00b7
            fj3 r7 = (defpackage.fj3) r7
            if (r10 != 0) goto L_0x00b0
            r7.width = r6
            goto L_0x00b2
        L_0x00b0:
            r7.height = r6
        L_0x00b2:
            n(r7, r8)
            goto L_0x0177
        L_0x00b7:
            boolean r9 = r7 instanceof defpackage.lj3
            if (r9 == 0) goto L_0x00c1
            lj3 r7 = (defpackage.lj3) r7
            r7.y = r8
            goto L_0x0177
        L_0x00c1:
            boolean r9 = r7 instanceof defpackage.jj3
            if (r9 == 0) goto L_0x0177
            jj3 r7 = (defpackage.jj3) r7
            r7.c(r5, r8)
            goto L_0x0177
        L_0x00cc:
            java.lang.String r0 = "weight"
            boolean r0 = r0.equalsIgnoreCase(r9)
            if (r0 == 0) goto L_0x011a
            float r8 = java.lang.Float.parseFloat(r8)     // Catch:{ NumberFormatException -> 0x0177 }
            boolean r9 = r7 instanceof defpackage.fj3     // Catch:{ NumberFormatException -> 0x0177 }
            if (r9 == 0) goto L_0x00ec
            fj3 r7 = (defpackage.fj3) r7     // Catch:{ NumberFormatException -> 0x0177 }
            if (r10 != 0) goto L_0x00e6
            r7.width = r6     // Catch:{ NumberFormatException -> 0x0177 }
            r7.H = r8     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x0177
        L_0x00e6:
            r7.height = r6     // Catch:{ NumberFormatException -> 0x0177 }
            r7.I = r8     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x0177
        L_0x00ec:
            boolean r9 = r7 instanceof defpackage.lj3     // Catch:{ NumberFormatException -> 0x0177 }
            if (r9 == 0) goto L_0x0100
            lj3 r7 = (defpackage.lj3) r7     // Catch:{ NumberFormatException -> 0x0177 }
            if (r10 != 0) goto L_0x00fa
            r7.b = r6     // Catch:{ NumberFormatException -> 0x0177 }
            r7.U = r8     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x0177
        L_0x00fa:
            r7.c = r6     // Catch:{ NumberFormatException -> 0x0177 }
            r7.T = r8     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x0177
        L_0x0100:
            boolean r9 = r7 instanceof defpackage.jj3     // Catch:{ NumberFormatException -> 0x0177 }
            if (r9 == 0) goto L_0x0177
            jj3 r7 = (defpackage.jj3) r7     // Catch:{ NumberFormatException -> 0x0177 }
            if (r10 != 0) goto L_0x0111
            r7.b(r2, r6)     // Catch:{ NumberFormatException -> 0x0177 }
            r9 = 39
            r7.a(r8, r9)     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x0177
        L_0x0111:
            r7.b(r3, r6)     // Catch:{ NumberFormatException -> 0x0177 }
            r9 = 40
            r7.a(r8, r9)     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x0177
        L_0x011a:
            java.lang.String r0 = "parent"
            boolean r9 = r0.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x0177
            float r8 = java.lang.Float.parseFloat(r8)     // Catch:{ NumberFormatException -> 0x0177 }
            r9 = 1065353216(0x3f800000, float:1.0)
            float r8 = java.lang.Math.min(r9, r8)     // Catch:{ NumberFormatException -> 0x0177 }
            r9 = 0
            float r8 = java.lang.Math.max(r9, r8)     // Catch:{ NumberFormatException -> 0x0177 }
            boolean r9 = r7 instanceof defpackage.fj3     // Catch:{ NumberFormatException -> 0x0177 }
            r0 = 2
            if (r9 == 0) goto L_0x0148
            fj3 r7 = (defpackage.fj3) r7     // Catch:{ NumberFormatException -> 0x0177 }
            if (r10 != 0) goto L_0x0141
            r7.width = r6     // Catch:{ NumberFormatException -> 0x0177 }
            r7.R = r8     // Catch:{ NumberFormatException -> 0x0177 }
            r7.L = r0     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x0177
        L_0x0141:
            r7.height = r6     // Catch:{ NumberFormatException -> 0x0177 }
            r7.S = r8     // Catch:{ NumberFormatException -> 0x0177 }
            r7.M = r0     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x0177
        L_0x0148:
            boolean r9 = r7 instanceof defpackage.lj3     // Catch:{ NumberFormatException -> 0x0177 }
            if (r9 == 0) goto L_0x015e
            lj3 r7 = (defpackage.lj3) r7     // Catch:{ NumberFormatException -> 0x0177 }
            if (r10 != 0) goto L_0x0157
            r7.b = r6     // Catch:{ NumberFormatException -> 0x0177 }
            r7.d0 = r8     // Catch:{ NumberFormatException -> 0x0177 }
            r7.X = r0     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x0177
        L_0x0157:
            r7.c = r6     // Catch:{ NumberFormatException -> 0x0177 }
            r7.e0 = r8     // Catch:{ NumberFormatException -> 0x0177 }
            r7.Y = r0     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x0177
        L_0x015e:
            boolean r8 = r7 instanceof defpackage.jj3     // Catch:{ NumberFormatException -> 0x0177 }
            if (r8 == 0) goto L_0x0177
            jj3 r7 = (defpackage.jj3) r7     // Catch:{ NumberFormatException -> 0x0177 }
            if (r10 != 0) goto L_0x016f
            r7.b(r2, r6)     // Catch:{ NumberFormatException -> 0x0177 }
            r8 = 54
            r7.b(r8, r0)     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x0177
        L_0x016f:
            r7.b(r3, r6)     // Catch:{ NumberFormatException -> 0x0177 }
            r8 = 55
            r7.b(r8, r0)     // Catch:{ NumberFormatException -> 0x0177 }
        L_0x0177:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pj3.m(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void n(fj3 fj3, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    i = substring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i2 = i;
                i = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i);
                if (substring2.length() > 0) {
                    Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > c44.DEFAULT_ASPECT_RATIO && parseFloat2 > c44.DEFAULT_ASPECT_RATIO) {
                            if (i2 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        fj3.G = str;
    }

    public static String p(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public final void a(ConstraintLayout constraintLayout) {
        b(constraintLayout);
        constraintLayout.setConstraintSet((pj3) null);
        constraintLayout.requestLayout();
    }

    public final void b(ConstraintLayout constraintLayout) {
        ConstraintLayout constraintLayout2 = constraintLayout;
        int i = 1;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = this.c;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i2 = 0; i2 < childCount; i2 += i) {
            View childAt = constraintLayout2.getChildAt(i2);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                try {
                    childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                }
            } else if (this.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1 && hashMap.containsKey(Integer.valueOf(id))) {
                hashSet.remove(Integer.valueOf(id));
                kj3 kj3 = (kj3) hashMap.get(Integer.valueOf(id));
                if (kj3 != null) {
                    if (childAt instanceof Barrier) {
                        lj3 lj3 = kj3.d;
                        lj3.h0 = i;
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(lj3.f0);
                        barrier.setMargin(lj3.g0);
                        barrier.setAllowsGoneWidget(lj3.n0);
                        int[] iArr = lj3.i0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = lj3.j0;
                            if (str != null) {
                                int[] h = h(barrier, str);
                                lj3.i0 = h;
                                barrier.setReferencedIds(h);
                            }
                        }
                    }
                    fj3 fj3 = (fj3) childAt.getLayoutParams();
                    fj3.a();
                    kj3.a(fj3);
                    HashMap hashMap2 = kj3.f;
                    Class<?> cls = childAt.getClass();
                    for (String str2 : hashMap2.keySet()) {
                        bj3 bj3 = (bj3) hashMap2.get(str2);
                        if (!bj3.a) {
                            str2 = a81.m("set", str2);
                        }
                        try {
                            switch (tr1.y(bj3.b)) {
                                case 0:
                                    cls.getMethod(str2, new Class[]{Integer.TYPE}).invoke(childAt, new Object[]{Integer.valueOf(bj3.c)});
                                    break;
                                case 1:
                                    cls.getMethod(str2, new Class[]{Float.TYPE}).invoke(childAt, new Object[]{Float.valueOf(bj3.d)});
                                    break;
                                case 2:
                                    cls.getMethod(str2, new Class[]{Integer.TYPE}).invoke(childAt, new Object[]{Integer.valueOf(bj3.g)});
                                    break;
                                case 3:
                                    Method method = cls.getMethod(str2, new Class[]{Drawable.class});
                                    ColorDrawable colorDrawable = new ColorDrawable();
                                    colorDrawable.setColor(bj3.g);
                                    method.invoke(childAt, new Object[]{colorDrawable});
                                    break;
                                case 4:
                                    cls.getMethod(str2, new Class[]{CharSequence.class}).invoke(childAt, new Object[]{bj3.e});
                                    break;
                                case 5:
                                    cls.getMethod(str2, new Class[]{Boolean.TYPE}).invoke(childAt, new Object[]{Boolean.valueOf(bj3.f)});
                                    break;
                                case 6:
                                    cls.getMethod(str2, new Class[]{Float.TYPE}).invoke(childAt, new Object[]{Float.valueOf(bj3.d)});
                                    break;
                                case 7:
                                    cls.getMethod(str2, new Class[]{Integer.TYPE}).invoke(childAt, new Object[]{Integer.valueOf(bj3.c)});
                                    break;
                            }
                        } catch (NoSuchMethodException e2) {
                            e2.getMessage();
                        } catch (IllegalAccessException e3) {
                            e3.printStackTrace();
                        } catch (InvocationTargetException e4) {
                            e4.printStackTrace();
                        }
                    }
                    childAt.setLayoutParams(fj3);
                    nj3 nj3 = kj3.b;
                    if (nj3.b == 0) {
                        childAt.setVisibility(nj3.a);
                    }
                    childAt.setAlpha(nj3.c);
                    oj3 oj3 = kj3.e;
                    childAt.setRotation(oj3.a);
                    childAt.setRotationX(oj3.b);
                    childAt.setRotationY(oj3.c);
                    childAt.setScaleX(oj3.d);
                    childAt.setScaleY(oj3.e);
                    if (oj3.h != -1) {
                        View findViewById = ((View) childAt.getParent()).findViewById(oj3.h);
                        if (findViewById != null) {
                            float bottom = ((float) (findViewById.getBottom() + findViewById.getTop())) / 2.0f;
                            float right = ((float) (findViewById.getRight() + findViewById.getLeft())) / 2.0f;
                            if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                childAt.setPivotX(right - ((float) childAt.getLeft()));
                                childAt.setPivotY(bottom - ((float) childAt.getTop()));
                            }
                        }
                    } else {
                        if (!Float.isNaN(oj3.f)) {
                            childAt.setPivotX(oj3.f);
                        }
                        if (!Float.isNaN(oj3.g)) {
                            childAt.setPivotY(oj3.g);
                        }
                    }
                    childAt.setTranslationX(oj3.i);
                    childAt.setTranslationY(oj3.j);
                    childAt.setTranslationZ(oj3.k);
                    if (oj3.l) {
                        childAt.setElevation(oj3.m);
                    }
                    i = 1;
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            kj3 kj32 = (kj3) hashMap.get(num);
            if (kj32 != null) {
                lj3 lj32 = kj32.d;
                if (lj32.h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = lj32.i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str3 = lj32.j0;
                        if (str3 != null) {
                            int[] h2 = h(barrier2, str3);
                            lj32.i0 = h2;
                            barrier2.setReferencedIds(h2);
                        }
                    }
                    barrier2.setType(lj32.f0);
                    barrier2.setMargin(lj32.g0);
                    x6e x6e = ConstraintLayout.D0;
                    fj3 fj32 = new fj3(-2, -2);
                    barrier2.k();
                    kj32.a(fj32);
                    constraintLayout2.addView(barrier2, fj32);
                }
                if (lj32.a) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    x6e x6e2 = ConstraintLayout.D0;
                    fj3 fj33 = new fj3(-2, -2);
                    kj32.a(fj33);
                    constraintLayout2.addView(guideline, fj33);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout2.getChildAt(i3);
            if (childAt2 instanceof dj3) {
                ((dj3) childAt2).f(constraintLayout2);
            }
        }
    }

    public final void c(int i, int i2) {
        kj3 kj3;
        HashMap hashMap = this.c;
        if (hashMap.containsKey(Integer.valueOf(i)) && (kj3 = (kj3) hashMap.get(Integer.valueOf(i))) != null) {
            lj3 lj3 = kj3.d;
            switch (i2) {
                case 1:
                    lj3.i = -1;
                    lj3.h = -1;
                    lj3.F = -1;
                    lj3.M = IntCompanionObject.MIN_VALUE;
                    return;
                case 2:
                    lj3.k = -1;
                    lj3.j = -1;
                    lj3.G = -1;
                    lj3.O = IntCompanionObject.MIN_VALUE;
                    return;
                case 3:
                    lj3.m = -1;
                    lj3.l = -1;
                    lj3.H = 0;
                    lj3.N = IntCompanionObject.MIN_VALUE;
                    return;
                case 4:
                    lj3.n = -1;
                    lj3.o = -1;
                    lj3.I = 0;
                    lj3.P = IntCompanionObject.MIN_VALUE;
                    return;
                case 5:
                    lj3.p = -1;
                    lj3.q = -1;
                    lj3.r = -1;
                    lj3.L = 0;
                    lj3.S = IntCompanionObject.MIN_VALUE;
                    return;
                case 6:
                    lj3.s = -1;
                    lj3.t = -1;
                    lj3.K = 0;
                    lj3.R = IntCompanionObject.MIN_VALUE;
                    return;
                case 7:
                    lj3.u = -1;
                    lj3.v = -1;
                    lj3.J = 0;
                    lj3.Q = IntCompanionObject.MIN_VALUE;
                    return;
                case 8:
                    lj3.B = -1.0f;
                    lj3.A = -1;
                    lj3.z = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        pj3 pj3 = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = pj3.c;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            fj3 fj3 = (fj3) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!pj3.b || id != -1) {
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new kj3());
                }
                kj3 kj3 = (kj3) hashMap.get(Integer.valueOf(id));
                if (kj3 != null) {
                    HashMap hashMap2 = pj3.a;
                    HashMap hashMap3 = new HashMap();
                    Class<?> cls = childAt.getClass();
                    for (String str : hashMap2.keySet()) {
                        bj3 bj3 = (bj3) hashMap2.get(str);
                        try {
                            if (str.equals("BackgroundColor")) {
                                hashMap3.put(str, new bj3(bj3, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } else {
                                hashMap3.put(str, new bj3(bj3, cls.getMethod("getMap" + str, (Class[]) null).invoke(childAt, (Object[]) null)));
                            }
                        } catch (NoSuchMethodException e2) {
                            e2.printStackTrace();
                        } catch (IllegalAccessException e3) {
                            e3.printStackTrace();
                        } catch (InvocationTargetException e4) {
                            e4.printStackTrace();
                        }
                    }
                    kj3.f = hashMap3;
                    kj3.a = id;
                    int i2 = fj3.e;
                    lj3 lj3 = kj3.d;
                    lj3.h = i2;
                    lj3.i = fj3.f;
                    lj3.j = fj3.g;
                    lj3.k = fj3.h;
                    lj3.l = fj3.i;
                    lj3.m = fj3.j;
                    lj3.n = fj3.k;
                    lj3.o = fj3.l;
                    lj3.p = fj3.m;
                    lj3.q = fj3.n;
                    lj3.r = fj3.o;
                    lj3.s = fj3.s;
                    lj3.t = fj3.t;
                    lj3.u = fj3.u;
                    lj3.v = fj3.v;
                    lj3.w = fj3.E;
                    lj3.x = fj3.F;
                    lj3.y = fj3.G;
                    lj3.z = fj3.p;
                    lj3.A = fj3.q;
                    lj3.B = fj3.r;
                    lj3.C = fj3.T;
                    lj3.D = fj3.U;
                    lj3.E = fj3.V;
                    lj3.f = fj3.c;
                    lj3.d = fj3.a;
                    lj3.e = fj3.b;
                    lj3.b = fj3.width;
                    lj3.c = fj3.height;
                    lj3.F = fj3.leftMargin;
                    lj3.G = fj3.rightMargin;
                    lj3.H = fj3.topMargin;
                    lj3.I = fj3.bottomMargin;
                    lj3.L = fj3.D;
                    lj3.T = fj3.I;
                    lj3.U = fj3.H;
                    lj3.W = fj3.K;
                    lj3.V = fj3.J;
                    lj3.l0 = fj3.W;
                    lj3.m0 = fj3.X;
                    lj3.X = fj3.L;
                    lj3.Y = fj3.M;
                    lj3.Z = fj3.P;
                    lj3.a0 = fj3.Q;
                    lj3.b0 = fj3.N;
                    lj3.c0 = fj3.O;
                    lj3.d0 = fj3.R;
                    lj3.e0 = fj3.S;
                    lj3.k0 = fj3.Y;
                    lj3.N = fj3.x;
                    lj3.P = fj3.z;
                    lj3.M = fj3.w;
                    lj3.O = fj3.y;
                    lj3.R = fj3.A;
                    lj3.Q = fj3.B;
                    lj3.S = fj3.C;
                    lj3.o0 = fj3.Z;
                    lj3.J = fj3.getMarginEnd();
                    lj3.K = fj3.getMarginStart();
                    int visibility = childAt.getVisibility();
                    nj3 nj3 = kj3.b;
                    nj3.a = visibility;
                    nj3.c = childAt.getAlpha();
                    float rotation = childAt.getRotation();
                    oj3 oj3 = kj3.e;
                    oj3.a = rotation;
                    oj3.b = childAt.getRotationX();
                    oj3.c = childAt.getRotationY();
                    oj3.d = childAt.getScaleX();
                    oj3.e = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        oj3.f = pivotX;
                        oj3.g = pivotY;
                    }
                    oj3.i = childAt.getTranslationX();
                    oj3.j = childAt.getTranslationY();
                    oj3.k = childAt.getTranslationZ();
                    if (oj3.l) {
                        oj3.m = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        lj3.n0 = barrier.getAllowsGoneWidget();
                        lj3.i0 = barrier.getReferencedIds();
                        lj3.f0 = barrier.getType();
                        lj3.g0 = barrier.getMargin();
                    }
                }
                i++;
                pj3 = this;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final void e(int i, int i2, int i3, int i4) {
        HashMap hashMap = this.c;
        if (!hashMap.containsKey(Integer.valueOf(i))) {
            hashMap.put(Integer.valueOf(i), new kj3());
        }
        kj3 kj3 = (kj3) hashMap.get(Integer.valueOf(i));
        if (kj3 != null) {
            lj3 lj3 = kj3.d;
            switch (i2) {
                case 1:
                    if (i4 == 1) {
                        lj3.h = i3;
                        lj3.i = -1;
                        return;
                    } else if (i4 == 2) {
                        lj3.i = i3;
                        lj3.h = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("left to " + p(i4) + " undefined");
                    }
                case 2:
                    if (i4 == 1) {
                        lj3.j = i3;
                        lj3.k = -1;
                        return;
                    } else if (i4 == 2) {
                        lj3.k = i3;
                        lj3.j = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + p(i4) + " undefined");
                    }
                case 3:
                    if (i4 == 3) {
                        lj3.l = i3;
                        lj3.m = -1;
                        lj3.p = -1;
                        lj3.q = -1;
                        lj3.r = -1;
                        return;
                    } else if (i4 == 4) {
                        lj3.m = i3;
                        lj3.l = -1;
                        lj3.p = -1;
                        lj3.q = -1;
                        lj3.r = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + p(i4) + " undefined");
                    }
                case 4:
                    if (i4 == 4) {
                        lj3.o = i3;
                        lj3.n = -1;
                        lj3.p = -1;
                        lj3.q = -1;
                        lj3.r = -1;
                        return;
                    } else if (i4 == 3) {
                        lj3.n = i3;
                        lj3.o = -1;
                        lj3.p = -1;
                        lj3.q = -1;
                        lj3.r = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + p(i4) + " undefined");
                    }
                case 5:
                    if (i4 == 5) {
                        lj3.p = i3;
                        lj3.o = -1;
                        lj3.n = -1;
                        lj3.l = -1;
                        lj3.m = -1;
                        return;
                    } else if (i4 == 3) {
                        lj3.q = i3;
                        lj3.o = -1;
                        lj3.n = -1;
                        lj3.l = -1;
                        lj3.m = -1;
                        return;
                    } else if (i4 == 4) {
                        lj3.r = i3;
                        lj3.o = -1;
                        lj3.n = -1;
                        lj3.l = -1;
                        lj3.m = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + p(i4) + " undefined");
                    }
                case 6:
                    if (i4 == 6) {
                        lj3.t = i3;
                        lj3.s = -1;
                        return;
                    } else if (i4 == 7) {
                        lj3.s = i3;
                        lj3.t = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + p(i4) + " undefined");
                    }
                case 7:
                    if (i4 == 7) {
                        lj3.v = i3;
                        lj3.u = -1;
                        return;
                    } else if (i4 == 6) {
                        lj3.u = i3;
                        lj3.v = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + p(i4) + " undefined");
                    }
                default:
                    throw new IllegalArgumentException(p(i2) + " to " + p(i4) + " unknown");
            }
        }
    }

    public final void f(int i, int i2) {
        j(i).d.c = i2;
    }

    public final void g(int i, int i2) {
        j(i).d.b = i2;
    }

    public final kj3 j(int i) {
        HashMap hashMap = this.c;
        if (!hashMap.containsKey(Integer.valueOf(i))) {
            hashMap.put(Integer.valueOf(i), new kj3());
        }
        return (kj3) hashMap.get(Integer.valueOf(i));
    }

    public final void k(int i, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    kj3 i2 = i(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        i2.d.a = true;
                    }
                    this.c.put(Integer.valueOf(i2.a), i2);
                }
            }
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    public final void o(int i, int i2, int i3) {
        kj3 j = j(i);
        switch (i2) {
            case 1:
                j.d.F = i3;
                return;
            case 2:
                j.d.G = i3;
                return;
            case 3:
                j.d.H = i3;
                return;
            case 4:
                j.d.I = i3;
                return;
            case 5:
                j.d.L = i3;
                return;
            case 6:
                j.d.K = i3;
                return;
            case 7:
                j.d.J = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }
}
