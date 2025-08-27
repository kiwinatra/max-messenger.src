package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* renamed from: mj3  reason: default package */
public final class mj3 {
    public static final SparseIntArray j;
    public int a;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public int g;
    public String h;
    public int i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        j = sparseIntArray;
        sparseIntArray.append(doc.Motion_motionPathRotate, 1);
        sparseIntArray.append(doc.Motion_pathMotionArc, 2);
        sparseIntArray.append(doc.Motion_transitionEasing, 3);
        sparseIntArray.append(doc.Motion_drawPath, 4);
        sparseIntArray.append(doc.Motion_animateRelativeTo, 5);
        sparseIntArray.append(doc.Motion_animateCircleAngleTo, 6);
        sparseIntArray.append(doc.Motion_motionStagger, 7);
        sparseIntArray.append(doc.Motion_quantizeMotionSteps, 8);
        sparseIntArray.append(doc.Motion_quantizeMotionPhase, 9);
        sparseIntArray.append(doc.Motion_quantizeMotionInterpolator, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, doc.Motion);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            switch (j.get(index)) {
                case 1:
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 2:
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type != 3) {
                        String str = cjf.a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    } else {
                        obtainStyledAttributes.getString(index);
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.a = pj3.l(obtainStyledAttributes, index, this.a);
                    break;
                case 6:
                    this.b = obtainStyledAttributes.getInteger(index, this.b);
                    break;
                case 7:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 8:
                    this.g = obtainStyledAttributes.getInteger(index, this.g);
                    break;
                case 9:
                    this.f = obtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 10:
                    int i3 = obtainStyledAttributes.peekValue(index).type;
                    if (i3 != 1) {
                        if (i3 != 3) {
                            obtainStyledAttributes.getInteger(index, this.i);
                            break;
                        } else {
                            String string = obtainStyledAttributes.getString(index);
                            this.h = string;
                            if (string.indexOf("/") <= 0) {
                                break;
                            } else {
                                this.i = obtainStyledAttributes.getResourceId(index, -1);
                                break;
                            }
                        }
                    } else {
                        this.i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
