package ru.ok.android.externcalls.sdk.id.local;

import android.util.LongSparseArray;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.ConversationParticipantExtensionsKt;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\b\u001a\u0004\u0018\u00010\u00072\n\u0010\u0006\u001a\u00060\u000ej\u0002`\u000f¢\u0006\u0004\b\b\u0010\u0010J\u001b\u0010\n\u001a\u0004\u0018\u00010\u00072\n\u0010\u0006\u001a\u00060\u000ej\u0002`\u000f¢\u0006\u0004\b\n\u0010\u0010J\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\n\u0010\u0006\u001a\u00060\u000ej\u0002`\u000f¢\u0006\u0004\b\f\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0016J!\u0010\u0019\u001a\u00020\u00142\n\u0010\u0018\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aR8\u0010\u001d\u001a&\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00070\u001bj\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u0007`\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR8\u0010\u001f\u001a&\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0012\u0004\u0012\u00020\u00070\u001bj\u0012\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0012\u0004\u0012\u00020\u0007`\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070!0 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R<\u0010%\u001a*\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070!0\u001bj\u0014\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070!`\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001e¨\u0006&"}, d2 = {"Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;", "", "<init>", "()V", "Lue1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "id", "Lru/ok/android/externcalls/sdk/id/local/LocalParticipantId;", "getLocalId", "(Lue1;)Lru/ok/android/externcalls/sdk/id/local/LocalParticipantId;", "getAnyLocalId", "", "getAllLocalIds", "(Lue1;)Ljava/util/Set;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lru/ok/android/externcalls/sdk/id/local/LocalParticipantId;", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Ljava/util/Set;", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "participant", "", "addMappings", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)V", "removedMappings", "oldExternalId", "deAnonymizeMapping", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lru/ok/android/externcalls/sdk/ConversationParticipant;)V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "internalToLocalIdMap", "Ljava/util/HashMap;", "externalToLocalIdMap", "Landroid/util/LongSparseArray;", "", "internalIdToLocalIdsMap", "Landroid/util/LongSparseArray;", "", "externalIdToLocalIdsMap", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLocalIdMappings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalIdMappings.kt\nru/ok/android/externcalls/sdk/id/local/LocalIdMappings\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,101:1\n372#2,7:102\n*S KotlinDebug\n*F\n+ 1 LocalIdMappings.kt\nru/ok/android/externcalls/sdk/id/local/LocalIdMappings\n*L\n63#1:102,7\n*E\n"})
public final class LocalIdMappings {
    private final HashMap<String, Set<LocalParticipantId>> externalIdToLocalIdsMap = new HashMap<>();
    private final HashMap<ParticipantId, LocalParticipantId> externalToLocalIdMap = new HashMap<>();
    private final LongSparseArray<Set<LocalParticipantId>> internalIdToLocalIdsMap = new LongSparseArray<>();
    private final HashMap<ue1, LocalParticipantId> internalToLocalIdMap = new HashMap<>();

    public final void addMappings(ConversationParticipant conversationParticipant) {
        ue1 ue1;
        LocalParticipantId localParticipantIdExt = ConversationParticipantExtensionsKt.getLocalParticipantIdExt(conversationParticipant);
        ye1 callParticipant = conversationParticipant.getCallParticipant();
        if (!(callParticipant == null || (ue1 = callParticipant.a) == null)) {
            this.internalToLocalIdMap.put(ue1, localParticipantIdExt);
            LongSparseArray<Set<LocalParticipantId>> longSparseArray = this.internalIdToLocalIdsMap;
            long j = ue1.a;
            Set set = longSparseArray.get(j);
            if (set == null) {
                set = new LinkedHashSet();
                this.internalIdToLocalIdsMap.put(j, set);
            }
            set.add(localParticipantIdExt);
        }
        ParticipantId externalId = conversationParticipant.getExternalId();
        if (externalId != null) {
            this.externalToLocalIdMap.put(externalId, localParticipantIdExt);
            HashMap<String, Set<LocalParticipantId>> hashMap = this.externalIdToLocalIdsMap;
            String str = externalId.id;
            Set<LocalParticipantId> set2 = hashMap.get(str);
            if (set2 == null) {
                set2 = new LinkedHashSet<>();
                hashMap.put(str, set2);
            }
            set2.add(localParticipantIdExt);
        }
    }

    public final void deAnonymizeMapping(ParticipantId participantId, ConversationParticipant conversationParticipant) {
        this.externalToLocalIdMap.remove(participantId);
        this.externalIdToLocalIdsMap.remove(participantId.id);
        addMappings(conversationParticipant);
    }

    public final Set<LocalParticipantId> getAllLocalIds(ue1 ue1) {
        Set<LocalParticipantId> set = this.internalIdToLocalIdsMap.get(ue1.a);
        return set == null ? SetsKt.emptySet() : set;
    }

    public final LocalParticipantId getAnyLocalId(ue1 ue1) {
        Set set = this.internalIdToLocalIdsMap.get(ue1.a);
        if (set != null) {
            return (LocalParticipantId) CollectionsKt.firstOrNull(set);
        }
        return null;
    }

    public final LocalParticipantId getLocalId(ue1 ue1) {
        return this.internalToLocalIdMap.get(ue1);
    }

    public final void removedMappings(ConversationParticipant conversationParticipant) {
        ue1 ue1;
        LocalParticipantId localParticipantIdExt = ConversationParticipantExtensionsKt.getLocalParticipantIdExt(conversationParticipant);
        ye1 callParticipant = conversationParticipant.getCallParticipant();
        if (!(callParticipant == null || (ue1 = callParticipant.a) == null)) {
            this.internalToLocalIdMap.remove(ue1);
            LongSparseArray<Set<LocalParticipantId>> longSparseArray = this.internalIdToLocalIdsMap;
            long j = ue1.a;
            Set set = longSparseArray.get(j);
            if (set != null) {
                set.remove(localParticipantIdExt);
                if (set.isEmpty()) {
                    this.internalIdToLocalIdsMap.remove(j);
                }
            }
        }
        ParticipantId externalId = conversationParticipant.getExternalId();
        if (externalId != null) {
            this.externalToLocalIdMap.remove(externalId);
            String str = externalId.id;
            Set set2 = this.externalIdToLocalIdsMap.get(str);
            if (set2 != null) {
                set2.remove(localParticipantIdExt);
                if (set2.isEmpty()) {
                    this.externalIdToLocalIdsMap.remove(str);
                }
            }
        }
    }

    public final Set<LocalParticipantId> getAllLocalIds(ParticipantId participantId) {
        Set<LocalParticipantId> set = this.externalIdToLocalIdsMap.get(participantId.id);
        return set == null ? SetsKt.emptySet() : set;
    }

    public final LocalParticipantId getAnyLocalId(ParticipantId participantId) {
        Set set = this.externalIdToLocalIdsMap.get(participantId.id);
        if (set != null) {
            return (LocalParticipantId) CollectionsKt.firstOrNull(set);
        }
        return null;
    }

    public final LocalParticipantId getLocalId(ParticipantId participantId) {
        return this.externalToLocalIdMap.get(participantId);
    }
}
