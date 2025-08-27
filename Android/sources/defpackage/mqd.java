package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: mqd  reason: default package */
public final /* synthetic */ class mqd implements nsb, iv0, qk3, zi6, rm0 {
    public final /* synthetic */ int a;

    public /* synthetic */ mqd(int i) {
        this.a = i;
    }

    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 6:
                ((List) obj).addAll((List) obj2);
                return;
            default:
                ((ArrayList) obj).addAll((List) obj2);
                return;
        }
    }

    public Object apply(Object obj) {
        uh8 uh8 = uh8.a;
        switch (this.a) {
            case 5:
                return (boe) ((Map.Entry) obj).getValue();
            case 8:
                return ((du) obj).c;
            case 10:
                ArrayList arrayList = new ArrayList();
                for (coe r : (List) obj) {
                    arrayList.add(qe8.r(r));
                }
                return arrayList;
            case 13:
                return Long.valueOf(((vpe) obj).c);
            case 16:
                return Long.valueOf(((vpe) obj).c);
            case 19:
                return Long.valueOf(((boe) obj).a);
            case 20:
                return ((noe) obj).c;
            case 21:
                return qe8.r((coe) obj);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                List list = (List) obj;
                return list.isEmpty() ? uh8 : nh8.e((fqe) list.get(0));
            case 25:
                return ((du) obj).o;
            case 26:
                return Long.valueOf(((bqe) obj).a);
            case 28:
                wqe wqe = (wqe) obj;
                wqe.getClass();
                return new qa3(2, new fc2(14, wqe));
            default:
                List list2 = (List) obj;
                return list2.isEmpty() ? uh8 : nh8.e((fqe) list2.get(0));
        }
    }

    public jv0 h(Bundle bundle) {
        boolean z = false;
        if (bundle.getInt(Integer.toString(0, 36), -1) == 2) {
            z = true;
        }
        y64.g(z);
        int i = bundle.getInt(Integer.toString(1, 36), 5);
        float f = bundle.getFloat(Integer.toString(2, 36), -1.0f);
        return f == -1.0f ? new eje(i) : new eje(i, f);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 0:
                g20 g20 = ((l20) obj).a;
                return g20 == g20.c || g20 == g20.o;
            case 12:
                return ((ouc) obj).a == cvc.STICKER;
            default:
                return ((ouc) obj).a == cvc.STICKER;
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                ((j10) obj).k = -1.0f;
                return;
            case 3:
                j10 j10 = (j10) obj;
                j10.i = d20.v;
                j10.k = -1.0f;
                return;
            case 4:
                z68.f("moe", "putSticker: failed", (Throwable) obj);
                return;
            case 9:
                z68.f("moe", "Can't update recents", (Throwable) obj);
                return;
            case 11:
                z68.f("moe", "onStickersLoadedFromNetwork: write to stickers db failed", (Throwable) obj);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                z68.f("moe", "storeSections: failed", (Throwable) obj);
                return;
            case LangUtils.HASH_SEED /*17*/:
                z68.f("moe", "load: failed", (Throwable) obj);
                return;
            case 18:
                z68.f("moe", "clear: failed to clear repository", (Throwable) obj);
                return;
            case 22:
                z68.f("ooe", "createSticker: failed", (Throwable) obj);
                return;
            case 23:
                Throwable th = (Throwable) obj;
                int i = cpe.V0;
                return;
            default:
                z68.f("vqe", "clear: repository clear failed", (Throwable) obj);
                return;
        }
    }
}
