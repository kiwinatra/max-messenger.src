package org.apache.commons.logging;

import java.lang.reflect.Constructor;
import java.util.Hashtable;
import org.apache.commons.logging.impl.NoOpLog;

@Deprecated
public class LogSource {
    protected static boolean jdk14IsAvailable;
    protected static boolean log4jIsAvailable;
    protected static Constructor logImplctor = null;
    protected static Hashtable logs = new Hashtable();

    /* JADX WARNING: Can't wrap try/catch for region: R(3:30|31|33) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:18|19|20|21|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        setLogImplementation("org.apache.commons.logging.impl.NoOpLog");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0058 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0040=Splitter:B:22:0x0040, B:20:0x003c=Splitter:B:20:0x003c} */
    static {
        /*
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            logs = r0
            r0 = 0
            log4jIsAvailable = r0
            jdk14IsAvailable = r0
            r1 = 0
            logImplctor = r1
            r2 = 1
            java.lang.String r3 = "org.apache.log4j.Logger"
            java.lang.Class.forName(r3)     // Catch:{ all -> 0x0018 }
            log4jIsAvailable = r2     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            log4jIsAvailable = r0
        L_0x001a:
            java.lang.String r3 = "java.util.logging.Logger"
            java.lang.Class.forName(r3)     // Catch:{ all -> 0x0024 }
            int r3 = org.apache.commons.logging.impl.Jdk14Logger.a     // Catch:{ all -> 0x0024 }
            jdk14IsAvailable = r2     // Catch:{ all -> 0x0024 }
            goto L_0x0026
        L_0x0024:
            jdk14IsAvailable = r0
        L_0x0026:
            java.lang.String r0 = "org.apache.commons.logging.log"
            java.lang.String r1 = java.lang.System.getProperty(r0)     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0034
            java.lang.String r0 = "org.apache.commons.logging.Log"
            java.lang.String r1 = java.lang.System.getProperty(r0)     // Catch:{ all -> 0x0034 }
        L_0x0034:
            java.lang.String r0 = "org.apache.commons.logging.impl.NoOpLog"
            if (r1 == 0) goto L_0x0040
            setLogImplementation((java.lang.String) r1)     // Catch:{ all -> 0x003c }
            goto L_0x005b
        L_0x003c:
            setLogImplementation((java.lang.String) r0)     // Catch:{ all -> 0x005b }
            goto L_0x005b
        L_0x0040:
            boolean r1 = log4jIsAvailable     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x004a
            java.lang.String r1 = "org.apache.commons.logging.impl.Log4JLogger"
            setLogImplementation((java.lang.String) r1)     // Catch:{ all -> 0x0058 }
            goto L_0x005b
        L_0x004a:
            boolean r1 = jdk14IsAvailable     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = "org.apache.commons.logging.impl.Jdk14Logger"
            setLogImplementation((java.lang.String) r1)     // Catch:{ all -> 0x0058 }
            goto L_0x005b
        L_0x0054:
            setLogImplementation((java.lang.String) r0)     // Catch:{ all -> 0x0058 }
            goto L_0x005b
        L_0x0058:
            setLogImplementation((java.lang.String) r0)     // Catch:{ all -> 0x005b }
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogSource.<clinit>():void");
    }

    private LogSource() {
    }

    public static Log getInstance(String str) {
        Log log = (Log) logs.get(str);
        if (log != null) {
            return log;
        }
        Log makeNewLogInstance = makeNewLogInstance(str);
        logs.put(str, makeNewLogInstance);
        return makeNewLogInstance;
    }

    public static String[] getLogNames() {
        return (String[]) logs.keySet().toArray(new String[logs.size()]);
    }

    public static Log makeNewLogInstance(String str) {
        Log log;
        try {
            log = (Log) logImplctor.newInstance(new Object[]{str});
        } catch (Throwable unused) {
            log = null;
        }
        return log == null ? new NoOpLog(str) : log;
    }

    public static void setLogImplementation(String str) throws LinkageError, ExceptionInInitializerError, NoSuchMethodException, SecurityException, ClassNotFoundException {
        try {
            logImplctor = Class.forName(str).getConstructor(new Class[]{"".getClass()});
        } catch (Throwable unused) {
            logImplctor = null;
        }
    }

    public static Log getInstance(Class cls) {
        return getInstance(cls.getName());
    }

    public static void setLogImplementation(Class cls) throws LinkageError, ExceptionInInitializerError, NoSuchMethodException, SecurityException {
        logImplctor = cls.getConstructor(new Class[]{"".getClass()});
    }
}
