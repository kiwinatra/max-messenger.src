package defpackage;

import android.view.View;
import android.widget.ImageView;
import ru.ok.messages.contacts.picker.FrgContactMultiPicker;

/* renamed from: ar3  reason: default package */
public final class ar3 extends qs3 implements View.OnClickListener {
    public final FrgContactMultiPicker L0;
    public final ImageView M0;

    public ar3(View view, FrgContactMultiPicker frgContactMultiPicker) {
        super(view, (dm3) null);
        this.L0 = frgContactMultiPicker;
        this.M0 = (ImageView) view.findViewById(lic.row_contact_picker__iv_state);
        view.setOnClickListener(this);
    }

    public final void onClick(View view) {
        FrgContactMultiPicker frgContactMultiPicker = this.L0;
        if (frgContactMultiPicker != null) {
            vk3 vk3 = this.K0;
            if (frgContactMultiPicker.U1 == 4) {
                frgContactMultiPicker.k3(vk3);
                ut3 ut3 = frgContactMultiPicker.E1;
                ut3.a.d(frgContactMultiPicker.I1.indexOf(vk3), 1, (Object) null);
                return;
            }
            a32 a32 = frgContactMultiPicker.K1;
            if (a32 != null) {
                if (!a32.K()) {
                    if (frgContactMultiPicker.K1.b.e()) {
                        vk3.getClass();
                    } else {
                        vk3.getClass();
                        frgContactMultiPicker.k3(vk3);
                    }
                }
                frgContactMultiPicker.k3(vk3);
            } else {
                vk3.getClass();
                frgContactMultiPicker.k3(vk3);
            }
            ut3 ut32 = frgContactMultiPicker.E1;
            ut32.a.d(frgContactMultiPicker.I1.indexOf(vk3), 1, (Object) null);
        }
    }
}
