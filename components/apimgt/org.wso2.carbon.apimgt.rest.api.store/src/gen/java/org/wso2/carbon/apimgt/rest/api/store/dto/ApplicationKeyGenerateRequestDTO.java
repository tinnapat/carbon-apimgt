package org.wso2.carbon.apimgt.rest.api.store.dto;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class ApplicationKeyGenerateRequestDTO  {
  
  
  public enum KeyTypeEnum {
     PRODUCTION,  SANDBOX, 
  };
  @NotNull
  private KeyTypeEnum keyType = null;
  
  @NotNull
  private String validityTime = null;
  
  
  private String callbackUrl = null;
  
  @NotNull
  private List<String> accessAllowDomains = new ArrayList<String>();
  
  
  private List<String> scopes = new ArrayList<String>();

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("keyType")
  public KeyTypeEnum getKeyType() {
    return keyType;
  }
  public void setKeyType(KeyTypeEnum keyType) {
    this.keyType = keyType;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("validityTime")
  public String getValidityTime() {
    return validityTime;
  }
  public void setValidityTime(String validityTime) {
    this.validityTime = validityTime;
  }

  
  /**
   * Callback URL
   **/
  @ApiModelProperty(value = "Callback URL")
  @JsonProperty("callbackUrl")
  public String getCallbackUrl() {
    return callbackUrl;
  }
  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  
  /**
   * Allowed domains for the access token
   **/
  @ApiModelProperty(required = true, value = "Allowed domains for the access token")
  @JsonProperty("accessAllowDomains")
  public List<String> getAccessAllowDomains() {
    return accessAllowDomains;
  }
  public void setAccessAllowDomains(List<String> accessAllowDomains) {
    this.accessAllowDomains = accessAllowDomains;
  }

  
  /**
   * Allowed scopes for the access token
   **/
  @ApiModelProperty(value = "Allowed scopes for the access token")
  @JsonProperty("scopes")
  public List<String> getScopes() {
    return scopes;
  }
  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationKeyGenerateRequestDTO {\n");
    
    sb.append("  keyType: ").append(keyType).append("\n");
    sb.append("  validityTime: ").append(validityTime).append("\n");
    sb.append("  callbackUrl: ").append(callbackUrl).append("\n");
    sb.append("  accessAllowDomains: ").append(accessAllowDomains).append("\n");
    sb.append("  scopes: ").append(scopes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
