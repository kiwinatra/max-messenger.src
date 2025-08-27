package defpackage;

import android.view.View;
import ru.ok.messages.settings.folders.edit.presentation.FolderEditFragment;

/* renamed from: i23  reason: default package */
public final /* synthetic */ class i23 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i23(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                l23 l23 = (l23) this.b;
                l23.t(l23.u());
                return;
            case 1:
                kx4 kx4 = (kx4) this.b;
                kx4.l = z;
                kx4.q();
                if (!z) {
                    kx4.t(false);
                    kx4.m = false;
                    return;
                }
                return;
            case 2:
                ((FolderEditFragment) this.b).G1.g().setCounterEnabled(z);
                return;
            default:
                if (!z) {
                    ((zwa) this.b).v = false;
                    return;
                }
                return;
        }
    }
}
