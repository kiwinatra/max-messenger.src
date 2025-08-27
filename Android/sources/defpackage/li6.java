package defpackage;

import android.content.Context;
import android.widget.Toast;
import ru.ok.messages.stickers.FrgStickerPreview;

/* renamed from: li6  reason: default package */
public final /* synthetic */ class li6 implements x6 {
    public final /* synthetic */ FrgStickerPreview a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ li6(FrgStickerPreview frgStickerPreview, boolean z) {
        this.a = frgStickerPreview;
        this.b = z;
    }

    public final void run() {
        CharSequence charSequence;
        FrgStickerPreview frgStickerPreview = this.a;
        frgStickerPreview.getClass();
        z68.a("ru.ok.messages.stickers.FrgStickerPreview", "Sticker marked");
        Context O1 = frgStickerPreview.O1();
        if (O1 != null) {
            if (this.b) {
                charSequence = frgStickerPreview.R1().getText(qad.E9);
            } else {
                int i = pad.j;
                String[] strArr = ghf.c;
                charSequence = O1.getResources().getQuantityString(i, 1);
            }
            Toast makeText = Toast.makeText(O1, charSequence, 0);
            frgStickerPreview.o2 = makeText;
            makeText.show();
        }
    }
}
