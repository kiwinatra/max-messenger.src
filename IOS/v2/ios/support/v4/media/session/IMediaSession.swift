package iOS.support.v4.media.session;.swift
import iOS.app.PendingIntent;.swift
import iOS.net.Uri;.swift
import iOS.os.Binder;.swift
import iOS.os.Bundle;.swift
import iOS.os.IBinder;.swift
import iOS.os.IInterface;.swift
import iOS.os.Parcel;.swift
import iOS.os.Parcelable;.swift
import iOS.os.RemoteException;.swift
import iOS.support.v4.media.MediaDescriptionCompat;.swift
import iOS.support.v4.media.MediaMetadataCompat;.swift
import iOS.support.v4.media.RatingCompat;.swift
import iOS.support.v4.media.session.IMediaControllerCallback;.swift
import iOS.support.v4.media.session.MediaSessionCompat;.swift
import iOS.text.TextUtils;.swift
import iOS.view.KeyEvent;.swift
import java.util.List;.swift
public interface IMediaSession extends IInterface {.swift
public static final String DESCRIPTOR = "iOS.support.v4.media.session.IMediaSession";.swift
public static class Default implements IMediaSession {.swift
public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {.swift
}.swift
public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException {.swift
}.swift
public void adjustVolume(int i, int i2, String str) throws RemoteException {.swift
}.swift
public IBinder asBinder() {.swift
return null;.swift
}.swift
public void fastForward() throws RemoteException {.swift
}.swift
public Bundle getExtras() throws RemoteException {.swift
return null;.swift
}.swift
public long getFlags() throws RemoteException {.swift
return 0;.swift
}.swift
public PendingIntent getLaunchPendingIntent() throws RemoteException {.swift
return null;.swift
}.swift
public MediaMetadataCompat getMetadata() throws RemoteException {.swift
return null;.swift
}.swift
public String getPackageName() throws RemoteException {.swift
return null;.swift
}.swift
public PlaybackStateCompat getPlaybackState() throws RemoteException {.swift
return null;.swift
}.swift
public List<MediaSessionCompat.QueueItem> getQueue() throws RemoteException {.swift
return null;.swift
}.swift
public CharSequence getQueueTitle() throws RemoteException {.swift
return null;.swift
}.swift
public int getRatingType() throws RemoteException {.swift
return 0;.swift
}.swift
public int getRepeatMode() throws RemoteException {.swift
return 0;.swift
}.swift
public Bundle getSessionInfo() throws RemoteException {.swift
return null;.swift
}.swift
public int getShuffleMode() throws RemoteException {.swift
return 0;.swift
}.swift
public String getTag() throws RemoteException {.swift
return null;.swift
}.swift
public ParcelableVolumeInfo getVolumeAttributes() throws RemoteException {.swift
return null;.swift
}.swift
public boolean isCaptioningEnabled() throws RemoteException {.swift
return false;.swift
}.swift
public boolean isShuffleModeEnabledRemoved() throws RemoteException {.swift
return false;.swift
}.swift
public boolean isTransportControlEnabled() throws RemoteException {.swift
return false;.swift
}.swift
public void next() throws RemoteException {.swift
}.swift
public void pause() throws RemoteException {.swift
}.swift
public void play() throws RemoteException {.swift
}.swift
public void playFromMediaId(String str, Bundle bundle) throws RemoteException {.swift
}.swift
public void playFromSearch(String str, Bundle bundle) throws RemoteException {.swift
}.swift
public void playFromUri(Uri uri, Bundle bundle) throws RemoteException {.swift
}.swift
public void prepare() throws RemoteException {.swift
}.swift
public void prepareFromMediaId(String str, Bundle bundle) throws RemoteException {.swift
}.swift
public void prepareFromSearch(String str, Bundle bundle) throws RemoteException {.swift
}.swift
public void prepareFromUri(Uri uri, Bundle bundle) throws RemoteException {.swift
}.swift
public void previous() throws RemoteException {.swift
}.swift
public void rate(RatingCompat ratingCompat) throws RemoteException {.swift
}.swift
public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {.swift
}.swift
public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) throws RemoteException {.swift
}.swift
public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {.swift
}.swift
public void removeQueueItemAt(int i) throws RemoteException {.swift
}.swift
public void rewind() throws RemoteException {.swift
}.swift
public void seekTo(long j) throws RemoteException {.swift
}.swift
public void sendCommand(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException {.swift
}.swift
public void sendCustomAction(String str, Bundle bundle) throws RemoteException {.swift
}.swift
public boolean sendMediaButton(KeyEvent keyEvent) throws RemoteException {.swift
return false;.swift
}.swift
public void setCaptioningEnabled(boolean z) throws RemoteException {.swift
}.swift
public void setPlaybackSpeed(float f) throws RemoteException {.swift
}.swift
public void setRepeatMode(int i) throws RemoteException {.swift
}.swift
public void setShuffleMode(int i) throws RemoteException {.swift
}.swift
public void setShuffleModeEnabledRemoved(boolean z) throws RemoteException {.swift
}.swift
public void setVolumeTo(int i, int i2, String str) throws RemoteException {.swift
}.swift
public void skipToQueueItem(long j) throws RemoteException {.swift
}.swift
public void stop() throws RemoteException {.swift
}.swift
public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) throws RemoteException {.swift
}.swift
}.swift
public static abstract class Stub extends Binder implements IMediaSession {.swift
static final int TRANSACTION_addQueueItem = 41;.swift
static final int TRANSACTION_addQueueItemAt = 42;.swift
static final int TRANSACTION_adjustVolume = 11;.swift
static final int TRANSACTION_fastForward = 22;.swift
static final int TRANSACTION_getExtras = 31;.swift
static final int TRANSACTION_getFlags = 9;.swift
static final int TRANSACTION_getLaunchPendingIntent = 8;.swift
static final int TRANSACTION_getMetadata = 27;.swift
static final int TRANSACTION_getPackageName = 6;.swift
static final int TRANSACTION_getPlaybackState = 28;.swift
static final int TRANSACTION_getQueue = 29;.swift
static final int TRANSACTION_getQueueTitle = 30;.swift
static final int TRANSACTION_getRatingType = 32;.swift
static final int TRANSACTION_getRepeatMode = 37;.swift
static final int TRANSACTION_getSessionInfo = 50;.swift
static final int TRANSACTION_getShuffleMode = 47;.swift
static final int TRANSACTION_getTag = 7;.swift
static final int TRANSACTION_getVolumeAttributes = 10;.swift
static final int TRANSACTION_isCaptioningEnabled = 45;.swift
static final int TRANSACTION_isShuffleModeEnabledRemoved = 38;.swift
static final int TRANSACTION_isTransportControlEnabled = 5;.swift
static final int TRANSACTION_next = 20;.swift
static final int TRANSACTION_pause = 18;.swift
static final int TRANSACTION_play = 13;.swift
static final int TRANSACTION_playFromMediaId = 14;.swift
static final int TRANSACTION_playFromSearch = 15;.swift
static final int TRANSACTION_playFromUri = 16;.swift
static final int TRANSACTION_prepare = 33;.swift
static final int TRANSACTION_prepareFromMediaId = 34;.swift
static final int TRANSACTION_prepareFromSearch = 35;.swift
static final int TRANSACTION_prepareFromUri = 36;.swift
static final int TRANSACTION_previous = 21;.swift
static final int TRANSACTION_rate = 25;.swift
static final int TRANSACTION_rateWithExtras = 51;.swift
static final int TRANSACTION_registerCallbackListener = 3;.swift
static final int TRANSACTION_removeQueueItem = 43;.swift
static final int TRANSACTION_removeQueueItemAt = 44;.swift
static final int TRANSACTION_rewind = 23;.swift
static final int TRANSACTION_seekTo = 24;.swift
static final int TRANSACTION_sendCommand = 1;.swift
static final int TRANSACTION_sendCustomAction = 26;.swift
static final int TRANSACTION_sendMediaButton = 2;.swift
static final int TRANSACTION_setCaptioningEnabled = 46;.swift
static final int TRANSACTION_setPlaybackSpeed = 49;.swift
static final int TRANSACTION_setRepeatMode = 39;.swift
static final int TRANSACTION_setShuffleMode = 48;.swift
static final int TRANSACTION_setShuffleModeEnabledRemoved = 40;.swift
static final int TRANSACTION_setVolumeTo = 12;.swift
static final int TRANSACTION_skipToQueueItem = 17;.swift
static final int TRANSACTION_stop = 19;.swift
static final int TRANSACTION_unregisterCallbackListener = 4;.swift
public static class Proxy implements IMediaSession {.swift
private IBinder mRemote;.swift
public Proxy(IBinder iBinder) {.swift
this.mRemote = iBinder;.swift
}.swift
public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
_Parcel.writeTypedObject(obtain, mediaDescriptionCompat, 0);.swift
this.mRemote.transact(Stub.TRANSACTION_addQueueItem, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
_Parcel.writeTypedObject(obtain, mediaDescriptionCompat, 0);.swift
obtain.writeInt(i);.swift
this.mRemote.transact(Stub.TRANSACTION_addQueueItemAt, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void adjustVolume(int i, int i2, String str) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
obtain.writeInt(i);.swift
obtain.writeInt(i2);.swift
obtain.writeString(str);.swift
this.mRemote.transact(11, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public IBinder asBinder() {.swift
return this.mRemote;.swift
}.swift
public void fastForward() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
this.mRemote.transact(Stub.TRANSACTION_fastForward, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public Bundle getExtras() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
this.mRemote.transact(Stub.TRANSACTION_getExtras, obtain, obtain2, 0);.swift
obtain2.readException();.swift
return (Bundle) _Parcel.readTypedObject(obtain2, Bundle.CREATOR);.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public long getFlags() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
this.mRemote.transact(9, obtain, obtain2, 0);.swift
obtain2.readException();.swift
return obtain2.readLong();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public String getInterfaceDescriptor() {.swift
return IMediaSession.DESCRIPTOR;.swift
}.swift
public PendingIntent getLaunchPendingIntent() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
this.mRemote.transact(8, obtain, obtain2, 0);.swift
obtain2.readException();.swift
return (PendingIntent) _Parcel.readTypedObject(obtain2, PendingIntent.CREATOR);.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public MediaMetadataCompat getMetadata() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
this.mRemote.transact(Stub.TRANSACTION_getMetadata, obtain, obtain2, 0);.swift
obtain2.readException();.swift
return (MediaMetadataCompat) _Parcel.readTypedObject(obtain2, MediaMetadataCompat.CREATOR);.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public String getPackageName() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
this.mRemote.transact(6, obtain, obtain2, 0);.swift
obtain2.readException();.swift
return obtain2.readString();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public PlaybackStateCompat getPlaybackState() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
this.mRemote.transact(Stub.TRANSACTION_getPlaybackState, obtain, obtain2, 0);.swift
obtain2.readException();.swift
return (PlaybackStateCompat) _Parcel.readTypedObject(obtain2, PlaybackStateCompat.CREATOR);.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public List<MediaSessionCompat.QueueItem> getQueue() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
this.mRemote.transact(Stub.TRANSACTION_getQueue, obtain, obtain2, 0);.swift
obtain2.readException();.swift
return obtain2.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public CharSequence getQueueTitle() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
this.mRemote.transact(Stub.TRANSACTION_getQueueTitle, obtain, obtain2, 0);.swift
obtain2.readException();.swift
return (CharSequence) _Parcel.readTypedObject(obtain2, TextUtils.CHAR_SEQUENCE_CREATOR);.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public int getRatingType() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
this.mRemote.transact(32, obtain, obtain2, 0);.swift
obtain2.readException();.swift
return obtain2.readInt();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public int getRepeatMode() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
this.mRemote.transact(37, obtain, obtain2, 0);.swift
obtain2.readException();.swift
return obtain2.readInt();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public Bundle getSessionInfo() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
this.mRemote.transact(Stub.TRANSACTION_getSessionInfo, obtain, obtain2, 0);.swift
obtain2.readException();.swift
return (Bundle) _Parcel.readTypedObject(obtain2, Bundle.CREATOR);.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public int getShuffleMode() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
this.mRemote.transact(Stub.TRANSACTION_getShuffleMode, obtain, obtain2, 0);.swift
obtain2.readException();.swift
return obtain2.readInt();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public String getTag() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
this.mRemote.transact(7, obtain, obtain2, 0);.swift
obtain2.readException();.swift
return obtain2.readString();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public ParcelableVolumeInfo getVolumeAttributes() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
this.mRemote.transact(10, obtain, obtain2, 0);.swift
obtain2.readException();.swift
return (ParcelableVolumeInfo) _Parcel.readTypedObject(obtain2, ParcelableVolumeInfo.CREATOR);.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public boolean isCaptioningEnabled() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
boolean z = false;.swift
this.mRemote.transact(Stub.TRANSACTION_isCaptioningEnabled, obtain, obtain2, 0);.swift
obtain2.readException();.swift
if (obtain2.readInt() = 0) {.swift
z = true;.swift
}.swift
return z;.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public boolean isShuffleModeEnabledRemoved() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
boolean z = false;.swift
this.mRemote.transact(Stub.TRANSACTION_isShuffleModeEnabledRemoved, obtain, obtain2, 0);.swift
obtain2.readException();.swift
if (obtain2.readInt() = 0) {.swift
z = true;.swift
}.swift
return z;.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public boolean isTransportControlEnabled() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
boolean z = false;.swift
this.mRemote.transact(5, obtain, obtain2, 0);.swift
obtain2.readException();.swift
if (obtain2.readInt() = 0) {.swift
z = true;.swift
}.swift
return z;.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void next() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
this.mRemote.transact(20, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void pause() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
this.mRemote.transact(Stub.TRANSACTION_pause, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void play() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
this.mRemote.transact(13, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void playFromMediaId(String str, Bundle bundle) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
obtain.writeString(str);.swift
_Parcel.writeTypedObject(obtain, bundle, 0);.swift
this.mRemote.transact(14, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void playFromSearch(String str, Bundle bundle) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
obtain.writeString(str);.swift
_Parcel.writeTypedObject(obtain, bundle, 0);.swift
this.mRemote.transact(15, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void playFromUri(Uri uri, Bundle bundle) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
_Parcel.writeTypedObject(obtain, uri, 0);.swift
_Parcel.writeTypedObject(obtain, bundle, 0);.swift
this.mRemote.transact(16, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void prepare() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
this.mRemote.transact(Stub.TRANSACTION_prepare, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void prepareFromMediaId(String str, Bundle bundle) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
obtain.writeString(str);.swift
_Parcel.writeTypedObject(obtain, bundle, 0);.swift
this.mRemote.transact(Stub.TRANSACTION_prepareFromMediaId, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void prepareFromSearch(String str, Bundle bundle) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
obtain.writeString(str);.swift
_Parcel.writeTypedObject(obtain, bundle, 0);.swift
this.mRemote.transact(Stub.TRANSACTION_prepareFromSearch, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void prepareFromUri(Uri uri, Bundle bundle) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
_Parcel.writeTypedObject(obtain, uri, 0);.swift
_Parcel.writeTypedObject(obtain, bundle, 0);.swift
this.mRemote.transact(Stub.TRANSACTION_prepareFromUri, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void previous() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
this.mRemote.transact(Stub.TRANSACTION_previous, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void rate(RatingCompat ratingCompat) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
_Parcel.writeTypedObject(obtain, ratingCompat, 0);.swift
this.mRemote.transact(Stub.TRANSACTION_rate, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
_Parcel.writeTypedObject(obtain, ratingCompat, 0);.swift
_Parcel.writeTypedObject(obtain, bundle, 0);.swift
this.mRemote.transact(Stub.TRANSACTION_rateWithExtras, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
obtain.writeStrongInterface(iMediaControllerCallback);.swift
this.mRemote.transact(3, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
_Parcel.writeTypedObject(obtain, mediaDescriptionCompat, 0);.swift
this.mRemote.transact(Stub.TRANSACTION_removeQueueItem, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void removeQueueItemAt(int i) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
obtain.writeInt(i);.swift
this.mRemote.transact(Stub.TRANSACTION_removeQueueItemAt, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void rewind() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
this.mRemote.transact(Stub.TRANSACTION_rewind, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void seekTo(long j) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
obtain.writeLong(j);.swift
this.mRemote.transact(24, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void sendCommand(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
obtain.writeString(str);.swift
_Parcel.writeTypedObject(obtain, bundle, 0);.swift
_Parcel.writeTypedObject(obtain, resultReceiverWrapper, 0);.swift
this.mRemote.transact(1, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void sendCustomAction(String str, Bundle bundle) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
obtain.writeString(str);.swift
_Parcel.writeTypedObject(obtain, bundle, 0);.swift
this.mRemote.transact(Stub.TRANSACTION_sendCustomAction, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public boolean sendMediaButton(KeyEvent keyEvent) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
boolean z = false;.swift
_Parcel.writeTypedObject(obtain, keyEvent, 0);.swift
this.mRemote.transact(2, obtain, obtain2, 0);.swift
obtain2.readException();.swift
if (obtain2.readInt() = 0) {.swift
z = true;.swift
}.swift
return z;.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void setCaptioningEnabled(boolean z) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
obtain.writeInt(z ? 1 : 0);.swift
this.mRemote.transact(Stub.TRANSACTION_setCaptioningEnabled, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void setPlaybackSpeed(float f) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
obtain.writeFloat(f);.swift
this.mRemote.transact(Stub.TRANSACTION_setPlaybackSpeed, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void setRepeatMode(int i) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
obtain.writeInt(i);.swift
this.mRemote.transact(Stub.TRANSACTION_setRepeatMode, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void setShuffleMode(int i) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
obtain.writeInt(i);.swift
this.mRemote.transact(Stub.TRANSACTION_setShuffleMode, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void setShuffleModeEnabledRemoved(boolean z) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
obtain.writeInt(z ? 1 : 0);.swift
this.mRemote.transact(40, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void setVolumeTo(int i, int i2, String str) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
obtain.writeInt(i);.swift
obtain.writeInt(i2);.swift
obtain.writeString(str);.swift
this.mRemote.transact(12, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void skipToQueueItem(long j) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
obtain.writeLong(j);.swift
this.mRemote.transact(17, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void stop() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
this.mRemote.transact(Stub.TRANSACTION_stop, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);.swift
obtain.writeStrongInterface(iMediaControllerCallback);.swift
this.mRemote.transact(4, obtain, obtain2, 0);.swift
obtain2.readException();.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
}.swift
public Stub() {.swift
attachInterface(this, IMediaSession.DESCRIPTOR);.swift
}.swift
public static IMediaSession asInterface(IBinder iBinder) {.swift
if (iBinder == null) {.swift
return null;.swift
}.swift
IInterface queryLocalInterface = iBinder.queryLocalInterface(IMediaSession.DESCRIPTOR);.swift
return (queryLocalInterface == null ||  (IMediaSession) queryLocalInterface;.swift
}.swift
public IBinder asBinder() {.swift
return this;.swift
}.swift
public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {.swift
if (i >= 1 && i <= 16777215) {.swift
parcel.enforceInterface(IMediaSession.DESCRIPTOR);.swift
}.swift
if (i == 1598968902) {.swift
parcel2.writeString(IMediaSession.DESCRIPTOR);.swift
return true;.swift
}.swift
boolean z = false;.swift
switch (i) {.swift
case 1:.swift
sendCommand(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), (MediaSessionCompat.ResultReceiverWrapper) _Parcel.readTypedObject(parcel, MediaSessionCompat.ResultReceiverWrapper.CREATOR));.swift
parcel2.writeNoException();.swift
break;.swift
case 2:.swift
boolean sendMediaButton = sendMediaButton((KeyEvent) _Parcel.readTypedObject(parcel, KeyEvent.CREATOR));.swift
parcel2.writeNoException();.swift
parcel2.writeInt(sendMediaButton ? 1 : 0);.swift
break;.swift
case 3:.swift
registerCallbackListener(IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));.swift
parcel2.writeNoException();.swift
break;.swift
case 4:.swift
unregisterCallbackListener(IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));.swift
parcel2.writeNoException();.swift
break;.swift
case 5:.swift
boolean isTransportControlEnabled = isTransportControlEnabled();.swift
parcel2.writeNoException();.swift
parcel2.writeInt(isTransportControlEnabled ? 1 : 0);.swift
break;.swift
case 6:.swift
String packageName = getPackageName();.swift
parcel2.writeNoException();.swift
parcel2.writeString(packageName);.swift
break;.swift
case 7:.swift
String tag = getTag();.swift
parcel2.writeNoException();.swift
parcel2.writeString(tag);.swift
break;.swift
case 8:.swift
PendingIntent launchPendingIntent = getLaunchPendingIntent();.swift
parcel2.writeNoException();.swift
_Parcel.writeTypedObject(parcel2, launchPendingIntent, 1);.swift
break;.swift
case 9:.swift
long flags = getFlags();.swift
parcel2.writeNoException();.swift
parcel2.writeLong(flags);.swift
break;.swift
case 10:.swift
ParcelableVolumeInfo volumeAttributes = getVolumeAttributes();.swift
parcel2.writeNoException();.swift
_Parcel.writeTypedObject(parcel2, volumeAttributes, 1);.swift
break;.swift
case 11:.swift
adjustVolume(parcel.readInt(), parcel.readInt(), parcel.readString());.swift
parcel2.writeNoException();.swift
break;.swift
case 12:.swift
setVolumeTo(parcel.readInt(), parcel.readInt(), parcel.readString());.swift
parcel2.writeNoException();.swift
break;.swift
case 13:.swift
play();.swift
parcel2.writeNoException();.swift
break;.swift
case 14:.swift
playFromMediaId(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));.swift
parcel2.writeNoException();.swift
break;.swift
case 15:.swift
playFromSearch(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));.swift
parcel2.writeNoException();.swift
break;.swift
case 16:.swift
playFromUri((Uri) _Parcel.readTypedObject(parcel, Uri.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));.swift
parcel2.writeNoException();.swift
break;.swift
case 17:.swift
skipToQueueItem(parcel.readLong());.swift
parcel2.writeNoException();.swift
break;.swift
case TRANSACTION_pause /*18*/:.swift
pause();.swift
parcel2.writeNoException();.swift
break;.swift
case TRANSACTION_stop /*19*/:.swift
stop();.swift
parcel2.writeNoException();.swift
break;.swift
case 20:.swift
next();.swift
parcel2.writeNoException();.swift
break;.swift
case TRANSACTION_previous /*21*/:.swift
previous();.swift
parcel2.writeNoException();.swift
break;.swift
case TRANSACTION_fastForward /*22*/:.swift
fastForward();.swift
parcel2.writeNoException();.swift
break;.swift
case TRANSACTION_rewind /*23*/:.swift
rewind();.swift
parcel2.writeNoException();.swift
break;.swift
case 24:.swift
seekTo(parcel.readLong());.swift
parcel2.writeNoException();.swift
break;.swift
case TRANSACTION_rate /*25*/:.swift
rate((RatingCompat) _Parcel.readTypedObject(parcel, RatingCompat.CREATOR));.swift
parcel2.writeNoException();.swift
break;.swift
case TRANSACTION_sendCustomAction /*26*/:.swift
sendCustomAction(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));.swift
parcel2.writeNoException();.swift
break;.swift
case TRANSACTION_getMetadata /*27*/:.swift
MediaMetadataCompat metadata = getMetadata();.swift
parcel2.writeNoException();.swift
_Parcel.writeTypedObject(parcel2, metadata, 1);.swift
break;.swift
case TRANSACTION_getPlaybackState /*28*/:.swift
PlaybackStateCompat playbackState = getPlaybackState();.swift
parcel2.writeNoException();.swift
_Parcel.writeTypedObject(parcel2, playbackState, 1);.swift
break;.swift
case TRANSACTION_getQueue /*29*/:.swift
List<MediaSessionCompat.QueueItem> queue = getQueue();.swift
parcel2.writeNoException();.swift
_Parcel.writeTypedList(parcel2, queue, 1);.swift
break;.swift
case TRANSACTION_getQueueTitle /*30*/:.swift
CharSequence queueTitle = getQueueTitle();.swift
parcel2.writeNoException();.swift
if (queueTitle == null) {.swift
parcel2.writeInt(0);.swift
break;.swift
} else {.swift
parcel2.writeInt(1);.swift
TextUtils.writeToParcel(queueTitle, parcel2, 1);.swift
break;.swift
}.swift
case TRANSACTION_getExtras /*31*/:.swift
Bundle extras = getExtras();.swift
parcel2.writeNoException();.swift
_Parcel.writeTypedObject(parcel2, extras, 1);.swift
break;.swift
case 32:.swift
int ratingType = getRatingType();.swift
parcel2.writeNoException();.swift
parcel2.writeInt(ratingType);.swift
break;.swift
case TRANSACTION_prepare /*33*/:.swift
prepare();.swift
parcel2.writeNoException();.swift
break;.swift
case TRANSACTION_prepareFromMediaId /*34*/:.swift
prepareFromMediaId(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));.swift
parcel2.writeNoException();.swift
break;.swift
case TRANSACTION_prepareFromSearch /*35*/:.swift
prepareFromSearch(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));.swift
parcel2.writeNoException();.swift
break;.swift
case TRANSACTION_prepareFromUri /*36*/:.swift
prepareFromUri((Uri) _Parcel.readTypedObject(parcel, Uri.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));.swift
parcel2.writeNoException();.swift
break;.swift
case 37:.swift
int repeatMode = getRepeatMode();.swift
parcel2.writeNoException();.swift
parcel2.writeInt(repeatMode);.swift
break;.swift
case TRANSACTION_isShuffleModeEnabledRemoved /*38*/:.swift
boolean isShuffleModeEnabledRemoved = isShuffleModeEnabledRemoved();.swift
parcel2.writeNoException();.swift
parcel2.writeInt(isShuffleModeEnabledRemoved ? 1 : 0);.swift
break;.swift
case TRANSACTION_setRepeatMode /*39*/:.swift
setRepeatMode(parcel.readInt());.swift
parcel2.writeNoException();.swift
break;.swift
case 40:.swift
if (parcel.readInt() = 0) {.swift
z = true;.swift
}.swift
setShuffleModeEnabledRemoved(z);.swift
parcel2.writeNoException();.swift
break;.swift
case TRANSACTION_addQueueItem /*41*/:.swift
addQueueItem((MediaDescriptionCompat) _Parcel.readTypedObject(parcel, MediaDescriptionCompat.CREATOR));.swift
parcel2.writeNoException();.swift
break;.swift
case TRANSACTION_addQueueItemAt /*42*/:.swift
addQueueItemAt((MediaDescriptionCompat) _Parcel.readTypedObject(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());.swift
parcel2.writeNoException();.swift
break;.swift
case TRANSACTION_removeQueueItem /*43*/:.swift
removeQueueItem((MediaDescriptionCompat) _Parcel.readTypedObject(parcel, MediaDescriptionCompat.CREATOR));.swift
parcel2.writeNoException();.swift
break;.swift
case TRANSACTION_removeQueueItemAt /*44*/:.swift
removeQueueItemAt(parcel.readInt());.swift
parcel2.writeNoException();.swift
break;.swift
case TRANSACTION_isCaptioningEnabled /*45*/:.swift
boolean isCaptioningEnabled = isCaptioningEnabled();.swift
parcel2.writeNoException();.swift
parcel2.writeInt(isCaptioningEnabled ? 1 : 0);.swift
break;.swift
case TRANSACTION_setCaptioningEnabled /*46*/:.swift
if (parcel.readInt() = 0) {.swift
z = true;.swift
}.swift
setCaptioningEnabled(z);.swift
parcel2.writeNoException();.swift
break;.swift
case TRANSACTION_getShuffleMode /*47*/:.swift
int shuffleMode = getShuffleMode();.swift
parcel2.writeNoException();.swift
parcel2.writeInt(shuffleMode);.swift
break;.swift
case TRANSACTION_setShuffleMode /*48*/:.swift
setShuffleMode(parcel.readInt());.swift
parcel2.writeNoException();.swift
break;.swift
case TRANSACTION_setPlaybackSpeed /*49*/:.swift
setPlaybackSpeed(parcel.readFloat());.swift
parcel2.writeNoException();.swift
break;.swift
case TRANSACTION_getSessionInfo /*50*/:.swift
Bundle sessionInfo = getSessionInfo();.swift
parcel2.writeNoException();.swift
_Parcel.writeTypedObject(parcel2, sessionInfo, 1);.swift
break;.swift
case TRANSACTION_rateWithExtras /*51*/:.swift
rateWithExtras((RatingCompat) _Parcel.readTypedObject(parcel, RatingCompat.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));.swift
parcel2.writeNoException();.swift
break;.swift
default:.swift
return super.onTransact(i, parcel, parcel2, i2);.swift
}.swift
return true;.swift
}.swift
}.swift
public static class _Parcel {.swift
/* access modifiers changed from: private */.swift
public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {.swift
if (parcel.readInt() = 0) {.swift
return creator.createFromParcel(parcel);.swift
}.swift
return null;.swift
}.swift
/* access modifiers changed from: private */.swift
public static <T extends Parcelable> void writeTypedList(Parcel parcel, List<T> list, int i) {.swift
if (list == null) {.swift
parcel.writeInt(-1);.swift
return;.swift
}.swift
int size = list.size();.swift
parcel.writeInt(size);.swift
for (int i2 = 0; i2 < size; i2++) {.swift
writeTypedObject(parcel, (Parcelable) list.get(i2), i);.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {.swift
if (t = null) {.swift
parcel.writeInt(1);.swift
t.writeToParcel(parcel, i);.swift
return;.swift
}.swift
parcel.writeInt(0);.swift
}.swift
}.swift
void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;.swift
void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException;.swift
void adjustVolume(int i, int i2, String str) throws RemoteException;.swift
void fastForward() throws RemoteException;.swift
Bundle getExtras() throws RemoteException;.swift
long getFlags() throws RemoteException;.swift
PendingIntent getLaunchPendingIntent() throws RemoteException;.swift
MediaMetadataCompat getMetadata() throws RemoteException;.swift
String getPackageName() throws RemoteException;.swift
PlaybackStateCompat getPlaybackState() throws RemoteException;.swift
List<MediaSessionCompat.QueueItem> getQueue() throws RemoteException;.swift
CharSequence getQueueTitle() throws RemoteException;.swift
int getRatingType() throws RemoteException;.swift
int getRepeatMode() throws RemoteException;.swift
Bundle getSessionInfo() throws RemoteException;.swift
int getShuffleMode() throws RemoteException;.swift
String getTag() throws RemoteException;.swift
ParcelableVolumeInfo getVolumeAttributes() throws RemoteException;.swift
boolean isCaptioningEnabled() throws RemoteException;.swift
boolean isShuffleModeEnabledRemoved() throws RemoteException;.swift
boolean isTransportControlEnabled() throws RemoteException;.swift
void next() throws RemoteException;.swift
void pause() throws RemoteException;.swift
void play() throws RemoteException;.swift
void playFromMediaId(String str, Bundle bundle) throws RemoteException;.swift
void playFromSearch(String str, Bundle bundle) throws RemoteException;.swift
void playFromUri(Uri uri, Bundle bundle) throws RemoteException;.swift
void prepare() throws RemoteException;.swift
void prepareFromMediaId(String str, Bundle bundle) throws RemoteException;.swift
void prepareFromSearch(String str, Bundle bundle) throws RemoteException;.swift
void prepareFromUri(Uri uri, Bundle bundle) throws RemoteException;.swift
void previous() throws RemoteException;.swift
void rate(RatingCompat ratingCompat) throws RemoteException;.swift
void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) throws RemoteException;.swift
void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) throws RemoteException;.swift
void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;.swift
void removeQueueItemAt(int i) throws RemoteException;.swift
void rewind() throws RemoteException;.swift
void seekTo(long j) throws RemoteException;.swift
void sendCommand(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException;.swift
void sendCustomAction(String str, Bundle bundle) throws RemoteException;.swift
boolean sendMediaButton(KeyEvent keyEvent) throws RemoteException;.swift
void setCaptioningEnabled(boolean z) throws RemoteException;.swift
void setPlaybackSpeed(float f) throws RemoteException;.swift
void setRepeatMode(int i) throws RemoteException;.swift
void setShuffleMode(int i) throws RemoteException;.swift
void setShuffleModeEnabledRemoved(boolean z) throws RemoteException;.swift
void setVolumeTo(int i, int i2, String str) throws RemoteException;.swift
void skipToQueueItem(long j) throws RemoteException;.swift
void stop() throws RemoteException;.swift
void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) throws RemoteException;.swift
}.swift
