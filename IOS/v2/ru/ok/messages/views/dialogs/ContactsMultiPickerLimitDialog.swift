package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class ContactsMultiPickerLimitDialog extends DialogFragment {
    public static ContactsMultiPickerLimitDialog Z2(int i, String str, String str2) {
        ContactsMultiPickerLimitDialog contactsMultiPickerLimitDialog = new ContactsMultiPickerLimitDialog();
        Bundle bundle = new Bundle();
        bundle.putInt("ru.ok.tamtam.extra.LIMIT", i);
        bundle.putString("ru.ok.tamtam.extra.TITLE", str);
        bundle.putString("ru.ok.tamtam.extra.CONTENT", str2);
        contactsMultiPickerLimitDialog.L2(bundle);
        return contactsMultiPickerLimitDialog;
    }

    public final Dialog V2(Bundle bundle) {
        int i = F2().getInt("ru.ok.tamtam.extra.LIMIT");
        String string = F2().getString("ru.ok.tamtam.extra.TITLE");
        String string2 = F2().getString("ru.ok.tamtam.extra.CONTENT");
        cg8 q = new cg8(G2()).q(string);
        q.a.f = String.format(string2, new Object[]{Integer.valueOf(i)});
        return q.n(qad.y1, new e10(1)).g();
    }
}
