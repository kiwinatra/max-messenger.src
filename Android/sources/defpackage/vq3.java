package defpackage;

import android.view.View;
import android.widget.ImageView;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: vq3  reason: default package */
public final class vq3 extends pzc {
    public final ImageView D0;
    public final TamAvatarView E0;
    public final View F0;
    public pf8 G0;
    public final /* synthetic */ wq3 H0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vq3(wq3 wq3, View view) {
        super(view);
        this.H0 = wq3;
        this.D0 = (ImageView) view.findViewById(lic.row_contact_location__static_image);
        this.E0 = (TamAvatarView) view.findViewById(lic.row_contact_location__live_image);
        this.F0 = view.findViewById(lic.row_contact_location__indicator);
        y64.n(view, new b5(7, this));
    }
}
