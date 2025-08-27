package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

public interface IMediaControllerCallback extends IInterface {
    public static final String DESCRIPTOR = "android.support.v4.media.session.IMediaControllerCallback";

    public static class Default implements IMediaControllerCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onCaptioningEnabledChanged(boolean z) throws RemoteException {
        }

        public void onEvent(String str, Bundle bundle) throws RemoteException {
        }

        public void onExtrasChanged(Bundle bundle) throws RemoteException {
        }

        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
        }

        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) throws RemoteException {
        }

        public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
        }

        public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {
        }

        public void onRepeatModeChanged(int i) throws RemoteException {
        }

        public void onSessionDestroyed() throws RemoteException {
        }

        public void onSessionReady() throws RemoteException {
        }

        public void onShuffleModeChanged(int i) throws RemoteException {
        }

        public void onShuffleModeChangedRemoved(boolean z) throws RemoteException {
        }

        public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMediaControllerCallback {
        static final int TRANSACTION_onCaptioningEnabledChanged = 11;
        static final int TRANSACTION_onEvent = 1;
        static final int TRANSACTION_onExtrasChanged = 7;
        static final int TRANSACTION_onMetadataChanged = 4;
        static final int TRANSACTION_onPlaybackStateChanged = 3;
        static final int TRANSACTION_onQueueChanged = 5;
        static final int TRANSACTION_onQueueTitleChanged = 6;
        static final int TRANSACTION_onRepeatModeChanged = 9;
        static final int TRANSACTION_onSessionDestroyed = 2;
        static final int TRANSACTION_onSessionReady = 13;
        static final int TRANSACTION_onShuffleModeChanged = 12;
        static final int TRANSACTION_onShuffleModeChangedRemoved = 10;
        static final int TRANSACTION_onVolumeInfoChanged = 8;

        public static class Proxy implements IMediaControllerCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IMediaControllerCallback.DESCRIPTOR;
            }

            public void onCaptioningEnabledChanged(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(11, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onEvent(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onExtrasChanged(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(7, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, mediaMetadataCompat, 0);
                    this.mRemote.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, playbackStateCompat, 0);
                    this.mRemote.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
                    _Parcel.writeTypedList(obtain, list, 0);
                    this.mRemote.transact(5, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
                    if (charSequence != null) {
                        obtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(6, obtain, (Parcel) null, 1);
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            public void onRepeatModeChanged(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(9, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onSessionDestroyed() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
                    this.mRemote.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onSessionReady() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
                    this.mRemote.transact(13, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onShuffleModeChanged(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(12, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onShuffleModeChangedRemoved(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(10, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, parcelableVolumeInfo, 0);
                    this.mRemote.transact(8, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IMediaControllerCallback.DESCRIPTOR);
        }

        public static IMediaControllerCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IMediaControllerCallback.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IMediaControllerCallback)) ? new Proxy(iBinder) : (IMediaControllerCallback) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IMediaControllerCallback.DESCRIPTOR);
                return true;
            }
            boolean z = false;
            switch (i) {
                case 1:
                    onEvent(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    break;
                case 2:
                    onSessionDestroyed();
                    break;
                case 3:
                    onPlaybackStateChanged((PlaybackStateCompat) _Parcel.readTypedObject(parcel, PlaybackStateCompat.CREATOR));
                    break;
                case 4:
                    onMetadataChanged((MediaMetadataCompat) _Parcel.readTypedObject(parcel, MediaMetadataCompat.CREATOR));
                    break;
                case 5:
                    onQueueChanged(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    break;
                case 6:
                    onQueueTitleChanged((CharSequence) _Parcel.readTypedObject(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                    break;
                case 7:
                    onExtrasChanged((Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    break;
                case 8:
                    onVolumeInfoChanged((ParcelableVolumeInfo) _Parcel.readTypedObject(parcel, ParcelableVolumeInfo.CREATOR));
                    break;
                case 9:
                    onRepeatModeChanged(parcel.readInt());
                    break;
                case 10:
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    onShuffleModeChangedRemoved(z);
                    break;
                case 11:
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    onCaptioningEnabledChanged(z);
                    break;
                case 12:
                    onShuffleModeChanged(parcel.readInt());
                    break;
                case 13:
                    onSessionReady();
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

    void onCaptioningEnabledChanged(boolean z) throws RemoteException;

    void onEvent(String str, Bundle bundle) throws RemoteException;

    void onExtrasChanged(Bundle bundle) throws RemoteException;

    void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    void onQueueChanged(List<MediaSessionCompat.QueueItem> list) throws RemoteException;

    void onQueueTitleChanged(CharSequence charSequence) throws RemoteException;

    void onRepeatModeChanged(int i) throws RemoteException;

    void onSessionDestroyed() throws RemoteException;

    void onSessionReady() throws RemoteException;

    void onShuffleModeChanged(int i) throws RemoteException;

    void onShuffleModeChangedRemoved(boolean z) throws RemoteException;

    void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;
}
