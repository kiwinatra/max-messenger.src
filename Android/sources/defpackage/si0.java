package defpackage;

import kotlin.jvm.functions.Function0;
import one.me.android.OneMeApplication;
import ru.ok.android.externcalls.sdk.factory.BaseCallParams;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;

/* renamed from: si0  reason: default package */
public final /* synthetic */ class si0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ si0(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    public final void run() {
        Function0 function0 = this.b;
        switch (this.a) {
            case 0:
                BaseCallParams.Builder.setOnPrepared$lambda$6$lambda$5(function0);
                return;
            case 1:
                function0.invoke();
                return;
            case 2:
                function0.invoke();
                return;
            case 3:
                function0.invoke();
                return;
            case 4:
                function0.invoke();
                return;
            case 5:
                function0.invoke();
                return;
            case 6:
                function0.invoke();
                return;
            case 7:
                int i = OneMeApplication.X;
                function0.invoke();
                return;
            case 8:
                SessionRoomParticipantsDataProviderImpl.resolveParticipantIds$lambda$8(function0);
                return;
            case 9:
                StereoRoomManagerImpl.revokeRoles$lambda$6(function0);
                return;
            case 10:
                StereoRoomManagerImpl.resolveIdsAndThen$lambda$9(function0);
                return;
            case 11:
                StereoRoomManagerImpl.grantAdmin$lambda$2$lambda$0(function0);
                return;
            default:
                StereoRoomManagerImpl.revokeAdmin$lambda$5$lambda$3(function0);
                return;
        }
    }
}
