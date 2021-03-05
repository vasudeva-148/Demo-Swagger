/*
 * This software is produced by EDB Business Partner AS. Unauthorized  redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EDB Business Partner AS is strictly prohibited.
 * Copyright (c) <year> EDB Business Partner AS. ALL RIGHTS RESERVED.
 */
package com.edb.fs.pbd.srv.ws.infra.jaxrs;


import org.apache.cxf.jaxrs.ext.MessageContext;

import com.edb.finance.common.cxf.rest.context.MessageContextAware;

/**
 * Abstract base class for JaxRsService.
 * 
 * @author Arun.Kumar
 *
 */
public abstract class AbstractJaxRsService implements MessageContextAware {
    private MessageContext messageContext;

    @Override
    public void setMessageContext(MessageContext messageContext) {
        this.messageContext = messageContext;
    }

}
