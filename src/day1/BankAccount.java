package day1;

public class BankAccount {
    /*States
    ->Account Number (String)
    ->Account Type (String)
    ->Account Holders name (String)
    ->Routing Number (String)
    ->Signature Of Account Holder (Collection Of Bytes) => Blob
    ->Phone Number Associated With Account (String)
    ->Address Of Account Holder (String)
    ->Username (String)
    ->Password (Collection of Chars)
    ->Account Balance (Double)
    ->Transfer Limit (Float)



     */
    String accountNumber;
    String accountHoldersName;
    String routingNumber;
    byte[]signatureOfAccountHolder;
    String phoneNumber;
    String address;
    String username;
    String password;
    double accountBalance;
    double transferLimit;


}
