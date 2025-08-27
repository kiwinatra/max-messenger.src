package org.apache.commons.logging.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.commons.logging.LogFactory;

@Deprecated
public class LogFactoryImpl extends LogFactory {
    public static final String ALLOW_FLAWED_CONTEXT_PROPERTY = "org.apache.commons.logging.Log.allowFlawedContext";
    public static final String ALLOW_FLAWED_DISCOVERY_PROPERTY = "org.apache.commons.logging.Log.allowFlawedDiscovery";
    public static final String ALLOW_FLAWED_HIERARCHY_PROPERTY = "org.apache.commons.logging.Log.allowFlawedHierarchy";
    private static final String LOGGING_IMPL_JDK14_LOGGER = "org.apache.commons.logging.impl.Jdk14Logger";
    private static final String LOGGING_IMPL_LOG4J_LOGGER = "org.apache.commons.logging.impl.Log4JLogger";
    private static final String LOGGING_IMPL_LUMBERJACK_LOGGER = "org.apache.commons.logging.impl.Jdk13LumberjackLogger";
    private static final String LOGGING_IMPL_SIMPLE_LOGGER = "org.apache.commons.logging.impl.SimpleLog";
    public static final String LOG_PROPERTY = "org.apache.commons.logging.Log";
    protected static final String LOG_PROPERTY_OLD = "org.apache.commons.logging.log";
    private static final String PKG_IMPL = "org.apache.commons.logging.impl.";
    private static final int PKG_LEN = 32;
    private static final String[] classesToDiscover = {LOGGING_IMPL_LOG4J_LOGGER, LOGGING_IMPL_JDK14_LOGGER, LOGGING_IMPL_LUMBERJACK_LOGGER, LOGGING_IMPL_SIMPLE_LOGGER};
    private boolean allowFlawedContext;
    private boolean allowFlawedDiscovery;
    private boolean allowFlawedHierarchy;
    protected Hashtable attributes = new Hashtable();
    private String diagnosticPrefix;
    protected Hashtable instances = new Hashtable();
    private String logClassName;
    protected Constructor logConstructor = null;
    protected Class[] logConstructorSignature = {String.class};
    protected Method logMethod = null;
    protected Class[] logMethodSignature = {LogFactory.class};
    private boolean useTCCL = true;

