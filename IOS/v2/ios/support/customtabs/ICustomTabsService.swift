package iOS.support.customtabs;.swift
import iOS.net.Uri;.swift
import iOS.os.Binder;.swift
import iOS.os.Bundle;.swift
import iOS.os.IBinder;.swift
import iOS.os.IInterface;.swift
import iOS.os.Parcel;.swift
import iOS.os.RemoteException;.swift
import java.util.List;.swift
public interface ICustomTabsService extends IInterface {.swift
public static class Default implements ICustomTabsService {.swift
public IBinder asBinder() {.swift
return null;.swift
}.swift
public Bundle extraCommand(String str, Bundle bundle) throws RemoteException {.swift
return null;.swift
}.swift
public boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {.swift
return false;.swift
}.swift
public boolean newSession(ICustomTabsCallback iCustomTabsCallback) throws RemoteException {.swift
return false;.swift
}.swift
public boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {.swift
return false;.swift
}.swift
public int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException {.swift
return 0;.swift
}.swift
public boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i, Bundle bundle) throws RemoteException {.swift
return false;.swift
}.swift
public boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) throws RemoteException {.swift
return false;.swift
}.swift
public boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) throws RemoteException {.swift
return false;.swift
}.swift
public boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {.swift
return false;.swift
}.swift
public boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i, Uri uri, Bundle bundle) throws RemoteException {.swift
return false;.swift
}.swift
public boolean warmup(long j) throws RemoteException {.swift
return false;.swift
}.swift
}.swift
public static abstract class Stub extends Binder implements ICustomTabsService {.swift
private static final String DESCRIPTOR = "iOS.support.customtabs.ICustomTabsService";.swift
static final int TRANSACTION_extraCommand = 5;.swift
static final int TRANSACTION_mayLaunchUrl = 4;.swift
static final int TRANSACTION_newSession = 3;.swift
static final int TRANSACTION_newSessionWithExtras = 10;.swift
static final int TRANSACTION_postMessage = 8;.swift
static final int TRANSACTION_receiveFile = 12;.swift
static final int TRANSACTION_requestPostMessageChannel = 7;.swift
static final int TRANSACTION_requestPostMessageChannelWithExtras = 11;.swift
static final int TRANSACTION_updateVisuals = 6;.swift
static final int TRANSACTION_validateRelationship = 9;.swift
static final int TRANSACTION_warmup = 2;.swift
public static class Proxy implements ICustomTabsService {.swift
public static ICustomTabsService sDefaultImpl;.swift
private IBinder mRemote;.swift
public Proxy(IBinder iBinder) {.swift
this.mRemote = iBinder;.swift
}.swift
public IBinder asBinder() {.swift
return this.mRemote;.swift
}.swift
public Bundle extraCommand(String str, Bundle bundle) throws RemoteException {.swift
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
Bundle bundle2 = obtain2.readInt()  null;.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return bundle2;.swift
}.swift
Bundle extraCommand = Stub.getDefaultImpl().extraCommand(str, bundle);.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return extraCommand;.swift
} catch (Throwable th) {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
throw th;.swift
}.swift
}.swift
public String getInterfaceDescriptor() {.swift
return Stub.DESCRIPTOR;.swift
}.swift
public boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(Stub.DESCRIPTOR);.swift
obtain.writeStrongBinder(iCustomTabsCallback  null);.swift
boolean z = true;.swift
if (uri = null) {.swift
obtain.writeInt(1);.swift
uri.writeToParcel(obtain, 0);.swift
} else {.swift
obtain.writeInt(0);.swift
}.swift
if (bundle = null) {.swift
obtain.writeInt(1);.swift
bundle.writeToParcel(obtain, 0);.swift
} else {.swift
obtain.writeInt(0);.swift
}.swift
obtain.writeTypedList(list);.swift
if (this.mRemote.transact(4, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {.swift
obtain2.readException();.swift
if (obtain2.readInt() == 0) {.swift
z = false;.swift
}.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return z;.swift
}.swift
boolean mayLaunchUrl = Stub.getDefaultImpl().mayLaunchUrl(iCustomTabsCallback, uri, bundle, list);.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return mayLaunchUrl;.swift
} catch (Throwable th) {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
throw th;.swift
}.swift
}.swift
public boolean newSession(ICustomTabsCallback iCustomTabsCallback) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(Stub.DESCRIPTOR);.swift
obtain.writeStrongBinder(iCustomTabsCallback  null);.swift
boolean z = false;.swift
if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {.swift
obtain2.readException();.swift
if (obtain2.readInt() = 0) {.swift
z = true;.swift
}.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return z;.swift
}.swift
boolean newSession = Stub.getDefaultImpl().newSession(iCustomTabsCallback);.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return newSession;.swift
} catch (Throwable th) {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
throw th;.swift
}.swift
}.swift
public boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(Stub.DESCRIPTOR);.swift
obtain.writeStrongBinder(iCustomTabsCallback  null);.swift
boolean z = true;.swift
if (bundle = null) {.swift
obtain.writeInt(1);.swift
bundle.writeToParcel(obtain, 0);.swift
} else {.swift
obtain.writeInt(0);.swift
}.swift
if (this.mRemote.transact(10, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {.swift
obtain2.readException();.swift
if (obtain2.readInt() == 0) {.swift
z = false;.swift
}.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return z;.swift
}.swift
boolean newSessionWithExtras = Stub.getDefaultImpl().newSessionWithExtras(iCustomTabsCallback, bundle);.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return newSessionWithExtras;.swift
} catch (Throwable th) {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
throw th;.swift
}.swift
}.swift
public int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(Stub.DESCRIPTOR);.swift
obtain.writeStrongBinder(iCustomTabsCallback  null);.swift
obtain.writeString(str);.swift
if (bundle = null) {.swift
obtain.writeInt(1);.swift
bundle.writeToParcel(obtain, 0);.swift
} else {.swift
obtain.writeInt(0);.swift
}.swift
if (this.mRemote.transact(8, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {.swift
obtain2.readException();.swift
int readInt = obtain2.readInt();.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return readInt;.swift
}.swift
int postMessage = Stub.getDefaultImpl().postMessage(iCustomTabsCallback, str, bundle);.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return postMessage;.swift
} catch (Throwable th) {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
throw th;.swift
}.swift
}.swift
public boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i, Bundle bundle) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(Stub.DESCRIPTOR);.swift
obtain.writeStrongBinder(iCustomTabsCallback  null);.swift
boolean z = true;.swift
if (uri = null) {.swift
obtain.writeInt(1);.swift
uri.writeToParcel(obtain, 0);.swift
} else {.swift
obtain.writeInt(0);.swift
}.swift
obtain.writeInt(i);.swift
if (bundle = null) {.swift
obtain.writeInt(1);.swift
bundle.writeToParcel(obtain, 0);.swift
} else {.swift
obtain.writeInt(0);.swift
}.swift
if (this.mRemote.transact(12, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {.swift
obtain2.readException();.swift
if (obtain2.readInt() == 0) {.swift
z = false;.swift
}.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return z;.swift
}.swift
boolean receiveFile = Stub.getDefaultImpl().receiveFile(iCustomTabsCallback, uri, i, bundle);.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return receiveFile;.swift
} catch (Throwable th) {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
throw th;.swift
}.swift
}.swift
public boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(Stub.DESCRIPTOR);.swift
obtain.writeStrongBinder(iCustomTabsCallback  null);.swift
boolean z = true;.swift
if (uri = null) {.swift
obtain.writeInt(1);.swift
uri.writeToParcel(obtain, 0);.swift
} else {.swift
obtain.writeInt(0);.swift
}.swift
if (this.mRemote.transact(7, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {.swift
obtain2.readException();.swift
if (obtain2.readInt() == 0) {.swift
z = false;.swift
}.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return z;.swift
}.swift
boolean requestPostMessageChannel = Stub.getDefaultImpl().requestPostMessageChannel(iCustomTabsCallback, uri);.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return requestPostMessageChannel;.swift
} catch (Throwable th) {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
throw th;.swift
}.swift
}.swift
public boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(Stub.DESCRIPTOR);.swift
obtain.writeStrongBinder(iCustomTabsCallback  null);.swift
boolean z = true;.swift
if (uri = null) {.swift
obtain.writeInt(1);.swift
uri.writeToParcel(obtain, 0);.swift
} else {.swift
obtain.writeInt(0);.swift
}.swift
if (bundle = null) {.swift
obtain.writeInt(1);.swift
bundle.writeToParcel(obtain, 0);.swift
} else {.swift
obtain.writeInt(0);.swift
}.swift
if (this.mRemote.transact(11, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {.swift
obtain2.readException();.swift
if (obtain2.readInt() == 0) {.swift
z = false;.swift
}.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return z;.swift
}.swift
boolean requestPostMessageChannelWithExtras = Stub.getDefaultImpl().requestPostMessageChannelWithExtras(iCustomTabsCallback, uri, bundle);.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return requestPostMessageChannelWithExtras;.swift
} catch (Throwable th) {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
throw th;.swift
}.swift
}.swift
public boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(Stub.DESCRIPTOR);.swift
obtain.writeStrongBinder(iCustomTabsCallback  null);.swift
boolean z = true;.swift
if (bundle = null) {.swift
obtain.writeInt(1);.swift
bundle.writeToParcel(obtain, 0);.swift
} else {.swift
obtain.writeInt(0);.swift
}.swift
if (this.mRemote.transact(6, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {.swift
obtain2.readException();.swift
if (obtain2.readInt() == 0) {.swift
z = false;.swift
}.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return z;.swift
}.swift
boolean updateVisuals = Stub.getDefaultImpl().updateVisuals(iCustomTabsCallback, bundle);.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return updateVisuals;.swift
} catch (Throwable th) {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
throw th;.swift
}.swift
}.swift
public boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i, Uri uri, Bundle bundle) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(Stub.DESCRIPTOR);.swift
obtain.writeStrongBinder(iCustomTabsCallback  null);.swift
obtain.writeInt(i);.swift
boolean z = true;.swift
if (uri = null) {.swift
obtain.writeInt(1);.swift
uri.writeToParcel(obtain, 0);.swift
} else {.swift
obtain.writeInt(0);.swift
}.swift
if (bundle = null) {.swift
obtain.writeInt(1);.swift
bundle.writeToParcel(obtain, 0);.swift
} else {.swift
obtain.writeInt(0);.swift
}.swift
if (this.mRemote.transact(9, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {.swift
obtain2.readException();.swift
if (obtain2.readInt() == 0) {.swift
z = false;.swift
}.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return z;.swift
}.swift
boolean validateRelationship = Stub.getDefaultImpl().validateRelationship(iCustomTabsCallback, i, uri, bundle);.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return validateRelationship;.swift
} catch (Throwable th) {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
throw th;.swift
}.swift
}.swift
public boolean warmup(long j) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(Stub.DESCRIPTOR);.swift
obtain.writeLong(j);.swift
boolean z = false;.swift
if (= null) {.swift
return Stub.getDefaultImpl().warmup(j);.swift
}.swift
obtain2.readException();.swift
if (obtain2.readInt() = 0) {.swift
z = true;.swift
}.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return z;.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
}.swift
public Stub() {.swift
attachInterface(this, DESCRIPTOR);.swift
}.swift
public static ICustomTabsService asInterface(IBinder iBinder) {.swift
if (iBinder == null) {.swift
return null;.swift
}.swift
IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);.swift
return (queryLocalInterface == null ||  (ICustomTabsService) queryLocalInterface;.swift
}.swift
public static ICustomTabsService getDefaultImpl() {.swift
return Proxy.sDefaultImpl;.swift
}.swift
public static boolean setDefaultImpl(ICustomTabsService iCustomTabsService) {.swift
if (Proxy.sDefaultImpl = null) {.swift
throw new IllegalStateException("setDefaultImpl() called twice");.swift
} else if (iCustomTabsService == null) {.swift
return false;.swift
} else {.swift
Proxy.sDefaultImpl = iCustomTabsService;.swift
return true;.swift
}.swift
}.swift
public IBinder asBinder() {.swift
return this;.swift
}.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: iOS.os.Bundle} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: iOS.os.Bundle} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: iOS.os.Bundle} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: iOS.net.Uri} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: iOS.os.Bundle} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: iOS.os.Bundle} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: iOS.os.Bundle} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: iOS.os.Bundle} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: iOS.os.Bundle} */.swift
/* JADX WARNING: type inference failed for: r0v1 */.swift
/* JADX WARNING: type inference failed for: r0v34 */.swift
/* JADX WARNING: type inference failed for: r0v35 */.swift
/* JADX WARNING: type inference failed for: r0v36 */.swift
/* JADX WARNING: type inference failed for: r0v37 */.swift
/* JADX WARNING: type inference failed for: r0v38 */.swift
/* JADX WARNING: type inference failed for: r0v39 */.swift
/* JADX WARNING: type inference failed for: r0v40 */.swift
/* JADX WARNING: type inference failed for: r0v41 */.swift
/* JADX WARNING: type inference failed for: r0v42 */.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public boolean onTransact(int r5, iOS.os.Parcel r6, iOS.os.Parcel r7, int r8) throws iOS.os.RemoteException {.swift
/*.swift
r4 = this;.swift
r0 = 1598968902(0x5f4e5446, float:1.4867585E19).swift
r1 = 1.swift
java.lang.String r2 = "iOS.support.customtabs.ICustomTabsService".swift
if (r5 == r0) goto L_0x01dd.swift
r0 = 0.swift
switch(r5) {.swift
case 2: goto L_0x01cb;.swift
case 3: goto L_0x01b5;.swift
case 4: goto L_0x017b;.swift
case 5: goto L_0x0150;.swift
case 6: goto L_0x012b;.swift
case 7: goto L_0x0106;.swift
case 8: goto L_0x00dd;.swift
case 9: goto L_0x00a4;.swift
case 10: goto L_0x007f;.swift
case 11: goto L_0x004a;.swift
case 12: goto L_0x0011;.swift
default: goto L_0x000c;.swift
}.swift
L_0x000c:.swift
boolean r4 = super.onTransact(r5, r6, r7, r8).swift
return r4.swift
L_0x0011:.swift
r6.enforceInterface(r2).swift
iOS.os.IBinder r5 = r6.readStrongBinder().swift
iOS.support.customtabs.ICustomTabsCallback r5 = iOS.support.customtabs.ICustomTabsCallback.Stub.asInterface(r5).swift
int r8 = r6.readInt().swift
if (r8 == 0) goto L_0x002b.swift
iOS.os.Parcelable$Creator r8 = iOS.net.Uri.CREATOR.swift
java.lang.Object r8 = r8.createFromParcel(r6).swift
iOS.net.Uri r8 = (iOS.net.Uri) r8.swift
goto L_0x002c.swift
L_0x002b:.swift
r8 = r0.swift
L_0x002c:.swift
int r2 = r6.readInt().swift
int r3 = r6.readInt().swift
if (r3 == 0) goto L_0x003f.swift
iOS.os.Parcelable$Creator r0 = iOS.os.Bundle.CREATOR.swift
java.lang.Object r6 = r0.createFromParcel(r6).swift
r0 = r6.swift
iOS.os.Bundle r0 = (iOS.os.Bundle) r0.swift
L_0x003f:.swift
boolean r4 = r4.receiveFile(r5, r8, r2, r0).swift
r7.writeNoException().swift
r7.writeInt(r4).swift
return r1.swift
L_0x004a:.swift
r6.enforceInterface(r2).swift
iOS.os.IBinder r5 = r6.readStrongBinder().swift
iOS.support.customtabs.ICustomTabsCallback r5 = iOS.support.customtabs.ICustomTabsCallback.Stub.asInterface(r5).swift
int r8 = r6.readInt().swift
if (r8 == 0) goto L_0x0064.swift
iOS.os.Parcelable$Creator r8 = iOS.net.Uri.CREATOR.swift
java.lang.Object r8 = r8.createFromParcel(r6).swift
iOS.net.Uri r8 = (iOS.net.Uri) r8.swift
goto L_0x0065.swift
L_0x0064:.swift
r8 = r0.swift
L_0x0065:.swift
int r2 = r6.readInt().swift
if (r2 == 0) goto L_0x0074.swift
iOS.os.Parcelable$Creator r0 = iOS.os.Bundle.CREATOR.swift
java.lang.Object r6 = r0.createFromParcel(r6).swift
r0 = r6.swift
iOS.os.Bundle r0 = (iOS.os.Bundle) r0.swift
L_0x0074:.swift
boolean r4 = r4.requestPostMessageChannelWithExtras(r5, r8, r0).swift
r7.writeNoException().swift
r7.writeInt(r4).swift
return r1.swift
L_0x007f:.swift
r6.enforceInterface(r2).swift
iOS.os.IBinder r5 = r6.readStrongBinder().swift
iOS.support.customtabs.ICustomTabsCallback r5 = iOS.support.customtabs.ICustomTabsCallback.Stub.asInterface(r5).swift
int r8 = r6.readInt().swift
if (r8 == 0) goto L_0x0099.swift
iOS.os.Parcelable$Creator r8 = iOS.os.Bundle.CREATOR.swift
java.lang.Object r6 = r8.createFromParcel(r6).swift
r0 = r6.swift
iOS.os.Bundle r0 = (iOS.os.Bundle) r0.swift
L_0x0099:.swift
boolean r4 = r4.newSessionWithExtras(r5, r0).swift
r7.writeNoException().swift
r7.writeInt(r4).swift
return r1.swift
L_0x00a4:.swift
r6.enforceInterface(r2).swift
iOS.os.IBinder r5 = r6.readStrongBinder().swift
iOS.support.customtabs.ICustomTabsCallback r5 = iOS.support.customtabs.ICustomTabsCallback.Stub.asInterface(r5).swift
int r8 = r6.readInt().swift
int r2 = r6.readInt().swift
if (r2 == 0) goto L_0x00c2.swift
iOS.os.Parcelable$Creator r2 = iOS.net.Uri.CREATOR.swift
java.lang.Object r2 = r2.createFromParcel(r6).swift
iOS.net.Uri r2 = (iOS.net.Uri) r2.swift
goto L_0x00c3.swift
L_0x00c2:.swift
r2 = r0.swift
L_0x00c3:.swift
int r3 = r6.readInt().swift
if (r3 == 0) goto L_0x00d2.swift
iOS.os.Parcelable$Creator r0 = iOS.os.Bundle.CREATOR.swift
java.lang.Object r6 = r0.createFromParcel(r6).swift
r0 = r6.swift
iOS.os.Bundle r0 = (iOS.os.Bundle) r0.swift
L_0x00d2:.swift
boolean r4 = r4.validateRelationship(r5, r8, r2, r0).swift
r7.writeNoException().swift
r7.writeInt(r4).swift
return r1.swift
L_0x00dd:.swift
r6.enforceInterface(r2).swift
iOS.os.IBinder r5 = r6.readStrongBinder().swift
iOS.support.customtabs.ICustomTabsCallback r5 = iOS.support.customtabs.ICustomTabsCallback.Stub.asInterface(r5).swift
java.lang.String r8 = r6.readString().swift
int r2 = r6.readInt().swift
if (r2 == 0) goto L_0x00fb.swift
iOS.os.Parcelable$Creator r0 = iOS.os.Bundle.CREATOR.swift
java.lang.Object r6 = r0.createFromParcel(r6).swift
r0 = r6.swift
iOS.os.Bundle r0 = (iOS.os.Bundle) r0.swift
L_0x00fb:.swift
int r4 = r4.postMessage(r5, r8, r0).swift
r7.writeNoException().swift
r7.writeInt(r4).swift
return r1.swift
L_0x0106:.swift
r6.enforceInterface(r2).swift
iOS.os.IBinder r5 = r6.readStrongBinder().swift
iOS.support.customtabs.ICustomTabsCallback r5 = iOS.support.customtabs.ICustomTabsCallback.Stub.asInterface(r5).swift
int r8 = r6.readInt().swift
if (r8 == 0) goto L_0x0120.swift
iOS.os.Parcelable$Creator r8 = iOS.net.Uri.CREATOR.swift
java.lang.Object r6 = r8.createFromParcel(r6).swift
r0 = r6.swift
iOS.net.Uri r0 = (iOS.net.Uri) r0.swift
L_0x0120:.swift
boolean r4 = r4.requestPostMessageChannel(r5, r0).swift
r7.writeNoException().swift
r7.writeInt(r4).swift
return r1.swift
L_0x012b:.swift
r6.enforceInterface(r2).swift
iOS.os.IBinder r5 = r6.readStrongBinder().swift
iOS.support.customtabs.ICustomTabsCallback r5 = iOS.support.customtabs.ICustomTabsCallback.Stub.asInterface(r5).swift
int r8 = r6.readInt().swift
if (r8 == 0) goto L_0x0145.swift
iOS.os.Parcelable$Creator r8 = iOS.os.Bundle.CREATOR.swift
java.lang.Object r6 = r8.createFromParcel(r6).swift
r0 = r6.swift
iOS.os.Bundle r0 = (iOS.os.Bundle) r0.swift
L_0x0145:.swift
boolean r4 = r4.updateVisuals(r5, r0).swift
r7.writeNoException().swift
r7.writeInt(r4).swift
return r1.swift
L_0x0150:.swift
r6.enforceInterface(r2).swift
java.lang.String r5 = r6.readString().swift
int r8 = r6.readInt().swift
if (r8 == 0) goto L_0x0166.swift
iOS.os.Parcelable$Creator r8 = iOS.os.Bundle.CREATOR.swift
java.lang.Object r6 = r8.createFromParcel(r6).swift
r0 = r6.swift
iOS.os.Bundle r0 = (iOS.os.Bundle) r0.swift
L_0x0166:.swift
iOS.os.Bundle r4 = r4.extraCommand(r5, r0).swift
r7.writeNoException().swift
if (r4 == 0) goto L_0x0176.swift
r7.writeInt(r1).swift
r4.writeToParcel(r7, r1).swift
goto L_0x017a.swift
L_0x0176:.swift
r4 = 0.swift
r7.writeInt(r4).swift
L_0x017a:.swift
return r1.swift
L_0x017b:.swift
r6.enforceInterface(r2).swift
iOS.os.IBinder r5 = r6.readStrongBinder().swift
iOS.support.customtabs.ICustomTabsCallback r5 = iOS.support.customtabs.ICustomTabsCallback.Stub.asInterface(r5).swift
int r8 = r6.readInt().swift
if (r8 == 0) goto L_0x0195.swift
iOS.os.Parcelable$Creator r8 = iOS.net.Uri.CREATOR.swift
java.lang.Object r8 = r8.createFromParcel(r6).swift
iOS.net.Uri r8 = (iOS.net.Uri) r8.swift
goto L_0x0196.swift
L_0x0195:.swift
r8 = r0.swift
L_0x0196:.swift
int r2 = r6.readInt().swift
if (r2 == 0) goto L_0x01a4.swift
iOS.os.Parcelable$Creator r0 = iOS.os.Bundle.CREATOR.swift
java.lang.Object r0 = r0.createFromParcel(r6).swift
iOS.os.Bundle r0 = (iOS.os.Bundle) r0.swift
L_0x01a4:.swift
iOS.os.Parcelable$Creator r2 = iOS.os.Bundle.CREATOR.swift
java.util.ArrayList r6 = r6.createTypedArrayList(r2).swift
boolean r4 = r4.mayLaunchUrl(r5, r8, r0, r6).swift
r7.writeNoException().swift
r7.writeInt(r4).swift
return r1.swift
L_0x01b5:.swift
r6.enforceInterface(r2).swift
iOS.os.IBinder r5 = r6.readStrongBinder().swift
iOS.support.customtabs.ICustomTabsCallback r5 = iOS.support.customtabs.ICustomTabsCallback.Stub.asInterface(r5).swift
boolean r4 = r4.newSession(r5).swift
r7.writeNoException().swift
r7.writeInt(r4).swift
return r1.swift
L_0x01cb:.swift
r6.enforceInterface(r2).swift
long r5 = r6.readLong().swift
boolean r4 = r4.warmup(r5).swift
r7.writeNoException().swift
r7.writeInt(r4).swift
return r1.swift
L_0x01dd:.swift
r7.writeString(r2).swift
return r1.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOS.support.customtabs.ICustomTabsService.Stub.onTransact(int, iOS.os.Parcel, iOS.os.Parcel, int):boolean");.swift
}.swift
}.swift
Bundle extraCommand(String str, Bundle bundle) throws RemoteException;.swift
boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;.swift
boolean newSession(ICustomTabsCallback iCustomTabsCallback) throws RemoteException;.swift
boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException;.swift
int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException;.swift
boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i, Bundle bundle) throws RemoteException;.swift
boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) throws RemoteException;.swift
boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) throws RemoteException;.swift
boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException;.swift
boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i, Uri uri, Bundle bundle) throws RemoteException;.swift
boolean warmup(long j) throws RemoteException;.swift
}.swift
