package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.apache.http.HttpStatus;
import org.webrtc.MediaStreamTrack;

public class MediaSessionCompat {
    public static final String ACTION_ARGUMENT_CAPTIONING_ENABLED = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
    public static final String ACTION_ARGUMENT_EXTRAS = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
    public static final String ACTION_ARGUMENT_MEDIA_ID = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";
    public static final String ACTION_ARGUMENT_PLAYBACK_SPEED = "android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED";
    public static final String ACTION_ARGUMENT_QUERY = "android.support.v4.media.session.action.ARGUMENT_QUERY";
    public static final String ACTION_ARGUMENT_RATING = "android.support.v4.media.session.action.ARGUMENT_RATING";
    public static final String ACTION_ARGUMENT_REPEAT_MODE = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
    public static final String ACTION_ARGUMENT_SHUFFLE_MODE = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
    public static final String ACTION_ARGUMENT_URI = "android.support.v4.media.session.action.ARGUMENT_URI";
    public static final String ACTION_FLAG_AS_INAPPROPRIATE = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";
    public static final String ACTION_FOLLOW = "android.support.v4.media.session.action.FOLLOW";
    public static final String ACTION_PLAY_FROM_URI = "android.support.v4.media.session.action.PLAY_FROM_URI";
    public static final String ACTION_PREPARE = "android.support.v4.media.session.action.PREPARE";
    public static final String ACTION_PREPARE_FROM_MEDIA_ID = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";
    public static final String ACTION_PREPARE_FROM_SEARCH = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";
    public static final String ACTION_PREPARE_FROM_URI = "android.support.v4.media.session.action.PREPARE_FROM_URI";
    public static final String ACTION_SET_CAPTIONING_ENABLED = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";
    public static final String ACTION_SET_PLAYBACK_SPEED = "android.support.v4.media.session.action.SET_PLAYBACK_SPEED";
    public static final String ACTION_SET_RATING = "android.support.v4.media.session.action.SET_RATING";
    public static final String ACTION_SET_REPEAT_MODE = "android.support.v4.media.session.action.SET_REPEAT_MODE";
    public static final String ACTION_SET_SHUFFLE_MODE = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
    public static final String ACTION_SKIP_AD = "android.support.v4.media.session.action.SKIP_AD";
    public static final String ACTION_UNFOLLOW = "android.support.v4.media.session.action.UNFOLLOW";
    public static final String ARGUMENT_MEDIA_ATTRIBUTE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";
    public static final String ARGUMENT_MEDIA_ATTRIBUTE_VALUE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";
    private static final String DATA_CALLING_PACKAGE = "data_calling_pkg";
    private static final String DATA_CALLING_PID = "data_calling_pid";
    private static final String DATA_CALLING_UID = "data_calling_uid";
    private static final String DATA_EXTRAS = "data_extras";
    @Deprecated
    public static final int FLAG_HANDLES_MEDIA_BUTTONS = 1;
    public static final int FLAG_HANDLES_QUEUE_COMMANDS = 4;
    @Deprecated
    public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = 2;
    public static final String KEY_EXTRA_BINDER = "android.support.v4.media.session.EXTRA_BINDER";
    public static final String KEY_SESSION2_TOKEN = "android.support.v4.media.session.SESSION_TOKEN2";
    public static final String KEY_TOKEN = "android.support.v4.media.session.TOKEN";
    private static final int MAX_BITMAP_SIZE_IN_DP = 320;
    public static final int MEDIA_ATTRIBUTE_ALBUM = 1;
    public static final int MEDIA_ATTRIBUTE_ARTIST = 0;
    public static final int MEDIA_ATTRIBUTE_PLAYLIST = 2;
    static final String TAG = "MediaSessionCompat";
    static int sMaxBitmapSize;
    private final ArrayList<OnActiveChangeListener> mActiveListeners;
    private final MediaControllerCompat mController;
    private final MediaSessionImpl mImpl;

    public static abstract class Callback {
        final MediaSession.Callback mCallbackFwk = new MediaSessionCallbackApi21();
        CallbackHandler mCallbackHandler;
        final Object mLock = new Object();
        private boolean mMediaPlayPausePendingOnHandler;
        WeakReference<MediaSessionImpl> mSessionImpl = new WeakReference<>((Object) null);

        public class CallbackHandler extends Handler {
            private static final int MSG_MEDIA_PLAY_PAUSE_KEY_DOUBLE_TAP_TIMEOUT = 1;

            public CallbackHandler(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                MediaSessionImpl mediaSessionImpl;
                Callback callback;
                CallbackHandler callbackHandler;
                if (message.what == 1) {
                    synchronized (Callback.this.mLock) {
                        mediaSessionImpl = Callback.this.mSessionImpl.get();
                        callback = Callback.this;
                        callbackHandler = callback.mCallbackHandler;
                    }
                    if (mediaSessionImpl != null && callback == mediaSessionImpl.getCallback() && callbackHandler != null) {
                        mediaSessionImpl.setCurrentControllerInfo((my8) message.obj);
                        Callback.this.handleMediaPlayPauseIfPendingOnHandler(mediaSessionImpl, callbackHandler);
                        mediaSessionImpl.setCurrentControllerInfo((my8) null);
                    }
                }
            }
        }

        public class MediaSessionCallbackApi21 extends MediaSession.Callback {
            public MediaSessionCallbackApi21() {
            }

            private void clearCurrentControllerInfo(MediaSessionImpl mediaSessionImpl) {
                mediaSessionImpl.setCurrentControllerInfo((my8) null);
            }

            private MediaSessionImplApi21 getSessionImplIfCallbackIsSet() {
                MediaSessionImplApi21 mediaSessionImplApi21;
                synchronized (Callback.this.mLock) {
                    mediaSessionImplApi21 = (MediaSessionImplApi21) Callback.this.mSessionImpl.get();
                }
                if (mediaSessionImplApi21 == null || Callback.this != mediaSessionImplApi21.getCallback()) {
                    return null;
                }
                return mediaSessionImplApi21;
            }

