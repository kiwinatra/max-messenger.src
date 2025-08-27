package org.apache.http.impl.client;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.params.AbstractHttpParams;
import org.apache.http.params.HttpParams;

@Deprecated
public class ClientParamsStack extends AbstractHttpParams {
    protected final HttpParams applicationParams;
    protected final HttpParams clientParams;
    private final Log log;
    protected final HttpParams overrideParams;
    protected final HttpParams requestParams;

    public ClientParamsStack(HttpParams httpParams, HttpParams httpParams2, HttpParams httpParams3, HttpParams httpParams4) {
        this.log = LogFactory.getLog((Class) getClass());
        this.applicationParams = httpParams;
        this.clientParams = httpParams2;
        this.requestParams = httpParams3;
        this.overrideParams = httpParams4;
    }

    public HttpParams copy() {
        return this;
    }

    public final HttpParams getApplicationParams() {
        return this.applicationParams;
    }

    public final HttpParams getClientParams() {
        return this.clientParams;
    }

    public final HttpParams getOverrideParams() {
        return this.overrideParams;
    }

    public Object getParameter(String str) {
        HttpParams httpParams;
        HttpParams httpParams2;
        HttpParams httpParams3;
        if (str != null) {
            HttpParams httpParams4 = this.overrideParams;
            Object parameter = httpParams4 != null ? httpParams4.getParameter(str) : null;
            if (parameter == null && (httpParams3 = this.requestParams) != null) {
                parameter = httpParams3.getParameter(str);
            }
            if (parameter == null && (httpParams2 = this.clientParams) != null) {
                parameter = httpParams2.getParameter(str);
            }
            if (parameter == null && (httpParams = this.applicationParams) != null) {
                parameter = httpParams.getParameter(str);
            }
            if (this.log.isDebugEnabled()) {
                Log log2 = this.log;
                log2.debug("'" + str + "': " + parameter);
            }
            return parameter;
        }
        throw new IllegalArgumentException("Parameter name must not be null.");
    }

    public final HttpParams getRequestParams() {
        return this.requestParams;
    }

    public boolean removeParameter(String str) {
        throw new UnsupportedOperationException("Removing parameters in a stack is not supported.");
    }

    public HttpParams setParameter(String str, Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Setting parameters in a stack is not supported.");
    }

    public ClientParamsStack(ClientParamsStack clientParamsStack) {
        this(clientParamsStack.getApplicationParams(), clientParamsStack.getClientParams(), clientParamsStack.getRequestParams(), clientParamsStack.getOverrideParams());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ClientParamsStack(ClientParamsStack clientParamsStack, HttpParams httpParams, HttpParams httpParams2, HttpParams httpParams3, HttpParams httpParams4) {
        this(httpParams == null ? clientParamsStack.getApplicationParams() : httpParams, httpParams2 == null ? clientParamsStack.getClientParams() : httpParams2, httpParams3 == null ? clientParamsStack.getRequestParams() : httpParams3, httpParams4 == null ? clientParamsStack.getOverrideParams() : httpParams4);
    }
}
