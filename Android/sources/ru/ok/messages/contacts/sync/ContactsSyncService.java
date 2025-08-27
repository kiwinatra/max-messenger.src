package ru.ok.messages.contacts.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class ContactsSyncService extends Service {
    public final IBinder onBind(Intent intent) {
        return ((tu3) ((qra) ym.e()).getAccessor().g(tu3.class)).getSyncAdapterBinder();
    }
}
