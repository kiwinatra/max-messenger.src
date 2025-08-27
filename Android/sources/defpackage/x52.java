package defpackage;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: x52  reason: default package */
public final /* synthetic */ class x52 implements qk3, nsb, zi6, i08, h08, gz8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ x52(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public void accept(Object obj) {
        List<Long> list = this.b;
        switch (this.a) {
            case 0:
                w62 w62 = (w62) obj;
                w62.getClass();
                for (Long remove : list) {
                    w62.R.remove(remove);
                }
                return;
            case 1:
                w62 w622 = (w62) obj;
                for (Long put : list) {
                    w622.e().put(put, 0L);
                }
                return;
            case 2:
                w62 w623 = (w62) obj;
                for (Long remove2 : list) {
                    w623.e().remove(remove2);
                }
                return;
            case 19:
                z68.f("vi5", String.format(Locale.ENGLISH, "removeFromFavorites: failed: ids=%s", new Object[]{list}), (Throwable) obj);
                return;
            case 20:
                z68.f("vi5", String.format(Locale.ENGLISH, "onAssetsUpdate: failed to store stickers %s", new Object[]{list}), (Throwable) obj);
                return;
            case 23:
                ((m20) obj).a = list;
                return;
            default:
                z68.h("vqe", (Throwable) obj, "storeStickerSets: failed for sets = %s", list);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 4:
                jc2 jc2 = (jc2) obj;
                jc2.getClass();
                return new qa3(2, new ni(4, jc2, this.b));
            case 10:
                return new qa3(1, new oh5((xi5) obj, this.b, 0));
            case 11:
                return new qa3(1, new oh5((xi5) obj, this.b, 1));
            case 12:
                xi5 xi5 = (xi5) obj;
                xi5.getClass();
                return new qa3(2, new wi5(xi5, this.b, 1));
            case 13:
                return new na3(4, ((fi5) obj).a(), new x52(16, this.b));
            case Protos.Attaches.Attach.LOCATION:
                return new na3(4, ((fi5) obj).a(), new x52(16, this.b));
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return new na3(4, ((fi5) obj).a(), new x52(18, this.b));
            case 16:
                return new qa3(1, new ei5((oi5) obj, this.b, 0));
            case LangUtils.HASH_SEED:
                return new qa3(1, new ei5((oi5) obj, this.b, 1));
            case 18:
                oi5 oi5 = (oi5) obj;
                oi5.getClass();
                return new qa3(2, new ni5(oi5, this.b, 1));
            case 25:
                kuc kuc = (kuc) obj;
                kuc.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM recent WHERE recent_type IN (");
                List<cvc> list = this.b;
                int size = list.size();
                n79.c(sb, size);
                sb.append(") ORDER BY `recent_time` DESC");
                d7d a2 = d7d.a(size, sb.toString());
                int i = 1;
                for (cvc cvc : list) {
                    a2.k(i, (long) cvc.a);
                    i++;
                }
                iuc iuc = new iuc(kuc, a2, 4);
                return te8.g((OneMeRoomDatabase) kuc.a, new String[]{"recent"}, iuc);
            default:
                return new mha(new yia(jha.n((List) obj), new qbb(13), 3), new x52(24, this.b), 1).B().o();
        }
    }

    public Object g(yx8 yx8, cx8 cx8, int i) {
        switch (this.a) {
            case 21:
                return yx8.k(cx8, (k0d) this.b);
            default:
                return yx8.k(cx8, (k0d) this.b);
        }
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 6:
                ((ud) obj).getClass();
                return;
            case 7:
                ((sb5) obj).getClass();
                return;
            case 8:
                ((rob) obj).k(this.b);
                return;
            default:
                ((sob) obj).k(this.b);
                return;
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 3:
                return !cjf.d(this.b, new c10(((b89) obj).a, 11));
            case 5:
                return this.b.contains(Long.valueOf(((bj2) obj).a.a));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return this.b.contains(((ouc) obj).a);
            case 27:
                return !((Boolean) new oha(jha.n(this.b), new koe(0, (Long) obj)).f()).booleanValue();
            default:
                Map.Entry entry = (Map.Entry) obj;
                return this.b.contains(entry.getKey()) && entry.getValue() != null;
        }
    }

    public /* synthetic */ x52(Object obj, List list, int i) {
        this.a = i;
        this.b = list;
    }
}
