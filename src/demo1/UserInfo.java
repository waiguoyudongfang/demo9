package demo1;

/***
 * 用户信息类
 */
public class UserInfo {
    //用户ID
    private String userId;
    //用户姓名
    public String userName;
    //用户性别
    private Integer sex;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public UserInfo(String userId, String userName, Integer sex) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
    }

    public UserInfo() {

    }
}
