package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.contactlist.ContactListWidget;

/* renamed from: bq3  reason: default package */
public final /* synthetic */ class bq3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactListWidget b;

    public /* synthetic */ bq3(ContactListWidget contactListWidget, int i) {
        this.a = i;
        this.b = contactListWidget;
    }

    public final Object invoke(Object obj) {
        ContactListWidget contactListWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ContactListWidget.N0;
                m58.b(ix3.a).o((View) obj).h(contactListWidget.A0).d().build().o(contactListWidget);
                return Unit.INSTANCE;
            case 1:
                View view = (View) obj;
                KProperty[] kPropertyArr2 = ContactListWidget.N0;
                contactListWidget.getRouter().B(contactListWidget);
                return Unit.INSTANCE;
            default:
                int intValue = ((Integer) obj).intValue();
                int j = contactListWidget.z.j();
                t56 t56 = contactListWidget.v;
                int j2 = t56.j() + j;
                t56 t562 = contactListWidget.x;
                int j3 = t562.j() + j2;
                int j4 = contactListWidget.y.j();
                CharSequence d0 = contactListWidget.d0();
                if ((!(d0 == null || d0.length() == 0)) || intValue < j || intValue < j4) {
                    return null;
                }
                if (intValue < j2) {
                    return ((zo3) ((lz7) t56.E(intValue - j))).b;
                }
                if (intValue < j3) {
                    return ((zo3) ((lz7) t562.E(intValue - j2))).b;
                }
                return null;
        }
    }
}
