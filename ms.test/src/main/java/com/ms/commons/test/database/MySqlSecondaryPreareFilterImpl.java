/*
 * Copyright 2017-2025 msun.com All right reserved. This software is the confidential and proprietary information of
 * msun.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with msun.com.
 */
package com.ms.commons.test.database;

/**
 * @author zxc Apr 13, 2013 11:38:04 PM
 */
public class MySqlSecondaryPreareFilterImpl implements SecondaryPreareFilter {

    public boolean accept(String table, StringBuilder newTableName) {
        if (table.trim().toLowerCase().startsWith("mysql_")) {
            newTableName.append(table.trim().substring("mysql_".length()));
            return true;
        }
        return false;
    }
}
