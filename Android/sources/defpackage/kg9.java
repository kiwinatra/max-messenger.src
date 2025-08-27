package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.math.MathKt;
import ru.ok.messages.bots.InlineKeyboardAttachView;
import ru.ok.messages.views.widgets.TamAvatarView;
import ru.ok.onechat.reactions.ui.badge.ReactionsBadgeView;

/* renamed from: kg9  reason: default package */
public abstract class kg9 extends c6f {
    public boolean A0;
    public final cv4 c;
    public final float o;
    public final int v;
    public InlineKeyboardAttachView v0;
    public final gg9 w;
    public TamAvatarView w0;
    public ReactionsBadgeView x;
    public int x0;
    public AppCompatImageView y;
    public int y0;
    public AppCompatImageView z;
    public t3a z0;

    public kg9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        scf scf;
        this.a = 0;
        this.b = vo4.b(64);
        ct.b(this);
        if (ct.y(getContext())) {
            int i = this.a;
            if (i == 0) {
                this.a = 1;
            } else if (i == 1) {
                this.a = 0;
            }
        }
        ViewConfiguration.get(getContext()).getScaledTouchSlop();
        VelocityTracker.obtain();
        setWillNotDraw(false);
        this.o = 1.0f;
        float f = (float) 8;
        int roundToInt = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        this.v = roundToInt;
        this.x0 = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        float f2 = (float) 2;
        this.y0 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2);
        if (isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context2 = getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context2);
        }
        this.c = new cv4(new fv4(iq.E(nad.p1, scf.u, getContext()), roundToInt, roundToInt, roundToInt, roundToInt, false), i8b.K(Integer.valueOf(scf.s), (Integer) null, (Integer) null));
        gg9 gg9 = new gg9(context);
        gg9.setId(lic.row_message__view_message);
        gg9.setClipChildren(false);
        gg9.setClipToPadding(false);
        int roundToInt2 = MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density);
        gg9.setPadding(roundToInt2, roundToInt2, roundToInt2, roundToInt2);
        setup(gg9);
        this.w = gg9;
        addView(gg9);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setOnLongClickListener(new z20(9, this));
        ct.G(this, 300, new jg9(this, 0));
        ct.G(gg9, 300, new jg9(this, 1));
        setClipChildren(false);
        setClipToPadding(false);
    }

    public final void b(a89 a89) {
        if (!a89.a.r()) {
            InlineKeyboardAttachView inlineKeyboardAttachView = this.v0;
            if (inlineKeyboardAttachView != null) {
                inlineKeyboardAttachView.setVisibility(8);
                return;
            }
            return;
        }
        if (this.v0 == null) {
            InlineKeyboardAttachView e = e();
            this.v0 = e;
            gg9 gg9 = this.w;
            e.setPaddingRelative(gg9.getPaddingStart(), 0, gg9.getPaddingEnd(), 0);
        }
        InlineKeyboardAttachView inlineKeyboardAttachView2 = this.v0;
        if (inlineKeyboardAttachView2 != null) {
            inlineKeyboardAttachView2.setVisibility(0);
        }
        InlineKeyboardAttachView inlineKeyboardAttachView3 = this.v0;
        if (inlineKeyboardAttachView3 != null) {
            inlineKeyboardAttachView3.setClickListener((bg7) null);
        }
        InlineKeyboardAttachView inlineKeyboardAttachView4 = this.v0;
        if (inlineKeyboardAttachView4 != null) {
            inlineKeyboardAttachView4.a.a(a89.a.h());
        }
    }

    public void c(a89 a89) {
    }

    public AppCompatImageView d() {
        return null;
    }

    public abstract InlineKeyboardAttachView e();

    public final void f() {
        this.z0 = null;
        gg9 gg9 = this.w;
        gg9.setOnTouchListener((View.OnTouchListener) null);
        gg9.setOnAnyChildDoubleClickListener((fg9) null);
    }

    public final TamAvatarView getAvatar() {
        return this.w0;
    }

    public final AppCompatImageView getForward() {
        return this.y;
    }

    public final InlineKeyboardAttachView getKeyboard() {
        return this.v0;
    }

    public final bg7 getKeyboardClickListener() {
        return null;
    }

    public final gg9 getMessageView() {
        return this.w;
    }

    public int getPaddingBottom() {
        int i = dt0.$EnumSwitchMapping$0[this.w.Y0.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public int getPaddingTop() {
        int i = dt0.$EnumSwitchMapping$0[this.w.Y0.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final iqc getReactionAnimator() {
        return null;
    }

    public final int getReactionsBadgeHorizontalOffset() {
        return this.y0;
    }

    public final int getReactionsBadgeVerticalOffset() {
        return this.x0;
    }

    public ReactionsBadgeView getReactionsBadgeView() {
        return this.x;
    }

    public final AppCompatImageView getSendingStatus() {
        return this.z;
    }

    public final void onDraw(Canvas canvas) {
        if (a()) {
            int direction = getDirection();
            int i = this.v;
            cv4 cv4 = this.c;
            if (direction == 0) {
                cv4.setBounds(i, (getHeight() / 2) - (cv4.getIntrinsicHeight() / 2), cv4.getIntrinsicWidth() + i, (cv4.getIntrinsicHeight() / 2) + (getHeight() / 2));
            } else {
                cv4.setBounds((getWidth() - i) - cv4.getIntrinsicWidth(), (getHeight() / 2) - (cv4.getIntrinsicHeight() / 2), getWidth() - i, (cv4.getIntrinsicHeight() / 2) + (getHeight() / 2));
            }
            canvas.save();
            float f = this.o;
            if (((float) cv4.getBounds().height()) * f > ((float) getMeasuredHeight())) {
                f = ((float) getMeasuredHeight()) / ((float) cv4.getBounds().height());
            }
            canvas.scale(f, f, (float) cv4.getBounds().centerX(), (float) cv4.getBounds().centerY());
            cv4.draw(canvas);
            canvas.restore();
        }
    }

    public final void setAvatar(TamAvatarView tamAvatarView) {
        this.w0 = tamAvatarView;
    }

    public void setDarkTheme(boolean z2) {
        this.A0 = z2;
        AppCompatImageView appCompatImageView = this.y;
        if (appCompatImageView != null) {
            appCompatImageView.setImageResource(nad.p0);
        }
        AppCompatImageView appCompatImageView2 = this.z;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(new md9(z2));
        }
    }

    public final void setForward(AppCompatImageView appCompatImageView) {
        this.y = appCompatImageView;
    }

    public final void setKeyboard(InlineKeyboardAttachView inlineKeyboardAttachView) {
        this.v0 = inlineKeyboardAttachView;
    }

    public final void setKeyboardClickListener(bg7 bg7) {
    }

    public final void setReactionAnimator(iqc iqc) {
    }

    public final void setReactionsBadgeHorizontalOffset(int i) {
        this.y0 = i;
    }

    public final void setReactionsBadgeVerticalOffset(int i) {
        this.x0 = i;
    }

    public void setReactionsBadgeView(ReactionsBadgeView reactionsBadgeView) {
        this.x = reactionsBadgeView;
    }

    public final void setSendingStatus(AppCompatImageView appCompatImageView) {
        this.z = appCompatImageView;
    }

    public void setup(gg9 gg9) {
    }
}
