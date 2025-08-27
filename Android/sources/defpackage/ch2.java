package defpackage;

import android.view.MenuItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.reflect.KProperty;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.contactlist.ContactListWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ch2  reason: default package */
public final class ch2 implements u65, j1e, ro3, gce, ya3, mza, zi6, pi8, gf8, hmf {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ch2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void f() {
    }

    public boolean B() {
        switch (this.a) {
            case 0:
                return false;
            default:
                KProperty[] kPropertyArr = MessagesListWidget.R0;
                return ((wj9) ((MessagesListWidget) this.b).k0().l1.getValue()).c;
        }
    }

    public void C(CharSequence charSequence) {
        KProperty[] kPropertyArr = ContactListWidget.N0;
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        contactListWidget.getClass();
        KProperty[] kPropertyArr2 = ContactListWidget.N0;
        KProperty kProperty = kPropertyArr2[7];
        contactListWidget.K0.b(contactListWidget, Boolean.TRUE);
        KProperty kProperty2 = kPropertyArr2[5];
        contactListWidget.I0.b(contactListWidget, charSequence);
        if (contactListWidget.g0()) {
            yp3 f0 = contactListWidget.f0();
            String obj = charSequence != null ? charSequence.toString() : null;
            if (obj == null) {
                obj = "";
            }
            ((tz9) f0.w0.g.getValue()).setValue(obj);
        }
    }

    public void E0() {
        switch (this.a) {
            case 0:
                return;
            default:
                KProperty[] kPropertyArr = MessagesListWidget.R0;
                ((gx) ((MessagesListWidget) this.b).k0().o).y();
                return;
        }
    }

