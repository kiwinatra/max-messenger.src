package ru.ok.android.externcalls.sdk.analytics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsUploadConfig;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class CallAnalyticsInitializer$init$uploadConfig$1 extends Lambda implements Function0<ConversationAnalyticsUploadConfig> {
    final /* synthetic */ ConversationAnalyticsConfigurationImpl $analyticsConfiguration;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallAnalyticsInitializer$init$uploadConfig$1(ConversationAnalyticsConfigurationImpl conversationAnalyticsConfigurationImpl) {
        super(0);
        this.$analyticsConfiguration = conversationAnalyticsConfigurationImpl;
    }

    public final ConversationAnalyticsUploadConfig invoke() {
        UploadConfigProvider uploadConfigProvider = this.$analyticsConfiguration.getUploadConfigProvider();
        if (uploadConfigProvider != null) {
            return uploadConfigProvider.getUploadConfig();
        }
        return null;
    }
}
