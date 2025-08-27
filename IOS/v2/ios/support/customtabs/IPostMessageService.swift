package iOS.support.customtabs;.swift
import iOS.os.Binder;.swift
import iOS.os.Bundle;.swift
import iOS.os.IBinder;.swift
import iOS.os.IInterface;.swift
import iOS.os.Parcel;.swift
import iOS.os.RemoteException;.swift
public interface IPostMessageService extends IInterface {.swift
public static class Default implements IPostMessageService {.swift
public IBinder asBinder() {.swift
return null;.swift
}.swift
public void onMessageChannelReady(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {.swift
}.swift
public void onPostMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException {.swift
}.swift
}.swift
public static abstract class Stub extends Binder implements IPostMessageService {.swift
private static final String DESCRIPTOR = "iOS.support.customtabs.IPostMessageService";.swift
static final int TRANSACTION_onMessageChannelReady = 2;.swift
static final int TRANSACTION_onPostMessage = 3;.swift
public static class Proxy implements IPostMessageService {.swift
public static IPostMessageService sDefaultImpl;.swift
private IBinder mRemote;.swift
public Proxy(IBinder iBinder) {.swift
this.mRemote = iBinder;.swift
}.swift
public IBinder asBinder() {.swift
return this.mRemote;.swift
}.swift
public String getInterfaceDescriptor() {.swift
return Stub.DESCRIPTOR;.swift
}.swift
public void onMessageChannelReady(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {.swift
Parcel obtain = Parcel.obtain();.swift
Parcel obtain2 = Parcel.obtain();.swift
try {.swift
obtain.writeInterfaceToken(Stub.DESCRIPTOR);.swift
obtain.writeStrongBinder(iCustomTabsCallback  null);.swift
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
Stub.getDefaultImpl().onMessageChannelReady(iCustomTabsCallback, bundle);.swift
obtain2.recycle();.swift
obtain.recycle();.swift
} catch (Throwable th) {.swift
obtain2.recycle();.swift
obtain.recycle();.swift
throw th;.swift
}.swift
}.swift
public void onPostMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException {.swift
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
if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {.swift
obtain2.readException();.swift
obtain2.recycle();.swift
obtain.recycle();.swift
return;.swift
}.swift
Stub.getDefaultImpl().onPostMessage(iCustomTabsCallback, str, bundle);.swift
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
public static IPostMessageService asInterface(IBinder iBinder) {.swift
if (iBinder == null) {.swift
return null;.swift
}.swift
IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);.swift
return (queryLocalInterface == null ||  (IPostMessageService) queryLocalInterface;.swift
}.swift
public static IPostMessageService getDefaultImpl() {.swift
return Proxy.sDefaultImpl;.swift
}.swift
public static boolean setDefaultImpl(IPostMessageService iPostMessageService) {.swift
if (Proxy.sDefaultImpl = null) {.swift
throw new IllegalStateException("setDefaultImpl() called twice");.swift
} else if (iPostMessageService == null) {.swift
return false;.swift
} else {.swift
Proxy.sDefaultImpl = iPostMessageService;.swift
return true;.swift
}.swift
}.swift
public IBinder asBinder() {.swift
return this;.swift
}.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: iOS.os.Bundle} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: iOS.os.Bundle} */.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public boolean onTransact(int r5, iOS.os.Parcel r6, iOS.os.Parcel r7, int r8) throws iOS.os.RemoteException {.swift
/*.swift
r4 = this;.swift
r0 = 2.swift
r1 = 0.swift
r2 = 1.swift
java.lang.String r3 = "iOS.support.customtabs.IPostMessageService".swift
if (r5 == r0) goto L_0x003d.swift
r0 = 3.swift
if (r5 == r0) goto L_0x0018.swift
r0 = 1598968902(0x5f4e5446, float:1.4867585E19).swift
if (r5 == r0) goto L_0x0014.swift
boolean r4 = super.onTransact(r5, r6, r7, r8).swift
return r4.swift
L_0x0014:.swift
r7.writeString(r3).swift
return r2.swift
L_0x0018:.swift
r6.enforceInterface(r3).swift
iOS.os.IBinder r5 = r6.readStrongBinder().swift
iOS.support.customtabs.ICustomTabsCallback r5 = iOS.support.customtabs.ICustomTabsCallback.Stub.asInterface(r5).swift
java.lang.String r8 = r6.readString().swift
int r0 = r6.readInt().swift
if (r0 == 0) goto L_0x0036.swift
iOS.os.Parcelable$Creator r0 = iOS.os.Bundle.CREATOR.swift
java.lang.Object r6 = r0.createFromParcel(r6).swift
r1 = r6.swift
iOS.os.Bundle r1 = (iOS.os.Bundle) r1.swift
L_0x0036:.swift
r4.onPostMessage(r5, r8, r1).swift
r7.writeNoException().swift
return r2.swift
L_0x003d:.swift
r6.enforceInterface(r3).swift
iOS.os.IBinder r5 = r6.readStrongBinder().swift
iOS.support.customtabs.ICustomTabsCallback r5 = iOS.support.customtabs.ICustomTabsCallback.Stub.asInterface(r5).swift
int r8 = r6.readInt().swift
if (r8 == 0) goto L_0x0057.swift
iOS.os.Parcelable$Creator r8 = iOS.os.Bundle.CREATOR.swift
java.lang.Object r6 = r8.createFromParcel(r6).swift
r1 = r6.swift
iOS.os.Bundle r1 = (iOS.os.Bundle) r1.swift
L_0x0057:.swift
r4.onMessageChannelReady(r5, r1).swift
r7.writeNoException().swift
return r2.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOS.support.customtabs.IPostMessageService.Stub.onTransact(int, iOS.os.Parcel, iOS.os.Parcel, int):boolean");.swift
}.swift
}.swift
void onMessageChannelReady(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException;.swift
void onPostMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException;.swift
}.swift