    public boolean E1() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                return ((jg2) ((gh2) obj).M0.getValue()).c;
            default:
                KProperty[] kPropertyArr = MessagesListWidget.R0;
                return ((wj9) ((MessagesListWidget) obj).k0().l1.getValue()).b;
        }
    }

    public void L() {
        ((iq3) ((ContactListWidget) this.b).v0.getValue()).f(false);
    }

    public void N(long j, boolean z) {
        Object obj = this.b;
        switch (this.a) {
            case 1:
                KProperty[] kPropertyArr = ChatNotificationsSettingsScreen.w;
                ((jl2) ((ChatNotificationsSettingsScreen) obj).b.getValue()).l(j);
                return;
            case 6:
                KProperty[] kPropertyArr2 = DialogNotificationsSettingsScreen.w;
                ((fo4) ((DialogNotificationsSettingsScreen) obj).b.getValue()).k(j);
                return;
            case 18:
                KProperty[] kPropertyArr3 = MessagesSettingsScreen.w;
                gp9 gp9 = (gp9) ((MessagesSettingsScreen) obj).c.getValue();
                if (j == LongCompanionObject.MAX_VALUE) {
                    ((hq) gp9.b).i("app.messages.send.by.enter", z);
                    return;
                } else {
                    gp9.getClass();
                    return;
                }
            case 20:
                KProperty[] kPropertyArr4 = NotificationsSettingsScreen.Y;
                ((NotificationsSettingsScreen) obj).c0().l(j);
                return;
            default:
                KProperty[] kPropertyArr5 = OtherNotificationsSettingsScreen.w;
                ((s5b) ((OtherNotificationsSettingsScreen) obj).b.getValue()).k(j);
                return;
        }
    }

    public void a(Object obj) {
        switch (this.a) {
            case 3:
                ((ya3) this.b).b();
                return;
            default:
                ((pi8) ((oh8) this.b).b).a(obj);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [i20, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v22, types: [fc4, java.lang.Object] */
    public Object apply(Object obj) {
        i20 i20;
        switch (this.a) {
            case 7:
                iu4 iu4 = (iu4) obj;
                au4 au4 = (au4) this.b;
                st4 st4 = au4.a;
                tt4 tt4 = new tt4(st4.a, st4.b);
                p4g p4g = au4.e;
                if (p4g == null) {
                    i20 = null;
                } else {
                    ? obj2 = new Object();
                    obj2.c = p4g.c;
                    obj2.b = p4g.b;
                    obj2.a = p4g.a;
                    obj2.d = p4g.d;
                    i20 = obj2;
                }
                cu4 cu4 = new cu4(tt4, au4.b, au4.c, au4.d, i20);
                iu4.getClass();
                return new qa3(2, new ni(8, iu4, cu4));
            case 8:
                iu4 iu42 = (iu4) obj;
                st4 st42 = (st4) this.b;
                long j = st42.a;
                iu42.getClass();
                return new qa3(2, new gu4(iu42, j, st42.b));
            case 9:
                gfa gfa = (gfa) obj;
                gfa.getClass();
                return new qa3(2, new ni(18, gfa, (mj5) this.b));
            case 10:
                Object[] objArr = (Object[]) obj;
                if (objArr.length == 2) {
                    return ((sm0) this.b).apply(objArr[0], objArr[1]);
                }
                throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
            case 11:
                Object[] objArr2 = (Object[]) obj;
                if (objArr2.length == 3) {
                    return ((aj6) this.b).apply(objArr2[0], objArr2[1], objArr2[2]);
                }
                throw new IllegalArgumentException("Array of size 3 expected but got " + objArr2.length);
            case 12:
                return ((Class) this.b).cast(obj);
            case 13:
                List list = (List) obj;
                Collections.sort(list, (Comparator) this.b);
                return list;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                boe boe = (boe) obj;
                String str = boe.y;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                if (str.length() == 0) {
                    str = boe.o;
                }
                String a2 = boe.a();
                if (str != null) {
                    str2 = str;
                }
                ? obj3 = new Object();
                obj3.d = a2;
                obj3.e = str2;
                String str3 = ((tq7) this.b).b;
                int i = 1;
                obj3.b = str3 != null && Intrinsics.areEqual((Object) str3, (Object) boe.a());
                obj3.f = boe.v0;
                obj3.c = false;
                if (!boe.w0) {
                    i = boe.x0 != null ? 2 : cvg.A(boe.w) ^ true ? 0 : -1;
                }
                obj3.a = i;
                return new qq7(obj3);
            case 19:
                return new mka(2, new z52(8, (lfa) obj, (uea) this.b));
            case 22:
                List<ouc> list2 = (List) obj;
                ArrayList arrayList = new ArrayList();
                for (ouc ouc : list2) {
                    Long l = null;
                    vpe vpe = ouc instanceof vpe ? (vpe) ouc : null;
                    if (vpe != null) {
                        l = Long.valueOf(vpe.c);
                    }
                    if (l != null) {
                        arrayList.add(l);
                    }
                }
                if (arrayList.isEmpty()) {
                    return ua3.a;
                }
                gvc gvc = (gvc) this.b;
                return new na3(0, gvc.b().c(list2), new qa3(1, new dvc(gvc, arrayList, 1)));
            case 23:
                Object apply = ((zi6) ((hb3) this.b).c).apply(new Object[]{obj});
                Objects.requireNonNull(apply, "The zipper returned a null value");
                return apply;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return gy8.m((gy8) this.b, (jj2) obj, "@");
            case 26:
                Boolean bool = (Boolean) obj;
                return ((ipg) this.b).h();
            case 27:
                ((Number) obj).longValue();
                j09 j09 = (j09) this.b;
                j09.getClass();
                return new mka(1, new nqd(7, j09)).n(qe.a());
            default:
                return ((o9g) this.b).d((nne) obj);
        }
    }

    public void b() {
        switch (this.a) {
            case 4:
                iqg iqg = (iqg) this.b;
                ((kc3) iqg.c).dispose();
                ((ya3) iqg.o).b();
                return;
            default:
                ((pi8) ((oh8) this.b).b).b();
                return;
        }
    }

    public void c(mq4 mq4) {
        switch (this.a) {
            case 3:
                ((ya3) this.b).c(mq4);
                return;
            case 4:
                ((kc3) ((iqg) this.b).c).a(mq4);
                return;
            default:
                qq4.e((oh8) this.b, mq4);
                return;
        }
    }

    public void d() {
        KProperty[] kPropertyArr = ContactListWidget.N0;
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        contactListWidget.getClass();
        KProperty kProperty = ContactListWidget.N0[6];
        Boolean bool = Boolean.TRUE;
        contactListWidget.J0.b(contactListWidget, bool);
        xme xme = ((wh0) contactListWidget.w0.getValue()).w;
        xme.getClass();
        xme.m((Object) null, bool);
        z5a.g((z5a) contactListWidget.b.getValue(), jgd.CONTACTS_SEARCH);
    }

    public void e(long j) {
        Object obj = this.b;
        switch (this.a) {
            case 1:
                KProperty[] kPropertyArr = ChatNotificationsSettingsScreen.w;
                ((jl2) ((ChatNotificationsSettingsScreen) obj).b.getValue()).l(j);
                return;
            case 6:
                KProperty[] kPropertyArr2 = DialogNotificationsSettingsScreen.w;
                ((fo4) ((DialogNotificationsSettingsScreen) obj).b.getValue()).k(j);
                return;
            case 18:
                KProperty[] kPropertyArr3 = MessagesSettingsScreen.w;
                gp9 gp9 = (gp9) ((MessagesSettingsScreen) obj).c.getValue();
                if (j == LongCompanionObject.MAX_VALUE) {
                    hq hqVar = (hq) gp9.b;
                    hqVar.i("app.messages.send.by.enter", !hqVar.g.getBoolean("app.messages.send.by.enter", false));
                    gp9.j();
                    return;
                }
                gp9.getClass();
                if (j == 9223372036854775806L) {
                    ep9.b.getClass();
                    xag.h(gp9.v, new pa4(":stickers/settings"));
                    return;
                }
                return;
            case 20:
                KProperty[] kPropertyArr4 = NotificationsSettingsScreen.Y;
                ((NotificationsSettingsScreen) obj).c0().l(j);
                return;
            default:
                KProperty[] kPropertyArr5 = OtherNotificationsSettingsScreen.w;
                ((s5b) ((OtherNotificationsSettingsScreen) obj).b.getValue()).k(j);
                return;
        }
    }

    public void l() {
        KProperty[] kPropertyArr = ContactListWidget.N0;
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        eq3 eq3 = contactListWidget.f0().b;
        eq3.getClass();
        ((iq3) contactListWidget.v0.getValue()).f(eq3 == eq3.a);
    }

    public void n() {
        KProperty[] kPropertyArr = ContactListWidget.N0;
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        contactListWidget.getClass();
        KProperty[] kPropertyArr2 = ContactListWidget.N0;
        KProperty kProperty = kPropertyArr2[6];
        Boolean bool = Boolean.FALSE;
        contactListWidget.J0.b(contactListWidget, bool);
        xme xme = ((wh0) contactListWidget.w0.getValue()).w;
        xme.getClass();
        xme.m((Object) null, bool);
        KProperty kProperty2 = kPropertyArr2[5];
        contactListWidget.I0.b(contactListWidget, (Object) null);
        contactListWidget.f0().w0.b();
        z5a.g((z5a) contactListWidget.b.getValue(), jgd.CONTACTS_TAB);
    }

    public void onError(Throwable th) {
        switch (this.a) {
            case 3:
                ((ya3) this.b).onError(th);
                return;
            case 4:
                iqg iqg = (iqg) this.b;
                ((kc3) iqg.c).dispose();
                ((ya3) iqg.o).onError(th);
                return;
            default:
                ((pi8) ((oh8) this.b).b).onError(th);
                return;
        }
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        return ((jmf) this.b).x.onMenuItemSelected(0, menuItem);
    }

    public void t0(long j) {
        ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) this.b;
        kr7.z(chatsListSearchScreen);
        KProperty[] kPropertyArr = ChatsListSearchScreen.F0;
        chatsListSearchScreen.d0().m(j);
    }

    public void u1() {
        gh2 gh2;
        se2 r;
        switch (this.a) {
            case 0:
                if ((!((jg2) ((gh2) this.b).M0.getValue()).a.isEmpty()) && (r = gh2.r()) != null && r.z.b <= 0) {
                    a32 o = (gh2 = (gh2) this.b).o();
                    a89 a89 = o != null ? o.c : null;
                    Long valueOf = a89 != null ? Long.valueOf(a89.h()) : null;
                    if (valueOf != null) {
                        long longValue = valueOf.longValue();
                        z68.c(r.a, "loadPrev: time = %d, loadPrevOperation = %s", Long.valueOf(longValue), r.z);
                        synchronized (r.z) {
                            try {
                                synchronized (r.z) {
                                }
                                if (r.z.b == longValue) {
                                    z68.n(r.a, (IOException) null, "loadPrev: duplicate invocation", Arrays.copyOf(new Object[0], 0));
                                    return;
                                }
                                r.X.a();
                                r.z.a();
                                r.y.a();
                                r.z.b = longValue;
                                dv dvVar = r.z;
                                na3 na3 = new na3(1, new qa3(0, new bv(new yu(r, longValue, 0))).l(r.c).i(r.o), new zu(r, 0));
                                ao1 ao1 = new ao1(0, new zu(r, 1), new av(r, 0));
                                na3.j(ao1);
                                dvVar.o = ao1;
                                return;
                            } catch (Throwable th) {
                                while (true) {
                                    throw th;
                                    break;
                                }
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                KProperty[] kPropertyArr = MessagesListWidget.R0;
                ((gx) ((MessagesListWidget) this.b).k0().o).w();
                return;
        }
    }

    public void x(int i, int i2, String str) {
        KProperty[] kPropertyArr = MessageWriteWidget.C0;
        kf8 kf8 = (kf8) ((MessageWriteWidget) this.b).c.getValue();
        kf8.getClass();
        xag.h(kf8.c, new ta(i, i2, str));
    }
}
