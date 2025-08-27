package ru.ok.messages.calls.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import kotlin.Lazy;

public class FailedCallControlsView extends LinearLayout {
    public static final /* synthetic */ int v = 0;
    public final scf a;
    public final ImageButton b;
    public final ImageButton c;
    public final ImageButton o;

    public FailedCallControlsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        setGravity(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View.inflate(getContext(), ujc.view_failed_call_controls, this);
        if (!isInEditMode()) {
            Context context2 = getContext();
            Lazy lazy = scf.b0;
            this.a = j4b.k0(context2);
            ImageButton imageButton = (ImageButton) findViewById(lic.view_failed_call_controls__btn_close);
            this.b = imageButton;
            imageButton.setBackground(i8b.J(-1, this.a.B));
            this.b.setColorFilter(this.a.T);
            ImageButton imageButton2 = (ImageButton) findViewById(lic.view_failed_call_controls__btn_retry);
            this.c = imageButton2;
            imageButton2.setBackground(i8b.J(fw3.a(getContext(), lad.h), this.a.B));
            this.c.setColorFilter(this.a.S);
            ImageButton imageButton3 = (ImageButton) findViewById(lic.view_failed_call_controls__btn_send_message);
            this.o = imageButton3;
            imageButton3.setBackground(i8b.J(-1, this.a.B));
            this.o.setColorFilter(this.a.T);
            y64.n(this.b, new b5(10, this));
            y64.n(this.c, new b5(10, this));
            y64.n(this.o, new b5(10, this));
        }
    }

    public void setListener(jg5 jg5) {
    }
}
