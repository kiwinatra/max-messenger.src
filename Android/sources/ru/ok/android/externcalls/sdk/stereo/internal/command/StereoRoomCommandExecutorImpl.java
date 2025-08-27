package ru.ok.android.externcalls.sdk.stereo.internal.command;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;
import ru.ok.android.externcalls.sdk.stereo.exception.ParticipantNotFoundException;
import ru.ok.android.externcalls.sdk.stereo.exception.PromotedLimitExceeded;
import ru.ok.android.externcalls.sdk.stereo.exception.StereoRoomException;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00142\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00182\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00142\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00142\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJx\u0010(\u001a\u00020\u000e2Q\u0010\u0015\u001aM\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110#¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b($\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020&0%¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u000e0\u001e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+¨\u0006,"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lvoc;", "log", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lvoc;)V", "", "method", "Lorg/json/JSONObject;", "errorResponse", "Lkotlin/Function1;", "", "", "onError", "parseErrorResponse", "(Ljava/lang/String;Lorg/json/JSONObject;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$PromoteParticipantParams;", "params", "Lkotlin/Function0;", "onSuccess", "promoteParticipant", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$PromoteParticipantParams;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$RequestPromotionParams;", "requestPromotion", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$RequestPromotionParams;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$AcceptPromotionParams;", "acceptPromotion", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$AcceptPromotionParams;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "totalCount", "", "hasMore", "", "Lrn1;", "participantIds", "getHandsQueue", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lvoc;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nStereoRoomCommandExecutorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StereoRoomCommandExecutorImpl.kt\nru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutorImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n1549#2:98\n1620#2,3:99\n*S KotlinDebug\n*F\n+ 1 StereoRoomCommandExecutorImpl.kt\nru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutorImpl\n*L\n80#1:98\n80#1:99,3\n*E\n"})
public final class StereoRoomCommandExecutorImpl implements StereoRoomCommandExecutor {
    private final voc log;
    private final SignalingProvider signalingProvider;

    public StereoRoomCommandExecutorImpl(SignalingProvider signalingProvider2, voc voc) {
        this.signalingProvider = signalingProvider2;
        this.log = voc;
    }

    /* access modifiers changed from: private */
    public static final void acceptPromotion$lambda$4(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void acceptPromotion$lambda$5(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, Function1 function1, JSONObject jSONObject) {
        stereoRoomCommandExecutorImpl.parseErrorResponse("acceptPromotion", jSONObject, function1);
    }

    /* access modifiers changed from: private */
    public static final void getHandsQueue$lambda$8(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, Function1 function1, Function3 function3, JSONObject jSONObject) {
        xn1 a = new o60(stereoRoomCommandExecutorImpl.log).a(jSONObject);
        if (a != null) {
            Integer valueOf = Integer.valueOf(a.c);
            Boolean valueOf2 = Boolean.valueOf(a.b);
            Iterable<qn1> iterable = a.a;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (qn1 qn1 : iterable) {
                arrayList.add(qn1.a);
            }
            function3.invoke(valueOf, valueOf2, arrayList);
        } else if (function1 != null) {
            function1.invoke(new StereoRoomException("getHandsQueue: missing response", (Throwable) null, 2, (DefaultConstructorMarker) null));
        }
    }

    /* access modifiers changed from: private */
    public static final void getHandsQueue$lambda$9(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, Function1 function1, JSONObject jSONObject) {
        stereoRoomCommandExecutorImpl.parseErrorResponse("getHandQueue", jSONObject, function1);
    }

    private final void parseErrorResponse(String str, JSONObject jSONObject, Function1<? super Throwable, Unit> function1) {
        Object obj;
        String optString = jSONObject.optString("error");
        if (Intrinsics.areEqual((Object) optString, (Object) "chatRoom.partNotFound")) {
            obj = new ParticipantNotFoundException("Participant not found, " + str + " command " + jSONObject);
        } else if (Intrinsics.areEqual((Object) optString, (Object) "chatRoom.promotedLimit")) {
            obj = new PromotedLimitExceeded();
        } else {
            obj = new StereoRoomException("Error response for " + str + " command " + jSONObject, (Throwable) null, 2, (DefaultConstructorMarker) null);
        }
        if (function1 != null) {
            function1.invoke(obj);
        }
    }

    /* access modifiers changed from: private */
    public static final void promoteParticipant$lambda$0(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void promoteParticipant$lambda$1(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, Function1 function1, JSONObject jSONObject) {
        stereoRoomCommandExecutorImpl.parseErrorResponse("promoteParticipant", jSONObject, function1);
    }

    /* access modifiers changed from: private */
    public static final void requestPromotion$lambda$2(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void requestPromotion$lambda$3(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, Function1 function1, JSONObject jSONObject) {
        stereoRoomCommandExecutorImpl.parseErrorResponse("requestPromotion", jSONObject, function1);
    }

    public void acceptPromotion(StereoRoomCommandExecutor.AcceptPromotionParams acceptPromotionParams, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        o9e o9e = SignalingProviderKt.get(this.signalingProvider, function1);
        if (o9e != null) {
            boolean reject = acceptPromotionParams.getReject();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "accept-promotion");
            jSONObject.put("reject", reject);
            o9e.d(new rp6(jSONObject), false, new jt(18, function0), new aoe(this, function1, 2));
        }
    }

    public void getHandsQueue(Function3<? super Integer, ? super Boolean, ? super List<rn1>, Unit> function3, Function1<? super Throwable, Unit> function1) {
        o9e o9e = SignalingProviderKt.get(this.signalingProvider, function1);
        if (o9e != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "get-hand-queue");
            o9e.d(new rp6(jSONObject), false, new zy0(this, function1, function3, 3), new aoe(this, function1, 0));
        }
    }

    public void promoteParticipant(StereoRoomCommandExecutor.PromoteParticipantParams promoteParticipantParams, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        o9e o9e = SignalingProviderKt.get(this.signalingProvider, function1);
        if (o9e != null) {
            o9e.d(tf6.t(promoteParticipantParams.getParticipantId(), promoteParticipantParams.getPromote()), false, new jt(19, function0), new aoe(this, function1, 3));
        }
    }

    public void requestPromotion(StereoRoomCommandExecutor.RequestPromotionParams requestPromotionParams, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        o9e o9e = SignalingProviderKt.get(this.signalingProvider, function1);
        if (o9e != null) {
            boolean unrequest = requestPromotionParams.getUnrequest();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "request-promotion");
            jSONObject.put("unrequest", unrequest);
            o9e.d(new rp6(jSONObject), false, new jt(17, function0), new aoe(this, function1, 1));
        }
    }
}
