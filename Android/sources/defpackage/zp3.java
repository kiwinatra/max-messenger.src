package defpackage;

import android.util.AttributeSet;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.contactlist.ContactListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: zp3  reason: default package */
public final /* synthetic */ class zp3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactListWidget b;

    public /* synthetic */ zp3(ContactListWidget contactListWidget, int i) {
        this.a = i;
        this.b = contactListWidget;
    }

    public final Object invoke() {
        b3b b3b = null;
        ContactListWidget contactListWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ContactListWidget.N0;
                contactListWidget.getClass();
                KProperty[] kPropertyArr2 = ContactListWidget.N0;
                KProperty kProperty = kPropertyArr2[7];
                is isVar = contactListWidget.K0;
                if (((Boolean) isVar.a(contactListWidget)).booleanValue()) {
                    ((EndlessRecyclerView2) contactListWidget.y0.getValue(contactListWidget, kPropertyArr2[2])).z0(0);
                    KProperty kProperty2 = kPropertyArr2[7];
                    isVar.b(contactListWidget, Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 1:
                KProperty[] kPropertyArr3 = ContactListWidget.N0;
                return Boolean.valueOf(((po3) contactListWidget.f0().v0.a.getValue()).b());
            case 2:
                KProperty[] kPropertyArr4 = ContactListWidget.N0;
                return contactListWidget.getRouter();
            case 3:
                KProperty[] kPropertyArr5 = ContactListWidget.N0;
                h3b d = o54.d(contactListWidget.getContext(), (AttributeSet) null);
                d.setId(rra.t);
                int ordinal = contactListWidget.f0().b.ordinal();
                if (ordinal == 0) {
                    d.setForm(z2b.a);
                    d.setTitle(elc.contact_list_call_contact_title);
                } else if (ordinal == 1) {
                    d.setForm(z2b.b);
                    d.setTitle(qad.P1);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                if (fq3.$EnumSwitchMapping$0[contactListWidget.f0().b.ordinal()] == 1) {
                    d.setLeftActions(new p2b(new bq3(contactListWidget, 1)));
                }
                c3b c3b = new c3b(new ch2(5, contactListWidget));
                int ordinal2 = contactListWidget.f0().b.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        b3b = new b3b(cad.P0, 0, new bq3(contactListWidget, 0), 14);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                d.setRightActions(new u2b(c3b, b3b));
                pza searchView = d.getSearchView();
                if (searchView != null) {
                    searchView.setSearchHint(q8.p(sra.j, d.getContext()));
                    if (contactListWidget.g0()) {
                        searchView.setExpandWithAnimation(false);
                        searchView.d();
                        searchView.setExpandWithAnimation(true);
                        searchView.setSearchText(contactListWidget.d0());
                    }
                }
                return d;
            case 4:
                KProperty[] kPropertyArr6 = ContactListWidget.N0;
                return new iq3(contactListWidget);
            case 5:
                KProperty[] kPropertyArr7 = ContactListWidget.N0;
                return new e0b((Widget) contactListWidget);
            case 6:
                KProperty[] kPropertyArr8 = ContactListWidget.N0;
                return new lf1(LazyKt.lazy(new zp3(contactListWidget, 2)), new eng(contactListWidget, 0));
            default:
                KProperty[] kPropertyArr9 = ContactListWidget.N0;
                eq3 eq3 = contactListWidget.f0().b;
                eq3.getClass();
                if (eq3 == eq3.a) {
                    return jgd.CALL_NEW_CALL;
                }
                return null;
        }
    }
}
