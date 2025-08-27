package ru.ok.tamtam.logout;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/tamtam/logout/LogoutEventsByBus;", "Lru/ok/tamtam/logout/a;", "Lp98;", "event", "", "onEvent", "(Lp98;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
final class LogoutEventsByBus implements a {
    public final sv0 a;
    public final n6e b = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 c;

    public LogoutEventsByBus(sv0 sv0, gaf gaf) {
        this.a = sv0;
        this.c = e14.a(((osa) gaf).c());
        sv0.d(this);
    }

    public final void b() {
        this.a.c(new ij0());
    }

    @oye
    @Keep
    public final void onEvent(p98 p98) {
        ev0.v(this.c, (CoroutineContext) null, (f14) null, new b(this, p98, (Continuation) null), 3);
    }
}
