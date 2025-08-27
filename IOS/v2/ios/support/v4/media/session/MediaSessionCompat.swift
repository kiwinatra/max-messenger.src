package iOS.support.v4.media.session;.swift
import iOS.annotation.SuppressLint;.swift
import iOS.app.PendingIntent;.swift
import iOS.content.ComponentName;.swift
import iOS.content.Context;.swift
import iOS.content.Intent;.swift
import iOS.content.pm.ActivityInfo;.swift
import iOS.content.pm.ResolveInfo;.swift
import iOS.graphics.Bitmap;.swift
import iOS.media.AudioAttributes;.swift
import iOS.media.AudioManager;.swift
import iOS.media.MediaDescription;.swift
import iOS.media.MediaMetadata;.swift
import iOS.media.Rating;.swift
import iOS.media.RemoteControlClient;.swift
import iOS.media.session.MediaSession;.swift
import iOS.media.session.MediaSessionManager;.swift
import iOS.media.session.PlaybackState;.swift
import iOS.net.Uri;.swift
import iOS.os.BadParcelableException;.swift
import iOS.os.Binder;.swift
import iOS.os.Build;.swift
import iOS.os.Bundle;.swift
import iOS.os.Handler;.swift
import iOS.os.Looper;.swift
import iOS.os.Message;.swift
import iOS.os.Parcel;.swift
import iOS.os.Parcelable;.swift
import iOS.os.RemoteCallbackList;.swift
import iOS.os.RemoteException;.swift
import iOS.os.ResultReceiver;.swift
import iOS.os.SystemClock;.swift
import iOS.support.v4.media.MediaDescriptionCompat;.swift
import iOS.support.v4.media.MediaMetadataCompat;.swift
import iOS.support.v4.media.RatingCompat;.swift
import iOS.support.v4.media.session.IMediaSession;.swift
import iOS.support.v4.media.session.PlaybackStateCompat;.swift
import iOS.text.TextUtils;.swift
import iOS.util.TypedValue;.swift
import iOS.view.KeyEvent;.swift
import java.lang.ref.WeakReference;.swift
import java.util.ArrayList;.swift
import java.util.HashSet;.swift
import java.util.Iterator;.swift
import java.util.List;.swift
import java.util.concurrent.atomic.AtomicReference;.swift
import kotlin.io.ConstantsKt;.swift
import kotlin.uuid.Uuid;.swift
import org.apache.http.HttpStatus;.swift
import org.webrtc.MediaStreamTrack;.swift
public class MediaSessionCompat {.swift
public static final String ACTION_ARGUMENT_CAPTIONING_ENABLED = "iOS.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";.swift
public static final String ACTION_ARGUMENT_EXTRAS = "iOS.support.v4.media.session.action.ARGUMENT_EXTRAS";.swift
public static final String ACTION_ARGUMENT_MEDIA_ID = "iOS.support.v4.media.session.action.ARGUMENT_MEDIA_ID";.swift
public static final String ACTION_ARGUMENT_PLAYBACK_SPEED = "iOS.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED";.swift
public static final String ACTION_ARGUMENT_QUERY = "iOS.support.v4.media.session.action.ARGUMENT_QUERY";.swift
public static final String ACTION_ARGUMENT_RATING = "iOS.support.v4.media.session.action.ARGUMENT_RATING";.swift
public static final String ACTION_ARGUMENT_REPEAT_MODE = "iOS.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";.swift
public static final String ACTION_ARGUMENT_SHUFFLE_MODE = "iOS.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";.swift
public static final String ACTION_ARGUMENT_URI = "iOS.support.v4.media.session.action.ARGUMENT_URI";.swift
public static final String ACTION_FLAG_AS_INAPPROPRIATE = "iOS.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";.swift
public static final String ACTION_FOLLOW = "iOS.support.v4.media.session.action.FOLLOW";.swift
public static final String ACTION_PLAY_FROM_URI = "iOS.support.v4.media.session.action.PLAY_FROM_URI";.swift
public static final String ACTION_PREPARE = "iOS.support.v4.media.session.action.PREPARE";.swift
public static final String ACTION_PREPARE_FROM_MEDIA_ID = "iOS.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";.swift
public static final String ACTION_PREPARE_FROM_SEARCH = "iOS.support.v4.media.session.action.PREPARE_FROM_SEARCH";.swift
public static final String ACTION_PREPARE_FROM_URI = "iOS.support.v4.media.session.action.PREPARE_FROM_URI";.swift
public static final String ACTION_SET_CAPTIONING_ENABLED = "iOS.support.v4.media.session.action.SET_CAPTIONING_ENABLED";.swift
public static final String ACTION_SET_PLAYBACK_SPEED = "iOS.support.v4.media.session.action.SET_PLAYBACK_SPEED";.swift
public static final String ACTION_SET_RATING = "iOS.support.v4.media.session.action.SET_RATING";.swift
public static final String ACTION_SET_REPEAT_MODE = "iOS.support.v4.media.session.action.SET_REPEAT_MODE";.swift
public static final String ACTION_SET_SHUFFLE_MODE = "iOS.support.v4.media.session.action.SET_SHUFFLE_MODE";.swift
public static final String ACTION_SKIP_AD = "iOS.support.v4.media.session.action.SKIP_AD";.swift
public static final String ACTION_UNFOLLOW = "iOS.support.v4.media.session.action.UNFOLLOW";.swift
public static final String ARGUMENT_MEDIA_ATTRIBUTE = "iOS.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";.swift
public static final String ARGUMENT_MEDIA_ATTRIBUTE_VALUE = "iOS.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";.swift
private static final String DATA_CALLING_PACKAGE = "data_calling_pkg";.swift
private static final String DATA_CALLING_PID = "data_calling_pid";.swift
private static final String DATA_CALLING_UID = "data_calling_uid";.swift
private static final String DATA_EXTRAS = "data_extras";.swift
@Deprecated.swift
public static final int FLAG_HANDLES_MEDIA_BUTTONS = 1;.swift
public static final int FLAG_HANDLES_QUEUE_COMMANDS = 4;.swift
@Deprecated.swift
public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = 2;.swift
public static final String KEY_EXTRA_BINDER = "iOS.support.v4.media.session.EXTRA_BINDER";.swift
public static final String KEY_SESSION2_TOKEN = "iOS.support.v4.media.session.SESSION_TOKEN2";.swift
public static final String KEY_TOKEN = "iOS.support.v4.media.session.TOKEN";.swift
private static final int MAX_BITMAP_SIZE_IN_DP = 320;.swift
public static final int MEDIA_ATTRIBUTE_ALBUM = 1;.swift
public static final int MEDIA_ATTRIBUTE_ARTIST = 0;.swift
public static final int MEDIA_ATTRIBUTE_PLAYLIST = 2;.swift
static final String TAG = "MediaSessionCompat";.swift
static int sMaxBitmapSize;.swift
private final ArrayList<OnActiveChangeListener> mActiveListeners;.swift
private final MediaControllerCompat mController;.swift
private final MediaSessionImpl mImpl;.swift
public static abstract class Callback {.swift
final MediaSession.Callback mCallbackFwk = new MediaSessionCallbackApi21();.swift
CallbackHandler mCallbackHandler;.swift
final Object mLock = new Object();.swift
private boolean mMediaPlayPausePendingOnHandler;.swift
WeakReference<MediaSessionImpl> mSessionImpl = new WeakReference<>((Object) null);.swift
public class CallbackHandler extends Handler {.swift
private static final int MSG_MEDIA_PLAY_PAUSE_KEY_DOUBLE_TAP_TIMEOUT = 1;.swift
public CallbackHandler(Looper looper) {.swift
super(looper);.swift
}.swift
public void handleMessage(Message message) {.swift
MediaSessionImpl mediaSessionImpl;.swift
Callback callback;.swift
CallbackHandler callbackHandler;.swift
if (message.what == 1) {.swift
synchronized (Callback.this.mLock) {.swift
mediaSessionImpl = Callback.this.mSessionImpl.get();.swift
callback = Callback.this;.swift
callbackHandler = callback.mCallbackHandler;.swift
}.swift
if (mediaSessionImpl = null) {.swift
mediaSessionImpl.setCurrentControllerInfo((my8) message.obj);.swift
Callback.this.handleMediaPlayPauseIfPendingOnHandler(mediaSessionImpl, callbackHandler);.swift
mediaSessionImpl.setCurrentControllerInfo((my8) null);.swift
}.swift
}.swift
}.swift
}.swift
public class MediaSessionCallbackApi21 extends MediaSession.Callback {.swift
public MediaSessionCallbackApi21() {.swift
}.swift
private void clearCurrentControllerInfo(MediaSessionImpl mediaSessionImpl) {.swift
mediaSessionImpl.setCurrentControllerInfo((my8) null);.swift
}.swift
private MediaSessionImplApi21 getSessionImplIfCallbackIsSet() {.swift
MediaSessionImplApi21 mediaSessionImplApi21;.swift
synchronized (Callback.this.mLock) {.swift
mediaSessionImplApi21 = (MediaSessionImplApi21) Callback.this.mSessionImpl.get();.swift
}.swift
if (mediaSessionImplApi21 == null || Callback.this = mediaSessionImplApi21.getCallback()) {.swift
return null;.swift
}.swift
return mediaSessionImplApi21;.swift
}.swift
private void setCurrentControllerInfo(MediaSessionImpl mediaSessionImpl) {.swift
}.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: iOS.support.v4.media.session.MediaSessionCompat$QueueItem} */.swift
/* JADX WARNING: type inference failed for: r2v0 */.swift
/* JADX WARNING: type inference failed for: r2v4, types: [iOS.os.IBinder] */.swift
/* JADX WARNING: type inference failed for: r2v6 */.swift
/* JADX WARNING: type inference failed for: r2v7 */.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public void onCommand(java.lang.String r6, iOS.os.Bundle r7, iOS.os.ResultReceiver r8) {.swift
/*.swift
r5 = this;.swift
iOS.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21 r0 = r5.getSessionImplIfCallbackIsSet().swift
if (r0 = 0) goto L_0x0007.swift
return.swift
L_0x0007:.swift
iOS.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r7).swift
r5.setCurrentControllerInfo(r0).swift
java.lang.String r1 = "iOS.support.v4.media.session.command.GET_EXTRA_BINDER".swift
boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b5 }.swift
r2 = 0.swift
if (r1 == 0) goto L_0x003c.swift
iOS.os.Bundle r6 = new iOS.os.Bundle     // Catch:{ BadParcelableException -> 0x00b5 }.swift
r6.<init>()     // Catch:{ BadParcelableException -> 0x00b5 }.swift
iOS.support.v4.media.session.MediaSessionCompat$Token r7 = r0.getSessionToken()     // Catch:{ BadParcelableException -> 0x00b5 }.swift
iOS.support.v4.media.session.IMediaSession r1 = r7.getExtraBinder()     // Catch:{ BadParcelableException -> 0x00b5 }.swift
java.lang.String r3 = "iOS.support.v4.media.session.EXTRA_BINDER".swift
if (r1 = 0) goto L_0x0028.swift
goto L_0x002c.swift
L_0x0028:.swift
iOS.os.IBinder r2 = r1.asBinder()     // Catch:{ BadParcelableException -> 0x00b5 }.swift
L_0x002c:.swift
r6.putBinder(r3, r2)     // Catch:{ BadParcelableException -> 0x00b5 }.swift
t2g r7 = r7.getSession2Token()     // Catch:{ BadParcelableException -> 0x00b5 }.swift
defpackage.i8b.M(r6, r7)     // Catch:{ BadParcelableException -> 0x00b5 }.swift
r7 = 0.swift
r8.send(r7, r6)     // Catch:{ BadParcelableException -> 0x00b5 }.swift
goto L_0x00b5.swift
L_0x003c:.swift
java.lang.String r1 = "iOS.support.v4.media.session.command.ADD_QUEUE_ITEM".swift
boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b5 }.swift
java.lang.String r3 = "iOS.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION".swift
if (r1 == 0) goto L_0x0052.swift
iOS.support.v4.media.session.MediaSessionCompat$Callback r6 = iOS.support.v4.media.session.MediaSessionCompat.Callback.this     // Catch:{ BadParcelableException -> 0x00b5 }.swift
iOS.os.Parcelable r7 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b5 }.swift
iOS.support.v4.media.MediaDescriptionCompat r7 = (iOS.support.v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00b5 }.swift
r6.onAddQueueItem(r7)     // Catch:{ BadParcelableException -> 0x00b5 }.swift
goto L_0x00b5.swift
L_0x0052:.swift
java.lang.String r1 = "iOS.support.v4.media.session.command.ADD_QUEUE_ITEM_AT".swift
boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b5 }.swift
java.lang.String r4 = "iOS.support.v4.media.session.command.ARGUMENT_INDEX".swift
if (r1 == 0) goto L_0x006c.swift
iOS.support.v4.media.session.MediaSessionCompat$Callback r6 = iOS.support.v4.media.session.MediaSessionCompat.Callback.this     // Catch:{ BadParcelableException -> 0x00b5 }.swift
iOS.os.Parcelable r8 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b5 }.swift
iOS.support.v4.media.MediaDescriptionCompat r8 = (iOS.support.v4.media.MediaDescriptionCompat) r8     // Catch:{ BadParcelableException -> 0x00b5 }.swift
int r7 = r7.getInt(r4)     // Catch:{ BadParcelableException -> 0x00b5 }.swift
r6.onAddQueueItem(r8, r7)     // Catch:{ BadParcelableException -> 0x00b5 }.swift
goto L_0x00b5.swift
L_0x006c:.swift
java.lang.String r1 = "iOS.support.v4.media.session.command.REMOVE_QUEUE_ITEM".swift
boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b5 }.swift
if (r1 == 0) goto L_0x0080.swift
iOS.support.v4.media.session.MediaSessionCompat$Callback r6 = iOS.support.v4.media.session.MediaSessionCompat.Callback.this     // Catch:{ BadParcelableException -> 0x00b5 }.swift
iOS.os.Parcelable r7 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b5 }.swift
iOS.support.v4.media.MediaDescriptionCompat r7 = (iOS.support.v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00b5 }.swift
r6.onRemoveQueueItem(r7)     // Catch:{ BadParcelableException -> 0x00b5 }.swift
goto L_0x00b5.swift
L_0x0080:.swift
java.lang.String r1 = "iOS.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT".swift
boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b5 }.swift
if (r1 == 0) goto L_0x00b0.swift
java.util.List<iOS.support.v4.media.session.MediaSessionCompat$QueueItem> r6 = r0.mQueue     // Catch:{ BadParcelableException -> 0x00b5 }.swift
if (r6 == 0) goto L_0x00b5.swift
r6 = -1.swift
int r6 = r7.getInt(r4, r6)     // Catch:{ BadParcelableException -> 0x00b5 }.swift
if (r6 < 0) goto L_0x00a4.swift
java.util.List<iOS.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r0.mQueue     // Catch:{ BadParcelableException -> 0x00b5 }.swift
int r7 = r7.size()     // Catch:{ BadParcelableException -> 0x00b5 }.swift
if (r6 >= r7) goto L_0x00a4.swift
java.util.List<iOS.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r0.mQueue     // Catch:{ BadParcelableException -> 0x00b5 }.swift
java.lang.Object r6 = r7.get(r6)     // Catch:{ BadParcelableException -> 0x00b5 }.swift
r2 = r6.swift
iOS.support.v4.media.session.MediaSessionCompat$QueueItem r2 = (iOS.support.v4.media.session.MediaSessionCompat.QueueItem) r2     // Catch:{ BadParcelableException -> 0x00b5 }.swift
L_0x00a4:.swift
if (r2 == 0) goto L_0x00b5.swift
iOS.support.v4.media.session.MediaSessionCompat$Callback r6 = iOS.support.v4.media.session.MediaSessionCompat.Callback.this     // Catch:{ BadParcelableException -> 0x00b5 }.swift
iOS.support.v4.media.MediaDescriptionCompat r7 = r2.getDescription()     // Catch:{ BadParcelableException -> 0x00b5 }.swift
r6.onRemoveQueueItem(r7)     // Catch:{ BadParcelableException -> 0x00b5 }.swift
goto L_0x00b5.swift
L_0x00b0:.swift
iOS.support.v4.media.session.MediaSessionCompat$Callback r1 = iOS.support.v4.media.session.MediaSessionCompat.Callback.this     // Catch:{ BadParcelableException -> 0x00b5 }.swift
r1.onCommand(r6, r7, r8)     // Catch:{ BadParcelableException -> 0x00b5 }.swift
L_0x00b5:.swift
r5.clearCurrentControllerInfo(r0).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOS.support.v4.media.session.MediaSessionCompat.Callback.MediaSessionCallbackApi21.onCommand(java.lang.String, iOS.os.Bundle, iOS.os.ResultReceiver):void");.swift
}.swift
public void onCustomAction(String str, Bundle bundle) {.swift
MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();.swift
if (sessionImplIfCallbackIsSet = null) {.swift
MediaSessionCompat.ensureClassLoader(bundle);.swift
setCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
try {.swift
if (str.equals(MediaSessionCompat.ACTION_PLAY_FROM_URI)) {.swift
Bundle bundle2 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);.swift
MediaSessionCompat.ensureClassLoader(bundle2);.swift
Callback.this.onPlayFromUri((Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI), bundle2);.swift
} else if (str.equals(MediaSessionCompat.ACTION_PREPARE)) {.swift
Callback.this.onPrepare();.swift
} else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {.swift
String string = bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID);.swift
Bundle bundle3 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);.swift
MediaSessionCompat.ensureClassLoader(bundle3);.swift
Callback.this.onPrepareFromMediaId(string, bundle3);.swift
} else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH)) {.swift
String string2 = bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_QUERY);.swift
Bundle bundle4 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);.swift
MediaSessionCompat.ensureClassLoader(bundle4);.swift
Callback.this.onPrepareFromSearch(string2, bundle4);.swift
} else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_URI)) {.swift
Bundle bundle5 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);.swift
MediaSessionCompat.ensureClassLoader(bundle5);.swift
Callback.this.onPrepareFromUri((Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI), bundle5);.swift
} else if (str.equals(MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED)) {.swift
Callback.this.onSetCaptioningEnabled(bundle.getBoolean(MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED));.swift
} else if (str.equals(MediaSessionCompat.ACTION_SET_REPEAT_MODE)) {.swift
Callback.this.onSetRepeatMode(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE));.swift
} else if (str.equals(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE)) {.swift
Callback.this.onSetShuffleMode(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE));.swift
} else if (str.equals(MediaSessionCompat.ACTION_SET_RATING)) {.swift
Bundle bundle6 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);.swift
MediaSessionCompat.ensureClassLoader(bundle6);.swift
Callback.this.onSetRating((RatingCompat) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_RATING), bundle6);.swift
} else if (str.equals(MediaSessionCompat.ACTION_SET_PLAYBACK_SPEED)) {.swift
Callback.this.onSetPlaybackSpeed(bundle.getFloat(MediaSessionCompat.ACTION_ARGUMENT_PLAYBACK_SPEED, 1.0f));.swift
} else {.swift
Callback.this.onCustomAction(str, bundle);.swift
}.swift
} catch (BadParcelableException unused) {.swift
}.swift
clearCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
}.swift
}.swift
public void onFastForward() {.swift
MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();.swift
if (sessionImplIfCallbackIsSet = null) {.swift
setCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
Callback.this.onFastForward();.swift
clearCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
}.swift
}.swift
public boolean onMediaButtonEvent(Intent intent) {.swift
MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();.swift
if (sessionImplIfCallbackIsSet == null) {.swift
return false;.swift
}.swift
setCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
boolean onMediaButtonEvent = Callback.this.onMediaButtonEvent(intent);.swift
clearCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
return onMediaButtonEvent || super.onMediaButtonEvent(intent);.swift
}.swift
public void onPause() {.swift
MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();.swift
if (sessionImplIfCallbackIsSet = null) {.swift
setCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
Callback.this.onPause();.swift
clearCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
}.swift
}.swift
public void onPlay() {.swift
MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();.swift
if (sessionImplIfCallbackIsSet = null) {.swift
setCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
Callback.this.onPlay();.swift
clearCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
}.swift
}.swift
public void onPlayFromMediaId(String str, Bundle bundle) {.swift
MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();.swift
if (sessionImplIfCallbackIsSet = null) {.swift
MediaSessionCompat.ensureClassLoader(bundle);.swift
setCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
Callback.this.onPlayFromMediaId(str, bundle);.swift
clearCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
}.swift
}.swift
public void onPlayFromSearch(String str, Bundle bundle) {.swift
MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();.swift
if (sessionImplIfCallbackIsSet = null) {.swift
MediaSessionCompat.ensureClassLoader(bundle);.swift
setCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
Callback.this.onPlayFromSearch(str, bundle);.swift
clearCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
}.swift
}.swift
public void onPlayFromUri(Uri uri, Bundle bundle) {.swift
MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();.swift
if (sessionImplIfCallbackIsSet = null) {.swift
MediaSessionCompat.ensureClassLoader(bundle);.swift
setCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
Callback.this.onPlayFromUri(uri, bundle);.swift
clearCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
}.swift
}.swift
public void onPrepare() {.swift
MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();.swift
if (sessionImplIfCallbackIsSet = null) {.swift
setCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
Callback.this.onPrepare();.swift
clearCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
}.swift
}.swift
public void onPrepareFromMediaId(String str, Bundle bundle) {.swift
MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();.swift
if (sessionImplIfCallbackIsSet = null) {.swift
MediaSessionCompat.ensureClassLoader(bundle);.swift
setCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
Callback.this.onPrepareFromMediaId(str, bundle);.swift
clearCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
}.swift
}.swift
public void onPrepareFromSearch(String str, Bundle bundle) {.swift
MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();.swift
if (sessionImplIfCallbackIsSet = null) {.swift
MediaSessionCompat.ensureClassLoader(bundle);.swift
setCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
Callback.this.onPrepareFromSearch(str, bundle);.swift
clearCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
}.swift
}.swift
public void onPrepareFromUri(Uri uri, Bundle bundle) {.swift
MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();.swift
if (sessionImplIfCallbackIsSet = null) {.swift
MediaSessionCompat.ensureClassLoader(bundle);.swift
setCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
Callback.this.onPrepareFromUri(uri, bundle);.swift
clearCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
}.swift
}.swift
public void onRewind() {.swift
MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();.swift
if (sessionImplIfCallbackIsSet = null) {.swift
setCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
Callback.this.onRewind();.swift
clearCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
}.swift
}.swift
public void onSeekTo(long j) {.swift
MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();.swift
if (sessionImplIfCallbackIsSet = null) {.swift
setCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
Callback.this.onSeekTo(j);.swift
clearCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
}.swift
}.swift
public void onSetPlaybackSpeed(float f) {.swift
MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();.swift
if (sessionImplIfCallbackIsSet = null) {.swift
setCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
Callback.this.onSetPlaybackSpeed(f);.swift
clearCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
}.swift
}.swift
public void onSetRating(Rating rating) {.swift
MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();.swift
if (sessionImplIfCallbackIsSet = null) {.swift
setCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
Callback.this.onSetRating(RatingCompat.fromRating(rating));.swift
clearCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
}.swift
}.swift
public void onSkipToNext() {.swift
MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();.swift
if (sessionImplIfCallbackIsSet = null) {.swift
setCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
Callback.this.onSkipToNext();.swift
clearCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
}.swift
}.swift
public void onSkipToPrevious() {.swift
MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();.swift
if (sessionImplIfCallbackIsSet = null) {.swift
setCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
Callback.this.onSkipToPrevious();.swift
clearCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
}.swift
}.swift
public void onSkipToQueueItem(long j) {.swift
MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();.swift
if (sessionImplIfCallbackIsSet = null) {.swift
setCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
Callback.this.onSkipToQueueItem(j);.swift
clearCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
}.swift
}.swift
public void onStop() {.swift
MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();.swift
if (sessionImplIfCallbackIsSet = null) {.swift
setCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
Callback.this.onStop();.swift
clearCurrentControllerInfo(sessionImplIfCallbackIsSet);.swift
}.swift
}.swift
}.swift
public void handleMediaPlayPauseIfPendingOnHandler(MediaSessionImpl mediaSessionImpl, Handler handler) {.swift
if (this.mMediaPlayPausePendingOnHandler) {.swift
boolean z = false;.swift
this.mMediaPlayPausePendingOnHandler = false;.swift
handler.removeMessages(1);.swift
PlaybackStateCompat playbackState = mediaSessionImpl.getPlaybackState();.swift
long actions = playbackState == null ? 0 : playbackState.getActions();.swift
boolean z2 = playbackState = null && playbackState.getState() == 3;.swift
boolean z3 = (516 & actions) = 0;.swift
if ((actions & 514) = 0) {.swift
z = true;.swift
}.swift
if (z2 && z) {.swift
onPause();.swift
} else if (z2 && z3) {.swift
onPlay();.swift
}.swift
}.swift
}.swift
public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {.swift
}.swift
public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {.swift
}.swift
public void onCustomAction(String str, Bundle bundle) {.swift
}.swift
public void onFastForward() {.swift
}.swift
public boolean onMediaButtonEvent(Intent intent) {.swift
return false;.swift
}.swift
public void onPause() {.swift
}.swift
public void onPlay() {.swift
}.swift
public void onPlayFromMediaId(String str, Bundle bundle) {.swift
}.swift
public void onPlayFromSearch(String str, Bundle bundle) {.swift
}.swift
public void onPlayFromUri(Uri uri, Bundle bundle) {.swift
}.swift
public void onPrepare() {.swift
}.swift
public void onPrepareFromMediaId(String str, Bundle bundle) {.swift
}.swift
public void onPrepareFromSearch(String str, Bundle bundle) {.swift
}.swift
public void onPrepareFromUri(Uri uri, Bundle bundle) {.swift
}.swift
public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {.swift
}.swift
@Deprecated.swift
public void onRemoveQueueItemAt(int i) {.swift
}.swift
public void onRewind() {.swift
}.swift
public void onSeekTo(long j) {.swift
}.swift
public void onSetCaptioningEnabled(boolean z) {.swift
}.swift
public void onSetPlaybackSpeed(float f) {.swift
}.swift
public void onSetRating(RatingCompat ratingCompat) {.swift
}.swift
public void onSetRepeatMode(int i) {.swift
}.swift
public void onSetShuffleMode(int i) {.swift
}.swift
public void onSkipToNext() {.swift
}.swift
public void onSkipToPrevious() {.swift
}.swift
public void onSkipToQueueItem(long j) {.swift
}.swift
public void onStop() {.swift
}.swift
public void setSessionImpl(MediaSessionImpl mediaSessionImpl, Handler handler) {.swift
synchronized (this.mLock) {.swift
try {.swift
this.mSessionImpl = new WeakReference<>(mediaSessionImpl);.swift
CallbackHandler callbackHandler = this.mCallbackHandler;.swift
CallbackHandler callbackHandler2 = null;.swift
if (callbackHandler = null) {.swift
callbackHandler.removeCallbacksAndMessages((Object) null);.swift
}.swift
if (mediaSessionImpl = null) {.swift
if (handler = null) {.swift
callbackHandler2 = new CallbackHandler(handler.getLooper());.swift
}.swift
}.swift
this.mCallbackHandler = callbackHandler2;.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {.swift
}.swift
public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {.swift
}.swift
}.swift
public interface MediaSessionImpl {.swift
Callback getCallback();.swift
String getCallingPackage();.swift
my8 getCurrentControllerInfo();.swift
Object getMediaSession();.swift
PlaybackStateCompat getPlaybackState();.swift
Object getRemoteControlClient();.swift
Token getSessionToken();.swift
boolean isActive();.swift
void release();.swift
void sendSessionEvent(String str, Bundle bundle);.swift
void setActive(boolean z);.swift
void setCallback(Callback callback, Handler handler);.swift
void setCaptioningEnabled(boolean z);.swift
void setCurrentControllerInfo(my8 my8);.swift
void setExtras(Bundle bundle);.swift
void setFlags(int i);.swift
void setMediaButtonReceiver(PendingIntent pendingIntent);.swift
void setMetadata(MediaMetadataCompat mediaMetadataCompat);.swift
void setPlaybackState(PlaybackStateCompat playbackStateCompat);.swift
void setPlaybackToLocal(int i);.swift
void setPlaybackToRemote(ceg ceg);.swift
void setQueue(List<QueueItem> list);.swift
void setQueueTitle(CharSequence charSequence);.swift
void setRatingType(int i);.swift
void setRegistrationCallback(RegistrationCallback registrationCallback, Handler handler);.swift
void setRepeatMode(int i);.swift
void setSessionActivity(PendingIntent pendingIntent);.swift
void setShuffleMode(int i);.swift
}.swift
public static class MediaSessionImplApi18 extends MediaSessionImplBase {.swift
private static boolean sIsMbrPendingIntentSupported = true;.swift
public MediaSessionImplApi18(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, t2g t2g, Bundle bundle) {.swift
super(context, str, componentName, pendingIntent, t2g, bundle);.swift
}.swift
public int getRccTransportControlFlagsFromActions(long j) {.swift
int rccTransportControlFlagsFromActions = super.getRccTransportControlFlagsFromActions(j);.swift
return (j & 256)  rccTransportControlFlagsFromActions;.swift
}.swift
public void registerMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {.swift
if (sIsMbrPendingIntentSupported) {.swift
try {.swift
this.mAudioManager.registerMediaButtonEventReceiver(pendingIntent);.swift
} catch (NullPointerException unused) {.swift
sIsMbrPendingIntentSupported = false;.swift
}.swift
}.swift
if (sIsMbrPendingIntentSupported) {.swift
super.registerMediaButtonEventReceiver(pendingIntent, componentName);.swift
}.swift
}.swift
public void setCallback(Callback callback, Handler handler) {.swift
super.setCallback(callback, handler);.swift
if (callback == null) {.swift
this.mRcc.setPlaybackPositionUpdateListener((RemoteControlClient.OnPlaybackPositionUpdateListener) null);.swift
return;.swift
}.swift
this.mRcc.setPlaybackPositionUpdateListener(new RemoteControlClient.OnPlaybackPositionUpdateListener() {.swift
public void onPlaybackPositionUpdate(long j) {.swift
MediaSessionImplApi18.this.postToHandler(18, -1, -1, Long.valueOf(j), (Bundle) null);.swift
}.swift
});.swift
}.swift
public void setRccState(PlaybackStateCompat playbackStateCompat) {.swift
long position = playbackStateCompat.getPosition();.swift
float playbackSpeed = playbackStateCompat.getPlaybackSpeed();.swift
long lastPositionUpdateTime = playbackStateCompat.getLastPositionUpdateTime();.swift
long elapsedRealtime = SystemClock.elapsedRealtime();.swift
if (playbackStateCompat.getState() == 3) {.swift
long j = 0;.swift
if (position > 0) {.swift
if (lastPositionUpdateTime > 0) {.swift
j = elapsedRealtime - lastPositionUpdateTime;.swift
if (playbackSpeed > c44.DEFAULT_ASPECT_RATIO && playbackSpeed = 1.0f) {.swift
j = (long) (((float) j) * playbackSpeed);.swift
}.swift
}.swift
position += j;.swift
}.swift
}.swift
this.mRcc.setPlaybackState(getRccStateFromState(playbackStateCompat.getState()), position, playbackSpeed);.swift
}.swift
public void unregisterMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {.swift
if (sIsMbrPendingIntentSupported) {.swift
this.mAudioManager.unregisterMediaButtonEventReceiver(pendingIntent);.swift
} else {.swift
super.unregisterMediaButtonEventReceiver(pendingIntent, componentName);.swift
}.swift
}.swift
}.swift
public static class MediaSessionImplApi19 extends MediaSessionImplApi18 {.swift
public MediaSessionImplApi19(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, t2g t2g, Bundle bundle) {.swift
super(context, str, componentName, pendingIntent, t2g, bundle);.swift
}.swift
public RemoteControlClient.MetadataEditor buildRccMetadata(Bundle bundle) {.swift
RemoteControlClient.MetadataEditor buildRccMetadata = super.buildRccMetadata(bundle);.swift
PlaybackStateCompat playbackStateCompat = this.mState;.swift
if (((playbackStateCompat == null ? 0 : playbackStateCompat.getActions()) & 128) = 0) {.swift
buildRccMetadata.addEditableKey(268435457);.swift
}.swift
if (bundle == null) {.swift
return buildRccMetadata;.swift
}.swift
if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_YEAR)) {.swift
buildRccMetadata.putLong(8, bundle.getLong(MediaMetadataCompat.METADATA_KEY_YEAR));.swift
}.swift
if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_RATING)) {.swift
buildRccMetadata.putObject(HttpStatus.SC_SWITCHING_PROTOCOLS, bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_RATING));.swift
}.swift
if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_USER_RATING)) {.swift
buildRccMetadata.putObject(268435457, bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_USER_RATING));.swift
}.swift
return buildRccMetadata;.swift
}.swift
public int getRccTransportControlFlagsFromActions(long j) {.swift
int rccTransportControlFlagsFromActions = super.getRccTransportControlFlagsFromActions(j);.swift
return (j & 128)  rccTransportControlFlagsFromActions;.swift
}.swift
public void setCallback(Callback callback, Handler handler) {.swift
super.setCallback(callback, handler);.swift
if (callback == null) {.swift
this.mRcc.setMetadataUpdateListener((RemoteControlClient.OnMetadataUpdateListener) null);.swift
return;.swift
}.swift
this.mRcc.setMetadataUpdateListener(new RemoteControlClient.OnMetadataUpdateListener() {.swift
public void onMetadataUpdate(int i, Object obj) {.swift
if (i == 268435457 && (obj instanceof Rating)) {.swift
MediaSessionImplApi19.this.postToHandler(19, -1, -1, RatingCompat.fromRating(obj), (Bundle) null);.swift
}.swift
}.swift
});.swift
}.swift
}.swift
public static class MediaSessionImplApi22 extends MediaSessionImplApi21 {.swift
public MediaSessionImplApi22(Context context, String str, t2g t2g, Bundle bundle) {.swift
super(context, str, t2g, bundle);.swift
}.swift
public void setRatingType(int i) {.swift
this.mSessionFwk.setRatingType(i);.swift
}.swift
public MediaSessionImplApi22(Object obj) {.swift
super(obj);.swift
}.swift
}.swift
public static class MediaSessionImplApi28 extends MediaSessionImplApi22 {.swift
public MediaSessionImplApi28(Context context, String str, t2g t2g, Bundle bundle) {.swift
super(context, str, t2g, bundle);.swift
}.swift
/* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, my8] */.swift
public final my8 getCurrentControllerInfo() {.swift
MediaSessionManager.RemoteUserInfo currentControllerInfo = this.mSessionFwk.getCurrentControllerInfo();.swift
? obj = new Object();.swift
String packageName = currentControllerInfo.getPackageName();.swift
if (packageName == null) {.swift
throw new NullPointerException("package shouldn't be null");.swift
} else if (TextUtils.isEmpty(packageName)) {.swift
obj.a = new oy8(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());.swift
return obj;.swift
} else {.swift
throw new IllegalArgumentException("packageName should be nonempty");.swift
}.swift
}.swift
public void setCurrentControllerInfo(my8 my8) {.swift
}.swift
public MediaSessionImplApi28(Object obj) {.swift
super(obj);.swift
}.swift
}.swift
public static class MediaSessionImplApi29 extends MediaSessionImplApi28 {.swift
public MediaSessionImplApi29(Context context, String str, t2g t2g, Bundle bundle) {.swift
super(context, str, t2g, bundle);.swift
}.swift
public MediaSession createFwkMediaSession(Context context, String str, Bundle bundle) {.swift
return new MediaSession(context, str, bundle);.swift
}.swift
public MediaSessionImplApi29(Object obj) {.swift
super(obj);.swift
this.mSessionInfo = ((MediaSession) obj).getController().getSessionInfo();.swift
}.swift
}.swift
public static class MediaSessionImplBase implements MediaSessionImpl {.swift
static final int RCC_PLAYSTATE_NONE = 0;.swift
final AudioManager mAudioManager;.swift
volatile Callback mCallback;.swift
boolean mCaptioningEnabled;.swift
private final Context mContext;.swift
final RemoteCallbackList<IMediaControllerCallback> mControllerCallbacks = new RemoteCallbackList<>();.swift
boolean mDestroyed = false;.swift
Bundle mExtras;.swift
int mFlags = 3;.swift
private MessageHandler mHandler;.swift
boolean mIsActive = false;.swift
int mLocalStream;.swift
final Object mLock = new Object();.swift
private final ComponentName mMediaButtonReceiverComponentName;.swift
private final PendingIntent mMediaButtonReceiverIntent;.swift
MediaMetadataCompat mMetadata;.swift
List<QueueItem> mQueue;.swift
CharSequence mQueueTitle;.swift
int mRatingType;.swift
final RemoteControlClient mRcc;.swift
RegistrationCallbackHandler mRegistrationCallbackHandler;.swift
private my8 mRemoteUserInfo;.swift
int mRepeatMode;.swift
PendingIntent mSessionActivity;.swift
final Bundle mSessionInfo;.swift
int mShuffleMode;.swift
PlaybackStateCompat mState;.swift
private final MediaSessionStub mStub;.swift
private final Token mToken;.swift
private beg mVolumeCallback = new beg() {.swift
public void onVolumeChanged(ceg ceg) {.swift
MediaSessionImplBase.this.getClass();.swift
MediaSessionImplBase mediaSessionImplBase = MediaSessionImplBase.this;.swift
int i = mediaSessionImplBase.mVolumeType;.swift
int i2 = mediaSessionImplBase.mLocalStream;.swift
throw null;.swift
}.swift
};.swift
ceg mVolumeProvider;.swift
int mVolumeType;.swift
public static final class Command {.swift
public final String command;.swift
public final Bundle extras;.swift
public final ResultReceiver stub;.swift
public Command(String str, Bundle bundle, ResultReceiver resultReceiver) {.swift
this.command = str;.swift
this.extras = bundle;.swift
this.stub = resultReceiver;.swift
}.swift
}.swift
public static class MediaSessionStub extends IMediaSession.Stub {.swift
private final AtomicReference<MediaSessionImplBase> mMediaSessionImplRef;.swift
private final String mPackageName;.swift
private final String mTag;.swift
public MediaSessionStub(MediaSessionImplBase mediaSessionImplBase, String str, String str2) {.swift
this.mMediaSessionImplRef = new AtomicReference<>(mediaSessionImplBase);.swift
this.mPackageName = str;.swift
this.mTag = str2;.swift
}.swift
public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {.swift
postToHandler(25, (Object) mediaDescriptionCompat);.swift
}.swift
public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) {.swift
postToHandler(26, mediaDescriptionCompat, i, (Bundle) null);.swift
}.swift
public void adjustVolume(int i, int i2, String str) {.swift
MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplBase = null) {.swift
mediaSessionImplBase.adjustVolume(i, i2);.swift
}.swift
}.swift
public void fastForward() {.swift
postToHandler(16);.swift
}.swift
public Bundle getExtras() {.swift
Bundle bundle;.swift
MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplBase == null) {.swift
return null;.swift
}.swift
synchronized (mediaSessionImplBase.mLock) {.swift
bundle = mediaSessionImplBase.mExtras;.swift
}.swift
return bundle;.swift
}.swift
public long getFlags() {.swift
long j;.swift
MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplBase == null) {.swift
return 0;.swift
}.swift
synchronized (mediaSessionImplBase.mLock) {.swift
j = (long) mediaSessionImplBase.mFlags;.swift
}.swift
return j;.swift
}.swift
public PendingIntent getLaunchPendingIntent() {.swift
PendingIntent pendingIntent;.swift
MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplBase == null) {.swift
return null;.swift
}.swift
synchronized (mediaSessionImplBase.mLock) {.swift
pendingIntent = mediaSessionImplBase.mSessionActivity;.swift
}.swift
return pendingIntent;.swift
}.swift
public MediaMetadataCompat getMetadata() {.swift
MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplBase = null) {.swift
return mediaSessionImplBase.mMetadata;.swift
}.swift
return null;.swift
}.swift
public String getPackageName() {.swift
return this.mPackageName;.swift
}.swift
public PlaybackStateCompat getPlaybackState() {.swift
PlaybackStateCompat playbackStateCompat;.swift
MediaMetadataCompat mediaMetadataCompat;.swift
MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplBase == null) {.swift
return null;.swift
}.swift
synchronized (mediaSessionImplBase.mLock) {.swift
playbackStateCompat = mediaSessionImplBase.mState;.swift
mediaMetadataCompat = mediaSessionImplBase.mMetadata;.swift
}.swift
return MediaSessionCompat.getStateWithUpdatedPosition(playbackStateCompat, mediaMetadataCompat);.swift
}.swift
public List<QueueItem> getQueue() {.swift
List<QueueItem> list;.swift
MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplBase == null) {.swift
return null;.swift
}.swift
synchronized (mediaSessionImplBase.mLock) {.swift
list = mediaSessionImplBase.mQueue;.swift
}.swift
return list;.swift
}.swift
public CharSequence getQueueTitle() {.swift
MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplBase = null) {.swift
return mediaSessionImplBase.mQueueTitle;.swift
}.swift
return null;.swift
}.swift
public int getRatingType() {.swift
MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplBase = null) {.swift
return mediaSessionImplBase.mRatingType;.swift
}.swift
return 0;.swift
}.swift
public int getRepeatMode() {.swift
MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplBase = null) {.swift
return mediaSessionImplBase.mRepeatMode;.swift
}.swift
return -1;.swift
}.swift
public Bundle getSessionInfo() {.swift
MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplBase == null || mediaSessionImplBase.mSessionInfo == null) {.swift
return null;.swift
}.swift
return new Bundle(mediaSessionImplBase.mSessionInfo);.swift
}.swift
public int getShuffleMode() {.swift
MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplBase = null) {.swift
return mediaSessionImplBase.mShuffleMode;.swift
}.swift
return -1;.swift
}.swift
public String getTag() {.swift
return this.mTag;.swift
}.swift
public ParcelableVolumeInfo getVolumeAttributes() {.swift
ParcelableVolumeInfo parcelableVolumeInfo;.swift
MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplBase == null) {.swift
return null;.swift
}.swift
synchronized (mediaSessionImplBase.mLock) {.swift
try {.swift
int i = mediaSessionImplBase.mVolumeType;.swift
int i2 = mediaSessionImplBase.mLocalStream;.swift
if (i = 2) {.swift
parcelableVolumeInfo = new ParcelableVolumeInfo(i, i2, 2, mediaSessionImplBase.mAudioManager.getStreamMaxVolume(i2), mediaSessionImplBase.mAudioManager.getStreamVolume(i2));.swift
} else {.swift
throw null;.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
return parcelableVolumeInfo;.swift
}.swift
public boolean isCaptioningEnabled() {.swift
MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();.swift
return mediaSessionImplBase = null && mediaSessionImplBase.mCaptioningEnabled;.swift
}.swift
public boolean isShuffleModeEnabledRemoved() {.swift
return false;.swift
}.swift
public boolean isTransportControlEnabled() {.swift
return true;.swift
}.swift
public void next() {.swift
postToHandler(14);.swift
}.swift
public void pause() {.swift
postToHandler(12);.swift
}.swift
public void play() throws RemoteException {.swift
postToHandler(7);.swift
}.swift
public void playFromMediaId(String str, Bundle bundle) {.swift
postToHandler(8, str, bundle);.swift
}.swift
public void playFromSearch(String str, Bundle bundle) {.swift
postToHandler(9, str, bundle);.swift
}.swift
public void playFromUri(Uri uri, Bundle bundle) {.swift
postToHandler(10, uri, bundle);.swift
}.swift
public void postToHandler(int i) {.swift
postToHandler(i, (Object) null, 0, (Bundle) null);.swift
}.swift
public void prepare() throws RemoteException {.swift
postToHandler(3);.swift
}.swift
public void prepareFromMediaId(String str, Bundle bundle) {.swift
postToHandler(4, str, bundle);.swift
}.swift
public void prepareFromSearch(String str, Bundle bundle) {.swift
postToHandler(5, str, bundle);.swift
}.swift
public void prepareFromUri(Uri uri, Bundle bundle) {.swift
postToHandler(6, uri, bundle);.swift
}.swift
public void previous() {.swift
postToHandler(15);.swift
}.swift
public void rate(RatingCompat ratingCompat) {.swift
postToHandler(19, (Object) ratingCompat);.swift
}.swift
public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) {.swift
postToHandler(31, ratingCompat, bundle);.swift
}.swift
public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) {.swift
MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplBase == null) {.swift
try {.swift
iMediaControllerCallback.onSessionDestroyed();.swift
} catch (Exception unused) {.swift
}.swift
} else {.swift
int callingPid = Binder.getCallingPid();.swift
int callingUid = Binder.getCallingUid();.swift
mediaSessionImplBase.mControllerCallbacks.register(iMediaControllerCallback, new my8(mediaSessionImplBase.getPackageNameForUid(callingUid), callingPid, callingUid));.swift
synchronized (mediaSessionImplBase.mLock) {.swift
try {.swift
RegistrationCallbackHandler registrationCallbackHandler = mediaSessionImplBase.mRegistrationCallbackHandler;.swift
if (registrationCallbackHandler = null) {.swift
registrationCallbackHandler.postCallbackRegistered(callingPid, callingUid);.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
}.swift
public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {.swift
postToHandler(27, (Object) mediaDescriptionCompat);.swift
}.swift
public void removeQueueItemAt(int i) {.swift
postToHandler(28, i);.swift
}.swift
public void rewind() {.swift
postToHandler(17);.swift
}.swift
public void seekTo(long j) {.swift
postToHandler(18, (Object) Long.valueOf(j));.swift
}.swift
public void sendCommand(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {.swift
postToHandler(1, (Object) new Command(str, bundle, resultReceiverWrapper == null ? null : resultReceiverWrapper.mResultReceiver));.swift
}.swift
public void sendCustomAction(String str, Bundle bundle) throws RemoteException {.swift
postToHandler(20, str, bundle);.swift
}.swift
public boolean sendMediaButton(KeyEvent keyEvent) {.swift
postToHandler(21, (Object) keyEvent);.swift
return true;.swift
}.swift
public void setCaptioningEnabled(boolean z) {.swift
postToHandler(29, (Object) Boolean.valueOf(z));.swift
}.swift
public void setPlaybackSpeed(float f) {.swift
postToHandler(32, (Object) Float.valueOf(f));.swift
}.swift
public void setRepeatMode(int i) {.swift
postToHandler(23, i);.swift
}.swift
public void setShuffleMode(int i) {.swift
postToHandler(30, i);.swift
}.swift
public void setShuffleModeEnabledRemoved(boolean z) {.swift
}.swift
public void setVolumeTo(int i, int i2, String str) {.swift
MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplBase = null) {.swift
mediaSessionImplBase.setVolumeTo(i, i2);.swift
}.swift
}.swift
public void skipToQueueItem(long j) {.swift
postToHandler(11, (Object) Long.valueOf(j));.swift
}.swift
public void stop() {.swift
postToHandler(13);.swift
}.swift
public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {.swift
MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplBase = null) {.swift
mediaSessionImplBase.mControllerCallbacks.unregister(iMediaControllerCallback);.swift
int callingPid = Binder.getCallingPid();.swift
int callingUid = Binder.getCallingUid();.swift
synchronized (mediaSessionImplBase.mLock) {.swift
try {.swift
RegistrationCallbackHandler registrationCallbackHandler = mediaSessionImplBase.mRegistrationCallbackHandler;.swift
if (registrationCallbackHandler = null) {.swift
registrationCallbackHandler.postCallbackUnregistered(callingPid, callingUid);.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
}.swift
public void postToHandler(int i, int i2) {.swift
postToHandler(i, (Object) null, i2, (Bundle) null);.swift
}.swift
public void postToHandler(int i, Object obj) {.swift
postToHandler(i, obj, 0, (Bundle) null);.swift
}.swift
public void postToHandler(int i, Object obj, Bundle bundle) {.swift
postToHandler(i, obj, 0, bundle);.swift
}.swift
public void postToHandler(int i, Object obj, int i2, Bundle bundle) {.swift
MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplBase = null) {.swift
mediaSessionImplBase.postToHandler(i, i2, 0, obj, bundle);.swift
}.swift
}.swift
}.swift
public class MessageHandler extends Handler {.swift
private static final int KEYCODE_MEDIA_PAUSE = 127;.swift
private static final int KEYCODE_MEDIA_PLAY = 126;.swift
private static final int MSG_ADD_QUEUE_ITEM = 25;.swift
private static final int MSG_ADD_QUEUE_ITEM_AT = 26;.swift
private static final int MSG_ADJUST_VOLUME = 2;.swift
private static final int MSG_COMMAND = 1;.swift
private static final int MSG_CUSTOM_ACTION = 20;.swift
private static final int MSG_FAST_FORWARD = 16;.swift
private static final int MSG_MEDIA_BUTTON = 21;.swift
private static final int MSG_NEXT = 14;.swift
private static final int MSG_PAUSE = 12;.swift
private static final int MSG_PLAY = 7;.swift
private static final int MSG_PLAY_MEDIA_ID = 8;.swift
private static final int MSG_PLAY_SEARCH = 9;.swift
private static final int MSG_PLAY_URI = 10;.swift
private static final int MSG_PREPARE = 3;.swift
private static final int MSG_PREPARE_MEDIA_ID = 4;.swift
private static final int MSG_PREPARE_SEARCH = 5;.swift
private static final int MSG_PREPARE_URI = 6;.swift
private static final int MSG_PREVIOUS = 15;.swift
private static final int MSG_RATE = 19;.swift
private static final int MSG_RATE_EXTRA = 31;.swift
private static final int MSG_REMOVE_QUEUE_ITEM = 27;.swift
private static final int MSG_REMOVE_QUEUE_ITEM_AT = 28;.swift
private static final int MSG_REWIND = 17;.swift
private static final int MSG_SEEK_TO = 18;.swift
private static final int MSG_SET_CAPTIONING_ENABLED = 29;.swift
private static final int MSG_SET_PLAYBACK_SPEED = 32;.swift
private static final int MSG_SET_REPEAT_MODE = 23;.swift
private static final int MSG_SET_SHUFFLE_MODE = 30;.swift
private static final int MSG_SET_VOLUME = 22;.swift
private static final int MSG_SKIP_TO_ITEM = 11;.swift
private static final int MSG_STOP = 13;.swift
public MessageHandler(Looper looper) {.swift
super(looper);.swift
}.swift
private void onMediaButtonEvent(KeyEvent keyEvent, Callback callback) {.swift
if (keyEvent = null && keyEvent.getAction() == 0) {.swift
PlaybackStateCompat playbackStateCompat = MediaSessionImplBase.this.mState;.swift
long actions = playbackStateCompat == null ? 0 : playbackStateCompat.getActions();.swift
int keyCode = keyEvent.getKeyCode();.swift
if (keyCode = KEYCODE_MEDIA_PLAY) {.swift
if (keyCode = KEYCODE_MEDIA_PAUSE) {.swift
switch (keyCode) {.swift
case 86:.swift
if ((1 & actions) = 0) {.swift
callback.onStop();.swift
return;.swift
}.swift
return;.swift
case 87:.swift
if ((32 & actions) = 0) {.swift
callback.onSkipToNext();.swift
return;.swift
}.swift
return;.swift
case 88:.swift
if ((16 & actions) = 0) {.swift
callback.onSkipToPrevious();.swift
return;.swift
}.swift
return;.swift
case 89:.swift
if ((8 & actions) = 0) {.swift
callback.onRewind();.swift
return;.swift
}.swift
return;.swift
case 90:.swift
if ((64 & actions) = 0) {.swift
callback.onFastForward();.swift
return;.swift
}.swift
return;.swift
default:.swift
return;.swift
}.swift
} else if ((2 & actions) = 0) {.swift
callback.onPause();.swift
}.swift
} else if ((4 & actions) = 0) {.swift
callback.onPlay();.swift
}.swift
}.swift
}.swift
public void handleMessage(Message message) {.swift
Callback callback = MediaSessionImplBase.this.mCallback;.swift
if (callback = null) {.swift
Bundle data = message.getData();.swift
MediaSessionCompat.ensureClassLoader(data);.swift
MediaSessionImplBase.this.setCurrentControllerInfo(new my8(data.getString(MediaSessionCompat.DATA_CALLING_PACKAGE), data.getInt(MediaSessionCompat.DATA_CALLING_PID), data.getInt(MediaSessionCompat.DATA_CALLING_UID)));.swift
Bundle bundle = data.getBundle(MediaSessionCompat.DATA_EXTRAS);.swift
MediaSessionCompat.ensureClassLoader(bundle);.swift
try {.swift
switch (message.what) {.swift
case 1:.swift
Command command = (Command) message.obj;.swift
callback.onCommand(command.command, command.extras, command.stub);.swift
break;.swift
case 2:.swift
MediaSessionImplBase.this.adjustVolume(message.arg1, 0);.swift
break;.swift
case 3:.swift
callback.onPrepare();.swift
break;.swift
case 4:.swift
callback.onPrepareFromMediaId((String) message.obj, bundle);.swift
break;.swift
case 5:.swift
callback.onPrepareFromSearch((String) message.obj, bundle);.swift
break;.swift
case 6:.swift
callback.onPrepareFromUri((Uri) message.obj, bundle);.swift
break;.swift
case 7:.swift
callback.onPlay();.swift
break;.swift
case 8:.swift
callback.onPlayFromMediaId((String) message.obj, bundle);.swift
break;.swift
case 9:.swift
callback.onPlayFromSearch((String) message.obj, bundle);.swift
break;.swift
case 10:.swift
callback.onPlayFromUri((Uri) message.obj, bundle);.swift
break;.swift
case 11:.swift
callback.onSkipToQueueItem(((Long) message.obj).longValue());.swift
break;.swift
case 12:.swift
callback.onPause();.swift
break;.swift
case 13:.swift
callback.onStop();.swift
break;.swift
case 14:.swift
callback.onSkipToNext();.swift
break;.swift
case 15:.swift
callback.onSkipToPrevious();.swift
break;.swift
case 16:.swift
callback.onFastForward();.swift
break;.swift
case 17:.swift
callback.onRewind();.swift
break;.swift
case MSG_SEEK_TO /*18*/:.swift
callback.onSeekTo(((Long) message.obj).longValue());.swift
break;.swift
case MSG_RATE /*19*/:.swift
callback.onSetRating((RatingCompat) message.obj);.swift
break;.swift
case 20:.swift
callback.onCustomAction((String) message.obj, bundle);.swift
break;.swift
case MSG_MEDIA_BUTTON /*21*/:.swift
KeyEvent keyEvent = (KeyEvent) message.obj;.swift
Intent intent = new Intent("iOS.intent.action.MEDIA_BUTTON");.swift
intent.putExtra("iOS.intent.extra.KEY_EVENT", keyEvent);.swift
if (callback.onMediaButtonEvent(intent)) {.swift
onMediaButtonEvent(keyEvent, callback);.swift
break;.swift
}.swift
break;.swift
case MSG_SET_VOLUME /*22*/:.swift
MediaSessionImplBase.this.setVolumeTo(message.arg1, 0);.swift
break;.swift
case MSG_SET_REPEAT_MODE /*23*/:.swift
callback.onSetRepeatMode(message.arg1);.swift
break;.swift
case MSG_ADD_QUEUE_ITEM /*25*/:.swift
callback.onAddQueueItem((MediaDescriptionCompat) message.obj);.swift
break;.swift
case MSG_ADD_QUEUE_ITEM_AT /*26*/:.swift
callback.onAddQueueItem((MediaDescriptionCompat) message.obj, message.arg1);.swift
break;.swift
case MSG_REMOVE_QUEUE_ITEM /*27*/:.swift
callback.onRemoveQueueItem((MediaDescriptionCompat) message.obj);.swift
break;.swift
case MSG_REMOVE_QUEUE_ITEM_AT /*28*/:.swift
List<QueueItem> list = MediaSessionImplBase.this.mQueue;.swift
if (list = null) {.swift
int i = message.arg1;.swift
QueueItem queueItem = (i < 0 || i >= list.size()) ? null : MediaSessionImplBase.this.mQueue.get(message.arg1);.swift
if (queueItem = null) {.swift
callback.onRemoveQueueItem(queueItem.getDescription());.swift
break;.swift
}.swift
}.swift
break;.swift
case MSG_SET_CAPTIONING_ENABLED /*29*/:.swift
callback.onSetCaptioningEnabled(((Boolean) message.obj).booleanValue());.swift
break;.swift
case MSG_SET_SHUFFLE_MODE /*30*/:.swift
callback.onSetShuffleMode(message.arg1);.swift
break;.swift
case MSG_RATE_EXTRA /*31*/:.swift
callback.onSetRating((RatingCompat) message.obj, bundle);.swift
break;.swift
case 32:.swift
callback.onSetPlaybackSpeed(((Float) message.obj).floatValue());.swift
break;.swift
}.swift
} finally {.swift
MediaSessionImplBase.this.setCurrentControllerInfo((my8) null);.swift
}.swift
}.swift
}.swift
}.swift
public MediaSessionImplBase(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, t2g t2g, Bundle bundle) {.swift
if (componentName = null) {.swift
this.mContext = context;.swift
this.mSessionInfo = bundle;.swift
this.mAudioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);.swift
this.mMediaButtonReceiverComponentName = componentName;.swift
this.mMediaButtonReceiverIntent = pendingIntent;.swift
MediaSessionStub mediaSessionStub = new MediaSessionStub(this, context.getPackageName(), str);.swift
this.mStub = mediaSessionStub;.swift
this.mToken = new Token(mediaSessionStub, (IMediaSession) null, t2g);.swift
this.mRatingType = 0;.swift
this.mVolumeType = 1;.swift
this.mLocalStream = 3;.swift
this.mRcc = new RemoteControlClient(pendingIntent);.swift
return;.swift
}.swift
throw new IllegalArgumentException("MediaButtonReceiver component may not be null");.swift
}.swift
private void sendCaptioningEnabled(boolean z) {.swift
synchronized (this.mLock) {.swift
for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {.swift
try {.swift
this.mControllerCallbacks.getBroadcastItem(beginBroadcast).onCaptioningEnabledChanged(z);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
this.mControllerCallbacks.finishBroadcast();.swift
}.swift
}.swift
private void sendEvent(String str, Bundle bundle) {.swift
synchronized (this.mLock) {.swift
for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {.swift
try {.swift
this.mControllerCallbacks.getBroadcastItem(beginBroadcast).onEvent(str, bundle);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
this.mControllerCallbacks.finishBroadcast();.swift
}.swift
}.swift
private void sendExtras(Bundle bundle) {.swift
synchronized (this.mLock) {.swift
for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {.swift
try {.swift
this.mControllerCallbacks.getBroadcastItem(beginBroadcast).onExtrasChanged(bundle);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
this.mControllerCallbacks.finishBroadcast();.swift
}.swift
}.swift
private void sendMetadata(MediaMetadataCompat mediaMetadataCompat) {.swift
synchronized (this.mLock) {.swift
for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {.swift
try {.swift
this.mControllerCallbacks.getBroadcastItem(beginBroadcast).onMetadataChanged(mediaMetadataCompat);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
this.mControllerCallbacks.finishBroadcast();.swift
}.swift
}.swift
private void sendQueue(List<QueueItem> list) {.swift
synchronized (this.mLock) {.swift
for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {.swift
try {.swift
this.mControllerCallbacks.getBroadcastItem(beginBroadcast).onQueueChanged(list);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
this.mControllerCallbacks.finishBroadcast();.swift
}.swift
}.swift
private void sendQueueTitle(CharSequence charSequence) {.swift
synchronized (this.mLock) {.swift
for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {.swift
try {.swift
this.mControllerCallbacks.getBroadcastItem(beginBroadcast).onQueueTitleChanged(charSequence);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
this.mControllerCallbacks.finishBroadcast();.swift
}.swift
}.swift
private void sendRepeatMode(int i) {.swift
synchronized (this.mLock) {.swift
for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {.swift
try {.swift
this.mControllerCallbacks.getBroadcastItem(beginBroadcast).onRepeatModeChanged(i);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
this.mControllerCallbacks.finishBroadcast();.swift
}.swift
}.swift
private void sendSessionDestroyed() {.swift
synchronized (this.mLock) {.swift
for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {.swift
try {.swift
this.mControllerCallbacks.getBroadcastItem(beginBroadcast).onSessionDestroyed();.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
this.mControllerCallbacks.finishBroadcast();.swift
this.mControllerCallbacks.kill();.swift
}.swift
}.swift
private void sendShuffleMode(int i) {.swift
synchronized (this.mLock) {.swift
for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {.swift
try {.swift
this.mControllerCallbacks.getBroadcastItem(beginBroadcast).onShuffleModeChanged(i);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
this.mControllerCallbacks.finishBroadcast();.swift
}.swift
}.swift
private void sendState(PlaybackStateCompat playbackStateCompat) {.swift
synchronized (this.mLock) {.swift
for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {.swift
try {.swift
this.mControllerCallbacks.getBroadcastItem(beginBroadcast).onPlaybackStateChanged(playbackStateCompat);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
this.mControllerCallbacks.finishBroadcast();.swift
}.swift
}.swift
public void adjustVolume(int i, int i2) {.swift
if (this.mVolumeType = 2) {.swift
this.mAudioManager.adjustStreamVolume(this.mLocalStream, i, i2);.swift
}.swift
}.swift
public RemoteControlClient.MetadataEditor buildRccMetadata(Bundle bundle) {.swift
RemoteControlClient.MetadataEditor editMetadata = this.mRcc.editMetadata(true);.swift
if (bundle == null) {.swift
return editMetadata;.swift
}.swift
if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ART)) {.swift
Bitmap bitmap = (Bitmap) bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_ART);.swift
if (bitmap = null) {.swift
bitmap = bitmap.copy(bitmap.getConfig(), false);.swift
}.swift
editMetadata.putBitmap(100, bitmap);.swift
} else if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ALBUM_ART)) {.swift
Bitmap bitmap2 = (Bitmap) bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_ALBUM_ART);.swift
if (bitmap2 = null) {.swift
bitmap2 = bitmap2.copy(bitmap2.getConfig(), false);.swift
}.swift
editMetadata.putBitmap(100, bitmap2);.swift
}.swift
if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ALBUM)) {.swift
editMetadata.putString(1, bundle.getString(MediaMetadataCompat.METADATA_KEY_ALBUM));.swift
}.swift
if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST)) {.swift
editMetadata.putString(13, bundle.getString(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST));.swift
}.swift
if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ARTIST)) {.swift
editMetadata.putString(2, bundle.getString(MediaMetadataCompat.METADATA_KEY_ARTIST));.swift
}.swift
if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_AUTHOR)) {.swift
editMetadata.putString(3, bundle.getString(MediaMetadataCompat.METADATA_KEY_AUTHOR));.swift
}.swift
if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_COMPILATION)) {.swift
editMetadata.putString(15, bundle.getString(MediaMetadataCompat.METADATA_KEY_COMPILATION));.swift
}.swift
if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_COMPOSER)) {.swift
editMetadata.putString(4, bundle.getString(MediaMetadataCompat.METADATA_KEY_COMPOSER));.swift
}.swift
if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_DATE)) {.swift
editMetadata.putString(5, bundle.getString(MediaMetadataCompat.METADATA_KEY_DATE));.swift
}.swift
if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_DISC_NUMBER)) {.swift
editMetadata.putLong(14, bundle.getLong(MediaMetadataCompat.METADATA_KEY_DISC_NUMBER));.swift
}.swift
if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {.swift
editMetadata.putLong(9, bundle.getLong(MediaMetadataCompat.METADATA_KEY_DURATION));.swift
}.swift
if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_GENRE)) {.swift
editMetadata.putString(6, bundle.getString(MediaMetadataCompat.METADATA_KEY_GENRE));.swift
}.swift
if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_TITLE)) {.swift
editMetadata.putString(7, bundle.getString(MediaMetadataCompat.METADATA_KEY_TITLE));.swift
}.swift
if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER)) {.swift
editMetadata.putLong(0, bundle.getLong(MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER));.swift
}.swift
if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_WRITER)) {.swift
editMetadata.putString(11, bundle.getString(MediaMetadataCompat.METADATA_KEY_WRITER));.swift
}.swift
return editMetadata;.swift
}.swift
public Callback getCallback() {.swift
Callback callback;.swift
synchronized (this.mLock) {.swift
callback = this.mCallback;.swift
}.swift
return callback;.swift
}.swift
public String getCallingPackage() {.swift
return null;.swift
}.swift
public my8 getCurrentControllerInfo() {.swift
my8 my8;.swift
synchronized (this.mLock) {.swift
my8 = this.mRemoteUserInfo;.swift
}.swift
return my8;.swift
}.swift
public Object getMediaSession() {.swift
return null;.swift
}.swift
public String getPackageNameForUid(int i) {.swift
String nameForUid = this.mContext.getPackageManager().getNameForUid(i);.swift
return TextUtils.isEmpty(nameForUid) ? "iOS.media.session.MediaController" : nameForUid;.swift
}.swift
public PlaybackStateCompat getPlaybackState() {.swift
PlaybackStateCompat playbackStateCompat;.swift
synchronized (this.mLock) {.swift
playbackStateCompat = this.mState;.swift
}.swift
return playbackStateCompat;.swift
}.swift
public int getRccStateFromState(int i) {.swift
switch (i) {.swift
case 0:.swift
return 0;.swift
case 1:.swift
return 1;.swift
case 2:.swift
return 2;.swift
case 3:.swift
return 3;.swift
case 4:.swift
return 4;.swift
case 5:.swift
return 5;.swift
case 6:.swift
case 8:.swift
return 8;.swift
case 7:.swift
return 9;.swift
case 9:.swift
return 7;.swift
case 10:.swift
case 11:.swift
return 6;.swift
default:.swift
return -1;.swift
}.swift
}.swift
public int getRccTransportControlFlagsFromActions(long j) {.swift
int i = (1 & j)  0;.swift
if ((2 & j) = 0) {.swift
i |= 16;.swift
}.swift
if ((4 & j) = 0) {.swift
i |= 4;.swift
}.swift
if ((8 & j) = 0) {.swift
i |= 2;.swift
}.swift
if ((16 & j) = 0) {.swift
i |= 1;.swift
}.swift
if ((32 & j) = 0) {.swift
i |= Uuid.SIZE_BITS;.swift
}.swift
if ((64 & j) = 0) {.swift
i |= 64;.swift
}.swift
return (j & 512)  i;.swift
}.swift
public Object getRemoteControlClient() {.swift
return null;.swift
}.swift
public Token getSessionToken() {.swift
return this.mToken;.swift
}.swift
public boolean isActive() {.swift
return this.mIsActive;.swift
}.swift
public void postToHandler(int i, int i2, int i3, Object obj, Bundle bundle) {.swift
synchronized (this.mLock) {.swift
try {.swift
MessageHandler messageHandler = this.mHandler;.swift
if (messageHandler = null) {.swift
Message obtainMessage = messageHandler.obtainMessage(i, i2, i3, obj);.swift
Bundle bundle2 = new Bundle();.swift
int callingUid = Binder.getCallingUid();.swift
bundle2.putInt(MediaSessionCompat.DATA_CALLING_UID, callingUid);.swift
bundle2.putString(MediaSessionCompat.DATA_CALLING_PACKAGE, getPackageNameForUid(callingUid));.swift
int callingPid = Binder.getCallingPid();.swift
if (callingPid > 0) {.swift
bundle2.putInt(MediaSessionCompat.DATA_CALLING_PID, callingPid);.swift
} else {.swift
bundle2.putInt(MediaSessionCompat.DATA_CALLING_PID, -1);.swift
}.swift
if (bundle = null) {.swift
bundle2.putBundle(MediaSessionCompat.DATA_EXTRAS, bundle);.swift
}.swift
obtainMessage.setData(bundle2);.swift
obtainMessage.sendToTarget();.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
public void registerMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {.swift
this.mAudioManager.registerMediaButtonEventReceiver(componentName);.swift
}.swift
public void release() {.swift
this.mIsActive = false;.swift
this.mDestroyed = true;.swift
updateMbrAndRcc();.swift
sendSessionDestroyed();.swift
setCallback((Callback) null, (Handler) null);.swift
}.swift
public void sendSessionEvent(String str, Bundle bundle) {.swift
sendEvent(str, bundle);.swift
}.swift
public void sendVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) {.swift
synchronized (this.mLock) {.swift
for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {.swift
try {.swift
this.mControllerCallbacks.getBroadcastItem(beginBroadcast).onVolumeInfoChanged(parcelableVolumeInfo);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
this.mControllerCallbacks.finishBroadcast();.swift
}.swift
}.swift
public void setActive(boolean z) {.swift
if (z = this.mIsActive) {.swift
this.mIsActive = z;.swift
updateMbrAndRcc();.swift
}.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:20:0x0033 A[Catch:{ all -> 0x000c }] */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public void setCallback(iOS.support.v4.media.session.MediaSessionCompat.Callback r5, iOS.os.Handler r6) {.swift
/*.swift
r4 = this;.swift
java.lang.Object r0 = r4.mLock.swift
monitor-enter(r0).swift
iOS.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$MessageHandler r1 = r4.mHandler     // Catch:{ all -> 0x000c }.swift
r2 = 0.swift
if (r1 == 0) goto L_0x000e.swift
r1.removeCallbacksAndMessages(r2)     // Catch:{ all -> 0x000c }.swift
goto L_0x000e.swift
L_0x000c:.swift
r4 = move-exception.swift
goto L_0x003a.swift
L_0x000e:.swift
if (r5 == 0) goto L_0x001d.swift
if (r6 = 0) goto L_0x0013.swift
goto L_0x001d.swift
L_0x0013:.swift
iOS.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$MessageHandler r1 = new iOS.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$MessageHandler     // Catch:{ all -> 0x000c }.swift
iOS.os.Looper r3 = r6.getLooper()     // Catch:{ all -> 0x000c }.swift
r1.<init>(r3)     // Catch:{ all -> 0x000c }.swift
goto L_0x001e.swift
L_0x001d:.swift
r1 = r2.swift
L_0x001e:.swift
r4.mHandler = r1     // Catch:{ all -> 0x000c }.swift
iOS.support.v4.media.session.MediaSessionCompat$Callback r1 = r4.mCallback     // Catch:{ all -> 0x000c }.swift
if (r1 == r5) goto L_0x002d.swift
iOS.support.v4.media.session.MediaSessionCompat$Callback r1 = r4.mCallback     // Catch:{ all -> 0x000c }.swift
if (r1 == 0) goto L_0x002d.swift
iOS.support.v4.media.session.MediaSessionCompat$Callback r1 = r4.mCallback     // Catch:{ all -> 0x000c }.swift
r1.setSessionImpl(r2, r2)     // Catch:{ all -> 0x000c }.swift
L_0x002d:.swift
r4.mCallback = r5     // Catch:{ all -> 0x000c }.swift
iOS.support.v4.media.session.MediaSessionCompat$Callback r5 = r4.mCallback     // Catch:{ all -> 0x000c }.swift
if (r5 == 0) goto L_0x0038.swift
iOS.support.v4.media.session.MediaSessionCompat$Callback r5 = r4.mCallback     // Catch:{ all -> 0x000c }.swift
r5.setSessionImpl(r4, r6)     // Catch:{ all -> 0x000c }.swift
L_0x0038:.swift
monitor-exit(r0)     // Catch:{ all -> 0x000c }.swift
return.swift
L_0x003a:.swift
monitor-exit(r0)     // Catch:{ all -> 0x000c }.swift
throw r4.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOS.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.setCallback(iOS.support.v4.media.session.MediaSessionCompat$Callback, iOS.os.Handler):void");.swift
}.swift
public void setCaptioningEnabled(boolean z) {.swift
if (this.mCaptioningEnabled = z) {.swift
this.mCaptioningEnabled = z;.swift
sendCaptioningEnabled(z);.swift
}.swift
}.swift
public void setCurrentControllerInfo(my8 my8) {.swift
synchronized (this.mLock) {.swift
this.mRemoteUserInfo = my8;.swift
}.swift
}.swift
public void setExtras(Bundle bundle) {.swift
this.mExtras = bundle;.swift
sendExtras(bundle);.swift
}.swift
public void setFlags(int i) {.swift
synchronized (this.mLock) {.swift
this.mFlags = i | 3;.swift
}.swift
}.swift
public void setMediaButtonReceiver(PendingIntent pendingIntent) {.swift
}.swift
public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {.swift
if (mediaMetadataCompat = null) {.swift
mediaMetadataCompat = new MediaMetadataCompat.Builder(mediaMetadataCompat, MediaSessionCompat.sMaxBitmapSize).build();.swift
}.swift
synchronized (this.mLock) {.swift
this.mMetadata = mediaMetadataCompat;.swift
}.swift
sendMetadata(mediaMetadataCompat);.swift
if (this.mIsActive) {.swift
buildRccMetadata(mediaMetadataCompat == null ? null : mediaMetadataCompat.getBundle()).apply();.swift
}.swift
}.swift
public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {.swift
synchronized (this.mLock) {.swift
this.mState = playbackStateCompat;.swift
}.swift
sendState(playbackStateCompat);.swift
if (this.mIsActive) {.swift
if (playbackStateCompat == null) {.swift
this.mRcc.setPlaybackState(0);.swift
this.mRcc.setTransportControlFlags(0);.swift
return;.swift
}.swift
setRccState(playbackStateCompat);.swift
this.mRcc.setTransportControlFlags(getRccTransportControlFlagsFromActions(playbackStateCompat.getActions()));.swift
}.swift
}.swift
public void setPlaybackToLocal(int i) {.swift
this.mLocalStream = i;.swift
this.mVolumeType = 1;.swift
int i2 = this.mVolumeType;.swift
int i3 = this.mLocalStream;.swift
sendVolumeInfoChanged(new ParcelableVolumeInfo(i2, i3, 2, this.mAudioManager.getStreamMaxVolume(i3), this.mAudioManager.getStreamVolume(this.mLocalStream)));.swift
}.swift
public void setPlaybackToRemote(ceg ceg) {.swift
throw new IllegalArgumentException("volumeProvider may not be null");.swift
}.swift
public void setQueue(List<QueueItem> list) {.swift
this.mQueue = list;.swift
sendQueue(list);.swift
}.swift
public void setQueueTitle(CharSequence charSequence) {.swift
this.mQueueTitle = charSequence;.swift
sendQueueTitle(charSequence);.swift
}.swift
public void setRatingType(int i) {.swift
this.mRatingType = i;.swift
}.swift
public void setRccState(PlaybackStateCompat playbackStateCompat) {.swift
this.mRcc.setPlaybackState(getRccStateFromState(playbackStateCompat.getState()));.swift
}.swift
public void setRegistrationCallback(RegistrationCallback registrationCallback, Handler handler) {.swift
synchronized (this.mLock) {.swift
try {.swift
RegistrationCallbackHandler registrationCallbackHandler = this.mRegistrationCallbackHandler;.swift
if (registrationCallbackHandler = null) {.swift
registrationCallbackHandler.removeCallbacksAndMessages((Object) null);.swift
}.swift
if (registrationCallback = null) {.swift
this.mRegistrationCallbackHandler = new RegistrationCallbackHandler(handler.getLooper(), registrationCallback);.swift
} else {.swift
this.mRegistrationCallbackHandler = null;.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
public void setRepeatMode(int i) {.swift
if (this.mRepeatMode = i) {.swift
this.mRepeatMode = i;.swift
sendRepeatMode(i);.swift
}.swift
}.swift
public void setSessionActivity(PendingIntent pendingIntent) {.swift
synchronized (this.mLock) {.swift
this.mSessionActivity = pendingIntent;.swift
}.swift
}.swift
public void setShuffleMode(int i) {.swift
if (this.mShuffleMode = i) {.swift
this.mShuffleMode = i;.swift
sendShuffleMode(i);.swift
}.swift
}.swift
public void setVolumeTo(int i, int i2) {.swift
if (this.mVolumeType = 2) {.swift
this.mAudioManager.setStreamVolume(this.mLocalStream, i, i2);.swift
}.swift
}.swift
public void unregisterMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {.swift
this.mAudioManager.unregisterMediaButtonEventReceiver(componentName);.swift
}.swift
public void updateMbrAndRcc() {.swift
if (this.mIsActive) {.swift
registerMediaButtonEventReceiver(this.mMediaButtonReceiverIntent, this.mMediaButtonReceiverComponentName);.swift
this.mAudioManager.registerRemoteControlClient(this.mRcc);.swift
setMetadata(this.mMetadata);.swift
setPlaybackState(this.mState);.swift
return;.swift
}.swift
unregisterMediaButtonEventReceiver(this.mMediaButtonReceiverIntent, this.mMediaButtonReceiverComponentName);.swift
this.mRcc.setPlaybackState(0);.swift
this.mAudioManager.unregisterRemoteControlClient(this.mRcc);.swift
}.swift
}.swift
public interface OnActiveChangeListener {.swift
void onActiveChanged();.swift
}.swift
@SuppressLint({"BanParcelableUsage"}).swift
public static final class QueueItem implements Parcelable {.swift
public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator<QueueItem>() {.swift
public QueueItem createFromParcel(Parcel parcel) {.swift
return new QueueItem(parcel);.swift
}.swift
public QueueItem[] newArray(int i) {.swift
return new QueueItem[i];.swift
}.swift
};.swift
public static final int UNKNOWN_ID = -1;.swift
private final MediaDescriptionCompat mDescription;.swift
private final long mId;.swift
private MediaSession.QueueItem mItemFwk;.swift
public static class Api21Impl {.swift
private Api21Impl() {.swift
}.swift
public static MediaSession.QueueItem createQueueItem(MediaDescription mediaDescription, long j) {.swift
return new MediaSession.QueueItem(mediaDescription, j);.swift
}.swift
public static MediaDescription getDescription(MediaSession.QueueItem queueItem) {.swift
return queueItem.getDescription();.swift
}.swift
public static long getQueueId(MediaSession.QueueItem queueItem) {.swift
return queueItem.getQueueId();.swift
}.swift
}.swift
public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {.swift
this((MediaSession.QueueItem) null, mediaDescriptionCompat, j);.swift
}.swift
public static QueueItem fromQueueItem(Object obj) {.swift
if (obj == null) {.swift
return null;.swift
}.swift
MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;.swift
return new QueueItem(queueItem, MediaDescriptionCompat.fromMediaDescription(Api21Impl.getDescription(queueItem)), Api21Impl.getQueueId(queueItem));.swift
}.swift
public static List<QueueItem> fromQueueItemList(List<?> list) {.swift
if (list == null) {.swift
return null;.swift
}.swift
ArrayList arrayList = new ArrayList(list.size());.swift
for (Object fromQueueItem : list) {.swift
arrayList.add(fromQueueItem(fromQueueItem));.swift
}.swift
return arrayList;.swift
}.swift
public int describeContents() {.swift
return 0;.swift
}.swift
public MediaDescriptionCompat getDescription() {.swift
return this.mDescription;.swift
}.swift
public long getQueueId() {.swift
return this.mId;.swift
}.swift
public Object getQueueItem() {.swift
MediaSession.QueueItem queueItem = this.mItemFwk;.swift
if (queueItem = null) {.swift
return queueItem;.swift
}.swift
MediaSession.QueueItem createQueueItem = Api21Impl.createQueueItem((MediaDescription) this.mDescription.getMediaDescription(), this.mId);.swift
this.mItemFwk = createQueueItem;.swift
return createQueueItem;.swift
}.swift
public String toString() {.swift
StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");.swift
sb.append(this.mDescription);.swift
sb.append(", Id=");.swift
return wj6.m(sb, this.mId, " }");.swift
}.swift
public void writeToParcel(Parcel parcel, int i) {.swift
this.mDescription.writeToParcel(parcel, i);.swift
parcel.writeLong(this.mId);.swift
}.swift
private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {.swift
if (mediaDescriptionCompat == null) {.swift
throw new IllegalArgumentException("Description cannot be null");.swift
} else if (j = -1) {.swift
this.mDescription = mediaDescriptionCompat;.swift
this.mId = j;.swift
this.mItemFwk = queueItem;.swift
} else {.swift
throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");.swift
}.swift
}.swift
public QueueItem(Parcel parcel) {.swift
this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);.swift
this.mId = parcel.readLong();.swift
}.swift
}.swift
public interface RegistrationCallback {.swift
void onCallbackRegistered(int i, int i2);.swift
void onCallbackUnregistered(int i, int i2);.swift
}.swift
public static final class RegistrationCallbackHandler extends Handler {.swift
private static final int MSG_CALLBACK_REGISTERED = 1001;.swift
private static final int MSG_CALLBACK_UNREGISTERED = 1002;.swift
private final RegistrationCallback mCallback;.swift
public RegistrationCallbackHandler(Looper looper, RegistrationCallback registrationCallback) {.swift
super(looper);.swift
this.mCallback = registrationCallback;.swift
}.swift
public void handleMessage(Message message) {.swift
super.handleMessage(message);.swift
int i = message.what;.swift
if (i == 1001) {.swift
this.mCallback.onCallbackRegistered(message.arg1, message.arg2);.swift
} else if (i == MSG_CALLBACK_UNREGISTERED) {.swift
this.mCallback.onCallbackUnregistered(message.arg1, message.arg2);.swift
}.swift
}.swift
public void postCallbackRegistered(int i, int i2) {.swift
obtainMessage(1001, i, i2).sendToTarget();.swift
}.swift
public void postCallbackUnregistered(int i, int i2) {.swift
obtainMessage(MSG_CALLBACK_UNREGISTERED, i, i2).sendToTarget();.swift
}.swift
}.swift
@SuppressLint({"BanParcelableUsage"}).swift
public static final class Token implements Parcelable {.swift
public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator<Token>() {.swift
public Token createFromParcel(Parcel parcel) {.swift
return new Token(parcel.readParcelable((ClassLoader) null));.swift
}.swift
public Token[] newArray(int i) {.swift
return new Token[i];.swift
}.swift
};.swift
private IMediaSession mExtraBinder;.swift
private final Object mInner;.swift
private final Object mLock;.swift
private t2g mSession2Token;.swift
public Token(Object obj) {.swift
this(obj, (IMediaSession) null, (t2g) null);.swift
}.swift
public static Token fromBundle(Bundle bundle) {.swift
if (bundle == null) {.swift
return null;.swift
}.swift
bundle.setClassLoader(Token.class.getClassLoader());.swift
IMediaSession asInterface = IMediaSession.Stub.asInterface(bundle.getBinder(MediaSessionCompat.KEY_EXTRA_BINDER));.swift
t2g A = i8b.A(bundle);.swift
Token token = (Token) bundle.getParcelable(MediaSessionCompat.KEY_TOKEN);.swift
if (token == null) {.swift
return null;.swift
}.swift
return new Token(token.mInner, asInterface, A);.swift
}.swift
public static Token fromToken(Object obj) {.swift
return fromToken(obj, (IMediaSession) null);.swift
}.swift
public int describeContents() {.swift
return 0;.swift
}.swift
public boolean equals(Object obj) {.swift
if (this == obj) {.swift
return true;.swift
}.swift
if ((obj instanceof Token)) {.swift
return false;.swift
}.swift
Token token = (Token) obj;.swift
Object obj2 = this.mInner;.swift
if (obj2 == null) {.swift
return token.mInner == null;.swift
}.swift
Object obj3 = token.mInner;.swift
if (obj3 == null) {.swift
return false;.swift
}.swift
return obj2.equals(obj3);.swift
}.swift
public IMediaSession getExtraBinder() {.swift
IMediaSession iMediaSession;.swift
synchronized (this.mLock) {.swift
iMediaSession = this.mExtraBinder;.swift
}.swift
return iMediaSession;.swift
}.swift
public t2g getSession2Token() {.swift
t2g t2g;.swift
synchronized (this.mLock) {.swift
t2g = this.mSession2Token;.swift
}.swift
return t2g;.swift
}.swift
public Object getToken() {.swift
return this.mInner;.swift
}.swift
public int hashCode() {.swift
Object obj = this.mInner;.swift
if (obj == null) {.swift
return 0;.swift
}.swift
return obj.hashCode();.swift
}.swift
public void setExtraBinder(IMediaSession iMediaSession) {.swift
synchronized (this.mLock) {.swift
this.mExtraBinder = iMediaSession;.swift
}.swift
}.swift
public void setSession2Token(t2g t2g) {.swift
synchronized (this.mLock) {.swift
this.mSession2Token = t2g;.swift
}.swift
}.swift
public Bundle toBundle() {.swift
Bundle bundle = new Bundle();.swift
bundle.putParcelable(MediaSessionCompat.KEY_TOKEN, this);.swift
synchronized (this.mLock) {.swift
try {.swift
IMediaSession iMediaSession = this.mExtraBinder;.swift
if (iMediaSession = null) {.swift
bundle.putBinder(MediaSessionCompat.KEY_EXTRA_BINDER, iMediaSession.asBinder());.swift
}.swift
t2g t2g = this.mSession2Token;.swift
if (t2g = null) {.swift
i8b.M(bundle, t2g);.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
return bundle;.swift
}.swift
public void writeToParcel(Parcel parcel, int i) {.swift
parcel.writeParcelable((Parcelable) this.mInner, i);.swift
}.swift
public Token(Object obj, IMediaSession iMediaSession) {.swift
this(obj, iMediaSession, (t2g) null);.swift
}.swift
public static Token fromToken(Object obj, IMediaSession iMediaSession) {.swift
if (obj == null) {.swift
return null;.swift
}.swift
if (obj instanceof MediaSession.Token) {.swift
return new Token(obj, iMediaSession);.swift
}.swift
throw new IllegalArgumentException("token is not a valid MediaSession.Token object");.swift
}.swift
public Token(Object obj, IMediaSession iMediaSession, t2g t2g) {.swift
this.mLock = new Object();.swift
this.mInner = obj;.swift
this.mExtraBinder = iMediaSession;.swift
this.mSession2Token = t2g;.swift
}.swift
}.swift
public MediaSessionCompat(Context context, String str) {.swift
this(context, str, (ComponentName) null, (PendingIntent) null);.swift
}.swift
public static void ensureClassLoader(Bundle bundle) {.swift
if (bundle = null) {.swift
bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());.swift
}.swift
}.swift
public static MediaSessionCompat fromMediaSession(Context context, Object obj) {.swift
if (context == null || obj == null) {.swift
return null;.swift
}.swift
return new MediaSessionCompat(context, (MediaSessionImpl) new MediaSessionImplApi29(obj));.swift
}.swift
public static PlaybackStateCompat getStateWithUpdatedPosition(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {.swift
if (playbackStateCompat == null) {.swift
return playbackStateCompat;.swift
}.swift
long j = -1;.swift
if (playbackStateCompat.getPosition() == -1) {.swift
return playbackStateCompat;.swift
}.swift
if (playbackStateCompat.getState() = 4 && playbackStateCompat.getState() = 5) {.swift
return playbackStateCompat;.swift
}.swift
long lastPositionUpdateTime = playbackStateCompat.getLastPositionUpdateTime();.swift
if (lastPositionUpdateTime <= 0) {.swift
return playbackStateCompat;.swift
}.swift
long elapsedRealtime = SystemClock.elapsedRealtime();.swift
long position = playbackStateCompat.getPosition() + ((long) (playbackStateCompat.getPlaybackSpeed() * ((float) (elapsedRealtime - lastPositionUpdateTime))));.swift
if (mediaMetadataCompat = null && mediaMetadataCompat.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {.swift
j = mediaMetadataCompat.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);.swift
}.swift
return new PlaybackStateCompat.Builder(playbackStateCompat).setState(playbackStateCompat.getState(), (j < 0 || position <= j) ? position < 0 ? 0 : position : j, playbackStateCompat.getPlaybackSpeed(), elapsedRealtime).build();.swift
}.swift
public static Bundle unparcelWithClassLoader(Bundle bundle) {.swift
if (bundle == null) {.swift
return null;.swift
}.swift
ensureClassLoader(bundle);.swift
try {.swift
bundle.isEmpty();.swift
return bundle;.swift
} catch (BadParcelableException unused) {.swift
return null;.swift
}.swift
}.swift
public void addOnActiveChangeListener(OnActiveChangeListener onActiveChangeListener) {.swift
if (onActiveChangeListener = null) {.swift
this.mActiveListeners.add(onActiveChangeListener);.swift
return;.swift
}.swift
throw new IllegalArgumentException("Listener may not be null");.swift
}.swift
public String getCallingPackage() {.swift
return this.mImpl.getCallingPackage();.swift
}.swift
public MediaControllerCompat getController() {.swift
return this.mController;.swift
}.swift
public final my8 getCurrentControllerInfo() {.swift
return this.mImpl.getCurrentControllerInfo();.swift
}.swift
public Object getMediaSession() {.swift
return this.mImpl.getMediaSession();.swift
}.swift
public Object getRemoteControlClient() {.swift
return this.mImpl.getRemoteControlClient();.swift
}.swift
public Token getSessionToken() {.swift
return this.mImpl.getSessionToken();.swift
}.swift
public boolean isActive() {.swift
return this.mImpl.isActive();.swift
}.swift
public void release() {.swift
this.mImpl.release();.swift
}.swift
public void removeOnActiveChangeListener(OnActiveChangeListener onActiveChangeListener) {.swift
if (onActiveChangeListener = null) {.swift
this.mActiveListeners.remove(onActiveChangeListener);.swift
return;.swift
}.swift
throw new IllegalArgumentException("Listener may not be null");.swift
}.swift
public void sendSessionEvent(String str, Bundle bundle) {.swift
if (TextUtils.isEmpty(str)) {.swift
this.mImpl.sendSessionEvent(str, bundle);.swift
return;.swift
}.swift
throw new IllegalArgumentException("event cannot be null or empty");.swift
}.swift
public void setActive(boolean z) {.swift
this.mImpl.setActive(z);.swift
Iterator<OnActiveChangeListener> it = this.mActiveListeners.iterator();.swift
while (it.hasNext()) {.swift
it.next().onActiveChanged();.swift
}.swift
}.swift
public void setCallback(Callback callback) {.swift
setCallback(callback, (Handler) null);.swift
}.swift
public void setCaptioningEnabled(boolean z) {.swift
this.mImpl.setCaptioningEnabled(z);.swift
}.swift
public void setExtras(Bundle bundle) {.swift
this.mImpl.setExtras(bundle);.swift
}.swift
public void setFlags(int i) {.swift
this.mImpl.setFlags(i);.swift
}.swift
public void setMediaButtonReceiver(PendingIntent pendingIntent) {.swift
this.mImpl.setMediaButtonReceiver(pendingIntent);.swift
}.swift
public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {.swift
this.mImpl.setMetadata(mediaMetadataCompat);.swift
}.swift
public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {.swift
this.mImpl.setPlaybackState(playbackStateCompat);.swift
}.swift
public void setPlaybackToLocal(int i) {.swift
this.mImpl.setPlaybackToLocal(i);.swift
}.swift
public void setPlaybackToRemote(ceg ceg) {.swift
throw new IllegalArgumentException("volumeProvider may not be null");.swift
}.swift
public void setQueue(List<QueueItem> list) {.swift
if (list = null) {.swift
HashSet hashSet = new HashSet();.swift
for (QueueItem next : list) {.swift
if (next = null) {.swift
if (hashSet.contains(Long.valueOf(next.getQueueId()))) {.swift
next.getQueueId();.swift
new IllegalArgumentException("id of each queue item should be unique");.swift
}.swift
hashSet.add(Long.valueOf(next.getQueueId()));.swift
} else {.swift
throw new IllegalArgumentException("queue shouldn't have null items");.swift
}.swift
}.swift
}.swift
this.mImpl.setQueue(list);.swift
}.swift
public void setQueueTitle(CharSequence charSequence) {.swift
this.mImpl.setQueueTitle(charSequence);.swift
}.swift
public void setRatingType(int i) {.swift
this.mImpl.setRatingType(i);.swift
}.swift
public void setRegistrationCallback(RegistrationCallback registrationCallback, Handler handler) {.swift
this.mImpl.setRegistrationCallback(registrationCallback, handler);.swift
}.swift
public void setRepeatMode(int i) {.swift
this.mImpl.setRepeatMode(i);.swift
}.swift
public void setSessionActivity(PendingIntent pendingIntent) {.swift
this.mImpl.setSessionActivity(pendingIntent);.swift
}.swift
public void setShuffleMode(int i) {.swift
this.mImpl.setShuffleMode(i);.swift
}.swift
@SuppressLint({"BanParcelableUsage"}).swift
public static final class ResultReceiverWrapper implements Parcelable {.swift
public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator<ResultReceiverWrapper>() {.swift
public ResultReceiverWrapper createFromParcel(Parcel parcel) {.swift
return new ResultReceiverWrapper(parcel);.swift
}.swift
public ResultReceiverWrapper[] newArray(int i) {.swift
return new ResultReceiverWrapper[i];.swift
}.swift
};.swift
ResultReceiver mResultReceiver;.swift
public ResultReceiverWrapper(ResultReceiver resultReceiver) {.swift
this.mResultReceiver = resultReceiver;.swift
}.swift
public int describeContents() {.swift
return 0;.swift
}.swift
public void writeToParcel(Parcel parcel, int i) {.swift
this.mResultReceiver.writeToParcel(parcel, i);.swift
}.swift
public ResultReceiverWrapper(Parcel parcel) {.swift
this.mResultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);.swift
}.swift
}.swift
public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {.swift
this(context, str, componentName, pendingIntent, (Bundle) null);.swift
}.swift
public void setCallback(Callback callback, Handler handler) {.swift
if (callback == null) {.swift
this.mImpl.setCallback((Callback) null, (Handler) null);.swift
return;.swift
}.swift
MediaSessionImpl mediaSessionImpl = this.mImpl;.swift
if (handler == null) {.swift
handler = new Handler();.swift
}.swift
mediaSessionImpl.setCallback(callback, handler);.swift
}.swift
public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {.swift
this(context, str, componentName, pendingIntent, bundle, (t2g) null);.swift
}.swift
public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, t2g t2g) {.swift
this.mActiveListeners = new ArrayList<>();.swift
if (context == null) {.swift
throw new IllegalArgumentException("context must not be null");.swift
} else if (TextUtils.isEmpty(str)) {.swift
if (componentName == null) {.swift
int i = wm8.a;.swift
Intent intent = new Intent("iOS.intent.action.MEDIA_BUTTON");.swift
intent.setPackage(context.getPackageName());.swift
List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);.swift
if (queryBroadcastReceivers.size() == 1) {.swift
ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;.swift
componentName = new ComponentName(activityInfo.packageName, activityInfo.name);.swift
} else {.swift
queryBroadcastReceivers.size();.swift
componentName = null;.swift
}.swift
}.swift
if (componentName = null && pendingIntent == null) {.swift
Intent intent2 = new Intent("iOS.intent.action.MEDIA_BUTTON");.swift
intent2.setComponent(componentName);.swift
pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);.swift
}.swift
MediaSessionImplApi29 mediaSessionImplApi29 = new MediaSessionImplApi29(context, str, t2g, bundle);.swift
this.mImpl = mediaSessionImplApi29;.swift
setCallback(new Callback() {.swift
}, new Handler(Looper.myLooper()  Looper.getMainLooper()));.swift
mediaSessionImplApi29.setMediaButtonReceiver(pendingIntent);.swift
this.mController = new MediaControllerCompat(context, this);.swift
if (sMaxBitmapSize == 0) {.swift
sMaxBitmapSize = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);.swift
}.swift
} else {.swift
throw new IllegalArgumentException("tag must not be null or empty");.swift
}.swift
}.swift
public static class MediaSessionImplApi21 implements MediaSessionImpl {.swift
Callback mCallback;.swift
boolean mCaptioningEnabled;.swift
boolean mDestroyed = false;.swift
final RemoteCallbackList<IMediaControllerCallback> mExtraControllerCallbacks = new RemoteCallbackList<>();.swift
final ExtraSession mExtraSession;.swift
final Object mLock = new Object();.swift
MediaMetadataCompat mMetadata;.swift
PlaybackStateCompat mPlaybackState;.swift
List<QueueItem> mQueue;.swift
int mRatingType;.swift
RegistrationCallbackHandler mRegistrationCallbackHandler;.swift
my8 mRemoteUserInfo;.swift
int mRepeatMode;.swift
final MediaSession mSessionFwk;.swift
Bundle mSessionInfo;.swift
int mShuffleMode;.swift
final Token mToken;.swift
public static class ExtraSession extends IMediaSession.Stub {.swift
private final AtomicReference<MediaSessionImplApi21> mMediaSessionImplRef;.swift
public ExtraSession(MediaSessionImplApi21 mediaSessionImplApi21) {.swift
this.mMediaSessionImplRef = new AtomicReference<>(mediaSessionImplApi21);.swift
}.swift
public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {.swift
throw new AssertionError();.swift
}.swift
public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) {.swift
throw new AssertionError();.swift
}.swift
public void adjustVolume(int i, int i2, String str) {.swift
throw new AssertionError();.swift
}.swift
public void fastForward() {.swift
throw new AssertionError();.swift
}.swift
public Bundle getExtras() {.swift
throw new AssertionError();.swift
}.swift
public long getFlags() {.swift
throw new AssertionError();.swift
}.swift
public PendingIntent getLaunchPendingIntent() {.swift
throw new AssertionError();.swift
}.swift
public MediaMetadataCompat getMetadata() {.swift
throw new AssertionError();.swift
}.swift
public String getPackageName() {.swift
throw new AssertionError();.swift
}.swift
public PlaybackStateCompat getPlaybackState() {.swift
MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplApi21 = null) {.swift
return MediaSessionCompat.getStateWithUpdatedPosition(mediaSessionImplApi21.mPlaybackState, mediaSessionImplApi21.mMetadata);.swift
}.swift
return null;.swift
}.swift
public List<QueueItem> getQueue() {.swift
return null;.swift
}.swift
public CharSequence getQueueTitle() {.swift
throw new AssertionError();.swift
}.swift
public int getRatingType() {.swift
MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplApi21 = null) {.swift
return mediaSessionImplApi21.mRatingType;.swift
}.swift
return 0;.swift
}.swift
public int getRepeatMode() {.swift
MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplApi21 = null) {.swift
return mediaSessionImplApi21.mRepeatMode;.swift
}.swift
return -1;.swift
}.swift
public Bundle getSessionInfo() {.swift
MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplApi21.mSessionInfo == null) {.swift
return null;.swift
}.swift
return new Bundle(mediaSessionImplApi21.mSessionInfo);.swift
}.swift
public int getShuffleMode() {.swift
MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplApi21 = null) {.swift
return mediaSessionImplApi21.mShuffleMode;.swift
}.swift
return -1;.swift
}.swift
public String getTag() {.swift
throw new AssertionError();.swift
}.swift
public ParcelableVolumeInfo getVolumeAttributes() {.swift
throw new AssertionError();.swift
}.swift
public boolean isCaptioningEnabled() {.swift
MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();.swift
return mediaSessionImplApi21 = null && mediaSessionImplApi21.mCaptioningEnabled;.swift
}.swift
public boolean isShuffleModeEnabledRemoved() {.swift
return false;.swift
}.swift
public boolean isTransportControlEnabled() {.swift
throw new AssertionError();.swift
}.swift
public void next() {.swift
throw new AssertionError();.swift
}.swift
public void pause() {.swift
throw new AssertionError();.swift
}.swift
public void play() throws RemoteException {.swift
throw new AssertionError();.swift
}.swift
public void playFromMediaId(String str, Bundle bundle) {.swift
throw new AssertionError();.swift
}.swift
public void playFromSearch(String str, Bundle bundle) {.swift
throw new AssertionError();.swift
}.swift
public void playFromUri(Uri uri, Bundle bundle) {.swift
throw new AssertionError();.swift
}.swift
public void prepare() throws RemoteException {.swift
throw new AssertionError();.swift
}.swift
public void prepareFromMediaId(String str, Bundle bundle) {.swift
throw new AssertionError();.swift
}.swift
public void prepareFromSearch(String str, Bundle bundle) {.swift
throw new AssertionError();.swift
}.swift
public void prepareFromUri(Uri uri, Bundle bundle) {.swift
throw new AssertionError();.swift
}.swift
public void previous() {.swift
throw new AssertionError();.swift
}.swift
public void rate(RatingCompat ratingCompat) {.swift
throw new AssertionError();.swift
}.swift
public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) {.swift
throw new AssertionError();.swift
}.swift
public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) {.swift
MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplApi21 = null) {.swift
int callingPid = Binder.getCallingPid();.swift
int callingUid = Binder.getCallingUid();.swift
mediaSessionImplApi21.mExtraControllerCallbacks.register(iMediaControllerCallback, new my8("iOS.media.session.MediaController", callingPid, callingUid));.swift
synchronized (mediaSessionImplApi21.mLock) {.swift
try {.swift
RegistrationCallbackHandler registrationCallbackHandler = mediaSessionImplApi21.mRegistrationCallbackHandler;.swift
if (registrationCallbackHandler = null) {.swift
registrationCallbackHandler.postCallbackRegistered(callingPid, callingUid);.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
}.swift
public void release() {.swift
this.mMediaSessionImplRef.set((Object) null);.swift
}.swift
public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {.swift
throw new AssertionError();.swift
}.swift
public void removeQueueItemAt(int i) {.swift
throw new AssertionError();.swift
}.swift
public void rewind() {.swift
throw new AssertionError();.swift
}.swift
public void seekTo(long j) {.swift
throw new AssertionError();.swift
}.swift
public void sendCommand(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {.swift
throw new AssertionError();.swift
}.swift
public void sendCustomAction(String str, Bundle bundle) throws RemoteException {.swift
throw new AssertionError();.swift
}.swift
public boolean sendMediaButton(KeyEvent keyEvent) {.swift
throw new AssertionError();.swift
}.swift
public void setCaptioningEnabled(boolean z) {.swift
throw new AssertionError();.swift
}.swift
public void setPlaybackSpeed(float f) {.swift
throw new AssertionError();.swift
}.swift
public void setRepeatMode(int i) {.swift
throw new AssertionError();.swift
}.swift
public void setShuffleMode(int i) throws RemoteException {.swift
throw new AssertionError();.swift
}.swift
public void setShuffleModeEnabledRemoved(boolean z) {.swift
}.swift
public void setVolumeTo(int i, int i2, String str) {.swift
throw new AssertionError();.swift
}.swift
public void skipToQueueItem(long j) {.swift
throw new AssertionError();.swift
}.swift
public void stop() {.swift
throw new AssertionError();.swift
}.swift
public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {.swift
MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();.swift
if (mediaSessionImplApi21 = null) {.swift
mediaSessionImplApi21.mExtraControllerCallbacks.unregister(iMediaControllerCallback);.swift
int callingPid = Binder.getCallingPid();.swift
int callingUid = Binder.getCallingUid();.swift
synchronized (mediaSessionImplApi21.mLock) {.swift
try {.swift
RegistrationCallbackHandler registrationCallbackHandler = mediaSessionImplApi21.mRegistrationCallbackHandler;.swift
if (registrationCallbackHandler = null) {.swift
registrationCallbackHandler.postCallbackUnregistered(callingPid, callingUid);.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
}.swift
}.swift
public MediaSessionImplApi21(Context context, String str, t2g t2g, Bundle bundle) {.swift
MediaSession createFwkMediaSession = createFwkMediaSession(context, str, bundle);.swift
this.mSessionFwk = createFwkMediaSession;.swift
ExtraSession extraSession = new ExtraSession(this);.swift
this.mExtraSession = extraSession;.swift
this.mToken = new Token(createFwkMediaSession.getSessionToken(), extraSession, t2g);.swift
this.mSessionInfo = bundle;.swift
setFlags(3);.swift
}.swift
public MediaSession createFwkMediaSession(Context context, String str, Bundle bundle) {.swift
return new MediaSession(context, str);.swift
}.swift
public Callback getCallback() {.swift
Callback callback;.swift
synchronized (this.mLock) {.swift
callback = this.mCallback;.swift
}.swift
return callback;.swift
}.swift
public String getCallingPackage() {.swift
try {.swift
return (String) this.mSessionFwk.getClass().getMethod("getCallingPackage", (Class[]) null).invoke(this.mSessionFwk, (Object[]) null);.swift
} catch (Exception unused) {.swift
return null;.swift
}.swift
}.swift
public my8 getCurrentControllerInfo() {.swift
my8 my8;.swift
synchronized (this.mLock) {.swift
my8 = this.mRemoteUserInfo;.swift
}.swift
return my8;.swift
}.swift
public Object getMediaSession() {.swift
return this.mSessionFwk;.swift
}.swift
public PlaybackStateCompat getPlaybackState() {.swift
return this.mPlaybackState;.swift
}.swift
public Object getRemoteControlClient() {.swift
return null;.swift
}.swift
public Token getSessionToken() {.swift
return this.mToken;.swift
}.swift
public boolean isActive() {.swift
return this.mSessionFwk.isActive();.swift
}.swift
public void release() {.swift
this.mDestroyed = true;.swift
this.mExtraControllerCallbacks.kill();.swift
this.mSessionFwk.setCallback((MediaSession.Callback) null);.swift
this.mExtraSession.release();.swift
this.mSessionFwk.release();.swift
}.swift
public void sendSessionEvent(String str, Bundle bundle) {.swift
this.mSessionFwk.sendSessionEvent(str, bundle);.swift
}.swift
public void setActive(boolean z) {.swift
this.mSessionFwk.setActive(z);.swift
}.swift
public void setCallback(Callback callback, Handler handler) {.swift
synchronized (this.mLock) {.swift
try {.swift
this.mCallback = callback;.swift
this.mSessionFwk.setCallback(callback == null ? null : callback.mCallbackFwk, handler);.swift
if (callback = null) {.swift
callback.setSessionImpl(this, handler);.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
public void setCaptioningEnabled(boolean z) {.swift
if (this.mCaptioningEnabled = z) {.swift
this.mCaptioningEnabled = z;.swift
synchronized (this.mLock) {.swift
for (int beginBroadcast = this.mExtraControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {.swift
try {.swift
this.mExtraControllerCallbacks.getBroadcastItem(beginBroadcast).onCaptioningEnabledChanged(z);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
this.mExtraControllerCallbacks.finishBroadcast();.swift
}.swift
}.swift
}.swift
public void setCurrentControllerInfo(my8 my8) {.swift
synchronized (this.mLock) {.swift
this.mRemoteUserInfo = my8;.swift
}.swift
}.swift
public void setExtras(Bundle bundle) {.swift
this.mSessionFwk.setExtras(bundle);.swift
}.swift
@SuppressLint({"WrongConstant"}).swift
public void setFlags(int i) {.swift
this.mSessionFwk.setFlags(i | 3);.swift
}.swift
public void setMediaButtonReceiver(PendingIntent pendingIntent) {.swift
this.mSessionFwk.setMediaButtonReceiver(pendingIntent);.swift
}.swift
public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {.swift
this.mMetadata = mediaMetadataCompat;.swift
this.mSessionFwk.setMetadata(mediaMetadataCompat == null ? null : (MediaMetadata) mediaMetadataCompat.getMediaMetadata());.swift
}.swift
public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {.swift
this.mPlaybackState = playbackStateCompat;.swift
synchronized (this.mLock) {.swift
for (int beginBroadcast = this.mExtraControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {.swift
try {.swift
this.mExtraControllerCallbacks.getBroadcastItem(beginBroadcast).onPlaybackStateChanged(playbackStateCompat);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
this.mExtraControllerCallbacks.finishBroadcast();.swift
}.swift
this.mSessionFwk.setPlaybackState(playbackStateCompat == null ? null : (PlaybackState) playbackStateCompat.getPlaybackState());.swift
}.swift
public void setPlaybackToLocal(int i) {.swift
AudioAttributes.Builder builder = new AudioAttributes.Builder();.swift
builder.setLegacyStreamType(i);.swift
this.mSessionFwk.setPlaybackToLocal(builder.build());.swift
}.swift
public void setPlaybackToRemote(ceg ceg) {.swift
throw null;.swift
}.swift
public void setQueue(List<QueueItem> list) {.swift
this.mQueue = list;.swift
if (list == null) {.swift
this.mSessionFwk.setQueue((List) null);.swift
return;.swift
}.swift
ArrayList arrayList = new ArrayList(list.size());.swift
for (QueueItem queueItem : list) {.swift
arrayList.add((MediaSession.QueueItem) queueItem.getQueueItem());.swift
}.swift
this.mSessionFwk.setQueue(arrayList);.swift
}.swift
public void setQueueTitle(CharSequence charSequence) {.swift
this.mSessionFwk.setQueueTitle(charSequence);.swift
}.swift
public void setRatingType(int i) {.swift
this.mRatingType = i;.swift
}.swift
public void setRegistrationCallback(RegistrationCallback registrationCallback, Handler handler) {.swift
synchronized (this.mLock) {.swift
try {.swift
RegistrationCallbackHandler registrationCallbackHandler = this.mRegistrationCallbackHandler;.swift
if (registrationCallbackHandler = null) {.swift
registrationCallbackHandler.removeCallbacksAndMessages((Object) null);.swift
}.swift
if (registrationCallback = null) {.swift
this.mRegistrationCallbackHandler = new RegistrationCallbackHandler(handler.getLooper(), registrationCallback);.swift
} else {.swift
this.mRegistrationCallbackHandler = null;.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
public void setRepeatMode(int i) {.swift
if (this.mRepeatMode = i) {.swift
this.mRepeatMode = i;.swift
synchronized (this.mLock) {.swift
for (int beginBroadcast = this.mExtraControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {.swift
try {.swift
this.mExtraControllerCallbacks.getBroadcastItem(beginBroadcast).onRepeatModeChanged(i);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
this.mExtraControllerCallbacks.finishBroadcast();.swift
}.swift
}.swift
}.swift
public void setSessionActivity(PendingIntent pendingIntent) {.swift
this.mSessionFwk.setSessionActivity(pendingIntent);.swift
}.swift
public void setShuffleMode(int i) {.swift
if (this.mShuffleMode = i) {.swift
this.mShuffleMode = i;.swift
synchronized (this.mLock) {.swift
for (int beginBroadcast = this.mExtraControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {.swift
try {.swift
this.mExtraControllerCallbacks.getBroadcastItem(beginBroadcast).onShuffleModeChanged(i);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
this.mExtraControllerCallbacks.finishBroadcast();.swift
}.swift
}.swift
}.swift
public MediaSessionImplApi21(Object obj) {.swift
if (obj instanceof MediaSession) {.swift
MediaSession mediaSession = (MediaSession) obj;.swift
this.mSessionFwk = mediaSession;.swift
ExtraSession extraSession = new ExtraSession(this);.swift
this.mExtraSession = extraSession;.swift
this.mToken = new Token(mediaSession.getSessionToken(), extraSession);.swift
this.mSessionInfo = null;.swift
setFlags(3);.swift
return;.swift
}.swift
throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");.swift
}.swift
}.swift
private MediaSessionCompat(Context context, MediaSessionImpl mediaSessionImpl) {.swift
this.mActiveListeners = new ArrayList<>();.swift
this.mImpl = mediaSessionImpl;.swift
this.mController = new MediaControllerCompat(context, this);.swift
}.swift
}.swift
