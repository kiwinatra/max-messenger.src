package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.List;

/* renamed from: sq7  reason: default package */
public final class sq7 extends tyc {
    public int X = 0;
    public final gb8 Y;
    public rq7 o;
    public final Drawable v;
    public final xoe w;
    public final int x;
    public final int y;
    public List z = Collections.emptyList();

    public sq7(Drawable drawable, int i, xoe xoe, gb8 gb8) {
        this.v = drawable;
        this.w = xoe;
        this.x = i;
        this.y = Math.min(350, i);
        this.Y = gb8;
        C(true);
    }

    public final int j() {
        return this.z.size();
    }

    public final long k(int i) {
        return (long) ((qq7) this.z.get(i)).a.hashCode();
    }

    public final int l(int i) {
        int i2;
        int i3;
        if ("more_stickers".equals(((qq7) this.z.get(i)).a)) {
            i2 = tic.view_type_more_stickers;
            i3 = this.X;
        } else {
            i2 = tic.view_type_sticker;
            i3 = this.X;
        }
        return i3 ^ i2;
    }

    public final void s(pzc pzc, int i) {
        boolean z2 = pzc instanceof it9;
        xoe xoe = this.w;
        if (z2) {
            it9 it9 = (it9) pzc;
            it9.F0 = this.o;
            it9.M(xoe);
            return;
        }
        hse hse = (hse) pzc;
        hse.K0 = this.o;
        hse.M((qq7) this.z.get(i), xoe);
    }

    public final void t(pzc pzc, int i, List list) {
        if (list.isEmpty()) {
            s(pzc, i);
            return;
        }
        boolean z2 = pzc instanceof it9;
        xoe xoe = this.w;
        if (z2) {
            ((it9) pzc).M(xoe);
        } else {
            ((hse) pzc).N((qq7) this.z.get(i), xoe, m58.C(list));
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        int i2 = i ^ this.X;
        int i3 = tic.view_type_more_stickers;
        int i4 = this.x;
        if (i2 == i3) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(ljc.more_stickers_item_view, viewGroup, false);
            View findViewById = inflate.findViewById(tic.more_stickers_item_view__fl_holder);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.height = i4;
            layoutParams.width = i4;
            findViewById.setLayoutParams(layoutParams);
            return new it9(inflate, this.o);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(ljc.keyboard_sticker_item_view, viewGroup, false);
        View findViewById2 = inflate2.findViewById(tic.keyboard_sticker_item_view__cs_holder);
        fj3 fj3 = (fj3) findViewById2.getLayoutParams();
        fj3.height = i4;
        fj3.width = i4;
        findViewById2.setLayoutParams(fj3);
        inflate2.setOnTouchListener(new ng1(7, this));
        return new hse(inflate2, this.v, this.o, this.y, this.Y);
    }
}
