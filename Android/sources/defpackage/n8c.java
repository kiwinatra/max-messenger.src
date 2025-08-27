package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;

/* renamed from: n8c  reason: default package */
public final class n8c extends dx6 {
    public final scf K0;
    public final TextView L0;
    public final TextView M0;
    public final Button N0;
    public final ImageButton O0;
    public final ImageView P0;
    public kx6 Q0;

    public n8c(View view, cx6 cx6) {
        super(view, cx6);
        view.getContext();
        ro4 b = ro4.b();
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        this.K0 = k0;
        ImageView imageView = (ImageView) view.findViewById(lic.row_promo__iv_icon);
        this.P0 = imageView;
        if (imageView != null) {
            imageView.setColorFilter(k0.l);
        }
        TextView textView = (TextView) view.findViewById(lic.row_promo__tv_title);
        this.L0 = textView;
        if (textView != null) {
            textView.setTextColor(k0.G);
        }
        TextView textView2 = (TextView) view.findViewById(lic.row_promo__tv_description);
        this.M0 = textView2;
        if (textView2 != null) {
            textView2.setTextColor(k0.K);
        }
        Button button = (Button) view.findViewById(lic.row_promo__btn_action);
        this.N0 = button;
        if (button != null) {
            iq.d(k0, button, b.n);
        }
        ImageButton imageButton = (ImageButton) view.findViewById(lic.row_promo__btn_close);
        this.O0 = imageButton;
        if (imageButton != null) {
            iq.a0(imageButton.getDrawable(), k0.N);
            imageButton.setBackground(k0.d());
        }
        View findViewById = view.findViewById(lic.row_promo__separator_top);
        if (findViewById != null) {
            findViewById.setBackgroundColor(k0.L);
        }
        View findViewById2 = view.findViewById(lic.row_promo__separator_bottom);
        if (findViewById2 != null) {
            findViewById2.setBackgroundColor(k0.L);
        }
        TextView textView3 = (TextView) view.findViewById(lic.row_header_contact_ok_search__tv_search);
        if (textView3 != null) {
            textView3.setTextColor(k0.l);
        }
        if (button != null) {
            y64.n(button, new m8c(this, 0));
        }
        if (imageButton != null) {
            y64.n(imageButton, new m8c(this, 1));
        }
    }

    public final void onClick(View view) {
        cx6 cx6 = this.I0;
        if (cx6 != null) {
            int id = view.getId();
            if (id == lic.row_promo__btn_action) {
                cx6.a0(this.Q0);
            } else if (id == lic.row_promo__btn_close) {
                int ordinal = this.Q0.ordinal();
                if (ordinal == 2) {
                    cx6.a0(kx6.o);
                } else if (ordinal == 11) {
                    cx6.a0(kx6.y);
                }
            } else if (this.J0 != null) {
                super.onClick(view);
            }
        }
    }
}
