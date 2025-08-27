package org.apache.commons.logging;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import org.apache.commons.logging.impl.Jdk14Logger;

@Deprecated
public abstract class LogFactory {
    public static final String DIAGNOSTICS_DEST_PROPERTY = "org.apache.commons.logging.diagnostics.dest";
    public static final String FACTORY_DEFAULT = "org.apache.commons.logging.impl.LogFactoryImpl";
    public static final String FACTORY_PROPERTIES = "commons-logging.properties";
    public static final String FACTORY_PROPERTY = "org.apache.commons.logging.LogFactory";
    public static final String HASHTABLE_IMPLEMENTATION_PROPERTY = "org.apache.commons.logging.LogFactory.HashtableImpl";
    public static final String PRIORITY_KEY = "priority";
    protected static final String SERVICE_ID = "META-INF/services/org.apache.commons.logging.LogFactory";
    public static final String TCCL_KEY = "use_tccl";
    private static final String WEAK_HASHTABLE_CLASSNAME = "org.apache.commons.logging.impl.WeakHashtable";
    private static String diagnosticPrefix;
    private static PrintStream diagnosticsStream;
    protected static Hashtable factories = createFactoryStore();
    protected static LogFactory nullClassLoaderFactory;
    private static ClassLoader thisClassLoader;

    static {
        Class<LogFactory> cls = LogFactory.class;
        thisClassLoader = getClassLoader(cls);
        initDiagnostics();
        logClassLoaderEnvironment(cls);
        if (isDiagnosticsEnabled()) {
            logDiagnostic("BOOTSTRAP COMPLETED");
        }
    }

