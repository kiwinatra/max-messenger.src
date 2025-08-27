package ru.ok.android.externcalls.sdk.participant;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.participant.add.AddParticipantsFailedException;
import ru.ok.android.externcalls.sdk.participant.add.AddParticipantsResult;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u001b\u001a\u00020\u00172\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\"\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160!¢\u0006\u0004\b\"\u0010#Je\u0010,\u001a\u00020\u00172\u0010\u0010'\u001a\f\u0012\b\u0012\u00060%j\u0002`&0$2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010*\u001a\u00020(2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00152\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u00101¨\u00062"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/AddParticipantsCommands;", "", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lhz0;", "call", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "mappings", "Lkotlin/Function0;", "Lru/ok/android/externcalls/sdk/Conversation$State;", "stateProvider", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lhz0;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Lkotlin/jvm/functions/Function0;)V", "Lorg/json/JSONObject;", "error", "Lru/ok/android/externcalls/sdk/participant/AddByLinkFailedException;", "parseErrorResponse", "(Lorg/json/JSONObject;)Lru/ok/android/externcalls/sdk/participant/AddByLinkFailedException;", "Lru/ok/android/externcalls/sdk/participant/add/AddParticipantsFailedException;", "parseAddError", "(Lorg/json/JSONObject;)Lru/ok/android/externcalls/sdk/participant/add/AddParticipantsFailedException;", "Lkotlin/Function1;", "", "", "onError", "Lo9e;", "provideSignaling", "withSignaling", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "link", "Ljava/lang/Runnable;", "onSuccess", "Lrk3;", "addParticipantByLink", "(Ljava/lang/String;Ljava/lang/Runnable;Lrk3;)V", "", "Lue1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "participantsIds", "", "isUnban", "isShowChatHistory", "Lru/ok/android/externcalls/sdk/participant/add/AddParticipantsResult;", "addParticipants", "(Ljava/util/Collection;Ljava/lang/Boolean;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lhz0;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Lkotlin/jvm/functions/Function0;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class AddParticipantsCommands {
    /* access modifiers changed from: private */
    public final hz0 call;
    /* access modifiers changed from: private */
    public final IdMappingWrapper mappings;
    private final SignalingProvider signalingProvider;
    private final Function0<Conversation.State> stateProvider;

    public AddParticipantsCommands(SignalingProvider signalingProvider2, hz0 hz0, IdMappingWrapper idMappingWrapper, Function0<? extends Conversation.State> function0) {
        this.signalingProvider = signalingProvider2;
        this.call = hz0;
        this.mappings = idMappingWrapper;
        this.stateProvider = function0;
    }

    public static /* synthetic */ void addParticipants$default(AddParticipantsCommands addParticipantsCommands, Collection collection, Boolean bool, boolean z, Function1 function1, Function1 function12, int i, Object obj) {
        Boolean bool2 = (i & 2) != 0 ? null : bool;
        if ((i & 4) != 0) {
            z = false;
        }
        addParticipantsCommands.addParticipants(collection, bool2, z, (i & 8) != 0 ? null : function1, (i & 16) != 0 ? null : function12);
    }

    /* access modifiers changed from: private */
    public final AddParticipantsFailedException parseAddError(JSONObject jSONObject) {
        String optString = jSONObject.optString("message");
        if (optString == null) {
            optString = "Add participants error: " + jSONObject;
        }
        return new AddParticipantsFailedException(optString);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException parseErrorResponse(org.json.JSONObject r2) {
        /*
            r1 = this;
            java.lang.String r1 = "message"
            java.lang.String r1 = r2.optString(r1)
            if (r1 != 0) goto L_0x0016
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Add participant by link error: "
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L_0x0016:
            java.lang.String r0 = "error"
            java.lang.String r2 = r2.optString(r0)
            if (r2 == 0) goto L_0x006e
            int r0 = r2.hashCode()
            switch(r0) {
                case -1949027499: goto L_0x0062;
                case -1148527576: goto L_0x0056;
                case -814624751: goto L_0x004a;
                case -506696988: goto L_0x003e;
                case -500593498: goto L_0x0032;
                case 1966207640: goto L_0x0026;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x006e
        L_0x0026:
            java.lang.String r0 = "link_is_outdated"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x002f
            goto L_0x006e
        L_0x002f:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException$Reason r2 = ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException.Reason.LINK_OUTDATED
            goto L_0x0070
        L_0x0032:
            java.lang.String r0 = "wrong_signature"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x003b
            goto L_0x006e
        L_0x003b:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException$Reason r2 = ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException.Reason.WRONG_SIGNATURE
            goto L_0x0070
        L_0x003e:
            java.lang.String r0 = "qr.general_error"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0047
            goto L_0x006e
        L_0x0047:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException$Reason r2 = ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException.Reason.QR_GENERAL_ERROR
            goto L_0x0070
        L_0x004a:
            java.lang.String r0 = "qr.wrong_prefix"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0053
            goto L_0x006e
        L_0x0053:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException$Reason r2 = ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException.Reason.QR_WRONG_PREFIX
            goto L_0x0070
        L_0x0056:
            java.lang.String r0 = "qr.no_user_id_parameter"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x005f
            goto L_0x006e
        L_0x005f:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException$Reason r2 = ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException.Reason.QR_NO_USER_ID_PARAMETER
            goto L_0x0070
        L_0x0062:
            java.lang.String r0 = "malformed_qr_url"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x006b
            goto L_0x006e
        L_0x006b:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException$Reason r2 = ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException.Reason.MALFORMED_QR_URL
            goto L_0x0070
        L_0x006e:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException$Reason r2 = ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException.Reason.UNKNOWN
        L_0x0070:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException r0 = new ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands.parseErrorResponse(org.json.JSONObject):ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException");
    }

    private final void withSignaling(Function1<? super Throwable, Unit> function1, Function1<? super o9e, Unit> function12) {
        o9e signaling = this.signalingProvider.getSignaling();
        if (signaling != null) {
            function12.invoke(signaling);
        } else if (function1 != null) {
            function1.invoke(new IllegalStateException("Conversation is not prepared or already destroyed"));
        }
    }

    public static /* synthetic */ void withSignaling$default(AddParticipantsCommands addParticipantsCommands, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        addParticipantsCommands.withSignaling(function1, function12);
    }

    public final void addParticipantByLink(String str, Runnable runnable, rk3 rk3) {
        withSignaling(new AddParticipantsCommands$addParticipantByLink$1(rk3), new AddParticipantsCommands$addParticipantByLink$2(str, rk3, runnable, this));
    }

    public final void addParticipants(Collection<ue1> collection, Boolean bool, boolean z, Function1<? super AddParticipantsResult, Unit> function1, Function1<? super Throwable, Unit> function12) {
        if (this.stateProvider.invoke() != Conversation.State.Finished) {
            withSignaling$default(this, (Function1) null, new AddParticipantsCommands$addParticipants$1(collection, bool, z, function12, this, function1), 1, (Object) null);
        }
    }
}
