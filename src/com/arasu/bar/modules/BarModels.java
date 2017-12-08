package com.arasu.bar.modules;

public class BarModels {
    private long id;
    private long userProfileId;
    private String userFirstName;
    private String userLastName;
    private String userMobileNumber;
    private String userEmail;
    private String userVenueName;
    private String userCountry;
    private String userOfternInventory;
    private int userInventoryTime;
    private String createdOn;
    private String modifiedOn;
    private String password;
    private boolean isActive;
    private String userLastLogin;
    private String userAuthorizationKey;
    private String userRole;
    private long parentUserProfileId;
    public BarModels(){

    }

    public BarModels(long id, long userProfileId, String userFirstName, String userLastName, String userMobileNumber, String userEmail, String userVenueName, String userCountry, String userOfternInventory, int userInventoryTime, String createdOn, String modifiedOn, String password, boolean isActive, String userLastLogin, String userAuthorizationKey, String userRole, long parentUserProfileId) {
        this.id = id;
        this.userProfileId = userProfileId;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userMobileNumber = userMobileNumber;
        this.userEmail = userEmail;
        this.userVenueName = userVenueName;
        this.userCountry = userCountry;
        this.userOfternInventory = userOfternInventory;
        this.userInventoryTime = userInventoryTime;
        this.createdOn = createdOn;
        this.modifiedOn = modifiedOn;
        this.password = password;
        this.isActive = isActive;
        this.userLastLogin = userLastLogin;
        this.userAuthorizationKey = userAuthorizationKey;
        this.userRole = userRole;
        this.parentUserProfileId = parentUserProfileId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(long userProfileId) {
        this.userProfileId = userProfileId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserMobileNumber() {
        return userMobileNumber;
    }

    public void setUserMobileNumber(String userMobileNumber) {
        this.userMobileNumber = userMobileNumber;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserVenueName() {
        return userVenueName;
    }

    public void setUserVenueName(String userVenueName) {
        this.userVenueName = userVenueName;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    public String getUserOfternInventory() {
        return userOfternInventory;
    }

    public void setUserOfternInventory(String userOfternInventory) {
        this.userOfternInventory = userOfternInventory;
    }

    public int getUserInventoryTime() {
        return userInventoryTime;
    }

    public void setUserInventoryTime(int userInventoryTime) {
        this.userInventoryTime = userInventoryTime;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(String modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean active) {
        isActive = active;
    }

    public String getUserLastLogin() {
        return userLastLogin;
    }

    public void setUserLastLogin(String userLastLogin) {
        this.userLastLogin = userLastLogin;
    }

    public String getUserAuthorizationKey() {
        return userAuthorizationKey;
    }

    public void setUserAuthorizationKey(String userAuthorizationKey) {
        this.userAuthorizationKey = userAuthorizationKey;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public long getParentUserProfileId() {
        return parentUserProfileId;
    }

    public void setParentUserProfileId(long parentUserProfileId) {
        this.parentUserProfileId = parentUserProfileId;
    }
}
