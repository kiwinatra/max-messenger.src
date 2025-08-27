package ru.ok.messages.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.gridlayout.widget.GridLayout;
import kotlin.Lazy;

public class ContextMenuGridLayout extends GridLayout {
    public final ro4 N0 = ro4.b();

    public ContextMenuGridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
    }

    public void setupText(String str) {
        View inflate = View.inflate(getContext(), ujc.row_context_menu_action, (ViewGroup) null);
        ((ImageView) inflate.findViewById(lic.row_options_action__iv_icon)).setVisibility(8);
        TextView textView = (TextView) inflate.findViewById(lic.row_options_action__tv_title);
        textView.setText(str);
        textView.setTextSize(2, 14.0f);
        textView.setGravity(8388611);
        su6 su6 = new su6();
        uu6 uu6 = su6.a;
        su6.a = new uu6(uu6.a, uu6.b, GridLayout.d(7, false), uu6.d);
        uu6 uu62 = su6.b;
        su6.b = new uu6(uu62.a, uu62.b, GridLayout.d(7, true), uu62.d);
        su6.width = -1;
        su6.height = -1;
        addView(inflate, su6);
        Context context = getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        int i = this.N0.u;
        int i2 = k0.N;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            ImageView imageView = (ImageView) childAt.findViewById(lic.row_options_action__iv_icon);
            imageView.setColorFilter(k0.x);
            imageView.setBackground(i8b.f(k0.J, k0.j, 0, i));
            ((TextView) childAt.findViewById(lic.row_options_action__tv_title)).setTextColor(i2);
        }
    }
}
