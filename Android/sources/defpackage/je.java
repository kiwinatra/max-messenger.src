package defpackage;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.text.StringsKt;

/* renamed from: je  reason: default package */
public final class je extends Handler {
    public static final je a = new Handler();

    public final void close() {
    }

    public final void flush() {
    }

    public final void publish(LogRecord logRecord) {
        int min;
        CopyOnWriteArraySet copyOnWriteArraySet = ie.a;
        String loggerName = logRecord.getLoggerName();
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        Throwable thrown = logRecord.getThrown();
        String str = (String) ie.b.get(loggerName);
        if (str == null) {
            str = StringsKt.take(loggerName, 23);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                StringBuilder m = g63.m(message, "\n");
                m.append(Log.getStackTraceString(thrown));
                message = m.toString();
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int k = StringsKt__StringsKt.indexOf$default((CharSequence) message, 10, i2, false, 4, (Object) null);
                if (k == -1) {
                    k = length;
                }
                while (true) {
                    min = Math.min(k, i2 + 4000);
                    message.substring(i2, min);
                    if (min >= k) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }
}
