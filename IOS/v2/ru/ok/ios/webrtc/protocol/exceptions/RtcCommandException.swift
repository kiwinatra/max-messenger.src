package ru.ok.android.webrtc.protocol.exceptions;

import ru.ok.android.webrtc.protocol.RtcException;

public class RtcCommandException extends RtcException {
    public final Long a;
    public final boolean b;

    public RtcCommandException(Long l, boolean z, Throwable th) {
        super(th);
        this.a = l;
        this.b = z;
    }
}
