package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.uuid.Uuid;

/* renamed from: eda  reason: default package */
public final class eda {
    public int A = 0;
    public String B;
    public int C = 0;
    public int D = 0;
    public final boolean E;
    public final Notification F;
    public final ArrayList G;
    public final Context a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public PendingIntent h;
    public IconCompat i;
    public int j;
    public int k;
    public boolean l = true;
    public boolean m;
    public sda n;
    public int o;
    public int p;
    public boolean q;
    public String r;
    public boolean s;
    public String t;
    public boolean u = false;
    public String v;
    public Bundle w;
    public int x = 0;
    public int y = 0;
    public String z;

    public eda(Context context, String str) {
        Notification notification = new Notification();
        this.F = notification;
        this.a = context;
        this.z = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.k = 0;
        this.G = new ArrayList();
        this.E = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void a(qca qca) {
        this.b.add(qca);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [tgg, java.lang.Object] */
    public final Notification b() {
        Bundle bundle;
        RemoteViews h2;
        int i2;
        tgg tgg;
        ArrayList arrayList;
        Bundle[] bundleArr;
        ? obj = new Object();
        new ArrayList();
        obj.o = new Bundle();
        obj.c = this;
        Context context = this.a;
        obj.a = context;
        Notification.Builder a2 = bea.a(context, this.z);
        obj.b = a2;
        Notification notification = this.F;
        Bundle[] bundleArr2 = null;
        int i3 = 2;
        a2.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, (RemoteViews) null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.e).setContentText(this.f).setContentInfo((CharSequence) null).setContentIntent(this.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(this.h, (notification.flags & Uuid.SIZE_BITS) != 0).setNumber(this.j).setProgress(this.o, this.p, this.q);
        IconCompat iconCompat = this.i;
        zda.b(a2, iconCompat == null ? null : v67.d(iconCompat, context));
        a2.setSubText((CharSequence) null).setUsesChronometer(this.m).setPriority(this.k);
        sda sda = this.n;
        if (sda instanceof jda) {
            jda jda = (jda) sda;
            int i4 = jfc.ic_call_decline;
            PendingIntent pendingIntent = jda.h;
            qca p2 = pendingIntent == null ? jda.p(i4, alc.call_notification_hang_up_action, pdc.call_notification_decline_color, jda.i) : jda.p(i4, alc.call_notification_decline_action, pdc.call_notification_decline_color, pendingIntent);
            int i5 = jfc.ic_call_answer;
            PendingIntent pendingIntent2 = jda.g;
            qca p3 = pendingIntent2 == null ? null : jda.p(i5, alc.call_notification_answer_action, pdc.call_notification_answer_color, pendingIntent2);
            ArrayList arrayList2 = new ArrayList(3);
            arrayList2.add(p2);
            ArrayList arrayList3 = ((eda) jda.b).b;
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    qca qca = (qca) it.next();
                    if (qca.g) {
                        arrayList2.add(qca);
                    } else if (!qca.a.getBoolean("key_action_priority") && i3 > 1) {
                        arrayList2.add(qca);
                        i3--;
                    }
                    if (p3 != null && i3 == 1) {
                        arrayList2.add(p3);
                        i3--;
                    }
                }
            }
            if (p3 != null && i3 >= 1) {
                arrayList2.add(p3);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                obj.o((qca) it2.next());
            }
        } else {
            Iterator it3 = this.b.iterator();
            while (it3.hasNext()) {
                obj.o((qca) it3.next());
            }
        }
        Bundle bundle2 = this.w;
        if (bundle2 != null) {
            ((Bundle) obj.o).putAll(bundle2);
        }
        ((Notification.Builder) obj.b).setShowWhen(this.l);
        xda.i((Notification.Builder) obj.b, this.u);
        xda.g((Notification.Builder) obj.b, this.r);
        xda.j((Notification.Builder) obj.b, this.t);
        xda.h((Notification.Builder) obj.b, this.s);
        yda.b((Notification.Builder) obj.b, this.v);
        yda.c((Notification.Builder) obj.b, this.x);
        yda.f((Notification.Builder) obj.b, this.y);
        yda.d((Notification.Builder) obj.b, (Notification) null);
        yda.e((Notification.Builder) obj.b, notification.sound, notification.audioAttributes);
        ArrayList arrayList4 = this.G;
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                yda.a((Notification.Builder) obj.b, (String) it4.next());
            }
        }
        ArrayList arrayList5 = this.d;
        tgg tgg2 = obj;
        if (arrayList5.size() > 0) {
            if (this.w == null) {
                this.w = new Bundle();
            }
            Bundle bundle3 = this.w.getBundle("android.car.EXTENSIONS");
            if (bundle3 == null) {
                bundle3 = new Bundle();
            }
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i6 = 0;
            tgg tgg3 = obj;
            while (i6 < arrayList5.size()) {
                String num = Integer.toString(i6);
                qca qca2 = (qca) arrayList5.get(i6);
                Bundle bundle6 = new Bundle();
                IconCompat a3 = qca2.a();
                bundle6.putInt("icon", a3 != null ? a3.e() : 0);
                bundle6.putCharSequence("title", qca2.i);
                bundle6.putParcelable("actionIntent", qca2.j);
                Bundle bundle7 = qca2.a;
                Bundle bundle8 = bundle7 != null ? new Bundle(bundle7) : new Bundle();
                bundle8.putBoolean("android.support.allowGeneratedReplies", qca2.d);
                bundle6.putBundle("extras", bundle8);
                a1d[] a1dArr = qca2.c;
                if (a1dArr == null) {
                    tgg = tgg3;
                    arrayList = arrayList5;
                    bundleArr = bundleArr2;
                } else {
                    bundleArr = new Bundle[a1dArr.length];
                    int i7 = 0;
                    tgg tgg4 = tgg3;
                    while (i7 < a1dArr.length) {
                        a1d a1d = a1dArr[i7];
                        ArrayList arrayList6 = arrayList5;
                        Bundle bundle9 = new Bundle();
                        a1d[] a1dArr2 = a1dArr;
                        tgg tgg5 = tgg4;
                        bundle9.putString("resultKey", a1d.a);
                        bundle9.putCharSequence("label", a1d.b);
                        bundle9.putCharSequenceArray("choices", a1d.c);
                        bundle9.putBoolean("allowFreeFormInput", a1d.d);
                        bundle9.putBundle("extras", a1d.f);
                        Set<String> set = a1d.g;
                        if (set != null && !set.isEmpty()) {
                            ArrayList arrayList7 = new ArrayList(set.size());
                            for (String add : set) {
                                arrayList7.add(add);
                            }
                            bundle9.putStringArrayList("allowedDataTypes", arrayList7);
                        }
                        bundleArr[i7] = bundle9;
                        i7++;
                        arrayList5 = arrayList6;
                        a1dArr = a1dArr2;
                        tgg4 = tgg5;
                    }
                    tgg = tgg4;
                    arrayList = arrayList5;
                }
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", qca2.e);
                bundle6.putInt("semanticAction", qca2.f);
                bundle5.putBundle(num, bundle6);
                i6++;
                arrayList5 = arrayList;
                tgg3 = tgg;
                bundleArr2 = null;
            }
            tgg tgg6 = tgg3;
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (this.w == null) {
                this.w = new Bundle();
            }
            this.w.putBundle("android.car.EXTENSIONS", bundle3);
            tgg tgg7 = tgg6;
            ((Bundle) tgg7.o).putBundle("android.car.EXTENSIONS", bundle4);
            tgg2 = tgg7;
        }
        ((Notification.Builder) tgg2.b).setExtras(this.w);
        aea.e((Notification.Builder) tgg2.b, (CharSequence[]) null);
        bea.b((Notification.Builder) tgg2.b, this.A);
        bea.e((Notification.Builder) tgg2.b, (CharSequence) null);
        bea.f((Notification.Builder) tgg2.b, this.B);
        bea.g((Notification.Builder) tgg2.b, 0);
        bea.d((Notification.Builder) tgg2.b, this.C);
        if (!TextUtils.isEmpty(this.z)) {
            ((Notification.Builder) tgg2.b).setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
        }
        Iterator it5 = this.c.iterator();
        while (it5.hasNext()) {
            ldb ldb = (ldb) it5.next();
            ldb.getClass();
            cea.a((Notification.Builder) tgg2.b, kdb.b(ldb));
        }
        int i8 = Build.VERSION.SDK_INT;
        dea.a((Notification.Builder) tgg2.b, this.E);
        dea.b((Notification.Builder) tgg2.b, (Notification.BubbleMetadata) null);
        if (i8 >= 31 && (i2 = this.D) != 0) {
            eea.b((Notification.Builder) tgg2.b, i2);
        }
        eda eda = (eda) tgg2.c;
        sda sda2 = eda.n;
        if (sda2 != null) {
            sda2.b(tgg2);
        }
        RemoteViews i9 = sda2 != null ? sda2.i() : null;
        Notification build = ((Notification.Builder) tgg2.b).build();
        if (i9 != null) {
            build.contentView = i9;
        }
        if (!(sda2 == null || (h2 = sda2.h()) == null)) {
            build.bigContentView = h2;
        }
        if (sda2 != null) {
            eda.n.getClass();
        }
        if (!(sda2 == null || (bundle = build.extras) == null)) {
            sda2.a(bundle);
        }
        return build;
    }

    public final void d(PendingIntent pendingIntent) {
        this.g = pendingIntent;
    }

    public final void e(CharSequence charSequence) {
        this.f = c(charSequence);
    }

    public final void f(CharSequence charSequence) {
        this.e = c(charSequence);
    }

    public final void g(int i2) {
        Notification notification = this.F;
        notification.defaults = i2;
        if ((i2 & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void h(PendingIntent pendingIntent) {
        this.F.deleteIntent = pendingIntent;
    }

    public final void i(int i2, boolean z2) {
        Notification notification = this.F;
        if (z2) {
            notification.flags = i2 | notification.flags;
            return;
        }
        notification.flags = (~i2) & notification.flags;
    }

    public final void j() {
        this.r = "media3_group_key";
    }

    public final void k(Bitmap bitmap) {
        this.i = bitmap == null ? null : IconCompat.b(bitmap);
    }

    public final void l() {
        i(2, false);
    }

    public final void m() {
        i(8, true);
    }

    public final void n(boolean z2) {
        this.l = z2;
    }

    public final void o(int i2) {
        this.F.icon = i2;
    }

    public final void p(Uri uri) {
        Notification notification = this.F;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = dda.a(dda.e(dda.c(dda.b(), 4), 5));
    }

    public final void q(sda sda) {
        if (this.n != sda) {
            this.n = sda;
            if (sda != null) {
                sda.n(this);
            }
        }
    }

    public final void r(boolean z2) {
        this.m = z2;
    }

    public final void s() {
        this.y = 1;
    }

    public final void t(long j2) {
        this.F.when = j2;
    }
}
