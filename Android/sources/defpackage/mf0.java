package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Lazy;
import ru.ok.messages.settings.FrgAppearanceSettings;

/* renamed from: mf0  reason: default package */
public final class mf0 extends pzc {
    public final ro4 D0 = ro4.b();
    public final FrgAppearanceSettings E0;
    public final SimpleDraweeView F0;
    public final ImageView G0;
    public Uri H0;

    public mf0(View view, FrgAppearanceSettings frgAppearanceSettings) {
        super(view);
        view.getContext();
        this.E0 = frgAppearanceSettings;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(lic.row_background_select__iv_bg);
        this.F0 = simpleDraweeView;
        ((sp6) simpleDraweeView.getHierarchy()).h(nf0.d);
        ImageView imageView = (ImageView) view.findViewById(lic.frg_background_select__iv_overlay);
        this.G0 = imageView;
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        imageView.setColorFilter(j4b.k0(context).m, PorterDuff.Mode.SRC_IN);
        y64.n(view, new b5(1, this));
    }
}
