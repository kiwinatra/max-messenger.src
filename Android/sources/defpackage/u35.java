package defpackage;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* renamed from: u35  reason: default package */
public final class u35 extends q15 {
    public final /* synthetic */ int a = 0;
    public final WeakReference b;

    public u35(EditText editText) {
        this.b = new WeakReference(editText);
    }

    public void h(Throwable th) {
        switch (this.a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.b.get();
                if (switchCompat != null) {
                    switchCompat.d();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void i() {
        switch (this.a) {
            case 0:
                w35.a((EditText) this.b.get(), 1);
                return;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.b.get();
                if (switchCompat != null) {
                    switchCompat.d();
                    return;
                }
                return;
        }
    }

    public u35(SwitchCompat switchCompat) {
        this.b = new WeakReference(switchCompat);
    }
}
