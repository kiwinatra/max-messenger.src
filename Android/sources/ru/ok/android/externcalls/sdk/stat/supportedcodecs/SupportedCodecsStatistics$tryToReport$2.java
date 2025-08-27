package ru.ok.android.externcalls.sdk.stat.supportedcodecs;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "accept"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class SupportedCodecsStatistics$tryToReport$2<T> implements qk3 {
    final /* synthetic */ voc $rtcLog;

    public SupportedCodecsStatistics$tryToReport$2(voc voc) {
        this.$rtcLog = voc;
    }

    public final void accept(Throwable th) {
        voc voc = this.$rtcLog;
        String message = th.getMessage();
        voc.log("SupportedCodecsStatistics", "Failed to send supported codecs with error: " + message);
    }
}
