package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: qs3  reason: default package */
public class qs3 extends co3 {
    public final yva D0 = ((qra) ym.e()).v();
    public final TamAvatarView E0;
    public final TextView F0;
    public final Button G0;
    public final TextView H0;
    public final ImageView I0;
    public final ImageView J0;
    public vk3 K0;

    public qs3(View view, dm3 dm3) {
        super(view);
        TextView textView = (TextView) view.findViewById(lic.row_contact_base__tv_name);
        this.F0 = textView;
        cvg.x(textView).b();
        TextView textView2 = (TextView) view.findViewById(lic.row_contact_base__tv_last_seen);
        this.H0 = textView2;
        this.E0 = (TamAvatarView) view.findViewById(lic.row_contact_base__av_view);
        ImageView imageView = (ImageView) view.findViewById(lic.row_contact_avatar_left_admin__remove);
        this.I0 = imageView;
        Button button = (Button) view.findViewById(lic.row_contact_avatar_left__btn_invite_friend);
        this.G0 = button;
        ImageView imageView2 = (ImageView) view.findViewById(lic.row_contact_base__iv_phonebook);
        this.J0 = imageView2;
        if (dm3 != null) {
            ps3 ps3 = new ps3(this, dm3, 0);
            y64.n(view, ps3);
            view.setOnLongClickListener(new yb1(3, this, dm3));
            if (imageView != null) {
                y64.n(imageView, new ps3(this, dm3, 1));
            }
            if (button != null) {
                y64.n(button, ps3);
            }
        }
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        view.setBackground(k0.e());
        textView.setTextColor(k0.G);
        if (textView2 != null) {
            textView2.setTextColor(k0.K);
        }
        int i = k0.N;
        if (imageView != null) {
            iq.a0(imageView.getDrawable(), i);
            imageView.setBackground(k0.d());
        }
        if (button != null) {
            button.setTextColor(k0.l);
            button.setBackground(k0.e());
        }
        if (imageView2 != null) {
            iq.a0(imageView2.getDrawable(), i);
        }
    }

    public final void M(vk3 vk3, String str, boolean z) {
        CharSequence charSequence;
        this.K0 = vk3;
        int i = 0;
        TextView textView = this.H0;
        if (textView != null) {
            if (vk3.n() != 0) {
                textView.setVisibility(8);
            } else if (vk3.w) {
                textView.setVisibility(0);
                textView.setText(ym.v.getString(jad.I));
            } else if (vk3.x()) {
                textView.setVisibility(0);
                boolean A = vk3.A();
                View view = this.a;
                textView.setText(A ? view.getContext().getString(qad.T8) : view.getContext().getString(qad.J));
            } else {
                eaf.a().getClass();
                textView.setText(((sjd) eaf.b()).v().d(vk3, z));
            }
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView2 = this.F0;
        if (!isEmpty) {
            charSequence = i8b.v(textView2.getContext(), vk3.l(), vk3.m(), str, textView);
            if (TextUtils.isEmpty(charSequence) || !charSequence.toString().equals(vk3.f())) {
                String f = vk3.f();
                textView.setVisibility(0);
                textView.setText(charSequence);
                charSequence = f;
            }
        } else {
            charSequence = vk3.p(this.D0);
        }
        textView2.setText(charSequence);
        n79.b(textView2, vk3.z(), false, vk3.x(), vk3.A());
        TamAvatarView tamAvatarView = this.E0;
        if (tamAvatarView != null) {
            if (vk3.n() != 0) {
                int i2 = nad.g;
                tamAvatarView.z = false;
                HashSet hashSet = ra7.s;
                qa7 a = ra7.d(mzf.c(i2)).a();
                knb a2 = ld9.p.get();
                a2.e = a;
                a2.l = tamAvatarView.a.v;
                tamAvatarView.a.i(a2.a());
            } else {
                tamAvatarView.b(vk3, true);
            }
        }
        ImageView imageView = this.I0;
        if (imageView != null) {
            imageView.setVisibility(this.K0.w ? 8 : 0);
        }
        Button button = this.G0;
        if (button != null) {
            button.setVisibility(8);
        }
        ImageView imageView2 = this.J0;
        if (imageView2 != null) {
            List list = this.K0.a.c.f;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((pm3) it.next()).c == om3.b) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            i = 8;
            imageView2.setVisibility(i);
        }
    }
}
