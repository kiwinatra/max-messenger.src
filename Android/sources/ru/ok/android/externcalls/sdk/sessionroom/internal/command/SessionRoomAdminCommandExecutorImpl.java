package ru.ok.android.externcalls.sdk.sessionroom.internal.command;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.admin.AssignParticipantsToRoomsParams;
import ru.ok.android.externcalls.sdk.sessionroom.admin.MoveParticipantParams;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJg\u0010\u0014\u001a\u00020\u00132\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u000e\u0012\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000b0\t2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u000e\u0012\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000b0\t2\u001a\u0010\u0012\u001a\u0016\u0012\b\u0012\u00060\fj\u0002`\r\u0012\b\u0012\u00060\u0010j\u0002`\u00110\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ=\u0010!\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020 2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b!\u0010\"J=\u0010$\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020#2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b$\u0010%J=\u0010&\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00132\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b&\u0010'J=\u0010)\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020(2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b)\u0010*J=\u0010,\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020+2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/¨\u00060"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomAdminCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomCommandExecutorBase;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomAdminCommandExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;", "participantDataProvider", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;)V", "", "Lywd;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "addToRooms", "removeFromRooms", "Lue1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "externalToInternalIdsMap", "Lwwf;", "buildUpdateRoomsParams", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lwwf;", "Le8;", "params", "Lkotlin/Function0;", "", "onSuccess", "Lkotlin/Function1;", "", "onError", "activateRooms", "(Le8;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Ln1d;", "removeRooms", "(Ln1d;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lk6f;", "switchRoom", "(Lk6f;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "updateRooms", "(Lwwf;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;", "assignParticipantsToRooms", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;", "moveParticipant", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSessionRoomAdminCommandExecutorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionRoomAdminCommandExecutorImpl.kt\nru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomAdminCommandExecutorImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,155:1\n372#2,7:156\n372#2,7:163\n1549#3:170\n1620#3,3:171\n*S KotlinDebug\n*F\n+ 1 SessionRoomAdminCommandExecutorImpl.kt\nru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomAdminCommandExecutorImpl\n*L\n126#1:156,7\n136#1:163,7\n143#1:170\n143#1:171,3\n*E\n"})
public final class SessionRoomAdminCommandExecutorImpl extends SessionRoomCommandExecutorBase implements SessionRoomAdminCommandExecutor {
    private final SessionRoomParticipantsDataProviderImpl participantDataProvider;
    private final SignalingProvider signalingProvider;

    public SessionRoomAdminCommandExecutorImpl(SignalingProvider signalingProvider2, SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl) {
        this.signalingProvider = signalingProvider2;
        this.participantDataProvider = sessionRoomParticipantsDataProviderImpl;
    }

    /* access modifiers changed from: private */
    public static final void activateRooms$lambda$0(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void activateRooms$lambda$1(SessionRoomAdminCommandExecutorImpl sessionRoomAdminCommandExecutorImpl, Function1 function1, JSONObject jSONObject) {
        sessionRoomAdminCommandExecutorImpl.parseErrorResponse("activateRooms", jSONObject, function1);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [uwf, java.lang.Object] */
    private final wwf buildUpdateRoomsParams(Map<ywd, ? extends List<ParticipantId>> map, Map<ywd, ? extends List<ParticipantId>> map2, Map<ParticipantId, ue1> map3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashSet<ywd> linkedHashSet = new LinkedHashSet<>();
        for (Map.Entry next : map.entrySet()) {
            linkedHashSet.add(next.getKey());
            for (ParticipantId participantId : (List) next.getValue()) {
                ue1 ue1 = map3.get(participantId);
                if (ue1 != null) {
                    Object key = next.getKey();
                    Object obj = linkedHashMap.get(key);
                    if (obj == null) {
                        obj = tr1.q(linkedHashMap, key);
                    }
                    ((List) obj).add(ue1);
                }
            }
        }
        for (Map.Entry next2 : map2.entrySet()) {
            linkedHashSet.add(next2.getKey());
            for (ParticipantId participantId2 : (List) next2.getValue()) {
                ue1 ue12 = map3.get(participantId2);
                if (ue12 != null) {
                    Object key2 = next2.getKey();
                    Object obj2 = linkedHashMap2.get(key2);
                    if (obj2 == null) {
                        obj2 = tr1.q(linkedHashMap2, key2);
                    }
                    ((List) obj2).add(ue12);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(linkedHashSet, 10));
        for (ywd ywd : linkedHashSet) {
            ? obj3 = new Object();
            obj3.a = ywd;
            Collection collection = (List) linkedHashMap.get(ywd);
            if (collection != null) {
                obj3.b = collection;
            }
            Collection collection2 = (List) linkedHashMap2.get(ywd);
            if (collection2 != null) {
                obj3.c = collection2;
            }
            arrayList2.add(obj3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            uwf uwf = (uwf) it.next();
            arrayList3.add(new vwf(uwf.a, uwf.b, uwf.c));
        }
        return new wwf(arrayList3);
    }

    /* access modifiers changed from: private */
    public static final void removeRooms$lambda$2(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void removeRooms$lambda$3(SessionRoomAdminCommandExecutorImpl sessionRoomAdminCommandExecutorImpl, Function1 function1, JSONObject jSONObject) {
        sessionRoomAdminCommandExecutorImpl.parseErrorResponse("removeRooms", jSONObject, function1);
    }

    /* access modifiers changed from: private */
    public static final void switchRoom$lambda$4(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void switchRoom$lambda$5(SessionRoomAdminCommandExecutorImpl sessionRoomAdminCommandExecutorImpl, Function1 function1, JSONObject jSONObject) {
        sessionRoomAdminCommandExecutorImpl.parseErrorResponse("switchRoom", jSONObject, function1);
    }

    /* access modifiers changed from: private */
    public static final void updateRooms$lambda$6(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void updateRooms$lambda$7(SessionRoomAdminCommandExecutorImpl sessionRoomAdminCommandExecutorImpl, Function1 function1, JSONObject jSONObject) {
        sessionRoomAdminCommandExecutorImpl.parseErrorResponse("updateRooms", jSONObject, function1);
    }

    public void activateRooms(e8 e8Var, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        o9e o9e = SignalingProviderKt.get(this.signalingProvider, function1);
        if (o9e != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "activate-rooms");
            o9e.d(new rp6(jSONObject), false, new jt(13, function0), new uwd(this, function1, 3));
        }
    }

    public void assignParticipantsToRooms(AssignParticipantsToRoomsParams assignParticipantsToRoomsParams, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(CollectionsKt.flatten(assignParticipantsToRoomsParams.getAddParticipantsToRoomsMap().values()));
            linkedHashSet.addAll(CollectionsKt.flatten(assignParticipantsToRoomsParams.getRemoveParticipantsFromRoomsMap().values()));
            updateRooms(buildUpdateRoomsParams(assignParticipantsToRoomsParams.getAddParticipantsToRoomsMap(), assignParticipantsToRoomsParams.getRemoveParticipantsFromRoomsMap(), this.participantDataProvider.getInternalIdsByExternal(linkedHashSet)), function0, function1);
        } catch (Throwable th) {
            if (function1 != null) {
                function1.invoke(th);
            }
        }
    }

    public void moveParticipant(MoveParticipantParams moveParticipantParams, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        ParticipantId participantId = moveParticipantParams.getParticipantId();
        if (participantId != null) {
            this.participantDataProvider.resolveInternalIdByExternal(participantId, new SessionRoomAdminCommandExecutorImpl$moveParticipant$1(this, moveParticipantParams, function0, function1), function1);
            return;
        }
        zwd toRoomId = moveParticipantParams.getToRoomId();
        if (toRoomId != null) {
            switchRoom(new k6f((ue1) null, toRoomId), function0, function1);
            return;
        }
        throw new IllegalArgumentException("Session room id is required".toString());
    }

    public void removeRooms(n1d n1d, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        o9e o9e = SignalingProviderKt.get(this.signalingProvider, function1);
        if (o9e != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "remove-rooms");
            o9e.d(new rp6(jSONObject), false, new jt(10, function0), new uwd(this, function1, 0));
        }
    }

    public void switchRoom(k6f k6f, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        o9e o9e = SignalingProviderKt.get(this.signalingProvider, function1);
        if (o9e != null) {
            o9e.d(tf6.B(k6f), false, new jt(11, function0), new uwd(this, function1, 1));
        }
    }

    public void updateRooms(wwf wwf, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        rp6 rp6;
        o9e o9e = SignalingProviderKt.get(this.signalingProvider, function1);
        if (o9e != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "update-rooms");
            if (wwf == null) {
                rp6 = new rp6(jSONObject);
            } else {
                Collection<vwf> collection = wwf.a;
                if (collection == null) {
                    rp6 = new rp6(jSONObject);
                } else {
                    JSONArray jSONArray = new JSONArray();
                    for (vwf vwf : collection) {
                        JSONObject jSONObject2 = new JSONObject();
                        ywd ywd = vwf.a;
                        if (ywd != null) {
                            jSONObject2.put("id", ywd.a);
                        }
                        Collection<ue1> collection2 = vwf.b;
                        if (collection2 != null) {
                            JSONArray jSONArray2 = new JSONArray();
                            for (ue1 c : collection2) {
                                jSONArray2.put((Object) c.c());
                            }
                            jSONObject2.put("addParticipantIds", (Object) jSONArray2);
                        }
                        Collection<ue1> collection3 = vwf.c;
                        if (collection3 != null) {
                            JSONArray jSONArray3 = new JSONArray();
                            for (ue1 c2 : collection3) {
                                jSONArray3.put((Object) c2.c());
                            }
                            jSONObject2.put("removeParticipantIds", (Object) jSONArray3);
                        }
                        jSONArray.put((Object) jSONObject2);
                    }
                    jSONObject.put("rooms", (Object) jSONArray);
                    rp6 = new rp6(jSONObject);
                }
            }
            o9e.d(rp6, false, new jt(12, function0), new uwd(this, function1, 2));
        }
    }
}
