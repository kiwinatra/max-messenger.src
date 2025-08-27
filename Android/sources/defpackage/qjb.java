package defpackage;

import java.util.Set;
import kotlin.jvm.functions.Function1;
import one.me.chats.picker.contacts.PickerContactsListWidget;

/* renamed from: qjb  reason: default package */
public final /* synthetic */ class qjb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerContactsListWidget b;

    public /* synthetic */ qjb(PickerContactsListWidget pickerContactsListWidget, int i) {
        this.a = i;
        this.b = pickerContactsListWidget;
    }

    public final Object invoke(Object obj) {
        hhb hhb;
        int i = this.a;
        int intValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                PickerContactsListWidget pickerContactsListWidget = this.b;
                int j = pickerContactsListWidget.y.j();
                fhb fhb = pickerContactsListWidget.w;
                int j2 = fhb.j() + j;
                CharSequence charSequence = (CharSequence) pickerContactsListWidget.d0().X.a.getValue();
                if (!(!(charSequence == null || charSequence.length() == 0)) && intValue >= j && intValue < j2 && (hhb = (hhb) fhb.I(intValue - j)) != null) {
                    return hhb.c;
                }
                return null;
            case 1:
                PickerContactsListWidget pickerContactsListWidget2 = this.b;
                int j3 = pickerContactsListWidget2.y.j();
                int j4 = pickerContactsListWidget2.w.j() + j3;
                CharSequence charSequence2 = (CharSequence) pickerContactsListWidget2.d0().X.a.getValue();
                boolean z = false;
                if ((!(charSequence2 == null || charSequence2.length() == 0)) || (intValue >= j3 && intValue < j4)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                PickerContactsListWidget pickerContactsListWidget3 = this.b;
                int j5 = pickerContactsListWidget3.y.j();
                fhb fhb2 = pickerContactsListWidget3.w;
                int j6 = fhb2.j() + j5;
                CharSequence charSequence3 = (CharSequence) pickerContactsListWidget3.d0().X.a.getValue();
                boolean z2 = false;
                hhb hhb2 = (charSequence3 == null || charSequence3.length() == 0) ^ true ? (hhb) pickerContactsListWidget3.x.I(intValue) : (intValue >= j5 && intValue < j6) ? (hhb) fhb2.I(intValue - j5) : null;
                if (hhb2 != null) {
                    z2 = ((Set) pickerContactsListWidget3.d0().x.a.getValue()).contains(Long.valueOf(hhb2.a));
                }
                return Boolean.valueOf(z2);
        }
    }
}
