package ru.ok.android.externcalls.sdk.contacts;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.contacts.listener.ContactCallListener;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/contacts/ContactCallManager;", "", "iAmAnonymous", "", "getIAmAnonymous", "()Z", "iWasInitiallyAnonymous", "getIWasInitiallyAnonymous", "addContactCallListener", "", "listener", "Lru/ok/android/externcalls/sdk/contacts/listener/ContactCallListener;", "removeContactCallListener", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ContactCallManager {
    void addContactCallListener(ContactCallListener contactCallListener);

    boolean getIAmAnonymous();

    boolean getIWasInitiallyAnonymous();

    void removeContactCallListener(ContactCallListener contactCallListener);
}
