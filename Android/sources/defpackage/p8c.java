package defpackage;

import android.animation.TypeEvaluator;

/* renamed from: p8c  reason: default package */
public final class p8c implements TypeEvaluator {
    public lab[] a = null;

    public final Object evaluate(float f, Object obj, Object obj2) {
        lab[] labArr = (lab[]) obj;
        lab[] labArr2 = (lab[]) obj2;
        if (b59.g(labArr, labArr2)) {
            if (!b59.g(this.a, labArr)) {
                this.a = labArr != null ? b59.r(labArr) : null;
            }
            lab[] labArr3 = this.a;
            if (labArr3 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            } else if (labArr != null) {
                int length = labArr.length;
                for (int i = 0; i < length; i++) {
                    if (labArr2 != null) {
                        labArr3[i].b(labArr[i], labArr2[i], f);
                    }
                }
                return labArr3;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }
}
