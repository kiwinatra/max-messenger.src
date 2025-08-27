package ru.ok.android.externcalls.sdk.feature.internal.listener;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/internal/listener/ConversationFeatureListeners;", "", "Ll51;", "feature", "Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager$FeatureListener;", "listener", "", "addFeatureListener", "(Ll51;Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager$FeatureListener;)V", "removeFeatureListener", "", "isFeatureEnabled", "(Ll51;)Z", "Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "getFeatureRoles", "(Ll51;)Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface ConversationFeatureListeners {
    void addFeatureListener(l51 l51, ConversationFeatureManager.FeatureListener featureListener);

    FeatureRoles getFeatureRoles(l51 l51);

    boolean isFeatureEnabled(l51 l51);

    void removeFeatureListener(l51 l51, ConversationFeatureManager.FeatureListener featureListener);
}
