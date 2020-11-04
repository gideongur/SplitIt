package com.split.pojo;
import com.split.Infra.Requestable;

public class InStoreOrder implements Requestable {
    private  String amount;
    private  String orderId;
    private  String installmentOptions;
    private  String numberOfInstallments;
    private  String cardNumber;
    private  String expirationDate;
    private  String email;
    private  String phone;
    private  String currency;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getInstallmentOptions() {
        return installmentOptions;
    }

    public void setInstallmentOptions(String installmentOptions) {
        this.installmentOptions = installmentOptions;
    }

    public String getNumberOfInstallments() {
        return numberOfInstallments;
    }

    public void setNumberOfInstallments(String numberOfInstallments) {
        this.numberOfInstallments = numberOfInstallments;
    }

    public String getcardNumber() {
        return cardNumber;
    }

    public void setCardnumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}