package org.apache.commons.logging.impl;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.logging.Log;

@Deprecated
public class Jdk14Logger implements Log, Serializable {
    public static final /* synthetic */ int a = 0;
    protected static final Level dummyLevel = Level.FINE;
    protected transient Logger logger = null;
    protected String name;

    public Jdk14Logger(String str) {
        this.name = str;
        this.logger = getLogger();
    }

    private void log(Level level, String str, Throwable th) {
        String str2;
        String str3;
        Logger logger2 = getLogger();
        if (logger2.isLoggable(level)) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace == null || stackTrace.length <= 2) {
                str3 = "unknown";
                str2 = str3;
            } else {
                StackTraceElement stackTraceElement = stackTrace[2];
                String className = stackTraceElement.getClassName();
                str2 = stackTraceElement.getMethodName();
                str3 = className;
            }
            if (th == null) {
                logger2.logp(level, str3, str2, str);
            } else {
                logger2.logp(level, str3, str2, str, th);
            }
        }
    }

    public void debug(Object obj) {
        log(Level.FINE, String.valueOf(obj), (Throwable) null);
    }

    public void error(Object obj) {
        log(Level.SEVERE, String.valueOf(obj), (Throwable) null);
    }

    public void fatal(Object obj) {
        log(Level.SEVERE, String.valueOf(obj), (Throwable) null);
    }

    public Logger getLogger() {
        if (this.logger == null) {
            this.logger = Logger.getLogger(this.name);
        }
        return this.logger;
    }

    public void info(Object obj) {
        log(Level.INFO, String.valueOf(obj), (Throwable) null);
    }

    public boolean isDebugEnabled() {
        return getLogger().isLoggable(Level.FINE);
    }

    public boolean isErrorEnabled() {
        return getLogger().isLoggable(Level.SEVERE);
    }

    public boolean isFatalEnabled() {
        return getLogger().isLoggable(Level.SEVERE);
    }

    public boolean isInfoEnabled() {
        return getLogger().isLoggable(Level.INFO);
    }

    public boolean isTraceEnabled() {
        return getLogger().isLoggable(Level.FINEST);
    }

    public boolean isWarnEnabled() {
        return getLogger().isLoggable(Level.WARNING);
    }

    public void trace(Object obj) {
        log(Level.FINEST, String.valueOf(obj), (Throwable) null);
    }

    public void warn(Object obj) {
        log(Level.WARNING, String.valueOf(obj), (Throwable) null);
    }

    public void debug(Object obj, Throwable th) {
        log(Level.FINE, String.valueOf(obj), th);
    }

    public void error(Object obj, Throwable th) {
        log(Level.SEVERE, String.valueOf(obj), th);
    }

    public void fatal(Object obj, Throwable th) {
        log(Level.SEVERE, String.valueOf(obj), th);
    }

    public void info(Object obj, Throwable th) {
        log(Level.INFO, String.valueOf(obj), th);
    }

    public void trace(Object obj, Throwable th) {
        log(Level.FINEST, String.valueOf(obj), th);
    }

    public void warn(Object obj, Throwable th) {
        log(Level.WARNING, String.valueOf(obj), th);
    }
}
