package defpackage;

import kotlin.jvm.functions.Function0;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.feedback.internal.commands.FeedbackCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandExecutorImpl;
import ru.ok.tamtam.nano.Protos;

/* renamed from: jt  reason: default package */
public final /* synthetic */ class jt implements n9e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ jt(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    public final void k(JSONObject jSONObject) {
        int i = this.a;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                AsrCommandsExecutorImpl.startRecord$lambda$0(function0, jSONObject);
                return;
            case 1:
                AsrCommandsExecutorImpl.stopRecord$lambda$2(function0, jSONObject);
                return;
            case 2:
                ChatCommandExecutorImpl.sendMessage$lambda$2(function0, jSONObject);
                return;
            case 3:
                ConversationFeatureCommandExecutorImpl.enableFeatureForRoles$lambda$0(function0, jSONObject);
                return;
            case 4:
                FeedbackCommandsExecutorImpl.sendFeedback$lambda$0(function0, jSONObject);
                return;
            case 5:
                MediaMuteCommandExecutorImpl.requestToEnableMedia$lambda$2(function0, jSONObject);
                return;
            case 6:
                MediaMuteCommandExecutorImpl.updateMediaOptions$lambda$0(function0, jSONObject);
                return;
            case 7:
                ParticipantStatesManagerImpl.lowerHandForAll$lambda$13(function0, jSONObject);
                return;
            case 8:
                RecordManagerImpl.stopRecord$lambda$2(function0, jSONObject);
                return;
            case 9:
                RecordManagerImpl.startRecord$lambda$0(function0, jSONObject);
                return;
            case 10:
                SessionRoomAdminCommandExecutorImpl.removeRooms$lambda$2(function0, jSONObject);
                return;
            case 11:
                SessionRoomAdminCommandExecutorImpl.switchRoom$lambda$4(function0, jSONObject);
                return;
            case 12:
                SessionRoomAdminCommandExecutorImpl.updateRooms$lambda$6(function0, jSONObject);
                return;
            case 13:
                SessionRoomAdminCommandExecutorImpl.activateRooms$lambda$0(function0, jSONObject);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                SessionRoomCommandExecutorImpl.joinRoom$lambda$2(function0, jSONObject);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                SessionRoomCommandExecutorImpl.leaveRoom$lambda$4(function0, jSONObject);
                return;
            case 16:
                SessionRoomCommandExecutorImpl.requestAttention$lambda$0(function0, jSONObject);
                return;
            case LangUtils.HASH_SEED /*17*/:
                StereoRoomCommandExecutorImpl.requestPromotion$lambda$2(function0, jSONObject);
                return;
            case 18:
                StereoRoomCommandExecutorImpl.acceptPromotion$lambda$4(function0, jSONObject);
                return;
            case 19:
                StereoRoomCommandExecutorImpl.promoteParticipant$lambda$0(function0, jSONObject);
                return;
            case 20:
                UrlSharingCommandsExecutorImpl.start$lambda$0(function0, jSONObject);
                return;
            case 21:
                UrlSharingCommandsExecutorImpl.stop$lambda$2(function0, jSONObject);
                return;
            case 22:
                WatchTogetherCommandExecutorImpl.resume$lambda$6(function0, jSONObject);
                return;
            case 23:
                WatchTogetherCommandExecutorImpl.setVolume_F2PwOSs$lambda$8(function0, jSONObject);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                WatchTogetherCommandExecutorImpl.pause$lambda$4(function0, jSONObject);
                return;
            case 25:
                WatchTogetherCommandExecutorImpl.setPosition$lambda$12(function0, jSONObject);
                return;
            case 26:
                WatchTogetherCommandExecutorImpl.play_yj_a6ag$lambda$0(function0, jSONObject);
                return;
            case 27:
                WatchTogetherCommandExecutorImpl.setMuted$lambda$10(function0, jSONObject);
                return;
            default:
                WatchTogetherCommandExecutorImpl.stop$lambda$2(function0, jSONObject);
                return;
        }
    }
}
