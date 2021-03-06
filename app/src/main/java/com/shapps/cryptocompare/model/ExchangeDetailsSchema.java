package com.shapps.cryptocompare.model;

import android.provider.BaseColumns;

/**
 * Created by shyam on 14/11/17.
 */

public class ExchangeDetailsSchema {

    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private ExchangeDetailsSchema() {}


    /* Inner class that defines the table contents */
    public static class ExchangesDetailsEntry implements BaseColumns {
        public static final String TABLE_NAME = "exchanges_list";
        public static final String COLUMN_NAME_ID = "id";
        public static final String COLUMN_NAME_EX_NAME = "name";
        public static final String COLUMN_NAME_CRYPTO_CURRENCY = "crypto";
        public static final String COLUMN_NAME_CURRENCY = "curr";
        public static final String COLUMN_NAME_BUY_FEE = "buy_fee";
        public static final String COLUMN_NAME_SELL_FEE = "sell_fee";
        public static final String COLUMN_NAME_APP_ADDRESS = "app_address";
        public static final String COLUMN_NAME_WEB_ADDRESS = "web_address";
        public static final String COLUMN_NAME_ACTIVE = "active";
    }

}
