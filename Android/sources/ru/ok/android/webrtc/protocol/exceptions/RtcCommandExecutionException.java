package ru.ok.android.webrtc.protocol.exceptions;

import java.util.HashMap;
import java.util.Map;

public class RtcCommandExecutionException extends RtcCommandException {
    public final Map c;

    public RtcCommandExecutionException(Long l, boolean z, HashMap hashMap) {
        super(l, z, (Throwable) null);
    }
}
