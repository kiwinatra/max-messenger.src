package ru.ok.android.externcalls.sdk.id.mapping;

import android.net.Uri;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.ExternalIdsResponse;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@SourceDebugExtension({"SMAP\nInternalToExternalIdsMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalToExternalIdsMapper.kt\nru/ok/android/externcalls/sdk/id/mapping/InternalToExternalIdsMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,78:1\n1549#2:79\n1620#2,3:80\n526#3:83\n511#3,6:84\n*S KotlinDebug\n*F\n+ 1 InternalToExternalIdsMapper.kt\nru/ok/android/externcalls/sdk/id/mapping/InternalToExternalIdsMapper\n*L\n51#1:79\n51#1:80,3\n71#1:83\n71#1:84,6\n*E\n"})
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\b\u0000\u0018\u0000 &2\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0001:\u0001&B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u00110\u00102\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u00112\u0010\u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00122\u001a\u0010\u001b\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010!\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050 2\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u000eH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%¨\u0006'"}, d2 = {"Lru/ok/android/externcalls/sdk/id/mapping/InternalToExternalIdsMapper;", "Lru/ok/android/externcalls/sdk/id/mapping/IdsMapper;", "Lue1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "Lnla;", "okApi", "Lte1;", "callParams", "Lvoc;", "logger", "<init>", "(Lnla;Lte1;Lvoc;)V", "", "resolutionCandidates", "", "Lsl0;", "Lru/ok/android/externcalls/sdk/api/ExternalIdsResponse;", "kotlin.jvm.PlatformType", "getBatchedExternalsRequest", "(Ljava/util/Collection;)Ljava/util/List;", "candidates", "getResolveExternalRequestForCandidates", "(Ljava/util/List;)Lsl0;", "response", "", "idsMap", "", "applyExternals", "(Lru/ok/android/externcalls/sdk/api/ExternalIdsResponse;Ljava/util/Map;)V", "from", "", "map", "(Ljava/util/Collection;)Ljava/util/Map;", "Lnla;", "Lte1;", "Lvoc;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class InternalToExternalIdsMapper implements IdsMapper<ue1, ParticipantId> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int MAX_RESOLUTION_CANDIDATES_PER_REQUEST = 200;
    private final te1 callParams;
    private final voc logger;
    private final nla okApi;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/id/mapping/InternalToExternalIdsMapper$Companion;", "", "()V", "MAX_RESOLUTION_CANDIDATES_PER_REQUEST", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public InternalToExternalIdsMapper(nla nla, te1 te1, voc voc) {
        this.okApi = nla;
        this.callParams = te1;
        this.logger = voc;
    }

    private final void applyExternals(ExternalIdsResponse externalIdsResponse, Map<ue1, ParticipantId> map) {
        if (externalIdsResponse != null) {
            Map<ue1, ParticipantId> mapping = externalIdsResponse.getMapping();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : mapping.entrySet()) {
                if (!(next.getKey() == null || next.getValue() == null)) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            map.putAll(linkedHashMap);
        }
    }

    private final List<sl0> getBatchedExternalsRequest(Collection<ue1> collection) {
        Iterable<List> chunked = CollectionsKt.chunked(collection, 200);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(chunked, 10));
        for (List resolveExternalRequestForCandidates : chunked) {
            arrayList.add(getResolveExternalRequestForCandidates(resolveExternalRequestForCandidates));
        }
        return arrayList;
    }

    private final sl0 getResolveExternalRequestForCandidates(List<ue1> list) {
        rl0 y = hsg.y("vchat.getExternalIdsByOkIds");
        y.b = mm.c;
        y.c.a(new dye(ApiProtocol.PARAM_UIDS, CollectionsKt___CollectionsKt.joinToString$default(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, InternalToExternalIdsMapper$getResolveExternalRequestForCandidates$1.INSTANCE, 30, (Object) null)));
        return y.a(ExternalIdsResponse.INSTANCE);
    }

    public Map<ue1, ParticipantId> map(Collection<ue1> collection) {
        boolean z = ur9.a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Background thread expected");
        } else if (collection.isEmpty()) {
            return MapsKt.emptyMap();
        } else {
            List<sl0> batchedExternalsRequest = getBatchedExternalsRequest(collection);
            Uri uri = bm0.v;
            ArrayList arrayList = new ArrayList();
            for (sl0 next : batchedExternalsRequest) {
                arrayList.add(new km(next, next));
            }
            cm0 cm0 = (cm0) RetryKt.retryApiCallForFastWorkRequired(this.okApi.c().a(new bm0((String) null, (km[]) arrayList.toArray(new km[0]), 0)), this.callParams.B.h, this.logger).f();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (sl0 a : batchedExternalsRequest) {
                applyExternals((ExternalIdsResponse) cm0.a(a), linkedHashMap);
            }
            return linkedHashMap;
        }
    }
}
