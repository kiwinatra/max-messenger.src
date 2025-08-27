package ru.ok.messages.bots;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Unit;

public class InlineKeyboardAttachView extends FrameLayout implements iw0 {
    public final ButtonsView a;
    public final a94 b = new a94();

    public InlineKeyboardAttachView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ButtonsView buttonsView = new ButtonsView(getContext());
        this.a = buttonsView;
        buttonsView.setClickListener(this);
        buttonsView.setId(lic.inline_keyboard_buttons);
        addView(buttonsView, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void a(xv0 xv0, dw0 dw0) {
        a94 a94 = this.b;
        if (a94.b) {
            a94.b = false;
            xv0.b.ordinal();
            Unit unit = Unit.INSTANCE;
            postDelayed(new cf(14, (nm1) a94.c), a94.a);
        }
    }

    public void setClickListener(bg7 bg7) {
    }
}
