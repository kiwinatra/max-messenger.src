package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;

/* renamed from: mse  reason: default package */
public final class mse extends xu6 {
    public final /* synthetic */ int c;
    public final Object d;
    public final Object e;

    public /* synthetic */ mse(GridLayoutManager gridLayoutManager, tyc tyc, int i) {
        this.c = i;
        this.d = gridLayoutManager;
        this.e = tyc;
    }

    public final int c(int i) {
        int l;
        GridLayoutManager u;
        switch (this.c) {
            case 0:
                tyc tyc = (tyc) this.e;
                if (i < tyc.j()) {
                    int l2 = tyc.l(i);
                    int i2 = lic.view_type_sticker_section_footer;
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) this.d;
                    if (l2 == i2) {
                        return gridLayoutManager.F;
                    }
                    if (l2 == lic.view_type_sticker_section_header) {
                        return gridLayoutManager.F;
                    }
                    if (l2 == lic.view_type_sticker_section_banners) {
                        return gridLayoutManager.F;
                    }
                }
                return 1;
            case 1:
                tyc tyc2 = (tyc) this.e;
                if (i >= tyc2.j() || ((l = tyc2.l(i)) != fza.i && l != fza.j && l != zua.r)) {
                    return 1;
                }
                return ((GridLayoutManager) this.d).F;
            default:
                KeyboardEmojiWidget keyboardEmojiWidget = (KeyboardEmojiWidget) this.d;
                if (i >= keyboardEmojiWidget.v.j() || keyboardEmojiWidget.v.l(i) != zua.q || (u = y7e.u((RecyclerView) this.e)) == null) {
                    return 1;
                }
                return u.F;
        }
    }

    public mse(KeyboardEmojiWidget keyboardEmojiWidget, RecyclerView recyclerView) {
        this.c = 2;
        this.d = keyboardEmojiWidget;
        this.e = recyclerView;
    }
}
