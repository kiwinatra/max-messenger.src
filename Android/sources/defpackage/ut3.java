package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.b;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import ru.ok.messages.contacts.picker.FrgContactMultiPicker;

/* renamed from: ut3  reason: default package */
public final class ut3 extends jj0 implements dm3 {
    public final Set X;
    public final Set Y;
    public final int v;
    public final int w;
    public final FrgContactMultiPicker x;
    public final Context y;
    public final List z;

    public ut3(b bVar, List list, int i, int i2, FrgContactMultiPicker frgContactMultiPicker, Set set, Set set2, a32 a32) {
        this.y = bVar;
        this.z = list;
        this.v = i;
        this.w = i2;
        this.x = frgContactMultiPicker;
        this.X = set;
        this.Y = set2;
    }

    public final void I(ar3 ar3, int i) {
        List list = this.z;
        vk3 vk3 = (vk3) list.get(i);
        String str = (String) this.o;
        boolean contains = this.X.contains(Long.valueOf(((vk3) list.get(i)).r()));
        int i2 = this.w;
        boolean z2 = i2 == 5 || i2 == 6;
        ar3.M(vk3, str, true);
        ImageView imageView = ar3.M0;
        if (imageView != null || z2) {
            Set set = this.Y;
            boolean z3 = set != null && set.contains(Long.valueOf(vk3.r()));
            View view = ar3.a;
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            scf k0 = j4b.k0(context);
            if (z3) {
                view.setAlpha(0.5f);
                view.setEnabled(false);
                if (imageView != null) {
                    imageView.setImageResource(nad.M);
                    imageView.setColorFilter(k0.N);
                }
                ar3.H0.setText(qad.J1);
                return;
            }
            view.setAlpha(1.0f);
            view.setEnabled(true);
            if (imageView != null) {
                imageView.setImageResource(contains ? nad.M : nad.H);
                imageView.setColorFilter(contains ? k0.l : k0.N);
            }
        }
    }

    public final int j() {
        return this.z.size();
    }

    public final int l(int i) {
        int i2 = this.v;
        if (i2 == 4) {
            return tr1.y(i2);
        }
        ((vk3) this.z.get(i)).getClass();
        return tr1.y(i2);
    }

    public final void l1(vk3 vk3) {
        if (this.x != null) {
            this.Y.contains(Long.valueOf(vk3.r()));
        }
    }

    public final void s(pzc pzc, int i) {
        vk3 vk3 = (vk3) this.z.get(i);
        if (this.v == 4) {
            I((ar3) pzc, i);
            return;
        }
        vk3.getClass();
        I((ar3) pzc, i);
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        int i2;
        int i3 = lic.view_type_contacts_invite_subscriber;
        Context context = this.y;
        if (i == i3) {
            View inflate = LayoutInflater.from(context).inflate(ujc.row_contact_ok_subscribe, viewGroup, false);
            qs3 qs3 = new qs3(inflate, this);
            Context context2 = inflate.getContext();
            Lazy lazy = scf.b0;
            ((TextView) inflate.findViewById(lic.row_contact_ok_subscribe__tv_description)).setTextColor(j4b.k0(context2).K);
            return qs3;
        }
        int y2 = tr1.y(tr1.A(4)[i]);
        if (y2 == 0) {
            i2 = ujc.row_contact_avatar_left;
        } else if (y2 == 1 || y2 == 2 || y2 == 3) {
            i2 = ujc.row_contact_picker;
        } else {
            throw new IllegalStateException("Incorrect type of contact picker");
        }
        return new ar3(LayoutInflater.from(context).inflate(i2, viewGroup, false), this.x);
    }
}
