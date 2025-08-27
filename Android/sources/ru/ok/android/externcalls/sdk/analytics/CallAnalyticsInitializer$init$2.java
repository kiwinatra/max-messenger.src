package ru.ok.android.externcalls.sdk.analytics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class CallAnalyticsInitializer$init$2 extends Lambda implements Function0<Integer> {
    final /* synthetic */ Function0<ConversationAnalyticsUploadConfig> $uploadConfig;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallAnalyticsInitializer$init$2(Function0<ConversationAnalyticsUploadConfig> function0) {
        super(0);
        this.$uploadConfig = function0;
    }

    public final Integer invoke() {
        ConversationAnalyticsUploadConfig invoke = this.$uploadConfig.invoke();
        if (invoke != null) {
            return Integer.valueOf(invoke.getMaxLocalFileSizeKb());
        }
        return null;
    }
}
