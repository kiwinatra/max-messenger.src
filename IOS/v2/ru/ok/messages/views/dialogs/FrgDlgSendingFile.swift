package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import ru.ok.messages.views.fragments.base.FrgBaseProfile;

public class FrgDlgSendingFile extends FrgDlgChecked<FrgBaseProfile> {
    public final Dialog V2(Bundle bundle) {
        String str;
        int i = F2().getInt("ru.ok.tamtam.extra.CHECKED_COUNT");
        cg8 cg8 = new cg8(G2());
        if (i == 1) {
            str = S1(qad.K8);
        } else if (i > 1) {
            ((qra) ym.e()).n().getClass();
            str = String.format(Resources.getSystem().getConfiguration().getLocales().get(0), "%s (%d)", new Object[]{S1(qad.L8), Integer.valueOf(i)});
        } else {
            str = S1(qad.y3);
        }
        cg8.h(new CharSequence[]{str, S1(qad.x3)}, new d10(13, (Object) this));
        return cg8.g();
    }

    public final Class c3() {
        return FrgBaseProfile.class;
    }

    public final String e3() {
        return "ru.ok.messages.views.dialogs.FrgDlgSendingFile";
    }
}
