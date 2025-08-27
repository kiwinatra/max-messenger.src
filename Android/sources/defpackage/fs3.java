package defpackage;

import android.content.Context;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import kotlin.Lazy;
import ru.ok.messages.contacts.picker.MultiPickerSelectionView;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: fs3  reason: default package */
public final class fs3 extends pzc implements bif {
    public final mu3 D0;
    public final TamAvatarView E0;
    public final ImageView F0;
    public vk3 G0;
    public a32 H0;
    public qdb I0;
    public fo3 J0;

    public fs3(View view, mu3 mu3) {
        super(view);
        this.D0 = mu3;
        this.E0 = (TamAvatarView) view.findViewById(lic.row_selected__iv_avatar);
        ImageView imageView = (ImageView) view.findViewById(lic.row_selected__iv_remove);
        this.F0 = imageView;
        ct.G(view, 300, new es3(this, 0));
        ct.G(imageView, 300, new es3(this, 1));
        c();
    }

    public final void M() {
        mu3 mu3 = this.D0;
        if (mu3 != null) {
            vk3 vk3 = this.G0;
            if (vk3 != null) {
                Iterator it = ((MultiPickerSelectionView) mu3).a.iterator();
                while (it.hasNext()) {
                    ((sw9) it.next()).k1(vk3);
                }
            } else if (this.H0 != null) {
                Iterator it2 = ((MultiPickerSelectionView) mu3).a.iterator();
                while (it2.hasNext()) {
                    ((sw9) it2.next()).getClass();
                }
            } else if (this.I0 != null) {
                Iterator it3 = ((MultiPickerSelectionView) mu3).a.iterator();
                while (it3.hasNext()) {
                    ((sw9) it3.next()).getClass();
                }
            } else {
                fo3 fo3 = this.J0;
                if (fo3 != null) {
                    Iterator it4 = ((MultiPickerSelectionView) mu3).a.iterator();
                    while (it4.hasNext()) {
                        ((sw9) it4.next()).N(fo3);
                    }
                }
            }
        }
    }

    public final void c() {
        scf scf;
        View view = this.a;
        if (view.isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        this.E0.setBackground(scf.d());
        RippleDrawable J = i8b.J(scf.I, scf.j);
        ImageView imageView = this.F0;
        imageView.setBackground(J);
        imageView.setColorFilter(scf.G);
    }
}
