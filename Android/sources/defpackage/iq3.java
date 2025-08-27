package defpackage;

import kotlin.reflect.KProperty;
import one.me.contactlist.ContactListWidget;

/* renamed from: iq3  reason: default package */
public final class iq3 extends xla {
    public final /* synthetic */ ContactListWidget d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iq3(ContactListWidget contactListWidget) {
        super(false);
        this.d = contactListWidget;
    }

    public final void b() {
        KProperty[] kPropertyArr = ContactListWidget.N0;
        pza searchView = this.d.e0().getSearchView();
        if (searchView != null) {
            searchView.b();
        }
    }
}
