package defpackage;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.List;
import ru.ok.messages.settings.FrgPrivacySettings;
import ru.ok.messages.views.dialogs.FrgDlgListOptionPicker;

/* renamed from: lh6  reason: default package */
public final /* synthetic */ class lh6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ FrgDlgListOptionPicker a;
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;

    public /* synthetic */ lh6(FrgDlgListOptionPicker frgDlgListOptionPicker, int i, ArrayList arrayList) {
        this.a = frgDlgListOptionPicker;
        this.b = i;
        this.c = arrayList;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [l0g, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [l0g, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v4, types: [l0g, java.lang.Object] */
    public final void onClick(DialogInterface dialogInterface, int i) {
        FrgPrivacySettings frgPrivacySettings = (FrgPrivacySettings) this.a.b3();
        if (frgPrivacySettings != null) {
            String valueOf = String.valueOf(this.c.get(i));
            int i2 = this.b;
            hq hqVar = frgPrivacySettings.I1;
            switch (i2) {
                case 103:
                    int m3 = frgPrivacySettings.m3(valueOf);
                    hqVar.l("app.privacy.incoming.call", wzf.f(m3));
                    rl d = frgPrivacySettings.q1.d();
                    ? obj = new Object();
                    obj.p = m3;
                    d.a(new n0g(obj));
                    break;
                case 104:
                    int m32 = frgPrivacySettings.m3(valueOf);
                    hqVar.l("app.privacy.chats.invite", wzf.f(m32));
                    rl d2 = frgPrivacySettings.q1.d();
                    ? obj2 = new Object();
                    obj2.o = m32;
                    d2.a(new n0g(obj2));
                    break;
                case 105:
                    boolean c2 = tr1.c(2, frgPrivacySettings.m3(valueOf));
                    hqVar.i("app.privacy.online.show", !c2);
                    rl d3 = frgPrivacySettings.q1.d();
                    ? obj3 = new Object();
                    obj3.h = Boolean.valueOf(c2);
                    d3.a(new n0g(obj3));
                    break;
            }
            frgPrivacySettings.k3();
        }
    }
}
