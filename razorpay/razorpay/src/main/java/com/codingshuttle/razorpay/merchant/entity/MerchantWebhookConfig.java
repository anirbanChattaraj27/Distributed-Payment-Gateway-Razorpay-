package com.codingshuttle.razorpay.merchant.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "merchant_webhook_config")
public class MerchantWebhookConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "merchant_id", nullable = false)
    private Merchant merchant;

    @Column(nullable = false, length = 500)
    private String targetUrl; //www.zara.com/webhook/success

    @Column(length = 255)
    private String webhookSecretHash;

    @Column(nullable = false)
    private Boolean enabled = true;

    @Column(length = 255)
    private String eventTypes;
    // Comma-separated list of event types to subscribe to
}


// A merchant webhook in Razorpay is an automated, server-to-server notification system. Whenever a specific
// event happens in your Razorpay account (such as a successful payment, a failed transaction, or a refund),
// Razorpay instantly sends an HTTP POST request (with payment data) directly to your server

/*
    Why Webhooks Matter:
    Instead of constantly polling the Razorpay API every few minutes to check if a customer paid, webhooks push the data to you in near real-time. This allows your app to:
        • Automate Order Fulfillment: Trigger shipping or grant access to a digital product the exact second order.paid is triggered.
        • Handle Failed Payments: Immediately update the user's cart or prompt alternative payment methods upon payment.failed.
        • Process Refunds: Log updates in your database automatically when a refund.processed or refund.failed event occurs
*/