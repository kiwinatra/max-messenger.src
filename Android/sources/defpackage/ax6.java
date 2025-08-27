package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Collections;
import java.util.List;

/* renamed from: ax6  reason: default package */
public final class ax6 extends tyc {
    public ro4 o;
    public final cx6 v;
    public final List w;
    public boolean x = true;
    public final boolean y = true;
    public kg6 z;

    public ax6(cx6 cx6, kx6 kx6) {
        List singletonList = Collections.singletonList(kx6);
        this.v = cx6;
        this.w = singletonList;
    }

    public final void E(RelativeLayout relativeLayout, Context context, boolean z2) {
        View view = new View(context);
        view.setId(z2 ? lic.row_promo__separator_top : lic.row_promo__separator_bottom);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.o.a);
        if (z2) {
            layoutParams.addRule(10);
        } else {
            layoutParams.addRule(3, lic.row_promo__btn_action);
        }
        relativeLayout.addView(view, layoutParams);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int j() {
        /*
            r4 = this;
            kg6 r0 = r4.z
            r1 = 0
            if (r0 == 0) goto L_0x002b
            ru.ok.messages.channels.FrgChatMembers r0 = r0.a
            int r2 = r0.X1
            r3 = 2
            if (r2 == r3) goto L_0x000e
        L_0x000c:
            r0 = r1
            goto L_0x0028
        L_0x000e:
            ij2 r2 = r0.C1
            ij2 r3 = defpackage.ij2.MEMBER
            if (r2 != r3) goto L_0x001b
            a32 r0 = r0.B1
            boolean r0 = r0.u()
            goto L_0x0028
        L_0x001b:
            ij2 r3 = defpackage.ij2.ADMIN
            if (r2 != r3) goto L_0x000c
            a32 r0 = r0.B1
            boolean r0 = r0.s()
            if (r0 == 0) goto L_0x000c
            r0 = 1
        L_0x0028:
            if (r0 != 0) goto L_0x002b
            return r1
        L_0x002b:
            boolean r0 = r4.x
            if (r0 == 0) goto L_0x0035
            java.util.List r4 = r4.w
            int r1 = r4.size()
        L_0x0035:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax6.j():int");
    }

    public final long k(int i) {
        return (long) l(i);
    }

    public final int l(int i) {
        int ordinal = ((kx6) this.w.get(i)).ordinal();
        return ordinal != 2 ? ordinal != 8 ? ordinal != 11 ? lic.header : lic.header_recent_search : lic.header_ok_contacts_search : lic.header_onboarding_invite_contacts;
    }

    public final void s(pzc pzc, int i) {
        dx6 dx6 = (dx6) pzc;
        int i2 = dx6.w;
        int i3 = lic.header_onboarding_invite_contacts;
        boolean z2 = this.y;
        int i4 = 0;
        if (i2 == i3) {
            n8c n8c = (n8c) dx6;
            n8c.Q0 = kx6.c;
            n8c.L0.setVisibility(8);
            n8c.P0.setVisibility(8);
            int i5 = qad.m6;
            View view = n8c.a;
            n8c.M0.setText(view.getContext().getString(i5));
            Button button = n8c.N0;
            button.setAllCaps(true);
            button.setText(view.getContext().getString(qad.l6));
            if (!z2) {
                i4 = 8;
            }
            n8c.O0.setVisibility(i4);
        } else if (i2 == lic.header_recent_search) {
            n8c n8c2 = (n8c) dx6;
            n8c2.Q0 = kx6.x;
            n8c2.L0.setTextColor(n8c2.K0.N);
            if (!z2) {
                i4 = 8;
            }
            n8c2.O0.setVisibility(i4);
        } else {
            kx6 kx6 = (kx6) this.w.get(i);
            dx6.J0 = kx6;
            View view2 = dx6.E0;
            if (view2 != null) {
                dx6.a.setEnabled(true);
                view2.setVisibility(0);
                ImageView imageView = dx6.G0;
                imageView.setBackground((Drawable) null);
                TextView textView = dx6.F0;
                if (textView != null) {
                    textView.setTextColor(dx6.H0.l);
                }
                imageView.setVisibility(0);
                int ordinal = dx6.J0.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        dx6.M();
                        textView.setText(qad.g);
                        imageView.setImageResource(nad.q);
                        return;
                    } else if (ordinal == 4) {
                        dx6.M();
                        textView.setText(qad.A0);
                        imageView.setImageResource(nad.q);
                        return;
                    } else if (ordinal != 5) {
                        if (ordinal == 6) {
                            textView.setText(qad.T1);
                            imageView.setImageResource(nad.F);
                            return;
                        } else if (ordinal != 7) {
                            ro4 ro4 = dx6.D0;
                            if (ordinal == 9) {
                                textView.setText(qad.U3);
                                iq.N(textView, ro4.H);
                                imageView.setVisibility(8);
                                return;
                            } else if (ordinal == 10) {
                                textView.setText(qad.T3);
                                iq.N(textView, ro4.H);
                                imageView.setVisibility(8);
                                return;
                            } else {
                                throw new IllegalArgumentException("Unimplemented headerType: " + kx6.name());
                            }
                        } else {
                            textView.setText(qad.U0);
                            imageView.setImageResource(nad.q);
                            return;
                        }
                    }
                }
                dx6.M();
                textView.setText(qad.c);
                imageView.setImageResource(nad.q);
            }
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        View view;
        if (this.o == null) {
            viewGroup.getContext();
            this.o = ro4.b();
        }
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        int i2 = lic.header_onboarding_invite_contacts;
        cx6 cx6 = this.v;
        if (i == i2) {
            Context context = viewGroup.getContext();
            RelativeLayout relativeLayout = new RelativeLayout(context);
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
            appCompatImageView.setId(lic.row_promo__iv_icon);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(14);
            ro4 ro4 = this.o;
            layoutParams.topMargin = ro4.q;
            layoutParams.bottomMargin = ro4.k;
            relativeLayout.addView(appCompatImageView, layoutParams);
            AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
            appCompatTextView.setId(lic.row_promo__tv_title);
            appCompatTextView.setGravity(17);
            appCompatTextView.setTextSize(18.0f);
            appCompatTextView.setText(context.getString(qad.b8));
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.addRule(3, lic.row_promo__iv_icon);
            ro4 ro42 = this.o;
            layoutParams2.topMargin = ro42.j;
            layoutParams2.setMarginStart(ro42.y);
            layoutParams2.setMarginEnd(this.o.y);
            relativeLayout.addView(appCompatTextView, layoutParams2);
            AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, (AttributeSet) null);
            appCompatTextView2.setId(lic.row_promo__tv_description);
            appCompatTextView2.setGravity(17);
            appCompatTextView2.setTextSize(16.0f);
            int i3 = this.o.j;
            appCompatTextView2.setPaddingRelative(i3, 0, i3, 0);
            appCompatTextView2.setText(context.getString(qad.a8));
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams3.addRule(3, lic.row_promo__tv_title);
            ro4 ro43 = this.o;
            layoutParams3.topMargin = ro43.d;
            layoutParams3.setMarginStart(ro43.y);
            layoutParams3.setMarginEnd(this.o.y);
            relativeLayout.addView(appCompatTextView2, layoutParams3);
            Button button = new Button(context);
            button.setId(lic.row_promo__btn_action);
            button.setTextSize(14.0f);
            button.setAllCaps(true);
            button.setGravity(17);
            button.setMinHeight(this.o.q);
            ro4 ro44 = this.o;
            int i4 = ro44.q;
            int i5 = ro44.f;
            button.setPaddingRelative(i4, i5, i4, i5);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, this.o.w);
            layoutParams4.addRule(14);
            layoutParams4.addRule(3, lic.row_promo__tv_description);
            ro4 ro45 = this.o;
            layoutParams4.topMargin = ro45.k;
            layoutParams4.bottomMargin = ro45.p;
            relativeLayout.addView(button, layoutParams4);
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(context, (AttributeSet) null);
            appCompatImageButton.setId(lic.row_promo__btn_close);
            appCompatImageButton.setImageResource(nad.W);
            int i6 = this.o.w;
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(i6, i6);
            layoutParams5.addRule(21);
            int i7 = this.o.f;
            layoutParams5.topMargin = i7;
            layoutParams5.setMarginEnd(i7);
            relativeLayout.addView(appCompatImageButton, layoutParams5);
            E(relativeLayout, context, true);
            E(relativeLayout, context, false);
            return new n8c(relativeLayout, cx6);
        } else if (i == lic.header_recent_search) {
            return new n8c(from.inflate(ujc.ll_header_recent_search, viewGroup, false), cx6);
        } else {
            if (i == lic.header_ok_contacts_search) {
                view = from.inflate(ujc.row_header_contact_ok_search, viewGroup, false);
            } else if (i == lic.header) {
                view = from.inflate(ujc.row_header, viewGroup, false);
            } else {
                throw new IllegalArgumentException(String.format("viewType %d not supported", new Object[]{Integer.valueOf(i)}));
            }
            return new dx6(view, cx6);
        }
    }
}
