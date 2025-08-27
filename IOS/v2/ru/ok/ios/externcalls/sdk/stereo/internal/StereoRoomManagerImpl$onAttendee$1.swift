package ru.ok.android.externcalls.sdk.stereo.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.internal.listener.StereoRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener;

@SourceDebugExtension({"SMAP\nStereoRoomManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StereoRoomManagerImpl.kt\nru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$onAttendee$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1603#2,9:282\n1855#2:291\n1856#2:293\n1612#2:294\n1603#2,9:295\n1855#2:304\n1856#2:306\n1612#2:307\n1#3:292\n1#3:305\n*S KotlinDebug\n*F\n+ 1 StereoRoomManagerImpl.kt\nru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$onAttendee$1\n*L\n143#1:282,9\n143#1:291\n143#1:293\n143#1:294\n146#1:295,9\n146#1:304\n146#1:306\n146#1:307\n143#1:292\n146#1:305\n*E\n"})
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class StereoRoomManagerImpl$onAttendee$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ sn1 $event;
    final /* synthetic */ StereoRoomManagerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StereoRoomManagerImpl$onAttendee$1(StereoRoomManagerImpl stereoRoomManagerImpl, sn1 sn1) {
        super(0);
        this.this$0 = stereoRoomManagerImpl;
        this.$event = sn1;
    }

    public final void invoke() {
        StereoRoomListenerManagerImpl access$getListenersManager$p = this.this$0.listenersManager;
        sn1 sn1 = this.$event;
        int i = sn1.a;
        StereoRoomManagerImpl stereoRoomManagerImpl = this.this$0;
        ArrayList arrayList = new ArrayList();
        for (ue1 access$getExternalId : sn1.c) {
            ParticipantId access$getExternalId2 = stereoRoomManagerImpl.getExternalId(access$getExternalId);
            if (access$getExternalId2 != null) {
                arrayList.add(access$getExternalId2);
            }
        }
        StereoRoomManagerImpl stereoRoomManagerImpl2 = this.this$0;
        ArrayList arrayList2 = new ArrayList();
        for (ue1 access$getExternalId3 : this.$event.b) {
            ParticipantId access$getExternalId4 = stereoRoomManagerImpl2.getExternalId(access$getExternalId3);
            if (access$getExternalId4 != null) {
                arrayList2.add(access$getExternalId4);
            }
        }
        access$getListenersManager$p.onListenersChanged(new StereoRoomManagerListener.ListenersUpdated(i, arrayList2, arrayList));
    }
}
