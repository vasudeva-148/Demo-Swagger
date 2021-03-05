/*
 * This software is produced by EDB Business Partner AS. Unauthorized  redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EDB Business Partner AS is strictly prohibited.
 * Copyright (c) <year> EDB Business Partner AS. ALL RIGHTS RESERVED.
 */
package com.edb.fs.pbd.srv.ws.infra.jaxrs;

/**
 * Constants File for PBD RS Services
 * 
 * @author Arun.Kumar
 *
 */
public interface PbdRestConstants {

    String START_INDEX = "startIndex";
    String PAGE_SIZE = "pageSize";
    String ZERO = "0";
    String MAX_PAGE_SIZE = "500";
    String SUCCESS_OK_MESSAGE = "OK";
    String BAD_REQUEST_MESSAGE = "Bad Request";
    String COUNTRY_CODE = "countryCode";
    String CURRENCY_CODE = "currencyCode";
    String ACCOUNT_NUMBER = "accountNumber";
    String REGEX_COUNTRY_CODE = "[A-Z]{2}";
    String REGEX_CURRENCY_CODE = "[A-Z]{3}";
    String REGEX_ACCOUNT_NUMBER = "\\S.*\\S|\\S";
    String CHARSET_UTF8=";charset=utf-8";
    
    String SETTLEMENT_MECHANISM_API = "settlementmechanism";
    String SETTLEMENT_MECHANISM_API_DESC = "The SettlementMechanism resource";
    String SETTLEMENT_MECHANISM_OPERATION = "/settlementmechanismlist";
    String SETTLEMENT_MECHANISM_OPER_DESC = "Settlement Mechanism list";
    
    
    
}
