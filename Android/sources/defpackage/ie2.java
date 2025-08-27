package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: ie2  reason: default package */
public final /* synthetic */ class ie2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageView b;
    public final /* synthetic */ je2 c;

    public /* synthetic */ ie2(je2 je2, ImageView imageView, int i) {
        this.a = i;
        this.c = je2;
        this.b = imageView;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                je2 je2 = this.c;
                je2.E0 = true;
                int i = lya.d;
                js9 js9 = fu4.k;
                ImageView imageView = this.b;
                int i2 = js9.f(imageView).getIcon().f;
                Drawable b2 = ew3.b(imageView.getContext(), i);
                iq.a0(b2, i2);
                imageView.setImageDrawable(b2);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setVisibility(0);
                je2.L();
                return;
            case 1:
                ImageView imageView2 = this.b;
                imageView2.animate().alpha(c44.DEFAULT_ASPECT_RATIO).setDuration(500).withEndAction(new ie2(this.c, imageView2, 2));
                return;
            default:
                je2 je22 = this.c;
                je22.E0 = false;
                ImageView imageView3 = this.b;
                imageView3.setImageDrawable((Drawable) null);
                imageView3.setVisibility(4);
                je22.L();
                return;
        }
    }

    public /* synthetic */ ie2(ImageView imageView, je2 je2) {
        this.a = 1;
        this.b = imageView;
        this.c = je2;
    }
}
