package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: sea  reason: default package */
public final class sea implements Handler.Callback, ServiceConnection {
    public final Context a;
    public final Handler b;
    public final HashMap c = new HashMap();
    public HashSet o = new HashSet();

    public sea(Context context) {
        this.a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(rea rea) {
        boolean z;
        ArrayDeque arrayDeque;
        boolean isLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = rea.a;
        if (isLoggable) {
            Objects.toString(componentName);
            rea.d.size();
        }
        if (!rea.d.isEmpty()) {
            if (rea.b) {
                z = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.a;
                boolean bindService = context.bindService(component, this, 33);
                rea.b = bindService;
                if (bindService) {
                    rea.e = 0;
                } else {
                    Objects.toString(componentName);
                    context.unbindService(this);
                }
                z = rea.b;
            }
            if (!z || rea.c == null) {
                b(rea);
                return;
            }
            while (true) {
                arrayDeque = rea.d;
                pea pea = (pea) arrayDeque.peek();
                if (pea == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        pea.toString();
                    }
                    pea.a(rea.c);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(componentName);
                    }
                } catch (RemoteException unused2) {
                    Objects.toString(componentName);
                }
            }
            if (!arrayDeque.isEmpty()) {
                b(rea);
            }
        }
    }

    public final void b(rea rea) {
        Handler handler = this.b;
        ComponentName componentName = rea.a;
        if (!handler.hasMessages(3, componentName)) {
            int i = rea.e;
            int i2 = i + 1;
            rea.e = i2;
            if (i2 > 6) {
                ArrayDeque arrayDeque = rea.d;
                arrayDeque.size();
                Objects.toString(componentName);
                arrayDeque.clear();
                return;
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (long) ((1 << i) * 1000));
        }
    }

    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        if (i == 0) {
            pea pea = (pea) message.obj;
            String string = Settings.Secure.getString(this.a.getContentResolver(), "enabled_notification_listeners");
            synchronized (tea.c) {
                if (string != null) {
                    try {
                        if (!string.equals(tea.d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String unflattenFromString : split) {
                                ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                                if (unflattenFromString2 != null) {
                                    hashSet2.add(unflattenFromString2.getPackageName());
                                }
                            }
                            tea.e = hashSet2;
                            tea.d = string;
                        }
                    } finally {
                        while (true) {
                        }
                    }
                }
                hashSet = tea.e;
            }
            if (!hashSet.equals(this.o)) {
                this.o = hashSet;
                List<ResolveInfo> queryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo next : queryIntentServices) {
                    if (hashSet.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            componentName.toString();
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    if (!this.c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName2);
                        }
                        this.c.put(componentName2, new rea(componentName2));
                    }
                }
                Iterator it2 = this.c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(entry.getKey());
                        }
                        rea rea = (rea) entry.getValue();
                        if (rea.b) {
                            this.a.unbindService(this);
                            rea.b = false;
                        }
                        rea.c = null;
                        it2.remove();
                    }
                }
            }
            for (rea rea2 : this.c.values()) {
                rea2.d.add(pea);
                a(rea2);
            }
            return true;
        } else if (i == 1) {
            qea qea = (qea) message.obj;
            ComponentName componentName3 = qea.a;
            IBinder iBinder = qea.b;
            rea rea3 = (rea) this.c.get(componentName3);
            if (rea3 != null) {
                rea3.c = INotificationSideChannel.Stub.asInterface(iBinder);
                rea3.e = 0;
                a(rea3);
            }
            return true;
        } else if (i == 2) {
            rea rea4 = (rea) this.c.get((ComponentName) message.obj);
            if (rea4 != null) {
                if (rea4.b) {
                    this.a.unbindService(this);
                    rea4.b = false;
                }
                rea4.c = null;
            }
            return true;
        } else if (i != 3) {
            return false;
        } else {
            rea rea5 = (rea) this.c.get((ComponentName) message.obj);
            if (rea5 != null) {
                a(rea5);
            }
            return true;
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.b.obtainMessage(1, new qea(componentName, iBinder)).sendToTarget();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.b.obtainMessage(2, componentName).sendToTarget();
    }
}
