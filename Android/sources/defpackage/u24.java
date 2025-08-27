package defpackage;

import androidx.appcompat.widget.AppCompatEditText;

/* renamed from: u24  reason: default package */
public final class u24 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppCompatEditText b;

    public /* synthetic */ u24(AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2, int i) {
        this.a = i;
        this.b = appCompatEditText2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.requestFocus();
                return;
            default:
                AppCompatEditText appCompatEditText = this.b;
                appCompatEditText.setSelection(appCompatEditText.length());
                return;
        }
    }
}
