package ru.ok.messages.views.fragments;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.StringCompanionObject;
import ru.ok.messages.views.dialogs.InvitePhonebookContactDialog;
import ru.ok.messages.views.fragments.base.FrgBaseProfile;
import ru.ok.messages.views.widgets.TamAvatarView;

public class FrgPhoneProfile extends FrgBaseProfile implements rma {
    public qdb W1;

    public final void A2(View view, Bundle bundle) {
        super.A2(view, bundle);
        b33 b33 = this.N1;
        if (b33 != null) {
            b33.e(this.W1.b);
        }
        String str = (String) new yia(jha.n(this.W1.e), new ip5(19), 3).y(3).B().i(new ip5(20)).f();
        b33 b332 = this.N1;
        if (b332 != null) {
            b332.d(str);
        }
        this.C1.setAdapter(j3());
        TamAvatarView tamAvatarView = this.J1;
        if (tamAvatarView != null) {
            tamAvatarView.d(this.W1);
        }
        TamAvatarView tamAvatarView2 = this.K1;
        if (tamAvatarView2 != null) {
            tamAvatarView2.d(this.W1);
        }
    }

    public final String V2() {
        return "PHONE_PROFILE";
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [hvd, zud] */
    public final void b3(int i, int i2, Intent intent) {
        long[] longArrayExtra;
        super.b3(i, i2, intent);
        if (i2 == -1 && i == 208 && (longArrayExtra = intent.getLongArrayExtra("ru.ok.tamtam.extra.CHAT_IDS")) != null && longArrayExtra.length > 0) {
            for (long hvd : longArrayExtra) {
                ? hvd2 = new hvd(hvd);
                qdb qdb = this.W1;
                hvd2.n = qdb.a;
                hvd2.o = qdb.b;
                hvd2.p = qdb.g;
                this.q1.A().a(new avd(hvd2));
            }
            if (longArrayExtra.length == 1) {
                q5.T(M1(), new t5(longArrayExtra[0]));
                U2();
                return;
            }
            hi7.a0(qad.v9, O1());
        }
    }

    public final void e3(int i, String[] strArr, int[] iArr) {
        super.e3(i, strArr, iArr);
        if (i == 156 && n54.U(strArr, iArr, "android.permission.READ_CONTACTS")) {
            ((meb) ((deb) this.q1.getAccessor().g(deb.class))).c();
            u5.T(this, (Bundle) null, 208, (Serializable) null);
        }
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        this.W1 = ((beb) this.x.getParcelable("ru.ok.tamtam.extra.EXTRA_PHONE")).a;
    }

    public final tyc j3() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(l5c.INVITE_TO_TT);
        arrayList.add(l5c.SHARE_CONTACT);
        return new xw3(arrayList, this, (String) null);
    }

    public final void s1(l5c l5c) {
        if (this.o1) {
            int ordinal = l5c.ordinal();
            if (ordinal != 3) {
                if (ordinal == 10) {
                    qdb qdb = this.W1;
                    ArrayList arrayList = gsg.j;
                    int size = qdb.e.size();
                    List list = qdb.e;
                    String str = qdb.h;
                    if (size == 1 && TextUtils.isEmpty(str)) {
                        String str2 = (String) list.get(0);
                        Context O1 = O1();
                        cud cud = ym.v.c().b;
                        String string = cud.g.getString("invite-long", (String) null);
                        if (string == null) {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            string = String.format(O1.getString(jad.F), Arrays.copyOf(new Object[]{cud.p()}, 1));
                        }
                        gsg.C(this, str2, string);
                    } else if (!list.isEmpty() || TextUtils.isEmpty(str)) {
                        InvitePhonebookContactDialog invitePhonebookContactDialog = new InvitePhonebookContactDialog();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("ru.ok.tamtam.extra.PHONE", new beb(qdb));
                        invitePhonebookContactDialog.L2(bundle);
                        invitePhonebookContactDialog.Y2(N1(), "ru.ok.messages.views.dialogs.InvitePhonebookContactDialog");
                    } else {
                        Context O12 = O1();
                        String string2 = ym.v.c().b.g.getString("invite-header", (String) null);
                        if (string2 == null) {
                            string2 = O12.getString(jad.s);
                        }
                        String str3 = string2.toString();
                        Context O13 = O1();
                        cud cud2 = ym.v.c().b;
                        String string3 = cud2.g.getString("invite-long", (String) null);
                        if (string3 == null) {
                            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                            string3 = String.format(O13.getString(jad.F), Arrays.copyOf(new Object[]{cud2.p()}, 1));
                        }
                        gsg.D(this, str, str3, string3);
                    }
                }
            } else if (n54.e(O1(), n54.d)) {
                u5.T(this, (Bundle) null, 208, (Serializable) null);
            } else {
                n54.N(this, n54.c, 156);
            }
        }
    }

    public final void s3() {
    }

    public final void t3(String str, RectF rectF, Rect rect) {
    }

    public final void u3() {
    }
}
