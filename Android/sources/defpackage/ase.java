package defpackage;

import android.view.View;
import ru.ok.messages.stickers.widgets.StickerView;

/* renamed from: ase  reason: default package */
public final /* synthetic */ class ase implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickerView b;

    public /* synthetic */ ase(StickerView stickerView, int i) {
        this.a = i;
        this.b = stickerView;
    }

    public final void onClick(View view) {
        StickerView stickerView = this.b;
        switch (this.a) {
            case 0:
                int i = StickerView.N0;
                stickerView.v();
                return;
            default:
                int i2 = StickerView.N0;
                stickerView.v();
                return;
        }
    }
}
