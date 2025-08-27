package defpackage;

import android.content.DialogInterface;
import ru.ok.messages.contacts.picker.ActAdminPicker;
import ru.ok.messages.views.dialogs.FrgDlgMoveOwnerConfirm;
import ru.ok.messages.views.dialogs.ProgressDialog;

/* renamed from: oh6  reason: default package */
public final /* synthetic */ class oh6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ FrgDlgMoveOwnerConfirm a;
    public final /* synthetic */ long b;

    public /* synthetic */ oh6(FrgDlgMoveOwnerConfirm frgDlgMoveOwnerConfirm, long j) {
        this.a = frgDlgMoveOwnerConfirm;
        this.b = j;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ActAdminPicker actAdminPicker = (ActAdminPicker) ((ph6) this.a.b3());
        actAdminPicker.getClass();
        actAdminPicker.M0 = ProgressDialog.b3(actAdminPicker.getString(qad.B1), false, actAdminPicker.v(), (String) null);
        rl e = ((qra) ((id3) actAdminPicker.x.b)).e();
        a32 a32 = actAdminPicker.F0;
        actAdminPicker.G0 = ((jna) e).i(a32.a, a32.b.a, this.b);
    }
}
