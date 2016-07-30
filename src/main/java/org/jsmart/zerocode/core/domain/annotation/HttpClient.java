package org.jsmart.zerocode.core.domain.annotation;

import org.jsmart.zerocode.core.httpclient.HelloGuiceHttpClient;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface HttpClient {
    /**
     * @return a Http Client implementation class which will override the default implementation of RestEasy client
     */
    Class<? extends HelloGuiceHttpClient> value();
}