package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.reflect.KProperty;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: tb4  reason: default package */
public final /* synthetic */ class tb4 implements i08, h08, qk3, zi6, nsb, rm0, sm0, yi6, iv0, fc3, knd, mw4 {
    public final /* synthetic */ int a;

    public /* synthetic */ tb4(int i) {
        this.a = i;
    }

    public Constructor a() {
        Class<tf5> cls = tf5.class;
        switch (this.a) {
            case LangUtils.HASH_SEED /*17*/:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", (Class[]) null).invoke((Object) null, (Object[]) null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(cls).getConstructor(new Class[]{Integer.TYPE});
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(cls).getConstructor((Class[]) null);
        }
    }

    public void accept(Object obj, Object obj2) {
        ((HashSet) obj).addAll(((bqe) obj2).h);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                xe4 xe4 = (xe4) obj;
                xe4.getClass();
                return new qa3(2, new fc2(2, xe4));
            case 16:
                return ((OneMeRoomDatabase) obj).A();
            default:
                upf upf = (upf) obj;
                upf.getClass();
                Bundle bundle = new Bundle();
                k0d k0d = upf.b;
                ArrayList arrayList = new ArrayList(k0d.o);
                lx5 r = k0d.listIterator(0);
                while (r.hasNext()) {
                    arrayList.add(((spf) r.next()).f());
                }
                bundle.putParcelableArrayList(upf.e, arrayList);
                return bundle;
        }
    }

    public Object g(soc soc) {
        Set b = soc.b(pac.a(gb0.class));
        vs6 vs6 = vs6.c;
        if (vs6 == null) {
            synchronized (vs6.class) {
                try {
                    vs6 = vs6.c;
                    if (vs6 == null) {
                        vs6 = new vs6(0);
                        vs6.c = vs6;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new tj4(b, vs6);
    }

    public jv0 h(Bundle bundle) {
        boolean z = false;
        int i = bundle.getInt(Integer.toString(0, 36), -1);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        int i2 = bundle.getInt(Integer.toString(2, 36), -1);
        if (i >= 0 && i2 >= 0) {
            z = true;
        }
        y64.g(z);
        intArray.getClass();
        return new gj4(intArray, i, i2);
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((ud) obj).getClass();
                return;
            case 1:
                ((ud) obj).getClass();
                return;
            case 2:
                ((sb5) obj).getClass();
                return;
            case 3:
                ((ud) obj).getClass();
                return;
            case 4:
                ((sb5) obj).getClass();
                return;
            case 5:
                ((ud) obj).getClass();
                return;
            case 6:
                ((sb5) obj).getClass();
                return;
            case 7:
                ((ud) obj).getClass();
                return;
            case 8:
                ((sb5) obj).getClass();
                return;
            case 9:
                ((ud) obj).getClass();
                return;
            case 10:
                ((sb5) obj).getClass();
                return;
            case 11:
                ((sb5) obj).getClass();
                return;
            default:
                ((sb5) obj).getClass();
                return;
        }
    }

    public jnd j(int i) {
        KProperty[] kPropertyArr = DialogNotificationsSettingsScreen.w;
        return jnd.o;
    }

    public void release() {
    }

    public boolean test(Object obj) {
        return !((List) obj).isEmpty();
    }

    public /* synthetic */ tb4(sd sdVar, Exception exc, int i) {
        this.a = i;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 13:
                z68.f("ve4", "putEmoji: failed to store emoji", (Throwable) obj);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                z68.f("ve4", "clear: failed to clear repository", (Throwable) obj);
                return;
            case 20:
                z68.c("oh4", "getLoadingObs: loading=%b", (Boolean) obj);
                return;
            case 22:
                z68.f("oh4", "DefaultEmojiPagesProvider: failed to load", (Throwable) obj);
                return;
            default:
                ((j10) obj).m = "";
                return;
        }
    }

    public /* synthetic */ tb4(td tdVar, l28 l28, es8 es8, int i) {
        this.a = i;
    }

    public Object apply(Object obj, Object obj2) {
        HashSet hashSet = (HashSet) obj;
        nh4 nh4 = (nh4) obj2;
        z68.c("oh4", "loadingSubject: scan - add provider " + nh4, new Object[0]);
        hashSet.add(nh4);
        return hashSet;
    }
}
