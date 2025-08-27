package defpackage;

import androidx.biometric.BiometricViewModel;
import java.lang.ref.WeakReference;

/* renamed from: vn0  reason: default package */
public final class vn0 implements fv7 {
    public final WeakReference a;

    public vn0(BiometricViewModel biometricViewModel) {
        this.a = new WeakReference(biometricViewModel);
    }

    @mma(hu7.ON_DESTROY)
    public void resetCallback() {
        WeakReference weakReference = this.a;
        if (weakReference.get() != null) {
            ((BiometricViewModel) weakReference.get()).getClass();
        }
    }
}
