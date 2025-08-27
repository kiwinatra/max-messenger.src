package ru.ok.messages.controllers;

import android.content.Context;
import android.content.Intent;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ru/ok/messages/controllers/NotificationDraftScheduler$TaskNotificationDraftWorker", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Llu4;", "draftsNotifications", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Llu4;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class NotificationDraftScheduler$TaskNotificationDraftWorker extends Worker {
    public final lu4 b;

    public NotificationDraftScheduler$TaskNotificationDraftWorker(Context context, WorkerParameters workerParameters, lu4 lu4) {
        super(context, workerParameters);
        this.b = lu4;
    }

    public final d08 b() {
        String str;
        Intent j;
        int i = fqc.g;
        UUID id = getId();
        z68.c("fqc", "work " + id + " started", new Object[0]);
        mu4 mu4 = (mu4) this.b;
        mu4.getClass();
        z68.c("mu4", "notifyDrafts", new Object[0]);
        ArrayList arrayList = new ArrayList();
        eaf.a().getClass();
        r62 g = ((sjd) eaf.b()).g();
        v00 v00 = r62.I;
        ArrayList H = g.H(r62.M, true, (osb) null);
        Collections.sort(H, v00);
        for (a32 a32 : Collections.unmodifiableList(H)) {
            pt4 pt4 = a32.b.f0;
            if (pt4 instanceof rt4) {
                ((rt4) pt4).getClass();
                arrayList.add(a32);
            }
        }
        if (arrayList.isEmpty()) {
            z68.c("mu4", "notifyDrafts: no drafts", new Object[0]);
        } else {
            ltb ltb = mu4.b;
            ltb.a.i("app.draftsChanged", false);
            int size = arrayList.size();
            pwa pwa = mu4.c;
            Context context = mu4.a;
            if (size > 1) {
                z68.c("mu4", "notifyDrafts: multiple chats", new Object[0]);
                str = String.format(context.getString(qad.e6), new Object[]{Integer.valueOf(arrayList.size())});
                j = pwa.f(false);
            } else {
                a32 a322 = (a32) arrayList.get(0);
                if (!a322.N() || a322.m() == null) {
                    z68.c("mu4", "notifyDrafts: chat", new Object[0]);
                    String string = context.getString(qad.c6);
                    String str2 = a322.b.g;
                    int i2 = fhf.a;
                    str = String.format(string, new Object[]{(str2 == null || str2.length() == 0) ? "" : wj6.k("\"", str2, "\"")});
                } else {
                    z68.c("mu4", "notifyDrafts: dialog", new Object[0]);
                    str = String.format(context.getString(qad.d6), new Object[]{a322.m().f()});
                }
                pwa.getClass();
                zb8.b.getClass();
                j = pwa.j(new pa4(wj6.m(new StringBuilder(":chats?id="), a322.a, "&type=local")));
            }
            Intent intent = j;
            mu4.d.getClass();
            ltb.c.getClass();
            eda h = pwa.h(false, "ru.oneme.app.misc", false);
            h.e(str);
            cda cda = new cda(0);
            cda.f = eda.c(str);
            h.q(cda);
            ((jwa) pwa.d.getValue()).getClass();
            pwa.k(h, intent, (Intent) null, 2, (String) null);
        }
        int i3 = fqc.g;
        UUID id2 = getId();
        z68.c("fqc", "work " + id2 + " finished", new Object[0]);
        return d08.b();
    }
}
