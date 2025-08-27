package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import com.google.android.material.ComGoogleAndroidMaterialR$style;

public class FrgDlgPermissions extends FrgDlgBase {
    public static final int G1 = qad.aa;
    public static final int H1 = qad.y1;
    public boolean F1;

    public static FrgDlgPermissions b3(String[] strArr, int i, int i2, int i3, boolean z) {
        FrgDlgPermissions frgDlgPermissions = new FrgDlgPermissions();
        Bundle bundle = new Bundle();
        bundle.putStringArray("ru.ok.tamtam.extra.PERMISSIONS", strArr);
        bundle.putInt("ru.ok.tamtam.extra.POSITIVE_BUTTON", i3);
        bundle.putInt("ru.ok.tamtam.extra.TITLE", i);
        bundle.putInt("ru.ok.tamtam.extra.CONTENT", i2);
        bundle.putBoolean("ru.ok.tamtam.extra.MODE_SETTINGS", z);
        frgDlgPermissions.L2(bundle);
        return frgDlgPermissions;
    }

    public final Dialog V2(Bundle bundle) {
        Bundle F2 = F2();
        this.F1 = F2.getBoolean("ru.ok.tamtam.extra.MODE_SETTINGS");
        int i = F2.getInt("ru.ok.tamtam.extra.CONTENT");
        int i2 = F2.getInt("ru.ok.tamtam.extra.TITLE", G1);
        int i3 = F2.getInt("ru.ok.tamtam.extra.POSITIVE_BUTTON", H1);
        cg8 cg8 = new cg8(new kx3(G2(), ComGoogleAndroidMaterialR$style.Theme_MaterialComponents));
        cg8.r(i2);
        cg8.i(i);
        cg8 n = cg8.n(i3, new sh6(this, 0));
        n.a.m = false;
        if (this.F1) {
            n.l(qad.W6, new sh6(this, 1));
        }
        return n.create();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        b M1 = M1();
        if (M1 instanceof th6) {
            ((th6) M1).r();
        }
        a aVar = this.G0;
        if (aVar instanceof th6) {
            ((th6) aVar).r();
        }
    }
}
