package org.apache.http.client.methods;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.utils.CloneUtils;
import org.apache.http.protocol.HTTP;

@Deprecated
public abstract class HttpEntityEnclosingRequestBase extends HttpRequestBase implements HttpEntityEnclosingRequest {
    private HttpEntity entity;

    public Object clone() throws CloneNotSupportedException {
        HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase = (HttpEntityEnclosingRequestBase) super.clone();
        HttpEntity httpEntity = this.entity;
        if (httpEntity != null) {
            httpEntityEnclosingRequestBase.entity = (HttpEntity) CloneUtils.clone(httpEntity);
        }
        return httpEntityEnclosingRequestBase;
    }

    public boolean expectContinue() {
        Header firstHeader = getFirstHeader(HTTP.EXPECT_DIRECTIVE);
        return firstHeader != null && HTTP.EXPECT_CONTINUE.equalsIgnoreCase(firstHeader.getValue());
    }

    public HttpEntity getEntity() {
        return this.entity;
    }

    public void setEntity(HttpEntity httpEntity) {
        this.entity = httpEntity;
    }
}
