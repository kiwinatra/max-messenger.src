package defpackage;

import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.feedback.internal.commands.FeedbackCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutorImpl;

/* renamed from: kt  reason: default package */
public final /* synthetic */ class kt implements n9e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ kt(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    public final void k(JSONObject jSONObject) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                AsrCommandsExecutorImpl.startRecord$lambda$1(function1, jSONObject);
                return;
            case 1:
                AsrCommandsExecutorImpl.stopRecord$lambda$3(function1, jSONObject);
                return;
            case 2:
                ChatCommandExecutorImpl.sendMessage$lambda$3(function1, jSONObject);
                return;
            case 3:
                ConversationFeatureCommandExecutorImpl.enableFeatureForRoles$lambda$1(function1, jSONObject);
                return;
            case 4:
                FeedbackCommandsExecutorImpl.sendFeedback$lambda$1(function1, jSONObject);
                return;
            case 5:
                MediaMuteCommandExecutorImpl.requestToEnableMedia$lambda$3(function1, jSONObject);
                return;
            case 6:
                MediaMuteCommandExecutorImpl.updateMediaOptions$lambda$1(function1, jSONObject);
                return;
            case 7:
                ParticipantStatesManagerImpl.lowerHandForAll$lambda$14(function1, jSONObject);
                return;
            case 8:
                UrlSharingCommandsExecutorImpl.start$lambda$1(function1, jSONObject);
                return;
            default:
                UrlSharingCommandsExecutorImpl.stop$lambda$3(function1, jSONObject);
                return;
        }
    }
}
