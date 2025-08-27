package ru.ok.messages.calls.views;

import android.content.Context;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import kotlin.Lazy;

public class CallControlsView extends RelativeLayout {
    public static final /* synthetic */ int x = 0;
    public final ro4 a = ro4.b();
    public final scf b;
    public final ImageButton c;
    public final ImageButton o;
    public final ImageButton v;
    public final ImageButton w;

    public CallControlsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        setGravity(1);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        View.inflate(getContext(), ujc.view_call_controls, this);
        if (!isInEditMode()) {
            Context context2 = getContext();
            Lazy lazy = scf.b0;
            this.b = j4b.k0(context2);
            ImageButton imageButton = (ImageButton) findViewById(lic.view_call_controls__btn_hangup);
            this.o = imageButton;
            imageButton.setBackground(a(fw3.a(getContext(), lad.i)));
            this.o.setColorFilter(this.b.S);
            this.c = (ImageButton) findViewById(lic.view_call_controls__btn_speaker);
            this.v = (ImageButton) findViewById(lic.view_call_controls__btn_micro);
            this.w = (ImageButton) findViewById(lic.view_call_controls__btn_video);
            ImageButton imageButton2 = this.c;
            if (imageButton2 != null) {
                y64.n(imageButton2, new b5(4, this));
            }
            y64.n(this.o, new b5(4, this));
            y64.n(this.v, new b5(4, this));
            y64.n(this.w, new b5(4, this));
            this.v.setOnLongClickListener(new z20(5, this));
            getContext().getResources().getDimension(ydc.view_call_controls__hangup_top_margin);
            iq.u(this, getAdditionalPaddingTopForGradient() + this.a.k);
            iq.q(this, this.a.k);
        }
    }

    private gsf getTransitionSet() {
        gsf gsf = new gsf();
        gsf.V(0);
        gsf.I(300);
        gsf.S(new yrf());
        gsf.S(new odg());
        return gsf;
    }

    public final RippleDrawable a(int i) {
        return i8b.J(i, this.b.B);
    }

    public int getAdditionalPaddingTopForGradient() {
        return this.a.p;
    }

    public void setListener(x21 x21) {
    }

    public void setMuted(boolean z) {
        if (z) {
            this.v.setImageResource(nad.S0);
            this.v.setBackground(a(j4b.l0(0.5f, this.b.U)));
            this.v.setColorFilter(this.b.S);
            return;
        }
        this.v.setImageResource(nad.R0);
        this.v.setBackground(a(this.b.S));
        this.v.setColorFilter(this.b.T);
    }

    public void setSpeakerOn(boolean z) {
        ImageButton imageButton = this.c;
        if (imageButton != null) {
            if (z) {
                imageButton.setImageResource(nad.E1);
                this.c.setBackground(a(this.b.S));
                this.c.setColorFilter(this.b.T);
                return;
            }
            imageButton.setImageResource(nad.C1);
            this.c.setBackground(a(j4b.l0(0.5f, this.b.U)));
            this.c.setColorFilter(this.b.S);
        }
    }

    public void setVideoEnabled(boolean z) {
        if (z) {
            this.w.setImageResource(nad.a2);
            this.w.setBackground(a(this.b.S));
            this.w.setColorFilter(this.b.T);
            return;
        }
        this.w.setImageResource(nad.a2);
        this.w.setBackground(a(j4b.l0(0.5f, this.b.U)));
        this.w.setColorFilter(this.b.S);
    }
}
