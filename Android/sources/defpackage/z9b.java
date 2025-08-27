package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* renamed from: z9b  reason: default package */
public final class z9b extends p65 {
    public final int e = qfc.design_password_eye;
    public EditText f;
    public final u99 g = new u99(14, (Object) this);

    public z9b(o65 o65, int i) {
        super(o65);
        if (i != 0) {
            this.e = i;
        }
    }

    public final void b() {
        q();
    }

    public final int c() {
        return ymc.password_toggle_content_description;
    }

    public final int d() {
        return this.e;
    }

    public final View.OnClickListener f() {
        return this.g;
    }

    public final boolean k() {
        return true;
    }

    public final boolean l() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    public final void m(EditText editText) {
        this.f = editText;
        q();
    }

    public final void r() {
        EditText editText = this.f;
        if (editText == null) {
            return;
        }
        if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
            this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final void s() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
