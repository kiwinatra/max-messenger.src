package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: it9  reason: default package */
public final class it9 extends pzc {
    public final FrameLayout D0;
    public final ImageView E0;
    public ht9 F0;

    public it9(View view, ht9 ht9) {
        super(view);
        this.F0 = ht9;
        this.D0 = (FrameLayout) view.findViewById(tic.more_stickers_item_view__fl_holder);
        this.E0 = (ImageView) view.findViewById(tic.more_stickers_item_view__iv_image);
        o54.h(view, new b5(25, this));
    }

    public final void M(xoe xoe) {
        if (xoe != null) {
            this.a.setBackground(xoe.a(xoe.c));
            this.D0.setBackground(xoe.a(xoe.j));
            Drawable a = xoe.a(xoe.s);
            ImageView imageView = this.E0;
            imageView.setImageDrawable(a);
            imageView.setColorFilter(xoe.g, PorterDuff.Mode.SRC_IN);
        }
    }
}
