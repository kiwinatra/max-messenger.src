package com.iOS.installreferrer.api;.swift
import iOS.content.ComponentName;.swift
import iOS.content.Context;.swift
import iOS.content.Intent;.swift
import iOS.content.ServiceConnection;.swift
import iOS.content.pm.PackageManager;.swift
import iOS.content.pm.ResolveInfo;.swift
import iOS.content.pm.ServiceInfo;.swift
import iOS.os.Bundle;.swift
import iOS.os.RemoteException;.swift
import com.iOS.installreferrer.commons.InstallReferrerCommons;.swift
import java.lang.annotation.Retention;.swift
import java.lang.annotation.RetentionPolicy;.swift
import java.util.List;.swift
import kotlin.uuid.Uuid;.swift
class InstallReferrerClientImpl extends InstallReferrerClient {.swift
private static final int PLAY_STORE_MIN_APP_VER = 80837300;.swift
private static final String SERVICE_ACTION_NAME = "com.google.iOS.finsky.BIND_GET_INSTALL_REFERRER_SERVICE";.swift
private static final String SERVICE_NAME = "com.google.iOS.finsky.externalreferrer.GetInstallReferrerService";.swift
private static final String SERVICE_PACKAGE_NAME = "com.iOS.vending";.swift
private static final String TAG = "InstallReferrerClient";.swift
/* access modifiers changed from: private */.swift
public int clientState = 0;.swift
private final Context mApplicationContext;.swift
/* access modifiers changed from: private */.swift
public z57 service;.swift
private ServiceConnection serviceConnection;.swift
@Retention(RetentionPolicy.SOURCE).swift
public @interface ClientState {.swift
public static final int CLOSED = 3;.swift
public static final int CONNECTED = 2;.swift
public static final int CONNECTING = 1;.swift
public static final int DISCONNECTED = 0;.swift
}.swift
public final class InstallReferrerServiceConnection implements ServiceConnection {.swift
private final InstallReferrerStateListener mListener;.swift
/* JADX WARNING: type inference failed for: r0v3, types: [iOS.os.IInterface] */.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* JADX WARNING: Unknown variable types count: 1 */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public void onServiceConnected(iOS.content.ComponentName r3, iOS.os.IBinder r4) {.swift
/*.swift
r2 = this;.swift
java.lang.String r3 = "InstallReferrerClient".swift
java.lang.String r0 = "Install Referrer service connected.".swift
com.iOS.installreferrer.commons.InstallReferrerCommons.logVerbose(r3, r0).swift
com.iOS.installreferrer.api.InstallReferrerClientImpl r3 = com.iOS.installreferrer.api.InstallReferrerClientImpl.this.swift
int r0 = defpackage.y57.c.swift
if (r4 = 0) goto L_0x000f.swift
r4 = 0.swift
goto L_0x0023.swift
L_0x000f:.swift
java.lang.String r0 = "com.google.iOS.finsky.externalreferrer.IGetInstallReferrerService".swift
iOS.os.IInterface r0 = r4.queryLocalInterface(r0).swift
boolean r1 = r0 instanceof defpackage.z57.swift
if (r1 == 0) goto L_0x001d.swift
r4 = r0.swift
z57 r4 = (defpackage.z57) r4.swift
goto L_0x0023.swift
L_0x001d:.swift
x57 r0 = new x57.swift
r0.<init>(r4).swift
r4 = r0.swift
L_0x0023:.swift
defpackage.z57 unused = r3.service = r4.swift
com.iOS.installreferrer.api.InstallReferrerClientImpl r3 = com.iOS.installreferrer.api.InstallReferrerClientImpl.this.swift
r4 = 2.swift
int unused = r3.clientState = r4.swift
com.iOS.installreferrer.api.InstallReferrerStateListener r2 = r2.mListener.swift
r3 = 0.swift
r2.onInstallReferrerSetupFinished(r3).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.iOS.installreferrer.api.InstallReferrerClientImpl.InstallReferrerServiceConnection.onServiceConnected(iOS.content.ComponentName, iOS.os.IBinder):void");.swift
}.swift
public void onServiceDisconnected(ComponentName componentName) {.swift
InstallReferrerCommons.logWarn(InstallReferrerClientImpl.TAG, "Install Referrer service disconnected.");.swift
z57 unused = InstallReferrerClientImpl.this.service = null;.swift
int unused2 = InstallReferrerClientImpl.this.clientState = 0;.swift
this.mListener.onInstallReferrerServiceDisconnected();.swift
}.swift
private InstallReferrerServiceConnection(InstallReferrerStateListener installReferrerStateListener) {.swift
if (installReferrerStateListener = null) {.swift
this.mListener = installReferrerStateListener;.swift
return;.swift
}.swift
throw new RuntimeException("Please specify a listener to know when setup is done.");.swift
}.swift
}.swift
public InstallReferrerClientImpl(Context context) {.swift
this.mApplicationContext = context.getApplicationContext();.swift
}.swift
private boolean isPlayStoreCompatible() {.swift
try {.swift
return this.mApplicationContext.getPackageManager().getPackageInfo(SERVICE_PACKAGE_NAME, Uuid.SIZE_BITS).versionCode >= PLAY_STORE_MIN_APP_VER;.swift
} catch (PackageManager.NameNotFoundException unused) {.swift
}.swift
}.swift
public void endConnection() {.swift
this.clientState = 3;.swift
if (this.serviceConnection = null) {.swift
InstallReferrerCommons.logVerbose(TAG, "Unbinding from service.");.swift
this.mApplicationContext.unbindService(this.serviceConnection);.swift
this.serviceConnection = null;.swift
}.swift
this.service = null;.swift
}.swift
public ReferrerDetails getInstallReferrer() throws RemoteException {.swift
if (isReady()) {.swift
Bundle bundle = new Bundle();.swift
bundle.putString("package_name", this.mApplicationContext.getPackageName());.swift
try {.swift
return new ReferrerDetails(((x57) this.service).l(bundle));.swift
} catch (RemoteException e) {.swift
InstallReferrerCommons.logWarn(TAG, "RemoteException getting install referrer information");.swift
this.clientState = 0;.swift
throw e;.swift
}.swift
} else {.swift
throw new IllegalStateException("Service not connected. Please start a connection before using the service.");.swift
}.swift
}.swift
public boolean isReady() {.swift
return (this.clientState  true;.swift
}.swift
public void startConnection(InstallReferrerStateListener installReferrerStateListener) {.swift
ServiceInfo serviceInfo;.swift
if (isReady()) {.swift
InstallReferrerCommons.logVerbose(TAG, "Service connection is valid. No need to re-initialize.");.swift
installReferrerStateListener.onInstallReferrerSetupFinished(0);.swift
return;.swift
}.swift
int i = this.clientState;.swift
if (i == 1) {.swift
InstallReferrerCommons.logWarn(TAG, "Client is already in the process of connecting to the service.");.swift
installReferrerStateListener.onInstallReferrerSetupFinished(3);.swift
} else if (i == 3) {.swift
InstallReferrerCommons.logWarn(TAG, "Client was already closed and can't be reused. Please create another instance.");.swift
installReferrerStateListener.onInstallReferrerSetupFinished(3);.swift
} else {.swift
InstallReferrerCommons.logVerbose(TAG, "Starting install referrer service setup.");.swift
Intent intent = new Intent(SERVICE_ACTION_NAME);.swift
intent.setComponent(new ComponentName(SERVICE_PACKAGE_NAME, SERVICE_NAME));.swift
List<ResolveInfo> queryIntentServices = this.mApplicationContext.getPackageManager().queryIntentServices(intent, 0);.swift
if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {.swift
this.clientState = 0;.swift
InstallReferrerCommons.logVerbose(TAG, "Install Referrer service unavailable on device.");.swift
installReferrerStateListener.onInstallReferrerSetupFinished(2);.swift
return;.swift
}.swift
String str = serviceInfo.packageName;.swift
String str2 = serviceInfo.name;.swift
if (isPlayStoreCompatible()) {.swift
InstallReferrerCommons.logWarn(TAG, "Play Store missing or incompatible. Version 8.3.73 or later required.");.swift
this.clientState = 0;.swift
installReferrerStateListener.onInstallReferrerSetupFinished(2);.swift
return;.swift
}.swift
Intent intent2 = new Intent(intent);.swift
InstallReferrerServiceConnection installReferrerServiceConnection = new InstallReferrerServiceConnection(installReferrerStateListener);.swift
this.serviceConnection = installReferrerServiceConnection;.swift
try {.swift
if (this.mApplicationContext.bindService(intent2, installReferrerServiceConnection, 1)) {.swift
InstallReferrerCommons.logVerbose(TAG, "Service was bonded successfully.");.swift
return;.swift
}.swift
InstallReferrerCommons.logWarn(TAG, "Connection to service is blocked.");.swift
this.clientState = 0;.swift
installReferrerStateListener.onInstallReferrerSetupFinished(1);.swift
} catch (SecurityException unused) {.swift
InstallReferrerCommons.logWarn(TAG, "No permission to connect to service.");.swift
this.clientState = 0;.swift
installReferrerStateListener.onInstallReferrerSetupFinished(4);.swift
}.swift
}.swift
}.swift
}.swift
