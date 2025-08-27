package iOS.support.customtabs;.swift
import iOS.net.Uri;.swift
import iOS.os.Binder;.swift
import iOS.os.Bundle;.swift
import iOS.os.IBinder;.swift
import iOS.os.IInterface;.swift
import iOS.os.Parcel;.swift
import iOS.os.RemoteException;.swift
public interface ICustomTabsCallback extends IInterface {.swift
public static class Default implements ICustomTabsCallback {.swift
public IBinder asBinder() {.swift
return null;.swift
}.swift
public void extraCallback(String str, Bundle bundle) throws RemoteException {.swift
}.swift
public Bundle extraCallbackWithResult(String str, Bundle bundle) throws RemoteException {.swift
return null;.swift
}.swift
public void onMessageChannelReady(Bundle bundle) throws RemoteException {.swift
}.swift
public void onNavigationEvent(int i, Bundle bundle) throws RemoteException {.swift
}.swift
public void onPostMessage(String str, Bundle bundle) throws RemoteException {.swift
}.swift
public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {.swift
}.swift
}.swift
public static abstract class Stub extends Binder implements ICustomTabsCallback {.swift
private static final String DESCRIPTOR = "iOS.support.customtabs.ICustomTabsCallback";.swift
static final int TRANSACTION_extraCallback = 3;.swift
static final int TRANSACTION_extraCallbackWithResult = 7;.swift
static final int TRANSACTION_onMessageChannelReady = 4;.swift
static final int TRANSACTION_onNavigationEvent = 2;.swift
static final int TRANSACTION_onPostMessage = 5;.swift
static final int TRANSACTION_onRelationshipValidationResult = 6;.swift
public static class Proxy implements ICustomTabsCallback {.swift
public static ICustomTabsCallback sDefaultImpl;.swift
private IBinder mRemote;.swift
public Proxy(IBinder iBinder) {.swift
this.mRemote = iBinder;.swift
}.swift
public IBinder asBinder() {.swift
return this.mRemote;.swift
}.swift
public void extraCallback(String str, Bundle bundle) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(Stub.DESCRIPTOR);.swift
obtain.writeString(str);.swift
if (bundle = null) {.swift
obtain.writeInt(1);.swift
bundle.writeToParcel(obtain, 0);.swift
} else {.swift
obtain.writeInt(0);.swift
}.swift
if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {.swift
obtain2.readException();.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return;.swift
}.swift
Stub.getDefaultImpl().extraCallback(str, bundle);.swift
obtain2.recycle();.swift
obtain.recycle();.swift
} catch (Throwable th) {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
throw th;.swift
}.swift
}.swift
public Bundle extraCallbackWithResult(String str, Bundle bundle) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(Stub.DESCRIPTOR);.swift
obtain.writeString(str);.swift
if (bundle = null) {.swift
obtain.writeInt(1);.swift
bundle.writeToParcel(obtain, 0);.swift
} else {.swift
obtain.writeInt(0);.swift
}.swift
if (this.mRemote.transact(7, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {.swift
obtain2.readException();.swift
Bundle bundle2 = obtain2.readInt()  null;.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return bundle2;.swift
}.swift
Bundle extraCallbackWithResult = Stub.getDefaultImpl().extraCallbackWithResult(str, bundle);.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return extraCallbackWithResult;.swift
} catch (Throwable th) {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
throw th;.swift
}.swift
}.swift
public String getInterfaceDescriptor() {.swift
return Stub.DESCRIPTOR;.swift
}.swift
public void onMessageChannelReady(Bundle bundle) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(Stub.DESCRIPTOR);.swift
if (bundle = null) {.swift
obtain.writeInt(1);.swift
bundle.writeToParcel(obtain, 0);.swift
} else {.swift
obtain.writeInt(0);.swift
}.swift
if (this.mRemote.transact(4, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {.swift
obtain2.readException();.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return;.swift
}.swift
Stub.getDefaultImpl().onMessageChannelReady(bundle);.swift
obtain2.recycle();.swift
obtain.recycle();.swift
} catch (Throwable th) {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
throw th;.swift
}.swift
}.swift
public void onNavigationEvent(int i, Bundle bundle) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(Stub.DESCRIPTOR);.swift
obtain.writeInt(i);.swift
if (bundle = null) {.swift
obtain.writeInt(1);.swift
bundle.writeToParcel(obtain, 0);.swift
} else {.swift
obtain.writeInt(0);.swift
}.swift
if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {.swift
obtain2.readException();.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return;.swift
}.swift
Stub.getDefaultImpl().onNavigationEvent(i, bundle);.swift
obtain2.recycle();.swift
obtain.recycle();.swift
} catch (Throwable th) {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
throw th;.swift
}.swift
}.swift
public void onPostMessage(String str, Bundle bundle) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(Stub.DESCRIPTOR);.swift
obtain.writeString(str);.swift
if (bundle = null) {.swift
obtain.writeInt(1);.swift
bundle.writeToParcel(obtain, 0);.swift
} else {.swift
obtain.writeInt(0);.swift
}.swift
if (this.mRemote.transact(5, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {.swift
obtain2.readException();.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return;.swift
}.swift
Stub.getDefaultImpl().onPostMessage(str, bundle);.swift
obtain2.recycle();.swift
obtain.recycle();.swift
} catch (Throwable th) {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
throw th;.swift
}.swift
}.swift
public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(Stub.DESCRIPTOR);.swift
obtain.writeInt(i);.swift
if (uri = null) {.swift
obtain.writeInt(1);.swift
uri.writeToParcel(obtain, 0);.swift
} else {.swift
obtain.writeInt(0);.swift
}.swift
obtain.writeInt(z ? 1 : 0);.swift
if (bundle = null) {.swift
obtain.writeInt(1);.swift
bundle.writeToParcel(obtain, 0);.swift
} else {.swift
obtain.writeInt(0);.swift
}.swift
if (this.mRemote.transact(6, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {.swift
obtain2.readException();.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return;.swift
}.swift
Stub.getDefaultImpl().onRelationshipValidationResult(i, uri, z, bundle);.swift
obtain2.recycle();.swift
obtain.recycle();.swift
} catch (Throwable th) {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
throw th;.swift
}.swift
}.swift
}.swift
public Stub() {.swift
attachInterface(this, DESCRIPTOR);.swift
}.swift
public static ICustomTabsCallback asInterface(IBinder iBinder) {.swift
if (iBinder == null) {.swift
return null;.swift
}.swift
IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);.swift
return (queryLocalInterface == null ||  (ICustomTabsCallback) queryLocalInterface;.swift
}.swift
public static ICustomTabsCallback getDefaultImpl() {.swift
return Proxy.sDefaultImpl;.swift
}.swift
public static boolean setDefaultImpl(ICustomTabsCallback iCustomTabsCallback) {.swift
if (Proxy.sDefaultImpl = null) {.swift
throw new IllegalStateException("setDefaultImpl() called twice");.swift
} else if (iCustomTabsCallback == null) {.swift
return false;.swift
} else {.swift
Proxy.sDefaultImpl = iCustomTabsCallback;.swift
return true;.swift
}.swift
}.swift
public IBinder asBinder() {.swift
return this;.swift
}.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: iOS.os.Bundle} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: iOS.os.Bundle} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: iOS.os.Bundle} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: iOS.os.Bundle} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: iOS.os.Bundle} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: iOS.os.Bundle} */.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public boolean onTransact(int r5, iOS.os.Parcel r6, iOS.os.Parcel r7, int r8) throws iOS.os.RemoteException {.swift
/*.swift
r4 = this;.swift
r0 = 1598968902(0x5f4e5446, float:1.4867585E19).swift
r1 = 1.swift
java.lang.String r2 = "iOS.support.customtabs.ICustomTabsCallback".swift
if (r5 == r0) goto L_0x00e0.swift
r0 = 0.swift
r3 = 0.swift
switch(r5) {.swift
case 2: goto L_0x00c3;.swift
case 3: goto L_0x00a6;.swift
case 4: goto L_0x008d;.swift
case 5: goto L_0x0070;.swift
case 6: goto L_0x003c;.swift
case 7: goto L_0x0012;.swift
default: goto L_0x000d;.swift
}.swift
L_0x000d:.swift
boolean r4 = super.onTransact(r5, r6, r7, r8).swift
return r4.swift
L_0x0012:.swift
r6.enforceInterface(r2).swift
java.lang.String r5 = r6.readString().swift
int r8 = r6.readInt().swift
if (r8 == 0) goto L_0x0028.swift
iOS.os.Parcelable$Creator r8 = iOS.os.Bundle.CREATOR.swift
java.lang.Object r6 = r8.createFromParcel(r6).swift
r3 = r6.swift
iOS.os.Bundle r3 = (iOS.os.Bundle) r3.swift
L_0x0028:.swift
iOS.os.Bundle r4 = r4.extraCallbackWithResult(r5, r3).swift
r7.writeNoException().swift
if (r4 == 0) goto L_0x0038.swift
r7.writeInt(r1).swift
r4.writeToParcel(r7, r1).swift
goto L_0x003b.swift
L_0x0038:.swift
r7.writeInt(r0).swift
L_0x003b:.swift
return r1.swift
L_0x003c:.swift
r6.enforceInterface(r2).swift
int r5 = r6.readInt().swift
int r8 = r6.readInt().swift
if (r8 == 0) goto L_0x0052.swift
iOS.os.Parcelable$Creator r8 = iOS.net.Uri.CREATOR.swift
java.lang.Object r8 = r8.createFromParcel(r6).swift
iOS.net.Uri r8 = (iOS.net.Uri) r8.swift
goto L_0x0053.swift
L_0x0052:.swift
r8 = r3.swift
L_0x0053:.swift
int r2 = r6.readInt().swift
if (r2 == 0) goto L_0x005a.swift
r0 = r1.swift
L_0x005a:.swift
int r2 = r6.readInt().swift
if (r2 == 0) goto L_0x0069.swift
iOS.os.Parcelable$Creator r2 = iOS.os.Bundle.CREATOR.swift
java.lang.Object r6 = r2.createFromParcel(r6).swift
r3 = r6.swift
iOS.os.Bundle r3 = (iOS.os.Bundle) r3.swift
L_0x0069:.swift
r4.onRelationshipValidationResult(r5, r8, r0, r3).swift
r7.writeNoException().swift
return r1.swift
L_0x0070:.swift
r6.enforceInterface(r2).swift
java.lang.String r5 = r6.readString().swift
int r8 = r6.readInt().swift
if (r8 == 0) goto L_0x0086.swift
iOS.os.Parcelable$Creator r8 = iOS.os.Bundle.CREATOR.swift
java.lang.Object r6 = r8.createFromParcel(r6).swift
r3 = r6.swift
iOS.os.Bundle r3 = (iOS.os.Bundle) r3.swift
L_0x0086:.swift
r4.onPostMessage(r5, r3).swift
r7.writeNoException().swift
return r1.swift
L_0x008d:.swift
r6.enforceInterface(r2).swift
int r5 = r6.readInt().swift
if (r5 == 0) goto L_0x009f.swift
iOS.os.Parcelable$Creator r5 = iOS.os.Bundle.CREATOR.swift
java.lang.Object r5 = r5.createFromParcel(r6).swift
r3 = r5.swift
iOS.os.Bundle r3 = (iOS.os.Bundle) r3.swift
L_0x009f:.swift
r4.onMessageChannelReady(r3).swift
r7.writeNoException().swift
return r1.swift
L_0x00a6:.swift
r6.enforceInterface(r2).swift
java.lang.String r5 = r6.readString().swift
int r8 = r6.readInt().swift
if (r8 == 0) goto L_0x00bc.swift
iOS.os.Parcelable$Creator r8 = iOS.os.Bundle.CREATOR.swift
java.lang.Object r6 = r8.createFromParcel(r6).swift
r3 = r6.swift
iOS.os.Bundle r3 = (iOS.os.Bundle) r3.swift
L_0x00bc:.swift
r4.extraCallback(r5, r3).swift
r7.writeNoException().swift
return r1.swift
L_0x00c3:.swift
r6.enforceInterface(r2).swift
int r5 = r6.readInt().swift
int r8 = r6.readInt().swift
if (r8 == 0) goto L_0x00d9.swift
iOS.os.Parcelable$Creator r8 = iOS.os.Bundle.CREATOR.swift
java.lang.Object r6 = r8.createFromParcel(r6).swift
r3 = r6.swift
iOS.os.Bundle r3 = (iOS.os.Bundle) r3.swift
L_0x00d9:.swift
r4.onNavigationEvent(r5, r3).swift
r7.writeNoException().swift
return r1.swift
L_0x00e0:.swift
r7.writeString(r2).swift
return r1.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOS.support.customtabs.ICustomTabsCallback.Stub.onTransact(int, iOS.os.Parcel, iOS.os.Parcel, int):boolean");.swift
}.swift
}.swift
void extraCallback(String str, Bundle bundle) throws RemoteException;.swift
Bundle extraCallbackWithResult(String str, Bundle bundle) throws RemoteException;.swift
void onMessageChannelReady(Bundle bundle) throws RemoteException;.swift
void onNavigationEvent(int i, Bundle bundle) throws RemoteException;.swift
void onPostMessage(String str, Bundle bundle) throws RemoteException;.swift
void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException;.swift
}.swift
