package defpackage;

import android.content.DialogInterface;
import androidx.fragment.app.a;
import java.util.ArrayList;
import ru.ok.messages.views.dialogs.FrgDlgShowChatHistory;

/* renamed from: wh6  reason: default package */
public final /* synthetic */ class wh6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgDlgShowChatHistory b;

    public /* synthetic */ wh6(FrgDlgShowChatHistory frgDlgShowChatHistory, int i) {
        this.a = i;
        this.b = frgDlgShowChatHistory;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                FrgDlgShowChatHistory frgDlgShowChatHistory = this.b;
                a aVar = frgDlgShowChatHistory.G0;
                xh6 xh6 = aVar != null ? (xh6) aVar : null;
                if (xh6 != null) {
                    ArrayList arrayList = frgDlgShowChatHistory.F1;
                    frgDlgShowChatHistory.x.getBundle("ru.ok.tamtam.extra.TRANSITION_BUNDLE");
                    xh6.z1(arrayList, true);
                    return;
                }
                return;
            default:
                FrgDlgShowChatHistory frgDlgShowChatHistory2 = this.b;
                a aVar2 = frgDlgShowChatHistory2.G0;
                xh6 xh62 = aVar2 != null ? (xh6) aVar2 : null;
                if (xh62 != null) {
                    ArrayList arrayList2 = frgDlgShowChatHistory2.F1;
                    frgDlgShowChatHistory2.x.getBundle("ru.ok.tamtam.extra.TRANSITION_BUNDLE");
                    xh62.z1(arrayList2, false);
                    return;
                }
                return;
        }
    }
}
