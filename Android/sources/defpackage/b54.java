package defpackage;

import android.view.View;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: b54  reason: default package */
public final class b54 extends p65 {
    public final /* synthetic */ int e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b54(o65 o65, int i) {
        super(o65);
        this.e = i;
    }

    public void r() {
        switch (this.e) {
            case 0:
                o65 o65 = this.b;
                o65.A0 = null;
                CheckableImageButton checkableImageButton = o65.x;
                checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
                hd8.V(checkableImageButton, (View.OnLongClickListener) null);
                return;
            default:
                return;
        }
    }
}
