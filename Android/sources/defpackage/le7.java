package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.Lazy;
import kotlin.reflect.KProperty;
import ru.ok.messages.messages.widgets.layouts.OutgoingMessageLayout;

/* renamed from: le7  reason: default package */
public final class le7 extends pzc implements b6f, mb9 {
    public final View D0;
    public of9 E0;
    public gg9 F0;
    public final /* synthetic */ int G0;
    public final kg9 H0;

    public le7(View view) {
        super(view);
        view.getContext();
        ro4.b();
        this.D0 = view;
    }

    public final void M(boolean z) {
        bt0 bt0 = bt0.a;
        gg9 gg9 = this.F0;
        if (gg9 != null) {
            scf scf = gg9.e1;
            if (scf == null) {
                Context context = gg9.getContext();
                Lazy lazy = scf.b0;
                scf = j4b.k0(context);
            }
            scf scf2 = scf;
            Drawable messageBackground = gg9.getMessageBackground();
            r89 r89 = messageBackground instanceof r89 ? (r89) messageBackground : null;
            if (r89 != null) {
                r89.b(r89, z, bt0, !gg9.v(), !gg9.m(), 0, false, 224);
                int[] iArr = scf2.i.a.l;
                KProperty[] kPropertyArr = r89.z;
                r89.v.setValue(r89, kPropertyArr[0], iArr);
                r89.w.setValue(r89, kPropertyArr[1], scf2.h.a.l);
                r89.h = gg9.a1.d.b;
            } else {
                r89 = new r89(scf2.i.a.l, scf2.h.a.l, z, bt0, false, !gg9.m(), !gg9.v(), (Drawable) null, false, gg9.a1.d.b);
            }
            if (!gg9.m()) {
                ve9 ve9 = gg9.M0;
                if (ve9 != null) {
                    ve9.setBackground((Drawable) null);
                }
                lf9 lf9 = gg9.D0;
                if (lf9 != null) {
                    lf9.setBackground((Drawable) null);
                }
                gg9.setBackground(r89);
            } else if (gg9.u()) {
                lf9 lf92 = gg9.D0;
                if (lf92 != null) {
                    lf92.setBackground((Drawable) null);
                }
                gg9.setBackground((Drawable) null);
                gg9.M0.setBackground(r89);
                gg9.M0.invalidate();
            } else if (gg9.w() && gg9.n()) {
                ve9 ve92 = gg9.M0;
                if (ve92 != null) {
                    ve92.setBackground((Drawable) null);
                }
                gg9.setBackground((Drawable) null);
                gg9.D0.setBackground(r89);
            }
        }
    }

    public final long a() {
        return this.E0.a.a.c;
    }

    public final boolean d() {
        switch (this.G0) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public le7(kg9 kg9, ju8 ju8, ju8 ju82, ju8 ju83) {
        this(kg9);
        this.G0 = 0;
        this.H0 = kg9;
        kg9.setDarkTheme(((qra) ym.e()).I().f());
        gg9 messageView = kg9.getMessageView();
        this.F0 = messageView;
        messageView.setTextLayoutRepository((ef9) null);
        this.F0.setLinkListener((dg9) null);
        this.F0.setMessageClickListener((t3a) null);
        this.F0.setPipRequestListener((o89) null);
        this.F0.setLottieLayer((gb8) null);
        this.F0.A(ju8, ju82, ju83);
        this.F0.setAudioAttachViewDelegate((b30) null);
        this.F0.setAudioTranscriptionStateChangeListener((a30) null);
        this.F0.setMessageExpandedStateChangeListener((eg9) null);
        kg9.setKeyboardClickListener((bg7) null);
        kg9.setSwipeListener(this);
        kg9.setDirection(1);
        kg9.setReactionAnimator((iqc) null);
        kg9.f();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public le7(OutgoingMessageLayout outgoingMessageLayout, ju8 ju8, ju8 ju82, ju8 ju83) {
        this(outgoingMessageLayout);
        this.G0 = 1;
        this.H0 = outgoingMessageLayout;
        gg9 messageView = outgoingMessageLayout.getMessageView();
        this.F0 = messageView;
        messageView.setTextLayoutRepository((ef9) null);
        this.F0.setLinkListener((dg9) null);
        this.F0.setMessageClickListener((t3a) null);
        this.F0.setPipRequestListener((o89) null);
        this.F0.setLottieLayer((gb8) null);
        this.F0.A(ju8, ju82, ju83);
        this.F0.setAudioAttachViewDelegate((b30) null);
        this.F0.setAudioTranscriptionStateChangeListener((a30) null);
        this.F0.setMessageExpandedStateChangeListener((eg9) null);
        outgoingMessageLayout.setKeyboardClickListener((bg7) null);
        outgoingMessageLayout.setSwipeListener(this);
        outgoingMessageLayout.setDirection(1);
        outgoingMessageLayout.setReactionAnimator((iqc) null);
        outgoingMessageLayout.setDarkTheme(((qra) ym.e()).I().f());
        outgoingMessageLayout.f();
    }
}
