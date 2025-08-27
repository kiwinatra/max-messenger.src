package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Lazy;
import ru.ok.messages.gallery.GalleryViewModel;
import ru.ok.messages.media.mediabar.NumericCheckButton;
import ru.ok.messages.views.widgets.VideoInfoTextView;

/* renamed from: bn6  reason: default package */
public final class bn6 extends dn6 {
    public final GalleryViewModel D0;
    public NumericCheckButton E0;
    public final SimpleDraweeView F0;
    public final VideoInfoTextView G0;

    public bn6(View view, GalleryViewModel galleryViewModel) {
        super(view);
        scf scf;
        scf scf2;
        this.D0 = galleryViewModel;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(lic.simple_drawee_view);
        this.F0 = simpleDraweeView;
        ViewStub viewStub = (ViewStub) view.findViewById(lic.check_button_view_stub);
        this.G0 = (VideoInfoTextView) view.findViewById(lic.video_info);
        Drawable b = ew3.b(view.getContext(), nad.q0);
        if (view.isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        b.setTint(j4b.l0(0.3f, scf.x));
        sp6 sp6 = (sp6) simpleDraweeView.getHierarchy();
        if (sp6 != null) {
            sp6.i(b, 1);
        }
        if (view.isInEditMode()) {
            scf2 = vi4.f0;
        } else {
            Context context2 = view.getContext();
            Lazy lazy2 = scf.b0;
            scf2 = j4b.k0(context2);
        }
        simpleDraweeView.setBackgroundColor(scf2.I);
        if (galleryViewModel.m.o) {
            viewStub.setOnInflateListener(new an6(this, 0));
            viewStub.inflate();
        }
    }
}
