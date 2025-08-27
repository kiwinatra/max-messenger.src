package defpackage;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import kotlin.reflect.KProperty;
import one.me.messages.settings.MessagesSettingsScreen;
import ru.ok.messages.gallery.AlbumsSelectionFragment;
import ru.ok.messages.gallery.GalleryFragment;
import ru.ok.messages.suggests.SuggestsFragment;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: p79  reason: default package */
public final /* synthetic */ class p79 implements yi6, qk3, nsb, zi6, knd, krf, o77, p77, yf5, zf5 {
    public final /* synthetic */ int a;

    public /* synthetic */ p79(int i) {
        this.a = i;
    }

    public boolean a(int i, int i2, int i3, int i4, int i5) {
        switch (this.a) {
            case 19:
                return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
            default:
                return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                Drawable drawable = p89.W0;
                z68.f("p89", "Can't save file", (Throwable) obj);
                return;
            case 3:
                ((p89) obj).M();
                return;
            case 5:
                Throwable th = (Throwable) obj;
                z68.n("p99", (IOException) null, "loadConstructors: finished with exception", Arrays.copyOf(new Object[0], 0));
                return;
            case 7:
                m20 m20 = (m20) obj;
                for (int i = 0; i < m20.b(); i++) {
                    j10 j = m20.d(i).j();
                    j.i = d20.a;
                    j.k = c44.DEFAULT_ASPECT_RATIO;
                    m20.e(i, j.a());
                }
                return;
            case 8:
                z68.f("fa9", "cancelUploadAttachAcync: failed", (Throwable) obj);
                return;
            case 9:
                j10 j10 = (j10) obj;
                j10.k = c44.DEFAULT_ASPECT_RATIO;
                j10.o = 0;
                j10.p = 0;
                return;
            case 10:
                Throwable th2 = (Throwable) obj;
                z68.e("fe9", "Can't update not started live video");
                return;
            case 25:
                ((j10) obj).i = d20.c;
                return;
            case 26:
                Throwable th3 = (Throwable) obj;
                z68.e("j0a", "Can't hide controls");
                return;
            case 27:
                Throwable th4 = (Throwable) obj;
                z68.e("j0a", "Can't update not started live video");
                return;
            case 28:
                Throwable th5 = (Throwable) obj;
                z68.e("j0a", "Can't update seek");
                return;
            default:
                Throwable th6 = (Throwable) obj;
                z68.e("r0a", "Error in timer");
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return Long.valueOf(((q44) obj).c);
            case 1:
                return tb7.p(gsg.H(new xff(9), ((mt8) obj).x().b));
            case 6:
                return String.valueOf((Long) obj);
            case 11:
                xf9 xf9 = (xf9) obj;
                xf9.getClass();
                return new bi8(new wf9(xf9, d7d.a(0, "SELECT * FROM message_uploads"), 0));
            case 12:
                return y64.w((sf9) obj);
            case 13:
                List list = (List) obj;
                return list.isEmpty() ? uh8.a : nh8.e(list);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                List list2 = (List) obj;
                return list2.isEmpty() ? uh8.a : nh8.e(list2);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                xf9 xf92 = (xf9) obj;
                xf92.getClass();
                return new qa3(2, new fc2(9, xf92));
            case 16:
                return ((OneMeRoomDatabase) obj).G();
            case 18:
                mp9 mp9 = (mp9) obj;
                mp9.getClass();
                g6d g6d = q8c.a;
                g6d.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    g6d.m(mp9, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 21:
                return (kpf) obj;
            default:
                return (lpf) obj;
        }
    }

    public sf5[] c() {
        return new sf5[]{new nu9()};
    }

    public jnd j(int i) {
        KProperty[] kPropertyArr = MessagesSettingsScreen.w;
        return jnd.o;
    }

    public boolean test(Object obj) {
        a aVar = (a) obj;
        return (aVar instanceof GalleryFragment) || (aVar instanceof AlbumsSelectionFragment) || (aVar instanceof SuggestsFragment);
    }

    /* renamed from: c  reason: collision with other method in class */
    public tf5[] m1528c() {
        return new tf5[]{new ou9(16, gze.d0)};
    }
}
