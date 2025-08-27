package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import org.apache.http.HttpStatus;
import ru.ok.messages.views.dev.ActDevOptions;

/* renamed from: kt3  reason: default package */
public final /* synthetic */ class kt3 implements r8 {
    public final /* synthetic */ int a;

    public /* synthetic */ kt3(int i) {
        this.a = i;
    }

    public final void a(e9d e9d) {
        switch (this.a) {
            case 0:
                Intent intent = new Intent("android.intent.action.INSERT");
                intent.setType("vnd.android.cursor.dir/raw_contact");
                intent.putExtra("finishActivityOnSaveCompleted", true);
                try {
                    te8.w(e9d).startActivityForResult(intent, HttpStatus.SC_PROCESSING);
                    return;
                } catch (ActivityNotFoundException unused) {
                    z68.f("ContactsDeepLinkFactory", "createContact: failed, no activity found", (Throwable) null);
                    return;
                }
            default:
                Activity d = e9d.d();
                if (d != null) {
                    int i = ActDevOptions.z0;
                    d.startActivity(new Intent(d, ActDevOptions.class));
                    return;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
