package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.transfer.exceptions.TamHttpUrlExpiredException;
import org.apache.http.util.LangUtils;
import ru.ok.messages.stickers.widgets.StickerView;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: dre  reason: default package */
public final /* synthetic */ class dre implements zi6, qk3, nsb, sm0, lq7, c88, qff {
    public final /* synthetic */ int a;

    public /* synthetic */ dre(int i) {
        this.a = i;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                z68.f("mre", "subscribeFavorites: failed", (Throwable) obj);
                return;
            case 5:
                z68.f("mre", "onStickersSetsLoaded: failed", (Throwable) obj);
                return;
            case 10:
                z68.f("ure", "loadNext: failed", (Throwable) obj);
                return;
            case 13:
                z68.f("r1f", "Got error during handling event", (Throwable) obj);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                z68.f("r1f", "loadBotCommands: exception", (Throwable) obj);
                return;
            case 19:
                Integer num = (Integer) obj;
                z68.a("gcf", "retryWhenCommonError: connected");
                return;
            case 21:
                Integer num2 = (Integer) obj;
                z68.a("gcf", "retryWhenCommonErrorObs: connected");
                return;
            case 22:
                Integer num3 = (Integer) obj;
                z68.a("icf", "retryWhenTamHttpError: connected");
                return;
            case 25:
                z68.f("tcf", "prefetchBackground: failed", (Throwable) obj);
                return;
            case 26:
                Long l = (Long) obj;
                return;
            default:
                Throwable th = (Throwable) obj;
                return;
        }
    }

    public Object apply(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return arrayList;
    }

    public Object m(Object obj, String str) {
        return (Intrinsics.areEqual((Object) "msg", (Object) str) || Intrinsics.areEqual((Object) "epl", (Object) str)) ? "***" : obj;
    }

    public void onError(Throwable th) {
        switch (this.a) {
            case 11:
                int i = StickerView.N0;
                z68.f("ru.ok.messages.stickers.widgets.StickerView", "lottie set animation failed: ", th);
                return;
            default:
                int i2 = hse.Q0;
                return;
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 6:
                mmd mmd = (mmd) obj;
                return mmd.a == 3 && mmd.b.equalsIgnoreCase("NEW_STICKER_SETS");
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return ((xdb) obj).w != 0;
            default:
                return gcf.a(((Integer) obj).intValue());
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, zpe] */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.lang.Object, gqe] */
    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                gqe gqe = (gqe) obj;
                long j = gqe.a;
                ? obj2 = new Object();
                obj2.a = j;
                obj2.b = gqe.b;
                obj2.c = gqe.c;
                obj2.d = gqe.d;
                obj2.e = gqe.e;
                obj2.f = gqe.f;
                obj2.g = gqe.g;
                obj2.h = gqe.h;
                obj2.i = gqe.i;
                return new fqe(obj2);
            case 1:
                List list = (List) obj;
                if (list.isEmpty()) {
                    return uh8.a;
                }
                return nh8.e(list);
            case 2:
                return ((OneMeRoomDatabase) obj).S();
            case 3:
                fqe fqe = (fqe) obj;
                ? obj3 = new Object();
                obj3.a = fqe.a;
                obj3.b = fqe.b;
                obj3.c = fqe.c;
                obj3.d = fqe.d;
                obj3.e = fqe.e;
                obj3.f = fqe.f;
                obj3.g = fqe.g;
                obj3.h = fqe.h;
                obj3.i = fqe.i;
                return obj3;
            case 7:
                return new gia(new mha(jha.n((Collection) obj), new dre(6), 1).e(fre.class), 2);
            case 9:
                return ((tre) obj).c;
            case 16:
                return Long.valueOf(((xdb) obj).w);
            case LangUtils.HASH_SEED /*17*/:
                return Long.valueOf(((vk3) obj).r());
            case 23:
                return ((jha) obj).l(new dre(24));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                Throwable th = (Throwable) obj;
                if (th instanceof TamHttpUrlExpiredException) {
                    return jha.q(th);
                }
                return jha.k(th);
            default:
                return Boolean.valueOf(((Long) obj).longValue() > 0);
        }
    }
}
