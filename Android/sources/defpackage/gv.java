package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.List;
import java.util.Objects;
import ru.ok.messages.stickers.FrgStickerPreview;

/* renamed from: gv  reason: default package */
public final class gv extends jj0 {
    public gb8 X;
    public FrgStickerPreview Y;
    public fv v;
    public final Drawable w;
    public xoe x;
    public final int y;
    public final int z;

    public gv(Drawable drawable, int i, xoe xoe, gb8 gb8) {
        super((j4b) new w63(14));
        this.w = drawable;
        this.x = xoe;
        this.y = i;
        this.z = Math.min(350, i);
        this.X = gb8;
    }

    public final void F(List list, List list2) {
        if (this.Y == null) {
            return;
        }
        if (!list.isEmpty() || !list2.isEmpty()) {
            FrgStickerPreview frgStickerPreview = this.Y;
            frgStickerPreview.getClass();
            frgStickerPreview.T2(y64.B(new mi6(frgStickerPreview, 0)));
        }
    }

    public final void G(List list) {
        List list2 = ((ov) this.o).f;
        if (!list2.isEmpty() && list != null && !list.isEmpty() && !TextUtils.equals(((qq7) list2.get(0)).a, ((qq7) list.get(0)).a)) {
            super.G((List) null);
        }
        super.G(list);
    }

    public final void I() {
        List list = ((ov) this.o).f;
        if (!list.isEmpty()) {
            super.G((List) null);
            G(list);
        }
    }

    public final void J(fv fvVar) {
        if (this.v != fvVar) {
            this.v = fvVar;
            if (j() > 0) {
                I();
            }
        }
    }

    public final void K(xoe xoe) {
        if (!Objects.equals(xoe, this.x)) {
            this.x = xoe;
            if (xoe != null && j() > 0) {
                I();
            }
        }
    }

    public final int l(int i) {
        return "more_stickers".equals(((qq7) E(i)).a) ? tic.view_type_more_stickers : tic.view_type_sticker;
    }

    public final void s(pzc pzc, int i) {
        if (pzc instanceof it9) {
            it9 it9 = (it9) pzc;
            it9.F0 = this.v;
            it9.M(this.x);
            return;
        }
        hse hse = (hse) pzc;
        hse.K0 = this.v;
        hse.M((qq7) E(i), this.x);
    }

    public final void t(pzc pzc, int i, List list) {
        if (list.isEmpty()) {
            s(pzc, i);
        } else if (pzc instanceof it9) {
            it9 it9 = (it9) pzc;
            it9.F0 = this.v;
            it9.M(this.x);
        } else {
            hse hse = (hse) pzc;
            hse.K0 = this.v;
            hse.N((qq7) E(i), this.x, m58.C(list));
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        int i2 = tic.view_type_more_stickers;
        int i3 = this.y;
        if (i == i2) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(ljc.more_stickers_item_view, viewGroup, false);
            View findViewById = inflate.findViewById(tic.more_stickers_item_view__fl_holder);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.height = i3;
            layoutParams.width = i3;
            findViewById.setLayoutParams(layoutParams);
            return new it9(inflate, this.v);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(ljc.keyboard_sticker_item_view, viewGroup, false);
        View findViewById2 = inflate2.findViewById(tic.keyboard_sticker_item_view__cs_holder);
        fj3 fj3 = (fj3) findViewById2.getLayoutParams();
        fj3.height = i3;
        fj3.width = i3;
        findViewById2.setLayoutParams(fj3);
        return new hse(inflate2, this.w, this.v, this.z, this.X);
    }
}
