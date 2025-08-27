package ru.ok.android.externcalls.sdk.feature;

import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutor;
import ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListeners;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J>\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011JL\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0019\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u001f\u0010 J \u0010!\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006$"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManagerImpl;", "Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager;", "Lru/ok/android/externcalls/sdk/feature/internal/commands/ConversationFeatureCommandExecutor;", "Lru/ok/android/externcalls/sdk/feature/internal/listener/ConversationFeatureListeners;", "commandExecutor", "featureListeners", "<init>", "(Lru/ok/android/externcalls/sdk/feature/internal/commands/ConversationFeatureCommandExecutor;Lru/ok/android/externcalls/sdk/feature/internal/listener/ConversationFeatureListeners;)V", "Ll51;", "feature", "Lkotlin/Function0;", "", "onComplete", "Lkotlin/Function1;", "", "onError", "enableFeatureForAll", "(Ll51;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "", "Lxe1;", "roles", "enableFeatureForRoles", "(Ll51;Ljava/util/Set;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager$FeatureListener;", "listener", "addFeatureListener", "(Ll51;Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager$FeatureListener;)V", "Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "getFeatureRoles", "(Ll51;)Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "", "isFeatureEnabled", "(Ll51;)Z", "removeFeatureListener", "Lru/ok/android/externcalls/sdk/feature/internal/commands/ConversationFeatureCommandExecutor;", "Lru/ok/android/externcalls/sdk/feature/internal/listener/ConversationFeatureListeners;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class ConversationFeatureManagerImpl implements ConversationFeatureManager, ConversationFeatureCommandExecutor, ConversationFeatureListeners {
    private final ConversationFeatureCommandExecutor commandExecutor;
    private final ConversationFeatureListeners featureListeners;

    public ConversationFeatureManagerImpl(ConversationFeatureCommandExecutor conversationFeatureCommandExecutor, ConversationFeatureListeners conversationFeatureListeners) {
        this.commandExecutor = conversationFeatureCommandExecutor;
        this.featureListeners = conversationFeatureListeners;
    }

    public void addFeatureListener(l51 l51, ConversationFeatureManager.FeatureListener featureListener) {
        this.featureListeners.addFeatureListener(l51, featureListener);
    }

    public void enableFeatureForAll(l51 l51, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        this.commandExecutor.enableFeatureForAll(l51, function0, function1);
    }

    public void enableFeatureForRoles(l51 l51, Set<? extends xe1> set, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        this.commandExecutor.enableFeatureForRoles(l51, set, function0, function1);
    }

    public FeatureRoles getFeatureRoles(l51 l51) {
        return this.featureListeners.getFeatureRoles(l51);
    }

    public boolean isFeatureEnabled(l51 l51) {
        return this.featureListeners.isFeatureEnabled(l51);
    }

    public void removeFeatureListener(l51 l51, ConversationFeatureManager.FeatureListener featureListener) {
        this.featureListeners.removeFeatureListener(l51, featureListener);
    }
}
