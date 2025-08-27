package defpackage;

import android.content.DialogInterface;
import ru.ok.messages.views.dialogs.FrgDlgLeaveChat;

/* renamed from: jh6  reason: default package */
public final /* synthetic */ class jh6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgDlgLeaveChat b;

    public /* synthetic */ jh6(FrgDlgLeaveChat frgDlgLeaveChat, int i) {
        this.a = i;
        this.b = frgDlgLeaveChat;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                ((kh6) this.b.b3()).V();
                return;
            default:
                FrgDlgLeaveChat frgDlgLeaveChat = this.b;
                ((kh6) frgDlgLeaveChat.b3()).S(frgDlgLeaveChat.F2().getLong("ru.ok.tamtam.extra.CHAT_ID"));
                return;
        }
    }
}
