package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;

/* renamed from: jza  reason: default package */
public final /* synthetic */ class jza implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pza b;

    public /* synthetic */ jza(pza pza, int i) {
        this.a = i;
        this.b = pza;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.d();
                return;
            case 1:
                pza pza = this.b;
                pza.b();
                mza mza = pza.x;
                if (mza != null) {
                    mza.n();
                    return;
                }
                return;
            case 2:
                this.b.d();
                return;
            default:
                ((AppCompatEditText) this.b.A0.getValue()).setText((CharSequence) null);
                return;
        }
    }
}
