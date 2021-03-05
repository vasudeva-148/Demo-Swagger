/*
 * This software is produced by EDB Business Partner AS. Unauthorized  redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EDB Business Partner AS is strictly prohibited.
 * Copyright (c) <year> EDB Business Partner AS. ALL RIGHTS RESERVED.
 */
package com.edb.fs.pbd.srv.ws.infra.jaxrs;

import org.springframework.stereotype.Service;

import java.lang.annotation.*;

/**
 * PBD RS Service Annotation
 * @author Arun.Kumar
 *
 */
@Service
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface PbdRsService
{

}
