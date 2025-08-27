package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: fj2  reason: default package */
public final class fj2 extends pzc {
    public final TamAvatarView D0;
    public final TextView E0;
    public final TextView F0;
    public final ImageView G0;
    public final ej2 H0;
    public final yva I0;
    public final rtb J0;
    public final km3 K0;
    public a32 L0;
    public bj2 M0;
    public boolean N0 = false;

    public fj2(View view, yva yva, rtb rtb, ej2 ej2, km3 km3) {
        super(view);
        view.getContext();
        ro4 b = ro4.b();
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        view.setBackground(k0.e());
        this.I0 = yva;
        this.J0 = rtb;
        this.H0 = ej2;
        this.K0 = km3;
        this.D0 = (TamAvatarView) view.findViewById(lic.row_chat_member__av_view);
        TextView textView = (TextView) view.findViewById(lic.row_contact_base__tv_name);
        this.E0 = textView;
        textView.setTextColor(k0.G);
        cvg.x(textView).b();
        TextView textView2 = (TextView) view.findViewById(lic.row_contact_base__tv_last_seen);
        this.F0 = textView2;
        textView2.setTextColor(k0.K);
        ImageView imageView = (ImageView) view.findViewById(lic.row_chat_member__more);
        this.G0 = imageView;
        iq.a0(imageView.getDrawable(), k0.N);
        imageView.setBackground(k0.d());
        View findViewById = view.findViewById(lic.row_chat_member__fl_controls);
        int i = b.j;
        if (findViewById != null) {
            b59.x(i, i, i, i, findViewById, imageView);
        }
        y64.n(view, new dj2(this, 0));
        y64.n(imageView, new dj2(this, 1));
    }

    public final void M(bj2 bj2, int i) {
        String str;
        long a = ym.e().a();
        fo3 fo3 = bj2.a;
        long j = fo3.a;
        int i2 = (a > j ? 1 : (a == j ? 0 : -1));
        TextView textView = this.F0;
        if (i2 != 0) {
            a32 a32 = this.L0;
            if (a32.b.d == j) {
                if (a32.K()) {
                    textView.setText(qad.H0);
                } else {
                    textView.setText(qad.n1);
                }
            } else if (!this.N0 || i == 2) {
                if (fo3.c()) {
                    boolean d = fo3.d();
                    View view = this.a;
                    str = d ? view.getContext().getString(qad.T8) : view.getContext().getString(qad.J);
                } else {
                    vk3 p = this.K0.p(fo3.a, false);
                    rtb rtb = this.J0;
                    String charSequence = p != null ? rtb.d(p, true).toString() : null;
                    str = TextUtils.isEmpty(charSequence) ? rtb.b(bj2).toString() : charSequence;
                }
                textView.setText(str);
            } else {
                textView.setText(qad.J1);
            }
        } else if (this.L0.e0()) {
            String string = this.L0.K() ? textView.getContext().getString(qad.G0) : textView.getContext().getString(qad.m1);
            String[] strArr = ghf.c;
            if (string.length() != 0) {
                if (string.length() == 1) {
                    string = string.toLowerCase();
                } else {
                    string = string.substring(0, 1).toLowerCase() + string.substring(1);
                }
            }
            textView.setText(string);
        } else {
            textView.setText(jad.I);
        }
    }

    public final void N(bj2 bj2, int i, ij2 ij2, a32 a32, long j) {
        if (i == 2 && ij2 == ij2.ADMIN) {
            v62 v62 = (v62) a32.b.R.get(Long.valueOf(bj2.a.a));
            if (v62 != null) {
                long j2 = v62.c;
                if (j2 != 0) {
                    if (v62.a != a32.b.d) {
                        vk3 p = ((qra) ym.e()).m().p(j2, true);
                        TextView textView = this.F0;
                        Context context = textView.getContext();
                        int i2 = jad.k;
                        int i3 = jad.j;
                        int i4 = jad.i;
                        int i5 = jad.l;
                        String[] strArr = ghf.c;
                        String string = j == p.r() ? context.getString(i5) : ghf.o(context, p.a.c.l, i2, i3, i4);
                        if (j != j2) {
                            string = String.format(string, new Object[]{p.f()});
                        }
                        textView.setText(string);
                        return;
                    }
                }
            }
            M(bj2, i);
            return;
        }
        M(bj2, i);
    }

    public final CharSequence O(bj2 bj2) {
        fo3 fo3 = bj2.a;
        String a = fo3.a();
        boolean isEmpty = TextUtils.isEmpty(a);
        yva yva = this.I0;
        if (!isEmpty) {
            return yva.k.c(a);
        }
        long j = fo3.a;
        return yva.a.getString(jad.p);
    }
}
