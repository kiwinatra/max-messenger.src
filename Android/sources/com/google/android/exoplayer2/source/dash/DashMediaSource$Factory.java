package com.google.android.exoplayer2.source.dash;

import androidx.work.WorkRequest;

public final class DashMediaSource$Factory implements kz8 {
    public final grg a;
    public final f74 b;
    public final ata c = new ata(10);
    public final o9a d = new o9a(10);
    public final gga e = new gga(10);
    public final long f = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;

    public DashMediaSource$Factory(f74 f74) {
        this.a = new grg(15, f74);
        this.b = f74;
    }
}
