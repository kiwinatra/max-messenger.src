package defpackage;

import android.content.DialogInterface;
import kotlin.TuplesKt;
import ru.ok.messages.views.dialogs.ConfirmationDestructiveDialog;

/* renamed from: sg3  reason: default package */
public final /* synthetic */ class sg3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmationDestructiveDialog b;

    public /* synthetic */ sg3(ConfirmationDestructiveDialog confirmationDestructiveDialog, int i) {
        this.a = i;
        this.b = confirmationDestructiveDialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ConfirmationDestructiveDialog confirmationDestructiveDialog = this.b;
        switch (this.a) {
            case 0:
                String str = ConfirmationDestructiveDialog.B1;
                confirmationDestructiveDialog.Q1().f0("CONFIRMATION_DESTRUCTIVE_REQUEST_KEY", o54.f(TuplesKt.to("ConfirmationDestructiveDialogResult:key", new wg3(confirmationDestructiveDialog.F2().getBundle("destructive:data")))));
                return;
            default:
                String str2 = ConfirmationDestructiveDialog.B1;
                confirmationDestructiveDialog.Q1().f0("CONFIRMATION_DESTRUCTIVE_REQUEST_KEY", o54.f(TuplesKt.to("ConfirmationDestructiveDialogResult:key", new ug3(confirmationDestructiveDialog.F2().getBundle("destructive:data")))));
                return;
        }
    }
}
