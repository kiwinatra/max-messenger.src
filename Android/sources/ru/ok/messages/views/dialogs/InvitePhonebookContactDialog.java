package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import java.util.ArrayList;

public class InvitePhonebookContactDialog extends FrgDlgBase {
    public final Dialog V2(Bundle bundle) {
        qdb qdb = ((beb) F2().getParcelable("ru.ok.tamtam.extra.PHONE")).a;
        cg8 cg8 = new cg8(G2());
        cg8.a.n = this;
        cg8.r(qad.G8);
        ArrayList arrayList = new ArrayList(qdb.e);
        String str = qdb.h;
        if (!cvg.A(str)) {
            arrayList.add(str);
        }
        cg8.h((CharSequence[]) arrayList.toArray(new CharSequence[0]), new fh6(this, arrayList, qdb, 1));
        return cg8.g();
    }
}
