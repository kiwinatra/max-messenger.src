package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: jda  reason: default package */
public final class jda extends sda {
    public final int e;
    public final ldb f;
    public final PendingIntent g;
    public final PendingIntent h;
    public final PendingIntent i;

    public jda(int i2, ldb ldb, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
        if (!TextUtils.isEmpty(ldb.a)) {
            this.e = i2;
            this.f = ldb;
            this.g = pendingIntent3;
            this.h = pendingIntent2;
            this.i = pendingIntent;
            return;
        }
        throw new IllegalArgumentException("person must have a non-empty a name");
    }

    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putInt("android.callType", this.e);
        bundle.putBoolean("android.callIsVideo", false);
        ldb ldb = this.f;
        if (ldb != null) {
            bundle.putParcelable("android.callPerson", hda.b(kdb.b(ldb)));
        }
        bundle.putCharSequence("android.verificationText", (CharSequence) null);
        bundle.putParcelable("android.answerIntent", this.g);
        bundle.putParcelable("android.declineIntent", this.h);
        bundle.putParcelable("android.hangUpIntent", this.i);
    }

    public final void b(tgg tgg) {
        Notification.CallStyle callStyle;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.e;
        ldb ldb = this.f;
        Notification.Builder builder = (Notification.Builder) tgg.b;
        CharSequence charSequence = null;
        if (i2 >= 31) {
            PendingIntent pendingIntent = this.g;
            if (i3 != 1) {
                PendingIntent pendingIntent2 = this.i;
                if (i3 == 2) {
                    ldb.getClass();
                    callStyle = ida.b(kdb.b(ldb), pendingIntent2);
                } else if (i3 != 3) {
                    if (Log.isLoggable("NotifCompat", 3)) {
                        String.valueOf(i3);
                    }
                    callStyle = null;
                } else {
                    ldb.getClass();
                    callStyle = ida.c(kdb.b(ldb), pendingIntent2, pendingIntent);
                }
            } else {
                ldb.getClass();
                callStyle = ida.a(kdb.b(ldb), this.h, pendingIntent);
            }
            if (callStyle != null) {
                callStyle.setBuilder(builder);
                ida.i(callStyle, (CharSequence) null);
                ida.g(callStyle, false);
                return;
            }
            return;
        }
        builder.setContentTitle(ldb != null ? ldb.a : null);
        Bundle bundle = ((eda) this.b).w;
        CharSequence charSequence2 = (bundle == null || !bundle.containsKey("android.text")) ? null : ((eda) this.b).w.getCharSequence("android.text");
        if (charSequence2 == null) {
            if (i3 == 1) {
                charSequence = ((eda) this.b).a.getResources().getString(alc.call_notification_incoming_text);
            } else if (i3 == 2) {
                charSequence = ((eda) this.b).a.getResources().getString(alc.call_notification_ongoing_text);
            } else if (i3 == 3) {
                charSequence = ((eda) this.b).a.getResources().getString(alc.call_notification_screening_text);
            }
            charSequence2 = charSequence;
        }
        builder.setContentText(charSequence2);
        if (ldb != null) {
            IconCompat iconCompat = ldb.b;
            if (iconCompat != null) {
                gda.c(builder, v67.d(iconCompat, ((eda) this.b).a));
            }
            hda.a(builder, kdb.b(ldb));
        }
        fda.b(builder, "call");
    }

    public final String e() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    public final qca p(int i2, int i3, int i4, PendingIntent pendingIntent) {
        Integer valueOf = Integer.valueOf(fw3.a(((eda) this.b).a, i4));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(((eda) this.b).a.getResources().getString(i3));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(valueOf.intValue()), 0, spannableStringBuilder.length(), 18);
        qca a = new pca(IconCompat.c(i2, ((eda) this.b).a), spannableStringBuilder, pendingIntent, new Bundle()).a();
        a.a.putBoolean("key_action_priority", true);
        return a;
    }
}
