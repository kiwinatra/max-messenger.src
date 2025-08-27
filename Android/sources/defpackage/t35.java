package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* renamed from: t35  reason: default package */
public final class t35 extends y64 {
    public final s35 f;

    public t35(TextView textView) {
        this.f = new s35(textView);
    }

    public final void D(boolean z) {
        if (!(!(s15.p != null))) {
            this.f.D(z);
        }
    }

    public final void E(boolean z) {
        boolean z2 = !(s15.p != null);
        s35 s35 = this.f;
        if (z2) {
            s35.h = z;
        } else {
            s35.E(z);
        }
    }

    public final TransformationMethod N(TransformationMethod transformationMethod) {
        return (s15.p != null) ^ true ? transformationMethod : this.f.N(transformationMethod);
    }

    public final InputFilter[] t(InputFilter[] inputFilterArr) {
        return (s15.p != null) ^ true ? inputFilterArr : this.f.t(inputFilterArr);
    }

    public final boolean v() {
        return this.f.h;
    }
}
