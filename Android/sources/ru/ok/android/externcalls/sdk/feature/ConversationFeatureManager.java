package ru.ok.android.externcalls.sdk.feature;

import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\u001cJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJA\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fH&¢\u0006\u0004\b\u000f\u0010\u0010JO\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fH&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001a\u0010\u001bø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager;", "", "Ll51;", "feature", "Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager$FeatureListener;", "listener", "", "addFeatureListener", "(Ll51;Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager$FeatureListener;)V", "removeFeatureListener", "Lkotlin/Function0;", "onComplete", "Lkotlin/Function1;", "", "onError", "enableFeatureForAll", "(Ll51;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "", "Lxe1;", "roles", "enableFeatureForRoles", "(Ll51;Ljava/util/Set;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "", "isFeatureEnabled", "(Ll51;)Z", "Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "getFeatureRoles", "(Ll51;)Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "FeatureListener", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface ConversationFeatureManager {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager$FeatureListener;", "", "Ll51;", "feature", "", "isEnabled", "", "onFeatureEnabledChanged", "(Ll51;Z)V", "Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "roles", "onFeatureRolesChanged", "(Ll51;Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public interface FeatureListener {
        void onFeatureEnabledChanged(l51 l51, boolean z) {
        }

        void onFeatureRolesChanged(l51 l51, FeatureRoles featureRoles) {
        }
    }

    static /* synthetic */ void enableFeatureForAll$default(ConversationFeatureManager conversationFeatureManager, l51 l51, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                function0 = null;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            conversationFeatureManager.enableFeatureForAll(l51, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enableFeatureForAll");
    }

    static /* synthetic */ void enableFeatureForRoles$default(ConversationFeatureManager conversationFeatureManager, l51 l51, Set set, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                function0 = null;
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            conversationFeatureManager.enableFeatureForRoles(l51, set, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enableFeatureForRoles");
    }

    void addFeatureListener(l51 l51, FeatureListener featureListener);

    void enableFeatureForAll(l51 l51, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void enableFeatureForRoles(l51 l51, Set<? extends xe1> set, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    FeatureRoles getFeatureRoles(l51 l51);

    boolean isFeatureEnabled(l51 l51);

    void removeFeatureListener(l51 l51, FeatureListener featureListener);
}
