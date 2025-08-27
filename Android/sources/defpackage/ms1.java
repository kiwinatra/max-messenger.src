package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;
import one.me.chats.list.ChatsListWidget;
import one.me.contactlist.ContactListWidget;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.profile.screens.members.ChatAdminsScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import org.apache.http.util.LangUtils;
import ru.ok.messages.constructor.ConstructorsListView;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.messages.panels.widgets.ChatTopPanelViewImpl;
import ru.ok.messages.messages.widgets.ChatPickerWithDescriptionView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ms1  reason: default package */
public final /* synthetic */ class ms1 implements eo1, ia7, jy7, f0b, qk3, u2f, knd, d66, fc3, hd6, zj3, uo3, zi6, ice {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ms1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a(View view, String str) {
        int i = ChangeDisabledDialog.w0;
        ChangeDisabledDialog changeDisabledDialog = (ChangeDisabledDialog) this.b;
        ev0.z(changeDisabledDialog, str, new r6(7, changeDisabledDialog));
    }

    public void accept(Object obj) {
        om3 om3;
        pm3 pm3 = null;
        int i = 0;
        Object obj2 = this.b;
        switch (this.a) {
            case 7:
                w62 w62 = (w62) obj;
                k72 k72 = (k72) obj2;
                w62.c = k72;
                if (k72 == k72.o || k72 == k72.b) {
                    w62.x = 0;
                    return;
                }
                return;
            case 8:
                w62 w622 = (w62) obj;
                sk3[] sk3Arr = (sk3[]) obj2;
                int length = sk3Arr.length;
                while (i < length) {
                    sk3 sk3 = sk3Arr[i];
                    if (sk3 != null) {
                        sk3.accept(w622);
                    }
                    i++;
                }
                return;
            case 10:
                w62 w623 = (w62) obj;
                w623.p = qe8.i((rp2) obj2, w623.c());
                return;
            case 11:
                a89 a89 = (a89) obj;
                ye2 ye2 = (ye2) obj2;
                ye2.getClass();
                z68.c("ye2", "onMessageUpdated: messageId = " + a89.a.b, new Object[0]);
                while (true) {
                    ArrayList arrayList = ye2.d;
                    if (i >= arrayList.size()) {
                        return;
                    }
                    if (((a89) arrayList.get(i)).a.b == a89.a.b) {
                        arrayList.set(i, a89);
                        for (xe2 xe2 : ye2.o) {
                            if (xe2 != null) {
                                ((ActAttachesView) xe2).a0(a89);
                            }
                        }
                        return;
                    }
                    i++;
                }
            case 13:
                List list = (List) obj;
                qj2 qj2 = (qj2) obj2;
                oj2 oj2 = qj2.e;
                if (oj2 != null) {
                    oj2.s();
                } else {
                    qj2.g = true;
                }
                qj2.h = true;
                return;
            case 16:
                Integer num = (Integer) obj;
                int i2 = ChatPickerWithDescriptionView.o;
                ChatPickerWithDescriptionView chatPickerWithDescriptionView = (ChatPickerWithDescriptionView) obj2;
                Context context = chatPickerWithDescriptionView.getContext();
                Context context2 = chatPickerWithDescriptionView.getContext();
                int i3 = pad.i;
                int intValue = num.intValue();
                String[] strArr = ghf.c;
                hi7.b0(0, context, String.format(context2.getResources().getQuantityString(i3, intValue), new Object[]{num}));
                return;
            case LangUtils.HASH_SEED /*17*/:
                a32 a32 = (a32) obj;
                fr2 fr2 = (fr2) obj2;
                xag.g(fr2, ((osa) ((gaf) fr2.x.getValue())).b(), (f14) null, new er2(fr2, a32, (Continuation) null), 2);
                xag.h(fr2.z0, new lq2(a32.a));
                ((sv0) fr2.Y.getValue()).c(new sx6(12));
                qc7 qc7 = (qc7) fr2.X.getValue();
                if (qc7 != null) {
                    qc7.f(SetsKt.setOf(new pc7(nc7.CREATE_2_GROUP_CHATS, 1)), jgd.CHAT);
                    return;
                }
                return;
            case 18:
                ((ChatTopPanelViewImpl) obj2).setTranslationY(((Float) obj).floatValue());
                return;
            case 23:
                nm3 nm3 = (nm3) obj;
                int i4 = o54.l;
                xdb xdb = (xdb) obj2;
                String str = "";
                if (!cvg.A(xdb.X)) {
                    nm3.d = xdb.X;
                } else {
                    nm3.d = str;
                }
                List list2 = nm3.f;
                Iterator it = list2.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    om3 = om3.b;
                    if (hasNext) {
                        pm3 pm32 = (pm3) it.next();
                        if (pm32.c == om3) {
                            pm3 = pm32;
                        }
                    }
                }
                if (pm3 != null) {
                    list2.remove(pm3);
                }
                String str2 = xdb.y;
                if (!cvg.A(str2)) {
                    String str3 = xdb.z;
                    if (str3 != null) {
                        str = str3;
                    }
                    list2.add(new pm3(str2, om3, str));
                }
                nm3.f = list2;
                return;
            default:
                ((nm3) obj).i = (sm3) obj2;
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [tq3, java.lang.Object] */
    public Object apply(Object obj) {
        sq3 sq3 = (sq3) obj;
        ap0 ap0 = new ap0(3);
        qq3 qq3 = (qq3) this.b;
        ap0.b = qq3.a;
        ap0.c = qq3.b;
        ? obj2 = new Object();
        obj2.a = ap0;
        s58 s58 = qq3.c;
        obj2.b = s58.a;
        obj2.c = s58.b;
        obj2.d = s58.c;
        obj2.e = s58.o;
        obj2.f = s58.v;
        obj2.g = s58.w;
        obj2.h = qq3.d;
        sq3.getClass();
        return new qa3(2, new ni(6, sq3, obj2));
    }

    public void b(String str, Bundle bundle) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m23constructorimpl((xg3) bundle.getParcelable("ConfirmationDestructiveDialogResult:key"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m29isFailureimpl(obj)) {
            obj = null;
        }
        xg3 xg3 = (xg3) obj;
        if (xg3 != null) {
            boolean z = xg3 instanceof ug3;
            tg3 tg3 = (tg3) this.b;
            if (z) {
                ug3 ug3 = (ug3) xg3;
                tg3.h();
            } else if (xg3 instanceof vg3) {
                vg3 vg3 = (vg3) xg3;
                tg3.j();
            } else if (xg3 instanceof wg3) {
                wg3 wg3 = (wg3) xg3;
                tg3.getClass();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public boolean c(int i) {
        CharSequence d0;
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        int j = contactListWidget.X.j();
        t56 t56 = contactListWidget.x;
        if (!(i == j - t56.j() && ((d0 = contactListWidget.d0()) == null || d0.length() == 0))) {
            return i == contactListWidget.X.j() - (t56.j() + contactListWidget.v.j());
        }
    }

    public void d(ck3 ck3) {
        zj3 zj3 = ((ConstructorsListView) this.b).x;
        if (zj3 != null) {
            zj3.d(ck3);
        }
    }

    public void e(y56 y56) {
        KProperty[] kPropertyArr = ChatsListWidget.I0;
        tw2 f0 = ((ChatsListWidget) this.b).f0();
        f0.getClass();
        String name = tw2.class.getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.v;
            a67.d(w78, name, "onFolderWidgetClicked " + y56, (Throwable) null);
        }
        x56 x56 = y56.w;
        if (x56 instanceof w56) {
            String str = ((w56) x56).a;
            by7 by7 = (by7) f0.A0.getValue();
            by7.getClass();
            bs0.K(bs0.F(new ps5(by7.e(Uri.parse(str)), new sv2(f0, (Continuation) null), 5), ((osa) f0.w).b()), f0.a);
        } else if (x56 instanceof v56) {
            s85 s85 = f0.K0;
            ox2 ox2 = ox2.b;
            v56 v56 = (v56) x56;
            long j = v56.a;
            String str2 = v56.b;
            ox2.getClass();
            StringBuilder sb = new StringBuilder(":webapp:root?bot_id=");
            sb.append(j);
            sb.append("&entry_point=folder");
            nfd nfd = kfg.c;
            if (!(str2 == null || str2.length() == 0)) {
                sb.append("&start_param=");
                sb.append(str2);
            }
            a81.r(sb.toString(), s85);
        } else if (x56 != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public Object g(soc soc) {
        return this.b;
    }

    public Object get() {
        ((Runnable) this.b).run();
        return null;
    }

    public void h(pbe pbe) {
        pbe.a(Collator.getInstance(((ltb) ((jtb) this.b)).a.u()));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.camera.core.ImageCaptureException, java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r1v2, types: [androidx.camera.core.ImageCaptureException, java.lang.Exception] */
    public void i(ja7 ja7) {
        pk4 pk4 = (pk4) this.b;
        pk4.getClass();
        try {
            ha7 e = ja7.e();
            if (e != null) {
                pk4.A(e);
                return;
            }
            qvb qvb = (qvb) pk4.a;
            if (qvb != null) {
                pk4.E(new qc0(qvb.a, new Exception("Failed to acquire latest image", (Throwable) null)));
            }
        } catch (IllegalStateException e2) {
            qvb qvb2 = (qvb) pk4.a;
            if (qvb2 != null) {
                pk4.E(new qc0(qvb2.a, new Exception("Failed to acquire latest image", e2)));
            }
        }
    }

    public jnd j(int i) {
        ChatNotificationsSettingsScreen chatNotificationsSettingsScreen = (ChatNotificationsSettingsScreen) this.b;
        i1e i1e = (i1e) ((lz7) chatNotificationsSettingsScreen.c.E(i));
        if (i1e.s() == 0) {
            return jnd.o;
        }
        k1e k1e = chatNotificationsSettingsScreen.c;
        if (i == k1e.j() - 1) {
            return jnd.c;
        }
        return i1e.s() != ((i1e) ((lz7) k1e.E(i + -1))).s() ? jnd.a : i1e.s() != ((i1e) ((lz7) k1e.E(i + 1))).s() ? jnd.c : jnd.b;
    }

    public void l(g0b g0b) {
        y39 y39 = y39.a;
        Object obj = this.b;
        switch (this.a) {
            case 6:
                KProperty[] kPropertyArr = ChatAdminsScreen.Z;
                ChatAdminsScreen chatAdminsScreen = (ChatAdminsScreen) obj;
                if (g0b == g0b.v) {
                    xag.h(chatAdminsScreen.e0().w, y39);
                    q32 c0 = chatAdminsScreen.c0();
                    ArrayList arrayList = c0.Y;
                    int size = arrayList.size();
                    arrayList.clear();
                    xag.h(c0.Z, new w3c(new kgf(lxa.o2, ArraysKt.toList((T[]) new Object[]{Integer.valueOf(size)}))));
                    return;
                }
                chatAdminsScreen.c0().k();
                return;
            case 12:
                KProperty[] kPropertyArr2 = ChatMembersCompactWidget.x;
                ChatMembersCompactWidget chatMembersCompactWidget = (ChatMembersCompactWidget) obj;
                if (g0b == g0b.v) {
                    xag.h(chatMembersCompactWidget.e0().w, y39);
                    chatMembersCompactWidget.d0().o();
                    return;
                }
                chatMembersCompactWidget.d0().q();
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                KProperty[] kPropertyArr3 = ChatMembersScreen.X;
                ChatMembersScreen chatMembersScreen = (ChatMembersScreen) obj;
                if (g0b == g0b.v) {
                    xag.h(chatMembersScreen.e0().w, y39);
                    chatMembersScreen.d0().o();
                    return;
                }
                chatMembersScreen.d0().q();
                return;
            default:
                if (an3.$EnumSwitchMapping$0[g0b.ordinal()] == 1) {
                    pn3 pn3 = (pn3) obj;
                    ev0.v(pn3.a, ((osa) pn3.q()).b().plus(caa.a), (f14) null, new zm3(pn3, (Continuation) null), 2);
                    return;
                }
                return;
        }
    }

    public Object r(do1 do1) {
        ((ns1) this.b).a = do1;
        return "waitFor3AResult";
    }
}