            private void setCurrentControllerInfo(MediaSessionImpl mediaSessionImpl) {
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.support.v4.media.session.MediaSessionCompat$QueueItem} */
            /* JADX WARNING: type inference failed for: r2v0 */
            /* JADX WARNING: type inference failed for: r2v4, types: [android.os.IBinder] */
            /* JADX WARNING: type inference failed for: r2v6 */
            /* JADX WARNING: type inference failed for: r2v7 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onCommand(java.lang.String r6, android.os.Bundle r7, android.os.ResultReceiver r8) {
                /*
                    r5 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21 r0 = r5.getSessionImplIfCallbackIsSet()
                    if (r0 != 0) goto L_0x0007
                    return
                L_0x0007:
                    android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r7)
                    r5.setCurrentControllerInfo(r0)
                    java.lang.String r1 = "android.support.v4.media.session.command.GET_EXTRA_BINDER"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b5 }
                    r2 = 0
                    if (r1 == 0) goto L_0x003c
                    android.os.Bundle r6 = new android.os.Bundle     // Catch:{ BadParcelableException -> 0x00b5 }
                    r6.<init>()     // Catch:{ BadParcelableException -> 0x00b5 }
                    android.support.v4.media.session.MediaSessionCompat$Token r7 = r0.getSessionToken()     // Catch:{ BadParcelableException -> 0x00b5 }
                    android.support.v4.media.session.IMediaSession r1 = r7.getExtraBinder()     // Catch:{ BadParcelableException -> 0x00b5 }
                    java.lang.String r3 = "android.support.v4.media.session.EXTRA_BINDER"
                    if (r1 != 0) goto L_0x0028
                    goto L_0x002c
                L_0x0028:
                    android.os.IBinder r2 = r1.asBinder()     // Catch:{ BadParcelableException -> 0x00b5 }
                L_0x002c:
                    r6.putBinder(r3, r2)     // Catch:{ BadParcelableException -> 0x00b5 }
                    t2g r7 = r7.getSession2Token()     // Catch:{ BadParcelableException -> 0x00b5 }
                    defpackage.i8b.M(r6, r7)     // Catch:{ BadParcelableException -> 0x00b5 }
                    r7 = 0
                    r8.send(r7, r6)     // Catch:{ BadParcelableException -> 0x00b5 }
                    goto L_0x00b5
                L_0x003c:
                    java.lang.String r1 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b5 }
                    java.lang.String r3 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
                    if (r1 == 0) goto L_0x0052
                    android.support.v4.media.session.MediaSessionCompat$Callback r6 = android.support.v4.media.session.MediaSessionCompat.Callback.this     // Catch:{ BadParcelableException -> 0x00b5 }
                    android.os.Parcelable r7 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b5 }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00b5 }
                    r6.onAddQueueItem(r7)     // Catch:{ BadParcelableException -> 0x00b5 }
                    goto L_0x00b5
                L_0x0052:
                    java.lang.String r1 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b5 }
                    java.lang.String r4 = "android.support.v4.media.session.command.ARGUMENT_INDEX"
                    if (r1 == 0) goto L_0x006c
                    android.support.v4.media.session.MediaSessionCompat$Callback r6 = android.support.v4.media.session.MediaSessionCompat.Callback.this     // Catch:{ BadParcelableException -> 0x00b5 }
                    android.os.Parcelable r8 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b5 }
                    android.support.v4.media.MediaDescriptionCompat r8 = (android.support.v4.media.MediaDescriptionCompat) r8     // Catch:{ BadParcelableException -> 0x00b5 }
                    int r7 = r7.getInt(r4)     // Catch:{ BadParcelableException -> 0x00b5 }
                    r6.onAddQueueItem(r8, r7)     // Catch:{ BadParcelableException -> 0x00b5 }
                    goto L_0x00b5
                L_0x006c:
                    java.lang.String r1 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b5 }
                    if (r1 == 0) goto L_0x0080
                    android.support.v4.media.session.MediaSessionCompat$Callback r6 = android.support.v4.media.session.MediaSessionCompat.Callback.this     // Catch:{ BadParcelableException -> 0x00b5 }
                    android.os.Parcelable r7 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b5 }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00b5 }
                    r6.onRemoveQueueItem(r7)     // Catch:{ BadParcelableException -> 0x00b5 }
                    goto L_0x00b5
                L_0x0080:
                    java.lang.String r1 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b5 }
                    if (r1 == 0) goto L_0x00b0
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r6 = r0.mQueue     // Catch:{ BadParcelableException -> 0x00b5 }
                    if (r6 == 0) goto L_0x00b5
                    r6 = -1
                    int r6 = r7.getInt(r4, r6)     // Catch:{ BadParcelableException -> 0x00b5 }
                    if (r6 < 0) goto L_0x00a4
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r0.mQueue     // Catch:{ BadParcelableException -> 0x00b5 }
                    int r7 = r7.size()     // Catch:{ BadParcelableException -> 0x00b5 }
                    if (r6 >= r7) goto L_0x00a4
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r0.mQueue     // Catch:{ BadParcelableException -> 0x00b5 }
                    java.lang.Object r6 = r7.get(r6)     // Catch:{ BadParcelableException -> 0x00b5 }
                    r2 = r6
                    android.support.v4.media.session.MediaSessionCompat$QueueItem r2 = (android.support.v4.media.session.MediaSessionCompat.QueueItem) r2     // Catch:{ BadParcelableException -> 0x00b5 }
                L_0x00a4:
                    if (r2 == 0) goto L_0x00b5
                    android.support.v4.media.session.MediaSessionCompat$Callback r6 = android.support.v4.media.session.MediaSessionCompat.Callback.this     // Catch:{ BadParcelableException -> 0x00b5 }
                    android.support.v4.media.MediaDescriptionCompat r7 = r2.getDescription()     // Catch:{ BadParcelableException -> 0x00b5 }
                    r6.onRemoveQueueItem(r7)     // Catch:{ BadParcelableException -> 0x00b5 }
                    goto L_0x00b5
                L_0x00b0:
                    android.support.v4.media.session.MediaSessionCompat$Callback r1 = android.support.v4.media.session.MediaSessionCompat.Callback.this     // Catch:{ BadParcelableException -> 0x00b5 }
                    r1.onCommand(r6, r7, r8)     // Catch:{ BadParcelableException -> 0x00b5 }
                L_0x00b5:
                    r5.clearCurrentControllerInfo(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.Callback.MediaSessionCallbackApi21.onCommand(java.lang.String, android.os.Bundle, android.os.ResultReceiver):void");
            }

            public void onCustomAction(String str, Bundle bundle) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet != null) {
                    MediaSessionCompat.ensureClassLoader(bundle);
                    setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                    try {
                        if (str.equals(MediaSessionCompat.ACTION_PLAY_FROM_URI)) {
                            Bundle bundle2 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                            MediaSessionCompat.ensureClassLoader(bundle2);
                            Callback.this.onPlayFromUri((Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI), bundle2);
                        } else if (str.equals(MediaSessionCompat.ACTION_PREPARE)) {
                            Callback.this.onPrepare();
                        } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
                            String string = bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID);
                            Bundle bundle3 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                            MediaSessionCompat.ensureClassLoader(bundle3);
                            Callback.this.onPrepareFromMediaId(string, bundle3);
                        } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH)) {
                            String string2 = bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_QUERY);
                            Bundle bundle4 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                            MediaSessionCompat.ensureClassLoader(bundle4);
                            Callback.this.onPrepareFromSearch(string2, bundle4);
                        } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_URI)) {
                            Bundle bundle5 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                            MediaSessionCompat.ensureClassLoader(bundle5);
                            Callback.this.onPrepareFromUri((Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI), bundle5);
                        } else if (str.equals(MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                            Callback.this.onSetCaptioningEnabled(bundle.getBoolean(MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED));
                        } else if (str.equals(MediaSessionCompat.ACTION_SET_REPEAT_MODE)) {
                            Callback.this.onSetRepeatMode(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE));
                        } else if (str.equals(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE)) {
                            Callback.this.onSetShuffleMode(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE));
                        } else if (str.equals(MediaSessionCompat.ACTION_SET_RATING)) {
                            Bundle bundle6 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                            MediaSessionCompat.ensureClassLoader(bundle6);
                            Callback.this.onSetRating((RatingCompat) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_RATING), bundle6);
                        } else if (str.equals(MediaSessionCompat.ACTION_SET_PLAYBACK_SPEED)) {
                            Callback.this.onSetPlaybackSpeed(bundle.getFloat(MediaSessionCompat.ACTION_ARGUMENT_PLAYBACK_SPEED, 1.0f));
                        } else {
                            Callback.this.onCustomAction(str, bundle);
                        }
                    } catch (BadParcelableException unused) {
                    }
                    clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                }
            }

            public void onFastForward() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet != null) {
                    setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                    Callback.this.onFastForward();
                    clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                }
            }

            public boolean onMediaButtonEvent(Intent intent) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return false;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                boolean onMediaButtonEvent = Callback.this.onMediaButtonEvent(intent);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                return onMediaButtonEvent || super.onMediaButtonEvent(intent);
            }

            public void onPause() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet != null) {
                    setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                    Callback.this.onPause();
                    clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                }
            }

            public void onPlay() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet != null) {
                    setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                    Callback.this.onPlay();
                    clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                }
            }

            public void onPlayFromMediaId(String str, Bundle bundle) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet != null) {
                    MediaSessionCompat.ensureClassLoader(bundle);
                    setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                    Callback.this.onPlayFromMediaId(str, bundle);
                    clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                }
            }

            public void onPlayFromSearch(String str, Bundle bundle) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet != null) {
                    MediaSessionCompat.ensureClassLoader(bundle);
                    setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                    Callback.this.onPlayFromSearch(str, bundle);
                    clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                }
            }

            public void onPlayFromUri(Uri uri, Bundle bundle) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet != null) {
                    MediaSessionCompat.ensureClassLoader(bundle);
                    setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                    Callback.this.onPlayFromUri(uri, bundle);
                    clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                }
            }

            public void onPrepare() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet != null) {
                    setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                    Callback.this.onPrepare();
                    clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                }
            }

            public void onPrepareFromMediaId(String str, Bundle bundle) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet != null) {
                    MediaSessionCompat.ensureClassLoader(bundle);
                    setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                    Callback.this.onPrepareFromMediaId(str, bundle);
                    clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                }
            }

            public void onPrepareFromSearch(String str, Bundle bundle) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet != null) {
                    MediaSessionCompat.ensureClassLoader(bundle);
                    setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                    Callback.this.onPrepareFromSearch(str, bundle);
                    clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                }
            }

            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet != null) {
                    MediaSessionCompat.ensureClassLoader(bundle);
                    setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                    Callback.this.onPrepareFromUri(uri, bundle);
                    clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                }
            }

            public void onRewind() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet != null) {
                    setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                    Callback.this.onRewind();
                    clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                }
            }

            public void onSeekTo(long j) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet != null) {
                    setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                    Callback.this.onSeekTo(j);
                    clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                }
            }

            public void onSetPlaybackSpeed(float f) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet != null) {
                    setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                    Callback.this.onSetPlaybackSpeed(f);
                    clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                }
            }

            public void onSetRating(Rating rating) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet != null) {
                    setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                    Callback.this.onSetRating(RatingCompat.fromRating(rating));
                    clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                }
            }

            public void onSkipToNext() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet != null) {
                    setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                    Callback.this.onSkipToNext();
                    clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                }
            }

            public void onSkipToPrevious() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet != null) {
                    setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                    Callback.this.onSkipToPrevious();
                    clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                }
            }

            public void onSkipToQueueItem(long j) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet != null) {
                    setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                    Callback.this.onSkipToQueueItem(j);
                    clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                }
            }

            public void onStop() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet != null) {
                    setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                    Callback.this.onStop();
                    clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                }
            }
        }

        public void handleMediaPlayPauseIfPendingOnHandler(MediaSessionImpl mediaSessionImpl, Handler handler) {
            if (this.mMediaPlayPausePendingOnHandler) {
                boolean z = false;
                this.mMediaPlayPausePendingOnHandler = false;
                handler.removeMessages(1);
                PlaybackStateCompat playbackState = mediaSessionImpl.getPlaybackState();
                long actions = playbackState == null ? 0 : playbackState.getActions();
                boolean z2 = playbackState != null && playbackState.getState() == 3;
                boolean z3 = (516 & actions) != 0;
                if ((actions & 514) != 0) {
                    z = true;
                }
                if (z2 && z) {
                    onPause();
                } else if (!z2 && z3) {
                    onPlay();
                }
            }
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void onCustomAction(String str, Bundle bundle) {
        }

        public void onFastForward() {
        }

        public boolean onMediaButtonEvent(Intent intent) {
            return false;
        }

        public void onPause() {
        }

        public void onPlay() {
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
        }

        public void onPrepare() {
        }

        public void onPrepareFromMediaId(String str, Bundle bundle) {
        }

        public void onPrepareFromSearch(String str, Bundle bundle) {
        }

        public void onPrepareFromUri(Uri uri, Bundle bundle) {
        }

        public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        @Deprecated
        public void onRemoveQueueItemAt(int i) {
        }

        public void onRewind() {
        }

        public void onSeekTo(long j) {
        }

        public void onSetCaptioningEnabled(boolean z) {
        }

        public void onSetPlaybackSpeed(float f) {
        }

        public void onSetRating(RatingCompat ratingCompat) {
        }

        public void onSetRepeatMode(int i) {
        }

        public void onSetShuffleMode(int i) {
        }

        public void onSkipToNext() {
        }

        public void onSkipToPrevious() {
        }

        public void onSkipToQueueItem(long j) {
        }

        public void onStop() {
        }

        public void setSessionImpl(MediaSessionImpl mediaSessionImpl, Handler handler) {
            synchronized (this.mLock) {
                try {
                    this.mSessionImpl = new WeakReference<>(mediaSessionImpl);
                    CallbackHandler callbackHandler = this.mCallbackHandler;
                    CallbackHandler callbackHandler2 = null;
                    if (callbackHandler != null) {
                        callbackHandler.removeCallbacksAndMessages((Object) null);
                    }
                    if (mediaSessionImpl != null) {
                        if (handler != null) {
                            callbackHandler2 = new CallbackHandler(handler.getLooper());
                        }
                    }
                    this.mCallbackHandler = callbackHandler2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
        }
    }

    public interface MediaSessionImpl {
        Callback getCallback();

        String getCallingPackage();

        my8 getCurrentControllerInfo();

        Object getMediaSession();

        PlaybackStateCompat getPlaybackState();

        Object getRemoteControlClient();

        Token getSessionToken();

        boolean isActive();

        void release();

        void sendSessionEvent(String str, Bundle bundle);

        void setActive(boolean z);

        void setCallback(Callback callback, Handler handler);

        void setCaptioningEnabled(boolean z);

        void setCurrentControllerInfo(my8 my8);

        void setExtras(Bundle bundle);

        void setFlags(int i);

        void setMediaButtonReceiver(PendingIntent pendingIntent);

        void setMetadata(MediaMetadataCompat mediaMetadataCompat);

        void setPlaybackState(PlaybackStateCompat playbackStateCompat);

        void setPlaybackToLocal(int i);

        void setPlaybackToRemote(ceg ceg);

        void setQueue(List<QueueItem> list);

        void setQueueTitle(CharSequence charSequence);

        void setRatingType(int i);

        void setRegistrationCallback(RegistrationCallback registrationCallback, Handler handler);

        void setRepeatMode(int i);

        void setSessionActivity(PendingIntent pendingIntent);

        void setShuffleMode(int i);
    }

    public static class MediaSessionImplApi18 extends MediaSessionImplBase {
        private static boolean sIsMbrPendingIntentSupported = true;

        public MediaSessionImplApi18(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, t2g t2g, Bundle bundle) {
            super(context, str, componentName, pendingIntent, t2g, bundle);
        }

        public int getRccTransportControlFlagsFromActions(long j) {
            int rccTransportControlFlagsFromActions = super.getRccTransportControlFlagsFromActions(j);
            return (j & 256) != 0 ? rccTransportControlFlagsFromActions | 256 : rccTransportControlFlagsFromActions;
        }

        public void registerMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
            if (sIsMbrPendingIntentSupported) {
                try {
                    this.mAudioManager.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    sIsMbrPendingIntentSupported = false;
                }
            }
            if (!sIsMbrPendingIntentSupported) {
                super.registerMediaButtonEventReceiver(pendingIntent, componentName);
            }
        }

        public void setCallback(Callback callback, Handler handler) {
            super.setCallback(callback, handler);
            if (callback == null) {
                this.mRcc.setPlaybackPositionUpdateListener((RemoteControlClient.OnPlaybackPositionUpdateListener) null);
                return;
            }
            this.mRcc.setPlaybackPositionUpdateListener(new RemoteControlClient.OnPlaybackPositionUpdateListener() {
                public void onPlaybackPositionUpdate(long j) {
                    MediaSessionImplApi18.this.postToHandler(18, -1, -1, Long.valueOf(j), (Bundle) null);
                }
            });
        }

        public void setRccState(PlaybackStateCompat playbackStateCompat) {
            long position = playbackStateCompat.getPosition();
            float playbackSpeed = playbackStateCompat.getPlaybackSpeed();
            long lastPositionUpdateTime = playbackStateCompat.getLastPositionUpdateTime();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.getState() == 3) {
                long j = 0;
                if (position > 0) {
                    if (lastPositionUpdateTime > 0) {
                        j = elapsedRealtime - lastPositionUpdateTime;
                        if (playbackSpeed > c44.DEFAULT_ASPECT_RATIO && playbackSpeed != 1.0f) {
                            j = (long) (((float) j) * playbackSpeed);
                        }
                    }
                    position += j;
                }
            }
            this.mRcc.setPlaybackState(getRccStateFromState(playbackStateCompat.getState()), position, playbackSpeed);
        }

        public void unregisterMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
            if (sIsMbrPendingIntentSupported) {
                this.mAudioManager.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.unregisterMediaButtonEventReceiver(pendingIntent, componentName);
            }
        }
    }

    public static class MediaSessionImplApi19 extends MediaSessionImplApi18 {
        public MediaSessionImplApi19(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, t2g t2g, Bundle bundle) {
            super(context, str, componentName, pendingIntent, t2g, bundle);
        }

        public RemoteControlClient.MetadataEditor buildRccMetadata(Bundle bundle) {
            RemoteControlClient.MetadataEditor buildRccMetadata = super.buildRccMetadata(bundle);
            PlaybackStateCompat playbackStateCompat = this.mState;
            if (((playbackStateCompat == null ? 0 : playbackStateCompat.getActions()) & 128) != 0) {
                buildRccMetadata.addEditableKey(268435457);
            }
            if (bundle == null) {
                return buildRccMetadata;
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_YEAR)) {
                buildRccMetadata.putLong(8, bundle.getLong(MediaMetadataCompat.METADATA_KEY_YEAR));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_RATING)) {
                buildRccMetadata.putObject(HttpStatus.SC_SWITCHING_PROTOCOLS, bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_RATING));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_USER_RATING)) {
                buildRccMetadata.putObject(268435457, bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_USER_RATING));
            }
            return buildRccMetadata;
        }

        public int getRccTransportControlFlagsFromActions(long j) {
            int rccTransportControlFlagsFromActions = super.getRccTransportControlFlagsFromActions(j);
            return (j & 128) != 0 ? rccTransportControlFlagsFromActions | ConstantsKt.MINIMUM_BLOCK_SIZE : rccTransportControlFlagsFromActions;
        }

        public void setCallback(Callback callback, Handler handler) {
            super.setCallback(callback, handler);
            if (callback == null) {
                this.mRcc.setMetadataUpdateListener((RemoteControlClient.OnMetadataUpdateListener) null);
                return;
            }
            this.mRcc.setMetadataUpdateListener(new RemoteControlClient.OnMetadataUpdateListener() {
                public void onMetadataUpdate(int i, Object obj) {
                    if (i == 268435457 && (obj instanceof Rating)) {
                        MediaSessionImplApi19.this.postToHandler(19, -1, -1, RatingCompat.fromRating(obj), (Bundle) null);
                    }
                }
            });
        }
    }

    public static class MediaSessionImplApi22 extends MediaSessionImplApi21 {
        public MediaSessionImplApi22(Context context, String str, t2g t2g, Bundle bundle) {
            super(context, str, t2g, bundle);
        }

        public void setRatingType(int i) {
            this.mSessionFwk.setRatingType(i);
        }

        public MediaSessionImplApi22(Object obj) {
            super(obj);
        }
    }

    public static class MediaSessionImplApi28 extends MediaSessionImplApi22 {
        public MediaSessionImplApi28(Context context, String str, t2g t2g, Bundle bundle) {
            super(context, str, t2g, bundle);
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, my8] */
        public final my8 getCurrentControllerInfo() {
            MediaSessionManager.RemoteUserInfo currentControllerInfo = this.mSessionFwk.getCurrentControllerInfo();
            ? obj = new Object();
            String packageName = currentControllerInfo.getPackageName();
            if (packageName == null) {
                throw new NullPointerException("package shouldn't be null");
            } else if (!TextUtils.isEmpty(packageName)) {
                obj.a = new oy8(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
                return obj;
            } else {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
        }

        public void setCurrentControllerInfo(my8 my8) {
        }

        public MediaSessionImplApi28(Object obj) {
            super(obj);
        }
    }

    public static class MediaSessionImplApi29 extends MediaSessionImplApi28 {
        public MediaSessionImplApi29(Context context, String str, t2g t2g, Bundle bundle) {
            super(context, str, t2g, bundle);
        }

        public MediaSession createFwkMediaSession(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str, bundle);
        }

        public MediaSessionImplApi29(Object obj) {
            super(obj);
            this.mSessionInfo = ((MediaSession) obj).getController().getSessionInfo();
        }
    }

