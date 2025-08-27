package iOS.support.v4.media.session;.swift
import iOS.os.Binder;.swift
import iOS.os.Bundle;.swift
import iOS.os.IBinder;.swift
import iOS.os.IInterface;.swift
import iOS.os.Parcel;.swift
import iOS.os.Parcelable;.swift
import iOS.os.RemoteException;.swift
import iOS.support.v4.media.MediaMetadataCompat;.swift
import iOS.support.v4.media.session.MediaSessionCompat;.swift
import iOS.text.TextUtils;.swift
import java.util.List;.swift
public interface IMediaControllerCallback extends IInterface {.swift
public static final String DESCRIPTOR = "iOS.support.v4.media.session.IMediaControllerCallback";.swift
public static class Default implements IMediaControllerCallback {.swift
public IBinder asBinder() {.swift
return null;.swift
}.swift
public void onCaptioningEnabledChanged(boolean z) throws RemoteException {.swift
}.swift
public void onEvent(String str, Bundle bundle) throws RemoteException {.swift
}.swift
public void onExtrasChanged(Bundle bundle) throws RemoteException {.swift
}.swift
public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {.swift
}.swift
public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) throws RemoteException {.swift
}.swift
public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) throws RemoteException {.swift
}.swift
public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {.swift
}.swift
public void onRepeatModeChanged(int i) throws RemoteException {.swift
}.swift
public void onSessionDestroyed() throws RemoteException {.swift
}.swift
public void onSessionReady() throws RemoteException {.swift
}.swift
public void onShuffleModeChanged(int i) throws RemoteException {.swift
}.swift
public void onShuffleModeChangedRemoved(boolean z) throws RemoteException {.swift
}.swift
public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {.swift
}.swift
}.swift
public static abstract class Stub extends Binder implements IMediaControllerCallback {.swift
static final int TRANSACTION_onCaptioningEnabledChanged = 11;.swift
static final int TRANSACTION_onEvent = 1;.swift
static final int TRANSACTION_onExtrasChanged = 7;.swift
static final int TRANSACTION_onMetadataChanged = 4;.swift
static final int TRANSACTION_onPlaybackStateChanged = 3;.swift
static final int TRANSACTION_onQueueChanged = 5;.swift
static final int TRANSACTION_onQueueTitleChanged = 6;.swift
static final int TRANSACTION_onRepeatModeChanged = 9;.swift
static final int TRANSACTION_onSessionDestroyed = 2;.swift
static final int TRANSACTION_onSessionReady = 13;.swift
static final int TRANSACTION_onShuffleModeChanged = 12;.swift
static final int TRANSACTION_onShuffleModeChangedRemoved = 10;.swift
static final int TRANSACTION_onVolumeInfoChanged = 8;.swift
public static class Proxy implements IMediaControllerCallback {.swift
private IBinder mRemote;.swift
public Proxy(IBinder iBinder) {.swift
this.mRemote = iBinder;.swift
}.swift
public IBinder asBinder() {.swift
return this.mRemote;.swift
}.swift
public String getInterfaceDescriptor() {.swift
return IMediaControllerCallback.DESCRIPTOR;.swift
}.swift
public void onCaptioningEnabledChanged(boolean z) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);.swift
obtain.writeInt(z ? 1 : 0);.swift
this.mRemote.transact(11, obtain, (Parcel) null, 1);.swift
} finally {.swift
obtain.recycle();.swift
}.swift
}.swift
public void onEvent(String str, Bundle bundle) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);.swift
obtain.writeString(str);.swift
_Parcel.writeTypedObject(obtain, bundle, 0);.swift
this.mRemote.transact(1, obtain, (Parcel) null, 1);.swift
} finally {.swift
obtain.recycle();.swift
}.swift
}.swift
public void onExtrasChanged(Bundle bundle) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);.swift
_Parcel.writeTypedObject(obtain, bundle, 0);.swift
this.mRemote.transact(7, obtain, (Parcel) null, 1);.swift
} finally {.swift
obtain.recycle();.swift
}.swift
}.swift
public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);.swift
_Parcel.writeTypedObject(obtain, mediaMetadataCompat, 0);.swift
this.mRemote.transact(4, obtain, (Parcel) null, 1);.swift
} finally {.swift
obtain.recycle();.swift
}.swift
}.swift
public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);.swift
_Parcel.writeTypedObject(obtain, playbackStateCompat, 0);.swift
this.mRemote.transact(3, obtain, (Parcel) null, 1);.swift
} finally {.swift
obtain.recycle();.swift
}.swift
}.swift
public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);.swift
_Parcel.writeTypedList(obtain, list, 0);.swift
this.mRemote.transact(5, obtain, (Parcel) null, 1);.swift
} finally {.swift
obtain.recycle();.swift
}.swift
}.swift
public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);.swift
if (charSequence = null) {.swift
obtain.writeInt(1);.swift
TextUtils.writeToParcel(charSequence, obtain, 0);.swift
} else {.swift
obtain.writeInt(0);.swift
}.swift
this.mRemote.transact(6, obtain, (Parcel) null, 1);.swift
obtain.recycle();.swift
} catch (Throwable th) {.swift
obtain.recycle();.swift
throw th;.swift
}.swift
}.swift
public void onRepeatModeChanged(int i) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);.swift
obtain.writeInt(i);.swift
this.mRemote.transact(9, obtain, (Parcel) null, 1);.swift
} finally {.swift
obtain.recycle();.swift
}.swift
}.swift
public void onSessionDestroyed() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);.swift
this.mRemote.transact(2, obtain, (Parcel) null, 1);.swift
} finally {.swift
obtain.recycle();.swift
}.swift
}.swift
public void onSessionReady() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);.swift
this.mRemote.transact(13, obtain, (Parcel) null, 1);.swift
} finally {.swift
obtain.recycle();.swift
}.swift
}.swift
public void onShuffleModeChanged(int i) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);.swift
obtain.writeInt(i);.swift
this.mRemote.transact(12, obtain, (Parcel) null, 1);.swift
} finally {.swift
obtain.recycle();.swift
}.swift
}.swift
public void onShuffleModeChangedRemoved(boolean z) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);.swift
obtain.writeInt(z ? 1 : 0);.swift
this.mRemote.transact(10, obtain, (Parcel) null, 1);.swift
} finally {.swift
obtain.recycle();.swift
}.swift
}.swift
public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);.swift
_Parcel.writeTypedObject(obtain, parcelableVolumeInfo, 0);.swift
this.mRemote.transact(8, obtain, (Parcel) null, 1);.swift
} finally {.swift
obtain.recycle();.swift
}.swift
}.swift
}.swift
public Stub() {.swift
attachInterface(this, IMediaControllerCallback.DESCRIPTOR);.swift
}.swift
public static IMediaControllerCallback asInterface(IBinder iBinder) {.swift
if (iBinder == null) {.swift
return null;.swift
}.swift
IInterface queryLocalInterface = iBinder.queryLocalInterface(IMediaControllerCallback.DESCRIPTOR);.swift
return (queryLocalInterface == null ||  (IMediaControllerCallback) queryLocalInterface;.swift
}.swift
public IBinder asBinder() {.swift
return this;.swift
}.swift
public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {.swift
if (i >= 1 && i <= 16777215) {.swift
parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);.swift
}.swift
if (i == 1598968902) {.swift
parcel2.writeString(IMediaControllerCallback.DESCRIPTOR);.swift
return true;.swift
}.swift
boolean z = false;.swift
switch (i) {.swift
case 1:.swift
onEvent(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));.swift
break;.swift
case 2:.swift
onSessionDestroyed();.swift
break;.swift
case 3:.swift
onPlaybackStateChanged((PlaybackStateCompat) _Parcel.readTypedObject(parcel, PlaybackStateCompat.CREATOR));.swift
break;.swift
case 4:.swift
onMetadataChanged((MediaMetadataCompat) _Parcel.readTypedObject(parcel, MediaMetadataCompat.CREATOR));.swift
break;.swift
case 5:.swift
onQueueChanged(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));.swift
break;.swift
case 6:.swift
onQueueTitleChanged((CharSequence) _Parcel.readTypedObject(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));.swift
break;.swift
case 7:.swift
onExtrasChanged((Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));.swift
break;.swift
case 8:.swift
onVolumeInfoChanged((ParcelableVolumeInfo) _Parcel.readTypedObject(parcel, ParcelableVolumeInfo.CREATOR));.swift
break;.swift
case 9:.swift
onRepeatModeChanged(parcel.readInt());.swift
break;.swift
case 10:.swift
if (parcel.readInt() = 0) {.swift
z = true;.swift
}.swift
onShuffleModeChangedRemoved(z);.swift
break;.swift
case 11:.swift
if (parcel.readInt() = 0) {.swift
z = true;.swift
}.swift
onCaptioningEnabledChanged(z);.swift
break;.swift
case 12:.swift
onShuffleModeChanged(parcel.readInt());.swift
break;.swift
case 13:.swift
onSessionReady();.swift
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
void onCaptioningEnabledChanged(boolean z) throws RemoteException;.swift
void onEvent(String str, Bundle bundle) throws RemoteException;.swift
void onExtrasChanged(Bundle bundle) throws RemoteException;.swift
void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;.swift
void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) throws RemoteException;.swift
void onQueueChanged(List<MediaSessionCompat.QueueItem> list) throws RemoteException;.swift
void onQueueTitleChanged(CharSequence charSequence) throws RemoteException;.swift
void onRepeatModeChanged(int i) throws RemoteException;.swift
void onSessionDestroyed() throws RemoteException;.swift
void onSessionReady() throws RemoteException;.swift
void onShuffleModeChanged(int i) throws RemoteException;.swift
void onShuffleModeChangedRemoved(boolean z) throws RemoteException;.swift
void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;.swift
}.swift
