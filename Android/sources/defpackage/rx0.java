package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.media3.common.VideoFrameProcessingException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import one.me.aboutappsettings.AboutAppSettingsScreen;
import org.webrtc.NativeDoubleArrayConsumer;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.AttachPhotoView;
import ru.ok.messages.views.ActProfilePhoto;
import ru.ok.tamtam.nano.Protos;

/* renamed from: rx0  reason: default package */
public final /* synthetic */ class rx0 implements knd, yf5, zf5, qk3, hmf, iv0, NativeDoubleArrayConsumer.Consumer, zi6, cs6 {
    public static final rx0 b = new rx0(0);
    public static final rx0 c = new rx0(1);
    public static final rx0 o = new rx0(2);
    public static final rx0 v = new rx0(3);
    public static final rx0 w = new rx0(4);
    public static final rx0 x = new rx0(5);
    public final /* synthetic */ int a;

    public /* synthetic */ rx0(int i) {
        this.a = i;
    }

    public void a(VideoFrameProcessingException videoFrameProcessingException) {
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 11:
                Throwable th = (Throwable) obj;
                HashSet hashSet = ActAttachesView.e1;
                return;
            case 12:
                int i = ActContactAvatars.L0;
                z68.f("ru.ok.messages.contacts.profile.ActContactAvatars", "During deleting self photo got error", (Throwable) obj);
                return;
            case 13:
                int i2 = ActContactAvatars.L0;
                z68.f("ru.ok.messages.contacts.profile.ActContactAvatars", "During making photo main got error", (Throwable) obj);
                return;
            case 20:
                Throwable th2 = (Throwable) obj;
                return;
            case 21:
                ((j10) obj).i = d20.v;
                return;
            case 22:
                Throwable th3 = (Throwable) obj;
                z68.e("vz", "Can't update not started live video");
                return;
            case 23:
                int i3 = AttachPhotoView.S0;
                z68.f("ru.ok.messages.media.attaches.AttachPhotoView", "Can't save file", (Throwable) obj);
                return;
            case 26:
                z68.f("vd8", "loadMarkerIcon: can't load marker", (Throwable) obj);
                return;
            case 27:
                z68.f("vd8", "setMapStyle: can't load map style", (Throwable) obj);
                return;
            case 28:
                z68.f("vd8", "loadMarkerIcon: can't load marker", (Throwable) obj);
                return;
            default:
                z68.f("vd8", "loadMarkerIcon: can't load marker", (Throwable) obj);
                return;
        }
    }

    public Object apply(Object obj) {
        return Uri.fromFile((File) obj);
    }

    public String b(q74 q74) {
        String str = q74.h;
        return str != null ? str : q74.a.toString();
    }

    public sf5[] c() {
        switch (this.a) {
            case 7:
                return new sf5[]{new l3()};
            case 9:
                return new sf5[]{new p3()};
            default:
                return new sf5[]{new zb()};
        }
    }

    public void consume(Double[] dArr) {
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [qb7, jb7] */
    public tb7 f(String str) {
        tb7 tb7;
        tb7 f = k65.f(str);
        wi4 wi4 = new wi4(1, str);
        f.getClass();
        dm7 dm7 = new dm7(f, wi4);
        if (dm7 instanceof Collection) {
            tb7 = tb7.p((Collection) dm7);
        } else {
            s1 s1Var = (s1) dm7.iterator();
            if (!s1Var.hasNext()) {
                tb7 = k0d.v;
            } else {
                Object next = s1Var.next();
                if (!s1Var.hasNext()) {
                    tb7 = tb7.t(next);
                } else {
                    ? jb7 = new jb7(4);
                    jb7.a(next);
                    while (s1Var.hasNext()) {
                        jb7.a(s1Var.next());
                    }
                    tb7 = jb7.j();
                }
            }
        }
        return tb7.isEmpty() ? f : tb7;
    }

    public jv0 h(Bundle bundle) {
        n9[] n9VarArr;
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1, 36));
                if (parcelableArrayList == null) {
                    n9VarArr = new n9[0];
                } else {
                    n9[] n9VarArr2 = new n9[parcelableArrayList.size()];
                    for (int i = 0; i < parcelableArrayList.size(); i++) {
                        n9VarArr2[i] = (n9) n9.y.h((Bundle) parcelableArrayList.get(i));
                    }
                    n9VarArr = n9VarArr2;
                }
                return new p9(n9VarArr, bundle.getLong(Integer.toString(2, 36), 0), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
            default:
                long j = bundle.getLong(Integer.toString(0, 36));
                int i2 = bundle.getInt(Integer.toString(1, 36), -1);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(Integer.toString(2, 36));
                int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
                long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
                return new n9(j, i2, intArray == null ? new int[0] : intArray, parcelableArrayList2 == null ? new Uri[0] : (Uri[]) parcelableArrayList2.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, bundle.getLong(Integer.toString(5, 36)), bundle.getBoolean(Integer.toString(6, 36)));
        }
    }

    public jnd j(int i) {
        int i2 = AboutAppSettingsScreen.c;
        return jnd.o;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        int i = ActProfilePhoto.C0;
        return false;
    }

    /* renamed from: c  reason: collision with other method in class */
    public tf5[] m1533c() {
        switch (this.a) {
            case 8:
                return new tf5[]{new m3()};
            case 10:
                return new tf5[]{new q3()};
            default:
                return new tf5[]{new ac(0)};
        }
    }
}
