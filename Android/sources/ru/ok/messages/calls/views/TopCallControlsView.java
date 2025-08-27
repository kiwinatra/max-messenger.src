package ru.ok.messages.calls.views;

import android.content.Context;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;

public class TopCallControlsView extends ConstraintLayout {
    public static final /* synthetic */ int M0 = 0;
    public final scf E0;
    public final ImageButton F0;
    public final ImageButton G0;
    public final ImageButton H0;
    public final ImageButton I0;
    public final ImageButton J0;
    public final ImageButton K0;
    public gsf L0;

    public TopCallControlsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), ujc.view_top_call_controls, this);
        setClipChildren(false);
        if (!isInEditMode()) {
            Context context2 = getContext();
            Lazy lazy = scf.b0;
            this.E0 = j4b.k0(context2);
            getContext();
            ro4.b();
            int i = this.E0.S;
            ImageButton imageButton = (ImageButton) findViewById(lic.view_top_call_controls__btn_speaker);
            this.F0 = imageButton;
            imageButton.setBackground(L(j4b.l0(0.5f, this.E0.U)));
            this.F0.setColorFilter(i);
            ImageButton imageButton2 = (ImageButton) findViewById(lic.view_top_call_controls__btn_hide);
            this.H0 = imageButton2;
            imageButton2.setColorFilter(i);
            this.H0.setBackground(L(j4b.l0(0.5f, this.E0.U)));
            ImageButton imageButton3 = (ImageButton) findViewById(lic.view_top_call_controls__btn_switch_camera);
            this.G0 = imageButton3;
            imageButton3.setColorFilter(i);
            this.G0.setBackground(L(j4b.l0(0.5f, this.E0.U)));
            ImageButton imageButton4 = (ImageButton) findViewById(lic.view_top_call_controls__share_screen);
            this.I0 = imageButton4;
            imageButton4.setColorFilter(i);
            this.I0.setBackground(L(j4b.l0(0.5f, this.E0.U)));
            ImageButton imageButton5 = (ImageButton) findViewById(lic.view_top_call_controls__add_participants);
            this.J0 = imageButton5;
            imageButton5.setBackground(L(j4b.l0(0.5f, this.E0.U)));
            this.J0.setColorFilter(i);
            ImageButton imageButton6 = (ImageButton) findViewById(lic.view_top_call_controls__share_link);
            this.K0 = imageButton6;
            imageButton6.setColorFilter(i);
            this.K0.setBackground(L(j4b.l0(0.5f, this.E0.U)));
            ct.G(this.F0, 300, new dte(6, this));
            ct.G(this.H0, 300, new dte(6, this));
            ct.G(this.G0, 600, new dte(6, this));
            ct.G(this.I0, 300, new dte(6, this));
            ct.G(this.J0, 300, new dte(6, this));
            ct.G(this.K0, 300, new dte(6, this));
        }
    }

    private yrf getTransition() {
        if (this.L0 == null) {
            gsf gsf = new gsf();
            this.L0 = gsf;
            gsf.S(new odg());
            this.L0.S(new yrf());
            this.L0.I(300);
        }
        return this.L0;
    }

    public final RippleDrawable L(int i) {
        return i8b.J(i, this.E0.B);
    }

    public int getAddParticipantButtonHeight() {
        return this.J0.getHeight();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() == c44.DEFAULT_ASPECT_RATIO || iq.z(this, (int) motionEvent.getX(), (int) motionEvent.getY()) == null) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() == c44.DEFAULT_ASPECT_RATIO || iq.z(this, (int) motionEvent.getX(), (int) motionEvent.getY()) == null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        this.F0.setClickable(z);
        this.H0.setClickable(z);
        this.G0.setClickable(z);
        this.I0.setClickable(z);
        this.J0.setClickable(z);
    }

    public void setListener(zmf zmf) {
    }

    public void setNewMessagesCount(int i) {
    }

    public void setScreenSharingOn(boolean z) {
        if (z) {
            this.I0.setVisibility(4);
            return;
        }
        this.I0.setVisibility(0);
        this.I0.setImageResource(nad.y1);
        this.I0.setColorFilter(this.E0.S);
        this.I0.setBackground(L(j4b.l0(0.5f, this.E0.U)));
    }

    public void setSpeakerOn(boolean z) {
        if (z) {
            this.F0.setImageResource(nad.E1);
            this.F0.setColorFilter(this.E0.T);
            this.F0.setBackground(L(this.E0.S));
            return;
        }
        this.F0.setImageResource(nad.C1);
        this.F0.setColorFilter(this.E0.S);
        this.F0.setBackground(L(j4b.l0(0.5f, this.E0.U)));
    }
}
