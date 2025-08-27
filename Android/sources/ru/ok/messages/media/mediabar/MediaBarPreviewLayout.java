package ru.ok.messages.media.mediabar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Lazy;
import ru.ok.messages.messages.widgets.MessageComposeEditText;

public class MediaBarPreviewLayout extends ConstraintLayout implements hk8, bif {
    public static final /* synthetic */ int Z0 = 0;
    public final ro4 E0;
    public final View F0;
    public final View G0;
    public final View H0;
    public final RecyclerView I0;
    public final View J0;
    public final ImageButton K0;
    public final ImageButton L0;
    public final ImageButton M0;
    public final ImageButton N0;
    public final MessageComposeEditText O0;
    public final h48 P0;
    public final gk8 Q0;
    public fk8 R0;
    public Toast S0;
    public final ch T0;
    public final ltb U0;
    public boolean V0 = false;
    public boolean W0 = true;
    public boolean X0 = false;
    public int Y0 = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaBarPreviewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        id3 e = ym.e();
        getContext();
        ro4 b = ro4.b();
        this.E0 = b;
        qra qra = (qra) e;
        ch d = qra.d();
        this.T0 = d;
        h48 s = qra.s();
        this.P0 = s;
        o20 h = qra.h();
        this.U0 = qra.y();
        View.inflate(getContext(), ujc.cl_media_bar_preview_layout, this);
        this.G0 = findViewById(lic.cl_media_bar_preview_layout__top_panel);
        this.F0 = findViewById(lic.cl_media_bar_preview_layout__bottom_panel);
        this.H0 = findViewById(lic.media_bar_view__bottom_shadow);
        this.J0 = findViewById(lic.cl_media_bar_preview_layout__separator_middle);
        RecyclerView recyclerView = (RecyclerView) findViewById(lic.cl_media_bar_preview_layout__rv_selected);
        this.I0 = recyclerView;
        ImageButton imageButton = (ImageButton) findViewById(lic.cl_media_bar_preview_layout__ib_send);
        this.K0 = imageButton;
        ImageButton imageButton2 = (ImageButton) findViewById(lic.cl_media_bar_preview_layout__ib_file);
        this.L0 = imageButton2;
        ImageButton imageButton3 = (ImageButton) findViewById(lic.cl_media_bar_preview_layout__ib_collage);
        this.M0 = imageButton3;
        ImageButton imageButton4 = (ImageButton) findViewById(lic.cl_media_bar_preview_layout__ib_cancel);
        this.N0 = imageButton4;
        MessageComposeEditText messageComposeEditText = (MessageComposeEditText) findViewById(lic.cl_media_bar_preview_layout__edit_message);
        this.O0 = messageComposeEditText;
        c();
        L();
        recyclerView.setHasFixedSize(true);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setItemAnimator(new mg4());
        recyclerView.j(new w51(b.b, 5));
        gk8 gk8 = new gk8(getContext(), this, d, h, s, (n48) qra.getAccessor().g(n48.class));
        this.Q0 = gk8;
        gk8.C(true);
        recyclerView.setAdapter(this.Q0);
        messageComposeEditText.addTextChangedListener(new u2(8, this));
        messageComposeEditText.setInputType(933968);
        cvg.x(messageComposeEditText).b();
        ct.G(imageButton, 300, new dk8(this, 0));
        imageButton.setLongClickable(true);
        imageButton.setOnLongClickListener(new z20(7, this));
        ct.G(imageButton2, 300, new dk8(this, 1));
        ct.G(imageButton3, 300, new dk8(this, 2));
        ct.G(imageButton4, 300, new dk8(this, 3));
    }

    public final void L() {
        int y = tr1.y(this.P0.f.k);
        ImageButton imageButton = this.L0;
        ImageButton imageButton2 = this.M0;
        if (y == 1) {
            imageButton2.setImageResource(nad.Q);
            imageButton.setImageResource(nad.l0);
        } else if (y != 2) {
            imageButton2.setImageResource(nad.Q);
            imageButton.setImageResource(nad.k0);
        } else {
            imageButton2.setImageResource(nad.R);
            imageButton.setImageResource(nad.k0);
        }
    }

    public final boolean M(boolean z) {
        ch chVar = this.T0;
        if (!chVar.q() || !z) {
            MessageComposeEditText messageComposeEditText = this.O0;
            if (messageComposeEditText != null) {
                hd8.C(messageComposeEditText.getContext(), messageComposeEditText);
            }
            setVisibility(8);
            return true;
        } else if (getVisibility() == 8) {
            return false;
        } else {
            chVar.m(this).v(new ek8(0, this));
            return true;
        }
    }

    public final void N(int i) {
        RecyclerView recyclerView = this.I0;
        if ((recyclerView.getLayoutManager() instanceof LinearLayoutManager) && recyclerView.getWidth() != 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            View childAt = recyclerView.getChildAt(i);
            linearLayoutManager.m1(i, Math.max(0, (recyclerView.getWidth() / 2) - ((childAt != null ? childAt.getWidth() : getContext().getResources().getDimensionPixelOffset(ydc.compose_view_item_height) - this.E0.j) / 2)));
        }
    }

    public final boolean O(boolean z) {
        ch chVar = this.T0;
        if (!chVar.q() || !z) {
            setTranslationY(c44.DEFAULT_ASPECT_RATIO);
            setVisibility(0);
            return true;
        } else if (getVisibility() == 0) {
            return false;
        } else {
            setTranslationY(c44.DEFAULT_ASPECT_RATIO);
            chVar.j(this);
            return true;
        }
    }

    public final void P(int i) {
        Toast toast = this.S0;
        if (toast != null) {
            toast.cancel();
        }
        Toast makeText = Toast.makeText(getContext(), i, 0);
        this.S0 = makeText;
        makeText.show();
    }

    public final void Q() {
        boolean z = false;
        boolean z2 = true;
        boolean z3 = this.U0.c.u() && !this.W0;
        this.W0 = false;
        h48 h48 = this.P0;
        int c = h48.f.c();
        View view = this.G0;
        if (c == 0) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            int i = this.Y0;
            if (i != -1 && i < c) {
                this.I0.D0(c - 1);
            }
        }
        this.Y0 = c;
        boolean z4 = this.V0;
        sqd sqd = h48.f;
        ImageButton imageButton = this.L0;
        ImageButton imageButton2 = this.M0;
        if (z4) {
            imageButton2.setVisibility(8);
            imageButton.setVisibility(8);
            if (sqd.c() > 0) {
                z = true;
            }
            R(z);
        } else {
            this.K0.setVisibility(0);
            int c2 = sqd.c();
            boolean z5 = c2 > 1;
            ch chVar = this.T0;
            if (z3) {
                if (z5) {
                    chVar.a(imageButton2);
                } else {
                    chVar.c(imageButton2);
                }
            } else if (z5) {
                imageButton2.setVisibility(0);
            } else {
                imageButton2.setVisibility(8);
            }
            if (!this.X0 && c2 <= 0) {
                z2 = false;
            }
            if (z3) {
                if (z2) {
                    chVar.a(imageButton);
                } else {
                    chVar.c(imageButton);
                }
            } else if (z2) {
                imageButton.setVisibility(0);
            } else {
                imageButton.setVisibility(8);
            }
        }
        CharSequence charSequence = sqd.j;
        if (charSequence != null) {
            this.O0.setText(charSequence);
        }
        L();
        this.Q0.m();
    }

    public final void R(boolean z) {
        Editable text = this.O0.getText();
        this.K0.setVisibility((z || !TextUtils.isEmpty(text != null ? text.toString().trim() : null)) ? 0 : 8);
    }

    public final void c() {
        Context context = getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        setBackgroundColor(0);
        this.I0.setBackgroundColor(k0.n);
        View view = this.G0;
        int i = k0.n;
        view.setBackgroundColor(i);
        this.F0.setBackgroundColor(i);
        this.J0.setBackgroundColor(k0.L);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageButton imageButton = this.K0;
        int i2 = k0.l;
        imageButton.setColorFilter(i2, mode);
        imageButton.setBackground(k0.d());
        fj3 fj3 = (fj3) imageButton.getLayoutParams();
        fj3.width = -2;
        imageButton.setLayoutParams(fj3);
        iq.M(imageButton, 0);
        iq.L(imageButton, 0);
        RippleDrawable d = k0.d();
        ImageButton imageButton2 = this.L0;
        imageButton2.setBackground(d);
        RippleDrawable d2 = k0.d();
        ImageButton imageButton3 = this.M0;
        imageButton3.setBackground(d2);
        int i3 = k0.x;
        imageButton2.setColorFilter(i3, mode);
        imageButton3.setColorFilter(i3, mode);
        ImageButton imageButton4 = this.N0;
        imageButton4.setColorFilter(i3, mode);
        imageButton4.setBackground(k0.d());
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(k0.j), i != 0 ? new ColorDrawable(i) : null, (Drawable) null);
        rippleDrawable.setRadius(this.E0.q);
        imageButton4.setBackground(rippleDrawable);
        MessageComposeEditText messageComposeEditText = this.O0;
        messageComposeEditText.setTextColor(k0.G);
        messageComposeEditText.setHintTextColor(k0.N);
        iq.W(messageComposeEditText, i2);
    }

    public int getBottomShadowHeight() {
        return this.H0.getHeight();
    }

    public int getContentHeight() {
        MessageComposeEditText messageComposeEditText = this.O0;
        int measuredHeight = messageComposeEditText.getVisibility() == 0 ? messageComposeEditText.getMeasuredHeight() : 0;
        View view = this.G0;
        if (view.getVisibility() == 0) {
            measuredHeight += view.getMeasuredHeight();
        }
        int paddingBottom = getPaddingBottom();
        this.E0.getClass();
        if (paddingBottom < vo4.b((int) 200.0f)) {
            measuredHeight += getPaddingBottom();
        }
        return getPaddingTop() + measuredHeight;
    }

    public int getHeightWithoutShadow() {
        return getHeight() - this.H0.getHeight();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0.getLayoutManager();
        r1 = r0.V0();
        r0 = r0.r(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair<java.lang.Integer, java.lang.Integer> getScrollPosition() {
        /*
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.I0
            androidx.recyclerview.widget.a r1 = r0.getLayoutManager()
            boolean r1 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r1 == 0) goto L_0x0039
            int r1 = r0.getWidth()
            if (r1 == 0) goto L_0x0039
            androidx.recyclerview.widget.a r0 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r1 = r0.V0()
            android.view.View r0 = r0.r(r1)
            if (r0 == 0) goto L_0x0039
            int r0 = r0.getLeft()
            ro4 r2 = r2.E0
            int r2 = r2.j
            int r2 = r2 / 2
            int r0 = r0 - r2
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.<init>(r1, r0)
            return r2
        L_0x0039:
            android.util.Pair r2 = new android.util.Pair
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.mediabar.MediaBarPreviewLayout.getScrollPosition():android.util.Pair");
    }

    public void setAnimojisEnabled(boolean z) {
        MessageComposeEditText messageComposeEditText = this.O0;
        if (messageComposeEditText != null) {
            messageComposeEditText.setAnimojiEnabled(z);
        }
    }

    public void setChatMode(uk2 uk2) {
        int i = uk2.a() ? nad.v1 : nad.i1;
        ImageButton imageButton = this.K0;
        imageButton.setImageResource(i);
        imageButton.setLongClickable(uk2.a());
    }

    public void setFullScreen(boolean z) {
        this.X0 = z;
        Q();
        c();
    }

    public void setListener(fk8 fk8) {
        this.R0 = fk8;
    }

    public void setMessageEdit(boolean z) {
        this.V0 = z;
        Q();
        c();
    }

    public void setShouldApplyHighlight(boolean z) {
        this.Q0.v = z;
    }
}
