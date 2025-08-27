package ru.ok.android.externcalls.sdk.stat.supportedcodecs;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsApiRequest;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012 \u0005*\b\u0018\u00010\u0003R\u00020\u00040\u0003R\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ok/android/externcalls/sdk/stat/supportedcodecs/SupportedCodecsApiRequest$Response;", "Lru/ok/android/externcalls/sdk/stat/supportedcodecs/SupportedCodecsApiRequest;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class SupportedCodecsStatistics$tryToReport$1<T> implements qk3 {
    final /* synthetic */ long $currentTime;
    final /* synthetic */ gtb $preferencesHelper;
    final /* synthetic */ voc $rtcLog;

    public SupportedCodecsStatistics$tryToReport$1(voc voc, gtb gtb, long j) {
        this.$rtcLog = voc;
        this.$preferencesHelper = gtb;
        this.$currentTime = j;
    }

    public final void accept(SupportedCodecsApiRequest.Response response) {
        voc voc = this.$rtcLog;
        boolean success = response.getSuccess();
        voc.log("SupportedCodecsStatistics", "Supported codecs are sent with success=" + success);
        if (response.getSuccess()) {
            gtb gtb = this.$preferencesHelper;
            gtb.a.edit().putLong("supportedCodecsLastUpdate", this.$currentTime).apply();
        }
    }
}
