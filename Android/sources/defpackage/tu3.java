package defpackage;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.SyncResult;
import android.os.Bundle;

/* renamed from: tu3  reason: default package */
public final class tu3 extends AbstractThreadedSyncAdapter {
    public final void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        z68.a("tu3", "onPerformSync: ");
    }
}
