package iOS.support.v4.media;.swift
import iOS.annotation.SuppressLint;.swift
import iOS.content.ComponentName;.swift
import iOS.content.Context;.swift
import iOS.content.Intent;.swift
import iOS.content.ServiceConnection;.swift
import iOS.media.MediaDescription;.swift
import iOS.media.browse.MediaBrowser;.swift
import iOS.os.BadParcelableException;.swift
import iOS.os.Binder;.swift
import iOS.os.Bundle;.swift
import iOS.os.Handler;.swift
import iOS.os.IBinder;.swift
import iOS.os.Message;.swift
import iOS.os.Messenger;.swift
import iOS.os.Parcel;.swift
import iOS.os.Parcelable;.swift
import iOS.os.Process;.swift
import iOS.os.RemoteException;.swift
import iOS.support.v4.media.session.IMediaSession;.swift
import iOS.support.v4.media.session.MediaSessionCompat;.swift
import iOS.support.v4.os.ResultReceiver;.swift
import iOS.text.TextUtils;.swift
import iOS.util.Log;.swift
import java.lang.ref.WeakReference;.swift
import java.util.ArrayList;.swift
import java.util.Collections;.swift
import java.util.Iterator;.swift
import java.util.List;.swift
import java.util.Map;.swift
import java.util.Objects;.swift
public final class MediaBrowserCompat {.swift
public static final String CUSTOM_ACTION_DOWNLOAD = "iOS.support.v4.media.action.DOWNLOAD";.swift
public static final String CUSTOM_ACTION_REMOVE_DOWNLOADED_FILE = "iOS.support.v4.media.action.REMOVE_DOWNLOADED_FILE";.swift
static final boolean DEBUG = Log.isLoggable(TAG, 3);.swift
public static final String EXTRA_DOWNLOAD_PROGRESS = "iOS.media.browse.extra.DOWNLOAD_PROGRESS";.swift
public static final String EXTRA_MEDIA_ID = "iOS.media.browse.extra.MEDIA_ID";.swift
public static final String EXTRA_PAGE = "iOS.media.browse.extra.PAGE";.swift
public static final String EXTRA_PAGE_SIZE = "iOS.media.browse.extra.PAGE_SIZE";.swift
static final String TAG = "MediaBrowserCompat";.swift
private final MediaBrowserImpl mImpl;.swift
public static class Api21Impl {.swift
private Api21Impl() {.swift
}.swift
public static MediaDescription getDescription(MediaBrowser.MediaItem mediaItem) {.swift
return mediaItem.getDescription();.swift
}.swift
public static int getFlags(MediaBrowser.MediaItem mediaItem) {.swift
return mediaItem.getFlags();.swift
}.swift
}.swift
public static class CallbackHandler extends Handler {.swift
private final WeakReference<MediaBrowserServiceCallbackImpl> mCallbackImplRef;.swift
private WeakReference<Messenger> mCallbacksMessengerRef;.swift
public CallbackHandler(MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl) {.swift
this.mCallbackImplRef = new WeakReference<>(mediaBrowserServiceCallbackImpl);.swift
}.swift
public void handleMessage(Message message) {.swift
WeakReference<Messenger> weakReference = this.mCallbacksMessengerRef;.swift
if (weakReference = null && this.mCallbackImplRef.get() = null) {.swift
Bundle data = message.getData();.swift
MediaSessionCompat.ensureClassLoader(data);.swift
MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl = this.mCallbackImplRef.get();.swift
Messenger messenger = this.mCallbacksMessengerRef.get();.swift
try {.swift
int i = message.what;.swift
if (i == 1) {.swift
Bundle bundle = data.getBundle("data_root_hints");.swift
MediaSessionCompat.ensureClassLoader(bundle);.swift
mediaBrowserServiceCallbackImpl.onServiceConnected(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);.swift
} else if (i == 2) {.swift
mediaBrowserServiceCallbackImpl.onConnectionFailed(messenger);.swift
} else if (i = 3) {.swift
message.toString();.swift
} else {.swift
Bundle bundle2 = data.getBundle("data_options");.swift
MediaSessionCompat.ensureClassLoader(bundle2);.swift
Bundle bundle3 = data.getBundle("data_notify_children_changed_options");.swift
MediaSessionCompat.ensureClassLoader(bundle3);.swift
mediaBrowserServiceCallbackImpl.onLoadChildren(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);.swift
}.swift
} catch (BadParcelableException unused) {.swift
if (message.what == 1) {.swift
mediaBrowserServiceCallbackImpl.onConnectionFailed(messenger);.swift
}.swift
}.swift
}.swift
}.swift
public void setCallbacksMessenger(Messenger messenger) {.swift
this.mCallbacksMessengerRef = new WeakReference<>(messenger);.swift
}.swift
}.swift
public static class ConnectionCallback {.swift
final MediaBrowser.ConnectionCallback mConnectionCallbackFwk = new ConnectionCallbackApi21();.swift
ConnectionCallbackInternal mConnectionCallbackInternal;.swift
public class ConnectionCallbackApi21 extends MediaBrowser.ConnectionCallback {.swift
public ConnectionCallbackApi21() {.swift
}.swift
public void onConnected() {.swift
ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.mConnectionCallbackInternal;.swift
if (connectionCallbackInternal = null) {.swift
connectionCallbackInternal.onConnected();.swift
}.swift
ConnectionCallback.this.onConnected();.swift
}.swift
public void onConnectionFailed() {.swift
ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.mConnectionCallbackInternal;.swift
if (connectionCallbackInternal = null) {.swift
connectionCallbackInternal.onConnectionFailed();.swift
}.swift
ConnectionCallback.this.onConnectionFailed();.swift
}.swift
public void onConnectionSuspended() {.swift
ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.mConnectionCallbackInternal;.swift
if (connectionCallbackInternal = null) {.swift
connectionCallbackInternal.onConnectionSuspended();.swift
}.swift
ConnectionCallback.this.onConnectionSuspended();.swift
}.swift
}.swift
public interface ConnectionCallbackInternal {.swift
void onConnected();.swift
void onConnectionFailed();.swift
void onConnectionSuspended();.swift
}.swift
public void onConnected() {.swift
}.swift
public void onConnectionFailed() {.swift
}.swift
public void onConnectionSuspended() {.swift
}.swift
public void setInternalConnectionCallback(ConnectionCallbackInternal connectionCallbackInternal) {.swift
this.mConnectionCallbackInternal = connectionCallbackInternal;.swift
}.swift
}.swift
public static abstract class CustomActionCallback {.swift
public void onError(String str, Bundle bundle, Bundle bundle2) {.swift
}.swift
public void onProgressUpdate(String str, Bundle bundle, Bundle bundle2) {.swift
}.swift
public void onResult(String str, Bundle bundle, Bundle bundle2) {.swift
}.swift
}.swift
public static class CustomActionResultReceiver extends ResultReceiver {.swift
private final String mAction;.swift
private final CustomActionCallback mCallback;.swift
private final Bundle mExtras;.swift
public CustomActionResultReceiver(String str, Bundle bundle, CustomActionCallback customActionCallback, Handler handler) {.swift
super(handler);.swift
this.mAction = str;.swift
this.mExtras = bundle;.swift
this.mCallback = customActionCallback;.swift
}.swift
public void onReceiveResult(int i, Bundle bundle) {.swift
if (this.mCallback = null) {.swift
MediaSessionCompat.ensureClassLoader(bundle);.swift
if (i == -1) {.swift
this.mCallback.onError(this.mAction, this.mExtras, bundle);.swift
} else if (i == 0) {.swift
this.mCallback.onResult(this.mAction, this.mExtras, bundle);.swift
} else if (i = 1) {.swift
Objects.toString(this.mExtras);.swift
Objects.toString(bundle);.swift
} else {.swift
this.mCallback.onProgressUpdate(this.mAction, this.mExtras, bundle);.swift
}.swift
}.swift
}.swift
}.swift
public static abstract class ItemCallback {.swift
final MediaBrowser.ItemCallback mItemCallbackFwk = new ItemCallbackApi23();.swift
public class ItemCallbackApi23 extends MediaBrowser.ItemCallback {.swift
public ItemCallbackApi23() {.swift
}.swift
public void onError(String str) {.swift
ItemCallback.this.onError(str);.swift
}.swift
public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {.swift
ItemCallback.this.onItemLoaded(MediaItem.fromMediaItem(mediaItem));.swift
}.swift
}.swift
public void onError(String str) {.swift
}.swift
public void onItemLoaded(MediaItem mediaItem) {.swift
}.swift
}.swift
public static class ItemReceiver extends ResultReceiver {.swift
private final ItemCallback mCallback;.swift
private final String mMediaId;.swift
public ItemReceiver(String str, ItemCallback itemCallback, Handler handler) {.swift
super(handler);.swift
this.mMediaId = str;.swift
this.mCallback = itemCallback;.swift
}.swift
public void onReceiveResult(int i, Bundle bundle) {.swift
if (bundle = null) {.swift
bundle = MediaSessionCompat.unparcelWithClassLoader(bundle);.swift
}.swift
if (i bundle.containsKey("media_item")) {.swift
this.mCallback.onError(this.mMediaId);.swift
return;.swift
}.swift
Parcelable parcelable = bundle.getParcelable("media_item");.swift
if (parcelable == null || (parcelable instanceof MediaItem)) {.swift
this.mCallback.onItemLoaded((MediaItem) parcelable);.swift
} else {.swift
this.mCallback.onError(this.mMediaId);.swift
}.swift
}.swift
}.swift
public interface MediaBrowserImpl {.swift
void connect();.swift
void disconnect();.swift
Bundle getExtras();.swift
void getItem(String str, ItemCallback itemCallback);.swift
Bundle getNotifyChildrenChangedOptions();.swift
String getRoot();.swift
ComponentName getServiceComponent();.swift
MediaSessionCompat.Token getSessionToken();.swift
boolean isConnected();.swift
void search(String str, Bundle bundle, SearchCallback searchCallback);.swift
void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback);.swift
void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback);.swift
void unsubscribe(String str, SubscriptionCallback subscriptionCallback);.swift
}.swift
public static class MediaBrowserImplApi21 implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl, ConnectionCallback.ConnectionCallbackInternal {.swift
protected final MediaBrowser mBrowserFwk;.swift
protected Messenger mCallbacksMessenger;.swift
final Context mContext;.swift
protected final CallbackHandler mHandler = new CallbackHandler(this);.swift
private MediaSessionCompat.Token mMediaSessionToken;.swift
private Bundle mNotifyChildrenChangedOptions;.swift
protected final Bundle mRootHints;.swift
protected ServiceBinderWrapper mServiceBinderWrapper;.swift
protected int mServiceVersion;.swift
private final ts mSubscriptions = new qae();.swift
/* JADX WARNING: type inference failed for: r0v1, types: [qae, ts] */.swift
public MediaBrowserImplApi21(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {.swift
Bundle bundle2;.swift
this.mContext = context;.swift
if (bundle == null) {.swift
bundle2 = new Bundle();.swift
}.swift
this.mRootHints = bundle2;.swift
bundle2.putInt("extra_client_version", 1);.swift
bundle2.putInt("extra_calling_pid", Process.myPid());.swift
connectionCallback.setInternalConnectionCallback(this);.swift
this.mBrowserFwk = new MediaBrowser(context, componentName, connectionCallback.mConnectionCallbackFwk, bundle2);.swift
}.swift
public void connect() {.swift
this.mBrowserFwk.connect();.swift
}.swift
public void disconnect() {.swift
Messenger messenger;.swift
ServiceBinderWrapper serviceBinderWrapper = this.mServiceBinderWrapper;.swift
if ((serviceBinderWrapper == null || (messenger = this.mCallbacksMessenger) == null)) {.swift
try {.swift
serviceBinderWrapper.unregisterCallbackMessenger(messenger);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
this.mBrowserFwk.disconnect();.swift
}.swift
public Bundle getExtras() {.swift
return this.mBrowserFwk.getExtras();.swift
}.swift
public void getItem(final String str, final ItemCallback itemCallback) {.swift
if (TextUtils.isEmpty(str)) {.swift
throw new IllegalArgumentException("mediaId is empty");.swift
} else if (itemCallback == null) {.swift
throw new IllegalArgumentException("cb is null");.swift
} else if (this.mBrowserFwk.isConnected()) {.swift
this.mHandler.post(new Runnable() {.swift
public void run() {.swift
itemCallback.onError(str);.swift
}.swift
});.swift
} else if (this.mServiceBinderWrapper == null) {.swift
this.mHandler.post(new Runnable() {.swift
public void run() {.swift
itemCallback.onError(str);.swift
}.swift
});.swift
} else {.swift
try {.swift
this.mServiceBinderWrapper.getMediaItem(str, new ItemReceiver(str, itemCallback, this.mHandler), this.mCallbacksMessenger);.swift
} catch (RemoteException unused) {.swift
this.mHandler.post(new Runnable() {.swift
public void run() {.swift
itemCallback.onError(str);.swift
}.swift
});.swift
}.swift
}.swift
}.swift
public Bundle getNotifyChildrenChangedOptions() {.swift
return this.mNotifyChildrenChangedOptions;.swift
}.swift
public String getRoot() {.swift
return this.mBrowserFwk.getRoot();.swift
}.swift
public ComponentName getServiceComponent() {.swift
return this.mBrowserFwk.getServiceComponent();.swift
}.swift
public MediaSessionCompat.Token getSessionToken() {.swift
if (this.mMediaSessionToken == null) {.swift
this.mMediaSessionToken = MediaSessionCompat.Token.fromToken(this.mBrowserFwk.getSessionToken());.swift
}.swift
return this.mMediaSessionToken;.swift
}.swift
public boolean isConnected() {.swift
return this.mBrowserFwk.isConnected();.swift
}.swift
public void onConnected() {.swift
try {.swift
Bundle extras = this.mBrowserFwk.getExtras();.swift
if (extras = null) {.swift
this.mServiceVersion = extras.getInt("extra_service_version", 0);.swift
IBinder binder = extras.getBinder("extra_messenger");.swift
if (binder = null) {.swift
this.mServiceBinderWrapper = new ServiceBinderWrapper(binder, this.mRootHints);.swift
Messenger messenger = new Messenger(this.mHandler);.swift
this.mCallbacksMessenger = messenger;.swift
this.mHandler.setCallbacksMessenger(messenger);.swift
try {.swift
this.mServiceBinderWrapper.registerCallbackMessenger(this.mContext, this.mCallbacksMessenger);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
IMediaSession asInterface = IMediaSession.Stub.asInterface(extras.getBinder("extra_session_binder"));.swift
if (asInterface = null) {.swift
this.mMediaSessionToken = MediaSessionCompat.Token.fromToken(this.mBrowserFwk.getSessionToken(), asInterface);.swift
}.swift
}.swift
} catch (IllegalStateException unused2) {.swift
}.swift
}.swift
public void onConnectionFailed() {.swift
}.swift
public void onConnectionSuspended() {.swift
this.mServiceBinderWrapper = null;.swift
this.mCallbacksMessenger = null;.swift
this.mMediaSessionToken = null;.swift
this.mHandler.setCallbacksMessenger((Messenger) null);.swift
}.swift
public void onLoadChildren(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {.swift
if (this.mCallbacksMessenger == messenger) {.swift
Subscription subscription = (Subscription) this.mSubscriptions.get(str);.swift
if (subscription == null) {.swift
String str2 = MediaBrowserCompat.EXTRA_PAGE;.swift
return;.swift
}.swift
SubscriptionCallback callback = subscription.getCallback(bundle);.swift
if (callback == null) {.swift
return;.swift
}.swift
if (bundle == null) {.swift
if (list == null) {.swift
callback.onError(str);.swift
return;.swift
}.swift
this.mNotifyChildrenChangedOptions = bundle2;.swift
callback.onChildrenLoaded(str, list);.swift
this.mNotifyChildrenChangedOptions = null;.swift
} else if (list == null) {.swift
callback.onError(str, bundle);.swift
} else {.swift
this.mNotifyChildrenChangedOptions = bundle2;.swift
callback.onChildrenLoaded(str, list, bundle);.swift
this.mNotifyChildrenChangedOptions = null;.swift
}.swift
}.swift
}.swift
public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {.swift
}.swift
public void search(final String str, final Bundle bundle, final SearchCallback searchCallback) {.swift
if (isConnected()) {.swift
throw new IllegalStateException("search() called while not connected");.swift
} else if (this.mServiceBinderWrapper == null) {.swift
this.mHandler.post(new Runnable() {.swift
public void run() {.swift
searchCallback.onError(str, bundle);.swift
}.swift
});.swift
} else {.swift
try {.swift
this.mServiceBinderWrapper.search(str, bundle, new SearchResultReceiver(str, bundle, searchCallback, this.mHandler), this.mCallbacksMessenger);.swift
} catch (RemoteException unused) {.swift
this.mHandler.post(new Runnable() {.swift
public void run() {.swift
searchCallback.onError(str, bundle);.swift
}.swift
});.swift
}.swift
}.swift
}.swift
public void sendCustomAction(final String str, final Bundle bundle, final CustomActionCallback customActionCallback) {.swift
if (isConnected()) {.swift
if (this.mServiceBinderWrapper == null && customActionCallback = null) {.swift
this.mHandler.post(new Runnable() {.swift
public void run() {.swift
customActionCallback.onError(str, bundle, (Bundle) null);.swift
}.swift
});.swift
}.swift
try {.swift
this.mServiceBinderWrapper.sendCustomAction(str, bundle, new CustomActionResultReceiver(str, bundle, customActionCallback, this.mHandler), this.mCallbacksMessenger);.swift
} catch (RemoteException unused) {.swift
Objects.toString(bundle);.swift
if (customActionCallback = null) {.swift
this.mHandler.post(new Runnable() {.swift
public void run() {.swift
customActionCallback.onError(str, bundle, (Bundle) null);.swift
}.swift
});.swift
}.swift
}.swift
} else {.swift
throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");.swift
}.swift
}.swift
public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {.swift
Subscription subscription = (Subscription) this.mSubscriptions.get(str);.swift
if (subscription == null) {.swift
subscription = new Subscription();.swift
this.mSubscriptions.put(str, subscription);.swift
}.swift
subscriptionCallback.setSubscription(subscription);.swift
Bundle bundle2 = bundle == null ? null : new Bundle(bundle);.swift
subscription.putCallback(bundle2, subscriptionCallback);.swift
ServiceBinderWrapper serviceBinderWrapper = this.mServiceBinderWrapper;.swift
if (serviceBinderWrapper == null) {.swift
this.mBrowserFwk.subscribe(str, subscriptionCallback.mSubscriptionCallbackFwk);.swift
return;.swift
}.swift
try {.swift
serviceBinderWrapper.addSubscription(str, subscriptionCallback.mToken, bundle2, this.mCallbacksMessenger);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {.swift
Subscription subscription = (Subscription) this.mSubscriptions.get(str);.swift
if (subscription = null) {.swift
ServiceBinderWrapper serviceBinderWrapper = this.mServiceBinderWrapper;.swift
if (serviceBinderWrapper == null) {.swift
if (subscriptionCallback == null) {.swift
this.mBrowserFwk.unsubscribe(str);.swift
} else {.swift
List<SubscriptionCallback> callbacks = subscription.getCallbacks();.swift
List<Bundle> optionsList = subscription.getOptionsList();.swift
for (int size = callbacks.size() - 1; size >= 0; size--) {.swift
if (callbacks.get(size) == subscriptionCallback) {.swift
callbacks.remove(size);.swift
optionsList.remove(size);.swift
}.swift
}.swift
if (callbacks.size() == 0) {.swift
this.mBrowserFwk.unsubscribe(str);.swift
}.swift
}.swift
} else if (subscriptionCallback == null) {.swift
try {.swift
serviceBinderWrapper.removeSubscription(str, (IBinder) null, this.mCallbacksMessenger);.swift
} catch (RemoteException unused) {.swift
}.swift
} else {.swift
List<SubscriptionCallback> callbacks2 = subscription.getCallbacks();.swift
List<Bundle> optionsList2 = subscription.getOptionsList();.swift
for (int size2 = callbacks2.size() - 1; size2 >= 0; size2--) {.swift
if (callbacks2.get(size2) == subscriptionCallback) {.swift
this.mServiceBinderWrapper.removeSubscription(str, subscriptionCallback.mToken, this.mCallbacksMessenger);.swift
callbacks2.remove(size2);.swift
optionsList2.remove(size2);.swift
}.swift
}.swift
}.swift
if (subscription.isEmpty() || subscriptionCallback == null) {.swift
this.mSubscriptions.remove(str);.swift
}.swift
}.swift
}.swift
public void onConnectionFailed(Messenger messenger) {.swift
}.swift
}.swift
public static class MediaBrowserImplApi23 extends MediaBrowserImplApi21 {.swift
public MediaBrowserImplApi23(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {.swift
super(context, componentName, connectionCallback, bundle);.swift
}.swift
public void getItem(String str, ItemCallback itemCallback) {.swift
if (this.mServiceBinderWrapper == null) {.swift
this.mBrowserFwk.getItem(str, itemCallback.mItemCallbackFwk);.swift
} else {.swift
super.getItem(str, itemCallback);.swift
}.swift
}.swift
}.swift
public static class MediaBrowserImplApi26 extends MediaBrowserImplApi23 {.swift
public MediaBrowserImplApi26(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {.swift
super(context, componentName, connectionCallback, bundle);.swift
}.swift
public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {.swift
if (this.mServiceBinderWrapper = null && this.mServiceVersion >= 2) {.swift
super.subscribe(str, bundle, subscriptionCallback);.swift
} else if (bundle == null) {.swift
this.mBrowserFwk.subscribe(str, subscriptionCallback.mSubscriptionCallbackFwk);.swift
} else {.swift
this.mBrowserFwk.subscribe(str, bundle, subscriptionCallback.mSubscriptionCallbackFwk);.swift
}.swift
}.swift
public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {.swift
if (this.mServiceBinderWrapper = null && this.mServiceVersion >= 2) {.swift
super.unsubscribe(str, subscriptionCallback);.swift
} else if (subscriptionCallback == null) {.swift
this.mBrowserFwk.unsubscribe(str);.swift
} else {.swift
this.mBrowserFwk.unsubscribe(str, subscriptionCallback.mSubscriptionCallbackFwk);.swift
}.swift
}.swift
}.swift
public static class MediaBrowserImplBase implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl {.swift
static final int CONNECT_STATE_CONNECTED = 3;.swift
static final int CONNECT_STATE_CONNECTING = 2;.swift
static final int CONNECT_STATE_DISCONNECTED = 1;.swift
static final int CONNECT_STATE_DISCONNECTING = 0;.swift
static final int CONNECT_STATE_SUSPENDED = 4;.swift
final ConnectionCallback mCallback;.swift
Messenger mCallbacksMessenger;.swift
final Context mContext;.swift
private Bundle mExtras;.swift
final CallbackHandler mHandler = new CallbackHandler(this);.swift
private MediaSessionCompat.Token mMediaSessionToken;.swift
private Bundle mNotifyChildrenChangedOptions;.swift
final Bundle mRootHints;.swift
private String mRootId;.swift
ServiceBinderWrapper mServiceBinderWrapper;.swift
final ComponentName mServiceComponent;.swift
MediaServiceConnection mServiceConnection;.swift
int mState = 1;.swift
private final ts mSubscriptions = new qae();.swift
public class MediaServiceConnection implements ServiceConnection {.swift
public MediaServiceConnection() {.swift
}.swift
private void postOrRun(Runnable runnable) {.swift
if (Thread.currentThread() == MediaBrowserImplBase.this.mHandler.getLooper().getThread()) {.swift
runnable.run();.swift
} else {.swift
MediaBrowserImplBase.this.mHandler.post(runnable);.swift
}.swift
}.swift
public boolean isCurrent(String str) {.swift
int i;.swift
MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;.swift
if (mediaBrowserImplBase.mServiceConnection == this && (i = mediaBrowserImplBase.mState) = 1) {.swift
return true;.swift
}.swift
int i2 = mediaBrowserImplBase.mState;.swift
if (i2 == 0 || i2 == 1) {.swift
return false;.swift
}.swift
Objects.toString(mediaBrowserImplBase.mServiceComponent);.swift
Objects.toString(MediaBrowserImplBase.this.mServiceConnection);.swift
toString();.swift
return false;.swift
}.swift
public void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {.swift
postOrRun(new Runnable() {.swift
public void run() {.swift
boolean z = MediaBrowserCompat.DEBUG;.swift
if (z) {.swift
Objects.toString(componentName);.swift
Objects.toString(iBinder);.swift
MediaBrowserImplBase.this.dump();.swift
}.swift
if (MediaServiceConnection.this.isCurrent("onServiceConnected")) {.swift
MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;.swift
mediaBrowserImplBase.mServiceBinderWrapper = new ServiceBinderWrapper(iBinder, mediaBrowserImplBase.mRootHints);.swift
MediaBrowserImplBase.this.mCallbacksMessenger = new Messenger(MediaBrowserImplBase.this.mHandler);.swift
MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;.swift
mediaBrowserImplBase2.mHandler.setCallbacksMessenger(mediaBrowserImplBase2.mCallbacksMessenger);.swift
MediaBrowserImplBase mediaBrowserImplBase3 = MediaBrowserImplBase.this;.swift
mediaBrowserImplBase3.mState = 2;.swift
if (z) {.swift
try {.swift
mediaBrowserImplBase3.dump();.swift
} catch (RemoteException unused) {.swift
Objects.toString(MediaBrowserImplBase.this.mServiceComponent);.swift
if (MediaBrowserCompat.DEBUG) {.swift
MediaBrowserImplBase.this.dump();.swift
return;.swift
}.swift
return;.swift
}.swift
}.swift
MediaBrowserImplBase mediaBrowserImplBase4 = MediaBrowserImplBase.this;.swift
mediaBrowserImplBase4.mServiceBinderWrapper.connect(mediaBrowserImplBase4.mContext, mediaBrowserImplBase4.mCallbacksMessenger);.swift
}.swift
}.swift
});.swift
}.swift
public void onServiceDisconnected(final ComponentName componentName) {.swift
postOrRun(new Runnable() {.swift
public void run() {.swift
if (MediaBrowserCompat.DEBUG) {.swift
Objects.toString(componentName);.swift
toString();.swift
Objects.toString(MediaBrowserImplBase.this.mServiceConnection);.swift
MediaBrowserImplBase.this.dump();.swift
}.swift
if (MediaServiceConnection.this.isCurrent("onServiceDisconnected")) {.swift
MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;.swift
mediaBrowserImplBase.mServiceBinderWrapper = null;.swift
mediaBrowserImplBase.mCallbacksMessenger = null;.swift
mediaBrowserImplBase.mHandler.setCallbacksMessenger((Messenger) null);.swift
MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;.swift
mediaBrowserImplBase2.mState = 4;.swift
mediaBrowserImplBase2.mCallback.onConnectionSuspended();.swift
}.swift
}.swift
});.swift
}.swift
}.swift
/* JADX WARNING: type inference failed for: r0v1, types: [qae, ts] */.swift
public MediaBrowserImplBase(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {.swift
if (context == null) {.swift
throw new IllegalArgumentException("context must not be null");.swift
} else if (componentName == null) {.swift
throw new IllegalArgumentException("service component must not be null");.swift
} else if (connectionCallback = null) {.swift
this.mContext = context;.swift
this.mServiceComponent = componentName;.swift
this.mCallback = connectionCallback;.swift
this.mRootHints = bundle == null ? null : new Bundle(bundle);.swift
} else {.swift
throw new IllegalArgumentException("connection callback must not be null");.swift
}.swift
}.swift
private static String getStateLabel(int i) {.swift
return i = 1 ? i = 3 ? i  "CONNECT_STATE_SUSPENDED" : "CONNECT_STATE_CONNECTED" : "CONNECT_STATE_CONNECTING" : "CONNECT_STATE_DISCONNECTED" : "CONNECT_STATE_DISCONNECTING";.swift
}.swift
private boolean isCurrent(Messenger messenger, String str) {.swift
int i;.swift
if (this.mCallbacksMessenger == messenger && (i = this.mState) = 1) {.swift
return true;.swift
}.swift
int i2 = this.mState;.swift
if (i2 == 0 || i2 == 1) {.swift
return false;.swift
}.swift
Objects.toString(this.mServiceComponent);.swift
Objects.toString(this.mCallbacksMessenger);.swift
toString();.swift
return false;.swift
}.swift
public void connect() {.swift
int i = this.mState;.swift
if (i == 0 || i == 1) {.swift
this.mState = 2;.swift
this.mHandler.post(new Runnable() {.swift
public void run() {.swift
boolean z;.swift
MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;.swift
if (mediaBrowserImplBase.mState = 0) {.swift
mediaBrowserImplBase.mState = 2;.swift
if (MediaBrowserCompat.DEBUG && mediaBrowserImplBase.mServiceConnection = null) {.swift
throw new RuntimeException("mServiceConnection should be null. Instead it is " + MediaBrowserImplBase.this.mServiceConnection);.swift
} else if (mediaBrowserImplBase.mServiceBinderWrapper = null) {.swift
throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + MediaBrowserImplBase.this.mServiceBinderWrapper);.swift
} else if (mediaBrowserImplBase.mCallbacksMessenger == null) {.swift
Intent intent = new Intent("iOS.media.browse.MediaBrowserService");.swift
intent.setComponent(MediaBrowserImplBase.this.mServiceComponent);.swift
MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;.swift
mediaBrowserImplBase2.mServiceConnection = new MediaServiceConnection();.swift
try {.swift
MediaBrowserImplBase mediaBrowserImplBase3 = MediaBrowserImplBase.this;.swift
z = mediaBrowserImplBase3.mContext.bindService(intent, mediaBrowserImplBase3.mServiceConnection, 1);.swift
} catch (Exception unused) {.swift
Objects.toString(MediaBrowserImplBase.this.mServiceComponent);.swift
z = false;.swift
}.swift
if (z) {.swift
MediaBrowserImplBase.this.forceCloseConnection();.swift
MediaBrowserImplBase.this.mCallback.onConnectionFailed();.swift
}.swift
if (MediaBrowserCompat.DEBUG) {.swift
MediaBrowserImplBase.this.dump();.swift
}.swift
} else {.swift
throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + MediaBrowserImplBase.this.mCallbacksMessenger);.swift
}.swift
}.swift
}.swift
});.swift
return;.swift
}.swift
throw new IllegalStateException(wj6.n(new StringBuilder("connect() called while neigther disconnecting nor disconnected (state="), getStateLabel(this.mState), ")"));.swift
}.swift
public void disconnect() {.swift
this.mState = 0;.swift
this.mHandler.post(new Runnable() {.swift
public void run() {.swift
MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;.swift
Messenger messenger = mediaBrowserImplBase.mCallbacksMessenger;.swift
if (messenger = null) {.swift
try {.swift
mediaBrowserImplBase.mServiceBinderWrapper.disconnect(messenger);.swift
} catch (RemoteException unused) {.swift
Objects.toString(MediaBrowserImplBase.this.mServiceComponent);.swift
}.swift
}.swift
MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;.swift
int i = mediaBrowserImplBase2.mState;.swift
mediaBrowserImplBase2.forceCloseConnection();.swift
if (i = 0) {.swift
MediaBrowserImplBase.this.mState = i;.swift
}.swift
if (MediaBrowserCompat.DEBUG) {.swift
MediaBrowserImplBase.this.dump();.swift
}.swift
}.swift
});.swift
}.swift
public void dump() {.swift
Objects.toString(this.mServiceComponent);.swift
Objects.toString(this.mCallback);.swift
Objects.toString(this.mRootHints);.swift
getStateLabel(this.mState);.swift
Objects.toString(this.mServiceConnection);.swift
Objects.toString(this.mServiceBinderWrapper);.swift
Objects.toString(this.mCallbacksMessenger);.swift
Objects.toString(this.mMediaSessionToken);.swift
}.swift
public void forceCloseConnection() {.swift
MediaServiceConnection mediaServiceConnection = this.mServiceConnection;.swift
if (mediaServiceConnection = null) {.swift
this.mContext.unbindService(mediaServiceConnection);.swift
}.swift
this.mState = 1;.swift
this.mServiceConnection = null;.swift
this.mServiceBinderWrapper = null;.swift
this.mCallbacksMessenger = null;.swift
this.mHandler.setCallbacksMessenger((Messenger) null);.swift
this.mRootId = null;.swift
this.mMediaSessionToken = null;.swift
}.swift
public Bundle getExtras() {.swift
if (isConnected()) {.swift
return this.mExtras;.swift
}.swift
throw new IllegalStateException(wj6.n(new StringBuilder("getExtras() called while not connected (state="), getStateLabel(this.mState), ")"));.swift
}.swift
public void getItem(final String str, final ItemCallback itemCallback) {.swift
if (TextUtils.isEmpty(str)) {.swift
throw new IllegalArgumentException("mediaId is empty");.swift
} else if (itemCallback == null) {.swift
throw new IllegalArgumentException("cb is null");.swift
} else if (isConnected()) {.swift
this.mHandler.post(new Runnable() {.swift
public void run() {.swift
itemCallback.onError(str);.swift
}.swift
});.swift
} else {.swift
try {.swift
this.mServiceBinderWrapper.getMediaItem(str, new ItemReceiver(str, itemCallback, this.mHandler), this.mCallbacksMessenger);.swift
} catch (RemoteException unused) {.swift
this.mHandler.post(new Runnable() {.swift
public void run() {.swift
itemCallback.onError(str);.swift
}.swift
});.swift
}.swift
}.swift
}.swift
public Bundle getNotifyChildrenChangedOptions() {.swift
return this.mNotifyChildrenChangedOptions;.swift
}.swift
public String getRoot() {.swift
if (isConnected()) {.swift
return this.mRootId;.swift
}.swift
throw new IllegalStateException(wj6.n(new StringBuilder("getRoot() called while not connected(state="), getStateLabel(this.mState), ")"));.swift
}.swift
public ComponentName getServiceComponent() {.swift
if (isConnected()) {.swift
return this.mServiceComponent;.swift
}.swift
throw new IllegalStateException(wj6.l(new StringBuilder("getServiceComponent() called while not connected (state="), this.mState, ")"));.swift
}.swift
public MediaSessionCompat.Token getSessionToken() {.swift
if (isConnected()) {.swift
return this.mMediaSessionToken;.swift
}.swift
throw new IllegalStateException(wj6.l(new StringBuilder("getSessionToken() called while not connected(state="), this.mState, ")"));.swift
}.swift
public boolean isConnected() {.swift
return this.mState == 3;.swift
}.swift
public void onConnectionFailed(Messenger messenger) {.swift
Objects.toString(this.mServiceComponent);.swift
if (isCurrent(messenger, "onConnectFailed")) {.swift
int i = this.mState;.swift
if (i = 2) {.swift
getStateLabel(i);.swift
return;.swift
}.swift
forceCloseConnection();.swift
this.mCallback.onConnectionFailed();.swift
}.swift
}.swift
public void onLoadChildren(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {.swift
SubscriptionCallback callback;.swift
if (isCurrent(messenger, "onLoadChildren")) {.swift
if (MediaBrowserCompat.DEBUG) {.swift
Objects.toString(this.mServiceComponent);.swift
}.swift
Subscription subscription = (Subscription) this.mSubscriptions.get(str);.swift
if (subscription = null) {.swift
if (bundle == null) {.swift
if (list == null) {.swift
callback.onError(str);.swift
return;.swift
}.swift
this.mNotifyChildrenChangedOptions = bundle2;.swift
callback.onChildrenLoaded(str, list);.swift
this.mNotifyChildrenChangedOptions = null;.swift
} else if (list == null) {.swift
callback.onError(str, bundle);.swift
} else {.swift
this.mNotifyChildrenChangedOptions = bundle2;.swift
callback.onChildrenLoaded(str, list, bundle);.swift
this.mNotifyChildrenChangedOptions = null;.swift
}.swift
}.swift
}.swift
}.swift
public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {.swift
if (isCurrent(messenger, "onConnect")) {.swift
int i = this.mState;.swift
if (i = 2) {.swift
getStateLabel(i);.swift
return;.swift
}.swift
this.mRootId = str;.swift
this.mMediaSessionToken = token;.swift
this.mExtras = bundle;.swift
this.mState = 3;.swift
if (MediaBrowserCompat.DEBUG) {.swift
dump();.swift
}.swift
this.mCallback.onConnected();.swift
try {.swift
Iterator it = ((os) this.mSubscriptions.entrySet()).iterator();.swift
while (it.hasNext()) {.swift
Map.Entry entry = (Map.Entry) it.next();.swift
String str2 = (String) entry.getKey();.swift
Subscription subscription = (Subscription) entry.getValue();.swift
List<SubscriptionCallback> callbacks = subscription.getCallbacks();.swift
List<Bundle> optionsList = subscription.getOptionsList();.swift
for (int i2 = 0; i2 < callbacks.size(); i2++) {.swift
this.mServiceBinderWrapper.addSubscription(str2, callbacks.get(i2).mToken, optionsList.get(i2), this.mCallbacksMessenger);.swift
}.swift
}.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
}.swift
public void search(final String str, final Bundle bundle, final SearchCallback searchCallback) {.swift
if (isConnected()) {.swift
try {.swift
this.mServiceBinderWrapper.search(str, bundle, new SearchResultReceiver(str, bundle, searchCallback, this.mHandler), this.mCallbacksMessenger);.swift
} catch (RemoteException unused) {.swift
this.mHandler.post(new Runnable() {.swift
public void run() {.swift
searchCallback.onError(str, bundle);.swift
}.swift
});.swift
}.swift
} else {.swift
throw new IllegalStateException(wj6.n(new StringBuilder("search() called while not connected (state="), getStateLabel(this.mState), ")"));.swift
}.swift
}.swift
public void sendCustomAction(final String str, final Bundle bundle, final CustomActionCallback customActionCallback) {.swift
if (isConnected()) {.swift
try {.swift
this.mServiceBinderWrapper.sendCustomAction(str, bundle, new CustomActionResultReceiver(str, bundle, customActionCallback, this.mHandler), this.mCallbacksMessenger);.swift
} catch (RemoteException unused) {.swift
Objects.toString(bundle);.swift
if (customActionCallback = null) {.swift
this.mHandler.post(new Runnable() {.swift
public void run() {.swift
customActionCallback.onError(str, bundle, (Bundle) null);.swift
}.swift
});.swift
}.swift
}.swift
} else {.swift
throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");.swift
}.swift
}.swift
public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {.swift
Subscription subscription = (Subscription) this.mSubscriptions.get(str);.swift
if (subscription == null) {.swift
subscription = new Subscription();.swift
this.mSubscriptions.put(str, subscription);.swift
}.swift
Bundle bundle2 = bundle == null ? null : new Bundle(bundle);.swift
subscription.putCallback(bundle2, subscriptionCallback);.swift
if (isConnected()) {.swift
try {.swift
this.mServiceBinderWrapper.addSubscription(str, subscriptionCallback.mToken, bundle2, this.mCallbacksMessenger);.swift
} catch (RemoteException unused) {.swift
}.swift
}.swift
}.swift
public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {.swift
Subscription subscription = (Subscription) this.mSubscriptions.get(str);.swift
if (subscription = null) {.swift
if (subscriptionCallback == null) {.swift
try {.swift
if (isConnected()) {.swift
this.mServiceBinderWrapper.removeSubscription(str, (IBinder) null, this.mCallbacksMessenger);.swift
}.swift
} catch (RemoteException unused) {.swift
}.swift
} else {.swift
List<SubscriptionCallback> callbacks = subscription.getCallbacks();.swift
List<Bundle> optionsList = subscription.getOptionsList();.swift
for (int size = callbacks.size() - 1; size >= 0; size--) {.swift
if (callbacks.get(size) == subscriptionCallback) {.swift
if (isConnected()) {.swift
this.mServiceBinderWrapper.removeSubscription(str, subscriptionCallback.mToken, this.mCallbacksMessenger);.swift
}.swift
callbacks.remove(size);.swift
optionsList.remove(size);.swift
}.swift
}.swift
}.swift
if (subscription.isEmpty() || subscriptionCallback == null) {.swift
this.mSubscriptions.remove(str);.swift
}.swift
}.swift
}.swift
}.swift
public interface MediaBrowserServiceCallbackImpl {.swift
void onConnectionFailed(Messenger messenger);.swift
void onLoadChildren(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);.swift
void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);.swift
}.swift
public static abstract class SearchCallback {.swift
public void onError(String str, Bundle bundle) {.swift
}.swift
public void onSearchResult(String str, Bundle bundle, List<MediaItem> list) {.swift
}.swift
}.swift
public static class SearchResultReceiver extends ResultReceiver {.swift
private final SearchCallback mCallback;.swift
private final Bundle mExtras;.swift
private final String mQuery;.swift
public SearchResultReceiver(String str, Bundle bundle, SearchCallback searchCallback, Handler handler) {.swift
super(handler);.swift
this.mQuery = str;.swift
this.mExtras = bundle;.swift
this.mCallback = searchCallback;.swift
}.swift
public void onReceiveResult(int i, Bundle bundle) {.swift
if (bundle = null) {.swift
bundle = MediaSessionCompat.unparcelWithClassLoader(bundle);.swift
}.swift
if (i bundle.containsKey("search_results")) {.swift
this.mCallback.onError(this.mQuery, this.mExtras);.swift
return;.swift
}.swift
Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");.swift
if (parcelableArray = null) {.swift
ArrayList arrayList = new ArrayList(parcelableArray.length);.swift
for (Parcelable parcelable : parcelableArray) {.swift
arrayList.add((MediaItem) parcelable);.swift
}.swift
this.mCallback.onSearchResult(this.mQuery, this.mExtras, arrayList);.swift
return;.swift
}.swift
this.mCallback.onError(this.mQuery, this.mExtras);.swift
}.swift
}.swift
public static class ServiceBinderWrapper {.swift
private Messenger mMessenger;.swift
private Bundle mRootHints;.swift
public ServiceBinderWrapper(IBinder iBinder, Bundle bundle) {.swift
this.mMessenger = new Messenger(iBinder);.swift
this.mRootHints = bundle;.swift
}.swift
private void sendRequest(int i, Bundle bundle, Messenger messenger) throws RemoteException {.swift
Message obtain = Message.obtain();.swift
obtain.what = i;.swift
obtain.arg1 = 1;.swift
obtain.setData(bundle);.swift
obtain.replyTo = messenger;.swift
this.mMessenger.send(obtain);.swift
}.swift
public void addSubscription(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {.swift
Bundle bundle2 = new Bundle();.swift
bundle2.putString("data_media_item_id", str);.swift
bundle2.putBinder("data_callback_token", iBinder);.swift
bundle2.putBundle("data_options", bundle);.swift
sendRequest(3, bundle2, messenger);.swift
}.swift
public void connect(Context context, Messenger messenger) throws RemoteException {.swift
Bundle bundle = new Bundle();.swift
bundle.putString("data_package_name", context.getPackageName());.swift
bundle.putInt("data_calling_pid", Process.myPid());.swift
bundle.putBundle("data_root_hints", this.mRootHints);.swift
sendRequest(1, bundle, messenger);.swift
}.swift
public void disconnect(Messenger messenger) throws RemoteException {.swift
sendRequest(2, (Bundle) null, messenger);.swift
}.swift
public void getMediaItem(String str, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {.swift
Bundle bundle = new Bundle();.swift
bundle.putString("data_media_item_id", str);.swift
bundle.putParcelable("data_result_receiver", resultReceiver);.swift
sendRequest(5, bundle, messenger);.swift
}.swift
public void registerCallbackMessenger(Context context, Messenger messenger) throws RemoteException {.swift
Bundle bundle = new Bundle();.swift
bundle.putString("data_package_name", context.getPackageName());.swift
bundle.putInt("data_calling_pid", Process.myPid());.swift
bundle.putBundle("data_root_hints", this.mRootHints);.swift
sendRequest(6, bundle, messenger);.swift
}.swift
public void removeSubscription(String str, IBinder iBinder, Messenger messenger) throws RemoteException {.swift
Bundle bundle = new Bundle();.swift
bundle.putString("data_media_item_id", str);.swift
bundle.putBinder("data_callback_token", iBinder);.swift
sendRequest(4, bundle, messenger);.swift
}.swift
public void search(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {.swift
Bundle bundle2 = new Bundle();.swift
bundle2.putString("data_search_query", str);.swift
bundle2.putBundle("data_search_extras", bundle);.swift
bundle2.putParcelable("data_result_receiver", resultReceiver);.swift
sendRequest(8, bundle2, messenger);.swift
}.swift
public void sendCustomAction(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {.swift
Bundle bundle2 = new Bundle();.swift
bundle2.putString("data_custom_action", str);.swift
bundle2.putBundle("data_custom_action_extras", bundle);.swift
bundle2.putParcelable("data_result_receiver", resultReceiver);.swift
sendRequest(9, bundle2, messenger);.swift
}.swift
public void unregisterCallbackMessenger(Messenger messenger) throws RemoteException {.swift
sendRequest(7, (Bundle) null, messenger);.swift
}.swift
}.swift
public static class Subscription {.swift
private final List<SubscriptionCallback> mCallbacks = new ArrayList();.swift
private final List<Bundle> mOptionsList = new ArrayList();.swift
public SubscriptionCallback getCallback(Bundle bundle) {.swift
for (int i = 0; i < this.mOptionsList.size(); i++) {.swift
if (f6e.e(this.mOptionsList.get(i), bundle)) {.swift
return this.mCallbacks.get(i);.swift
}.swift
}.swift
return null;.swift
}.swift
public List<SubscriptionCallback> getCallbacks() {.swift
return this.mCallbacks;.swift
}.swift
public List<Bundle> getOptionsList() {.swift
return this.mOptionsList;.swift
}.swift
public boolean isEmpty() {.swift
return this.mCallbacks.isEmpty();.swift
}.swift
public void putCallback(Bundle bundle, SubscriptionCallback subscriptionCallback) {.swift
for (int i = 0; i < this.mOptionsList.size(); i++) {.swift
if (f6e.e(this.mOptionsList.get(i), bundle)) {.swift
this.mCallbacks.set(i, subscriptionCallback);.swift
return;.swift
}.swift
}.swift
this.mCallbacks.add(subscriptionCallback);.swift
this.mOptionsList.add(bundle);.swift
}.swift
}.swift
public static abstract class SubscriptionCallback {.swift
final MediaBrowser.SubscriptionCallback mSubscriptionCallbackFwk = new SubscriptionCallbackApi26();.swift
WeakReference<Subscription> mSubscriptionRef;.swift
final IBinder mToken = new Binder();.swift
public class SubscriptionCallbackApi21 extends MediaBrowser.SubscriptionCallback {.swift
public SubscriptionCallbackApi21() {.swift
}.swift
public List<MediaItem> applyOptions(List<MediaItem> list, Bundle bundle) {.swift
if (list == null) {.swift
return null;.swift
}.swift
int i = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);.swift
int i2 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);.swift
if (i == -1 && i2 == -1) {.swift
return list;.swift
}.swift
int i3 = i2 * i;.swift
int i4 = i3 + i2;.swift
if (i < 0 || i2 < 1 || i3 >= list.size()) {.swift
return Collections.emptyList();.swift
}.swift
if (i4 > list.size()) {.swift
i4 = list.size();.swift
}.swift
return list.subList(i3, i4);.swift
}.swift
public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {.swift
WeakReference<Subscription> weakReference = SubscriptionCallback.this.mSubscriptionRef;.swift
Subscription subscription = weakReference == null ? null : weakReference.get();.swift
if (subscription == null) {.swift
SubscriptionCallback.this.onChildrenLoaded(str, MediaItem.fromMediaItemList(list));.swift
return;.swift
}.swift
List<MediaItem> fromMediaItemList = MediaItem.fromMediaItemList(list);.swift
List<SubscriptionCallback> callbacks = subscription.getCallbacks();.swift
List<Bundle> optionsList = subscription.getOptionsList();.swift
for (int i = 0; i < callbacks.size(); i++) {.swift
Bundle bundle = optionsList.get(i);.swift
if (bundle == null) {.swift
SubscriptionCallback.this.onChildrenLoaded(str, fromMediaItemList);.swift
} else {.swift
SubscriptionCallback.this.onChildrenLoaded(str, applyOptions(fromMediaItemList, bundle), bundle);.swift
}.swift
}.swift
}.swift
public void onError(String str) {.swift
SubscriptionCallback.this.onError(str);.swift
}.swift
}.swift
public class SubscriptionCallbackApi26 extends SubscriptionCallbackApi21 {.swift
public SubscriptionCallbackApi26() {.swift
super();.swift
}.swift
public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {.swift
MediaSessionCompat.ensureClassLoader(bundle);.swift
SubscriptionCallback.this.onChildrenLoaded(str, MediaItem.fromMediaItemList(list), bundle);.swift
}.swift
public void onError(String str, Bundle bundle) {.swift
MediaSessionCompat.ensureClassLoader(bundle);.swift
SubscriptionCallback.this.onError(str, bundle);.swift
}.swift
}.swift
public void onChildrenLoaded(String str, List<MediaItem> list) {.swift
}.swift
public void onError(String str) {.swift
}.swift
public void setSubscription(Subscription subscription) {.swift
this.mSubscriptionRef = new WeakReference<>(subscription);.swift
}.swift
public void onChildrenLoaded(String str, List<MediaItem> list, Bundle bundle) {.swift
}.swift
public void onError(String str, Bundle bundle) {.swift
}.swift
}.swift
public MediaBrowserCompat(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {.swift
this.mImpl = new MediaBrowserImplApi26(context, componentName, connectionCallback, bundle);.swift
}.swift
public void connect() {.swift
this.mImpl.connect();.swift
}.swift
public void disconnect() {.swift
this.mImpl.disconnect();.swift
}.swift
public Bundle getExtras() {.swift
return this.mImpl.getExtras();.swift
}.swift
public void getItem(String str, ItemCallback itemCallback) {.swift
this.mImpl.getItem(str, itemCallback);.swift
}.swift
public Bundle getNotifyChildrenChangedOptions() {.swift
return this.mImpl.getNotifyChildrenChangedOptions();.swift
}.swift
public String getRoot() {.swift
return this.mImpl.getRoot();.swift
}.swift
public ComponentName getServiceComponent() {.swift
return this.mImpl.getServiceComponent();.swift
}.swift
public MediaSessionCompat.Token getSessionToken() {.swift
return this.mImpl.getSessionToken();.swift
}.swift
public boolean isConnected() {.swift
return this.mImpl.isConnected();.swift
}.swift
public void search(String str, Bundle bundle, SearchCallback searchCallback) {.swift
if (TextUtils.isEmpty(str)) {.swift
throw new IllegalArgumentException("query cannot be empty");.swift
} else if (searchCallback = null) {.swift
this.mImpl.search(str, bundle, searchCallback);.swift
} else {.swift
throw new IllegalArgumentException("callback cannot be null");.swift
}.swift
}.swift
public void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback) {.swift
if (TextUtils.isEmpty(str)) {.swift
this.mImpl.sendCustomAction(str, bundle, customActionCallback);.swift
return;.swift
}.swift
throw new IllegalArgumentException("action cannot be empty");.swift
}.swift
public void subscribe(String str, SubscriptionCallback subscriptionCallback) {.swift
if (TextUtils.isEmpty(str)) {.swift
throw new IllegalArgumentException("parentId is empty");.swift
} else if (subscriptionCallback = null) {.swift
this.mImpl.subscribe(str, (Bundle) null, subscriptionCallback);.swift
} else {.swift
throw new IllegalArgumentException("callback is null");.swift
}.swift
}.swift
public void unsubscribe(String str) {.swift
if (TextUtils.isEmpty(str)) {.swift
this.mImpl.unsubscribe(str, (SubscriptionCallback) null);.swift
return;.swift
}.swift
throw new IllegalArgumentException("parentId is empty");.swift
}.swift
public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {.swift
if (TextUtils.isEmpty(str)) {.swift
throw new IllegalArgumentException("parentId is empty");.swift
} else if (subscriptionCallback = null) {.swift
this.mImpl.unsubscribe(str, subscriptionCallback);.swift
} else {.swift
throw new IllegalArgumentException("callback is null");.swift
}.swift
}.swift
public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {.swift
if (TextUtils.isEmpty(str)) {.swift
throw new IllegalArgumentException("parentId is empty");.swift
} else if (subscriptionCallback == null) {.swift
throw new IllegalArgumentException("callback is null");.swift
} else if (bundle = null) {.swift
this.mImpl.subscribe(str, bundle, subscriptionCallback);.swift
} else {.swift
throw new IllegalArgumentException("options are null");.swift
}.swift
}.swift
@SuppressLint({"BanParcelableUsage"}).swift
public static class MediaItem implements Parcelable {.swift
public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() {.swift
public MediaItem createFromParcel(Parcel parcel) {.swift
return new MediaItem(parcel);.swift
}.swift
public MediaItem[] newArray(int i) {.swift
return new MediaItem[i];.swift
}.swift
};.swift
public static final int FLAG_BROWSABLE = 1;.swift
public static final int FLAG_PLAYABLE = 2;.swift
private final MediaDescriptionCompat mDescription;.swift
private final int mFlags;.swift
public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {.swift
if (mediaDescriptionCompat == null) {.swift
throw new IllegalArgumentException("description cannot be null");.swift
} else if (TextUtils.isEmpty(mediaDescriptionCompat.getMediaId())) {.swift
this.mFlags = i;.swift
this.mDescription = mediaDescriptionCompat;.swift
} else {.swift
throw new IllegalArgumentException("description must have a non-empty media id");.swift
}.swift
}.swift
public static MediaItem fromMediaItem(Object obj) {.swift
if (obj == null) {.swift
return null;.swift
}.swift
MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;.swift
return new MediaItem(MediaDescriptionCompat.fromMediaDescription(Api21Impl.getDescription(mediaItem)), Api21Impl.getFlags(mediaItem));.swift
}.swift
public static List<MediaItem> fromMediaItemList(List<?> list) {.swift
if (list == null) {.swift
return null;.swift
}.swift
ArrayList arrayList = new ArrayList(list.size());.swift
for (Object fromMediaItem : list) {.swift
arrayList.add(fromMediaItem(fromMediaItem));.swift
}.swift
return arrayList;.swift
}.swift
public int describeContents() {.swift
return 0;.swift
}.swift
public MediaDescriptionCompat getDescription() {.swift
return this.mDescription;.swift
}.swift
public int getFlags() {.swift
return this.mFlags;.swift
}.swift
public String getMediaId() {.swift
return this.mDescription.getMediaId();.swift
}.swift
public boolean isBrowsable() {.swift
return (this.mFlags & 1) = 0;.swift
}.swift
public boolean isPlayable() {.swift
return (this.mFlags & 2) = 0;.swift
}.swift
public String toString() {.swift
return "MediaItem{mFlags=" + this.mFlags + ", mDescription=" + this.mDescription + '}';.swift
}.swift
public void writeToParcel(Parcel parcel, int i) {.swift
parcel.writeInt(this.mFlags);.swift
this.mDescription.writeToParcel(parcel, i);.swift
}.swift
public MediaItem(Parcel parcel) {.swift
this.mFlags = parcel.readInt();.swift
this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);.swift
}.swift
}.swift
}.swift
