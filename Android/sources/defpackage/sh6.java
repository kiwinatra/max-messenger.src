package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import ru.ok.messages.views.dialogs.FrgDlgPermissions;

/* renamed from: sh6  reason: default package */
public final /* synthetic */ class sh6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgDlgPermissions b;

    public /* synthetic */ sh6(FrgDlgPermissions frgDlgPermissions, int i) {
        this.a = i;
        this.b = frgDlgPermissions;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FrgDlgPermissions frgDlgPermissions = this.b;
        switch (this.a) {
            case 0:
                if (frgDlgPermissions.F1) {
                    b M1 = frgDlgPermissions.M1();
                    if (M1 instanceof th6) {
                        ((th6) M1).x0();
                    }
                    a aVar = frgDlgPermissions.G0;
                    if (aVar instanceof th6) {
                        ((th6) aVar).x0();
                        return;
                    }
                    return;
                } else if (frgDlgPermissions.F2().getBoolean("use.result.api", false)) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("dialog:permissions:result", true);
                    frgDlgPermissions.Q1().f0(frgDlgPermissions.J0, bundle);
                    return;
                } else {
                    String[] stringArray = frgDlgPermissions.F2().getStringArray("ru.ok.tamtam.extra.PERMISSIONS");
                    a U1 = frgDlgPermissions.U1(true);
                    if (U1 != null) {
                        n54.N(U1, stringArray, frgDlgPermissions.V1());
                        return;
                    }
                    b M12 = frgDlgPermissions.M1();
                    if (M12 != null) {
                        int V1 = frgDlgPermissions.V1();
                        String[] strArr = n54.c;
                        q8.L(M12, stringArray, V1);
                        n54.P(n54.m(M12), stringArray);
                        return;
                    }
                    return;
                }
            default:
                int i2 = FrgDlgPermissions.G1;
                b M13 = frgDlgPermissions.M1();
                if (M13 != null) {
                    String[] strArr2 = n54.c;
                    M13.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", M13.getPackageName(), (String) null)));
                }
                b M14 = frgDlgPermissions.M1();
                if (M14 instanceof th6) {
                    ((th6) M14).q0();
                }
                a aVar2 = frgDlgPermissions.G0;
                if (aVar2 instanceof th6) {
                    ((th6) aVar2).q0();
                    return;
                }
                return;
        }
    }
}
