package ru.ok.android.externcalls.sdk.api.retry;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class RetryKt$retryApiWithBackoff$3 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ voc $logger;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RetryKt$retryApiWithBackoff$3(voc voc) {
        super(1);
        this.$logger = voc;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Throwable th) {
        voc voc = this.$logger;
        voc.log("CallsApiRetry", "retry failed with last exception " + th);
    }
}
