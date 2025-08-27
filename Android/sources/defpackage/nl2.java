package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Locale;
import kotlin.Lazy;

/* renamed from: nl2  reason: default package */
public final class nl2 extends pzc {
    public final ImageView D0;
    public final TextView E0;
    public final TextView F0;
    public final int G0;

    public nl2(View view, g32 g32, int i) {
        super(view);
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        view.setBackground(k0.e());
        if (i == lic.chat_admin_admins || i == lic.channel_admin_subscribers || i == lic.chat_admin_participants || i == lic.chat_admin_blocked) {
            this.G0 = i;
            ImageView imageView = (ImageView) view.findViewById(lic.row_channel_people__iv_icon);
            this.D0 = imageView;
            int i2 = k0.K;
            imageView.setColorFilter(i2);
            TextView textView = (TextView) view.findViewById(lic.row_channel_people__tv_title);
            this.E0 = textView;
            textView.setTextColor(i2);
            TextView textView2 = (TextView) view.findViewById(lic.row_channel_people__tv_value);
            this.F0 = textView2;
            textView2.setTextColor(k0.N);
            y64.n(view, new ml2(g32, i, 0));
            return;
        }
        Locale locale = Locale.ENGLISH;
        throw new IllegalArgumentException(a81.j(i, "chatAdminViewType=", " is not supported"));
    }
}