    public static class MediaSessionImplBase implements MediaSessionImpl {
        static final int RCC_PLAYSTATE_NONE = 0;
        final AudioManager mAudioManager;
        volatile Callback mCallback;
        boolean mCaptioningEnabled;
        private final Context mContext;
        final RemoteCallbackList<IMediaControllerCallback> mControllerCallbacks = new RemoteCallbackList<>();
        boolean mDestroyed = false;
        Bundle mExtras;
        int mFlags = 3;
        private MessageHandler mHandler;
        boolean mIsActive = false;
        int mLocalStream;
        final Object mLock = new Object();
        private final ComponentName mMediaButtonReceiverComponentName;
        private final PendingIntent mMediaButtonReceiverIntent;
        MediaMetadataCompat mMetadata;
        List<QueueItem> mQueue;
        CharSequence mQueueTitle;
        int mRatingType;
        final RemoteControlClient mRcc;
        RegistrationCallbackHandler mRegistrationCallbackHandler;
        private my8 mRemoteUserInfo;
        int mRepeatMode;
        PendingIntent mSessionActivity;
        final Bundle mSessionInfo;
        int mShuffleMode;
        PlaybackStateCompat mState;
        private final MediaSessionStub mStub;
        private final Token mToken;
        private beg mVolumeCallback = new beg() {
            public void onVolumeChanged(ceg ceg) {
                MediaSessionImplBase.this.getClass();
                MediaSessionImplBase mediaSessionImplBase = MediaSessionImplBase.this;
                int i = mediaSessionImplBase.mVolumeType;
                int i2 = mediaSessionImplBase.mLocalStream;
                throw null;
            }
        };
        ceg mVolumeProvider;
        int mVolumeType;

        public static final class Command {
            public final String command;
            public final Bundle extras;
            public final ResultReceiver stub;

            public Command(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.command = str;
                this.extras = bundle;
                this.stub = resultReceiver;
            }
        }

        public static class MediaSessionStub extends IMediaSession.Stub {
            private final AtomicReference<MediaSessionImplBase> mMediaSessionImplRef;
            private final String mPackageName;
            private final String mTag;

            public MediaSessionStub(MediaSessionImplBase mediaSessionImplBase, String str, String str2) {
                this.mMediaSessionImplRef = new AtomicReference<>(mediaSessionImplBase);
                this.mPackageName = str;
                this.mTag = str2;
            }

            public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                postToHandler(25, (Object) mediaDescriptionCompat);
            }

            public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                postToHandler(26, mediaDescriptionCompat, i, (Bundle) null);
            }

            public void adjustVolume(int i, int i2, String str) {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    mediaSessionImplBase.adjustVolume(i, i2);
                }
            }

            public void fastForward() {
                postToHandler(16);
            }

            public Bundle getExtras() {
                Bundle bundle;
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null) {
                    return null;
                }
                synchronized (mediaSessionImplBase.mLock) {
                    bundle = mediaSessionImplBase.mExtras;
                }
                return bundle;
            }

