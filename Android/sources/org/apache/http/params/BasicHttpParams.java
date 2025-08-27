package org.apache.http.params;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public final class BasicHttpParams extends AbstractHttpParams implements Serializable, Cloneable {
    private static final long serialVersionUID = -7086398485908701455L;
    private HashMap parameters;

    public void clear() {
        this.parameters = null;
    }

    public Object clone() throws CloneNotSupportedException {
        BasicHttpParams basicHttpParams = (BasicHttpParams) super.clone();
        copyParams(basicHttpParams);
        return basicHttpParams;
    }

    public HttpParams copy() {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        copyParams(basicHttpParams);
        return basicHttpParams;
    }

    public void copyParams(HttpParams httpParams) {
        HashMap hashMap = this.parameters;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getKey() instanceof String) {
                    httpParams.setParameter((String) entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public Object getParameter(String str) {
        HashMap hashMap = this.parameters;
        if (hashMap != null) {
            return hashMap.get(str);
        }
        return null;
    }

    public boolean isParameterSet(String str) {
        return getParameter(str) != null;
    }

    public boolean isParameterSetLocally(String str) {
        HashMap hashMap = this.parameters;
        return (hashMap == null || hashMap.get(str) == null) ? false : true;
    }

    public boolean removeParameter(String str) {
        HashMap hashMap = this.parameters;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return false;
        }
        this.parameters.remove(str);
        return true;
    }

    public HttpParams setParameter(String str, Object obj) {
        if (this.parameters == null) {
            this.parameters = new HashMap();
        }
        this.parameters.put(str, obj);
        return this;
    }

    public void setParameters(String[] strArr, Object obj) {
        for (String parameter : strArr) {
            setParameter(parameter, obj);
        }
    }
}
