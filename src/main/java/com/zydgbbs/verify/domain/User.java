package com.zydgbbs.verify.domain;

import com.zydgbbs.verify.annotation.IsMobile;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.Date;

public class User {

    /**
     * @Null:限制只能为null
     * @NotNull：用于基本数据类型,限制必须不为null
     * @NotEmpty：用于集合类
     * @NotBlank：用于String上面
     * @AssertFalse:限制必须为false
     * @AssertTrue:限制必须为true
     * @DecimalMax(value):限制必须为一个不大于指定值的数字
     * @DecimalMin(value):限制必须为一个不小于指定值的数字
     * @Digits(integer,fraction):限制必须为一个小数，且整数部分的位数不能超过integer，小数部分的位数不能超过fraction
     * @Future:限制必须是一个将来的日期
     * @Max(value):限制必须为一个不大于指定值的数字
     * @Min(value):限制必须为一个不小于指定值的数字
     * @Past:限制必须是一个过去的日期
     * @Pattern(value):限制必须符合指定的正则表达式，如：@Pattern(regexp="^[a-zA-Z0-9]+$",message="{account.username.space}")
     * @Size(max,min):限制字符长度必须在min到max之间，如：@Size(min=3,max=20,message="{account.username.size}")
     * @Email
     * @Range(min=, max=, message=):被注释的元素必须在合适的范围内
     */

    @NotNull(message = "姓名必传")
    @Length(min=2,max = 6)
    private String name;


    private String password;

    @Email(message = "请输入合法邮箱")
    @NotBlank(message = "邮箱不能为空")
    private String email;

    @IsMobile(required = true)
    private String telephone;

    private String address;

    private Integer age;

    private Integer gender;

    //Postman传值：2018/7/7 11:11:00即可
    private Date birthday;

    @Null(message = "只能为空")
    private String nullStr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public String getNullStr() {
        return nullStr;
    }

    public void setNullStr(String nullStr) {
        this.nullStr = nullStr;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", nullStr='" + nullStr + '\'' +
                '}';
    }
}
