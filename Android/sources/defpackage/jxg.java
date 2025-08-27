package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import java.util.Objects;
import java.util.regex.Matcher;

/* renamed from: jxg  reason: default package */
public final class jxg extends ws9 {
    public final /* synthetic */ m9d b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jxg(m9d m9d, Looper looper) {
        super(looper, 4, false);
        this.b = m9d;
        Looper.getMainLooper();
    }

    public final void handleMessage(Message message) {
        m9d m9d = this.b;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new ozg());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof k0h) {
                        m9d.g = (k0h) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        m9d.f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras()));
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3)) {
                            "Received InstanceID error ".concat(stringExtra2);
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !Objects.equals(split[1], "ID")) {
                                "Unexpected structured response ".concat(stringExtra2);
                                return;
                            }
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            m9d.b(str, intent2.putExtra("error", str2).getExtras());
                            return;
                        }
                        synchronized (m9d.a) {
                            int i = 0;
                            while (true) {
                                try {
                                    qae qae = m9d.a;
                                    if (i < qae.c) {
                                        m9d.b((String) qae.f(i), intent2.getExtras());
                                        i++;
                                    }
                                } finally {
                                }
                            }
                        }
                        return;
                    }
                    Matcher matcher = m9d.j.matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (group != null) {
                            Bundle extras = intent2.getExtras();
                            extras.putString("registration_id", group2);
                            m9d.b(group, extras);
                        }
                    } else if (Log.isLoggable("Rpc", 3)) {
                        "Unexpected response string: ".concat(stringExtra);
                    }
                } else if (Log.isLoggable("Rpc", 3)) {
                    "Unexpected response action: ".concat(String.valueOf(action));
                }
            }
        }
    }
}
