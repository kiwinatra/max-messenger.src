package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* renamed from: s35  reason: default package */
public final class s35 extends y64 {
    public final TextView f;
    public final h25 g;
    public boolean h = true;

    public s35(TextView textView) {
        this.f = textView;
        this.g = new h25(textView);
    }

    public final void D(boolean z) {
        if (z) {
            TextView textView = this.f;
            textView.setTransformationMethod(N(textView.getTransformationMethod()));
        }
    }

    public final void E(boolean z) {
        this.h = z;
        TextView textView = this.f;
        textView.setTransformationMethod(N(textView.getTransformationMethod()));
        textView.setFilters(t(textView.getFilters()));
    }

    public final TransformationMethod N(TransformationMethod transformationMethod) {
        return this.h ? (!(transformationMethod instanceof x35) && !(transformationMethod instanceof PasswordTransformationMethod)) ? new x35(transformationMethod) : transformationMethod : transformationMethod instanceof x35 ? ((x35) transformationMethod).a : transformationMethod;
    }

    public final InputFilter[] t(InputFilter[] inputFilterArr) {
        if (!this.h) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof h25) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - sparseArray.size())];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            h25 h25 = this.g;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[(inputFilterArr.length + 1)];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = h25;
                return inputFilterArr3;
            } else if (inputFilterArr[i4] == h25) {
                return inputFilterArr;
            } else {
                i4++;
            }
        }
    }

    public final boolean v() {
        return this.h;
    }
}
