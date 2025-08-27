package ru.ok.messages.actions.chat;

import android.content.Context;
import android.util.AttributeSet;
import ru.ok.messages.actions.ExtraActionsView;

public class ChatExtraActionsView extends ExtraActionsView<Object> {
    public static final /* synthetic */ int y0 = 0;

    public ChatExtraActionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void r(lf5 lf5) {
        ir1 ir1 = new ir1(9, this, lf5);
        if (this.w == null) {
            l(ir1, true);
        }
    }

    public final boolean t() {
        if (!super.t()) {
            return false;
        }
        s();
        return true;
    }
}
