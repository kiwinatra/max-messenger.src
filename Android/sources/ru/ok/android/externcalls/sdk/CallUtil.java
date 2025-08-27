package ru.ok.android.externcalls.sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

public class CallUtil {
    static final voc LOG = new voc() {
        public /* bridge */ /* synthetic */ void log(String str, String str2) {
        }

        public /* bridge */ /* synthetic */ void logException(String str, String str2, Throwable th) {
        }

        public /* bridge */ /* synthetic */ void reportException(String str, String str2, Throwable th) {
        }
    };
    static final woc LOG_CONFIGURATION = new woc() {
        public /* bridge */ /* synthetic */ boolean shouldHideSensitiveInformation() {
            return false;
        }
    };

    public static List<String> collectOpponentExternalIds(ParticipantStore participantStore, ParticipantId participantId) {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationParticipant> it = participantStore.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (next.getExternalId() != null && !next.getExternalId().equals(participantId)) {
                arrayList.add(next.getExternalId().id);
            }
        }
        return arrayList;
    }

    public static List<Long> collectOpponentInternalIds(ParticipantStore participantStore, ue1 ue1) {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationParticipant> it = participantStore.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (next.getInternalId() != null && !next.getInternalId().equals(ue1)) {
                arrayList.add(Long.valueOf(next.getInternalId().a));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, qe1] */
    public static qe1 createBitrates() {
        ? obj = new Object();
        obj.a = 204800;
        obj.b = 512000;
        obj.c = 2048000;
        obj.d = 2048000;
        obj.e = 16384;
        obj.f = 32768;
        obj.g = 65536;
        obj.h = 65536;
        return obj;
    }

    public static te1 createCallParams(ConversationBuilder conversationBuilder) {
        ConversationBuilder conversationBuilder2 = conversationBuilder;
        qe1 qe1 = conversationBuilder2.bitrates;
        if (qe1 == null) {
            qe1 = createBitrates();
        }
        qe1 qe12 = qe1;
        re1 re1 = conversationBuilder2.experiments;
        se1 se1 = re1.f;
        if (se1 == null) {
            se1 = new se1(conversationBuilder2.mediaReceivingTimeoutMs);
        }
        se1 se12 = se1;
        dm4 dm4 = r2;
        dm4 dm42 = new dm4(5, (Object) new qr0(conversationBuilder2.isMediaAdaptationFeatureEnabledForP2PCall, conversationBuilder2.ptpCallMediaAdaptationConfig), (Object) new qr0(conversationBuilder2.isMediaAdaptationFeatureEnabledForGroupCall, conversationBuilder2.groupCallMediaAdaptationConfig));
        te1 te1 = r2;
        te1 te12 = new te1(qe12, se12, conversationBuilder2.dnsResolverEnabled, conversationBuilder2.isConsumerUpdateEnabled, conversationBuilder2.isOnDemandTracksEnabled, conversationBuilder2.enableLossRttBadConnectionHandling, conversationBuilder2.additionalWhitelistedCodecPrefixes, conversationBuilder2.isDataChannelScreenshareRecvEnabled, conversationBuilder2.isDataChannelScreenshareSendEnabled, conversationBuilder2.videoTracksCount, conversationBuilder2.fastRecoverEnabled, conversationBuilder2.sessionIdEnabled, conversationBuilder2.isWaitingRoomActivated, conversationBuilder2.isSignalingDefaultValuesFilteringEnabled, conversationBuilder2.isWebRTCCodecFilteringEnabled, conversationBuilder2.audioCodecs, conversationBuilder2.videoCodecs, conversationBuilder2.showLocalVideoInOriginalQuality, conversationBuilder2.isSessionRoomsFeatureEnabled, dm4, conversationBuilder2.isAsrOnlineEnabled, re1, conversationBuilder2.isAudienceModeEnabled, conversationBuilder2.serverTopologySuspendBelowMinBitrate, conversationBuilder2.isFastScreenCaptureEnabled, conversationBuilder2.isDeviceAudioShareEnabled, conversationBuilder2.badNetworkIndicatorConfig);
        te1 te13 = te1;
        te13.c = true;
        return te13;
    }
}
