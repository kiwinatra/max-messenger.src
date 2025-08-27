package ru.ok.android.externcalls.sdk.sessionroom.internal.participant;

import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantStatesHandler;", "Lxj1;", "Lrz0;", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "participantStatesManager", "Lkotlin/Function0;", "", "isMeCreatorOrAdmin", "<init>", "(Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;Lkotlin/jvm/functions/Function0;)V", "", "Lye1;", "participants", "", "dismissAssistanceRequestIfAdminAppearedInRoom", "(Ljava/util/Collection;)V", "dismissAssistanceRequestIfNecessary", "()V", "lowerMyHandAndDismissAssistanceRequestIfNecessary", "Ltj1;", "params", "onCurrentParticipantActiveRoomChanged", "(Ltj1;)V", "Lmz0;", "onActiveParticipantsAdded", "(Lmz0;)V", "Lqz0;", "onActiveParticipantUpdated", "(Lqz0;)V", "Lnz0;", "onActiveParticipantsChanged", "(Lnz0;)V", "Loz0;", "onActiveParticipantsDeAnonimized", "(Loz0;)V", "Lpz0;", "onActiveParticipantsRemoved", "(Lpz0;)V", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "Lkotlin/jvm/functions/Function0;", "Lzwd;", "roomId", "Lzwd;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class SessionRoomParticipantStatesHandler implements xj1, rz0 {
    private final Function0<Boolean> isMeCreatorOrAdmin;
    private final ParticipantStatesManagerImpl participantStatesManager;
    private zwd roomId = xwd.a;

    public SessionRoomParticipantStatesHandler(ParticipantStatesManagerImpl participantStatesManagerImpl, Function0<Boolean> function0) {
        this.participantStatesManager = participantStatesManagerImpl;
        this.isMeCreatorOrAdmin = function0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void dismissAssistanceRequestIfAdminAppearedInRoom(java.util.Collection<defpackage.ye1> r3) {
        /*
            r2 = this;
            zwd r0 = r2.roomId
            boolean r0 = r0 instanceof defpackage.xwd
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.util.Iterator r3 = r3.iterator()
        L_0x000b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r3.next()
            ye1 r0 = (defpackage.ye1) r0
            java.util.List r0 = r0.e
            xe1 r1 = defpackage.xe1.b
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0029
            xe1 r1 = defpackage.xe1.a
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x000b
        L_0x0029:
            r2.dismissAssistanceRequestIfNecessary()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantStatesHandler.dismissAssistanceRequestIfAdminAppearedInRoom(java.util.Collection):void");
    }

    private final void dismissAssistanceRequestIfNecessary() {
        if (this.participantStatesManager.isAssistanceRequested()) {
            this.participantStatesManager.setAssistanceRequested(false);
        }
    }

    private final void lowerMyHandAndDismissAssistanceRequestIfNecessary() {
        ParticipantStatesManagerImpl participantStatesManagerImpl = this.participantStatesManager;
        ParticipantStatesManagerImpl.State state = ParticipantStatesManagerImpl.State.HAND_RAISED;
        ParticipantStatesManagerImpl.Companion companion = ParticipantStatesManagerImpl.Companion;
        ParticipantStatesManagerImpl.updateMyStates$default(participantStatesManagerImpl, MapsKt.mapOf(TuplesKt.to(state, companion.getSTATE_OFF()), TuplesKt.to(ParticipantStatesManagerImpl.State.ASSISTANCE_REQUESTED, companion.getSTATE_OFF())), (n9e) null, (n9e) null, 6, (Object) null);
    }

    public void onActiveParticipantUpdated(qz0 qz0) {
        dismissAssistanceRequestIfAdminAppearedInRoom(qz0.b);
    }

    public void onActiveParticipantsAdded(mz0 mz0) {
        dismissAssistanceRequestIfAdminAppearedInRoom(mz0.a);
    }

    public void onActiveParticipantsChanged(nz0 nz0) {
        dismissAssistanceRequestIfAdminAppearedInRoom(nz0.a);
    }

    public void onActiveParticipantsDeAnonimized(oz0 oz0) {
        dismissAssistanceRequestIfAdminAppearedInRoom(oz0.a);
    }

    public void onActiveParticipantsRemoved(pz0 pz0) {
    }

    public void onCurrentParticipantActiveRoomChanged(tj1 tj1) {
        if (!Intrinsics.areEqual((Object) this.roomId, (Object) tj1.a)) {
            lowerMyHandAndDismissAssistanceRequestIfNecessary();
            boolean booleanValue = this.isMeCreatorOrAdmin.invoke().booleanValue();
            zwd zwd = tj1.a;
            if (booleanValue && (zwd instanceof ywd)) {
                ParticipantStatesManagerImpl.resetStates$default(this.participantStatesManager, ParticipantStatesManagerImpl.State.ASSISTANCE_REQUESTED, (ywd) zwd, (n9e) null, (n9e) null, 12, (Object) null);
            }
            this.roomId = zwd;
        }
    }

    public /* bridge */ /* synthetic */ void onCurrentParticipantInvitedToRoom(uj1 uj1) {
    }

    public /* bridge */ /* synthetic */ void onRoomRemoved(vj1 vj1) {
    }

    public /* bridge */ /* synthetic */ void onRoomUpdated(wj1 wj1) {
    }
}
