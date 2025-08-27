package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ci5  reason: default package */
public final /* synthetic */ class ci5 implements zi6, qk3, mx3, nsb, bp5 {
    public final /* synthetic */ int a;

    public /* synthetic */ ci5(int i) {
        this.a = i;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 12:
                z68.f("vi5", "failed favorites obs", (Throwable) obj);
                return;
            case 13:
                z68.c("vi5", "on next favorite sticker ids to subject: %s", (List) obj);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                z68.f("vi5", "load stickers: failed", (Throwable) obj);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                z68.f("vi5", "clear: failed to clear repository", (Throwable) obj);
                return;
            case 22:
                z68.f("ll5", "onEvent: UpdateMessageEvent: message deleted", (Throwable) obj);
                return;
            case 23:
                z68.f("ll5", "failed to open file attach", (Throwable) obj);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                z68.f("ll5", "onEvent DownloadCompleteEvent: failed", (Throwable) obj);
                return;
            default:
                z68.f("ll5", "initFileSharingProgressDialog: error", (Throwable) obj);
                return;
        }
    }

    public Object apply(Object obj) {
        g20 g20 = g20.X;
        ua3 ua3 = ua3.a;
        switch (this.a) {
            case 0:
                oi5 oi5 = (oi5) obj;
                oi5.getClass();
                return new qa3(2, new fc2(4, oi5));
            case 1:
                return ((OneMeRoomDatabase) obj).C();
            case 2:
                oi5 oi52 = (oi5) obj;
                Objects.requireNonNull(oi52);
                return new mka(2, new di5(oi52, 0));
            case 3:
                oi5 oi53 = (oi5) obj;
                Objects.requireNonNull(oi53);
                return new mka(2, new di5(oi53, 1));
            case 4:
                oi5 oi54 = (oi5) obj;
                oi54.getClass();
                ni niVar = new ni(9, oi54, d7d.a(0, "SELECT id FROM favorite_sticker_sets ORDER BY `index` ASC"));
                return te8.g((OneMeRoomDatabase) oi54.a, new String[]{"favorite_sticker_sets"}, niVar);
            case 5:
                fu fuVar = (fu) obj;
                return new gi5(fuVar.w, fuVar.o);
            case 6:
                au auVar = (au) obj;
                return ua3;
            case 7:
                lu luVar = (lu) obj;
                return ua3;
            case 8:
                ou ouVar = (ou) obj;
                return ua3;
            case 9:
                fu fuVar2 = (fu) obj;
                return new pi5(fuVar2.w, fuVar2.c);
            case 10:
                ou ouVar2 = (ou) obj;
                return ua3;
            case 11:
                au auVar2 = (au) obj;
                return ua3;
            case 16:
                return new ArrayList((List) obj);
            case LangUtils.HASH_SEED /*17*/:
                return ((pi5) obj).a;
            case 21:
                return ((a89) obj).a.x0.I(g20);
            case 26:
                return ((a89) obj).a.x0.I(g20);
            default:
                return new jk5((String) null, Collections.singletonList(new hk5(3, 0, 0, 0, ((am5) obj).c)));
        }
    }

    public void c(long j) {
    }

    public Object n(Task task) {
        switch (this.a) {
            case 18:
                return Integer.valueOf(HttpStatus.SC_FORBIDDEN);
            default:
                return -1;
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 20:
                return ((gdb) obj).a == 167;
            default:
                return ((a89) obj).a.n(g20.X);
        }
    }
}
