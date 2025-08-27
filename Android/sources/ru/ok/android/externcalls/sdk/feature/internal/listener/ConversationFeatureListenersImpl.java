package ru.ok.android.externcalls.sdk.feature.internal.listener;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0013\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%R&\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160'0&8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ok/android/externcalls/sdk/feature/internal/listener/ConversationFeatureListenersImpl;", "Lru/ok/android/externcalls/sdk/feature/internal/listener/ConversationFeatureListeners;", "<init>", "()V", "Lp51;", "event", "", "Ll51;", "Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "getFeaturesRolesMap", "(Lp51;)Ljava/util/Map;", "", "oldFeatures", "newFeatures", "", "notifyListenersWithNewEnabledFeatures", "(Ljava/util/Set;Ljava/util/Set;)V", "oldFeatureRolesMap", "newFeatureRolesMap", "notifyListenersWithNewFeaturesRoles", "(Ljava/util/Map;Ljava/util/Map;)V", "feature", "Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager$FeatureListener;", "listener", "notifyNewListener", "(Ll51;Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager$FeatureListener;)V", "addFeatureListener", "removeFeatureListener", "", "isFeatureEnabled", "(Ll51;)Z", "getFeatureRoles", "(Ll51;)Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "Lo51;", "onFeatureSetChanged", "(Lo51;)V", "onFeaturesPerRoleChanged", "(Lp51;)V", "Ljava/util/EnumMap;", "", "listenersMap", "Ljava/util/EnumMap;", "enabledFeatureSet", "Ljava/util/Set;", "featureRolesMap", "Ljava/util/Map;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nConversationFeatureListenersImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationFeatureListenersImpl.kt\nru/ok/android/externcalls/sdk/feature/internal/listener/ConversationFeatureListenersImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n372#2,7:108\n1#3:115\n1855#4:116\n1855#4,2:117\n1856#4:119\n1855#4:120\n1855#4,2:121\n1856#4:123\n1855#4,2:124\n*S KotlinDebug\n*F\n+ 1 ConversationFeatureListenersImpl.kt\nru/ok/android/externcalls/sdk/feature/internal/listener/ConversationFeatureListenersImpl\n*L\n17#1:108,7\n74#1:116\n75#1:117,2\n74#1:119\n81#1:120\n82#1:121,2\n81#1:123\n94#1:124,2\n*E\n"})
public final class ConversationFeatureListenersImpl implements ConversationFeatureListeners {
    private Set<? extends l51> enabledFeatureSet = SetsKt.emptySet();
    private Map<l51, ? extends FeatureRoles> featureRolesMap = MapsKt.emptyMap();
    private final EnumMap<l51, Set<ConversationFeatureManager.FeatureListener>> listenersMap = new EnumMap<>(l51.class);

    private final Map<l51, FeatureRoles> getFeaturesRolesMap(p51 p51) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (l51 l51 : l51.values()) {
            Set set = (Set) p51.a.get(l51);
            if (set == null || set.isEmpty()) {
                linkedHashMap.put(l51, FeatureRoles.EnabledForAll.INSTANCE);
            } else {
                linkedHashMap.put(l51, new FeatureRoles.EnabledForRoles(set));
            }
        }
        return linkedHashMap;
    }

    private final void notifyListenersWithNewEnabledFeatures(Set<? extends l51> set, Set<? extends l51> set2) {
        for (T t : SetsKt.minus(set, set2)) {
            Set<ConversationFeatureManager.FeatureListener> set3 = this.listenersMap.get(t);
            if (set3 != null) {
                for (ConversationFeatureManager.FeatureListener onFeatureEnabledChanged : set3) {
                    onFeatureEnabledChanged.onFeatureEnabledChanged(t, false);
                }
            }
        }
        for (T t2 : SetsKt.minus(set2, set)) {
            Set<ConversationFeatureManager.FeatureListener> set4 = this.listenersMap.get(t2);
            if (set4 != null) {
                for (ConversationFeatureManager.FeatureListener onFeatureEnabledChanged2 : set4) {
                    onFeatureEnabledChanged2.onFeatureEnabledChanged(t2, true);
                }
            }
        }
    }

    private final void notifyListenersWithNewFeaturesRoles(Map<l51, ? extends FeatureRoles> map, Map<l51, ? extends FeatureRoles> map2) {
        Set<ConversationFeatureManager.FeatureListener> set;
        for (T t : SetsKt.plus(map.keySet(), map2.keySet())) {
            if (!Intrinsics.areEqual((Object) map.get(t), (Object) map2.get(t)) && (set = this.listenersMap.get(t)) != null) {
                for (ConversationFeatureManager.FeatureListener featureListener : set) {
                    FeatureRoles.Companion companion = FeatureRoles.Companion;
                    Object obj = map2.get(t);
                    if (obj == null) {
                        obj = companion.createDisabledForAll();
                    }
                    featureListener.onFeatureRolesChanged(t, (FeatureRoles) obj);
                }
            }
        }
    }

    private final void notifyNewListener(l51 l51, ConversationFeatureManager.FeatureListener featureListener) {
        featureListener.onFeatureEnabledChanged(l51, isFeatureEnabled(l51));
        featureListener.onFeatureRolesChanged(l51, getFeatureRoles(l51));
    }

    public void addFeatureListener(l51 l51, ConversationFeatureManager.FeatureListener featureListener) {
        EnumMap<l51, Set<ConversationFeatureManager.FeatureListener>> enumMap = this.listenersMap;
        Set<ConversationFeatureManager.FeatureListener> set = enumMap.get(l51);
        if (set == null) {
            set = new HashSet<>();
            enumMap.put(l51, set);
        }
        set.add(featureListener);
        notifyNewListener(l51, featureListener);
    }

    public FeatureRoles getFeatureRoles(l51 l51) {
        Map<l51, ? extends FeatureRoles> map = this.featureRolesMap;
        FeatureRoles.Companion companion = FeatureRoles.Companion;
        Object obj = map.get(l51);
        if (obj == null) {
            obj = companion.createDisabledForAll();
        }
        return (FeatureRoles) obj;
    }

    public boolean isFeatureEnabled(l51 l51) {
        return this.enabledFeatureSet.contains(l51);
    }

    public final void onFeatureSetChanged(o51 o51) {
        Set<? extends l51> set = o51.a;
        notifyListenersWithNewEnabledFeatures(this.enabledFeatureSet, set);
        this.enabledFeatureSet = set;
    }

    public final void onFeaturesPerRoleChanged(p51 p51) {
        Map<l51, FeatureRoles> featuresRolesMap = getFeaturesRolesMap(p51);
        notifyListenersWithNewFeaturesRoles(this.featureRolesMap, featuresRolesMap);
        this.featureRolesMap = featuresRolesMap;
    }

    public void removeFeatureListener(l51 l51, ConversationFeatureManager.FeatureListener featureListener) {
        Set set = this.listenersMap.get(l51);
        if (set != null) {
            set.remove(featureListener);
        }
    }
}
