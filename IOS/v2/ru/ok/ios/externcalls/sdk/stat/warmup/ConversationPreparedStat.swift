package ru.ok.android.externcalls.sdk.stat.warmup;

import android.os.SystemClock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/warmup/ConversationPreparedStat;", "", "Lkotlin/Function0;", "Lc51;", "getEventualStatSender", "Lrjf;", "timeProvider", "<init>", "(Lkotlin/jvm/functions/Function0;Lrjf;)V", "", "report", "()V", "onConversationPrepared", "Lkotlin/jvm/functions/Function0;", "Lrjf;", "", "isReported", "Z", "", "startTimeMs", "J", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class ConversationPreparedStat {
    private final Function0<c51> getEventualStatSender;
    private boolean isReported;
    private final long startTimeMs = SystemClock.elapsedRealtime();
    private final rjf timeProvider;

    public ConversationPreparedStat(Function0<? extends c51> function0, rjf rjf) {
        this.getEventualStatSender = function0;
        this.timeProvider = rjf;
        ((sjf) rjf).getClass();
    }

    private final void report() {
        ((sjf) this.timeProvider).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.startTimeMs;
        c51 invoke = this.getEventualStatSender.invoke();
        if (invoke != null) {
            ((d51) invoke).c("call_warmup", EventItemValueKt.toEventItemValue(elapsedRealtime), new EventItemsMap());
        }
    }

    public final void onConversationPrepared() {
        if (!this.isReported) {
            this.isReported = true;
            report();
        }
    }
}
