package org.hothub.builder;

import org.hothub.base.RequestMethod;
import org.hothub.core.AbstractBuilder;

public class DeleteBuilder extends AbstractBuilder<DeleteBuilder> {
    @Override
    public RequestMethod getRequestMethod() {
        return RequestMethod.DELETE;
    }
}
