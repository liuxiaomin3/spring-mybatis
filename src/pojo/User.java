package pojo;

import java.util.Date;

public class User {
    private Integer id;           // id
    private String  userCode;     // 閻€劍鍩涚紓鏍垳
    private String  userName;     // 閻€劍鍩涢崥宥囆�
    private String  userPassword; // 閻€劍鍩涚�鍡欑垳
    private Integer gender;       // 閹冨焼
    private Date    birthday;     // 閸戣櫣鏁撻弮銉︽埂
    private String  phone;        // 閻絻鐦�
    private String  address;      // 閸︽澘娼�
    private Integer userRole;     // 閻€劍鍩涚憴鎺曞ID
    private Integer createdBy;    // 閸掓稑缂撻懓锟�    private Date    creationDate; // 閸掓稑缂撻弮鍫曟？
    private Date creationDate;
    private Integer modifyBy;     // 閺囧瓨鏌婇懓锟�    private Date    modifyDate;   // 閺囧瓨鏌婇弮鍫曟？
    private Date modifyDate;
    private String  userRoleName; // 閻€劍鍩涚憴鎺曞閸氬秶袨

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Integer modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getUserRoleName() {
        return userRoleName;
    }

    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", userCode=" + userCode + ", userName="
				+ userName + ", userPassword=" + userPassword + ", gender="
				+ gender + ", birthday=" + birthday + ", phone=" + phone
				+ ", address=" + address + ", userRole=" + userRole
				+ ", createdBy=" + createdBy + ", creationDate=" + creationDate
				+ ", modifyBy=" + modifyBy + ", modifyDate=" + modifyDate
				+ ", userRoleName=" + userRoleName + "]";
	}
    
    
}
