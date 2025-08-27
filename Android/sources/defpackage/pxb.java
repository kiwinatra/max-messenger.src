package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import ru.ok.messages.contacts.picker.ActAdminPicker;

/* renamed from: pxb  reason: default package */
public final /* synthetic */ class pxb implements r8 {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ pxb(Bundle bundle, ArrayList arrayList) {
        this.a = bundle;
        this.b = arrayList;
    }

    public final void a(e9d e9d) {
        Activity d = e9d.d();
        d.startActivityForResult(ActAdminPicker.T(o54.L("id", this.a), this.b, ng6.b, d, true), 1);
    }
}
