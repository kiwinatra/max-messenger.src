package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.a;

public class FrgDlgChatsNotification extends FrgDlgBase {
    public final Dialog V2(Bundle bundle) {
        CharSequence[] charSequenceArr = {S1(qad.Y5), S1(qad.h6), S1(qad.g6)};
        cg8 cg8 = new cg8(G2());
        cg8.a.n = this;
        cg8.q(S1(qad.P5));
        cg8.h(charSequenceArr, new d10(4, (Object) this));
        return cg8.g();
    }

    public final void Z2(m5 m5Var) {
        this.B1 = false;
        a aVar = this.G0;
        if (aVar != null && !(aVar instanceof ch6)) {
            throw new IllegalStateException("FrgDlgChatsNotification must be attached to fragment that implements FrgDlgChatsNotification.Listener");
        }
    }
}
