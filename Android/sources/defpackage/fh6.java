package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.StringCompanionObject;
import ru.ok.messages.views.dialogs.FrgDlgBase;
import ru.ok.messages.views.dialogs.FrgDlgDisableNotifs;
import ru.ok.messages.views.dialogs.InvitePhonebookContactDialog;
import ru.ok.messages.views.fragments.FrgPhoneProfile;

/* renamed from: fh6  reason: default package */
public final /* synthetic */ class fh6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ FrgDlgBase c;
    public final /* synthetic */ Object o;

    public /* synthetic */ fh6(FrgDlgBase frgDlgBase, ArrayList arrayList, Object obj, int i) {
        this.a = i;
        this.c = frgDlgBase;
        this.b = arrayList;
        this.o = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        long m;
        long j;
        Object obj = this.o;
        List list = this.b;
        FrgDlgBase frgDlgBase = this.c;
        switch (this.a) {
            case 0:
                FrgDlgDisableNotifs frgDlgDisableNotifs = (FrgDlgDisableNotifs) frgDlgBase;
                frgDlgDisableNotifs.getClass();
                CharSequence charSequence = (CharSequence) list.get(i);
                eaf.a().getClass();
                a33 a33 = ((ltb) ((sjd) eaf.b()).u()).a;
                a32 a32 = (a32) obj;
                if (a32 != null) {
                    long j2 = a32.b.a().a;
                    if (charSequence.equals(frgDlgDisableNotifs.S1(qad.f6))) {
                        j2 = -1;
                    } else {
                        if (charSequence.equals(frgDlgDisableNotifs.S1(qad.W5))) {
                            m = a33.m();
                            j = 3600000;
                        } else if (charSequence.equals(frgDlgDisableNotifs.S1(qad.X5))) {
                            m = a33.m();
                            j = 14400000;
                        } else if (charSequence.equals(frgDlgDisableNotifs.S1(qad.V5))) {
                            m = a33.m();
                            j = 86400000;
                        }
                        j2 = m + j;
                    }
                    gh6 gh6 = (gh6) frgDlgDisableNotifs.b3();
                    if (gh6 != null) {
                        frgDlgDisableNotifs.Q1().f0("ru.ok.messages.views.dialogs.FrgDlgDisableNotifs", new Bundle());
                        gh6.O(a32.a, j2);
                        return;
                    }
                    return;
                }
                return;
            default:
                InvitePhonebookContactDialog invitePhonebookContactDialog = (InvitePhonebookContactDialog) frgDlgBase;
                a aVar = invitePhonebookContactDialog.G0;
                if ((aVar != null ? (FrgPhoneProfile) aVar : null) != null) {
                    String str = (String) list.get(i);
                    if (i < ((qdb) obj).e.size()) {
                        a aVar2 = invitePhonebookContactDialog.G0;
                        FrgPhoneProfile frgPhoneProfile = aVar2 != null ? (FrgPhoneProfile) aVar2 : null;
                        Context O1 = frgPhoneProfile.O1();
                        cud cud = ym.v.c().b;
                        String string = cud.g.getString("invite-short", (String) null);
                        if (string == null) {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            string = String.format(O1.getString(jad.r), Arrays.copyOf(new Object[]{cud.p()}, 1));
                        }
                        gsg.C(frgPhoneProfile, str, string);
                        return;
                    }
                    a aVar3 = invitePhonebookContactDialog.G0;
                    FrgPhoneProfile frgPhoneProfile2 = aVar3 != null ? (FrgPhoneProfile) aVar3 : null;
                    Context O12 = frgPhoneProfile2.O1();
                    String string2 = ym.v.c().b.g.getString("invite-header", (String) null);
                    if (string2 == null) {
                        string2 = O12.getString(jad.s);
                    }
                    String str2 = string2.toString();
                    Context O13 = frgPhoneProfile2.O1();
                    cud cud2 = ym.v.c().b;
                    String string3 = cud2.g.getString("invite-long", (String) null);
                    if (string3 == null) {
                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                        string3 = String.format(O13.getString(jad.F), Arrays.copyOf(new Object[]{cud2.p()}, 1));
                    }
                    gsg.D(frgPhoneProfile2, str, str2, string3);
                    return;
                }
                return;
        }
    }
}
