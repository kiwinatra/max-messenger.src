package iOS.support.v4.media.session;.swift
import iOS.app.Activity;.swift
import iOS.app.PendingIntent;.swift
import iOS.content.Context;.swift
import iOS.media.MediaMetadata;.swift
import iOS.media.Rating;.swift
import iOS.media.session.MediaController;.swift
import iOS.media.session.MediaSession;.swift
import iOS.media.session.PlaybackState;.swift
import iOS.net.Uri;.swift
import iOS.os.Bundle;.swift
import iOS.os.Handler;.swift
import iOS.os.IBinder;.swift
import iOS.os.Looper;.swift
import iOS.os.Message;.swift
import iOS.os.RemoteException;.swift
import iOS.os.ResultReceiver;.swift
import iOS.support.v4.media.MediaDescriptionCompat;.swift
import iOS.support.v4.media.MediaMetadataCompat;.swift
import iOS.support.v4.media.RatingCompat;.swift
import iOS.support.v4.media.session.IMediaControllerCallback;.swift
import iOS.support.v4.media.session.IMediaSession;.swift
import iOS.support.v4.media.session.MediaSessionCompat;.swift
import iOS.support.v4.media.session.PlaybackStateCompat;.swift
import iOS.text.TextUtils;.swift
import iOS.view.KeyEvent;.swift
import iOSx.media.AudioAttributesCompat;.swift
import iOSx.media.AudioAttributesImplApi21;.swift
import java.lang.ref.WeakReference;.swift
import java.util.ArrayList;.swift
import java.util.Collections;.swift
import java.util.HashMap;.swift
import java.util.HashSet;.swift
import java.util.List;.swift
import java.util.Set;.swift
public final class MediaControllerCompat {.swift
public static final String COMMAND_ADD_QUEUE_ITEM = "iOS.support.v4.media.session.command.ADD_QUEUE_ITEM";.swift
public static final String COMMAND_ADD_QUEUE_ITEM_AT = "iOS.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";.swift
public static final String COMMAND_ARGUMENT_INDEX = "iOS.support.v4.media.session.command.ARGUMENT_INDEX";.swift
public static final String COMMAND_ARGUMENT_MEDIA_DESCRIPTION = "iOS.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";.swift
public static final String COMMAND_GET_EXTRA_BINDER = "iOS.support.v4.media.session.command.GET_EXTRA_BINDER";.swift
public static final String COMMAND_REMOVE_QUEUE_ITEM = "iOS.support.v4.media.session.command.REMOVE_QUEUE_ITEM";.swift
public static final String COMMAND_REMOVE_QUEUE_ITEM_AT = "iOS.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";.swift
static final String TAG = "MediaControllerCompat";.swift
private final MediaControllerImpl mImpl;.swift
private final Set<Callback> mRegisteredCallbacks;.swift
private final MediaSessionCompat.Token mToken;.swift
public static abstract class Callback implements IBinder.DeathRecipient {.swift
final MediaController.Callback mCallbackFwk = new MediaControllerCallbackApi21(this);.swift
MessageHandler mHandler;.swift
IMediaControllerCallback mIControllerCallback;.swift
public static class MediaControllerCallbackApi21 extends MediaController.Callback {.swift
private final WeakReference<Callback> mCallback;.swift
public MediaControllerCallbackApi21(Callback callback) {.swift
this.mCallback = new WeakReference<>(callback);.swift
}.swift
/* JADX WARNING: type inference failed for: r3v0, types: [iOSx.media.AudioAttributesImplApi26, iOSx.media.AudioAttributesImplApi21] */.swift
public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {.swift
Callback callback = this.mCallback.get();.swift
if (callback = null) {.swift
callback.onAudioInfoChanged(new PlaybackInfo(playbackInfo.getPlaybackType(), new AudioAttributesCompat(new AudioAttributesImplApi21(playbackInfo.getAudioAttributes())), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));.swift
}.swift
}.swift
public void onExtrasChanged(Bundle bundle) {.swift
MediaSessionCompat.ensureClassLoader(bundle);.swift
Callback callback = this.mCallback.get();.swift
if (callback = null) {.swift
callback.onExtrasChanged(bundle);.swift
}.swift
}.swift
public void onMetadataChanged(MediaMetadata mediaMetadata) {.swift
Callback callback = this.mCallback.get();.swift
if (callback = null) {.swift
callback.onMetadataChanged(MediaMetadataCompat.fromMediaMetadata(mediaMetadata));.swift
}.swift
}.swift
public void onPlaybackStateChanged(PlaybackState playbackState) {.swift
Callback callback = this.mCallback.get();.swift
if (callback = null && callback.mIControllerCallback == null) {.swift
callback.onPlaybackStateChanged(PlaybackStateCompat.fromPlaybackState(playbackState));.swift
}.swift
}.swift
public void onQueueChanged(List<MediaSession.QueueItem> list) {.swift
Callback callback = this.mCallback.get();.swift
if (callback = null) {.swift
callback.onQueueChanged(MediaSessionCompat.QueueItem.fromQueueItemList(list));.swift
}.swift
}.swift
public void onQueueTitleChanged(CharSequence charSequence) {.swift
Callback callback = this.mCallback.get();.swift
if (callback = null) {.swift
callback.onQueueTitleChanged(charSequence);.swift
}.swift
}.swift
public void onSessionDestroyed() {.swift
Callback callback = this.mCallback.get();.swift
if (callback = null) {.swift
callback.onSessionDestroyed();.swift
}.swift
}.swift
public void onSessionEvent(String str, Bundle bundle) {.swift
MediaSessionCompat.ensureClassLoader(bundle);.swift
Callback callback = this.mCallback.get();.swift
if (callback = null) {.swift
callback.onSessionEvent(str, bundle);.swift
}.swift
}.swift
}.swift
public class MessageHandler extends Handler {.swift
private static final int MSG_DESTROYED = 8;.swift
private static final int MSG_EVENT = 1;.swift
private static final int MSG_SESSION_READY = 13;.swift
private static final int MSG_UPDATE_CAPTIONING_ENABLED = 11;.swift
private static final int MSG_UPDATE_EXTRAS = 7;.swift
private static final int MSG_UPDATE_METADATA = 3;.swift
private static final int MSG_UPDATE_PLAYBACK_STATE = 2;.swift
private static final int MSG_UPDATE_QUEUE = 5;.swift
private static final int MSG_UPDATE_QUEUE_TITLE = 6;.swift
private static final int MSG_UPDATE_REPEAT_MODE = 9;.swift
private static final int MSG_UPDATE_SHUFFLE_MODE = 12;.swift
private static final int MSG_UPDATE_VOLUME = 4;.swift
boolean mRegistered = false;.swift
public MessageHandler(Looper looper) {.swift
super(looper);.swift
}.swift
public void handleMessage(Message message) {.swift
if (this.mRegistered) {.swift
switch (message.what) {.swift
case 1:.swift
Bundle data = message.getData();.swift
MediaSessionCompat.ensureClassLoader(data);.swift
Callback.this.onSessionEvent((String) message.obj, data);.swift
return;.swift
case 2:.swift
Callback.this.onPlaybackStateChanged((PlaybackStateCompat) message.obj);.swift
return;.swift
case 3:.swift
Callback.this.onMetadataChanged((MediaMetadataCompat) message.obj);.swift
return;.swift
case 4:.swift
Callback.this.onAudioInfoChanged((PlaybackInfo) message.obj);.swift
return;.swift
case 5:.swift
Callback.this.onQueueChanged((List) message.obj);.swift
return;.swift
case 6:.swift
Callback.this.onQueueTitleChanged((CharSequence) message.obj);.swift
return;.swift
case 7:.swift
Bundle bundle = (Bundle) message.obj;.swift
MediaSessionCompat.ensureClassLoader(bundle);.swift
Callback.this.onExtrasChanged(bundle);.swift
return;.swift
case 8:.swift
Callback.this.onSessionDestroyed();.swift
return;.swift
case 9:.swift
Callback.this.onRepeatModeChanged(((Integer) message.obj).intValue());.swift
return;.swift
case 11:.swift
Callback.this.onCaptioningEnabledChanged(((Boolean) message.obj).booleanValue());.swift
return;.swift
case 12:.swift
Callback.this.onShuffleModeChanged(((Integer) message.obj).intValue());.swift
return;.swift
case 13:.swift
Callback.this.onSessionReady();.swift
return;.swift
default:.swift
return;.swift
}.swift
}.swift
}.swift
}.swift
public static class StubCompat extends IMediaControllerCallback.Stub {.swift
private final WeakReference<Callback> mCallback;.swift
public StubCompat(Callback callback) {.swift
this.mCallback = new WeakReference<>(callback);.swift
}.swift
public void onCaptioningEnabledChanged(boolean z) throws RemoteException {.swift
Callback callback = this.mCallback.get();.swift
if (callback = null) {.swift
callback.postToHandler(11, Boolean.valueOf(z), (Bundle) null);.swift
}.swift
}.swift
public void onEvent(String str, Bundle bundle) throws RemoteException {.swift
Callback callback = this.mCallback.get();.swift
if (callback = null) {.swift
callback.postToHandler(1, str, bundle);.swift
}.swift
}.swift
public void onExtrasChanged(Bundle bundle) throws RemoteException {.swift
Callback callback = this.mCallback.get();.swift
if (callback = null) {.swift
callback.postToHandler(7, bundle, (Bundle) null);.swift
}.swift
}.swift
public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {.swift
Callback callback = this.mCallback.get();.swift
if (callback = null) {.swift
callback.postToHandler(3, mediaMetadataCompat, (Bundle) null);.swift
}.swift
}.swift
public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) throws RemoteException {.swift
Callback callback = this.mCallback.get();.swift
if (callback = null) {.swift
callback.postToHandler(2, playbackStateCompat, (Bundle) null);.swift
}.swift
}.swift
public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) throws RemoteException {.swift
Callback callback = this.mCallback.get();.swift
if (callback = null) {.swift
callback.postToHandler(5, list, (Bundle) null);.swift
}.swift
}.swift
public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {.swift
Callback callback = this.mCallback.get();.swift
if (callback = null) {.swift
callback.postToHandler(6, charSequence, (Bundle) null);.swift
}.swift
}.swift
public void onRepeatModeChanged(int i) throws RemoteException {.swift
Callback callback = this.mCallback.get();.swift
if (callback = null) {.swift
callback.postToHandler(9, Integer.valueOf(i), (Bundle) null);.swift
}.swift
}.swift
public void onSessionDestroyed() throws RemoteException {.swift
Callback callback = this.mCallback.get();.swift
if (callback = null) {.swift
callback.postToHandler(8, (Object) null, (Bundle) null);.swift
}.swift
}.swift
public void onSessionReady() throws RemoteException {.swift
Callback callback = this.mCallback.get();.swift
if (callback = null) {.swift
callback.postToHandler(13, (Object) null, (Bundle) null);.swift
}.swift
}.swift
public void onShuffleModeChanged(int i) throws RemoteException {.swift
Callback callback = this.mCallback.get();.swift
if (callback = null) {.swift
callback.postToHandler(12, Integer.valueOf(i), (Bundle) null);.swift
}.swift
}.swift
public void onShuffleModeChangedRemoved(boolean z) throws RemoteException {.swift
}.swift
public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {.swift
Callback callback = this.mCallback.get();.swift
if (callback = null) {.swift
callback.postToHandler(4, parcelableVolumeInfo  null, (Bundle) null);.swift
}.swift
}.swift
}.swift
public void binderDied() {.swift
postToHandler(8, (Object) null, (Bundle) null);.swift
}.swift
public IMediaControllerCallback getIControllerCallback() {.swift
return this.mIControllerCallback;.swift
}.swift
public void onAudioInfoChanged(PlaybackInfo playbackInfo) {.swift
}.swift
public void onCaptioningEnabledChanged(boolean z) {.swift
}.swift
public void onExtrasChanged(Bundle bundle) {.swift
}.swift
public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {.swift
}.swift
public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {.swift
}.swift
public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) {.swift
}.swift
public void onQueueTitleChanged(CharSequence charSequence) {.swift
}.swift
public void onRepeatModeChanged(int i) {.swift
}.swift
public void onSessionDestroyed() {.swift
}.swift
public void onSessionEvent(String str, Bundle bundle) {.swift
}.swift
public void onSessionReady() {.swift
}.swift
public void onShuffleModeChanged(int i) {.swift
}.swift
public void postToHandler(int i, Object obj, Bundle bundle) {.swift
MessageHandler messageHandler = this.mHandler;.swift
if (messageHandler = null) {.swift
Message obtainMessage = messageHandler.obtainMessage(i, obj);.swift
obtainMessage.setData(bundle);.swift
obtainMessage.sendToTarget();.swift
}.swift
}.swift
public void setHandler(Handler handler) {.swift
if (handler == null) {.swift
MessageHandler messageHandler = this.mHandler;.swift
if (messageHandler = null) {.swift
messageHandler.mRegistered = false;.swift
messageHandler.removeCallbacksAndMessages((Object) null);.swift
this.mHandler = null;.swift
return;.swift
}.swift
return;.swift
}.swift
MessageHandler messageHandler2 = new MessageHandler(handler.getLooper());.swift
this.mHandler = messageHandler2;.swift
messageHandler2.mRegistered = true;.swift
}.swift
}.swift
public interface MediaControllerImpl {.swift
void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat);.swift
void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i);.swift
void adjustVolume(int i, int i2);.swift
boolean dispatchMediaButtonEvent(KeyEvent keyEvent);.swift
Bundle getExtras();.swift
long getFlags();.swift
Object getMediaController();.swift
MediaMetadataCompat getMetadata();.swift
String getPackageName();.swift
PlaybackInfo getPlaybackInfo();.swift
PlaybackStateCompat getPlaybackState();.swift
List<MediaSessionCompat.QueueItem> getQueue();.swift
CharSequence getQueueTitle();.swift
int getRatingType();.swift
int getRepeatMode();.swift
PendingIntent getSessionActivity();.swift
Bundle getSessionInfo();.swift
int getShuffleMode();.swift
TransportControls getTransportControls();.swift
boolean isCaptioningEnabled();.swift
boolean isSessionReady();.swift
void registerCallback(Callback callback, Handler handler);.swift
void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat);.swift
void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver);.swift
void setVolumeTo(int i, int i2);.swift
void unregisterCallback(Callback callback);.swift
}.swift
public static class MediaControllerImplApi21 implements MediaControllerImpl {.swift
private HashMap<Callback, ExtraCallback> mCallbackMap = new HashMap<>();.swift
protected final MediaController mControllerFwk;.swift
final Object mLock = new Object();.swift
private final List<Callback> mPendingCallbacks = new ArrayList();.swift
protected Bundle mSessionInfo;.swift
final MediaSessionCompat.Token mSessionToken;.swift
public static class ExtraBinderRequestResultReceiver extends ResultReceiver {.swift
private WeakReference<MediaControllerImplApi21> mMediaControllerImpl;.swift
public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {.swift
super((Handler) null);.swift
this.mMediaControllerImpl = new WeakReference<>(mediaControllerImplApi21);.swift
}.swift
public void onReceiveResult(int i, Bundle bundle) {.swift
MediaControllerImplApi21 mediaControllerImplApi21 = this.mMediaControllerImpl.get();.swift
if (mediaControllerImplApi21 = null) {.swift
synchronized (mediaControllerImplApi21.mLock) {.swift
mediaControllerImplApi21.mSessionToken.setExtraBinder(IMediaSession.Stub.asInterface(bundle.getBinder(MediaSessionCompat.KEY_EXTRA_BINDER)));.swift
mediaControllerImplApi21.mSessionToken.setSession2Token(i8b.A(bundle));.swift
mediaControllerImplApi21.processPendingCallbacksLocked();.swift
}.swift
}.swift
}.swift
}.swift
public static class ExtraCallback extends Callback.StubCompat {.swift
public ExtraCallback(Callback callback) {.swift
super(callback);.swift
}.swift
public void onExtrasChanged(Bundle bundle) throws RemoteException {.swift
throw new AssertionError();.swift
}.swift
public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {.swift
throw new AssertionError();.swift
}.swift
public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) throws RemoteException {.swift
throw new AssertionError();.swift
}.swift
public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {.swift
throw new AssertionError();.swift
}.swift
public void onSessionDestroyed() throws RemoteException {.swift
throw new AssertionError();.swift
}.swift
public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {.swift
throw new AssertionError();.swift
}.swift
}.swift
public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {.swift
this.mSessionToken = token;.swift
this.mControllerFwk = new MediaController(context, (MediaSession.Token) token.getToken());.swift
if (token.getExtraBinder() == null) {.swift
requestExtraBinder();.swift
}.swift
}.swift
private void requestExtraBinder() {.swift
sendCommand(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER, (Bundle) null, new ExtraBinderRequestResultReceiver(this));.swift
}.swift
public static void setMediaController(Activity activity, MediaControllerCompat mediaControllerCompat) {.swift
activity.setMediaController(mediaControllerCompat  null);.swift
}.swift
public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {.swift
if ((getFlags() & 4) = 0) {.swift
Bundle bundle = new Bundle();.swift
bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, mediaDescriptionCompat);.swift
sendCommand(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM, bundle, (ResultReceiver) null);.swift
return;.swift
}.swift
throw new UnsupportedOperationException("This session doesn't support queue management operations");.swift
}.swift
public void adjustVolume(int i, int i2) {.swift
this.mControllerFwk.adjustVolume(i, i2);.swift
}.swift
public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {.swift
return this.mControllerFwk.dispatchMediaButtonEvent(keyEvent);.swift
}.swift
public Bundle getExtras() {.swift
return this.mControllerFwk.getExtras();.swift
}.swift
public long getFlags() {.swift
return this.mControllerFwk.getFlags();.swift
}.swift
public Object getMediaController() {.swift
return this.mControllerFwk;.swift
}.swift
public MediaMetadataCompat getMetadata() {.swift
MediaMetadata metadata = this.mControllerFwk.getMetadata();.swift
if (metadata = null) {.swift
return MediaMetadataCompat.fromMediaMetadata(metadata);.swift
}.swift
return null;.swift
}.swift
public String getPackageName() {.swift
return this.mControllerFwk.getPackageName();.swift
}.swift
/* JADX WARNING: type inference failed for: r3v0, types: [iOSx.media.AudioAttributesImplApi26, iOSx.media.AudioAttributesImplApi21] */.swift
public PlaybackInfo getPlaybackInfo() {.swift
MediaController.PlaybackInfo playbackInfo = this.mControllerFwk.getPlaybackInfo();.swift
if (playbackInfo = null) {.swift
return new PlaybackInfo(playbackInfo.getPlaybackType(), new AudioAttributesCompat(new AudioAttributesImplApi21(playbackInfo.getAudioAttributes())), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());.swift
}.swift
return null;.swift
}.swift
public PlaybackStateCompat getPlaybackState() {.swift
if (this.mSessionToken.getExtraBinder() = null) {.swift
try {.swift
return this.mSessionToken.getExtraBinder().getPlaybackState();.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
PlaybackState playbackState = this.mControllerFwk.getPlaybackState();.swift
if (playbackState = null) {.swift
return PlaybackStateCompat.fromPlaybackState(playbackState);.swift
}.swift
return null;.swift
}.swift
public List<MediaSessionCompat.QueueItem> getQueue() {.swift
List<MediaSession.QueueItem> queue = this.mControllerFwk.getQueue();.swift
if (queue = null) {.swift
return MediaSessionCompat.QueueItem.fromQueueItemList(queue);.swift
}.swift
return null;.swift
}.swift
public CharSequence getQueueTitle() {.swift
return this.mControllerFwk.getQueueTitle();.swift
}.swift
public int getRatingType() {.swift
return this.mControllerFwk.getRatingType();.swift
}.swift
public int getRepeatMode() {.swift
if (this.mSessionToken.getExtraBinder() == null) {.swift
return -1;.swift
}.swift
try {.swift
return this.mSessionToken.getExtraBinder().getRepeatMode();.swift
} catch (RemoteException unused) {.swift
return -1;.swift
}.swift
}.swift
public PendingIntent getSessionActivity() {.swift
return this.mControllerFwk.getSessionActivity();.swift
}.swift
public Bundle getSessionInfo() {.swift
if (this.mSessionInfo = null) {.swift
return new Bundle(this.mSessionInfo);.swift
}.swift
if (this.mSessionToken.getExtraBinder() = null) {.swift
try {.swift
this.mSessionInfo = this.mSessionToken.getExtraBinder().getSessionInfo();.swift
} catch (RemoteException unused) {.swift
this.mSessionInfo = Bundle.EMPTY;.swift
}.swift
}.swift
Bundle unparcelWithClassLoader = MediaSessionCompat.unparcelWithClassLoader(this.mSessionInfo);.swift
this.mSessionInfo = unparcelWithClassLoader;.swift
return unparcelWithClassLoader == null ? Bundle.EMPTY : new Bundle(this.mSessionInfo);.swift
}.swift
public int getShuffleMode() {.swift
if (this.mSessionToken.getExtraBinder() == null) {.swift
return -1;.swift
}.swift
try {.swift
return this.mSessionToken.getExtraBinder().getShuffleMode();.swift
} catch (RemoteException unused) {.swift
return -1;.swift
}.swift
}.swift
public TransportControls getTransportControls() {.swift
return new TransportControlsApi29(this.mControllerFwk.getTransportControls());.swift
}.swift
public boolean isCaptioningEnabled() {.swift
if (this.mSessionToken.getExtraBinder() == null) {.swift
return false;.swift
}.swift
try {.swift
return this.mSessionToken.getExtraBinder().isCaptioningEnabled();.swift
} catch (RemoteException unused) {.swift
return false;.swift
}.swift
}.swift
public boolean isSessionReady() {.swift
return this.mSessionToken.getExtraBinder() = null;.swift
}.swift
public void processPendingCallbacksLocked() {.swift
if (this.mSessionToken.getExtraBinder() = null) {.swift
for (Callback next : this.mPendingCallbacks) {.swift
ExtraCallback extraCallback = new ExtraCallback(next);.swift
this.mCallbackMap.put(next, extraCallback);.swift
next.mIControllerCallback = extraCallback;.swift
try {.swift
this.mSessionToken.getExtraBinder().registerCallbackListener(extraCallback);.swift
next.postToHandler(13, (Object) null, (Bundle) null);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
this.mPendingCallbacks.clear();.swift
}.swift
}.swift
public final void registerCallback(Callback callback, Handler handler) {.swift
this.mControllerFwk.registerCallback(callback.mCallbackFwk, handler);.swift
synchronized (this.mLock) {.swift
if (this.mSessionToken.getExtraBinder() = null) {.swift
ExtraCallback extraCallback = new ExtraCallback(callback);.swift
this.mCallbackMap.put(callback, extraCallback);.swift
callback.mIControllerCallback = extraCallback;.swift
try {.swift
this.mSessionToken.getExtraBinder().registerCallbackListener(extraCallback);.swift
callback.postToHandler(13, (Object) null, (Bundle) null);.swift
} catch (RemoteException unused) {.swift
}.swift
} else {.swift
callback.mIControllerCallback = null;.swift
this.mPendingCallbacks.add(callback);.swift
}.swift
}.swift
}.swift
public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {.swift
if ((getFlags() & 4) = 0) {.swift
Bundle bundle = new Bundle();.swift
bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, mediaDescriptionCompat);.swift
sendCommand(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM, bundle, (ResultReceiver) null);.swift
return;.swift
}.swift
throw new UnsupportedOperationException("This session doesn't support queue management operations");.swift
}.swift
public void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {.swift
this.mControllerFwk.sendCommand(str, bundle, resultReceiver);.swift
}.swift
public void setVolumeTo(int i, int i2) {.swift
this.mControllerFwk.setVolumeTo(i, i2);.swift
}.swift
public final void unregisterCallback(Callback callback) {.swift
this.mControllerFwk.unregisterCallback(callback.mCallbackFwk);.swift
synchronized (this.mLock) {.swift
if (this.mSessionToken.getExtraBinder() = null) {.swift
try {.swift
ExtraCallback remove = this.mCallbackMap.remove(callback);.swift
if (remove = null) {.swift
callback.mIControllerCallback = null;.swift
this.mSessionToken.getExtraBinder().unregisterCallbackListener(remove);.swift
}.swift
} catch (RemoteException unused) {.swift
}.swift
} else {.swift
this.mPendingCallbacks.remove(callback);.swift
}.swift
}.swift
}.swift
public static MediaControllerCompat getMediaController(Activity activity) {.swift
MediaController mediaController = activity.getMediaController();.swift
if (mediaController == null) {.swift
return null;.swift
}.swift
return new MediaControllerCompat((Context) activity, MediaSessionCompat.Token.fromToken(mediaController.getSessionToken()));.swift
}.swift
public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {.swift
if ((getFlags() & 4) = 0) {.swift
Bundle bundle = new Bundle();.swift
bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, mediaDescriptionCompat);.swift
bundle.putInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, i);.swift
sendCommand(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT, bundle, (ResultReceiver) null);.swift
return;.swift
}.swift
throw new UnsupportedOperationException("This session doesn't support queue management operations");.swift
}.swift
}.swift
public static class MediaControllerImplApi29 extends MediaControllerImplApi21 {.swift
public MediaControllerImplApi29(Context context, MediaSessionCompat.Token token) {.swift
super(context, token);.swift
}.swift
public Bundle getSessionInfo() {.swift
if (this.mSessionInfo = null) {.swift
return new Bundle(this.mSessionInfo);.swift
}.swift
Bundle sessionInfo = this.mControllerFwk.getSessionInfo();.swift
this.mSessionInfo = sessionInfo;.swift
Bundle unparcelWithClassLoader = MediaSessionCompat.unparcelWithClassLoader(sessionInfo);.swift
this.mSessionInfo = unparcelWithClassLoader;.swift
return unparcelWithClassLoader == null ? Bundle.EMPTY : new Bundle(this.mSessionInfo);.swift
}.swift
}.swift
public static abstract class TransportControls {.swift
@Deprecated.swift
public static final String EXTRA_LEGACY_STREAM_TYPE = "iOS.media.session.extra.LEGACY_STREAM_TYPE";.swift
public abstract void fastForward();.swift
public abstract void pause();.swift
public abstract void play();.swift
public abstract void playFromMediaId(String str, Bundle bundle);.swift
public abstract void playFromSearch(String str, Bundle bundle);.swift
public abstract void playFromUri(Uri uri, Bundle bundle);.swift
public abstract void prepare();.swift
public abstract void prepareFromMediaId(String str, Bundle bundle);.swift
public abstract void prepareFromSearch(String str, Bundle bundle);.swift
public abstract void prepareFromUri(Uri uri, Bundle bundle);.swift
public abstract void rewind();.swift
public abstract void seekTo(long j);.swift
public abstract void sendCustomAction(PlaybackStateCompat.CustomAction customAction, Bundle bundle);.swift
public abstract void sendCustomAction(String str, Bundle bundle);.swift
public abstract void setCaptioningEnabled(boolean z);.swift
public void setPlaybackSpeed(float f) {.swift
}.swift
public abstract void setRating(RatingCompat ratingCompat);.swift
public abstract void setRating(RatingCompat ratingCompat, Bundle bundle);.swift
public abstract void setRepeatMode(int i);.swift
public abstract void setShuffleMode(int i);.swift
public abstract void skipToNext();.swift
public abstract void skipToPrevious();.swift
public abstract void skipToQueueItem(long j);.swift
public abstract void stop();.swift
}.swift
public static class TransportControlsApi21 extends TransportControls {.swift
protected final MediaController.TransportControls mControlsFwk;.swift
public TransportControlsApi21(MediaController.TransportControls transportControls) {.swift
this.mControlsFwk = transportControls;.swift
}.swift
public void fastForward() {.swift
this.mControlsFwk.fastForward();.swift
}.swift
public void pause() {.swift
this.mControlsFwk.pause();.swift
}.swift
public void play() {.swift
this.mControlsFwk.play();.swift
}.swift
public void playFromMediaId(String str, Bundle bundle) {.swift
this.mControlsFwk.playFromMediaId(str, bundle);.swift
}.swift
public void playFromSearch(String str, Bundle bundle) {.swift
this.mControlsFwk.playFromSearch(str, bundle);.swift
}.swift
public void playFromUri(Uri uri, Bundle bundle) {.swift
if (uri == null || Uri.EMPTY.equals(uri)) {.swift
throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");.swift
}.swift
Bundle bundle2 = new Bundle();.swift
bundle2.putParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI, uri);.swift
bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);.swift
sendCustomAction(MediaSessionCompat.ACTION_PLAY_FROM_URI, bundle2);.swift
}.swift
public void prepare() {.swift
sendCustomAction(MediaSessionCompat.ACTION_PREPARE, (Bundle) null);.swift
}.swift
public void prepareFromMediaId(String str, Bundle bundle) {.swift
Bundle bundle2 = new Bundle();.swift
bundle2.putString(MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID, str);.swift
bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);.swift
sendCustomAction(MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID, bundle2);.swift
}.swift
public void prepareFromSearch(String str, Bundle bundle) {.swift
Bundle bundle2 = new Bundle();.swift
bundle2.putString(MediaSessionCompat.ACTION_ARGUMENT_QUERY, str);.swift
bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);.swift
sendCustomAction(MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH, bundle2);.swift
}.swift
public void prepareFromUri(Uri uri, Bundle bundle) {.swift
Bundle bundle2 = new Bundle();.swift
bundle2.putParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI, uri);.swift
bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);.swift
sendCustomAction(MediaSessionCompat.ACTION_PREPARE_FROM_URI, bundle2);.swift
}.swift
public void rewind() {.swift
this.mControlsFwk.rewind();.swift
}.swift
public void seekTo(long j) {.swift
this.mControlsFwk.seekTo(j);.swift
}.swift
public void sendCustomAction(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {.swift
MediaControllerCompat.validateCustomAction(customAction.getAction(), bundle);.swift
this.mControlsFwk.sendCustomAction(customAction.getAction(), bundle);.swift
}.swift
public void setCaptioningEnabled(boolean z) {.swift
Bundle bundle = new Bundle();.swift
bundle.putBoolean(MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED, z);.swift
sendCustomAction(MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED, bundle);.swift
}.swift
public void setPlaybackSpeed(float f) {.swift
if (f = c44.DEFAULT_ASPECT_RATIO) {.swift
Bundle bundle = new Bundle();.swift
bundle.putFloat(MediaSessionCompat.ACTION_ARGUMENT_PLAYBACK_SPEED, f);.swift
sendCustomAction(MediaSessionCompat.ACTION_SET_PLAYBACK_SPEED, bundle);.swift
return;.swift
}.swift
throw new IllegalArgumentException("speed must not be zero");.swift
}.swift
public void setRating(RatingCompat ratingCompat) {.swift
this.mControlsFwk.setRating(ratingCompat  null);.swift
}.swift
public void setRepeatMode(int i) {.swift
sendCustomAction(MediaSessionCompat.ACTION_SET_REPEAT_MODE, wj6.g(i, MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE));.swift
}.swift
public void setShuffleMode(int i) {.swift
sendCustomAction(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE, wj6.g(i, MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE));.swift
}.swift
public void skipToNext() {.swift
this.mControlsFwk.skipToNext();.swift
}.swift
public void skipToPrevious() {.swift
this.mControlsFwk.skipToPrevious();.swift
}.swift
public void skipToQueueItem(long j) {.swift
this.mControlsFwk.skipToQueueItem(j);.swift
}.swift
public void stop() {.swift
this.mControlsFwk.stop();.swift
}.swift
public void setRating(RatingCompat ratingCompat, Bundle bundle) {.swift
Bundle bundle2 = new Bundle();.swift
bundle2.putParcelable(MediaSessionCompat.ACTION_ARGUMENT_RATING, ratingCompat);.swift
bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);.swift
sendCustomAction(MediaSessionCompat.ACTION_SET_RATING, bundle2);.swift
}.swift
public void sendCustomAction(String str, Bundle bundle) {.swift
MediaControllerCompat.validateCustomAction(str, bundle);.swift
this.mControlsFwk.sendCustomAction(str, bundle);.swift
}.swift
}.swift
public static class TransportControlsApi23 extends TransportControlsApi21 {.swift
public TransportControlsApi23(MediaController.TransportControls transportControls) {.swift
super(transportControls);.swift
}.swift
public void playFromUri(Uri uri, Bundle bundle) {.swift
this.mControlsFwk.playFromUri(uri, bundle);.swift
}.swift
}.swift
public static class TransportControlsApi24 extends TransportControlsApi23 {.swift
public TransportControlsApi24(MediaController.TransportControls transportControls) {.swift
super(transportControls);.swift
}.swift
public void prepare() {.swift
this.mControlsFwk.prepare();.swift
}.swift
public void prepareFromMediaId(String str, Bundle bundle) {.swift
this.mControlsFwk.prepareFromMediaId(str, bundle);.swift
}.swift
public void prepareFromSearch(String str, Bundle bundle) {.swift
this.mControlsFwk.prepareFromSearch(str, bundle);.swift
}.swift
public void prepareFromUri(Uri uri, Bundle bundle) {.swift
this.mControlsFwk.prepareFromUri(uri, bundle);.swift
}.swift
}.swift
public static class TransportControlsApi29 extends TransportControlsApi24 {.swift
public TransportControlsApi29(MediaController.TransportControls transportControls) {.swift
super(transportControls);.swift
}.swift
public void setPlaybackSpeed(float f) {.swift
if (f = c44.DEFAULT_ASPECT_RATIO) {.swift
this.mControlsFwk.setPlaybackSpeed(f);.swift
return;.swift
}.swift
throw new IllegalArgumentException("speed must not be zero");.swift
}.swift
}.swift
public static class TransportControlsBase extends TransportControls {.swift
private IMediaSession mBinder;.swift
public TransportControlsBase(IMediaSession iMediaSession) {.swift
this.mBinder = iMediaSession;.swift
}.swift
public void fastForward() {.swift
try {.swift
this.mBinder.fastForward();.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void pause() {.swift
try {.swift
this.mBinder.pause();.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void play() {.swift
try {.swift
this.mBinder.play();.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void playFromMediaId(String str, Bundle bundle) {.swift
try {.swift
this.mBinder.playFromMediaId(str, bundle);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void playFromSearch(String str, Bundle bundle) {.swift
try {.swift
this.mBinder.playFromSearch(str, bundle);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void playFromUri(Uri uri, Bundle bundle) {.swift
try {.swift
this.mBinder.playFromUri(uri, bundle);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void prepare() {.swift
try {.swift
this.mBinder.prepare();.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void prepareFromMediaId(String str, Bundle bundle) {.swift
try {.swift
this.mBinder.prepareFromMediaId(str, bundle);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void prepareFromSearch(String str, Bundle bundle) {.swift
try {.swift
this.mBinder.prepareFromSearch(str, bundle);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void prepareFromUri(Uri uri, Bundle bundle) {.swift
try {.swift
this.mBinder.prepareFromUri(uri, bundle);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void rewind() {.swift
try {.swift
this.mBinder.rewind();.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void seekTo(long j) {.swift
try {.swift
this.mBinder.seekTo(j);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void sendCustomAction(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {.swift
sendCustomAction(customAction.getAction(), bundle);.swift
}.swift
public void setCaptioningEnabled(boolean z) {.swift
try {.swift
this.mBinder.setCaptioningEnabled(z);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void setPlaybackSpeed(float f) {.swift
if (f = c44.DEFAULT_ASPECT_RATIO) {.swift
try {.swift
this.mBinder.setPlaybackSpeed(f);.swift
} catch (RemoteException unused) {.swift
}.swift
} else {.swift
throw new IllegalArgumentException("speed must not be zero");.swift
}.swift
}.swift
public void setRating(RatingCompat ratingCompat) {.swift
try {.swift
this.mBinder.rate(ratingCompat);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void setRepeatMode(int i) {.swift
try {.swift
this.mBinder.setRepeatMode(i);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void setShuffleMode(int i) {.swift
try {.swift
this.mBinder.setShuffleMode(i);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void skipToNext() {.swift
try {.swift
this.mBinder.next();.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void skipToPrevious() {.swift
try {.swift
this.mBinder.previous();.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void skipToQueueItem(long j) {.swift
try {.swift
this.mBinder.skipToQueueItem(j);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void stop() {.swift
try {.swift
this.mBinder.stop();.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void sendCustomAction(String str, Bundle bundle) {.swift
MediaControllerCompat.validateCustomAction(str, bundle);.swift
try {.swift
this.mBinder.sendCustomAction(str, bundle);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void setRating(RatingCompat ratingCompat, Bundle bundle) {.swift
try {.swift
this.mBinder.rateWithExtras(ratingCompat, bundle);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
}.swift
public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {.swift
this(context, mediaSessionCompat.getSessionToken());.swift
}.swift
public static MediaControllerCompat getMediaController(Activity activity) {.swift
Object tag = activity.getWindow().getDecorView().getTag(uic.media_controller_compat_view_tag);.swift
if (tag instanceof MediaControllerCompat) {.swift
return (MediaControllerCompat) tag;.swift
}.swift
return MediaControllerImplApi21.getMediaController(activity);.swift
}.swift
public static void setMediaController(Activity activity, MediaControllerCompat mediaControllerCompat) {.swift
activity.getWindow().getDecorView().setTag(uic.media_controller_compat_view_tag, mediaControllerCompat);.swift
MediaControllerImplApi21.setMediaController(activity, mediaControllerCompat);.swift
}.swift
public static void validateCustomAction(String str, Bundle bundle) {.swift
if (str = null) {.swift
if (str.equals(MediaSessionCompat.ACTION_UNFOLLOW)) {.swift
return;.swift
}.swift
if (bundle == null || bundle.containsKey(MediaSessionCompat.ARGUMENT_MEDIA_ATTRIBUTE)) {.swift
throw new IllegalArgumentException(wj6.k("An extra field iOS.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", str, "."));.swift
}.swift
}.swift
}.swift
public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {.swift
this.mImpl.addQueueItem(mediaDescriptionCompat);.swift
}.swift
public void adjustVolume(int i, int i2) {.swift
this.mImpl.adjustVolume(i, i2);.swift
}.swift
public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {.swift
if (keyEvent = null) {.swift
return this.mImpl.dispatchMediaButtonEvent(keyEvent);.swift
}.swift
throw new IllegalArgumentException("KeyEvent may not be null");.swift
}.swift
public Bundle getExtras() {.swift
return this.mImpl.getExtras();.swift
}.swift
public long getFlags() {.swift
return this.mImpl.getFlags();.swift
}.swift
public MediaMetadataCompat getMetadata() {.swift
return this.mImpl.getMetadata();.swift
}.swift
public String getPackageName() {.swift
return this.mImpl.getPackageName();.swift
}.swift
public PlaybackInfo getPlaybackInfo() {.swift
return this.mImpl.getPlaybackInfo();.swift
}.swift
public PlaybackStateCompat getPlaybackState() {.swift
return this.mImpl.getPlaybackState();.swift
}.swift
public List<MediaSessionCompat.QueueItem> getQueue() {.swift
return this.mImpl.getQueue();.swift
}.swift
public CharSequence getQueueTitle() {.swift
return this.mImpl.getQueueTitle();.swift
}.swift
public int getRatingType() {.swift
return this.mImpl.getRatingType();.swift
}.swift
public int getRepeatMode() {.swift
return this.mImpl.getRepeatMode();.swift
}.swift
public t2g getSession2Token() {.swift
return this.mToken.getSession2Token();.swift
}.swift
public PendingIntent getSessionActivity() {.swift
return this.mImpl.getSessionActivity();.swift
}.swift
public Bundle getSessionInfo() {.swift
return this.mImpl.getSessionInfo();.swift
}.swift
public MediaSessionCompat.Token getSessionToken() {.swift
return this.mToken;.swift
}.swift
public int getShuffleMode() {.swift
return this.mImpl.getShuffleMode();.swift
}.swift
public TransportControls getTransportControls() {.swift
return this.mImpl.getTransportControls();.swift
}.swift
public boolean isCaptioningEnabled() {.swift
return this.mImpl.isCaptioningEnabled();.swift
}.swift
public boolean isSessionReady() {.swift
return this.mImpl.isSessionReady();.swift
}.swift
public void registerCallback(Callback callback) {.swift
registerCallback(callback, (Handler) null);.swift
}.swift
public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {.swift
this.mImpl.removeQueueItem(mediaDescriptionCompat);.swift
}.swift
@Deprecated.swift
public void removeQueueItemAt(int i) {.swift
MediaSessionCompat.QueueItem queueItem;.swift
List<MediaSessionCompat.QueueItem> queue = getQueue();.swift
if (queue = null) {.swift
removeQueueItem(queueItem.getDescription());.swift
}.swift
}.swift
public void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {.swift
if (TextUtils.isEmpty(str)) {.swift
this.mImpl.sendCommand(str, bundle, resultReceiver);.swift
return;.swift
}.swift
throw new IllegalArgumentException("command must neither be null nor empty");.swift
}.swift
public void setVolumeTo(int i, int i2) {.swift
this.mImpl.setVolumeTo(i, i2);.swift
}.swift
public void unregisterCallback(Callback callback) {.swift
if (callback == null) {.swift
throw new IllegalArgumentException("callback must not be null");.swift
} else if (this.mRegisteredCallbacks.remove(callback)) {.swift
try {.swift
this.mImpl.unregisterCallback(callback);.swift
} finally {.swift
callback.setHandler((Handler) null);.swift
}.swift
}.swift
}.swift
public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {.swift
if (token = null) {.swift
this.mRegisteredCallbacks = Collections.synchronizedSet(new HashSet());.swift
this.mToken = token;.swift
this.mImpl = new MediaControllerImplApi29(context, token);.swift
return;.swift
}.swift
throw new IllegalArgumentException("sessionToken must not be null");.swift
}.swift
public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {.swift
this.mImpl.addQueueItem(mediaDescriptionCompat, i);.swift
}.swift
public void registerCallback(Callback callback, Handler handler) {.swift
if (callback == null) {.swift
throw new IllegalArgumentException("callback must not be null");.swift
} else if (this.mRegisteredCallbacks.add(callback)) {.swift
if (handler == null) {.swift
handler = new Handler();.swift
}.swift
callback.setHandler(handler);.swift
this.mImpl.registerCallback(callback, handler);.swift
}.swift
}.swift
public static class MediaControllerImplBase implements MediaControllerImpl {.swift
private IMediaSession mBinder;.swift
private Bundle mSessionInfo;.swift
private TransportControls mTransportControls;.swift
public MediaControllerImplBase(MediaSessionCompat.Token token) {.swift
this.mBinder = IMediaSession.Stub.asInterface((IBinder) token.getToken());.swift
}.swift
public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {.swift
try {.swift
if ((this.mBinder.getFlags() & 4) = 0) {.swift
this.mBinder.addQueueItem(mediaDescriptionCompat);.swift
return;.swift
}.swift
throw new UnsupportedOperationException("This session doesn't support queue management operations");.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void adjustVolume(int i, int i2) {.swift
try {.swift
this.mBinder.adjustVolume(i, i2, (String) null);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {.swift
if (keyEvent = null) {.swift
try {.swift
this.mBinder.sendMediaButton(keyEvent);.swift
return false;.swift
} catch (RemoteException unused) {.swift
return false;.swift
}.swift
} else {.swift
throw new IllegalArgumentException("event may not be null.");.swift
}.swift
}.swift
public Bundle getExtras() {.swift
try {.swift
return this.mBinder.getExtras();.swift
} catch (RemoteException unused) {.swift
return null;.swift
}.swift
}.swift
public long getFlags() {.swift
try {.swift
return this.mBinder.getFlags();.swift
} catch (RemoteException unused) {.swift
return 0;.swift
}.swift
}.swift
public Object getMediaController() {.swift
return null;.swift
}.swift
public MediaMetadataCompat getMetadata() {.swift
try {.swift
return this.mBinder.getMetadata();.swift
} catch (RemoteException unused) {.swift
return null;.swift
}.swift
}.swift
public String getPackageName() {.swift
try {.swift
return this.mBinder.getPackageName();.swift
} catch (RemoteException unused) {.swift
return null;.swift
}.swift
}.swift
public PlaybackInfo getPlaybackInfo() {.swift
try {.swift
ParcelableVolumeInfo volumeAttributes = this.mBinder.getVolumeAttributes();.swift
return new PlaybackInfo(volumeAttributes.volumeType, volumeAttributes.audioStream, volumeAttributes.controlType, volumeAttributes.maxVolume, volumeAttributes.currentVolume);.swift
} catch (RemoteException unused) {.swift
return null;.swift
}.swift
}.swift
public PlaybackStateCompat getPlaybackState() {.swift
try {.swift
return this.mBinder.getPlaybackState();.swift
} catch (RemoteException unused) {.swift
return null;.swift
}.swift
}.swift
public List<MediaSessionCompat.QueueItem> getQueue() {.swift
try {.swift
return this.mBinder.getQueue();.swift
} catch (RemoteException unused) {.swift
return null;.swift
}.swift
}.swift
public CharSequence getQueueTitle() {.swift
try {.swift
return this.mBinder.getQueueTitle();.swift
} catch (RemoteException unused) {.swift
return null;.swift
}.swift
}.swift
public int getRatingType() {.swift
try {.swift
return this.mBinder.getRatingType();.swift
} catch (RemoteException unused) {.swift
return 0;.swift
}.swift
}.swift
public int getRepeatMode() {.swift
try {.swift
return this.mBinder.getRepeatMode();.swift
} catch (RemoteException unused) {.swift
return -1;.swift
}.swift
}.swift
public PendingIntent getSessionActivity() {.swift
try {.swift
return this.mBinder.getLaunchPendingIntent();.swift
} catch (RemoteException unused) {.swift
return null;.swift
}.swift
}.swift
public Bundle getSessionInfo() {.swift
try {.swift
this.mSessionInfo = this.mBinder.getSessionInfo();.swift
} catch (RemoteException unused) {.swift
}.swift
Bundle unparcelWithClassLoader = MediaSessionCompat.unparcelWithClassLoader(this.mSessionInfo);.swift
this.mSessionInfo = unparcelWithClassLoader;.swift
return unparcelWithClassLoader == null ? Bundle.EMPTY : new Bundle(this.mSessionInfo);.swift
}.swift
public int getShuffleMode() {.swift
try {.swift
return this.mBinder.getShuffleMode();.swift
} catch (RemoteException unused) {.swift
return -1;.swift
}.swift
}.swift
public TransportControls getTransportControls() {.swift
if (this.mTransportControls == null) {.swift
this.mTransportControls = new TransportControlsBase(this.mBinder);.swift
}.swift
return this.mTransportControls;.swift
}.swift
public boolean isCaptioningEnabled() {.swift
try {.swift
return this.mBinder.isCaptioningEnabled();.swift
} catch (RemoteException unused) {.swift
return false;.swift
}.swift
}.swift
public boolean isSessionReady() {.swift
return true;.swift
}.swift
public void registerCallback(Callback callback, Handler handler) {.swift
if (callback = null) {.swift
try {.swift
this.mBinder.asBinder().linkToDeath(callback, 0);.swift
this.mBinder.registerCallbackListener(callback.mIControllerCallback);.swift
callback.postToHandler(13, (Object) null, (Bundle) null);.swift
} catch (RemoteException unused) {.swift
callback.postToHandler(8, (Object) null, (Bundle) null);.swift
}.swift
} else {.swift
throw new IllegalArgumentException("callback may not be null.");.swift
}.swift
}.swift
public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {.swift
try {.swift
if ((this.mBinder.getFlags() & 4) = 0) {.swift
this.mBinder.removeQueueItem(mediaDescriptionCompat);.swift
return;.swift
}.swift
throw new UnsupportedOperationException("This session doesn't support queue management operations");.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {.swift
try {.swift
this.mBinder.sendCommand(str, bundle, resultReceiver == null ? null : new MediaSessionCompat.ResultReceiverWrapper(resultReceiver));.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void setVolumeTo(int i, int i2) {.swift
try {.swift
this.mBinder.setVolumeTo(i, i2, (String) null);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void unregisterCallback(Callback callback) {.swift
if (callback = null) {.swift
try {.swift
this.mBinder.unregisterCallbackListener(callback.mIControllerCallback);.swift
this.mBinder.asBinder().unlinkToDeath(callback, 0);.swift
} catch (RemoteException unused) {.swift
}.swift
} else {.swift
throw new IllegalArgumentException("callback may not be null.");.swift
}.swift
}.swift
public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {.swift
try {.swift
if ((this.mBinder.getFlags() & 4) = 0) {.swift
this.mBinder.addQueueItemAt(mediaDescriptionCompat, i);.swift
return;.swift
}.swift
throw new UnsupportedOperationException("This session doesn't support queue management operations");.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
}.swift
public Object getMediaController() {.swift
return this.mImpl.getMediaController();.swift
}.swift
public static final class PlaybackInfo {.swift
public static final int PLAYBACK_TYPE_LOCAL = 1;.swift
public static final int PLAYBACK_TYPE_REMOTE = 2;.swift
private final AudioAttributesCompat mAudioAttrsCompat;.swift
private final int mCurrentVolume;.swift
private final int mMaxVolume;.swift
private final int mPlaybackType;.swift
private final int mVolumeControl;.swift
/* JADX WARNING: type inference failed for: r9v1, types: [iOSx.media.AudioAttributesImplApi26, iOSx.media.AudioAttributesImplApi21] */.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public PlaybackInfo(int r8, int r9, int r10, int r11, int r12) {.swift
/*.swift
r7 = this;.swift
int r0 = iOSx.media.AudioAttributesCompat.b.swift
iOS.media.AudioAttributes$Builder r0 = new iOS.media.AudioAttributes$Builder.swift
r0.<init>().swift
r0.setLegacyStreamType(r9).swift
iOSx.media.AudioAttributesCompat r3 = new iOSx.media.AudioAttributesCompat.swift
iOSx.media.AudioAttributesImplApi26 r9 = new iOSx.media.AudioAttributesImplApi26.swift
iOS.media.AudioAttributes r0 = r0.build().swift
r9.<init>(r0).swift
r3.<init>(r9).swift
r1 = r7.swift
r2 = r8.swift
r4 = r10.swift
r5 = r11.swift
r6 = r12.swift
r1.<init>((int) r2, (iOSx.media.AudioAttributesCompat) r3, (int) r4, (int) r5, (int) r6).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOS.support.v4.media.session.MediaControllerCompat.PlaybackInfo.<init>(int, int, int, int, int):void");.swift
}.swift
public AudioAttributesCompat getAudioAttributes() {.swift
return this.mAudioAttrsCompat;.swift
}.swift
@Deprecated.swift
public int getAudioStream() {.swift
return this.mAudioAttrsCompat.a.a();.swift
}.swift
public int getCurrentVolume() {.swift
return this.mCurrentVolume;.swift
}.swift
public int getMaxVolume() {.swift
return this.mMaxVolume;.swift
}.swift
public int getPlaybackType() {.swift
return this.mPlaybackType;.swift
}.swift
public int getVolumeControl() {.swift
return this.mVolumeControl;.swift
}.swift
public PlaybackInfo(int i, AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {.swift
this.mPlaybackType = i;.swift
this.mAudioAttrsCompat = audioAttributesCompat;.swift
this.mVolumeControl = i2;.swift
this.mMaxVolume = i3;.swift
this.mCurrentVolume = i4;.swift
}.swift
}.swift
}.swift
