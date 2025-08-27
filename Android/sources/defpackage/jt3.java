package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.http.protocol.HTTP;

/* renamed from: jt3  reason: default package */
public final /* synthetic */ class jt3 implements r8 {
    public final /* synthetic */ lt3 a;

    public /* synthetic */ jt3(lt3 lt3) {
        this.a = lt3;
    }

    public final void a(e9d e9d) {
        lt3 lt3 = this.a;
        try {
            Activity w = te8.w(e9d);
            hr6 hr6 = new hr6((Context) w);
            String string = ((akd) ((bud) lt3.b.getValue())).g.getString("invite-header", (String) null);
            if (string == null) {
                string = w.getString(jad.s);
            }
            hr6.c = string;
            ((Intent) hr6.b).setType(HTTP.PLAIN_TEXT_TYPE);
            bud bud = (bud) lt3.b.getValue();
            String string2 = ((akd) bud).g.getString("invite-long", (String) null);
            if (string2 == null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                string2 = String.format(w.getString(jad.F), Arrays.copyOf(new Object[]{((akd) bud).p()}, 1));
            }
            hr6.u(string2);
            hr6.w();
        } catch (ActivityNotFoundException unused) {
            z68.f("ContactsDeepLinkFactory", "shareInvite: failed, no activity found", (Throwable) null);
        }
    }
}
