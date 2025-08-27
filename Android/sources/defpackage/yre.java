package defpackage;

import ru.ok.messages.stickers.widgets.StickerView;

/* renamed from: yre  reason: default package */
public final /* synthetic */ class yre implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickerView b;

    public /* synthetic */ yre(StickerView stickerView, int i) {
        this.a = i;
        this.b = stickerView;
    }

    public final void run() {
        StickerView stickerView = this.b;
        switch (this.a) {
            case 0:
                int i = StickerView.N0;
                stickerView.getClass();
                stickerView.y(goe.a);
                return;
            case 1:
                int i2 = StickerView.N0;
                stickerView.D();
                return;
            case 2:
                stickerView.z.setClickable(true);
                return;
            default:
                stickerView.x(false);
                return;
        }
    }
}