            public long getFlags() {
                long j;
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null) {
                    return 0;
                }
                synchronized (mediaSessionImplBase.mLock) {
                    j = (long) mediaSessionImplBase.mFlags;
                }
                return j;
            }

            public PendingIntent getLaunchPendingIntent() {
                PendingIntent pendingIntent;
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null) {
                    return null;
                }
                synchronized (mediaSessionImplBase.mLock) {
                    pendingIntent = mediaSessionImplBase.mSessionActivity;
                }
                return pendingIntent;
            }

            public MediaMetadataCompat getMetadata() {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    return mediaSessionImplBase.mMetadata;
                }
                return null;
            }

            public String getPackageName() {
                return this.mPackageName;
            }

            public PlaybackStateCompat getPlaybackState() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null) {
                    return null;
                }
                synchronized (mediaSessionImplBase.mLock) {
                    playbackStateCompat = mediaSessionImplBase.mState;
                    mediaMetadataCompat = mediaSessionImplBase.mMetadata;
                }
                return MediaSessionCompat.getStateWithUpdatedPosition(playbackStateCompat, mediaMetadataCompat);
            }

            public List<QueueItem> getQueue() {
                List<QueueItem> list;
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null) {
                    return null;
                }
                synchronized (mediaSessionImplBase.mLock) {
                    list = mediaSessionImplBase.mQueue;
                }
                return list;
            }

            public CharSequence getQueueTitle() {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    return mediaSessionImplBase.mQueueTitle;
                }
                return null;
            }

            public int getRatingType() {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    return mediaSessionImplBase.mRatingType;
                }
                return 0;
            }

            public int getRepeatMode() {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    return mediaSessionImplBase.mRepeatMode;
                }
                return -1;
            }

            public Bundle getSessionInfo() {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null || mediaSessionImplBase.mSessionInfo == null) {
                    return null;
                }
                return new Bundle(mediaSessionImplBase.mSessionInfo);
            }

            public int getShuffleMode() {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    return mediaSessionImplBase.mShuffleMode;
                }
                return -1;
            }

            public String getTag() {
                return this.mTag;
            }

            public ParcelableVolumeInfo getVolumeAttributes() {
                ParcelableVolumeInfo parcelableVolumeInfo;
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null) {
                    return null;
                }
                synchronized (mediaSessionImplBase.mLock) {
                    try {
                        int i = mediaSessionImplBase.mVolumeType;
                        int i2 = mediaSessionImplBase.mLocalStream;
                        if (i != 2) {
                            parcelableVolumeInfo = new ParcelableVolumeInfo(i, i2, 2, mediaSessionImplBase.mAudioManager.getStreamMaxVolume(i2), mediaSessionImplBase.mAudioManager.getStreamVolume(i2));
                        } else {
                            throw null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return parcelableVolumeInfo;
            }

            public boolean isCaptioningEnabled() {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                return mediaSessionImplBase != null && mediaSessionImplBase.mCaptioningEnabled;
            }

            public boolean isShuffleModeEnabledRemoved() {
                return false;
            }

            public boolean isTransportControlEnabled() {
                return true;
            }

            public void next() {
                postToHandler(14);
            }

            public void pause() {
                postToHandler(12);
            }

            public void play() throws RemoteException {
                postToHandler(7);
            }

            public void playFromMediaId(String str, Bundle bundle) {
                postToHandler(8, str, bundle);
            }

            public void playFromSearch(String str, Bundle bundle) {
                postToHandler(9, str, bundle);
            }

            public void playFromUri(Uri uri, Bundle bundle) {
                postToHandler(10, uri, bundle);
            }

            public void postToHandler(int i) {
                postToHandler(i, (Object) null, 0, (Bundle) null);
            }

            public void prepare() throws RemoteException {
                postToHandler(3);
            }

            public void prepareFromMediaId(String str, Bundle bundle) {
                postToHandler(4, str, bundle);
            }

            public void prepareFromSearch(String str, Bundle bundle) {
                postToHandler(5, str, bundle);
            }

            public void prepareFromUri(Uri uri, Bundle bundle) {
                postToHandler(6, uri, bundle);
            }

            public void previous() {
                postToHandler(15);
            }

            public void rate(RatingCompat ratingCompat) {
                postToHandler(19, (Object) ratingCompat);
            }

            public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) {
                postToHandler(31, ratingCompat, bundle);
            }

            public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null) {
                    try {
                        iMediaControllerCallback.onSessionDestroyed();
                    } catch (Exception unused) {
                    }
                } else {
                    int callingPid = Binder.getCallingPid();
                    int callingUid = Binder.getCallingUid();
                    mediaSessionImplBase.mControllerCallbacks.register(iMediaControllerCallback, new my8(mediaSessionImplBase.getPackageNameForUid(callingUid), callingPid, callingUid));
                    synchronized (mediaSessionImplBase.mLock) {
                        try {
                            RegistrationCallbackHandler registrationCallbackHandler = mediaSessionImplBase.mRegistrationCallbackHandler;
                            if (registrationCallbackHandler != null) {
                                registrationCallbackHandler.postCallbackRegistered(callingPid, callingUid);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }

            public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                postToHandler(27, (Object) mediaDescriptionCompat);
            }

            public void removeQueueItemAt(int i) {
                postToHandler(28, i);
            }

            public void rewind() {
                postToHandler(17);
            }

            public void seekTo(long j) {
                postToHandler(18, (Object) Long.valueOf(j));
            }

            public void sendCommand(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                postToHandler(1, (Object) new Command(str, bundle, resultReceiverWrapper == null ? null : resultReceiverWrapper.mResultReceiver));
            }

            public void sendCustomAction(String str, Bundle bundle) throws RemoteException {
                postToHandler(20, str, bundle);
            }

            public boolean sendMediaButton(KeyEvent keyEvent) {
                postToHandler(21, (Object) keyEvent);
                return true;
            }

            public void setCaptioningEnabled(boolean z) {
                postToHandler(29, (Object) Boolean.valueOf(z));
            }

            public void setPlaybackSpeed(float f) {
                postToHandler(32, (Object) Float.valueOf(f));
            }

            public void setRepeatMode(int i) {
                postToHandler(23, i);
            }

            public void setShuffleMode(int i) {
                postToHandler(30, i);
            }

            public void setShuffleModeEnabledRemoved(boolean z) {
            }

            public void setVolumeTo(int i, int i2, String str) {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    mediaSessionImplBase.setVolumeTo(i, i2);
                }
            }

            public void skipToQueueItem(long j) {
                postToHandler(11, (Object) Long.valueOf(j));
            }

            public void stop() {
                postToHandler(13);
            }

            public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    mediaSessionImplBase.mControllerCallbacks.unregister(iMediaControllerCallback);
                    int callingPid = Binder.getCallingPid();
                    int callingUid = Binder.getCallingUid();
                    synchronized (mediaSessionImplBase.mLock) {
                        try {
                            RegistrationCallbackHandler registrationCallbackHandler = mediaSessionImplBase.mRegistrationCallbackHandler;
                            if (registrationCallbackHandler != null) {
                                registrationCallbackHandler.postCallbackUnregistered(callingPid, callingUid);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }

            public void postToHandler(int i, int i2) {
                postToHandler(i, (Object) null, i2, (Bundle) null);
            }

            public void postToHandler(int i, Object obj) {
                postToHandler(i, obj, 0, (Bundle) null);
            }

            public void postToHandler(int i, Object obj, Bundle bundle) {
                postToHandler(i, obj, 0, bundle);
            }

            public void postToHandler(int i, Object obj, int i2, Bundle bundle) {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    mediaSessionImplBase.postToHandler(i, i2, 0, obj, bundle);
                }
            }
        }

        public class MessageHandler extends Handler {
            private static final int KEYCODE_MEDIA_PAUSE = 127;
            private static final int KEYCODE_MEDIA_PLAY = 126;
            private static final int MSG_ADD_QUEUE_ITEM = 25;
            private static final int MSG_ADD_QUEUE_ITEM_AT = 26;
            private static final int MSG_ADJUST_VOLUME = 2;
            private static final int MSG_COMMAND = 1;
            private static final int MSG_CUSTOM_ACTION = 20;
            private static final int MSG_FAST_FORWARD = 16;
            private static final int MSG_MEDIA_BUTTON = 21;
            private static final int MSG_NEXT = 14;
            private static final int MSG_PAUSE = 12;
            private static final int MSG_PLAY = 7;
            private static final int MSG_PLAY_MEDIA_ID = 8;
            private static final int MSG_PLAY_SEARCH = 9;
            private static final int MSG_PLAY_URI = 10;
            private static final int MSG_PREPARE = 3;
            private static final int MSG_PREPARE_MEDIA_ID = 4;
            private static final int MSG_PREPARE_SEARCH = 5;
            private static final int MSG_PREPARE_URI = 6;
            private static final int MSG_PREVIOUS = 15;
            private static final int MSG_RATE = 19;
            private static final int MSG_RATE_EXTRA = 31;
            private static final int MSG_REMOVE_QUEUE_ITEM = 27;
            private static final int MSG_REMOVE_QUEUE_ITEM_AT = 28;
            private static final int MSG_REWIND = 17;
            private static final int MSG_SEEK_TO = 18;
            private static final int MSG_SET_CAPTIONING_ENABLED = 29;
            private static final int MSG_SET_PLAYBACK_SPEED = 32;
            private static final int MSG_SET_REPEAT_MODE = 23;
            private static final int MSG_SET_SHUFFLE_MODE = 30;
            private static final int MSG_SET_VOLUME = 22;
            private static final int MSG_SKIP_TO_ITEM = 11;
            private static final int MSG_STOP = 13;

            public MessageHandler(Looper looper) {
                super(looper);
            }

            private void onMediaButtonEvent(KeyEvent keyEvent, Callback callback) {
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    PlaybackStateCompat playbackStateCompat = MediaSessionImplBase.this.mState;
                    long actions = playbackStateCompat == null ? 0 : playbackStateCompat.getActions();
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != KEYCODE_MEDIA_PLAY) {
                        if (keyCode != KEYCODE_MEDIA_PAUSE) {
                            switch (keyCode) {
                                case 86:
                                    if ((1 & actions) != 0) {
                                        callback.onStop();
                                        return;
                                    }
                                    return;
                                case 87:
                                    if ((32 & actions) != 0) {
                                        callback.onSkipToNext();
                                        return;
                                    }
                                    return;
                                case 88:
                                    if ((16 & actions) != 0) {
                                        callback.onSkipToPrevious();
                                        return;
                                    }
                                    return;
                                case 89:
                                    if ((8 & actions) != 0) {
                                        callback.onRewind();
                                        return;
                                    }
                                    return;
                                case 90:
                                    if ((64 & actions) != 0) {
                                        callback.onFastForward();
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        } else if ((2 & actions) != 0) {
                            callback.onPause();
                        }
                    } else if ((4 & actions) != 0) {
                        callback.onPlay();
                    }
                }
            }

            public void handleMessage(Message message) {
                Callback callback = MediaSessionImplBase.this.mCallback;
                if (callback != null) {
                    Bundle data = message.getData();
                    MediaSessionCompat.ensureClassLoader(data);
                    MediaSessionImplBase.this.setCurrentControllerInfo(new my8(data.getString(MediaSessionCompat.DATA_CALLING_PACKAGE), data.getInt(MediaSessionCompat.DATA_CALLING_PID), data.getInt(MediaSessionCompat.DATA_CALLING_UID)));
                    Bundle bundle = data.getBundle(MediaSessionCompat.DATA_EXTRAS);
                    MediaSessionCompat.ensureClassLoader(bundle);
                    try {
                        switch (message.what) {
                            case 1:
                                Command command = (Command) message.obj;
                                callback.onCommand(command.command, command.extras, command.stub);
                                break;
                            case 2:
                                MediaSessionImplBase.this.adjustVolume(message.arg1, 0);
                                break;
                            case 3:
                                callback.onPrepare();
                                break;
                            case 4:
                                callback.onPrepareFromMediaId((String) message.obj, bundle);
                                break;
                            case 5:
                                callback.onPrepareFromSearch((String) message.obj, bundle);
                                break;
                            case 6:
                                callback.onPrepareFromUri((Uri) message.obj, bundle);
                                break;
                            case 7:
                                callback.onPlay();
                                break;
                            case 8:
                                callback.onPlayFromMediaId((String) message.obj, bundle);
                                break;
                            case 9:
                                callback.onPlayFromSearch((String) message.obj, bundle);
                                break;
                            case 10:
                                callback.onPlayFromUri((Uri) message.obj, bundle);
                                break;
                            case 11:
                                callback.onSkipToQueueItem(((Long) message.obj).longValue());
                                break;
                            case 12:
                                callback.onPause();
                                break;
                            case 13:
                                callback.onStop();
                                break;
                            case 14:
                                callback.onSkipToNext();
                                break;
                            case 15:
                                callback.onSkipToPrevious();
                                break;
                            case 16:
                                callback.onFastForward();
                                break;
                            case 17:
                                callback.onRewind();
                                break;
                            case MSG_SEEK_TO /*18*/:
                                callback.onSeekTo(((Long) message.obj).longValue());
                                break;
                            case MSG_RATE /*19*/:
                                callback.onSetRating((RatingCompat) message.obj);
                                break;
                            case 20:
                                callback.onCustomAction((String) message.obj, bundle);
                                break;
                            case MSG_MEDIA_BUTTON /*21*/:
                                KeyEvent keyEvent = (KeyEvent) message.obj;
                                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                                intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                                if (!callback.onMediaButtonEvent(intent)) {
                                    onMediaButtonEvent(keyEvent, callback);
                                    break;
                                }
                                break;
                            case MSG_SET_VOLUME /*22*/:
                                MediaSessionImplBase.this.setVolumeTo(message.arg1, 0);
                                break;
                            case MSG_SET_REPEAT_MODE /*23*/:
                                callback.onSetRepeatMode(message.arg1);
                                break;
                            case MSG_ADD_QUEUE_ITEM /*25*/:
                                callback.onAddQueueItem((MediaDescriptionCompat) message.obj);
                                break;
                            case MSG_ADD_QUEUE_ITEM_AT /*26*/:
                                callback.onAddQueueItem((MediaDescriptionCompat) message.obj, message.arg1);
                                break;
                            case MSG_REMOVE_QUEUE_ITEM /*27*/:
                                callback.onRemoveQueueItem((MediaDescriptionCompat) message.obj);
                                break;
                            case MSG_REMOVE_QUEUE_ITEM_AT /*28*/:
                                List<QueueItem> list = MediaSessionImplBase.this.mQueue;
                                if (list != null) {
                                    int i = message.arg1;
                                    QueueItem queueItem = (i < 0 || i >= list.size()) ? null : MediaSessionImplBase.this.mQueue.get(message.arg1);
                                    if (queueItem != null) {
                                        callback.onRemoveQueueItem(queueItem.getDescription());
                                        break;
                                    }
                                }
                                break;
                            case MSG_SET_CAPTIONING_ENABLED /*29*/:
                                callback.onSetCaptioningEnabled(((Boolean) message.obj).booleanValue());
                                break;
                            case MSG_SET_SHUFFLE_MODE /*30*/:
                                callback.onSetShuffleMode(message.arg1);
                                break;
                            case MSG_RATE_EXTRA /*31*/:
                                callback.onSetRating((RatingCompat) message.obj, bundle);
                                break;
                            case 32:
                                callback.onSetPlaybackSpeed(((Float) message.obj).floatValue());
                                break;
                        }
                    } finally {
                        MediaSessionImplBase.this.setCurrentControllerInfo((my8) null);
                    }
                }
            }
        }

        public MediaSessionImplBase(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, t2g t2g, Bundle bundle) {
            if (componentName != null) {
                this.mContext = context;
                this.mSessionInfo = bundle;
                this.mAudioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                this.mMediaButtonReceiverComponentName = componentName;
                this.mMediaButtonReceiverIntent = pendingIntent;
                MediaSessionStub mediaSessionStub = new MediaSessionStub(this, context.getPackageName(), str);
                this.mStub = mediaSessionStub;
                this.mToken = new Token(mediaSessionStub, (IMediaSession) null, t2g);
                this.mRatingType = 0;
                this.mVolumeType = 1;
                this.mLocalStream = 3;
                this.mRcc = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null");
        }

        private void sendCaptioningEnabled(boolean z) {
            synchronized (this.mLock) {
                for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.mControllerCallbacks.getBroadcastItem(beginBroadcast).onCaptioningEnabledChanged(z);
                    } catch (RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendEvent(String str, Bundle bundle) {
            synchronized (this.mLock) {
                for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.mControllerCallbacks.getBroadcastItem(beginBroadcast).onEvent(str, bundle);
                    } catch (RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendExtras(Bundle bundle) {
            synchronized (this.mLock) {
                for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.mControllerCallbacks.getBroadcastItem(beginBroadcast).onExtrasChanged(bundle);
                    } catch (RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendMetadata(MediaMetadataCompat mediaMetadataCompat) {
            synchronized (this.mLock) {
                for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.mControllerCallbacks.getBroadcastItem(beginBroadcast).onMetadataChanged(mediaMetadataCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendQueue(List<QueueItem> list) {
            synchronized (this.mLock) {
                for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.mControllerCallbacks.getBroadcastItem(beginBroadcast).onQueueChanged(list);
                    } catch (RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendQueueTitle(CharSequence charSequence) {
            synchronized (this.mLock) {
                for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.mControllerCallbacks.getBroadcastItem(beginBroadcast).onQueueTitleChanged(charSequence);
                    } catch (RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendRepeatMode(int i) {
            synchronized (this.mLock) {
                for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.mControllerCallbacks.getBroadcastItem(beginBroadcast).onRepeatModeChanged(i);
                    } catch (RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendSessionDestroyed() {
            synchronized (this.mLock) {
                for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.mControllerCallbacks.getBroadcastItem(beginBroadcast).onSessionDestroyed();
                    } catch (RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
                this.mControllerCallbacks.kill();
            }
        }

        private void sendShuffleMode(int i) {
            synchronized (this.mLock) {
                for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.mControllerCallbacks.getBroadcastItem(beginBroadcast).onShuffleModeChanged(i);
                    } catch (RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendState(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.mLock) {
                for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.mControllerCallbacks.getBroadcastItem(beginBroadcast).onPlaybackStateChanged(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        public void adjustVolume(int i, int i2) {
            if (this.mVolumeType != 2) {
                this.mAudioManager.adjustStreamVolume(this.mLocalStream, i, i2);
            }
        }

        public RemoteControlClient.MetadataEditor buildRccMetadata(Bundle bundle) {
            RemoteControlClient.MetadataEditor editMetadata = this.mRcc.editMetadata(true);
            if (bundle == null) {
                return editMetadata;
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ART)) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_ART);
                if (bitmap != null) {
                    bitmap = bitmap.copy(bitmap.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap);
            } else if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ALBUM_ART)) {
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_ALBUM_ART);
                if (bitmap2 != null) {
                    bitmap2 = bitmap2.copy(bitmap2.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap2);
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ALBUM)) {
                editMetadata.putString(1, bundle.getString(MediaMetadataCompat.METADATA_KEY_ALBUM));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST)) {
                editMetadata.putString(13, bundle.getString(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ARTIST)) {
                editMetadata.putString(2, bundle.getString(MediaMetadataCompat.METADATA_KEY_ARTIST));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_AUTHOR)) {
                editMetadata.putString(3, bundle.getString(MediaMetadataCompat.METADATA_KEY_AUTHOR));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_COMPILATION)) {
                editMetadata.putString(15, bundle.getString(MediaMetadataCompat.METADATA_KEY_COMPILATION));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_COMPOSER)) {
                editMetadata.putString(4, bundle.getString(MediaMetadataCompat.METADATA_KEY_COMPOSER));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_DATE)) {
                editMetadata.putString(5, bundle.getString(MediaMetadataCompat.METADATA_KEY_DATE));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_DISC_NUMBER)) {
                editMetadata.putLong(14, bundle.getLong(MediaMetadataCompat.METADATA_KEY_DISC_NUMBER));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
                editMetadata.putLong(9, bundle.getLong(MediaMetadataCompat.METADATA_KEY_DURATION));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_GENRE)) {
                editMetadata.putString(6, bundle.getString(MediaMetadataCompat.METADATA_KEY_GENRE));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_TITLE)) {
                editMetadata.putString(7, bundle.getString(MediaMetadataCompat.METADATA_KEY_TITLE));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER)) {
                editMetadata.putLong(0, bundle.getLong(MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_WRITER)) {
                editMetadata.putString(11, bundle.getString(MediaMetadataCompat.METADATA_KEY_WRITER));
            }
            return editMetadata;
        }

        public Callback getCallback() {
            Callback callback;
            synchronized (this.mLock) {
                callback = this.mCallback;
            }
            return callback;
        }

        public String getCallingPackage() {
            return null;
        }

        public my8 getCurrentControllerInfo() {
            my8 my8;
            synchronized (this.mLock) {
                my8 = this.mRemoteUserInfo;
            }
            return my8;
        }

        public Object getMediaSession() {
            return null;
        }

        public String getPackageNameForUid(int i) {
            String nameForUid = this.mContext.getPackageManager().getNameForUid(i);
            return TextUtils.isEmpty(nameForUid) ? "android.media.session.MediaController" : nameForUid;
        }

        public PlaybackStateCompat getPlaybackState() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.mLock) {
                playbackStateCompat = this.mState;
            }
            return playbackStateCompat;
        }

        public int getRccStateFromState(int i) {
            switch (i) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        public int getRccTransportControlFlagsFromActions(long j) {
            int i = (1 & j) != 0 ? 32 : 0;
            if ((2 & j) != 0) {
                i |= 16;
            }
            if ((4 & j) != 0) {
                i |= 4;
            }
            if ((8 & j) != 0) {
                i |= 2;
            }
            if ((16 & j) != 0) {
                i |= 1;
            }
            if ((32 & j) != 0) {
                i |= Uuid.SIZE_BITS;
            }
            if ((64 & j) != 0) {
                i |= 64;
            }
            return (j & 512) != 0 ? i | 8 : i;
        }

        public Object getRemoteControlClient() {
            return null;
        }

        public Token getSessionToken() {
            return this.mToken;
        }

        public boolean isActive() {
            return this.mIsActive;
        }

        public void postToHandler(int i, int i2, int i3, Object obj, Bundle bundle) {
            synchronized (this.mLock) {
                try {
                    MessageHandler messageHandler = this.mHandler;
                    if (messageHandler != null) {
                        Message obtainMessage = messageHandler.obtainMessage(i, i2, i3, obj);
                        Bundle bundle2 = new Bundle();
                        int callingUid = Binder.getCallingUid();
                        bundle2.putInt(MediaSessionCompat.DATA_CALLING_UID, callingUid);
                        bundle2.putString(MediaSessionCompat.DATA_CALLING_PACKAGE, getPackageNameForUid(callingUid));
                        int callingPid = Binder.getCallingPid();
                        if (callingPid > 0) {
                            bundle2.putInt(MediaSessionCompat.DATA_CALLING_PID, callingPid);
                        } else {
                            bundle2.putInt(MediaSessionCompat.DATA_CALLING_PID, -1);
                        }
                        if (bundle != null) {
                            bundle2.putBundle(MediaSessionCompat.DATA_EXTRAS, bundle);
                        }
                        obtainMessage.setData(bundle2);
                        obtainMessage.sendToTarget();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void registerMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
            this.mAudioManager.registerMediaButtonEventReceiver(componentName);
        }

        public void release() {
            this.mIsActive = false;
            this.mDestroyed = true;
            updateMbrAndRcc();
            sendSessionDestroyed();
            setCallback((Callback) null, (Handler) null);
        }

        public void sendSessionEvent(String str, Bundle bundle) {
            sendEvent(str, bundle);
        }

        public void sendVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) {
            synchronized (this.mLock) {
                for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.mControllerCallbacks.getBroadcastItem(beginBroadcast).onVolumeInfoChanged(parcelableVolumeInfo);
                    } catch (RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        public void setActive(boolean z) {
            if (z != this.mIsActive) {
                this.mIsActive = z;
                updateMbrAndRcc();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0033 A[Catch:{ all -> 0x000c }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void setCallback(android.support.v4.media.session.MediaSessionCompat.Callback r5, android.os.Handler r6) {
            /*
                r4 = this;
                java.lang.Object r0 = r4.mLock
                monitor-enter(r0)
                android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$MessageHandler r1 = r4.mHandler     // Catch:{ all -> 0x000c }
                r2 = 0
                if (r1 == 0) goto L_0x000e
                r1.removeCallbacksAndMessages(r2)     // Catch:{ all -> 0x000c }
                goto L_0x000e
            L_0x000c:
                r4 = move-exception
                goto L_0x003a
            L_0x000e:
                if (r5 == 0) goto L_0x001d
                if (r6 != 0) goto L_0x0013
                goto L_0x001d
            L_0x0013:
                android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$MessageHandler r1 = new android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$MessageHandler     // Catch:{ all -> 0x000c }
                android.os.Looper r3 = r6.getLooper()     // Catch:{ all -> 0x000c }
                r1.<init>(r3)     // Catch:{ all -> 0x000c }
                goto L_0x001e
            L_0x001d:
                r1 = r2
            L_0x001e:
                r4.mHandler = r1     // Catch:{ all -> 0x000c }
                android.support.v4.media.session.MediaSessionCompat$Callback r1 = r4.mCallback     // Catch:{ all -> 0x000c }
                if (r1 == r5) goto L_0x002d
                android.support.v4.media.session.MediaSessionCompat$Callback r1 = r4.mCallback     // Catch:{ all -> 0x000c }
                if (r1 == 0) goto L_0x002d
                android.support.v4.media.session.MediaSessionCompat$Callback r1 = r4.mCallback     // Catch:{ all -> 0x000c }
                r1.setSessionImpl(r2, r2)     // Catch:{ all -> 0x000c }
            L_0x002d:
                r4.mCallback = r5     // Catch:{ all -> 0x000c }
                android.support.v4.media.session.MediaSessionCompat$Callback r5 = r4.mCallback     // Catch:{ all -> 0x000c }
                if (r5 == 0) goto L_0x0038
                android.support.v4.media.session.MediaSessionCompat$Callback r5 = r4.mCallback     // Catch:{ all -> 0x000c }
                r5.setSessionImpl(r4, r6)     // Catch:{ all -> 0x000c }
            L_0x0038:
                monitor-exit(r0)     // Catch:{ all -> 0x000c }
                return
            L_0x003a:
                monitor-exit(r0)     // Catch:{ all -> 0x000c }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.setCallback(android.support.v4.media.session.MediaSessionCompat$Callback, android.os.Handler):void");
        }

        public void setCaptioningEnabled(boolean z) {
            if (this.mCaptioningEnabled != z) {
                this.mCaptioningEnabled = z;
                sendCaptioningEnabled(z);
            }
        }

        public void setCurrentControllerInfo(my8 my8) {
            synchronized (this.mLock) {
                this.mRemoteUserInfo = my8;
            }
        }

        public void setExtras(Bundle bundle) {
            this.mExtras = bundle;
            sendExtras(bundle);
        }

        public void setFlags(int i) {
            synchronized (this.mLock) {
                this.mFlags = i | 3;
            }
        }

        public void setMediaButtonReceiver(PendingIntent pendingIntent) {
        }

        public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.Builder(mediaMetadataCompat, MediaSessionCompat.sMaxBitmapSize).build();
            }
            synchronized (this.mLock) {
                this.mMetadata = mediaMetadataCompat;
            }
            sendMetadata(mediaMetadataCompat);
            if (this.mIsActive) {
                buildRccMetadata(mediaMetadataCompat == null ? null : mediaMetadataCompat.getBundle()).apply();
            }
        }

        public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.mLock) {
                this.mState = playbackStateCompat;
            }
            sendState(playbackStateCompat);
            if (this.mIsActive) {
                if (playbackStateCompat == null) {
                    this.mRcc.setPlaybackState(0);
                    this.mRcc.setTransportControlFlags(0);
                    return;
                }
                setRccState(playbackStateCompat);
                this.mRcc.setTransportControlFlags(getRccTransportControlFlagsFromActions(playbackStateCompat.getActions()));
            }
        }

        public void setPlaybackToLocal(int i) {
            this.mLocalStream = i;
            this.mVolumeType = 1;
            int i2 = this.mVolumeType;
            int i3 = this.mLocalStream;
            sendVolumeInfoChanged(new ParcelableVolumeInfo(i2, i3, 2, this.mAudioManager.getStreamMaxVolume(i3), this.mAudioManager.getStreamVolume(this.mLocalStream)));
        }

        public void setPlaybackToRemote(ceg ceg) {
            throw new IllegalArgumentException("volumeProvider may not be null");
        }

        public void setQueue(List<QueueItem> list) {
            this.mQueue = list;
            sendQueue(list);
        }

        public void setQueueTitle(CharSequence charSequence) {
            this.mQueueTitle = charSequence;
            sendQueueTitle(charSequence);
        }

        public void setRatingType(int i) {
            this.mRatingType = i;
        }

        public void setRccState(PlaybackStateCompat playbackStateCompat) {
            this.mRcc.setPlaybackState(getRccStateFromState(playbackStateCompat.getState()));
        }

        public void setRegistrationCallback(RegistrationCallback registrationCallback, Handler handler) {
            synchronized (this.mLock) {
                try {
                    RegistrationCallbackHandler registrationCallbackHandler = this.mRegistrationCallbackHandler;
                    if (registrationCallbackHandler != null) {
                        registrationCallbackHandler.removeCallbacksAndMessages((Object) null);
                    }
                    if (registrationCallback != null) {
                        this.mRegistrationCallbackHandler = new RegistrationCallbackHandler(handler.getLooper(), registrationCallback);
                    } else {
                        this.mRegistrationCallbackHandler = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void setRepeatMode(int i) {
            if (this.mRepeatMode != i) {
                this.mRepeatMode = i;
                sendRepeatMode(i);
            }
        }

        public void setSessionActivity(PendingIntent pendingIntent) {
            synchronized (this.mLock) {
                this.mSessionActivity = pendingIntent;
            }
        }

        public void setShuffleMode(int i) {
            if (this.mShuffleMode != i) {
                this.mShuffleMode = i;
                sendShuffleMode(i);
            }
        }

        public void setVolumeTo(int i, int i2) {
            if (this.mVolumeType != 2) {
                this.mAudioManager.setStreamVolume(this.mLocalStream, i, i2);
            }
        }

        public void unregisterMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
            this.mAudioManager.unregisterMediaButtonEventReceiver(componentName);
        }

        public void updateMbrAndRcc() {
            if (this.mIsActive) {
                registerMediaButtonEventReceiver(this.mMediaButtonReceiverIntent, this.mMediaButtonReceiverComponentName);
                this.mAudioManager.registerRemoteControlClient(this.mRcc);
                setMetadata(this.mMetadata);
                setPlaybackState(this.mState);
                return;
            }
            unregisterMediaButtonEventReceiver(this.mMediaButtonReceiverIntent, this.mMediaButtonReceiverComponentName);
            this.mRcc.setPlaybackState(0);
            this.mAudioManager.unregisterRemoteControlClient(this.mRcc);
        }
    }

    public interface OnActiveChangeListener {
        void onActiveChanged();
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator<QueueItem>() {
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        };
        public static final int UNKNOWN_ID = -1;
        private final MediaDescriptionCompat mDescription;
        private final long mId;
        private MediaSession.QueueItem mItemFwk;

        public static class Api21Impl {
            private Api21Impl() {
            }

            public static MediaSession.QueueItem createQueueItem(MediaDescription mediaDescription, long j) {
                return new MediaSession.QueueItem(mediaDescription, j);
            }

            public static MediaDescription getDescription(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            public static long getQueueId(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
            this((MediaSession.QueueItem) null, mediaDescriptionCompat, j);
        }

        public static QueueItem fromQueueItem(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.fromMediaDescription(Api21Impl.getDescription(queueItem)), Api21Impl.getQueueId(queueItem));
        }

        public static List<QueueItem> fromQueueItemList(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object fromQueueItem : list) {
                arrayList.add(fromQueueItem(fromQueueItem));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public MediaDescriptionCompat getDescription() {
            return this.mDescription;
        }

        public long getQueueId() {
            return this.mId;
        }

        public Object getQueueItem() {
            MediaSession.QueueItem queueItem = this.mItemFwk;
            if (queueItem != null) {
                return queueItem;
            }
            MediaSession.QueueItem createQueueItem = Api21Impl.createQueueItem((MediaDescription) this.mDescription.getMediaDescription(), this.mId);
            this.mItemFwk = createQueueItem;
            return createQueueItem;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
            sb.append(this.mDescription);
            sb.append(", Id=");
            return wj6.m(sb, this.mId, " }");
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.mDescription.writeToParcel(parcel, i);
            parcel.writeLong(this.mId);
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            } else if (j != -1) {
                this.mDescription = mediaDescriptionCompat;
                this.mId = j;
                this.mItemFwk = queueItem;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        public QueueItem(Parcel parcel) {
            this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.mId = parcel.readLong();
        }
    }

    public interface RegistrationCallback {
        void onCallbackRegistered(int i, int i2);

        void onCallbackUnregistered(int i, int i2);
    }

    public static final class RegistrationCallbackHandler extends Handler {
        private static final int MSG_CALLBACK_REGISTERED = 1001;
        private static final int MSG_CALLBACK_UNREGISTERED = 1002;
        private final RegistrationCallback mCallback;

        public RegistrationCallbackHandler(Looper looper, RegistrationCallback registrationCallback) {
            super(looper);
            this.mCallback = registrationCallback;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1001) {
                this.mCallback.onCallbackRegistered(message.arg1, message.arg2);
            } else if (i == MSG_CALLBACK_UNREGISTERED) {
                this.mCallback.onCallbackUnregistered(message.arg1, message.arg2);
            }
        }

        public void postCallbackRegistered(int i, int i2) {
            obtainMessage(1001, i, i2).sendToTarget();
        }

        public void postCallbackUnregistered(int i, int i2) {
            obtainMessage(MSG_CALLBACK_UNREGISTERED, i, i2).sendToTarget();
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator<Token>() {
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null));
            }

            public Token[] newArray(int i) {
                return new Token[i];
            }
        };
        private IMediaSession mExtraBinder;
        private final Object mInner;
        private final Object mLock;
        private t2g mSession2Token;

        public Token(Object obj) {
            this(obj, (IMediaSession) null, (t2g) null);
        }

        public static Token fromBundle(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            bundle.setClassLoader(Token.class.getClassLoader());
            IMediaSession asInterface = IMediaSession.Stub.asInterface(bundle.getBinder(MediaSessionCompat.KEY_EXTRA_BINDER));
            t2g A = i8b.A(bundle);
            Token token = (Token) bundle.getParcelable(MediaSessionCompat.KEY_TOKEN);
            if (token == null) {
                return null;
            }
            return new Token(token.mInner, asInterface, A);
        }

        public static Token fromToken(Object obj) {
            return fromToken(obj, (IMediaSession) null);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.mInner;
            if (obj2 == null) {
                return token.mInner == null;
            }
            Object obj3 = token.mInner;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public IMediaSession getExtraBinder() {
            IMediaSession iMediaSession;
            synchronized (this.mLock) {
                iMediaSession = this.mExtraBinder;
            }
            return iMediaSession;
        }

        public t2g getSession2Token() {
            t2g t2g;
            synchronized (this.mLock) {
                t2g = this.mSession2Token;
            }
            return t2g;
        }

        public Object getToken() {
            return this.mInner;
        }

        public int hashCode() {
            Object obj = this.mInner;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void setExtraBinder(IMediaSession iMediaSession) {
            synchronized (this.mLock) {
                this.mExtraBinder = iMediaSession;
            }
        }

        public void setSession2Token(t2g t2g) {
            synchronized (this.mLock) {
                this.mSession2Token = t2g;
            }
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaSessionCompat.KEY_TOKEN, this);
            synchronized (this.mLock) {
                try {
                    IMediaSession iMediaSession = this.mExtraBinder;
                    if (iMediaSession != null) {
                        bundle.putBinder(MediaSessionCompat.KEY_EXTRA_BINDER, iMediaSession.asBinder());
                    }
                    t2g t2g = this.mSession2Token;
                    if (t2g != null) {
                        i8b.M(bundle, t2g);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bundle;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.mInner, i);
        }

        public Token(Object obj, IMediaSession iMediaSession) {
            this(obj, iMediaSession, (t2g) null);
        }

        public static Token fromToken(Object obj, IMediaSession iMediaSession) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, iMediaSession);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        public Token(Object obj, IMediaSession iMediaSession, t2g t2g) {
            this.mLock = new Object();
            this.mInner = obj;
            this.mExtraBinder = iMediaSession;
            this.mSession2Token = t2g;
        }
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, (ComponentName) null, (PendingIntent) null);
    }

    public static void ensureClassLoader(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static MediaSessionCompat fromMediaSession(Context context, Object obj) {
        if (context == null || obj == null) {
            return null;
        }
        return new MediaSessionCompat(context, (MediaSessionImpl) new MediaSessionImplApi29(obj));
    }

    public static PlaybackStateCompat getStateWithUpdatedPosition(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j = -1;
        if (playbackStateCompat.getPosition() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.getState() != 3 && playbackStateCompat.getState() != 4 && playbackStateCompat.getState() != 5) {
            return playbackStateCompat;
        }
        long lastPositionUpdateTime = playbackStateCompat.getLastPositionUpdateTime();
        if (lastPositionUpdateTime <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long position = playbackStateCompat.getPosition() + ((long) (playbackStateCompat.getPlaybackSpeed() * ((float) (elapsedRealtime - lastPositionUpdateTime))));
        if (mediaMetadataCompat != null && mediaMetadataCompat.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
            j = mediaMetadataCompat.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
        }
        return new PlaybackStateCompat.Builder(playbackStateCompat).setState(playbackStateCompat.getState(), (j < 0 || position <= j) ? position < 0 ? 0 : position : j, playbackStateCompat.getPlaybackSpeed(), elapsedRealtime).build();
    }

    public static Bundle unparcelWithClassLoader(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ensureClassLoader(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            return null;
        }
    }

    public void addOnActiveChangeListener(OnActiveChangeListener onActiveChangeListener) {
        if (onActiveChangeListener != null) {
            this.mActiveListeners.add(onActiveChangeListener);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    public String getCallingPackage() {
        return this.mImpl.getCallingPackage();
    }

    public MediaControllerCompat getController() {
        return this.mController;
    }

    public final my8 getCurrentControllerInfo() {
        return this.mImpl.getCurrentControllerInfo();
    }

    public Object getMediaSession() {
        return this.mImpl.getMediaSession();
    }

    public Object getRemoteControlClient() {
        return this.mImpl.getRemoteControlClient();
    }

    public Token getSessionToken() {
        return this.mImpl.getSessionToken();
    }

    public boolean isActive() {
        return this.mImpl.isActive();
    }

    public void release() {
        this.mImpl.release();
    }

    public void removeOnActiveChangeListener(OnActiveChangeListener onActiveChangeListener) {
        if (onActiveChangeListener != null) {
            this.mActiveListeners.remove(onActiveChangeListener);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    public void sendSessionEvent(String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.mImpl.sendSessionEvent(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    public void setActive(boolean z) {
        this.mImpl.setActive(z);
        Iterator<OnActiveChangeListener> it = this.mActiveListeners.iterator();
        while (it.hasNext()) {
            it.next().onActiveChanged();
        }
    }

    public void setCallback(Callback callback) {
        setCallback(callback, (Handler) null);
    }

    public void setCaptioningEnabled(boolean z) {
        this.mImpl.setCaptioningEnabled(z);
    }

    public void setExtras(Bundle bundle) {
        this.mImpl.setExtras(bundle);
    }

    public void setFlags(int i) {
        this.mImpl.setFlags(i);
    }

    public void setMediaButtonReceiver(PendingIntent pendingIntent) {
        this.mImpl.setMediaButtonReceiver(pendingIntent);
    }

    public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
        this.mImpl.setMetadata(mediaMetadataCompat);
    }

    public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
        this.mImpl.setPlaybackState(playbackStateCompat);
    }

    public void setPlaybackToLocal(int i) {
        this.mImpl.setPlaybackToLocal(i);
    }

    public void setPlaybackToRemote(ceg ceg) {
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }

    public void setQueue(List<QueueItem> list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            for (QueueItem next : list) {
                if (next != null) {
                    if (hashSet.contains(Long.valueOf(next.getQueueId()))) {
                        next.getQueueId();
                        new IllegalArgumentException("id of each queue item should be unique");
                    }
                    hashSet.add(Long.valueOf(next.getQueueId()));
                } else {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
            }
        }
        this.mImpl.setQueue(list);
    }

    public void setQueueTitle(CharSequence charSequence) {
        this.mImpl.setQueueTitle(charSequence);
    }

    public void setRatingType(int i) {
        this.mImpl.setRatingType(i);
    }

    public void setRegistrationCallback(RegistrationCallback registrationCallback, Handler handler) {
        this.mImpl.setRegistrationCallback(registrationCallback, handler);
    }

    public void setRepeatMode(int i) {
        this.mImpl.setRepeatMode(i);
    }

    public void setSessionActivity(PendingIntent pendingIntent) {
        this.mImpl.setSessionActivity(pendingIntent);
    }

    public void setShuffleMode(int i) {
        this.mImpl.setShuffleMode(i);
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator<ResultReceiverWrapper>() {
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        };
        ResultReceiver mResultReceiver;

        public ResultReceiverWrapper(ResultReceiver resultReceiver) {
            this.mResultReceiver = resultReceiver;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.mResultReceiver.writeToParcel(parcel, i);
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.mResultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, (Bundle) null);
    }

    public void setCallback(Callback callback, Handler handler) {
        if (callback == null) {
            this.mImpl.setCallback((Callback) null, (Handler) null);
            return;
        }
        MediaSessionImpl mediaSessionImpl = this.mImpl;
        if (handler == null) {
            handler = new Handler();
        }
        mediaSessionImpl.setCallback(callback, handler);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, (t2g) null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, t2g t2g) {
        this.mActiveListeners = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i = wm8.a;
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers.size() == 1) {
                    ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                    componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                } else {
                    queryBroadcastReceivers.size();
                    componentName = null;
                }
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            MediaSessionImplApi29 mediaSessionImplApi29 = new MediaSessionImplApi29(context, str, t2g, bundle);
            this.mImpl = mediaSessionImplApi29;
            setCallback(new Callback() {
            }, new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
            mediaSessionImplApi29.setMediaButtonReceiver(pendingIntent);
            this.mController = new MediaControllerCompat(context, this);
            if (sMaxBitmapSize == 0) {
                sMaxBitmapSize = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }

    public static class MediaSessionImplApi21 implements MediaSessionImpl {
        Callback mCallback;
        boolean mCaptioningEnabled;
        boolean mDestroyed = false;
        final RemoteCallbackList<IMediaControllerCallback> mExtraControllerCallbacks = new RemoteCallbackList<>();
        final ExtraSession mExtraSession;
        final Object mLock = new Object();
        MediaMetadataCompat mMetadata;
        PlaybackStateCompat mPlaybackState;
        List<QueueItem> mQueue;
        int mRatingType;
        RegistrationCallbackHandler mRegistrationCallbackHandler;
        my8 mRemoteUserInfo;
        int mRepeatMode;
        final MediaSession mSessionFwk;
        Bundle mSessionInfo;
        int mShuffleMode;
        final Token mToken;

        public static class ExtraSession extends IMediaSession.Stub {
            private final AtomicReference<MediaSessionImplApi21> mMediaSessionImplRef;

            public ExtraSession(MediaSessionImplApi21 mediaSessionImplApi21) {
                this.mMediaSessionImplRef = new AtomicReference<>(mediaSessionImplApi21);
            }

            public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            public void adjustVolume(int i, int i2, String str) {
                throw new AssertionError();
            }

            public void fastForward() {
                throw new AssertionError();
            }

            public Bundle getExtras() {
                throw new AssertionError();
            }

            public long getFlags() {
                throw new AssertionError();
            }

            public PendingIntent getLaunchPendingIntent() {
                throw new AssertionError();
            }

            public MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            public String getPackageName() {
                throw new AssertionError();
            }

            public PlaybackStateCompat getPlaybackState() {
                MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                if (mediaSessionImplApi21 != null) {
                    return MediaSessionCompat.getStateWithUpdatedPosition(mediaSessionImplApi21.mPlaybackState, mediaSessionImplApi21.mMetadata);
                }
                return null;
            }

            public List<QueueItem> getQueue() {
                return null;
            }

            public CharSequence getQueueTitle() {
                throw new AssertionError();
            }

            public int getRatingType() {
                MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                if (mediaSessionImplApi21 != null) {
                    return mediaSessionImplApi21.mRatingType;
                }
                return 0;
            }

            public int getRepeatMode() {
                MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                if (mediaSessionImplApi21 != null) {
                    return mediaSessionImplApi21.mRepeatMode;
                }
                return -1;
            }

            public Bundle getSessionInfo() {
                MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                if (mediaSessionImplApi21.mSessionInfo == null) {
                    return null;
                }
                return new Bundle(mediaSessionImplApi21.mSessionInfo);
            }

            public int getShuffleMode() {
                MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                if (mediaSessionImplApi21 != null) {
                    return mediaSessionImplApi21.mShuffleMode;
                }
                return -1;
            }

            public String getTag() {
                throw new AssertionError();
            }

            public ParcelableVolumeInfo getVolumeAttributes() {
                throw new AssertionError();
            }

            public boolean isCaptioningEnabled() {
                MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                return mediaSessionImplApi21 != null && mediaSessionImplApi21.mCaptioningEnabled;
            }

            public boolean isShuffleModeEnabledRemoved() {
                return false;
            }

            public boolean isTransportControlEnabled() {
                throw new AssertionError();
            }

            public void next() {
                throw new AssertionError();
            }

            public void pause() {
                throw new AssertionError();
            }

            public void play() throws RemoteException {
                throw new AssertionError();
            }

            public void playFromMediaId(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public void playFromSearch(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public void playFromUri(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            public void prepare() throws RemoteException {
                throw new AssertionError();
            }

            public void prepareFromMediaId(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public void prepareFromSearch(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public void prepareFromUri(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            public void previous() {
                throw new AssertionError();
            }

            public void rate(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                if (mediaSessionImplApi21 != null) {
                    int callingPid = Binder.getCallingPid();
                    int callingUid = Binder.getCallingUid();
                    mediaSessionImplApi21.mExtraControllerCallbacks.register(iMediaControllerCallback, new my8("android.media.session.MediaController", callingPid, callingUid));
                    synchronized (mediaSessionImplApi21.mLock) {
                        try {
                            RegistrationCallbackHandler registrationCallbackHandler = mediaSessionImplApi21.mRegistrationCallbackHandler;
                            if (registrationCallbackHandler != null) {
                                registrationCallbackHandler.postCallbackRegistered(callingPid, callingUid);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }

            public void release() {
                this.mMediaSessionImplRef.set((Object) null);
            }

            public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            public void removeQueueItemAt(int i) {
                throw new AssertionError();
            }

            public void rewind() {
                throw new AssertionError();
            }

            public void seekTo(long j) {
                throw new AssertionError();
            }

            public void sendCommand(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            public void sendCustomAction(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public boolean sendMediaButton(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            public void setCaptioningEnabled(boolean z) {
                throw new AssertionError();
            }

            public void setPlaybackSpeed(float f) {
                throw new AssertionError();
            }

            public void setRepeatMode(int i) {
                throw new AssertionError();
            }

            public void setShuffleMode(int i) throws RemoteException {
                throw new AssertionError();
            }

            public void setShuffleModeEnabledRemoved(boolean z) {
            }

            public void setVolumeTo(int i, int i2, String str) {
                throw new AssertionError();
            }

            public void skipToQueueItem(long j) {
                throw new AssertionError();
            }

            public void stop() {
                throw new AssertionError();
            }

            public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                if (mediaSessionImplApi21 != null) {
                    mediaSessionImplApi21.mExtraControllerCallbacks.unregister(iMediaControllerCallback);
                    int callingPid = Binder.getCallingPid();
                    int callingUid = Binder.getCallingUid();
                    synchronized (mediaSessionImplApi21.mLock) {
                        try {
                            RegistrationCallbackHandler registrationCallbackHandler = mediaSessionImplApi21.mRegistrationCallbackHandler;
                            if (registrationCallbackHandler != null) {
                                registrationCallbackHandler.postCallbackUnregistered(callingPid, callingUid);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }

        public MediaSessionImplApi21(Context context, String str, t2g t2g, Bundle bundle) {
            MediaSession createFwkMediaSession = createFwkMediaSession(context, str, bundle);
            this.mSessionFwk = createFwkMediaSession;
            ExtraSession extraSession = new ExtraSession(this);
            this.mExtraSession = extraSession;
            this.mToken = new Token(createFwkMediaSession.getSessionToken(), extraSession, t2g);
            this.mSessionInfo = bundle;
            setFlags(3);
        }

        public MediaSession createFwkMediaSession(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }

        public Callback getCallback() {
            Callback callback;
            synchronized (this.mLock) {
                callback = this.mCallback;
            }
            return callback;
        }

        public String getCallingPackage() {
            try {
                return (String) this.mSessionFwk.getClass().getMethod("getCallingPackage", (Class[]) null).invoke(this.mSessionFwk, (Object[]) null);
            } catch (Exception unused) {
                return null;
            }
        }

        public my8 getCurrentControllerInfo() {
            my8 my8;
            synchronized (this.mLock) {
                my8 = this.mRemoteUserInfo;
            }
            return my8;
        }

        public Object getMediaSession() {
            return this.mSessionFwk;
        }

        public PlaybackStateCompat getPlaybackState() {
            return this.mPlaybackState;
        }

        public Object getRemoteControlClient() {
            return null;
        }

        public Token getSessionToken() {
            return this.mToken;
        }

        public boolean isActive() {
            return this.mSessionFwk.isActive();
        }

        public void release() {
            this.mDestroyed = true;
            this.mExtraControllerCallbacks.kill();
            this.mSessionFwk.setCallback((MediaSession.Callback) null);
            this.mExtraSession.release();
            this.mSessionFwk.release();
        }

        public void sendSessionEvent(String str, Bundle bundle) {
            this.mSessionFwk.sendSessionEvent(str, bundle);
        }

        public void setActive(boolean z) {
            this.mSessionFwk.setActive(z);
        }

        public void setCallback(Callback callback, Handler handler) {
            synchronized (this.mLock) {
                try {
                    this.mCallback = callback;
                    this.mSessionFwk.setCallback(callback == null ? null : callback.mCallbackFwk, handler);
                    if (callback != null) {
                        callback.setSessionImpl(this, handler);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void setCaptioningEnabled(boolean z) {
            if (this.mCaptioningEnabled != z) {
                this.mCaptioningEnabled = z;
                synchronized (this.mLock) {
                    for (int beginBroadcast = this.mExtraControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            this.mExtraControllerCallbacks.getBroadcastItem(beginBroadcast).onCaptioningEnabledChanged(z);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.mExtraControllerCallbacks.finishBroadcast();
                }
            }
        }

        public void setCurrentControllerInfo(my8 my8) {
            synchronized (this.mLock) {
                this.mRemoteUserInfo = my8;
            }
        }

        public void setExtras(Bundle bundle) {
            this.mSessionFwk.setExtras(bundle);
        }

        @SuppressLint({"WrongConstant"})
        public void setFlags(int i) {
            this.mSessionFwk.setFlags(i | 3);
        }

        public void setMediaButtonReceiver(PendingIntent pendingIntent) {
            this.mSessionFwk.setMediaButtonReceiver(pendingIntent);
        }

        public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
            this.mMetadata = mediaMetadataCompat;
            this.mSessionFwk.setMetadata(mediaMetadataCompat == null ? null : (MediaMetadata) mediaMetadataCompat.getMediaMetadata());
        }

        public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
            this.mPlaybackState = playbackStateCompat;
            synchronized (this.mLock) {
                for (int beginBroadcast = this.mExtraControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.mExtraControllerCallbacks.getBroadcastItem(beginBroadcast).onPlaybackStateChanged(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.mExtraControllerCallbacks.finishBroadcast();
            }
            this.mSessionFwk.setPlaybackState(playbackStateCompat == null ? null : (PlaybackState) playbackStateCompat.getPlaybackState());
        }

        public void setPlaybackToLocal(int i) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            this.mSessionFwk.setPlaybackToLocal(builder.build());
        }

        public void setPlaybackToRemote(ceg ceg) {
            throw null;
        }

        public void setQueue(List<QueueItem> list) {
            this.mQueue = list;
            if (list == null) {
                this.mSessionFwk.setQueue((List) null);
                return;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (QueueItem queueItem : list) {
                arrayList.add((MediaSession.QueueItem) queueItem.getQueueItem());
            }
            this.mSessionFwk.setQueue(arrayList);
        }

        public void setQueueTitle(CharSequence charSequence) {
            this.mSessionFwk.setQueueTitle(charSequence);
        }

        public void setRatingType(int i) {
            this.mRatingType = i;
        }

        public void setRegistrationCallback(RegistrationCallback registrationCallback, Handler handler) {
            synchronized (this.mLock) {
                try {
                    RegistrationCallbackHandler registrationCallbackHandler = this.mRegistrationCallbackHandler;
                    if (registrationCallbackHandler != null) {
                        registrationCallbackHandler.removeCallbacksAndMessages((Object) null);
                    }
                    if (registrationCallback != null) {
                        this.mRegistrationCallbackHandler = new RegistrationCallbackHandler(handler.getLooper(), registrationCallback);
                    } else {
                        this.mRegistrationCallbackHandler = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void setRepeatMode(int i) {
            if (this.mRepeatMode != i) {
                this.mRepeatMode = i;
                synchronized (this.mLock) {
                    for (int beginBroadcast = this.mExtraControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            this.mExtraControllerCallbacks.getBroadcastItem(beginBroadcast).onRepeatModeChanged(i);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.mExtraControllerCallbacks.finishBroadcast();
                }
            }
        }

        public void setSessionActivity(PendingIntent pendingIntent) {
            this.mSessionFwk.setSessionActivity(pendingIntent);
        }

        public void setShuffleMode(int i) {
            if (this.mShuffleMode != i) {
                this.mShuffleMode = i;
                synchronized (this.mLock) {
                    for (int beginBroadcast = this.mExtraControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            this.mExtraControllerCallbacks.getBroadcastItem(beginBroadcast).onShuffleModeChanged(i);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.mExtraControllerCallbacks.finishBroadcast();
                }
            }
        }

        public MediaSessionImplApi21(Object obj) {
            if (obj instanceof MediaSession) {
                MediaSession mediaSession = (MediaSession) obj;
                this.mSessionFwk = mediaSession;
                ExtraSession extraSession = new ExtraSession(this);
                this.mExtraSession = extraSession;
                this.mToken = new Token(mediaSession.getSessionToken(), extraSession);
                this.mSessionInfo = null;
                setFlags(3);
                return;
            }
            throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
        }
    }

    private MediaSessionCompat(Context context, MediaSessionImpl mediaSessionImpl) {
        this.mActiveListeners = new ArrayList<>();
        this.mImpl = mediaSessionImpl;
        this.mController = new MediaControllerCompat(context, this);
    }
}