    public LogFactoryImpl() {
        initDiagnostics();
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Instance created.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0071, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x012a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012b, code lost:
        r12 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012e, code lost:
        r12 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0130, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0131, code lost:
        r12 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0179, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0071 A[Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }, ExcHandler: LogConfigurationException (r0v20 'e' org.apache.commons.logging.LogConfigurationException A[CUSTOM_DECLARE, Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }]), Splitter:B:5:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0173 A[LOOP:0: B:4:0x0034->B:54:0x0173, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x016b A[EDGE_INSN: B:68:0x016b->B:51:0x016b ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.apache.commons.logging.Log createLogFromClass(java.lang.String r17, java.lang.String r18, boolean r19) throws org.apache.commons.logging.LogConfigurationException {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r3 = ".class"
            java.lang.String r4 = ": "
            java.lang.String r5 = "The log adapter '"
            java.lang.String r6 = ""
            boolean r0 = isDiagnosticsEnabled()
            java.lang.String r7 = "'"
            if (r0 == 0) goto L_0x0028
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r8 = "Attempting to instantiate '"
            r0.<init>(r8)
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r1.logDiagnostic(r0)
        L_0x0028:
            java.lang.Object[] r8 = new java.lang.Object[]{r18}
            java.lang.ClassLoader r0 = r16.getBaseClassLoader()
            r9 = 0
            r10 = r0
            r11 = r9
            r12 = r11
        L_0x0034:
            java.lang.String r0 = "Trying to load '"
            java.lang.String r13 = "' from classloader "
            java.lang.StringBuilder r0 = defpackage.tr1.p(r0, r2, r13)
            java.lang.String r14 = org.apache.commons.logging.LogFactory.objectId(r10)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            r1.logDiagnostic(r0)
            boolean r0 = isDiagnosticsEnabled()     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            if (r0 == 0) goto L_0x00ce
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r0.<init>()     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r14 = 46
            r15 = 47
            java.lang.String r14 = r2.replace(r14, r15)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r0.append(r14)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r0.append(r3)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.lang.String r0 = r0.toString()     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            if (r10 == 0) goto L_0x007a
            java.net.URL r14 = r10.getResource(r0)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            goto L_0x008d
        L_0x006e:
            r0 = move-exception
            goto L_0x016d
        L_0x0071:
            r0 = move-exception
            goto L_0x0179
        L_0x0074:
            r0 = move-exception
            goto L_0x017a
        L_0x0077:
            r0 = move-exception
            goto L_0x01a9
        L_0x007a:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r14.<init>()     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r14.append(r0)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r14.append(r3)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.lang.String r14 = r14.toString()     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.net.URL r14 = java.lang.ClassLoader.getSystemResource(r14)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
        L_0x008d:
            java.lang.String r15 = "Class '"
            if (r14 != 0) goto L_0x00b1
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r14.<init>()     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r14.append(r15)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r14.append(r2)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.lang.String r15 = "' ["
            r14.append(r15)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r14.append(r0)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.lang.String r0 = "] cannot be found."
            r14.append(r0)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.lang.String r0 = r14.toString()     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r1.logDiagnostic(r0)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            goto L_0x00ce
        L_0x00b1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r0.<init>()     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r0.append(r15)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r0.append(r2)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.lang.String r15 = "' was found at '"
            r0.append(r15)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r0.append(r14)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r0.append(r7)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.lang.String r0 = r0.toString()     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r1.logDiagnostic(r0)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
        L_0x00ce:
            r0 = 1
            java.lang.Class r0 = java.lang.Class.forName(r2, r0, r10)     // Catch:{ ClassNotFoundException -> 0x00d5 }
        L_0x00d3:
            r14 = r0
            goto L_0x0117
        L_0x00d5:
            r0 = move-exception
            r14 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r0.<init>()     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r0.append(r6)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.lang.String r14 = r14.getMessage()     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r0.append(r14)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.lang.String r0 = r0.toString()     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r14.<init>()     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r14.append(r5)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r14.append(r2)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.lang.String r15 = "' is not available via classloader "
            r14.append(r15)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.lang.String r15 = org.apache.commons.logging.LogFactory.objectId(r10)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r14.append(r15)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r14.append(r4)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.lang.String r0 = r0.trim()     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r14.append(r0)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.lang.String r0 = r14.toString()     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r1.logDiagnostic(r0)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.lang.Class r0 = java.lang.Class.forName(r17)     // Catch:{ ClassNotFoundException -> 0x0138 }
            goto L_0x00d3
        L_0x0117:
            java.lang.Class[] r0 = r1.logConstructorSignature     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.lang.reflect.Constructor r11 = r14.getConstructor(r0)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.lang.Object r0 = r11.newInstance(r8)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            boolean r15 = r0 instanceof org.apache.commons.logging.Log     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            if (r15 == 0) goto L_0x0134
            org.apache.commons.logging.Log r0 = (org.apache.commons.logging.Log) r0     // Catch:{ NoClassDefFoundError -> 0x0130, ExceptionInInitializerError -> 0x012d, LogConfigurationException -> 0x0071, all -> 0x012a }
            r12 = r14
            goto L_0x01d8
        L_0x012a:
            r0 = move-exception
            r12 = r14
            goto L_0x016d
        L_0x012d:
            r0 = move-exception
            r12 = r14
            goto L_0x017a
        L_0x0130:
            r0 = move-exception
            r12 = r14
            goto L_0x01a9
        L_0x0134:
            r1.handleFlawedHierarchy(r10, r14)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            goto L_0x0170
        L_0x0138:
            r0 = move-exception
            r14 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r0.<init>()     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r0.append(r6)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.lang.String r14 = r14.getMessage()     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r0.append(r14)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.lang.String r0 = r0.toString()     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r14.<init>()     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r14.append(r5)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r14.append(r2)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.lang.String r15 = "' is not available via the LogFactoryImpl class classloader: "
            r14.append(r15)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.lang.String r0 = r0.trim()     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r14.append(r0)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            java.lang.String r0 = r14.toString()     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
            r1.logDiagnostic(r0)     // Catch:{ NoClassDefFoundError -> 0x0077, ExceptionInInitializerError -> 0x0074, LogConfigurationException -> 0x0071, all -> 0x006e }
        L_0x016b:
            r0 = r9
            goto L_0x01d8
        L_0x016d:
            r1.handleFlawedDiscovery(r2, r10, r0)
        L_0x0170:
            if (r10 != 0) goto L_0x0173
            goto L_0x016b
        L_0x0173:
            java.lang.ClassLoader r10 = r10.getParent()
            goto L_0x0034
        L_0x0179:
            throw r0
        L_0x017a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r6)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "' is unable to initialize itself when loaded via classloader "
            java.lang.StringBuilder r3 = defpackage.tr1.p(r5, r2, r3)
            java.lang.String r5 = org.apache.commons.logging.LogFactory.objectId(r10)
            r3.append(r5)
            r3.append(r4)
            java.lang.String r0 = r0.trim()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.logDiagnostic(r0)
            goto L_0x016b
        L_0x01a9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r6)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "' is missing dependencies when loaded via classloader "
            java.lang.StringBuilder r3 = defpackage.tr1.p(r5, r2, r3)
            java.lang.String r5 = org.apache.commons.logging.LogFactory.objectId(r10)
            r3.append(r5)
            r3.append(r4)
            java.lang.String r0 = r0.trim()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.logDiagnostic(r0)
            goto L_0x016b
        L_0x01d8:
            if (r0 == 0) goto L_0x023a
            if (r19 == 0) goto L_0x023a
            r1.logClassName = r2
            r1.logConstructor = r11
            java.lang.String r3 = "setLogFactory"
            java.lang.Class[] r4 = r1.logMethodSignature     // Catch:{ all -> 0x0202 }
            java.lang.reflect.Method r3 = r12.getMethod(r3, r4)     // Catch:{ all -> 0x0202 }
            r1.logMethod = r3     // Catch:{ all -> 0x0202 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0202 }
            r3.<init>()     // Catch:{ all -> 0x0202 }
            java.lang.String r4 = "Found method setLogFactory(LogFactory) in '"
            r3.append(r4)     // Catch:{ all -> 0x0202 }
            r3.append(r2)     // Catch:{ all -> 0x0202 }
            r3.append(r7)     // Catch:{ all -> 0x0202 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0202 }
            r1.logDiagnostic(r3)     // Catch:{ all -> 0x0202 }
            goto L_0x021d
        L_0x0202:
            r1.logMethod = r9
            java.lang.String r3 = "[INFO] '"
            java.lang.StringBuilder r3 = defpackage.tr1.p(r3, r2, r13)
            java.lang.String r4 = org.apache.commons.logging.LogFactory.objectId(r10)
            r3.append(r4)
            java.lang.String r4 = " does not declare optional method setLogFactory(LogFactory)"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.logDiagnostic(r3)
        L_0x021d:
            java.lang.String r3 = "Log adapter '"
            java.lang.StringBuilder r2 = defpackage.tr1.p(r3, r2, r13)
            java.lang.ClassLoader r3 = r12.getClassLoader()
            java.lang.String r3 = org.apache.commons.logging.LogFactory.objectId(r3)
            r2.append(r3)
            java.lang.String r3 = " has been selected for use."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logDiagnostic(r2)
        L_0x023a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.impl.LogFactoryImpl.createLogFromClass(java.lang.String, java.lang.String, boolean):org.apache.commons.logging.Log");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0084 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.apache.commons.logging.Log discoverLogImplementation(java.lang.String r6) throws org.apache.commons.logging.LogConfigurationException {
        /*
            r5 = this;
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "Discovering a Log implementation..."
            r5.logDiagnostic(r0)
        L_0x000b:
            r5.initConfiguration()
            java.lang.String r0 = r5.findUserSpecifiedLogClassName()
            r1 = 1
            if (r0 == 0) goto L_0x0065
            boolean r2 = isDiagnosticsEnabled()
            if (r2 == 0) goto L_0x0031
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Attempting to load user-specified log class '"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = "'..."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r5.logDiagnostic(r2)
        L_0x0031:
            org.apache.commons.logging.Log r6 = r5.createLogFromClass(r0, r6, r1)
            if (r6 == 0) goto L_0x0038
            return r6
        L_0x0038:
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            java.lang.String r1 = "User-specified log class '"
            r6.<init>(r1)
            r6.append(r0)
            java.lang.String r1 = "' cannot be found or is not useable."
            r6.append(r1)
            java.lang.String r1 = "org.apache.commons.logging.impl.Log4JLogger"
            r5.informUponSimilarName(r6, r0, r1)
            java.lang.String r1 = "org.apache.commons.logging.impl.Jdk14Logger"
            r5.informUponSimilarName(r6, r0, r1)
            java.lang.String r1 = "org.apache.commons.logging.impl.Jdk13LumberjackLogger"
            r5.informUponSimilarName(r6, r0, r1)
            java.lang.String r1 = "org.apache.commons.logging.impl.SimpleLog"
            r5.informUponSimilarName(r6, r0, r1)
            org.apache.commons.logging.LogConfigurationException r5 = new org.apache.commons.logging.LogConfigurationException
            java.lang.String r6 = r6.toString()
            r5.<init>((java.lang.String) r6)
            throw r5
        L_0x0065:
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = "No user-specified Log implementation; performing discovery using the standard supported logging implementations..."
            r5.logDiagnostic(r0)
        L_0x0070:
            r0 = 0
            r2 = 0
        L_0x0072:
            java.lang.String[] r3 = classesToDiscover
            int r4 = r3.length
            if (r2 >= r4) goto L_0x0082
            if (r0 != 0) goto L_0x0082
            r0 = r3[r2]
            org.apache.commons.logging.Log r0 = r5.createLogFromClass(r0, r6, r1)
            int r2 = r2 + 1
            goto L_0x0072
        L_0x0082:
            if (r0 == 0) goto L_0x0085
            return r0
        L_0x0085:
            org.apache.commons.logging.LogConfigurationException r5 = new org.apache.commons.logging.LogConfigurationException
            java.lang.String r6 = "No suitable Log implementation"
            r5.<init>((java.lang.String) r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.impl.LogFactoryImpl.discoverLogImplementation(java.lang.String):org.apache.commons.logging.Log");
    }

    private String findUserSpecifiedLogClassName() {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Trying to get log class from attribute 'org.apache.commons.logging.Log'");
        }
        String str = (String) getAttribute(LOG_PROPERTY);
        if (str == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from attribute 'org.apache.commons.logging.log'");
            }
            str = (String) getAttribute(LOG_PROPERTY_OLD);
        }
        if (str == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from system property 'org.apache.commons.logging.Log'");
            }
            try {
                str = System.getProperty(LOG_PROPERTY);
            } catch (SecurityException e) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("No access allowed to system property 'org.apache.commons.logging.Log' - " + e.getMessage());
                }
            }
        }
        if (str == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from system property 'org.apache.commons.logging.log'");
            }
            try {
                str = System.getProperty(LOG_PROPERTY_OLD);
            } catch (SecurityException e2) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("No access allowed to system property 'org.apache.commons.logging.log' - " + e2.getMessage());
                }
            }
        }
        return str != null ? str.trim() : str;
    }

    private ClassLoader getBaseClassLoader() throws LogConfigurationException {
        ClassLoader classLoader = getClassLoader(LogFactoryImpl.class);
        if (!this.useTCCL) {
            return classLoader;
        }
        ClassLoader contextClassLoader = getContextClassLoader();
        ClassLoader lowestClassLoader = getLowestClassLoader(contextClassLoader, classLoader);
        if (lowestClassLoader != null) {
            if (lowestClassLoader != contextClassLoader) {
                if (!this.allowFlawedContext) {
                    throw new LogConfigurationException("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
                } else if (isDiagnosticsEnabled()) {
                    logDiagnostic("Warning: the context classloader is an ancestor of the classloader that loaded LogFactoryImpl; it should be the same or a descendant. The application using commons-logging should ensure the context classloader is used correctly.");
                }
            }
            return lowestClassLoader;
        } else if (this.allowFlawedContext) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[WARNING] the context classloader is not part of a parent-child relationship with the classloader that loaded LogFactoryImpl.");
            }
            return contextClassLoader;
        } else {
            throw new LogConfigurationException("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
        }
    }

    private boolean getBooleanConfiguration(String str, boolean z) {
        String configurationValue = getConfigurationValue(str);
        return configurationValue == null ? z : Boolean.valueOf(configurationValue).booleanValue();
    }

    public static ClassLoader getClassLoader(Class cls) {
        return LogFactory.getClassLoader(cls);
    }

    private String getConfigurationValue(String str) {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("[ENV] Trying to get configuration for item " + str);
        }
        Object attribute = getAttribute(str);
        if (attribute != null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[ENV] Found LogFactory attribute [" + attribute + "] for " + str);
            }
            return attribute.toString();
        }
        if (isDiagnosticsEnabled()) {
            logDiagnostic("[ENV] No LogFactory attribute found for " + str);
        }
        try {
            String property = System.getProperty(str);
            if (property != null) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("[ENV] Found system property [" + property + "] for " + str);
                }
                return property;
            }
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[ENV] No system property found for property " + str);
            }
            if (!isDiagnosticsEnabled()) {
                return null;
            }
            logDiagnostic("[ENV] No configuration defined for item " + str);
            return null;
        } catch (SecurityException unused) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[ENV] Security prevented reading system property " + str);
            }
        }
    }

    public static ClassLoader getContextClassLoader() throws LogConfigurationException {
        return LogFactory.getContextClassLoader();
    }

    private ClassLoader getLowestClassLoader(ClassLoader classLoader, ClassLoader classLoader2) {
        if (classLoader == null) {
            return classLoader2;
        }
        if (classLoader2 == null) {
            return classLoader;
        }
        for (ClassLoader classLoader3 = classLoader; classLoader3 != null; classLoader3 = classLoader3.getParent()) {
            if (classLoader3 == classLoader2) {
                return classLoader;
            }
        }
        for (ClassLoader classLoader4 = classLoader2; classLoader4 != null; classLoader4 = classLoader4.getParent()) {
            if (classLoader4 == classLoader) {
                return classLoader2;
            }
        }
        return null;
    }

    private void handleFlawedDiscovery(String str, ClassLoader classLoader, Throwable th) {
        if (isDiagnosticsEnabled()) {
            StringBuilder p = tr1.p("Could not instantiate Log '", str, "' -- ");
            p.append(th.getClass().getName());
            p.append(": ");
            p.append(th.getLocalizedMessage());
            logDiagnostic(p.toString());
        }
        if (!this.allowFlawedDiscovery) {
            throw new LogConfigurationException(th);
        }
    }

    private void handleFlawedHierarchy(ClassLoader classLoader, Class cls) throws LogConfigurationException {
        Class<Log> cls2 = Log.class;
        String name = cls2.getName();
        Class[] interfaces = cls.getInterfaces();
        int i = 0;
        while (i < interfaces.length) {
            if (name.equals(interfaces[i].getName())) {
                if (isDiagnosticsEnabled()) {
                    try {
                        ClassLoader classLoader2 = getClassLoader(cls2);
                        logDiagnostic("Class '" + cls.getName() + "' was found in classloader " + LogFactory.objectId(classLoader) + ". It is bound to a Log interface which is not the one loaded from classloader " + LogFactory.objectId(classLoader2));
                    } catch (Throwable unused) {
                        logDiagnostic("Error while trying to output diagnostics about bad class '" + cls + "'");
                    }
                }
                if (!this.allowFlawedHierarchy) {
                    StringBuffer stringBuffer = new StringBuffer("Terminating logging for this context due to bad log hierarchy. You have more than one version of '");
                    stringBuffer.append(cls2.getName());
                    stringBuffer.append("' visible.");
                    if (isDiagnosticsEnabled()) {
                        logDiagnostic(stringBuffer.toString());
                    }
                    throw new LogConfigurationException(stringBuffer.toString());
                } else if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer2 = new StringBuffer("Warning: bad log hierarchy. You have more than one version of '");
                    stringBuffer2.append(cls2.getName());
                    stringBuffer2.append("' visible.");
                    logDiagnostic(stringBuffer2.toString());
                    return;
                } else {
                    return;
                }
            } else {
                i++;
            }
        }
        if (!this.allowFlawedDiscovery) {
            StringBuffer stringBuffer3 = new StringBuffer("Terminating logging for this context. Log class '");
            stringBuffer3.append(cls.getName());
            stringBuffer3.append("' does not implement the Log interface.");
            if (isDiagnosticsEnabled()) {
                logDiagnostic(stringBuffer3.toString());
            }
            throw new LogConfigurationException(stringBuffer3.toString());
        } else if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer4 = new StringBuffer("[WARNING] Log class '");
            stringBuffer4.append(cls.getName());
            stringBuffer4.append("' does not implement the Log interface.");
            logDiagnostic(stringBuffer4.toString());
        }
    }

    private void informUponSimilarName(StringBuffer stringBuffer, String str, String str2) {
        if (!str.equals(str2)) {
            if (str.regionMatches(true, 0, str2, 0, PKG_LEN + 5)) {
                stringBuffer.append(" Did you mean '");
                stringBuffer.append(str2);
                stringBuffer.append("'?");
            }
        }
    }

    private void initConfiguration() {
        this.allowFlawedContext = getBooleanConfiguration(ALLOW_FLAWED_CONTEXT_PROPERTY, true);
        this.allowFlawedDiscovery = getBooleanConfiguration(ALLOW_FLAWED_DISCOVERY_PROPERTY, true);
        this.allowFlawedHierarchy = getBooleanConfiguration(ALLOW_FLAWED_HIERARCHY_PROPERTY, true);
    }

    private void initDiagnostics() {
        String str;
        ClassLoader classLoader = getClassLoader(getClass());
        if (classLoader == null) {
            str = "BOOTLOADER";
        } else {
            try {
                str = LogFactory.objectId(classLoader);
            } catch (SecurityException unused) {
                str = "UNKNOWN";
            }
        }
        this.diagnosticPrefix = "[LogFactoryImpl@" + System.identityHashCode(this) + " from " + str + "] ";
    }

    public static boolean isDiagnosticsEnabled() {
        return LogFactory.isDiagnosticsEnabled();
    }

    private boolean isLogLibraryAvailable(String str, String str2) {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Checking for '" + str + "'.");
        }
        try {
            if (createLogFromClass(str2, getClass().getName(), false) == null) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("Did not find '" + str + "'.");
                }
                return false;
            } else if (!isDiagnosticsEnabled()) {
                return true;
            } else {
                logDiagnostic("Found '" + str + "'.");
                return true;
            }
        } catch (LogConfigurationException unused) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Logging system '" + str + "' is available but not useable.");
            }
            return false;
        }
    }

    public Object getAttribute(String str) {
        return this.attributes.get(str);
    }

    public String[] getAttributeNames() {
        Vector vector = new Vector();
        Enumeration keys = this.attributes.keys();
        while (keys.hasMoreElements()) {
            vector.addElement((String) keys.nextElement());
        }
        int size = vector.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = (String) vector.elementAt(i);
        }
        return strArr;
    }

    public Log getInstance(Class cls) throws LogConfigurationException {
        return getInstance(cls.getName());
    }

    public String getLogClassName() {
        if (this.logClassName == null) {
            discoverLogImplementation(getClass().getName());
        }
        return this.logClassName;
    }

    public Constructor getLogConstructor() throws LogConfigurationException {
        if (this.logConstructor == null) {
            discoverLogImplementation(getClass().getName());
        }
        return this.logConstructor;
    }

    public boolean isJdk13LumberjackAvailable() {
        return isLogLibraryAvailable("Jdk13Lumberjack", LOGGING_IMPL_LUMBERJACK_LOGGER);
    }

    public boolean isJdk14Available() {
        return isLogLibraryAvailable("Jdk14", LOGGING_IMPL_JDK14_LOGGER);
    }

    public boolean isLog4JAvailable() {
        return isLogLibraryAvailable("Log4J", LOGGING_IMPL_LOG4J_LOGGER);
    }

    public void logDiagnostic(String str) {
        if (isDiagnosticsEnabled()) {
            LogFactory.logRawDiagnostic(this.diagnosticPrefix + str);
        }
    }

    public Log newInstance(String str) throws LogConfigurationException {
        try {
            Constructor constructor = this.logConstructor;
            Log discoverLogImplementation = constructor == null ? discoverLogImplementation(str) : (Log) constructor.newInstance(new Object[]{str});
            Method method = this.logMethod;
            if (method != null) {
                method.invoke(discoverLogImplementation, new Object[]{this});
            }
            return discoverLogImplementation;
        } catch (LogConfigurationException e) {
            throw e;
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException != null) {
                throw new LogConfigurationException(targetException);
            }
            throw new LogConfigurationException((Throwable) e2);
        } catch (Throwable th) {
            throw new LogConfigurationException(th);
        }
    }

    public void release() {
        logDiagnostic("Releasing all known loggers");
        this.instances.clear();
    }

    public void removeAttribute(String str) {
        this.attributes.remove(str);
    }

    public void setAttribute(String str, Object obj) {
        if (this.logConstructor != null) {
            logDiagnostic("setAttribute: call too late; configuration already performed.");
        }
        if (obj == null) {
            this.attributes.remove(str);
        } else {
            this.attributes.put(str, obj);
        }
        if (str.equals(LogFactory.TCCL_KEY)) {
            this.useTCCL = Boolean.valueOf(obj.toString()).booleanValue();
        }
    }

    public Log getInstance(String str) throws LogConfigurationException {
        Log log = (Log) this.instances.get(str);
        if (log != null) {
            return log;
        }
        Log newInstance = newInstance(str);
        this.instances.put(str, newInstance);
        return newInstance;
    }
}
