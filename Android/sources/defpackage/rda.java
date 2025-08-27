package defpackage;

import android.app.Notification;
import android.app.Person;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: rda  reason: default package */
public final class rda extends sda {
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ldb g;
    public CharSequence h;
    public Boolean i;

    public rda(ldb ldb) {
        if (!TextUtils.isEmpty(ldb.a)) {
            this.g = ldb;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }

    public final void a(Bundle bundle) {
        Bundle bundle2;
        super.a(bundle);
        ldb ldb = this.g;
        bundle.putCharSequence("android.selfDisplayName", ldb.a);
        Bundle bundle3 = new Bundle();
        bundle3.putCharSequence("name", ldb.a);
        IconCompat iconCompat = ldb.b;
        if (iconCompat != null) {
            bundle2 = new Bundle();
            switch (iconCompat.a) {
                case -1:
                    bundle2.putParcelable("obj", (Parcelable) iconCompat.b);
                    break;
                case 1:
                case 5:
                    bundle2.putParcelable("obj", (Bitmap) iconCompat.b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle2.putString("obj", (String) iconCompat.b);
                    break;
                case 3:
                    bundle2.putByteArray("obj", (byte[]) iconCompat.b);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid icon");
            }
            bundle2.putInt("type", iconCompat.a);
            bundle2.putInt("int1", iconCompat.e);
            bundle2.putInt("int2", iconCompat.f);
            bundle2.putString("string1", iconCompat.j);
            ColorStateList colorStateList = iconCompat.g;
            if (colorStateList != null) {
                bundle2.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.h;
            if (mode != IconCompat.k) {
                bundle2.putString("tint_mode", mode.name());
            }
        } else {
            bundle2 = null;
        }
        bundle3.putBundle("icon", bundle2);
        bundle3.putString("uri", ldb.c);
        bundle3.putString("key", ldb.d);
        bundle3.putBoolean("isBot", ldb.e);
        bundle3.putBoolean("isImportant", ldb.f);
        bundle.putBundle("android.messagingStyleUser", bundle3);
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", qda.a(arrayList));
        }
        ArrayList arrayList2 = this.f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", qda.a(arrayList2));
        }
        Boolean bool = this.i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    public final void b(tgg tgg) {
        eda eda = (eda) this.b;
        boolean z = false;
        if (eda == null || eda.a.getApplicationInfo().targetSdkVersion >= 28 || this.i != null) {
            Boolean bool = this.i;
            if (bool != null) {
                z = bool.booleanValue();
            }
        } else if (this.h != null) {
            z = true;
        }
        this.i = Boolean.valueOf(z);
        ldb ldb = this.g;
        ldb.getClass();
        Notification.MessagingStyle a = nda.a(kdb.b(ldb));
        Iterator it = this.e.iterator();
        while (true) {
            Person person = null;
            if (!it.hasNext()) {
                break;
            }
            qda qda = (qda) it.next();
            ldb ldb2 = qda.c;
            if (ldb2 != null) {
                person = kdb.b(ldb2);
            }
            Notification.MessagingStyle.Message b = pda.b(qda.a, qda.b, person);
            String str = qda.e;
            if (str != null) {
                oda.b(b, str, qda.f);
            }
            lda.a(a, b);
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            qda qda2 = (qda) it2.next();
            ldb ldb3 = qda2.c;
            Notification.MessagingStyle.Message b2 = pda.b(qda2.a, qda2.b, ldb3 == null ? null : kdb.b(ldb3));
            String str2 = qda2.e;
            if (str2 != null) {
                oda.b(b2, str2, qda2.f);
            }
            mda.a(a, b2);
        }
        this.i.getClass();
        lda.c(a, this.h);
        nda.b(a, this.i.booleanValue());
        a.setBuilder((Notification.Builder) tgg.b);
    }

    public final String e() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }
}
