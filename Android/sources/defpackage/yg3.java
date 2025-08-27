package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import kotlin.TuplesKt;
import ru.ok.messages.views.dialogs.ConfirmationDialog;

/* renamed from: yg3  reason: default package */
public final /* synthetic */ class yg3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmationDialog b;

    public /* synthetic */ yg3(ConfirmationDialog confirmationDialog, int i) {
        this.a = i;
        this.b = confirmationDialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                ConfirmationDialog confirmationDialog = this.b;
                Bundle bundle = confirmationDialog.x;
                Bundle bundle2 = bundle != null ? bundle.getBundle("ru.ok.tamtam.extra.DATA") : null;
                confirmationDialog.Q1().f0("ConfirmationDialog:request_key", o54.f(TuplesKt.to("POSITIVE", ah3.b)));
                a U1 = confirmationDialog.U1(true);
                if (U1 == null) {
                    b M1 = confirmationDialog.M1();
                    if (M1 instanceof zg3) {
                        ((zg3) M1).G1(bundle2);
                    } else if (M1 instanceof m5) {
                        Intent intent = new Intent();
                        intent.putExtra("ru.ok.tamtam.extra.DATA", bundle2);
                        ((m5) M1).onActivityResult(confirmationDialog.V1(), -1, intent);
                    }
                } else if (U1 instanceof zg3) {
                    ((zg3) U1).G1(bundle2);
                } else {
                    Intent intent2 = new Intent();
                    intent2.putExtra("ru.ok.tamtam.extra.DATA", bundle2);
                    U1.f2(confirmationDialog.V1(), -1, intent2);
                }
                confirmationDialog.B1 = true;
                return;
            default:
                this.b.Z2();
                return;
        }
    }
}
