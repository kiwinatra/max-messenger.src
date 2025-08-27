package defpackage;

import kotlin.jvm.functions.Function1;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;

/* renamed from: axd  reason: default package */
public final /* synthetic */ class axd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ axd(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    public final void run() {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                SessionRoomParticipantsDataProviderImpl.resolveParticipantIds$lambda$9(function1);
                return;
            case 1:
                StereoRoomManagerImpl.revokeRoles$lambda$7(function1);
                return;
            case 2:
                StereoRoomManagerImpl.grantAdmin$lambda$2$lambda$1(function1);
                return;
            default:
                StereoRoomManagerImpl.revokeAdmin$lambda$5$lambda$4(function1);
                return;
        }
    }
}
