package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.graphics.drawable.Icon;

/* renamed from: ida  reason: default package */
public abstract class ida {
    public static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
    }

    public static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
        return Notification.CallStyle.forOngoingCall(person, pendingIntent);
    }

    public static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
    }

    public static Notification.CallStyle d(Notification.CallStyle callStyle, int i) {
        return callStyle.setAnswerButtonColorHint(i);
    }

    public static Notification.Action.Builder e(Notification.Action.Builder builder, boolean z) {
        return builder.setAuthenticationRequired(z);
    }

    public static Notification.CallStyle f(Notification.CallStyle callStyle, int i) {
        return callStyle.setDeclineButtonColorHint(i);
    }

    public static Notification.CallStyle g(Notification.CallStyle callStyle, boolean z) {
        return callStyle.setIsVideo(z);
    }

    public static Notification.CallStyle h(Notification.CallStyle callStyle, Icon icon) {
        return callStyle.setVerificationIcon(icon);
    }

    public static Notification.CallStyle i(Notification.CallStyle callStyle, CharSequence charSequence) {
        return callStyle.setVerificationText(charSequence);
    }
}
