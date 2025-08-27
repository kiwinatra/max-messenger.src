package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Base64;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: qbb  reason: default package */
public final /* synthetic */ class qbb implements iv0, b4d, yf5, zf5, qk3, zi6, lbd, pk3, l9c, pgd, nsb {
    public final /* synthetic */ int a;

    public /* synthetic */ qbb(int i) {
        this.a = i;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 5:
                int i = RangeSeekBarView.O0;
                z68.f("ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView", "TimeLineView error occurred", (Throwable) obj);
                return;
            case 12:
                z68.f("ruc", "clearRecentSearch: failed", (Throwable) obj);
                return;
            case 16:
                ((Throwable) obj).getMessage();
                return;
            case LangUtils.HASH_SEED /*17*/:
                z68.f("jbd", "async failed", (Throwable) obj);
                return;
            case 18:
                nob nob = jbd.a;
                return;
            case 19:
                z68.f("jbd", "async failed", (Throwable) obj);
                return;
            case 20:
                Throwable th = (Throwable) obj;
                z68.f("y64", th.getMessage(), th);
                return;
            case 21:
                ((x6) obj).run();
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                ((ecd) obj).b.release();
                return;
            default:
                ((fcd) obj).b.release();
                return;
        }
    }

    public Object apply(Object obj) {
        Object vpe;
        boolean z = false;
        switch (this.a) {
            case 7:
                return new xuc((a32) obj, (vk3) null);
            case 8:
                return jha.n(((a32) obj).k());
            case 9:
                return new xuc((a32) null, (vk3) obj);
            case 10:
                return jha.n(((a32) obj).k());
            case 11:
                xuc xuc = (xuc) obj;
                a32 a32 = xuc.a;
                vk3 vk3 = xuc.b;
                return vk3 != null ? new ald(4, (String) null, Collections.emptyList(), (a32) null, vk3, (b89) null, 0, (bac) null) : a32.K() ? new ald(2, (String) null, Collections.emptyList(), a32, (vk3) null, (b89) null, 0, (bac) null) : new ald(1, (String) null, Collections.emptyList(), a32, (vk3) null, (b89) null, 0, (bac) null);
            case 13:
                luc luc = (luc) obj;
                int ordinal = luc.b.ordinal();
                if (ordinal == 1) {
                    return new d35(luc.f.a);
                }
                if (ordinal == 2) {
                    vpe = new vpe(luc.e.b, luc.d);
                } else if (ordinal == 3) {
                    try {
                        vpe = new rr6(b.m(Protos.Attaches.Attach.Photo.parseFrom((byte[]) luc.g.c)), luc.d);
                    } catch (InvalidProtocolBufferNanoException e) {
                        z68.f("suc", "Can't parse gif", e);
                        return new mj();
                    }
                } else if (ordinal == 4) {
                    return new mj(luc.d);
                } else {
                    Locale locale = Locale.ENGLISH;
                    z68.e("suc", "Unknown recentDb type " + luc.c);
                    return new mj();
                }
                return vpe;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return ((OneMeRoomDatabase) obj).N();
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                kuc kuc = (kuc) obj;
                kuc.getClass();
                return new qa3(2, new fc2(12, kuc));
            case 22:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        g6d a2 = tc0.a();
                        a2.y(rawQuery.getString(1));
                        a2.o = wub.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        a2.c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(a2.k());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 23:
                if (((Cursor) obj).getCount() > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return ((pm3) obj).a();
        }
    }

    public void b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        switch (this.a) {
            case 1:
                bitmap.recycle();
                return;
            default:
                bitmap.recycle();
                return;
        }
    }

    public sf5[] c() {
        return new sf5[]{new x9c()};
    }

    public void f() {
    }

    public jv0 h(Bundle bundle) {
        jv0 wx6;
        jv0 rbb;
        switch (this.a) {
            case 0:
                boolean z = false;
                if (bundle.getInt(Integer.toString(0, 36), -1) == 1) {
                    z = true;
                }
                y64.g(z);
                float f = bundle.getFloat(Integer.toString(1, 36), -1.0f);
                return f == -1.0f ? new rbb() : new rbb(f);
            default:
                boolean z2 = false;
                int i = bundle.getInt(Integer.toString(0, 36), -1);
                if (i != 0) {
                    if (i == 1) {
                        if (bundle.getInt(Integer.toString(0, 36), -1) == 1) {
                            z2 = true;
                        }
                        y64.g(z2);
                        float f2 = bundle.getFloat(Integer.toString(1, 36), -1.0f);
                        if (f2 == -1.0f) {
                            wx6 = new rbb();
                        } else {
                            rbb = new rbb(f2);
                        }
                    } else if (i == 2) {
                        if (bundle.getInt(Integer.toString(0, 36), -1) == 2) {
                            z2 = true;
                        }
                        y64.g(z2);
                        int i2 = bundle.getInt(Integer.toString(1, 36), 5);
                        float f3 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
                        if (f3 != -1.0f) {
                            return new eje(i2, f3);
                        }
                        rbb = new eje(i2);
                    } else if (i == 3) {
                        y64.g(bundle.getInt(Integer.toString(0, 36), -1) == 3);
                        return bundle.getBoolean(Integer.toString(1, 36), false) ? new yif(bundle.getBoolean(Integer.toString(2, 36), false)) : new yif();
                    } else {
                        throw new IllegalArgumentException(i2a.h(31, i, "Unknown RatingType: "));
                    }
                    return rbb;
                }
                y64.g(bundle.getInt(Integer.toString(0, 36), -1) == 0);
                if (bundle.getBoolean(Integer.toString(1, 36), false)) {
                    return new wx6(bundle.getBoolean(Integer.toString(2, 36), false));
                }
                wx6 = new wx6();
                return wx6;
        }
    }

    public boolean test(Object obj) {
        return !cvg.A((String) obj);
    }

    /* renamed from: c  reason: collision with other method in class */
    public tf5[] m1532c() {
        return new tf5[]{new y9c()};
    }
}
