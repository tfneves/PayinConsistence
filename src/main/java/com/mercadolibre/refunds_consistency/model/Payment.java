package com.mercadolibre.refunds_consistency.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
public class Payment {

    private Object acquirer;
    private Object acquirer_reconciliation;
    private Object additional_info;
    private Object api_version;
    private Object application_id;
    private Object authorization_code;
    private Object application_code;
    private Object available_actions;
    private Object barcode;
    private Object binary_mode;
    private Object call_for_authorize_id;
    private Object captured;
    private Object card;
    private Object client_id;
    private Object collector;
    private Object collector_id;
    private Object collector_tags;
    private Object corporation_id;
    private Object counter_currency;
    private Object coupon_amount;
    private Object coupon_id;
    private Object currency_id;
    private Object date_approved;
    private Object date_created;
    private Object date_last_updated;
    private Object date_of_expiration;
    private Object deduction_schema;
    private Object description;
    private Object differential_pricing_id;
    private Object external_reference;
    private Object fee_details;
    private Object financing_type;
    private Long id;
    private Object installments;
    private Object integrator_id;
    private Object internal_metadata;
    private Object is_test;
    private Object issuer_id;
    private Object live_mode;
    private Object marketplace;
    private Object marketplace_owner;
    private Object merchant_account_id;
    private Object merchant_number;
    private Object metadata;
    private Object money_release_date;
    private Object money_release_days;
    private Object money_release_schema;
    private Object notification_url;
    private Object operation_type;
    private Object order;
    private Object payer;
    private Object payer_id;
    private Object payer_tags;
    private Object payment_method_id;
    private Object payment_type_id;
    private Object platform_id;
    private Object pos_id;
    private Object processing_mode;
    private Object product_id;
    private Object profile_id;
    private List<Object> refunds;
    private Object reserve_id;
    private Object risk_execution_id;
    private Object shipping_amount;
    private Object site_id;
    private Object sponsor_id;
    private Object statement_descriptor;
    private Object status;
    private Object status_detail;
    private Object store_id;
    private Object taxes_amount;
    private Object transaction_amount;
    private Object transaction_amount_refunded;
    private TransactionDetails transaction_details;
    private Object transaction_id;
    private Object version;
    private Object payment_product;
    private Object splitter_id;
    private Object release_days;
    private Object cashback_id;
    private Object charges_details;
    private Object amounts;
    private Object transaction_intent_id;
    private Object owner;
    private Object money_release_status;
    private Object point_of_interaction;
    private Contingency contingencies;
}
