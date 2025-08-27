package defpackage;

import android.content.Context;
import com.jakewharton.processphoenix.ProcessPhoenix;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.views.dev.FrgPrefs;

/* renamed from: fi6  reason: default package */
public final class fi6 {
    public final /* synthetic */ id3 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ FrgPrefs f;

    public fi6(FrgPrefs frgPrefs, qra qra, long j, String str, String str2, boolean z) {
        this.f = frgPrefs;
        this.a = qra;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    @oye
    public void onEvent(p98 p98) {
        id3 id3 = this.a;
        try {
            qa3 b2 = ((qra) id3).E().b();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            lfd a2 = xfd.a();
            Objects.requireNonNull(timeUnit, "unit is null");
            Objects.requireNonNull(a2, "scheduler is null");
            new eb3(b2, timeUnit, a2).a();
        } catch (Exception e2) {
            z68.f("ru.ok.messages.views.dev.FrgPrefs", "error while delete token", e2);
        } catch (Throwable th) {
            z68.f("ru.ok.messages.views.dev.FrgPrefs", "failure to handle logout event", th);
            return;
        }
        ym.v.c().a.y(Long.valueOf(this.b));
        ((qra) id3).j().a(this.c, this.d, this.e);
        ((jna) ((qra) id3).e()).H();
        Context O1 = this.f.O1();
        if (O1 != null) {
            ProcessPhoenix.b(O1);
        }
    }
}
