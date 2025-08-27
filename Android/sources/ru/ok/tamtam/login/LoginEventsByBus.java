package ru.ok.tamtam.login;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/tamtam/login/LoginEventsByBus;", "Lx88;", "Lw88;", "event", "", "onEvent", "(Lw88;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
final class LoginEventsByBus implements x88 {
    public final n6e a = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 b;

    public LoginEventsByBus(sv0 sv0, gaf gaf) {
        this.b = e14.a(((osa) gaf).c().t0());
        sv0.d(this);
    }

    @oye
    @Keep
    public final void onEvent(w88 w88) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new a(this, w88, (Continuation) null), 3);
    }

    public final dtc stream() {
        return new dtc(this.a);
    }
}
