package org.apache.http.params;

@Deprecated
public abstract class AbstractHttpParams implements HttpParams {
    public boolean getBooleanParameter(String str, boolean z) {
        Object parameter = getParameter(str);
        return parameter == null ? z : ((Boolean) parameter).booleanValue();
    }

    public double getDoubleParameter(String str, double d) {
        Object parameter = getParameter(str);
        return parameter == null ? d : ((Double) parameter).doubleValue();
    }

    public int getIntParameter(String str, int i) {
        Object parameter = getParameter(str);
        return parameter == null ? i : ((Integer) parameter).intValue();
    }

    public long getLongParameter(String str, long j) {
        Object parameter = getParameter(str);
        return parameter == null ? j : ((Long) parameter).longValue();
    }

    public boolean isParameterFalse(String str) {
        return !getBooleanParameter(str, false);
    }

    public boolean isParameterTrue(String str) {
        return getBooleanParameter(str, false);
    }

    public HttpParams setBooleanParameter(String str, boolean z) {
        setParameter(str, z ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    public HttpParams setDoubleParameter(String str, double d) {
        setParameter(str, new Double(d));
        return this;
    }

    public HttpParams setIntParameter(String str, int i) {
        setParameter(str, new Integer(i));
        return this;
    }

    public HttpParams setLongParameter(String str, long j) {
        setParameter(str, new Long(j));
        return this;
    }
}
