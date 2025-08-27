package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.members.list.MembersListWidget;

/* renamed from: s49  reason: default package */
public final /* synthetic */ class s49 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MembersListWidget b;

    public /* synthetic */ s49(MembersListWidget membersListWidget, int i) {
        this.a = i;
        this.b = membersListWidget;
    }

    public final Object invoke() {
        MembersListWidget membersListWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = MembersListWidget.B0;
                return ev0.i(membersListWidget.d0().getContext());
            case 1:
                long j = membersListWidget.b;
                Function0 function0 = membersListWidget.e0().o;
                return new r49(j, membersListWidget.c, LazyKt.lazy(new s49(membersListWidget, 2)), membersListWidget.o, new s49(membersListWidget, 3), function0);
            case 2:
                KProperty[] kPropertyArr2 = MembersListWidget.B0;
                a49 a49 = a49.a;
                Lazy h = a49.getAccessor().h(gaf.class);
                Lazy h2 = a49.getAccessor().h(eu3.class);
                Lazy h3 = a49.getAccessor().h(qx2.class);
                Lazy h4 = a49.getAccessor().h(lr6.class);
                Lazy h5 = a49.getAccessor().h(tld.class);
                Lazy h6 = a49.getAccessor().h(x23.class);
                Lazy h7 = a49.getAccessor().h(is9.class);
                long j2 = membersListWidget.b;
                a32 a32 = (a32) ((my2) ((qx2) h3.getValue())).o(j2).a.getValue();
                if (a32 == null) {
                    z68.f(b59.class.getName(), wj6.j(j2, "We're trying to create members loader for chat(#", ") without the chat in cache"), (Throwable) null);
                    return new y49();
                }
                int c = a32.b.c();
                ij2 ij2 = membersListWidget.c;
                if (c > 99 || a32.K()) {
                    return new bn0(j2, ij2, (gaf) h.getValue(), h3, h2, h4, h7);
                }
                return new kee(j2, ij2, (x23) h6.getValue(), h3, h2, h5, (gaf) h.getValue(), h7);
            default:
                KProperty[] kPropertyArr3 = MembersListWidget.B0;
                return membersListWidget.e0().c;
        }
    }
}
