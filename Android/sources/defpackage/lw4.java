package defpackage;

import androidx.media3.exoplayer.ExoPlaybackException;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.List;
import java.util.Objects;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.EglThread;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: lw4  reason: default package */
public final /* synthetic */ class lw4 implements nw4, EglThread.ReleaseMonitor, qk3, fc3, yi6, i08, h08, zi6 {
    public final /* synthetic */ int a;

    public /* synthetic */ lw4(int i) {
        this.a = i;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                Throwable th = (Throwable) obj;
                int i = r25.S0;
                return;
            case 3:
                z68.f("t25", "Can't invalidate", (Throwable) obj);
                return;
            case 22:
                z68.f("ai5", "failed favorites obs", (Throwable) obj);
                return;
            case 23:
                z68.c("ai5", "on next favorite ids to subject: %s", (List) obj);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                z68.f("ai5", "load: failed", (Throwable) obj);
                return;
            case 25:
                z68.f("ai5", "setFavoriteStickerSetMoved: failed", (Throwable) obj);
                return;
            case 28:
                z68.f("ai5", "clear: failed to clear fav stickers repository", (Throwable) obj);
                return;
            default:
                z68.f("ai5", "onAssetsUpdate: failed to store fav sticker sets", (Throwable) obj);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 8:
                return new vb4((b7f) obj);
            case 9:
                return new wb4((c7f) obj);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                xi5 xi5 = (xi5) obj;
                xi5.getClass();
                return new qa3(2, new fc2(5, xi5));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                xi5 xi52 = (xi5) obj;
                Objects.requireNonNull(xi52);
                return new mka(2, new nh5(xi52, 0));
            case 16:
                return ((OneMeRoomDatabase) obj).D();
            case LangUtils.HASH_SEED /*17*/:
                xi5 xi53 = (xi5) obj;
                Objects.requireNonNull(xi53);
                return new mka(2, new nh5(xi53, 1));
            case 18:
                xi5 xi54 = (xi5) obj;
                xi54.getClass();
                ni niVar = new ni(10, xi54, d7d.a(0, "SELECT id FROM favorite_stickers ORDER BY `index` ASC"));
                return te8.g((OneMeRoomDatabase) xi54.a, new String[]{"favorite_stickers"}, niVar);
            case 19:
                return new wbe(((fi5) obj).a(), new ci5(3), 0);
            case 20:
                return ((gi5) obj).a;
            case 21:
                return new oa3(4, ((fi5) obj).a(), new ci5(4));
            case 26:
                return new wbe(((fi5) obj).a(), new ci5(2), 0);
            default:
                return new na3(4, ((fi5) obj).a(), new ci5(0));
        }
    }

    public Object g(soc soc) {
        switch (this.a) {
            case 4:
                return ExecutorsRegistrar.lambda$getComponents$4(soc);
            case 5:
                return ExecutorsRegistrar.lambda$getComponents$5(soc);
            case 6:
                return ExecutorsRegistrar.lambda$getComponents$6(soc);
            default:
                return wuf.a;
        }
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 10:
                ((sob) obj).w0(new ExoPlaybackException(2, new RuntimeException("Player release timed out."), 1003));
                return;
            case 11:
                ((rob) obj).p();
                return;
            case 12:
                ((rob) obj).getClass();
                return;
            default:
                ((sob) obj).r();
                return;
        }
    }

    public boolean onRelease(EglThread eglThread) {
        return EglThread.lambda$create$1(eglThread);
    }

    public void release() {
    }
}
