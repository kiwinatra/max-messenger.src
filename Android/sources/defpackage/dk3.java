package defpackage;

import ru.ok.messages.bots.InlineKeyboardAttachView;

/* renamed from: dk3  reason: default package */
public final class dk3 extends pzc {
    public final gg9 D0;
    public final InlineKeyboardAttachView E0;

    public dk3(ek3 ek3, fk3 fk3, t3a t3a, a30 a30) {
        super(fk3);
        gg9 gg9 = (gg9) fk3.findViewById(lic.row_constructor_message__message);
        this.D0 = gg9;
        gg9.A(ek3.y, ek3.z, ek3.X);
        gg9.setMessageClickListener(t3a);
        gg9.setAudioTranscriptionStateChangeListener(a30);
        this.E0 = (InlineKeyboardAttachView) fk3.findViewById(lic.row_constructor_message__inline_keyboard);
    }
}
