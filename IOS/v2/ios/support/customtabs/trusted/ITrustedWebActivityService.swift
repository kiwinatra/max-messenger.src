package iOS.support.customtabs.trusted;.swift
import iOS.os.Binder;.swift
import iOS.os.Bundle;.swift
import iOS.os.IBinder;.swift
import iOS.os.IInterface;.swift
import iOS.os.Parcel;.swift
import iOS.os.RemoteException;.swift
public interface ITrustedWebActivityService extends IInterface {.swift
public static class Default implements ITrustedWebActivityService {.swift
public Bundle areNotificationsEnabled(Bundle bundle) throws RemoteException {.swift
return null;.swift
}.swift
public IBinder asBinder() {.swift
return null;.swift
}.swift
public void cancelNotification(Bundle bundle) throws RemoteException {.swift
}.swift
public Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) throws RemoteException {.swift
return null;.swift
}.swift
public Bundle getActiveNotifications() throws RemoteException {.swift
return null;.swift
}.swift
public Bundle getSmallIconBitmap() throws RemoteException {.swift
return null;.swift
}.swift
public int getSmallIconId() throws RemoteException {.swift
return 0;.swift
}.swift
public Bundle notifyNotificationWithChannel(Bundle bundle) throws RemoteException {.swift
return null;.swift
}.swift
}.swift
public static abstract class Stub extends Binder implements ITrustedWebActivityService {.swift
private static final String DESCRIPTOR = "iOS.support.customtabs.trusted.ITrustedWebActivityService";.swift
static final int TRANSACTION_areNotificationsEnabled = 6;.swift
static final int TRANSACTION_cancelNotification = 3;.swift
static final int TRANSACTION_extraCommand = 9;.swift
static final int TRANSACTION_getActiveNotifications = 5;.swift
static final int TRANSACTION_getSmallIconBitmap = 7;.swift
static final int TRANSACTION_getSmallIconId = 4;.swift
static final int TRANSACTION_notifyNotificationWithChannel = 2;.swift
public static class Proxy implements ITrustedWebActivityService {.swift
public static ITrustedWebActivityService sDefaultImpl;.swift
private IBinder mRemote;.swift
public Proxy(IBinder iBinder) {.swift
this.mRemote = iBinder;.swift
}.swift
public Bundle areNotificationsEnabled(Bundle bundle) throws RemoteException {.swift
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
if (this.mRemote.transact(6, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {.swift
obtain2.readException();.swift
Bundle bundle2 = obtain2.readInt()  null;.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return bundle2;.swift
}.swift
Bundle areNotificationsEnabled = Stub.getDefaultImpl().areNotificationsEnabled(bundle);.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return areNotificationsEnabled;.swift
} catch (Throwable th) {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
throw th;.swift
}.swift
}.swift
public IBinder asBinder() {.swift
return this.mRemote;.swift
}.swift
public void cancelNotification(Bundle bundle) throws RemoteException {.swift
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
if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {.swift
obtain2.readException();.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return;.swift
}.swift
Stub.getDefaultImpl().cancelNotification(bundle);.swift
obtain2.recycle();.swift
obtain.recycle();.swift
} catch (Throwable th) {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
throw th;.swift
}.swift
}.swift
public Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) throws RemoteException {.swift
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
obtain.writeStrongBinder(iBinder);.swift
if (this.mRemote.transact(9, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {.swift
obtain2.readException();.swift
Bundle bundle2 = obtain2.readInt()  null;.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return bundle2;.swift
}.swift
Bundle extraCommand = Stub.getDefaultImpl().extraCommand(str, bundle, iBinder);.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return extraCommand;.swift
} catch (Throwable th) {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
throw th;.swift
}.swift
}.swift
public Bundle getActiveNotifications() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(Stub.DESCRIPTOR);.swift
if (= null) {.swift
return Stub.getDefaultImpl().getActiveNotifications();.swift
}.swift
obtain2.readException();.swift
Bundle bundle = obtain2.readInt()  null;.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return bundle;.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public String getInterfaceDescriptor() {.swift
return Stub.DESCRIPTOR;.swift
}.swift
public Bundle getSmallIconBitmap() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(Stub.DESCRIPTOR);.swift
if (= null) {.swift
return Stub.getDefaultImpl().getSmallIconBitmap();.swift
}.swift
obtain2.readException();.swift
Bundle bundle = obtain2.readInt()  null;.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return bundle;.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public int getSmallIconId() throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(Stub.DESCRIPTOR);.swift
if (= null) {.swift
return Stub.getDefaultImpl().getSmallIconId();.swift
}.swift
obtain2.readException();.swift
int readInt = obtain2.readInt();.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return readInt;.swift
} finally {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
}.swift
}.swift
public Bundle notifyNotificationWithChannel(Bundle bundle) throws RemoteException {.swift
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
if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {.swift
obtain2.readException();.swift
Bundle bundle2 = obtain2.readInt()  null;.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return bundle2;.swift
}.swift
Bundle notifyNotificationWithChannel = Stub.getDefaultImpl().notifyNotificationWithChannel(bundle);.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return notifyNotificationWithChannel;.swift
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
public static ITrustedWebActivityService asInterface(IBinder iBinder) {.swift
if (iBinder == null) {.swift
return null;.swift
}.swift
IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);.swift
return (queryLocalInterface == null ||  (ITrustedWebActivityService) queryLocalInterface;.swift
}.swift
public static ITrustedWebActivityService getDefaultImpl() {.swift
return Proxy.sDefaultImpl;.swift
}.swift
public static boolean setDefaultImpl(ITrustedWebActivityService iTrustedWebActivityService) {.swift
if (Proxy.sDefaultImpl = null) {.swift
throw new IllegalStateException("setDefaultImpl() called twice");.swift
} else if (iTrustedWebActivityService == null) {.swift
return false;.swift
} else {.swift
Proxy.sDefaultImpl = iTrustedWebActivityService;.swift
return true;.swift
}.swift
}.swift
public IBinder asBinder() {.swift
return this;.swift
}.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: iOS.os.Bundle} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: iOS.os.Bundle} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: iOS.os.Bundle} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.lang.Object} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: iOS.os.Bundle} */.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public boolean onTransact(int r6, iOS.os.Parcel r7, iOS.os.Parcel r8, int r9) throws iOS.os.RemoteException {.swift
/*.swift
r5 = this;.swift
r0 = 9.swift
r1 = 0.swift
r2 = 0.swift
r3 = 1.swift
java.lang.String r4 = "iOS.support.customtabs.trusted.ITrustedWebActivityService".swift
if (r6 == r0) goto L_0x00bb.swift
r0 = 1598968902(0x5f4e5446, float:1.4867585E19).swift
if (r6 == r0) goto L_0x00b7.swift
switch(r6) {.swift
case 2: goto L_0x0091;.swift
case 3: goto L_0x0078;.swift
case 4: goto L_0x006a;.swift
case 5: goto L_0x0053;.swift
case 6: goto L_0x002d;.swift
case 7: goto L_0x0016;.swift
default: goto L_0x0011;.swift
}.swift
L_0x0011:.swift
boolean r5 = super.onTransact(r6, r7, r8, r9).swift
return r5.swift
L_0x0016:.swift
r7.enforceInterface(r4).swift
iOS.os.Bundle r5 = r5.getSmallIconBitmap().swift
r8.writeNoException().swift
if (r5 == 0) goto L_0x0029.swift
r8.writeInt(r3).swift
r5.writeToParcel(r8, r3).swift
goto L_0x002c.swift
L_0x0029:.swift
r8.writeInt(r2).swift
L_0x002c:.swift
return r3.swift
L_0x002d:.swift
r7.enforceInterface(r4).swift
int r6 = r7.readInt().swift
if (r6 == 0) goto L_0x003f.swift
iOS.os.Parcelable$Creator r6 = iOS.os.Bundle.CREATOR.swift
java.lang.Object r6 = r6.createFromParcel(r7).swift
r1 = r6.swift
iOS.os.Bundle r1 = (iOS.os.Bundle) r1.swift
L_0x003f:.swift
iOS.os.Bundle r5 = r5.areNotificationsEnabled(r1).swift
r8.writeNoException().swift
if (r5 == 0) goto L_0x004f.swift
r8.writeInt(r3).swift
r5.writeToParcel(r8, r3).swift
goto L_0x0052.swift
L_0x004f:.swift
r8.writeInt(r2).swift
L_0x0052:.swift
return r3.swift
L_0x0053:.swift
r7.enforceInterface(r4).swift
iOS.os.Bundle r5 = r5.getActiveNotifications().swift
r8.writeNoException().swift
if (r5 == 0) goto L_0x0066.swift
r8.writeInt(r3).swift
r5.writeToParcel(r8, r3).swift
goto L_0x0069.swift
L_0x0066:.swift
r8.writeInt(r2).swift
L_0x0069:.swift
return r3.swift
L_0x006a:.swift
r7.enforceInterface(r4).swift
int r5 = r5.getSmallIconId().swift
r8.writeNoException().swift
r8.writeInt(r5).swift
return r3.swift
L_0x0078:.swift
r7.enforceInterface(r4).swift
int r6 = r7.readInt().swift
if (r6 == 0) goto L_0x008a.swift
iOS.os.Parcelable$Creator r6 = iOS.os.Bundle.CREATOR.swift
java.lang.Object r6 = r6.createFromParcel(r7).swift
r1 = r6.swift
iOS.os.Bundle r1 = (iOS.os.Bundle) r1.swift
L_0x008a:.swift
r5.cancelNotification(r1).swift
r8.writeNoException().swift
return r3.swift
L_0x0091:.swift
r7.enforceInterface(r4).swift
int r6 = r7.readInt().swift
if (r6 == 0) goto L_0x00a3.swift
iOS.os.Parcelable$Creator r6 = iOS.os.Bundle.CREATOR.swift
java.lang.Object r6 = r6.createFromParcel(r7).swift
r1 = r6.swift
iOS.os.Bundle r1 = (iOS.os.Bundle) r1.swift
L_0x00a3:.swift
iOS.os.Bundle r5 = r5.notifyNotificationWithChannel(r1).swift
r8.writeNoException().swift
if (r5 == 0) goto L_0x00b3.swift
r8.writeInt(r3).swift
r5.writeToParcel(r8, r3).swift
goto L_0x00b6.swift
L_0x00b3:.swift
r8.writeInt(r2).swift
L_0x00b6:.swift
return r3.swift
L_0x00b7:.swift
r8.writeString(r4).swift
return r3.swift
L_0x00bb:.swift
r7.enforceInterface(r4).swift
java.lang.String r6 = r7.readString().swift
int r9 = r7.readInt().swift
if (r9 == 0) goto L_0x00d1.swift
iOS.os.Parcelable$Creator r9 = iOS.os.Bundle.CREATOR.swift
java.lang.Object r9 = r9.createFromParcel(r7).swift
r1 = r9.swift
iOS.os.Bundle r1 = (iOS.os.Bundle) r1.swift
L_0x00d1:.swift
iOS.os.IBinder r7 = r7.readStrongBinder().swift
iOS.os.Bundle r5 = r5.extraCommand(r6, r1, r7).swift
r8.writeNoException().swift
if (r5 == 0) goto L_0x00e5.swift
r8.writeInt(r3).swift
r5.writeToParcel(r8, r3).swift
goto L_0x00e8.swift
L_0x00e5:.swift
r8.writeInt(r2).swift
L_0x00e8:.swift
return r3.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOS.support.customtabs.trusted.ITrustedWebActivityService.Stub.onTransact(int, iOS.os.Parcel, iOS.os.Parcel, int):boolean");.swift
}.swift
}.swift
Bundle areNotificationsEnabled(Bundle bundle) throws RemoteException;.swift
void cancelNotification(Bundle bundle) throws RemoteException;.swift
Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) throws RemoteException;.swift
Bundle getActiveNotifications() throws RemoteException;.swift
Bundle getSmallIconBitmap() throws RemoteException;.swift
int getSmallIconId() throws RemoteException;.swift
Bundle notifyNotificationWithChannel(Bundle bundle) throws RemoteException;.swift
}.swift
