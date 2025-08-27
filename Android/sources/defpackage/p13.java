package defpackage;

import android.content.Context;
import com.jakewharton.processphoenix.ProcessPhoenix;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;

/* renamed from: p13  reason: default package */
public final class p13 {
    public final /* synthetic */ q13 a;

    public p13(q13 q13) {
        this.a = q13;
    }

    @oye
    public final void onEvent(p98 p98) {
        q13 q13 = this.a;
        try {
            qa3 b = ((f8f) ((Lazy) q13.w).getValue()).b();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            lfd a2 = xfd.a();
            Objects.requireNonNull(timeUnit, "unit is null");
            Objects.requireNonNull(a2, "scheduler is null");
            new eb3(b, timeUnit, a2).a();
        } catch (Exception e) {
            try {
                z68.f((String) q13.c, "error while delete token", e);
            } catch (Throwable th) {
                ((sv0) ((Lazy) q13.o).getValue()).f(this);
                throw th;
            }
        }
        ProcessPhoenix.b((Context) q13.b);
        ((sv0) ((Lazy) q13.o).getValue()).f(this);
    }
}
