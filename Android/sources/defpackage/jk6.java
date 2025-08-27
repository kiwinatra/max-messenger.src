package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import ru.ok.messages.gallery.GalleryViewModel;
import ru.ok.messages.media.mediabar.NumericCheckButton;
import ru.ok.messages.views.widgets.VideoInfoTextView;

/* renamed from: jk6  reason: default package */
public final class jk6 extends jj0 {
    public final GalleryViewModel v;

    public jk6(GalleryViewModel galleryViewModel) {
        super((j4b) w63.K);
        this.v = galleryViewModel;
    }

    public final int l(int i) {
        um6 um6 = (um6) E(i);
        if (um6 != null) {
            return um6.a;
        }
        return 0;
    }

    public final void s(pzc pzc, int i) {
        dn6 dn6 = (dn6) pzc;
        um6 um6 = (um6) E(i);
        if (um6 != null) {
            if ((dn6 instanceof bn6) && (um6 instanceof sm6)) {
                bn6 bn6 = (bn6) dn6;
                sm6 sm6 = (sm6) um6;
                k48 k48 = sm6.b;
                j48 j48 = k48.Z;
                j48 j482 = j48.o;
                int i2 = (j48 == j482 || j48 == j48.v) ? 0 : 8;
                VideoInfoTextView videoInfoTextView = bn6.G0;
                videoInfoTextView.setVisibility(i2);
                j48 j483 = k48.Z;
                if (j483 == j482) {
                    videoInfoTextView.k();
                } else if (j483 == j48.v) {
                    videoInfoTextView.j(sm6.l);
                }
                knb a = ld9.p.get();
                a.e = sm6.m;
                SimpleDraweeView simpleDraweeView = bn6.F0;
                a.l = simpleDraweeView.getController();
                simpleDraweeView.setController(a.a());
                NumericCheckButton numericCheckButton = bn6.E0;
                if (numericCheckButton != null) {
                    numericCheckButton.setNumber(sm6.c);
                    ct.G(numericCheckButton, 300, new xu3(16, (Object) bn6));
                }
            }
            ct.G(dn6.a, 300, new r13(this, i, um6, 2));
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        return i == 5 ? new pzc(from.inflate(ujc.row_gallery_camera, viewGroup, false)) : new bn6(from.inflate(ujc.row_gallery_media, viewGroup, false), this.v);
    }
}