    private static void cacheFactory(ClassLoader classLoader, LogFactory logFactory) {
        if (logFactory == null) {
            return;
        }
        if (classLoader == null) {
            nullClassLoaderFactory = logFactory;
        } else {
            factories.put(classLoader, logFactory);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0090 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object createFactory(java.lang.String r9, java.lang.ClassLoader r10) {
        /*
            java.lang.String r0 = "Unable to load factory class via classloader "
            java.lang.String r1 = "Unable to locate any class called '"
            java.lang.String r2 = "Class '"
            java.lang.String r3 = "The application has specified that a custom LogFactory implementation should be used but Class '"
            java.lang.String r4 = "Factory class "
            java.lang.String r5 = "Loaded class "
            java.lang.Class<org.apache.commons.logging.LogFactory> r6 = org.apache.commons.logging.LogFactory.class
            r7 = 0
            if (r10 == 0) goto L_0x014b
            java.lang.Class r7 = r10.loadClass(r9)     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            boolean r8 = r6.isAssignableFrom(r7)     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            if (r8 == 0) goto L_0x004a
            boolean r4 = isDiagnosticsEnabled()     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            if (r4 == 0) goto L_0x0089
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            r4.<init>(r5)     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            java.lang.String r5 = r7.getName()     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            java.lang.String r5 = " from classloader "
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            java.lang.String r5 = objectId(r10)     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            logDiagnostic(r4)     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            goto L_0x0089
        L_0x0041:
            r9 = move-exception
            goto L_0x0174
        L_0x0044:
            r1 = move-exception
            goto L_0x00fa
        L_0x0047:
            r2 = move-exception
            goto L_0x0125
        L_0x004a:
            boolean r5 = isDiagnosticsEnabled()     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            if (r5 == 0) goto L_0x0089
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            r5.<init>(r4)     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            java.lang.String r4 = r7.getName()     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            r5.append(r4)     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            java.lang.String r4 = " loaded from classloader "
            r5.append(r4)     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            java.lang.ClassLoader r4 = r7.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            java.lang.String r4 = objectId(r4)     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            r5.append(r4)     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            java.lang.String r4 = " does not extend '"
            r5.append(r4)     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            java.lang.String r4 = r6.getName()     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            r5.append(r4)     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            java.lang.String r4 = "' as loaded by this classloader."
            r5.append(r4)     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            java.lang.String r4 = r5.toString()     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            logDiagnostic(r4)     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            java.lang.String r4 = "[BAD CL TREE] "
            logHierarchy(r4, r10)     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
        L_0x0089:
            java.lang.Object r4 = r7.newInstance()     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            org.apache.commons.logging.LogFactory r4 = (org.apache.commons.logging.LogFactory) r4     // Catch:{ ClassNotFoundException -> 0x0047, NoClassDefFoundError -> 0x0044, ClassCastException -> 0x0090 }
            return r4
        L_0x0090:
            java.lang.ClassLoader r1 = thisClassLoader     // Catch:{ Exception -> 0x0041 }
            if (r10 != r1) goto L_0x014b
            boolean r10 = implementsLogFactory(r7)     // Catch:{ Exception -> 0x0041 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0041 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0041 }
            r0.append(r9)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r9 = "' cannot be converted to '"
            r0.append(r9)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r9 = r6.getName()     // Catch:{ Exception -> 0x0041 }
            r0.append(r9)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r9 = "'. "
            r0.append(r9)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r9 = r0.toString()     // Catch:{ Exception -> 0x0041 }
            if (r10 == 0) goto L_0x00c9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0041 }
            r10.<init>()     // Catch:{ Exception -> 0x0041 }
            r10.append(r9)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r9 = "The conflict is caused by the presence of multiple LogFactory classes in incompatible classloaders. Background can be found in http://jakarta.apache.org/commons/logging/tech.html. If you have not explicitly specified a custom LogFactory then it is likely that the container has set one without your knowledge. In this case, consider using the commons-logging-adapters.jar file or specifying the standard LogFactory from the command line. "
            r10.append(r9)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r9 = r10.toString()     // Catch:{ Exception -> 0x0041 }
            goto L_0x00da
        L_0x00c9:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0041 }
            r10.<init>()     // Catch:{ Exception -> 0x0041 }
            r10.append(r9)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r9 = "Please check the custom implementation. "
            r10.append(r9)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r9 = r10.toString()     // Catch:{ Exception -> 0x0041 }
        L_0x00da:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0041 }
            r10.<init>()     // Catch:{ Exception -> 0x0041 }
            r10.append(r9)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r9 = "Help can be found @http://jakarta.apache.org/commons/logging/troubleshooting.html."
            r10.append(r9)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r9 = r10.toString()     // Catch:{ Exception -> 0x0041 }
            boolean r10 = isDiagnosticsEnabled()     // Catch:{ Exception -> 0x0041 }
            if (r10 == 0) goto L_0x00f4
            logDiagnostic(r9)     // Catch:{ Exception -> 0x0041 }
        L_0x00f4:
            java.lang.ClassCastException r10 = new java.lang.ClassCastException     // Catch:{ Exception -> 0x0041 }
            r10.<init>(r9)     // Catch:{ Exception -> 0x0041 }
            throw r10     // Catch:{ Exception -> 0x0041 }
        L_0x00fa:
            java.lang.ClassLoader r3 = thisClassLoader     // Catch:{ Exception -> 0x0041 }
            if (r10 != r3) goto L_0x014b
            boolean r0 = isDiagnosticsEnabled()     // Catch:{ Exception -> 0x0041 }
            if (r0 == 0) goto L_0x0124
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0041 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0041 }
            r0.append(r9)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r9 = "' cannot be loaded via classloader "
            r0.append(r9)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r9 = objectId(r10)     // Catch:{ Exception -> 0x0041 }
            r0.append(r9)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r9 = " - it depends on some other class that cannot be found."
            r0.append(r9)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r9 = r0.toString()     // Catch:{ Exception -> 0x0041 }
            logDiagnostic(r9)     // Catch:{ Exception -> 0x0041 }
        L_0x0124:
            throw r1     // Catch:{ Exception -> 0x0041 }
        L_0x0125:
            java.lang.ClassLoader r3 = thisClassLoader     // Catch:{ Exception -> 0x0041 }
            if (r10 != r3) goto L_0x014b
            boolean r0 = isDiagnosticsEnabled()     // Catch:{ Exception -> 0x0041 }
            if (r0 == 0) goto L_0x014a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0041 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0041 }
            r0.append(r9)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r9 = "' via classloader "
            r0.append(r9)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r9 = objectId(r10)     // Catch:{ Exception -> 0x0041 }
            r0.append(r9)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r9 = r0.toString()     // Catch:{ Exception -> 0x0041 }
            logDiagnostic(r9)     // Catch:{ Exception -> 0x0041 }
        L_0x014a:
            throw r2     // Catch:{ Exception -> 0x0041 }
        L_0x014b:
            boolean r1 = isDiagnosticsEnabled()     // Catch:{ Exception -> 0x0041 }
            if (r1 == 0) goto L_0x0169
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0041 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r10 = objectId(r10)     // Catch:{ Exception -> 0x0041 }
            r1.append(r10)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r10 = " - trying the classloader associated with this LogFactory."
            r1.append(r10)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r10 = r1.toString()     // Catch:{ Exception -> 0x0041 }
            logDiagnostic(r10)     // Catch:{ Exception -> 0x0041 }
        L_0x0169:
            java.lang.Class r7 = java.lang.Class.forName(r9)     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r9 = r7.newInstance()     // Catch:{ Exception -> 0x0041 }
            org.apache.commons.logging.LogFactory r9 = (org.apache.commons.logging.LogFactory) r9     // Catch:{ Exception -> 0x0041 }
            return r9
        L_0x0174:
            boolean r10 = isDiagnosticsEnabled()
            if (r10 == 0) goto L_0x017f
            java.lang.String r10 = "Unable to create LogFactory instance."
            logDiagnostic(r10)
        L_0x017f:
            if (r7 == 0) goto L_0x018f
            boolean r10 = r6.isAssignableFrom(r7)
            if (r10 != 0) goto L_0x018f
            org.apache.commons.logging.LogConfigurationException r10 = new org.apache.commons.logging.LogConfigurationException
            java.lang.String r0 = "The chosen LogFactory implementation does not extend LogFactory. Please check your configuration."
            r10.<init>(r0, r9)
            return r10
        L_0x018f:
            org.apache.commons.logging.LogConfigurationException r10 = new org.apache.commons.logging.LogConfigurationException
            r10.<init>((java.lang.Throwable) r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogFactory.createFactory(java.lang.String, java.lang.ClassLoader):java.lang.Object");
    }

    private static final Hashtable createFactoryStore() {
        Hashtable hashtable;
        String property = System.getProperty(HASHTABLE_IMPLEMENTATION_PROPERTY);
        if (property == null) {
            property = WEAK_HASHTABLE_CLASSNAME;
        }
        try {
            hashtable = (Hashtable) Class.forName(property).newInstance();
        } catch (Throwable unused) {
            if (!WEAK_HASHTABLE_CLASSNAME.equals(property)) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("[ERROR] LogFactory: Load of custom hashtable failed");
                } else {
                    System.err.println("[ERROR] LogFactory: Load of custom hashtable failed");
                }
            }
            hashtable = null;
        }
        return hashtable == null ? new Hashtable() : hashtable;
    }

    public static ClassLoader directGetContextClassLoader() throws LogConfigurationException {
        try {
            return (ClassLoader) Thread.class.getMethod("getContextClassLoader", (Class[]) null).invoke(Thread.currentThread(), (Object[]) null);
        } catch (IllegalAccessException e) {
            throw new LogConfigurationException("Unexpected IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getTargetException() instanceof SecurityException) {
                return null;
            }
            throw new LogConfigurationException("Unexpected InvocationTargetException", e2.getTargetException());
        } catch (NoSuchMethodException unused) {
            return getClassLoader(LogFactory.class);
        }
    }

    private static LogFactory getCachedFactory(ClassLoader classLoader) {
        return classLoader == null ? nullClassLoaderFactory : (LogFactory) factories.get(classLoader);
    }

    public static ClassLoader getClassLoader(Class cls) {
        try {
            return cls.getClassLoader();
        } catch (SecurityException e) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Unable to get classloader for class '" + cls + "' due to security restrictions - " + e.getMessage());
            }
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.util.Properties getConfigurationFile(java.lang.ClassLoader r13, java.lang.String r14) {
        /*
            r0 = 0
            java.util.Enumeration r13 = getResources(r13, r14)     // Catch:{ SecurityException -> 0x00c9 }
            if (r13 != 0) goto L_0x0008
            return r0
        L_0x0008:
            r1 = 0
            r3 = r0
            r4 = r1
        L_0x000c:
            boolean r6 = r13.hasMoreElements()     // Catch:{ SecurityException -> 0x00ca }
            if (r6 == 0) goto L_0x00d5
            java.lang.Object r6 = r13.nextElement()     // Catch:{ SecurityException -> 0x00ca }
            java.net.URL r6 = (java.net.URL) r6     // Catch:{ SecurityException -> 0x00ca }
            java.util.Properties r7 = getProperties(r6)     // Catch:{ SecurityException -> 0x00ca }
            if (r7 == 0) goto L_0x000c
            java.lang.String r8 = "priority"
            java.lang.String r9 = "' with priority "
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = r7.getProperty(r8)     // Catch:{ SecurityException -> 0x0030 }
            if (r0 == 0) goto L_0x0034
            double r3 = java.lang.Double.parseDouble(r0)     // Catch:{ SecurityException -> 0x0030 }
            r4 = r3
            goto L_0x0035
        L_0x0030:
            r3 = r6
            r0 = r7
            goto L_0x00ca
        L_0x0034:
            r4 = r1
        L_0x0035:
            boolean r0 = isDiagnosticsEnabled()     // Catch:{ SecurityException -> 0x0030 }
            if (r0 == 0) goto L_0x0055
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x0030 }
            r0.<init>()     // Catch:{ SecurityException -> 0x0030 }
            java.lang.String r3 = "[LOOKUP] Properties file found at '"
            r0.append(r3)     // Catch:{ SecurityException -> 0x0030 }
            r0.append(r6)     // Catch:{ SecurityException -> 0x0030 }
            r0.append(r9)     // Catch:{ SecurityException -> 0x0030 }
            r0.append(r4)     // Catch:{ SecurityException -> 0x0030 }
            java.lang.String r0 = r0.toString()     // Catch:{ SecurityException -> 0x0030 }
            logDiagnostic(r0)     // Catch:{ SecurityException -> 0x0030 }
        L_0x0055:
            r3 = r6
            r0 = r7
            goto L_0x000c
        L_0x0058:
            java.lang.String r8 = r7.getProperty(r8)     // Catch:{ SecurityException -> 0x00ca }
            if (r8 == 0) goto L_0x0063
            double r10 = java.lang.Double.parseDouble(r8)     // Catch:{ SecurityException -> 0x00ca }
            goto L_0x0064
        L_0x0063:
            r10 = r1
        L_0x0064:
            int r8 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            java.lang.String r12 = "[LOOKUP] Properties file at '"
            if (r8 <= 0) goto L_0x009b
            boolean r8 = isDiagnosticsEnabled()     // Catch:{ SecurityException -> 0x00ca }
            if (r8 == 0) goto L_0x0096
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x00ca }
            r8.<init>()     // Catch:{ SecurityException -> 0x00ca }
            r8.append(r12)     // Catch:{ SecurityException -> 0x00ca }
            r8.append(r6)     // Catch:{ SecurityException -> 0x00ca }
            r8.append(r9)     // Catch:{ SecurityException -> 0x00ca }
            r8.append(r10)     // Catch:{ SecurityException -> 0x00ca }
            java.lang.String r12 = " overrides file at '"
            r8.append(r12)     // Catch:{ SecurityException -> 0x00ca }
            r8.append(r3)     // Catch:{ SecurityException -> 0x00ca }
            r8.append(r9)     // Catch:{ SecurityException -> 0x00ca }
            r8.append(r4)     // Catch:{ SecurityException -> 0x00ca }
            java.lang.String r4 = r8.toString()     // Catch:{ SecurityException -> 0x00ca }
            logDiagnostic(r4)     // Catch:{ SecurityException -> 0x00ca }
        L_0x0096:
            r3 = r6
            r0 = r7
            r4 = r10
            goto L_0x000c
        L_0x009b:
            boolean r7 = isDiagnosticsEnabled()     // Catch:{ SecurityException -> 0x00ca }
            if (r7 == 0) goto L_0x000c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x00ca }
            r7.<init>()     // Catch:{ SecurityException -> 0x00ca }
            r7.append(r12)     // Catch:{ SecurityException -> 0x00ca }
            r7.append(r6)     // Catch:{ SecurityException -> 0x00ca }
            r7.append(r9)     // Catch:{ SecurityException -> 0x00ca }
            r7.append(r10)     // Catch:{ SecurityException -> 0x00ca }
            java.lang.String r6 = " does not override file at '"
            r7.append(r6)     // Catch:{ SecurityException -> 0x00ca }
            r7.append(r3)     // Catch:{ SecurityException -> 0x00ca }
            r7.append(r9)     // Catch:{ SecurityException -> 0x00ca }
            r7.append(r4)     // Catch:{ SecurityException -> 0x00ca }
            java.lang.String r6 = r7.toString()     // Catch:{ SecurityException -> 0x00ca }
            logDiagnostic(r6)     // Catch:{ SecurityException -> 0x00ca }
            goto L_0x000c
        L_0x00c9:
            r3 = r0
        L_0x00ca:
            boolean r13 = isDiagnosticsEnabled()
            if (r13 == 0) goto L_0x00d5
            java.lang.String r13 = "SecurityException thrown while trying to find/read config files."
            logDiagnostic(r13)
        L_0x00d5:
            boolean r13 = isDiagnosticsEnabled()
            if (r13 == 0) goto L_0x0107
            if (r0 != 0) goto L_0x00e9
            java.lang.String r13 = "[LOOKUP] No properties file of name '"
            java.lang.String r1 = "' found."
            java.lang.String r13 = defpackage.wj6.k(r13, r14, r1)
            logDiagnostic(r13)
            goto L_0x0107
        L_0x00e9:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "[LOOKUP] Properties file of name '"
            r13.<init>(r1)
            r13.append(r14)
            java.lang.String r14 = "' found at '"
            r13.append(r14)
            r13.append(r3)
            r14 = 34
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            logDiagnostic(r13)
        L_0x0107:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogFactory.getConfigurationFile(java.lang.ClassLoader, java.lang.String):java.util.Properties");
    }

    public static ClassLoader getContextClassLoader() throws LogConfigurationException {
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                return LogFactory.directGetContextClassLoader();
            }
        });
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:51|52|54|55|56|(3:60|(1:62)|63)) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        r10 = r9.getProperty(TCCL_KEY);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x010c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.apache.commons.logging.LogFactory getFactory() throws org.apache.commons.logging.LogConfigurationException {
        /*
            java.lang.String r0 = "]. Trying alternative implementations..."
            java.lang.String r1 = "[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: ["
            java.lang.String r2 = "org.apache.commons.logging.LogFactory"
            java.lang.String r3 = " as specified by file 'META-INF/services/org.apache.commons.logging.LogFactory' which was present in the path of the context classloader."
            java.lang.String r4 = "[LOOKUP]  Creating an instance of LogFactory class "
            java.lang.String r5 = "' as specified by system property org.apache.commons.logging.LogFactory"
            java.lang.String r6 = "[LOOKUP] Creating an instance of LogFactory class '"
            java.lang.ClassLoader r7 = getContextClassLoader()
            if (r7 != 0) goto L_0x001f
            boolean r8 = isDiagnosticsEnabled()
            if (r8 == 0) goto L_0x001f
            java.lang.String r8 = "Context classloader is null."
            logDiagnostic(r8)
        L_0x001f:
            org.apache.commons.logging.LogFactory r8 = getCachedFactory(r7)
            if (r8 == 0) goto L_0x0026
            return r8
        L_0x0026:
            boolean r9 = isDiagnosticsEnabled()
            if (r9 == 0) goto L_0x0046
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "[LOOKUP] LogFactory implementation requested for the first time for context classloader "
            r9.<init>(r10)
            java.lang.String r10 = objectId(r7)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            logDiagnostic(r9)
            java.lang.String r9 = "[LOOKUP] "
            logHierarchy(r9, r7)
        L_0x0046:
            java.lang.String r9 = "commons-logging.properties"
            java.util.Properties r9 = getConfigurationFile(r7, r9)
            if (r9 == 0) goto L_0x0063
            java.lang.String r10 = "use_tccl"
            java.lang.String r10 = r9.getProperty(r10)
            if (r10 == 0) goto L_0x0063
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x0063
            java.lang.ClassLoader r10 = thisClassLoader
            goto L_0x0064
        L_0x0063:
            r10 = r7
        L_0x0064:
            boolean r11 = isDiagnosticsEnabled()
            if (r11 == 0) goto L_0x006f
            java.lang.String r11 = "[LOOKUP] Looking for system property [org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use..."
            logDiagnostic(r11)
        L_0x006f:
            java.lang.String r11 = java.lang.System.getProperty(r2)     // Catch:{ SecurityException -> 0x0090, RuntimeException -> 0x008e }
            if (r11 == 0) goto L_0x0097
            boolean r12 = isDiagnosticsEnabled()     // Catch:{ SecurityException -> 0x0090, RuntimeException -> 0x008e }
            if (r12 == 0) goto L_0x0092
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x0090, RuntimeException -> 0x008e }
            r12.<init>(r6)     // Catch:{ SecurityException -> 0x0090, RuntimeException -> 0x008e }
            r12.append(r11)     // Catch:{ SecurityException -> 0x0090, RuntimeException -> 0x008e }
            r12.append(r5)     // Catch:{ SecurityException -> 0x0090, RuntimeException -> 0x008e }
            java.lang.String r5 = r12.toString()     // Catch:{ SecurityException -> 0x0090, RuntimeException -> 0x008e }
            logDiagnostic(r5)     // Catch:{ SecurityException -> 0x0090, RuntimeException -> 0x008e }
            goto L_0x0092
        L_0x008e:
            r0 = move-exception
            goto L_0x00a3
        L_0x0090:
            r5 = move-exception
            goto L_0x00c8
        L_0x0092:
            org.apache.commons.logging.LogFactory r8 = newFactory(r11, r10, r7)     // Catch:{ SecurityException -> 0x0090, RuntimeException -> 0x008e }
            goto L_0x00e8
        L_0x0097:
            boolean r5 = isDiagnosticsEnabled()     // Catch:{ SecurityException -> 0x0090, RuntimeException -> 0x008e }
            if (r5 == 0) goto L_0x00e8
            java.lang.String r5 = "[LOOKUP] No system property [org.apache.commons.logging.LogFactory] defined."
            logDiagnostic(r5)     // Catch:{ SecurityException -> 0x0090, RuntimeException -> 0x008e }
            goto L_0x00e8
        L_0x00a3:
            boolean r1 = isDiagnosticsEnabled()
            if (r1 == 0) goto L_0x00c7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[LOOKUP] An exception occurred while trying to create an instance of the custom factory class: ["
            r1.<init>(r2)
            java.lang.String r2 = r0.getMessage()
            java.lang.String r2 = r2.trim()
            r1.append(r2)
            java.lang.String r2 = "] as specified by a system property."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            logDiagnostic(r1)
        L_0x00c7:
            throw r0
        L_0x00c8:
            boolean r6 = isDiagnosticsEnabled()
            if (r6 == 0) goto L_0x00e8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r1)
            java.lang.String r5 = r5.getMessage()
            java.lang.String r5 = r5.trim()
            r6.append(r5)
            r6.append(r0)
            java.lang.String r5 = r6.toString()
            logDiagnostic(r5)
        L_0x00e8:
            if (r8 != 0) goto L_0x0170
            boolean r5 = isDiagnosticsEnabled()
            if (r5 == 0) goto L_0x00f5
            java.lang.String r5 = "[LOOKUP] Looking for a resource file of name [META-INF/services/org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use..."
            logDiagnostic(r5)
        L_0x00f5:
            java.lang.String r5 = "META-INF/services/org.apache.commons.logging.LogFactory"
            java.io.InputStream r5 = getResourceAsStream(r7, r5)     // Catch:{ Exception -> 0x010a }
            if (r5 == 0) goto L_0x0144
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ UnsupportedEncodingException -> 0x010c }
            java.io.InputStreamReader r11 = new java.io.InputStreamReader     // Catch:{ UnsupportedEncodingException -> 0x010c }
            java.lang.String r12 = "UTF-8"
            r11.<init>(r5, r12)     // Catch:{ UnsupportedEncodingException -> 0x010c }
            r6.<init>(r11)     // Catch:{ UnsupportedEncodingException -> 0x010c }
            goto L_0x0116
        L_0x010a:
            r3 = move-exception
            goto L_0x0150
        L_0x010c:
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ Exception -> 0x010a }
            java.io.InputStreamReader r11 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x010a }
            r11.<init>(r5)     // Catch:{ Exception -> 0x010a }
            r6.<init>(r11)     // Catch:{ Exception -> 0x010a }
        L_0x0116:
            java.lang.String r5 = r6.readLine()     // Catch:{ Exception -> 0x010a }
            r6.close()     // Catch:{ Exception -> 0x010a }
            if (r5 == 0) goto L_0x0170
            java.lang.String r6 = ""
            boolean r6 = r6.equals(r5)     // Catch:{ Exception -> 0x010a }
            if (r6 != 0) goto L_0x0170
            boolean r6 = isDiagnosticsEnabled()     // Catch:{ Exception -> 0x010a }
            if (r6 == 0) goto L_0x013f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010a }
            r6.<init>(r4)     // Catch:{ Exception -> 0x010a }
            r6.append(r5)     // Catch:{ Exception -> 0x010a }
            r6.append(r3)     // Catch:{ Exception -> 0x010a }
            java.lang.String r3 = r6.toString()     // Catch:{ Exception -> 0x010a }
            logDiagnostic(r3)     // Catch:{ Exception -> 0x010a }
        L_0x013f:
            org.apache.commons.logging.LogFactory r8 = newFactory(r5, r10, r7)     // Catch:{ Exception -> 0x010a }
            goto L_0x0170
        L_0x0144:
            boolean r3 = isDiagnosticsEnabled()     // Catch:{ Exception -> 0x010a }
            if (r3 == 0) goto L_0x0170
            java.lang.String r3 = "[LOOKUP] No resource file with name 'META-INF/services/org.apache.commons.logging.LogFactory' found."
            logDiagnostic(r3)     // Catch:{ Exception -> 0x010a }
            goto L_0x0170
        L_0x0150:
            boolean r4 = isDiagnosticsEnabled()
            if (r4 == 0) goto L_0x0170
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r1 = r3.getMessage()
            java.lang.String r1 = r1.trim()
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            logDiagnostic(r0)
        L_0x0170:
            if (r8 != 0) goto L_0x01b2
            if (r9 == 0) goto L_0x01a7
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x017f
            java.lang.String r0 = "[LOOKUP] Looking in properties file for entry with key 'org.apache.commons.logging.LogFactory' to define the LogFactory subclass to use..."
            logDiagnostic(r0)
        L_0x017f:
            java.lang.String r0 = r9.getProperty(r2)
            if (r0 == 0) goto L_0x019b
            boolean r1 = isDiagnosticsEnabled()
            if (r1 == 0) goto L_0x0196
            java.lang.String r1 = "[LOOKUP] Properties file specifies LogFactory subclass '"
            java.lang.String r2 = "'"
            java.lang.String r1 = defpackage.wj6.k(r1, r0, r2)
            logDiagnostic(r1)
        L_0x0196:
            org.apache.commons.logging.LogFactory r8 = newFactory(r0, r10, r7)
            goto L_0x01b2
        L_0x019b:
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x01b2
            java.lang.String r0 = "[LOOKUP] Properties file has no entry specifying LogFactory subclass."
            logDiagnostic(r0)
            goto L_0x01b2
        L_0x01a7:
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x01b2
            java.lang.String r0 = "[LOOKUP] No properties file available to determine LogFactory subclass from.."
            logDiagnostic(r0)
        L_0x01b2:
            if (r8 != 0) goto L_0x01c7
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x01bf
            java.lang.String r0 = "[LOOKUP] Loading the default LogFactory implementation 'org.apache.commons.logging.impl.LogFactoryImpl' via the same classloader that loaded this LogFactory class (ie not looking in the context classloader)."
            logDiagnostic(r0)
        L_0x01bf:
            java.lang.String r0 = "org.apache.commons.logging.impl.LogFactoryImpl"
            java.lang.ClassLoader r1 = thisClassLoader
            org.apache.commons.logging.LogFactory r8 = newFactory(r0, r1, r7)
        L_0x01c7:
            if (r8 == 0) goto L_0x01e6
            cacheFactory(r7, r8)
            if (r9 == 0) goto L_0x01e6
            java.util.Enumeration r0 = r9.propertyNames()
        L_0x01d2:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L_0x01e6
            java.lang.Object r1 = r0.nextElement()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r9.getProperty(r1)
            r8.setAttribute(r1, r2)
            goto L_0x01d2
        L_0x01e6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogFactory.getFactory():org.apache.commons.logging.LogFactory");
    }

    public static Log getLog(Class cls) throws LogConfigurationException {
        return getLog(cls.getName());
    }

    private static Properties getProperties(final URL url) {
        return (Properties) AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                try {
                    InputStream openStream = url.openStream();
                    if (openStream == null) {
                        return null;
                    }
                    Properties properties = new Properties();
                    properties.load(openStream);
                    openStream.close();
                    return properties;
                } catch (IOException unused) {
                    if (!LogFactory.isDiagnosticsEnabled()) {
                        return null;
                    }
                    LogFactory.logDiagnostic("Unable to read URL " + url);
                    return null;
                }
            }
        });
    }

    private static InputStream getResourceAsStream(final ClassLoader classLoader, final String str) {
        return (InputStream) AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                ClassLoader classLoader = classLoader;
                return classLoader != null ? classLoader.getResourceAsStream(str) : ClassLoader.getSystemResourceAsStream(str);
            }
        });
    }

    private static Enumeration getResources(final ClassLoader classLoader, final String str) {
        return (Enumeration) AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                try {
                    ClassLoader classLoader = classLoader;
                    return classLoader != null ? classLoader.getResources(str) : ClassLoader.getSystemResources(str);
                } catch (IOException e) {
                    if (LogFactory.isDiagnosticsEnabled()) {
                        LogFactory.logDiagnostic("Exception while trying to find configuration file " + str + ":" + e.getMessage());
                    }
                    return null;
                } catch (NoSuchMethodError unused) {
                    return null;
                }
            }
        });
    }

    private static boolean implementsLogFactory(Class cls) {
        boolean z = false;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    logDiagnostic("[CUSTOM LOG FACTORY] was loaded by the boot classloader");
                } else {
                    logHierarchy("[CUSTOM LOG FACTORY] ", classLoader);
                    z = Class.forName(FACTORY_PROPERTY, false, classLoader).isAssignableFrom(cls);
                    if (z) {
                        logDiagnostic("[CUSTOM LOG FACTORY] " + cls.getName() + " implements LogFactory but was loaded by an incompatible classloader.");
                    } else {
                        logDiagnostic("[CUSTOM LOG FACTORY] " + cls.getName() + " does not implement LogFactory.");
                    }
                }
            } catch (SecurityException e) {
                logDiagnostic("[CUSTOM LOG FACTORY] SecurityException thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: " + e.getMessage());
            } catch (LinkageError e2) {
                logDiagnostic("[CUSTOM LOG FACTORY] LinkageError thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: " + e2.getMessage());
            } catch (ClassNotFoundException unused) {
                logDiagnostic("[CUSTOM LOG FACTORY] LogFactory class cannot be loaded by classloader which loaded the custom LogFactory implementation. Is the custom factory in the right classloader?");
            }
        }
        return z;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void initDiagnostics() {
        /*
            java.lang.String r0 = "org.apache.commons.logging.diagnostics.dest"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ SecurityException -> 0x0048 }
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "STDOUT"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0016
            java.io.PrintStream r0 = java.lang.System.out
            diagnosticsStream = r0
            goto L_0x0030
        L_0x0016:
            java.lang.String r1 = "STDERR"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0023
            java.io.PrintStream r0 = java.lang.System.err
            diagnosticsStream = r0
            goto L_0x0030
        L_0x0023:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{  }
            r2 = 1
            r1.<init>(r0, r2)     // Catch:{  }
            java.io.PrintStream r0 = new java.io.PrintStream     // Catch:{  }
            r0.<init>(r1)     // Catch:{  }
            diagnosticsStream = r0     // Catch:{  }
        L_0x0030:
            java.lang.ClassLoader r0 = thisClassLoader     // Catch:{ SecurityException -> 0x003c }
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "BOOTLOADER"
            goto L_0x003e
        L_0x0037:
            java.lang.String r0 = objectId(r0)     // Catch:{ SecurityException -> 0x003c }
            goto L_0x003e
        L_0x003c:
            java.lang.String r0 = "UNKNOWN"
        L_0x003e:
            java.lang.String r1 = "[LogFactory from "
            java.lang.String r2 = "] "
            java.lang.String r0 = defpackage.wj6.k(r1, r0, r2)
            diagnosticPrefix = r0
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogFactory.initDiagnostics():void");
    }

    public static boolean isDiagnosticsEnabled() {
        return diagnosticsStream != null;
    }

    private static void logClassLoaderEnvironment(Class cls) {
        if (isDiagnosticsEnabled()) {
            try {
                logDiagnostic("[ENV] Extension directories (java.ext.dir): " + System.getProperty("java.ext.dir"));
                logDiagnostic("[ENV] Application classpath (java.class.path): " + System.getProperty("java.class.path"));
            } catch (SecurityException unused) {
                logDiagnostic("[ENV] Security setting prevent interrogation of system classpaths.");
            }
            String name = cls.getName();
            try {
                ClassLoader classLoader = getClassLoader(cls);
                StringBuilder p = tr1.p("[ENV] Class ", name, " was loaded via classloader ");
                p.append(objectId(classLoader));
                logDiagnostic(p.toString());
                logHierarchy(wj6.k("[ENV] Ancestry of classloader which loaded ", name, " is "), classLoader);
            } catch (SecurityException unused2) {
                logDiagnostic("[ENV] Security forbids determining the classloader for ".concat(name));
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void logDiagnostic(String str) {
        PrintStream printStream = diagnosticsStream;
        if (printStream != null) {
            printStream.print(diagnosticPrefix);
            diagnosticsStream.println(str);
            diagnosticsStream.flush();
        }
    }

    private static void logHierarchy(String str, ClassLoader classLoader) {
        if (isDiagnosticsEnabled()) {
            if (classLoader != null) {
                String obj = classLoader.toString();
                StringBuilder o = tr1.o(str);
                o.append(objectId(classLoader));
                o.append(" == '");
                o.append(obj);
                o.append("'");
                logDiagnostic(o.toString());
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (classLoader != null) {
                    StringBuffer stringBuffer = new StringBuffer(tr1.j(str, "ClassLoader tree:"));
                    do {
                        stringBuffer.append(objectId(classLoader));
                        if (classLoader == systemClassLoader) {
                            stringBuffer.append(" (SYSTEM) ");
                        }
                        try {
                            classLoader = classLoader.getParent();
                            stringBuffer.append(" --> ");
                        } catch (SecurityException unused) {
                            stringBuffer.append(" --> SECRET");
                        }
                    } while (classLoader != null);
                    stringBuffer.append("BOOT");
                    logDiagnostic(stringBuffer.toString());
                }
            } catch (SecurityException unused2) {
                logDiagnostic(tr1.j(str, "Security forbids determining the system classloader."));
            }
        }
    }

    public static final void logRawDiagnostic(String str) {
        PrintStream printStream = diagnosticsStream;
        if (printStream != null) {
            printStream.println(str);
            diagnosticsStream.flush();
        }
    }

    public static LogFactory newFactory(final String str, final ClassLoader classLoader, ClassLoader classLoader2) throws LogConfigurationException {
        Object doPrivileged = AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                return LogFactory.createFactory(str, classLoader);
            }
        });
        if (doPrivileged instanceof LogConfigurationException) {
            LogConfigurationException logConfigurationException = (LogConfigurationException) doPrivileged;
            if (isDiagnosticsEnabled()) {
                logDiagnostic("An error occurred while loading the factory class:" + logConfigurationException.getMessage());
            }
            throw logConfigurationException;
        }
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Created object " + objectId(doPrivileged) + " to manage classloader " + objectId(classLoader2));
        }
        return (LogFactory) doPrivileged;
    }

    public static String objectId(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj.getClass().getName() + "@" + System.identityHashCode(obj);
    }

    public static void release(ClassLoader classLoader) {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Releasing factory for classloader " + objectId(classLoader));
        }
        synchronized (factories) {
            if (classLoader == null) {
                try {
                    LogFactory logFactory = nullClassLoaderFactory;
                    if (logFactory != null) {
                        logFactory.release();
                        nullClassLoaderFactory = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                LogFactory logFactory2 = (LogFactory) factories.get(classLoader);
                if (logFactory2 != null) {
                    logFactory2.release();
                    factories.remove(classLoader);
                }
            }
        }
    }

    public static void releaseAll() {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Releasing factory for all classloaders.");
        }
        synchronized (factories) {
            try {
                Enumeration elements = factories.elements();
                while (elements.hasMoreElements()) {
                    ((LogFactory) elements.nextElement()).release();
                }
                factories.clear();
                LogFactory logFactory = nullClassLoaderFactory;
                if (logFactory != null) {
                    logFactory.release();
                    nullClassLoaderFactory = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Object getAttribute(String str);

    public abstract String[] getAttributeNames();

    public abstract Log getInstance(Class cls) throws LogConfigurationException;

    public abstract Log getInstance(String str) throws LogConfigurationException;

    public abstract void release();

    public abstract void removeAttribute(String str);

    public abstract void setAttribute(String str, Object obj);

    public static Log getLog(String str) throws LogConfigurationException {
        return new Jdk14Logger(str);
    }

    public static LogFactory newFactory(String str, ClassLoader classLoader) {
        return newFactory(str, classLoader, (ClassLoader) null);
    }
}
