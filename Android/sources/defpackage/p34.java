package defpackage;

import android.app.Application;
import android.os.Bundle;
import ru.ok.messages.channels.CreateChannelViewModel;

/* renamed from: p34  reason: default package */
public final class p34 extends i3 {
    public final Application d;
    public final ln5 e;
    public final m95 f;
    public final bud g;
    public final gaf h;

    public p34(Application application, odd odd, po5 po5, m95 m95, bud bud, gaf gaf) {
        super(odd, (Bundle) null);
        this.d = application;
        this.e = po5;
        this.f = m95;
        this.g = bud;
        this.h = gaf;
    }

    public final yag e(hdd hdd) {
        return new CreateChannelViewModel(this.d, hdd, this.e, this.f, this.g, this.h);
    }
}
