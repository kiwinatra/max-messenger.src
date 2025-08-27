package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

public interface IMediaSession extends IInterface {
    public static final String DESCRIPTOR = "android.support.v4.media.session.IMediaSession";

    public static class Default implements IMediaSession {
        public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
        }

        public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException {
        }

        public void adjustVolume(int i, int i2, String str) throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }

        public void fastForward() throws RemoteException {
        }

        public Bundle getExtras() throws RemoteException {
            return null;
        }

        public long getFlags() throws RemoteException {
            return 0;
        }

        public PendingIntent getLaunchPendingIntent() throws RemoteException {
            return null;
        }

        public MediaMetadataCompat getMetadata() throws RemoteException {
            return null;
        }

        public String getPackageName() throws RemoteException {
            return null;
        }

        public PlaybackStateCompat getPlaybackState() throws RemoteException {
            return null;
        }

        public List<MediaSessionCompat.QueueItem> getQueue() throws RemoteException {
            return null;
        }

        public CharSequence getQueueTitle() throws RemoteException {
            return null;
        }

        public int getRatingType() throws RemoteException {
            return 0;
        }

        public int getRepeatMode() throws RemoteException {
            return 0;
        }

        public Bundle getSessionInfo() throws RemoteException {
            return null;
        }

        public int getShuffleMode() throws RemoteException {
            return 0;
        }

        public String getTag() throws RemoteException {
            return null;
        }

        public ParcelableVolumeInfo getVolumeAttributes() throws RemoteException {
            return null;
        }

        public boolean isCaptioningEnabled() throws RemoteException {
            return false;
        }

        public boolean isShuffleModeEnabledRemoved() throws RemoteException {
            return false;
        }

        public boolean isTransportControlEnabled() throws RemoteException {
            return false;
        }

        public void next() throws RemoteException {
        }

        public void pause() throws RemoteException {
        }

        public void play() throws RemoteException {
        }

        public void playFromMediaId(String str, Bundle bundle) throws RemoteException {
        }

        public void playFromSearch(String str, Bundle bundle) throws RemoteException {
        }

        public void playFromUri(Uri uri, Bundle bundle) throws RemoteException {
        }

        public void prepare() throws RemoteException {
        }

        public void prepareFromMediaId(String str, Bundle bundle) throws RemoteException {
        }

        public void prepareFromSearch(String str, Bundle bundle) throws RemoteException {
        }

        public void prepareFromUri(Uri uri, Bundle bundle) throws RemoteException {
        }

        public void previous() throws RemoteException {
        }

        public void rate(RatingCompat ratingCompat) throws RemoteException {
        }

        public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
        }

        public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) throws RemoteException {
        }

        public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
        }

        public void removeQueueItemAt(int i) throws RemoteException {
        }

        public void rewind() throws RemoteException {
        }

        public void seekTo(long j) throws RemoteException {
        }

        public void sendCommand(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException {
        }

        public void sendCustomAction(String str, Bundle bundle) throws RemoteException {
        }

        public boolean sendMediaButton(KeyEvent keyEvent) throws RemoteException {
            return false;
        }

        public void setCaptioningEnabled(boolean z) throws RemoteException {
        }

        public void setPlaybackSpeed(float f) throws RemoteException {
        }

        public void setRepeatMode(int i) throws RemoteException {
        }

        public void setShuffleMode(int i) throws RemoteException {
        }

        public void setShuffleModeEnabledRemoved(boolean z) throws RemoteException {
        }

        public void setVolumeTo(int i, int i2, String str) throws RemoteException {
        }

        public void skipToQueueItem(long j) throws RemoteException {
        }

        public void stop() throws RemoteException {
        }

        public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMediaSession {
        static final int TRANSACTION_addQueueItem = 41;
        static final int TRANSACTION_addQueueItemAt = 42;
        static final int TRANSACTION_adjustVolume = 11;
        static final int TRANSACTION_fastForward = 22;
        static final int TRANSACTION_getExtras = 31;
        static final int TRANSACTION_getFlags = 9;
        static final int TRANSACTION_getLaunchPendingIntent = 8;
        static final int TRANSACTION_getMetadata = 27;
        static final int TRANSACTION_getPackageName = 6;
        static final int TRANSACTION_getPlaybackState = 28;
        static final int TRANSACTION_getQueue = 29;
        static final int TRANSACTION_getQueueTitle = 30;
        static final int TRANSACTION_getRatingType = 32;
        static final int TRANSACTION_getRepeatMode = 37;
        static final int TRANSACTION_getSessionInfo = 50;
        static final int TRANSACTION_getShuffleMode = 47;
        static final int TRANSACTION_getTag = 7;
        static final int TRANSACTION_getVolumeAttributes = 10;
        static final int TRANSACTION_isCaptioningEnabled = 45;
        static final int TRANSACTION_isShuffleModeEnabledRemoved = 38;
        static final int TRANSACTION_isTransportControlEnabled = 5;
        static final int TRANSACTION_next = 20;
        static final int TRANSACTION_pause = 18;
        static final int TRANSACTION_play = 13;
        static final int TRANSACTION_playFromMediaId = 14;
        static final int TRANSACTION_playFromSearch = 15;
        static final int TRANSACTION_playFromUri = 16;
        static final int TRANSACTION_prepare = 33;
        static final int TRANSACTION_prepareFromMediaId = 34;
        static final int TRANSACTION_prepareFromSearch = 35;
        static final int TRANSACTION_prepareFromUri = 36;
        static final int TRANSACTION_previous = 21;
        static final int TRANSACTION_rate = 25;
        static final int TRANSACTION_rateWithExtras = 51;
        static final int TRANSACTION_registerCallbackListener = 3;
        static final int TRANSACTION_removeQueueItem = 43;
        static final int TRANSACTION_removeQueueItemAt = 44;
        static final int TRANSACTION_rewind = 23;
        static final int TRANSACTION_seekTo = 24;
        static final int TRANSACTION_sendCommand = 1;
        static final int TRANSACTION_sendCustomAction = 26;
        static final int TRANSACTION_sendMediaButton = 2;
        static final int TRANSACTION_setCaptioningEnabled = 46;
        static final int TRANSACTION_setPlaybackSpeed = 49;
        static final int TRANSACTION_setRepeatMode = 39;
        static final int TRANSACTION_setShuffleMode = 48;
        static final int TRANSACTION_setShuffleModeEnabledRemoved = 40;
        static final int TRANSACTION_setVolumeTo = 12;
        static final int TRANSACTION_skipToQueueItem = 17;
        static final int TRANSACTION_stop = 19;
        static final int TRANSACTION_unregisterCallbackListener = 4;

        public static class Proxy implements IMediaSession {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, mediaDescriptionCompat, 0);
                    this.mRemote.transact(Stub.TRANSACTION_addQueueItem, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, mediaDescriptionCompat, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(Stub.TRANSACTION_addQueueItemAt, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void adjustVolume(int i, int i2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void fastForward() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_fastForward, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Bundle getExtras() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getExtras, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) _Parcel.readTypedObject(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public long getFlags() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IMediaSession.DESCRIPTOR;
            }

            public PendingIntent getLaunchPendingIntent() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return (PendingIntent) _Parcel.readTypedObject(obtain2, PendingIntent.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public MediaMetadataCompat getMetadata() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getMetadata, obtain, obtain2, 0);
                    obtain2.readException();
                    return (MediaMetadataCompat) _Parcel.readTypedObject(obtain2, MediaMetadataCompat.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getPackageName() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public PlaybackStateCompat getPlaybackState() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getPlaybackState, obtain, obtain2, 0);
                    obtain2.readException();
                    return (PlaybackStateCompat) _Parcel.readTypedObject(obtain2, PlaybackStateCompat.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public List<MediaSessionCompat.QueueItem> getQueue() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getQueue, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public CharSequence getQueueTitle() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getQueueTitle, obtain, obtain2, 0);
                    obtain2.readException();
                    return (CharSequence) _Parcel.readTypedObject(obtain2, TextUtils.CHAR_SEQUENCE_CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getRatingType() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getRepeatMode() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Bundle getSessionInfo() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getSessionInfo, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) _Parcel.readTypedObject(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getShuffleMode() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getShuffleMode, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getTag() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public ParcelableVolumeInfo getVolumeAttributes() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ParcelableVolumeInfo) _Parcel.readTypedObject(obtain2, ParcelableVolumeInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isCaptioningEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    boolean z = false;
                    this.mRemote.transact(Stub.TRANSACTION_isCaptioningEnabled, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isShuffleModeEnabledRemoved() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    boolean z = false;
                    this.mRemote.transact(Stub.TRANSACTION_isShuffleModeEnabledRemoved, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isTransportControlEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    boolean z = false;
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void next() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void pause() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_pause, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void play() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void playFromMediaId(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void playFromSearch(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void playFromUri(Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, uri, 0);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void prepare() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_prepare, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void prepareFromMediaId(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(Stub.TRANSACTION_prepareFromMediaId, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void prepareFromSearch(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(Stub.TRANSACTION_prepareFromSearch, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void prepareFromUri(Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, uri, 0);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(Stub.TRANSACTION_prepareFromUri, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void previous() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_previous, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void rate(RatingCompat ratingCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, ratingCompat, 0);
                    this.mRemote.transact(Stub.TRANSACTION_rate, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, ratingCompat, 0);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(Stub.TRANSACTION_rateWithExtras, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    obtain.writeStrongInterface(iMediaControllerCallback);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, mediaDescriptionCompat, 0);
                    this.mRemote.transact(Stub.TRANSACTION_removeQueueItem, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void removeQueueItemAt(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(Stub.TRANSACTION_removeQueueItemAt, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void rewind() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_rewind, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void seekTo(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    obtain.writeLong(j);
                    this.mRemote.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void sendCommand(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    _Parcel.writeTypedObject(obtain, resultReceiverWrapper, 0);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void sendCustomAction(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(Stub.TRANSACTION_sendCustomAction, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean sendMediaButton(KeyEvent keyEvent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    boolean z = false;
                    _Parcel.writeTypedObject(obtain, keyEvent, 0);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setCaptioningEnabled(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(Stub.TRANSACTION_setCaptioningEnabled, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setPlaybackSpeed(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    obtain.writeFloat(f);
                    this.mRemote.transact(Stub.TRANSACTION_setPlaybackSpeed, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setRepeatMode(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(Stub.TRANSACTION_setRepeatMode, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setShuffleMode(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(Stub.TRANSACTION_setShuffleMode, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setShuffleModeEnabledRemoved(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setVolumeTo(int i, int i2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.mRemote.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void skipToQueueItem(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    obtain.writeLong(j);
                    this.mRemote.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void stop() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_stop, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    obtain.writeStrongInterface(iMediaControllerCallback);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IMediaSession.DESCRIPTOR);
        }

        public static IMediaSession asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IMediaSession.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IMediaSession)) ? new Proxy(iBinder) : (IMediaSession) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IMediaSession.DESCRIPTOR);
                return true;
            }
            boolean z = false;
            switch (i) {
                case 1:
                    sendCommand(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), (MediaSessionCompat.ResultReceiverWrapper) _Parcel.readTypedObject(parcel, MediaSessionCompat.ResultReceiverWrapper.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 2:
                    boolean sendMediaButton = sendMediaButton((KeyEvent) _Parcel.readTypedObject(parcel, KeyEvent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(sendMediaButton ? 1 : 0);
                    break;
                case 3:
                    registerCallbackListener(IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 4:
                    unregisterCallbackListener(IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 5:
                    boolean isTransportControlEnabled = isTransportControlEnabled();
                    parcel2.writeNoException();
                    parcel2.writeInt(isTransportControlEnabled ? 1 : 0);
                    break;
                case 6:
                    String packageName = getPackageName();
                    parcel2.writeNoException();
                    parcel2.writeString(packageName);
                    break;
                case 7:
                    String tag = getTag();
                    parcel2.writeNoException();
                    parcel2.writeString(tag);
                    break;
                case 8:
                    PendingIntent launchPendingIntent = getLaunchPendingIntent();
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, launchPendingIntent, 1);
                    break;
                case 9:
                    long flags = getFlags();
                    parcel2.writeNoException();
                    parcel2.writeLong(flags);
                    break;
                case 10:
                    ParcelableVolumeInfo volumeAttributes = getVolumeAttributes();
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, volumeAttributes, 1);
                    break;
                case 11:
                    adjustVolume(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 12:
                    setVolumeTo(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 13:
                    play();
                    parcel2.writeNoException();
                    break;
                case 14:
                    playFromMediaId(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 15:
                    playFromSearch(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 16:
                    playFromUri((Uri) _Parcel.readTypedObject(parcel, Uri.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 17:
                    skipToQueueItem(parcel.readLong());
                    parcel2.writeNoException();
                    break;
                case TRANSACTION_pause /*18*/:
                    pause();
                    parcel2.writeNoException();
                    break;
                case TRANSACTION_stop /*19*/:
                    stop();
                    parcel2.writeNoException();
                    break;
                case 20:
                    next();
                    parcel2.writeNoException();
                    break;
                case TRANSACTION_previous /*21*/:
                    previous();
                    parcel2.writeNoException();
                    break;
                case TRANSACTION_fastForward /*22*/:
                    fastForward();
                    parcel2.writeNoException();
                    break;
                case TRANSACTION_rewind /*23*/:
                    rewind();
                    parcel2.writeNoException();
                    break;
                case 24:
                    seekTo(parcel.readLong());
                    parcel2.writeNoException();
                    break;
                case TRANSACTION_rate /*25*/:
                    rate((RatingCompat) _Parcel.readTypedObject(parcel, RatingCompat.CREATOR));
                    parcel2.writeNoException();
                    break;
                case TRANSACTION_sendCustomAction /*26*/:
                    sendCustomAction(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case TRANSACTION_getMetadata /*27*/:
                    MediaMetadataCompat metadata = getMetadata();
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, metadata, 1);
                    break;
                case TRANSACTION_getPlaybackState /*28*/:
                    PlaybackStateCompat playbackState = getPlaybackState();
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, playbackState, 1);
                    break;
                case TRANSACTION_getQueue /*29*/:
                    List<MediaSessionCompat.QueueItem> queue = getQueue();
                    parcel2.writeNoException();
                    _Parcel.writeTypedList(parcel2, queue, 1);
                    break;
                case TRANSACTION_getQueueTitle /*30*/:
                    CharSequence queueTitle = getQueueTitle();
                    parcel2.writeNoException();
                    if (queueTitle == null) {
                        parcel2.writeInt(0);
                        break;
                    } else {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(queueTitle, parcel2, 1);
                        break;
                    }
                case TRANSACTION_getExtras /*31*/:
                    Bundle extras = getExtras();
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, extras, 1);
                    break;
                case 32:
                    int ratingType = getRatingType();
                    parcel2.writeNoException();
                    parcel2.writeInt(ratingType);
                    break;
                case TRANSACTION_prepare /*33*/:
                    prepare();
                    parcel2.writeNoException();
                    break;
                case TRANSACTION_prepareFromMediaId /*34*/:
                    prepareFromMediaId(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case TRANSACTION_prepareFromSearch /*35*/:
                    prepareFromSearch(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case TRANSACTION_prepareFromUri /*36*/:
                    prepareFromUri((Uri) _Parcel.readTypedObject(parcel, Uri.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 37:
                    int repeatMode = getRepeatMode();
                    parcel2.writeNoException();
                    parcel2.writeInt(repeatMode);
                    break;
                case TRANSACTION_isShuffleModeEnabledRemoved /*38*/:
                    boolean isShuffleModeEnabledRemoved = isShuffleModeEnabledRemoved();
                    parcel2.writeNoException();
                    parcel2.writeInt(isShuffleModeEnabledRemoved ? 1 : 0);
                    break;
                case TRANSACTION_setRepeatMode /*39*/:
                    setRepeatMode(parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 40:
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    setShuffleModeEnabledRemoved(z);
                    parcel2.writeNoException();
                    break;
                case TRANSACTION_addQueueItem /*41*/:
                    addQueueItem((MediaDescriptionCompat) _Parcel.readTypedObject(parcel, MediaDescriptionCompat.CREATOR));
                    parcel2.writeNoException();
                    break;
                case TRANSACTION_addQueueItemAt /*42*/:
                    addQueueItemAt((MediaDescriptionCompat) _Parcel.readTypedObject(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case TRANSACTION_removeQueueItem /*43*/:
                    removeQueueItem((MediaDescriptionCompat) _Parcel.readTypedObject(parcel, MediaDescriptionCompat.CREATOR));
                    parcel2.writeNoException();
                    break;
                case TRANSACTION_removeQueueItemAt /*44*/:
                    removeQueueItemAt(parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case TRANSACTION_isCaptioningEnabled /*45*/:
                    boolean isCaptioningEnabled = isCaptioningEnabled();
                    parcel2.writeNoException();
                    parcel2.writeInt(isCaptioningEnabled ? 1 : 0);
                    break;
                case TRANSACTION_setCaptioningEnabled /*46*/:
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    setCaptioningEnabled(z);
                    parcel2.writeNoException();
                    break;
                case TRANSACTION_getShuffleMode /*47*/:
                    int shuffleMode = getShuffleMode();
                    parcel2.writeNoException();
                    parcel2.writeInt(shuffleMode);
                    break;
                case TRANSACTION_setShuffleMode /*48*/:
                    setShuffleMode(parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case TRANSACTION_setPlaybackSpeed /*49*/:
                    setPlaybackSpeed(parcel.readFloat());
                    parcel2.writeNoException();
                    break;
                case TRANSACTION_getSessionInfo /*50*/:
                    Bundle sessionInfo = getSessionInfo();
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, sessionInfo, 1);
                    break;
                case TRANSACTION_rateWithExtras /*51*/:
                    rateWithExtras((RatingCompat) _Parcel.readTypedObject(parcel, RatingCompat.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }
    }

    public static class _Parcel {
        /* access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedList(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                writeTypedObject(parcel, (Parcelable) list.get(i2), i);
            }
        }

        /* access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException;

    void adjustVolume(int i, int i2, String str) throws RemoteException;

    void fastForward() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    long getFlags() throws RemoteException;

    PendingIntent getLaunchPendingIntent() throws RemoteException;

    MediaMetadataCompat getMetadata() throws RemoteException;

    String getPackageName() throws RemoteException;

    PlaybackStateCompat getPlaybackState() throws RemoteException;

    List<MediaSessionCompat.QueueItem> getQueue() throws RemoteException;

    CharSequence getQueueTitle() throws RemoteException;

    int getRatingType() throws RemoteException;

    int getRepeatMode() throws RemoteException;

    Bundle getSessionInfo() throws RemoteException;

    int getShuffleMode() throws RemoteException;

    String getTag() throws RemoteException;

    ParcelableVolumeInfo getVolumeAttributes() throws RemoteException;

    boolean isCaptioningEnabled() throws RemoteException;

    boolean isShuffleModeEnabledRemoved() throws RemoteException;

    boolean isTransportControlEnabled() throws RemoteException;

    void next() throws RemoteException;

    void pause() throws RemoteException;

    void play() throws RemoteException;

    void playFromMediaId(String str, Bundle bundle) throws RemoteException;

    void playFromSearch(String str, Bundle bundle) throws RemoteException;

    void playFromUri(Uri uri, Bundle bundle) throws RemoteException;

    void prepare() throws RemoteException;

    void prepareFromMediaId(String str, Bundle bundle) throws RemoteException;

    void prepareFromSearch(String str, Bundle bundle) throws RemoteException;

    void prepareFromUri(Uri uri, Bundle bundle) throws RemoteException;

    void previous() throws RemoteException;

    void rate(RatingCompat ratingCompat) throws RemoteException;

    void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) throws RemoteException;

    void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) throws RemoteException;

    void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    void removeQueueItemAt(int i) throws RemoteException;

    void rewind() throws RemoteException;

    void seekTo(long j) throws RemoteException;

    void sendCommand(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException;

    void sendCustomAction(String str, Bundle bundle) throws RemoteException;

    boolean sendMediaButton(KeyEvent keyEvent) throws RemoteException;

    void setCaptioningEnabled(boolean z) throws RemoteException;

    void setPlaybackSpeed(float f) throws RemoteException;

    void setRepeatMode(int i) throws RemoteException;

    void setShuffleMode(int i) throws RemoteException;

    void setShuffleModeEnabledRemoved(boolean z) throws RemoteException;

    void setVolumeTo(int i, int i2, String str) throws RemoteException;

    void skipToQueueItem(long j) throws RemoteException;

    void stop() throws RemoteException;

    void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) throws RemoteException;
}
