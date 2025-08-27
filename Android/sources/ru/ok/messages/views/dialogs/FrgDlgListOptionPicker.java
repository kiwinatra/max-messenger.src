package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import java.util.ArrayList;
import ru.ok.messages.settings.FrgPrivacySettings;

public class FrgDlgListOptionPicker extends FrgDlgChecked<FrgPrivacySettings> {
    public static FrgDlgListOptionPicker f3(int i, String str, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("ru.ok.tamtam.extra.OPTIONS", arrayList);
        bundle.putString("ru.ok.tamtam.extra.TITLE", str);
        bundle.putInt("ru.ok.tamtam.extra.REQUEST", i);
        FrgDlgListOptionPicker frgDlgListOptionPicker = new FrgDlgListOptionPicker();
        frgDlgListOptionPicker.L2(bundle);
        return frgDlgListOptionPicker;
    }

    public final Dialog V2(Bundle bundle) {
        ArrayList<String> stringArrayList = this.x.getStringArrayList("ru.ok.tamtam.extra.OPTIONS");
        String string = this.x.getString("ru.ok.tamtam.extra.TITLE");
        int i = this.x.getInt("ru.ok.tamtam.extra.REQUEST");
        cg8 cg8 = new cg8(G2());
        cg8.a.n = this;
        cg8 q = cg8.q(string);
        q.h((CharSequence[]) stringArrayList.toArray(new CharSequence[0]), new lh6(this, i, stringArrayList));
        return q.g();
    }

    public final Class c3() {
        return FrgPrivacySettings.class;
    }

    public final String e3() {
        return "ru.ok.messages.views.dialogs.FrgDlgListOptionPicker";
    }
}
