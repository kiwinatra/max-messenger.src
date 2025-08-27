package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: h67  reason: default package */
public interface h67 extends IInterface {
    void C0(zp8 zp8);

    void T(String str, Bundle bundle, nx8 nx8);

    void W(e67 e67);

    void adjustVolume(int i, int i2, String str);

    void f0(e67 e67);

    void fastForward();

    Bundle getExtras();

    long getFlags();

    PendingIntent getLaunchPendingIntent();

    vs8 getMetadata();

    String getPackageName();

    mob getPlaybackState();

    List getQueue();

    CharSequence getQueueTitle();

    int getRatingType();

    int getRepeatMode();

    Bundle getSessionInfo();

    int getShuffleMode();

    String getTag();

    j8b getVolumeAttributes();

    boolean isCaptioningEnabled();

    boolean isTransportControlEnabled();

    void j0(zp8 zp8);

    void k(upc upc, Bundle bundle);

    void n(upc upc);

    void next();

    void pause();

    void play();

    void playFromMediaId(String str, Bundle bundle);

    void playFromSearch(String str, Bundle bundle);

    void playFromUri(Uri uri, Bundle bundle);

    void prepare();

    void prepareFromMediaId(String str, Bundle bundle);

    void prepareFromSearch(String str, Bundle bundle);

    void prepareFromUri(Uri uri, Bundle bundle);

    void previous();

    void removeQueueItemAt(int i);

    void rewind();

    void seekTo(long j);

    void sendCustomAction(String str, Bundle bundle);

    boolean sendMediaButton(KeyEvent keyEvent);

    void setCaptioningEnabled(boolean z);

    void setPlaybackSpeed(float f);

    void setRepeatMode(int i);

    void setShuffleMode(int i);

    void setVolumeTo(int i, int i2, String str);

    void skipToQueueItem(long j);

    void stop();

    void u0(zp8 zp8, int i);
}
