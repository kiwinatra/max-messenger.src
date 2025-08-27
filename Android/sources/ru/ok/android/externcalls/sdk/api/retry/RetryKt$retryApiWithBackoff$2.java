package ru.ok.android.externcalls.sdk.api.retry;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "T", "", "throwable", "", "attempt", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class RetryKt$retryApiWithBackoff$2 extends Lambda implements Function2<Throwable, Integer, Unit> {
    final /* synthetic */ voc $logger;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RetryKt$retryApiWithBackoff$2(voc voc) {
        super(2);
        this.$logger = voc;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Throwable) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Throwable th, int i) {
        voc voc = this.$logger;
        voc.log("CallsApiRetry", "retry attempt " + i + " after " + th);
    }
}
