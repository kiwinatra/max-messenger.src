package defpackage;

import kotlin.jvm.internal.MutablePropertyReference0Impl;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* renamed from: mo1  reason: default package */
public final /* synthetic */ class mo1 extends MutablePropertyReference0Impl {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mo1(int i, Object obj) {
        super(obj, q11.class, "isVideoEnabled", "isVideoEnabled()Z", 0);
        this.a = i;
        switch (i) {
            case 1:
                super(obj, kz9.class, "audioState", "getAudioState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0);
                return;
            case 2:
                super(obj, kz9.class, "screenshareState", "getScreenshareState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0);
                return;
            case 3:
                super(obj, kz9.class, "videoState", "getVideoState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0);
                return;
            case 4:
                super(obj, kz9.class, "audioState", "getAudioState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0);
                return;
            case 5:
                super(obj, kz9.class, "videoState", "getVideoState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0);
                return;
            case 6:
                super(obj, kz9.class, "screenshareState", "getScreenshareState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0);
                return;
            case 7:
                super(obj, kz9.class, "movieSharingState", "getMovieSharingState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0);
                return;
            case 8:
                super(obj, kz9.class, "audioState", "getAudioState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0);
                return;
            case 9:
                super(obj, kz9.class, "videoState", "getVideoState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0);
                return;
            case 10:
                super(obj, kz9.class, "screenshareState", "getScreenshareState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0);
                return;
            case 11:
                super(obj, kz9.class, "movieSharingState", "getMovieSharingState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0);
                return;
            case 12:
                super(obj, kz9.class, "movieSharingState", "getMovieSharingState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0);
                return;
            default:
                return;
        }
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                CameraManager a2 = ((q11) this.receiver).a();
                boolean z = false;
                if (a2 != null && a2.isCameraEnabled()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                return ((kz9) this.receiver).a;
            case 2:
                return ((kz9) this.receiver).c;
            case 3:
                return ((kz9) this.receiver).b;
            case 4:
                return ((kz9) this.receiver).a;
            case 5:
                return ((kz9) this.receiver).b;
            case 6:
                return ((kz9) this.receiver).c;
            case 7:
                return ((kz9) this.receiver).d;
            case 8:
                return ((kz9) this.receiver).a;
            case 9:
                return ((kz9) this.receiver).b;
            case 10:
                return ((kz9) this.receiver).c;
            case 11:
                return ((kz9) this.receiver).d;
            default:
                return ((kz9) this.receiver).d;
        }
    }

    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                CameraManager a2 = ((q11) this.receiver).a();
                if (a2 != null) {
                    a2.setCameraEnabled(booleanValue);
                    return;
                }
                return;
            case 1:
                ((kz9) this.receiver).a = (ft8) obj;
                return;
            case 2:
                ((kz9) this.receiver).c = (ft8) obj;
                return;
            case 3:
                ((kz9) this.receiver).b = (ft8) obj;
                return;
            case 4:
                ((kz9) this.receiver).a = (ft8) obj;
                return;
            case 5:
                ((kz9) this.receiver).b = (ft8) obj;
                return;
            case 6:
                ((kz9) this.receiver).c = (ft8) obj;
                return;
            case 7:
                ((kz9) this.receiver).d = (ft8) obj;
                return;
            case 8:
                ((kz9) this.receiver).a = (ft8) obj;
                return;
            case 9:
                ((kz9) this.receiver).b = (ft8) obj;
                return;
            case 10:
                ((kz9) this.receiver).c = (ft8) obj;
                return;
            case 11:
                ((kz9) this.receiver).d = (ft8) obj;
                return;
            default:
                ((kz9) this.receiver).d = (ft8) obj;
                return;
        }
    }
}
