package ru.ok.messages.constructor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import kotlin.Lazy;

public class MessagesConstructorDraftView extends RelativeLayout {
    public final scf a;
    public final ImageButton b;
    public final View c;
    public final ImageView o;
    public final TextView v;
    public l2a w;
    public final yva x = ((qra) ym.e()).v();
    public final ImageView y;

    public MessagesConstructorDraftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = getContext();
        Lazy lazy = scf.b0;
        this.a = j4b.k0(context2);
        View.inflate(context2, ujc.view_constructor_draft, this);
        setClickable(true);
        this.b = (ImageButton) findViewById(lic.view_constructor_draft__close);
        this.c = findViewById(lic.view_constructor_draft__divider);
        this.o = (ImageView) findViewById(lic.view_constructor_draft__icon);
        this.v = (TextView) findViewById(lic.view_constructor_draft__content);
        this.y = (ImageView) findViewById(lic.view_constructor_draft__iv_send);
        y64.n(this, new wi9(this, 0));
        y64.n(this.b, new wi9(this, 1));
        y64.n(this.y, new wi9(this, 2));
        scf k0 = j4b.k0(getContext());
        this.a = k0;
        setBackgroundColor(k0.n);
        this.b.setColorFilter(this.a.N);
        this.b.setBackground(this.a.d());
        this.c.setBackgroundColor(this.a.L);
        this.v.setTextColor(this.a.K);
        this.o.setImageDrawable(iq.E(nad.T, this.a.l, getContext()));
        this.y.setBackground(this.a.d());
        this.y.setColorFilter(this.a.l);
    }

    public void setVisible(boolean z) {
        setVisibility(z ? 0 : 8);
    }
}
