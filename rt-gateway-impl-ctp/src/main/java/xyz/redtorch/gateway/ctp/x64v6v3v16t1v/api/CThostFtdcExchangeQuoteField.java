/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v16t1v.api;

public class CThostFtdcExchangeQuoteField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeQuoteField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeQuoteField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpv6v3v16t1x64apiJNI.delete_CThostFtdcExchangeQuoteField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setAskPrice(double value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_AskPrice_set(swigCPtr, this, value);
  }

  public double getAskPrice() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_AskPrice_get(swigCPtr, this);
  }

  public void setBidPrice(double value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_BidPrice_set(swigCPtr, this, value);
  }

  public double getBidPrice() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_BidPrice_get(swigCPtr, this);
  }

  public void setAskVolume(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_AskVolume_set(swigCPtr, this, value);
  }

  public int getAskVolume() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_AskVolume_get(swigCPtr, this);
  }

  public void setBidVolume(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_BidVolume_set(swigCPtr, this, value);
  }

  public int getBidVolume() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_BidVolume_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_RequestID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_BusinessUnit_get(swigCPtr, this);
  }

  public void setAskOffsetFlag(char value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_AskOffsetFlag_set(swigCPtr, this, value);
  }

  public char getAskOffsetFlag() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_AskOffsetFlag_get(swigCPtr, this);
  }

  public void setBidOffsetFlag(char value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_BidOffsetFlag_set(swigCPtr, this, value);
  }

  public char getBidOffsetFlag() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_BidOffsetFlag_get(swigCPtr, this);
  }

  public void setAskHedgeFlag(char value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_AskHedgeFlag_set(swigCPtr, this, value);
  }

  public char getAskHedgeFlag() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_AskHedgeFlag_get(swigCPtr, this);
  }

  public void setBidHedgeFlag(char value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_BidHedgeFlag_set(swigCPtr, this, value);
  }

  public char getBidHedgeFlag() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_BidHedgeFlag_get(swigCPtr, this);
  }

  public void setQuoteLocalID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_QuoteLocalID_set(swigCPtr, this, value);
  }

  public String getQuoteLocalID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_QuoteLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_InstallID_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_NotifySequence_get(swigCPtr, this);
  }

  public void setOrderSubmitStatus(char value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_OrderSubmitStatus_set(swigCPtr, this, value);
  }

  public char getOrderSubmitStatus() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_OrderSubmitStatus_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_SettlementID_get(swigCPtr, this);
  }

  public void setQuoteSysID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_QuoteSysID_set(swigCPtr, this, value);
  }

  public String getQuoteSysID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_QuoteSysID_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_InsertTime_get(swigCPtr, this);
  }

  public void setCancelTime(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_CancelTime_set(swigCPtr, this, value);
  }

  public String getCancelTime() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_CancelTime_get(swigCPtr, this);
  }

  public void setQuoteStatus(char value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_QuoteStatus_set(swigCPtr, this, value);
  }

  public char getQuoteStatus() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_QuoteStatus_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_ClearingPartID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_SequenceNo_get(swigCPtr, this);
  }

  public void setAskOrderSysID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_AskOrderSysID_set(swigCPtr, this, value);
  }

  public String getAskOrderSysID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_AskOrderSysID_get(swigCPtr, this);
  }

  public void setBidOrderSysID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_BidOrderSysID_set(swigCPtr, this, value);
  }

  public String getBidOrderSysID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_BidOrderSysID_get(swigCPtr, this);
  }

  public void setForQuoteSysID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_ForQuoteSysID_set(swigCPtr, this, value);
  }

  public String getForQuoteSysID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_ForQuoteSysID_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_BranchID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeQuoteField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcExchangeQuoteField() {
    this(jctpv6v3v16t1x64apiJNI.new_CThostFtdcExchangeQuoteField(), true);
  }

}