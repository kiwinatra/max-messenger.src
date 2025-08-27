package defpackage;

import android.widget.LinearLayout;
import ru.ok.messages.settings.folders.picker.FoldersPickerFragment;

/* renamed from: c76  reason: default package */
public final class c76 extends fqc {
    public final /* synthetic */ int h;
    public final /* synthetic */ LinearLayout i;
    public final /* synthetic */ FoldersPickerFragment j;

    public /* synthetic */ c76(LinearLayout linearLayout, FoldersPickerFragment foldersPickerFragment, int i2) {
        this.h = i2;
        this.i = linearLayout;
        this.j = foldersPickerFragment;
    }

    public final void D() {
        switch (this.h) {
            case 0:
                this.i.setVisibility(8);
                this.j.L1 = null;
                return;
            default:
                this.i.setVisibility(0);
                this.j.K1 = null;
                return;
        }
    }
}
