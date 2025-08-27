package defpackage;

import android.view.View;
import ru.ok.messages.stickers.widgets.StickerView;

/* renamed from: bse  reason: default package */
public final class bse extends fqc {
    public final /* synthetic */ int h;
    public final /* synthetic */ View i;
    public final /* synthetic */ StickerView j;

    public /* synthetic */ bse(StickerView stickerView, View view, int i2) {
        this.h = i2;
        this.j = stickerView;
        this.i = view;
    }

    public final void D() {
        switch (this.h) {
            case 0:
                StickerView stickerView = this.j;
                x1a x1a = stickerView.z0;
                if (x1a != null) {
                    m48 m48 = (m48) x1a.b;
                    if (m48.g == x1a && m48.f != null) {
                        stickerView.z.setVisibility(8);
                        this.i.setAlpha(1.0f);
                        x1a x1a2 = stickerView.z0;
                        m48 m482 = (m48) x1a2.b;
                        if (m482.g == x1a2 && m482.f != null) {
                            m482.o();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                View view = this.i;
                view.setVisibility(8);
                view.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                this.j.w();
                return;
        }
    }
}
