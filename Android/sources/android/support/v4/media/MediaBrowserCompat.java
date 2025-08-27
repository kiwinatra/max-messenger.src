package android.support.v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class MediaBrowserCompat {
    public static final String CUSTOM_ACTION_DOWNLOAD = "android.support.v4.media.action.DOWNLOAD";
    public static final String CUSTOM_ACTION_REMOVE_DOWNLOADED_FILE = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";
    static final boolean DEBUG = Log.isLoggable(TAG, 3);
    public static final String EXTRA_DOWNLOAD_PROGRESS = "android.media.browse.extra.DOWNLOAD_PROGRESS";
    public static final String EXTRA_MEDIA_ID = "android.media.browse.extra.MEDIA_ID";
    public static final String EXTRA_PAGE = "android.media.browse.extra.PAGE";
    public static final String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";
    static final String TAG = "MediaBrowserCompat";
    private final MediaBrowserImpl mImpl;

    public static class Api21Impl {
        private Api21Impl() {
        }

        public static MediaDescription getDescription(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        public static int getFlags(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }

    public static class CallbackHandler extends Handler {
        private final WeakReference<MediaBrowserServiceCallbackImpl> mCallbackImplRef;
        private WeakReference<Messenger> mCallbacksMessengerRef;

        public CallbackHandler(MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl) {
            this.mCallbackImplRef = new WeakReference<>(mediaBrowserServiceCallbackImpl);
        }

        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.mCallbacksMessengerRef;
            if (weakReference != null && weakReference.get() != null && this.mCallbackImplRef.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.ensureClassLoader(data);
                MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl = this.mCallbackImplRef.get();
                Messenger messenger = this.mCallbacksMessengerRef.get();
                try {
                    int i = message.what;
                    if (i == 1) {
                        Bundle bundle = data.getBundle("data_root_hints");
                        MediaSessionCompat.ensureClassLoader(bundle);
                        mediaBrowserServiceCallbackImpl.onServiceConnected(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                    } else if (i == 2) {
                        mediaBrowserServiceCallbackImpl.onConnectionFailed(messenger);
                    } else if (i != 3) {
                        message.toString();
                    } else {
                        Bundle bundle2 = data.getBundle("data_options");
                        MediaSessionCompat.ensureClassLoader(bundle2);
                        Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                        MediaSessionCompat.ensureClassLoader(bundle3);
                        mediaBrowserServiceCallbackImpl.onLoadChildren(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    if (message.what == 1) {
                        mediaBrowserServiceCallbackImpl.onConnectionFailed(messenger);
                    }
                }
            }
        }

        public void setCallbacksMessenger(Messenger messenger) {
            this.mCallbacksMessengerRef = new WeakReference<>(messenger);
        }
    }

    public static class ConnectionCallback {
        final MediaBrowser.ConnectionCallback mConnectionCallbackFwk = new ConnectionCallbackApi21();
        ConnectionCallbackInternal mConnectionCallbackInternal;

        public class ConnectionCallbackApi21 extends MediaBrowser.ConnectionCallback {
            public ConnectionCallbackApi21() {
            }

            public void onConnected() {
                ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.mConnectionCallbackInternal;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnected();
                }
                ConnectionCallback.this.onConnected();
            }

            public void onConnectionFailed() {
                ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.mConnectionCallbackInternal;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnectionFailed();
                }
                ConnectionCallback.this.onConnectionFailed();
            }

            public void onConnectionSuspended() {
                ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.mConnectionCallbackInternal;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnectionSuspended();
                }
                ConnectionCallback.this.onConnectionSuspended();
            }
        }

        public interface ConnectionCallbackInternal {
            void onConnected();

            void onConnectionFailed();

            void onConnectionSuspended();
        }

        public void onConnected() {
        }

        public void onConnectionFailed() {
        }

        public void onConnectionSuspended() {
        }

        public void setInternalConnectionCallback(ConnectionCallbackInternal connectionCallbackInternal) {
            this.mConnectionCallbackInternal = connectionCallbackInternal;
        }
    }

    public static abstract class CustomActionCallback {
        public void onError(String str, Bundle bundle, Bundle bundle2) {
        }

        public void onProgressUpdate(String str, Bundle bundle, Bundle bundle2) {
        }

        public void onResult(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    public static class CustomActionResultReceiver extends ResultReceiver {
        private final String mAction;
        private final CustomActionCallback mCallback;
        private final Bundle mExtras;

        public CustomActionResultReceiver(String str, Bundle bundle, CustomActionCallback customActionCallback, Handler handler) {
            super(handler);
            this.mAction = str;
            this.mExtras = bundle;
            this.mCallback = customActionCallback;
        }

        public void onReceiveResult(int i, Bundle bundle) {
            if (this.mCallback != null) {
                MediaSessionCompat.ensureClassLoader(bundle);
                if (i == -1) {
                    this.mCallback.onError(this.mAction, this.mExtras, bundle);
                } else if (i == 0) {
                    this.mCallback.onResult(this.mAction, this.mExtras, bundle);
                } else if (i != 1) {
                    Objects.toString(this.mExtras);
                    Objects.toString(bundle);
                } else {
                    this.mCallback.onProgressUpdate(this.mAction, this.mExtras, bundle);
                }
            }
        }
    }

    public static abstract class ItemCallback {
        final MediaBrowser.ItemCallback mItemCallbackFwk = new ItemCallbackApi23();

        public class ItemCallbackApi23 extends MediaBrowser.ItemCallback {
            public ItemCallbackApi23() {
            }

            public void onError(String str) {
                ItemCallback.this.onError(str);
            }

            public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
                ItemCallback.this.onItemLoaded(MediaItem.fromMediaItem(mediaItem));
            }
        }

        public void onError(String str) {
        }

        public void onItemLoaded(MediaItem mediaItem) {
        }
    }

    public static class ItemReceiver extends ResultReceiver {
        private final ItemCallback mCallback;
        private final String mMediaId;

        public ItemReceiver(String str, ItemCallback itemCallback, Handler handler) {
            super(handler);
            this.mMediaId = str;
            this.mCallback = itemCallback;
        }

        public void onReceiveResult(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.unparcelWithClassLoader(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.mCallback.onError(this.mMediaId);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.mCallback.onItemLoaded((MediaItem) parcelable);
            } else {
                this.mCallback.onError(this.mMediaId);
            }
        }
    }

    public interface MediaBrowserImpl {
        void connect();

        void disconnect();

        Bundle getExtras();

        void getItem(String str, ItemCallback itemCallback);

        Bundle getNotifyChildrenChangedOptions();

        String getRoot();

        ComponentName getServiceComponent();

        MediaSessionCompat.Token getSessionToken();

        boolean isConnected();

        void search(String str, Bundle bundle, SearchCallback searchCallback);

        void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback);

        void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback);

        void unsubscribe(String str, SubscriptionCallback subscriptionCallback);
    }

    public static class MediaBrowserImplApi21 implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl, ConnectionCallback.ConnectionCallbackInternal {
        protected final MediaBrowser mBrowserFwk;
        protected Messenger mCallbacksMessenger;
        final Context mContext;
        protected final CallbackHandler mHandler = new CallbackHandler(this);
        private MediaSessionCompat.Token mMediaSessionToken;
        private Bundle mNotifyChildrenChangedOptions;
        protected final Bundle mRootHints;
        protected ServiceBinderWrapper mServiceBinderWrapper;
        protected int mServiceVersion;
        private final ts mSubscriptions = new qae();

        /* JADX WARNING: type inference failed for: r0v1, types: [qae, ts] */
        public MediaBrowserImplApi21(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            Bundle bundle2;
            this.mContext = context;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            this.mRootHints = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            connectionCallback.setInternalConnectionCallback(this);
            this.mBrowserFwk = new MediaBrowser(context, componentName, connectionCallback.mConnectionCallbackFwk, bundle2);
        }

        public void connect() {
            this.mBrowserFwk.connect();
        }

        public void disconnect() {
            Messenger messenger;
            ServiceBinderWrapper serviceBinderWrapper = this.mServiceBinderWrapper;
            if (!(serviceBinderWrapper == null || (messenger = this.mCallbacksMessenger) == null)) {
                try {
                    serviceBinderWrapper.unregisterCallbackMessenger(messenger);
                } catch (RemoteException unused) {
                }
            }
            this.mBrowserFwk.disconnect();
        }

        public Bundle getExtras() {
            return this.mBrowserFwk.getExtras();
        }

        public void getItem(final String str, final ItemCallback itemCallback) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            } else if (itemCallback == null) {
                throw new IllegalArgumentException("cb is null");
            } else if (!this.mBrowserFwk.isConnected()) {
                this.mHandler.post(new Runnable() {
                    public void run() {
                        itemCallback.onError(str);
                    }
                });
            } else if (this.mServiceBinderWrapper == null) {
                this.mHandler.post(new Runnable() {
                    public void run() {
                        itemCallback.onError(str);
                    }
                });
            } else {
                try {
                    this.mServiceBinderWrapper.getMediaItem(str, new ItemReceiver(str, itemCallback, this.mHandler), this.mCallbacksMessenger);
                } catch (RemoteException unused) {
                    this.mHandler.post(new Runnable() {
                        public void run() {
                            itemCallback.onError(str);
                        }
                    });
                }
            }
        }

        public Bundle getNotifyChildrenChangedOptions() {
            return this.mNotifyChildrenChangedOptions;
        }

        public String getRoot() {
            return this.mBrowserFwk.getRoot();
        }

        public ComponentName getServiceComponent() {
            return this.mBrowserFwk.getServiceComponent();
        }

        public MediaSessionCompat.Token getSessionToken() {
            if (this.mMediaSessionToken == null) {
                this.mMediaSessionToken = MediaSessionCompat.Token.fromToken(this.mBrowserFwk.getSessionToken());
            }
            return this.mMediaSessionToken;
        }

        public boolean isConnected() {
            return this.mBrowserFwk.isConnected();
        }

        public void onConnected() {
            try {
                Bundle extras = this.mBrowserFwk.getExtras();
                if (extras != null) {
                    this.mServiceVersion = extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        this.mServiceBinderWrapper = new ServiceBinderWrapper(binder, this.mRootHints);
                        Messenger messenger = new Messenger(this.mHandler);
                        this.mCallbacksMessenger = messenger;
                        this.mHandler.setCallbacksMessenger(messenger);
                        try {
                            this.mServiceBinderWrapper.registerCallbackMessenger(this.mContext, this.mCallbacksMessenger);
                        } catch (RemoteException unused) {
                        }
                    }
                    IMediaSession asInterface = IMediaSession.Stub.asInterface(extras.getBinder("extra_session_binder"));
                    if (asInterface != null) {
                        this.mMediaSessionToken = MediaSessionCompat.Token.fromToken(this.mBrowserFwk.getSessionToken(), asInterface);
                    }
                }
            } catch (IllegalStateException unused2) {
            }
        }

        public void onConnectionFailed() {
        }

        public void onConnectionSuspended() {
            this.mServiceBinderWrapper = null;
            this.mCallbacksMessenger = null;
            this.mMediaSessionToken = null;
            this.mHandler.setCallbacksMessenger((Messenger) null);
        }

        public void onLoadChildren(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.mCallbacksMessenger == messenger) {
                Subscription subscription = (Subscription) this.mSubscriptions.get(str);
                if (subscription == null) {
                    String str2 = MediaBrowserCompat.EXTRA_PAGE;
                    return;
                }
                SubscriptionCallback callback = subscription.getCallback(bundle);
                if (callback == null) {
                    return;
                }
                if (bundle == null) {
                    if (list == null) {
                        callback.onError(str);
                        return;
                    }
                    this.mNotifyChildrenChangedOptions = bundle2;
                    callback.onChildrenLoaded(str, list);
                    this.mNotifyChildrenChangedOptions = null;
                } else if (list == null) {
                    callback.onError(str, bundle);
                } else {
                    this.mNotifyChildrenChangedOptions = bundle2;
                    callback.onChildrenLoaded(str, list, bundle);
                    this.mNotifyChildrenChangedOptions = null;
                }
            }
        }

        public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        public void search(final String str, final Bundle bundle, final SearchCallback searchCallback) {
            if (!isConnected()) {
                throw new IllegalStateException("search() called while not connected");
            } else if (this.mServiceBinderWrapper == null) {
                this.mHandler.post(new Runnable() {
                    public void run() {
                        searchCallback.onError(str, bundle);
                    }
                });
            } else {
                try {
                    this.mServiceBinderWrapper.search(str, bundle, new SearchResultReceiver(str, bundle, searchCallback, this.mHandler), this.mCallbacksMessenger);
                } catch (RemoteException unused) {
                    this.mHandler.post(new Runnable() {
                        public void run() {
                            searchCallback.onError(str, bundle);
                        }
                    });
                }
            }
        }

        public void sendCustomAction(final String str, final Bundle bundle, final CustomActionCallback customActionCallback) {
            if (isConnected()) {
                if (this.mServiceBinderWrapper == null && customActionCallback != null) {
                    this.mHandler.post(new Runnable() {
                        public void run() {
                            customActionCallback.onError(str, bundle, (Bundle) null);
                        }
                    });
                }
                try {
                    this.mServiceBinderWrapper.sendCustomAction(str, bundle, new CustomActionResultReceiver(str, bundle, customActionCallback, this.mHandler), this.mCallbacksMessenger);
                } catch (RemoteException unused) {
                    Objects.toString(bundle);
                    if (customActionCallback != null) {
                        this.mHandler.post(new Runnable() {
                            public void run() {
                                customActionCallback.onError(str, bundle, (Bundle) null);
                            }
                        });
                    }
                }
            } else {
                throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");
            }
        }

        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            Subscription subscription = (Subscription) this.mSubscriptions.get(str);
            if (subscription == null) {
                subscription = new Subscription();
                this.mSubscriptions.put(str, subscription);
            }
            subscriptionCallback.setSubscription(subscription);
            Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
            subscription.putCallback(bundle2, subscriptionCallback);
            ServiceBinderWrapper serviceBinderWrapper = this.mServiceBinderWrapper;
            if (serviceBinderWrapper == null) {
                this.mBrowserFwk.subscribe(str, subscriptionCallback.mSubscriptionCallbackFwk);
                return;
            }
            try {
                serviceBinderWrapper.addSubscription(str, subscriptionCallback.mToken, bundle2, this.mCallbacksMessenger);
            } catch (RemoteException unused) {
            }
        }

        public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
            Subscription subscription = (Subscription) this.mSubscriptions.get(str);
            if (subscription != null) {
                ServiceBinderWrapper serviceBinderWrapper = this.mServiceBinderWrapper;
                if (serviceBinderWrapper == null) {
                    if (subscriptionCallback == null) {
                        this.mBrowserFwk.unsubscribe(str);
                    } else {
                        List<SubscriptionCallback> callbacks = subscription.getCallbacks();
                        List<Bundle> optionsList = subscription.getOptionsList();
                        for (int size = callbacks.size() - 1; size >= 0; size--) {
                            if (callbacks.get(size) == subscriptionCallback) {
                                callbacks.remove(size);
                                optionsList.remove(size);
                            }
                        }
                        if (callbacks.size() == 0) {
                            this.mBrowserFwk.unsubscribe(str);
                        }
                    }
                } else if (subscriptionCallback == null) {
                    try {
                        serviceBinderWrapper.removeSubscription(str, (IBinder) null, this.mCallbacksMessenger);
                    } catch (RemoteException unused) {
                    }
                } else {
                    List<SubscriptionCallback> callbacks2 = subscription.getCallbacks();
                    List<Bundle> optionsList2 = subscription.getOptionsList();
                    for (int size2 = callbacks2.size() - 1; size2 >= 0; size2--) {
                        if (callbacks2.get(size2) == subscriptionCallback) {
                            this.mServiceBinderWrapper.removeSubscription(str, subscriptionCallback.mToken, this.mCallbacksMessenger);
                            callbacks2.remove(size2);
                            optionsList2.remove(size2);
                        }
                    }
                }
                if (subscription.isEmpty() || subscriptionCallback == null) {
                    this.mSubscriptions.remove(str);
                }
            }
        }

        public void onConnectionFailed(Messenger messenger) {
        }
    }

    public static class MediaBrowserImplApi23 extends MediaBrowserImplApi21 {
        public MediaBrowserImplApi23(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }

        public void getItem(String str, ItemCallback itemCallback) {
            if (this.mServiceBinderWrapper == null) {
                this.mBrowserFwk.getItem(str, itemCallback.mItemCallbackFwk);
            } else {
                super.getItem(str, itemCallback);
            }
        }
    }

    public static class MediaBrowserImplApi26 extends MediaBrowserImplApi23 {
        public MediaBrowserImplApi26(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }

        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            if (this.mServiceBinderWrapper != null && this.mServiceVersion >= 2) {
                super.subscribe(str, bundle, subscriptionCallback);
            } else if (bundle == null) {
                this.mBrowserFwk.subscribe(str, subscriptionCallback.mSubscriptionCallbackFwk);
            } else {
                this.mBrowserFwk.subscribe(str, bundle, subscriptionCallback.mSubscriptionCallbackFwk);
            }
        }

        public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
            if (this.mServiceBinderWrapper != null && this.mServiceVersion >= 2) {
                super.unsubscribe(str, subscriptionCallback);
            } else if (subscriptionCallback == null) {
                this.mBrowserFwk.unsubscribe(str);
            } else {
                this.mBrowserFwk.unsubscribe(str, subscriptionCallback.mSubscriptionCallbackFwk);
            }
        }
    }

    public static class MediaBrowserImplBase implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl {
        static final int CONNECT_STATE_CONNECTED = 3;
        static final int CONNECT_STATE_CONNECTING = 2;
        static final int CONNECT_STATE_DISCONNECTED = 1;
        static final int CONNECT_STATE_DISCONNECTING = 0;
        static final int CONNECT_STATE_SUSPENDED = 4;
        final ConnectionCallback mCallback;
        Messenger mCallbacksMessenger;
        final Context mContext;
        private Bundle mExtras;
        final CallbackHandler mHandler = new CallbackHandler(this);
        private MediaSessionCompat.Token mMediaSessionToken;
        private Bundle mNotifyChildrenChangedOptions;
        final Bundle mRootHints;
        private String mRootId;
        ServiceBinderWrapper mServiceBinderWrapper;
        final ComponentName mServiceComponent;
        MediaServiceConnection mServiceConnection;
        int mState = 1;
        private final ts mSubscriptions = new qae();

        public class MediaServiceConnection implements ServiceConnection {
            public MediaServiceConnection() {
            }

            private void postOrRun(Runnable runnable) {
                if (Thread.currentThread() == MediaBrowserImplBase.this.mHandler.getLooper().getThread()) {
                    runnable.run();
                } else {
                    MediaBrowserImplBase.this.mHandler.post(runnable);
                }
            }

            public boolean isCurrent(String str) {
                int i;
                MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                if (mediaBrowserImplBase.mServiceConnection == this && (i = mediaBrowserImplBase.mState) != 0 && i != 1) {
                    return true;
                }
                int i2 = mediaBrowserImplBase.mState;
                if (i2 == 0 || i2 == 1) {
                    return false;
                }
                Objects.toString(mediaBrowserImplBase.mServiceComponent);
                Objects.toString(MediaBrowserImplBase.this.mServiceConnection);
                toString();
                return false;
            }

            public void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
                postOrRun(new Runnable() {
                    public void run() {
                        boolean z = MediaBrowserCompat.DEBUG;
                        if (z) {
                            Objects.toString(componentName);
                            Objects.toString(iBinder);
                            MediaBrowserImplBase.this.dump();
                        }
                        if (MediaServiceConnection.this.isCurrent("onServiceConnected")) {
                            MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                            mediaBrowserImplBase.mServiceBinderWrapper = new ServiceBinderWrapper(iBinder, mediaBrowserImplBase.mRootHints);
                            MediaBrowserImplBase.this.mCallbacksMessenger = new Messenger(MediaBrowserImplBase.this.mHandler);
                            MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
                            mediaBrowserImplBase2.mHandler.setCallbacksMessenger(mediaBrowserImplBase2.mCallbacksMessenger);
                            MediaBrowserImplBase mediaBrowserImplBase3 = MediaBrowserImplBase.this;
                            mediaBrowserImplBase3.mState = 2;
                            if (z) {
                                try {
                                    mediaBrowserImplBase3.dump();
                                } catch (RemoteException unused) {
                                    Objects.toString(MediaBrowserImplBase.this.mServiceComponent);
                                    if (MediaBrowserCompat.DEBUG) {
                                        MediaBrowserImplBase.this.dump();
                                        return;
                                    }
                                    return;
                                }
                            }
                            MediaBrowserImplBase mediaBrowserImplBase4 = MediaBrowserImplBase.this;
                            mediaBrowserImplBase4.mServiceBinderWrapper.connect(mediaBrowserImplBase4.mContext, mediaBrowserImplBase4.mCallbacksMessenger);
                        }
                    }
                });
            }

            public void onServiceDisconnected(final ComponentName componentName) {
                postOrRun(new Runnable() {
                    public void run() {
                        if (MediaBrowserCompat.DEBUG) {
                            Objects.toString(componentName);
                            toString();
                            Objects.toString(MediaBrowserImplBase.this.mServiceConnection);
                            MediaBrowserImplBase.this.dump();
                        }
                        if (MediaServiceConnection.this.isCurrent("onServiceDisconnected")) {
                            MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                            mediaBrowserImplBase.mServiceBinderWrapper = null;
                            mediaBrowserImplBase.mCallbacksMessenger = null;
                            mediaBrowserImplBase.mHandler.setCallbacksMessenger((Messenger) null);
                            MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
                            mediaBrowserImplBase2.mState = 4;
                            mediaBrowserImplBase2.mCallback.onConnectionSuspended();
                        }
                    }
                });
            }
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [qae, ts] */
        public MediaBrowserImplBase(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (connectionCallback != null) {
                this.mContext = context;
                this.mServiceComponent = componentName;
                this.mCallback = connectionCallback;
                this.mRootHints = bundle == null ? null : new Bundle(bundle);
            } else {
                throw new IllegalArgumentException("connection callback must not be null");
            }
        }

        private static String getStateLabel(int i) {
            return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? wj6.h(i, "UNKNOWN/") : "CONNECT_STATE_SUSPENDED" : "CONNECT_STATE_CONNECTED" : "CONNECT_STATE_CONNECTING" : "CONNECT_STATE_DISCONNECTED" : "CONNECT_STATE_DISCONNECTING";
        }

        private boolean isCurrent(Messenger messenger, String str) {
            int i;
            if (this.mCallbacksMessenger == messenger && (i = this.mState) != 0 && i != 1) {
                return true;
            }
            int i2 = this.mState;
            if (i2 == 0 || i2 == 1) {
                return false;
            }
            Objects.toString(this.mServiceComponent);
            Objects.toString(this.mCallbacksMessenger);
            toString();
            return false;
        }

        public void connect() {
            int i = this.mState;
            if (i == 0 || i == 1) {
                this.mState = 2;
                this.mHandler.post(new Runnable() {
                    public void run() {
                        boolean z;
                        MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                        if (mediaBrowserImplBase.mState != 0) {
                            mediaBrowserImplBase.mState = 2;
                            if (MediaBrowserCompat.DEBUG && mediaBrowserImplBase.mServiceConnection != null) {
                                throw new RuntimeException("mServiceConnection should be null. Instead it is " + MediaBrowserImplBase.this.mServiceConnection);
                            } else if (mediaBrowserImplBase.mServiceBinderWrapper != null) {
                                throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + MediaBrowserImplBase.this.mServiceBinderWrapper);
                            } else if (mediaBrowserImplBase.mCallbacksMessenger == null) {
                                Intent intent = new Intent("android.media.browse.MediaBrowserService");
                                intent.setComponent(MediaBrowserImplBase.this.mServiceComponent);
                                MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
                                mediaBrowserImplBase2.mServiceConnection = new MediaServiceConnection();
                                try {
                                    MediaBrowserImplBase mediaBrowserImplBase3 = MediaBrowserImplBase.this;
                                    z = mediaBrowserImplBase3.mContext.bindService(intent, mediaBrowserImplBase3.mServiceConnection, 1);
                                } catch (Exception unused) {
                                    Objects.toString(MediaBrowserImplBase.this.mServiceComponent);
                                    z = false;
                                }
                                if (!z) {
                                    MediaBrowserImplBase.this.forceCloseConnection();
                                    MediaBrowserImplBase.this.mCallback.onConnectionFailed();
                                }
                                if (MediaBrowserCompat.DEBUG) {
                                    MediaBrowserImplBase.this.dump();
                                }
                            } else {
                                throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + MediaBrowserImplBase.this.mCallbacksMessenger);
                            }
                        }
                    }
                });
                return;
            }
            throw new IllegalStateException(wj6.n(new StringBuilder("connect() called while neigther disconnecting nor disconnected (state="), getStateLabel(this.mState), ")"));
        }

        public void disconnect() {
            this.mState = 0;
            this.mHandler.post(new Runnable() {
                public void run() {
                    MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                    Messenger messenger = mediaBrowserImplBase.mCallbacksMessenger;
                    if (messenger != null) {
                        try {
                            mediaBrowserImplBase.mServiceBinderWrapper.disconnect(messenger);
                        } catch (RemoteException unused) {
                            Objects.toString(MediaBrowserImplBase.this.mServiceComponent);
                        }
                    }
                    MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
                    int i = mediaBrowserImplBase2.mState;
                    mediaBrowserImplBase2.forceCloseConnection();
                    if (i != 0) {
                        MediaBrowserImplBase.this.mState = i;
                    }
                    if (MediaBrowserCompat.DEBUG) {
                        MediaBrowserImplBase.this.dump();
                    }
                }
            });
        }

        public void dump() {
            Objects.toString(this.mServiceComponent);
            Objects.toString(this.mCallback);
            Objects.toString(this.mRootHints);
            getStateLabel(this.mState);
            Objects.toString(this.mServiceConnection);
            Objects.toString(this.mServiceBinderWrapper);
            Objects.toString(this.mCallbacksMessenger);
            Objects.toString(this.mMediaSessionToken);
        }

        public void forceCloseConnection() {
            MediaServiceConnection mediaServiceConnection = this.mServiceConnection;
            if (mediaServiceConnection != null) {
                this.mContext.unbindService(mediaServiceConnection);
            }
            this.mState = 1;
            this.mServiceConnection = null;
            this.mServiceBinderWrapper = null;
            this.mCallbacksMessenger = null;
            this.mHandler.setCallbacksMessenger((Messenger) null);
            this.mRootId = null;
            this.mMediaSessionToken = null;
        }

        public Bundle getExtras() {
            if (isConnected()) {
                return this.mExtras;
            }
            throw new IllegalStateException(wj6.n(new StringBuilder("getExtras() called while not connected (state="), getStateLabel(this.mState), ")"));
        }

        public void getItem(final String str, final ItemCallback itemCallback) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            } else if (itemCallback == null) {
                throw new IllegalArgumentException("cb is null");
            } else if (!isConnected()) {
                this.mHandler.post(new Runnable() {
                    public void run() {
                        itemCallback.onError(str);
                    }
                });
            } else {
                try {
                    this.mServiceBinderWrapper.getMediaItem(str, new ItemReceiver(str, itemCallback, this.mHandler), this.mCallbacksMessenger);
                } catch (RemoteException unused) {
                    this.mHandler.post(new Runnable() {
                        public void run() {
                            itemCallback.onError(str);
                        }
                    });
                }
            }
        }

        public Bundle getNotifyChildrenChangedOptions() {
            return this.mNotifyChildrenChangedOptions;
        }

        public String getRoot() {
            if (isConnected()) {
                return this.mRootId;
            }
            throw new IllegalStateException(wj6.n(new StringBuilder("getRoot() called while not connected(state="), getStateLabel(this.mState), ")"));
        }

        public ComponentName getServiceComponent() {
            if (isConnected()) {
                return this.mServiceComponent;
            }
            throw new IllegalStateException(wj6.l(new StringBuilder("getServiceComponent() called while not connected (state="), this.mState, ")"));
        }

        public MediaSessionCompat.Token getSessionToken() {
            if (isConnected()) {
                return this.mMediaSessionToken;
            }
            throw new IllegalStateException(wj6.l(new StringBuilder("getSessionToken() called while not connected(state="), this.mState, ")"));
        }

        public boolean isConnected() {
            return this.mState == 3;
        }

        public void onConnectionFailed(Messenger messenger) {
            Objects.toString(this.mServiceComponent);
            if (isCurrent(messenger, "onConnectFailed")) {
                int i = this.mState;
                if (i != 2) {
                    getStateLabel(i);
                    return;
                }
                forceCloseConnection();
                this.mCallback.onConnectionFailed();
            }
        }

        public void onLoadChildren(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            SubscriptionCallback callback;
            if (isCurrent(messenger, "onLoadChildren")) {
                if (MediaBrowserCompat.DEBUG) {
                    Objects.toString(this.mServiceComponent);
                }
                Subscription subscription = (Subscription) this.mSubscriptions.get(str);
                if (subscription != null && (callback = subscription.getCallback(bundle)) != null) {
                    if (bundle == null) {
                        if (list == null) {
                            callback.onError(str);
                            return;
                        }
                        this.mNotifyChildrenChangedOptions = bundle2;
                        callback.onChildrenLoaded(str, list);
                        this.mNotifyChildrenChangedOptions = null;
                    } else if (list == null) {
                        callback.onError(str, bundle);
                    } else {
                        this.mNotifyChildrenChangedOptions = bundle2;
                        callback.onChildrenLoaded(str, list, bundle);
                        this.mNotifyChildrenChangedOptions = null;
                    }
                }
            }
        }

        public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (isCurrent(messenger, "onConnect")) {
                int i = this.mState;
                if (i != 2) {
                    getStateLabel(i);
                    return;
                }
                this.mRootId = str;
                this.mMediaSessionToken = token;
                this.mExtras = bundle;
                this.mState = 3;
                if (MediaBrowserCompat.DEBUG) {
                    dump();
                }
                this.mCallback.onConnected();
                try {
                    Iterator it = ((os) this.mSubscriptions.entrySet()).iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String str2 = (String) entry.getKey();
                        Subscription subscription = (Subscription) entry.getValue();
                        List<SubscriptionCallback> callbacks = subscription.getCallbacks();
                        List<Bundle> optionsList = subscription.getOptionsList();
                        for (int i2 = 0; i2 < callbacks.size(); i2++) {
                            this.mServiceBinderWrapper.addSubscription(str2, callbacks.get(i2).mToken, optionsList.get(i2), this.mCallbacksMessenger);
                        }
                    }
                } catch (RemoteException unused) {
                }
            }
        }

        public void search(final String str, final Bundle bundle, final SearchCallback searchCallback) {
            if (isConnected()) {
                try {
                    this.mServiceBinderWrapper.search(str, bundle, new SearchResultReceiver(str, bundle, searchCallback, this.mHandler), this.mCallbacksMessenger);
                } catch (RemoteException unused) {
                    this.mHandler.post(new Runnable() {
                        public void run() {
                            searchCallback.onError(str, bundle);
                        }
                    });
                }
            } else {
                throw new IllegalStateException(wj6.n(new StringBuilder("search() called while not connected (state="), getStateLabel(this.mState), ")"));
            }
        }

        public void sendCustomAction(final String str, final Bundle bundle, final CustomActionCallback customActionCallback) {
            if (isConnected()) {
                try {
                    this.mServiceBinderWrapper.sendCustomAction(str, bundle, new CustomActionResultReceiver(str, bundle, customActionCallback, this.mHandler), this.mCallbacksMessenger);
                } catch (RemoteException unused) {
                    Objects.toString(bundle);
                    if (customActionCallback != null) {
                        this.mHandler.post(new Runnable() {
                            public void run() {
                                customActionCallback.onError(str, bundle, (Bundle) null);
                            }
                        });
                    }
                }
            } else {
                throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");
            }
        }

        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            Subscription subscription = (Subscription) this.mSubscriptions.get(str);
            if (subscription == null) {
                subscription = new Subscription();
                this.mSubscriptions.put(str, subscription);
            }
            Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
            subscription.putCallback(bundle2, subscriptionCallback);
            if (isConnected()) {
                try {
                    this.mServiceBinderWrapper.addSubscription(str, subscriptionCallback.mToken, bundle2, this.mCallbacksMessenger);
                } catch (RemoteException unused) {
                }
            }
        }

        public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
            Subscription subscription = (Subscription) this.mSubscriptions.get(str);
            if (subscription != null) {
                if (subscriptionCallback == null) {
                    try {
                        if (isConnected()) {
                            this.mServiceBinderWrapper.removeSubscription(str, (IBinder) null, this.mCallbacksMessenger);
                        }
                    } catch (RemoteException unused) {
                    }
                } else {
                    List<SubscriptionCallback> callbacks = subscription.getCallbacks();
                    List<Bundle> optionsList = subscription.getOptionsList();
                    for (int size = callbacks.size() - 1; size >= 0; size--) {
                        if (callbacks.get(size) == subscriptionCallback) {
                            if (isConnected()) {
                                this.mServiceBinderWrapper.removeSubscription(str, subscriptionCallback.mToken, this.mCallbacksMessenger);
                            }
                            callbacks.remove(size);
                            optionsList.remove(size);
                        }
                    }
                }
                if (subscription.isEmpty() || subscriptionCallback == null) {
                    this.mSubscriptions.remove(str);
                }
            }
        }
    }

    public interface MediaBrowserServiceCallbackImpl {
        void onConnectionFailed(Messenger messenger);

        void onLoadChildren(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    public static abstract class SearchCallback {
        public void onError(String str, Bundle bundle) {
        }

        public void onSearchResult(String str, Bundle bundle, List<MediaItem> list) {
        }
    }

    public static class SearchResultReceiver extends ResultReceiver {
        private final SearchCallback mCallback;
        private final Bundle mExtras;
        private final String mQuery;

        public SearchResultReceiver(String str, Bundle bundle, SearchCallback searchCallback, Handler handler) {
            super(handler);
            this.mQuery = str;
            this.mExtras = bundle;
            this.mCallback = searchCallback;
        }

        public void onReceiveResult(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.unparcelWithClassLoader(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.mCallback.onError(this.mQuery, this.mExtras);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            if (parcelableArray != null) {
                ArrayList arrayList = new ArrayList(parcelableArray.length);
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
                this.mCallback.onSearchResult(this.mQuery, this.mExtras, arrayList);
                return;
            }
            this.mCallback.onError(this.mQuery, this.mExtras);
        }
    }

    public static class ServiceBinderWrapper {
        private Messenger mMessenger;
        private Bundle mRootHints;

        public ServiceBinderWrapper(IBinder iBinder, Bundle bundle) {
            this.mMessenger = new Messenger(iBinder);
            this.mRootHints = bundle;
        }

        private void sendRequest(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.mMessenger.send(obtain);
        }

        public void addSubscription(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putBinder("data_callback_token", iBinder);
            bundle2.putBundle("data_options", bundle);
            sendRequest(3, bundle2, messenger);
        }

        public void connect(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.mRootHints);
            sendRequest(1, bundle, messenger);
        }

        public void disconnect(Messenger messenger) throws RemoteException {
            sendRequest(2, (Bundle) null, messenger);
        }

        public void getMediaItem(String str, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_media_item_id", str);
            bundle.putParcelable("data_result_receiver", resultReceiver);
            sendRequest(5, bundle, messenger);
        }

        public void registerCallbackMessenger(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.mRootHints);
            sendRequest(6, bundle, messenger);
        }

        public void removeSubscription(String str, IBinder iBinder, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_media_item_id", str);
            bundle.putBinder("data_callback_token", iBinder);
            sendRequest(4, bundle, messenger);
        }

        public void search(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_search_query", str);
            bundle2.putBundle("data_search_extras", bundle);
            bundle2.putParcelable("data_result_receiver", resultReceiver);
            sendRequest(8, bundle2, messenger);
        }

        public void sendCustomAction(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_custom_action", str);
            bundle2.putBundle("data_custom_action_extras", bundle);
            bundle2.putParcelable("data_result_receiver", resultReceiver);
            sendRequest(9, bundle2, messenger);
        }

        public void unregisterCallbackMessenger(Messenger messenger) throws RemoteException {
            sendRequest(7, (Bundle) null, messenger);
        }
    }

    public static class Subscription {
        private final List<SubscriptionCallback> mCallbacks = new ArrayList();
        private final List<Bundle> mOptionsList = new ArrayList();

        public SubscriptionCallback getCallback(Bundle bundle) {
            for (int i = 0; i < this.mOptionsList.size(); i++) {
                if (f6e.e(this.mOptionsList.get(i), bundle)) {
                    return this.mCallbacks.get(i);
                }
            }
            return null;
        }

        public List<SubscriptionCallback> getCallbacks() {
            return this.mCallbacks;
        }

        public List<Bundle> getOptionsList() {
            return this.mOptionsList;
        }

        public boolean isEmpty() {
            return this.mCallbacks.isEmpty();
        }

        public void putCallback(Bundle bundle, SubscriptionCallback subscriptionCallback) {
            for (int i = 0; i < this.mOptionsList.size(); i++) {
                if (f6e.e(this.mOptionsList.get(i), bundle)) {
                    this.mCallbacks.set(i, subscriptionCallback);
                    return;
                }
            }
            this.mCallbacks.add(subscriptionCallback);
            this.mOptionsList.add(bundle);
        }
    }

    public static abstract class SubscriptionCallback {
        final MediaBrowser.SubscriptionCallback mSubscriptionCallbackFwk = new SubscriptionCallbackApi26();
        WeakReference<Subscription> mSubscriptionRef;
        final IBinder mToken = new Binder();

        public class SubscriptionCallbackApi21 extends MediaBrowser.SubscriptionCallback {
            public SubscriptionCallbackApi21() {
            }

            public List<MediaItem> applyOptions(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
                int i2 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int i4 = i3 + i2;
                if (i < 0 || i2 < 1 || i3 >= list.size()) {
                    return Collections.emptyList();
                }
                if (i4 > list.size()) {
                    i4 = list.size();
                }
                return list.subList(i3, i4);
            }

            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                WeakReference<Subscription> weakReference = SubscriptionCallback.this.mSubscriptionRef;
                Subscription subscription = weakReference == null ? null : weakReference.get();
                if (subscription == null) {
                    SubscriptionCallback.this.onChildrenLoaded(str, MediaItem.fromMediaItemList(list));
                    return;
                }
                List<MediaItem> fromMediaItemList = MediaItem.fromMediaItemList(list);
                List<SubscriptionCallback> callbacks = subscription.getCallbacks();
                List<Bundle> optionsList = subscription.getOptionsList();
                for (int i = 0; i < callbacks.size(); i++) {
                    Bundle bundle = optionsList.get(i);
                    if (bundle == null) {
                        SubscriptionCallback.this.onChildrenLoaded(str, fromMediaItemList);
                    } else {
                        SubscriptionCallback.this.onChildrenLoaded(str, applyOptions(fromMediaItemList, bundle), bundle);
                    }
                }
            }

            public void onError(String str) {
                SubscriptionCallback.this.onError(str);
            }
        }

        public class SubscriptionCallbackApi26 extends SubscriptionCallbackApi21 {
            public SubscriptionCallbackApi26() {
                super();
            }

            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                SubscriptionCallback.this.onChildrenLoaded(str, MediaItem.fromMediaItemList(list), bundle);
            }

            public void onError(String str, Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                SubscriptionCallback.this.onError(str, bundle);
            }
        }

        public void onChildrenLoaded(String str, List<MediaItem> list) {
        }

        public void onError(String str) {
        }

        public void setSubscription(Subscription subscription) {
            this.mSubscriptionRef = new WeakReference<>(subscription);
        }

        public void onChildrenLoaded(String str, List<MediaItem> list, Bundle bundle) {
        }

        public void onError(String str, Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
        this.mImpl = new MediaBrowserImplApi26(context, componentName, connectionCallback, bundle);
    }

    public void connect() {
        this.mImpl.connect();
    }

    public void disconnect() {
        this.mImpl.disconnect();
    }

    public Bundle getExtras() {
        return this.mImpl.getExtras();
    }

    public void getItem(String str, ItemCallback itemCallback) {
        this.mImpl.getItem(str, itemCallback);
    }

    public Bundle getNotifyChildrenChangedOptions() {
        return this.mImpl.getNotifyChildrenChangedOptions();
    }

    public String getRoot() {
        return this.mImpl.getRoot();
    }

    public ComponentName getServiceComponent() {
        return this.mImpl.getServiceComponent();
    }

    public MediaSessionCompat.Token getSessionToken() {
        return this.mImpl.getSessionToken();
    }

    public boolean isConnected() {
        return this.mImpl.isConnected();
    }

    public void search(String str, Bundle bundle, SearchCallback searchCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("query cannot be empty");
        } else if (searchCallback != null) {
            this.mImpl.search(str, bundle, searchCallback);
        } else {
            throw new IllegalArgumentException("callback cannot be null");
        }
    }

    public void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback) {
        if (!TextUtils.isEmpty(str)) {
            this.mImpl.sendCustomAction(str, bundle, customActionCallback);
            return;
        }
        throw new IllegalArgumentException("action cannot be empty");
    }

    public void subscribe(String str, SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (subscriptionCallback != null) {
            this.mImpl.subscribe(str, (Bundle) null, subscriptionCallback);
        } else {
            throw new IllegalArgumentException("callback is null");
        }
    }

    public void unsubscribe(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mImpl.unsubscribe(str, (SubscriptionCallback) null);
            return;
        }
        throw new IllegalArgumentException("parentId is empty");
    }

    public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (subscriptionCallback != null) {
            this.mImpl.unsubscribe(str, subscriptionCallback);
        } else {
            throw new IllegalArgumentException("callback is null");
        }
    }

    public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (subscriptionCallback == null) {
            throw new IllegalArgumentException("callback is null");
        } else if (bundle != null) {
            this.mImpl.subscribe(str, bundle, subscriptionCallback);
        } else {
            throw new IllegalArgumentException("options are null");
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() {
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;
        private final MediaDescriptionCompat mDescription;
        private final int mFlags;

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.getMediaId())) {
                this.mFlags = i;
                this.mDescription = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        public static MediaItem fromMediaItem(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
            return new MediaItem(MediaDescriptionCompat.fromMediaDescription(Api21Impl.getDescription(mediaItem)), Api21Impl.getFlags(mediaItem));
        }

        public static List<MediaItem> fromMediaItemList(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object fromMediaItem : list) {
                arrayList.add(fromMediaItem(fromMediaItem));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public MediaDescriptionCompat getDescription() {
            return this.mDescription;
        }

        public int getFlags() {
            return this.mFlags;
        }

        public String getMediaId() {
            return this.mDescription.getMediaId();
        }

        public boolean isBrowsable() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isPlayable() {
            return (this.mFlags & 2) != 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.mFlags + ", mDescription=" + this.mDescription + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mFlags);
            this.mDescription.writeToParcel(parcel, i);
        }

        public MediaItem(Parcel parcel) {
            this.mFlags = parcel.readInt();
            this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
